package com.applovin.impl.sdk.a;

import android.app.Activity;
import android.content.Context;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.g;
import com.applovin.impl.sdk.ad.h;
import com.applovin.impl.sdk.d.ab;
import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.d.x;
import com.applovin.impl.sdk.e.i;
import com.applovin.impl.sdk.e.l;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected final j f2899a;

    /* renamed from: b, reason: collision with root package name */
    protected final AppLovinAdServiceImpl f2900b;

    /* renamed from: c, reason: collision with root package name */
    private AppLovinAd f2901c;

    /* renamed from: d, reason: collision with root package name */
    private String f2902d;
    private SoftReference<AppLovinAdLoadListener> e;
    private volatile String g;
    private ab h;
    private SoftReference<AppLovinInterstitialAdDialog> j;
    private final Object f = new Object();
    private volatile boolean i = false;

    /* renamed from: com.applovin.impl.sdk.a.a$a, reason: collision with other inner class name */
    private class C0306a implements AppLovinAdLoadListener {

        /* renamed from: b, reason: collision with root package name */
        private final AppLovinAdLoadListener f2909b;

        C0306a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f2909b = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            a.this.f2901c = appLovinAd;
            if (this.f2909b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0306a.this.f2909b.adReceived(appLovinAd);
                        } catch (Throwable th) {
                            a.this.f2899a.u().c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                        }
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i) {
            if (this.f2909b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.a.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0306a.this.f2909b.failedToReceiveAd(i);
                        } catch (Throwable th) {
                            a.this.f2899a.u().c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                        }
                    }
                });
            }
        }
    }

    private class b implements AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {

        /* renamed from: b, reason: collision with root package name */
        private final Context f2915b;

        /* renamed from: c, reason: collision with root package name */
        private final AppLovinAdDisplayListener f2916c;

        /* renamed from: d, reason: collision with root package name */
        private final AppLovinAdClickListener f2917d;
        private final AppLovinAdVideoPlaybackListener e;
        private final AppLovinAdRewardListener f;

        private b(Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f2916c = appLovinAdDisplayListener;
            this.f2917d = appLovinAdClickListener;
            this.e = appLovinAdVideoPlaybackListener;
            this.f = appLovinAdRewardListener;
            this.f2915b = context;
        }

        private void a(g gVar) {
            String str;
            int i;
            String e = a.this.e();
            if (i.b(e) && a.this.i) {
                a.this.a(e, this.f2915b);
            } else {
                a.this.h.a(true);
                if (a.this.i) {
                    str = "network_timeout";
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    str = "user_closed_video";
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                e.a().a(gVar, str);
                if (a.this.i) {
                    a.this.a(e, this.f2915b);
                }
                com.applovin.impl.sdk.e.g.a(this.f, gVar, i, a.this.f2899a);
            }
            a.this.a(gVar);
            com.applovin.impl.sdk.e.g.b(this.f2916c, gVar, a.this.f2899a);
            if (gVar.ad().getAndSet(true)) {
                return;
            }
            a.this.f2899a.C().a(new x(gVar, a.this.f2899a), q.a.REWARD);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.e.g.a(this.f2917d, appLovinAd, a.this.f2899a);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.e.g.a(this.f2916c, appLovinAd, a.this.f2899a);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (appLovinAd instanceof h) {
                appLovinAd = ((h) appLovinAd).a();
            }
            if (appLovinAd instanceof g) {
                a((g) appLovinAd);
                return;
            }
            a.this.f2899a.u().d("IncentivizedAdController", "Something is terribly wrong. Received `adHidden` callback for invalid ad of type: " + appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userDeclinedToViewAd(AppLovinAd appLovinAd) {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("quota_exceeded");
            com.applovin.impl.sdk.e.g.b(this.f, appLovinAd, map, a.this.f2899a);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("rejected");
            com.applovin.impl.sdk.e.g.c(this.f, appLovinAd, map, a.this.f2899a);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("accepted");
            com.applovin.impl.sdk.e.g.a(this.f, appLovinAd, map, a.this.f2899a);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            a.this.a("network_timeout");
            com.applovin.impl.sdk.e.g.a(this.f, appLovinAd, i, a.this.f2899a);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.e.g.a(this.e, appLovinAd, a.this.f2899a);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z) {
            com.applovin.impl.sdk.e.g.a(this.e, appLovinAd, d2, z, a.this.f2899a);
            a.this.i = z;
        }
    }

    public a(String str, AppLovinSdk appLovinSdk) {
        this.f2899a = l.a(appLovinSdk);
        this.f2900b = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f2902d = str;
    }

    private void a(final AppLovinAdBase appLovinAdBase, final String str, final Context context, final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAdClickListener appLovinAdClickListener) {
        p u;
        String str2;
        String str3;
        if (appLovinAdBase.getType().equals(AppLovinAdType.INCENTIVIZED)) {
            if (!l.a(appLovinAdBase, this.f2899a)) {
                a(appLovinAdBase, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
                return;
            }
            g gVar = appLovinAdBase instanceof h ? (g) this.f2899a.L().c(appLovinAdBase.getAdZone()) : (g) appLovinAdBase;
            if (!l.a(gVar, context, this.f2899a)) {
                this.f2899a.D().a(com.applovin.impl.sdk.c.g.o);
                if (gVar instanceof com.applovin.impl.sdk.ad.a) {
                    com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) gVar;
                    if (!aVar.ag() || !aVar.d()) {
                        this.f2899a.u().d("IncentivizedAdController", "Cached video removed from local filesystem for ad server ad: " + aVar.getAdIdNumber() + " and could not restore video stream url. Failing ad show.");
                        a(appLovinAdBase, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
                    }
                    this.f2899a.u().d("IncentivizedAdController", "Cached video removed from local filesystem for ad server ad. Restored video uri to video stream url: " + aVar.e());
                } else {
                    u = this.f2899a.u();
                    str2 = "IncentivizedAdController";
                    str3 = "Failed to render an ad: video cache has been removed.";
                }
            }
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    AppLovinAd b2 = l.b(appLovinAdBase, a.this.f2899a);
                    if (b2 == null) {
                        a.this.a(appLovinAdBase, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
                        return;
                    }
                    AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(a.this.f2899a.K(), context);
                    b bVar = new b(context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
                    create.setAdDisplayListener(bVar);
                    create.setAdVideoPlaybackListener(bVar);
                    create.setAdClickListener(bVar);
                    create.showAndRender(b2, str);
                    a.this.j = new SoftReference(create);
                    if (b2 instanceof g) {
                        a.this.a((g) b2, (AppLovinAdRewardListener) bVar);
                    }
                }
            };
            boolean booleanValue = ((Boolean) this.f2899a.a(com.applovin.impl.sdk.b.b.bR)).booleanValue();
            if (booleanValue && (context instanceof Activity)) {
                Activity activity = (Activity) context;
                if (!activity.isFinishing()) {
                    c.a().a(this.f2899a).a(activity).a(this).a(appLovinAdRewardListener).a(runnable).a().a(appLovinAdBase);
                    return;
                }
            }
            if (booleanValue) {
                this.f2899a.u().e("IncentivizedAdController", "Unable to show Incentivized Ad prompt. Must pass in an active Activity context.");
            }
            this.f2899a.D().a(com.applovin.impl.sdk.c.g.j);
            runnable.run();
            return;
        }
        u = this.f2899a.u();
        str2 = "IncentivizedAdController";
        str3 = "Failed to render an ad of type " + appLovinAdBase.getType() + " in an Incentivized Ad interstitial.";
        u.d(str2, str3);
        a(appLovinAdBase, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(g gVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.h = new ab(gVar, appLovinAdRewardListener, this.f2899a);
        this.f2899a.C().a(this.h, q.a.REWARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        if (this.f2901c != null) {
            if (this.f2901c instanceof h) {
                if (appLovinAd != ((h) this.f2901c).a()) {
                    return;
                }
            } else if (appLovinAd != this.f2901c) {
                return;
            }
            this.f2901c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f2899a.D().a(com.applovin.impl.sdk.c.g.m);
        com.applovin.impl.sdk.e.g.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false, this.f2899a);
        com.applovin.impl.sdk.e.g.b(appLovinAdDisplayListener, appLovinAd, this.f2899a);
    }

    private void a(AppLovinAd appLovinAd, String str, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAd == null) {
            appLovinAd = this.f2901c;
        }
        AppLovinAdBase appLovinAdBase = (AppLovinAdBase) appLovinAd;
        if (appLovinAdBase != null) {
            a(appLovinAdBase, str, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            this.f2899a.u().e("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f) {
            this.g = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Context context) {
        if (str == null || !((Boolean) this.f2899a.a(com.applovin.impl.sdk.b.b.bS)).booleanValue()) {
            return;
        }
        new com.applovin.impl.sdk.a.b(this.f2899a, context, str).a();
    }

    private void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2900b.loadNextIncentivizedAd(this.f2902d, appLovinAdLoadListener);
    }

    private void d() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        if (this.e == null || (appLovinAdLoadListener = this.e.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() {
        String str;
        synchronized (this.f) {
            str = this.g;
        }
        return str;
    }

    private AppLovinAdRewardListener f() {
        return new AppLovinAdRewardListener() { // from class: com.applovin.impl.sdk.a.a.2
            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userDeclinedToViewAd(AppLovinAd appLovinAd) {
                a.this.f2899a.u().a("IncentivizedAdController", "User declined to view");
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.f2899a.u().a("IncentivizedAdController", "User over quota: " + map);
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.f2899a.u().a("IncentivizedAdController", "Reward rejected: " + map);
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.f2899a.u().a("IncentivizedAdController", "Reward validated: " + map);
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
                a.this.f2899a.u().a("IncentivizedAdController", "Reward validation failed: " + i);
            }
        };
    }

    public void a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = f();
        }
        a(appLovinAd, str, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    void a(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener) {
        com.applovin.impl.sdk.e.g.a(appLovinAdRewardListener, appLovinAd, this.f2899a);
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2899a.u().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        this.e = new SoftReference<>(appLovinAdLoadListener);
        if (!a()) {
            b(new C0306a(appLovinAdLoadListener));
            return;
        }
        this.f2899a.u().e("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f2901c);
        }
    }

    public boolean a() {
        return this.f2901c != null;
    }

    public String b() {
        return this.f2902d;
    }

    public void c() {
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialog;
        if (this.j == null || (appLovinInterstitialAdDialog = this.j.get()) == null) {
            return;
        }
        appLovinInterstitialAdDialog.dismiss();
    }
}
