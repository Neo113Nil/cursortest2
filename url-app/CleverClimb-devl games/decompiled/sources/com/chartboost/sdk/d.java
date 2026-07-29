package com.chartboost.sdk;

import android.app.Activity;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.c;
import com.chartboost.sdk.c.RunnableC0317c;
import com.chartboost.sdk.impl.aw;
import com.chartboost.sdk.impl.bc;
import com.chartboost.sdk.impl.c.a;
import com.chartboost.sdk.impl.l;
import com.chartboost.sdk.impl.s;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    final aw f3643a;

    /* renamed from: c, reason: collision with root package name */
    private final l f3645c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<com.chartboost.sdk.Model.e> f3646d;
    private final Handler e;

    /* renamed from: b, reason: collision with root package name */
    bc f3644b = null;
    private int f = -1;

    public d(aw awVar, l lVar, AtomicReference<com.chartboost.sdk.Model.e> atomicReference, Handler handler) {
        this.f3643a = awVar;
        this.f3645c = lVar;
        this.f3646d = atomicReference;
        this.e = handler;
    }

    void a(com.chartboost.sdk.Model.c cVar) {
        if (cVar.l != 0) {
            e(cVar);
        }
    }

    private void e(com.chartboost.sdk.Model.c cVar) {
        if (this.f3644b != null && this.f3644b.e() != cVar) {
            CBLogging.b("CBViewController", "Impression already visible");
            cVar.a(CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE);
            return;
        }
        boolean z = cVar.l != 2;
        cVar.l = 2;
        Activity b2 = cVar.g.b();
        CBError.CBImpressionError cBImpressionError = b2 == null ? CBError.CBImpressionError.NO_HOST_ACTIVITY : null;
        if (cBImpressionError == null) {
            cBImpressionError = cVar.j();
        }
        if (cBImpressionError != null) {
            CBLogging.b("CBViewController", "Unable to create the view while trying th display the impression");
            cVar.a(cBImpressionError);
            return;
        }
        if (this.f3644b == null) {
            this.f3644b = (bc) g.a().a(new bc(b2, cVar));
            b2.addContentView(this.f3644b, new FrameLayout.LayoutParams(-1, -1));
        }
        CBUtility.a(b2, cVar.p.f3611b, this.f3646d.get());
        if (s.a().a(11) && this.f == -1 && (cVar.n == 1 || cVar.n == 2)) {
            this.f = b2.getWindow().getDecorView().getSystemUiVisibility();
            Chartboost.setActivityAttrs(b2);
        }
        this.f3644b.a();
        CBLogging.e("CBViewController", "Displaying the impression");
        cVar.s = this.f3644b;
        if (z) {
            if (cVar.p.f3611b == 0) {
                this.f3644b.c().a(this.f3643a, cVar.p);
            }
            int i = cVar.p.f3611b == 1 ? 6 : 1;
            Integer a2 = aw.a(cVar.p.o);
            if (a2 != null) {
                i = a2.intValue();
            }
            cVar.m();
            c cVar2 = cVar.g;
            cVar2.getClass();
            c.RunnableC0317c runnableC0317c = cVar2.new RunnableC0317c(12);
            runnableC0317c.f3642d = cVar;
            this.f3643a.a(i, cVar, runnableC0317c, this);
            this.f3645c.a();
        }
    }

    public void b(final com.chartboost.sdk.Model.c cVar) {
        CBLogging.e("CBViewController", "Dismissing impression");
        final Activity b2 = cVar.g.b();
        Runnable runnable = new Runnable() { // from class: com.chartboost.sdk.d.1
            @Override // java.lang.Runnable
            public void run() {
                cVar.l = 4;
                int i = cVar.p.f3611b == 1 ? 6 : 1;
                Integer a2 = aw.a(cVar.p.o);
                if (a2 != null) {
                    i = a2.intValue();
                }
                c cVar2 = cVar.g;
                cVar2.getClass();
                c.RunnableC0317c runnableC0317c = cVar2.new RunnableC0317c(13);
                runnableC0317c.f3642d = cVar;
                runnableC0317c.f3640b = b2;
                d.this.f3643a.a(i, cVar, runnableC0317c);
            }
        };
        if (cVar.t) {
            cVar.a(runnable);
        } else {
            runnable.run();
        }
    }

    void a(com.chartboost.sdk.Model.c cVar, Activity activity) {
        c cVar2 = cVar.g;
        cVar2.getClass();
        c.RunnableC0317c runnableC0317c = cVar2.new RunnableC0317c(14);
        runnableC0317c.f3642d = cVar;
        this.e.post(runnableC0317c);
        cVar.l();
        CBUtility.b(activity, cVar.p.f3611b, this.f3646d.get());
        if (this.f != -1) {
            if (cVar.n == 1 || cVar.n == 2) {
                activity.getWindow().getDecorView().setSystemUiVisibility(this.f);
                this.f = -1;
            }
        }
    }

    void c(com.chartboost.sdk.Model.c cVar) {
        CBLogging.e("CBViewController", "Removing impression silently");
        cVar.i();
        try {
            ((ViewGroup) this.f3644b.getParent()).removeView(this.f3644b);
        } catch (Exception e) {
            CBLogging.a("CBViewController", "Exception removing impression silently", e);
            com.chartboost.sdk.Tracking.a.a(getClass(), "removeImpressionSilently", e);
        }
        this.f3644b = null;
    }

    public void d(com.chartboost.sdk.Model.c cVar) {
        CBLogging.e("CBViewController", "Removing impression");
        cVar.l = 5;
        cVar.h();
        this.f3644b = null;
        this.f3645c.b();
        Handler handler = this.e;
        com.chartboost.sdk.impl.c cVar2 = cVar.f3617a;
        cVar2.getClass();
        handler.post(cVar2.new a(3, cVar.m, null));
        if (cVar.v()) {
            Handler handler2 = this.e;
            com.chartboost.sdk.impl.c cVar3 = cVar.f3617a;
            cVar3.getClass();
            handler2.post(cVar3.new a(2, cVar.m, null));
        }
        a(cVar.g);
    }

    void a(c cVar) {
        CBLogging.e("CBViewController", "Attempting to close impression activity");
        Activity b2 = cVar.b();
        if (b2 == null || !(b2 instanceof CBImpressionActivity)) {
            return;
        }
        CBLogging.e("CBViewController", "Closing impression activity");
        cVar.f();
        b2.finish();
    }

    public bc a() {
        return this.f3644b;
    }
}
