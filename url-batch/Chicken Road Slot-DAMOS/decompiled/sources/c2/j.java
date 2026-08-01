package c2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class j extends d1.k {
    public final int C = j1.e(this);
    public d1.k D;

    @Override // d1.k
    public final void D() {
        super.D();
        for (d1.k kVar = this.D; kVar != null; kVar = kVar.f3310t) {
            kVar.D();
        }
    }

    @Override // d1.k
    public final void E() {
        for (d1.k kVar = this.D; kVar != null; kVar = kVar.f3310t) {
            kVar.E();
        }
        super.E();
    }

    @Override // d1.k
    public final void F() {
        super.F();
        for (d1.k kVar = this.D; kVar != null; kVar = kVar.f3310t) {
            kVar.F();
        }
    }

    @Override // d1.k
    public final void G(d1.k kVar) {
        this.f3305d = kVar;
        for (d1.k kVar2 = this.D; kVar2 != null; kVar2 = kVar2.f3310t) {
            kVar2.G(kVar);
        }
    }

    @Override // d1.k
    public final void H(i1 i1Var) {
        this.f3312v = i1Var;
        for (d1.k kVar = this.D; kVar != null; kVar = kVar.f3310t) {
            kVar.H(i1Var);
        }
    }

    public final void I(i iVar) {
        d1.k kVar = ((d1.k) iVar).f3305d;
        if (kVar != iVar) {
            d1.k kVar2 = iVar instanceof d1.k ? (d1.k) iVar : null;
            d1.k kVar3 = kVar2 != null ? kVar2.f3309s : null;
            if (kVar == this.f3305d && Intrinsics.a(kVar3, this)) {
                return;
            }
            kotlin.collections.i0.l("Cannot delegate to an already delegated node");
            return;
        }
        if (kVar.B) {
            z1.a.b("Cannot delegate to an already attached node");
        }
        kVar.G(this.f3305d);
        int i3 = this.f3307i;
        int f3 = j1.f(kVar);
        kVar.f3307i = f3;
        int i10 = this.f3307i;
        int i11 = f3 & 2;
        if (i11 != 0 && (i10 & 2) != 0 && !(this instanceof v)) {
            z1.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + kVar);
        }
        kVar.f3310t = this.D;
        this.D = kVar;
        kVar.f3309s = this;
        K(f3 | this.f3307i, false);
        if (this.B) {
            if (i11 == 0 || (i3 & 2) != 0) {
                H(this.f3312v);
            } else {
                b1 b1Var = k.u(this).S;
                this.f3305d.H(null);
                b1Var.g();
            }
            kVar.y();
            kVar.E();
            if (!kVar.B) {
                z1.a.b("autoInvalidateInsertedNode called on unattached node");
            }
            j1.a(kVar, -1, 1);
        }
    }

    public final void J(i iVar) {
        d1.k kVar = null;
        for (d1.k kVar2 = this.D; kVar2 != null; kVar2 = kVar2.f3310t) {
            if (kVar2 == iVar) {
                boolean z10 = kVar2.B;
                if (z10) {
                    s.c0 c0Var = j1.f1591a;
                    if (!z10) {
                        z1.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    j1.a(kVar2, -1, 2);
                    kVar2.F();
                    kVar2.z();
                }
                kVar2.G(kVar2);
                kVar2.f3308r = 0;
                d1.k kVar3 = kVar2.f3310t;
                if (kVar == null) {
                    this.D = kVar3;
                } else {
                    kVar.f3310t = kVar3;
                }
                kVar2.f3310t = null;
                kVar2.f3309s = null;
                int i3 = this.f3307i;
                int f3 = j1.f(this);
                K(f3, true);
                if (this.B && (i3 & 2) != 0 && (f3 & 2) == 0) {
                    b1 b1Var = k.u(this).S;
                    this.f3305d.H(null);
                    b1Var.g();
                    return;
                }
                return;
            }
            kVar = kVar2;
        }
        a2.r.n(iVar, "Could not find delegate: ");
    }

    public final void K(int i3, boolean z10) {
        d1.k kVar;
        int i10 = this.f3307i;
        this.f3307i = i3;
        if (i10 != i3) {
            d1.k kVar2 = this.f3305d;
            if (kVar2 == this) {
                this.f3308r = i3;
            }
            if (this.B) {
                d1.k kVar3 = this;
                while (kVar3 != null) {
                    i3 |= kVar3.f3307i;
                    kVar3.f3307i = i3;
                    if (kVar3 == kVar2) {
                        break;
                    } else {
                        kVar3 = kVar3.f3309s;
                    }
                }
                if (z10 && kVar3 == kVar2) {
                    i3 = j1.f(kVar2);
                    kVar2.f3307i = i3;
                }
                int i11 = i3 | ((kVar3 == null || (kVar = kVar3.f3310t) == null) ? 0 : kVar.f3308r);
                while (kVar3 != null) {
                    i11 |= kVar3.f3307i;
                    kVar3.f3308r = i11;
                    kVar3 = kVar3.f3309s;
                }
            }
        }
    }

    @Override // d1.k
    public final void y() {
        super.y();
        for (d1.k kVar = this.D; kVar != null; kVar = kVar.f3310t) {
            kVar.H(this.f3312v);
            if (!kVar.B) {
                kVar.y();
            }
        }
    }

    @Override // d1.k
    public final void z() {
        for (d1.k kVar = this.D; kVar != null; kVar = kVar.f3310t) {
            kVar.z();
        }
        super.z();
    }
}
