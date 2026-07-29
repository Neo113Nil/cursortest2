package com.chartboost.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Libraries.j;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.ai;
import com.chartboost.sdk.impl.aq;
import com.chartboost.sdk.impl.bc;
import com.chartboost.sdk.impl.s;
import java.util.HashSet;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    final h f3630a;

    /* renamed from: b, reason: collision with root package name */
    final Handler f3631b;

    /* renamed from: c, reason: collision with root package name */
    public final d f3632c;

    /* renamed from: d, reason: collision with root package name */
    j f3633d;
    Runnable g;
    final Application.ActivityLifecycleCallbacks h;
    private final ai i;
    private final com.chartboost.sdk.Tracking.a j;
    private j m;
    CBImpressionActivity e = null;
    com.chartboost.sdk.Model.c f = null;
    private boolean k = false;
    private final HashSet<Integer> l = new HashSet<>();

    private void b(j jVar, boolean z) {
    }

    public c(Activity activity, ai aiVar, h hVar, com.chartboost.sdk.Tracking.a aVar, Handler handler, d dVar) {
        this.i = aiVar;
        this.f3630a = hVar;
        this.j = aVar;
        this.f3631b = handler;
        this.f3632c = dVar;
        this.f3633d = a(activity);
        aq.a("CBUIManager.assignHostActivityRef", this.f3633d);
        this.g = new b();
        if (s.a().a(14)) {
            this.h = new a();
        } else {
            this.h = null;
        }
    }

    j a(Activity activity) {
        if (this.m == null || this.m.f3599a != activity.hashCode()) {
            this.m = new j(activity);
        }
        return this.m;
    }

    public Activity a() {
        if (this.f3633d != null) {
            return (Activity) this.f3633d.get();
        }
        return null;
    }

    public Activity b() {
        return this.e;
    }

    public d c() {
        if (b() == null) {
            return null;
        }
        return this.f3632c;
    }

    com.chartboost.sdk.Model.c d() {
        d c2 = c();
        bc a2 = c2 == null ? null : c2.a();
        if (a2 == null || !a2.f()) {
            return null;
        }
        return a2.e();
    }

    public boolean e() {
        return d() != null;
    }

    void a(CBImpressionActivity cBImpressionActivity) {
        aq.a("CBUIManager.setImpressionActivity", cBImpressionActivity);
        if (this.e == null) {
            i.m = cBImpressionActivity.getApplicationContext();
            this.e = cBImpressionActivity;
        }
        this.f3631b.removeCallbacks(this.g);
    }

    void f() {
        aq.a("CBUIManager.clearImpressionActivity");
        this.e = null;
    }

    private void a(int i, boolean z) {
        if (z) {
            this.l.add(Integer.valueOf(i));
        } else {
            this.l.remove(Integer.valueOf(i));
        }
    }

    void a(j jVar, boolean z) {
        if (jVar == null) {
            return;
        }
        a(jVar.f3599a, z);
    }

    void a(Activity activity, boolean z) {
        if (activity == null) {
            return;
        }
        a(activity.hashCode(), z);
    }

    boolean a(j jVar) {
        if (jVar == null) {
            return false;
        }
        return this.l.contains(Integer.valueOf(jVar.f3599a));
    }

    boolean g() {
        return a(this.f3633d);
    }

    private boolean l(Activity activity) {
        return this.e == activity;
    }

    private boolean c(j jVar) {
        if (jVar == null) {
            return this.e == null;
        }
        return jVar.a(this.e);
    }

    public void a(com.chartboost.sdk.Model.c cVar) {
        aq.a("CBUIManager.queueDisplayView", cVar);
        if (e()) {
            cVar.a(CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE);
            return;
        }
        if (this.e != null) {
            this.f3632c.a(cVar);
            return;
        }
        if (!g()) {
            cVar.a(CBError.CBImpressionError.NO_HOST_ACTIVITY);
            return;
        }
        Activity a2 = a();
        if (a2 == null) {
            CBLogging.b("CBUIManager", "Failed to display impression as the host activity reference has been lost!");
            cVar.a(CBError.CBImpressionError.NO_HOST_ACTIVITY);
            return;
        }
        if (this.f != null && this.f != cVar) {
            cVar.a(CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE);
            return;
        }
        this.f = cVar;
        if (i.f3679c != null) {
            if (cVar.n == 1 || cVar.n == 2) {
                i.f3679c.willDisplayVideo(cVar.m);
            } else if (cVar.n == 0) {
                i.f3679c.willDisplayInterstitial(cVar.m);
            }
        }
        if (i.f3680d != null) {
            RunnableC0317c runnableC0317c = new RunnableC0317c(9);
            runnableC0317c.f3640b = a2;
            runnableC0317c.f3642d = cVar;
            this.f3631b.postDelayed(runnableC0317c, 1);
            return;
        }
        a(a2, cVar);
    }

    public void a(Activity activity, com.chartboost.sdk.Model.c cVar) {
        Intent intent = new Intent(activity, (Class<?>) CBImpressionActivity.class);
        boolean z = false;
        boolean z2 = (activity.getWindow().getAttributes().flags & 1024) != 0;
        boolean z3 = (activity.getWindow().getAttributes().flags & 2048) != 0;
        if (z2 && !z3) {
            z = true;
        }
        intent.putExtra("paramFullscreen", z);
        intent.putExtra("isChartboost", true);
        try {
            activity.startActivity(intent);
            this.k = true;
        } catch (ActivityNotFoundException unused) {
            CBLogging.b("CBUIManager", "Please add CBImpressionActivity in AndroidManifest.xml following README.md instructions.");
            this.f = null;
            cVar.a(CBError.CBImpressionError.ACTIVITY_MISSING_IN_MANIFEST);
        }
    }

    void b(j jVar) {
        aq.a("CBUIManager.onStop", jVar);
        if (!(jVar.get() instanceof CBImpressionActivity)) {
            a(jVar, false);
        }
        this.f3630a.c();
    }

    void b(Activity activity) {
        aq.a("CBUIManager.onCreateCallback", activity);
        if (com.chartboost.sdk.b.b() && com.chartboost.sdk.b.a(activity)) {
            RunnableC0317c runnableC0317c = new RunnableC0317c(0);
            runnableC0317c.f3640b = activity;
            h.b(runnableC0317c);
        }
    }

    void c(Activity activity) {
        aq.a("CBUIManager.onCreateImpl", activity);
        if (this.f3633d != null && !this.f3633d.a(activity) && g()) {
            b(this.f3633d);
            a(this.f3633d, false);
        }
        this.f3631b.removeCallbacks(this.g);
        this.f3633d = a(activity);
        aq.a("CBUIManager.assignHostActivityRef", this.f3633d);
    }

    void d(Activity activity) {
        aq.a("CBUIManager.onStartCallback", activity);
        if (com.chartboost.sdk.b.b() && com.chartboost.sdk.b.a(activity)) {
            RunnableC0317c runnableC0317c = new RunnableC0317c(1);
            runnableC0317c.f3640b = activity;
            h.b(runnableC0317c);
        }
    }

    void e(Activity activity) {
        aq.a("CBUIManager.onStartImpl", activity);
        i.m = activity.getApplicationContext();
        boolean z = activity instanceof CBImpressionActivity;
        if (!z) {
            this.f3633d = a(activity);
            aq.a("CBUIManager.assignHostActivityRef", this.f3633d);
            a(this.f3633d, true);
        } else {
            a((CBImpressionActivity) activity);
        }
        this.f3631b.removeCallbacks(this.g);
        boolean z2 = i.f3680d != null && i.f3680d.doesWrapperUseCustomBackgroundingBehavior();
        if (activity != null) {
            if (z2 || l(activity)) {
                b(a(activity), true);
                if (z) {
                    this.k = false;
                }
                if (b(activity, this.f)) {
                    this.f = null;
                }
                com.chartboost.sdk.Model.c d2 = d();
                if (d2 != null) {
                    d2.s();
                }
            }
        }
    }

    void f(Activity activity) {
        aq.a("CBUIManager.onResumeCallback", activity);
        if (com.chartboost.sdk.b.b() && com.chartboost.sdk.b.a(activity)) {
            this.f3630a.e();
            RunnableC0317c runnableC0317c = new RunnableC0317c(2);
            runnableC0317c.f3640b = activity;
            h.b(runnableC0317c);
        }
    }

    void h() {
        aq.a("CBUIManager.onResumeImpl", (String) null);
        this.i.b(i.m);
        com.chartboost.sdk.Model.c d2 = d();
        if (CBUtility.a(Chartboost.CBFramework.CBFrameworkUnity)) {
            this.f3630a.b();
        }
        if (d2 != null) {
            d2.r();
        }
    }

    void g(Activity activity) {
        aq.a("CBUIManager.onPauseCallback", activity);
        if (com.chartboost.sdk.b.b() && com.chartboost.sdk.b.a(activity)) {
            RunnableC0317c runnableC0317c = new RunnableC0317c(3);
            runnableC0317c.f3640b = activity;
            h.b(runnableC0317c);
        }
    }

    void i() {
        aq.a("CBUIManager.onPauseImpl", (String) null);
        com.chartboost.sdk.Model.c d2 = d();
        if (d2 != null) {
            d2.t();
        }
        this.i.c(i.m);
    }

    void h(Activity activity) {
        aq.a("CBUIManager.onStopCallback", activity);
        if (com.chartboost.sdk.b.b() && com.chartboost.sdk.b.a(activity)) {
            RunnableC0317c runnableC0317c = new RunnableC0317c(4);
            runnableC0317c.f3640b = activity;
            h.b(runnableC0317c);
        }
    }

    void i(Activity activity) {
        j a2 = a(activity);
        aq.a("CBUIManager.onStopImpl", a2);
        com.chartboost.sdk.Model.c d2 = d();
        if (d2 == null || d2.p.f3611b != 0) {
            return;
        }
        d c2 = c();
        if (c(a2) && c2 != null) {
            c2.c(d2);
            this.f = d2;
            b(a2, false);
        }
        if (a2.get() instanceof CBImpressionActivity) {
            return;
        }
        a(a2, false);
    }

    boolean j() {
        aq.a("CBUIManager.onBackPressedCallback");
        if (!com.chartboost.sdk.b.b()) {
            return false;
        }
        if (this.f3633d == null) {
            CBLogging.b("CBUIManager", "The Chartboost methods onCreate(), onStart(), onStop(), and onDestroy() must be called in the corresponding methods of your activity in order for Chartboost to function properly.");
            return false;
        }
        if (!this.k) {
            return false;
        }
        this.k = false;
        k();
        return true;
    }

    boolean k() {
        aq.a("CBUIManager.onBackPressedImpl");
        return m();
    }

    private boolean m() {
        aq.a("CBUIManager.closeImpressionImpl");
        com.chartboost.sdk.Model.c d2 = d();
        if (d2 == null || d2.l != 2) {
            return false;
        }
        if (d2.q()) {
            return true;
        }
        h.b(new RunnableC0317c(7));
        return true;
    }

    void j(Activity activity) {
        aq.a("CBUIManager.onDestroyCallback", activity);
        if (com.chartboost.sdk.b.b() && com.chartboost.sdk.b.a(activity)) {
            RunnableC0317c runnableC0317c = new RunnableC0317c(5);
            runnableC0317c.f3640b = activity;
            h.b(runnableC0317c);
        }
    }

    void k(Activity activity) {
        aq.a("CBUIManager.onDestroyImpl", activity);
        b(a(activity), false);
        com.chartboost.sdk.Model.c d2 = d();
        if (d2 == null && activity == this.e && this.f != null) {
            d2 = this.f;
        }
        d c2 = c();
        if (c2 != null && d2 != null) {
            c2.d(d2);
        }
        this.f = null;
    }

    public void b(com.chartboost.sdk.Model.c cVar) {
        d c2;
        if (cVar.l == 2) {
            d c3 = c();
            if (c3 != null) {
                c3.b(cVar);
            }
        } else if (cVar.p.f3611b == 1 && cVar.l == 1 && (c2 = c()) != null) {
            c2.d(cVar);
        }
        if (cVar.v()) {
            this.j.d(cVar.f3617a.a(cVar.p.f3611b), cVar.m, cVar.o());
        } else {
            this.j.e(cVar.f3617a.a(cVar.p.f3611b), cVar.m, cVar.o());
        }
    }

    boolean l() {
        com.chartboost.sdk.Model.c d2 = d();
        if (d2 == null) {
            return false;
        }
        d2.z = true;
        b(d2);
        return true;
    }

    boolean b(Activity activity, com.chartboost.sdk.Model.c cVar) {
        if (cVar == null) {
            return true;
        }
        switch (cVar.l) {
            case 0:
            default:
                return true;
            case 1:
            case 3:
                a(cVar);
                return true;
            case 2:
                if (cVar.g()) {
                    return true;
                }
                if (i.f3680d != null && i.f3680d.doesWrapperUseCustomBackgroundingBehavior() && !(activity instanceof CBImpressionActivity)) {
                    return false;
                }
                d c2 = c();
                if (c2 == null) {
                    return true;
                }
                CBLogging.b("CBUIManager", "Error onActivityStart " + cVar.l);
                c2.d(cVar);
                return true;
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final int f3636b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3637c;

        /* renamed from: d, reason: collision with root package name */
        private final int f3638d;

        private com.chartboost.sdk.a a() {
            return i.f3679c;
        }

        b() {
            com.chartboost.sdk.a a2 = a();
            this.f3636b = c.this.e == null ? -1 : c.this.e.hashCode();
            this.f3637c = c.this.f3633d == null ? -1 : c.this.f3633d.hashCode();
            this.f3638d = a2 != null ? a2.hashCode() : -1;
        }

        @Override // java.lang.Runnable
        public void run() {
            aq.a("ClearMemoryRunnable.run");
            com.chartboost.sdk.a a2 = a();
            if (c.this.f3633d != null && c.this.f3633d.hashCode() == this.f3637c) {
                c.this.f3633d = null;
                aq.a("CBUIManager.clearHostActivityRef");
            }
            if (a2 == null || a2.hashCode() != this.f3638d) {
                return;
            }
            i.f3679c = null;
            aq.a("SdkSettings.clearDelegate");
        }
    }

    @TargetApi(14)
    private class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        private a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            aq.a("CBUIManager.ActivityCallbackListener.onActivityCreated", activity);
            CBLogging.a("CBUIManager", "######## onActivityCreated callback called");
            if (activity instanceof CBImpressionActivity) {
                return;
            }
            c.this.b(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            aq.a("CBUIManager.ActivityCallbackListener.onActivityStarted", activity);
            if (!(activity instanceof CBImpressionActivity)) {
                CBLogging.a("CBUIManager", "######## onActivityStarted callback called from developer side");
                c.this.d(activity);
            } else {
                CBLogging.a("CBUIManager", "######## onActivityStarted callback called from CBImpressionactivity");
                c.this.e(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            aq.a("CBUIManager.ActivityCallbackListener.onActivityResumed", activity);
            if (!(activity instanceof CBImpressionActivity)) {
                CBLogging.a("CBUIManager", "######## onActivityResumed callback called from developer side");
                c.this.f(activity);
            } else {
                CBLogging.a("CBUIManager", "######## onActivityResumed callback called from CBImpressionactivity");
                c.this.a(activity);
                c.this.h();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            aq.a("CBUIManager.ActivityCallbackListener.onActivityPaused", activity);
            if (!(activity instanceof CBImpressionActivity)) {
                CBLogging.a("CBUIManager", "######## onActivityPaused callback called from developer side");
                c.this.g(activity);
            } else {
                CBLogging.a("CBUIManager", "######## onActivityPaused callback called from CBImpressionactivity");
                c.this.a(activity);
                c.this.i();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            aq.a("CBUIManager.ActivityCallbackListener.onActivityStopped", activity);
            if (!(activity instanceof CBImpressionActivity)) {
                CBLogging.a("CBUIManager", "######## onActivityStopped callback called from developer side");
                c.this.h(activity);
            } else {
                CBLogging.a("CBUIManager", "######## onActivityStopped callback called from CBImpressionactivity");
                c.this.i(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            aq.a("CBUIManager.ActivityCallbackListener.onActivityDestroyed", activity);
            if (!(activity instanceof CBImpressionActivity)) {
                CBLogging.a("CBUIManager", "######## onActivityDestroyed callback called from developer side");
                c.this.j(activity);
            } else {
                CBLogging.a("CBUIManager", "######## onActivityDestroyed callback called from CBImpressionactivity");
                c.this.k(activity);
            }
        }
    }

    /* renamed from: com.chartboost.sdk.c$c, reason: collision with other inner class name */
    public class RunnableC0317c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f3639a;

        /* renamed from: b, reason: collision with root package name */
        Activity f3640b = null;

        /* renamed from: c, reason: collision with root package name */
        boolean f3641c = false;

        /* renamed from: d, reason: collision with root package name */
        public com.chartboost.sdk.Model.c f3642d = null;

        public RunnableC0317c(int i) {
            this.f3639a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                switch (this.f3639a) {
                    case 0:
                        c.this.c(this.f3640b);
                        break;
                    case 1:
                        c.this.f3631b.removeCallbacks(c.this.g);
                        if (c.this.f3633d != null && !c.this.f3633d.a(this.f3640b) && c.this.g()) {
                            c.this.b(c.this.f3633d);
                            c.this.a(c.this.f3633d, false);
                        }
                        c.this.a(this.f3640b, true);
                        c.this.f3633d = c.this.a(this.f3640b);
                        c.this.f3630a.b();
                        c.this.f3630a.a(this.f3640b);
                        c.this.e(this.f3640b);
                        break;
                    case 2:
                        if (c.this.a(c.this.a(this.f3640b))) {
                            c.this.h();
                            break;
                        } else if (CBUtility.a(Chartboost.CBFramework.CBFrameworkUnity)) {
                            c.this.f3630a.b();
                            break;
                        }
                        break;
                    case 3:
                        if (c.this.a(c.this.a(this.f3640b))) {
                            c.this.i();
                            break;
                        }
                        break;
                    case 4:
                        j a2 = c.this.a(this.f3640b);
                        if (c.this.a(a2)) {
                            c.this.b(a2);
                            break;
                        }
                        break;
                    case 5:
                        if (c.this.f3633d == null || c.this.f3633d.a(this.f3640b)) {
                            c.this.g = c.this.new b();
                            c.this.g.run();
                        }
                        c.this.k(this.f3640b);
                        break;
                    case 6:
                        if (c.this.e != null) {
                            if (this.f3641c) {
                                c.this.e.forwardTouchEvents(c.this.a());
                                break;
                            } else {
                                c.this.e.forwardTouchEvents(null);
                                break;
                            }
                        }
                        break;
                    case 7:
                        c.this.l();
                        break;
                    case 9:
                        c.this.a(this.f3640b, this.f3642d);
                        break;
                    case 10:
                        if (this.f3642d.a()) {
                            this.f3642d.u().b();
                            break;
                        }
                        break;
                    case 11:
                        d c2 = c.this.c();
                        if (this.f3642d.l == 2 && c2 != null) {
                            c2.b(this.f3642d);
                            break;
                        }
                        break;
                    case 12:
                        this.f3642d.n();
                        break;
                    case 13:
                        c.this.f3632c.a(this.f3642d, this.f3640b);
                        break;
                    case 14:
                        c.this.f3632c.d(this.f3642d);
                        break;
                }
            } catch (Exception e) {
                com.chartboost.sdk.Tracking.a.a(RunnableC0317c.class, "run (" + this.f3639a + ")", e);
            }
        }
    }
}
