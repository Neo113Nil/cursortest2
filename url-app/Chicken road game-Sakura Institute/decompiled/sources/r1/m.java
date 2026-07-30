package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class m extends s0.n {

    /* renamed from: s, reason: collision with root package name */
    public final int f7852s = b1.f(this);

    /* renamed from: t, reason: collision with root package name */
    public s0.n f7853t;

    public final void A0(l lVar) {
        s0.n nVar = ((s0.n) lVar).f8104f;
        if (nVar != lVar) {
            s0.n nVar2 = lVar instanceof s0.n ? (s0.n) lVar : null;
            s0.n nVar3 = nVar2 != null ? nVar2.f8108j : null;
            if (nVar != this.f8104f || !r6.k.a(nVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (nVar.f8116r) {
            a.a.M("Cannot delegate to an already attached node");
            throw null;
        }
        nVar.y0(this.f8104f);
        int i7 = this.f8106h;
        int g9 = b1.g(nVar);
        nVar.f8106h = g9;
        int i8 = this.f8106h;
        int i9 = g9 & 2;
        if (i9 != 0 && (i8 & 2) != 0 && !(this instanceof w)) {
            a.a.M("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + nVar);
            throw null;
        }
        nVar.f8109k = this.f7853t;
        this.f7853t = nVar;
        nVar.f8108j = this;
        C0(g9 | i8, false);
        if (this.f8116r) {
            if (i9 == 0 || (i7 & 2) != 0) {
                z0(this.f8111m);
            } else {
                g0.t tVar = f.t(this).A;
                this.f8104f.z0(null);
                tVar.k();
            }
            nVar.q0();
            nVar.w0();
            b1.a(nVar);
        }
    }

    public final void B0(l lVar) {
        s0.n nVar = null;
        for (s0.n nVar2 = this.f7853t; nVar2 != null; nVar2 = nVar2.f8109k) {
            if (nVar2 == lVar) {
                boolean z8 = nVar2.f8116r;
                if (z8) {
                    i.u uVar = b1.f7713a;
                    if (!z8) {
                        a.a.M("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                    b1.b(nVar2, -1, 2);
                    nVar2.x0();
                    nVar2.r0();
                }
                nVar2.y0(nVar2);
                nVar2.f8107i = 0;
                if (nVar == null) {
                    this.f7853t = nVar2.f8109k;
                } else {
                    nVar.f8109k = nVar2.f8109k;
                }
                nVar2.f8109k = null;
                nVar2.f8108j = null;
                int i7 = this.f8106h;
                int g9 = b1.g(this);
                C0(g9, true);
                if (this.f8116r && (i7 & 2) != 0 && (g9 & 2) == 0) {
                    g0.t tVar = f.t(this).A;
                    this.f8104f.z0(null);
                    tVar.k();
                    return;
                }
                return;
            }
            nVar = nVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + lVar).toString());
    }

    public final void C0(int i7, boolean z8) {
        s0.n nVar;
        int i8 = this.f8106h;
        this.f8106h = i7;
        if (i8 != i7) {
            s0.n nVar2 = this.f8104f;
            if (nVar2 == this) {
                this.f8107i = i7;
            }
            if (this.f8116r) {
                s0.n nVar3 = this;
                while (nVar3 != null) {
                    i7 |= nVar3.f8106h;
                    nVar3.f8106h = i7;
                    if (nVar3 == nVar2) {
                        break;
                    } else {
                        nVar3 = nVar3.f8108j;
                    }
                }
                if (z8 && nVar3 == nVar2) {
                    i7 = b1.g(nVar2);
                    nVar2.f8106h = i7;
                }
                int i9 = i7 | ((nVar3 == null || (nVar = nVar3.f8109k) == null) ? 0 : nVar.f8107i);
                while (nVar3 != null) {
                    i9 |= nVar3.f8106h;
                    nVar3.f8107i = i9;
                    nVar3 = nVar3.f8108j;
                }
            }
        }
    }

    @Override // s0.n
    public final void q0() {
        super.q0();
        for (s0.n nVar = this.f7853t; nVar != null; nVar = nVar.f8109k) {
            nVar.z0(this.f8111m);
            if (!nVar.f8116r) {
                nVar.q0();
            }
        }
    }

    @Override // s0.n
    public final void r0() {
        for (s0.n nVar = this.f7853t; nVar != null; nVar = nVar.f8109k) {
            nVar.r0();
        }
        super.r0();
    }

    @Override // s0.n
    public final void v0() {
        super.v0();
        for (s0.n nVar = this.f7853t; nVar != null; nVar = nVar.f8109k) {
            nVar.v0();
        }
    }

    @Override // s0.n
    public final void w0() {
        for (s0.n nVar = this.f7853t; nVar != null; nVar = nVar.f8109k) {
            nVar.w0();
        }
        super.w0();
    }

    @Override // s0.n
    public final void x0() {
        super.x0();
        for (s0.n nVar = this.f7853t; nVar != null; nVar = nVar.f8109k) {
            nVar.x0();
        }
    }

    @Override // s0.n
    public final void y0(s0.n nVar) {
        this.f8104f = nVar;
        for (s0.n nVar2 = this.f7853t; nVar2 != null; nVar2 = nVar2.f8109k) {
            nVar2.y0(nVar);
        }
    }

    @Override // s0.n
    public final void z0(a1 a1Var) {
        this.f8111m = a1Var;
        for (s0.n nVar = this.f7853t; nVar != null; nVar = nVar.f8109k) {
            nVar.z0(a1Var);
        }
    }
}
