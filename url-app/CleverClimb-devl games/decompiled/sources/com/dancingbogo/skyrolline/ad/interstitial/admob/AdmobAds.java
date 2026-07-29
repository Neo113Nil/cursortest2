package com.dancingbogo.skyrolline.ad.interstitial.admob;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.sdk.AppLovinMediationProvider;
import com.cmplay.a.d;
import com.cmplay.base.util.s;
import com.cmplay.policy.gdpr.GDPRController;
import com.dancingbogo.skyrolline.AppActivity;
import com.dancingbogo.skyrolline.ad.a.a;
import com.dancingbogo.skyrolline.ad.a.b;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.ironsource.b.k;
import com.youappi.sdk.mediation.admob.YouAppiInterstitialAd;
import com.youappi.sdk.mediation.admob.YouAppiInterstitialVideo;

/* loaded from: classes2.dex */
public class AdmobAds extends a {
    public static String DEV_ID = "ca-app-pub-2053659879139694/3756276980";
    public static String RESULT_IDS = null;
    public static final String TAG = "AdmobAds";
    private static AdmobAds sInstance;
    private b mIAdListener;
    private InterstitialAd mInterstitialAd;
    private int mRetryTime = 3;
    private AdListener mAdListener = new AdListener() { // from class: com.dancingbogo.skyrolline.ad.interstitial.admob.AdmobAds.1
        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            AdmobAds.this.isInterstitialAdLoaded = false;
            String mediationAdapterClassName = AdmobAds.this.mInterstitialAd.getMediationAdapterClassName();
            if (TextUtils.isEmpty(mediationAdapterClassName)) {
                mediationAdapterClassName = "";
            }
            AdmobAds.this.ReportAdmobAd(1, mediationAdapterClassName, 1, AdmobAds.this.mSceneOfInterstitialAd, 7, true, 0, false, 0, 0, AdmobAds.this.mIsTryOfInterstitialAd);
            if (AdmobAds.this.mIAdListener != null) {
                AdmobAds.this.mIAdListener.c();
            }
            com.dancingbogo.skyrolline.util.b.b(AppLovinMediationProvider.ADMOB, "onAdClosed");
            AdmobAds.this.newRequest();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(int i) {
            int i2;
            super.onAdFailedToLoad(i);
            com.dancingbogo.skyrolline.util.b.b(AppLovinMediationProvider.ADMOB, "onAdFailedToLoad = " + i);
            AdmobAds.this.isInterstitialAdLoaded = false;
            AdmobAds.this.isInterstitialAdLoading = false;
            switch (i) {
                case 0:
                case 1:
                default:
                    i2 = 4;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 1;
                    break;
            }
            AdmobAds.this.ReportAdmobAd(1, "", 1, 0, 104, true, i2, false, 0, 0, 0);
            new d().a(1, 3, i, 102, 99);
            switch (i) {
                case 0:
                    AdmobAdsTestUtil.getInstance().showToast("广告加载失败：errorCode=0，INTERNAL_ERROR");
                    break;
                case 1:
                    AdmobAdsTestUtil.getInstance().showToast("广告加载失败：errorCode=1，INVALID_REQUEST");
                    break;
                case 2:
                    AdmobAdsTestUtil.getInstance().showToast("广告加载失败：errorCode=2，NETWORK_ERROR");
                    break;
                case 3:
                    AdmobAdsTestUtil.getInstance().showToast("广告加载失败：errorCode=3，NO_FILL ");
                    break;
                default:
                    AdmobAdsTestUtil.getInstance().showToast("广告加载失败：errorCode" + i);
                    break;
            }
            com.dancingbogo.skyrolline.util.b.b(AppLovinMediationProvider.ADMOB, "onAdFailedToLoad = " + i + "   mRetryTime:" + AdmobAds.this.mRetryTime);
            if (AdmobAds.this.mRetryTime > 0) {
                AdmobAds.this.newRequest();
                AdmobAds.access$810(AdmobAds.this);
                com.dancingbogo.skyrolline.util.b.b(AppLovinMediationProvider.ADMOB, "onAdFailedToLoad Retry  newRequest()   mRetryTime:" + AdmobAds.this.mRetryTime);
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLeftApplication() {
            super.onAdLeftApplication();
            com.dancingbogo.skyrolline.util.b.b(AppLovinMediationProvider.ADMOB, "onAdLeftApplication");
            String mediationAdapterClassName = AdmobAds.this.mInterstitialAd.getMediationAdapterClassName();
            if (TextUtils.isEmpty(mediationAdapterClassName)) {
                mediationAdapterClassName = "";
            }
            AdmobAds.this.ReportAdmobAd(1, mediationAdapterClassName, 1, AdmobAds.this.mSceneOfInterstitialAd, 2, true, 0, false, 0, 0, AdmobAds.this.mIsTryOfInterstitialAd);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            com.dancingbogo.skyrolline.util.b.b(AppLovinMediationProvider.ADMOB, "onAdOpened");
            String mediationAdapterClassName = AdmobAds.this.mInterstitialAd.getMediationAdapterClassName();
            if (TextUtils.isEmpty(mediationAdapterClassName)) {
                mediationAdapterClassName = "";
            }
            AdmobAds.this.ReportAdmobAd(1, mediationAdapterClassName, 1, AdmobAds.this.mSceneOfInterstitialAd, 1, true, 0, false, 0, 0, AdmobAds.this.mIsTryOfInterstitialAd);
            if (AdmobAds.this.mIAdListener != null) {
                AdmobAds.this.mIAdListener.b();
            }
            if (AdmobAds.this.mInterstitialAd != null) {
                if (AdmobAds.this.mInterstitialAd.getAdUnitId() != null) {
                    AdmobAdsTestUtil.getInstance().showToast(AdmobAds.this.mInterstitialAd.getAdUnitId());
                }
                if (AdmobAds.this.mInterstitialAd.getMediationAdapterClassName() != null) {
                    AdmobAdsTestUtil.getInstance().showToast(AdmobAds.this.mInterstitialAd.getMediationAdapterClassName());
                }
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            com.dancingbogo.skyrolline.util.b.b(AppLovinMediationProvider.ADMOB, "onAdLoaded");
            AdmobAds.this.isInterstitialAdLoaded = true;
            AdmobAds.this.isInterstitialAdLoading = false;
            String mediationAdapterClassName = AdmobAds.this.mInterstitialAd.getMediationAdapterClassName();
            if (TextUtils.isEmpty(mediationAdapterClassName)) {
                mediationAdapterClassName = "";
            }
            AdmobAds.this.ReportAdmobAd(1, mediationAdapterClassName, 1, 0, 103, true, 0, false, 0, 0, 0);
            new d().a(1, 2, 0, 102, 99);
            AdmobAdsTestUtil.getInstance().showToast("广告加载成功");
            AdmobAds.this.mRetryTime = 3;
        }
    };

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean canShow(int i) {
        return true;
    }

    static /* synthetic */ int access$810(AdmobAds admobAds) {
        int i = admobAds.mRetryTime;
        admobAds.mRetryTime = i - 1;
        return i;
    }

    public AdmobAds() {
        if (AdmobAdsTestUtil.DEBUG.booleanValue()) {
            RESULT_IDS = DEV_ID;
        } else {
            RESULT_IDS = "ca-app-pub-2053659879139694/3756276980";
        }
    }

    public static AdmobAds getInstance() {
        if (sInstance == null) {
            synchronized (AdmobAds.class) {
                if (sInstance == null) {
                    sInstance = new AdmobAds();
                }
            }
        }
        return sInstance;
    }

    public static void cleanInstance() {
        sInstance = null;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onCreate(Activity activity) {
        this.mContext = activity.getApplicationContext();
        newRequest();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean show(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("show   scene:");
        sb.append(i);
        sb.append("   isTry:");
        boolean z = false;
        sb.append(0);
        Log.d(TAG, sb.toString());
        this.mSceneOfInterstitialAd = i;
        this.mIsTryOfInterstitialAd = 0;
        String mediationAdapterClassName = this.mInterstitialAd != null ? this.mInterstitialAd.getMediationAdapterClassName() : "";
        if (TextUtils.isEmpty(mediationAdapterClassName)) {
            mediationAdapterClassName = "";
        }
        ReportAdmobAd(1, mediationAdapterClassName, 1, this.mSceneOfInterstitialAd, 102, true, 0, false, 0, 0, this.mIsTryOfInterstitialAd);
        this.lastCallShowISTime = getTimeStampMilliSec();
        try {
            if (this.mInterstitialAd != null && this.mInterstitialAd.isLoaded()) {
                this.mInterstitialAd.show();
                try {
                    Log.d(AppLovinMediationProvider.ADMOB, "show---adapter name = " + this.mInterstitialAd.getMediationAdapterClassName());
                    z = true;
                } catch (Exception e) {
                    e = e;
                    z = true;
                    e.printStackTrace();
                    if (!z) {
                    }
                    return z;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (!z) {
            ReportAdmobAd(1, "", 1, this.mSceneOfInterstitialAd, 10, true, 4 == s.a(this.mContext) ? 2 : 1, false, 0, 0, this.mIsTryOfInterstitialAd);
            newRequest();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void newRequest() {
        AdRequest build;
        ReportAdmobAd(1, "", 1, 0, 101, true, 0, false, 0, 0, 0);
        this.lastCallRequestISTime = getTimeStampMilliSec();
        if (this.mInterstitialAd != null && this.mInterstitialAd.isLoaded()) {
            String mediationAdapterClassName = this.mInterstitialAd.getMediationAdapterClassName();
            if (TextUtils.isEmpty(mediationAdapterClassName)) {
                mediationAdapterClassName = "";
            }
            ReportAdmobAd(1, mediationAdapterClassName, 1, 0, 105, true, 0, false, 0, 0, 0);
            return;
        }
        if (this.mInterstitialAd != null && this.mInterstitialAd.isLoading()) {
            ReportAdmobAd(1, "", 1, 0, 106, true, 0, false, 0, 0, 0);
            return;
        }
        this.isInterstitialAdLoaded = false;
        String[] strArr = {"RS_AND_INTERSTITIAL_VUNGLE_H-3874348", "RS_AND_INTERSTITIAL_H-9220787", "RS_AND_INTERSTITIAL_L-0635142"};
        if (!GDPRController.checkIfGDPRAgreedAdStayInformed(AppActivity.getActivityRef())) {
            Bundle bundle = new Bundle();
            bundle.putString("npa", "1");
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("consent", false);
            build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).addCustomEventExtrasBundle(YouAppiInterstitialAd.class, bundle2).addCustomEventExtrasBundle(YouAppiInterstitialVideo.class, bundle2).build();
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("consent", true);
            build = new AdRequest.Builder().addCustomEventExtrasBundle(YouAppiInterstitialAd.class, bundle3).addCustomEventExtrasBundle(YouAppiInterstitialVideo.class, bundle3).build();
        }
        this.mInterstitialAd = new InterstitialAd(AppActivity.getActivityRef());
        this.mInterstitialAd.setAdUnitId(RESULT_IDS);
        this.mInterstitialAd.setAdListener(this.mAdListener);
        this.mInterstitialAd.loadAd(build);
        this.requestISTime = getTimeStampMilliSec();
        this.isInterstitialAdLoading = true;
        ReportAdmobAd(1, "", 1, 0, 8, true, 0, false, 0, 0, 0);
        new d().a(1, 1, 0, 102, 99);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void prepare() {
        newRequest();
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void setListener(b bVar) {
        this.mIAdListener = bVar;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onResume(Activity activity) {
        super.onResume(activity);
        k.a(activity);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onPaused(Activity activity) {
        super.onPaused(activity);
        k.b(activity);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onStart(Activity activity) {
        super.onStart(activity);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onStop(Activity activity) {
        super.onStop(activity);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onDestroy(Activity activity) {
        super.onDestroy(activity);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean onBackPressed() {
        return super.onBackPressed();
    }
}
