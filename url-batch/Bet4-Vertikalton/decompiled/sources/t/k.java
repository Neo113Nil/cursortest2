package t;

import java.util.ArrayList;
import q.AbstractC0287e;

/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3785k = new int[2];

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
    @Override // t.InterfaceC0300d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0300d interfaceC0300d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0287e.a(this.f3801j) == 3) {
            s.d dVar = this.f3796b;
            l(dVar.f3556I, dVar.f3558K, 0);
            return;
        }
        g gVar = this.f3798e;
        boolean z2 = gVar.f3780j;
        f fVar = this.h;
        f fVar2 = this.i;
        if (!z2 && this.d == 3) {
            s.d dVar2 = this.f3796b;
            int i2 = dVar2.f3602r;
            if (i2 == 2) {
                s.d dVar3 = dVar2.f3567T;
                if (dVar3 != null) {
                    if (dVar3.d.f3798e.f3780j) {
                        gVar.d((int) ((r3.f3779g * dVar2.f3607w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = dVar2.f3603s;
                if (i3 == 0 || i3 == 3) {
                    m mVar = dVar2.f3581e;
                    f fVar3 = mVar.h;
                    f fVar4 = mVar.i;
                    boolean z3 = dVar2.f3556I.f3547f != null;
                    boolean z4 = dVar2.f3557J.f3547f != null;
                    boolean z5 = dVar2.f3558K.f3547f != null;
                    boolean z6 = dVar2.f3559L.f3547f != null;
                    int i4 = dVar2.f3571X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = dVar2.f3570W;
                        boolean z7 = fVar3.f3780j;
                        int[] iArr = f3785k;
                        if (z7 && fVar4.f3780j) {
                            if (fVar.f3776c && fVar2.f3776c) {
                                m(iArr, ((f) fVar.f3782l.get(0)).f3779g + fVar.f3778f, ((f) fVar2.f3782l.get(0)).f3779g - fVar2.f3778f, fVar3.f3779g + fVar3.f3778f, fVar4.f3779g - fVar4.f3778f, f5, i4);
                                gVar.d(iArr[0]);
                                this.f3796b.f3581e.f3798e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = fVar.f3780j;
                        ArrayList arrayList = fVar3.f3782l;
                        if (z8 && fVar2.f3780j) {
                            if (!fVar3.f3776c || !fVar4.f3776c) {
                                return;
                            }
                            m(iArr, fVar.f3779g + fVar.f3778f, fVar2.f3779g - fVar2.f3778f, ((f) arrayList.get(0)).f3779g + fVar3.f3778f, ((f) fVar4.f3782l.get(0)).f3779g - fVar4.f3778f, f5, i4);
                            gVar.d(iArr[0]);
                            this.f3796b.f3581e.f3798e.d(iArr[1]);
                        }
                        if (!fVar.f3776c || !fVar2.f3776c || !fVar3.f3776c || !fVar4.f3776c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f3782l.get(0)).f3779g + fVar.f3778f, ((f) fVar2.f3782l.get(0)).f3779g - fVar2.f3778f, ((f) arrayList.get(0)).f3779g + fVar3.f3778f, ((f) fVar4.f3782l.get(0)).f3779g - fVar4.f3778f, f5, i4);
                        gVar.d(iArr[0]);
                        this.f3796b.f3581e.f3798e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!fVar.f3776c || !fVar2.f3776c) {
                            return;
                        }
                        float f6 = dVar2.f3570W;
                        int i5 = ((f) fVar.f3782l.get(0)).f3779g + fVar.f3778f;
                        int i6 = ((f) fVar2.f3782l.get(0)).f3779g - fVar2.f3778f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            gVar.d(g2);
                            this.f3796b.f3581e.f3798e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            gVar.d(g4);
                            this.f3796b.f3581e.f3798e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!fVar3.f3776c || !fVar4.f3776c) {
                            return;
                        }
                        float f7 = dVar2.f3570W;
                        int i9 = ((f) fVar3.f3782l.get(0)).f3779g + fVar3.f3778f;
                        int i10 = ((f) fVar4.f3782l.get(0)).f3779g - fVar4.f3778f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                gVar.d(g7);
                                this.f3796b.f3581e.f3798e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        gVar.d(g9);
                        this.f3796b.f3581e.f3798e.d(g8);
                    }
                } else {
                    int i13 = dVar2.f3571X;
                    if (i13 == -1) {
                        f2 = dVar2.f3581e.f3798e.f3779g;
                        f3 = dVar2.f3570W;
                    } else if (i13 == 0) {
                        f4 = dVar2.f3581e.f3798e.f3779g / dVar2.f3570W;
                        i = (int) (f4 + 0.5f);
                        gVar.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        gVar.d(i);
                    } else {
                        f2 = dVar2.f3581e.f3798e.f3779g;
                        f3 = dVar2.f3570W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        if (fVar.f3776c && fVar2.f3776c) {
            if (fVar.f3780j && fVar2.f3780j && gVar.f3780j) {
                return;
            }
            if (!gVar.f3780j && this.d == 3) {
                s.d dVar4 = this.f3796b;
                if (dVar4.f3602r == 0 && !dVar4.x()) {
                    f fVar5 = (f) fVar.f3782l.get(0);
                    f fVar6 = (f) fVar2.f3782l.get(0);
                    int i14 = fVar5.f3779g + fVar.f3778f;
                    int i15 = fVar6.f3779g + fVar2.f3778f;
                    fVar.d(i14);
                    fVar2.d(i15);
                    gVar.d(i15 - i14);
                    return;
                }
            }
            if (!gVar.f3780j && this.d == 3 && this.f3795a == 1 && fVar.f3782l.size() > 0 && fVar2.f3782l.size() > 0) {
                int min = Math.min((((f) fVar2.f3782l.get(0)).f3779g + fVar2.f3778f) - (((f) fVar.f3782l.get(0)).f3779g + fVar.f3778f), gVar.f3783m);
                s.d dVar5 = this.f3796b;
                int i16 = dVar5.f3606v;
                int max = Math.max(dVar5.f3605u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                gVar.d(max);
            }
            if (gVar.f3780j) {
                f fVar7 = (f) fVar.f3782l.get(0);
                f fVar8 = (f) fVar2.f3782l.get(0);
                int i17 = fVar7.f3779g;
                int i18 = fVar.f3778f + i17;
                int i19 = fVar8.f3779g;
                int i20 = fVar2.f3778f + i19;
                float f8 = this.f3796b.f3580d0;
                if (fVar7 == fVar8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                fVar.d((int) ((((i19 - i17) - gVar.f3779g) * f8) + i17 + 0.5f));
                fVar2.d(fVar.f3779g + gVar.f3779g);
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
        s.d dVar5 = this.f3796b;
        boolean z2 = dVar5.f3574a;
        g gVar = this.f3798e;
        if (z2) {
            gVar.d(dVar5.q());
        }
        boolean z3 = gVar.f3780j;
        f fVar = this.i;
        f fVar2 = this.h;
        if (!z3) {
            s.d dVar6 = this.f3796b;
            int i3 = dVar6.f3600p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (dVar4 = dVar6.f3567T) != null && ((i2 = dVar4.f3600p0[0]) == 1 || i2 == 4)) {
                    int q2 = (dVar4.q() - this.f3796b.f3556I.e()) - this.f3796b.f3558K.e();
                    o.b(fVar2, dVar4.d.h, this.f3796b.f3556I.e());
                    o.b(fVar, dVar4.d.i, -this.f3796b.f3558K.e());
                    gVar.d(q2);
                    return;
                }
                if (i3 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.f3796b).f3567T) != null && ((i = dVar2.f3600p0[0]) == 1 || i == 4)) {
            o.b(fVar2, dVar2.d.h, dVar.f3556I.e());
            o.b(fVar, dVar2.d.i, -this.f3796b.f3558K.e());
            return;
        }
        if (gVar.f3780j) {
            s.d dVar7 = this.f3796b;
            if (dVar7.f3574a) {
                s.c[] cVarArr = dVar7.f3564Q;
                s.c cVar = cVarArr[0];
                s.c cVar2 = cVar.f3547f;
                if (cVar2 != null && cVarArr[1].f3547f != null) {
                    if (dVar7.x()) {
                        fVar2.f3778f = this.f3796b.f3564Q[0].e();
                        fVar.f3778f = -this.f3796b.f3564Q[1].e();
                        return;
                    }
                    f h = o.h(this.f3796b.f3564Q[0]);
                    if (h != null) {
                        o.b(fVar2, h, this.f3796b.f3564Q[0].e());
                    }
                    f h2 = o.h(this.f3796b.f3564Q[1]);
                    if (h2 != null) {
                        o.b(fVar, h2, -this.f3796b.f3564Q[1].e());
                    }
                    fVar2.f3775b = true;
                    fVar.f3775b = true;
                    return;
                }
                if (cVar2 != null) {
                    f h3 = o.h(cVar);
                    if (h3 != null) {
                        o.b(fVar2, h3, this.f3796b.f3564Q[0].e());
                        o.b(fVar, fVar2, gVar.f3779g);
                        return;
                    }
                    return;
                }
                s.c cVar3 = cVarArr[1];
                if (cVar3.f3547f != null) {
                    f h4 = o.h(cVar3);
                    if (h4 != null) {
                        o.b(fVar, h4, -this.f3796b.f3564Q[1].e());
                        o.b(fVar2, fVar, -gVar.f3779g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof s.i) || dVar7.f3567T == null || dVar7.i(7).f3547f != null) {
                    return;
                }
                s.d dVar8 = this.f3796b;
                o.b(fVar2, dVar8.f3567T.d.h, dVar8.r());
                o.b(fVar, fVar2, gVar.f3779g);
                return;
            }
        }
        if (this.d == 3) {
            s.d dVar9 = this.f3796b;
            int i4 = dVar9.f3602r;
            if (i4 == 2) {
                s.d dVar10 = dVar9.f3567T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f3581e.f3798e;
                    gVar.f3782l.add(gVar2);
                    gVar2.f3781k.add(gVar);
                    gVar.f3775b = true;
                    gVar.f3781k.add(fVar2);
                    gVar.f3781k.add(fVar);
                }
            } else if (i4 == 3) {
                if (dVar9.f3603s == 3) {
                    fVar2.f3774a = this;
                    fVar.f3774a = this;
                    m mVar = dVar9.f3581e;
                    mVar.h.f3774a = this;
                    mVar.i.f3774a = this;
                    gVar.f3774a = this;
                    if (dVar9.y()) {
                        gVar.f3782l.add(this.f3796b.f3581e.f3798e);
                        this.f3796b.f3581e.f3798e.f3781k.add(gVar);
                        m mVar2 = this.f3796b.f3581e;
                        mVar2.f3798e.f3774a = this;
                        gVar.f3782l.add(mVar2.h);
                        gVar.f3782l.add(this.f3796b.f3581e.i);
                        this.f3796b.f3581e.h.f3781k.add(gVar);
                        this.f3796b.f3581e.i.f3781k.add(gVar);
                    } else if (this.f3796b.x()) {
                        this.f3796b.f3581e.f3798e.f3782l.add(gVar);
                        gVar.f3781k.add(this.f3796b.f3581e.f3798e);
                    } else {
                        this.f3796b.f3581e.f3798e.f3782l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f3581e.f3798e;
                    gVar.f3782l.add(gVar3);
                    gVar3.f3781k.add(gVar);
                    this.f3796b.f3581e.h.f3781k.add(gVar);
                    this.f3796b.f3581e.i.f3781k.add(gVar);
                    gVar.f3775b = true;
                    gVar.f3781k.add(fVar2);
                    gVar.f3781k.add(fVar);
                    fVar2.f3782l.add(gVar);
                    fVar.f3782l.add(gVar);
                }
            }
        }
        s.d dVar11 = this.f3796b;
        s.c[] cVarArr2 = dVar11.f3564Q;
        s.c cVar4 = cVarArr2[0];
        s.c cVar5 = cVar4.f3547f;
        if (cVar5 != null && cVarArr2[1].f3547f != null) {
            if (dVar11.x()) {
                fVar2.f3778f = this.f3796b.f3564Q[0].e();
                fVar.f3778f = -this.f3796b.f3564Q[1].e();
                return;
            }
            f h5 = o.h(this.f3796b.f3564Q[0]);
            f h6 = o.h(this.f3796b.f3564Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3801j = 4;
            return;
        }
        if (cVar5 != null) {
            f h7 = o.h(cVar4);
            if (h7 != null) {
                o.b(fVar2, h7, this.f3796b.f3564Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        s.c cVar6 = cVarArr2[1];
        if (cVar6.f3547f != null) {
            f h8 = o.h(cVar6);
            if (h8 != null) {
                o.b(fVar, h8, -this.f3796b.f3564Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof s.i) || (dVar3 = dVar11.f3567T) == null) {
            return;
        }
        o.b(fVar2, dVar3.d.h, dVar11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // t.o
    public final void e() {
        f fVar = this.h;
        if (fVar.f3780j) {
            this.f3796b.f3572Y = fVar.f3779g;
        }
    }

    @Override // t.o
    public final void f() {
        this.f3797c = null;
        this.h.c();
        this.i.c();
        this.f3798e.c();
        this.f3800g = false;
    }

    @Override // t.o
    public final boolean k() {
        return this.d != 3 || this.f3796b.f3602r == 0;
    }

    public final void n() {
        this.f3800g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f3780j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f3780j = false;
        this.f3798e.f3780j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3796b.f3587h0;
    }
}
