package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sv extends sy {
    private static final int[] a = new int[2];

    public sv(sd sdVar) {
        super(sdVar);
        this.h.l = 4;
        this.i.l = 5;
        this.f = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i4 - i3;
        int i7 = i2 - i;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            } else {
                iArr[0] = (int) ((i6 * f) + 0.5f);
                iArr[1] = i6;
                return;
            }
        }
        float f2 = (i7 / f) + 0.5f;
        int i8 = (int) ((i6 * f) + 0.5f);
        if (i8 <= i7) {
            iArr[0] = i8;
            iArr[1] = i6;
            return;
        }
        int i9 = (int) f2;
        if (i9 <= i6) {
            iArr[0] = i7;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.sy
    public final void b() {
        sd sdVar;
        sd sdVar2;
        sd sdVar3;
        sd sdVar4 = this.d;
        if (sdVar4.e) {
            this.e.c(sdVar4.j());
        }
        sr srVar = this.e;
        if (!srVar.i) {
            int O = this.d.O();
            this.j = O;
            if (O != 3) {
                if (this.j == 4 && (sdVar3 = this.d.V) != null && (sdVar3.O() == 1 || sdVar3.O() == 4)) {
                    int j = (sdVar3.j() - this.d.K.b()) - this.d.M.b();
                    j(this.h, sdVar3.h.h, this.d.K.b());
                    j(this.i, sdVar3.h.i, -this.d.M.b());
                    srVar.c(j);
                    return;
                }
                if (this.j == 1) {
                    srVar.c(this.d.j());
                }
            }
        } else if (this.j == 4 && (sdVar = this.d.V) != null && (sdVar.O() == 1 || sdVar.O() == 4)) {
            j(this.h, sdVar.h.h, this.d.K.b());
            j(this.i, sdVar.h.i, -this.d.M.b());
            return;
        }
        if (srVar.i) {
            sd sdVar5 = this.d;
            if (sdVar5.e) {
                sc[] scVarArr = sdVar5.S;
                sc scVar = scVarArr[0];
                sc scVar2 = scVar.e;
                if (scVar2 != null && scVarArr[1].e != null) {
                    if (sdVar5.J()) {
                        this.h.e = this.d.S[0].b();
                        this.i.e = -this.d.S[1].b();
                        return;
                    }
                    sq k = k(this.d.S[0]);
                    if (k != null) {
                        j(this.h, k, this.d.S[0].b());
                    }
                    sq k2 = k(this.d.S[1]);
                    if (k2 != null) {
                        j(this.i, k2, -this.d.S[1].b());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if (scVar2 != null) {
                    sq k3 = k(scVar);
                    if (k3 != null) {
                        sq sqVar = this.h;
                        j(sqVar, k3, this.d.S[0].b());
                        j(this.i, sqVar, srVar.f);
                        return;
                    }
                    return;
                }
                sc scVar3 = scVarArr[1];
                if (scVar3.e != null) {
                    sq k4 = k(scVar3);
                    if (k4 != null) {
                        sq sqVar2 = this.i;
                        j(sqVar2, k4, -this.d.S[1].b());
                        j(this.h, sqVar2, -srVar.f);
                        return;
                    }
                    return;
                }
                if ((sdVar5 instanceof si) || sdVar5.V == null || sdVar5.M(7).e != null) {
                    return;
                }
                sd sdVar6 = this.d;
                sq sqVar3 = sdVar6.V.h.h;
                sq sqVar4 = this.h;
                j(sqVar4, sqVar3, sdVar6.k());
                j(this.i, sqVar4, srVar.f);
                return;
            }
        }
        if (this.j == 3) {
            sd sdVar7 = this.d;
            int i = sdVar7.t;
            if (i == 2) {
                sd sdVar8 = sdVar7.V;
                if (sdVar8 != null) {
                    sr srVar2 = sdVar8.i.e;
                    srVar.k.add(srVar2);
                    srVar2.j.add(srVar);
                    srVar.b = true;
                    sq sqVar5 = this.h;
                    List list = srVar.j;
                    list.add(sqVar5);
                    list.add(this.i);
                }
            } else if (i == 3) {
                if (sdVar7.u == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    sw swVar = sdVar7.i;
                    swVar.h.a = this;
                    swVar.i.a = this;
                    srVar.a = this;
                    if (sdVar7.K()) {
                        List list2 = srVar.k;
                        list2.add(this.d.i.e);
                        this.d.i.e.j.add(srVar);
                        sw swVar2 = this.d.i;
                        swVar2.e.a = this;
                        list2.add(swVar2.h);
                        list2.add(this.d.i.i);
                        this.d.i.h.j.add(srVar);
                        this.d.i.i.j.add(srVar);
                    } else if (this.d.J()) {
                        this.d.i.e.k.add(srVar);
                        srVar.j.add(this.d.i.e);
                    } else {
                        this.d.i.e.k.add(srVar);
                    }
                } else {
                    sr srVar3 = sdVar7.i.e;
                    srVar.k.add(srVar3);
                    srVar3.j.add(srVar);
                    this.d.i.h.j.add(srVar);
                    this.d.i.i.j.add(srVar);
                    srVar.b = true;
                    sq sqVar6 = this.h;
                    List list3 = srVar.j;
                    list3.add(sqVar6);
                    sq sqVar7 = this.i;
                    list3.add(sqVar7);
                    sqVar6.k.add(srVar);
                    sqVar7.k.add(srVar);
                }
            }
        }
        sd sdVar9 = this.d;
        sc[] scVarArr2 = sdVar9.S;
        sc scVar4 = scVarArr2[0];
        sc scVar5 = scVar4.e;
        if (scVar5 != null && scVarArr2[1].e != null) {
            if (sdVar9.J()) {
                this.h.e = this.d.S[0].b();
                this.i.e = -this.d.S[1].b();
                return;
            }
            sq k5 = k(this.d.S[0]);
            sq k6 = k(this.d.S[1]);
            if (k5 != null) {
                k5.a(this);
            }
            if (k6 != null) {
                k6.a(this);
            }
            this.k = 4;
            return;
        }
        if (scVar5 != null) {
            sq k7 = k(scVar4);
            if (k7 != null) {
                sq sqVar8 = this.h;
                j(sqVar8, k7, this.d.S[0].b());
                i(this.i, sqVar8, 1, srVar);
                return;
            }
            return;
        }
        sc scVar6 = scVarArr2[1];
        if (scVar6.e != null) {
            sq k8 = k(scVar6);
            if (k8 != null) {
                sq sqVar9 = this.i;
                j(sqVar9, k8, -this.d.S[1].b());
                i(this.h, sqVar9, -1, srVar);
                return;
            }
            return;
        }
        if ((sdVar9 instanceof si) || (sdVar2 = sdVar9.V) == null) {
            return;
        }
        sq sqVar10 = sdVar2.h.h;
        sq sqVar11 = this.h;
        j(sqVar11, sqVar10, sdVar9.k());
        i(this.i, sqVar11, 1, srVar);
    }

    @Override // defpackage.sy
    public final void c() {
        sq sqVar = this.h;
        if (sqVar.i) {
            this.d.aa = sqVar.f;
        }
    }

    @Override // defpackage.sy
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.sy
    public final boolean e() {
        return this.j != 3 || this.d.t == 0;
    }

    @Override // defpackage.sy, defpackage.so
    public final void f() {
        float f;
        float f2;
        float f3;
        int i = this.k;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            sd sdVar = this.d;
            m(sdVar.K, sdVar.M, 0);
            return;
        }
        sr srVar = this.e;
        if (!srVar.i && this.j == 3) {
            sd sdVar2 = this.d;
            int i3 = sdVar2.t;
            if (i3 == 2) {
                sd sdVar3 = sdVar2.V;
                if (sdVar3 != null) {
                    if (sdVar3.h.e.i) {
                        srVar.c((int) ((r7.f * sdVar2.y) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = sdVar2.u;
                if (i4 == 0 || i4 == 3) {
                    sw swVar = sdVar2.i;
                    sq sqVar = swVar.h;
                    sq sqVar2 = swVar.i;
                    boolean z = sdVar2.K.e != null;
                    boolean z2 = sdVar2.L.e != null;
                    boolean z3 = sdVar2.M.e != null;
                    boolean z4 = sdVar2.N.e != null;
                    int i5 = sdVar2.Z;
                    if (z && z2 && z3 && z4) {
                        float f4 = sdVar2.Y;
                        if (sqVar.i && sqVar2.i) {
                            sq sqVar3 = this.h;
                            if (sqVar3.c) {
                                sq sqVar4 = this.i;
                                if (sqVar4.c) {
                                    int i6 = ((sq) sqVar3.k.get(0)).f + sqVar3.e;
                                    int i7 = ((sq) sqVar4.k.get(0)).f - sqVar4.e;
                                    int i8 = sqVar.f + sqVar.e;
                                    int i9 = sqVar2.f - sqVar2.e;
                                    int[] iArr = a;
                                    n(iArr, i6, i7, i8, i9, f4, i5);
                                    srVar.c(iArr[0]);
                                    this.d.i.e.c(iArr[1]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        sq sqVar5 = this.h;
                        if (sqVar5.i) {
                            sq sqVar6 = this.i;
                            if (sqVar6.i) {
                                if (!sqVar.c || !sqVar2.c) {
                                    return;
                                }
                                int i10 = sqVar5.f + sqVar5.e;
                                int i11 = sqVar6.f - sqVar6.e;
                                int i12 = ((sq) sqVar.k.get(0)).f + sqVar.e;
                                int i13 = ((sq) sqVar2.k.get(0)).f - sqVar2.e;
                                int[] iArr2 = a;
                                n(iArr2, i10, i11, i12, i13, f4, i5);
                                srVar.c(iArr2[0]);
                                this.d.i.e.c(iArr2[1]);
                            }
                        }
                        if (!sqVar5.c) {
                            return;
                        }
                        sq sqVar7 = this.i;
                        if (!sqVar7.c || !sqVar.c || !sqVar2.c) {
                            return;
                        }
                        int i14 = ((sq) sqVar5.k.get(0)).f + sqVar5.e;
                        int i15 = ((sq) sqVar7.k.get(0)).f - sqVar7.e;
                        int i16 = ((sq) sqVar.k.get(0)).f + sqVar.e;
                        int i17 = ((sq) sqVar2.k.get(0)).f - sqVar2.e;
                        int[] iArr3 = a;
                        n(iArr3, i14, i15, i16, i17, f4, i5);
                        srVar.c(iArr3[0]);
                        this.d.i.e.c(iArr3[1]);
                    } else if (z && z3) {
                        sq sqVar8 = this.h;
                        if (!sqVar8.c) {
                            return;
                        }
                        sq sqVar9 = this.i;
                        if (!sqVar9.c) {
                            return;
                        }
                        float f5 = sdVar2.Y;
                        int i18 = (((sq) sqVar9.k.get(0)).f - sqVar9.e) - (((sq) sqVar8.k.get(0)).f + sqVar8.e);
                        if (i5 == -1 || i5 == 0) {
                            int h = h(i18, 0);
                            int i19 = (int) ((h * f5) + 0.5f);
                            int h2 = h(i19, 1);
                            if (i19 != h2) {
                                h = (int) ((h2 / f5) + 0.5f);
                            }
                            srVar.c(h);
                            this.d.i.e.c(h2);
                        } else {
                            int h3 = h(i18, 0);
                            int i20 = (int) ((h3 / f5) + 0.5f);
                            int h4 = h(i20, 1);
                            if (i20 != h4) {
                                h3 = (int) ((h4 * f5) + 0.5f);
                            }
                            srVar.c(h3);
                            this.d.i.e.c(h4);
                        }
                    } else if (z2 && z4) {
                        if (!sqVar.c || !sqVar2.c) {
                            return;
                        }
                        float f6 = sdVar2.Y;
                        int i21 = (((sq) sqVar2.k.get(0)).f - sqVar2.e) - (((sq) sqVar.k.get(0)).f + sqVar.e);
                        if (i5 != 0) {
                            int h5 = h(i21, 1);
                            int i22 = (int) ((h5 / f6) + 0.5f);
                            int h6 = h(i22, 0);
                            if (i22 != h6) {
                                h5 = (int) ((h6 * f6) + 0.5f);
                            }
                            srVar.c(h6);
                            this.d.i.e.c(h5);
                        } else {
                            int h7 = h(i21, 1);
                            int i23 = (int) ((h7 * f6) + 0.5f);
                            int h8 = h(i23, 0);
                            if (i23 != h8) {
                                h7 = (int) ((h8 / f6) + 0.5f);
                            }
                            srVar.c(h8);
                            this.d.i.e.c(h7);
                        }
                    }
                } else {
                    int i24 = sdVar2.Z;
                    if (i24 == -1) {
                        f = sdVar2.i.e.f;
                        f2 = sdVar2.Y;
                    } else if (i24 != 0) {
                        f = sdVar2.i.e.f;
                        f2 = sdVar2.Y;
                    } else {
                        f3 = sdVar2.i.e.f / sdVar2.Y;
                        srVar.c((int) (f3 + 0.5f));
                    }
                    f3 = f * f2;
                    srVar.c((int) (f3 + 0.5f));
                }
            }
        }
        sq sqVar10 = this.h;
        if (sqVar10.c) {
            sq sqVar11 = this.i;
            if (sqVar11.c) {
                if (sqVar10.i && sqVar11.i && srVar.i) {
                    return;
                }
                if (!srVar.i && this.j == 3) {
                    sd sdVar4 = this.d;
                    if (sdVar4.t == 0 && !sdVar4.J()) {
                        sq sqVar12 = (sq) sqVar10.k.get(0);
                        sq sqVar13 = (sq) sqVar11.k.get(0);
                        int i25 = sqVar12.f + sqVar10.e;
                        int i26 = sqVar13.f + sqVar11.e;
                        sqVar10.c(i25);
                        sqVar11.c(i26);
                        srVar.c(i26 - i25);
                        return;
                    }
                }
                if (!srVar.i && this.j == 3 && this.c == 1) {
                    List list = sqVar10.k;
                    if (list.size() > 0) {
                        List list2 = sqVar11.k;
                        if (list2.size() > 0) {
                            sq sqVar14 = (sq) list.get(0);
                            int min = Math.min((((sq) list2.get(0)).f + sqVar11.e) - (sqVar14.f + sqVar10.e), srVar.m);
                            sd sdVar5 = this.d;
                            int i27 = sdVar5.x;
                            int max = Math.max(sdVar5.w, min);
                            if (i27 > 0) {
                                max = Math.min(i27, max);
                            }
                            srVar.c(max);
                        }
                    }
                }
                if (srVar.i) {
                    sq sqVar15 = (sq) sqVar10.k.get(0);
                    sq sqVar16 = (sq) sqVar11.k.get(0);
                    int i28 = sqVar15.f;
                    int i29 = sqVar10.e + i28;
                    int i30 = sqVar16.f;
                    int i31 = sqVar11.e + i30;
                    float f7 = this.d.af;
                    if (sqVar15 == sqVar16) {
                        f7 = 0.5f;
                    }
                    if (sqVar15 != sqVar16) {
                        i30 = i31;
                    }
                    if (sqVar15 != sqVar16) {
                        i28 = i29;
                    }
                    sqVar10.c((int) (i28 + 0.5f + (((i30 - i28) - srVar.f) * f7)));
                    sqVar11.c(sqVar10.f + srVar.f);
                }
            }
        }
    }

    public final void g() {
        this.g = false;
        sq sqVar = this.h;
        sqVar.b();
        sqVar.i = false;
        sq sqVar2 = this.i;
        sqVar2.b();
        sqVar2.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.aj));
    }
}
