package v;

import s.AbstractC0267e;
import u.C0274c;
import u.C0275d;

/* renamed from: v.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290m extends AbstractC0292o {

    /* renamed from: k, reason: collision with root package name */
    public C0283f f3828k;

    /* renamed from: l, reason: collision with root package name */
    public C0278a f3829l;

    @Override // v.InterfaceC0281d
    public final void a(InterfaceC0281d interfaceC0281d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0267e.a(this.f3841j) == 3) {
            C0275d c0275d = this.f3836b;
            l(c0275d.f3649J, c0275d.f3651L, 1);
            return;
        }
        C0284g c0284g = this.f3838e;
        if (c0284g.f3816c && !c0284g.f3820j && this.d == 3) {
            C0275d c0275d2 = this.f3836b;
            int i2 = c0275d2.f3696s;
            if (i2 == 2) {
                C0275d c0275d3 = c0275d2.f3659T;
                if (c0275d3 != null) {
                    if (c0275d3.f3673e.f3838e.f3820j) {
                        c0284g.d((int) ((r5.f3819g * c0275d2.f3703z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0284g c0284g2 = c0275d2.d.f3838e;
                if (c0284g2.f3820j) {
                    int i3 = c0275d2.f3663X;
                    if (i3 == -1) {
                        f2 = c0284g2.f3819g;
                        f3 = c0275d2.f3662W;
                    } else if (i3 == 0) {
                        f4 = c0284g2.f3819g * c0275d2.f3662W;
                        i = (int) (f4 + 0.5f);
                        c0284g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0284g.d(i);
                    } else {
                        f2 = c0284g2.f3819g;
                        f3 = c0275d2.f3662W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0284g.d(i);
                }
            }
        }
        C0283f c0283f = this.h;
        if (c0283f.f3816c) {
            C0283f c0283f2 = this.i;
            if (c0283f2.f3816c) {
                if (c0283f.f3820j && c0283f2.f3820j && c0284g.f3820j) {
                    return;
                }
                if (!c0284g.f3820j && this.d == 3) {
                    C0275d c0275d4 = this.f3836b;
                    if (c0275d4.f3695r == 0 && !c0275d4.y()) {
                        C0283f c0283f3 = (C0283f) c0283f.f3822l.get(0);
                        C0283f c0283f4 = (C0283f) c0283f2.f3822l.get(0);
                        int i4 = c0283f3.f3819g + c0283f.f3818f;
                        int i5 = c0283f4.f3819g + c0283f2.f3818f;
                        c0283f.d(i4);
                        c0283f2.d(i5);
                        c0284g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0284g.f3820j && this.d == 3 && this.f3835a == 1 && c0283f.f3822l.size() > 0 && c0283f2.f3822l.size() > 0) {
                    C0283f c0283f5 = (C0283f) c0283f.f3822l.get(0);
                    int i6 = (((C0283f) c0283f2.f3822l.get(0)).f3819g + c0283f2.f3818f) - (c0283f5.f3819g + c0283f.f3818f);
                    int i7 = c0284g.f3823m;
                    if (i6 < i7) {
                        c0284g.d(i6);
                    } else {
                        c0284g.d(i7);
                    }
                }
                if (c0284g.f3820j && c0283f.f3822l.size() > 0 && c0283f2.f3822l.size() > 0) {
                    C0283f c0283f6 = (C0283f) c0283f.f3822l.get(0);
                    C0283f c0283f7 = (C0283f) c0283f2.f3822l.get(0);
                    int i8 = c0283f6.f3819g;
                    int i9 = c0283f.f3818f + i8;
                    int i10 = c0283f7.f3819g;
                    int i11 = c0283f2.f3818f + i10;
                    float f5 = this.f3836b.f3674e0;
                    if (c0283f6 == c0283f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0283f.d((int) ((((i10 - i8) - c0284g.f3819g) * f5) + i8 + 0.5f));
                    c0283f2.d(c0283f.f3819g + c0284g.f3819g);
                }
            }
        }
    }

    @Override // v.AbstractC0292o
    public final void d() {
        C0275d c0275d;
        C0275d c0275d2;
        C0275d c0275d3;
        C0275d c0275d4;
        C0275d c0275d5 = this.f3836b;
        boolean z2 = c0275d5.f3666a;
        C0284g c0284g = this.f3838e;
        if (z2) {
            c0284g.d(c0275d5.k());
        }
        boolean z3 = c0284g.f3820j;
        C0283f c0283f = this.i;
        C0283f c0283f2 = this.h;
        if (!z3) {
            C0275d c0275d6 = this.f3836b;
            this.d = c0275d6.p0[1];
            if (c0275d6.f3645E) {
                this.f3829l = new C0278a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0275d4 = this.f3836b.f3659T) != null && c0275d4.p0[1] == 1) {
                    int k2 = (c0275d4.k() - this.f3836b.f3649J.e()) - this.f3836b.f3651L.e();
                    AbstractC0292o.b(c0283f2, c0275d4.f3673e.h, this.f3836b.f3649J.e());
                    AbstractC0292o.b(c0283f, c0275d4.f3673e.i, -this.f3836b.f3651L.e());
                    c0284g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0284g.d(this.f3836b.k());
                }
            }
        } else if (this.d == 4 && (c0275d2 = (c0275d = this.f3836b).f3659T) != null && c0275d2.p0[1] == 1) {
            AbstractC0292o.b(c0283f2, c0275d2.f3673e.h, c0275d.f3649J.e());
            AbstractC0292o.b(c0283f, c0275d2.f3673e.i, -this.f3836b.f3651L.e());
            return;
        }
        boolean z4 = c0284g.f3820j;
        C0283f c0283f3 = this.f3828k;
        if (z4) {
            C0275d c0275d7 = this.f3836b;
            if (c0275d7.f3666a) {
                C0274c[] c0274cArr = c0275d7.f3656Q;
                C0274c c0274c = c0274cArr[2];
                C0274c c0274c2 = c0274c.f3639f;
                if (c0274c2 != null && c0274cArr[3].f3639f != null) {
                    if (c0275d7.y()) {
                        c0283f2.f3818f = this.f3836b.f3656Q[2].e();
                        c0283f.f3818f = -this.f3836b.f3656Q[3].e();
                    } else {
                        C0283f h = AbstractC0292o.h(this.f3836b.f3656Q[2]);
                        if (h != null) {
                            AbstractC0292o.b(c0283f2, h, this.f3836b.f3656Q[2].e());
                        }
                        C0283f h2 = AbstractC0292o.h(this.f3836b.f3656Q[3]);
                        if (h2 != null) {
                            AbstractC0292o.b(c0283f, h2, -this.f3836b.f3656Q[3].e());
                        }
                        c0283f2.f3815b = true;
                        c0283f.f3815b = true;
                    }
                    C0275d c0275d8 = this.f3836b;
                    if (c0275d8.f3645E) {
                        AbstractC0292o.b(c0283f3, c0283f2, c0275d8.f3667a0);
                        return;
                    }
                    return;
                }
                if (c0274c2 != null) {
                    C0283f h3 = AbstractC0292o.h(c0274c);
                    if (h3 != null) {
                        AbstractC0292o.b(c0283f2, h3, this.f3836b.f3656Q[2].e());
                        AbstractC0292o.b(c0283f, c0283f2, c0284g.f3819g);
                        C0275d c0275d9 = this.f3836b;
                        if (c0275d9.f3645E) {
                            AbstractC0292o.b(c0283f3, c0283f2, c0275d9.f3667a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0274c c0274c3 = c0274cArr[3];
                if (c0274c3.f3639f != null) {
                    C0283f h4 = AbstractC0292o.h(c0274c3);
                    if (h4 != null) {
                        AbstractC0292o.b(c0283f, h4, -this.f3836b.f3656Q[3].e());
                        AbstractC0292o.b(c0283f2, c0283f, -c0284g.f3819g);
                    }
                    C0275d c0275d10 = this.f3836b;
                    if (c0275d10.f3645E) {
                        AbstractC0292o.b(c0283f3, c0283f2, c0275d10.f3667a0);
                        return;
                    }
                    return;
                }
                C0274c c0274c4 = c0274cArr[4];
                if (c0274c4.f3639f != null) {
                    C0283f h5 = AbstractC0292o.h(c0274c4);
                    if (h5 != null) {
                        AbstractC0292o.b(c0283f3, h5, 0);
                        AbstractC0292o.b(c0283f2, c0283f3, -this.f3836b.f3667a0);
                        AbstractC0292o.b(c0283f, c0283f2, c0284g.f3819g);
                        return;
                    }
                    return;
                }
                if ((c0275d7 instanceof u.i) || c0275d7.f3659T == null || c0275d7.i(7).f3639f != null) {
                    return;
                }
                C0275d c0275d11 = this.f3836b;
                AbstractC0292o.b(c0283f2, c0275d11.f3659T.f3673e.h, c0275d11.s());
                AbstractC0292o.b(c0283f, c0283f2, c0284g.f3819g);
                C0275d c0275d12 = this.f3836b;
                if (c0275d12.f3645E) {
                    AbstractC0292o.b(c0283f3, c0283f2, c0275d12.f3667a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            c0284g.b(this);
        } else {
            C0275d c0275d13 = this.f3836b;
            int i2 = c0275d13.f3696s;
            if (i2 == 2) {
                C0275d c0275d14 = c0275d13.f3659T;
                if (c0275d14 != null) {
                    C0284g c0284g2 = c0275d14.f3673e.f3838e;
                    c0284g.f3822l.add(c0284g2);
                    c0284g2.f3821k.add(c0284g);
                    c0284g.f3815b = true;
                    c0284g.f3821k.add(c0283f2);
                    c0284g.f3821k.add(c0283f);
                }
            } else if (i2 == 3 && !c0275d13.y()) {
                C0275d c0275d15 = this.f3836b;
                if (c0275d15.f3695r != 3) {
                    C0284g c0284g3 = c0275d15.d.f3838e;
                    c0284g.f3822l.add(c0284g3);
                    c0284g3.f3821k.add(c0284g);
                    c0284g.f3815b = true;
                    c0284g.f3821k.add(c0283f2);
                    c0284g.f3821k.add(c0283f);
                }
            }
        }
        C0275d c0275d16 = this.f3836b;
        C0274c[] c0274cArr2 = c0275d16.f3656Q;
        C0274c c0274c5 = c0274cArr2[2];
        C0274c c0274c6 = c0274c5.f3639f;
        if (c0274c6 != null && c0274cArr2[3].f3639f != null) {
            if (c0275d16.y()) {
                c0283f2.f3818f = this.f3836b.f3656Q[2].e();
                c0283f.f3818f = -this.f3836b.f3656Q[3].e();
            } else {
                C0283f h6 = AbstractC0292o.h(this.f3836b.f3656Q[2]);
                C0283f h7 = AbstractC0292o.h(this.f3836b.f3656Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3841j = 4;
            }
            if (this.f3836b.f3645E) {
                c(c0283f3, c0283f2, 1, this.f3829l);
            }
        } else if (c0274c6 != null) {
            C0283f h8 = AbstractC0292o.h(c0274c5);
            if (h8 != null) {
                AbstractC0292o.b(c0283f2, h8, this.f3836b.f3656Q[2].e());
                c(c0283f, c0283f2, 1, c0284g);
                if (this.f3836b.f3645E) {
                    c(c0283f3, c0283f2, 1, this.f3829l);
                }
                if (this.d == 3) {
                    C0275d c0275d17 = this.f3836b;
                    if (c0275d17.f3662W > 0.0f) {
                        C0288k c0288k = c0275d17.d;
                        if (c0288k.d == 3) {
                            c0288k.f3838e.f3821k.add(c0284g);
                            c0284g.f3822l.add(this.f3836b.d.f3838e);
                            c0284g.f3814a = this;
                        }
                    }
                }
            }
        } else {
            C0274c c0274c7 = c0274cArr2[3];
            if (c0274c7.f3639f != null) {
                C0283f h9 = AbstractC0292o.h(c0274c7);
                if (h9 != null) {
                    AbstractC0292o.b(c0283f, h9, -this.f3836b.f3656Q[3].e());
                    c(c0283f2, c0283f, -1, c0284g);
                    if (this.f3836b.f3645E) {
                        c(c0283f3, c0283f2, 1, this.f3829l);
                    }
                }
            } else {
                C0274c c0274c8 = c0274cArr2[4];
                if (c0274c8.f3639f != null) {
                    C0283f h10 = AbstractC0292o.h(c0274c8);
                    if (h10 != null) {
                        AbstractC0292o.b(c0283f3, h10, 0);
                        c(c0283f2, c0283f3, -1, this.f3829l);
                        c(c0283f, c0283f2, 1, c0284g);
                    }
                } else if (!(c0275d16 instanceof u.i) && (c0275d3 = c0275d16.f3659T) != null) {
                    AbstractC0292o.b(c0283f2, c0275d3.f3673e.h, c0275d16.s());
                    c(c0283f, c0283f2, 1, c0284g);
                    if (this.f3836b.f3645E) {
                        c(c0283f3, c0283f2, 1, this.f3829l);
                    }
                    if (this.d == 3) {
                        C0275d c0275d18 = this.f3836b;
                        if (c0275d18.f3662W > 0.0f) {
                            C0288k c0288k2 = c0275d18.d;
                            if (c0288k2.d == 3) {
                                c0288k2.f3838e.f3821k.add(c0284g);
                                c0284g.f3822l.add(this.f3836b.d.f3838e);
                                c0284g.f3814a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0284g.f3822l.size() == 0) {
            c0284g.f3816c = true;
        }
    }

    @Override // v.AbstractC0292o
    public final void e() {
        C0283f c0283f = this.h;
        if (c0283f.f3820j) {
            this.f3836b.f3665Z = c0283f.f3819g;
        }
    }

    @Override // v.AbstractC0292o
    public final void f() {
        this.f3837c = null;
        this.h.c();
        this.i.c();
        this.f3828k.c();
        this.f3838e.c();
        this.f3840g = false;
    }

    @Override // v.AbstractC0292o
    public final boolean k() {
        return this.d != 3 || this.f3836b.f3696s == 0;
    }

    public final void m() {
        this.f3840g = false;
        C0283f c0283f = this.h;
        c0283f.c();
        c0283f.f3820j = false;
        C0283f c0283f2 = this.i;
        c0283f2.c();
        c0283f2.f3820j = false;
        C0283f c0283f3 = this.f3828k;
        c0283f3.c();
        c0283f3.f3820j = false;
        this.f3838e.f3820j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3836b.f3679h0;
    }
}
