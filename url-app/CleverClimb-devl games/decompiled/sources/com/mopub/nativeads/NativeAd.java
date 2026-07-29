package com.mopub.nativeads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.mopub.common.VisibleForTesting;
import com.mopub.nativeads.BaseNativeAd;
import com.mopub.network.TrackingRequest;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class NativeAd {
    private final String mAdUnitId;
    private final BaseNativeAd mBaseNativeAd;
    private final Set<String> mClickTrackers;
    private final Context mContext;
    private final Set<String> mImpressionTrackers = new HashSet();
    private boolean mIsClicked;
    private boolean mIsDestroyed;
    private final MoPubAdRenderer mMoPubAdRenderer;
    private MoPubNativeEventListener mMoPubNativeEventListener;
    private boolean mRecordedImpression;

    public interface MoPubNativeEventListener {
        void onClick(View view);

        void onImpression(View view);
    }

    public NativeAd(Context context, String str, String str2, String str3, BaseNativeAd baseNativeAd, MoPubAdRenderer moPubAdRenderer) {
        this.mContext = context.getApplicationContext();
        this.mAdUnitId = str3;
        this.mImpressionTrackers.add(str);
        this.mImpressionTrackers.addAll(baseNativeAd.getImpressionTrackers());
        this.mClickTrackers = new HashSet();
        this.mClickTrackers.add(str2);
        this.mClickTrackers.addAll(baseNativeAd.getClickTrackers());
        this.mBaseNativeAd = baseNativeAd;
        this.mBaseNativeAd.setNativeEventListener(new BaseNativeAd.NativeEventListener() { // from class: com.mopub.nativeads.NativeAd.1
            @Override // com.mopub.nativeads.BaseNativeAd.NativeEventListener
            public void onAdImpressed() {
                NativeAd.this.recordImpression(null);
            }

            @Override // com.mopub.nativeads.BaseNativeAd.NativeEventListener
            public void onAdClicked() {
                NativeAd.this.handleClick(null);
            }
        });
        this.mMoPubAdRenderer = moPubAdRenderer;
    }

    public String toString() {
        return "\nimpressionTrackers:" + this.mImpressionTrackers + "\nclickTrackers:" + this.mClickTrackers + "\nrecordedImpression:" + this.mRecordedImpression + "\nisClicked:" + this.mIsClicked + "\nisDestroyed:" + this.mIsDestroyed + "\n";
    }

    public void setMoPubNativeEventListener(MoPubNativeEventListener moPubNativeEventListener) {
        this.mMoPubNativeEventListener = moPubNativeEventListener;
    }

    public String getAdUnitId() {
        return this.mAdUnitId;
    }

    public boolean isDestroyed() {
        return this.mIsDestroyed;
    }

    public BaseNativeAd getBaseNativeAd() {
        return this.mBaseNativeAd;
    }

    public View createAdView(Context context, ViewGroup viewGroup) {
        return this.mMoPubAdRenderer.createAdView(context, viewGroup);
    }

    public void renderAdView(View view) {
        this.mMoPubAdRenderer.renderAdView(view, this.mBaseNativeAd);
    }

    public MoPubAdRenderer getMoPubAdRenderer() {
        return this.mMoPubAdRenderer;
    }

    public void prepare(View view) {
        if (this.mIsDestroyed) {
            return;
        }
        this.mBaseNativeAd.prepare(view);
    }

    public void clear(View view) {
        if (this.mIsDestroyed) {
            return;
        }
        this.mBaseNativeAd.clear(view);
    }

    public void destroy() {
        if (this.mIsDestroyed) {
            return;
        }
        this.mBaseNativeAd.destroy();
        this.mIsDestroyed = true;
    }

    @VisibleForTesting
    void recordImpression(View view) {
        if (this.mRecordedImpression || this.mIsDestroyed) {
            return;
        }
        TrackingRequest.makeTrackingHttpRequest(this.mImpressionTrackers, this.mContext);
        if (this.mMoPubNativeEventListener != null) {
            this.mMoPubNativeEventListener.onImpression(view);
        }
        this.mRecordedImpression = true;
    }

    @VisibleForTesting
    void handleClick(View view) {
        if (this.mIsClicked || this.mIsDestroyed) {
            return;
        }
        TrackingRequest.makeTrackingHttpRequest(this.mClickTrackers, this.mContext);
        if (this.mMoPubNativeEventListener != null) {
            this.mMoPubNativeEventListener.onClick(view);
        }
        this.mIsClicked = true;
    }
}
