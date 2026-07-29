package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.ironsource.b.d.b;
import com.ironsource.b.f.g;
import com.ironsource.b.k;

/* loaded from: classes.dex */
public class IronSourceRewardedAdapter extends IronSourceBaseAdapter implements MediationRewardedVideoAdAdapter, g {
    private static boolean mDidInitRewardedVideo;
    private static boolean mDidReceiveFirstAvailability;
    private MediationRewardedVideoAdListener mMediationRewardedVideoAdListener;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.mMediationRewardedVideoAdListener = mediationRewardedVideoAdListener;
        if (!(context instanceof Activity)) {
            onLog("IronSource SDK requires an Activity context to initialize");
            mediationRewardedVideoAdListener.onInitializationFailed(this, 1);
            return;
        }
        try {
            this.mIsLogEnabled = mediationAdRequest.isTesting();
            String string = bundle.getString("appKey");
            if (TextUtils.isEmpty(string)) {
                onLog("IronSource initialization failed, make sure that 'appKey' server parameter is added");
                mediationRewardedVideoAdListener.onInitializationFailed(this, 1);
                return;
            }
            this.mInstanceID = bundle.getString("instanceId", "0");
            k.a(this);
            if (!mDidInitRewardedVideo) {
                mDidInitRewardedVideo = true;
                onLog("IronSource initialization succeeded for RewardedVideo");
                initIronSourceSDK(context, string, k.a.REWARDED_VIDEO);
            }
            mediationRewardedVideoAdListener.onInitializationSucceeded(this);
        } catch (Exception unused) {
            mediationRewardedVideoAdListener.onInitializationFailed(this, 0);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        this.mInstanceID = bundle.getString("instanceId", "0");
        if (mDidReceiveFirstAvailability) {
            if (k.d(this.mInstanceID)) {
                this.mMediationRewardedVideoAdListener.onAdLoaded(this);
            } else {
                this.mMediationRewardedVideoAdListener.onAdFailedToLoad(this, 3);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        if (k.d(this.mInstanceID)) {
            k.c(this.mInstanceID);
        } else {
            onLog("No ads to show.");
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return mDidInitRewardedVideo;
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAvailabilityChanged(final String str, final boolean z) {
        onLog("IronSource Rewarded Video changed availability: " + z + " for instance " + str);
        if (this.mInstanceID.equals(str) && !mDidReceiveFirstAvailability) {
            mDidReceiveFirstAvailability = true;
            if (this.mMediationRewardedVideoAdListener != null) {
                sendEventOnUIThread(new Runnable() { // from class: com.google.ads.mediation.ironsource.IronSourceRewardedAdapter.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!z) {
                            IronSourceRewardedAdapter.this.mMediationRewardedVideoAdListener.onAdFailedToLoad(IronSourceRewardedAdapter.this, 3);
                            IronSourceRewardedAdapter.this.onLog("IronSource Rewarded Video failed to load for instance " + str);
                            return;
                        }
                        IronSourceRewardedAdapter.this.mMediationRewardedVideoAdListener.onAdLoaded(IronSourceRewardedAdapter.this);
                        IronSourceRewardedAdapter.this.onLog("IronSource Rewarded Video loaded successfully for instance " + str);
                    }
                });
            }
        }
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdOpened(String str) {
        onLog("IronSource Rewarded Video opened ad for instance " + str);
        if (this.mMediationRewardedVideoAdListener != null) {
            sendEventOnUIThread(new Runnable() { // from class: com.google.ads.mediation.ironsource.IronSourceRewardedAdapter.2
                @Override // java.lang.Runnable
                public void run() {
                    IronSourceRewardedAdapter.this.mMediationRewardedVideoAdListener.onAdOpened(IronSourceRewardedAdapter.this);
                    IronSourceRewardedAdapter.this.mMediationRewardedVideoAdListener.onVideoStarted(IronSourceRewardedAdapter.this);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdClosed(String str) {
        onLog("IronSource Rewarded Video closed ad for instance " + str);
        if (this.mMediationRewardedVideoAdListener != null) {
            sendEventOnUIThread(new Runnable() { // from class: com.google.ads.mediation.ironsource.IronSourceRewardedAdapter.3
                @Override // java.lang.Runnable
                public void run() {
                    IronSourceRewardedAdapter.this.mMediationRewardedVideoAdListener.onAdClosed(IronSourceRewardedAdapter.this);
                }
            });
        }
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdRewarded(String str, final com.ironsource.b.e.k kVar) {
        if (kVar == null) {
            onLog("IronSource Placement Error");
            return;
        }
        IronSourceReward ironSourceReward = new IronSourceReward(kVar);
        onLog("IronSource Rewarded Video received reward " + ironSourceReward.getType() + " " + ironSourceReward.getAmount() + ", for instance: " + str);
        if (this.mMediationRewardedVideoAdListener != null) {
            sendEventOnUIThread(new Runnable() { // from class: com.google.ads.mediation.ironsource.IronSourceRewardedAdapter.4
                @Override // java.lang.Runnable
                public void run() {
                    IronSourceRewardedAdapter.this.mMediationRewardedVideoAdListener.onRewarded(IronSourceRewardedAdapter.this, IronSourceRewardedAdapter.this.new IronSourceReward(kVar));
                }
            });
        }
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdShowFailed(String str, b bVar) {
        onLog("IronSource Rewarded Video failed to show for instance " + str);
    }

    @Override // com.ironsource.b.f.g
    public void onRewardedVideoAdClicked(String str, com.ironsource.b.e.k kVar) {
        onLog("IronSource Rewarded Video clicked for instance " + str);
        if (this.mMediationRewardedVideoAdListener != null) {
            sendEventOnUIThread(new Runnable() { // from class: com.google.ads.mediation.ironsource.IronSourceRewardedAdapter.5
                @Override // java.lang.Runnable
                public void run() {
                    IronSourceRewardedAdapter.this.mMediationRewardedVideoAdListener.onAdClicked(IronSourceRewardedAdapter.this);
                    IronSourceRewardedAdapter.this.mMediationRewardedVideoAdListener.onAdLeftApplication(IronSourceRewardedAdapter.this);
                }
            });
        }
    }

    class IronSourceReward implements RewardItem {
        private final com.ironsource.b.e.k mPlacement;

        IronSourceReward(com.ironsource.b.e.k kVar) {
            this.mPlacement = kVar;
        }

        @Override // com.google.android.gms.ads.reward.RewardItem
        public String getType() {
            return this.mPlacement.c();
        }

        @Override // com.google.android.gms.ads.reward.RewardItem
        public int getAmount() {
            return this.mPlacement.d();
        }
    }
}
