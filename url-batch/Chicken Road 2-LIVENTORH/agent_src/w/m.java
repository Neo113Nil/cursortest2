package w;

import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: k, reason: collision with root package name */
    public f f3542k;

    /* renamed from: l, reason: collision with root package name */
    public a f3543l;

    @Override // w.d
    public final void a(d dVar) {
        float f2;
        float f4;
        float f5;
        int i;
        if (t.e.a(this.f3556j) == 3) {
            v.d dVar2 = this.f3550b;
            l(dVar2.J, dVar2.L, 1);
            return;
        }
        g gVar = this.f3552e;
        if (gVar.f3529c && !gVar.f3534j && this.d == 3) {
            v.d dVar3 = this.f3550b;
            int i4 = dVar3.f3421s;
            if (i4 == 2) {
                v.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f3397e.f3552e.f3534j) {
                        gVar.d((int) ((r5.f3532g * dVar3.f3428z) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                g gVar2 = dVar3.d.f3552e;
                if (gVar2.f3534j) {
                    int i5 = dVar3.X;
                    if (i5 == -1) {
                        f2 = gVar2.f3532g;
                        f4 = dVar3.W;
                    } else if (i5 == 0) {
                        f5 = gVar2.f3532g * dVar3.W;
                        i = (int) (f5 + 0.5f);
                        gVar.d(i);
                    } else if (i5 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f2 = gVar2.f3532g;
                        f4 = dVar3.W;
                    }
                    f5 = f2 / f4;
                    i = (int) (f5 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        f fVar = this.f3555h;
        boolean z3 = fVar.f3529c;
        ArrayList arrayList = fVar.f3536l;
        if (z3) {
            f fVar2 = this.i;
            boolean z4 = fVar2.f3529c;
            ArrayList arrayList2 = fVar2.f3536l;
            if (z4) {
                if (fVar.f3534j && fVar2.f3534j && gVar.f3534j) {
                    return;
                }
                if (!gVar.f3534j && this.d == 3) {
                    v.d dVar5 = this.f3550b;
                    if (dVar5.f3420r == 0 && !dVar5.y()) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i6 = fVar3.f3532g + fVar.f3531f;
                        int i7 = fVar4.f3532g + fVar2.f3531f;
                        fVar.d(i6);
                        fVar2.d(i7);
                        gVar.d(i7 - i6);
                        return;
                    }
                }
                if (!gVar.f3534j && this.d == 3 && this.f3549a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar5 = (f) arrayList.get(0);
                    int i8 = (((f) arrayList2.get(0)).f3532g + fVar2.f3531f) - (fVar5.f3532g + fVar.f3531f);
                    int i9 = gVar.f3537m;
                    if (i8 < i9) {
                        gVar.d(i8);
                    } else {
                        gVar.d(i9);
                    }
                }
                if (gVar.f3534j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar6 = (f) arrayList.get(0);
                    f fVar7 = (f) arrayList2.get(0);
                    int i10 = fVar6.f3532g;
                    int i11 = fVar.f3531f + i10;
                    int i12 = fVar7.f3532g;
                    int i13 = fVar2.f3531f + i12;
                    float f6 = this.f3550b.f3398e0;
                    if (fVar6 == fVar7) {
                        f6 = 0.5f;
                    } else {
                        i10 = i11;
                        i12 = i13;
                    }
                    fVar.d((int) ((((i12 - i10) - gVar.f3532g) * f6) + i10 + 0.5f));
                    fVar2.d(fVar.f3532g + gVar.f3532g);
                }
            }
        }
    }

    @Override // w.o
    public final void d() {
        v.d dVar;
        v.d dVar2;
        v.d dVar3;
        v.d dVar4;
        f fVar = this.f3542k;
        v.d dVar5 = this.f3550b;
        boolean z3 = dVar5.f3391a;
        g gVar = this.f3552e;
        if (z3) {
            gVar.d(dVar5.k());
        }
        boolean z4 = gVar.f3534j;
        ArrayList arrayList = gVar.f3535k;
        ArrayList arrayList2 = gVar.f3536l;
        f fVar2 = this.i;
        f fVar3 = this.f3555h;
        if (!z4) {
            v.d dVar6 = this.f3550b;
            this.d = dVar6.f3418p0[1];
            if (dVar6.E) {
                this.f3543l = new a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f3550b.T) != null && dVar4.f3418p0[1] == 1) {
                    int k4 = (dVar4.k() - this.f3550b.J.e()) - this.f3550b.L.e();
                    o.b(fVar3, dVar4.f3397e.f3555h, this.f3550b.J.e());
                    o.b(fVar2, dVar4.f3397e.i, -this.f3550b.L.e());
                    gVar.d(k4);
                    return;
                }
                if (i == 1) {
                    gVar.d(this.f3550b.k());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f3550b).T) != null && dVar2.f3418p0[1] == 1) {
            o.b(fVar3, dVar2.f3397e.f3555h, dVar.J.e());
            o.b(fVar2, dVar2.f3397e.i, -this.f3550b.L.e());
            return;
        }
        boolean z5 = gVar.f3534j;
        if (z5) {
            v.d dVar7 = this.f3550b;
            if (dVar7.f3391a) {
                v.c[] cVarArr = dVar7.Q;
                v.c cVar = cVarArr[2];
                v.c cVar2 = cVar.f3388f;
                if (cVar2 != null && cVarArr[3].f3388f != null) {
                    if (dVar7.y()) {
                        fVar3.f3531f = this.f3550b.Q[2].e();
                        fVar2.f3531f = -this.f3550b.Q[3].e();
                    } else {
                        f h4 = o.h(this.f3550b.Q[2]);
                        if (h4 != null) {
                            o.b(fVar3, h4, this.f3550b.Q[2].e());
                        }
                        f h5 = o.h(this.f3550b.Q[3]);
                        if (h5 != null) {
                            o.b(fVar2, h5, -this.f3550b.Q[3].e());
                        }
                        fVar3.f3528b = true;
                        fVar2.f3528b = true;
                    }
                    v.d dVar8 = this.f3550b;
                    if (dVar8.E) {
                        o.b(fVar, fVar3, dVar8.f3392a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f h6 = o.h(cVar);
                    if (h6 != null) {
                        o.b(fVar3, h6, this.f3550b.Q[2].e());
                        o.b(fVar2, fVar3, gVar.f3532g);
                        v.d dVar9 = this.f3550b;
                        if (dVar9.E) {
                            o.b(fVar, fVar3, dVar9.f3392a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                v.c cVar3 = cVarArr[3];
                if (cVar3.f3388f != null) {
                    f h7 = o.h(cVar3);
                    if (h7 != null) {
                        o.b(fVar2, h7, -this.f3550b.Q[3].e());
                        o.b(fVar3, fVar2, -gVar.f3532g);
                    }
                    v.d dVar10 = this.f3550b;
                    if (dVar10.E) {
                        o.b(fVar, fVar3, dVar10.f3392a0);
                        return;
                    }
                    return;
                }
                v.c cVar4 = cVarArr[4];
                if (cVar4.f3388f != null) {
                    f h8 = o.h(cVar4);
                    if (h8 != null) {
                        o.b(fVar, h8, 0);
                        o.b(fVar3, fVar, -this.f3550b.f3392a0);
                        o.b(fVar2, fVar3, gVar.f3532g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof v.i) || dVar7.T == null || dVar7.i(7).f3388f != null) {
                    return;
                }
                v.d dVar11 = this.f3550b;
                o.b(fVar3, dVar11.T.f3397e.f3555h, dVar11.s());
                o.b(fVar2, fVar3, gVar.f3532g);
                v.d dVar12 = this.f3550b;
                if (dVar12.E) {
                    o.b(fVar, fVar3, dVar12.f3392a0);
                    return;
                }
                return;
            }
        }
        if (z5 || this.d != 3) {
            gVar.b(this);
        } else {
            v.d dVar13 = this.f3550b;
            int i4 = dVar13.f3421s;
            if (i4 == 2) {
                v.d dVar14 = dVar13.T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f3397e.f3552e;
                    arrayList2.add(gVar2);
                    gVar2.f3535k.add(gVar);
                    gVar.f3528b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            } else if (i4 == 3 && !dVar13.y()) {
                v.d dVar15 = this.f3550b;
                if (dVar15.f3420r != 3) {
                    g gVar3 = dVar15.d.f3552e;
                    arrayList2.add(gVar3);
                    gVar3.f3535k.add(gVar);
                    gVar.f3528b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        }
        v.d dVar16 = this.f3550b;
        v.c[] cVarArr2 = dVar16.Q;
        v.c cVar5 = cVarArr2[2];
        v.c cVar6 = cVar5.f3388f;
        if (cVar6 != null && cVarArr2[3].f3388f != null) {
            if (dVar16.y()) {
                fVar3.f3531f = this.f3550b.Q[2].e();
                fVar2.f3531f = -this.f3550b.Q[3].e();
            } else {
                f h9 = o.h(this.f3550b.Q[2]);
                f h10 = o.h(this.f3550b.Q[3]);
                if (h9 != null) {
                    h9.b(this);
                }
                if (h10 != null) {
                    h10.b(this);
                }
                this.f3556j = 4;
            }
            if (this.f3550b.E) {
                c(fVar, fVar3, 1, this.f3543l);
            }
        } else if (cVar6 != null) {
            f h11 = o.h(cVar5);
            if (h11 != null) {
                o.b(fVar3, h11, this.f3550b.Q[2].e());
                c(fVar2, fVar3, 1, gVar);
                if (this.f3550b.E) {
                    c(fVar, fVar3, 1, this.f3543l);
                }
                if (this.d == 3) {
                    v.d dVar17 = this.f3550b;
                    if (dVar17.W > 0.0f) {
                        k kVar = dVar17.d;
                        if (kVar.d == 3) {
                            kVar.f3552e.f3535k.add(gVar);
                            arrayList2.add(this.f3550b.d.f3552e);
                            gVar.f3527a = this;
                        }
                    }
                }
            }
        } else {
            v.c cVar7 = cVarArr2[3];
            if (cVar7.f3388f != null) {
                f h12 = o.h(cVar7);
                if (h12 != null) {
                    o.b(fVar2, h12, -this.f3550b.Q[3].e());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f3550b.E) {
                        c(fVar, fVar3, 1, this.f3543l);
                    }
                }
            } else {
                v.c cVar8 = cVarArr2[4];
                if (cVar8.f3388f != null) {
                    f h13 = o.h(cVar8);
                    if (h13 != null) {
                        o.b(fVar, h13, 0);
                        c(fVar3, fVar, -1, this.f3543l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(dVar16 instanceof v.i) && (dVar3 = dVar16.T) != null) {
                    o.b(fVar3, dVar3.f3397e.f3555h, dVar16.s());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f3550b.E) {
                        c(fVar, fVar3, 1, this.f3543l);
                    }
                    if (this.d == 3) {
                        v.d dVar18 = this.f3550b;
                        if (dVar18.W > 0.0f) {
                            k kVar2 = dVar18.d;
                            if (kVar2.d == 3) {
                                kVar2.f3552e.f3535k.add(gVar);
                                arrayList2.add(this.f3550b.d.f3552e);
                                gVar.f3527a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.f3529c = true;
        }
    }

    @Override // w.o
    public final void e() {
        f fVar = this.f3555h;
        if (fVar.f3534j) {
            this.f3550b.Z = fVar.f3532g;
        }
    }

    @Override // w.o
    public final void f() {
        this.f3551c = null;
        this.f3555h.c();
        this.i.c();
        this.f3542k.c();
        this.f3552e.c();
        this.f3554g = false;
    }

    @Override // w.o
    public final boolean k() {
        return this.d != 3 || this.f3550b.f3421s == 0;
    }

    public final void m() {
        this.f3554g = false;
        f fVar = this.f3555h;
        fVar.c();
        fVar.f3534j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f3534j = false;
        f fVar3 = this.f3542k;
        fVar3.c();
        fVar3.f3534j = false;
        this.f3552e.f3534j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3550b.f3404h0;
    }
}
