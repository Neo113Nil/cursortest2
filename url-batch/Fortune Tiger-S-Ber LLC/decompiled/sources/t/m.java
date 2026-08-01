package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: k, reason: collision with root package name */
    public f f3347k;

    /* renamed from: l, reason: collision with root package name */
    public a f3348l;

    @Override // t.d
    public final void a(d dVar) {
        float f4;
        float f5;
        float f6;
        int i4;
        if (q.e.a(this.f3360j) == 3) {
            s.d dVar2 = this.f3355b;
            l(dVar2.J, dVar2.L, 1);
            return;
        }
        g gVar = this.f3357e;
        if (gVar.c && !gVar.f3339j && this.f3356d == 3) {
            s.d dVar3 = this.f3355b;
            int i5 = dVar3.f3262s;
            if (i5 == 2) {
                s.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f3239e.f3357e.f3339j) {
                        gVar.d((int) ((r5.g * dVar3.f3269z) + 0.5f));
                    }
                }
            } else if (i5 == 3) {
                g gVar2 = dVar3.f3237d.f3357e;
                if (gVar2.f3339j) {
                    int i6 = dVar3.X;
                    if (i6 == -1) {
                        f4 = gVar2.g;
                        f5 = dVar3.W;
                    } else if (i6 == 0) {
                        f6 = gVar2.g * dVar3.W;
                        i4 = (int) (f6 + 0.5f);
                        gVar.d(i4);
                    } else if (i6 != 1) {
                        i4 = 0;
                        gVar.d(i4);
                    } else {
                        f4 = gVar2.g;
                        f5 = dVar3.W;
                    }
                    f6 = f4 / f5;
                    i4 = (int) (f6 + 0.5f);
                    gVar.d(i4);
                }
            }
        }
        f fVar = this.h;
        boolean z3 = fVar.c;
        ArrayList arrayList = fVar.f3341l;
        if (z3) {
            f fVar2 = this.f3359i;
            boolean z4 = fVar2.c;
            ArrayList arrayList2 = fVar2.f3341l;
            if (z4) {
                if (fVar.f3339j && fVar2.f3339j && gVar.f3339j) {
                    return;
                }
                if (!gVar.f3339j && this.f3356d == 3) {
                    s.d dVar5 = this.f3355b;
                    if (dVar5.f3261r == 0 && !dVar5.y()) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i7 = fVar3.g + fVar.f3337f;
                        int i8 = fVar4.g + fVar2.f3337f;
                        fVar.d(i7);
                        fVar2.d(i8);
                        gVar.d(i8 - i7);
                        return;
                    }
                }
                if (!gVar.f3339j && this.f3356d == 3 && this.f3354a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar5 = (f) arrayList.get(0);
                    int i9 = (((f) arrayList2.get(0)).g + fVar2.f3337f) - (fVar5.g + fVar.f3337f);
                    int i10 = gVar.f3342m;
                    if (i9 < i10) {
                        gVar.d(i9);
                    } else {
                        gVar.d(i10);
                    }
                }
                if (gVar.f3339j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar6 = (f) arrayList.get(0);
                    f fVar7 = (f) arrayList2.get(0);
                    int i11 = fVar6.g;
                    int i12 = fVar.f3337f + i11;
                    int i13 = fVar7.g;
                    int i14 = fVar2.f3337f + i13;
                    float f7 = this.f3355b.f3240e0;
                    if (fVar6 == fVar7) {
                        f7 = 0.5f;
                    } else {
                        i11 = i12;
                        i13 = i14;
                    }
                    fVar.d((int) ((((i13 - i11) - gVar.g) * f7) + i11 + 0.5f));
                    fVar2.d(fVar.g + gVar.g);
                }
            }
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar;
        s.d dVar2;
        s.d dVar3;
        s.d dVar4;
        f fVar = this.f3347k;
        s.d dVar5 = this.f3355b;
        boolean z3 = dVar5.f3233a;
        g gVar = this.f3357e;
        if (z3) {
            gVar.d(dVar5.k());
        }
        boolean z4 = gVar.f3339j;
        ArrayList arrayList = gVar.f3340k;
        ArrayList arrayList2 = gVar.f3341l;
        f fVar2 = this.f3359i;
        f fVar3 = this.h;
        if (!z4) {
            s.d dVar6 = this.f3355b;
            this.f3356d = dVar6.f3259p0[1];
            if (dVar6.E) {
                this.f3348l = new a(this);
            }
            int i4 = this.f3356d;
            if (i4 != 3) {
                if (i4 == 4 && (dVar4 = this.f3355b.T) != null && dVar4.f3259p0[1] == 1) {
                    int k4 = (dVar4.k() - this.f3355b.J.e()) - this.f3355b.L.e();
                    o.b(fVar3, dVar4.f3239e.h, this.f3355b.J.e());
                    o.b(fVar2, dVar4.f3239e.f3359i, -this.f3355b.L.e());
                    gVar.d(k4);
                    return;
                }
                if (i4 == 1) {
                    gVar.d(this.f3355b.k());
                }
            }
        } else if (this.f3356d == 4 && (dVar2 = (dVar = this.f3355b).T) != null && dVar2.f3259p0[1] == 1) {
            o.b(fVar3, dVar2.f3239e.h, dVar.J.e());
            o.b(fVar2, dVar2.f3239e.f3359i, -this.f3355b.L.e());
            return;
        }
        boolean z5 = gVar.f3339j;
        if (z5) {
            s.d dVar7 = this.f3355b;
            if (dVar7.f3233a) {
                s.c[] cVarArr = dVar7.Q;
                s.c cVar = cVarArr[2];
                s.c cVar2 = cVar.f3231f;
                if (cVar2 != null && cVarArr[3].f3231f != null) {
                    if (dVar7.y()) {
                        fVar3.f3337f = this.f3355b.Q[2].e();
                        fVar2.f3337f = -this.f3355b.Q[3].e();
                    } else {
                        f h = o.h(this.f3355b.Q[2]);
                        if (h != null) {
                            o.b(fVar3, h, this.f3355b.Q[2].e());
                        }
                        f h4 = o.h(this.f3355b.Q[3]);
                        if (h4 != null) {
                            o.b(fVar2, h4, -this.f3355b.Q[3].e());
                        }
                        fVar3.f3334b = true;
                        fVar2.f3334b = true;
                    }
                    s.d dVar8 = this.f3355b;
                    if (dVar8.E) {
                        o.b(fVar, fVar3, dVar8.a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f h5 = o.h(cVar);
                    if (h5 != null) {
                        o.b(fVar3, h5, this.f3355b.Q[2].e());
                        o.b(fVar2, fVar3, gVar.g);
                        s.d dVar9 = this.f3355b;
                        if (dVar9.E) {
                            o.b(fVar, fVar3, dVar9.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                s.c cVar3 = cVarArr[3];
                if (cVar3.f3231f != null) {
                    f h6 = o.h(cVar3);
                    if (h6 != null) {
                        o.b(fVar2, h6, -this.f3355b.Q[3].e());
                        o.b(fVar3, fVar2, -gVar.g);
                    }
                    s.d dVar10 = this.f3355b;
                    if (dVar10.E) {
                        o.b(fVar, fVar3, dVar10.a0);
                        return;
                    }
                    return;
                }
                s.c cVar4 = cVarArr[4];
                if (cVar4.f3231f != null) {
                    f h7 = o.h(cVar4);
                    if (h7 != null) {
                        o.b(fVar, h7, 0);
                        o.b(fVar3, fVar, -this.f3355b.a0);
                        o.b(fVar2, fVar3, gVar.g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof s.i) || dVar7.T == null || dVar7.i(7).f3231f != null) {
                    return;
                }
                s.d dVar11 = this.f3355b;
                o.b(fVar3, dVar11.T.f3239e.h, dVar11.s());
                o.b(fVar2, fVar3, gVar.g);
                s.d dVar12 = this.f3355b;
                if (dVar12.E) {
                    o.b(fVar, fVar3, dVar12.a0);
                    return;
                }
                return;
            }
        }
        if (z5 || this.f3356d != 3) {
            gVar.b(this);
        } else {
            s.d dVar13 = this.f3355b;
            int i5 = dVar13.f3262s;
            if (i5 == 2) {
                s.d dVar14 = dVar13.T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f3239e.f3357e;
                    arrayList2.add(gVar2);
                    gVar2.f3340k.add(gVar);
                    gVar.f3334b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            } else if (i5 == 3 && !dVar13.y()) {
                s.d dVar15 = this.f3355b;
                if (dVar15.f3261r != 3) {
                    g gVar3 = dVar15.f3237d.f3357e;
                    arrayList2.add(gVar3);
                    gVar3.f3340k.add(gVar);
                    gVar.f3334b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        }
        s.d dVar16 = this.f3355b;
        s.c[] cVarArr2 = dVar16.Q;
        s.c cVar5 = cVarArr2[2];
        s.c cVar6 = cVar5.f3231f;
        if (cVar6 != null && cVarArr2[3].f3231f != null) {
            if (dVar16.y()) {
                fVar3.f3337f = this.f3355b.Q[2].e();
                fVar2.f3337f = -this.f3355b.Q[3].e();
            } else {
                f h8 = o.h(this.f3355b.Q[2]);
                f h9 = o.h(this.f3355b.Q[3]);
                if (h8 != null) {
                    h8.b(this);
                }
                if (h9 != null) {
                    h9.b(this);
                }
                this.f3360j = 4;
            }
            if (this.f3355b.E) {
                c(fVar, fVar3, 1, this.f3348l);
            }
        } else if (cVar6 != null) {
            f h10 = o.h(cVar5);
            if (h10 != null) {
                o.b(fVar3, h10, this.f3355b.Q[2].e());
                c(fVar2, fVar3, 1, gVar);
                if (this.f3355b.E) {
                    c(fVar, fVar3, 1, this.f3348l);
                }
                if (this.f3356d == 3) {
                    s.d dVar17 = this.f3355b;
                    if (dVar17.W > 0.0f) {
                        k kVar = dVar17.f3237d;
                        if (kVar.f3356d == 3) {
                            kVar.f3357e.f3340k.add(gVar);
                            arrayList2.add(this.f3355b.f3237d.f3357e);
                            gVar.f3333a = this;
                        }
                    }
                }
            }
        } else {
            s.c cVar7 = cVarArr2[3];
            if (cVar7.f3231f != null) {
                f h11 = o.h(cVar7);
                if (h11 != null) {
                    o.b(fVar2, h11, -this.f3355b.Q[3].e());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f3355b.E) {
                        c(fVar, fVar3, 1, this.f3348l);
                    }
                }
            } else {
                s.c cVar8 = cVarArr2[4];
                if (cVar8.f3231f != null) {
                    f h12 = o.h(cVar8);
                    if (h12 != null) {
                        o.b(fVar, h12, 0);
                        c(fVar3, fVar, -1, this.f3348l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(dVar16 instanceof s.i) && (dVar3 = dVar16.T) != null) {
                    o.b(fVar3, dVar3.f3239e.h, dVar16.s());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f3355b.E) {
                        c(fVar, fVar3, 1, this.f3348l);
                    }
                    if (this.f3356d == 3) {
                        s.d dVar18 = this.f3355b;
                        if (dVar18.W > 0.0f) {
                            k kVar2 = dVar18.f3237d;
                            if (kVar2.f3356d == 3) {
                                kVar2.f3357e.f3340k.add(gVar);
                                arrayList2.add(this.f3355b.f3237d.f3357e);
                                gVar.f3333a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.c = true;
        }
    }

    @Override // t.o
    public final void e() {
        f fVar = this.h;
        if (fVar.f3339j) {
            this.f3355b.Z = fVar.g;
        }
    }

    @Override // t.o
    public final void f() {
        this.c = null;
        this.h.c();
        this.f3359i.c();
        this.f3347k.c();
        this.f3357e.c();
        this.g = false;
    }

    @Override // t.o
    public final boolean k() {
        return this.f3356d != 3 || this.f3355b.f3262s == 0;
    }

    public final void m() {
        this.g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f3339j = false;
        f fVar2 = this.f3359i;
        fVar2.c();
        fVar2.f3339j = false;
        f fVar3 = this.f3347k;
        fVar3.c();
        fVar3.f3339j = false;
        this.f3357e.f3339j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3355b.f3243h0;
    }
}
