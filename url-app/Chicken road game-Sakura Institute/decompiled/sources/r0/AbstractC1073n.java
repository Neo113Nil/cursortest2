package r0;

import G.C0223t;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;

/* renamed from: r0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1073n extends S.n {

    /* renamed from: t, reason: collision with root package name */
    public final int f9825t = b0.f(this);

    /* renamed from: u, reason: collision with root package name */
    public S.n f9826u;

    @Override // S.n
    public final void A0(a0 a0Var) {
        this.f3985n = a0Var;
        for (S.n nVar = this.f9826u; nVar != null; nVar = nVar.f3983l) {
            nVar.A0(a0Var);
        }
    }

    public final void B0(InterfaceC1072m interfaceC1072m) {
        S.n nVar = ((S.n) interfaceC1072m).f3978d;
        if (nVar != interfaceC1072m) {
            S.n nVar2 = interfaceC1072m instanceof S.n ? (S.n) interfaceC1072m : null;
            S.n nVar3 = nVar2 != null ? nVar2.f3982k : null;
            if (nVar != this.f3978d || !Intrinsics.a(nVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (nVar.f3990s) {
            AbstractC0864b.D("Cannot delegate to an already attached node");
            throw null;
        }
        nVar.z0(this.f3978d);
        int i2 = this.f3980i;
        int g4 = b0.g(nVar);
        nVar.f3980i = g4;
        int i4 = this.f3980i;
        int i5 = g4 & 2;
        if (i5 != 0 && (i4 & 2) != 0 && !(this instanceof InterfaceC1081w)) {
            AbstractC0864b.D("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + nVar);
            throw null;
        }
        nVar.f3983l = this.f9826u;
        this.f9826u = nVar;
        nVar.f3982k = this;
        D0(g4 | i4, false);
        if (this.f3990s) {
            if (i5 == 0 || (i2 & 2) != 0) {
                A0(this.f3985n);
            } else {
                C0223t c0223t = AbstractC1065f.v(this).B;
                this.f3978d.A0(null);
                c0223t.k();
            }
            nVar.r0();
            nVar.x0();
            b0.a(nVar);
        }
    }

    public final void C0(InterfaceC1072m interfaceC1072m) {
        S.n nVar = null;
        for (S.n nVar2 = this.f9826u; nVar2 != null; nVar2 = nVar2.f3983l) {
            if (nVar2 == interfaceC1072m) {
                boolean z4 = nVar2.f3990s;
                if (z4) {
                    i.v vVar = b0.f9773a;
                    if (!z4) {
                        AbstractC0864b.D("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                    b0.b(nVar2, -1, 2);
                    nVar2.y0();
                    nVar2.s0();
                }
                nVar2.z0(nVar2);
                nVar2.f3981j = 0;
                if (nVar == null) {
                    this.f9826u = nVar2.f3983l;
                } else {
                    nVar.f3983l = nVar2.f3983l;
                }
                nVar2.f3983l = null;
                nVar2.f3982k = null;
                int i2 = this.f3980i;
                int g4 = b0.g(this);
                D0(g4, true);
                if (this.f3990s && (i2 & 2) != 0 && (g4 & 2) == 0) {
                    C0223t c0223t = AbstractC1065f.v(this).B;
                    this.f3978d.A0(null);
                    c0223t.k();
                    return;
                }
                return;
            }
            nVar = nVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC1072m).toString());
    }

    public final void D0(int i2, boolean z4) {
        S.n nVar;
        int i4 = this.f3980i;
        this.f3980i = i2;
        if (i4 != i2) {
            S.n nVar2 = this.f3978d;
            if (nVar2 == this) {
                this.f3981j = i2;
            }
            if (this.f3990s) {
                S.n nVar3 = this;
                while (nVar3 != null) {
                    i2 |= nVar3.f3980i;
                    nVar3.f3980i = i2;
                    if (nVar3 == nVar2) {
                        break;
                    } else {
                        nVar3 = nVar3.f3982k;
                    }
                }
                if (z4 && nVar3 == nVar2) {
                    i2 = b0.g(nVar2);
                    nVar2.f3980i = i2;
                }
                int i5 = i2 | ((nVar3 == null || (nVar = nVar3.f3983l) == null) ? 0 : nVar.f3981j);
                while (nVar3 != null) {
                    i5 |= nVar3.f3980i;
                    nVar3.f3981j = i5;
                    nVar3 = nVar3.f3982k;
                }
            }
        }
    }

    @Override // S.n
    public final void r0() {
        super.r0();
        for (S.n nVar = this.f9826u; nVar != null; nVar = nVar.f3983l) {
            nVar.A0(this.f3985n);
            if (!nVar.f3990s) {
                nVar.r0();
            }
        }
    }

    @Override // S.n
    public final void s0() {
        for (S.n nVar = this.f9826u; nVar != null; nVar = nVar.f3983l) {
            nVar.s0();
        }
        super.s0();
    }

    @Override // S.n
    public final void w0() {
        super.w0();
        for (S.n nVar = this.f9826u; nVar != null; nVar = nVar.f3983l) {
            nVar.w0();
        }
    }

    @Override // S.n
    public final void x0() {
        for (S.n nVar = this.f9826u; nVar != null; nVar = nVar.f3983l) {
            nVar.x0();
        }
        super.x0();
    }

    @Override // S.n
    public final void y0() {
        super.y0();
        for (S.n nVar = this.f9826u; nVar != null; nVar = nVar.f3983l) {
            nVar.y0();
        }
    }

    @Override // S.n
    public final void z0(S.n nVar) {
        this.f3978d = nVar;
        for (S.n nVar2 = this.f9826u; nVar2 != null; nVar2 = nVar2.f3983l) {
            nVar2.z0(nVar);
        }
    }
}
