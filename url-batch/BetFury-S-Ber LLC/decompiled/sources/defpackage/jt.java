package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class jt extends vn0 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x023f, code lost:
    
        if (r15 != 1) goto L124;
     */
    @Override // defpackage.jj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(jj jjVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (ht.a[this.j.ordinal()] == 3) {
            rf rfVar = this.b;
            l(rfVar.I, rfVar.K, 0);
            return;
        }
        ck ckVar = this.e;
        boolean z = ckVar.j;
        mj mjVar = this.h;
        mj mjVar2 = this.i;
        if (!z && this.d == qf.MATCH_CONSTRAINT) {
            rf rfVar2 = this.b;
            int i2 = rfVar2.r;
            if (i2 == 2) {
                rf rfVar3 = rfVar2.U;
                if (rfVar3 != null) {
                    if (rfVar3.d.e.j) {
                        ckVar.d((int) ((r3.g * rfVar2.w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = rfVar2.s;
                if (i3 == 0 || i3 == 3) {
                    rl0 rl0Var = rfVar2.e;
                    mj mjVar3 = rl0Var.h;
                    mj mjVar4 = rl0Var.i;
                    boolean z2 = rfVar2.I.f != null;
                    boolean z3 = rfVar2.J.f != null;
                    boolean z4 = rfVar2.K.f != null;
                    boolean z5 = rfVar2.L.f != null;
                    int i4 = rfVar2.Y;
                    if (z2 && z3 && z4 && z5) {
                        float f4 = rfVar2.X;
                        boolean z6 = mjVar3.j;
                        ArrayList arrayList = mjVar3.l;
                        int[] iArr = k;
                        if (z6 && mjVar4.j) {
                            if (mjVar.c && mjVar2.c) {
                                m(iArr, ((mj) mjVar.l.get(0)).g + mjVar.f, ((mj) mjVar2.l.get(0)).g - mjVar2.f, mjVar3.g + mjVar3.f, mjVar4.g - mjVar4.f, f4, i4);
                                ckVar.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (mjVar.j && mjVar2.j) {
                            if (!mjVar3.c || !mjVar4.c) {
                                return;
                            }
                            m(iArr, mjVar.g + mjVar.f, mjVar2.g - mjVar2.f, ((mj) arrayList.get(0)).g + mjVar3.f, ((mj) mjVar4.l.get(0)).g - mjVar4.f, f4, i4);
                            ckVar.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!mjVar.c || !mjVar2.c || !mjVar3.c || !mjVar4.c) {
                            return;
                        }
                        m(iArr, ((mj) mjVar.l.get(0)).g + mjVar.f, ((mj) mjVar2.l.get(0)).g - mjVar2.f, ((mj) arrayList.get(0)).g + mjVar3.f, ((mj) mjVar4.l.get(0)).g - mjVar4.f, f4, i4);
                        ckVar.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!mjVar.c || !mjVar2.c) {
                            return;
                        }
                        float f5 = rfVar2.X;
                        int i5 = ((mj) mjVar.l.get(0)).g + mjVar.f;
                        int i6 = ((mj) mjVar2.l.get(0)).g - mjVar2.f;
                        if (i4 == -1 || i4 == 0) {
                            int g = g(i6 - i5, 0);
                            int i7 = (int) ((g * f5) + 0.5f);
                            int g2 = g(i7, 1);
                            if (i7 != g2) {
                                g = (int) ((g2 / f5) + 0.5f);
                            }
                            ckVar.d(g);
                            this.b.e.e.d(g2);
                        } else if (i4 == 1) {
                            int g3 = g(i6 - i5, 0);
                            int i8 = (int) ((g3 / f5) + 0.5f);
                            int g4 = g(i8, 1);
                            if (i8 != g4) {
                                g3 = (int) ((g4 * f5) + 0.5f);
                            }
                            ckVar.d(g3);
                            this.b.e.e.d(g4);
                        }
                    } else if (z3 && z5) {
                        if (!mjVar3.c || !mjVar4.c) {
                            return;
                        }
                        float f6 = rfVar2.X;
                        int i9 = ((mj) mjVar3.l.get(0)).g + mjVar3.f;
                        int i10 = ((mj) mjVar4.l.get(0)).g - mjVar4.f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g5 = g(i10 - i9, 1);
                                int i11 = (int) ((g5 * f6) + 0.5f);
                                int g6 = g(i11, 0);
                                if (i11 != g6) {
                                    g5 = (int) ((g6 / f6) + 0.5f);
                                }
                                ckVar.d(g6);
                                this.b.e.e.d(g5);
                            }
                        }
                        int g7 = g(i10 - i9, 1);
                        int i12 = (int) ((g7 / f6) + 0.5f);
                        int g8 = g(i12, 0);
                        if (i12 != g8) {
                            g7 = (int) ((g8 * f6) + 0.5f);
                        }
                        ckVar.d(g8);
                        this.b.e.e.d(g7);
                    }
                } else {
                    int i13 = rfVar2.Y;
                    if (i13 == -1) {
                        f = rfVar2.e.e.g;
                        f2 = rfVar2.X;
                    } else if (i13 == 0) {
                        f3 = rfVar2.e.e.g / rfVar2.X;
                        i = (int) (f3 + 0.5f);
                        ckVar.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        ckVar.d(i);
                    } else {
                        f = rfVar2.e.e.g;
                        f2 = rfVar2.X;
                    }
                    f3 = f * f2;
                    i = (int) (f3 + 0.5f);
                    ckVar.d(i);
                }
            }
        }
        boolean z7 = mjVar.c;
        ArrayList arrayList2 = mjVar.l;
        if (z7) {
            boolean z8 = mjVar2.c;
            ArrayList arrayList3 = mjVar2.l;
            if (z8) {
                if (mjVar.j && mjVar2.j && ckVar.j) {
                    return;
                }
                if (!ckVar.j && this.d == qf.MATCH_CONSTRAINT) {
                    rf rfVar4 = this.b;
                    if (rfVar4.r == 0 && !rfVar4.x()) {
                        mj mjVar5 = (mj) arrayList2.get(0);
                        mj mjVar6 = (mj) arrayList3.get(0);
                        int i14 = mjVar5.g + mjVar.f;
                        int i15 = mjVar6.g + mjVar2.f;
                        mjVar.d(i14);
                        mjVar2.d(i15);
                        ckVar.d(i15 - i14);
                        return;
                    }
                }
                if (!ckVar.j && this.d == qf.MATCH_CONSTRAINT && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((mj) arrayList3.get(0)).g + mjVar2.f) - (((mj) arrayList2.get(0)).g + mjVar.f), ckVar.m);
                    rf rfVar5 = this.b;
                    int i16 = rfVar5.v;
                    int max = Math.max(rfVar5.u, min);
                    if (i16 > 0) {
                        max = Math.min(i16, max);
                    }
                    ckVar.d(max);
                }
                if (ckVar.j) {
                    mj mjVar7 = (mj) arrayList2.get(0);
                    mj mjVar8 = (mj) arrayList3.get(0);
                    int i17 = mjVar7.g;
                    int i18 = mjVar.f + i17;
                    int i19 = mjVar8.g;
                    int i20 = mjVar2.f + i19;
                    float f7 = this.b.e0;
                    if (mjVar7 == mjVar8) {
                        f7 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    mjVar.d((int) ((((i19 - i17) - ckVar.g) * f7) + i17 + 0.5f));
                    mjVar2.d(mjVar.g + ckVar.g);
                }
            }
        }
    }

    @Override // defpackage.vn0
    public final void d() {
        rf rfVar;
        rf rfVar2;
        qf qfVar;
        rf rfVar3;
        rf rfVar4;
        qf qfVar2;
        rf rfVar5 = this.b;
        boolean z = rfVar5.a;
        ck ckVar = this.e;
        if (z) {
            ckVar.d(rfVar5.q());
        }
        boolean z2 = ckVar.j;
        ArrayList arrayList = ckVar.k;
        ArrayList arrayList2 = ckVar.l;
        mj mjVar = this.i;
        mj mjVar2 = this.h;
        if (z2) {
            qf qfVar3 = this.d;
            qf qfVar4 = qf.MATCH_PARENT;
            if (qfVar3 == qfVar4 && (rfVar2 = (rfVar = this.b).U) != null && ((qfVar = rfVar2.T[0]) == qf.FIXED || qfVar == qfVar4)) {
                vn0.b(mjVar2, rfVar2.d.h, rfVar.I.e());
                vn0.b(mjVar, rfVar2.d.i, -this.b.K.e());
                return;
            }
        } else {
            rf rfVar6 = this.b;
            qf qfVar5 = rfVar6.T[0];
            this.d = qfVar5;
            if (qfVar5 != qf.MATCH_CONSTRAINT) {
                qf qfVar6 = qf.MATCH_PARENT;
                if (qfVar5 == qfVar6 && (rfVar4 = rfVar6.U) != null && ((qfVar2 = rfVar4.T[0]) == qf.FIXED || qfVar2 == qfVar6)) {
                    int q = (rfVar4.q() - this.b.I.e()) - this.b.K.e();
                    vn0.b(mjVar2, rfVar4.d.h, this.b.I.e());
                    vn0.b(mjVar, rfVar4.d.i, -this.b.K.e());
                    ckVar.d(q);
                    return;
                }
                if (qfVar5 == qf.FIXED) {
                    ckVar.d(rfVar6.q());
                }
            }
        }
        if (ckVar.j) {
            rf rfVar7 = this.b;
            if (rfVar7.a) {
                xe[] xeVarArr = rfVar7.Q;
                xe xeVar = xeVarArr[0];
                xe xeVar2 = xeVar.f;
                if (xeVar2 != null && xeVarArr[1].f != null) {
                    boolean x = rfVar7.x();
                    rf rfVar8 = this.b;
                    if (x) {
                        mjVar2.f = rfVar8.Q[0].e();
                        mjVar.f = -this.b.Q[1].e();
                        return;
                    }
                    mj h = vn0.h(rfVar8.Q[0]);
                    if (h != null) {
                        vn0.b(mjVar2, h, this.b.Q[0].e());
                    }
                    mj h2 = vn0.h(this.b.Q[1]);
                    if (h2 != null) {
                        vn0.b(mjVar, h2, -this.b.Q[1].e());
                    }
                    mjVar2.b = true;
                    mjVar.b = true;
                    return;
                }
                if (xeVar2 != null) {
                    mj h3 = vn0.h(xeVar);
                    if (h3 != null) {
                        vn0.b(mjVar2, h3, this.b.Q[0].e());
                        vn0.b(mjVar, mjVar2, ckVar.g);
                        return;
                    }
                    return;
                }
                xe xeVar3 = xeVarArr[1];
                if (xeVar3.f != null) {
                    mj h4 = vn0.h(xeVar3);
                    if (h4 != null) {
                        vn0.b(mjVar, h4, -this.b.Q[1].e());
                        vn0.b(mjVar2, mjVar, -ckVar.g);
                        return;
                    }
                    return;
                }
                if ((rfVar7 instanceof dt) || rfVar7.U == null || rfVar7.i(we.CENTER).f != null) {
                    return;
                }
                rf rfVar9 = this.b;
                vn0.b(mjVar2, rfVar9.U.d.h, rfVar9.r());
                vn0.b(mjVar, mjVar2, ckVar.g);
                return;
            }
        }
        if (this.d == qf.MATCH_CONSTRAINT) {
            rf rfVar10 = this.b;
            int i = rfVar10.r;
            if (i == 2) {
                rf rfVar11 = rfVar10.U;
                if (rfVar11 != null) {
                    ck ckVar2 = rfVar11.e.e;
                    arrayList2.add(ckVar2);
                    ckVar2.k.add(ckVar);
                    ckVar.b = true;
                    arrayList.add(mjVar2);
                    arrayList.add(mjVar);
                }
            } else if (i == 3) {
                if (rfVar10.s == 3) {
                    mjVar2.a = this;
                    mjVar.a = this;
                    rl0 rl0Var = rfVar10.e;
                    rl0Var.h.a = this;
                    rl0Var.i.a = this;
                    ckVar.a = this;
                    if (rfVar10.y()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(ckVar);
                        rl0 rl0Var2 = this.b.e;
                        rl0Var2.e.a = this;
                        arrayList2.add(rl0Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(ckVar);
                        this.b.e.i.k.add(ckVar);
                    } else {
                        boolean x2 = this.b.x();
                        rf rfVar12 = this.b;
                        if (x2) {
                            rfVar12.e.e.l.add(ckVar);
                            arrayList.add(this.b.e.e);
                        } else {
                            rfVar12.e.e.l.add(ckVar);
                        }
                    }
                } else {
                    ck ckVar3 = rfVar10.e.e;
                    arrayList2.add(ckVar3);
                    ckVar3.k.add(ckVar);
                    this.b.e.h.k.add(ckVar);
                    this.b.e.i.k.add(ckVar);
                    ckVar.b = true;
                    arrayList.add(mjVar2);
                    arrayList.add(mjVar);
                    mjVar2.l.add(ckVar);
                    mjVar.l.add(ckVar);
                }
            }
        }
        rf rfVar13 = this.b;
        xe[] xeVarArr2 = rfVar13.Q;
        xe xeVar4 = xeVarArr2[0];
        xe xeVar5 = xeVar4.f;
        if (xeVar5 != null && xeVarArr2[1].f != null) {
            boolean x3 = rfVar13.x();
            rf rfVar14 = this.b;
            if (x3) {
                mjVar2.f = rfVar14.Q[0].e();
                mjVar.f = -this.b.Q[1].e();
                return;
            }
            mj h5 = vn0.h(rfVar14.Q[0]);
            mj h6 = vn0.h(this.b.Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = un0.CENTER;
            return;
        }
        if (xeVar5 != null) {
            mj h7 = vn0.h(xeVar4);
            if (h7 != null) {
                vn0.b(mjVar2, h7, this.b.Q[0].e());
                c(mjVar, mjVar2, 1, ckVar);
                return;
            }
            return;
        }
        xe xeVar6 = xeVarArr2[1];
        if (xeVar6.f != null) {
            mj h8 = vn0.h(xeVar6);
            if (h8 != null) {
                vn0.b(mjVar, h8, -this.b.Q[1].e());
                c(mjVar2, mjVar, -1, ckVar);
                return;
            }
            return;
        }
        if ((rfVar13 instanceof dt) || (rfVar3 = rfVar13.U) == null) {
            return;
        }
        vn0.b(mjVar2, rfVar3.d.h, rfVar13.r());
        c(mjVar, mjVar2, 1, ckVar);
    }

    @Override // defpackage.vn0
    public final void e() {
        mj mjVar = this.h;
        if (mjVar.j) {
            this.b.Z = mjVar.g;
        }
    }

    @Override // defpackage.vn0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.vn0
    public final boolean k() {
        return this.d != qf.MATCH_CONSTRAINT || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        mj mjVar = this.h;
        mjVar.c();
        mjVar.j = false;
        mj mjVar2 = this.i;
        mjVar2.c();
        mjVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.i0;
    }
}
