package x;

import java.util.ArrayList;
import u.AbstractC5088e;
import w.C5143c;
import w.C5144d;

/* renamed from: x.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5194k extends AbstractC5199p {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f41746k = new int[2];

    public static void m(int[] iArr, int i, int i4, int i9, int i10, float f6, int i11) {
        int i12 = i4 - i;
        int i13 = i10 - i9;
        if (i11 != -1) {
            if (i11 == 0) {
                iArr[0] = (int) ((i13 * f6) + 0.5f);
                iArr[1] = i13;
                return;
            } else {
                if (i11 != 1) {
                    return;
                }
                iArr[0] = i12;
                iArr[1] = (int) ((i12 * f6) + 0.5f);
                return;
            }
        }
        int i14 = (int) ((i13 * f6) + 0.5f);
        int i15 = (int) ((i12 / f6) + 0.5f);
        if (i14 <= i12) {
            iArr[0] = i14;
            iArr[1] = i13;
        } else if (i15 <= i13) {
            iArr[0] = i12;
            iArr[1] = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r7 != 1) goto L125;
     */
    @Override // x.InterfaceC5187d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC5187d interfaceC5187d) {
        float f6;
        float f9;
        float f10;
        float f11;
        int i;
        if (AbstractC5088e.d(this.f41765j) == 3) {
            C5144d c5144d = this.f41758b;
            l(c5144d.f41422I, c5144d.f41423K, 0);
            return;
        }
        C5190g c5190g = this.f41761e;
        boolean z8 = c5190g.f41741j;
        C5189f c5189f = this.f41764h;
        C5189f c5189f2 = this.i;
        if (!z8 && this.f41760d == 3) {
            C5144d c5144d2 = this.f41758b;
            int i4 = c5144d2.f41469r;
            if (i4 == 2) {
                f6 = 0.5f;
                C5144d c5144d3 = c5144d2.f41432T;
                if (c5144d3 != null) {
                    if (c5144d3.f41444d.f41761e.f41741j) {
                        c5190g.d((int) ((r7.f41739g * c5144d2.f41474w) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                int i9 = c5144d2.f41470s;
                if (i9 == 0 || i9 == 3) {
                    C5196m c5196m = c5144d2.f41446e;
                    C5189f c5189f3 = c5196m.f41764h;
                    C5189f c5189f4 = c5196m.i;
                    boolean z9 = c5144d2.f41422I.f41411f != null;
                    boolean z10 = c5144d2.J.f41411f != null;
                    boolean z11 = c5144d2.f41423K.f41411f != null;
                    boolean z12 = c5144d2.f41424L.f41411f != null;
                    f6 = 0.5f;
                    int i10 = c5144d2.f41436X;
                    if (z9 && z10 && z11 && z12) {
                        float f12 = c5144d2.f41435W;
                        boolean z13 = c5189f3.f41741j;
                        int[] iArr = f41746k;
                        if (z13 && c5189f4.f41741j) {
                            if (c5189f.f41735c && c5189f2.f41735c) {
                                m(iArr, ((C5189f) c5189f.f41743l.get(0)).f41739g + c5189f.f41738f, ((C5189f) c5189f2.f41743l.get(0)).f41739g - c5189f2.f41738f, c5189f3.f41739g + c5189f3.f41738f, c5189f4.f41739g - c5189f4.f41738f, f12, i10);
                                c5190g.d(iArr[0]);
                                this.f41758b.f41446e.f41761e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z14 = c5189f.f41741j;
                        ArrayList arrayList = c5189f3.f41743l;
                        if (z14 && c5189f2.f41741j) {
                            if (!c5189f3.f41735c || !c5189f4.f41735c) {
                                return;
                            }
                            m(iArr, c5189f.f41739g + c5189f.f41738f, c5189f2.f41739g - c5189f2.f41738f, ((C5189f) arrayList.get(0)).f41739g + c5189f3.f41738f, ((C5189f) c5189f4.f41743l.get(0)).f41739g - c5189f4.f41738f, f12, i10);
                            c5190g.d(iArr[0]);
                            this.f41758b.f41446e.f41761e.d(iArr[1]);
                        }
                        if (!c5189f.f41735c || !c5189f2.f41735c || !c5189f3.f41735c || !c5189f4.f41735c) {
                            return;
                        }
                        m(iArr, ((C5189f) c5189f.f41743l.get(0)).f41739g + c5189f.f41738f, ((C5189f) c5189f2.f41743l.get(0)).f41739g - c5189f2.f41738f, ((C5189f) arrayList.get(0)).f41739g + c5189f3.f41738f, ((C5189f) c5189f4.f41743l.get(0)).f41739g - c5189f4.f41738f, f12, i10);
                        c5190g.d(iArr[0]);
                        this.f41758b.f41446e.f41761e.d(iArr[1]);
                    } else if (z9 && z11) {
                        if (!c5189f.f41735c || !c5189f2.f41735c) {
                            return;
                        }
                        float f13 = c5144d2.f41435W;
                        int i11 = ((C5189f) c5189f.f41743l.get(0)).f41739g + c5189f.f41738f;
                        int i12 = ((C5189f) c5189f2.f41743l.get(0)).f41739g - c5189f2.f41738f;
                        if (i10 == -1 || i10 == 0) {
                            int g9 = g(i12 - i11, 0);
                            int i13 = (int) ((g9 * f13) + 0.5f);
                            int g10 = g(i13, 1);
                            if (i13 != g10) {
                                g9 = (int) ((g10 / f13) + 0.5f);
                            }
                            c5190g.d(g9);
                            this.f41758b.f41446e.f41761e.d(g10);
                        } else if (i10 == 1) {
                            int g11 = g(i12 - i11, 0);
                            int i14 = (int) ((g11 / f13) + 0.5f);
                            int g12 = g(i14, 1);
                            if (i14 != g12) {
                                g11 = (int) ((g12 * f13) + 0.5f);
                            }
                            c5190g.d(g11);
                            this.f41758b.f41446e.f41761e.d(g12);
                        }
                    } else if (z10 && z12) {
                        if (!c5189f3.f41735c || !c5189f4.f41735c) {
                            return;
                        }
                        float f14 = c5144d2.f41435W;
                        int i15 = ((C5189f) c5189f3.f41743l.get(0)).f41739g + c5189f3.f41738f;
                        int i16 = ((C5189f) c5189f4.f41743l.get(0)).f41739g - c5189f4.f41738f;
                        if (i10 != -1) {
                            if (i10 == 0) {
                                int g13 = g(i16 - i15, 1);
                                int i17 = (int) ((g13 * f14) + 0.5f);
                                int g14 = g(i17, 0);
                                if (i17 != g14) {
                                    g13 = (int) ((g14 / f14) + 0.5f);
                                }
                                c5190g.d(g14);
                                this.f41758b.f41446e.f41761e.d(g13);
                            }
                        }
                        int g15 = g(i16 - i15, 1);
                        int i18 = (int) ((g15 / f14) + 0.5f);
                        int g16 = g(i18, 0);
                        if (i18 != g16) {
                            g15 = (int) ((g16 * f14) + 0.5f);
                        }
                        c5190g.d(g16);
                        this.f41758b.f41446e.f41761e.d(g15);
                    }
                } else {
                    int i19 = c5144d2.f41436X;
                    if (i19 == -1) {
                        f9 = c5144d2.f41446e.f41761e.f41739g;
                        f10 = c5144d2.f41435W;
                    } else if (i19 == 0) {
                        f11 = c5144d2.f41446e.f41761e.f41739g / c5144d2.f41435W;
                        i = (int) (f11 + 0.5f);
                        c5190g.d(i);
                    } else if (i19 != 1) {
                        i = 0;
                        c5190g.d(i);
                    } else {
                        f9 = c5144d2.f41446e.f41761e.f41739g;
                        f10 = c5144d2.f41435W;
                    }
                    f11 = f9 * f10;
                    i = (int) (f11 + 0.5f);
                    c5190g.d(i);
                }
            }
            if (c5189f.f41735c || !c5189f2.f41735c) {
            }
            if (c5189f.f41741j && c5189f2.f41741j && c5190g.f41741j) {
                return;
            }
            if (!c5190g.f41741j && this.f41760d == 3) {
                C5144d c5144d4 = this.f41758b;
                if (c5144d4.f41469r == 0 && !c5144d4.x()) {
                    C5189f c5189f5 = (C5189f) c5189f.f41743l.get(0);
                    C5189f c5189f6 = (C5189f) c5189f2.f41743l.get(0);
                    int i20 = c5189f5.f41739g + c5189f.f41738f;
                    int i21 = c5189f6.f41739g + c5189f2.f41738f;
                    c5189f.d(i20);
                    c5189f2.d(i21);
                    c5190g.d(i21 - i20);
                    return;
                }
            }
            if (!c5190g.f41741j && this.f41760d == 3 && this.f41757a == 1 && c5189f.f41743l.size() > 0 && c5189f2.f41743l.size() > 0) {
                int min = Math.min((((C5189f) c5189f2.f41743l.get(0)).f41739g + c5189f2.f41738f) - (((C5189f) c5189f.f41743l.get(0)).f41739g + c5189f.f41738f), c5190g.f41744m);
                C5144d c5144d5 = this.f41758b;
                int i22 = c5144d5.f41473v;
                int max = Math.max(c5144d5.f41472u, min);
                if (i22 > 0) {
                    max = Math.min(i22, max);
                }
                c5190g.d(max);
            }
            if (c5190g.f41741j) {
                C5189f c5189f7 = (C5189f) c5189f.f41743l.get(0);
                C5189f c5189f8 = (C5189f) c5189f2.f41743l.get(0);
                int i23 = c5189f7.f41739g;
                int i24 = c5189f.f41738f + i23;
                int i25 = c5189f8.f41739g;
                int i26 = c5189f2.f41738f + i25;
                float f15 = this.f41758b.f41445d0;
                if (c5189f7 == c5189f8) {
                    f15 = f6;
                } else {
                    i23 = i24;
                    i25 = i26;
                }
                c5189f.d((int) ((((i25 - i23) - c5190g.f41739g) * f15) + i23 + f6));
                c5189f2.d(c5189f.f41739g + c5190g.f41739g);
                return;
            }
            return;
        }
        f6 = 0.5f;
        if (c5189f.f41735c) {
        }
    }

    @Override // x.AbstractC5199p
    public final void d() {
        C5144d c5144d;
        C5144d c5144d2;
        int i;
        C5144d c5144d3;
        C5144d c5144d4;
        int i4;
        C5144d c5144d5 = this.f41758b;
        boolean z8 = c5144d5.f41438a;
        C5190g c5190g = this.f41761e;
        if (z8) {
            c5190g.d(c5144d5.q());
        }
        boolean z9 = c5190g.f41741j;
        C5189f c5189f = this.i;
        C5189f c5189f2 = this.f41764h;
        if (!z9) {
            C5144d c5144d6 = this.f41758b;
            int i9 = c5144d6.f41467p0[0];
            this.f41760d = i9;
            if (i9 != 3) {
                if (i9 == 4 && (c5144d4 = c5144d6.f41432T) != null && ((i4 = c5144d4.f41467p0[0]) == 1 || i4 == 4)) {
                    int q6 = (c5144d4.q() - this.f41758b.f41422I.e()) - this.f41758b.f41423K.e();
                    AbstractC5199p.b(c5189f2, c5144d4.f41444d.f41764h, this.f41758b.f41422I.e());
                    AbstractC5199p.b(c5189f, c5144d4.f41444d.i, -this.f41758b.f41423K.e());
                    c5190g.d(q6);
                    return;
                }
                if (i9 == 1) {
                    c5190g.d(c5144d6.q());
                }
            }
        } else if (this.f41760d == 4 && (c5144d2 = (c5144d = this.f41758b).f41432T) != null && ((i = c5144d2.f41467p0[0]) == 1 || i == 4)) {
            AbstractC5199p.b(c5189f2, c5144d2.f41444d.f41764h, c5144d.f41422I.e());
            AbstractC5199p.b(c5189f, c5144d2.f41444d.i, -this.f41758b.f41423K.e());
            return;
        }
        if (c5190g.f41741j) {
            C5144d c5144d7 = this.f41758b;
            if (c5144d7.f41438a) {
                C5143c[] c5143cArr = c5144d7.f41429Q;
                C5143c c5143c = c5143cArr[0];
                C5143c c5143c2 = c5143c.f41411f;
                if (c5143c2 != null && c5143cArr[1].f41411f != null) {
                    if (c5144d7.x()) {
                        c5189f2.f41738f = this.f41758b.f41429Q[0].e();
                        c5189f.f41738f = -this.f41758b.f41429Q[1].e();
                        return;
                    }
                    C5189f h9 = AbstractC5199p.h(this.f41758b.f41429Q[0]);
                    if (h9 != null) {
                        AbstractC5199p.b(c5189f2, h9, this.f41758b.f41429Q[0].e());
                    }
                    C5189f h10 = AbstractC5199p.h(this.f41758b.f41429Q[1]);
                    if (h10 != null) {
                        AbstractC5199p.b(c5189f, h10, -this.f41758b.f41429Q[1].e());
                    }
                    c5189f2.f41734b = true;
                    c5189f.f41734b = true;
                    return;
                }
                if (c5143c2 != null) {
                    C5189f h11 = AbstractC5199p.h(c5143c);
                    if (h11 != null) {
                        AbstractC5199p.b(c5189f2, h11, this.f41758b.f41429Q[0].e());
                        AbstractC5199p.b(c5189f, c5189f2, c5190g.f41739g);
                        return;
                    }
                    return;
                }
                C5143c c5143c3 = c5143cArr[1];
                if (c5143c3.f41411f != null) {
                    C5189f h12 = AbstractC5199p.h(c5143c3);
                    if (h12 != null) {
                        AbstractC5199p.b(c5189f, h12, -this.f41758b.f41429Q[1].e());
                        AbstractC5199p.b(c5189f2, c5189f, -c5190g.f41739g);
                        return;
                    }
                    return;
                }
                if ((c5144d7 instanceof w.i) || c5144d7.f41432T == null || c5144d7.i(7).f41411f != null) {
                    return;
                }
                C5144d c5144d8 = this.f41758b;
                AbstractC5199p.b(c5189f2, c5144d8.f41432T.f41444d.f41764h, c5144d8.r());
                AbstractC5199p.b(c5189f, c5189f2, c5190g.f41739g);
                return;
            }
        }
        if (this.f41760d == 3) {
            C5144d c5144d9 = this.f41758b;
            int i10 = c5144d9.f41469r;
            if (i10 == 2) {
                C5144d c5144d10 = c5144d9.f41432T;
                if (c5144d10 != null) {
                    C5190g c5190g2 = c5144d10.f41446e.f41761e;
                    c5190g.f41743l.add(c5190g2);
                    c5190g2.f41742k.add(c5190g);
                    c5190g.f41734b = true;
                    c5190g.f41742k.add(c5189f2);
                    c5190g.f41742k.add(c5189f);
                }
            } else if (i10 == 3) {
                if (c5144d9.f41470s == 3) {
                    c5189f2.f41733a = this;
                    c5189f.f41733a = this;
                    C5196m c5196m = c5144d9.f41446e;
                    c5196m.f41764h.f41733a = this;
                    c5196m.i.f41733a = this;
                    c5190g.f41733a = this;
                    if (c5144d9.y()) {
                        c5190g.f41743l.add(this.f41758b.f41446e.f41761e);
                        this.f41758b.f41446e.f41761e.f41742k.add(c5190g);
                        C5196m c5196m2 = this.f41758b.f41446e;
                        c5196m2.f41761e.f41733a = this;
                        c5190g.f41743l.add(c5196m2.f41764h);
                        c5190g.f41743l.add(this.f41758b.f41446e.i);
                        this.f41758b.f41446e.f41764h.f41742k.add(c5190g);
                        this.f41758b.f41446e.i.f41742k.add(c5190g);
                    } else if (this.f41758b.x()) {
                        this.f41758b.f41446e.f41761e.f41743l.add(c5190g);
                        c5190g.f41742k.add(this.f41758b.f41446e.f41761e);
                    } else {
                        this.f41758b.f41446e.f41761e.f41743l.add(c5190g);
                    }
                } else {
                    C5190g c5190g3 = c5144d9.f41446e.f41761e;
                    c5190g.f41743l.add(c5190g3);
                    c5190g3.f41742k.add(c5190g);
                    this.f41758b.f41446e.f41764h.f41742k.add(c5190g);
                    this.f41758b.f41446e.i.f41742k.add(c5190g);
                    c5190g.f41734b = true;
                    c5190g.f41742k.add(c5189f2);
                    c5190g.f41742k.add(c5189f);
                    c5189f2.f41743l.add(c5190g);
                    c5189f.f41743l.add(c5190g);
                }
            }
        }
        C5144d c5144d11 = this.f41758b;
        C5143c[] c5143cArr2 = c5144d11.f41429Q;
        C5143c c5143c4 = c5143cArr2[0];
        C5143c c5143c5 = c5143c4.f41411f;
        if (c5143c5 != null && c5143cArr2[1].f41411f != null) {
            if (c5144d11.x()) {
                c5189f2.f41738f = this.f41758b.f41429Q[0].e();
                c5189f.f41738f = -this.f41758b.f41429Q[1].e();
                return;
            }
            C5189f h13 = AbstractC5199p.h(this.f41758b.f41429Q[0]);
            C5189f h14 = AbstractC5199p.h(this.f41758b.f41429Q[1]);
            if (h13 != null) {
                h13.b(this);
            }
            if (h14 != null) {
                h14.b(this);
            }
            this.f41765j = 4;
            return;
        }
        if (c5143c5 != null) {
            C5189f h15 = AbstractC5199p.h(c5143c4);
            if (h15 != null) {
                AbstractC5199p.b(c5189f2, h15, this.f41758b.f41429Q[0].e());
                c(c5189f, c5189f2, 1, c5190g);
                return;
            }
            return;
        }
        C5143c c5143c6 = c5143cArr2[1];
        if (c5143c6.f41411f != null) {
            C5189f h16 = AbstractC5199p.h(c5143c6);
            if (h16 != null) {
                AbstractC5199p.b(c5189f, h16, -this.f41758b.f41429Q[1].e());
                c(c5189f2, c5189f, -1, c5190g);
                return;
            }
            return;
        }
        if ((c5144d11 instanceof w.i) || (c5144d3 = c5144d11.f41432T) == null) {
            return;
        }
        AbstractC5199p.b(c5189f2, c5144d3.f41444d.f41764h, c5144d11.r());
        c(c5189f, c5189f2, 1, c5190g);
    }

    @Override // x.AbstractC5199p
    public final void e() {
        C5189f c5189f = this.f41764h;
        if (c5189f.f41741j) {
            this.f41758b.Y = c5189f.f41739g;
        }
    }

    @Override // x.AbstractC5199p
    public final void f() {
        this.f41759c = null;
        this.f41764h.c();
        this.i.c();
        this.f41761e.c();
        this.f41763g = false;
    }

    @Override // x.AbstractC5199p
    public final boolean k() {
        return this.f41760d != 3 || this.f41758b.f41469r == 0;
    }

    public final void n() {
        this.f41763g = false;
        C5189f c5189f = this.f41764h;
        c5189f.c();
        c5189f.f41741j = false;
        C5189f c5189f2 = this.i;
        c5189f2.c();
        c5189f2.f41741j = false;
        this.f41761e.f41741j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f41758b.f41453h0;
    }
}
