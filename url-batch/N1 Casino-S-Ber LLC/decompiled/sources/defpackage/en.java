package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class en extends ka0 {
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
    @Override // defpackage.ff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ff ffVar) {
        float f;
        boolean z;
        float f2;
        float f3;
        float f4;
        int i;
        if (d30.h(this.j) == 3) {
            ad adVar = this.b;
            l(adVar.I, adVar.K, 0);
            return;
        }
        xf xfVar = this.e;
        boolean z2 = xfVar.j;
        hf hfVar = this.h;
        hf hfVar2 = this.i;
        if (!z2 && this.d == 3) {
            ad adVar2 = this.b;
            int i2 = adVar2.r;
            if (i2 == 2) {
                f = 0.5f;
                ad adVar3 = adVar2.T;
                if (adVar3 != null) {
                    if (adVar3.d.e.j) {
                        xfVar.d((int) ((r5.g * adVar2.w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = adVar2.s;
                if (i3 == 0 || i3 == 3) {
                    i80 i80Var = adVar2.e;
                    hf hfVar3 = i80Var.h;
                    hf hfVar4 = i80Var.i;
                    boolean z3 = adVar2.I.f != null;
                    boolean z4 = adVar2.J.f != null;
                    boolean z5 = adVar2.K.f != null;
                    boolean z6 = adVar2.L.f != null;
                    f = 0.5f;
                    int i4 = adVar2.X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = adVar2.W;
                        boolean z7 = hfVar3.j;
                        ArrayList arrayList = hfVar3.l;
                        int[] iArr = k;
                        if (z7 && hfVar4.j) {
                            if (hfVar.c && hfVar2.c) {
                                m(iArr, ((hf) hfVar.l.get(0)).g + hfVar.f, ((hf) hfVar2.l.get(0)).g - hfVar2.f, hfVar3.g + hfVar3.f, hfVar4.g - hfVar4.f, f5, i4);
                                xfVar.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (hfVar.j && hfVar2.j) {
                            if (!hfVar3.c || !hfVar4.c) {
                                return;
                            }
                            m(iArr, hfVar.g + hfVar.f, hfVar2.g - hfVar2.f, ((hf) arrayList.get(0)).g + hfVar3.f, ((hf) hfVar4.l.get(0)).g - hfVar4.f, f5, i4);
                            xfVar.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!hfVar.c || !hfVar2.c || !hfVar3.c || !hfVar4.c) {
                            return;
                        }
                        m(iArr, ((hf) hfVar.l.get(0)).g + hfVar.f, ((hf) hfVar2.l.get(0)).g - hfVar2.f, ((hf) arrayList.get(0)).g + hfVar3.f, ((hf) hfVar4.l.get(0)).g - hfVar4.f, f5, i4);
                        xfVar.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!hfVar.c || !hfVar2.c) {
                            return;
                        }
                        float f6 = adVar2.W;
                        int i5 = ((hf) hfVar.l.get(0)).g + hfVar.f;
                        int i6 = ((hf) hfVar2.l.get(0)).g - hfVar2.f;
                        if (i4 == -1 || i4 == 0) {
                            int g = g(i6 - i5, 0);
                            int i7 = (int) ((g * f6) + 0.5f);
                            int g2 = g(i7, 1);
                            if (i7 != g2) {
                                g = (int) ((g2 / f6) + 0.5f);
                            }
                            xfVar.d(g);
                            this.b.e.e.d(g2);
                        } else if (i4 == 1) {
                            int g3 = g(i6 - i5, 0);
                            int i8 = (int) ((g3 / f6) + 0.5f);
                            int g4 = g(i8, 1);
                            if (i8 != g4) {
                                g3 = (int) ((g4 * f6) + 0.5f);
                            }
                            xfVar.d(g3);
                            this.b.e.e.d(g4);
                        }
                    } else if (z4 && z6) {
                        if (!hfVar3.c || !hfVar4.c) {
                            return;
                        }
                        float f7 = adVar2.W;
                        int i9 = ((hf) hfVar3.l.get(0)).g + hfVar3.f;
                        int i10 = ((hf) hfVar4.l.get(0)).g - hfVar4.f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g5 = g(i10 - i9, 1);
                                int i11 = (int) ((g5 * f7) + 0.5f);
                                int g6 = g(i11, 0);
                                if (i11 != g6) {
                                    g5 = (int) ((g6 / f7) + 0.5f);
                                }
                                xfVar.d(g6);
                                this.b.e.e.d(g5);
                            }
                        }
                        int g7 = g(i10 - i9, 1);
                        int i12 = (int) ((g7 / f7) + 0.5f);
                        int g8 = g(i12, 0);
                        if (i12 != g8) {
                            g7 = (int) ((g8 * f7) + 0.5f);
                        }
                        xfVar.d(g8);
                        this.b.e.e.d(g7);
                    }
                } else {
                    int i13 = adVar2.X;
                    if (i13 == -1) {
                        f2 = adVar2.e.e.g;
                        f3 = adVar2.W;
                    } else if (i13 == 0) {
                        f4 = adVar2.e.e.g / adVar2.W;
                        i = (int) (f4 + 0.5f);
                        xfVar.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        xfVar.d(i);
                    } else {
                        f2 = adVar2.e.e.g;
                        f3 = adVar2.W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    xfVar.d(i);
                }
            }
            z = hfVar.c;
            ArrayList arrayList2 = hfVar.l;
            if (z) {
                return;
            }
            boolean z8 = hfVar2.c;
            ArrayList arrayList3 = hfVar2.l;
            if (z8) {
                if (hfVar.j && hfVar2.j && xfVar.j) {
                    return;
                }
                if (!xfVar.j && this.d == 3) {
                    ad adVar4 = this.b;
                    if (adVar4.r == 0 && !adVar4.x()) {
                        hf hfVar5 = (hf) arrayList2.get(0);
                        hf hfVar6 = (hf) arrayList3.get(0);
                        int i14 = hfVar5.g + hfVar.f;
                        int i15 = hfVar6.g + hfVar2.f;
                        hfVar.d(i14);
                        hfVar2.d(i15);
                        xfVar.d(i15 - i14);
                        return;
                    }
                }
                if (!xfVar.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((hf) arrayList3.get(0)).g + hfVar2.f) - (((hf) arrayList2.get(0)).g + hfVar.f), xfVar.m);
                    ad adVar5 = this.b;
                    int i16 = adVar5.v;
                    int max = Math.max(adVar5.u, min);
                    if (i16 > 0) {
                        max = Math.min(i16, max);
                    }
                    xfVar.d(max);
                }
                if (xfVar.j) {
                    hf hfVar7 = (hf) arrayList2.get(0);
                    hf hfVar8 = (hf) arrayList3.get(0);
                    int i17 = hfVar7.g;
                    int i18 = hfVar.f + i17;
                    int i19 = hfVar8.g;
                    int i20 = hfVar2.f + i19;
                    float f8 = this.b.d0;
                    if (hfVar7 == hfVar8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    hfVar.d((int) ((((i19 - i17) - xfVar.g) * f8) + i17 + f));
                    hfVar2.d(hfVar.g + xfVar.g);
                    return;
                }
                return;
            }
            return;
        }
        f = 0.5f;
        z = hfVar.c;
        ArrayList arrayList22 = hfVar.l;
        if (z) {
        }
    }

    @Override // defpackage.ka0
    public final void d() {
        ad adVar;
        ad adVar2;
        int i;
        ad adVar3;
        ad adVar4;
        int i2;
        ad adVar5 = this.b;
        boolean z = adVar5.a;
        xf xfVar = this.e;
        if (z) {
            xfVar.d(adVar5.q());
        }
        boolean z2 = xfVar.j;
        ArrayList arrayList = xfVar.k;
        ArrayList arrayList2 = xfVar.l;
        hf hfVar = this.i;
        hf hfVar2 = this.h;
        if (!z2) {
            ad adVar6 = this.b;
            int i3 = adVar6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (adVar4 = adVar6.T) != null && ((i2 = adVar4.p0[0]) == 1 || i2 == 4)) {
                    int q = (adVar4.q() - this.b.I.e()) - this.b.K.e();
                    ka0.b(hfVar2, adVar4.d.h, this.b.I.e());
                    ka0.b(hfVar, adVar4.d.i, -this.b.K.e());
                    xfVar.d(q);
                    return;
                }
                if (i3 == 1) {
                    xfVar.d(adVar6.q());
                }
            }
        } else if (this.d == 4 && (adVar2 = (adVar = this.b).T) != null && ((i = adVar2.p0[0]) == 1 || i == 4)) {
            ka0.b(hfVar2, adVar2.d.h, adVar.I.e());
            ka0.b(hfVar, adVar2.d.i, -this.b.K.e());
            return;
        }
        if (xfVar.j) {
            ad adVar7 = this.b;
            if (adVar7.a) {
                lc[] lcVarArr = adVar7.Q;
                lc lcVar = lcVarArr[0];
                lc lcVar2 = lcVar.f;
                if (lcVar2 != null && lcVarArr[1].f != null) {
                    boolean x = adVar7.x();
                    ad adVar8 = this.b;
                    if (x) {
                        hfVar2.f = adVar8.Q[0].e();
                        hfVar.f = -this.b.Q[1].e();
                        return;
                    }
                    hf h = ka0.h(adVar8.Q[0]);
                    if (h != null) {
                        ka0.b(hfVar2, h, this.b.Q[0].e());
                    }
                    hf h2 = ka0.h(this.b.Q[1]);
                    if (h2 != null) {
                        ka0.b(hfVar, h2, -this.b.Q[1].e());
                    }
                    hfVar2.b = true;
                    hfVar.b = true;
                    return;
                }
                if (lcVar2 != null) {
                    hf h3 = ka0.h(lcVar);
                    if (h3 != null) {
                        ka0.b(hfVar2, h3, this.b.Q[0].e());
                        ka0.b(hfVar, hfVar2, xfVar.g);
                        return;
                    }
                    return;
                }
                lc lcVar3 = lcVarArr[1];
                if (lcVar3.f != null) {
                    hf h4 = ka0.h(lcVar3);
                    if (h4 != null) {
                        ka0.b(hfVar, h4, -this.b.Q[1].e());
                        ka0.b(hfVar2, hfVar, -xfVar.g);
                        return;
                    }
                    return;
                }
                if ((adVar7 instanceof an) || adVar7.T == null || adVar7.i(7).f != null) {
                    return;
                }
                ad adVar9 = this.b;
                ka0.b(hfVar2, adVar9.T.d.h, adVar9.r());
                ka0.b(hfVar, hfVar2, xfVar.g);
                return;
            }
        }
        if (this.d == 3) {
            ad adVar10 = this.b;
            int i4 = adVar10.r;
            if (i4 == 2) {
                ad adVar11 = adVar10.T;
                if (adVar11 != null) {
                    xf xfVar2 = adVar11.e.e;
                    arrayList2.add(xfVar2);
                    xfVar2.k.add(xfVar);
                    xfVar.b = true;
                    arrayList.add(hfVar2);
                    arrayList.add(hfVar);
                }
            } else if (i4 == 3) {
                if (adVar10.s == 3) {
                    hfVar2.a = this;
                    hfVar.a = this;
                    i80 i80Var = adVar10.e;
                    i80Var.h.a = this;
                    i80Var.i.a = this;
                    xfVar.a = this;
                    if (adVar10.y()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(xfVar);
                        i80 i80Var2 = this.b.e;
                        i80Var2.e.a = this;
                        arrayList2.add(i80Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(xfVar);
                        this.b.e.i.k.add(xfVar);
                    } else {
                        boolean x2 = this.b.x();
                        ad adVar12 = this.b;
                        if (x2) {
                            adVar12.e.e.l.add(xfVar);
                            arrayList.add(this.b.e.e);
                        } else {
                            adVar12.e.e.l.add(xfVar);
                        }
                    }
                } else {
                    xf xfVar3 = adVar10.e.e;
                    arrayList2.add(xfVar3);
                    xfVar3.k.add(xfVar);
                    this.b.e.h.k.add(xfVar);
                    this.b.e.i.k.add(xfVar);
                    xfVar.b = true;
                    arrayList.add(hfVar2);
                    arrayList.add(hfVar);
                    hfVar2.l.add(xfVar);
                    hfVar.l.add(xfVar);
                }
            }
        }
        ad adVar13 = this.b;
        lc[] lcVarArr2 = adVar13.Q;
        lc lcVar4 = lcVarArr2[0];
        lc lcVar5 = lcVar4.f;
        if (lcVar5 != null && lcVarArr2[1].f != null) {
            boolean x3 = adVar13.x();
            ad adVar14 = this.b;
            if (x3) {
                hfVar2.f = adVar14.Q[0].e();
                hfVar.f = -this.b.Q[1].e();
                return;
            }
            hf h5 = ka0.h(adVar14.Q[0]);
            hf h6 = ka0.h(this.b.Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = 4;
            return;
        }
        if (lcVar5 != null) {
            hf h7 = ka0.h(lcVar4);
            if (h7 != null) {
                ka0.b(hfVar2, h7, this.b.Q[0].e());
                c(hfVar, hfVar2, 1, xfVar);
                return;
            }
            return;
        }
        lc lcVar6 = lcVarArr2[1];
        if (lcVar6.f != null) {
            hf h8 = ka0.h(lcVar6);
            if (h8 != null) {
                ka0.b(hfVar, h8, -this.b.Q[1].e());
                c(hfVar2, hfVar, -1, xfVar);
                return;
            }
            return;
        }
        if ((adVar13 instanceof an) || (adVar3 = adVar13.T) == null) {
            return;
        }
        ka0.b(hfVar2, adVar3.d.h, adVar13.r());
        c(hfVar, hfVar2, 1, xfVar);
    }

    @Override // defpackage.ka0
    public final void e() {
        hf hfVar = this.h;
        if (hfVar.j) {
            this.b.Y = hfVar.g;
        }
    }

    @Override // defpackage.ka0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ka0
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        hf hfVar = this.h;
        hfVar.c();
        hfVar.j = false;
        hf hfVar2 = this.i;
        hfVar2.c();
        hfVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
