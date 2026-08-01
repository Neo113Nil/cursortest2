package v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0.h1;
import n0.j1;
import n0.m2;
import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final c1.b f9917a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f9918b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9919c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f9920d;

    /* renamed from: e, reason: collision with root package name */
    public final j1 f9921e;

    /* renamed from: f, reason: collision with root package name */
    public final h1 f9922f = new h1(0);
    public final h1 g = new h1(Long.MIN_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public final j1 f9923h;

    /* renamed from: i, reason: collision with root package name */
    public final b1.w f9924i;
    public final b1.w j;

    /* renamed from: k, reason: collision with root package name */
    public final j1 f9925k;

    /* renamed from: l, reason: collision with root package name */
    public final n0.y f9926l;

    public z0(c1.b bVar, z0 z0Var, String str) {
        this.f9917a = bVar;
        this.f9918b = z0Var;
        this.f9919c = str;
        this.f9920d = n0.h.r(bVar.l());
        this.f9921e = n0.h.r(new v0(bVar.l(), bVar.l()));
        Boolean bool = Boolean.FALSE;
        this.f9923h = n0.h.r(bool);
        this.f9924i = new b1.w();
        this.j = new b1.w();
        this.f9925k = n0.h.r(bool);
        this.f9926l = n0.h.o(new r0(this, 1));
        bVar.q(this);
    }

    public final void a(Object obj, n0.i0 i0Var, int i3) {
        i0Var.X(-1493585151);
        int i10 = (i0Var.f(obj) ? 4 : 2) | i3 | (i0Var.f(this) ? 32 : 16);
        if (!i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            i0Var.R();
        } else if (g()) {
            i0Var.W(467722849);
            i0Var.p(false);
        } else {
            i0Var.W(466062241);
            p(obj);
            int i11 = i10 & 112;
            boolean z10 = i11 == 32;
            Object L = i0Var.L();
            n0.e eVar = n0.k.f6729a;
            if (z10 || L == eVar) {
                L = n0.h.o(new r0(this, 0));
                i0Var.g0(L);
            }
            if (((Boolean) ((m2) L).getValue()).booleanValue()) {
                i0Var.W(466470356);
                Object L2 = i0Var.L();
                if (L2 == eVar) {
                    L2 = n0.h.m(kotlin.coroutines.g.f5592d, i0Var);
                    i0Var.g0(L2);
                }
                ge.x xVar = (ge.x) L2;
                boolean h10 = i0Var.h(xVar) | (i11 == 32);
                Object L3 = i0Var.L();
                if (h10 || L3 == eVar) {
                    L3 = new b0.l0(18, xVar, this);
                    i0Var.g0(L3);
                }
                n0.h.c(xVar, this, (Function1) L3, i0Var);
                i0Var.p(false);
            } else {
                i0Var.W(467712929);
                i0Var.p(false);
            }
            i0Var.p(false);
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new b0.u(i3, 11, this, obj);
        }
    }

    public final long b() {
        b1.w wVar = this.f9924i;
        int size = wVar.size();
        long j = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j = Math.max(j, ((w0) wVar.get(i3)).f9910z.h());
        }
        b1.w wVar2 = this.j;
        int size2 = wVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            j = Math.max(j, ((z0) wVar2.get(i10)).b());
        }
        return j;
    }

    public final void c() {
        b1.w wVar = this.f9924i;
        int size = wVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            w0 w0Var = (w0) wVar.get(i3);
            w0Var.f9904t = null;
            w0Var.f9903s = null;
            w0Var.f9907w = false;
        }
        b1.w wVar2 = this.j;
        int size2 = wVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((z0) wVar2.get(i10)).c();
        }
    }

    public final boolean d() {
        b1.w wVar = this.f9924i;
        int size = wVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((w0) wVar.get(i3)).f9903s != null) {
                return true;
            }
        }
        b1.w wVar2 = this.j;
        int size2 = wVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            if (((z0) wVar2.get(i10)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        z0 z0Var = this.f9918b;
        return z0Var != null ? z0Var.e() : this.f9922f.h();
    }

    public final u0 f() {
        return (u0) this.f9921e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f9925k.getValue()).booleanValue();
    }

    public final void h(boolean z10, long j) {
        h1 h1Var = this.g;
        long h10 = h1Var.h();
        c1.b bVar = this.f9917a;
        if (h10 == Long.MIN_VALUE) {
            h1Var.i(j);
            ((j1) bVar.f1478d).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((j1) bVar.f1478d).getValue()).booleanValue()) {
            ((j1) bVar.f1478d).setValue(Boolean.TRUE);
        }
        this.f9923h.setValue(Boolean.FALSE);
        b1.w wVar = this.f9924i;
        int size = wVar.size();
        boolean z11 = true;
        for (int i3 = 0; i3 < size; i3++) {
            w0 w0Var = (w0) wVar.get(i3);
            j1 j1Var = w0Var.f9905u;
            j1 j1Var2 = w0Var.f9905u;
            if (!((Boolean) j1Var.getValue()).booleanValue()) {
                long a9 = z10 ? w0Var.b().a() : j;
                w0Var.f(w0Var.b().b(a9));
                w0Var.f9909y = w0Var.b().c(a9);
                if (a9 >= w0Var.b().a()) {
                    j1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) j1Var2.getValue()).booleanValue()) {
                z11 = false;
            }
        }
        b1.w wVar2 = this.j;
        int size2 = wVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            z0 z0Var = (z0) wVar2.get(i10);
            j1 j1Var3 = z0Var.f9920d;
            c1.b bVar2 = z0Var.f9917a;
            if (!Intrinsics.a(j1Var3.getValue(), bVar2.l())) {
                z0Var.h(z10, j);
            }
            if (!Intrinsics.a(z0Var.f9920d.getValue(), bVar2.l())) {
                z11 = false;
            }
        }
        if (z11) {
            i();
        }
    }

    public final void i() {
        this.g.i(Long.MIN_VALUE);
        c1.b bVar = this.f9917a;
        if (bVar instanceof t) {
            ((t) bVar).p(this.f9920d.getValue());
        }
        n(0L);
        ((j1) bVar.f1478d).setValue(Boolean.FALSE);
        b1.w wVar = this.j;
        int size = wVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((z0) wVar.get(i3)).i();
        }
    }

    public final void j(float f3) {
        b1.w wVar = this.f9924i;
        int size = wVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            w0 w0Var = (w0) wVar.get(i3);
            w0Var.getClass();
            if (f3 == -4.0f || f3 == -5.0f) {
                q0 q0Var = w0Var.f9904t;
                if (q0Var != null) {
                    w0Var.b().d(q0Var.f9864c);
                    w0Var.f9903s = null;
                    w0Var.f9904t = null;
                }
                Object obj = f3 == -4.0f ? w0Var.b().f9865d : w0Var.b().f9864c;
                w0Var.b().d(obj);
                w0Var.b().e(obj);
                w0Var.f(obj);
                w0Var.f9910z.i(w0Var.b().a());
            } else {
                w0Var.f9906v.i(f3);
            }
        }
        b1.w wVar2 = this.j;
        int size2 = wVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((z0) wVar2.get(i10)).j(f3);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.g.i(Long.MIN_VALUE);
        c1.b bVar = this.f9917a;
        ((j1) bVar.f1478d).setValue(Boolean.FALSE);
        boolean g = g();
        j1 j1Var = this.f9920d;
        if (!g || !Intrinsics.a(bVar.l(), obj) || !Intrinsics.a(j1Var.getValue(), obj2)) {
            if (!Intrinsics.a(bVar.l(), obj) && (bVar instanceof t)) {
                ((t) bVar).p(obj);
            }
            j1Var.setValue(obj2);
            this.f9925k.setValue(Boolean.TRUE);
            this.f9921e.setValue(new v0(obj, obj2));
        }
        b1.w wVar = this.j;
        int size = wVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            z0 z0Var = (z0) wVar.get(i3);
            z0Var.getClass();
            if (z0Var.g()) {
                z0Var.k(z0Var.f9917a.l(), z0Var.f9920d.getValue());
            }
        }
        b1.w wVar2 = this.f9924i;
        int size2 = wVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((w0) wVar2.get(i10)).e(0L);
        }
    }

    public final void l(long j) {
        h1 h1Var = this.g;
        if (h1Var.h() == Long.MIN_VALUE) {
            h1Var.i(j);
        }
        n(j);
        this.f9923h.setValue(Boolean.FALSE);
        b1.w wVar = this.f9924i;
        int size = wVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((w0) wVar.get(i3)).e(j);
        }
        b1.w wVar2 = this.j;
        int size2 = wVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            z0 z0Var = (z0) wVar2.get(i10);
            if (!Intrinsics.a(z0Var.f9920d.getValue(), z0Var.f9917a.l())) {
                z0Var.l(j);
            }
        }
    }

    public final void m(a0 a0Var) {
        b1.w wVar = this.f9924i;
        int size = wVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            w0 w0Var = (w0) wVar.get(i3);
            j1 j1Var = w0Var.f9908x;
            if (!Intrinsics.a(w0Var.b().f9864c, w0Var.b().f9865d)) {
                w0Var.f9904t = w0Var.b();
                w0Var.f9903s = a0Var;
            }
            w0Var.f9902r.setValue(new q0(w0Var.B, w0Var.f9899d, j1Var.getValue(), j1Var.getValue(), w0Var.f9909y.c()));
            w0Var.f9910z.i(w0Var.b().a());
            w0Var.f9907w = true;
        }
        b1.w wVar2 = this.j;
        int size2 = wVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((z0) wVar2.get(i10)).m(a0Var);
        }
    }

    public final void n(long j) {
        if (this.f9918b == null) {
            this.f9922f.i(j);
        }
    }

    public final void o() {
        q0 q0Var;
        b1.w wVar = this.f9924i;
        int size = wVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            w0 w0Var = (w0) wVar.get(i3);
            a0 a0Var = w0Var.f9903s;
            if (a0Var != null && (q0Var = w0Var.f9904t) != null) {
                long b10 = yd.c.b(a0Var.g * a0Var.f9727d);
                Object b11 = q0Var.b(b10);
                if (w0Var.f9907w) {
                    w0Var.b().e(b11);
                }
                w0Var.b().d(b11);
                w0Var.f9910z.i(w0Var.b().a());
                if (w0Var.f9906v.h() == -2.0f || w0Var.f9907w) {
                    w0Var.f(b11);
                } else {
                    w0Var.e(w0Var.C.e());
                }
                if (b10 >= a0Var.g) {
                    w0Var.f9903s = null;
                    w0Var.f9904t = null;
                } else {
                    a0Var.f9726c = false;
                }
            }
        }
        b1.w wVar2 = this.j;
        int size2 = wVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((z0) wVar2.get(i10)).o();
        }
    }

    public final void p(Object obj) {
        j1 j1Var = this.f9920d;
        if (Intrinsics.a(j1Var.getValue(), obj)) {
            return;
        }
        this.f9921e.setValue(new v0(j1Var.getValue(), obj));
        c1.b bVar = this.f9917a;
        if (!Intrinsics.a(bVar.l(), j1Var.getValue())) {
            bVar.p(j1Var.getValue());
        }
        j1Var.setValue(obj);
        if (this.g.h() == Long.MIN_VALUE) {
            this.f9923h.setValue(Boolean.TRUE);
        }
        b1.w wVar = this.f9924i;
        int size = wVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((w0) wVar.get(i3)).f9906v.i(-2.0f);
        }
    }

    public final String toString() {
        b1.w wVar = this.f9924i;
        int size = wVar.size();
        String str = "Transition animation values: ";
        for (int i3 = 0; i3 < size; i3++) {
            str = str + ((w0) wVar.get(i3)) + ", ";
        }
        return str;
    }
}
