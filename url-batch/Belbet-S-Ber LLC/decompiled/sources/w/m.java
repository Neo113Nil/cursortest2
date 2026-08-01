package w;

import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: k, reason: collision with root package name */
    public f f3764k;

    /* renamed from: l, reason: collision with root package name */
    public a f3765l;

    @Override // w.d
    public final void a(d dVar) {
        float f5;
        float f6;
        float f7;
        int i;
        if (t.e.a(this.f3777j) == 3) {
            v.d dVar2 = this.f3772b;
            l(dVar2.J, dVar2.L, 1);
            return;
        }
        g gVar = this.f3774e;
        if (gVar.f3752c && !gVar.f3756j && this.d == 3) {
            v.d dVar3 = this.f3772b;
            int i4 = dVar3.f3640s;
            if (i4 == 2) {
                v.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f3617e.f3774e.f3756j) {
                        gVar.d((int) ((r5.f3755g * dVar3.f3647z) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                g gVar2 = dVar3.d.f3774e;
                if (gVar2.f3756j) {
                    int i5 = dVar3.X;
                    if (i5 == -1) {
                        f5 = gVar2.f3755g;
                        f6 = dVar3.W;
                    } else if (i5 == 0) {
                        f7 = gVar2.f3755g * dVar3.W;
                        i = (int) (f7 + 0.5f);
                        gVar.d(i);
                    } else if (i5 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f5 = gVar2.f3755g;
                        f6 = dVar3.W;
                    }
                    f7 = f5 / f6;
                    i = (int) (f7 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        f fVar = this.h;
        boolean z4 = fVar.f3752c;
        ArrayList arrayList = fVar.f3758l;
        if (z4) {
            f fVar2 = this.i;
            boolean z5 = fVar2.f3752c;
            ArrayList arrayList2 = fVar2.f3758l;
            if (z5) {
                if (fVar.f3756j && fVar2.f3756j && gVar.f3756j) {
                    return;
                }
                if (!gVar.f3756j && this.d == 3) {
                    v.d dVar5 = this.f3772b;
                    if (dVar5.f3639r == 0 && !dVar5.y()) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i6 = fVar3.f3755g + fVar.f3754f;
                        int i7 = fVar4.f3755g + fVar2.f3754f;
                        fVar.d(i6);
                        fVar2.d(i7);
                        gVar.d(i7 - i6);
                        return;
                    }
                }
                if (!gVar.f3756j && this.d == 3 && this.f3771a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar5 = (f) arrayList.get(0);
                    int i8 = (((f) arrayList2.get(0)).f3755g + fVar2.f3754f) - (fVar5.f3755g + fVar.f3754f);
                    int i9 = gVar.f3759m;
                    if (i8 < i9) {
                        gVar.d(i8);
                    } else {
                        gVar.d(i9);
                    }
                }
                if (gVar.f3756j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar6 = (f) arrayList.get(0);
                    f fVar7 = (f) arrayList2.get(0);
                    int i10 = fVar6.f3755g;
                    int i11 = fVar.f3754f + i10;
                    int i12 = fVar7.f3755g;
                    int i13 = fVar2.f3754f + i12;
                    float f8 = this.f3772b.f3618e0;
                    if (fVar6 == fVar7) {
                        f8 = 0.5f;
                    } else {
                        i10 = i11;
                        i12 = i13;
                    }
                    fVar.d((int) ((((i12 - i10) - gVar.f3755g) * f8) + i10 + 0.5f));
                    fVar2.d(fVar.f3755g + gVar.f3755g);
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
        f fVar = this.f3764k;
        v.d dVar5 = this.f3772b;
        boolean z4 = dVar5.f3611a;
        g gVar = this.f3774e;
        if (z4) {
            gVar.d(dVar5.k());
        }
        boolean z5 = gVar.f3756j;
        ArrayList arrayList = gVar.f3757k;
        ArrayList arrayList2 = gVar.f3758l;
        f fVar2 = this.i;
        f fVar3 = this.h;
        if (!z5) {
            v.d dVar6 = this.f3772b;
            this.d = dVar6.f3637p0[1];
            if (dVar6.E) {
                this.f3765l = new a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f3772b.T) != null && dVar4.f3637p0[1] == 1) {
                    int k4 = (dVar4.k() - this.f3772b.J.e()) - this.f3772b.L.e();
                    o.b(fVar3, dVar4.f3617e.h, this.f3772b.J.e());
                    o.b(fVar2, dVar4.f3617e.i, -this.f3772b.L.e());
                    gVar.d(k4);
                    return;
                }
                if (i == 1) {
                    gVar.d(this.f3772b.k());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f3772b).T) != null && dVar2.f3637p0[1] == 1) {
            o.b(fVar3, dVar2.f3617e.h, dVar.J.e());
            o.b(fVar2, dVar2.f3617e.i, -this.f3772b.L.e());
            return;
        }
        boolean z6 = gVar.f3756j;
        if (z6) {
            v.d dVar7 = this.f3772b;
            if (dVar7.f3611a) {
                v.c[] cVarArr = dVar7.Q;
                v.c cVar = cVarArr[2];
                v.c cVar2 = cVar.f3609f;
                if (cVar2 != null && cVarArr[3].f3609f != null) {
                    if (dVar7.y()) {
                        fVar3.f3754f = this.f3772b.Q[2].e();
                        fVar2.f3754f = -this.f3772b.Q[3].e();
                    } else {
                        f h = o.h(this.f3772b.Q[2]);
                        if (h != null) {
                            o.b(fVar3, h, this.f3772b.Q[2].e());
                        }
                        f h5 = o.h(this.f3772b.Q[3]);
                        if (h5 != null) {
                            o.b(fVar2, h5, -this.f3772b.Q[3].e());
                        }
                        fVar3.f3751b = true;
                        fVar2.f3751b = true;
                    }
                    v.d dVar8 = this.f3772b;
                    if (dVar8.E) {
                        o.b(fVar, fVar3, dVar8.f3612a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f h6 = o.h(cVar);
                    if (h6 != null) {
                        o.b(fVar3, h6, this.f3772b.Q[2].e());
                        o.b(fVar2, fVar3, gVar.f3755g);
                        v.d dVar9 = this.f3772b;
                        if (dVar9.E) {
                            o.b(fVar, fVar3, dVar9.f3612a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                v.c cVar3 = cVarArr[3];
                if (cVar3.f3609f != null) {
                    f h7 = o.h(cVar3);
                    if (h7 != null) {
                        o.b(fVar2, h7, -this.f3772b.Q[3].e());
                        o.b(fVar3, fVar2, -gVar.f3755g);
                    }
                    v.d dVar10 = this.f3772b;
                    if (dVar10.E) {
                        o.b(fVar, fVar3, dVar10.f3612a0);
                        return;
                    }
                    return;
                }
                v.c cVar4 = cVarArr[4];
                if (cVar4.f3609f != null) {
                    f h8 = o.h(cVar4);
                    if (h8 != null) {
                        o.b(fVar, h8, 0);
                        o.b(fVar3, fVar, -this.f3772b.f3612a0);
                        o.b(fVar2, fVar3, gVar.f3755g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof v.i) || dVar7.T == null || dVar7.i(7).f3609f != null) {
                    return;
                }
                v.d dVar11 = this.f3772b;
                o.b(fVar3, dVar11.T.f3617e.h, dVar11.s());
                o.b(fVar2, fVar3, gVar.f3755g);
                v.d dVar12 = this.f3772b;
                if (dVar12.E) {
                    o.b(fVar, fVar3, dVar12.f3612a0);
                    return;
                }
                return;
            }
        }
        if (z6 || this.d != 3) {
            gVar.b(this);
        } else {
            v.d dVar13 = this.f3772b;
            int i4 = dVar13.f3640s;
            if (i4 == 2) {
                v.d dVar14 = dVar13.T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f3617e.f3774e;
                    arrayList2.add(gVar2);
                    gVar2.f3757k.add(gVar);
                    gVar.f3751b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            } else if (i4 == 3 && !dVar13.y()) {
                v.d dVar15 = this.f3772b;
                if (dVar15.f3639r != 3) {
                    g gVar3 = dVar15.d.f3774e;
                    arrayList2.add(gVar3);
                    gVar3.f3757k.add(gVar);
                    gVar.f3751b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        }
        v.d dVar16 = this.f3772b;
        v.c[] cVarArr2 = dVar16.Q;
        v.c cVar5 = cVarArr2[2];
        v.c cVar6 = cVar5.f3609f;
        if (cVar6 != null && cVarArr2[3].f3609f != null) {
            if (dVar16.y()) {
                fVar3.f3754f = this.f3772b.Q[2].e();
                fVar2.f3754f = -this.f3772b.Q[3].e();
            } else {
                f h9 = o.h(this.f3772b.Q[2]);
                f h10 = o.h(this.f3772b.Q[3]);
                if (h9 != null) {
                    h9.b(this);
                }
                if (h10 != null) {
                    h10.b(this);
                }
                this.f3777j = 4;
            }
            if (this.f3772b.E) {
                c(fVar, fVar3, 1, this.f3765l);
            }
        } else if (cVar6 != null) {
            f h11 = o.h(cVar5);
            if (h11 != null) {
                o.b(fVar3, h11, this.f3772b.Q[2].e());
                c(fVar2, fVar3, 1, gVar);
                if (this.f3772b.E) {
                    c(fVar, fVar3, 1, this.f3765l);
                }
                if (this.d == 3) {
                    v.d dVar17 = this.f3772b;
                    if (dVar17.W > 0.0f) {
                        k kVar = dVar17.d;
                        if (kVar.d == 3) {
                            kVar.f3774e.f3757k.add(gVar);
                            arrayList2.add(this.f3772b.d.f3774e);
                            gVar.f3750a = this;
                        }
                    }
                }
            }
        } else {
            v.c cVar7 = cVarArr2[3];
            if (cVar7.f3609f != null) {
                f h12 = o.h(cVar7);
                if (h12 != null) {
                    o.b(fVar2, h12, -this.f3772b.Q[3].e());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f3772b.E) {
                        c(fVar, fVar3, 1, this.f3765l);
                    }
                }
            } else {
                v.c cVar8 = cVarArr2[4];
                if (cVar8.f3609f != null) {
                    f h13 = o.h(cVar8);
                    if (h13 != null) {
                        o.b(fVar, h13, 0);
                        c(fVar3, fVar, -1, this.f3765l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(dVar16 instanceof v.i) && (dVar3 = dVar16.T) != null) {
                    o.b(fVar3, dVar3.f3617e.h, dVar16.s());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f3772b.E) {
                        c(fVar, fVar3, 1, this.f3765l);
                    }
                    if (this.d == 3) {
                        v.d dVar18 = this.f3772b;
                        if (dVar18.W > 0.0f) {
                            k kVar2 = dVar18.d;
                            if (kVar2.d == 3) {
                                kVar2.f3774e.f3757k.add(gVar);
                                arrayList2.add(this.f3772b.d.f3774e);
                                gVar.f3750a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.f3752c = true;
        }
    }

    @Override // w.o
    public final void e() {
        f fVar = this.h;
        if (fVar.f3756j) {
            this.f3772b.Z = fVar.f3755g;
        }
    }

    @Override // w.o
    public final void f() {
        this.f3773c = null;
        this.h.c();
        this.i.c();
        this.f3764k.c();
        this.f3774e.c();
        this.f3776g = false;
    }

    @Override // w.o
    public final boolean k() {
        return this.d != 3 || this.f3772b.f3640s == 0;
    }

    public final void m() {
        this.f3776g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f3756j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f3756j = false;
        f fVar3 = this.f3764k;
        fVar3.c();
        fVar3.f3756j = false;
        this.f3774e.f3756j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3772b.f3623h0;
    }
}
