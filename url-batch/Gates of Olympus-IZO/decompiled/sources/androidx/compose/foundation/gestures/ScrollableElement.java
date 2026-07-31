package androidx.compose.foundation.gestures;

import H2.AbstractC0080b;
import U.k;
import Z1.i;
import n.e0;
import n0.v;
import o.C0729e;
import o.C0735k;
import o.C0737m;
import o.InterfaceC0728d;
import o.J;
import o.g0;
import o.h0;
import o.o0;
import q.j;
import t0.AbstractC0898f;
import t0.T;

/* loaded from: classes.dex */
final class ScrollableElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f3615a;

    /* renamed from: b, reason: collision with root package name */
    public final J f3616b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f3617c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3618d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3619e;

    /* renamed from: f, reason: collision with root package name */
    public final C0737m f3620f;

    /* renamed from: g, reason: collision with root package name */
    public final j f3621g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0728d f3622h;

    public ScrollableElement(e0 e0Var, InterfaceC0728d interfaceC0728d, C0737m c0737m, J j3, h0 h0Var, j jVar, boolean z3, boolean z4) {
        this.f3615a = h0Var;
        this.f3616b = j3;
        this.f3617c = e0Var;
        this.f3618d = z3;
        this.f3619e = z4;
        this.f3620f = c0737m;
        this.f3621g = jVar;
        this.f3622h = interfaceC0728d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return i.a(this.f3615a, scrollableElement.f3615a) && this.f3616b == scrollableElement.f3616b && i.a(this.f3617c, scrollableElement.f3617c) && this.f3618d == scrollableElement.f3618d && this.f3619e == scrollableElement.f3619e && i.a(this.f3620f, scrollableElement.f3620f) && i.a(this.f3621g, scrollableElement.f3621g) && i.a(this.f3622h, scrollableElement.f3622h);
    }

    @Override // t0.T
    public final k h() {
        e0 e0Var = this.f3617c;
        J j3 = this.f3616b;
        j jVar = this.f3621g;
        return new g0(e0Var, this.f3622h, this.f3620f, j3, this.f3615a, jVar, this.f3618d, this.f3619e);
    }

    public final int hashCode() {
        int hashCode = (this.f3616b.hashCode() + (this.f3615a.hashCode() * 31)) * 31;
        e0 e0Var = this.f3617c;
        int f3 = AbstractC0080b.f(AbstractC0080b.f((hashCode + (e0Var != null ? e0Var.hashCode() : 0)) * 31, 31, this.f3618d), 31, this.f3619e);
        C0737m c0737m = this.f3620f;
        int hashCode2 = (f3 + (c0737m != null ? c0737m.hashCode() : 0)) * 31;
        j jVar = this.f3621g;
        int hashCode3 = (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        InterfaceC0728d interfaceC0728d = this.f3622h;
        return hashCode3 + (interfaceC0728d != null ? interfaceC0728d.hashCode() : 0);
    }

    @Override // t0.T
    public final void i(k kVar) {
        boolean z3;
        v vVar;
        g0 g0Var = (g0) kVar;
        boolean z4 = g0Var.f6524u;
        boolean z5 = this.f3618d;
        boolean z6 = true;
        boolean z7 = false;
        if (z4 != z5) {
            g0Var.f6517G.f6478b = z5;
            g0Var.D.f6459q = z5;
            z3 = true;
        } else {
            z3 = false;
        }
        C0737m c0737m = this.f3620f;
        C0737m c0737m2 = c0737m == null ? g0Var.f6515E : c0737m;
        o0 o0Var = g0Var.f6516F;
        h0 h0Var = o0Var.f6592a;
        h0 h0Var2 = this.f3615a;
        if (!i.a(h0Var, h0Var2)) {
            o0Var.f6592a = h0Var2;
            z7 = true;
        }
        e0 e0Var = this.f3617c;
        o0Var.f6593b = e0Var;
        J j3 = o0Var.f6595d;
        J j4 = this.f3616b;
        if (j3 != j4) {
            o0Var.f6595d = j4;
            z7 = true;
        }
        boolean z8 = o0Var.f6596e;
        boolean z9 = this.f3619e;
        if (z8 != z9) {
            o0Var.f6596e = z9;
        } else {
            z6 = z7;
        }
        o0Var.f6594c = c0737m2;
        o0Var.f6597f = g0Var.C;
        C0735k c0735k = g0Var.f6518H;
        c0735k.f6549q = j4;
        c0735k.f6551s = z9;
        c0735k.f6552t = this.f3622h;
        g0Var.f6514A = e0Var;
        g0Var.B = c0737m;
        C0729e c0729e = C0729e.f6502g;
        J j5 = o0Var.f6595d;
        J j6 = J.f6443d;
        if (j5 != j6) {
            j6 = J.f6444e;
        }
        j jVar = this.f3621g;
        g0Var.f6523t = c0729e;
        boolean z10 = true;
        if (g0Var.f6524u != z5) {
            g0Var.f6524u = z5;
            if (!z5) {
                g0Var.B0();
                v vVar2 = g0Var.f6529z;
                if (vVar2 != null) {
                    g0Var.w0(vVar2);
                }
                g0Var.f6529z = null;
            }
            z6 = true;
        }
        if (!i.a(g0Var.f6525v, jVar)) {
            g0Var.B0();
            g0Var.f6525v = jVar;
        }
        if (g0Var.f6522s != j6) {
            g0Var.f6522s = j6;
        } else {
            z10 = z6;
        }
        if (z10 && (vVar = g0Var.f6529z) != null) {
            vVar.w0();
        }
        if (z3) {
            g0Var.f6520J = null;
            g0Var.f6521K = null;
            AbstractC0898f.o(g0Var);
        }
    }
}
