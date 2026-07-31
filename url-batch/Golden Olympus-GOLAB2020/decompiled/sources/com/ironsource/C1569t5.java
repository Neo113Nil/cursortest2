package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* renamed from: com.ironsource.t5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1569t5 extends t7 {

    /* renamed from: d, reason: collision with root package name */
    private static final C1569t5 f19696d = new C1569t5();

    /* renamed from: b, reason: collision with root package name */
    private LevelPlayBannerListener f19697b = null;

    /* renamed from: c, reason: collision with root package name */
    private LevelPlayBannerListener f19698c = null;

    /* renamed from: com.ironsource.t5$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19699a;

        a(AdInfo adInfo) {
            this.f19699a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1569t5.this.f19697b != null) {
                C1569t5.this.f19697b.onAdLeftApplication(C1569t5.this.a(this.f19699a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C1569t5.this.a(this.f19699a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19701a;

        b(AdInfo adInfo) {
            this.f19701a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1569t5.this.f19698c != null) {
                C1569t5.this.f19698c.onAdClicked(C1569t5.this.a(this.f19701a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C1569t5.this.a(this.f19701a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$c */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19703a;

        c(AdInfo adInfo) {
            this.f19703a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1569t5.this.f19697b != null) {
                C1569t5.this.f19697b.onAdClicked(C1569t5.this.a(this.f19703a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C1569t5.this.a(this.f19703a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$d */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19705a;

        d(AdInfo adInfo) {
            this.f19705a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1569t5.this.f19698c != null) {
                C1569t5.this.f19698c.onAdLoaded(C1569t5.this.a(this.f19705a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C1569t5.this.a(this.f19705a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$e */
    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19707a;

        e(AdInfo adInfo) {
            this.f19707a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1569t5.this.f19697b != null) {
                C1569t5.this.f19697b.onAdLoaded(C1569t5.this.a(this.f19707a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C1569t5.this.a(this.f19707a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$f */
    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f19709a;

        f(IronSourceError ironSourceError) {
            this.f19709a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1569t5.this.f19698c != null) {
                C1569t5.this.f19698c.onAdLoadFailed(this.f19709a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f19709a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.t5$g */
    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f19711a;

        g(IronSourceError ironSourceError) {
            this.f19711a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1569t5.this.f19697b != null) {
                C1569t5.this.f19697b.onAdLoadFailed(this.f19711a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f19711a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.t5$h */
    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19713a;

        h(AdInfo adInfo) {
            this.f19713a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1569t5.this.f19698c != null) {
                C1569t5.this.f19698c.onAdScreenPresented(C1569t5.this.a(this.f19713a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C1569t5.this.a(this.f19713a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$i */
    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19715a;

        i(AdInfo adInfo) {
            this.f19715a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1569t5.this.f19697b != null) {
                C1569t5.this.f19697b.onAdScreenPresented(C1569t5.this.a(this.f19715a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C1569t5.this.a(this.f19715a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$j */
    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19717a;

        j(AdInfo adInfo) {
            this.f19717a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1569t5.this.f19698c != null) {
                C1569t5.this.f19698c.onAdScreenDismissed(C1569t5.this.a(this.f19717a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C1569t5.this.a(this.f19717a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$k */
    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19719a;

        k(AdInfo adInfo) {
            this.f19719a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1569t5.this.f19697b != null) {
                C1569t5.this.f19697b.onAdScreenDismissed(C1569t5.this.a(this.f19719a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C1569t5.this.a(this.f19719a));
            }
        }
    }

    /* renamed from: com.ironsource.t5$l */
    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19721a;

        l(AdInfo adInfo) {
            this.f19721a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1569t5.this.f19698c != null) {
                C1569t5.this.f19698c.onAdLeftApplication(C1569t5.this.a(this.f19721a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C1569t5.this.a(this.f19721a));
            }
        }
    }

    private C1569t5() {
    }

    public LevelPlayBannerListener b() {
        return this.f19697b;
    }

    public void c(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable aVar;
        if (this.f19698c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new l(adInfo);
        } else {
            if (this.f19697b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new a(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(aVar);
    }

    public void d(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable eVar;
        if (this.f19698c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new d(adInfo);
        } else {
            if (this.f19697b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new e(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(eVar);
    }

    public void e(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable kVar;
        if (this.f19698c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new j(adInfo);
        } else {
            if (this.f19697b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new k(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(kVar);
    }

    public void f(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable iVar;
        if (this.f19698c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new h(adInfo);
        } else {
            if (this.f19697b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new i(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(iVar);
    }

    public static C1569t5 a() {
        return f19696d;
    }

    public void a(IronSourceError ironSourceError) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable gVar;
        if (this.f19698c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new f(ironSourceError);
        } else {
            if (this.f19697b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new g(ironSourceError);
        }
        ironSourceThreadManager.postOnUiThreadTask(gVar);
    }

    public void b(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable cVar;
        if (this.f19698c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new b(adInfo);
        } else {
            if (this.f19697b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new c(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(cVar);
    }

    public void a(LevelPlayBannerListener levelPlayBannerListener) {
        this.f19697b = levelPlayBannerListener;
    }

    public void b(LevelPlayBannerListener levelPlayBannerListener) {
        this.f19698c = levelPlayBannerListener;
    }
}
