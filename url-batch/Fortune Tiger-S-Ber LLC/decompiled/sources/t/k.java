package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3344k = new int[2];

    public static void m(int[] iArr, int i4, int i5, int i6, int i7, float f4, int i8) {
        int i9 = i5 - i4;
        int i10 = i7 - i6;
        if (i8 != -1) {
            if (i8 == 0) {
                iArr[0] = (int) ((i10 * f4) + 0.5f);
                iArr[1] = i10;
                return;
            } else {
                if (i8 != 1) {
                    return;
                }
                iArr[0] = i9;
                iArr[1] = (int) ((i9 * f4) + 0.5f);
                return;
            }
        }
        int i11 = (int) ((i10 * f4) + 0.5f);
        int i12 = (int) ((i9 / f4) + 0.5f);
        if (i11 <= i9) {
            iArr[0] = i11;
            iArr[1] = i10;
        } else if (i12 <= i10) {
            iArr[0] = i9;
            iArr[1] = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r5 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02aa  */
    @Override // t.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        float f4;
        boolean z3;
        float f5;
        float f6;
        float f7;
        int i4;
        if (q.e.a(this.f3360j) == 3) {
            s.d dVar2 = this.f3355b;
            l(dVar2.I, dVar2.K, 0);
            return;
        }
        g gVar = this.f3357e;
        boolean z4 = gVar.f3339j;
        f fVar = this.h;
        f fVar2 = this.f3359i;
        if (!z4 && this.f3356d == 3) {
            s.d dVar3 = this.f3355b;
            int i5 = dVar3.f3261r;
            if (i5 == 2) {
                f4 = 0.5f;
                s.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f3237d.f3357e.f3339j) {
                        gVar.d((int) ((r5.g * dVar3.f3266w) + 0.5f));
                    }
                }
            } else if (i5 == 3) {
                int i6 = dVar3.f3262s;
                if (i6 == 0 || i6 == 3) {
                    m mVar = dVar3.f3239e;
                    f fVar3 = mVar.h;
                    f fVar4 = mVar.f3359i;
                    boolean z5 = dVar3.I.f3231f != null;
                    boolean z6 = dVar3.J.f3231f != null;
                    boolean z7 = dVar3.K.f3231f != null;
                    boolean z8 = dVar3.L.f3231f != null;
                    f4 = 0.5f;
                    int i7 = dVar3.X;
                    if (z5 && z6 && z7 && z8) {
                        float f8 = dVar3.W;
                        boolean z9 = fVar3.f3339j;
                        ArrayList arrayList = fVar3.f3341l;
                        int[] iArr = f3344k;
                        if (z9 && fVar4.f3339j) {
                            if (fVar.c && fVar2.c) {
                                m(iArr, ((f) fVar.f3341l.get(0)).g + fVar.f3337f, ((f) fVar2.f3341l.get(0)).g - fVar2.f3337f, fVar3.g + fVar3.f3337f, fVar4.g - fVar4.f3337f, f8, i7);
                                gVar.d(iArr[0]);
                                this.f3355b.f3239e.f3357e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (fVar.f3339j && fVar2.f3339j) {
                            if (!fVar3.c || !fVar4.c) {
                                return;
                            }
                            m(iArr, fVar.g + fVar.f3337f, fVar2.g - fVar2.f3337f, ((f) arrayList.get(0)).g + fVar3.f3337f, ((f) fVar4.f3341l.get(0)).g - fVar4.f3337f, f8, i7);
                            gVar.d(iArr[0]);
                            this.f3355b.f3239e.f3357e.d(iArr[1]);
                        }
                        if (!fVar.c || !fVar2.c || !fVar3.c || !fVar4.c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f3341l.get(0)).g + fVar.f3337f, ((f) fVar2.f3341l.get(0)).g - fVar2.f3337f, ((f) arrayList.get(0)).g + fVar3.f3337f, ((f) fVar4.f3341l.get(0)).g - fVar4.f3337f, f8, i7);
                        gVar.d(iArr[0]);
                        this.f3355b.f3239e.f3357e.d(iArr[1]);
                    } else if (z5 && z7) {
                        if (!fVar.c || !fVar2.c) {
                            return;
                        }
                        float f9 = dVar3.W;
                        int i8 = ((f) fVar.f3341l.get(0)).g + fVar.f3337f;
                        int i9 = ((f) fVar2.f3341l.get(0)).g - fVar2.f3337f;
                        if (i7 == -1 || i7 == 0) {
                            int g = g(i9 - i8, 0);
                            int i10 = (int) ((g * f9) + 0.5f);
                            int g4 = g(i10, 1);
                            if (i10 != g4) {
                                g = (int) ((g4 / f9) + 0.5f);
                            }
                            gVar.d(g);
                            this.f3355b.f3239e.f3357e.d(g4);
                        } else if (i7 == 1) {
                            int g5 = g(i9 - i8, 0);
                            int i11 = (int) ((g5 / f9) + 0.5f);
                            int g6 = g(i11, 1);
                            if (i11 != g6) {
                                g5 = (int) ((g6 * f9) + 0.5f);
                            }
                            gVar.d(g5);
                            this.f3355b.f3239e.f3357e.d(g6);
                        }
                    } else if (z6 && z8) {
                        if (!fVar3.c || !fVar4.c) {
                            return;
                        }
                        float f10 = dVar3.W;
                        int i12 = ((f) fVar3.f3341l.get(0)).g + fVar3.f3337f;
                        int i13 = ((f) fVar4.f3341l.get(0)).g - fVar4.f3337f;
                        if (i7 != -1) {
                            if (i7 == 0) {
                                int g7 = g(i13 - i12, 1);
                                int i14 = (int) ((g7 * f10) + 0.5f);
                                int g8 = g(i14, 0);
                                if (i14 != g8) {
                                    g7 = (int) ((g8 / f10) + 0.5f);
                                }
                                gVar.d(g8);
                                this.f3355b.f3239e.f3357e.d(g7);
                            }
                        }
                        int g9 = g(i13 - i12, 1);
                        int i15 = (int) ((g9 / f10) + 0.5f);
                        int g10 = g(i15, 0);
                        if (i15 != g10) {
                            g9 = (int) ((g10 * f10) + 0.5f);
                        }
                        gVar.d(g10);
                        this.f3355b.f3239e.f3357e.d(g9);
                    }
                } else {
                    int i16 = dVar3.X;
                    if (i16 == -1) {
                        f5 = dVar3.f3239e.f3357e.g;
                        f6 = dVar3.W;
                    } else if (i16 == 0) {
                        f7 = dVar3.f3239e.f3357e.g / dVar3.W;
                        i4 = (int) (f7 + 0.5f);
                        gVar.d(i4);
                    } else if (i16 != 1) {
                        i4 = 0;
                        gVar.d(i4);
                    } else {
                        f5 = dVar3.f3239e.f3357e.g;
                        f6 = dVar3.W;
                    }
                    f7 = f5 * f6;
                    i4 = (int) (f7 + 0.5f);
                    gVar.d(i4);
                }
            }
            z3 = fVar.c;
            ArrayList arrayList2 = fVar.f3341l;
            if (z3) {
                return;
            }
            boolean z10 = fVar2.c;
            ArrayList arrayList3 = fVar2.f3341l;
            if (z10) {
                if (fVar.f3339j && fVar2.f3339j && gVar.f3339j) {
                    return;
                }
                if (!gVar.f3339j && this.f3356d == 3) {
                    s.d dVar5 = this.f3355b;
                    if (dVar5.f3261r == 0 && !dVar5.x()) {
                        f fVar5 = (f) arrayList2.get(0);
                        f fVar6 = (f) arrayList3.get(0);
                        int i17 = fVar5.g + fVar.f3337f;
                        int i18 = fVar6.g + fVar2.f3337f;
                        fVar.d(i17);
                        fVar2.d(i18);
                        gVar.d(i18 - i17);
                        return;
                    }
                }
                if (!gVar.f3339j && this.f3356d == 3 && this.f3354a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((f) arrayList3.get(0)).g + fVar2.f3337f) - (((f) arrayList2.get(0)).g + fVar.f3337f), gVar.f3342m);
                    s.d dVar6 = this.f3355b;
                    int i19 = dVar6.f3265v;
                    int max = Math.max(dVar6.f3264u, min);
                    if (i19 > 0) {
                        max = Math.min(i19, max);
                    }
                    gVar.d(max);
                }
                if (gVar.f3339j) {
                    f fVar7 = (f) arrayList2.get(0);
                    f fVar8 = (f) arrayList3.get(0);
                    int i20 = fVar7.g;
                    int i21 = fVar.f3337f + i20;
                    int i22 = fVar8.g;
                    int i23 = fVar2.f3337f + i22;
                    float f11 = this.f3355b.f3238d0;
                    if (fVar7 == fVar8) {
                        f11 = f4;
                    } else {
                        i20 = i21;
                        i22 = i23;
                    }
                    fVar.d((int) ((((i22 - i20) - gVar.g) * f11) + i20 + f4));
                    fVar2.d(fVar.g + gVar.g);
                    return;
                }
                return;
            }
            return;
        }
        f4 = 0.5f;
        z3 = fVar.c;
        ArrayList arrayList22 = fVar.f3341l;
        if (z3) {
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar;
        s.d dVar2;
        int i4;
        s.d dVar3;
        s.d dVar4;
        int i5;
        s.d dVar5 = this.f3355b;
        boolean z3 = dVar5.f3233a;
        g gVar = this.f3357e;
        if (z3) {
            gVar.d(dVar5.q());
        }
        boolean z4 = gVar.f3339j;
        ArrayList arrayList = gVar.f3340k;
        ArrayList arrayList2 = gVar.f3341l;
        f fVar = this.f3359i;
        f fVar2 = this.h;
        if (!z4) {
            s.d dVar6 = this.f3355b;
            int i6 = dVar6.f3259p0[0];
            this.f3356d = i6;
            if (i6 != 3) {
                if (i6 == 4 && (dVar4 = dVar6.T) != null && ((i5 = dVar4.f3259p0[0]) == 1 || i5 == 4)) {
                    int q4 = (dVar4.q() - this.f3355b.I.e()) - this.f3355b.K.e();
                    o.b(fVar2, dVar4.f3237d.h, this.f3355b.I.e());
                    o.b(fVar, dVar4.f3237d.f3359i, -this.f3355b.K.e());
                    gVar.d(q4);
                    return;
                }
                if (i6 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.f3356d == 4 && (dVar2 = (dVar = this.f3355b).T) != null && ((i4 = dVar2.f3259p0[0]) == 1 || i4 == 4)) {
            o.b(fVar2, dVar2.f3237d.h, dVar.I.e());
            o.b(fVar, dVar2.f3237d.f3359i, -this.f3355b.K.e());
            return;
        }
        if (gVar.f3339j) {
            s.d dVar7 = this.f3355b;
            if (dVar7.f3233a) {
                s.c[] cVarArr = dVar7.Q;
                s.c cVar = cVarArr[0];
                s.c cVar2 = cVar.f3231f;
                if (cVar2 != null && cVarArr[1].f3231f != null) {
                    if (dVar7.x()) {
                        fVar2.f3337f = this.f3355b.Q[0].e();
                        fVar.f3337f = -this.f3355b.Q[1].e();
                        return;
                    }
                    f h = o.h(this.f3355b.Q[0]);
                    if (h != null) {
                        o.b(fVar2, h, this.f3355b.Q[0].e());
                    }
                    f h4 = o.h(this.f3355b.Q[1]);
                    if (h4 != null) {
                        o.b(fVar, h4, -this.f3355b.Q[1].e());
                    }
                    fVar2.f3334b = true;
                    fVar.f3334b = true;
                    return;
                }
                if (cVar2 != null) {
                    f h5 = o.h(cVar);
                    if (h5 != null) {
                        o.b(fVar2, h5, this.f3355b.Q[0].e());
                        o.b(fVar, fVar2, gVar.g);
                        return;
                    }
                    return;
                }
                s.c cVar3 = cVarArr[1];
                if (cVar3.f3231f != null) {
                    f h6 = o.h(cVar3);
                    if (h6 != null) {
                        o.b(fVar, h6, -this.f3355b.Q[1].e());
                        o.b(fVar2, fVar, -gVar.g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof s.i) || dVar7.T == null || dVar7.i(7).f3231f != null) {
                    return;
                }
                s.d dVar8 = this.f3355b;
                o.b(fVar2, dVar8.T.f3237d.h, dVar8.r());
                o.b(fVar, fVar2, gVar.g);
                return;
            }
        }
        if (this.f3356d == 3) {
            s.d dVar9 = this.f3355b;
            int i7 = dVar9.f3261r;
            if (i7 == 2) {
                s.d dVar10 = dVar9.T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f3239e.f3357e;
                    arrayList2.add(gVar2);
                    gVar2.f3340k.add(gVar);
                    gVar.f3334b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i7 == 3) {
                if (dVar9.f3262s == 3) {
                    fVar2.f3333a = this;
                    fVar.f3333a = this;
                    m mVar = dVar9.f3239e;
                    mVar.h.f3333a = this;
                    mVar.f3359i.f3333a = this;
                    gVar.f3333a = this;
                    if (dVar9.y()) {
                        arrayList2.add(this.f3355b.f3239e.f3357e);
                        this.f3355b.f3239e.f3357e.f3340k.add(gVar);
                        m mVar2 = this.f3355b.f3239e;
                        mVar2.f3357e.f3333a = this;
                        arrayList2.add(mVar2.h);
                        arrayList2.add(this.f3355b.f3239e.f3359i);
                        this.f3355b.f3239e.h.f3340k.add(gVar);
                        this.f3355b.f3239e.f3359i.f3340k.add(gVar);
                    } else if (this.f3355b.x()) {
                        this.f3355b.f3239e.f3357e.f3341l.add(gVar);
                        arrayList.add(this.f3355b.f3239e.f3357e);
                    } else {
                        this.f3355b.f3239e.f3357e.f3341l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f3239e.f3357e;
                    arrayList2.add(gVar3);
                    gVar3.f3340k.add(gVar);
                    this.f3355b.f3239e.h.f3340k.add(gVar);
                    this.f3355b.f3239e.f3359i.f3340k.add(gVar);
                    gVar.f3334b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                    fVar2.f3341l.add(gVar);
                    fVar.f3341l.add(gVar);
                }
            }
        }
        s.d dVar11 = this.f3355b;
        s.c[] cVarArr2 = dVar11.Q;
        s.c cVar4 = cVarArr2[0];
        s.c cVar5 = cVar4.f3231f;
        if (cVar5 != null && cVarArr2[1].f3231f != null) {
            if (dVar11.x()) {
                fVar2.f3337f = this.f3355b.Q[0].e();
                fVar.f3337f = -this.f3355b.Q[1].e();
                return;
            }
            f h7 = o.h(this.f3355b.Q[0]);
            f h8 = o.h(this.f3355b.Q[1]);
            if (h7 != null) {
                h7.b(this);
            }
            if (h8 != null) {
                h8.b(this);
            }
            this.f3360j = 4;
            return;
        }
        if (cVar5 != null) {
            f h9 = o.h(cVar4);
            if (h9 != null) {
                o.b(fVar2, h9, this.f3355b.Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        s.c cVar6 = cVarArr2[1];
        if (cVar6.f3231f != null) {
            f h10 = o.h(cVar6);
            if (h10 != null) {
                o.b(fVar, h10, -this.f3355b.Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof s.i) || (dVar3 = dVar11.T) == null) {
            return;
        }
        o.b(fVar2, dVar3.f3237d.h, dVar11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // t.o
    public final void e() {
        f fVar = this.h;
        if (fVar.f3339j) {
            this.f3355b.Y = fVar.g;
        }
    }

    @Override // t.o
    public final void f() {
        this.c = null;
        this.h.c();
        this.f3359i.c();
        this.f3357e.c();
        this.g = false;
    }

    @Override // t.o
    public final boolean k() {
        return this.f3356d != 3 || this.f3355b.f3261r == 0;
    }

    public final void n() {
        this.g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f3339j = false;
        f fVar2 = this.f3359i;
        fVar2.c();
        fVar2.f3339j = false;
        this.f3357e.f3339j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3355b.f3243h0;
    }
}
