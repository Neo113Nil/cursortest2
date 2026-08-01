package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class qp extends rd0 {
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
    @Override // defpackage.dh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(dh dhVar) {
        float f;
        boolean z;
        float f2;
        float f3;
        float f4;
        int i;
        if (f60.j(this.j) == 3) {
            ae aeVar = this.b;
            l(aeVar.I, aeVar.K, 0);
            return;
        }
        wh whVar = this.e;
        boolean z2 = whVar.j;
        fh fhVar = this.h;
        fh fhVar2 = this.i;
        if (!z2 && this.d == 3) {
            ae aeVar2 = this.b;
            int i2 = aeVar2.r;
            if (i2 == 2) {
                f = 0.5f;
                ae aeVar3 = aeVar2.T;
                if (aeVar3 != null) {
                    if (aeVar3.d.e.j) {
                        whVar.d((int) ((r5.g * aeVar2.w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = aeVar2.s;
                if (i3 == 0 || i3 == 3) {
                    tb0 tb0Var = aeVar2.e;
                    fh fhVar3 = tb0Var.h;
                    fh fhVar4 = tb0Var.i;
                    boolean z3 = aeVar2.I.f != null;
                    boolean z4 = aeVar2.J.f != null;
                    boolean z5 = aeVar2.K.f != null;
                    boolean z6 = aeVar2.L.f != null;
                    f = 0.5f;
                    int i4 = aeVar2.X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = aeVar2.W;
                        boolean z7 = fhVar3.j;
                        ArrayList arrayList = fhVar3.l;
                        int[] iArr = k;
                        if (z7 && fhVar4.j) {
                            if (fhVar.c && fhVar2.c) {
                                m(iArr, ((fh) fhVar.l.get(0)).g + fhVar.f, ((fh) fhVar2.l.get(0)).g - fhVar2.f, fhVar3.g + fhVar3.f, fhVar4.g - fhVar4.f, f5, i4);
                                whVar.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (fhVar.j && fhVar2.j) {
                            if (!fhVar3.c || !fhVar4.c) {
                                return;
                            }
                            m(iArr, fhVar.g + fhVar.f, fhVar2.g - fhVar2.f, ((fh) arrayList.get(0)).g + fhVar3.f, ((fh) fhVar4.l.get(0)).g - fhVar4.f, f5, i4);
                            whVar.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!fhVar.c || !fhVar2.c || !fhVar3.c || !fhVar4.c) {
                            return;
                        }
                        m(iArr, ((fh) fhVar.l.get(0)).g + fhVar.f, ((fh) fhVar2.l.get(0)).g - fhVar2.f, ((fh) arrayList.get(0)).g + fhVar3.f, ((fh) fhVar4.l.get(0)).g - fhVar4.f, f5, i4);
                        whVar.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!fhVar.c || !fhVar2.c) {
                            return;
                        }
                        float f6 = aeVar2.W;
                        int i5 = ((fh) fhVar.l.get(0)).g + fhVar.f;
                        int i6 = ((fh) fhVar2.l.get(0)).g - fhVar2.f;
                        if (i4 == -1 || i4 == 0) {
                            int g = g(i6 - i5, 0);
                            int i7 = (int) ((g * f6) + 0.5f);
                            int g2 = g(i7, 1);
                            if (i7 != g2) {
                                g = (int) ((g2 / f6) + 0.5f);
                            }
                            whVar.d(g);
                            this.b.e.e.d(g2);
                        } else if (i4 == 1) {
                            int g3 = g(i6 - i5, 0);
                            int i8 = (int) ((g3 / f6) + 0.5f);
                            int g4 = g(i8, 1);
                            if (i8 != g4) {
                                g3 = (int) ((g4 * f6) + 0.5f);
                            }
                            whVar.d(g3);
                            this.b.e.e.d(g4);
                        }
                    } else if (z4 && z6) {
                        if (!fhVar3.c || !fhVar4.c) {
                            return;
                        }
                        float f7 = aeVar2.W;
                        int i9 = ((fh) fhVar3.l.get(0)).g + fhVar3.f;
                        int i10 = ((fh) fhVar4.l.get(0)).g - fhVar4.f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g5 = g(i10 - i9, 1);
                                int i11 = (int) ((g5 * f7) + 0.5f);
                                int g6 = g(i11, 0);
                                if (i11 != g6) {
                                    g5 = (int) ((g6 / f7) + 0.5f);
                                }
                                whVar.d(g6);
                                this.b.e.e.d(g5);
                            }
                        }
                        int g7 = g(i10 - i9, 1);
                        int i12 = (int) ((g7 / f7) + 0.5f);
                        int g8 = g(i12, 0);
                        if (i12 != g8) {
                            g7 = (int) ((g8 * f7) + 0.5f);
                        }
                        whVar.d(g8);
                        this.b.e.e.d(g7);
                    }
                } else {
                    int i13 = aeVar2.X;
                    if (i13 == -1) {
                        f2 = aeVar2.e.e.g;
                        f3 = aeVar2.W;
                    } else if (i13 == 0) {
                        f4 = aeVar2.e.e.g / aeVar2.W;
                        i = (int) (f4 + 0.5f);
                        whVar.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        whVar.d(i);
                    } else {
                        f2 = aeVar2.e.e.g;
                        f3 = aeVar2.W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    whVar.d(i);
                }
            }
            z = fhVar.c;
            ArrayList arrayList2 = fhVar.l;
            if (z) {
                return;
            }
            boolean z8 = fhVar2.c;
            ArrayList arrayList3 = fhVar2.l;
            if (z8) {
                if (fhVar.j && fhVar2.j && whVar.j) {
                    return;
                }
                if (!whVar.j && this.d == 3) {
                    ae aeVar4 = this.b;
                    if (aeVar4.r == 0 && !aeVar4.x()) {
                        fh fhVar5 = (fh) arrayList2.get(0);
                        fh fhVar6 = (fh) arrayList3.get(0);
                        int i14 = fhVar5.g + fhVar.f;
                        int i15 = fhVar6.g + fhVar2.f;
                        fhVar.d(i14);
                        fhVar2.d(i15);
                        whVar.d(i15 - i14);
                        return;
                    }
                }
                if (!whVar.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((fh) arrayList3.get(0)).g + fhVar2.f) - (((fh) arrayList2.get(0)).g + fhVar.f), whVar.m);
                    ae aeVar5 = this.b;
                    int i16 = aeVar5.v;
                    int max = Math.max(aeVar5.u, min);
                    if (i16 > 0) {
                        max = Math.min(i16, max);
                    }
                    whVar.d(max);
                }
                if (whVar.j) {
                    fh fhVar7 = (fh) arrayList2.get(0);
                    fh fhVar8 = (fh) arrayList3.get(0);
                    int i17 = fhVar7.g;
                    int i18 = fhVar.f + i17;
                    int i19 = fhVar8.g;
                    int i20 = fhVar2.f + i19;
                    float f8 = this.b.d0;
                    if (fhVar7 == fhVar8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    fhVar.d((int) ((((i19 - i17) - whVar.g) * f8) + i17 + f));
                    fhVar2.d(fhVar.g + whVar.g);
                    return;
                }
                return;
            }
            return;
        }
        f = 0.5f;
        z = fhVar.c;
        ArrayList arrayList22 = fhVar.l;
        if (z) {
        }
    }

    @Override // defpackage.rd0
    public final void d() {
        ae aeVar;
        ae aeVar2;
        int i;
        ae aeVar3;
        ae aeVar4;
        int i2;
        ae aeVar5 = this.b;
        boolean z = aeVar5.a;
        wh whVar = this.e;
        if (z) {
            whVar.d(aeVar5.q());
        }
        boolean z2 = whVar.j;
        ArrayList arrayList = whVar.k;
        ArrayList arrayList2 = whVar.l;
        fh fhVar = this.i;
        fh fhVar2 = this.h;
        if (!z2) {
            ae aeVar6 = this.b;
            int i3 = aeVar6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (aeVar4 = aeVar6.T) != null && ((i2 = aeVar4.p0[0]) == 1 || i2 == 4)) {
                    int q = (aeVar4.q() - this.b.I.e()) - this.b.K.e();
                    rd0.b(fhVar2, aeVar4.d.h, this.b.I.e());
                    rd0.b(fhVar, aeVar4.d.i, -this.b.K.e());
                    whVar.d(q);
                    return;
                }
                if (i3 == 1) {
                    whVar.d(aeVar6.q());
                }
            }
        } else if (this.d == 4 && (aeVar2 = (aeVar = this.b).T) != null && ((i = aeVar2.p0[0]) == 1 || i == 4)) {
            rd0.b(fhVar2, aeVar2.d.h, aeVar.I.e());
            rd0.b(fhVar, aeVar2.d.i, -this.b.K.e());
            return;
        }
        if (whVar.j) {
            ae aeVar7 = this.b;
            if (aeVar7.a) {
                ld[] ldVarArr = aeVar7.Q;
                ld ldVar = ldVarArr[0];
                ld ldVar2 = ldVar.f;
                if (ldVar2 != null && ldVarArr[1].f != null) {
                    boolean x = aeVar7.x();
                    ae aeVar8 = this.b;
                    if (x) {
                        fhVar2.f = aeVar8.Q[0].e();
                        fhVar.f = -this.b.Q[1].e();
                        return;
                    }
                    fh h = rd0.h(aeVar8.Q[0]);
                    if (h != null) {
                        rd0.b(fhVar2, h, this.b.Q[0].e());
                    }
                    fh h2 = rd0.h(this.b.Q[1]);
                    if (h2 != null) {
                        rd0.b(fhVar, h2, -this.b.Q[1].e());
                    }
                    fhVar2.b = true;
                    fhVar.b = true;
                    return;
                }
                if (ldVar2 != null) {
                    fh h3 = rd0.h(ldVar);
                    if (h3 != null) {
                        rd0.b(fhVar2, h3, this.b.Q[0].e());
                        rd0.b(fhVar, fhVar2, whVar.g);
                        return;
                    }
                    return;
                }
                ld ldVar3 = ldVarArr[1];
                if (ldVar3.f != null) {
                    fh h4 = rd0.h(ldVar3);
                    if (h4 != null) {
                        rd0.b(fhVar, h4, -this.b.Q[1].e());
                        rd0.b(fhVar2, fhVar, -whVar.g);
                        return;
                    }
                    return;
                }
                if ((aeVar7 instanceof mp) || aeVar7.T == null || aeVar7.i(7).f != null) {
                    return;
                }
                ae aeVar9 = this.b;
                rd0.b(fhVar2, aeVar9.T.d.h, aeVar9.r());
                rd0.b(fhVar, fhVar2, whVar.g);
                return;
            }
        }
        if (this.d == 3) {
            ae aeVar10 = this.b;
            int i4 = aeVar10.r;
            if (i4 == 2) {
                ae aeVar11 = aeVar10.T;
                if (aeVar11 != null) {
                    wh whVar2 = aeVar11.e.e;
                    arrayList2.add(whVar2);
                    whVar2.k.add(whVar);
                    whVar.b = true;
                    arrayList.add(fhVar2);
                    arrayList.add(fhVar);
                }
            } else if (i4 == 3) {
                if (aeVar10.s == 3) {
                    fhVar2.a = this;
                    fhVar.a = this;
                    tb0 tb0Var = aeVar10.e;
                    tb0Var.h.a = this;
                    tb0Var.i.a = this;
                    whVar.a = this;
                    if (aeVar10.y()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(whVar);
                        tb0 tb0Var2 = this.b.e;
                        tb0Var2.e.a = this;
                        arrayList2.add(tb0Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(whVar);
                        this.b.e.i.k.add(whVar);
                    } else {
                        boolean x2 = this.b.x();
                        ae aeVar12 = this.b;
                        if (x2) {
                            aeVar12.e.e.l.add(whVar);
                            arrayList.add(this.b.e.e);
                        } else {
                            aeVar12.e.e.l.add(whVar);
                        }
                    }
                } else {
                    wh whVar3 = aeVar10.e.e;
                    arrayList2.add(whVar3);
                    whVar3.k.add(whVar);
                    this.b.e.h.k.add(whVar);
                    this.b.e.i.k.add(whVar);
                    whVar.b = true;
                    arrayList.add(fhVar2);
                    arrayList.add(fhVar);
                    fhVar2.l.add(whVar);
                    fhVar.l.add(whVar);
                }
            }
        }
        ae aeVar13 = this.b;
        ld[] ldVarArr2 = aeVar13.Q;
        ld ldVar4 = ldVarArr2[0];
        ld ldVar5 = ldVar4.f;
        if (ldVar5 != null && ldVarArr2[1].f != null) {
            boolean x3 = aeVar13.x();
            ae aeVar14 = this.b;
            if (x3) {
                fhVar2.f = aeVar14.Q[0].e();
                fhVar.f = -this.b.Q[1].e();
                return;
            }
            fh h5 = rd0.h(aeVar14.Q[0]);
            fh h6 = rd0.h(this.b.Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = 4;
            return;
        }
        if (ldVar5 != null) {
            fh h7 = rd0.h(ldVar4);
            if (h7 != null) {
                rd0.b(fhVar2, h7, this.b.Q[0].e());
                c(fhVar, fhVar2, 1, whVar);
                return;
            }
            return;
        }
        ld ldVar6 = ldVarArr2[1];
        if (ldVar6.f != null) {
            fh h8 = rd0.h(ldVar6);
            if (h8 != null) {
                rd0.b(fhVar, h8, -this.b.Q[1].e());
                c(fhVar2, fhVar, -1, whVar);
                return;
            }
            return;
        }
        if ((aeVar13 instanceof mp) || (aeVar3 = aeVar13.T) == null) {
            return;
        }
        rd0.b(fhVar2, aeVar3.d.h, aeVar13.r());
        c(fhVar, fhVar2, 1, whVar);
    }

    @Override // defpackage.rd0
    public final void e() {
        fh fhVar = this.h;
        if (fhVar.j) {
            this.b.Y = fhVar.g;
        }
    }

    @Override // defpackage.rd0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.rd0
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        fh fhVar = this.h;
        fhVar.c();
        fhVar.j = false;
        fh fhVar2 = this.i;
        fhVar2.c();
        fhVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
