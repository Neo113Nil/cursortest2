package t;

import java.util.ArrayList;
import q.AbstractC0317e;
import s.C0324c;
import s.C0325d;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338k extends AbstractC0342o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f4180k = new int[2];

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
    @Override // t.InterfaceC0331d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0331d interfaceC0331d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0317e.a(this.f4198j) == 3) {
            C0325d c0325d = this.f4192b;
            l(c0325d.f4012I, c0325d.f4014K, 0);
            return;
        }
        C0334g c0334g = this.f4195e;
        boolean z2 = c0334g.f4175j;
        C0333f c0333f = this.h;
        C0333f c0333f2 = this.i;
        if (!z2 && this.f4194d == 3) {
            C0325d c0325d2 = this.f4192b;
            int i2 = c0325d2.f4059r;
            if (i2 == 2) {
                C0325d c0325d3 = c0325d2.f4023T;
                if (c0325d3 != null) {
                    if (c0325d3.f4036d.f4195e.f4175j) {
                        c0334g.d((int) ((r3.f4174g * c0325d2.f4064w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0325d2.f4060s;
                if (i3 == 0 || i3 == 3) {
                    C0340m c0340m = c0325d2.f4038e;
                    C0333f c0333f3 = c0340m.h;
                    C0333f c0333f4 = c0340m.i;
                    boolean z3 = c0325d2.f4012I.f4003f != null;
                    boolean z4 = c0325d2.f4013J.f4003f != null;
                    boolean z5 = c0325d2.f4014K.f4003f != null;
                    boolean z6 = c0325d2.f4015L.f4003f != null;
                    int i4 = c0325d2.f4027X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0325d2.f4026W;
                        boolean z7 = c0333f3.f4175j;
                        int[] iArr = f4180k;
                        if (z7 && c0333f4.f4175j) {
                            if (c0333f.f4170c && c0333f2.f4170c) {
                                m(iArr, ((C0333f) c0333f.f4177l.get(0)).f4174g + c0333f.f4173f, ((C0333f) c0333f2.f4177l.get(0)).f4174g - c0333f2.f4173f, c0333f3.f4174g + c0333f3.f4173f, c0333f4.f4174g - c0333f4.f4173f, f5, i4);
                                c0334g.d(iArr[0]);
                                this.f4192b.f4038e.f4195e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0333f.f4175j;
                        ArrayList arrayList = c0333f3.f4177l;
                        if (z8 && c0333f2.f4175j) {
                            if (!c0333f3.f4170c || !c0333f4.f4170c) {
                                return;
                            }
                            m(iArr, c0333f.f4174g + c0333f.f4173f, c0333f2.f4174g - c0333f2.f4173f, ((C0333f) arrayList.get(0)).f4174g + c0333f3.f4173f, ((C0333f) c0333f4.f4177l.get(0)).f4174g - c0333f4.f4173f, f5, i4);
                            c0334g.d(iArr[0]);
                            this.f4192b.f4038e.f4195e.d(iArr[1]);
                        }
                        if (!c0333f.f4170c || !c0333f2.f4170c || !c0333f3.f4170c || !c0333f4.f4170c) {
                            return;
                        }
                        m(iArr, ((C0333f) c0333f.f4177l.get(0)).f4174g + c0333f.f4173f, ((C0333f) c0333f2.f4177l.get(0)).f4174g - c0333f2.f4173f, ((C0333f) arrayList.get(0)).f4174g + c0333f3.f4173f, ((C0333f) c0333f4.f4177l.get(0)).f4174g - c0333f4.f4173f, f5, i4);
                        c0334g.d(iArr[0]);
                        this.f4192b.f4038e.f4195e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0333f.f4170c || !c0333f2.f4170c) {
                            return;
                        }
                        float f6 = c0325d2.f4026W;
                        int i5 = ((C0333f) c0333f.f4177l.get(0)).f4174g + c0333f.f4173f;
                        int i6 = ((C0333f) c0333f2.f4177l.get(0)).f4174g - c0333f2.f4173f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0334g.d(g2);
                            this.f4192b.f4038e.f4195e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0334g.d(g4);
                            this.f4192b.f4038e.f4195e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0333f3.f4170c || !c0333f4.f4170c) {
                            return;
                        }
                        float f7 = c0325d2.f4026W;
                        int i9 = ((C0333f) c0333f3.f4177l.get(0)).f4174g + c0333f3.f4173f;
                        int i10 = ((C0333f) c0333f4.f4177l.get(0)).f4174g - c0333f4.f4173f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0334g.d(g7);
                                this.f4192b.f4038e.f4195e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0334g.d(g9);
                        this.f4192b.f4038e.f4195e.d(g8);
                    }
                } else {
                    int i13 = c0325d2.f4027X;
                    if (i13 == -1) {
                        f2 = c0325d2.f4038e.f4195e.f4174g;
                        f3 = c0325d2.f4026W;
                    } else if (i13 == 0) {
                        f4 = c0325d2.f4038e.f4195e.f4174g / c0325d2.f4026W;
                        i = (int) (f4 + 0.5f);
                        c0334g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0334g.d(i);
                    } else {
                        f2 = c0325d2.f4038e.f4195e.f4174g;
                        f3 = c0325d2.f4026W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0334g.d(i);
                }
            }
        }
        if (c0333f.f4170c && c0333f2.f4170c) {
            if (c0333f.f4175j && c0333f2.f4175j && c0334g.f4175j) {
                return;
            }
            if (!c0334g.f4175j && this.f4194d == 3) {
                C0325d c0325d4 = this.f4192b;
                if (c0325d4.f4059r == 0 && !c0325d4.x()) {
                    C0333f c0333f5 = (C0333f) c0333f.f4177l.get(0);
                    C0333f c0333f6 = (C0333f) c0333f2.f4177l.get(0);
                    int i14 = c0333f5.f4174g + c0333f.f4173f;
                    int i15 = c0333f6.f4174g + c0333f2.f4173f;
                    c0333f.d(i14);
                    c0333f2.d(i15);
                    c0334g.d(i15 - i14);
                    return;
                }
            }
            if (!c0334g.f4175j && this.f4194d == 3 && this.f4191a == 1 && c0333f.f4177l.size() > 0 && c0333f2.f4177l.size() > 0) {
                int min = Math.min((((C0333f) c0333f2.f4177l.get(0)).f4174g + c0333f2.f4173f) - (((C0333f) c0333f.f4177l.get(0)).f4174g + c0333f.f4173f), c0334g.f4178m);
                C0325d c0325d5 = this.f4192b;
                int i16 = c0325d5.f4063v;
                int max = Math.max(c0325d5.f4062u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0334g.d(max);
            }
            if (c0334g.f4175j) {
                C0333f c0333f7 = (C0333f) c0333f.f4177l.get(0);
                C0333f c0333f8 = (C0333f) c0333f2.f4177l.get(0);
                int i17 = c0333f7.f4174g;
                int i18 = c0333f.f4173f + i17;
                int i19 = c0333f8.f4174g;
                int i20 = c0333f2.f4173f + i19;
                float f8 = this.f4192b.f4037d0;
                if (c0333f7 == c0333f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0333f.d((int) ((((i19 - i17) - c0334g.f4174g) * f8) + i17 + 0.5f));
                c0333f2.d(c0333f.f4174g + c0334g.f4174g);
            }
        }
    }

    @Override // t.AbstractC0342o
    public final void d() {
        C0325d c0325d;
        C0325d c0325d2;
        int i;
        C0325d c0325d3;
        C0325d c0325d4;
        int i2;
        C0325d c0325d5 = this.f4192b;
        boolean z2 = c0325d5.f4030a;
        C0334g c0334g = this.f4195e;
        if (z2) {
            c0334g.d(c0325d5.q());
        }
        boolean z3 = c0334g.f4175j;
        C0333f c0333f = this.i;
        C0333f c0333f2 = this.h;
        if (!z3) {
            C0325d c0325d6 = this.f4192b;
            int i3 = c0325d6.f4057p0[0];
            this.f4194d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0325d4 = c0325d6.f4023T) != null && ((i2 = c0325d4.f4057p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0325d4.q() - this.f4192b.f4012I.e()) - this.f4192b.f4014K.e();
                    AbstractC0342o.b(c0333f2, c0325d4.f4036d.h, this.f4192b.f4012I.e());
                    AbstractC0342o.b(c0333f, c0325d4.f4036d.i, -this.f4192b.f4014K.e());
                    c0334g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0334g.d(c0325d6.q());
                }
            }
        } else if (this.f4194d == 4 && (c0325d2 = (c0325d = this.f4192b).f4023T) != null && ((i = c0325d2.f4057p0[0]) == 1 || i == 4)) {
            AbstractC0342o.b(c0333f2, c0325d2.f4036d.h, c0325d.f4012I.e());
            AbstractC0342o.b(c0333f, c0325d2.f4036d.i, -this.f4192b.f4014K.e());
            return;
        }
        if (c0334g.f4175j) {
            C0325d c0325d7 = this.f4192b;
            if (c0325d7.f4030a) {
                C0324c[] c0324cArr = c0325d7.f4020Q;
                C0324c c0324c = c0324cArr[0];
                C0324c c0324c2 = c0324c.f4003f;
                if (c0324c2 != null && c0324cArr[1].f4003f != null) {
                    if (c0325d7.x()) {
                        c0333f2.f4173f = this.f4192b.f4020Q[0].e();
                        c0333f.f4173f = -this.f4192b.f4020Q[1].e();
                        return;
                    }
                    C0333f h = AbstractC0342o.h(this.f4192b.f4020Q[0]);
                    if (h != null) {
                        AbstractC0342o.b(c0333f2, h, this.f4192b.f4020Q[0].e());
                    }
                    C0333f h2 = AbstractC0342o.h(this.f4192b.f4020Q[1]);
                    if (h2 != null) {
                        AbstractC0342o.b(c0333f, h2, -this.f4192b.f4020Q[1].e());
                    }
                    c0333f2.f4169b = true;
                    c0333f.f4169b = true;
                    return;
                }
                if (c0324c2 != null) {
                    C0333f h3 = AbstractC0342o.h(c0324c);
                    if (h3 != null) {
                        AbstractC0342o.b(c0333f2, h3, this.f4192b.f4020Q[0].e());
                        AbstractC0342o.b(c0333f, c0333f2, c0334g.f4174g);
                        return;
                    }
                    return;
                }
                C0324c c0324c3 = c0324cArr[1];
                if (c0324c3.f4003f != null) {
                    C0333f h4 = AbstractC0342o.h(c0324c3);
                    if (h4 != null) {
                        AbstractC0342o.b(c0333f, h4, -this.f4192b.f4020Q[1].e());
                        AbstractC0342o.b(c0333f2, c0333f, -c0334g.f4174g);
                        return;
                    }
                    return;
                }
                if ((c0325d7 instanceof s.i) || c0325d7.f4023T == null || c0325d7.i(7).f4003f != null) {
                    return;
                }
                C0325d c0325d8 = this.f4192b;
                AbstractC0342o.b(c0333f2, c0325d8.f4023T.f4036d.h, c0325d8.r());
                AbstractC0342o.b(c0333f, c0333f2, c0334g.f4174g);
                return;
            }
        }
        if (this.f4194d == 3) {
            C0325d c0325d9 = this.f4192b;
            int i4 = c0325d9.f4059r;
            if (i4 == 2) {
                C0325d c0325d10 = c0325d9.f4023T;
                if (c0325d10 != null) {
                    C0334g c0334g2 = c0325d10.f4038e.f4195e;
                    c0334g.f4177l.add(c0334g2);
                    c0334g2.f4176k.add(c0334g);
                    c0334g.f4169b = true;
                    c0334g.f4176k.add(c0333f2);
                    c0334g.f4176k.add(c0333f);
                }
            } else if (i4 == 3) {
                if (c0325d9.f4060s == 3) {
                    c0333f2.f4168a = this;
                    c0333f.f4168a = this;
                    C0340m c0340m = c0325d9.f4038e;
                    c0340m.h.f4168a = this;
                    c0340m.i.f4168a = this;
                    c0334g.f4168a = this;
                    if (c0325d9.y()) {
                        c0334g.f4177l.add(this.f4192b.f4038e.f4195e);
                        this.f4192b.f4038e.f4195e.f4176k.add(c0334g);
                        C0340m c0340m2 = this.f4192b.f4038e;
                        c0340m2.f4195e.f4168a = this;
                        c0334g.f4177l.add(c0340m2.h);
                        c0334g.f4177l.add(this.f4192b.f4038e.i);
                        this.f4192b.f4038e.h.f4176k.add(c0334g);
                        this.f4192b.f4038e.i.f4176k.add(c0334g);
                    } else if (this.f4192b.x()) {
                        this.f4192b.f4038e.f4195e.f4177l.add(c0334g);
                        c0334g.f4176k.add(this.f4192b.f4038e.f4195e);
                    } else {
                        this.f4192b.f4038e.f4195e.f4177l.add(c0334g);
                    }
                } else {
                    C0334g c0334g3 = c0325d9.f4038e.f4195e;
                    c0334g.f4177l.add(c0334g3);
                    c0334g3.f4176k.add(c0334g);
                    this.f4192b.f4038e.h.f4176k.add(c0334g);
                    this.f4192b.f4038e.i.f4176k.add(c0334g);
                    c0334g.f4169b = true;
                    c0334g.f4176k.add(c0333f2);
                    c0334g.f4176k.add(c0333f);
                    c0333f2.f4177l.add(c0334g);
                    c0333f.f4177l.add(c0334g);
                }
            }
        }
        C0325d c0325d11 = this.f4192b;
        C0324c[] c0324cArr2 = c0325d11.f4020Q;
        C0324c c0324c4 = c0324cArr2[0];
        C0324c c0324c5 = c0324c4.f4003f;
        if (c0324c5 != null && c0324cArr2[1].f4003f != null) {
            if (c0325d11.x()) {
                c0333f2.f4173f = this.f4192b.f4020Q[0].e();
                c0333f.f4173f = -this.f4192b.f4020Q[1].e();
                return;
            }
            C0333f h5 = AbstractC0342o.h(this.f4192b.f4020Q[0]);
            C0333f h6 = AbstractC0342o.h(this.f4192b.f4020Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f4198j = 4;
            return;
        }
        if (c0324c5 != null) {
            C0333f h7 = AbstractC0342o.h(c0324c4);
            if (h7 != null) {
                AbstractC0342o.b(c0333f2, h7, this.f4192b.f4020Q[0].e());
                c(c0333f, c0333f2, 1, c0334g);
                return;
            }
            return;
        }
        C0324c c0324c6 = c0324cArr2[1];
        if (c0324c6.f4003f != null) {
            C0333f h8 = AbstractC0342o.h(c0324c6);
            if (h8 != null) {
                AbstractC0342o.b(c0333f, h8, -this.f4192b.f4020Q[1].e());
                c(c0333f2, c0333f, -1, c0334g);
                return;
            }
            return;
        }
        if ((c0325d11 instanceof s.i) || (c0325d3 = c0325d11.f4023T) == null) {
            return;
        }
        AbstractC0342o.b(c0333f2, c0325d3.f4036d.h, c0325d11.r());
        c(c0333f, c0333f2, 1, c0334g);
    }

    @Override // t.AbstractC0342o
    public final void e() {
        C0333f c0333f = this.h;
        if (c0333f.f4175j) {
            this.f4192b.f4028Y = c0333f.f4174g;
        }
    }

    @Override // t.AbstractC0342o
    public final void f() {
        this.f4193c = null;
        this.h.c();
        this.i.c();
        this.f4195e.c();
        this.f4197g = false;
    }

    @Override // t.AbstractC0342o
    public final boolean k() {
        return this.f4194d != 3 || this.f4192b.f4059r == 0;
    }

    public final void n() {
        this.f4197g = false;
        C0333f c0333f = this.h;
        c0333f.c();
        c0333f.f4175j = false;
        C0333f c0333f2 = this.i;
        c0333f2.c();
        c0333f2.f4175j = false;
        this.f4195e.f4175j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4192b.f4044h0;
    }
}
