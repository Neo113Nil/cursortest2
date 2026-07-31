package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b31 implements zn, rb1, z2.q, qb1 {

    /* renamed from: f, reason: collision with root package name */
    private final w21 f3182f;

    /* renamed from: g, reason: collision with root package name */
    private final x21 f3183g;

    /* renamed from: i, reason: collision with root package name */
    private final oc0<JSONObject, JSONObject> f3185i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f3186j;

    /* renamed from: k, reason: collision with root package name */
    private final v3.d f3187k;

    /* renamed from: h, reason: collision with root package name */
    private final Set<eu0> f3184h = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f3188l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    private final a31 f3189m = new a31();

    /* renamed from: n, reason: collision with root package name */
    private boolean f3190n = false;

    /* renamed from: o, reason: collision with root package name */
    private WeakReference<?> f3191o = new WeakReference<>(this);

    public b31(lc0 lc0Var, x21 x21Var, Executor executor, w21 w21Var, v3.d dVar) {
        this.f3182f = w21Var;
        wb0<JSONObject> wb0Var = zb0.f15062b;
        this.f3185i = lc0Var.a("google.afma.activeView.handleUpdate", wb0Var, wb0Var);
        this.f3183g = x21Var;
        this.f3186j = executor;
        this.f3187k = dVar;
    }

    private final void h() {
        Iterator<eu0> it = this.f3184h.iterator();
        while (it.hasNext()) {
            this.f3182f.f(it.next());
        }
        this.f3182f.e();
    }

    @Override // z2.q
    public final void B3() {
    }

    @Override // z2.q
    public final void E(int i7) {
    }

    @Override // z2.q
    public final void a() {
    }

    @Override // z2.q
    public final void b() {
    }

    public final synchronized void c() {
        if (this.f3191o.get() == null) {
            g();
            return;
        }
        if (this.f3190n || !this.f3188l.get()) {
            return;
        }
        try {
            this.f3189m.f2594d = this.f3187k.a();
            final JSONObject a7 = this.f3183g.a(this.f3189m);
            for (final eu0 eu0Var : this.f3184h) {
                this.f3186j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.z21
                    @Override // java.lang.Runnable
                    public final void run() {
                        eu0.this.b1("AFMA_updateActiveView", a7);
                    }
                });
            }
            zo0.b(this.f3185i.a(a7), "ActiveViewListener.callActiveViewJs");
        } catch (Exception e7) {
            a3.r1.l("Failed to call ActiveViewJS", e7);
        }
    }

    public final synchronized void d(eu0 eu0Var) {
        this.f3184h.add(eu0Var);
        this.f3182f.d(eu0Var);
    }

    public final void e(Object obj) {
        this.f3191o = new WeakReference<>(obj);
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final synchronized void f(Context context) {
        this.f3189m.f2592b = false;
        c();
    }

    public final synchronized void g() {
        h();
        this.f3190n = true;
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final synchronized void k() {
        if (this.f3188l.compareAndSet(false, true)) {
            this.f3182f.c(this);
            c();
        }
    }

    @Override // z2.q
    public final synchronized void k6() {
        this.f3189m.f2592b = true;
        c();
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final synchronized void o0(xn xnVar) {
        a31 a31Var = this.f3189m;
        a31Var.f2591a = xnVar.f14258j;
        a31Var.f2596f = xnVar;
        c();
    }

    @Override // z2.q
    public final synchronized void o4() {
        this.f3189m.f2592b = false;
        c();
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final synchronized void r(Context context) {
        this.f3189m.f2592b = true;
        c();
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final synchronized void y(Context context) {
        this.f3189m.f2595e = "u";
        c();
        h();
        this.f3190n = true;
    }
}
