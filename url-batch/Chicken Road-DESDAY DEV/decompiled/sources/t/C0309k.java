package t;

import java.util.ArrayList;
import q.AbstractC0288e;
import s.C0295c;
import s.C0296d;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309k extends AbstractC0313o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3728k = new int[2];

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
    @Override // t.InterfaceC0302d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0302d interfaceC0302d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0288e.a(this.f3744j) == 3) {
            C0296d c0296d = this.f3739b;
            l(c0296d.f3556I, c0296d.f3558K, 0);
            return;
        }
        C0305g c0305g = this.f3741e;
        boolean z2 = c0305g.f3723j;
        C0304f c0304f = this.h;
        C0304f c0304f2 = this.i;
        if (!z2 && this.d == 3) {
            C0296d c0296d2 = this.f3739b;
            int i2 = c0296d2.f3603r;
            if (i2 == 2) {
                C0296d c0296d3 = c0296d2.f3567T;
                if (c0296d3 != null) {
                    if (c0296d3.d.f3741e.f3723j) {
                        c0305g.d((int) ((r3.f3722g * c0296d2.f3608w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0296d2.f3604s;
                if (i3 == 0 || i3 == 3) {
                    C0311m c0311m = c0296d2.f3581e;
                    C0304f c0304f3 = c0311m.h;
                    C0304f c0304f4 = c0311m.i;
                    boolean z3 = c0296d2.f3556I.f3547f != null;
                    boolean z4 = c0296d2.f3557J.f3547f != null;
                    boolean z5 = c0296d2.f3558K.f3547f != null;
                    boolean z6 = c0296d2.f3559L.f3547f != null;
                    int i4 = c0296d2.f3571X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0296d2.f3570W;
                        boolean z7 = c0304f3.f3723j;
                        int[] iArr = f3728k;
                        if (z7 && c0304f4.f3723j) {
                            if (c0304f.f3719c && c0304f2.f3719c) {
                                m(iArr, ((C0304f) c0304f.f3725l.get(0)).f3722g + c0304f.f3721f, ((C0304f) c0304f2.f3725l.get(0)).f3722g - c0304f2.f3721f, c0304f3.f3722g + c0304f3.f3721f, c0304f4.f3722g - c0304f4.f3721f, f5, i4);
                                c0305g.d(iArr[0]);
                                this.f3739b.f3581e.f3741e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0304f.f3723j;
                        ArrayList arrayList = c0304f3.f3725l;
                        if (z8 && c0304f2.f3723j) {
                            if (!c0304f3.f3719c || !c0304f4.f3719c) {
                                return;
                            }
                            m(iArr, c0304f.f3722g + c0304f.f3721f, c0304f2.f3722g - c0304f2.f3721f, ((C0304f) arrayList.get(0)).f3722g + c0304f3.f3721f, ((C0304f) c0304f4.f3725l.get(0)).f3722g - c0304f4.f3721f, f5, i4);
                            c0305g.d(iArr[0]);
                            this.f3739b.f3581e.f3741e.d(iArr[1]);
                        }
                        if (!c0304f.f3719c || !c0304f2.f3719c || !c0304f3.f3719c || !c0304f4.f3719c) {
                            return;
                        }
                        m(iArr, ((C0304f) c0304f.f3725l.get(0)).f3722g + c0304f.f3721f, ((C0304f) c0304f2.f3725l.get(0)).f3722g - c0304f2.f3721f, ((C0304f) arrayList.get(0)).f3722g + c0304f3.f3721f, ((C0304f) c0304f4.f3725l.get(0)).f3722g - c0304f4.f3721f, f5, i4);
                        c0305g.d(iArr[0]);
                        this.f3739b.f3581e.f3741e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0304f.f3719c || !c0304f2.f3719c) {
                            return;
                        }
                        float f6 = c0296d2.f3570W;
                        int i5 = ((C0304f) c0304f.f3725l.get(0)).f3722g + c0304f.f3721f;
                        int i6 = ((C0304f) c0304f2.f3725l.get(0)).f3722g - c0304f2.f3721f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0305g.d(g2);
                            this.f3739b.f3581e.f3741e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0305g.d(g4);
                            this.f3739b.f3581e.f3741e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0304f3.f3719c || !c0304f4.f3719c) {
                            return;
                        }
                        float f7 = c0296d2.f3570W;
                        int i9 = ((C0304f) c0304f3.f3725l.get(0)).f3722g + c0304f3.f3721f;
                        int i10 = ((C0304f) c0304f4.f3725l.get(0)).f3722g - c0304f4.f3721f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0305g.d(g7);
                                this.f3739b.f3581e.f3741e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0305g.d(g9);
                        this.f3739b.f3581e.f3741e.d(g8);
                    }
                } else {
                    int i13 = c0296d2.f3571X;
                    if (i13 == -1) {
                        f2 = c0296d2.f3581e.f3741e.f3722g;
                        f3 = c0296d2.f3570W;
                    } else if (i13 == 0) {
                        f4 = c0296d2.f3581e.f3741e.f3722g / c0296d2.f3570W;
                        i = (int) (f4 + 0.5f);
                        c0305g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0305g.d(i);
                    } else {
                        f2 = c0296d2.f3581e.f3741e.f3722g;
                        f3 = c0296d2.f3570W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0305g.d(i);
                }
            }
        }
        if (c0304f.f3719c && c0304f2.f3719c) {
            if (c0304f.f3723j && c0304f2.f3723j && c0305g.f3723j) {
                return;
            }
            if (!c0305g.f3723j && this.d == 3) {
                C0296d c0296d4 = this.f3739b;
                if (c0296d4.f3603r == 0 && !c0296d4.x()) {
                    C0304f c0304f5 = (C0304f) c0304f.f3725l.get(0);
                    C0304f c0304f6 = (C0304f) c0304f2.f3725l.get(0);
                    int i14 = c0304f5.f3722g + c0304f.f3721f;
                    int i15 = c0304f6.f3722g + c0304f2.f3721f;
                    c0304f.d(i14);
                    c0304f2.d(i15);
                    c0305g.d(i15 - i14);
                    return;
                }
            }
            if (!c0305g.f3723j && this.d == 3 && this.f3738a == 1 && c0304f.f3725l.size() > 0 && c0304f2.f3725l.size() > 0) {
                int min = Math.min((((C0304f) c0304f2.f3725l.get(0)).f3722g + c0304f2.f3721f) - (((C0304f) c0304f.f3725l.get(0)).f3722g + c0304f.f3721f), c0305g.f3726m);
                C0296d c0296d5 = this.f3739b;
                int i16 = c0296d5.f3607v;
                int max = Math.max(c0296d5.f3606u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0305g.d(max);
            }
            if (c0305g.f3723j) {
                C0304f c0304f7 = (C0304f) c0304f.f3725l.get(0);
                C0304f c0304f8 = (C0304f) c0304f2.f3725l.get(0);
                int i17 = c0304f7.f3722g;
                int i18 = c0304f.f3721f + i17;
                int i19 = c0304f8.f3722g;
                int i20 = c0304f2.f3721f + i19;
                float f8 = this.f3739b.f3580d0;
                if (c0304f7 == c0304f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0304f.d((int) ((((i19 - i17) - c0305g.f3722g) * f8) + i17 + 0.5f));
                c0304f2.d(c0304f.f3722g + c0305g.f3722g);
            }
        }
    }

    @Override // t.AbstractC0313o
    public final void d() {
        C0296d c0296d;
        C0296d c0296d2;
        int i;
        C0296d c0296d3;
        C0296d c0296d4;
        int i2;
        C0296d c0296d5 = this.f3739b;
        boolean z2 = c0296d5.f3574a;
        C0305g c0305g = this.f3741e;
        if (z2) {
            c0305g.d(c0296d5.q());
        }
        boolean z3 = c0305g.f3723j;
        C0304f c0304f = this.i;
        C0304f c0304f2 = this.h;
        if (!z3) {
            C0296d c0296d6 = this.f3739b;
            int i3 = c0296d6.f3601p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0296d4 = c0296d6.f3567T) != null && ((i2 = c0296d4.f3601p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0296d4.q() - this.f3739b.f3556I.e()) - this.f3739b.f3558K.e();
                    AbstractC0313o.b(c0304f2, c0296d4.d.h, this.f3739b.f3556I.e());
                    AbstractC0313o.b(c0304f, c0296d4.d.i, -this.f3739b.f3558K.e());
                    c0305g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0305g.d(c0296d6.q());
                }
            }
        } else if (this.d == 4 && (c0296d2 = (c0296d = this.f3739b).f3567T) != null && ((i = c0296d2.f3601p0[0]) == 1 || i == 4)) {
            AbstractC0313o.b(c0304f2, c0296d2.d.h, c0296d.f3556I.e());
            AbstractC0313o.b(c0304f, c0296d2.d.i, -this.f3739b.f3558K.e());
            return;
        }
        if (c0305g.f3723j) {
            C0296d c0296d7 = this.f3739b;
            if (c0296d7.f3574a) {
                C0295c[] c0295cArr = c0296d7.f3564Q;
                C0295c c0295c = c0295cArr[0];
                C0295c c0295c2 = c0295c.f3547f;
                if (c0295c2 != null && c0295cArr[1].f3547f != null) {
                    if (c0296d7.x()) {
                        c0304f2.f3721f = this.f3739b.f3564Q[0].e();
                        c0304f.f3721f = -this.f3739b.f3564Q[1].e();
                        return;
                    }
                    C0304f h = AbstractC0313o.h(this.f3739b.f3564Q[0]);
                    if (h != null) {
                        AbstractC0313o.b(c0304f2, h, this.f3739b.f3564Q[0].e());
                    }
                    C0304f h2 = AbstractC0313o.h(this.f3739b.f3564Q[1]);
                    if (h2 != null) {
                        AbstractC0313o.b(c0304f, h2, -this.f3739b.f3564Q[1].e());
                    }
                    c0304f2.f3718b = true;
                    c0304f.f3718b = true;
                    return;
                }
                if (c0295c2 != null) {
                    C0304f h3 = AbstractC0313o.h(c0295c);
                    if (h3 != null) {
                        AbstractC0313o.b(c0304f2, h3, this.f3739b.f3564Q[0].e());
                        AbstractC0313o.b(c0304f, c0304f2, c0305g.f3722g);
                        return;
                    }
                    return;
                }
                C0295c c0295c3 = c0295cArr[1];
                if (c0295c3.f3547f != null) {
                    C0304f h4 = AbstractC0313o.h(c0295c3);
                    if (h4 != null) {
                        AbstractC0313o.b(c0304f, h4, -this.f3739b.f3564Q[1].e());
                        AbstractC0313o.b(c0304f2, c0304f, -c0305g.f3722g);
                        return;
                    }
                    return;
                }
                if ((c0296d7 instanceof s.i) || c0296d7.f3567T == null || c0296d7.i(7).f3547f != null) {
                    return;
                }
                C0296d c0296d8 = this.f3739b;
                AbstractC0313o.b(c0304f2, c0296d8.f3567T.d.h, c0296d8.r());
                AbstractC0313o.b(c0304f, c0304f2, c0305g.f3722g);
                return;
            }
        }
        if (this.d == 3) {
            C0296d c0296d9 = this.f3739b;
            int i4 = c0296d9.f3603r;
            if (i4 == 2) {
                C0296d c0296d10 = c0296d9.f3567T;
                if (c0296d10 != null) {
                    C0305g c0305g2 = c0296d10.f3581e.f3741e;
                    c0305g.f3725l.add(c0305g2);
                    c0305g2.f3724k.add(c0305g);
                    c0305g.f3718b = true;
                    c0305g.f3724k.add(c0304f2);
                    c0305g.f3724k.add(c0304f);
                }
            } else if (i4 == 3) {
                if (c0296d9.f3604s == 3) {
                    c0304f2.f3717a = this;
                    c0304f.f3717a = this;
                    C0311m c0311m = c0296d9.f3581e;
                    c0311m.h.f3717a = this;
                    c0311m.i.f3717a = this;
                    c0305g.f3717a = this;
                    if (c0296d9.y()) {
                        c0305g.f3725l.add(this.f3739b.f3581e.f3741e);
                        this.f3739b.f3581e.f3741e.f3724k.add(c0305g);
                        C0311m c0311m2 = this.f3739b.f3581e;
                        c0311m2.f3741e.f3717a = this;
                        c0305g.f3725l.add(c0311m2.h);
                        c0305g.f3725l.add(this.f3739b.f3581e.i);
                        this.f3739b.f3581e.h.f3724k.add(c0305g);
                        this.f3739b.f3581e.i.f3724k.add(c0305g);
                    } else if (this.f3739b.x()) {
                        this.f3739b.f3581e.f3741e.f3725l.add(c0305g);
                        c0305g.f3724k.add(this.f3739b.f3581e.f3741e);
                    } else {
                        this.f3739b.f3581e.f3741e.f3725l.add(c0305g);
                    }
                } else {
                    C0305g c0305g3 = c0296d9.f3581e.f3741e;
                    c0305g.f3725l.add(c0305g3);
                    c0305g3.f3724k.add(c0305g);
                    this.f3739b.f3581e.h.f3724k.add(c0305g);
                    this.f3739b.f3581e.i.f3724k.add(c0305g);
                    c0305g.f3718b = true;
                    c0305g.f3724k.add(c0304f2);
                    c0305g.f3724k.add(c0304f);
                    c0304f2.f3725l.add(c0305g);
                    c0304f.f3725l.add(c0305g);
                }
            }
        }
        C0296d c0296d11 = this.f3739b;
        C0295c[] c0295cArr2 = c0296d11.f3564Q;
        C0295c c0295c4 = c0295cArr2[0];
        C0295c c0295c5 = c0295c4.f3547f;
        if (c0295c5 != null && c0295cArr2[1].f3547f != null) {
            if (c0296d11.x()) {
                c0304f2.f3721f = this.f3739b.f3564Q[0].e();
                c0304f.f3721f = -this.f3739b.f3564Q[1].e();
                return;
            }
            C0304f h5 = AbstractC0313o.h(this.f3739b.f3564Q[0]);
            C0304f h6 = AbstractC0313o.h(this.f3739b.f3564Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3744j = 4;
            return;
        }
        if (c0295c5 != null) {
            C0304f h7 = AbstractC0313o.h(c0295c4);
            if (h7 != null) {
                AbstractC0313o.b(c0304f2, h7, this.f3739b.f3564Q[0].e());
                c(c0304f, c0304f2, 1, c0305g);
                return;
            }
            return;
        }
        C0295c c0295c6 = c0295cArr2[1];
        if (c0295c6.f3547f != null) {
            C0304f h8 = AbstractC0313o.h(c0295c6);
            if (h8 != null) {
                AbstractC0313o.b(c0304f, h8, -this.f3739b.f3564Q[1].e());
                c(c0304f2, c0304f, -1, c0305g);
                return;
            }
            return;
        }
        if ((c0296d11 instanceof s.i) || (c0296d3 = c0296d11.f3567T) == null) {
            return;
        }
        AbstractC0313o.b(c0304f2, c0296d3.d.h, c0296d11.r());
        c(c0304f, c0304f2, 1, c0305g);
    }

    @Override // t.AbstractC0313o
    public final void e() {
        C0304f c0304f = this.h;
        if (c0304f.f3723j) {
            this.f3739b.f3572Y = c0304f.f3722g;
        }
    }

    @Override // t.AbstractC0313o
    public final void f() {
        this.f3740c = null;
        this.h.c();
        this.i.c();
        this.f3741e.c();
        this.f3743g = false;
    }

    @Override // t.AbstractC0313o
    public final boolean k() {
        return this.d != 3 || this.f3739b.f3603r == 0;
    }

    public final void n() {
        this.f3743g = false;
        C0304f c0304f = this.h;
        c0304f.c();
        c0304f.f3723j = false;
        C0304f c0304f2 = this.i;
        c0304f2.c();
        c0304f2.f3723j = false;
        this.f3741e.f3723j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3739b.f3587h0;
    }
}
