package t;

import androidx.recyclerview.widget.RecyclerView;
import q.AbstractC0287e;

/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: k, reason: collision with root package name */
    public f f3788k;

    /* renamed from: l, reason: collision with root package name */
    public C0297a f3789l;

    @Override // t.InterfaceC0300d
    public final void a(InterfaceC0300d interfaceC0300d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0287e.a(this.f3801j) == 3) {
            s.d dVar = this.f3796b;
            l(dVar.f3557J, dVar.f3559L, 1);
            return;
        }
        g gVar = this.f3798e;
        if (gVar.f3776c && !gVar.f3780j && this.d == 3) {
            s.d dVar2 = this.f3796b;
            int i2 = dVar2.f3603s;
            if (i2 == 2) {
                s.d dVar3 = dVar2.f3567T;
                if (dVar3 != null) {
                    if (dVar3.f3581e.f3798e.f3780j) {
                        gVar.d((int) ((r5.f3779g * dVar2.f3610z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                g gVar2 = dVar2.d.f3798e;
                if (gVar2.f3780j) {
                    int i3 = dVar2.f3571X;
                    if (i3 == -1) {
                        f2 = gVar2.f3779g;
                        f3 = dVar2.f3570W;
                    } else if (i3 == 0) {
                        f4 = gVar2.f3779g * dVar2.f3570W;
                        i = (int) (f4 + 0.5f);
                        gVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f2 = gVar2.f3779g;
                        f3 = dVar2.f3570W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        f fVar = this.h;
        if (fVar.f3776c) {
            f fVar2 = this.i;
            if (fVar2.f3776c) {
                if (fVar.f3780j && fVar2.f3780j && gVar.f3780j) {
                    return;
                }
                if (!gVar.f3780j && this.d == 3) {
                    s.d dVar4 = this.f3796b;
                    if (dVar4.f3602r == 0 && !dVar4.y()) {
                        f fVar3 = (f) fVar.f3782l.get(0);
                        f fVar4 = (f) fVar2.f3782l.get(0);
                        int i4 = fVar3.f3779g + fVar.f3778f;
                        int i5 = fVar4.f3779g + fVar2.f3778f;
                        fVar.d(i4);
                        fVar2.d(i5);
                        gVar.d(i5 - i4);
                        return;
                    }
                }
                if (!gVar.f3780j && this.d == 3 && this.f3795a == 1 && fVar.f3782l.size() > 0 && fVar2.f3782l.size() > 0) {
                    f fVar5 = (f) fVar.f3782l.get(0);
                    int i6 = (((f) fVar2.f3782l.get(0)).f3779g + fVar2.f3778f) - (fVar5.f3779g + fVar.f3778f);
                    int i7 = gVar.f3783m;
                    if (i6 < i7) {
                        gVar.d(i6);
                    } else {
                        gVar.d(i7);
                    }
                }
                if (gVar.f3780j && fVar.f3782l.size() > 0 && fVar2.f3782l.size() > 0) {
                    f fVar6 = (f) fVar.f3782l.get(0);
                    f fVar7 = (f) fVar2.f3782l.get(0);
                    int i8 = fVar6.f3779g;
                    int i9 = fVar.f3778f + i8;
                    int i10 = fVar7.f3779g;
                    int i11 = fVar2.f3778f + i10;
                    float f5 = this.f3796b.f3582e0;
                    if (fVar6 == fVar7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    fVar.d((int) ((((i10 - i8) - gVar.f3779g) * f5) + i8 + 0.5f));
                    fVar2.d(fVar.f3779g + gVar.f3779g);
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
        s.d dVar5 = this.f3796b;
        boolean z2 = dVar5.f3574a;
        g gVar = this.f3798e;
        if (z2) {
            gVar.d(dVar5.k());
        }
        boolean z3 = gVar.f3780j;
        f fVar = this.i;
        f fVar2 = this.h;
        if (!z3) {
            s.d dVar6 = this.f3796b;
            this.d = dVar6.f3600p0[1];
            if (dVar6.f3553E) {
                this.f3789l = new C0297a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f3796b.f3567T) != null && dVar4.f3600p0[1] == 1) {
                    int k2 = (dVar4.k() - this.f3796b.f3557J.e()) - this.f3796b.f3559L.e();
                    o.b(fVar2, dVar4.f3581e.h, this.f3796b.f3557J.e());
                    o.b(fVar, dVar4.f3581e.i, -this.f3796b.f3559L.e());
                    gVar.d(k2);
                    return;
                }
                if (i == 1) {
                    gVar.d(this.f3796b.k());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f3796b).f3567T) != null && dVar2.f3600p0[1] == 1) {
            o.b(fVar2, dVar2.f3581e.h, dVar.f3557J.e());
            o.b(fVar, dVar2.f3581e.i, -this.f3796b.f3559L.e());
            return;
        }
        boolean z4 = gVar.f3780j;
        f fVar3 = this.f3788k;
        if (z4) {
            s.d dVar7 = this.f3796b;
            if (dVar7.f3574a) {
                s.c[] cVarArr = dVar7.f3564Q;
                s.c cVar = cVarArr[2];
                s.c cVar2 = cVar.f3547f;
                if (cVar2 != null && cVarArr[3].f3547f != null) {
                    if (dVar7.y()) {
                        fVar2.f3778f = this.f3796b.f3564Q[2].e();
                        fVar.f3778f = -this.f3796b.f3564Q[3].e();
                    } else {
                        f h = o.h(this.f3796b.f3564Q[2]);
                        if (h != null) {
                            o.b(fVar2, h, this.f3796b.f3564Q[2].e());
                        }
                        f h2 = o.h(this.f3796b.f3564Q[3]);
                        if (h2 != null) {
                            o.b(fVar, h2, -this.f3796b.f3564Q[3].e());
                        }
                        fVar2.f3775b = true;
                        fVar.f3775b = true;
                    }
                    s.d dVar8 = this.f3796b;
                    if (dVar8.f3553E) {
                        o.b(fVar3, fVar2, dVar8.f3575a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f h3 = o.h(cVar);
                    if (h3 != null) {
                        o.b(fVar2, h3, this.f3796b.f3564Q[2].e());
                        o.b(fVar, fVar2, gVar.f3779g);
                        s.d dVar9 = this.f3796b;
                        if (dVar9.f3553E) {
                            o.b(fVar3, fVar2, dVar9.f3575a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                s.c cVar3 = cVarArr[3];
                if (cVar3.f3547f != null) {
                    f h4 = o.h(cVar3);
                    if (h4 != null) {
                        o.b(fVar, h4, -this.f3796b.f3564Q[3].e());
                        o.b(fVar2, fVar, -gVar.f3779g);
                    }
                    s.d dVar10 = this.f3796b;
                    if (dVar10.f3553E) {
                        o.b(fVar3, fVar2, dVar10.f3575a0);
                        return;
                    }
                    return;
                }
                s.c cVar4 = cVarArr[4];
                if (cVar4.f3547f != null) {
                    f h5 = o.h(cVar4);
                    if (h5 != null) {
                        o.b(fVar3, h5, 0);
                        o.b(fVar2, fVar3, -this.f3796b.f3575a0);
                        o.b(fVar, fVar2, gVar.f3779g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof s.i) || dVar7.f3567T == null || dVar7.i(7).f3547f != null) {
                    return;
                }
                s.d dVar11 = this.f3796b;
                o.b(fVar2, dVar11.f3567T.f3581e.h, dVar11.s());
                o.b(fVar, fVar2, gVar.f3779g);
                s.d dVar12 = this.f3796b;
                if (dVar12.f3553E) {
                    o.b(fVar3, fVar2, dVar12.f3575a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            gVar.b(this);
        } else {
            s.d dVar13 = this.f3796b;
            int i2 = dVar13.f3603s;
            if (i2 == 2) {
                s.d dVar14 = dVar13.f3567T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f3581e.f3798e;
                    gVar.f3782l.add(gVar2);
                    gVar2.f3781k.add(gVar);
                    gVar.f3775b = true;
                    gVar.f3781k.add(fVar2);
                    gVar.f3781k.add(fVar);
                }
            } else if (i2 == 3 && !dVar13.y()) {
                s.d dVar15 = this.f3796b;
                if (dVar15.f3602r != 3) {
                    g gVar3 = dVar15.d.f3798e;
                    gVar.f3782l.add(gVar3);
                    gVar3.f3781k.add(gVar);
                    gVar.f3775b = true;
                    gVar.f3781k.add(fVar2);
                    gVar.f3781k.add(fVar);
                }
            }
        }
        s.d dVar16 = this.f3796b;
        s.c[] cVarArr2 = dVar16.f3564Q;
        s.c cVar5 = cVarArr2[2];
        s.c cVar6 = cVar5.f3547f;
        if (cVar6 != null && cVarArr2[3].f3547f != null) {
            if (dVar16.y()) {
                fVar2.f3778f = this.f3796b.f3564Q[2].e();
                fVar.f3778f = -this.f3796b.f3564Q[3].e();
            } else {
                f h6 = o.h(this.f3796b.f3564Q[2]);
                f h7 = o.h(this.f3796b.f3564Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3801j = 4;
            }
            if (this.f3796b.f3553E) {
                c(fVar3, fVar2, 1, this.f3789l);
            }
        } else if (cVar6 != null) {
            f h8 = o.h(cVar5);
            if (h8 != null) {
                o.b(fVar2, h8, this.f3796b.f3564Q[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f3796b.f3553E) {
                    c(fVar3, fVar2, 1, this.f3789l);
                }
                if (this.d == 3) {
                    s.d dVar17 = this.f3796b;
                    if (dVar17.f3570W > RecyclerView.f1530C0) {
                        k kVar = dVar17.d;
                        if (kVar.d == 3) {
                            kVar.f3798e.f3781k.add(gVar);
                            gVar.f3782l.add(this.f3796b.d.f3798e);
                            gVar.f3774a = this;
                        }
                    }
                }
            }
        } else {
            s.c cVar7 = cVarArr2[3];
            if (cVar7.f3547f != null) {
                f h9 = o.h(cVar7);
                if (h9 != null) {
                    o.b(fVar, h9, -this.f3796b.f3564Q[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f3796b.f3553E) {
                        c(fVar3, fVar2, 1, this.f3789l);
                    }
                }
            } else {
                s.c cVar8 = cVarArr2[4];
                if (cVar8.f3547f != null) {
                    f h10 = o.h(cVar8);
                    if (h10 != null) {
                        o.b(fVar3, h10, 0);
                        c(fVar2, fVar3, -1, this.f3789l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof s.i) && (dVar3 = dVar16.f3567T) != null) {
                    o.b(fVar2, dVar3.f3581e.h, dVar16.s());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f3796b.f3553E) {
                        c(fVar3, fVar2, 1, this.f3789l);
                    }
                    if (this.d == 3) {
                        s.d dVar18 = this.f3796b;
                        if (dVar18.f3570W > RecyclerView.f1530C0) {
                            k kVar2 = dVar18.d;
                            if (kVar2.d == 3) {
                                kVar2.f3798e.f3781k.add(gVar);
                                gVar.f3782l.add(this.f3796b.d.f3798e);
                                gVar.f3774a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f3782l.size() == 0) {
            gVar.f3776c = true;
        }
    }

    @Override // t.o
    public final void e() {
        f fVar = this.h;
        if (fVar.f3780j) {
            this.f3796b.f3573Z = fVar.f3779g;
        }
    }

    @Override // t.o
    public final void f() {
        this.f3797c = null;
        this.h.c();
        this.i.c();
        this.f3788k.c();
        this.f3798e.c();
        this.f3800g = false;
    }

    @Override // t.o
    public final boolean k() {
        return this.d != 3 || this.f3796b.f3603s == 0;
    }

    public final void m() {
        this.f3800g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f3780j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f3780j = false;
        f fVar3 = this.f3788k;
        fVar3.c();
        fVar3.f3780j = false;
        this.f3798e.f3780j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3796b.f3587h0;
    }
}
