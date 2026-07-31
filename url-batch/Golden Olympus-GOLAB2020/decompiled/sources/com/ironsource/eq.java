package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;

/* loaded from: classes2.dex */
public class eq extends t7 {

    /* renamed from: d, reason: collision with root package name */
    private static final eq f16128d = new eq();

    /* renamed from: b, reason: collision with root package name */
    private LevelPlayRewardedVideoBaseListener f16129b = null;

    /* renamed from: c, reason: collision with root package name */
    private LevelPlayRewardedVideoBaseListener f16130c = null;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16131a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f16132b;

        a(boolean z4, AdInfo adInfo) {
            this.f16131a = z4;
            this.f16132b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog ironLog;
            String str;
            if (eq.this.f16129b != null) {
                if (this.f16131a) {
                    ((LevelPlayRewardedVideoListener) eq.this.f16129b).onAdAvailable(eq.this.a(this.f16132b));
                    ironLog = IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + eq.this.a(this.f16132b);
                } else {
                    ((LevelPlayRewardedVideoListener) eq.this.f16129b).onAdUnavailable();
                    ironLog = IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f16134a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f16135b;

        b(Placement placement, AdInfo adInfo) {
            this.f16134a = placement;
            this.f16135b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16130c != null) {
                eq.this.f16130c.onAdRewarded(this.f16134a, eq.this.a(this.f16135b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f16134a + ", adInfo = " + eq.this.a(this.f16135b));
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f16137a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f16138b;

        c(Placement placement, AdInfo adInfo) {
            this.f16137a = placement;
            this.f16138b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16129b != null) {
                eq.this.f16129b.onAdRewarded(this.f16137a, eq.this.a(this.f16138b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.f16137a + ", adInfo = " + eq.this.a(this.f16138b));
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f16140a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f16141b;

        d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f16140a = ironSourceError;
            this.f16141b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16130c != null) {
                eq.this.f16130c.onAdShowFailed(this.f16140a, eq.this.a(this.f16141b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + eq.this.a(this.f16141b) + ", error = " + this.f16140a.getErrorMessage());
            }
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f16143a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f16144b;

        e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f16143a = ironSourceError;
            this.f16144b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16129b != null) {
                eq.this.f16129b.onAdShowFailed(this.f16143a, eq.this.a(this.f16144b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + eq.this.a(this.f16144b) + ", error = " + this.f16143a.getErrorMessage());
            }
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f16146a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f16147b;

        f(Placement placement, AdInfo adInfo) {
            this.f16146a = placement;
            this.f16147b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16130c != null) {
                eq.this.f16130c.onAdClicked(this.f16146a, eq.this.a(this.f16147b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f16146a + ", adInfo = " + eq.this.a(this.f16147b));
            }
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Placement f16149a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f16150b;

        g(Placement placement, AdInfo adInfo) {
            this.f16149a = placement;
            this.f16150b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16129b != null) {
                eq.this.f16129b.onAdClicked(this.f16149a, eq.this.a(this.f16150b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.f16149a + ", adInfo = " + eq.this.a(this.f16150b));
            }
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f16152a;

        h(AdInfo adInfo) {
            this.f16152a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16130c != null) {
                ((LevelPlayRewardedVideoManualListener) eq.this.f16130c).onAdReady(eq.this.a(this.f16152a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + eq.this.a(this.f16152a));
            }
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f16154a;

        i(AdInfo adInfo) {
            this.f16154a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16129b != null) {
                ((LevelPlayRewardedVideoManualListener) eq.this.f16129b).onAdReady(eq.this.a(this.f16154a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + eq.this.a(this.f16154a));
            }
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f16156a;

        j(IronSourceError ironSourceError) {
            this.f16156a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16130c != null) {
                ((LevelPlayRewardedVideoManualListener) eq.this.f16130c).onAdLoadFailed(this.f16156a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f16156a.getErrorMessage());
            }
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSourceError f16158a;

        k(IronSourceError ironSourceError) {
            this.f16158a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16129b != null) {
                ((LevelPlayRewardedVideoManualListener) eq.this.f16129b).onAdLoadFailed(this.f16158a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.f16158a.getErrorMessage());
            }
        }
    }

    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f16160a;

        l(AdInfo adInfo) {
            this.f16160a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16130c != null) {
                eq.this.f16130c.onAdOpened(eq.this.a(this.f16160a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + eq.this.a(this.f16160a));
            }
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f16162a;

        m(AdInfo adInfo) {
            this.f16162a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16129b != null) {
                eq.this.f16129b.onAdOpened(eq.this.a(this.f16162a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + eq.this.a(this.f16162a));
            }
        }
    }

    class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f16164a;

        n(AdInfo adInfo) {
            this.f16164a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16130c != null) {
                eq.this.f16130c.onAdClosed(eq.this.a(this.f16164a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + eq.this.a(this.f16164a));
            }
        }
    }

    class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdInfo f16166a;

        o(AdInfo adInfo) {
            this.f16166a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (eq.this.f16129b != null) {
                eq.this.f16129b.onAdClosed(eq.this.a(this.f16166a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + eq.this.a(this.f16166a));
            }
        }
    }

    class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16168a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdInfo f16169b;

        p(boolean z4, AdInfo adInfo) {
            this.f16168a = z4;
            this.f16169b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog ironLog;
            String str;
            if (eq.this.f16130c != null) {
                if (this.f16168a) {
                    ((LevelPlayRewardedVideoListener) eq.this.f16130c).onAdAvailable(eq.this.a(this.f16169b));
                    ironLog = IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + eq.this.a(this.f16169b);
                } else {
                    ((LevelPlayRewardedVideoListener) eq.this.f16130c).onAdUnavailable();
                    ironLog = IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    private eq() {
    }

    public static eq a() {
        return f16128d;
    }

    public void c() {
    }

    public void d(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable iVar;
        if (this.f16130c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new h(adInfo);
        } else {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f16129b;
            if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            iVar = new i(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(iVar);
    }

    public void b() {
    }

    public void c(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable mVar;
        if (this.f16130c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            mVar = new l(adInfo);
        } else {
            if (this.f16129b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            mVar = new m(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(mVar);
    }

    public void a(IronSourceError ironSourceError) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable kVar;
        if (this.f16130c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new j(ironSourceError);
        } else {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f16129b;
            if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            kVar = new k(ironSourceError);
        }
        ironSourceThreadManager.postOnUiThreadTask(kVar);
    }

    public void b(AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable oVar;
        if (this.f16130c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            oVar = new n(adInfo);
        } else {
            if (this.f16129b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            oVar = new o(adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(oVar);
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable eVar;
        if (this.f16130c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new d(ironSourceError, adInfo);
        } else {
            if (this.f16129b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            eVar = new e(ironSourceError, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(eVar);
    }

    public void b(Placement placement, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable cVar;
        if (this.f16130c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new b(placement, adInfo);
        } else {
            if (this.f16129b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            cVar = new c(placement, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(cVar);
    }

    public void a(Placement placement, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable gVar;
        if (this.f16130c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new f(placement, adInfo);
        } else {
            if (this.f16129b == null) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            gVar = new g(placement, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(gVar);
    }

    public void b(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.f16130c = levelPlayRewardedVideoBaseListener;
    }

    public void a(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.f16129b = levelPlayRewardedVideoBaseListener;
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public void a(boolean z4, AdInfo adInfo) {
        IronSourceThreadManager ironSourceThreadManager;
        Runnable aVar;
        if (this.f16130c != null) {
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new p(z4, adInfo);
        } else {
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f16129b;
            if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoListener)) {
                return;
            }
            ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
            aVar = new a(z4, adInfo);
        }
        ironSourceThreadManager.postOnUiThreadTask(aVar);
    }
}
