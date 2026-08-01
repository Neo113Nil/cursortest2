package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class i80 extends ka0 {
    public hf k;
    public t7 l;

    @Override // defpackage.ff
    public final void a(ff ffVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (d30.h(this.j) == 3) {
            ad adVar = this.b;
            l(adVar.J, adVar.L, 1);
            return;
        }
        xf xfVar = this.e;
        if (xfVar.c && !xfVar.j && this.d == 3) {
            ad adVar2 = this.b;
            int i2 = adVar2.s;
            if (i2 == 2) {
                ad adVar3 = adVar2.T;
                if (adVar3 != null) {
                    if (adVar3.e.e.j) {
                        xfVar.d((int) ((r5.g * adVar2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                xf xfVar2 = adVar2.d.e;
                if (xfVar2.j) {
                    int i3 = adVar2.X;
                    if (i3 == -1) {
                        f = xfVar2.g;
                        f2 = adVar2.W;
                    } else if (i3 == 0) {
                        f3 = xfVar2.g * adVar2.W;
                        i = (int) (f3 + 0.5f);
                        xfVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        xfVar.d(i);
                    } else {
                        f = xfVar2.g;
                        f2 = adVar2.W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    xfVar.d(i);
                }
            }
        }
        hf hfVar = this.h;
        boolean z = hfVar.c;
        ArrayList arrayList = hfVar.l;
        if (z) {
            hf hfVar2 = this.i;
            boolean z2 = hfVar2.c;
            ArrayList arrayList2 = hfVar2.l;
            if (z2) {
                if (hfVar.j && hfVar2.j && xfVar.j) {
                    return;
                }
                if (!xfVar.j && this.d == 3) {
                    ad adVar4 = this.b;
                    if (adVar4.r == 0 && !adVar4.y()) {
                        hf hfVar3 = (hf) arrayList.get(0);
                        hf hfVar4 = (hf) arrayList2.get(0);
                        int i4 = hfVar3.g + hfVar.f;
                        int i5 = hfVar4.g + hfVar2.f;
                        hfVar.d(i4);
                        hfVar2.d(i5);
                        xfVar.d(i5 - i4);
                        return;
                    }
                }
                if (!xfVar.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    hf hfVar5 = (hf) arrayList.get(0);
                    int i6 = (((hf) arrayList2.get(0)).g + hfVar2.f) - (hfVar5.g + hfVar.f);
                    int i7 = xfVar.m;
                    if (i6 < i7) {
                        xfVar.d(i6);
                    } else {
                        xfVar.d(i7);
                    }
                }
                if (xfVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    hf hfVar6 = (hf) arrayList.get(0);
                    hf hfVar7 = (hf) arrayList2.get(0);
                    int i8 = hfVar6.g;
                    int i9 = hfVar.f + i8;
                    int i10 = hfVar7.g;
                    int i11 = hfVar2.f + i10;
                    float f4 = this.b.e0;
                    if (hfVar6 == hfVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    hfVar.d((int) ((((i10 - i8) - xfVar.g) * f4) + i8 + 0.5f));
                    hfVar2.d(hfVar.g + xfVar.g);
                }
            }
        }
    }

    @Override // defpackage.ka0
    public final void d() {
        ad adVar;
        ad adVar2;
        ad adVar3;
        ad adVar4;
        hf hfVar = this.k;
        ad adVar5 = this.b;
        boolean z = adVar5.a;
        xf xfVar = this.e;
        if (z) {
            xfVar.d(adVar5.k());
        }
        boolean z2 = xfVar.j;
        ArrayList arrayList = xfVar.k;
        ArrayList arrayList2 = xfVar.l;
        hf hfVar2 = this.i;
        hf hfVar3 = this.h;
        if (!z2) {
            ad adVar6 = this.b;
            this.d = adVar6.p0[1];
            if (adVar6.E) {
                this.l = new t7(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (adVar4 = this.b.T) != null && adVar4.p0[1] == 1) {
                    int k = (adVar4.k() - this.b.J.e()) - this.b.L.e();
                    ka0.b(hfVar3, adVar4.e.h, this.b.J.e());
                    ka0.b(hfVar2, adVar4.e.i, -this.b.L.e());
                    xfVar.d(k);
                    return;
                }
                if (i == 1) {
                    xfVar.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (adVar2 = (adVar = this.b).T) != null && adVar2.p0[1] == 1) {
            ka0.b(hfVar3, adVar2.e.h, adVar.J.e());
            ka0.b(hfVar2, adVar2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = xfVar.j;
        if (z3) {
            ad adVar7 = this.b;
            if (adVar7.a) {
                lc[] lcVarArr = adVar7.Q;
                lc lcVar = lcVarArr[2];
                lc lcVar2 = lcVar.f;
                if (lcVar2 != null && lcVarArr[3].f != null) {
                    boolean y = adVar7.y();
                    ad adVar8 = this.b;
                    if (y) {
                        hfVar3.f = adVar8.Q[2].e();
                        hfVar2.f = -this.b.Q[3].e();
                    } else {
                        hf h = ka0.h(adVar8.Q[2]);
                        if (h != null) {
                            ka0.b(hfVar3, h, this.b.Q[2].e());
                        }
                        hf h2 = ka0.h(this.b.Q[3]);
                        if (h2 != null) {
                            ka0.b(hfVar2, h2, -this.b.Q[3].e());
                        }
                        hfVar3.b = true;
                        hfVar2.b = true;
                    }
                    ad adVar9 = this.b;
                    if (adVar9.E) {
                        ka0.b(hfVar, hfVar3, adVar9.a0);
                        return;
                    }
                    return;
                }
                if (lcVar2 != null) {
                    hf h3 = ka0.h(lcVar);
                    if (h3 != null) {
                        ka0.b(hfVar3, h3, this.b.Q[2].e());
                        ka0.b(hfVar2, hfVar3, xfVar.g);
                        ad adVar10 = this.b;
                        if (adVar10.E) {
                            ka0.b(hfVar, hfVar3, adVar10.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                lc lcVar3 = lcVarArr[3];
                if (lcVar3.f != null) {
                    hf h4 = ka0.h(lcVar3);
                    if (h4 != null) {
                        ka0.b(hfVar2, h4, -this.b.Q[3].e());
                        ka0.b(hfVar3, hfVar2, -xfVar.g);
                    }
                    ad adVar11 = this.b;
                    if (adVar11.E) {
                        ka0.b(hfVar, hfVar3, adVar11.a0);
                        return;
                    }
                    return;
                }
                lc lcVar4 = lcVarArr[4];
                if (lcVar4.f != null) {
                    hf h5 = ka0.h(lcVar4);
                    if (h5 != null) {
                        ka0.b(hfVar, h5, 0);
                        ka0.b(hfVar3, hfVar, -this.b.a0);
                        ka0.b(hfVar2, hfVar3, xfVar.g);
                        return;
                    }
                    return;
                }
                if ((adVar7 instanceof an) || adVar7.T == null || adVar7.i(7).f != null) {
                    return;
                }
                ad adVar12 = this.b;
                ka0.b(hfVar3, adVar12.T.e.h, adVar12.s());
                ka0.b(hfVar2, hfVar3, xfVar.g);
                ad adVar13 = this.b;
                if (adVar13.E) {
                    ka0.b(hfVar, hfVar3, adVar13.a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            xfVar.b(this);
        } else {
            ad adVar14 = this.b;
            int i2 = adVar14.s;
            if (i2 == 2) {
                ad adVar15 = adVar14.T;
                if (adVar15 != null) {
                    xf xfVar2 = adVar15.e.e;
                    arrayList2.add(xfVar2);
                    xfVar2.k.add(xfVar);
                    xfVar.b = true;
                    arrayList.add(hfVar3);
                    arrayList.add(hfVar2);
                }
            } else if (i2 == 3 && !adVar14.y()) {
                ad adVar16 = this.b;
                if (adVar16.r != 3) {
                    xf xfVar3 = adVar16.d.e;
                    arrayList2.add(xfVar3);
                    xfVar3.k.add(xfVar);
                    xfVar.b = true;
                    arrayList.add(hfVar3);
                    arrayList.add(hfVar2);
                }
            }
        }
        ad adVar17 = this.b;
        lc[] lcVarArr2 = adVar17.Q;
        lc lcVar5 = lcVarArr2[2];
        lc lcVar6 = lcVar5.f;
        if (lcVar6 != null && lcVarArr2[3].f != null) {
            boolean y2 = adVar17.y();
            ad adVar18 = this.b;
            if (y2) {
                hfVar3.f = adVar18.Q[2].e();
                hfVar2.f = -this.b.Q[3].e();
            } else {
                hf h6 = ka0.h(adVar18.Q[2]);
                hf h7 = ka0.h(this.b.Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(hfVar, hfVar3, 1, this.l);
            }
        } else if (lcVar6 != null) {
            hf h8 = ka0.h(lcVar5);
            if (h8 != null) {
                ka0.b(hfVar3, h8, this.b.Q[2].e());
                c(hfVar2, hfVar3, 1, xfVar);
                if (this.b.E) {
                    c(hfVar, hfVar3, 1, this.l);
                }
                if (this.d == 3) {
                    ad adVar19 = this.b;
                    if (adVar19.W > 0.0f) {
                        en enVar = adVar19.d;
                        if (enVar.d == 3) {
                            enVar.e.k.add(xfVar);
                            arrayList2.add(this.b.d.e);
                            xfVar.a = this;
                        }
                    }
                }
            }
        } else {
            lc lcVar7 = lcVarArr2[3];
            if (lcVar7.f != null) {
                hf h9 = ka0.h(lcVar7);
                if (h9 != null) {
                    ka0.b(hfVar2, h9, -this.b.Q[3].e());
                    c(hfVar3, hfVar2, -1, xfVar);
                    if (this.b.E) {
                        c(hfVar, hfVar3, 1, this.l);
                    }
                }
            } else {
                lc lcVar8 = lcVarArr2[4];
                if (lcVar8.f != null) {
                    hf h10 = ka0.h(lcVar8);
                    if (h10 != null) {
                        ka0.b(hfVar, h10, 0);
                        c(hfVar3, hfVar, -1, this.l);
                        c(hfVar2, hfVar3, 1, xfVar);
                    }
                } else if (!(adVar17 instanceof an) && (adVar3 = adVar17.T) != null) {
                    ka0.b(hfVar3, adVar3.e.h, adVar17.s());
                    c(hfVar2, hfVar3, 1, xfVar);
                    if (this.b.E) {
                        c(hfVar, hfVar3, 1, this.l);
                    }
                    if (this.d == 3) {
                        ad adVar20 = this.b;
                        if (adVar20.W > 0.0f) {
                            en enVar2 = adVar20.d;
                            if (enVar2.d == 3) {
                                enVar2.e.k.add(xfVar);
                                arrayList2.add(this.b.d.e);
                                xfVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            xfVar.c = true;
        }
    }

    @Override // defpackage.ka0
    public final void e() {
        hf hfVar = this.h;
        if (hfVar.j) {
            this.b.Z = hfVar.g;
        }
    }

    @Override // defpackage.ka0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ka0
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        hf hfVar = this.h;
        hfVar.c();
        hfVar.j = false;
        hf hfVar2 = this.i;
        hfVar2.c();
        hfVar2.j = false;
        hf hfVar3 = this.k;
        hfVar3.c();
        hfVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
