package v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0.h1;
import n0.j1;
import n0.m2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w0 implements m2 {
    public boolean A;
    public final j0 B;
    public final /* synthetic */ z0 C;

    /* renamed from: d, reason: collision with root package name */
    public final c6.s f9899d;

    /* renamed from: e, reason: collision with root package name */
    public final j1 f9900e;

    /* renamed from: i, reason: collision with root package name */
    public final j1 f9901i;

    /* renamed from: r, reason: collision with root package name */
    public final j1 f9902r;

    /* renamed from: s, reason: collision with root package name */
    public a0 f9903s;

    /* renamed from: t, reason: collision with root package name */
    public q0 f9904t;

    /* renamed from: u, reason: collision with root package name */
    public final j1 f9905u;

    /* renamed from: v, reason: collision with root package name */
    public final n0.f1 f9906v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9907w;

    /* renamed from: x, reason: collision with root package name */
    public final j1 f9908x;

    /* renamed from: y, reason: collision with root package name */
    public l f9909y;

    /* renamed from: z, reason: collision with root package name */
    public final h1 f9910z;

    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Map] */
    public w0(z0 z0Var, Object obj, l lVar, c6.s sVar) {
        this.C = z0Var;
        this.f9899d = sVar;
        j1 r9 = n0.h.r(obj);
        this.f9900e = r9;
        Object obj2 = null;
        this.f9901i = n0.h.r(c.g(7, null));
        this.f9902r = n0.h.r(new q0(c(), sVar, obj, r9.getValue(), lVar));
        this.f9905u = n0.h.r(Boolean.TRUE);
        this.f9906v = new n0.f1(-1.0f);
        this.f9908x = n0.h.r(obj);
        this.f9909y = lVar;
        this.f9910z = new h1(b().a());
        Float f3 = (Float) f1.f9796a.get(sVar);
        if (f3 != null) {
            float floatValue = f3.floatValue();
            l lVar2 = (l) ((Function1) sVar.f1868d).invoke(obj);
            int b10 = lVar2.b();
            for (int i3 = 0; i3 < b10; i3++) {
                lVar2.e(i3, floatValue);
            }
            obj2 = ((Function1) this.f9899d.f1869e).invoke(lVar2);
        }
        this.B = c.g(3, obj2);
    }

    public final q0 b() {
        return (q0) this.f9902r.getValue();
    }

    public final p c() {
        return (p) this.f9901i.getValue();
    }

    public final void e(long j) {
        if (this.f9906v.h() == -1.0f) {
            this.A = true;
            if (Intrinsics.a(b().f9864c, b().f9865d)) {
                f(b().f9864c);
            } else {
                f(b().b(j));
                this.f9909y = b().c(j);
            }
        }
    }

    public final void f(Object obj) {
        this.f9908x.setValue(obj);
    }

    public final void g(Object obj, boolean z10) {
        q0 q0Var = this.f9904t;
        Object obj2 = q0Var != null ? q0Var.f9864c : null;
        j1 j1Var = this.f9900e;
        boolean a9 = Intrinsics.a(obj2, j1Var.getValue());
        h1 h1Var = this.f9910z;
        j1 j1Var2 = this.f9902r;
        c6.s sVar = this.f9899d;
        if (a9) {
            j1Var2.setValue(new q0(this.B, sVar, obj, obj, this.f9909y.c()));
            this.f9907w = true;
            h1Var.i(b().a());
            return;
        }
        p c10 = (!z10 || this.A) ? c() : c() instanceof j0 ? c() : this.B;
        z0 z0Var = this.C;
        long e2 = z0Var.e();
        j1 j1Var3 = z0Var.f9923h;
        j1Var2.setValue(new q0(e2 <= 0 ? c10 : new k0(c10, z0Var.e()), sVar, obj, j1Var.getValue(), this.f9909y));
        h1Var.i(b().a());
        this.f9907w = false;
        j1Var3.setValue(Boolean.TRUE);
        if (z0Var.g()) {
            b1.w wVar = z0Var.f9924i;
            int size = wVar.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                w0 w0Var = (w0) wVar.get(i3);
                j = Math.max(j, w0Var.f9910z.h());
                w0Var.e(0L);
            }
            j1Var3.setValue(Boolean.FALSE);
        }
    }

    @Override // n0.m2
    public final Object getValue() {
        return this.f9908x.getValue();
    }

    public final void h(Object obj, Object obj2, p pVar) {
        this.f9900e.setValue(obj2);
        this.f9901i.setValue(pVar);
        if (Intrinsics.a(b().f9865d, obj) && Intrinsics.a(b().f9864c, obj2)) {
            return;
        }
        g(obj, false);
    }

    public final String toString() {
        return "current value: " + this.f9908x.getValue() + ", target: " + this.f9900e.getValue() + ", spec: " + c();
    }
}
