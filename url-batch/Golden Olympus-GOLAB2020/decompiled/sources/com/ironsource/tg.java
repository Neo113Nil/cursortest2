package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;

/* loaded from: classes2.dex */
public class tg extends t7 {

    /* renamed from: d, reason: collision with root package name */
    private static final tg f19755d = new tg();

    /* renamed from: b, reason: collision with root package name */
    private LevelPlayInterstitialListener f19756b = null;

    /* renamed from: c, reason: collision with root package name */
    private LevelPlayInterstitialListener f19757c = null;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19758a;

        a(AdInfo adInfo) {
            this.f19758a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19756b != null) {
                tg.this.f19756b.onAdShowSucceeded(tg.this.a(this.f19758a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + tg.this.a(this.f19758a));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f19760a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f19761b;

        b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f19760a = ironSourceError;
            this.f19761b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19757c != null) {
                tg.this.f19757c.onAdShowFailed(this.f19760a, tg.this.a(this.f19761b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + tg.this.a(this.f19761b) + ", error = " + this.f19760a.getErrorMessage());
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f19763a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f19764b;

        c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f19763a = ironSourceError;
            this.f19764b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19756b != null) {
                tg.this.f19756b.onAdShowFailed(this.f19763a, tg.this.a(this.f19764b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + tg.this.a(this.f19764b) + ", error = " + this.f19763a.getErrorMessage());
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19766a;

        d(AdInfo adInfo) {
            this.f19766a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19757c != null) {
                tg.this.f19757c.onAdClicked(tg.this.a(this.f19766a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + tg.this.a(this.f19766a));
            }
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19768a;

        e(AdInfo adInfo) {
            this.f19768a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19756b != null) {
                tg.this.f19756b.onAdClicked(tg.this.a(this.f19768a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + tg.this.a(this.f19768a));
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19770a;

        f(AdInfo adInfo) {
            this.f19770a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19757c != null) {
                tg.this.f19757c.onAdReady(tg.this.a(this.f19770a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + tg.this.a(this.f19770a));
            }
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19772a;

        g(AdInfo adInfo) {
            this.f19772a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19756b != null) {
                tg.this.f19756b.onAdReady(tg.this.a(this.f19772a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + tg.this.a(this.f19772a));
            }
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f19774a;

        h(IronSourceError ironSourceError) {
            this.f19774a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19757c != null) {
                tg.this.f19757c.onAdLoadFailed(this.f19774a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f19774a.getErrorMessage());
            }
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f19776a;

        i(IronSourceError ironSourceError) {
            this.f19776a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19756b != null) {
                tg.this.f19756b.onAdLoadFailed(this.f19776a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f19776a.getErrorMessage());
            }
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19778a;

        j(AdInfo adInfo) {
            this.f19778a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19757c != null) {
                tg.this.f19757c.onAdOpened(tg.this.a(this.f19778a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + tg.this.a(this.f19778a));
            }
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19780a;

        k(AdInfo adInfo) {
            this.f19780a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19756b != null) {
                tg.this.f19756b.onAdOpened(tg.this.a(this.f19780a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + tg.this.a(this.f19780a));
            }
        }
    }

    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19782a;

        l(AdInfo adInfo) {
            this.f19782a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19757c != null) {
                tg.this.f19757c.onAdClosed(tg.this.a(this.f19782a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + tg.this.a(this.f19782a));
            }
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19784a;

        m(AdInfo adInfo) {
            this.f19784a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19756b != null) {
                tg.this.f19756b.onAdClosed(tg.this.a(this.f19784a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + tg.this.a(this.f19784a));
            }
        }
    }

    class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f19786a;

        n(AdInfo adInfo) {
            this.f19786a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tg.this.f19757c != null) {
                tg.this.f19757c.onAdShowSucceeded(tg.this.a(this.f19786a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + tg.this.a(this.f19786a));
            }
        }
    }

    private tg() {
    }

    public void c(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable mVar;
        if (this.f19757c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            mVar = new l(adInfo);
        } else {
            if (this.f19756b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            mVar = new m(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(mVar);
    }

    public void d(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable kVar;
        if (this.f19757c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new j(adInfo);
        } else {
            if (this.f19756b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new k(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(kVar);
    }

    public void e(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable gVar;
        if (this.f19757c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new f(adInfo);
        } else {
            if (this.f19756b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new g(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(gVar);
    }

    public void f(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable aVar;
        if (this.f19757c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new n(adInfo);
        } else {
            if (this.f19756b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new a(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(aVar);
    }

    public static synchronized tg a() {
        tg tgVar;
        synchronized (tg.class) {
            tgVar = f19755d;
        }
        return tgVar;
    }

    public void b(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable eVar;
        if (this.f19757c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new d(adInfo);
        } else {
            if (this.f19756b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new e(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(eVar);
    }

    public void a(IronSourceError ironSourceError) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable iVar;
        if (this.f19757c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new h(ironSourceError);
        } else {
            if (this.f19756b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new i(ironSourceError);
        }
        ironSourceThreadManager.postOnUiThreadTask(iVar);
    }

    public synchronized void b(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f19757c = levelPlayInterstitialListener;
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable cVar;
        if (this.f19757c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new b(ironSourceError, adInfo);
        } else {
            if (this.f19756b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new c(ironSourceError, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(cVar);
    }

    public synchronized void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f19756b = levelPlayInterstitialListener;
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
