package t;

import java.util.ArrayList;
import q.AbstractC0290e;
import s.C0297c;
import s.C0298d;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311k extends AbstractC0315o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3763k = new int[2];

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
    @Override // t.InterfaceC0304d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0304d interfaceC0304d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0290e.a(this.f3779j) == 3) {
            C0298d c0298d = this.f3774b;
            l(c0298d.f3599I, c0298d.f3601K, 0);
            return;
        }
        C0307g c0307g = this.f3776e;
        boolean z2 = c0307g.f3758j;
        C0306f c0306f = this.h;
        C0306f c0306f2 = this.i;
        if (!z2 && this.d == 3) {
            C0298d c0298d2 = this.f3774b;
            int i2 = c0298d2.f3646r;
            if (i2 == 2) {
                C0298d c0298d3 = c0298d2.f3610T;
                if (c0298d3 != null) {
                    if (c0298d3.d.f3776e.f3758j) {
                        c0307g.d((int) ((r3.f3757g * c0298d2.f3651w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0298d2.f3647s;
                if (i3 == 0 || i3 == 3) {
                    C0313m c0313m = c0298d2.f3624e;
                    C0306f c0306f3 = c0313m.h;
                    C0306f c0306f4 = c0313m.i;
                    boolean z3 = c0298d2.f3599I.f3590f != null;
                    boolean z4 = c0298d2.f3600J.f3590f != null;
                    boolean z5 = c0298d2.f3601K.f3590f != null;
                    boolean z6 = c0298d2.f3602L.f3590f != null;
                    int i4 = c0298d2.f3614X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0298d2.f3613W;
                        boolean z7 = c0306f3.f3758j;
                        int[] iArr = f3763k;
                        if (z7 && c0306f4.f3758j) {
                            if (c0306f.f3754c && c0306f2.f3754c) {
                                m(iArr, ((C0306f) c0306f.f3760l.get(0)).f3757g + c0306f.f3756f, ((C0306f) c0306f2.f3760l.get(0)).f3757g - c0306f2.f3756f, c0306f3.f3757g + c0306f3.f3756f, c0306f4.f3757g - c0306f4.f3756f, f5, i4);
                                c0307g.d(iArr[0]);
                                this.f3774b.f3624e.f3776e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0306f.f3758j;
                        ArrayList arrayList = c0306f3.f3760l;
                        if (z8 && c0306f2.f3758j) {
                            if (!c0306f3.f3754c || !c0306f4.f3754c) {
                                return;
                            }
                            m(iArr, c0306f.f3757g + c0306f.f3756f, c0306f2.f3757g - c0306f2.f3756f, ((C0306f) arrayList.get(0)).f3757g + c0306f3.f3756f, ((C0306f) c0306f4.f3760l.get(0)).f3757g - c0306f4.f3756f, f5, i4);
                            c0307g.d(iArr[0]);
                            this.f3774b.f3624e.f3776e.d(iArr[1]);
                        }
                        if (!c0306f.f3754c || !c0306f2.f3754c || !c0306f3.f3754c || !c0306f4.f3754c) {
                            return;
                        }
                        m(iArr, ((C0306f) c0306f.f3760l.get(0)).f3757g + c0306f.f3756f, ((C0306f) c0306f2.f3760l.get(0)).f3757g - c0306f2.f3756f, ((C0306f) arrayList.get(0)).f3757g + c0306f3.f3756f, ((C0306f) c0306f4.f3760l.get(0)).f3757g - c0306f4.f3756f, f5, i4);
                        c0307g.d(iArr[0]);
                        this.f3774b.f3624e.f3776e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0306f.f3754c || !c0306f2.f3754c) {
                            return;
                        }
                        float f6 = c0298d2.f3613W;
                        int i5 = ((C0306f) c0306f.f3760l.get(0)).f3757g + c0306f.f3756f;
                        int i6 = ((C0306f) c0306f2.f3760l.get(0)).f3757g - c0306f2.f3756f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0307g.d(g2);
                            this.f3774b.f3624e.f3776e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0307g.d(g4);
                            this.f3774b.f3624e.f3776e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0306f3.f3754c || !c0306f4.f3754c) {
                            return;
                        }
                        float f7 = c0298d2.f3613W;
                        int i9 = ((C0306f) c0306f3.f3760l.get(0)).f3757g + c0306f3.f3756f;
                        int i10 = ((C0306f) c0306f4.f3760l.get(0)).f3757g - c0306f4.f3756f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0307g.d(g7);
                                this.f3774b.f3624e.f3776e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0307g.d(g9);
                        this.f3774b.f3624e.f3776e.d(g8);
                    }
                } else {
                    int i13 = c0298d2.f3614X;
                    if (i13 == -1) {
                        f2 = c0298d2.f3624e.f3776e.f3757g;
                        f3 = c0298d2.f3613W;
                    } else if (i13 == 0) {
                        f4 = c0298d2.f3624e.f3776e.f3757g / c0298d2.f3613W;
                        i = (int) (f4 + 0.5f);
                        c0307g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0307g.d(i);
                    } else {
                        f2 = c0298d2.f3624e.f3776e.f3757g;
                        f3 = c0298d2.f3613W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0307g.d(i);
                }
            }
        }
        if (c0306f.f3754c && c0306f2.f3754c) {
            if (c0306f.f3758j && c0306f2.f3758j && c0307g.f3758j) {
                return;
            }
            if (!c0307g.f3758j && this.d == 3) {
                C0298d c0298d4 = this.f3774b;
                if (c0298d4.f3646r == 0 && !c0298d4.x()) {
                    C0306f c0306f5 = (C0306f) c0306f.f3760l.get(0);
                    C0306f c0306f6 = (C0306f) c0306f2.f3760l.get(0);
                    int i14 = c0306f5.f3757g + c0306f.f3756f;
                    int i15 = c0306f6.f3757g + c0306f2.f3756f;
                    c0306f.d(i14);
                    c0306f2.d(i15);
                    c0307g.d(i15 - i14);
                    return;
                }
            }
            if (!c0307g.f3758j && this.d == 3 && this.f3773a == 1 && c0306f.f3760l.size() > 0 && c0306f2.f3760l.size() > 0) {
                int min = Math.min((((C0306f) c0306f2.f3760l.get(0)).f3757g + c0306f2.f3756f) - (((C0306f) c0306f.f3760l.get(0)).f3757g + c0306f.f3756f), c0307g.f3761m);
                C0298d c0298d5 = this.f3774b;
                int i16 = c0298d5.f3650v;
                int max = Math.max(c0298d5.f3649u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0307g.d(max);
            }
            if (c0307g.f3758j) {
                C0306f c0306f7 = (C0306f) c0306f.f3760l.get(0);
                C0306f c0306f8 = (C0306f) c0306f2.f3760l.get(0);
                int i17 = c0306f7.f3757g;
                int i18 = c0306f.f3756f + i17;
                int i19 = c0306f8.f3757g;
                int i20 = c0306f2.f3756f + i19;
                float f8 = this.f3774b.f3623d0;
                if (c0306f7 == c0306f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0306f.d((int) ((((i19 - i17) - c0307g.f3757g) * f8) + i17 + 0.5f));
                c0306f2.d(c0306f.f3757g + c0307g.f3757g);
            }
        }
    }

    @Override // t.AbstractC0315o
    public final void d() {
        C0298d c0298d;
        C0298d c0298d2;
        int i;
        C0298d c0298d3;
        C0298d c0298d4;
        int i2;
        C0298d c0298d5 = this.f3774b;
        boolean z2 = c0298d5.f3617a;
        C0307g c0307g = this.f3776e;
        if (z2) {
            c0307g.d(c0298d5.q());
        }
        boolean z3 = c0307g.f3758j;
        C0306f c0306f = this.i;
        C0306f c0306f2 = this.h;
        if (!z3) {
            C0298d c0298d6 = this.f3774b;
            int i3 = c0298d6.f3644p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0298d4 = c0298d6.f3610T) != null && ((i2 = c0298d4.f3644p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0298d4.q() - this.f3774b.f3599I.e()) - this.f3774b.f3601K.e();
                    AbstractC0315o.b(c0306f2, c0298d4.d.h, this.f3774b.f3599I.e());
                    AbstractC0315o.b(c0306f, c0298d4.d.i, -this.f3774b.f3601K.e());
                    c0307g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0307g.d(c0298d6.q());
                }
            }
        } else if (this.d == 4 && (c0298d2 = (c0298d = this.f3774b).f3610T) != null && ((i = c0298d2.f3644p0[0]) == 1 || i == 4)) {
            AbstractC0315o.b(c0306f2, c0298d2.d.h, c0298d.f3599I.e());
            AbstractC0315o.b(c0306f, c0298d2.d.i, -this.f3774b.f3601K.e());
            return;
        }
        if (c0307g.f3758j) {
            C0298d c0298d7 = this.f3774b;
            if (c0298d7.f3617a) {
                C0297c[] c0297cArr = c0298d7.f3607Q;
                C0297c c0297c = c0297cArr[0];
                C0297c c0297c2 = c0297c.f3590f;
                if (c0297c2 != null && c0297cArr[1].f3590f != null) {
                    if (c0298d7.x()) {
                        c0306f2.f3756f = this.f3774b.f3607Q[0].e();
                        c0306f.f3756f = -this.f3774b.f3607Q[1].e();
                        return;
                    }
                    C0306f h = AbstractC0315o.h(this.f3774b.f3607Q[0]);
                    if (h != null) {
                        AbstractC0315o.b(c0306f2, h, this.f3774b.f3607Q[0].e());
                    }
                    C0306f h2 = AbstractC0315o.h(this.f3774b.f3607Q[1]);
                    if (h2 != null) {
                        AbstractC0315o.b(c0306f, h2, -this.f3774b.f3607Q[1].e());
                    }
                    c0306f2.f3753b = true;
                    c0306f.f3753b = true;
                    return;
                }
                if (c0297c2 != null) {
                    C0306f h3 = AbstractC0315o.h(c0297c);
                    if (h3 != null) {
                        AbstractC0315o.b(c0306f2, h3, this.f3774b.f3607Q[0].e());
                        AbstractC0315o.b(c0306f, c0306f2, c0307g.f3757g);
                        return;
                    }
                    return;
                }
                C0297c c0297c3 = c0297cArr[1];
                if (c0297c3.f3590f != null) {
                    C0306f h4 = AbstractC0315o.h(c0297c3);
                    if (h4 != null) {
                        AbstractC0315o.b(c0306f, h4, -this.f3774b.f3607Q[1].e());
                        AbstractC0315o.b(c0306f2, c0306f, -c0307g.f3757g);
                        return;
                    }
                    return;
                }
                if ((c0298d7 instanceof s.i) || c0298d7.f3610T == null || c0298d7.i(7).f3590f != null) {
                    return;
                }
                C0298d c0298d8 = this.f3774b;
                AbstractC0315o.b(c0306f2, c0298d8.f3610T.d.h, c0298d8.r());
                AbstractC0315o.b(c0306f, c0306f2, c0307g.f3757g);
                return;
            }
        }
        if (this.d == 3) {
            C0298d c0298d9 = this.f3774b;
            int i4 = c0298d9.f3646r;
            if (i4 == 2) {
                C0298d c0298d10 = c0298d9.f3610T;
                if (c0298d10 != null) {
                    C0307g c0307g2 = c0298d10.f3624e.f3776e;
                    c0307g.f3760l.add(c0307g2);
                    c0307g2.f3759k.add(c0307g);
                    c0307g.f3753b = true;
                    c0307g.f3759k.add(c0306f2);
                    c0307g.f3759k.add(c0306f);
                }
            } else if (i4 == 3) {
                if (c0298d9.f3647s == 3) {
                    c0306f2.f3752a = this;
                    c0306f.f3752a = this;
                    C0313m c0313m = c0298d9.f3624e;
                    c0313m.h.f3752a = this;
                    c0313m.i.f3752a = this;
                    c0307g.f3752a = this;
                    if (c0298d9.y()) {
                        c0307g.f3760l.add(this.f3774b.f3624e.f3776e);
                        this.f3774b.f3624e.f3776e.f3759k.add(c0307g);
                        C0313m c0313m2 = this.f3774b.f3624e;
                        c0313m2.f3776e.f3752a = this;
                        c0307g.f3760l.add(c0313m2.h);
                        c0307g.f3760l.add(this.f3774b.f3624e.i);
                        this.f3774b.f3624e.h.f3759k.add(c0307g);
                        this.f3774b.f3624e.i.f3759k.add(c0307g);
                    } else if (this.f3774b.x()) {
                        this.f3774b.f3624e.f3776e.f3760l.add(c0307g);
                        c0307g.f3759k.add(this.f3774b.f3624e.f3776e);
                    } else {
                        this.f3774b.f3624e.f3776e.f3760l.add(c0307g);
                    }
                } else {
                    C0307g c0307g3 = c0298d9.f3624e.f3776e;
                    c0307g.f3760l.add(c0307g3);
                    c0307g3.f3759k.add(c0307g);
                    this.f3774b.f3624e.h.f3759k.add(c0307g);
                    this.f3774b.f3624e.i.f3759k.add(c0307g);
                    c0307g.f3753b = true;
                    c0307g.f3759k.add(c0306f2);
                    c0307g.f3759k.add(c0306f);
                    c0306f2.f3760l.add(c0307g);
                    c0306f.f3760l.add(c0307g);
                }
            }
        }
        C0298d c0298d11 = this.f3774b;
        C0297c[] c0297cArr2 = c0298d11.f3607Q;
        C0297c c0297c4 = c0297cArr2[0];
        C0297c c0297c5 = c0297c4.f3590f;
        if (c0297c5 != null && c0297cArr2[1].f3590f != null) {
            if (c0298d11.x()) {
                c0306f2.f3756f = this.f3774b.f3607Q[0].e();
                c0306f.f3756f = -this.f3774b.f3607Q[1].e();
                return;
            }
            C0306f h5 = AbstractC0315o.h(this.f3774b.f3607Q[0]);
            C0306f h6 = AbstractC0315o.h(this.f3774b.f3607Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3779j = 4;
            return;
        }
        if (c0297c5 != null) {
            C0306f h7 = AbstractC0315o.h(c0297c4);
            if (h7 != null) {
                AbstractC0315o.b(c0306f2, h7, this.f3774b.f3607Q[0].e());
                c(c0306f, c0306f2, 1, c0307g);
                return;
            }
            return;
        }
        C0297c c0297c6 = c0297cArr2[1];
        if (c0297c6.f3590f != null) {
            C0306f h8 = AbstractC0315o.h(c0297c6);
            if (h8 != null) {
                AbstractC0315o.b(c0306f, h8, -this.f3774b.f3607Q[1].e());
                c(c0306f2, c0306f, -1, c0307g);
                return;
            }
            return;
        }
        if ((c0298d11 instanceof s.i) || (c0298d3 = c0298d11.f3610T) == null) {
            return;
        }
        AbstractC0315o.b(c0306f2, c0298d3.d.h, c0298d11.r());
        c(c0306f, c0306f2, 1, c0307g);
    }

    @Override // t.AbstractC0315o
    public final void e() {
        C0306f c0306f = this.h;
        if (c0306f.f3758j) {
            this.f3774b.f3615Y = c0306f.f3757g;
        }
    }

    @Override // t.AbstractC0315o
    public final void f() {
        this.f3775c = null;
        this.h.c();
        this.i.c();
        this.f3776e.c();
        this.f3778g = false;
    }

    @Override // t.AbstractC0315o
    public final boolean k() {
        return this.d != 3 || this.f3774b.f3646r == 0;
    }

    public final void n() {
        this.f3778g = false;
        C0306f c0306f = this.h;
        c0306f.c();
        c0306f.f3758j = false;
        C0306f c0306f2 = this.i;
        c0306f2.c();
        c0306f2.f3758j = false;
        this.f3776e.f3758j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3774b.f3630h0;
    }
}
