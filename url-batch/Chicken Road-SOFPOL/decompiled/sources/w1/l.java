package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class l extends y0.l {

    /* renamed from: r, reason: collision with root package name */
    public final int f7706r = e1.e(this);

    /* renamed from: s, reason: collision with root package name */
    public y0.l f7707s;

    @Override // y0.l
    public final void h0() {
        super.h0();
        for (y0.l lVar = this.f7707s; lVar != null; lVar = lVar.i) {
            lVar.q0(this.f8712k);
            if (!lVar.f8718q) {
                lVar.h0();
            }
        }
    }

    @Override // y0.l
    public final void i0() {
        for (y0.l lVar = this.f7707s; lVar != null; lVar = lVar.i) {
            lVar.i0();
        }
        super.i0();
    }

    @Override // y0.l
    public final void m0() {
        super.m0();
        for (y0.l lVar = this.f7707s; lVar != null; lVar = lVar.i) {
            lVar.m0();
        }
    }

    @Override // y0.l
    public final void n0() {
        for (y0.l lVar = this.f7707s; lVar != null; lVar = lVar.i) {
            lVar.n0();
        }
        super.n0();
    }

    @Override // y0.l
    public final void o0() {
        super.o0();
        for (y0.l lVar = this.f7707s; lVar != null; lVar = lVar.i) {
            lVar.o0();
        }
    }

    @Override // y0.l
    public final void p0(y0.l lVar) {
        this.f8706d = lVar;
        for (y0.l lVar2 = this.f7707s; lVar2 != null; lVar2 = lVar2.i) {
            lVar2.p0(lVar);
        }
    }

    @Override // y0.l
    public final void q0(d1 d1Var) {
        this.f8712k = d1Var;
        for (y0.l lVar = this.f7707s; lVar != null; lVar = lVar.i) {
            lVar.q0(d1Var);
        }
    }

    public final k r0(k kVar) {
        y0.l lVar = ((y0.l) kVar).f8706d;
        if (lVar != kVar) {
            y0.l lVar2 = kVar instanceof y0.l ? (y0.l) kVar : null;
            y0.l lVar3 = lVar2 != null ? lVar2.f8710h : null;
            if (lVar != this.f8706d || !q6.i.a(lVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (lVar.f8718q) {
                t1.a.b("Cannot delegate to an already attached node");
            }
            lVar.p0(this.f8706d);
            int i = this.f8708f;
            int f6 = e1.f(lVar);
            lVar.f8708f = f6;
            int i8 = this.f8708f;
            int i9 = f6 & 2;
            if (i9 != 0 && (i8 & 2) != 0 && !(this instanceof v)) {
                t1.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + lVar);
            }
            lVar.i = this.f7707s;
            this.f7707s = lVar;
            lVar.f8710h = this;
            t0(f6 | this.f8708f, false);
            if (this.f8718q) {
                if (i9 == 0 || (i & 2) != 0) {
                    q0(this.f8712k);
                } else {
                    b1 b1Var = f.u(this).F;
                    this.f8706d.q0(null);
                    b1Var.g();
                }
                lVar.h0();
                lVar.n0();
                if (!lVar.f8718q) {
                    t1.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                e1.a(lVar, -1, 1);
            }
        }
        return kVar;
    }

    public final void s0(k kVar) {
        y0.l lVar = null;
        for (y0.l lVar2 = this.f7707s; lVar2 != null; lVar2 = lVar2.i) {
            if (lVar2 == kVar) {
                boolean z3 = lVar2.f8718q;
                if (z3) {
                    o.d0 d0Var = e1.f7636a;
                    if (!z3) {
                        t1.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    e1.a(lVar2, -1, 2);
                    lVar2.o0();
                    lVar2.i0();
                }
                lVar2.p0(lVar2);
                lVar2.f8709g = 0;
                if (lVar == null) {
                    this.f7707s = lVar2.i;
                } else {
                    lVar.i = lVar2.i;
                }
                lVar2.i = null;
                lVar2.f8710h = null;
                int i = this.f8708f;
                int f6 = e1.f(this);
                t0(f6, true);
                if (this.f8718q && (i & 2) != 0 && (f6 & 2) == 0) {
                    b1 b1Var = f.u(this).F;
                    this.f8706d.q0(null);
                    b1Var.g();
                    return;
                }
                return;
            }
            lVar = lVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + kVar).toString());
    }

    public final void t0(int i, boolean z3) {
        y0.l lVar;
        int i8 = this.f8708f;
        this.f8708f = i;
        if (i8 != i) {
            y0.l lVar2 = this.f8706d;
            if (lVar2 == this) {
                this.f8709g = i;
            }
            if (this.f8718q) {
                y0.l lVar3 = this;
                while (lVar3 != null) {
                    i |= lVar3.f8708f;
                    lVar3.f8708f = i;
                    if (lVar3 == lVar2) {
                        break;
                    } else {
                        lVar3 = lVar3.f8710h;
                    }
                }
                if (z3 && lVar3 == lVar2) {
                    i = e1.f(lVar2);
                    lVar2.f8708f = i;
                }
                int i9 = i | ((lVar3 == null || (lVar = lVar3.i) == null) ? 0 : lVar.f8709g);
                while (lVar3 != null) {
                    i9 |= lVar3.f8708f;
                    lVar3.f8709g = i9;
                    lVar3 = lVar3.f8710h;
                }
            }
        }
    }
}
