package com.dancingbogo.skyrolline.ad.c.d;

import android.app.Activity;
import android.util.Log;
import com.cmplay.a.d;
import com.cmplay.base.util.s;
import com.dancingbogo.skyrolline.ad.a.b;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* compiled from: FacebookVideoAds.java */
/* loaded from: classes2.dex */
public class a extends com.dancingbogo.skyrolline.ad.a.a implements RewardedVideoAdListener {

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference<Activity> f4517b;

    /* renamed from: c, reason: collision with root package name */
    private static a f4518c;

    /* renamed from: a, reason: collision with root package name */
    private RewardedVideoAd f4519a;
    private b e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4520d = true;
    private int f = 1;

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onDestroy(Activity activity) {
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onPaused(Activity activity) {
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onResume(Activity activity) {
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void prepare() {
    }

    private a() {
    }

    public Activity a() {
        if (f4517b == null) {
            return null;
        }
        return f4517b.get();
    }

    public static a b() {
        if (f4518c == null) {
            synchronized (a.class) {
                if (f4518c == null) {
                    f4518c = new a();
                }
            }
        }
        return f4518c;
    }

    private void c() {
        ReportMagicCtrlAd(4, 5, 0, 101, 7, true, 0, false, 0, 0, 0);
        if (a() != null) {
            if (this.f4519a == null) {
                this.f4519a = new RewardedVideoAd(a(), "116185018797941_467176010365505");
                this.f4519a.setAdListener(this);
            }
            if (this.f4519a != null && this.f4519a.isAdLoaded()) {
                ReportMagicCtrlAd(4, 5, 0, 105, 7, true, 0, false, 0, 0, 0);
                return;
            }
            if (this.isRewardedVideoAdLoading) {
                ReportMagicCtrlAd(4, 5, 0, 106, 7, true, 0, false, 0, 0, 0);
                return;
            }
            this.isRewardedVideoAdLoaded = false;
            this.f4519a.loadAd();
            a("loadRewardedVideoAd");
            this.requestRVTime = getTimeStampMilliSec();
            this.isRewardedVideoAdLoading = true;
            ReportMagicCtrlAd(4, 5, 0, 8, 7, true, 0, false, 0, 0, 0);
        }
        new d().a(2, 1, 0, 8, 99);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onCreate(Activity activity) {
        super.onCreate(activity);
        f4517b = new WeakReference<>(activity);
        this.mContext = activity.getApplicationContext();
        this.f = 1;
        c();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        a("onRewardedVideoCompleted");
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 4, 7, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        a("onRewardedVideoClosed");
        this.f = 2;
        if (this.e != null) {
            this.e.a(false);
        }
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 7, 7, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        c();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener, com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        a("onLoggingImpression" + ad.getPlacementId());
        if (this.e != null) {
            this.e.a();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        int i;
        this.isRewardedVideoAdLoading = false;
        a("onError" + adError.getErrorMessage());
        new d().a(2, 3, adError.getErrorCode(), 8, 99);
        int errorCode = adError.getErrorCode();
        if (errorCode != 3001) {
            switch (errorCode) {
                case 1000:
                    i = 2;
                    break;
                case 1001:
                    i = 1;
                    break;
                default:
                    switch (errorCode) {
                    }
                case 1002:
                    i = 4;
                    break;
            }
            ReportMagicCtrlAd(4, 5, 0, 104, 7, true, i, false, 0, 0, 0);
        }
        i = 4;
        ReportMagicCtrlAd(4, 5, 0, 104, 7, true, i, false, 0, 0, 0);
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        this.isRewardedVideoAdLoaded = true;
        this.isRewardedVideoAdLoading = false;
        a("onAdLoaded" + ad.getPlacementId());
        new d().a(2, 2, 0, 8, 99);
        ReportMagicCtrlAd(4, 5, 0, 103, 7, true, 0, false, 0, 0, 0);
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        a("onAdClicked" + ad.getPlacementId());
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 2, 7, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean canShow(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("canshow()");
        sb.append(this.f4519a != null && this.f4519a.isAdLoaded());
        a(sb.toString());
        return this.f4519a != null && this.f4519a.isAdLoaded();
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean show(int i) {
        this.mSceneOfRewardedVideoAd = i;
        boolean z = false;
        this.mIsTryOfRewardedVideoAd = 0;
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 102, 7, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        this.lastCallShowRVTime = getTimeStampMilliSec();
        if (this.f4519a != null && this.f4519a.isAdLoaded()) {
            a("rewardedVideoAd.show()");
            z = this.f4519a.show();
        }
        if (!z) {
            ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 10, 7, true, 4 == s.a(this.mContext) ? 2 : 1, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        }
        return z;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void setListener(b bVar) {
        this.e = bVar;
    }

    private void a(String str) {
        if (this.f4520d) {
            Log.d("FacebookVideoAds", str);
        }
    }
}
