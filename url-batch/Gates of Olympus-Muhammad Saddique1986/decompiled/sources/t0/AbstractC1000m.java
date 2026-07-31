package t0;

import I.C0174t;
import j.C0547u;
import n.z0;

/* renamed from: t0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1000m extends U.p {

    /* renamed from: q, reason: collision with root package name */
    public final int f8770q = c0.f(this);

    /* renamed from: r, reason: collision with root package name */
    public U.p f8771r;

    public final void A0(int i3, boolean z3) {
        U.p pVar;
        int i4 = this.f4491f;
        this.f4491f = i3;
        if (i4 != i3) {
            U.p pVar2 = this.f4489d;
            if (pVar2 == this) {
                this.f4492g = i3;
            }
            if (this.f4501p) {
                U.p pVar3 = this;
                while (pVar3 != null) {
                    i3 |= pVar3.f4491f;
                    pVar3.f4491f = i3;
                    if (pVar3 == pVar2) {
                        break;
                    } else {
                        pVar3 = pVar3.f4493h;
                    }
                }
                if (z3 && pVar3 == pVar2) {
                    i3 = c0.g(pVar2);
                    pVar2.f4491f = i3;
                }
                int i5 = i3 | ((pVar3 == null || (pVar = pVar3.f4494i) == null) ? 0 : pVar.f4492g);
                while (pVar3 != null) {
                    i5 |= pVar3.f4491f;
                    pVar3.f4492g = i5;
                    pVar3 = pVar3.f4493h;
                }
            }
        }
    }

    @Override // U.p
    public final void o0() {
        super.o0();
        for (U.p pVar = this.f8771r; pVar != null; pVar = pVar.f4494i) {
            pVar.x0(this.f4496k);
            if (!pVar.f4501p) {
                pVar.o0();
            }
        }
    }

    @Override // U.p
    public final void p0() {
        for (U.p pVar = this.f8771r; pVar != null; pVar = pVar.f4494i) {
            pVar.p0();
        }
        super.p0();
    }

    @Override // U.p
    public final void t0() {
        super.t0();
        for (U.p pVar = this.f8771r; pVar != null; pVar = pVar.f4494i) {
            pVar.t0();
        }
    }

    @Override // U.p
    public final void u0() {
        for (U.p pVar = this.f8771r; pVar != null; pVar = pVar.f4494i) {
            pVar.u0();
        }
        super.u0();
    }

    @Override // U.p
    public final void v0() {
        super.v0();
        for (U.p pVar = this.f8771r; pVar != null; pVar = pVar.f4494i) {
            pVar.v0();
        }
    }

    @Override // U.p
    public final void w0(U.p pVar) {
        this.f4489d = pVar;
        for (U.p pVar2 = this.f8771r; pVar2 != null; pVar2 = pVar2.f4494i) {
            pVar2.w0(pVar);
        }
    }

    @Override // U.p
    public final void x0(b0 b0Var) {
        this.f4496k = b0Var;
        for (U.p pVar = this.f8771r; pVar != null; pVar = pVar.f4494i) {
            pVar.x0(b0Var);
        }
    }

    public final void y0(InterfaceC0999l interfaceC0999l) {
        U.p pVar = ((U.p) interfaceC0999l).f4489d;
        if (pVar != interfaceC0999l) {
            U.p pVar2 = interfaceC0999l instanceof U.p ? (U.p) interfaceC0999l : null;
            U.p pVar3 = pVar2 != null ? pVar2.f4493h : null;
            if (pVar != this.f4489d || !f2.j.a(pVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (pVar.f4501p) {
            z0.o("Cannot delegate to an already attached node");
            throw null;
        }
        pVar.w0(this.f4489d);
        int i3 = this.f4491f;
        int g3 = c0.g(pVar);
        pVar.f4491f = g3;
        int i4 = this.f4491f;
        int i5 = g3 & 2;
        if (i5 != 0 && (i4 & 2) != 0 && !(this instanceof InterfaceC1009w)) {
            z0.o("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + pVar);
            throw null;
        }
        pVar.f4494i = this.f8771r;
        this.f8771r = pVar;
        pVar.f4493h = this;
        A0(g3 | i4, false);
        if (this.f4501p) {
            if (i5 == 0 || (i3 & 2) != 0) {
                x0(this.f4496k);
            } else {
                C0174t c0174t = AbstractC0993f.t(this).f8561y;
                this.f4489d.x0(null);
                c0174t.k();
            }
            pVar.o0();
            pVar.u0();
            c0.a(pVar);
        }
    }

    public final void z0(InterfaceC0999l interfaceC0999l) {
        U.p pVar = null;
        for (U.p pVar2 = this.f8771r; pVar2 != null; pVar2 = pVar2.f4494i) {
            if (pVar2 == interfaceC0999l) {
                boolean z3 = pVar2.f4501p;
                if (z3) {
                    C0547u c0547u = c0.f8726a;
                    if (!z3) {
                        z0.o("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                    c0.b(pVar2, -1, 2);
                    pVar2.v0();
                    pVar2.p0();
                }
                pVar2.w0(pVar2);
                pVar2.f4492g = 0;
                if (pVar == null) {
                    this.f8771r = pVar2.f4494i;
                } else {
                    pVar.f4494i = pVar2.f4494i;
                }
                pVar2.f4494i = null;
                pVar2.f4493h = null;
                int i3 = this.f4491f;
                int g3 = c0.g(this);
                A0(g3, true);
                if (this.f4501p && (i3 & 2) != 0 && (g3 & 2) == 0) {
                    C0174t c0174t = AbstractC0993f.t(this).f8561y;
                    this.f4489d.x0(null);
                    c0174t.k();
                    return;
                }
                return;
            }
            pVar = pVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC0999l).toString());
    }
}
