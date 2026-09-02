package w;

import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3539k = new int[2];

    public static void m(int[] iArr, int i, int i4, int i5, int i6, float f2, int i7) {
        int i8 = i4 - i;
        int i9 = i6 - i5;
        if (i7 != -1) {
            if (i7 == 0) {
                iArr[0] = (int) ((i9 * f2) + 0.5f);
                iArr[1] = i9;
                return;
            } else {
                if (i7 != 1) {
                    return;
                }
                iArr[0] = i8;
                iArr[1] = (int) ((i8 * f2) + 0.5f);
                return;
            }
        }
        int i10 = (int) ((i9 * f2) + 0.5f);
        int i11 = (int) ((i8 / f2) + 0.5f);
        if (i10 <= i8) {
            iArr[0] = i10;
            iArr[1] = i9;
        } else if (i11 <= i9) {
            iArr[0] = i8;
            iArr[1] = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r5 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02aa  */
    @Override // w.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        float f2;
        boolean z3;
        float f4;
        float f5;
        float f6;
        int i;
        if (t.e.a(this.f3556j) == 3) {
            v.d dVar2 = this.f3550b;
            l(dVar2.I, dVar2.K, 0);
            return;
        }
        g gVar = this.f3552e;
        boolean z4 = gVar.f3534j;
        f fVar = this.f3555h;
        f fVar2 = this.i;
        if (!z4 && this.d == 3) {
            v.d dVar3 = this.f3550b;
            int i4 = dVar3.f3420r;
            if (i4 == 2) {
                f2 = 0.5f;
                v.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.d.f3552e.f3534j) {
                        gVar.d((int) ((r5.f3532g * dVar3.f3425w) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                int i5 = dVar3.f3421s;
                if (i5 == 0 || i5 == 3) {
                    m mVar = dVar3.f3397e;
                    f fVar3 = mVar.f3555h;
                    f fVar4 = mVar.i;
                    boolean z5 = dVar3.I.f3388f != null;
                    boolean z6 = dVar3.J.f3388f != null;
                    boolean z7 = dVar3.K.f3388f != null;
                    boolean z8 = dVar3.L.f3388f != null;
                    f2 = 0.5f;
                    int i6 = dVar3.X;
                    if (z5 && z6 && z7 && z8) {
                        float f7 = dVar3.W;
                        boolean z9 = fVar3.f3534j;
                        ArrayList arrayList = fVar3.f3536l;
                        int[] iArr = f3539k;
                        if (z9 && fVar4.f3534j) {
                            if (fVar.f3529c && fVar2.f3529c) {
                                m(iArr, ((f) fVar.f3536l.get(0)).f3532g + fVar.f3531f, ((f) fVar2.f3536l.get(0)).f3532g - fVar2.f3531f, fVar3.f3532g + fVar3.f3531f, fVar4.f3532g - fVar4.f3531f, f7, i6);
                                gVar.d(iArr[0]);
                                this.f3550b.f3397e.f3552e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (fVar.f3534j && fVar2.f3534j) {
                            if (!fVar3.f3529c || !fVar4.f3529c) {
                                return;
                            }
                            m(iArr, fVar.f3532g + fVar.f3531f, fVar2.f3532g - fVar2.f3531f, ((f) arrayList.get(0)).f3532g + fVar3.f3531f, ((f) fVar4.f3536l.get(0)).f3532g - fVar4.f3531f, f7, i6);
                            gVar.d(iArr[0]);
                            this.f3550b.f3397e.f3552e.d(iArr[1]);
                        }
                        if (!fVar.f3529c || !fVar2.f3529c || !fVar3.f3529c || !fVar4.f3529c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f3536l.get(0)).f3532g + fVar.f3531f, ((f) fVar2.f3536l.get(0)).f3532g - fVar2.f3531f, ((f) arrayList.get(0)).f3532g + fVar3.f3531f, ((f) fVar4.f3536l.get(0)).f3532g - fVar4.f3531f, f7, i6);
                        gVar.d(iArr[0]);
                        this.f3550b.f3397e.f3552e.d(iArr[1]);
                    } else if (z5 && z7) {
                        if (!fVar.f3529c || !fVar2.f3529c) {
                            return;
                        }
                        float f8 = dVar3.W;
                        int i7 = ((f) fVar.f3536l.get(0)).f3532g + fVar.f3531f;
                        int i8 = ((f) fVar2.f3536l.get(0)).f3532g - fVar2.f3531f;
                        if (i6 == -1 || i6 == 0) {
                            int g4 = g(i8 - i7, 0);
                            int i9 = (int) ((g4 * f8) + 0.5f);
                            int g5 = g(i9, 1);
                            if (i9 != g5) {
                                g4 = (int) ((g5 / f8) + 0.5f);
                            }
                            gVar.d(g4);
                            this.f3550b.f3397e.f3552e.d(g5);
                        } else if (i6 == 1) {
                            int g6 = g(i8 - i7, 0);
                            int i10 = (int) ((g6 / f8) + 0.5f);
                            int g7 = g(i10, 1);
                            if (i10 != g7) {
                                g6 = (int) ((g7 * f8) + 0.5f);
                            }
                            gVar.d(g6);
                            this.f3550b.f3397e.f3552e.d(g7);
                        }
                    } else if (z6 && z8) {
                        if (!fVar3.f3529c || !fVar4.f3529c) {
                            return;
                        }
                        float f9 = dVar3.W;
                        int i11 = ((f) fVar3.f3536l.get(0)).f3532g + fVar3.f3531f;
                        int i12 = ((f) fVar4.f3536l.get(0)).f3532g - fVar4.f3531f;
                        if (i6 != -1) {
                            if (i6 == 0) {
                                int g8 = g(i12 - i11, 1);
                                int i13 = (int) ((g8 * f9) + 0.5f);
                                int g9 = g(i13, 0);
                                if (i13 != g9) {
                                    g8 = (int) ((g9 / f9) + 0.5f);
                                }
                                gVar.d(g9);
                                this.f3550b.f3397e.f3552e.d(g8);
                            }
                        }
                        int g10 = g(i12 - i11, 1);
                        int i14 = (int) ((g10 / f9) + 0.5f);
                        int g11 = g(i14, 0);
                        if (i14 != g11) {
                            g10 = (int) ((g11 * f9) + 0.5f);
                        }
                        gVar.d(g11);
                        this.f3550b.f3397e.f3552e.d(g10);
                    }
                } else {
                    int i15 = dVar3.X;
                    if (i15 == -1) {
                        f4 = dVar3.f3397e.f3552e.f3532g;
                        f5 = dVar3.W;
                    } else if (i15 == 0) {
                        f6 = dVar3.f3397e.f3552e.f3532g / dVar3.W;
                        i = (int) (f6 + 0.5f);
                        gVar.d(i);
                    } else if (i15 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f4 = dVar3.f3397e.f3552e.f3532g;
                        f5 = dVar3.W;
                    }
                    f6 = f4 * f5;
                    i = (int) (f6 + 0.5f);
                    gVar.d(i);
                }
            }
            z3 = fVar.f3529c;
            ArrayList arrayList2 = fVar.f3536l;
            if (z3) {
                return;
            }
            boolean z10 = fVar2.f3529c;
            ArrayList arrayList3 = fVar2.f3536l;
            if (z10) {
                if (fVar.f3534j && fVar2.f3534j && gVar.f3534j) {
                    return;
                }
                if (!gVar.f3534j && this.d == 3) {
                    v.d dVar5 = this.f3550b;
                    if (dVar5.f3420r == 0 && !dVar5.x()) {
                        f fVar5 = (f) arrayList2.get(0);
                        f fVar6 = (f) arrayList3.get(0);
                        int i16 = fVar5.f3532g + fVar.f3531f;
                        int i17 = fVar6.f3532g + fVar2.f3531f;
                        fVar.d(i16);
                        fVar2.d(i17);
                        gVar.d(i17 - i16);
                        return;
                    }
                }
                if (!gVar.f3534j && this.d == 3 && this.f3549a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((f) arrayList3.get(0)).f3532g + fVar2.f3531f) - (((f) arrayList2.get(0)).f3532g + fVar.f3531f), gVar.f3537m);
                    v.d dVar6 = this.f3550b;
                    int i18 = dVar6.f3424v;
                    int max = Math.max(dVar6.f3423u, min);
                    if (i18 > 0) {
                        max = Math.min(i18, max);
                    }
                    gVar.d(max);
                }
                if (gVar.f3534j) {
                    f fVar7 = (f) arrayList2.get(0);
                    f fVar8 = (f) arrayList3.get(0);
                    int i19 = fVar7.f3532g;
                    int i20 = fVar.f3531f + i19;
                    int i21 = fVar8.f3532g;
                    int i22 = fVar2.f3531f + i21;
                    float f10 = this.f3550b.d0;
                    if (fVar7 == fVar8) {
                        f10 = f2;
                    } else {
                        i19 = i20;
                        i21 = i22;
                    }
                    fVar.d((int) ((((i21 - i19) - gVar.f3532g) * f10) + i19 + f2));
                    fVar2.d(fVar.f3532g + gVar.f3532g);
                    return;
                }
                return;
            }
            return;
        }
        f2 = 0.5f;
        z3 = fVar.f3529c;
        ArrayList arrayList22 = fVar.f3536l;
        if (z3) {
        }
    }

    @Override // w.o
    public final void d() {
        v.d dVar;
        v.d dVar2;
        int i;
        v.d dVar3;
        v.d dVar4;
        int i4;
        v.d dVar5 = this.f3550b;
        boolean z3 = dVar5.f3391a;
        g gVar = this.f3552e;
        if (z3) {
            gVar.d(dVar5.q());
        }
        boolean z4 = gVar.f3534j;
        ArrayList arrayList = gVar.f3535k;
        ArrayList arrayList2 = gVar.f3536l;
        f fVar = this.i;
        f fVar2 = this.f3555h;
        if (!z4) {
            v.d dVar6 = this.f3550b;
            int i5 = dVar6.f3418p0[0];
            this.d = i5;
            if (i5 != 3) {
                if (i5 == 4 && (dVar4 = dVar6.T) != null && ((i4 = dVar4.f3418p0[0]) == 1 || i4 == 4)) {
                    int q3 = (dVar4.q() - this.f3550b.I.e()) - this.f3550b.K.e();
                    o.b(fVar2, dVar4.d.f3555h, this.f3550b.I.e());
                    o.b(fVar, dVar4.d.i, -this.f3550b.K.e());
                    gVar.d(q3);
                    return;
                }
                if (i5 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f3550b).T) != null && ((i = dVar2.f3418p0[0]) == 1 || i == 4)) {
            o.b(fVar2, dVar2.d.f3555h, dVar.I.e());
            o.b(fVar, dVar2.d.i, -this.f3550b.K.e());
            return;
        }
        if (gVar.f3534j) {
            v.d dVar7 = this.f3550b;
            if (dVar7.f3391a) {
                v.c[] cVarArr = dVar7.Q;
                v.c cVar = cVarArr[0];
                v.c cVar2 = cVar.f3388f;
                if (cVar2 != null && cVarArr[1].f3388f != null) {
                    if (dVar7.x()) {
                        fVar2.f3531f = this.f3550b.Q[0].e();
                        fVar.f3531f = -this.f3550b.Q[1].e();
                        return;
                    }
                    f h4 = o.h(this.f3550b.Q[0]);
                    if (h4 != null) {
                        o.b(fVar2, h4, this.f3550b.Q[0].e());
                    }
                    f h5 = o.h(this.f3550b.Q[1]);
                    if (h5 != null) {
                        o.b(fVar, h5, -this.f3550b.Q[1].e());
                    }
                    fVar2.f3528b = true;
                    fVar.f3528b = true;
                    return;
                }
                if (cVar2 != null) {
                    f h6 = o.h(cVar);
                    if (h6 != null) {
                        o.b(fVar2, h6, this.f3550b.Q[0].e());
                        o.b(fVar, fVar2, gVar.f3532g);
                        return;
                    }
                    return;
                }
                v.c cVar3 = cVarArr[1];
                if (cVar3.f3388f != null) {
                    f h7 = o.h(cVar3);
                    if (h7 != null) {
                        o.b(fVar, h7, -this.f3550b.Q[1].e());
                        o.b(fVar2, fVar, -gVar.f3532g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof v.i) || dVar7.T == null || dVar7.i(7).f3388f != null) {
                    return;
                }
                v.d dVar8 = this.f3550b;
                o.b(fVar2, dVar8.T.d.f3555h, dVar8.r());
                o.b(fVar, fVar2, gVar.f3532g);
                return;
            }
        }
        if (this.d == 3) {
            v.d dVar9 = this.f3550b;
            int i6 = dVar9.f3420r;
            if (i6 == 2) {
                v.d dVar10 = dVar9.T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f3397e.f3552e;
                    arrayList2.add(gVar2);
                    gVar2.f3535k.add(gVar);
                    gVar.f3528b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i6 == 3) {
                if (dVar9.f3421s == 3) {
                    fVar2.f3527a = this;
                    fVar.f3527a = this;
                    m mVar = dVar9.f3397e;
                    mVar.f3555h.f3527a = this;
                    mVar.i.f3527a = this;
                    gVar.f3527a = this;
                    if (dVar9.y()) {
                        arrayList2.add(this.f3550b.f3397e.f3552e);
                        this.f3550b.f3397e.f3552e.f3535k.add(gVar);
                        m mVar2 = this.f3550b.f3397e;
                        mVar2.f3552e.f3527a = this;
                        arrayList2.add(mVar2.f3555h);
                        arrayList2.add(this.f3550b.f3397e.i);
                        this.f3550b.f3397e.f3555h.f3535k.add(gVar);
                        this.f3550b.f3397e.i.f3535k.add(gVar);
                    } else if (this.f3550b.x()) {
                        this.f3550b.f3397e.f3552e.f3536l.add(gVar);
                        arrayList.add(this.f3550b.f3397e.f3552e);
                    } else {
                        this.f3550b.f3397e.f3552e.f3536l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f3397e.f3552e;
                    arrayList2.add(gVar3);
                    gVar3.f3535k.add(gVar);
                    this.f3550b.f3397e.f3555h.f3535k.add(gVar);
                    this.f3550b.f3397e.i.f3535k.add(gVar);
                    gVar.f3528b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                    fVar2.f3536l.add(gVar);
                    fVar.f3536l.add(gVar);
                }
            }
        }
        v.d dVar11 = this.f3550b;
        v.c[] cVarArr2 = dVar11.Q;
        v.c cVar4 = cVarArr2[0];
        v.c cVar5 = cVar4.f3388f;
        if (cVar5 != null && cVarArr2[1].f3388f != null) {
            if (dVar11.x()) {
                fVar2.f3531f = this.f3550b.Q[0].e();
                fVar.f3531f = -this.f3550b.Q[1].e();
                return;
            }
            f h8 = o.h(this.f3550b.Q[0]);
            f h9 = o.h(this.f3550b.Q[1]);
            if (h8 != null) {
                h8.b(this);
            }
            if (h9 != null) {
                h9.b(this);
            }
            this.f3556j = 4;
            return;
        }
        if (cVar5 != null) {
            f h10 = o.h(cVar4);
            if (h10 != null) {
                o.b(fVar2, h10, this.f3550b.Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        v.c cVar6 = cVarArr2[1];
        if (cVar6.f3388f != null) {
            f h11 = o.h(cVar6);
            if (h11 != null) {
                o.b(fVar, h11, -this.f3550b.Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof v.i) || (dVar3 = dVar11.T) == null) {
            return;
        }
        o.b(fVar2, dVar3.d.f3555h, dVar11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // w.o
    public final void e() {
        f fVar = this.f3555h;
        if (fVar.f3534j) {
            this.f3550b.Y = fVar.f3532g;
        }
    }

    @Override // w.o
    public final void f() {
        this.f3551c = null;
        this.f3555h.c();
        this.i.c();
        this.f3552e.c();
        this.f3554g = false;
    }

    @Override // w.o
    public final boolean k() {
        return this.d != 3 || this.f3550b.f3420r == 0;
    }

    public final void n() {
        this.f3554g = false;
        f fVar = this.f3555h;
        fVar.c();
        fVar.f3534j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f3534j = false;
        this.f3552e.f3534j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3550b.f3404h0;
    }
}
