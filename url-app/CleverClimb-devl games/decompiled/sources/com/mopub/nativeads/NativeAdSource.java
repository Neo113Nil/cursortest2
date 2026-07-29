package com.mopub.nativeads;

import android.app.Activity;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.games.GamesStatusCodes;
import com.mopub.common.VisibleForTesting;
import com.mopub.nativeads.MoPubNative;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class NativeAdSource {
    private static final int CACHE_LIMIT = 1;
    private static final int EXPIRATION_TIME_MILLISECONDS = 14400000;
    private static final int MAXIMUM_RETRY_TIME_MILLISECONDS = 300000;

    @VisibleForTesting
    static final int[] RETRY_TIME_ARRAY_MILLISECONDS = {1000, GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE, 5000, 25000, 60000, MAXIMUM_RETRY_TIME_MILLISECONDS};
    private final AdRendererRegistry mAdRendererRegistry;
    private AdSourceListener mAdSourceListener;

    @VisibleForTesting
    int mCurrentRetries;
    private MoPubNative mMoPubNative;
    private final MoPubNative.MoPubNativeNetworkListener mMoPubNativeNetworkListener;
    private final List<TimestampWrapper<NativeAd>> mNativeAdCache;
    private final Handler mReplenishCacheHandler;
    private final Runnable mReplenishCacheRunnable;

    @VisibleForTesting
    boolean mRequestInFlight;
    private RequestParameters mRequestParameters;

    @VisibleForTesting
    boolean mRetryInFlight;

    @VisibleForTesting
    int mSequenceNumber;

    interface AdSourceListener {
        void onAdsAvailable();
    }

    NativeAdSource() {
        this(new ArrayList(1), new Handler(), new AdRendererRegistry());
    }

    @VisibleForTesting
    NativeAdSource(List<TimestampWrapper<NativeAd>> list, Handler handler, AdRendererRegistry adRendererRegistry) {
        this.mNativeAdCache = list;
        this.mReplenishCacheHandler = handler;
        this.mReplenishCacheRunnable = new Runnable() { // from class: com.mopub.nativeads.NativeAdSource.1
            @Override // java.lang.Runnable
            public void run() {
                NativeAdSource.this.mRetryInFlight = false;
                NativeAdSource.this.replenishCache();
            }
        };
        this.mAdRendererRegistry = adRendererRegistry;
        this.mMoPubNativeNetworkListener = new MoPubNative.MoPubNativeNetworkListener() { // from class: com.mopub.nativeads.NativeAdSource.2
            @Override // com.mopub.nativeads.MoPubNative.MoPubNativeNetworkListener
            public void onNativeLoad(NativeAd nativeAd) {
                if (NativeAdSource.this.mMoPubNative == null) {
                    return;
                }
                NativeAdSource.this.mRequestInFlight = false;
                NativeAdSource.this.mSequenceNumber++;
                NativeAdSource.this.resetRetryTime();
                NativeAdSource.this.mNativeAdCache.add(new TimestampWrapper(nativeAd));
                if (NativeAdSource.this.mNativeAdCache.size() == 1 && NativeAdSource.this.mAdSourceListener != null) {
                    NativeAdSource.this.mAdSourceListener.onAdsAvailable();
                }
                NativeAdSource.this.replenishCache();
            }

            @Override // com.mopub.nativeads.MoPubNative.MoPubNativeNetworkListener
            public void onNativeFail(NativeErrorCode nativeErrorCode) {
                NativeAdSource.this.mRequestInFlight = false;
                if (NativeAdSource.this.mCurrentRetries >= NativeAdSource.RETRY_TIME_ARRAY_MILLISECONDS.length - 1) {
                    NativeAdSource.this.resetRetryTime();
                    return;
                }
                NativeAdSource.this.updateRetryTime();
                NativeAdSource.this.mRetryInFlight = true;
                NativeAdSource.this.mReplenishCacheHandler.postDelayed(NativeAdSource.this.mReplenishCacheRunnable, NativeAdSource.this.getRetryTime());
            }
        };
        this.mSequenceNumber = 0;
        resetRetryTime();
    }

    int getAdRendererCount() {
        return this.mAdRendererRegistry.getAdRendererCount();
    }

    public int getViewTypeForAd(NativeAd nativeAd) {
        return this.mAdRendererRegistry.getViewTypeForAd(nativeAd);
    }

    void registerAdRenderer(MoPubAdRenderer moPubAdRenderer) {
        this.mAdRendererRegistry.registerAdRenderer(moPubAdRenderer);
        if (this.mMoPubNative != null) {
            this.mMoPubNative.registerAdRenderer(moPubAdRenderer);
        }
    }

    public MoPubAdRenderer getAdRendererForViewType(int i) {
        return this.mAdRendererRegistry.getRendererForViewType(i);
    }

    void setAdSourceListener(AdSourceListener adSourceListener) {
        this.mAdSourceListener = adSourceListener;
    }

    void loadAds(Activity activity, String str, RequestParameters requestParameters) {
        loadAds(requestParameters, new MoPubNative(activity, str, this.mMoPubNativeNetworkListener));
    }

    @VisibleForTesting
    void loadAds(RequestParameters requestParameters, MoPubNative moPubNative) {
        clear();
        Iterator<MoPubAdRenderer> it = this.mAdRendererRegistry.getRendererIterable().iterator();
        while (it.hasNext()) {
            moPubNative.registerAdRenderer(it.next());
        }
        this.mRequestParameters = requestParameters;
        this.mMoPubNative = moPubNative;
        replenishCache();
    }

    void clear() {
        if (this.mMoPubNative != null) {
            this.mMoPubNative.destroy();
            this.mMoPubNative = null;
        }
        this.mRequestParameters = null;
        Iterator<TimestampWrapper<NativeAd>> it = this.mNativeAdCache.iterator();
        while (it.hasNext()) {
            it.next().mInstance.destroy();
        }
        this.mNativeAdCache.clear();
        this.mReplenishCacheHandler.removeMessages(0);
        this.mRequestInFlight = false;
        this.mSequenceNumber = 0;
        resetRetryTime();
    }

    NativeAd dequeueAd() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!this.mRequestInFlight && !this.mRetryInFlight) {
            this.mReplenishCacheHandler.post(this.mReplenishCacheRunnable);
        }
        while (!this.mNativeAdCache.isEmpty()) {
            TimestampWrapper<NativeAd> remove = this.mNativeAdCache.remove(0);
            if (uptimeMillis - remove.mCreatedTimestamp < 14400000) {
                return remove.mInstance;
            }
        }
        return null;
    }

    @VisibleForTesting
    void updateRetryTime() {
        if (this.mCurrentRetries < RETRY_TIME_ARRAY_MILLISECONDS.length - 1) {
            this.mCurrentRetries++;
        }
    }

    @VisibleForTesting
    void resetRetryTime() {
        this.mCurrentRetries = 0;
    }

    @VisibleForTesting
    int getRetryTime() {
        if (this.mCurrentRetries >= RETRY_TIME_ARRAY_MILLISECONDS.length) {
            this.mCurrentRetries = RETRY_TIME_ARRAY_MILLISECONDS.length - 1;
        }
        return RETRY_TIME_ARRAY_MILLISECONDS[this.mCurrentRetries];
    }

    @VisibleForTesting
    void replenishCache() {
        if (this.mRequestInFlight || this.mMoPubNative == null || this.mNativeAdCache.size() >= 1) {
            return;
        }
        this.mRequestInFlight = true;
        this.mMoPubNative.makeRequest(this.mRequestParameters, Integer.valueOf(this.mSequenceNumber));
    }

    @VisibleForTesting
    @Deprecated
    void setMoPubNative(MoPubNative moPubNative) {
        this.mMoPubNative = moPubNative;
    }

    @VisibleForTesting
    @Deprecated
    MoPubNative.MoPubNativeNetworkListener getMoPubNativeNetworkListener() {
        return this.mMoPubNativeNetworkListener;
    }
}
