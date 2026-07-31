package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.e;
import com.applovin.impl.d6;
import com.applovin.impl.h0;
import com.applovin.impl.o0;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.w1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class w1 implements AppLovinBroadcastManager.Receiver, a.b {
    protected int A;
    protected boolean B;
    private ContentObserver C;
    private Float D;
    protected AppLovinAdClickListener E;
    protected AppLovinAdDisplayListener F;
    protected AppLovinAdVideoPlaybackListener G;
    protected g7 H;
    protected g7 I;
    protected boolean J;
    private final h0 K;
    private boolean L;
    protected final com.applovin.impl.sdk.ad.b a;
    protected final com.applovin.impl.sdk.k b;
    protected final com.applovin.impl.sdk.o c;
    protected Activity d;
    private final int e;
    private final Handler f;
    private final com.applovin.impl.b g;
    private final i.a h;
    private AppLovinAdView i;
    protected com.applovin.impl.adview.k j;
    protected final com.applovin.impl.adview.g k;
    protected final com.applovin.impl.adview.g l;
    protected final long m;
    private final AtomicBoolean n;
    private final AtomicBoolean o;
    private boolean p;
    protected long q;
    protected long r;
    private boolean s;
    protected boolean t;
    protected int u;
    protected boolean v;
    private int w;
    private final ArrayList x;
    protected int y;
    protected int z;

    class a implements AppLovinAdDisplayListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            w1.this.a("web_view");
        }
    }

    class b implements i.a {
        b() {
        }

        @Override // com.applovin.impl.sdk.i.a
        public void a(int i) {
            w1 w1Var = w1.this;
            if (w1Var.A != com.applovin.impl.sdk.i.h) {
                w1Var.B = true;
            }
            com.applovin.impl.adview.b f = w1Var.i.getController().f();
            if (f == null) {
                com.applovin.impl.sdk.o oVar = w1.this.c;
                if (com.applovin.impl.sdk.o.a()) {
                    w1.this.c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.i.a(i) && !com.applovin.impl.sdk.i.a(w1.this.A)) {
                f.a("javascript:al_muteSwitchOn();");
            } else if (i == 2) {
                f.a("javascript:al_muteSwitchOff();");
            }
            w1.this.A = i;
        }
    }

    class c extends com.applovin.impl.b {
        final /* synthetic */ com.applovin.impl.sdk.k a;

        c(com.applovin.impl.sdk.k kVar) {
            this.a = kVar;
        }

        private boolean a(Activity activity) {
            return activity.getClass().getName().equals(n7.a(activity.getApplicationContext(), "AppLovinFullscreenActivity", this.a));
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!w1.this.z() && a(activity)) {
                w1.this.d();
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (w1.this.z() && a(activity)) {
                w1.this.d();
            }
        }
    }

    class d extends ContentObserver {
        final /* synthetic */ com.applovin.impl.sdk.k a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Handler handler, com.applovin.impl.sdk.k kVar) {
            super(handler);
            this.a = kVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Float b = this.a.p().b();
            if (b == null || w1.this.D == null || b.equals(w1.this.D)) {
                return;
            }
            String str = b.floatValue() > w1.this.D.floatValue() ? "volume_up" : "volume_down";
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putDouble(jSONObject, "volume", b.floatValue());
            w1.this.e("javascript:al_onVolumeChangedEvent('" + str + "'," + jSONObject + ");");
            w1.this.D = b;
        }
    }

    class e extends com.applovin.impl.b {
        final /* synthetic */ s4 a;

        e(s4 s4Var) {
            this.a = s4Var;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof AppLovinFullscreenActivity) {
                this.a.b(null);
                w1.this.b.e().b(this);
            }
        }
    }

    public interface g {
        void a(w1 w1Var);

        void a(String str, Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h implements AppLovinAdClickListener, View.OnClickListener {
        private h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            w1.this.q = SystemClock.elapsedRealtime();
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            t2.a(w1.this.E, appLovinAd);
            w1.this.z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w1 w1Var = w1.this;
            if (view != w1Var.k || !((Boolean) w1Var.b.a(x4.X1)).booleanValue()) {
                com.applovin.impl.sdk.o oVar = w1.this.c;
                if (com.applovin.impl.sdk.o.a()) {
                    w1.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            w1.f(w1.this);
            if (w1.this.a.O0()) {
                w1.this.e("javascript:al_onCloseButtonTapped(" + w1.this.w + StringUtils.COMMA + w1.this.y + StringUtils.COMMA + w1.this.z + ");");
            }
            List F = w1.this.a.F();
            com.applovin.impl.sdk.o oVar2 = w1.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.c.a("AppLovinFullscreenActivity", "Handling close button tap " + w1.this.w + " with multi close delay: " + F);
            }
            if (F == null || F.size() <= w1.this.w) {
                w1.this.a("native_close_button");
                return;
            }
            w1.this.x.add(Long.valueOf(SystemClock.elapsedRealtime() - w1.this.q));
            List D = w1.this.a.D();
            if (D != null && D.size() > w1.this.w) {
                w1 w1Var2 = w1.this;
                w1Var2.k.a((e.a) D.get(w1Var2.w));
            }
            com.applovin.impl.sdk.o oVar3 = w1.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + F.get(w1.this.w));
            }
            w1.this.k.setVisibility(8);
            w1 w1Var3 = w1.this;
            w1Var3.a(w1Var3.k, ((Integer) F.get(w1Var3.w)).intValue(), new Runnable() { // from class: com.applovin.impl.w1$h$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    w1.h.this.a();
                }
            });
        }

        /* synthetic */ h(w1 w1Var, a aVar) {
            this();
        }
    }

    w1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f = handler;
        this.m = SystemClock.elapsedRealtime();
        this.n = new AtomicBoolean();
        this.o = new AtomicBoolean();
        this.q = -1L;
        this.w = 0;
        this.x = new ArrayList();
        this.y = 0;
        this.z = 0;
        this.A = com.applovin.impl.sdk.i.h;
        this.L = false;
        this.a = bVar;
        this.b = kVar;
        this.c = kVar.O();
        this.d = activity;
        this.e = bVar.R();
        this.E = appLovinAdClickListener;
        this.F = appLovinAdDisplayListener;
        this.G = appLovinAdVideoPlaybackListener;
        this.K = new h0(kVar);
        h hVar = new h(this, null);
        if (((Boolean) kVar.a(x4.n2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) kVar.a(x4.t2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
        u1 u1Var = new u1(kVar.y0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.i = u1Var;
        u1Var.setAdClickListener(hVar);
        this.i.setAdDisplayListener(new a());
        bVar.h().putString("ad_view_address", e8.a(this.i));
        this.i.getController().a(this);
        c2 c2Var = new c2(map, kVar);
        if (c2Var.c()) {
            this.j = new com.applovin.impl.adview.k(c2Var, activity);
        }
        kVar.k().trackImpression(bVar);
        List F = bVar.F();
        if (bVar.r() >= 0 || F != null) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.p(), activity);
            this.k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(hVar);
        } else {
            this.k = null;
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.l = gVar2;
        gVar2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.w1$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w1.this.a(view);
            }
        });
        if (bVar.V0()) {
            this.h = new b();
        } else {
            this.h = null;
        }
        this.g = new c(kVar);
        if (bVar.R0()) {
            this.D = kVar.p().b();
            this.C = new d(handler, kVar);
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build(), false, this.C);
        }
    }

    private void B() {
        if (this.h != null) {
            this.b.p().a(this.h);
        }
        if (this.g != null) {
            this.b.e().a(this.g);
        }
    }

    static /* synthetic */ int f(w1 w1Var) {
        int i = w1Var.w;
        w1Var.w = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (this.a.R() <= this.e && !com.applovin.impl.d.d(this.d)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.d("AppLovinFullscreenActivity", "Ad reshow timed out. Will attempt to bring existing ad activity to front.");
            }
            this.p = false;
            long c2 = this.a.c();
            if (c2 > 0) {
                a(c2).a(s4.i, new s4.b() { // from class: com.applovin.impl.w1$$ExternalSyntheticLambda2
                    @Override // com.applovin.impl.s4.b
                    public final void a(boolean z, Object obj, Object obj2) {
                        w1.this.a(z, (Void) obj, (Void) obj2);
                    }
                });
            } else {
                f("app_relaunch_reshow_timed_out");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        if (this.a.z0().getAndSet(true)) {
            return;
        }
        this.b.q0().a((i5) new m6(this.a, this.b), d6.b.OTHER);
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.a);
        p0.startActivity(p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        return a() >= 0;
    }

    protected abstract void A();

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(long j);

    protected boolean h() {
        return AppLovinAdType.INCENTIVIZED == this.a.getType();
    }

    protected boolean i() {
        return this.d instanceof AppLovinFullscreenActivity;
    }

    protected void l() {
        if (!this.p && this.o.compareAndSet(false, true)) {
            t2.b(this.F, this.a);
            this.b.H().b(this.a);
            HashMap hashMap = new HashMap();
            com.applovin.impl.sdk.ad.b bVar = this.a;
            if (bVar != null) {
                CollectionUtils.putStringIfValid("source", bVar.v(), hashMap);
                CollectionUtils.putStringIfValid("details", f2.b(this.a), hashMap);
            }
            this.b.g().a(d2.G, this.a, hashMap);
        }
    }

    protected abstract void m();

    protected void n() {
        g7 g7Var = this.H;
        if (g7Var != null) {
            g7Var.d();
        }
    }

    protected void o() {
        g7 g7Var = this.H;
        if (g7Var != null) {
            g7Var.e();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
        }
        switch (action) {
            case "com.applovin.al_onPoststitialShow_evaluation_error":
                e();
                break;
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.render_process_gone":
                if (!this.t) {
                    f();
                    break;
                }
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    protected void p() {
        com.applovin.impl.adview.b f2;
        if (this.i == null || !this.a.t0() || (f2 = this.i.getController().f()) == null) {
            return;
        }
        this.K.a(f2, new f());
    }

    public void q() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.L) {
            a("back_button");
        }
        if (this.a.O0()) {
            e("javascript:onBackPressed();");
        }
    }

    public void r() {
        AppLovinAdView appLovinAdView = this.i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.i.destroy();
            this.i = null;
            if ((parent instanceof ViewGroup) && i()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        l();
        this.E = null;
        this.F = null;
        this.G = null;
        this.d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void s() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d("AppLovinFullscreenActivity", "onPause()");
        }
        d("javascript:al_onAppPaused();");
        n();
    }

    public void t() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d("AppLovinFullscreenActivity", "onResume()");
        }
        d("javascript:al_onAppResumed();");
        o();
    }

    public void u() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void v();

    public abstract void w();

    protected void x() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.J = true;
    }

    public boolean y() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        com.applovin.impl.sdk.o.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to " + str);
        try {
            a(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
            try {
                l();
            } catch (Throwable unused) {
            }
        }
    }

    private void f(final String str) {
        if (this.o.get()) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.w1$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                w1.this.c(str);
            }
        });
    }

    public AppLovinAdView b() {
        return this.i;
    }

    public void d(boolean z) {
        this.p = z;
    }

    public void e(String str) {
        a(str, 0L);
    }

    public boolean g() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (z()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.d("AppLovinFullscreenActivity", "App relaunch detected with launcher activity. Will attempt to re-show the ad");
            }
            this.p = true;
            long f2 = this.a.f();
            if (f2 < 0) {
                return;
            }
            a(new Runnable() { // from class: com.applovin.impl.w1$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    w1.this.j();
                }
            }, f2);
            return;
        }
        f("app_relaunch");
    }

    public void b(boolean z) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z);
        }
        d("javascript:al_onWindowFocusChanged( " + z + " );");
        g7 g7Var = this.I;
        if (g7Var != null) {
            if (z) {
                g7Var.e();
            } else {
                g7Var.d();
            }
        }
    }

    public void e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    class f implements h0.c {
        f() {
        }

        @Override // com.applovin.impl.h0.c
        public void a(int i, int i2) {
            Map a = f2.a((AppLovinAdImpl) w1.this.a);
            a.putAll(f2.a(w1.this.a));
            a.put("details", "detection_count=" + i + ",total_checks=" + i2);
            w1.this.b.D().d(d2.K0, a);
        }

        @Override // com.applovin.impl.h0.c
        public void a(int i, int i2, int i3) {
            Map a = f2.a((AppLovinAdImpl) w1.this.a);
            a.putAll(f2.a(w1.this.a));
            a.put("details", "detections_to_report=" + i + ",detection_count=" + i2 + ",total_checks=" + i3);
            w1.this.b.D().d(d2.L0, a);
            if (((Boolean) w1.this.b.a(x4.r6)).booleanValue()) {
                w1.this.x();
            }
            if (((Boolean) w1.this.b.a(x4.P0)).booleanValue()) {
                w1.this.b.G().c(w1.this.a, com.applovin.impl.sdk.k.o());
            }
            if (((Boolean) w1.this.b.a(x4.n6)).booleanValue()) {
                w1.this.a("black_view_auto_dismiss");
                return;
            }
            w1 w1Var = w1.this;
            w1Var.L = ((Boolean) w1Var.b.a(x4.o6)).booleanValue();
            if (((Boolean) w1.this.b.a(x4.p6)).booleanValue()) {
                w1.this.A();
            }
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.k kVar, Activity activity, g gVar) {
        w1 z1Var;
        if (bVar instanceof o7) {
            try {
                z1Var = new z1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th) {
                gVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + kVar + " and throwable: " + th.getMessage(), th);
                return;
            }
        } else if (bVar.hasVideoUrl()) {
            try {
                z1Var = new a2(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                gVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + kVar + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else {
            try {
                z1Var = new x1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                gVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + kVar + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        }
        z1Var.B();
        gVar.a(z1Var);
    }

    public void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.t = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        com.applovin.impl.adview.b f2;
        AppLovinAdView appLovinAdView = this.i;
        if (appLovinAdView == null || (f2 = appLovinAdView.getController().f()) == null) {
            return;
        }
        f2.a(str);
    }

    protected void c(boolean z) {
        a(z, ((Long) this.b.a(x4.m2)).longValue());
        if (!this.a.s0()) {
            t2.a(this.F, this.a);
        }
        this.b.H().a(this.a);
        if (!this.a.s0() && (this.a.hasVideoUrl() || h())) {
            t2.a(this.G, this.a);
        }
        new n4(this.d).a(this.a);
        this.a.setHasShown(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        e8.a(gVar, 400L, new Runnable() { // from class: com.applovin.impl.w1$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                w1.a(com.applovin.impl.adview.g.this, runnable);
            }
        });
    }

    private void b(String str, Map map) {
        e(o8.b(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.w1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                w1.b(com.applovin.impl.adview.g.this, runnable);
            }
        });
    }

    protected int c() {
        int t = this.a.t();
        return (t <= 0 && ((Boolean) this.b.a(x4.l2)).booleanValue()) ? this.u + 1 : t;
    }

    protected void d(String str) {
        if (this.a.v0()) {
            a(str, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a("backup_close_button");
    }

    private void d(String str, Map map) {
        e(o8.d(str, map));
    }

    protected void c(long j) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        }
        this.H = g7.a(j, this.b, new Runnable() { // from class: com.applovin.impl.w1$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                w1.this.k();
            }
        });
    }

    public long a() {
        com.applovin.impl.sdk.ad.b bVar = this.a;
        if (bVar == null) {
            return -1L;
        }
        return bVar.g();
    }

    private void c(String str, Map map) {
        e(o8.c(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, Void r2, Void r3) {
        if (z) {
            return;
        }
        f("app_relaunch_bring_to_front_failed");
    }

    private s4 a(long j) {
        final s4 s4Var = new s4("bringAdActivityToFront");
        final e eVar = new e(s4Var);
        this.b.e().a(eVar);
        Intent intent = new Intent(this.d, (Class<?>) (this.a.L0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.setFlags(131072);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.d, intent);
        a(new Runnable() { // from class: com.applovin.impl.w1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                w1.this.a(eVar, s4Var);
            }
        }, j);
        return s4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.b bVar, s4 s4Var) {
        this.b.e().b(bVar);
        if (s4Var.d()) {
            return;
        }
        s4Var.a((Object) null);
    }

    protected boolean a(boolean z) {
        List a2 = n7.a(z, this.a, this.b, this.d);
        if (a2.isEmpty()) {
            return false;
        }
        if (((Boolean) this.b.a(x4.W0)).booleanValue() && !n7.a(a2, this.a)) {
            a(a2, (com.applovin.impl.sdk.ad.a) this.a);
            return false;
        }
        String str = "Missing ad resources: " + a2;
        Map a3 = f2.a((AppLovinAdImpl) this.a);
        if (((Boolean) this.b.a(x4.T5)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + a2);
            }
            if (((Boolean) this.b.a(x4.W5)).booleanValue()) {
                AppLovinAdDisplayListener appLovinAdDisplayListener = this.F;
                if (appLovinAdDisplayListener instanceof l2) {
                    t2.a(appLovinAdDisplayListener, "Missing ad resources");
                }
            } else {
                n2.a(this.a, this.F, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            }
            a("missing_ad_resources");
            a(str, "Failing ad display", a3);
            HashMap<String, String> hashMap = CollectionUtils.hashMap("source", "missingCachedAdResources");
            CollectionUtils.putStringIfValid("error_message", str, hashMap);
            this.b.g().a(d2.F, this.a, hashMap);
            return ((Boolean) this.b.a(x4.V5)).booleanValue();
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + a2);
        }
        this.a.E0();
        a(str, "Streaming ad", a3);
        return false;
    }

    private void a(List list, com.applovin.impl.sdk.ad.a aVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a("AppLovinFullscreenActivity", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long currentTimeMillis = System.currentTimeMillis();
        aVar.a(list);
        HashMap<String, String> hashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), hashMap);
        this.b.g().a(d2.K, aVar, hashMap);
    }

    public void a(o0.a aVar, o0.a aVar2, o0.a aVar3) {
        if (((Boolean) this.b.a(x4.E4)).booleanValue()) {
            HashMap hashMap = new HashMap();
            hashMap.put(X3.i.n, n7.b(this.d));
            if (aVar != null) {
                hashMap.put("display_cutout_insets", aVar.e());
            }
            if (aVar2 != null) {
                hashMap.put("status_bar_insets", aVar2.e());
            }
            if (aVar3 != null) {
                hashMap.put("nav_bar_insets", aVar3.e());
            }
            e(o8.a(hashMap));
        }
    }

    public void a(String str) {
        this.s = true;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d("AppLovinFullscreenActivity", "Dismissing ad after " + TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime) + " seconds from source: " + str);
        }
        com.applovin.impl.sdk.ad.b bVar = this.a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.a != null ? r0.w() : 0L);
        if (((Boolean) this.b.a(x4.P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar2 = this.a;
            if (bVar2 != null) {
                bVar2.a(str);
            }
            m();
        }
        l();
        this.K.b();
        if (this.h != null) {
            this.b.p().b(this.h);
        }
        if (this.g != null) {
            this.b.e().b(this.g);
        }
        if (this.C != null) {
            this.d.getContentResolver().unregisterContentObserver(this.C);
            this.C = null;
        }
        if (i()) {
            this.d.finish();
            return;
        }
        this.b.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.b.O().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        r();
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(int i, KeyEvent keyEvent) {
        if (this.c == null || !com.applovin.impl.sdk.o.a()) {
            return;
        }
        this.c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
    }

    protected void a(final String str, long j) {
        if (j < 0 || !com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.w1$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                w1.this.b(str);
            }
        }, j);
    }

    protected void a(final com.applovin.impl.adview.g gVar, long j, final Runnable runnable) {
        if (j >= ((Long) this.b.a(x4.W1)).longValue()) {
            return;
        }
        this.I = g7.a(TimeUnit.SECONDS.toMillis(j), this.b, new Runnable() { // from class: com.applovin.impl.w1$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                w1.c(com.applovin.impl.adview.g.this, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    protected void a(int i, boolean z, boolean z2, long j) {
        if (!this.p && this.n.compareAndSet(false, true)) {
            if (this.a.hasVideoUrl() || h()) {
                t2.a(this.G, this.a, i, z2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
            this.b.k().trackVideoEnd(this.a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i, z);
            long elapsedRealtime2 = this.q != -1 ? SystemClock.elapsedRealtime() - this.q : -1L;
            this.b.k().trackFullScreenAdClosed(this.a, elapsedRealtime2, this.x, j, this.B, this.A);
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("AppLovinFullscreenActivity", "Video ad ended at percent: " + i + "%, elapsedTime: " + elapsedRealtime + "ms, skipTimeMillis: " + j + "ms, closeTimeMillis: " + elapsedRealtime2 + "ms");
            }
        }
    }

    private void a(String str, String str2, Map map) {
        HashMap hashMap = new HashMap(map);
        CollectionUtils.putStringIfValid("error_message", str, hashMap);
        CollectionUtils.putStringIfValid("details", str2, hashMap);
        this.b.D().a(d2.M0, "missingCachedAdResources", hashMap);
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.J = true;
    }

    protected void a(boolean z, long j) {
        if (this.a.H0()) {
            a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    private void a(String str, Map map) {
        e(o8.a(str, map));
    }

    protected void a(Runnable runnable, long j) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.f);
    }
}
