package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sw extends sy {
    public final sq a;
    sr b;

    public sw(sd sdVar) {
        super(sdVar);
        sq sqVar = new sq(this);
        this.a = sqVar;
        this.b = null;
        this.h.l = 6;
        this.i.l = 7;
        sqVar.l = 8;
        this.f = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03bb  */
    @Override // defpackage.sy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        sd sdVar;
        sc scVar;
        sd sdVar2;
        sd sdVar3;
        sd sdVar4 = this.d;
        if (sdVar4.e) {
            this.e.c(sdVar4.h());
        }
        sr srVar = this.e;
        if (!srVar.i) {
            this.j = this.d.P();
            if (this.d.G) {
                this.b = new sr(this);
            }
            if (this.j != 3) {
                if (this.j == 4 && (sdVar3 = this.d.V) != null && sdVar3.P() == 1) {
                    int h = (sdVar3.h() - this.d.L.b()) - this.d.N.b();
                    j(this.h, sdVar3.i.h, this.d.L.b());
                    j(this.i, sdVar3.i.i, -this.d.N.b());
                    srVar.c(h);
                    return;
                }
                if (this.j == 1) {
                    srVar.c(this.d.h());
                }
            }
        } else if (this.j == 4 && (sdVar = this.d.V) != null && sdVar.P() == 1) {
            j(this.h, sdVar.i.h, this.d.L.b());
            j(this.i, sdVar.i.i, -this.d.N.b());
            return;
        }
        if (srVar.i) {
            sd sdVar5 = this.d;
            if (sdVar5.e) {
                sc[] scVarArr = sdVar5.S;
                sc scVar2 = scVarArr[2];
                sc scVar3 = scVar2.e;
                if (scVar3 != null && scVarArr[3].e != null) {
                    if (sdVar5.K()) {
                        this.h.e = this.d.S[2].b();
                        this.i.e = -this.d.S[3].b();
                    } else {
                        sq k = k(this.d.S[2]);
                        if (k != null) {
                            j(this.h, k, this.d.S[2].b());
                        }
                        sq k2 = k(this.d.S[3]);
                        if (k2 != null) {
                            j(this.i, k2, -this.d.S[3].b());
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    sd sdVar6 = this.d;
                    if (sdVar6.G) {
                        j(this.a, this.h, sdVar6.ac);
                        return;
                    }
                    return;
                }
                if (scVar3 != null) {
                    sq k3 = k(scVar2);
                    if (k3 != null) {
                        sq sqVar = this.h;
                        j(sqVar, k3, this.d.S[2].b());
                        j(this.i, sqVar, srVar.f);
                        sd sdVar7 = this.d;
                        if (sdVar7.G) {
                            j(this.a, sqVar, sdVar7.ac);
                            return;
                        }
                        return;
                    }
                    return;
                }
                sc scVar4 = scVarArr[3];
                if (scVar4.e != null) {
                    sq k4 = k(scVar4);
                    if (k4 != null) {
                        sq sqVar2 = this.i;
                        j(sqVar2, k4, -this.d.S[3].b());
                        j(this.h, sqVar2, -srVar.f);
                    }
                    sd sdVar8 = this.d;
                    if (sdVar8.G) {
                        j(this.a, this.h, sdVar8.ac);
                        return;
                    }
                    return;
                }
                sc scVar5 = scVarArr[4];
                if (scVar5.e != null) {
                    sq k5 = k(scVar5);
                    if (k5 != null) {
                        sq sqVar3 = this.a;
                        j(sqVar3, k5, 0);
                        sq sqVar4 = this.h;
                        j(sqVar4, sqVar3, -this.d.ac);
                        j(this.i, sqVar4, srVar.f);
                        return;
                    }
                    return;
                }
                if ((sdVar5 instanceof si) || sdVar5.V == null || sdVar5.M(7).e != null) {
                    return;
                }
                sd sdVar9 = this.d;
                sq sqVar5 = sdVar9.V.i.h;
                sq sqVar6 = this.h;
                j(sqVar6, sqVar5, sdVar9.l());
                j(this.i, sqVar6, srVar.f);
                sd sdVar10 = this.d;
                if (sdVar10.G) {
                    j(this.a, sqVar6, sdVar10.ac);
                    return;
                }
                return;
            }
        } else if (this.j == 3) {
            sd sdVar11 = this.d;
            int i = sdVar11.u;
            if (i == 2) {
                sd sdVar12 = sdVar11.V;
                if (sdVar12 != null) {
                    sr srVar2 = sdVar12.i.e;
                    srVar.k.add(srVar2);
                    srVar2.j.add(srVar);
                    srVar.b = true;
                    List list = srVar.j;
                    list.add(this.h);
                    list.add(this.i);
                }
            } else if (i == 3 && !sdVar11.K()) {
                sd sdVar13 = this.d;
                if (sdVar13.t != 3) {
                    sr srVar3 = sdVar13.h.e;
                    srVar.k.add(srVar3);
                    srVar3.j.add(srVar);
                    srVar.b = true;
                    List list2 = srVar.j;
                    list2.add(this.h);
                    list2.add(this.i);
                }
            }
            sd sdVar14 = this.d;
            sc[] scVarArr2 = sdVar14.S;
            sc scVar6 = scVarArr2[2];
            scVar = scVar6.e;
            if (scVar == null && scVarArr2[3].e != null) {
                if (sdVar14.K()) {
                    this.h.e = this.d.S[2].b();
                    this.i.e = -this.d.S[3].b();
                } else {
                    sq k6 = k(this.d.S[2]);
                    sq k7 = k(this.d.S[3]);
                    if (k6 != null) {
                        k6.a(this);
                    }
                    if (k7 != null) {
                        k7.a(this);
                    }
                    this.k = 4;
                }
                if (this.d.G) {
                    i(this.a, this.h, 1, this.b);
                }
            } else if (scVar == null) {
                sq k8 = k(scVar6);
                if (k8 != null) {
                    sq sqVar7 = this.h;
                    j(sqVar7, k8, this.d.S[2].b());
                    i(this.i, sqVar7, 1, srVar);
                    if (this.d.G) {
                        i(this.a, sqVar7, 1, this.b);
                    }
                    if (this.j == 3) {
                        sd sdVar15 = this.d;
                        if (sdVar15.Y > 0.0f) {
                            sv svVar = sdVar15.h;
                            if (svVar.j == 3) {
                                svVar.e.j.add(srVar);
                                srVar.k.add(this.d.h.e);
                                srVar.a = this;
                            }
                        }
                    }
                }
            } else {
                sc scVar7 = scVarArr2[3];
                if (scVar7.e != null) {
                    sq k9 = k(scVar7);
                    if (k9 != null) {
                        sq sqVar8 = this.i;
                        j(sqVar8, k9, -this.d.S[3].b());
                        sq sqVar9 = this.h;
                        i(sqVar9, sqVar8, -1, srVar);
                        if (this.d.G) {
                            i(this.a, sqVar9, 1, this.b);
                        }
                    }
                } else {
                    sc scVar8 = scVarArr2[4];
                    if (scVar8.e != null) {
                        sq k10 = k(scVar8);
                        if (k10 != null) {
                            sq sqVar10 = this.a;
                            j(sqVar10, k10, 0);
                            sq sqVar11 = this.h;
                            i(sqVar11, sqVar10, -1, this.b);
                            i(this.i, sqVar11, 1, srVar);
                        }
                    } else if (!(sdVar14 instanceof si) && (sdVar2 = sdVar14.V) != null) {
                        sq sqVar12 = sdVar2.i.h;
                        sq sqVar13 = this.h;
                        j(sqVar13, sqVar12, sdVar14.l());
                        i(this.i, sqVar13, 1, srVar);
                        if (this.d.G) {
                            i(this.a, sqVar13, 1, this.b);
                        }
                        if (this.j == 3) {
                            sd sdVar16 = this.d;
                            if (sdVar16.Y > 0.0f) {
                                sv svVar2 = sdVar16.h;
                                if (svVar2.j == 3) {
                                    svVar2.e.j.add(srVar);
                                    srVar.k.add(this.d.h.e);
                                    srVar.a = this;
                                }
                            }
                        }
                    }
                }
            }
            if (srVar.k.size() != 0) {
                srVar.c = true;
                return;
            }
            return;
        }
        srVar.a(this);
        sd sdVar142 = this.d;
        sc[] scVarArr22 = sdVar142.S;
        sc scVar62 = scVarArr22[2];
        scVar = scVar62.e;
        if (scVar == null) {
        }
        if (scVar == null) {
        }
        if (srVar.k.size() != 0) {
        }
    }

    @Override // defpackage.sy
    public final void c() {
        sq sqVar = this.h;
        if (sqVar.i) {
            this.d.ab = sqVar.f;
        }
    }

    @Override // defpackage.sy
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.a.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.sy
    public final boolean e() {
        return this.j != 3 || this.d.u == 0;
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
            m(sdVar.L, sdVar.N, 1);
            return;
        }
        sr srVar = this.e;
        if (srVar.c && !srVar.i && this.j == 3) {
            sd sdVar2 = this.d;
            int i3 = sdVar2.u;
            if (i3 == 2) {
                sd sdVar3 = sdVar2.V;
                if (sdVar3 != null) {
                    if (sdVar3.i.e.i) {
                        srVar.c((int) ((r5.f * sdVar2.B) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                sr srVar2 = sdVar2.h.e;
                if (srVar2.i) {
                    int i4 = sdVar2.Z;
                    if (i4 == -1) {
                        f = srVar2.f;
                        f2 = sdVar2.Y;
                    } else if (i4 != 0) {
                        f = srVar2.f;
                        f2 = sdVar2.Y;
                    } else {
                        f3 = srVar2.f * sdVar2.Y;
                        srVar.c((int) (f3 + 0.5f));
                    }
                    f3 = f / f2;
                    srVar.c((int) (f3 + 0.5f));
                }
            }
        }
        sq sqVar = this.h;
        if (sqVar.c) {
            sq sqVar2 = this.i;
            if (sqVar2.c) {
                if (sqVar.i && sqVar2.i && srVar.i) {
                    return;
                }
                if (!srVar.i && this.j == 3) {
                    sd sdVar4 = this.d;
                    if (sdVar4.t == 0 && !sdVar4.K()) {
                        sq sqVar3 = (sq) sqVar.k.get(0);
                        sq sqVar4 = (sq) sqVar2.k.get(0);
                        int i5 = sqVar3.f + sqVar.e;
                        int i6 = sqVar4.f + sqVar2.e;
                        sqVar.c(i5);
                        sqVar2.c(i6);
                        srVar.c(i6 - i5);
                        return;
                    }
                }
                if (!srVar.i && this.j == 3 && this.c == 1) {
                    List list = sqVar.k;
                    if (list.size() > 0) {
                        List list2 = sqVar2.k;
                        if (list2.size() > 0) {
                            sq sqVar5 = (sq) list.get(0);
                            sq sqVar6 = (sq) list2.get(0);
                            int i7 = sqVar5.f + sqVar.e;
                            int i8 = sqVar6.f + sqVar2.e;
                            int i9 = srVar.m;
                            int i10 = i8 - i7;
                            if (i10 < i9) {
                                srVar.c(i10);
                            } else {
                                srVar.c(i9);
                            }
                        }
                    }
                }
                if (srVar.i) {
                    List list3 = sqVar.k;
                    if (list3.size() > 0) {
                        List list4 = sqVar2.k;
                        if (list4.size() > 0) {
                            sq sqVar7 = (sq) list3.get(0);
                            sq sqVar8 = (sq) list4.get(0);
                            int i11 = sqVar7.f;
                            int i12 = sqVar.e + i11;
                            int i13 = sqVar8.f;
                            int i14 = sqVar2.e + i13;
                            float f4 = this.d.ag;
                            if (sqVar7 == sqVar8) {
                                f4 = 0.5f;
                            }
                            if (sqVar7 != sqVar8) {
                                i13 = i14;
                            }
                            if (sqVar7 != sqVar8) {
                                i11 = i12;
                            }
                            sqVar.c((int) (i11 + 0.5f + (((i13 - i11) - srVar.f) * f4)));
                            sqVar2.c(sqVar.f + srVar.f);
                        }
                    }
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
        sq sqVar3 = this.a;
        sqVar3.b();
        sqVar3.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.aj));
    }
}
