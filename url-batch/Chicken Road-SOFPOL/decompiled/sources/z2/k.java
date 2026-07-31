package z2;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f9150k = new int[2];

    public static void m(int[] iArr, int i, int i8, int i9, int i10, float f6, int i11) {
        int i12 = i8 - i;
        int i13 = i10 - i9;
        if (i11 != -1) {
            if (i11 == 0) {
                iArr[0] = (int) ((i13 * f6) + 0.5f);
                iArr[1] = i13;
                return;
            } else {
                if (i11 != 1) {
                    return;
                }
                iArr[0] = i12;
                iArr[1] = (int) ((i12 * f6) + 0.5f);
                return;
            }
        }
        int i14 = (int) ((i13 * f6) + 0.5f);
        int i15 = (int) ((i12 / f6) + 0.5f);
        if (i14 <= i12) {
            iArr[0] = i14;
            iArr[1] = i13;
        } else if (i15 <= i13) {
            iArr[0] = i12;
            iArr[1] = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r5 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02aa  */
    @Override // z2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        float f6;
        boolean z3;
        float f8;
        float f9;
        float f10;
        int i;
        if (w2.e.a(this.f9169j) == 3) {
            y2.d dVar2 = this.f9162b;
            l(dVar2.I, dVar2.K, 0);
            return;
        }
        g gVar = this.f9165e;
        boolean z7 = gVar.f9145j;
        f fVar = this.f9168h;
        f fVar2 = this.i;
        if (!z7 && this.f9164d == 3) {
            y2.d dVar3 = this.f9162b;
            int i8 = dVar3.f8779r;
            if (i8 == 2) {
                f6 = 0.5f;
                y2.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f8753d.f9165e.f9145j) {
                        gVar.d((int) ((r5.f9143g * dVar3.f8784w) + 0.5f));
                    }
                }
            } else if (i8 == 3) {
                int i9 = dVar3.f8780s;
                if (i9 == 0 || i9 == 3) {
                    m mVar = dVar3.f8755e;
                    f fVar3 = mVar.f9168h;
                    f fVar4 = mVar.i;
                    boolean z8 = dVar3.I.f8744f != null;
                    boolean z9 = dVar3.J.f8744f != null;
                    boolean z10 = dVar3.K.f8744f != null;
                    boolean z11 = dVar3.L.f8744f != null;
                    f6 = 0.5f;
                    int i10 = dVar3.X;
                    if (z8 && z9 && z10 && z11) {
                        float f11 = dVar3.W;
                        boolean z12 = fVar3.f9145j;
                        ArrayList arrayList = fVar3.f9147l;
                        int[] iArr = f9150k;
                        if (z12 && fVar4.f9145j) {
                            if (fVar.f9139c && fVar2.f9139c) {
                                m(iArr, ((f) fVar.f9147l.get(0)).f9143g + fVar.f9142f, ((f) fVar2.f9147l.get(0)).f9143g - fVar2.f9142f, fVar3.f9143g + fVar3.f9142f, fVar4.f9143g - fVar4.f9142f, f11, i10);
                                gVar.d(iArr[0]);
                                this.f9162b.f8755e.f9165e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (fVar.f9145j && fVar2.f9145j) {
                            if (!fVar3.f9139c || !fVar4.f9139c) {
                                return;
                            }
                            m(iArr, fVar.f9143g + fVar.f9142f, fVar2.f9143g - fVar2.f9142f, ((f) arrayList.get(0)).f9143g + fVar3.f9142f, ((f) fVar4.f9147l.get(0)).f9143g - fVar4.f9142f, f11, i10);
                            gVar.d(iArr[0]);
                            this.f9162b.f8755e.f9165e.d(iArr[1]);
                        }
                        if (!fVar.f9139c || !fVar2.f9139c || !fVar3.f9139c || !fVar4.f9139c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f9147l.get(0)).f9143g + fVar.f9142f, ((f) fVar2.f9147l.get(0)).f9143g - fVar2.f9142f, ((f) arrayList.get(0)).f9143g + fVar3.f9142f, ((f) fVar4.f9147l.get(0)).f9143g - fVar4.f9142f, f11, i10);
                        gVar.d(iArr[0]);
                        this.f9162b.f8755e.f9165e.d(iArr[1]);
                    } else if (z8 && z10) {
                        if (!fVar.f9139c || !fVar2.f9139c) {
                            return;
                        }
                        float f12 = dVar3.W;
                        int i11 = ((f) fVar.f9147l.get(0)).f9143g + fVar.f9142f;
                        int i12 = ((f) fVar2.f9147l.get(0)).f9143g - fVar2.f9142f;
                        if (i10 == -1 || i10 == 0) {
                            int g3 = g(i12 - i11, 0);
                            int i13 = (int) ((g3 * f12) + 0.5f);
                            int g7 = g(i13, 1);
                            if (i13 != g7) {
                                g3 = (int) ((g7 / f12) + 0.5f);
                            }
                            gVar.d(g3);
                            this.f9162b.f8755e.f9165e.d(g7);
                        } else if (i10 == 1) {
                            int g8 = g(i12 - i11, 0);
                            int i14 = (int) ((g8 / f12) + 0.5f);
                            int g9 = g(i14, 1);
                            if (i14 != g9) {
                                g8 = (int) ((g9 * f12) + 0.5f);
                            }
                            gVar.d(g8);
                            this.f9162b.f8755e.f9165e.d(g9);
                        }
                    } else if (z9 && z11) {
                        if (!fVar3.f9139c || !fVar4.f9139c) {
                            return;
                        }
                        float f13 = dVar3.W;
                        int i15 = ((f) fVar3.f9147l.get(0)).f9143g + fVar3.f9142f;
                        int i16 = ((f) fVar4.f9147l.get(0)).f9143g - fVar4.f9142f;
                        if (i10 != -1) {
                            if (i10 == 0) {
                                int g10 = g(i16 - i15, 1);
                                int i17 = (int) ((g10 * f13) + 0.5f);
                                int g11 = g(i17, 0);
                                if (i17 != g11) {
                                    g10 = (int) ((g11 / f13) + 0.5f);
                                }
                                gVar.d(g11);
                                this.f9162b.f8755e.f9165e.d(g10);
                            }
                        }
                        int g12 = g(i16 - i15, 1);
                        int i18 = (int) ((g12 / f13) + 0.5f);
                        int g13 = g(i18, 0);
                        if (i18 != g13) {
                            g12 = (int) ((g13 * f13) + 0.5f);
                        }
                        gVar.d(g13);
                        this.f9162b.f8755e.f9165e.d(g12);
                    }
                } else {
                    int i19 = dVar3.X;
                    if (i19 == -1) {
                        f8 = dVar3.f8755e.f9165e.f9143g;
                        f9 = dVar3.W;
                    } else if (i19 == 0) {
                        f10 = dVar3.f8755e.f9165e.f9143g / dVar3.W;
                        i = (int) (f10 + 0.5f);
                        gVar.d(i);
                    } else if (i19 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f8 = dVar3.f8755e.f9165e.f9143g;
                        f9 = dVar3.W;
                    }
                    f10 = f8 * f9;
                    i = (int) (f10 + 0.5f);
                    gVar.d(i);
                }
            }
            z3 = fVar.f9139c;
            ArrayList arrayList2 = fVar.f9147l;
            if (z3) {
                return;
            }
            boolean z13 = fVar2.f9139c;
            ArrayList arrayList3 = fVar2.f9147l;
            if (z13) {
                if (fVar.f9145j && fVar2.f9145j && gVar.f9145j) {
                    return;
                }
                if (!gVar.f9145j && this.f9164d == 3) {
                    y2.d dVar5 = this.f9162b;
                    if (dVar5.f8779r == 0 && !dVar5.x()) {
                        f fVar5 = (f) arrayList2.get(0);
                        f fVar6 = (f) arrayList3.get(0);
                        int i20 = fVar5.f9143g + fVar.f9142f;
                        int i21 = fVar6.f9143g + fVar2.f9142f;
                        fVar.d(i20);
                        fVar2.d(i21);
                        gVar.d(i21 - i20);
                        return;
                    }
                }
                if (!gVar.f9145j && this.f9164d == 3 && this.f9161a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((f) arrayList3.get(0)).f9143g + fVar2.f9142f) - (((f) arrayList2.get(0)).f9143g + fVar.f9142f), gVar.f9148m);
                    y2.d dVar6 = this.f9162b;
                    int i22 = dVar6.f8783v;
                    int max = Math.max(dVar6.f8782u, min);
                    if (i22 > 0) {
                        max = Math.min(i22, max);
                    }
                    gVar.d(max);
                }
                if (gVar.f9145j) {
                    f fVar7 = (f) arrayList2.get(0);
                    f fVar8 = (f) arrayList3.get(0);
                    int i23 = fVar7.f9143g;
                    int i24 = fVar.f9142f + i23;
                    int i25 = fVar8.f9143g;
                    int i26 = fVar2.f9142f + i25;
                    float f14 = this.f9162b.f8754d0;
                    if (fVar7 == fVar8) {
                        f14 = f6;
                    } else {
                        i23 = i24;
                        i25 = i26;
                    }
                    fVar.d((int) ((((i25 - i23) - gVar.f9143g) * f14) + i23 + f6));
                    fVar2.d(fVar.f9143g + gVar.f9143g);
                    return;
                }
                return;
            }
            return;
        }
        f6 = 0.5f;
        z3 = fVar.f9139c;
        ArrayList arrayList22 = fVar.f9147l;
        if (z3) {
        }
    }

    @Override // z2.o
    public final void d() {
        y2.d dVar;
        y2.d dVar2;
        int i;
        y2.d dVar3;
        y2.d dVar4;
        int i8;
        y2.d dVar5 = this.f9162b;
        boolean z3 = dVar5.f8747a;
        g gVar = this.f9165e;
        if (z3) {
            gVar.d(dVar5.q());
        }
        boolean z7 = gVar.f9145j;
        ArrayList arrayList = gVar.f9146k;
        ArrayList arrayList2 = gVar.f9147l;
        f fVar = this.i;
        f fVar2 = this.f9168h;
        if (!z7) {
            y2.d dVar6 = this.f9162b;
            int i9 = dVar6.f8777p0[0];
            this.f9164d = i9;
            if (i9 != 3) {
                if (i9 == 4 && (dVar4 = dVar6.T) != null && ((i8 = dVar4.f8777p0[0]) == 1 || i8 == 4)) {
                    int q4 = (dVar4.q() - this.f9162b.I.e()) - this.f9162b.K.e();
                    o.b(fVar2, dVar4.f8753d.f9168h, this.f9162b.I.e());
                    o.b(fVar, dVar4.f8753d.i, -this.f9162b.K.e());
                    gVar.d(q4);
                    return;
                }
                if (i9 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.f9164d == 4 && (dVar2 = (dVar = this.f9162b).T) != null && ((i = dVar2.f8777p0[0]) == 1 || i == 4)) {
            o.b(fVar2, dVar2.f8753d.f9168h, dVar.I.e());
            o.b(fVar, dVar2.f8753d.i, -this.f9162b.K.e());
            return;
        }
        if (gVar.f9145j) {
            y2.d dVar7 = this.f9162b;
            if (dVar7.f8747a) {
                y2.c[] cVarArr = dVar7.Q;
                y2.c cVar = cVarArr[0];
                y2.c cVar2 = cVar.f8744f;
                if (cVar2 != null && cVarArr[1].f8744f != null) {
                    if (dVar7.x()) {
                        fVar2.f9142f = this.f9162b.Q[0].e();
                        fVar.f9142f = -this.f9162b.Q[1].e();
                        return;
                    }
                    f h8 = o.h(this.f9162b.Q[0]);
                    if (h8 != null) {
                        o.b(fVar2, h8, this.f9162b.Q[0].e());
                    }
                    f h9 = o.h(this.f9162b.Q[1]);
                    if (h9 != null) {
                        o.b(fVar, h9, -this.f9162b.Q[1].e());
                    }
                    fVar2.f9138b = true;
                    fVar.f9138b = true;
                    return;
                }
                if (cVar2 != null) {
                    f h10 = o.h(cVar);
                    if (h10 != null) {
                        o.b(fVar2, h10, this.f9162b.Q[0].e());
                        o.b(fVar, fVar2, gVar.f9143g);
                        return;
                    }
                    return;
                }
                y2.c cVar3 = cVarArr[1];
                if (cVar3.f8744f != null) {
                    f h11 = o.h(cVar3);
                    if (h11 != null) {
                        o.b(fVar, h11, -this.f9162b.Q[1].e());
                        o.b(fVar2, fVar, -gVar.f9143g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof y2.i) || dVar7.T == null || dVar7.i(7).f8744f != null) {
                    return;
                }
                y2.d dVar8 = this.f9162b;
                o.b(fVar2, dVar8.T.f8753d.f9168h, dVar8.r());
                o.b(fVar, fVar2, gVar.f9143g);
                return;
            }
        }
        if (this.f9164d == 3) {
            y2.d dVar9 = this.f9162b;
            int i10 = dVar9.f8779r;
            if (i10 == 2) {
                y2.d dVar10 = dVar9.T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f8755e.f9165e;
                    arrayList2.add(gVar2);
                    gVar2.f9146k.add(gVar);
                    gVar.f9138b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i10 == 3) {
                if (dVar9.f8780s == 3) {
                    fVar2.f9137a = this;
                    fVar.f9137a = this;
                    m mVar = dVar9.f8755e;
                    mVar.f9168h.f9137a = this;
                    mVar.i.f9137a = this;
                    gVar.f9137a = this;
                    if (dVar9.y()) {
                        arrayList2.add(this.f9162b.f8755e.f9165e);
                        this.f9162b.f8755e.f9165e.f9146k.add(gVar);
                        m mVar2 = this.f9162b.f8755e;
                        mVar2.f9165e.f9137a = this;
                        arrayList2.add(mVar2.f9168h);
                        arrayList2.add(this.f9162b.f8755e.i);
                        this.f9162b.f8755e.f9168h.f9146k.add(gVar);
                        this.f9162b.f8755e.i.f9146k.add(gVar);
                    } else if (this.f9162b.x()) {
                        this.f9162b.f8755e.f9165e.f9147l.add(gVar);
                        arrayList.add(this.f9162b.f8755e.f9165e);
                    } else {
                        this.f9162b.f8755e.f9165e.f9147l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f8755e.f9165e;
                    arrayList2.add(gVar3);
                    gVar3.f9146k.add(gVar);
                    this.f9162b.f8755e.f9168h.f9146k.add(gVar);
                    this.f9162b.f8755e.i.f9146k.add(gVar);
                    gVar.f9138b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                    fVar2.f9147l.add(gVar);
                    fVar.f9147l.add(gVar);
                }
            }
        }
        y2.d dVar11 = this.f9162b;
        y2.c[] cVarArr2 = dVar11.Q;
        y2.c cVar4 = cVarArr2[0];
        y2.c cVar5 = cVar4.f8744f;
        if (cVar5 != null && cVarArr2[1].f8744f != null) {
            if (dVar11.x()) {
                fVar2.f9142f = this.f9162b.Q[0].e();
                fVar.f9142f = -this.f9162b.Q[1].e();
                return;
            }
            f h12 = o.h(this.f9162b.Q[0]);
            f h13 = o.h(this.f9162b.Q[1]);
            if (h12 != null) {
                h12.b(this);
            }
            if (h13 != null) {
                h13.b(this);
            }
            this.f9169j = 4;
            return;
        }
        if (cVar5 != null) {
            f h14 = o.h(cVar4);
            if (h14 != null) {
                o.b(fVar2, h14, this.f9162b.Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        y2.c cVar6 = cVarArr2[1];
        if (cVar6.f8744f != null) {
            f h15 = o.h(cVar6);
            if (h15 != null) {
                o.b(fVar, h15, -this.f9162b.Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof y2.i) || (dVar3 = dVar11.T) == null) {
            return;
        }
        o.b(fVar2, dVar3.f8753d.f9168h, dVar11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // z2.o
    public final void e() {
        f fVar = this.f9168h;
        if (fVar.f9145j) {
            this.f9162b.Y = fVar.f9143g;
        }
    }

    @Override // z2.o
    public final void f() {
        this.f9163c = null;
        this.f9168h.c();
        this.i.c();
        this.f9165e.c();
        this.f9167g = false;
    }

    @Override // z2.o
    public final boolean k() {
        return this.f9164d != 3 || this.f9162b.f8779r == 0;
    }

    public final void n() {
        this.f9167g = false;
        f fVar = this.f9168h;
        fVar.c();
        fVar.f9145j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f9145j = false;
        this.f9165e.f9145j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f9162b.f8762h0;
    }
}
