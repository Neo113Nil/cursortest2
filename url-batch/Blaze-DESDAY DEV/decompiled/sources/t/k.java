package t;

import java.util.ArrayList;
import q.AbstractC0290e;

/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3753k = new int[2];

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
    @Override // t.InterfaceC0301d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0301d interfaceC0301d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0290e.a(this.f3769j) == 3) {
            s.d dVar = this.f3764b;
            l(dVar.f3582I, dVar.f3584K, 0);
            return;
        }
        g gVar = this.f3766e;
        boolean z2 = gVar.f3748j;
        f fVar = this.h;
        f fVar2 = this.i;
        if (!z2 && this.d == 3) {
            s.d dVar2 = this.f3764b;
            int i2 = dVar2.f3629r;
            if (i2 == 2) {
                s.d dVar3 = dVar2.f3593T;
                if (dVar3 != null) {
                    if (dVar3.d.f3766e.f3748j) {
                        gVar.d((int) ((r3.f3747g * dVar2.f3634w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = dVar2.f3630s;
                if (i3 == 0 || i3 == 3) {
                    m mVar = dVar2.f3607e;
                    f fVar3 = mVar.h;
                    f fVar4 = mVar.i;
                    boolean z3 = dVar2.f3582I.f3573f != null;
                    boolean z4 = dVar2.f3583J.f3573f != null;
                    boolean z5 = dVar2.f3584K.f3573f != null;
                    boolean z6 = dVar2.f3585L.f3573f != null;
                    int i4 = dVar2.f3597X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = dVar2.f3596W;
                        boolean z7 = fVar3.f3748j;
                        int[] iArr = f3753k;
                        if (z7 && fVar4.f3748j) {
                            if (fVar.f3744c && fVar2.f3744c) {
                                m(iArr, ((f) fVar.f3750l.get(0)).f3747g + fVar.f3746f, ((f) fVar2.f3750l.get(0)).f3747g - fVar2.f3746f, fVar3.f3747g + fVar3.f3746f, fVar4.f3747g - fVar4.f3746f, f5, i4);
                                gVar.d(iArr[0]);
                                this.f3764b.f3607e.f3766e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = fVar.f3748j;
                        ArrayList arrayList = fVar3.f3750l;
                        if (z8 && fVar2.f3748j) {
                            if (!fVar3.f3744c || !fVar4.f3744c) {
                                return;
                            }
                            m(iArr, fVar.f3747g + fVar.f3746f, fVar2.f3747g - fVar2.f3746f, ((f) arrayList.get(0)).f3747g + fVar3.f3746f, ((f) fVar4.f3750l.get(0)).f3747g - fVar4.f3746f, f5, i4);
                            gVar.d(iArr[0]);
                            this.f3764b.f3607e.f3766e.d(iArr[1]);
                        }
                        if (!fVar.f3744c || !fVar2.f3744c || !fVar3.f3744c || !fVar4.f3744c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f3750l.get(0)).f3747g + fVar.f3746f, ((f) fVar2.f3750l.get(0)).f3747g - fVar2.f3746f, ((f) arrayList.get(0)).f3747g + fVar3.f3746f, ((f) fVar4.f3750l.get(0)).f3747g - fVar4.f3746f, f5, i4);
                        gVar.d(iArr[0]);
                        this.f3764b.f3607e.f3766e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!fVar.f3744c || !fVar2.f3744c) {
                            return;
                        }
                        float f6 = dVar2.f3596W;
                        int i5 = ((f) fVar.f3750l.get(0)).f3747g + fVar.f3746f;
                        int i6 = ((f) fVar2.f3750l.get(0)).f3747g - fVar2.f3746f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            gVar.d(g2);
                            this.f3764b.f3607e.f3766e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            gVar.d(g4);
                            this.f3764b.f3607e.f3766e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!fVar3.f3744c || !fVar4.f3744c) {
                            return;
                        }
                        float f7 = dVar2.f3596W;
                        int i9 = ((f) fVar3.f3750l.get(0)).f3747g + fVar3.f3746f;
                        int i10 = ((f) fVar4.f3750l.get(0)).f3747g - fVar4.f3746f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                gVar.d(g7);
                                this.f3764b.f3607e.f3766e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        gVar.d(g9);
                        this.f3764b.f3607e.f3766e.d(g8);
                    }
                } else {
                    int i13 = dVar2.f3597X;
                    if (i13 == -1) {
                        f2 = dVar2.f3607e.f3766e.f3747g;
                        f3 = dVar2.f3596W;
                    } else if (i13 == 0) {
                        f4 = dVar2.f3607e.f3766e.f3747g / dVar2.f3596W;
                        i = (int) (f4 + 0.5f);
                        gVar.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f2 = dVar2.f3607e.f3766e.f3747g;
                        f3 = dVar2.f3596W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        if (fVar.f3744c && fVar2.f3744c) {
            if (fVar.f3748j && fVar2.f3748j && gVar.f3748j) {
                return;
            }
            if (!gVar.f3748j && this.d == 3) {
                s.d dVar4 = this.f3764b;
                if (dVar4.f3629r == 0 && !dVar4.x()) {
                    f fVar5 = (f) fVar.f3750l.get(0);
                    f fVar6 = (f) fVar2.f3750l.get(0);
                    int i14 = fVar5.f3747g + fVar.f3746f;
                    int i15 = fVar6.f3747g + fVar2.f3746f;
                    fVar.d(i14);
                    fVar2.d(i15);
                    gVar.d(i15 - i14);
                    return;
                }
            }
            if (!gVar.f3748j && this.d == 3 && this.f3763a == 1 && fVar.f3750l.size() > 0 && fVar2.f3750l.size() > 0) {
                int min = Math.min((((f) fVar2.f3750l.get(0)).f3747g + fVar2.f3746f) - (((f) fVar.f3750l.get(0)).f3747g + fVar.f3746f), gVar.f3751m);
                s.d dVar5 = this.f3764b;
                int i16 = dVar5.f3633v;
                int max = Math.max(dVar5.f3632u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                gVar.d(max);
            }
            if (gVar.f3748j) {
                f fVar7 = (f) fVar.f3750l.get(0);
                f fVar8 = (f) fVar2.f3750l.get(0);
                int i17 = fVar7.f3747g;
                int i18 = fVar.f3746f + i17;
                int i19 = fVar8.f3747g;
                int i20 = fVar2.f3746f + i19;
                float f8 = this.f3764b.f3606d0;
                if (fVar7 == fVar8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                fVar.d((int) ((((i19 - i17) - gVar.f3747g) * f8) + i17 + 0.5f));
                fVar2.d(fVar.f3747g + gVar.f3747g);
            }
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar;
        s.d dVar2;
        int i;
        s.d dVar3;
        s.d dVar4;
        int i2;
        s.d dVar5 = this.f3764b;
        boolean z2 = dVar5.f3600a;
        g gVar = this.f3766e;
        if (z2) {
            gVar.d(dVar5.q());
        }
        boolean z3 = gVar.f3748j;
        f fVar = this.i;
        f fVar2 = this.h;
        if (!z3) {
            s.d dVar6 = this.f3764b;
            int i3 = dVar6.f3627p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (dVar4 = dVar6.f3593T) != null && ((i2 = dVar4.f3627p0[0]) == 1 || i2 == 4)) {
                    int q2 = (dVar4.q() - this.f3764b.f3582I.e()) - this.f3764b.f3584K.e();
                    o.b(fVar2, dVar4.d.h, this.f3764b.f3582I.e());
                    o.b(fVar, dVar4.d.i, -this.f3764b.f3584K.e());
                    gVar.d(q2);
                    return;
                }
                if (i3 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f3764b).f3593T) != null && ((i = dVar2.f3627p0[0]) == 1 || i == 4)) {
            o.b(fVar2, dVar2.d.h, dVar.f3582I.e());
            o.b(fVar, dVar2.d.i, -this.f3764b.f3584K.e());
            return;
        }
        if (gVar.f3748j) {
            s.d dVar7 = this.f3764b;
            if (dVar7.f3600a) {
                s.c[] cVarArr = dVar7.f3590Q;
                s.c cVar = cVarArr[0];
                s.c cVar2 = cVar.f3573f;
                if (cVar2 != null && cVarArr[1].f3573f != null) {
                    if (dVar7.x()) {
                        fVar2.f3746f = this.f3764b.f3590Q[0].e();
                        fVar.f3746f = -this.f3764b.f3590Q[1].e();
                        return;
                    }
                    f h = o.h(this.f3764b.f3590Q[0]);
                    if (h != null) {
                        o.b(fVar2, h, this.f3764b.f3590Q[0].e());
                    }
                    f h2 = o.h(this.f3764b.f3590Q[1]);
                    if (h2 != null) {
                        o.b(fVar, h2, -this.f3764b.f3590Q[1].e());
                    }
                    fVar2.f3743b = true;
                    fVar.f3743b = true;
                    return;
                }
                if (cVar2 != null) {
                    f h3 = o.h(cVar);
                    if (h3 != null) {
                        o.b(fVar2, h3, this.f3764b.f3590Q[0].e());
                        o.b(fVar, fVar2, gVar.f3747g);
                        return;
                    }
                    return;
                }
                s.c cVar3 = cVarArr[1];
                if (cVar3.f3573f != null) {
                    f h4 = o.h(cVar3);
                    if (h4 != null) {
                        o.b(fVar, h4, -this.f3764b.f3590Q[1].e());
                        o.b(fVar2, fVar, -gVar.f3747g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof s.i) || dVar7.f3593T == null || dVar7.i(7).f3573f != null) {
                    return;
                }
                s.d dVar8 = this.f3764b;
                o.b(fVar2, dVar8.f3593T.d.h, dVar8.r());
                o.b(fVar, fVar2, gVar.f3747g);
                return;
            }
        }
        if (this.d == 3) {
            s.d dVar9 = this.f3764b;
            int i4 = dVar9.f3629r;
            if (i4 == 2) {
                s.d dVar10 = dVar9.f3593T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f3607e.f3766e;
                    gVar.f3750l.add(gVar2);
                    gVar2.f3749k.add(gVar);
                    gVar.f3743b = true;
                    gVar.f3749k.add(fVar2);
                    gVar.f3749k.add(fVar);
                }
            } else if (i4 == 3) {
                if (dVar9.f3630s == 3) {
                    fVar2.f3742a = this;
                    fVar.f3742a = this;
                    m mVar = dVar9.f3607e;
                    mVar.h.f3742a = this;
                    mVar.i.f3742a = this;
                    gVar.f3742a = this;
                    if (dVar9.y()) {
                        gVar.f3750l.add(this.f3764b.f3607e.f3766e);
                        this.f3764b.f3607e.f3766e.f3749k.add(gVar);
                        m mVar2 = this.f3764b.f3607e;
                        mVar2.f3766e.f3742a = this;
                        gVar.f3750l.add(mVar2.h);
                        gVar.f3750l.add(this.f3764b.f3607e.i);
                        this.f3764b.f3607e.h.f3749k.add(gVar);
                        this.f3764b.f3607e.i.f3749k.add(gVar);
                    } else if (this.f3764b.x()) {
                        this.f3764b.f3607e.f3766e.f3750l.add(gVar);
                        gVar.f3749k.add(this.f3764b.f3607e.f3766e);
                    } else {
                        this.f3764b.f3607e.f3766e.f3750l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f3607e.f3766e;
                    gVar.f3750l.add(gVar3);
                    gVar3.f3749k.add(gVar);
                    this.f3764b.f3607e.h.f3749k.add(gVar);
                    this.f3764b.f3607e.i.f3749k.add(gVar);
                    gVar.f3743b = true;
                    gVar.f3749k.add(fVar2);
                    gVar.f3749k.add(fVar);
                    fVar2.f3750l.add(gVar);
                    fVar.f3750l.add(gVar);
                }
            }
        }
        s.d dVar11 = this.f3764b;
        s.c[] cVarArr2 = dVar11.f3590Q;
        s.c cVar4 = cVarArr2[0];
        s.c cVar5 = cVar4.f3573f;
        if (cVar5 != null && cVarArr2[1].f3573f != null) {
            if (dVar11.x()) {
                fVar2.f3746f = this.f3764b.f3590Q[0].e();
                fVar.f3746f = -this.f3764b.f3590Q[1].e();
                return;
            }
            f h5 = o.h(this.f3764b.f3590Q[0]);
            f h6 = o.h(this.f3764b.f3590Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3769j = 4;
            return;
        }
        if (cVar5 != null) {
            f h7 = o.h(cVar4);
            if (h7 != null) {
                o.b(fVar2, h7, this.f3764b.f3590Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        s.c cVar6 = cVarArr2[1];
        if (cVar6.f3573f != null) {
            f h8 = o.h(cVar6);
            if (h8 != null) {
                o.b(fVar, h8, -this.f3764b.f3590Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof s.i) || (dVar3 = dVar11.f3593T) == null) {
            return;
        }
        o.b(fVar2, dVar3.d.h, dVar11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // t.o
    public final void e() {
        f fVar = this.h;
        if (fVar.f3748j) {
            this.f3764b.f3598Y = fVar.f3747g;
        }
    }

    @Override // t.o
    public final void f() {
        this.f3765c = null;
        this.h.c();
        this.i.c();
        this.f3766e.c();
        this.f3768g = false;
    }

    @Override // t.o
    public final boolean k() {
        return this.d != 3 || this.f3764b.f3629r == 0;
    }

    public final void n() {
        this.f3768g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f3748j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f3748j = false;
        this.f3766e.f3748j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3764b.f3613h0;
    }
}
