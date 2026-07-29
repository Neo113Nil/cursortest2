package com.mopub.nativeads;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.nativeads.MoPubNativeAdPositioning;
import com.mopub.nativeads.NativeAdSource;
import com.mopub.nativeads.PositioningSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class MoPubStreamAdPlacer {
    public static final int CONTENT_VIEW_TYPE = 0;
    private static final int DEFAULT_AD_VIEW_TYPE = -1;
    private static final MoPubNativeAdLoadedListener EMPTY_NATIVE_AD_LOADED_LISTENER = new MoPubNativeAdLoadedListener() { // from class: com.mopub.nativeads.MoPubStreamAdPlacer.1
        @Override // com.mopub.nativeads.MoPubNativeAdLoadedListener
        public void onAdLoaded(int i) {
        }

        @Override // com.mopub.nativeads.MoPubNativeAdLoadedListener
        public void onAdRemoved(int i) {
        }
    };
    private static final int MAX_VISIBLE_RANGE = 100;
    private static final int RANGE_BUFFER = 6;
    private final Activity mActivity;
    private MoPubNativeAdLoadedListener mAdLoadedListener;
    private final NativeAdSource mAdSource;
    private String mAdUnitId;
    private boolean mHasPlacedAds;
    private boolean mHasReceivedAds;
    private boolean mHasReceivedPositions;
    private int mItemCount;
    private final WeakHashMap<View, NativeAd> mNativeAdMap;
    private boolean mNeedsPlacement;
    private PlacementData mPendingPlacementData;
    private PlacementData mPlacementData;
    private final Handler mPlacementHandler;
    private final Runnable mPlacementRunnable;
    private final PositioningSource mPositioningSource;
    private final HashMap<NativeAd, WeakReference<View>> mViewMap;
    private int mVisibleRangeEnd;
    private int mVisibleRangeStart;

    public MoPubStreamAdPlacer(Activity activity) {
        this(activity, MoPubNativeAdPositioning.serverPositioning());
    }

    public MoPubStreamAdPlacer(Activity activity, MoPubNativeAdPositioning.MoPubServerPositioning moPubServerPositioning) {
        this(activity, new NativeAdSource(), new ServerPositioningSource(activity));
    }

    public MoPubStreamAdPlacer(Activity activity, MoPubNativeAdPositioning.MoPubClientPositioning moPubClientPositioning) {
        this(activity, new NativeAdSource(), new ClientPositioningSource(moPubClientPositioning));
    }

    @VisibleForTesting
    MoPubStreamAdPlacer(Activity activity, NativeAdSource nativeAdSource, PositioningSource positioningSource) {
        this.mAdLoadedListener = EMPTY_NATIVE_AD_LOADED_LISTENER;
        Preconditions.checkNotNull(activity, "activity is not allowed to be null");
        Preconditions.checkNotNull(nativeAdSource, "adSource is not allowed to be null");
        Preconditions.checkNotNull(positioningSource, "positioningSource is not allowed to be null");
        this.mActivity = activity;
        this.mPositioningSource = positioningSource;
        this.mAdSource = nativeAdSource;
        this.mPlacementData = PlacementData.empty();
        this.mNativeAdMap = new WeakHashMap<>();
        this.mViewMap = new HashMap<>();
        this.mPlacementHandler = new Handler();
        this.mPlacementRunnable = new Runnable() { // from class: com.mopub.nativeads.MoPubStreamAdPlacer.2
            @Override // java.lang.Runnable
            public void run() {
                if (MoPubStreamAdPlacer.this.mNeedsPlacement) {
                    MoPubStreamAdPlacer.this.placeAds();
                    MoPubStreamAdPlacer.this.mNeedsPlacement = false;
                }
            }
        };
        this.mVisibleRangeStart = 0;
        this.mVisibleRangeEnd = 0;
    }

    public void registerAdRenderer(MoPubAdRenderer moPubAdRenderer) {
        if (Preconditions.NoThrow.checkNotNull(moPubAdRenderer, "Cannot register a null adRenderer")) {
            this.mAdSource.registerAdRenderer(moPubAdRenderer);
        }
    }

    public MoPubAdRenderer getAdRendererForViewType(int i) {
        return this.mAdSource.getAdRendererForViewType(i);
    }

    public void setAdLoadedListener(MoPubNativeAdLoadedListener moPubNativeAdLoadedListener) {
        if (moPubNativeAdLoadedListener == null) {
            moPubNativeAdLoadedListener = EMPTY_NATIVE_AD_LOADED_LISTENER;
        }
        this.mAdLoadedListener = moPubNativeAdLoadedListener;
    }

    public void loadAds(String str) {
        loadAds(str, null);
    }

    public void loadAds(String str, RequestParameters requestParameters) {
        if (Preconditions.NoThrow.checkNotNull(str, "Cannot load ads with a null ad unit ID")) {
            if (this.mAdSource.getAdRendererCount() == 0) {
                MoPubLog.w("You must register at least 1 ad renderer by calling registerAdRenderer before loading ads");
                return;
            }
            this.mAdUnitId = str;
            this.mHasPlacedAds = false;
            this.mHasReceivedPositions = false;
            this.mHasReceivedAds = false;
            this.mPositioningSource.loadPositions(str, new PositioningSource.PositioningListener() { // from class: com.mopub.nativeads.MoPubStreamAdPlacer.3
                @Override // com.mopub.nativeads.PositioningSource.PositioningListener
                public void onLoad(MoPubNativeAdPositioning.MoPubClientPositioning moPubClientPositioning) {
                    MoPubStreamAdPlacer.this.handlePositioningLoad(moPubClientPositioning);
                }

                @Override // com.mopub.nativeads.PositioningSource.PositioningListener
                public void onFailed() {
                    MoPubLog.d("Unable to show ads because ad positions could not be loaded from the MoPub ad server.");
                }
            });
            this.mAdSource.setAdSourceListener(new NativeAdSource.AdSourceListener() { // from class: com.mopub.nativeads.MoPubStreamAdPlacer.4
                @Override // com.mopub.nativeads.NativeAdSource.AdSourceListener
                public void onAdsAvailable() {
                    MoPubStreamAdPlacer.this.handleAdsAvailable();
                }
            });
            this.mAdSource.loadAds(this.mActivity, str, requestParameters);
        }
    }

    @VisibleForTesting
    void handlePositioningLoad(MoPubNativeAdPositioning.MoPubClientPositioning moPubClientPositioning) {
        PlacementData fromAdPositioning = PlacementData.fromAdPositioning(moPubClientPositioning);
        if (this.mHasReceivedAds) {
            placeInitialAds(fromAdPositioning);
        } else {
            this.mPendingPlacementData = fromAdPositioning;
        }
        this.mHasReceivedPositions = true;
    }

    @VisibleForTesting
    void handleAdsAvailable() {
        if (this.mHasPlacedAds) {
            notifyNeedsPlacement();
            return;
        }
        if (this.mHasReceivedPositions) {
            placeInitialAds(this.mPendingPlacementData);
        }
        this.mHasReceivedAds = true;
    }

    private void placeInitialAds(PlacementData placementData) {
        removeAdsInRange(0, this.mItemCount);
        this.mPlacementData = placementData;
        placeAds();
        this.mHasPlacedAds = true;
    }

    public void placeAdsInRange(int i, int i2) {
        this.mVisibleRangeStart = i;
        this.mVisibleRangeEnd = Math.min(i2, i + 100);
        notifyNeedsPlacement();
    }

    public boolean isAd(int i) {
        return this.mPlacementData.isPlacedAd(i);
    }

    public void clearAds() {
        removeAdsInRange(0, this.mItemCount);
        this.mAdSource.clear();
    }

    public void destroy() {
        this.mPlacementHandler.removeMessages(0);
        this.mAdSource.clear();
        this.mPlacementData.clearAds();
    }

    public Object getAdData(int i) {
        return this.mPlacementData.getPlacedAd(i);
    }

    public View getAdView(int i, View view, ViewGroup viewGroup) {
        NativeAd placedAd = this.mPlacementData.getPlacedAd(i);
        if (placedAd == null) {
            return null;
        }
        if (view == null) {
            view = placedAd.createAdView(this.mActivity, viewGroup);
        }
        bindAdView(placedAd, view);
        return view;
    }

    public void bindAdView(NativeAd nativeAd, View view) {
        WeakReference<View> weakReference = this.mViewMap.get(nativeAd);
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view.equals(view2)) {
            return;
        }
        clearNativeAd(view2);
        clearNativeAd(view);
        prepareNativeAd(nativeAd, view);
        nativeAd.renderAdView(view);
    }

    public int removeAdsInRange(int i, int i2) {
        int[] placedAdPositions = this.mPlacementData.getPlacedAdPositions();
        int adjustedPosition = this.mPlacementData.getAdjustedPosition(i);
        int adjustedPosition2 = this.mPlacementData.getAdjustedPosition(i2);
        ArrayList arrayList = new ArrayList();
        for (int length = placedAdPositions.length - 1; length >= 0; length--) {
            int i3 = placedAdPositions[length];
            if (i3 >= adjustedPosition && i3 < adjustedPosition2) {
                arrayList.add(Integer.valueOf(i3));
                if (i3 < this.mVisibleRangeStart) {
                    this.mVisibleRangeStart--;
                }
                this.mItemCount--;
            }
        }
        int clearAdsInRange = this.mPlacementData.clearAdsInRange(adjustedPosition, adjustedPosition2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.mAdLoadedListener.onAdRemoved(((Integer) it.next()).intValue());
        }
        return clearAdsInRange;
    }

    public int getAdViewTypeCount() {
        return this.mAdSource.getAdRendererCount();
    }

    public int getAdViewType(int i) {
        NativeAd placedAd = this.mPlacementData.getPlacedAd(i);
        if (placedAd == null) {
            return 0;
        }
        return this.mAdSource.getViewTypeForAd(placedAd);
    }

    public int getOriginalPosition(int i) {
        return this.mPlacementData.getOriginalPosition(i);
    }

    public int getAdjustedPosition(int i) {
        return this.mPlacementData.getAdjustedPosition(i);
    }

    public int getOriginalCount(int i) {
        return this.mPlacementData.getOriginalCount(i);
    }

    public int getAdjustedCount(int i) {
        return this.mPlacementData.getAdjustedCount(i);
    }

    public void setItemCount(int i) {
        this.mItemCount = this.mPlacementData.getAdjustedCount(i);
        if (this.mHasPlacedAds) {
            notifyNeedsPlacement();
        }
    }

    public void insertItem(int i) {
        this.mPlacementData.insertItem(i);
    }

    public void removeItem(int i) {
        this.mPlacementData.removeItem(i);
    }

    public void moveItem(int i, int i2) {
        this.mPlacementData.moveItem(i, i2);
    }

    private void notifyNeedsPlacement() {
        if (this.mNeedsPlacement) {
            return;
        }
        this.mNeedsPlacement = true;
        this.mPlacementHandler.post(this.mPlacementRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void placeAds() {
        if (tryPlaceAdsInRange(this.mVisibleRangeStart, this.mVisibleRangeEnd)) {
            tryPlaceAdsInRange(this.mVisibleRangeEnd, this.mVisibleRangeEnd + 6);
        }
    }

    private boolean tryPlaceAdsInRange(int i, int i2) {
        int i3 = i2 - 1;
        while (i <= i3 && i != -1 && i < this.mItemCount) {
            if (this.mPlacementData.shouldPlaceAd(i)) {
                if (!tryPlaceAd(i)) {
                    return false;
                }
                i3++;
            }
            i = this.mPlacementData.nextInsertionPosition(i);
        }
        return true;
    }

    private boolean tryPlaceAd(int i) {
        NativeAd dequeueAd = this.mAdSource.dequeueAd();
        if (dequeueAd == null) {
            return false;
        }
        this.mPlacementData.placeAd(i, dequeueAd);
        this.mItemCount++;
        this.mAdLoadedListener.onAdLoaded(i);
        return true;
    }

    private void clearNativeAd(View view) {
        NativeAd nativeAd;
        if (view == null || (nativeAd = this.mNativeAdMap.get(view)) == null) {
            return;
        }
        nativeAd.clear(view);
        this.mNativeAdMap.remove(view);
        this.mViewMap.remove(nativeAd);
    }

    private void prepareNativeAd(NativeAd nativeAd, View view) {
        this.mViewMap.put(nativeAd, new WeakReference<>(view));
        this.mNativeAdMap.put(view, nativeAd);
        nativeAd.prepare(view);
    }
}
