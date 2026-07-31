package androidx.compose.foundation.gestures;

import U.p;
import f2.j;
import n.l0;
import n0.C0702C;
import p.C0759e;
import p.C0771k;
import p.C0775m;
import p.C0776m0;
import p.C0793v0;
import p.InterfaceC0757d;
import p.InterfaceC0778n0;
import p.P;
import q.k;
import t0.AbstractC0993f;
import t0.U;

/* loaded from: classes.dex */
final class ScrollableElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0778n0 f4793a;

    /* renamed from: b, reason: collision with root package name */
    public final P f4794b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f4795c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4796d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4797e;

    /* renamed from: f, reason: collision with root package name */
    public final C0775m f4798f;

    /* renamed from: g, reason: collision with root package name */
    public final k f4799g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0757d f4800h;

    public ScrollableElement(l0 l0Var, InterfaceC0757d interfaceC0757d, C0775m c0775m, P p3, InterfaceC0778n0 interfaceC0778n0, k kVar, boolean z3, boolean z4) {
        this.f4793a = interfaceC0778n0;
        this.f4794b = p3;
        this.f4795c = l0Var;
        this.f4796d = z3;
        this.f4797e = z4;
        this.f4798f = c0775m;
        this.f4799g = kVar;
        this.f4800h = interfaceC0757d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return j.a(this.f4793a, scrollableElement.f4793a) && this.f4794b == scrollableElement.f4794b && j.a(this.f4795c, scrollableElement.f4795c) && this.f4796d == scrollableElement.f4796d && this.f4797e == scrollableElement.f4797e && j.a(this.f4798f, scrollableElement.f4798f) && j.a(this.f4799g, scrollableElement.f4799g) && j.a(this.f4800h, scrollableElement.f4800h);
    }

    public final int hashCode() {
        int hashCode = (this.f4794b.hashCode() + (this.f4793a.hashCode() * 31)) * 31;
        l0 l0Var = this.f4795c;
        int e3 = A.k.e(A.k.e((hashCode + (l0Var != null ? l0Var.hashCode() : 0)) * 31, 31, this.f4796d), 31, this.f4797e);
        C0775m c0775m = this.f4798f;
        int hashCode2 = (e3 + (c0775m != null ? c0775m.hashCode() : 0)) * 31;
        k kVar = this.f4799g;
        int hashCode3 = (hashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        InterfaceC0757d interfaceC0757d = this.f4800h;
        return hashCode3 + (interfaceC0757d != null ? interfaceC0757d.hashCode() : 0);
    }

    @Override // t0.U
    public final p l() {
        k kVar = this.f4799g;
        return new C0776m0(this.f4795c, this.f4800h, this.f4798f, this.f4794b, this.f4793a, kVar, this.f4796d, this.f4797e);
    }

    @Override // t0.U
    public final void m(p pVar) {
        boolean z3;
        C0702C c0702c;
        C0776m0 c0776m0 = (C0776m0) pVar;
        boolean z4 = c0776m0.f7728u;
        boolean z5 = this.f4796d;
        boolean z6 = true;
        boolean z7 = false;
        if (z4 != z5) {
            c0776m0.f7721G.f7650a = z5;
            c0776m0.D.f7615q = z5;
            z3 = true;
        } else {
            z3 = false;
        }
        C0775m c0775m = this.f4798f;
        C0775m c0775m2 = c0775m == null ? c0776m0.f7719E : c0775m;
        C0793v0 c0793v0 = c0776m0.f7720F;
        InterfaceC0778n0 interfaceC0778n0 = c0793v0.f7778a;
        InterfaceC0778n0 interfaceC0778n02 = this.f4793a;
        if (!j.a(interfaceC0778n0, interfaceC0778n02)) {
            c0793v0.f7778a = interfaceC0778n02;
            z7 = true;
        }
        l0 l0Var = this.f4795c;
        c0793v0.f7779b = l0Var;
        P p3 = c0793v0.f7781d;
        P p4 = this.f4794b;
        if (p3 != p4) {
            c0793v0.f7781d = p4;
            z7 = true;
        }
        boolean z8 = c0793v0.f7782e;
        boolean z9 = this.f4797e;
        if (z8 != z9) {
            c0793v0.f7782e = z9;
        } else {
            z6 = z7;
        }
        c0793v0.f7780c = c0775m2;
        c0793v0.f7783f = c0776m0.C;
        C0771k c0771k = c0776m0.f7722H;
        c0771k.f7692q = p4;
        c0771k.f7694s = z9;
        c0771k.f7695t = this.f4800h;
        c0776m0.f7717A = l0Var;
        c0776m0.f7718B = c0775m;
        C0759e c0759e = C0759e.f7657g;
        P p5 = c0793v0.f7781d;
        P p6 = P.f7567d;
        if (p5 != p6) {
            p6 = P.f7568e;
        }
        k kVar = this.f4799g;
        c0776m0.f7727t = c0759e;
        boolean z10 = true;
        if (c0776m0.f7728u != z5) {
            c0776m0.f7728u = z5;
            if (!z5) {
                c0776m0.E0();
                C0702C c0702c2 = c0776m0.f7733z;
                if (c0702c2 != null) {
                    c0776m0.z0(c0702c2);
                }
                c0776m0.f7733z = null;
            }
            z6 = true;
        }
        if (!j.a(c0776m0.f7729v, kVar)) {
            c0776m0.E0();
            c0776m0.f7729v = kVar;
        }
        if (c0776m0.f7726s != p6) {
            c0776m0.f7726s = p6;
        } else {
            z10 = z6;
        }
        if (z10 && (c0702c = c0776m0.f7733z) != null) {
            c0702c.A0();
        }
        if (z3) {
            c0776m0.f7724J = null;
            c0776m0.f7725K = null;
            AbstractC0993f.o(c0776m0);
        }
    }
}
