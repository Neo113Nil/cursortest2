package w;

import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3761k = new int[2];

    public static void m(int[] iArr, int i, int i4, int i5, int i6, float f5, int i7) {
        int i8 = i4 - i;
        int i9 = i6 - i5;
        if (i7 != -1) {
            if (i7 == 0) {
                iArr[0] = (int) ((i9 * f5) + 0.5f);
                iArr[1] = i9;
                return;
            } else {
                if (i7 != 1) {
                    return;
                }
                iArr[0] = i8;
                iArr[1] = (int) ((i8 * f5) + 0.5f);
                return;
            }
        }
        int i10 = (int) ((i9 * f5) + 0.5f);
        int i11 = (int) ((i8 / f5) + 0.5f);
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
        float f5;
        boolean z4;
        float f6;
        float f7;
        float f8;
        int i;
        if (t.e.a(this.f3777j) == 3) {
            v.d dVar2 = this.f3772b;
            l(dVar2.I, dVar2.K, 0);
            return;
        }
        g gVar = this.f3774e;
        boolean z5 = gVar.f3756j;
        f fVar = this.h;
        f fVar2 = this.i;
        if (!z5 && this.d == 3) {
            v.d dVar3 = this.f3772b;
            int i4 = dVar3.f3639r;
            if (i4 == 2) {
                f5 = 0.5f;
                v.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.d.f3774e.f3756j) {
                        gVar.d((int) ((r5.f3755g * dVar3.f3644w) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                int i5 = dVar3.f3640s;
                if (i5 == 0 || i5 == 3) {
                    m mVar = dVar3.f3617e;
                    f fVar3 = mVar.h;
                    f fVar4 = mVar.i;
                    boolean z6 = dVar3.I.f3609f != null;
                    boolean z7 = dVar3.J.f3609f != null;
                    boolean z8 = dVar3.K.f3609f != null;
                    boolean z9 = dVar3.L.f3609f != null;
                    f5 = 0.5f;
                    int i6 = dVar3.X;
                    if (z6 && z7 && z8 && z9) {
                        float f9 = dVar3.W;
                        boolean z10 = fVar3.f3756j;
                        ArrayList arrayList = fVar3.f3758l;
                        int[] iArr = f3761k;
                        if (z10 && fVar4.f3756j) {
                            if (fVar.f3752c && fVar2.f3752c) {
                                m(iArr, ((f) fVar.f3758l.get(0)).f3755g + fVar.f3754f, ((f) fVar2.f3758l.get(0)).f3755g - fVar2.f3754f, fVar3.f3755g + fVar3.f3754f, fVar4.f3755g - fVar4.f3754f, f9, i6);
                                gVar.d(iArr[0]);
                                this.f3772b.f3617e.f3774e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (fVar.f3756j && fVar2.f3756j) {
                            if (!fVar3.f3752c || !fVar4.f3752c) {
                                return;
                            }
                            m(iArr, fVar.f3755g + fVar.f3754f, fVar2.f3755g - fVar2.f3754f, ((f) arrayList.get(0)).f3755g + fVar3.f3754f, ((f) fVar4.f3758l.get(0)).f3755g - fVar4.f3754f, f9, i6);
                            gVar.d(iArr[0]);
                            this.f3772b.f3617e.f3774e.d(iArr[1]);
                        }
                        if (!fVar.f3752c || !fVar2.f3752c || !fVar3.f3752c || !fVar4.f3752c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f3758l.get(0)).f3755g + fVar.f3754f, ((f) fVar2.f3758l.get(0)).f3755g - fVar2.f3754f, ((f) arrayList.get(0)).f3755g + fVar3.f3754f, ((f) fVar4.f3758l.get(0)).f3755g - fVar4.f3754f, f9, i6);
                        gVar.d(iArr[0]);
                        this.f3772b.f3617e.f3774e.d(iArr[1]);
                    } else if (z6 && z8) {
                        if (!fVar.f3752c || !fVar2.f3752c) {
                            return;
                        }
                        float f10 = dVar3.W;
                        int i7 = ((f) fVar.f3758l.get(0)).f3755g + fVar.f3754f;
                        int i8 = ((f) fVar2.f3758l.get(0)).f3755g - fVar2.f3754f;
                        if (i6 == -1 || i6 == 0) {
                            int g3 = g(i8 - i7, 0);
                            int i9 = (int) ((g3 * f10) + 0.5f);
                            int g5 = g(i9, 1);
                            if (i9 != g5) {
                                g3 = (int) ((g5 / f10) + 0.5f);
                            }
                            gVar.d(g3);
                            this.f3772b.f3617e.f3774e.d(g5);
                        } else if (i6 == 1) {
                            int g6 = g(i8 - i7, 0);
                            int i10 = (int) ((g6 / f10) + 0.5f);
                            int g7 = g(i10, 1);
                            if (i10 != g7) {
                                g6 = (int) ((g7 * f10) + 0.5f);
                            }
                            gVar.d(g6);
                            this.f3772b.f3617e.f3774e.d(g7);
                        }
                    } else if (z7 && z9) {
                        if (!fVar3.f3752c || !fVar4.f3752c) {
                            return;
                        }
                        float f11 = dVar3.W;
                        int i11 = ((f) fVar3.f3758l.get(0)).f3755g + fVar3.f3754f;
                        int i12 = ((f) fVar4.f3758l.get(0)).f3755g - fVar4.f3754f;
                        if (i6 != -1) {
                            if (i6 == 0) {
                                int g8 = g(i12 - i11, 1);
                                int i13 = (int) ((g8 * f11) + 0.5f);
                                int g9 = g(i13, 0);
                                if (i13 != g9) {
                                    g8 = (int) ((g9 / f11) + 0.5f);
                                }
                                gVar.d(g9);
                                this.f3772b.f3617e.f3774e.d(g8);
                            }
                        }
                        int g10 = g(i12 - i11, 1);
                        int i14 = (int) ((g10 / f11) + 0.5f);
                        int g11 = g(i14, 0);
                        if (i14 != g11) {
                            g10 = (int) ((g11 * f11) + 0.5f);
                        }
                        gVar.d(g11);
                        this.f3772b.f3617e.f3774e.d(g10);
                    }
                } else {
                    int i15 = dVar3.X;
                    if (i15 == -1) {
                        f6 = dVar3.f3617e.f3774e.f3755g;
                        f7 = dVar3.W;
                    } else if (i15 == 0) {
                        f8 = dVar3.f3617e.f3774e.f3755g / dVar3.W;
                        i = (int) (f8 + 0.5f);
                        gVar.d(i);
                    } else if (i15 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f6 = dVar3.f3617e.f3774e.f3755g;
                        f7 = dVar3.W;
                    }
                    f8 = f6 * f7;
                    i = (int) (f8 + 0.5f);
                    gVar.d(i);
                }
            }
            z4 = fVar.f3752c;
            ArrayList arrayList2 = fVar.f3758l;
            if (z4) {
                return;
            }
            boolean z11 = fVar2.f3752c;
            ArrayList arrayList3 = fVar2.f3758l;
            if (z11) {
                if (fVar.f3756j && fVar2.f3756j && gVar.f3756j) {
                    return;
                }
                if (!gVar.f3756j && this.d == 3) {
                    v.d dVar5 = this.f3772b;
                    if (dVar5.f3639r == 0 && !dVar5.x()) {
                        f fVar5 = (f) arrayList2.get(0);
                        f fVar6 = (f) arrayList3.get(0);
                        int i16 = fVar5.f3755g + fVar.f3754f;
                        int i17 = fVar6.f3755g + fVar2.f3754f;
                        fVar.d(i16);
                        fVar2.d(i17);
                        gVar.d(i17 - i16);
                        return;
                    }
                }
                if (!gVar.f3756j && this.d == 3 && this.f3771a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((f) arrayList3.get(0)).f3755g + fVar2.f3754f) - (((f) arrayList2.get(0)).f3755g + fVar.f3754f), gVar.f3759m);
                    v.d dVar6 = this.f3772b;
                    int i18 = dVar6.f3643v;
                    int max = Math.max(dVar6.f3642u, min);
                    if (i18 > 0) {
                        max = Math.min(i18, max);
                    }
                    gVar.d(max);
                }
                if (gVar.f3756j) {
                    f fVar7 = (f) arrayList2.get(0);
                    f fVar8 = (f) arrayList3.get(0);
                    int i19 = fVar7.f3755g;
                    int i20 = fVar.f3754f + i19;
                    int i21 = fVar8.f3755g;
                    int i22 = fVar2.f3754f + i21;
                    float f12 = this.f3772b.d0;
                    if (fVar7 == fVar8) {
                        f12 = f5;
                    } else {
                        i19 = i20;
                        i21 = i22;
                    }
                    fVar.d((int) ((((i21 - i19) - gVar.f3755g) * f12) + i19 + f5));
                    fVar2.d(fVar.f3755g + gVar.f3755g);
                    return;
                }
                return;
            }
            return;
        }
        f5 = 0.5f;
        z4 = fVar.f3752c;
        ArrayList arrayList22 = fVar.f3758l;
        if (z4) {
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
        v.d dVar5 = this.f3772b;
        boolean z4 = dVar5.f3611a;
        g gVar = this.f3774e;
        if (z4) {
            gVar.d(dVar5.q());
        }
        boolean z5 = gVar.f3756j;
        ArrayList arrayList = gVar.f3757k;
        ArrayList arrayList2 = gVar.f3758l;
        f fVar = this.i;
        f fVar2 = this.h;
        if (!z5) {
            v.d dVar6 = this.f3772b;
            int i5 = dVar6.f3637p0[0];
            this.d = i5;
            if (i5 != 3) {
                if (i5 == 4 && (dVar4 = dVar6.T) != null && ((i4 = dVar4.f3637p0[0]) == 1 || i4 == 4)) {
                    int q4 = (dVar4.q() - this.f3772b.I.e()) - this.f3772b.K.e();
                    o.b(fVar2, dVar4.d.h, this.f3772b.I.e());
                    o.b(fVar, dVar4.d.i, -this.f3772b.K.e());
                    gVar.d(q4);
                    return;
                }
                if (i5 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f3772b).T) != null && ((i = dVar2.f3637p0[0]) == 1 || i == 4)) {
            o.b(fVar2, dVar2.d.h, dVar.I.e());
            o.b(fVar, dVar2.d.i, -this.f3772b.K.e());
            return;
        }
        if (gVar.f3756j) {
            v.d dVar7 = this.f3772b;
            if (dVar7.f3611a) {
                v.c[] cVarArr = dVar7.Q;
                v.c cVar = cVarArr[0];
                v.c cVar2 = cVar.f3609f;
                if (cVar2 != null && cVarArr[1].f3609f != null) {
                    if (dVar7.x()) {
                        fVar2.f3754f = this.f3772b.Q[0].e();
                        fVar.f3754f = -this.f3772b.Q[1].e();
                        return;
                    }
                    f h = o.h(this.f3772b.Q[0]);
                    if (h != null) {
                        o.b(fVar2, h, this.f3772b.Q[0].e());
                    }
                    f h5 = o.h(this.f3772b.Q[1]);
                    if (h5 != null) {
                        o.b(fVar, h5, -this.f3772b.Q[1].e());
                    }
                    fVar2.f3751b = true;
                    fVar.f3751b = true;
                    return;
                }
                if (cVar2 != null) {
                    f h6 = o.h(cVar);
                    if (h6 != null) {
                        o.b(fVar2, h6, this.f3772b.Q[0].e());
                        o.b(fVar, fVar2, gVar.f3755g);
                        return;
                    }
                    return;
                }
                v.c cVar3 = cVarArr[1];
                if (cVar3.f3609f != null) {
                    f h7 = o.h(cVar3);
                    if (h7 != null) {
                        o.b(fVar, h7, -this.f3772b.Q[1].e());
                        o.b(fVar2, fVar, -gVar.f3755g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof v.i) || dVar7.T == null || dVar7.i(7).f3609f != null) {
                    return;
                }
                v.d dVar8 = this.f3772b;
                o.b(fVar2, dVar8.T.d.h, dVar8.r());
                o.b(fVar, fVar2, gVar.f3755g);
                return;
            }
        }
        if (this.d == 3) {
            v.d dVar9 = this.f3772b;
            int i6 = dVar9.f3639r;
            if (i6 == 2) {
                v.d dVar10 = dVar9.T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f3617e.f3774e;
                    arrayList2.add(gVar2);
                    gVar2.f3757k.add(gVar);
                    gVar.f3751b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i6 == 3) {
                if (dVar9.f3640s == 3) {
                    fVar2.f3750a = this;
                    fVar.f3750a = this;
                    m mVar = dVar9.f3617e;
                    mVar.h.f3750a = this;
                    mVar.i.f3750a = this;
                    gVar.f3750a = this;
                    if (dVar9.y()) {
                        arrayList2.add(this.f3772b.f3617e.f3774e);
                        this.f3772b.f3617e.f3774e.f3757k.add(gVar);
                        m mVar2 = this.f3772b.f3617e;
                        mVar2.f3774e.f3750a = this;
                        arrayList2.add(mVar2.h);
                        arrayList2.add(this.f3772b.f3617e.i);
                        this.f3772b.f3617e.h.f3757k.add(gVar);
                        this.f3772b.f3617e.i.f3757k.add(gVar);
                    } else if (this.f3772b.x()) {
                        this.f3772b.f3617e.f3774e.f3758l.add(gVar);
                        arrayList.add(this.f3772b.f3617e.f3774e);
                    } else {
                        this.f3772b.f3617e.f3774e.f3758l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f3617e.f3774e;
                    arrayList2.add(gVar3);
                    gVar3.f3757k.add(gVar);
                    this.f3772b.f3617e.h.f3757k.add(gVar);
                    this.f3772b.f3617e.i.f3757k.add(gVar);
                    gVar.f3751b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                    fVar2.f3758l.add(gVar);
                    fVar.f3758l.add(gVar);
                }
            }
        }
        v.d dVar11 = this.f3772b;
        v.c[] cVarArr2 = dVar11.Q;
        v.c cVar4 = cVarArr2[0];
        v.c cVar5 = cVar4.f3609f;
        if (cVar5 != null && cVarArr2[1].f3609f != null) {
            if (dVar11.x()) {
                fVar2.f3754f = this.f3772b.Q[0].e();
                fVar.f3754f = -this.f3772b.Q[1].e();
                return;
            }
            f h8 = o.h(this.f3772b.Q[0]);
            f h9 = o.h(this.f3772b.Q[1]);
            if (h8 != null) {
                h8.b(this);
            }
            if (h9 != null) {
                h9.b(this);
            }
            this.f3777j = 4;
            return;
        }
        if (cVar5 != null) {
            f h10 = o.h(cVar4);
            if (h10 != null) {
                o.b(fVar2, h10, this.f3772b.Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        v.c cVar6 = cVarArr2[1];
        if (cVar6.f3609f != null) {
            f h11 = o.h(cVar6);
            if (h11 != null) {
                o.b(fVar, h11, -this.f3772b.Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof v.i) || (dVar3 = dVar11.T) == null) {
            return;
        }
        o.b(fVar2, dVar3.d.h, dVar11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // w.o
    public final void e() {
        f fVar = this.h;
        if (fVar.f3756j) {
            this.f3772b.Y = fVar.f3755g;
        }
    }

    @Override // w.o
    public final void f() {
        this.f3773c = null;
        this.h.c();
        this.i.c();
        this.f3774e.c();
        this.f3776g = false;
    }

    @Override // w.o
    public final boolean k() {
        return this.d != 3 || this.f3772b.f3639r == 0;
    }

    public final void n() {
        this.f3776g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f3756j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f3756j = false;
        this.f3774e.f3756j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3772b.f3623h0;
    }
}
