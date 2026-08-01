package v;

import java.util.ArrayList;
import s.AbstractC0267e;
import u.C0274c;
import u.C0275d;

/* renamed from: v.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288k extends AbstractC0292o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3825k = new int[2];

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
    @Override // v.InterfaceC0281d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0281d interfaceC0281d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0267e.a(this.f3841j) == 3) {
            C0275d c0275d = this.f3836b;
            l(c0275d.f3648I, c0275d.f3650K, 0);
            return;
        }
        C0284g c0284g = this.f3838e;
        boolean z2 = c0284g.f3820j;
        C0283f c0283f = this.h;
        C0283f c0283f2 = this.i;
        if (!z2 && this.d == 3) {
            C0275d c0275d2 = this.f3836b;
            int i2 = c0275d2.f3695r;
            if (i2 == 2) {
                C0275d c0275d3 = c0275d2.f3659T;
                if (c0275d3 != null) {
                    if (c0275d3.d.f3838e.f3820j) {
                        c0284g.d((int) ((r3.f3819g * c0275d2.f3700w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0275d2.f3696s;
                if (i3 == 0 || i3 == 3) {
                    C0290m c0290m = c0275d2.f3673e;
                    C0283f c0283f3 = c0290m.h;
                    C0283f c0283f4 = c0290m.i;
                    boolean z3 = c0275d2.f3648I.f3639f != null;
                    boolean z4 = c0275d2.f3649J.f3639f != null;
                    boolean z5 = c0275d2.f3650K.f3639f != null;
                    boolean z6 = c0275d2.f3651L.f3639f != null;
                    int i4 = c0275d2.f3663X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0275d2.f3662W;
                        boolean z7 = c0283f3.f3820j;
                        int[] iArr = f3825k;
                        if (z7 && c0283f4.f3820j) {
                            if (c0283f.f3816c && c0283f2.f3816c) {
                                m(iArr, ((C0283f) c0283f.f3822l.get(0)).f3819g + c0283f.f3818f, ((C0283f) c0283f2.f3822l.get(0)).f3819g - c0283f2.f3818f, c0283f3.f3819g + c0283f3.f3818f, c0283f4.f3819g - c0283f4.f3818f, f5, i4);
                                c0284g.d(iArr[0]);
                                this.f3836b.f3673e.f3838e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0283f.f3820j;
                        ArrayList arrayList = c0283f3.f3822l;
                        if (z8 && c0283f2.f3820j) {
                            if (!c0283f3.f3816c || !c0283f4.f3816c) {
                                return;
                            }
                            m(iArr, c0283f.f3819g + c0283f.f3818f, c0283f2.f3819g - c0283f2.f3818f, ((C0283f) arrayList.get(0)).f3819g + c0283f3.f3818f, ((C0283f) c0283f4.f3822l.get(0)).f3819g - c0283f4.f3818f, f5, i4);
                            c0284g.d(iArr[0]);
                            this.f3836b.f3673e.f3838e.d(iArr[1]);
                        }
                        if (!c0283f.f3816c || !c0283f2.f3816c || !c0283f3.f3816c || !c0283f4.f3816c) {
                            return;
                        }
                        m(iArr, ((C0283f) c0283f.f3822l.get(0)).f3819g + c0283f.f3818f, ((C0283f) c0283f2.f3822l.get(0)).f3819g - c0283f2.f3818f, ((C0283f) arrayList.get(0)).f3819g + c0283f3.f3818f, ((C0283f) c0283f4.f3822l.get(0)).f3819g - c0283f4.f3818f, f5, i4);
                        c0284g.d(iArr[0]);
                        this.f3836b.f3673e.f3838e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0283f.f3816c || !c0283f2.f3816c) {
                            return;
                        }
                        float f6 = c0275d2.f3662W;
                        int i5 = ((C0283f) c0283f.f3822l.get(0)).f3819g + c0283f.f3818f;
                        int i6 = ((C0283f) c0283f2.f3822l.get(0)).f3819g - c0283f2.f3818f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0284g.d(g2);
                            this.f3836b.f3673e.f3838e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0284g.d(g4);
                            this.f3836b.f3673e.f3838e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0283f3.f3816c || !c0283f4.f3816c) {
                            return;
                        }
                        float f7 = c0275d2.f3662W;
                        int i9 = ((C0283f) c0283f3.f3822l.get(0)).f3819g + c0283f3.f3818f;
                        int i10 = ((C0283f) c0283f4.f3822l.get(0)).f3819g - c0283f4.f3818f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0284g.d(g7);
                                this.f3836b.f3673e.f3838e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0284g.d(g9);
                        this.f3836b.f3673e.f3838e.d(g8);
                    }
                } else {
                    int i13 = c0275d2.f3663X;
                    if (i13 == -1) {
                        f2 = c0275d2.f3673e.f3838e.f3819g;
                        f3 = c0275d2.f3662W;
                    } else if (i13 == 0) {
                        f4 = c0275d2.f3673e.f3838e.f3819g / c0275d2.f3662W;
                        i = (int) (f4 + 0.5f);
                        c0284g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0284g.d(i);
                    } else {
                        f2 = c0275d2.f3673e.f3838e.f3819g;
                        f3 = c0275d2.f3662W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0284g.d(i);
                }
            }
        }
        if (c0283f.f3816c && c0283f2.f3816c) {
            if (c0283f.f3820j && c0283f2.f3820j && c0284g.f3820j) {
                return;
            }
            if (!c0284g.f3820j && this.d == 3) {
                C0275d c0275d4 = this.f3836b;
                if (c0275d4.f3695r == 0 && !c0275d4.x()) {
                    C0283f c0283f5 = (C0283f) c0283f.f3822l.get(0);
                    C0283f c0283f6 = (C0283f) c0283f2.f3822l.get(0);
                    int i14 = c0283f5.f3819g + c0283f.f3818f;
                    int i15 = c0283f6.f3819g + c0283f2.f3818f;
                    c0283f.d(i14);
                    c0283f2.d(i15);
                    c0284g.d(i15 - i14);
                    return;
                }
            }
            if (!c0284g.f3820j && this.d == 3 && this.f3835a == 1 && c0283f.f3822l.size() > 0 && c0283f2.f3822l.size() > 0) {
                int min = Math.min((((C0283f) c0283f2.f3822l.get(0)).f3819g + c0283f2.f3818f) - (((C0283f) c0283f.f3822l.get(0)).f3819g + c0283f.f3818f), c0284g.f3823m);
                C0275d c0275d5 = this.f3836b;
                int i16 = c0275d5.f3699v;
                int max = Math.max(c0275d5.f3698u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0284g.d(max);
            }
            if (c0284g.f3820j) {
                C0283f c0283f7 = (C0283f) c0283f.f3822l.get(0);
                C0283f c0283f8 = (C0283f) c0283f2.f3822l.get(0);
                int i17 = c0283f7.f3819g;
                int i18 = c0283f.f3818f + i17;
                int i19 = c0283f8.f3819g;
                int i20 = c0283f2.f3818f + i19;
                float f8 = this.f3836b.f3672d0;
                if (c0283f7 == c0283f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0283f.d((int) ((((i19 - i17) - c0284g.f3819g) * f8) + i17 + 0.5f));
                c0283f2.d(c0283f.f3819g + c0284g.f3819g);
            }
        }
    }

    @Override // v.AbstractC0292o
    public final void d() {
        C0275d c0275d;
        C0275d c0275d2;
        int i;
        C0275d c0275d3;
        C0275d c0275d4;
        int i2;
        C0275d c0275d5 = this.f3836b;
        boolean z2 = c0275d5.f3666a;
        C0284g c0284g = this.f3838e;
        if (z2) {
            c0284g.d(c0275d5.q());
        }
        boolean z3 = c0284g.f3820j;
        C0283f c0283f = this.i;
        C0283f c0283f2 = this.h;
        if (!z3) {
            C0275d c0275d6 = this.f3836b;
            int i3 = c0275d6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0275d4 = c0275d6.f3659T) != null && ((i2 = c0275d4.p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0275d4.q() - this.f3836b.f3648I.e()) - this.f3836b.f3650K.e();
                    AbstractC0292o.b(c0283f2, c0275d4.d.h, this.f3836b.f3648I.e());
                    AbstractC0292o.b(c0283f, c0275d4.d.i, -this.f3836b.f3650K.e());
                    c0284g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0284g.d(c0275d6.q());
                }
            }
        } else if (this.d == 4 && (c0275d2 = (c0275d = this.f3836b).f3659T) != null && ((i = c0275d2.p0[0]) == 1 || i == 4)) {
            AbstractC0292o.b(c0283f2, c0275d2.d.h, c0275d.f3648I.e());
            AbstractC0292o.b(c0283f, c0275d2.d.i, -this.f3836b.f3650K.e());
            return;
        }
        if (c0284g.f3820j) {
            C0275d c0275d7 = this.f3836b;
            if (c0275d7.f3666a) {
                C0274c[] c0274cArr = c0275d7.f3656Q;
                C0274c c0274c = c0274cArr[0];
                C0274c c0274c2 = c0274c.f3639f;
                if (c0274c2 != null && c0274cArr[1].f3639f != null) {
                    if (c0275d7.x()) {
                        c0283f2.f3818f = this.f3836b.f3656Q[0].e();
                        c0283f.f3818f = -this.f3836b.f3656Q[1].e();
                        return;
                    }
                    C0283f h = AbstractC0292o.h(this.f3836b.f3656Q[0]);
                    if (h != null) {
                        AbstractC0292o.b(c0283f2, h, this.f3836b.f3656Q[0].e());
                    }
                    C0283f h2 = AbstractC0292o.h(this.f3836b.f3656Q[1]);
                    if (h2 != null) {
                        AbstractC0292o.b(c0283f, h2, -this.f3836b.f3656Q[1].e());
                    }
                    c0283f2.f3815b = true;
                    c0283f.f3815b = true;
                    return;
                }
                if (c0274c2 != null) {
                    C0283f h3 = AbstractC0292o.h(c0274c);
                    if (h3 != null) {
                        AbstractC0292o.b(c0283f2, h3, this.f3836b.f3656Q[0].e());
                        AbstractC0292o.b(c0283f, c0283f2, c0284g.f3819g);
                        return;
                    }
                    return;
                }
                C0274c c0274c3 = c0274cArr[1];
                if (c0274c3.f3639f != null) {
                    C0283f h4 = AbstractC0292o.h(c0274c3);
                    if (h4 != null) {
                        AbstractC0292o.b(c0283f, h4, -this.f3836b.f3656Q[1].e());
                        AbstractC0292o.b(c0283f2, c0283f, -c0284g.f3819g);
                        return;
                    }
                    return;
                }
                if ((c0275d7 instanceof u.i) || c0275d7.f3659T == null || c0275d7.i(7).f3639f != null) {
                    return;
                }
                C0275d c0275d8 = this.f3836b;
                AbstractC0292o.b(c0283f2, c0275d8.f3659T.d.h, c0275d8.r());
                AbstractC0292o.b(c0283f, c0283f2, c0284g.f3819g);
                return;
            }
        }
        if (this.d == 3) {
            C0275d c0275d9 = this.f3836b;
            int i4 = c0275d9.f3695r;
            if (i4 == 2) {
                C0275d c0275d10 = c0275d9.f3659T;
                if (c0275d10 != null) {
                    C0284g c0284g2 = c0275d10.f3673e.f3838e;
                    c0284g.f3822l.add(c0284g2);
                    c0284g2.f3821k.add(c0284g);
                    c0284g.f3815b = true;
                    c0284g.f3821k.add(c0283f2);
                    c0284g.f3821k.add(c0283f);
                }
            } else if (i4 == 3) {
                if (c0275d9.f3696s == 3) {
                    c0283f2.f3814a = this;
                    c0283f.f3814a = this;
                    C0290m c0290m = c0275d9.f3673e;
                    c0290m.h.f3814a = this;
                    c0290m.i.f3814a = this;
                    c0284g.f3814a = this;
                    if (c0275d9.y()) {
                        c0284g.f3822l.add(this.f3836b.f3673e.f3838e);
                        this.f3836b.f3673e.f3838e.f3821k.add(c0284g);
                        C0290m c0290m2 = this.f3836b.f3673e;
                        c0290m2.f3838e.f3814a = this;
                        c0284g.f3822l.add(c0290m2.h);
                        c0284g.f3822l.add(this.f3836b.f3673e.i);
                        this.f3836b.f3673e.h.f3821k.add(c0284g);
                        this.f3836b.f3673e.i.f3821k.add(c0284g);
                    } else if (this.f3836b.x()) {
                        this.f3836b.f3673e.f3838e.f3822l.add(c0284g);
                        c0284g.f3821k.add(this.f3836b.f3673e.f3838e);
                    } else {
                        this.f3836b.f3673e.f3838e.f3822l.add(c0284g);
                    }
                } else {
                    C0284g c0284g3 = c0275d9.f3673e.f3838e;
                    c0284g.f3822l.add(c0284g3);
                    c0284g3.f3821k.add(c0284g);
                    this.f3836b.f3673e.h.f3821k.add(c0284g);
                    this.f3836b.f3673e.i.f3821k.add(c0284g);
                    c0284g.f3815b = true;
                    c0284g.f3821k.add(c0283f2);
                    c0284g.f3821k.add(c0283f);
                    c0283f2.f3822l.add(c0284g);
                    c0283f.f3822l.add(c0284g);
                }
            }
        }
        C0275d c0275d11 = this.f3836b;
        C0274c[] c0274cArr2 = c0275d11.f3656Q;
        C0274c c0274c4 = c0274cArr2[0];
        C0274c c0274c5 = c0274c4.f3639f;
        if (c0274c5 != null && c0274cArr2[1].f3639f != null) {
            if (c0275d11.x()) {
                c0283f2.f3818f = this.f3836b.f3656Q[0].e();
                c0283f.f3818f = -this.f3836b.f3656Q[1].e();
                return;
            }
            C0283f h5 = AbstractC0292o.h(this.f3836b.f3656Q[0]);
            C0283f h6 = AbstractC0292o.h(this.f3836b.f3656Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3841j = 4;
            return;
        }
        if (c0274c5 != null) {
            C0283f h7 = AbstractC0292o.h(c0274c4);
            if (h7 != null) {
                AbstractC0292o.b(c0283f2, h7, this.f3836b.f3656Q[0].e());
                c(c0283f, c0283f2, 1, c0284g);
                return;
            }
            return;
        }
        C0274c c0274c6 = c0274cArr2[1];
        if (c0274c6.f3639f != null) {
            C0283f h8 = AbstractC0292o.h(c0274c6);
            if (h8 != null) {
                AbstractC0292o.b(c0283f, h8, -this.f3836b.f3656Q[1].e());
                c(c0283f2, c0283f, -1, c0284g);
                return;
            }
            return;
        }
        if ((c0275d11 instanceof u.i) || (c0275d3 = c0275d11.f3659T) == null) {
            return;
        }
        AbstractC0292o.b(c0283f2, c0275d3.d.h, c0275d11.r());
        c(c0283f, c0283f2, 1, c0284g);
    }

    @Override // v.AbstractC0292o
    public final void e() {
        C0283f c0283f = this.h;
        if (c0283f.f3820j) {
            this.f3836b.f3664Y = c0283f.f3819g;
        }
    }

    @Override // v.AbstractC0292o
    public final void f() {
        this.f3837c = null;
        this.h.c();
        this.i.c();
        this.f3838e.c();
        this.f3840g = false;
    }

    @Override // v.AbstractC0292o
    public final boolean k() {
        return this.d != 3 || this.f3836b.f3695r == 0;
    }

    public final void n() {
        this.f3840g = false;
        C0283f c0283f = this.h;
        c0283f.c();
        c0283f.f3820j = false;
        C0283f c0283f2 = this.i;
        c0283f2.c();
        c0283f2.f3820j = false;
        this.f3838e.f3820j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3836b.f3679h0;
    }
}
