package u;

import java.util.ArrayList;
import r.AbstractC0290e;

/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3933k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f2) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f2) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f2) + 0.5f);
        int i9 = (int) ((i6 / f2) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // u.InterfaceC0303d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0303d interfaceC0303d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0290e.a(this.f3950j) == 3) {
            t.d dVar = this.f3944b;
            l(dVar.f3758I, dVar.f3760K, 0);
            return;
        }
        g gVar = this.f3946e;
        boolean z2 = gVar.f3928j;
        f fVar = this.f3949h;
        f fVar2 = this.i;
        if (!z2 && this.d == 3) {
            t.d dVar2 = this.f3944b;
            int i2 = dVar2.f3805r;
            if (i2 == 2) {
                t.d dVar3 = dVar2.f3769T;
                if (dVar3 != null) {
                    if (dVar3.d.f3946e.f3928j) {
                        gVar.d((int) ((r3.f3926g * dVar2.f3810w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = dVar2.f3806s;
                if (i3 == 0 || i3 == 3) {
                    m mVar = dVar2.f3783e;
                    f fVar3 = mVar.f3949h;
                    f fVar4 = mVar.i;
                    boolean z3 = dVar2.f3758I.f3748f != null;
                    boolean z4 = dVar2.f3759J.f3748f != null;
                    boolean z5 = dVar2.f3760K.f3748f != null;
                    boolean z6 = dVar2.f3761L.f3748f != null;
                    int i4 = dVar2.f3773X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = dVar2.f3772W;
                        boolean z7 = fVar3.f3928j;
                        int[] iArr = f3933k;
                        if (z7 && fVar4.f3928j) {
                            if (fVar.f3923c && fVar2.f3923c) {
                                m(iArr, ((f) fVar.f3930l.get(0)).f3926g + fVar.f3925f, ((f) fVar2.f3930l.get(0)).f3926g - fVar2.f3925f, fVar3.f3926g + fVar3.f3925f, fVar4.f3926g - fVar4.f3925f, f5, i4);
                                gVar.d(iArr[0]);
                                this.f3944b.f3783e.f3946e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = fVar.f3928j;
                        ArrayList arrayList = fVar3.f3930l;
                        if (z8 && fVar2.f3928j) {
                            if (!fVar3.f3923c || !fVar4.f3923c) {
                                return;
                            }
                            m(iArr, fVar.f3926g + fVar.f3925f, fVar2.f3926g - fVar2.f3925f, ((f) arrayList.get(0)).f3926g + fVar3.f3925f, ((f) fVar4.f3930l.get(0)).f3926g - fVar4.f3925f, f5, i4);
                            gVar.d(iArr[0]);
                            this.f3944b.f3783e.f3946e.d(iArr[1]);
                        }
                        if (!fVar.f3923c || !fVar2.f3923c || !fVar3.f3923c || !fVar4.f3923c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f3930l.get(0)).f3926g + fVar.f3925f, ((f) fVar2.f3930l.get(0)).f3926g - fVar2.f3925f, ((f) arrayList.get(0)).f3926g + fVar3.f3925f, ((f) fVar4.f3930l.get(0)).f3926g - fVar4.f3925f, f5, i4);
                        gVar.d(iArr[0]);
                        this.f3944b.f3783e.f3946e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!fVar.f3923c || !fVar2.f3923c) {
                            return;
                        }
                        float f6 = dVar2.f3772W;
                        int i5 = ((f) fVar.f3930l.get(0)).f3926g + fVar.f3925f;
                        int i6 = ((f) fVar2.f3930l.get(0)).f3926g - fVar2.f3925f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            gVar.d(g2);
                            this.f3944b.f3783e.f3946e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            gVar.d(g4);
                            this.f3944b.f3783e.f3946e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!fVar3.f3923c || !fVar4.f3923c) {
                            return;
                        }
                        float f7 = dVar2.f3772W;
                        int i9 = ((f) fVar3.f3930l.get(0)).f3926g + fVar3.f3925f;
                        int i10 = ((f) fVar4.f3930l.get(0)).f3926g - fVar4.f3925f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                gVar.d(g7);
                                this.f3944b.f3783e.f3946e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        gVar.d(g9);
                        this.f3944b.f3783e.f3946e.d(g8);
                    }
                } else {
                    int i13 = dVar2.f3773X;
                    if (i13 == -1) {
                        f2 = dVar2.f3783e.f3946e.f3926g;
                        f3 = dVar2.f3772W;
                    } else if (i13 == 0) {
                        f4 = dVar2.f3783e.f3946e.f3926g / dVar2.f3772W;
                        i = (int) (f4 + 0.5f);
                        gVar.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f2 = dVar2.f3783e.f3946e.f3926g;
                        f3 = dVar2.f3772W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        if (fVar.f3923c && fVar2.f3923c) {
            if (fVar.f3928j && fVar2.f3928j && gVar.f3928j) {
                return;
            }
            if (!gVar.f3928j && this.d == 3) {
                t.d dVar4 = this.f3944b;
                if (dVar4.f3805r == 0 && !dVar4.x()) {
                    f fVar5 = (f) fVar.f3930l.get(0);
                    f fVar6 = (f) fVar2.f3930l.get(0);
                    int i14 = fVar5.f3926g + fVar.f3925f;
                    int i15 = fVar6.f3926g + fVar2.f3925f;
                    fVar.d(i14);
                    fVar2.d(i15);
                    gVar.d(i15 - i14);
                    return;
                }
            }
            if (!gVar.f3928j && this.d == 3 && this.f3943a == 1 && fVar.f3930l.size() > 0 && fVar2.f3930l.size() > 0) {
                int min = Math.min((((f) fVar2.f3930l.get(0)).f3926g + fVar2.f3925f) - (((f) fVar.f3930l.get(0)).f3926g + fVar.f3925f), gVar.f3931m);
                t.d dVar5 = this.f3944b;
                int i16 = dVar5.f3809v;
                int max = Math.max(dVar5.f3808u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                gVar.d(max);
            }
            if (gVar.f3928j) {
                f fVar7 = (f) fVar.f3930l.get(0);
                f fVar8 = (f) fVar2.f3930l.get(0);
                int i17 = fVar7.f3926g;
                int i18 = fVar.f3925f + i17;
                int i19 = fVar8.f3926g;
                int i20 = fVar2.f3925f + i19;
                float f8 = this.f3944b.f3782d0;
                if (fVar7 == fVar8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                fVar.d((int) ((((i19 - i17) - gVar.f3926g) * f8) + i17 + 0.5f));
                fVar2.d(fVar.f3926g + gVar.f3926g);
            }
        }
    }

    @Override // u.o
    public final void d() {
        t.d dVar;
        t.d dVar2;
        int i;
        t.d dVar3;
        t.d dVar4;
        int i2;
        t.d dVar5 = this.f3944b;
        boolean z2 = dVar5.f3776a;
        g gVar = this.f3946e;
        if (z2) {
            gVar.d(dVar5.q());
        }
        boolean z3 = gVar.f3928j;
        f fVar = this.i;
        f fVar2 = this.f3949h;
        if (!z3) {
            t.d dVar6 = this.f3944b;
            int i3 = dVar6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (dVar4 = dVar6.f3769T) != null && ((i2 = dVar4.p0[0]) == 1 || i2 == 4)) {
                    int q2 = (dVar4.q() - this.f3944b.f3758I.e()) - this.f3944b.f3760K.e();
                    o.b(fVar2, dVar4.d.f3949h, this.f3944b.f3758I.e());
                    o.b(fVar, dVar4.d.i, -this.f3944b.f3760K.e());
                    gVar.d(q2);
                    return;
                }
                if (i3 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f3944b).f3769T) != null && ((i = dVar2.p0[0]) == 1 || i == 4)) {
            o.b(fVar2, dVar2.d.f3949h, dVar.f3758I.e());
            o.b(fVar, dVar2.d.i, -this.f3944b.f3760K.e());
            return;
        }
        if (gVar.f3928j) {
            t.d dVar7 = this.f3944b;
            if (dVar7.f3776a) {
                t.c[] cVarArr = dVar7.f3766Q;
                t.c cVar = cVarArr[0];
                t.c cVar2 = cVar.f3748f;
                if (cVar2 != null && cVarArr[1].f3748f != null) {
                    if (dVar7.x()) {
                        fVar2.f3925f = this.f3944b.f3766Q[0].e();
                        fVar.f3925f = -this.f3944b.f3766Q[1].e();
                        return;
                    }
                    f h2 = o.h(this.f3944b.f3766Q[0]);
                    if (h2 != null) {
                        o.b(fVar2, h2, this.f3944b.f3766Q[0].e());
                    }
                    f h3 = o.h(this.f3944b.f3766Q[1]);
                    if (h3 != null) {
                        o.b(fVar, h3, -this.f3944b.f3766Q[1].e());
                    }
                    fVar2.f3922b = true;
                    fVar.f3922b = true;
                    return;
                }
                if (cVar2 != null) {
                    f h4 = o.h(cVar);
                    if (h4 != null) {
                        o.b(fVar2, h4, this.f3944b.f3766Q[0].e());
                        o.b(fVar, fVar2, gVar.f3926g);
                        return;
                    }
                    return;
                }
                t.c cVar3 = cVarArr[1];
                if (cVar3.f3748f != null) {
                    f h5 = o.h(cVar3);
                    if (h5 != null) {
                        o.b(fVar, h5, -this.f3944b.f3766Q[1].e());
                        o.b(fVar2, fVar, -gVar.f3926g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof t.i) || dVar7.f3769T == null || dVar7.i(7).f3748f != null) {
                    return;
                }
                t.d dVar8 = this.f3944b;
                o.b(fVar2, dVar8.f3769T.d.f3949h, dVar8.r());
                o.b(fVar, fVar2, gVar.f3926g);
                return;
            }
        }
        if (this.d == 3) {
            t.d dVar9 = this.f3944b;
            int i4 = dVar9.f3805r;
            if (i4 == 2) {
                t.d dVar10 = dVar9.f3769T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f3783e.f3946e;
                    gVar.f3930l.add(gVar2);
                    gVar2.f3929k.add(gVar);
                    gVar.f3922b = true;
                    gVar.f3929k.add(fVar2);
                    gVar.f3929k.add(fVar);
                }
            } else if (i4 == 3) {
                if (dVar9.f3806s == 3) {
                    fVar2.f3921a = this;
                    fVar.f3921a = this;
                    m mVar = dVar9.f3783e;
                    mVar.f3949h.f3921a = this;
                    mVar.i.f3921a = this;
                    gVar.f3921a = this;
                    if (dVar9.y()) {
                        gVar.f3930l.add(this.f3944b.f3783e.f3946e);
                        this.f3944b.f3783e.f3946e.f3929k.add(gVar);
                        m mVar2 = this.f3944b.f3783e;
                        mVar2.f3946e.f3921a = this;
                        gVar.f3930l.add(mVar2.f3949h);
                        gVar.f3930l.add(this.f3944b.f3783e.i);
                        this.f3944b.f3783e.f3949h.f3929k.add(gVar);
                        this.f3944b.f3783e.i.f3929k.add(gVar);
                    } else if (this.f3944b.x()) {
                        this.f3944b.f3783e.f3946e.f3930l.add(gVar);
                        gVar.f3929k.add(this.f3944b.f3783e.f3946e);
                    } else {
                        this.f3944b.f3783e.f3946e.f3930l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f3783e.f3946e;
                    gVar.f3930l.add(gVar3);
                    gVar3.f3929k.add(gVar);
                    this.f3944b.f3783e.f3949h.f3929k.add(gVar);
                    this.f3944b.f3783e.i.f3929k.add(gVar);
                    gVar.f3922b = true;
                    gVar.f3929k.add(fVar2);
                    gVar.f3929k.add(fVar);
                    fVar2.f3930l.add(gVar);
                    fVar.f3930l.add(gVar);
                }
            }
        }
        t.d dVar11 = this.f3944b;
        t.c[] cVarArr2 = dVar11.f3766Q;
        t.c cVar4 = cVarArr2[0];
        t.c cVar5 = cVar4.f3748f;
        if (cVar5 != null && cVarArr2[1].f3748f != null) {
            if (dVar11.x()) {
                fVar2.f3925f = this.f3944b.f3766Q[0].e();
                fVar.f3925f = -this.f3944b.f3766Q[1].e();
                return;
            }
            f h6 = o.h(this.f3944b.f3766Q[0]);
            f h7 = o.h(this.f3944b.f3766Q[1]);
            if (h6 != null) {
                h6.b(this);
            }
            if (h7 != null) {
                h7.b(this);
            }
            this.f3950j = 4;
            return;
        }
        if (cVar5 != null) {
            f h8 = o.h(cVar4);
            if (h8 != null) {
                o.b(fVar2, h8, this.f3944b.f3766Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        t.c cVar6 = cVarArr2[1];
        if (cVar6.f3748f != null) {
            f h9 = o.h(cVar6);
            if (h9 != null) {
                o.b(fVar, h9, -this.f3944b.f3766Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof t.i) || (dVar3 = dVar11.f3769T) == null) {
            return;
        }
        o.b(fVar2, dVar3.d.f3949h, dVar11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // u.o
    public final void e() {
        f fVar = this.f3949h;
        if (fVar.f3928j) {
            this.f3944b.f3774Y = fVar.f3926g;
        }
    }

    @Override // u.o
    public final void f() {
        this.f3945c = null;
        this.f3949h.c();
        this.i.c();
        this.f3946e.c();
        this.f3948g = false;
    }

    @Override // u.o
    public final boolean k() {
        return this.d != 3 || this.f3944b.f3805r == 0;
    }

    public final void n() {
        this.f3948g = false;
        f fVar = this.f3949h;
        fVar.c();
        fVar.f3928j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f3928j = false;
        this.f3946e.f3928j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3944b.f3790h0;
    }
}
