package t;

import java.util.ArrayList;
import q.AbstractC0285e;
import s.C0294c;
import s.C0295d;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308k extends AbstractC0312o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3853k = new int[2];

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
        if (AbstractC0285e.a(this.f3869j) == 3) {
            C0295d c0295d = this.f3864b;
            l(c0295d.f3670I, c0295d.f3672K, 0);
            return;
        }
        C0304g c0304g = this.f3866e;
        boolean z2 = c0304g.f3848j;
        C0303f c0303f = this.h;
        C0303f c0303f2 = this.i;
        if (!z2 && this.d == 3) {
            C0295d c0295d2 = this.f3864b;
            int i2 = c0295d2.f3716r;
            if (i2 == 2) {
                C0295d c0295d3 = c0295d2.f3681T;
                if (c0295d3 != null) {
                    if (c0295d3.d.f3866e.f3848j) {
                        c0304g.d((int) ((r3.f3847g * c0295d2.f3721w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0295d2.f3717s;
                if (i3 == 0 || i3 == 3) {
                    C0310m c0310m = c0295d2.f3695e;
                    C0303f c0303f3 = c0310m.h;
                    C0303f c0303f4 = c0310m.i;
                    boolean z3 = c0295d2.f3670I.f3661f != null;
                    boolean z4 = c0295d2.f3671J.f3661f != null;
                    boolean z5 = c0295d2.f3672K.f3661f != null;
                    boolean z6 = c0295d2.f3673L.f3661f != null;
                    int i4 = c0295d2.f3685X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0295d2.f3684W;
                        boolean z7 = c0303f3.f3848j;
                        int[] iArr = f3853k;
                        if (z7 && c0303f4.f3848j) {
                            if (c0303f.f3844c && c0303f2.f3844c) {
                                m(iArr, ((C0303f) c0303f.f3850l.get(0)).f3847g + c0303f.f3846f, ((C0303f) c0303f2.f3850l.get(0)).f3847g - c0303f2.f3846f, c0303f3.f3847g + c0303f3.f3846f, c0303f4.f3847g - c0303f4.f3846f, f5, i4);
                                c0304g.d(iArr[0]);
                                this.f3864b.f3695e.f3866e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0303f.f3848j;
                        ArrayList arrayList = c0303f3.f3850l;
                        if (z8 && c0303f2.f3848j) {
                            if (!c0303f3.f3844c || !c0303f4.f3844c) {
                                return;
                            }
                            m(iArr, c0303f.f3847g + c0303f.f3846f, c0303f2.f3847g - c0303f2.f3846f, ((C0303f) arrayList.get(0)).f3847g + c0303f3.f3846f, ((C0303f) c0303f4.f3850l.get(0)).f3847g - c0303f4.f3846f, f5, i4);
                            c0304g.d(iArr[0]);
                            this.f3864b.f3695e.f3866e.d(iArr[1]);
                        }
                        if (!c0303f.f3844c || !c0303f2.f3844c || !c0303f3.f3844c || !c0303f4.f3844c) {
                            return;
                        }
                        m(iArr, ((C0303f) c0303f.f3850l.get(0)).f3847g + c0303f.f3846f, ((C0303f) c0303f2.f3850l.get(0)).f3847g - c0303f2.f3846f, ((C0303f) arrayList.get(0)).f3847g + c0303f3.f3846f, ((C0303f) c0303f4.f3850l.get(0)).f3847g - c0303f4.f3846f, f5, i4);
                        c0304g.d(iArr[0]);
                        this.f3864b.f3695e.f3866e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0303f.f3844c || !c0303f2.f3844c) {
                            return;
                        }
                        float f6 = c0295d2.f3684W;
                        int i5 = ((C0303f) c0303f.f3850l.get(0)).f3847g + c0303f.f3846f;
                        int i6 = ((C0303f) c0303f2.f3850l.get(0)).f3847g - c0303f2.f3846f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0304g.d(g2);
                            this.f3864b.f3695e.f3866e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0304g.d(g4);
                            this.f3864b.f3695e.f3866e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0303f3.f3844c || !c0303f4.f3844c) {
                            return;
                        }
                        float f7 = c0295d2.f3684W;
                        int i9 = ((C0303f) c0303f3.f3850l.get(0)).f3847g + c0303f3.f3846f;
                        int i10 = ((C0303f) c0303f4.f3850l.get(0)).f3847g - c0303f4.f3846f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0304g.d(g7);
                                this.f3864b.f3695e.f3866e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0304g.d(g9);
                        this.f3864b.f3695e.f3866e.d(g8);
                    }
                } else {
                    int i13 = c0295d2.f3685X;
                    if (i13 == -1) {
                        f2 = c0295d2.f3695e.f3866e.f3847g;
                        f3 = c0295d2.f3684W;
                    } else if (i13 == 0) {
                        f4 = c0295d2.f3695e.f3866e.f3847g / c0295d2.f3684W;
                        i = (int) (f4 + 0.5f);
                        c0304g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0304g.d(i);
                    } else {
                        f2 = c0295d2.f3695e.f3866e.f3847g;
                        f3 = c0295d2.f3684W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0304g.d(i);
                }
            }
        }
        if (c0303f.f3844c && c0303f2.f3844c) {
            if (c0303f.f3848j && c0303f2.f3848j && c0304g.f3848j) {
                return;
            }
            if (!c0304g.f3848j && this.d == 3) {
                C0295d c0295d4 = this.f3864b;
                if (c0295d4.f3716r == 0 && !c0295d4.x()) {
                    C0303f c0303f5 = (C0303f) c0303f.f3850l.get(0);
                    C0303f c0303f6 = (C0303f) c0303f2.f3850l.get(0);
                    int i14 = c0303f5.f3847g + c0303f.f3846f;
                    int i15 = c0303f6.f3847g + c0303f2.f3846f;
                    c0303f.d(i14);
                    c0303f2.d(i15);
                    c0304g.d(i15 - i14);
                    return;
                }
            }
            if (!c0304g.f3848j && this.d == 3 && this.f3863a == 1 && c0303f.f3850l.size() > 0 && c0303f2.f3850l.size() > 0) {
                int min = Math.min((((C0303f) c0303f2.f3850l.get(0)).f3847g + c0303f2.f3846f) - (((C0303f) c0303f.f3850l.get(0)).f3847g + c0303f.f3846f), c0304g.f3851m);
                C0295d c0295d5 = this.f3864b;
                int i16 = c0295d5.f3720v;
                int max = Math.max(c0295d5.f3719u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0304g.d(max);
            }
            if (c0304g.f3848j) {
                C0303f c0303f7 = (C0303f) c0303f.f3850l.get(0);
                C0303f c0303f8 = (C0303f) c0303f2.f3850l.get(0);
                int i17 = c0303f7.f3847g;
                int i18 = c0303f.f3846f + i17;
                int i19 = c0303f8.f3847g;
                int i20 = c0303f2.f3846f + i19;
                float f8 = this.f3864b.f3694d0;
                if (c0303f7 == c0303f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0303f.d((int) ((((i19 - i17) - c0304g.f3847g) * f8) + i17 + 0.5f));
                c0303f2.d(c0303f.f3847g + c0304g.f3847g);
            }
        }
    }

    @Override // t.AbstractC0312o
    public final void d() {
        C0295d c0295d;
        C0295d c0295d2;
        int i;
        C0295d c0295d3;
        C0295d c0295d4;
        int i2;
        C0295d c0295d5 = this.f3864b;
        boolean z2 = c0295d5.f3688a;
        C0304g c0304g = this.f3866e;
        if (z2) {
            c0304g.d(c0295d5.q());
        }
        boolean z3 = c0304g.f3848j;
        C0303f c0303f = this.i;
        C0303f c0303f2 = this.h;
        if (!z3) {
            C0295d c0295d6 = this.f3864b;
            int i3 = c0295d6.f3714p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0295d4 = c0295d6.f3681T) != null && ((i2 = c0295d4.f3714p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0295d4.q() - this.f3864b.f3670I.e()) - this.f3864b.f3672K.e();
                    AbstractC0312o.b(c0303f2, c0295d4.d.h, this.f3864b.f3670I.e());
                    AbstractC0312o.b(c0303f, c0295d4.d.i, -this.f3864b.f3672K.e());
                    c0304g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0304g.d(c0295d6.q());
                }
            }
        } else if (this.d == 4 && (c0295d2 = (c0295d = this.f3864b).f3681T) != null && ((i = c0295d2.f3714p0[0]) == 1 || i == 4)) {
            AbstractC0312o.b(c0303f2, c0295d2.d.h, c0295d.f3670I.e());
            AbstractC0312o.b(c0303f, c0295d2.d.i, -this.f3864b.f3672K.e());
            return;
        }
        if (c0304g.f3848j) {
            C0295d c0295d7 = this.f3864b;
            if (c0295d7.f3688a) {
                C0294c[] c0294cArr = c0295d7.f3678Q;
                C0294c c0294c = c0294cArr[0];
                C0294c c0294c2 = c0294c.f3661f;
                if (c0294c2 != null && c0294cArr[1].f3661f != null) {
                    if (c0295d7.x()) {
                        c0303f2.f3846f = this.f3864b.f3678Q[0].e();
                        c0303f.f3846f = -this.f3864b.f3678Q[1].e();
                        return;
                    }
                    C0303f h = AbstractC0312o.h(this.f3864b.f3678Q[0]);
                    if (h != null) {
                        AbstractC0312o.b(c0303f2, h, this.f3864b.f3678Q[0].e());
                    }
                    C0303f h2 = AbstractC0312o.h(this.f3864b.f3678Q[1]);
                    if (h2 != null) {
                        AbstractC0312o.b(c0303f, h2, -this.f3864b.f3678Q[1].e());
                    }
                    c0303f2.f3843b = true;
                    c0303f.f3843b = true;
                    return;
                }
                if (c0294c2 != null) {
                    C0303f h3 = AbstractC0312o.h(c0294c);
                    if (h3 != null) {
                        AbstractC0312o.b(c0303f2, h3, this.f3864b.f3678Q[0].e());
                        AbstractC0312o.b(c0303f, c0303f2, c0304g.f3847g);
                        return;
                    }
                    return;
                }
                C0294c c0294c3 = c0294cArr[1];
                if (c0294c3.f3661f != null) {
                    C0303f h4 = AbstractC0312o.h(c0294c3);
                    if (h4 != null) {
                        AbstractC0312o.b(c0303f, h4, -this.f3864b.f3678Q[1].e());
                        AbstractC0312o.b(c0303f2, c0303f, -c0304g.f3847g);
                        return;
                    }
                    return;
                }
                if ((c0295d7 instanceof s.i) || c0295d7.f3681T == null || c0295d7.i(7).f3661f != null) {
                    return;
                }
                C0295d c0295d8 = this.f3864b;
                AbstractC0312o.b(c0303f2, c0295d8.f3681T.d.h, c0295d8.r());
                AbstractC0312o.b(c0303f, c0303f2, c0304g.f3847g);
                return;
            }
        }
        if (this.d == 3) {
            C0295d c0295d9 = this.f3864b;
            int i4 = c0295d9.f3716r;
            if (i4 == 2) {
                C0295d c0295d10 = c0295d9.f3681T;
                if (c0295d10 != null) {
                    C0304g c0304g2 = c0295d10.f3695e.f3866e;
                    c0304g.f3850l.add(c0304g2);
                    c0304g2.f3849k.add(c0304g);
                    c0304g.f3843b = true;
                    c0304g.f3849k.add(c0303f2);
                    c0304g.f3849k.add(c0303f);
                }
            } else if (i4 == 3) {
                if (c0295d9.f3717s == 3) {
                    c0303f2.f3842a = this;
                    c0303f.f3842a = this;
                    C0310m c0310m = c0295d9.f3695e;
                    c0310m.h.f3842a = this;
                    c0310m.i.f3842a = this;
                    c0304g.f3842a = this;
                    if (c0295d9.y()) {
                        c0304g.f3850l.add(this.f3864b.f3695e.f3866e);
                        this.f3864b.f3695e.f3866e.f3849k.add(c0304g);
                        C0310m c0310m2 = this.f3864b.f3695e;
                        c0310m2.f3866e.f3842a = this;
                        c0304g.f3850l.add(c0310m2.h);
                        c0304g.f3850l.add(this.f3864b.f3695e.i);
                        this.f3864b.f3695e.h.f3849k.add(c0304g);
                        this.f3864b.f3695e.i.f3849k.add(c0304g);
                    } else if (this.f3864b.x()) {
                        this.f3864b.f3695e.f3866e.f3850l.add(c0304g);
                        c0304g.f3849k.add(this.f3864b.f3695e.f3866e);
                    } else {
                        this.f3864b.f3695e.f3866e.f3850l.add(c0304g);
                    }
                } else {
                    C0304g c0304g3 = c0295d9.f3695e.f3866e;
                    c0304g.f3850l.add(c0304g3);
                    c0304g3.f3849k.add(c0304g);
                    this.f3864b.f3695e.h.f3849k.add(c0304g);
                    this.f3864b.f3695e.i.f3849k.add(c0304g);
                    c0304g.f3843b = true;
                    c0304g.f3849k.add(c0303f2);
                    c0304g.f3849k.add(c0303f);
                    c0303f2.f3850l.add(c0304g);
                    c0303f.f3850l.add(c0304g);
                }
            }
        }
        C0295d c0295d11 = this.f3864b;
        C0294c[] c0294cArr2 = c0295d11.f3678Q;
        C0294c c0294c4 = c0294cArr2[0];
        C0294c c0294c5 = c0294c4.f3661f;
        if (c0294c5 != null && c0294cArr2[1].f3661f != null) {
            if (c0295d11.x()) {
                c0303f2.f3846f = this.f3864b.f3678Q[0].e();
                c0303f.f3846f = -this.f3864b.f3678Q[1].e();
                return;
            }
            C0303f h5 = AbstractC0312o.h(this.f3864b.f3678Q[0]);
            C0303f h6 = AbstractC0312o.h(this.f3864b.f3678Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3869j = 4;
            return;
        }
        if (c0294c5 != null) {
            C0303f h7 = AbstractC0312o.h(c0294c4);
            if (h7 != null) {
                AbstractC0312o.b(c0303f2, h7, this.f3864b.f3678Q[0].e());
                c(c0303f, c0303f2, 1, c0304g);
                return;
            }
            return;
        }
        C0294c c0294c6 = c0294cArr2[1];
        if (c0294c6.f3661f != null) {
            C0303f h8 = AbstractC0312o.h(c0294c6);
            if (h8 != null) {
                AbstractC0312o.b(c0303f, h8, -this.f3864b.f3678Q[1].e());
                c(c0303f2, c0303f, -1, c0304g);
                return;
            }
            return;
        }
        if ((c0295d11 instanceof s.i) || (c0295d3 = c0295d11.f3681T) == null) {
            return;
        }
        AbstractC0312o.b(c0303f2, c0295d3.d.h, c0295d11.r());
        c(c0303f, c0303f2, 1, c0304g);
    }

    @Override // t.AbstractC0312o
    public final void e() {
        C0303f c0303f = this.h;
        if (c0303f.f3848j) {
            this.f3864b.f3686Y = c0303f.f3847g;
        }
    }

    @Override // t.AbstractC0312o
    public final void f() {
        this.f3865c = null;
        this.h.c();
        this.i.c();
        this.f3866e.c();
        this.f3868g = false;
    }

    @Override // t.AbstractC0312o
    public final boolean k() {
        return this.d != 3 || this.f3864b.f3716r == 0;
    }

    public final void n() {
        this.f3868g = false;
        C0303f c0303f = this.h;
        c0303f.c();
        c0303f.f3848j = false;
        C0303f c0303f2 = this.i;
        c0303f2.c();
        c0303f2.f3848j = false;
        this.f3866e.f3848j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3864b.f3701h0;
    }
}
