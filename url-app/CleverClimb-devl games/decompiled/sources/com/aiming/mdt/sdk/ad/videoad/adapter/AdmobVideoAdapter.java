package com.aiming.mdt.sdk.ad.videoad.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.aiming.mdt.AdtAds;
import com.aiming.mdt.Callback;
import com.aiming.mdt.utils.AdLog;
import com.aiming.mdt.utils.Constants;
import com.aiming.mdt.video.VideoAd;
import com.aiming.mdt.video.VideoAdListener;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AdmobVideoAdapter extends Adapter implements MediationRewardedAd, OnContextChangedListener, MediationRewardedVideoAdAdapter {
    private static final int ADT_SDK_INIT_FAILED = 103;
    private static final int APP_KEY_NULL = 101;
    private static final int CONTENT_TYPE_ERROR = 104;
    private static final int LOAD_AD_FAILED = 105;
    private static final int PLACEMENT_ID_NULL = 102;
    private Activity mActivity;
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mMediationAdLoadCallback;
    private MediationRewardedAdCallback mMediationRewardedAdCallback;
    private String mNewPid;
    private String mOldPid;
    private MediationRewardedVideoAdListener mRvListener;
    private VideoAd videoAdNew;
    private VideoAd videoAdOld;

    private class AdtReward implements RewardItem {
        private AdtReward() {
        }

        public int getAmount() {
            return 1;
        }

        public String getType() {
            return "adt";
        }
    }

    private boolean isValidContext(Context context) {
        AdLog singleton;
        String str;
        if (context == null) {
            singleton = AdLog.getSingleton();
            str = "AdmobVideoAdapter Context cannot be null.";
        } else {
            if (context instanceof Activity) {
                return true;
            }
            singleton = AdLog.getSingleton();
            str = "AdmobVideoAdapter Context is not an Activity. adt Ads requires an Activity context to load ads.";
        }
        singleton.LogD(str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAdNewAd(Activity activity, String str) {
        if (this.videoAdNew == null) {
            makeNewAd(activity, str);
        } else {
            if (!TextUtils.isEmpty(this.mNewPid)) {
                if (!this.mNewPid.equals(str)) {
                    makeNewAd(activity, this.mNewPid);
                }
            }
            this.mNewPid = str;
        }
        this.videoAdNew.loadAd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r1.mOldPid.equals(r3) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void loadAdOld(Activity activity, String str) {
        if (this.videoAdOld != null) {
            if (!TextUtils.isEmpty(this.mOldPid)) {
            }
            this.mOldPid = str;
            this.videoAdOld.loadAd();
        }
        makeOldAd(activity, str);
        this.mOldPid = str;
        this.videoAdOld.loadAd();
    }

    private void makeNewAd(Activity activity, String str) {
        this.videoAdNew = new VideoAd(activity, str, new VideoAdListener() { // from class: com.aiming.mdt.sdk.ad.videoad.adapter.AdmobVideoAdapter.4
            @Override // com.aiming.mdt.video.VideoAdListener
            public void onAdClicked() {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder("AdmobVideoAdapter--");
                sb.append(AdmobVideoAdapter.this.mNewPid);
                sb.append("---onAdClicked--");
                singleton.LogD(sb.toString());
                if (AdmobVideoAdapter.this.mMediationRewardedAdCallback != null) {
                    AdmobVideoAdapter.this.mMediationRewardedAdCallback.reportAdClicked();
                }
            }

            @Override // com.aiming.mdt.video.VideoAdListener
            public void onAdClosed(boolean z) {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder("AdmobVideoAdapter---");
                sb.append(AdmobVideoAdapter.this.mNewPid);
                sb.append("---onAdClosed---");
                singleton.LogD(sb.toString());
                if (AdmobVideoAdapter.this.mMediationRewardedAdCallback != null) {
                    AdmobVideoAdapter.this.mMediationRewardedAdCallback.onAdClosed();
                }
            }

            @Override // com.aiming.mdt.core.AdListener
            public void onAdFailed(String str2) {
                StringBuilder sb = new StringBuilder("AdmobVideoAdapter---");
                sb.append(AdmobVideoAdapter.this.mNewPid);
                sb.append("---onAdFailed---errorMsg--%s--");
                String format = String.format(sb.toString(), str2);
                AdLog.getSingleton().LogD(format);
                if (AdmobVideoAdapter.this.mMediationAdLoadCallback != null) {
                    AdmobVideoAdapter.this.mMediationAdLoadCallback.onFailure(format);
                }
            }

            @Override // com.aiming.mdt.video.VideoAdListener
            public void onAdReady() {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder("AdmobVideoAdapter--");
                sb.append(AdmobVideoAdapter.this.mNewPid);
                sb.append("--onAdReady---");
                singleton.LogD(sb.toString());
                if (AdmobVideoAdapter.this.mMediationAdLoadCallback != null) {
                    AdmobVideoAdapter.this.mMediationRewardedAdCallback = (MediationRewardedAdCallback) AdmobVideoAdapter.this.mMediationAdLoadCallback.onSuccess(AdmobVideoAdapter.this);
                }
            }

            @Override // com.aiming.mdt.video.VideoAdListener
            public void onAdRewarded() {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder("AdmobVideoAdapter---");
                sb.append(AdmobVideoAdapter.this.mNewPid);
                sb.append("---onAdRewarded---");
                singleton.LogD(sb.toString());
                if (AdmobVideoAdapter.this.mMediationRewardedAdCallback != null) {
                    AdmobVideoAdapter.this.mMediationRewardedAdCallback.onVideoComplete();
                    AdmobVideoAdapter.this.mMediationRewardedAdCallback.onUserEarnedReward(new AdtReward());
                }
            }
        });
    }

    private void makeOldAd(Activity activity, String str) {
        this.videoAdOld = new VideoAd(activity, str, new VideoAdListener() { // from class: com.aiming.mdt.sdk.ad.videoad.adapter.AdmobVideoAdapter.3
            @Override // com.aiming.mdt.video.VideoAdListener
            public void onAdClicked() {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder("AdmobVideoAdapter--");
                sb.append(AdmobVideoAdapter.this.mOldPid);
                sb.append("---onAdClicked--");
                singleton.LogD(sb.toString());
                if (AdmobVideoAdapter.this.mRvListener != null) {
                    AdmobVideoAdapter.this.mRvListener.onAdClicked(AdmobVideoAdapter.this);
                    AdmobVideoAdapter.this.mRvListener.onAdLeftApplication(AdmobVideoAdapter.this);
                }
            }

            @Override // com.aiming.mdt.video.VideoAdListener
            public void onAdClosed(boolean z) {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder("AdmobVideoAdapter---");
                sb.append(AdmobVideoAdapter.this.mOldPid);
                sb.append("---onAdClosed---");
                singleton.LogD(sb.toString());
                if (AdmobVideoAdapter.this.mRvListener != null) {
                    AdmobVideoAdapter.this.mRvListener.onAdClosed(AdmobVideoAdapter.this);
                }
            }

            @Override // com.aiming.mdt.core.AdListener
            public void onAdFailed(String str2) {
                StringBuilder sb = new StringBuilder("AdmobVideoAdapter---");
                sb.append(AdmobVideoAdapter.this.mOldPid);
                sb.append("---onAdFailed---errorMsg--%s--");
                AdLog.getSingleton().LogD(String.format(sb.toString(), str2));
                if (AdmobVideoAdapter.this.mRvListener != null) {
                    AdmobVideoAdapter.this.mRvListener.onAdFailedToLoad(AdmobVideoAdapter.this, 105);
                }
            }

            @Override // com.aiming.mdt.video.VideoAdListener
            public void onAdReady() {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder("AdmobVideoAdapter--");
                sb.append(AdmobVideoAdapter.this.mOldPid);
                sb.append("--onAdReady--");
                singleton.LogD(sb.toString());
                if (AdmobVideoAdapter.this.mRvListener != null) {
                    AdmobVideoAdapter.this.mRvListener.onAdLoaded(AdmobVideoAdapter.this);
                }
            }

            @Override // com.aiming.mdt.video.VideoAdListener
            public void onAdRewarded() {
                AdLog singleton = AdLog.getSingleton();
                StringBuilder sb = new StringBuilder("AdmobVideoAdapter---");
                sb.append(AdmobVideoAdapter.this.mOldPid);
                sb.append("---onAdRewarded-");
                singleton.LogD(sb.toString());
                if (AdmobVideoAdapter.this.mRvListener != null) {
                    com.google.android.gms.ads.reward.RewardItem rewardItem = new com.google.android.gms.ads.reward.RewardItem() { // from class: com.aiming.mdt.sdk.ad.videoad.adapter.AdmobVideoAdapter.3.1
                        @Override // com.google.android.gms.ads.reward.RewardItem
                        public int getAmount() {
                            return 0;
                        }

                        @Override // com.google.android.gms.ads.reward.RewardItem
                        public String getType() {
                            return "adt";
                        }
                    };
                    AdmobVideoAdapter.this.mRvListener.onVideoCompleted(AdmobVideoAdapter.this);
                    AdmobVideoAdapter.this.mRvListener.onRewarded(AdmobVideoAdapter.this, rewardItem);
                }
            }
        });
    }

    public VersionInfo getSDKVersionInfo() {
        try {
            String[] split = Constants.SDK_V.split("\\.");
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (Exception unused) {
            return null;
        }
    }

    public VersionInfo getVersionInfo() {
        return null;
    }

    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        String string;
        AdLog.getSingleton().LogD("AdmobVideoAdapter----initialize---new api---");
        String str = "";
        Iterator<MediationConfiguration> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Bundle serverParameters = it.next().getServerParameters();
            if (serverParameters != null && (string = serverParameters.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD)) != null && string.contains("_")) {
                str = string.split("_")[0];
                break;
            }
        }
        if (TextUtils.isEmpty(str)) {
            if (initializationCompleteCallback != null) {
                initializationCompleteCallback.onInitializationFailed("101");
            }
            AdLog.getSingleton().LogD("AdmobVideoAdapter----initialize---appKey is null");
        } else if (!isValidContext(context)) {
            if (initializationCompleteCallback != null) {
                initializationCompleteCallback.onInitializationFailed("104");
            }
        } else {
            this.mActivity = (Activity) context;
            if (AdtAds.isInit()) {
                return;
            }
            AdtAds.init(this.mActivity, str, null);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        String string;
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder("AdmobVideoAdapter----initialize old api---");
        sb.append(this);
        singleton.LogD(sb.toString());
        this.mRvListener = mediationRewardedVideoAdListener;
        String str2 = "";
        if (bundle != null && (string = bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD)) != null && string.contains("_")) {
            str2 = string.split("_")[0];
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.mRvListener != null) {
                this.mRvListener.onInitializationFailed(this, 101);
            }
            AdLog.getSingleton().LogD("AdmobVideoAdapter----initialize---appKey is null");
        } else if (!isValidContext(context)) {
            if (this.mRvListener != null) {
                this.mRvListener.onInitializationFailed(this, 104);
            }
        } else {
            this.mActivity = (Activity) context;
            if (AdtAds.isInit()) {
                return;
            }
            AdtAds.init(this.mActivity, str2, new Callback() { // from class: com.aiming.mdt.sdk.ad.videoad.adapter.AdmobVideoAdapter.1
                @Override // com.aiming.mdt.Callback
                public void onError(String str3) {
                    AdmobVideoAdapter.this.mRvListener.onInitializationFailed(AdmobVideoAdapter.this, 103);
                }

                @Override // com.aiming.mdt.Callback
                public void onSuccess() {
                    if (AdmobVideoAdapter.this.mRvListener != null) {
                        AdmobVideoAdapter.this.mRvListener.onInitializationSucceeded(AdmobVideoAdapter.this);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        boolean z = AdtAds.isInit() && this.mActivity != null;
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder("AdmobVideoAdapter isInitialized--initRes=");
        sb.append(z);
        singleton.LogD(sb.toString());
        return z;
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        try {
            AdLog singleton = AdLog.getSingleton();
            StringBuilder sb = new StringBuilder("AdmobVideoAdapter----loadAd---");
            sb.append(this);
            singleton.LogD(sb.toString());
            String str = "";
            if (bundle != null) {
                String string = bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                if (string != null && string.contains("_")) {
                    str = string.split("_")[1];
                }
                AdLog singleton2 = AdLog.getSingleton();
                StringBuilder sb2 = new StringBuilder("AdmobVideoAdapter----loadAd---placementId=");
                sb2.append(str);
                singleton2.LogD(sb2.toString());
            }
            if (this.mActivity != null && !TextUtils.isEmpty(str)) {
                loadAdOld(this.mActivity, str);
                return;
            }
            if (this.mRvListener != null) {
                this.mRvListener.onAdFailedToLoad(this, 102);
            }
        } catch (Exception e) {
            AdLog singleton3 = AdLog.getSingleton();
            StringBuilder sb3 = new StringBuilder("loadAd error--");
            sb3.append(e.toString());
            singleton3.LogD(sb3.toString());
            if (this.mRvListener != null) {
                this.mRvListener.onAdFailedToLoad(this, 105);
            }
        }
    }

    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        try {
            AdLog singleton = AdLog.getSingleton();
            StringBuilder sb = new StringBuilder("AdmobVideoAdapter----loadRewardedAd---");
            sb.append(this);
            singleton.LogD(sb.toString());
            this.mMediationAdLoadCallback = mediationAdLoadCallback;
            Context context = mediationRewardedAdConfiguration.getContext();
            if (!(context instanceof Activity)) {
                if (this.mMediationAdLoadCallback != null) {
                    this.mMediationAdLoadCallback.onFailure("Adt SDK requires an Activity context to initialize or context is null");
                    return;
                }
                return;
            }
            String str = "";
            final Activity activity = (Activity) context;
            Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
            if (serverParameters != null) {
                String string = serverParameters.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                if (string != null && string.contains("_")) {
                    String[] split = string.split("_");
                    str = split[0];
                    this.mNewPid = split[1];
                }
                AdLog singleton2 = AdLog.getSingleton();
                StringBuilder sb2 = new StringBuilder("AdmobVideoAdapter----loadRewardedAd---placementId=");
                sb2.append(this.mNewPid);
                singleton2.LogD(sb2.toString());
            }
            if (!TextUtils.isEmpty(this.mNewPid) && !TextUtils.isEmpty(str)) {
                if (AdtAds.isInit()) {
                    loadAdNewAd(activity, this.mNewPid);
                    return;
                } else {
                    AdtAds.init((Activity) context, str, new Callback() { // from class: com.aiming.mdt.sdk.ad.videoad.adapter.AdmobVideoAdapter.2
                        @Override // com.aiming.mdt.Callback
                        public void onError(String str2) {
                            AdLog.getSingleton().LogD("AdmobVideoAdapter--adt-sdk--init--error-");
                            AdmobVideoAdapter.this.mMediationAdLoadCallback.onFailure(" load rewardedVideo failed cause init sdk failed");
                        }

                        @Override // com.aiming.mdt.Callback
                        public void onSuccess() {
                            AdmobVideoAdapter.this.loadAdNewAd(activity, AdmobVideoAdapter.this.mNewPid);
                        }
                    });
                    return;
                }
            }
            if (this.mMediationAdLoadCallback != null) {
                this.mMediationAdLoadCallback.onFailure(" Context is null or PlacementId is null or appKey is null");
            }
        } catch (Exception e) {
            AdLog singleton3 = AdLog.getSingleton();
            StringBuilder sb3 = new StringBuilder("loadRewardedAd");
            sb3.append(e.toString());
            singleton3.LogD(sb3.toString());
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback2 = this.mMediationAdLoadCallback;
            StringBuilder sb4 = new StringBuilder(" load rewardedVideo failed ");
            sb4.append(e.getLocalizedMessage());
            mediationAdLoadCallback2.onFailure(sb4.toString());
        }
    }

    public void onContextChanged(Context context) {
        AdLog.getSingleton().LogD("AdmobVideoAdapter----onContextChanged---");
        this.mActivity = isValidContext(context) ? (Activity) context : null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdLog.getSingleton().LogD("AdmobVideoAdapter----onDestroy()---");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        AdLog.getSingleton().LogD("AdmobVideoAdapter----onPause()---");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        AdLog.getSingleton().LogD("AdmobVideoAdapter----onResume()---");
    }

    public void showAd(Context context) {
        AdLog.getSingleton().LogD("AdmobVideoAdapter----showAd---");
        if (this.videoAdNew == null || !this.videoAdNew.isReady()) {
            StringBuilder sb = new StringBuilder("show video ad error placementId: ");
            sb.append(this.mNewPid);
            Log.d("Ads", sb.toString());
        } else {
            this.videoAdNew.showAd();
            if (this.mMediationRewardedAdCallback != null) {
                this.mMediationRewardedAdCallback.onVideoStart();
                this.mMediationRewardedAdCallback.onAdOpened();
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        AdLog.getSingleton().LogD("AdmobVideoAdapter----showVideo()---");
        if (this.videoAdOld == null || !this.videoAdOld.isReady()) {
            Log.d("Ads", "show video ad error: ");
            return;
        }
        this.videoAdOld.showAd();
        if (this.mRvListener != null) {
            this.mRvListener.onAdOpened(this);
            this.mRvListener.onVideoStarted(this);
        }
    }
}
