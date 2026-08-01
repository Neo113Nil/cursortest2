package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class re {

    /* renamed from: a, reason: collision with root package name */
    public final String f2756a;

    /* renamed from: b, reason: collision with root package name */
    public final f8.s f2757b;

    /* renamed from: c, reason: collision with root package name */
    public final c2.b1 f2758c;

    /* renamed from: d, reason: collision with root package name */
    public final c6.e f2759d;

    /* renamed from: e, reason: collision with root package name */
    public final ra f2760e;

    /* renamed from: f, reason: collision with root package name */
    public final ra f2761f = new ra(new l5(this));
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final h1 f2762h;

    /* renamed from: i, reason: collision with root package name */
    public List f2763i;

    public re(c2.b1 b1Var, f8.s sVar) {
        Object obj = new Object();
        this.g = obj;
        this.f2763i = new ArrayList();
        this.f2758c = b1Var;
        this.f2757b = sVar;
        this.f2756a = (String) b1Var.f1491b;
        this.f2760e = new ra(new ve(b1Var, 1));
        this.f2759d = new c6.e(6);
        this.f2762h = new h1(19);
        qc qcVar = new qc(4, this);
        synchronized (obj) {
            this.f2763i.add(qcVar);
        }
    }

    public final f8.t a(tc tcVar, f8.u0 u0Var) {
        f8.r i3;
        c6.e eVar;
        f8.d0 d0Var;
        qc qcVar = new qc(3, tcVar);
        int i10 = cg.f2205a;
        dd ddVar = new dd(4, mf.a(), qcVar);
        a.a aVar = eg.f2265a;
        i7.a.y(aVar, "ticker");
        aVar.V();
        String concat = "Update ".concat(String.valueOf(this.f2756a));
        this.f2762h.getClass();
        tf d10 = h1.d(concat);
        try {
            i3 = this.f2761f.i();
            eVar = this.f2759d;
            v5 v5Var = new v5(17, i3);
            d0Var = f8.d0.f4128d;
            eVar.q(v5Var, d0Var);
        } catch (Throwable th) {
            th = th;
        }
        try {
            ListenableFuture q3 = eVar.q(cg.a(new e7(this, i3, ddVar, u0Var, 3)), d0Var);
            f8.l0.propagateCancellation(q3, i3);
            f8.l0.e(this.f2757b);
            f8.t f3 = f8.l0.f(q3, new a8.e(), d0Var);
            d10.a(f3);
            d10.close();
            return f3;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            try {
                d10.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
