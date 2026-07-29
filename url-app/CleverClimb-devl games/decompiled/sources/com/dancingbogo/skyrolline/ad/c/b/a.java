package com.dancingbogo.skyrolline.ad.c.b;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.cmplay.a.d;
import com.cmplay.base.util.s;
import com.cmplay.policy.gdpr.GDPRController;
import com.dancingbogo.skyrolline.AppActivity;
import com.dancingbogo.skyrolline.ad.a.b;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* compiled from: AdmobVideoAds.java */
/* loaded from: classes2.dex */
public class a extends com.dancingbogo.skyrolline.ad.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static String f4506a = "ca-app-pub-2053659879139694/8300019049";

    /* renamed from: c, reason: collision with root package name */
    private static a f4507c;

    /* renamed from: b, reason: collision with root package name */
    private RewardedVideoAd f4508b;

    /* renamed from: d, reason: collision with root package name */
    private b f4509d;
    private String e = "AdmobVideoAds";
    private final int f = 7;
    private Activity g;

    private a() {
    }

    public static a a() {
        if (f4507c == null) {
            synchronized (a.class) {
                if (f4507c == null) {
                    f4507c = new a();
                }
            }
        }
        return f4507c;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onCreate(Activity activity) {
        Log.d(this.e, "onCreate");
        MobileAds.initialize(activity);
        this.g = activity;
        this.mContext = activity.getApplicationContext();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.g == null) {
            return;
        }
        this.isRewardedVideoAdLoaded = false;
        this.f4508b = MobileAds.getRewardedVideoAdInstance(this.g);
        this.f4508b.setRewardedVideoAdListener(new RewardedVideoAdListener() { // from class: com.dancingbogo.skyrolline.ad.c.b.a.1
            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewardedVideoCompleted() {
            }

            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewardedVideoAdLoaded() {
                a.this.isRewardedVideoAdLoaded = true;
                a.this.isRewardedVideoAdLoading = false;
                Log.d(a.this.e, "on ad onRewardedVideoAdLoaded");
                new d().a(2, 2, 0, 7, 99);
                String mediationAdapterClassName = a.this.f4508b.getMediationAdapterClassName();
                if (TextUtils.isEmpty(mediationAdapterClassName)) {
                    mediationAdapterClassName = "";
                }
                a.this.ReportAdmobAd(1, mediationAdapterClassName, 5, 0, 103, true, 0, false, 0, 0, 0);
            }

            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewardedVideoAdOpened() {
                Log.d(a.this.e, "on ad onRewardedVideoAdOpened");
            }

            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewardedVideoStarted() {
                Log.d(a.this.e, "on ad start");
                if (a.this.f4509d != null) {
                    a.this.f4509d.a();
                }
                String mediationAdapterClassName = a.this.f4508b.getMediationAdapterClassName();
                if (TextUtils.isEmpty(mediationAdapterClassName)) {
                    mediationAdapterClassName = "";
                }
                a.this.ReportAdmobAd(1, mediationAdapterClassName, 5, a.this.mSceneOfRewardedVideoAd, 3, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
                new d().a(2, 4, 0, 7, 99);
            }

            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewardedVideoAdClosed() {
                Log.d(a.this.e, "on ad onFinished");
                String mediationAdapterClassName = a.this.f4508b.getMediationAdapterClassName();
                if (TextUtils.isEmpty(mediationAdapterClassName)) {
                    mediationAdapterClassName = "";
                }
                a.this.ReportAdmobAd(1, mediationAdapterClassName, 5, a.this.mSceneOfRewardedVideoAd, 7, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
                a.this.b();
            }

            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewarded(RewardItem rewardItem) {
                Log.d(a.this.e, "rewardItem");
                String mediationAdapterClassName = a.this.f4508b.getMediationAdapterClassName();
                if (TextUtils.isEmpty(mediationAdapterClassName)) {
                    mediationAdapterClassName = "";
                }
                a.this.ReportAdmobAd(1, mediationAdapterClassName, 5, a.this.mSceneOfRewardedVideoAd, 4, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
                if (a.this.f4509d != null) {
                    a.this.f4509d.a(false);
                }
            }

            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewardedVideoAdLeftApplication() {
                Log.d(a.this.e, "on ad onRewardedVideoAdLeftApplication");
                String mediationAdapterClassName = a.this.f4508b.getMediationAdapterClassName();
                if (TextUtils.isEmpty(mediationAdapterClassName)) {
                    mediationAdapterClassName = "";
                }
                a.this.ReportAdmobAd(1, mediationAdapterClassName, 5, a.this.mSceneOfRewardedVideoAd, 2, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
            }

            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewardedVideoAdFailedToLoad(int i) {
                int i2;
                Log.d(a.this.e, "on ad onViewShowFail  errorCode:" + i);
                a.this.isRewardedVideoAdLoading = false;
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
                a.this.ReportAdmobAd(1, "", 5, 0, 104, true, i2, false, 0, 0, 0);
                new d().a(2, 3, i, 7, 99);
            }
        });
        c();
        new d().a(2, 1, 0, 7, 99);
        Log.d(this.e, f4506a);
    }

    private void c() {
        AdRequest build;
        ReportAdmobAd(1, "", 5, 0, 101, true, 0, false, 0, 0, 0);
        this.lastCallRequestRVTime = getTimeStampMilliSec();
        if (this.f4508b != null && this.f4508b.isLoaded()) {
            String mediationAdapterClassName = this.f4508b.getMediationAdapterClassName();
            if (TextUtils.isEmpty(mediationAdapterClassName)) {
                mediationAdapterClassName = "";
            }
            ReportAdmobAd(1, mediationAdapterClassName, 5, 0, 105, true, 0, false, 0, 0, 0);
            return;
        }
        if (this.isRewardedVideoAdLoading) {
            ReportAdmobAd(1, "", 5, 0, 106, true, 0, false, 0, 0, 0);
            return;
        }
        this.isRewardedVideoAdLoaded = false;
        String[] strArr = {"RS_AND_RV_LOW_20180621-5302580", "RS_AND_RV_HIGH_20180621-6639002", "RS_AND_RV_L-5439574"};
        if (this.f4508b != null) {
            if (!GDPRController.checkIfGDPRAgreedAdStayInformed(AppActivity.getActivityRef())) {
                Bundle bundle = new Bundle();
                bundle.putString("npa", "1");
                build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
            } else {
                build = new AdRequest.Builder().build();
            }
            this.f4508b.loadAd(f4506a, build);
            this.requestRVTime = getTimeStampMilliSec();
            this.isRewardedVideoAdLoading = true;
            ReportAdmobAd(1, "", 1, 0, 8, true, 0, false, 0, 0, 0);
            Log.d(this.e, "loadAd");
        }
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean canShow(int i) {
        return this.f4508b != null && this.isRewardedVideoAdLoaded;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean show(int i) {
        String str = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append("displayRewardBasedAd   scene:");
        sb.append(i);
        sb.append("   isTry:");
        boolean z = false;
        sb.append(0);
        Log.d(str, sb.toString());
        this.mSceneOfRewardedVideoAd = i;
        this.mIsTryOfRewardedVideoAd = 0;
        String mediationAdapterClassName = this.f4508b != null ? this.f4508b.getMediationAdapterClassName() : "";
        if (TextUtils.isEmpty(mediationAdapterClassName)) {
            mediationAdapterClassName = "";
        }
        ReportAdmobAd(1, mediationAdapterClassName, 5, this.mSceneOfRewardedVideoAd, 102, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        this.lastCallShowRVTime = getTimeStampMilliSec();
        try {
            if (canShow(i)) {
                this.f4508b.show();
                z = true;
            } else {
                c();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!z) {
            ReportAdmobAd(1, "", 5, this.mSceneOfRewardedVideoAd, 10, true, 4 == s.a(this.mContext) ? 2 : 1, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        }
        return z;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void setListener(b bVar) {
        this.f4509d = bVar;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void prepare() {
        Log.d(this.e, "prepare");
        c();
    }
}
