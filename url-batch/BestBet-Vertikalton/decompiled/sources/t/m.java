package t;

import androidx.recyclerview.widget.RecyclerView;
import q.AbstractC0309e;

/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: k, reason: collision with root package name */
    public f f4103k;

    /* renamed from: l, reason: collision with root package name */
    public C0343a f4104l;

    @Override // t.InterfaceC0346d
    public final void a(InterfaceC0346d interfaceC0346d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0309e.a(this.f4116j) == 3) {
            s.d dVar = this.f4111b;
            l(dVar.f3877J, dVar.f3879L, 1);
            return;
        }
        g gVar = this.f4113e;
        if (gVar.f4091c && !gVar.f4095j && this.d == 3) {
            s.d dVar2 = this.f4111b;
            int i2 = dVar2.f3924s;
            if (i2 == 2) {
                s.d dVar3 = dVar2.f3887T;
                if (dVar3 != null) {
                    if (dVar3.f3901e.f4113e.f4095j) {
                        gVar.d((int) ((r5.f4094g * dVar2.f3931z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                g gVar2 = dVar2.d.f4113e;
                if (gVar2.f4095j) {
                    int i3 = dVar2.f3891X;
                    if (i3 == -1) {
                        f2 = gVar2.f4094g;
                        f3 = dVar2.f3890W;
                    } else if (i3 == 0) {
                        f4 = gVar2.f4094g * dVar2.f3890W;
                        i = (int) (f4 + 0.5f);
                        gVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f2 = gVar2.f4094g;
                        f3 = dVar2.f3890W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        f fVar = this.h;
        if (fVar.f4091c) {
            f fVar2 = this.i;
            if (fVar2.f4091c) {
                if (fVar.f4095j && fVar2.f4095j && gVar.f4095j) {
                    return;
                }
                if (!gVar.f4095j && this.d == 3) {
                    s.d dVar4 = this.f4111b;
                    if (dVar4.f3923r == 0 && !dVar4.y()) {
                        f fVar3 = (f) fVar.f4097l.get(0);
                        f fVar4 = (f) fVar2.f4097l.get(0);
                        int i4 = fVar3.f4094g + fVar.f4093f;
                        int i5 = fVar4.f4094g + fVar2.f4093f;
                        fVar.d(i4);
                        fVar2.d(i5);
                        gVar.d(i5 - i4);
                        return;
                    }
                }
                if (!gVar.f4095j && this.d == 3 && this.f4110a == 1 && fVar.f4097l.size() > 0 && fVar2.f4097l.size() > 0) {
                    f fVar5 = (f) fVar.f4097l.get(0);
                    int i6 = (((f) fVar2.f4097l.get(0)).f4094g + fVar2.f4093f) - (fVar5.f4094g + fVar.f4093f);
                    int i7 = gVar.f4098m;
                    if (i6 < i7) {
                        gVar.d(i6);
                    } else {
                        gVar.d(i7);
                    }
                }
                if (gVar.f4095j && fVar.f4097l.size() > 0 && fVar2.f4097l.size() > 0) {
                    f fVar6 = (f) fVar.f4097l.get(0);
                    f fVar7 = (f) fVar2.f4097l.get(0);
                    int i8 = fVar6.f4094g;
                    int i9 = fVar.f4093f + i8;
                    int i10 = fVar7.f4094g;
                    int i11 = fVar2.f4093f + i10;
                    float f5 = this.f4111b.f3902e0;
                    if (fVar6 == fVar7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    fVar.d((int) ((((i10 - i8) - gVar.f4094g) * f5) + i8 + 0.5f));
                    fVar2.d(fVar.f4094g + gVar.f4094g);
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
        s.d dVar5 = this.f4111b;
        boolean z2 = dVar5.f3894a;
        g gVar = this.f4113e;
        if (z2) {
            gVar.d(dVar5.k());
        }
        boolean z3 = gVar.f4095j;
        f fVar = this.i;
        f fVar2 = this.h;
        if (!z3) {
            s.d dVar6 = this.f4111b;
            this.d = dVar6.f3921p0[1];
            if (dVar6.f3873E) {
                this.f4104l = new C0343a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f4111b.f3887T) != null && dVar4.f3921p0[1] == 1) {
                    int k2 = (dVar4.k() - this.f4111b.f3877J.e()) - this.f4111b.f3879L.e();
                    o.b(fVar2, dVar4.f3901e.h, this.f4111b.f3877J.e());
                    o.b(fVar, dVar4.f3901e.i, -this.f4111b.f3879L.e());
                    gVar.d(k2);
                    return;
                }
                if (i == 1) {
                    gVar.d(this.f4111b.k());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f4111b).f3887T) != null && dVar2.f3921p0[1] == 1) {
            o.b(fVar2, dVar2.f3901e.h, dVar.f3877J.e());
            o.b(fVar, dVar2.f3901e.i, -this.f4111b.f3879L.e());
            return;
        }
        boolean z4 = gVar.f4095j;
        f fVar3 = this.f4103k;
        if (z4) {
            s.d dVar7 = this.f4111b;
            if (dVar7.f3894a) {
                s.c[] cVarArr = dVar7.f3884Q;
                s.c cVar = cVarArr[2];
                s.c cVar2 = cVar.f3867f;
                if (cVar2 != null && cVarArr[3].f3867f != null) {
                    if (dVar7.y()) {
                        fVar2.f4093f = this.f4111b.f3884Q[2].e();
                        fVar.f4093f = -this.f4111b.f3884Q[3].e();
                    } else {
                        f h = o.h(this.f4111b.f3884Q[2]);
                        if (h != null) {
                            o.b(fVar2, h, this.f4111b.f3884Q[2].e());
                        }
                        f h2 = o.h(this.f4111b.f3884Q[3]);
                        if (h2 != null) {
                            o.b(fVar, h2, -this.f4111b.f3884Q[3].e());
                        }
                        fVar2.f4090b = true;
                        fVar.f4090b = true;
                    }
                    s.d dVar8 = this.f4111b;
                    if (dVar8.f3873E) {
                        o.b(fVar3, fVar2, dVar8.f3895a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f h3 = o.h(cVar);
                    if (h3 != null) {
                        o.b(fVar2, h3, this.f4111b.f3884Q[2].e());
                        o.b(fVar, fVar2, gVar.f4094g);
                        s.d dVar9 = this.f4111b;
                        if (dVar9.f3873E) {
                            o.b(fVar3, fVar2, dVar9.f3895a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                s.c cVar3 = cVarArr[3];
                if (cVar3.f3867f != null) {
                    f h4 = o.h(cVar3);
                    if (h4 != null) {
                        o.b(fVar, h4, -this.f4111b.f3884Q[3].e());
                        o.b(fVar2, fVar, -gVar.f4094g);
                    }
                    s.d dVar10 = this.f4111b;
                    if (dVar10.f3873E) {
                        o.b(fVar3, fVar2, dVar10.f3895a0);
                        return;
                    }
                    return;
                }
                s.c cVar4 = cVarArr[4];
                if (cVar4.f3867f != null) {
                    f h5 = o.h(cVar4);
                    if (h5 != null) {
                        o.b(fVar3, h5, 0);
                        o.b(fVar2, fVar3, -this.f4111b.f3895a0);
                        o.b(fVar, fVar2, gVar.f4094g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof s.i) || dVar7.f3887T == null || dVar7.i(7).f3867f != null) {
                    return;
                }
                s.d dVar11 = this.f4111b;
                o.b(fVar2, dVar11.f3887T.f3901e.h, dVar11.s());
                o.b(fVar, fVar2, gVar.f4094g);
                s.d dVar12 = this.f4111b;
                if (dVar12.f3873E) {
                    o.b(fVar3, fVar2, dVar12.f3895a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            gVar.b(this);
        } else {
            s.d dVar13 = this.f4111b;
            int i2 = dVar13.f3924s;
            if (i2 == 2) {
                s.d dVar14 = dVar13.f3887T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f3901e.f4113e;
                    gVar.f4097l.add(gVar2);
                    gVar2.f4096k.add(gVar);
                    gVar.f4090b = true;
                    gVar.f4096k.add(fVar2);
                    gVar.f4096k.add(fVar);
                }
            } else if (i2 == 3 && !dVar13.y()) {
                s.d dVar15 = this.f4111b;
                if (dVar15.f3923r != 3) {
                    g gVar3 = dVar15.d.f4113e;
                    gVar.f4097l.add(gVar3);
                    gVar3.f4096k.add(gVar);
                    gVar.f4090b = true;
                    gVar.f4096k.add(fVar2);
                    gVar.f4096k.add(fVar);
                }
            }
        }
        s.d dVar16 = this.f4111b;
        s.c[] cVarArr2 = dVar16.f3884Q;
        s.c cVar5 = cVarArr2[2];
        s.c cVar6 = cVar5.f3867f;
        if (cVar6 != null && cVarArr2[3].f3867f != null) {
            if (dVar16.y()) {
                fVar2.f4093f = this.f4111b.f3884Q[2].e();
                fVar.f4093f = -this.f4111b.f3884Q[3].e();
            } else {
                f h6 = o.h(this.f4111b.f3884Q[2]);
                f h7 = o.h(this.f4111b.f3884Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f4116j = 4;
            }
            if (this.f4111b.f3873E) {
                c(fVar3, fVar2, 1, this.f4104l);
            }
        } else if (cVar6 != null) {
            f h8 = o.h(cVar5);
            if (h8 != null) {
                o.b(fVar2, h8, this.f4111b.f3884Q[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f4111b.f3873E) {
                    c(fVar3, fVar2, 1, this.f4104l);
                }
                if (this.d == 3) {
                    s.d dVar17 = this.f4111b;
                    if (dVar17.f3890W > RecyclerView.f1937A0) {
                        k kVar = dVar17.d;
                        if (kVar.d == 3) {
                            kVar.f4113e.f4096k.add(gVar);
                            gVar.f4097l.add(this.f4111b.d.f4113e);
                            gVar.f4089a = this;
                        }
                    }
                }
            }
        } else {
            s.c cVar7 = cVarArr2[3];
            if (cVar7.f3867f != null) {
                f h9 = o.h(cVar7);
                if (h9 != null) {
                    o.b(fVar, h9, -this.f4111b.f3884Q[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f4111b.f3873E) {
                        c(fVar3, fVar2, 1, this.f4104l);
                    }
                }
            } else {
                s.c cVar8 = cVarArr2[4];
                if (cVar8.f3867f != null) {
                    f h10 = o.h(cVar8);
                    if (h10 != null) {
                        o.b(fVar3, h10, 0);
                        c(fVar2, fVar3, -1, this.f4104l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof s.i) && (dVar3 = dVar16.f3887T) != null) {
                    o.b(fVar2, dVar3.f3901e.h, dVar16.s());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f4111b.f3873E) {
                        c(fVar3, fVar2, 1, this.f4104l);
                    }
                    if (this.d == 3) {
                        s.d dVar18 = this.f4111b;
                        if (dVar18.f3890W > RecyclerView.f1937A0) {
                            k kVar2 = dVar18.d;
                            if (kVar2.d == 3) {
                                kVar2.f4113e.f4096k.add(gVar);
                                gVar.f4097l.add(this.f4111b.d.f4113e);
                                gVar.f4089a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f4097l.size() == 0) {
            gVar.f4091c = true;
        }
    }

    @Override // t.o
    public final void e() {
        f fVar = this.h;
        if (fVar.f4095j) {
            this.f4111b.f3893Z = fVar.f4094g;
        }
    }

    @Override // t.o
    public final void f() {
        this.f4112c = null;
        this.h.c();
        this.i.c();
        this.f4103k.c();
        this.f4113e.c();
        this.f4115g = false;
    }

    @Override // t.o
    public final boolean k() {
        return this.d != 3 || this.f4111b.f3924s == 0;
    }

    public final void m() {
        this.f4115g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f4095j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f4095j = false;
        f fVar3 = this.f4103k;
        fVar3.c();
        fVar3.f4095j = false;
        this.f4113e.f4095j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4111b.f3907h0;
    }
}
