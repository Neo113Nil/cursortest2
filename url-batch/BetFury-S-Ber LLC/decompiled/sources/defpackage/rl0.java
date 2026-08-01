package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class rl0 extends vn0 {
    public mj k;
    public r8 l;

    @Override // defpackage.jj
    public final void a(jj jjVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (ql0.a[this.j.ordinal()] == 3) {
            rf rfVar = this.b;
            l(rfVar.J, rfVar.L, 1);
            return;
        }
        ck ckVar = this.e;
        if (ckVar.c && !ckVar.j && this.d == qf.MATCH_CONSTRAINT) {
            rf rfVar2 = this.b;
            int i2 = rfVar2.s;
            if (i2 == 2) {
                rf rfVar3 = rfVar2.U;
                if (rfVar3 != null) {
                    if (rfVar3.e.e.j) {
                        ckVar.d((int) ((r1.g * rfVar2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                ck ckVar2 = rfVar2.d.e;
                if (ckVar2.j) {
                    int i3 = rfVar2.Y;
                    if (i3 == -1) {
                        f = ckVar2.g;
                        f2 = rfVar2.X;
                    } else if (i3 == 0) {
                        f3 = ckVar2.g * rfVar2.X;
                        i = (int) (f3 + 0.5f);
                        ckVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        ckVar.d(i);
                    } else {
                        f = ckVar2.g;
                        f2 = rfVar2.X;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    ckVar.d(i);
                }
            }
        }
        mj mjVar = this.h;
        boolean z = mjVar.c;
        ArrayList arrayList = mjVar.l;
        if (z) {
            mj mjVar2 = this.i;
            boolean z2 = mjVar2.c;
            ArrayList arrayList2 = mjVar2.l;
            if (z2) {
                if (mjVar.j && mjVar2.j && ckVar.j) {
                    return;
                }
                if (!ckVar.j && this.d == qf.MATCH_CONSTRAINT) {
                    rf rfVar4 = this.b;
                    if (rfVar4.r == 0 && !rfVar4.y()) {
                        mj mjVar3 = (mj) arrayList.get(0);
                        mj mjVar4 = (mj) arrayList2.get(0);
                        int i4 = mjVar3.g + mjVar.f;
                        int i5 = mjVar4.g + mjVar2.f;
                        mjVar.d(i4);
                        mjVar2.d(i5);
                        ckVar.d(i5 - i4);
                        return;
                    }
                }
                if (!ckVar.j && this.d == qf.MATCH_CONSTRAINT && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    mj mjVar5 = (mj) arrayList.get(0);
                    int i6 = (((mj) arrayList2.get(0)).g + mjVar2.f) - (mjVar5.g + mjVar.f);
                    int i7 = ckVar.m;
                    if (i6 < i7) {
                        ckVar.d(i6);
                    } else {
                        ckVar.d(i7);
                    }
                }
                if (ckVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    mj mjVar6 = (mj) arrayList.get(0);
                    mj mjVar7 = (mj) arrayList2.get(0);
                    int i8 = mjVar6.g;
                    int i9 = mjVar.f + i8;
                    int i10 = mjVar7.g;
                    int i11 = mjVar2.f + i10;
                    float f4 = this.b.f0;
                    if (mjVar6 == mjVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    mjVar.d((int) ((((i10 - i8) - ckVar.g) * f4) + i8 + 0.5f));
                    mjVar2.d(mjVar.g + ckVar.g);
                }
            }
        }
    }

    @Override // defpackage.vn0
    public final void d() {
        rf rfVar;
        rf rfVar2;
        rf rfVar3;
        rf rfVar4;
        mj mjVar = this.k;
        rf rfVar5 = this.b;
        boolean z = rfVar5.a;
        ck ckVar = this.e;
        if (z) {
            ckVar.d(rfVar5.k());
        }
        boolean z2 = ckVar.j;
        ArrayList arrayList = ckVar.k;
        ArrayList arrayList2 = ckVar.l;
        mj mjVar2 = this.i;
        mj mjVar3 = this.h;
        if (!z2) {
            rf rfVar6 = this.b;
            this.d = rfVar6.T[1];
            if (rfVar6.E) {
                this.l = new r8(this);
            }
            qf qfVar = this.d;
            if (qfVar != qf.MATCH_CONSTRAINT) {
                if (qfVar == qf.MATCH_PARENT && (rfVar4 = this.b.U) != null && rfVar4.T[1] == qf.FIXED) {
                    int k = (rfVar4.k() - this.b.J.e()) - this.b.L.e();
                    vn0.b(mjVar3, rfVar4.e.h, this.b.J.e());
                    vn0.b(mjVar2, rfVar4.e.i, -this.b.L.e());
                    ckVar.d(k);
                    return;
                }
                if (qfVar == qf.FIXED) {
                    ckVar.d(this.b.k());
                }
            }
        } else if (this.d == qf.MATCH_PARENT && (rfVar2 = (rfVar = this.b).U) != null && rfVar2.T[1] == qf.FIXED) {
            vn0.b(mjVar3, rfVar2.e.h, rfVar.J.e());
            vn0.b(mjVar2, rfVar2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = ckVar.j;
        if (z3) {
            rf rfVar7 = this.b;
            if (rfVar7.a) {
                xe[] xeVarArr = rfVar7.Q;
                xe xeVar = xeVarArr[2];
                xe xeVar2 = xeVar.f;
                if (xeVar2 != null && xeVarArr[3].f != null) {
                    boolean y = rfVar7.y();
                    rf rfVar8 = this.b;
                    if (y) {
                        mjVar3.f = rfVar8.Q[2].e();
                        mjVar2.f = -this.b.Q[3].e();
                    } else {
                        mj h = vn0.h(rfVar8.Q[2]);
                        if (h != null) {
                            vn0.b(mjVar3, h, this.b.Q[2].e());
                        }
                        mj h2 = vn0.h(this.b.Q[3]);
                        if (h2 != null) {
                            vn0.b(mjVar2, h2, -this.b.Q[3].e());
                        }
                        mjVar3.b = true;
                        mjVar2.b = true;
                    }
                    rf rfVar9 = this.b;
                    if (rfVar9.E) {
                        vn0.b(mjVar, mjVar3, rfVar9.b0);
                        return;
                    }
                    return;
                }
                if (xeVar2 != null) {
                    mj h3 = vn0.h(xeVar);
                    if (h3 != null) {
                        vn0.b(mjVar3, h3, this.b.Q[2].e());
                        vn0.b(mjVar2, mjVar3, ckVar.g);
                        rf rfVar10 = this.b;
                        if (rfVar10.E) {
                            vn0.b(mjVar, mjVar3, rfVar10.b0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                xe xeVar3 = xeVarArr[3];
                if (xeVar3.f != null) {
                    mj h4 = vn0.h(xeVar3);
                    if (h4 != null) {
                        vn0.b(mjVar2, h4, -this.b.Q[3].e());
                        vn0.b(mjVar3, mjVar2, -ckVar.g);
                    }
                    rf rfVar11 = this.b;
                    if (rfVar11.E) {
                        vn0.b(mjVar, mjVar3, rfVar11.b0);
                        return;
                    }
                    return;
                }
                xe xeVar4 = xeVarArr[4];
                if (xeVar4.f != null) {
                    mj h5 = vn0.h(xeVar4);
                    if (h5 != null) {
                        vn0.b(mjVar, h5, 0);
                        vn0.b(mjVar3, mjVar, -this.b.b0);
                        vn0.b(mjVar2, mjVar3, ckVar.g);
                        return;
                    }
                    return;
                }
                if ((rfVar7 instanceof dt) || rfVar7.U == null || rfVar7.i(we.CENTER).f != null) {
                    return;
                }
                rf rfVar12 = this.b;
                vn0.b(mjVar3, rfVar12.U.e.h, rfVar12.s());
                vn0.b(mjVar2, mjVar3, ckVar.g);
                rf rfVar13 = this.b;
                if (rfVar13.E) {
                    vn0.b(mjVar, mjVar3, rfVar13.b0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != qf.MATCH_CONSTRAINT) {
            ckVar.b(this);
        } else {
            rf rfVar14 = this.b;
            int i = rfVar14.s;
            if (i == 2) {
                rf rfVar15 = rfVar14.U;
                if (rfVar15 != null) {
                    ck ckVar2 = rfVar15.e.e;
                    arrayList2.add(ckVar2);
                    ckVar2.k.add(ckVar);
                    ckVar.b = true;
                    arrayList.add(mjVar3);
                    arrayList.add(mjVar2);
                }
            } else if (i == 3 && !rfVar14.y()) {
                rf rfVar16 = this.b;
                if (rfVar16.r != 3) {
                    ck ckVar3 = rfVar16.d.e;
                    arrayList2.add(ckVar3);
                    ckVar3.k.add(ckVar);
                    ckVar.b = true;
                    arrayList.add(mjVar3);
                    arrayList.add(mjVar2);
                }
            }
        }
        rf rfVar17 = this.b;
        xe[] xeVarArr2 = rfVar17.Q;
        xe xeVar5 = xeVarArr2[2];
        xe xeVar6 = xeVar5.f;
        if (xeVar6 != null && xeVarArr2[3].f != null) {
            boolean y2 = rfVar17.y();
            rf rfVar18 = this.b;
            if (y2) {
                mjVar3.f = rfVar18.Q[2].e();
                mjVar2.f = -this.b.Q[3].e();
            } else {
                mj h6 = vn0.h(rfVar18.Q[2]);
                mj h7 = vn0.h(this.b.Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = un0.CENTER;
            }
            if (this.b.E) {
                c(mjVar, mjVar3, 1, this.l);
            }
        } else if (xeVar6 != null) {
            mj h8 = vn0.h(xeVar5);
            if (h8 != null) {
                vn0.b(mjVar3, h8, this.b.Q[2].e());
                c(mjVar2, mjVar3, 1, ckVar);
                if (this.b.E) {
                    c(mjVar, mjVar3, 1, this.l);
                }
                qf qfVar2 = this.d;
                qf qfVar3 = qf.MATCH_CONSTRAINT;
                if (qfVar2 == qfVar3) {
                    rf rfVar19 = this.b;
                    if (rfVar19.X > 0.0f) {
                        jt jtVar = rfVar19.d;
                        if (jtVar.d == qfVar3) {
                            jtVar.e.k.add(ckVar);
                            arrayList2.add(this.b.d.e);
                            ckVar.a = this;
                        }
                    }
                }
            }
        } else {
            xe xeVar7 = xeVarArr2[3];
            if (xeVar7.f != null) {
                mj h9 = vn0.h(xeVar7);
                if (h9 != null) {
                    vn0.b(mjVar2, h9, -this.b.Q[3].e());
                    c(mjVar3, mjVar2, -1, ckVar);
                    if (this.b.E) {
                        c(mjVar, mjVar3, 1, this.l);
                    }
                }
            } else {
                xe xeVar8 = xeVarArr2[4];
                if (xeVar8.f != null) {
                    mj h10 = vn0.h(xeVar8);
                    if (h10 != null) {
                        vn0.b(mjVar, h10, 0);
                        c(mjVar3, mjVar, -1, this.l);
                        c(mjVar2, mjVar3, 1, ckVar);
                    }
                } else if (!(rfVar17 instanceof dt) && (rfVar3 = rfVar17.U) != null) {
                    vn0.b(mjVar3, rfVar3.e.h, rfVar17.s());
                    c(mjVar2, mjVar3, 1, ckVar);
                    if (this.b.E) {
                        c(mjVar, mjVar3, 1, this.l);
                    }
                    qf qfVar4 = this.d;
                    qf qfVar5 = qf.MATCH_CONSTRAINT;
                    if (qfVar4 == qfVar5) {
                        rf rfVar20 = this.b;
                        if (rfVar20.X > 0.0f) {
                            jt jtVar2 = rfVar20.d;
                            if (jtVar2.d == qfVar5) {
                                jtVar2.e.k.add(ckVar);
                                arrayList2.add(this.b.d.e);
                                ckVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            ckVar.c = true;
        }
    }

    @Override // defpackage.vn0
    public final void e() {
        mj mjVar = this.h;
        if (mjVar.j) {
            this.b.a0 = mjVar.g;
        }
    }

    @Override // defpackage.vn0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.vn0
    public final boolean k() {
        return this.d != qf.MATCH_CONSTRAINT || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        mj mjVar = this.h;
        mjVar.c();
        mjVar.j = false;
        mj mjVar2 = this.i;
        mjVar2.c();
        mjVar2.j = false;
        mj mjVar3 = this.k;
        mjVar3.c();
        mjVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.i0;
    }
}
