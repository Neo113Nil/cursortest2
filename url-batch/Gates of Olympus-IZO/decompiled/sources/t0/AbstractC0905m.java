package t0;

import I.C0120t;
import e2.AbstractC0381e;
import j.C0503u;

/* renamed from: t0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0905m extends U.k {

    /* renamed from: q, reason: collision with root package name */
    public final int f7936q = b0.f(this);

    /* renamed from: r, reason: collision with root package name */
    public U.k f7937r;

    @Override // U.k
    public final void l0() {
        super.l0();
        for (U.k kVar = this.f7937r; kVar != null; kVar = kVar.f3308i) {
            kVar.u0(this.f3310k);
            if (!kVar.p) {
                kVar.l0();
            }
        }
    }

    @Override // U.k
    public final void m0() {
        for (U.k kVar = this.f7937r; kVar != null; kVar = kVar.f3308i) {
            kVar.m0();
        }
        super.m0();
    }

    @Override // U.k
    public final void q0() {
        super.q0();
        for (U.k kVar = this.f7937r; kVar != null; kVar = kVar.f3308i) {
            kVar.q0();
        }
    }

    @Override // U.k
    public final void r0() {
        for (U.k kVar = this.f7937r; kVar != null; kVar = kVar.f3308i) {
            kVar.r0();
        }
        super.r0();
    }

    @Override // U.k
    public final void s0() {
        super.s0();
        for (U.k kVar = this.f7937r; kVar != null; kVar = kVar.f3308i) {
            kVar.s0();
        }
    }

    @Override // U.k
    public final void t0(U.k kVar) {
        this.f3303d = kVar;
        for (U.k kVar2 = this.f7937r; kVar2 != null; kVar2 = kVar2.f3308i) {
            kVar2.t0(kVar);
        }
    }

    @Override // U.k
    public final void u0(a0 a0Var) {
        this.f3310k = a0Var;
        for (U.k kVar = this.f7937r; kVar != null; kVar = kVar.f3308i) {
            kVar.u0(a0Var);
        }
    }

    public final void v0(InterfaceC0904l interfaceC0904l) {
        U.k kVar = ((U.k) interfaceC0904l).f3303d;
        if (kVar != interfaceC0904l) {
            U.k kVar2 = interfaceC0904l instanceof U.k ? (U.k) interfaceC0904l : null;
            U.k kVar3 = kVar2 != null ? kVar2.f3307h : null;
            if (kVar != this.f3303d || !Z1.i.a(kVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (kVar.p) {
            AbstractC0381e.N("Cannot delegate to an already attached node");
            throw null;
        }
        kVar.t0(this.f3303d);
        int i3 = this.f3305f;
        int g3 = b0.g(kVar);
        kVar.f3305f = g3;
        int i4 = this.f3305f;
        int i5 = g3 & 2;
        if (i5 != 0 && (i4 & 2) != 0 && !(this instanceof InterfaceC0914w)) {
            AbstractC0381e.N("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + kVar);
            throw null;
        }
        kVar.f3308i = this.f7937r;
        this.f7937r = kVar;
        kVar.f3307h = this;
        x0(g3 | i4, false);
        if (this.p) {
            if (i5 == 0 || (i3 & 2) != 0) {
                u0(this.f3310k);
            } else {
                C0120t c0120t = AbstractC0898f.t(this).f7735x;
                this.f3303d.u0(null);
                c0120t.k();
            }
            kVar.l0();
            kVar.r0();
            b0.a(kVar);
        }
    }

    public final void w0(InterfaceC0904l interfaceC0904l) {
        U.k kVar = null;
        for (U.k kVar2 = this.f7937r; kVar2 != null; kVar2 = kVar2.f3308i) {
            if (kVar2 == interfaceC0904l) {
                boolean z3 = kVar2.p;
                if (z3) {
                    C0503u c0503u = b0.f7890a;
                    if (!z3) {
                        AbstractC0381e.N("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                    b0.b(kVar2, -1, 2);
                    kVar2.s0();
                    kVar2.m0();
                }
                kVar2.t0(kVar2);
                kVar2.f3306g = 0;
                if (kVar == null) {
                    this.f7937r = kVar2.f3308i;
                } else {
                    kVar.f3308i = kVar2.f3308i;
                }
                kVar2.f3308i = null;
                kVar2.f3307h = null;
                int i3 = this.f3305f;
                int g3 = b0.g(this);
                x0(g3, true);
                if (this.p && (i3 & 2) != 0 && (g3 & 2) == 0) {
                    C0120t c0120t = AbstractC0898f.t(this).f7735x;
                    this.f3303d.u0(null);
                    c0120t.k();
                    return;
                }
                return;
            }
            kVar = kVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC0904l).toString());
    }

    public final void x0(int i3, boolean z3) {
        U.k kVar;
        int i4 = this.f3305f;
        this.f3305f = i3;
        if (i4 != i3) {
            U.k kVar2 = this.f3303d;
            if (kVar2 == this) {
                this.f3306g = i3;
            }
            if (this.p) {
                U.k kVar3 = this;
                while (kVar3 != null) {
                    i3 |= kVar3.f3305f;
                    kVar3.f3305f = i3;
                    if (kVar3 == kVar2) {
                        break;
                    } else {
                        kVar3 = kVar3.f3307h;
                    }
                }
                if (z3 && kVar3 == kVar2) {
                    i3 = b0.g(kVar2);
                    kVar2.f3305f = i3;
                }
                int i5 = i3 | ((kVar3 == null || (kVar = kVar3.f3308i) == null) ? 0 : kVar.f3306g);
                while (kVar3 != null) {
                    i5 |= kVar3.f3305f;
                    kVar3.f3306g = i5;
                    kVar3 = kVar3.f3307h;
                }
            }
        }
    }
}
