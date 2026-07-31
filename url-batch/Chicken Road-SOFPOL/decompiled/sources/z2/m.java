package z2;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: k, reason: collision with root package name */
    public f f9153k;

    /* renamed from: l, reason: collision with root package name */
    public a f9154l;

    @Override // z2.d
    public final void a(d dVar) {
        float f6;
        float f8;
        float f9;
        int i;
        if (w2.e.a(this.f9169j) == 3) {
            y2.d dVar2 = this.f9162b;
            l(dVar2.J, dVar2.L, 1);
            return;
        }
        g gVar = this.f9165e;
        if (gVar.f9139c && !gVar.f9145j && this.f9164d == 3) {
            y2.d dVar3 = this.f9162b;
            int i8 = dVar3.f8780s;
            if (i8 == 2) {
                y2.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f8755e.f9165e.f9145j) {
                        gVar.d((int) ((r5.f9143g * dVar3.f8787z) + 0.5f));
                    }
                }
            } else if (i8 == 3) {
                g gVar2 = dVar3.f8753d.f9165e;
                if (gVar2.f9145j) {
                    int i9 = dVar3.X;
                    if (i9 == -1) {
                        f6 = gVar2.f9143g;
                        f8 = dVar3.W;
                    } else if (i9 == 0) {
                        f9 = gVar2.f9143g * dVar3.W;
                        i = (int) (f9 + 0.5f);
                        gVar.d(i);
                    } else if (i9 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f6 = gVar2.f9143g;
                        f8 = dVar3.W;
                    }
                    f9 = f6 / f8;
                    i = (int) (f9 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        f fVar = this.f9168h;
        boolean z3 = fVar.f9139c;
        ArrayList arrayList = fVar.f9147l;
        if (z3) {
            f fVar2 = this.i;
            boolean z7 = fVar2.f9139c;
            ArrayList arrayList2 = fVar2.f9147l;
            if (z7) {
                if (fVar.f9145j && fVar2.f9145j && gVar.f9145j) {
                    return;
                }
                if (!gVar.f9145j && this.f9164d == 3) {
                    y2.d dVar5 = this.f9162b;
                    if (dVar5.f8779r == 0 && !dVar5.y()) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i10 = fVar3.f9143g + fVar.f9142f;
                        int i11 = fVar4.f9143g + fVar2.f9142f;
                        fVar.d(i10);
                        fVar2.d(i11);
                        gVar.d(i11 - i10);
                        return;
                    }
                }
                if (!gVar.f9145j && this.f9164d == 3 && this.f9161a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar5 = (f) arrayList.get(0);
                    int i12 = (((f) arrayList2.get(0)).f9143g + fVar2.f9142f) - (fVar5.f9143g + fVar.f9142f);
                    int i13 = gVar.f9148m;
                    if (i12 < i13) {
                        gVar.d(i12);
                    } else {
                        gVar.d(i13);
                    }
                }
                if (gVar.f9145j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar6 = (f) arrayList.get(0);
                    f fVar7 = (f) arrayList2.get(0);
                    int i14 = fVar6.f9143g;
                    int i15 = fVar.f9142f + i14;
                    int i16 = fVar7.f9143g;
                    int i17 = fVar2.f9142f + i16;
                    float f10 = this.f9162b.f8756e0;
                    if (fVar6 == fVar7) {
                        f10 = 0.5f;
                    } else {
                        i14 = i15;
                        i16 = i17;
                    }
                    fVar.d((int) ((((i16 - i14) - gVar.f9143g) * f10) + i14 + 0.5f));
                    fVar2.d(fVar.f9143g + gVar.f9143g);
                }
            }
        }
    }

    @Override // z2.o
    public final void d() {
        y2.d dVar;
        y2.d dVar2;
        y2.d dVar3;
        y2.d dVar4;
        f fVar = this.f9153k;
        y2.d dVar5 = this.f9162b;
        boolean z3 = dVar5.f8747a;
        g gVar = this.f9165e;
        if (z3) {
            gVar.d(dVar5.k());
        }
        boolean z7 = gVar.f9145j;
        ArrayList arrayList = gVar.f9146k;
        ArrayList arrayList2 = gVar.f9147l;
        f fVar2 = this.i;
        f fVar3 = this.f9168h;
        if (!z7) {
            y2.d dVar6 = this.f9162b;
            this.f9164d = dVar6.f8777p0[1];
            if (dVar6.E) {
                this.f9154l = new a(this);
            }
            int i = this.f9164d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f9162b.T) != null && dVar4.f8777p0[1] == 1) {
                    int k3 = (dVar4.k() - this.f9162b.J.e()) - this.f9162b.L.e();
                    o.b(fVar3, dVar4.f8755e.f9168h, this.f9162b.J.e());
                    o.b(fVar2, dVar4.f8755e.i, -this.f9162b.L.e());
                    gVar.d(k3);
                    return;
                }
                if (i == 1) {
                    gVar.d(this.f9162b.k());
                }
            }
        } else if (this.f9164d == 4 && (dVar2 = (dVar = this.f9162b).T) != null && dVar2.f8777p0[1] == 1) {
            o.b(fVar3, dVar2.f8755e.f9168h, dVar.J.e());
            o.b(fVar2, dVar2.f8755e.i, -this.f9162b.L.e());
            return;
        }
        boolean z8 = gVar.f9145j;
        if (z8) {
            y2.d dVar7 = this.f9162b;
            if (dVar7.f8747a) {
                y2.c[] cVarArr = dVar7.Q;
                y2.c cVar = cVarArr[2];
                y2.c cVar2 = cVar.f8744f;
                if (cVar2 != null && cVarArr[3].f8744f != null) {
                    if (dVar7.y()) {
                        fVar3.f9142f = this.f9162b.Q[2].e();
                        fVar2.f9142f = -this.f9162b.Q[3].e();
                    } else {
                        f h8 = o.h(this.f9162b.Q[2]);
                        if (h8 != null) {
                            o.b(fVar3, h8, this.f9162b.Q[2].e());
                        }
                        f h9 = o.h(this.f9162b.Q[3]);
                        if (h9 != null) {
                            o.b(fVar2, h9, -this.f9162b.Q[3].e());
                        }
                        fVar3.f9138b = true;
                        fVar2.f9138b = true;
                    }
                    y2.d dVar8 = this.f9162b;
                    if (dVar8.E) {
                        o.b(fVar, fVar3, dVar8.f8748a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f h10 = o.h(cVar);
                    if (h10 != null) {
                        o.b(fVar3, h10, this.f9162b.Q[2].e());
                        o.b(fVar2, fVar3, gVar.f9143g);
                        y2.d dVar9 = this.f9162b;
                        if (dVar9.E) {
                            o.b(fVar, fVar3, dVar9.f8748a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                y2.c cVar3 = cVarArr[3];
                if (cVar3.f8744f != null) {
                    f h11 = o.h(cVar3);
                    if (h11 != null) {
                        o.b(fVar2, h11, -this.f9162b.Q[3].e());
                        o.b(fVar3, fVar2, -gVar.f9143g);
                    }
                    y2.d dVar10 = this.f9162b;
                    if (dVar10.E) {
                        o.b(fVar, fVar3, dVar10.f8748a0);
                        return;
                    }
                    return;
                }
                y2.c cVar4 = cVarArr[4];
                if (cVar4.f8744f != null) {
                    f h12 = o.h(cVar4);
                    if (h12 != null) {
                        o.b(fVar, h12, 0);
                        o.b(fVar3, fVar, -this.f9162b.f8748a0);
                        o.b(fVar2, fVar3, gVar.f9143g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof y2.i) || dVar7.T == null || dVar7.i(7).f8744f != null) {
                    return;
                }
                y2.d dVar11 = this.f9162b;
                o.b(fVar3, dVar11.T.f8755e.f9168h, dVar11.s());
                o.b(fVar2, fVar3, gVar.f9143g);
                y2.d dVar12 = this.f9162b;
                if (dVar12.E) {
                    o.b(fVar, fVar3, dVar12.f8748a0);
                    return;
                }
                return;
            }
        }
        if (z8 || this.f9164d != 3) {
            gVar.b(this);
        } else {
            y2.d dVar13 = this.f9162b;
            int i8 = dVar13.f8780s;
            if (i8 == 2) {
                y2.d dVar14 = dVar13.T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f8755e.f9165e;
                    arrayList2.add(gVar2);
                    gVar2.f9146k.add(gVar);
                    gVar.f9138b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            } else if (i8 == 3 && !dVar13.y()) {
                y2.d dVar15 = this.f9162b;
                if (dVar15.f8779r != 3) {
                    g gVar3 = dVar15.f8753d.f9165e;
                    arrayList2.add(gVar3);
                    gVar3.f9146k.add(gVar);
                    gVar.f9138b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        }
        y2.d dVar16 = this.f9162b;
        y2.c[] cVarArr2 = dVar16.Q;
        y2.c cVar5 = cVarArr2[2];
        y2.c cVar6 = cVar5.f8744f;
        if (cVar6 != null && cVarArr2[3].f8744f != null) {
            if (dVar16.y()) {
                fVar3.f9142f = this.f9162b.Q[2].e();
                fVar2.f9142f = -this.f9162b.Q[3].e();
            } else {
                f h13 = o.h(this.f9162b.Q[2]);
                f h14 = o.h(this.f9162b.Q[3]);
                if (h13 != null) {
                    h13.b(this);
                }
                if (h14 != null) {
                    h14.b(this);
                }
                this.f9169j = 4;
            }
            if (this.f9162b.E) {
                c(fVar, fVar3, 1, this.f9154l);
            }
        } else if (cVar6 != null) {
            f h15 = o.h(cVar5);
            if (h15 != null) {
                o.b(fVar3, h15, this.f9162b.Q[2].e());
                c(fVar2, fVar3, 1, gVar);
                if (this.f9162b.E) {
                    c(fVar, fVar3, 1, this.f9154l);
                }
                if (this.f9164d == 3) {
                    y2.d dVar17 = this.f9162b;
                    if (dVar17.W > 0.0f) {
                        k kVar = dVar17.f8753d;
                        if (kVar.f9164d == 3) {
                            kVar.f9165e.f9146k.add(gVar);
                            arrayList2.add(this.f9162b.f8753d.f9165e);
                            gVar.f9137a = this;
                        }
                    }
                }
            }
        } else {
            y2.c cVar7 = cVarArr2[3];
            if (cVar7.f8744f != null) {
                f h16 = o.h(cVar7);
                if (h16 != null) {
                    o.b(fVar2, h16, -this.f9162b.Q[3].e());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f9162b.E) {
                        c(fVar, fVar3, 1, this.f9154l);
                    }
                }
            } else {
                y2.c cVar8 = cVarArr2[4];
                if (cVar8.f8744f != null) {
                    f h17 = o.h(cVar8);
                    if (h17 != null) {
                        o.b(fVar, h17, 0);
                        c(fVar3, fVar, -1, this.f9154l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(dVar16 instanceof y2.i) && (dVar3 = dVar16.T) != null) {
                    o.b(fVar3, dVar3.f8755e.f9168h, dVar16.s());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f9162b.E) {
                        c(fVar, fVar3, 1, this.f9154l);
                    }
                    if (this.f9164d == 3) {
                        y2.d dVar18 = this.f9162b;
                        if (dVar18.W > 0.0f) {
                            k kVar2 = dVar18.f8753d;
                            if (kVar2.f9164d == 3) {
                                kVar2.f9165e.f9146k.add(gVar);
                                arrayList2.add(this.f9162b.f8753d.f9165e);
                                gVar.f9137a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.f9139c = true;
        }
    }

    @Override // z2.o
    public final void e() {
        f fVar = this.f9168h;
        if (fVar.f9145j) {
            this.f9162b.Z = fVar.f9143g;
        }
    }

    @Override // z2.o
    public final void f() {
        this.f9163c = null;
        this.f9168h.c();
        this.i.c();
        this.f9153k.c();
        this.f9165e.c();
        this.f9167g = false;
    }

    @Override // z2.o
    public final boolean k() {
        return this.f9164d != 3 || this.f9162b.f8780s == 0;
    }

    public final void m() {
        this.f9167g = false;
        f fVar = this.f9168h;
        fVar.c();
        fVar.f9145j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f9145j = false;
        f fVar3 = this.f9153k;
        fVar3.c();
        fVar3.f9145j = false;
        this.f9165e.f9145j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f9162b.f8762h0;
    }
}
