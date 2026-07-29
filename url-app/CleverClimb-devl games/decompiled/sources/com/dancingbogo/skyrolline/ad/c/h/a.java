package com.dancingbogo.skyrolline.ad.c.h;

import android.app.Activity;
import android.content.Context;
import com.cmplay.a.d;
import com.cmplay.base.util.s;
import com.cmplay.policy.gdpr.GDPRController;
import com.dancingbogo.skyrolline.ad.a.b;
import com.youappi.sdk.YAErrorCode;
import com.youappi.sdk.YouAPPi;
import com.youappi.sdk.ads.YARewardedVideoAd;

/* compiled from: YouappiVideoAds.java */
/* loaded from: classes2.dex */
public class a extends com.dancingbogo.skyrolline.ad.a.a implements YARewardedVideoAd.RewardedVideoAdListener {

    /* renamed from: a, reason: collision with root package name */
    private static a f4534a;

    /* renamed from: b, reason: collision with root package name */
    private Context f4535b;

    /* renamed from: c, reason: collision with root package name */
    private YARewardedVideoAd f4536c;

    /* renamed from: d, reason: collision with root package name */
    private b f4537d;
    private boolean e = false;
    private int f = 9;

    @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
    public void onAdLeftApplication(String str) {
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onAdStarted(String str) {
    }

    @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
    public void onCardClose(String str) {
    }

    @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
    public void onCardShow(String str) {
    }

    @Override // com.youappi.sdk.ads.YAInterstitialVideoAd.InterstitialVideoAdListener
    public void onVideoEnd(String str) {
    }

    @Override // com.youappi.sdk.ads.YAInterstitialVideoAd.InterstitialVideoAdListener
    public void onVideoSkipped(String str, int i) {
    }

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f4534a == null) {
                synchronized (a.class) {
                    if (f4534a == null) {
                        f4534a = new a();
                    }
                }
            }
            aVar = f4534a;
        }
        return aVar;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onCreate(Activity activity) {
        super.onCreate(activity);
        this.f4535b = activity.getApplicationContext();
        b();
    }

    private void b() {
        YouAPPi.init(this.f4535b, "662c1014-9da4-402b-838e-8457f0d3d9ef", false);
        if (GDPRController.checkIfGDPRAgreedAdStayInformed(this.f4535b)) {
            YouAPPi.getInstance().setUserConsent(true);
        } else {
            YouAPPi.getInstance().setUserConsent(false);
        }
        c();
        new d().a(2, 1, 0, this.f, 99);
    }

    private void c() {
        ReportMagicCtrlAd(4, 5, 0, 101, 16, true, 0, false, 0, 0, 0);
        this.lastCallRequestRVTime = getTimeStampMilliSec();
        if (this.f4536c != null && this.f4536c.isAvailable()) {
            ReportMagicCtrlAd(4, 5, 0, 105, 16, true, 0, false, 0, 0, 0);
            return;
        }
        if (this.isRewardedVideoAdLoading) {
            ReportMagicCtrlAd(4, 5, 0, 106, 16, true, 0, false, 0, 0, 0);
            return;
        }
        this.isRewardedVideoAdLoaded = false;
        this.f4536c = YouAPPi.getInstance().rewardedVideoAd("tesRewardedVideoAdUnit");
        this.f4536c.setRewardedVideoAdListener(this);
        this.f4536c.load();
        this.requestRVTime = getTimeStampMilliSec();
        this.isRewardedVideoAdLoading = true;
        ReportMagicCtrlAd(4, 5, 0, 8, 16, true, 0, false, 0, 0, 0);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean canShow(int i) {
        return this.f4536c != null && this.f4536c.isAvailable();
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean show(int i) {
        this.mSceneOfRewardedVideoAd = i;
        boolean z = false;
        this.mIsTryOfRewardedVideoAd = 0;
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 102, 16, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        this.lastCallShowRVTime = getTimeStampMilliSec();
        if (this.f4536c != null && this.f4536c.isAvailable()) {
            this.f4536c.show();
            z = true;
        }
        if (!z) {
            ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 10, 16, true, 4 == s.a(this.f4535b) ? 2 : 1, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        }
        return z;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void setListener(b bVar) {
        this.f4537d = bVar;
    }

    @Override // com.youappi.sdk.ads.YARewardedVideoAd.RewardedVideoAdListener
    public void onRewarded(String str) {
        this.e = true;
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 4, 16, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
    }

    @Override // com.youappi.sdk.ads.YAInterstitialVideoAd.InterstitialVideoAdListener
    public void onVideoStart(String str) {
        this.f4537d.a();
        this.e = false;
        new d().a(2, 4, 0, this.f, 99);
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 3, 16, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
    }

    @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
    public void onAdClick(String str) {
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 2, 16, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onLoadSuccess(String str) {
        this.isRewardedVideoAdLoaded = true;
        this.isRewardedVideoAdLoading = false;
        ReportMagicCtrlAd(4, 5, 0, 103, 16, true, 0, false, 0, 0, 0);
        new d().a(2, 2, 0, this.f, 99);
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onLoadFailure(String str, YAErrorCode yAErrorCode, Exception exc) {
        this.isRewardedVideoAdLoading = false;
        ReportMagicCtrlAd(4, 5, 0, 104, 16, true, yAErrorCode == YAErrorCode.NO_FILL ? 1 : 4, false, 0, 0, 0);
        new d().a(2, 3, 0, this.f, 99);
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onShowFailure(String str, YAErrorCode yAErrorCode, Exception exc) {
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 10, 16, true, 4 == s.a(this.f4535b) ? 2 : 1, false, 0, 0, this.mIsTryOfRewardedVideoAd);
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onAdEnded(String str) {
        this.f4537d.a(!this.e);
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 7, 16, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        c();
        new d().a(2, 1, 0, this.f, 99);
    }
}
