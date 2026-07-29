package com.dancingbogo.skyrolline.ad.c.f;

import android.app.Activity;
import com.cmplay.a.d;
import com.dancingbogo.skyrolline.ad.a.b;
import com.ironsource.b.f.s;
import com.ironsource.b.k;

/* compiled from: IronSourceAds.java */
/* loaded from: classes2.dex */
public class a extends com.dancingbogo.skyrolline.ad.a.a {

    /* renamed from: c, reason: collision with root package name */
    private static a f4525c;

    /* renamed from: a, reason: collision with root package name */
    private final String f4526a = "IronSourceAds";

    /* renamed from: b, reason: collision with root package name */
    private final String f4527b = "47fd8d3d";

    /* renamed from: d, reason: collision with root package name */
    private b f4528d;

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f4525c == null) {
                synchronized (a.class) {
                    if (f4525c == null) {
                        f4525c = new a();
                    }
                }
            }
            aVar = f4525c;
        }
        return aVar;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onCreate(Activity activity) {
        super.onCreate(activity);
        this.mContext = activity.getApplicationContext();
        this.isRewardedVideoAdLoaded = false;
        k.a(activity, "47fd8d3d", k.a.REWARDED_VIDEO);
        k.a(new s() { // from class: com.dancingbogo.skyrolline.ad.c.f.a.1
            @Override // com.ironsource.b.f.s
            public void c() {
                com.dancingbogo.skyrolline.util.b.b("IronSourceAds", "onRewardedVideoAdOpened");
            }

            @Override // com.ironsource.b.f.s
            public void d() {
                com.dancingbogo.skyrolline.util.b.b("IronSourceAds", "onRewardedVideoAdClosed");
                if (a.this.f4528d != null) {
                    a.this.f4528d.a(false);
                }
                a.this.ReportMagicCtrlAd(4, 5, a.this.mSceneOfRewardedVideoAd, 7, 4, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
            }

            @Override // com.ironsource.b.f.s
            public void b(boolean z) {
                com.dancingbogo.skyrolline.util.b.b("IronSourceAds", "onRewardedVideoAvailabilityChanged    available:" + z);
                a.this.isRewardedVideoAdLoading = false;
                if (k.a()) {
                    a.this.isRewardedVideoAdLoaded = true;
                    a.this.ReportMagicCtrlAd(4, 5, 0, 103, 4, true, 0, false, 0, 0, 0);
                }
            }

            @Override // com.ironsource.b.f.s
            public void a(com.ironsource.b.e.k kVar) {
                com.dancingbogo.skyrolline.util.b.b("IronSourceAds", "onRewardedVideoAdRewarded");
                a.this.ReportMagicCtrlAd(4, 5, a.this.mSceneOfRewardedVideoAd, 4, 4, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
            }

            @Override // com.ironsource.b.f.s
            public void d(com.ironsource.b.d.b bVar) {
                com.dancingbogo.skyrolline.util.b.b("IronSourceAds", "onRewardedVideoAdShowFailed");
                new d().a(2, 3, 0, 6, 99);
                a.this.ReportMagicCtrlAd(4, 5, a.this.mSceneOfRewardedVideoAd, 10, 4, true, 4, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
            }

            @Override // com.ironsource.b.f.s
            public void b(com.ironsource.b.e.k kVar) {
                com.dancingbogo.skyrolline.util.b.b("IronSourceAds", "onRewardedVideoAdClicked");
                a.this.ReportMagicCtrlAd(4, 5, a.this.mSceneOfRewardedVideoAd, 2, 4, true, 0, false, 0, 0, a.this.mIsTryOfRewardedVideoAd);
            }
        });
        new d().a(2, 1, 0, 6, 99);
        ReportMagicCtrlAd(4, 5, 0, 101, 4, true, 0, false, 0, 0, 0);
        this.lastCallRequestRVTime = getTimeStampMilliSec();
        this.requestRVTime = getTimeStampMilliSec();
        ReportMagicCtrlAd(4, 5, 0, 8, 4, true, 0, false, 0, 0, 0);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onResume(Activity activity) {
        k.a(activity);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void onPaused(Activity activity) {
        k.b(activity);
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean canShow(int i) {
        boolean a2 = k.a();
        com.dancingbogo.skyrolline.util.b.b("IronSourceAds", "canShow = " + a2);
        return a2;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public boolean show(int i) {
        this.mSceneOfRewardedVideoAd = i;
        boolean z = false;
        this.mIsTryOfRewardedVideoAd = 0;
        ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 102, 4, true, 0, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        this.lastCallShowRVTime = getTimeStampMilliSec();
        if (k.a()) {
            k.b("New_video_20180103");
            com.dancingbogo.skyrolline.util.b.b("IronSourceAds", "show  IronSource.showRewardedVideo");
            z = true;
        }
        if (!z) {
            ReportMagicCtrlAd(4, 5, this.mSceneOfRewardedVideoAd, 10, 4, true, 4 == com.cmplay.base.util.s.a(this.mContext) ? 2 : 1, false, 0, 0, this.mIsTryOfRewardedVideoAd);
        }
        return z;
    }

    @Override // com.dancingbogo.skyrolline.ad.a.a, com.dancingbogo.skyrolline.ad.a.c
    public void setListener(b bVar) {
        this.f4528d = bVar;
    }
}
