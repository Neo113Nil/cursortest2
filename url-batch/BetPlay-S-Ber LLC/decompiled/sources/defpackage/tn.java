package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class tn extends ra0 {
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

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r5 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02aa  */
    @Override // defpackage.ef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ef efVar) {
        float f;
        boolean z;
        float f2;
        float f3;
        float f4;
        int i;
        if (o30.i(this.j) == 3) {
            ed edVar = this.b;
            l(edVar.I, edVar.K, 0);
            return;
        }
        pf pfVar = this.e;
        boolean z2 = pfVar.j;
        gf gfVar = this.h;
        gf gfVar2 = this.i;
        if (!z2 && this.d == 3) {
            ed edVar2 = this.b;
            int i2 = edVar2.r;
            if (i2 == 2) {
                f = 0.5f;
                ed edVar3 = edVar2.T;
                if (edVar3 != null) {
                    if (edVar3.d.e.j) {
                        pfVar.d((int) ((r5.g * edVar2.w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = edVar2.s;
                if (i3 == 0 || i3 == 3) {
                    p80 p80Var = edVar2.e;
                    gf gfVar3 = p80Var.h;
                    gf gfVar4 = p80Var.i;
                    boolean z3 = edVar2.I.f != null;
                    boolean z4 = edVar2.J.f != null;
                    boolean z5 = edVar2.K.f != null;
                    boolean z6 = edVar2.L.f != null;
                    f = 0.5f;
                    int i4 = edVar2.X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = edVar2.W;
                        boolean z7 = gfVar3.j;
                        ArrayList arrayList = gfVar3.l;
                        int[] iArr = k;
                        if (z7 && gfVar4.j) {
                            if (gfVar.c && gfVar2.c) {
                                m(iArr, ((gf) gfVar.l.get(0)).g + gfVar.f, ((gf) gfVar2.l.get(0)).g - gfVar2.f, gfVar3.g + gfVar3.f, gfVar4.g - gfVar4.f, f5, i4);
                                pfVar.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (gfVar.j && gfVar2.j) {
                            if (!gfVar3.c || !gfVar4.c) {
                                return;
                            }
                            m(iArr, gfVar.g + gfVar.f, gfVar2.g - gfVar2.f, ((gf) arrayList.get(0)).g + gfVar3.f, ((gf) gfVar4.l.get(0)).g - gfVar4.f, f5, i4);
                            pfVar.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!gfVar.c || !gfVar2.c || !gfVar3.c || !gfVar4.c) {
                            return;
                        }
                        m(iArr, ((gf) gfVar.l.get(0)).g + gfVar.f, ((gf) gfVar2.l.get(0)).g - gfVar2.f, ((gf) arrayList.get(0)).g + gfVar3.f, ((gf) gfVar4.l.get(0)).g - gfVar4.f, f5, i4);
                        pfVar.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!gfVar.c || !gfVar2.c) {
                            return;
                        }
                        float f6 = edVar2.W;
                        int i5 = ((gf) gfVar.l.get(0)).g + gfVar.f;
                        int i6 = ((gf) gfVar2.l.get(0)).g - gfVar2.f;
                        if (i4 == -1 || i4 == 0) {
                            int g = g(i6 - i5, 0);
                            int i7 = (int) ((g * f6) + 0.5f);
                            int g2 = g(i7, 1);
                            if (i7 != g2) {
                                g = (int) ((g2 / f6) + 0.5f);
                            }
                            pfVar.d(g);
                            this.b.e.e.d(g2);
                        } else if (i4 == 1) {
                            int g3 = g(i6 - i5, 0);
                            int i8 = (int) ((g3 / f6) + 0.5f);
                            int g4 = g(i8, 1);
                            if (i8 != g4) {
                                g3 = (int) ((g4 * f6) + 0.5f);
                            }
                            pfVar.d(g3);
                            this.b.e.e.d(g4);
                        }
                    } else if (z4 && z6) {
                        if (!gfVar3.c || !gfVar4.c) {
                            return;
                        }
                        float f7 = edVar2.W;
                        int i9 = ((gf) gfVar3.l.get(0)).g + gfVar3.f;
                        int i10 = ((gf) gfVar4.l.get(0)).g - gfVar4.f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g5 = g(i10 - i9, 1);
                                int i11 = (int) ((g5 * f7) + 0.5f);
                                int g6 = g(i11, 0);
                                if (i11 != g6) {
                                    g5 = (int) ((g6 / f7) + 0.5f);
                                }
                                pfVar.d(g6);
                                this.b.e.e.d(g5);
                            }
                        }
                        int g7 = g(i10 - i9, 1);
                        int i12 = (int) ((g7 / f7) + 0.5f);
                        int g8 = g(i12, 0);
                        if (i12 != g8) {
                            g7 = (int) ((g8 * f7) + 0.5f);
                        }
                        pfVar.d(g8);
                        this.b.e.e.d(g7);
                    }
                } else {
                    int i13 = edVar2.X;
                    if (i13 == -1) {
                        f2 = edVar2.e.e.g;
                        f3 = edVar2.W;
                    } else if (i13 == 0) {
                        f4 = edVar2.e.e.g / edVar2.W;
                        i = (int) (f4 + 0.5f);
                        pfVar.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        pfVar.d(i);
                    } else {
                        f2 = edVar2.e.e.g;
                        f3 = edVar2.W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    pfVar.d(i);
                }
            }
            z = gfVar.c;
            ArrayList arrayList2 = gfVar.l;
            if (z) {
                return;
            }
            boolean z8 = gfVar2.c;
            ArrayList arrayList3 = gfVar2.l;
            if (z8) {
                if (gfVar.j && gfVar2.j && pfVar.j) {
                    return;
                }
                if (!pfVar.j && this.d == 3) {
                    ed edVar4 = this.b;
                    if (edVar4.r == 0 && !edVar4.x()) {
                        gf gfVar5 = (gf) arrayList2.get(0);
                        gf gfVar6 = (gf) arrayList3.get(0);
                        int i14 = gfVar5.g + gfVar.f;
                        int i15 = gfVar6.g + gfVar2.f;
                        gfVar.d(i14);
                        gfVar2.d(i15);
                        pfVar.d(i15 - i14);
                        return;
                    }
                }
                if (!pfVar.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((gf) arrayList3.get(0)).g + gfVar2.f) - (((gf) arrayList2.get(0)).g + gfVar.f), pfVar.m);
                    ed edVar5 = this.b;
                    int i16 = edVar5.v;
                    int max = Math.max(edVar5.u, min);
                    if (i16 > 0) {
                        max = Math.min(i16, max);
                    }
                    pfVar.d(max);
                }
                if (pfVar.j) {
                    gf gfVar7 = (gf) arrayList2.get(0);
                    gf gfVar8 = (gf) arrayList3.get(0);
                    int i17 = gfVar7.g;
                    int i18 = gfVar.f + i17;
                    int i19 = gfVar8.g;
                    int i20 = gfVar2.f + i19;
                    float f8 = this.b.d0;
                    if (gfVar7 == gfVar8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    gfVar.d((int) ((((i19 - i17) - pfVar.g) * f8) + i17 + f));
                    gfVar2.d(gfVar.g + pfVar.g);
                    return;
                }
                return;
            }
            return;
        }
        f = 0.5f;
        z = gfVar.c;
        ArrayList arrayList22 = gfVar.l;
        if (z) {
        }
    }

    @Override // defpackage.ra0
    public final void d() {
        ed edVar;
        ed edVar2;
        int i;
        ed edVar3;
        ed edVar4;
        int i2;
        ed edVar5 = this.b;
        boolean z = edVar5.a;
        pf pfVar = this.e;
        if (z) {
            pfVar.d(edVar5.q());
        }
        boolean z2 = pfVar.j;
        ArrayList arrayList = pfVar.k;
        ArrayList arrayList2 = pfVar.l;
        gf gfVar = this.i;
        gf gfVar2 = this.h;
        if (!z2) {
            ed edVar6 = this.b;
            int i3 = edVar6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (edVar4 = edVar6.T) != null && ((i2 = edVar4.p0[0]) == 1 || i2 == 4)) {
                    int q = (edVar4.q() - this.b.I.e()) - this.b.K.e();
                    ra0.b(gfVar2, edVar4.d.h, this.b.I.e());
                    ra0.b(gfVar, edVar4.d.i, -this.b.K.e());
                    pfVar.d(q);
                    return;
                }
                if (i3 == 1) {
                    pfVar.d(edVar6.q());
                }
            }
        } else if (this.d == 4 && (edVar2 = (edVar = this.b).T) != null && ((i = edVar2.p0[0]) == 1 || i == 4)) {
            ra0.b(gfVar2, edVar2.d.h, edVar.I.e());
            ra0.b(gfVar, edVar2.d.i, -this.b.K.e());
            return;
        }
        if (pfVar.j) {
            ed edVar7 = this.b;
            if (edVar7.a) {
                pc[] pcVarArr = edVar7.Q;
                pc pcVar = pcVarArr[0];
                pc pcVar2 = pcVar.f;
                if (pcVar2 != null && pcVarArr[1].f != null) {
                    boolean x = edVar7.x();
                    ed edVar8 = this.b;
                    if (x) {
                        gfVar2.f = edVar8.Q[0].e();
                        gfVar.f = -this.b.Q[1].e();
                        return;
                    }
                    gf h = ra0.h(edVar8.Q[0]);
                    if (h != null) {
                        ra0.b(gfVar2, h, this.b.Q[0].e());
                    }
                    gf h2 = ra0.h(this.b.Q[1]);
                    if (h2 != null) {
                        ra0.b(gfVar, h2, -this.b.Q[1].e());
                    }
                    gfVar2.b = true;
                    gfVar.b = true;
                    return;
                }
                if (pcVar2 != null) {
                    gf h3 = ra0.h(pcVar);
                    if (h3 != null) {
                        ra0.b(gfVar2, h3, this.b.Q[0].e());
                        ra0.b(gfVar, gfVar2, pfVar.g);
                        return;
                    }
                    return;
                }
                pc pcVar3 = pcVarArr[1];
                if (pcVar3.f != null) {
                    gf h4 = ra0.h(pcVar3);
                    if (h4 != null) {
                        ra0.b(gfVar, h4, -this.b.Q[1].e());
                        ra0.b(gfVar2, gfVar, -pfVar.g);
                        return;
                    }
                    return;
                }
                if ((edVar7 instanceof pn) || edVar7.T == null || edVar7.i(7).f != null) {
                    return;
                }
                ed edVar9 = this.b;
                ra0.b(gfVar2, edVar9.T.d.h, edVar9.r());
                ra0.b(gfVar, gfVar2, pfVar.g);
                return;
            }
        }
        if (this.d == 3) {
            ed edVar10 = this.b;
            int i4 = edVar10.r;
            if (i4 == 2) {
                ed edVar11 = edVar10.T;
                if (edVar11 != null) {
                    pf pfVar2 = edVar11.e.e;
                    arrayList2.add(pfVar2);
                    pfVar2.k.add(pfVar);
                    pfVar.b = true;
                    arrayList.add(gfVar2);
                    arrayList.add(gfVar);
                }
            } else if (i4 == 3) {
                if (edVar10.s == 3) {
                    gfVar2.a = this;
                    gfVar.a = this;
                    p80 p80Var = edVar10.e;
                    p80Var.h.a = this;
                    p80Var.i.a = this;
                    pfVar.a = this;
                    if (edVar10.y()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(pfVar);
                        p80 p80Var2 = this.b.e;
                        p80Var2.e.a = this;
                        arrayList2.add(p80Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(pfVar);
                        this.b.e.i.k.add(pfVar);
                    } else {
                        boolean x2 = this.b.x();
                        ed edVar12 = this.b;
                        if (x2) {
                            edVar12.e.e.l.add(pfVar);
                            arrayList.add(this.b.e.e);
                        } else {
                            edVar12.e.e.l.add(pfVar);
                        }
                    }
                } else {
                    pf pfVar3 = edVar10.e.e;
                    arrayList2.add(pfVar3);
                    pfVar3.k.add(pfVar);
                    this.b.e.h.k.add(pfVar);
                    this.b.e.i.k.add(pfVar);
                    pfVar.b = true;
                    arrayList.add(gfVar2);
                    arrayList.add(gfVar);
                    gfVar2.l.add(pfVar);
                    gfVar.l.add(pfVar);
                }
            }
        }
        ed edVar13 = this.b;
        pc[] pcVarArr2 = edVar13.Q;
        pc pcVar4 = pcVarArr2[0];
        pc pcVar5 = pcVar4.f;
        if (pcVar5 != null && pcVarArr2[1].f != null) {
            boolean x3 = edVar13.x();
            ed edVar14 = this.b;
            if (x3) {
                gfVar2.f = edVar14.Q[0].e();
                gfVar.f = -this.b.Q[1].e();
                return;
            }
            gf h5 = ra0.h(edVar14.Q[0]);
            gf h6 = ra0.h(this.b.Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = 4;
            return;
        }
        if (pcVar5 != null) {
            gf h7 = ra0.h(pcVar4);
            if (h7 != null) {
                ra0.b(gfVar2, h7, this.b.Q[0].e());
                c(gfVar, gfVar2, 1, pfVar);
                return;
            }
            return;
        }
        pc pcVar6 = pcVarArr2[1];
        if (pcVar6.f != null) {
            gf h8 = ra0.h(pcVar6);
            if (h8 != null) {
                ra0.b(gfVar, h8, -this.b.Q[1].e());
                c(gfVar2, gfVar, -1, pfVar);
                return;
            }
            return;
        }
        if ((edVar13 instanceof pn) || (edVar3 = edVar13.T) == null) {
            return;
        }
        ra0.b(gfVar2, edVar3.d.h, edVar13.r());
        c(gfVar, gfVar2, 1, pfVar);
    }

    @Override // defpackage.ra0
    public final void e() {
        gf gfVar = this.h;
        if (gfVar.j) {
            this.b.Y = gfVar.g;
        }
    }

    @Override // defpackage.ra0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ra0
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        gf gfVar = this.h;
        gfVar.c();
        gfVar.j = false;
        gf gfVar2 = this.i;
        gfVar2.c();
        gfVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
