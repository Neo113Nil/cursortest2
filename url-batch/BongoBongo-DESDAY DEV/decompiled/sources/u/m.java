package u;

import androidx.recyclerview.widget.RecyclerView;
import r.AbstractC0290e;

/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: k, reason: collision with root package name */
    public f f3936k;

    /* renamed from: l, reason: collision with root package name */
    public C0300a f3937l;

    @Override // u.InterfaceC0303d
    public final void a(InterfaceC0303d interfaceC0303d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0290e.a(this.f3950j) == 3) {
            t.d dVar = this.f3944b;
            l(dVar.f3759J, dVar.f3761L, 1);
            return;
        }
        g gVar = this.f3946e;
        if (gVar.f3923c && !gVar.f3928j && this.d == 3) {
            t.d dVar2 = this.f3944b;
            int i2 = dVar2.f3806s;
            if (i2 == 2) {
                t.d dVar3 = dVar2.f3769T;
                if (dVar3 != null) {
                    if (dVar3.f3783e.f3946e.f3928j) {
                        gVar.d((int) ((r5.f3926g * dVar2.f3813z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                g gVar2 = dVar2.d.f3946e;
                if (gVar2.f3928j) {
                    int i3 = dVar2.f3773X;
                    if (i3 == -1) {
                        f2 = gVar2.f3926g;
                        f3 = dVar2.f3772W;
                    } else if (i3 == 0) {
                        f4 = gVar2.f3926g * dVar2.f3772W;
                        i = (int) (f4 + 0.5f);
                        gVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f2 = gVar2.f3926g;
                        f3 = dVar2.f3772W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        f fVar = this.f3949h;
        if (fVar.f3923c) {
            f fVar2 = this.i;
            if (fVar2.f3923c) {
                if (fVar.f3928j && fVar2.f3928j && gVar.f3928j) {
                    return;
                }
                if (!gVar.f3928j && this.d == 3) {
                    t.d dVar4 = this.f3944b;
                    if (dVar4.f3805r == 0 && !dVar4.y()) {
                        f fVar3 = (f) fVar.f3930l.get(0);
                        f fVar4 = (f) fVar2.f3930l.get(0);
                        int i4 = fVar3.f3926g + fVar.f3925f;
                        int i5 = fVar4.f3926g + fVar2.f3925f;
                        fVar.d(i4);
                        fVar2.d(i5);
                        gVar.d(i5 - i4);
                        return;
                    }
                }
                if (!gVar.f3928j && this.d == 3 && this.f3943a == 1 && fVar.f3930l.size() > 0 && fVar2.f3930l.size() > 0) {
                    f fVar5 = (f) fVar.f3930l.get(0);
                    int i6 = (((f) fVar2.f3930l.get(0)).f3926g + fVar2.f3925f) - (fVar5.f3926g + fVar.f3925f);
                    int i7 = gVar.f3931m;
                    if (i6 < i7) {
                        gVar.d(i6);
                    } else {
                        gVar.d(i7);
                    }
                }
                if (gVar.f3928j && fVar.f3930l.size() > 0 && fVar2.f3930l.size() > 0) {
                    f fVar6 = (f) fVar.f3930l.get(0);
                    f fVar7 = (f) fVar2.f3930l.get(0);
                    int i8 = fVar6.f3926g;
                    int i9 = fVar.f3925f + i8;
                    int i10 = fVar7.f3926g;
                    int i11 = fVar2.f3925f + i10;
                    float f5 = this.f3944b.f3784e0;
                    if (fVar6 == fVar7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    fVar.d((int) ((((i10 - i8) - gVar.f3926g) * f5) + i8 + 0.5f));
                    fVar2.d(fVar.f3926g + gVar.f3926g);
                }
            }
        }
    }

    @Override // u.o
    public final void d() {
        t.d dVar;
        t.d dVar2;
        t.d dVar3;
        t.d dVar4;
        t.d dVar5 = this.f3944b;
        boolean z2 = dVar5.f3776a;
        g gVar = this.f3946e;
        if (z2) {
            gVar.d(dVar5.k());
        }
        boolean z3 = gVar.f3928j;
        f fVar = this.i;
        f fVar2 = this.f3949h;
        if (!z3) {
            t.d dVar6 = this.f3944b;
            this.d = dVar6.p0[1];
            if (dVar6.f3755E) {
                this.f3937l = new C0300a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f3944b.f3769T) != null && dVar4.p0[1] == 1) {
                    int k2 = (dVar4.k() - this.f3944b.f3759J.e()) - this.f3944b.f3761L.e();
                    o.b(fVar2, dVar4.f3783e.f3949h, this.f3944b.f3759J.e());
                    o.b(fVar, dVar4.f3783e.i, -this.f3944b.f3761L.e());
                    gVar.d(k2);
                    return;
                }
                if (i == 1) {
                    gVar.d(this.f3944b.k());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f3944b).f3769T) != null && dVar2.p0[1] == 1) {
            o.b(fVar2, dVar2.f3783e.f3949h, dVar.f3759J.e());
            o.b(fVar, dVar2.f3783e.i, -this.f3944b.f3761L.e());
            return;
        }
        boolean z4 = gVar.f3928j;
        f fVar3 = this.f3936k;
        if (z4) {
            t.d dVar7 = this.f3944b;
            if (dVar7.f3776a) {
                t.c[] cVarArr = dVar7.f3766Q;
                t.c cVar = cVarArr[2];
                t.c cVar2 = cVar.f3748f;
                if (cVar2 != null && cVarArr[3].f3748f != null) {
                    if (dVar7.y()) {
                        fVar2.f3925f = this.f3944b.f3766Q[2].e();
                        fVar.f3925f = -this.f3944b.f3766Q[3].e();
                    } else {
                        f h2 = o.h(this.f3944b.f3766Q[2]);
                        if (h2 != null) {
                            o.b(fVar2, h2, this.f3944b.f3766Q[2].e());
                        }
                        f h3 = o.h(this.f3944b.f3766Q[3]);
                        if (h3 != null) {
                            o.b(fVar, h3, -this.f3944b.f3766Q[3].e());
                        }
                        fVar2.f3922b = true;
                        fVar.f3922b = true;
                    }
                    t.d dVar8 = this.f3944b;
                    if (dVar8.f3755E) {
                        o.b(fVar3, fVar2, dVar8.f3777a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f h4 = o.h(cVar);
                    if (h4 != null) {
                        o.b(fVar2, h4, this.f3944b.f3766Q[2].e());
                        o.b(fVar, fVar2, gVar.f3926g);
                        t.d dVar9 = this.f3944b;
                        if (dVar9.f3755E) {
                            o.b(fVar3, fVar2, dVar9.f3777a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                t.c cVar3 = cVarArr[3];
                if (cVar3.f3748f != null) {
                    f h5 = o.h(cVar3);
                    if (h5 != null) {
                        o.b(fVar, h5, -this.f3944b.f3766Q[3].e());
                        o.b(fVar2, fVar, -gVar.f3926g);
                    }
                    t.d dVar10 = this.f3944b;
                    if (dVar10.f3755E) {
                        o.b(fVar3, fVar2, dVar10.f3777a0);
                        return;
                    }
                    return;
                }
                t.c cVar4 = cVarArr[4];
                if (cVar4.f3748f != null) {
                    f h6 = o.h(cVar4);
                    if (h6 != null) {
                        o.b(fVar3, h6, 0);
                        o.b(fVar2, fVar3, -this.f3944b.f3777a0);
                        o.b(fVar, fVar2, gVar.f3926g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof t.i) || dVar7.f3769T == null || dVar7.i(7).f3748f != null) {
                    return;
                }
                t.d dVar11 = this.f3944b;
                o.b(fVar2, dVar11.f3769T.f3783e.f3949h, dVar11.s());
                o.b(fVar, fVar2, gVar.f3926g);
                t.d dVar12 = this.f3944b;
                if (dVar12.f3755E) {
                    o.b(fVar3, fVar2, dVar12.f3777a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            gVar.b(this);
        } else {
            t.d dVar13 = this.f3944b;
            int i2 = dVar13.f3806s;
            if (i2 == 2) {
                t.d dVar14 = dVar13.f3769T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f3783e.f3946e;
                    gVar.f3930l.add(gVar2);
                    gVar2.f3929k.add(gVar);
                    gVar.f3922b = true;
                    gVar.f3929k.add(fVar2);
                    gVar.f3929k.add(fVar);
                }
            } else if (i2 == 3 && !dVar13.y()) {
                t.d dVar15 = this.f3944b;
                if (dVar15.f3805r != 3) {
                    g gVar3 = dVar15.d.f3946e;
                    gVar.f3930l.add(gVar3);
                    gVar3.f3929k.add(gVar);
                    gVar.f3922b = true;
                    gVar.f3929k.add(fVar2);
                    gVar.f3929k.add(fVar);
                }
            }
        }
        t.d dVar16 = this.f3944b;
        t.c[] cVarArr2 = dVar16.f3766Q;
        t.c cVar5 = cVarArr2[2];
        t.c cVar6 = cVar5.f3748f;
        if (cVar6 != null && cVarArr2[3].f3748f != null) {
            if (dVar16.y()) {
                fVar2.f3925f = this.f3944b.f3766Q[2].e();
                fVar.f3925f = -this.f3944b.f3766Q[3].e();
            } else {
                f h7 = o.h(this.f3944b.f3766Q[2]);
                f h8 = o.h(this.f3944b.f3766Q[3]);
                if (h7 != null) {
                    h7.b(this);
                }
                if (h8 != null) {
                    h8.b(this);
                }
                this.f3950j = 4;
            }
            if (this.f3944b.f3755E) {
                c(fVar3, fVar2, 1, this.f3937l);
            }
        } else if (cVar6 != null) {
            f h9 = o.h(cVar5);
            if (h9 != null) {
                o.b(fVar2, h9, this.f3944b.f3766Q[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f3944b.f3755E) {
                    c(fVar3, fVar2, 1, this.f3937l);
                }
                if (this.d == 3) {
                    t.d dVar17 = this.f3944b;
                    if (dVar17.f3772W > RecyclerView.A0) {
                        k kVar = dVar17.d;
                        if (kVar.d == 3) {
                            kVar.f3946e.f3929k.add(gVar);
                            gVar.f3930l.add(this.f3944b.d.f3946e);
                            gVar.f3921a = this;
                        }
                    }
                }
            }
        } else {
            t.c cVar7 = cVarArr2[3];
            if (cVar7.f3748f != null) {
                f h10 = o.h(cVar7);
                if (h10 != null) {
                    o.b(fVar, h10, -this.f3944b.f3766Q[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f3944b.f3755E) {
                        c(fVar3, fVar2, 1, this.f3937l);
                    }
                }
            } else {
                t.c cVar8 = cVarArr2[4];
                if (cVar8.f3748f != null) {
                    f h11 = o.h(cVar8);
                    if (h11 != null) {
                        o.b(fVar3, h11, 0);
                        c(fVar2, fVar3, -1, this.f3937l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof t.i) && (dVar3 = dVar16.f3769T) != null) {
                    o.b(fVar2, dVar3.f3783e.f3949h, dVar16.s());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f3944b.f3755E) {
                        c(fVar3, fVar2, 1, this.f3937l);
                    }
                    if (this.d == 3) {
                        t.d dVar18 = this.f3944b;
                        if (dVar18.f3772W > RecyclerView.A0) {
                            k kVar2 = dVar18.d;
                            if (kVar2.d == 3) {
                                kVar2.f3946e.f3929k.add(gVar);
                                gVar.f3930l.add(this.f3944b.d.f3946e);
                                gVar.f3921a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f3930l.size() == 0) {
            gVar.f3923c = true;
        }
    }

    @Override // u.o
    public final void e() {
        f fVar = this.f3949h;
        if (fVar.f3928j) {
            this.f3944b.f3775Z = fVar.f3926g;
        }
    }

    @Override // u.o
    public final void f() {
        this.f3945c = null;
        this.f3949h.c();
        this.i.c();
        this.f3936k.c();
        this.f3946e.c();
        this.f3948g = false;
    }

    @Override // u.o
    public final boolean k() {
        return this.d != 3 || this.f3944b.f3806s == 0;
    }

    public final void m() {
        this.f3948g = false;
        f fVar = this.f3949h;
        fVar.c();
        fVar.f3928j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f3928j = false;
        f fVar3 = this.f3936k;
        fVar3.c();
        fVar3.f3928j = false;
        this.f3946e.f3928j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3944b.f3790h0;
    }
}
