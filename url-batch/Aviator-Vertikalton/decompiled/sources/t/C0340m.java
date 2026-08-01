package t;

import q.AbstractC0317e;
import s.C0324c;
import s.C0325d;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340m extends AbstractC0342o {

    /* renamed from: k, reason: collision with root package name */
    public C0333f f4183k;

    /* renamed from: l, reason: collision with root package name */
    public C0328a f4184l;

    @Override // t.InterfaceC0331d
    public final void a(InterfaceC0331d interfaceC0331d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0317e.a(this.f4198j) == 3) {
            C0325d c0325d = this.f4192b;
            l(c0325d.f4013J, c0325d.f4015L, 1);
            return;
        }
        C0334g c0334g = this.f4195e;
        if (c0334g.f4170c && !c0334g.f4175j && this.f4194d == 3) {
            C0325d c0325d2 = this.f4192b;
            int i2 = c0325d2.f4060s;
            if (i2 == 2) {
                C0325d c0325d3 = c0325d2.f4023T;
                if (c0325d3 != null) {
                    if (c0325d3.f4038e.f4195e.f4175j) {
                        c0334g.d((int) ((r5.f4174g * c0325d2.f4067z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0334g c0334g2 = c0325d2.f4036d.f4195e;
                if (c0334g2.f4175j) {
                    int i3 = c0325d2.f4027X;
                    if (i3 == -1) {
                        f2 = c0334g2.f4174g;
                        f3 = c0325d2.f4026W;
                    } else if (i3 == 0) {
                        f4 = c0334g2.f4174g * c0325d2.f4026W;
                        i = (int) (f4 + 0.5f);
                        c0334g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0334g.d(i);
                    } else {
                        f2 = c0334g2.f4174g;
                        f3 = c0325d2.f4026W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0334g.d(i);
                }
            }
        }
        C0333f c0333f = this.h;
        if (c0333f.f4170c) {
            C0333f c0333f2 = this.i;
            if (c0333f2.f4170c) {
                if (c0333f.f4175j && c0333f2.f4175j && c0334g.f4175j) {
                    return;
                }
                if (!c0334g.f4175j && this.f4194d == 3) {
                    C0325d c0325d4 = this.f4192b;
                    if (c0325d4.f4059r == 0 && !c0325d4.y()) {
                        C0333f c0333f3 = (C0333f) c0333f.f4177l.get(0);
                        C0333f c0333f4 = (C0333f) c0333f2.f4177l.get(0);
                        int i4 = c0333f3.f4174g + c0333f.f4173f;
                        int i5 = c0333f4.f4174g + c0333f2.f4173f;
                        c0333f.d(i4);
                        c0333f2.d(i5);
                        c0334g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0334g.f4175j && this.f4194d == 3 && this.f4191a == 1 && c0333f.f4177l.size() > 0 && c0333f2.f4177l.size() > 0) {
                    C0333f c0333f5 = (C0333f) c0333f.f4177l.get(0);
                    int i6 = (((C0333f) c0333f2.f4177l.get(0)).f4174g + c0333f2.f4173f) - (c0333f5.f4174g + c0333f.f4173f);
                    int i7 = c0334g.f4178m;
                    if (i6 < i7) {
                        c0334g.d(i6);
                    } else {
                        c0334g.d(i7);
                    }
                }
                if (c0334g.f4175j && c0333f.f4177l.size() > 0 && c0333f2.f4177l.size() > 0) {
                    C0333f c0333f6 = (C0333f) c0333f.f4177l.get(0);
                    C0333f c0333f7 = (C0333f) c0333f2.f4177l.get(0);
                    int i8 = c0333f6.f4174g;
                    int i9 = c0333f.f4173f + i8;
                    int i10 = c0333f7.f4174g;
                    int i11 = c0333f2.f4173f + i10;
                    float f5 = this.f4192b.f4039e0;
                    if (c0333f6 == c0333f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0333f.d((int) ((((i10 - i8) - c0334g.f4174g) * f5) + i8 + 0.5f));
                    c0333f2.d(c0333f.f4174g + c0334g.f4174g);
                }
            }
        }
    }

    @Override // t.AbstractC0342o
    public final void d() {
        C0325d c0325d;
        C0325d c0325d2;
        C0325d c0325d3;
        C0325d c0325d4;
        C0325d c0325d5 = this.f4192b;
        boolean z2 = c0325d5.f4030a;
        C0334g c0334g = this.f4195e;
        if (z2) {
            c0334g.d(c0325d5.k());
        }
        boolean z3 = c0334g.f4175j;
        C0333f c0333f = this.i;
        C0333f c0333f2 = this.h;
        if (!z3) {
            C0325d c0325d6 = this.f4192b;
            this.f4194d = c0325d6.f4057p0[1];
            if (c0325d6.f4009E) {
                this.f4184l = new C0328a(this);
            }
            int i = this.f4194d;
            if (i != 3) {
                if (i == 4 && (c0325d4 = this.f4192b.f4023T) != null && c0325d4.f4057p0[1] == 1) {
                    int k2 = (c0325d4.k() - this.f4192b.f4013J.e()) - this.f4192b.f4015L.e();
                    AbstractC0342o.b(c0333f2, c0325d4.f4038e.h, this.f4192b.f4013J.e());
                    AbstractC0342o.b(c0333f, c0325d4.f4038e.i, -this.f4192b.f4015L.e());
                    c0334g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0334g.d(this.f4192b.k());
                }
            }
        } else if (this.f4194d == 4 && (c0325d2 = (c0325d = this.f4192b).f4023T) != null && c0325d2.f4057p0[1] == 1) {
            AbstractC0342o.b(c0333f2, c0325d2.f4038e.h, c0325d.f4013J.e());
            AbstractC0342o.b(c0333f, c0325d2.f4038e.i, -this.f4192b.f4015L.e());
            return;
        }
        boolean z4 = c0334g.f4175j;
        C0333f c0333f3 = this.f4183k;
        if (z4) {
            C0325d c0325d7 = this.f4192b;
            if (c0325d7.f4030a) {
                C0324c[] c0324cArr = c0325d7.f4020Q;
                C0324c c0324c = c0324cArr[2];
                C0324c c0324c2 = c0324c.f4003f;
                if (c0324c2 != null && c0324cArr[3].f4003f != null) {
                    if (c0325d7.y()) {
                        c0333f2.f4173f = this.f4192b.f4020Q[2].e();
                        c0333f.f4173f = -this.f4192b.f4020Q[3].e();
                    } else {
                        C0333f h = AbstractC0342o.h(this.f4192b.f4020Q[2]);
                        if (h != null) {
                            AbstractC0342o.b(c0333f2, h, this.f4192b.f4020Q[2].e());
                        }
                        C0333f h2 = AbstractC0342o.h(this.f4192b.f4020Q[3]);
                        if (h2 != null) {
                            AbstractC0342o.b(c0333f, h2, -this.f4192b.f4020Q[3].e());
                        }
                        c0333f2.f4169b = true;
                        c0333f.f4169b = true;
                    }
                    C0325d c0325d8 = this.f4192b;
                    if (c0325d8.f4009E) {
                        AbstractC0342o.b(c0333f3, c0333f2, c0325d8.f4031a0);
                        return;
                    }
                    return;
                }
                if (c0324c2 != null) {
                    C0333f h3 = AbstractC0342o.h(c0324c);
                    if (h3 != null) {
                        AbstractC0342o.b(c0333f2, h3, this.f4192b.f4020Q[2].e());
                        AbstractC0342o.b(c0333f, c0333f2, c0334g.f4174g);
                        C0325d c0325d9 = this.f4192b;
                        if (c0325d9.f4009E) {
                            AbstractC0342o.b(c0333f3, c0333f2, c0325d9.f4031a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0324c c0324c3 = c0324cArr[3];
                if (c0324c3.f4003f != null) {
                    C0333f h4 = AbstractC0342o.h(c0324c3);
                    if (h4 != null) {
                        AbstractC0342o.b(c0333f, h4, -this.f4192b.f4020Q[3].e());
                        AbstractC0342o.b(c0333f2, c0333f, -c0334g.f4174g);
                    }
                    C0325d c0325d10 = this.f4192b;
                    if (c0325d10.f4009E) {
                        AbstractC0342o.b(c0333f3, c0333f2, c0325d10.f4031a0);
                        return;
                    }
                    return;
                }
                C0324c c0324c4 = c0324cArr[4];
                if (c0324c4.f4003f != null) {
                    C0333f h5 = AbstractC0342o.h(c0324c4);
                    if (h5 != null) {
                        AbstractC0342o.b(c0333f3, h5, 0);
                        AbstractC0342o.b(c0333f2, c0333f3, -this.f4192b.f4031a0);
                        AbstractC0342o.b(c0333f, c0333f2, c0334g.f4174g);
                        return;
                    }
                    return;
                }
                if ((c0325d7 instanceof s.i) || c0325d7.f4023T == null || c0325d7.i(7).f4003f != null) {
                    return;
                }
                C0325d c0325d11 = this.f4192b;
                AbstractC0342o.b(c0333f2, c0325d11.f4023T.f4038e.h, c0325d11.s());
                AbstractC0342o.b(c0333f, c0333f2, c0334g.f4174g);
                C0325d c0325d12 = this.f4192b;
                if (c0325d12.f4009E) {
                    AbstractC0342o.b(c0333f3, c0333f2, c0325d12.f4031a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.f4194d != 3) {
            c0334g.b(this);
        } else {
            C0325d c0325d13 = this.f4192b;
            int i2 = c0325d13.f4060s;
            if (i2 == 2) {
                C0325d c0325d14 = c0325d13.f4023T;
                if (c0325d14 != null) {
                    C0334g c0334g2 = c0325d14.f4038e.f4195e;
                    c0334g.f4177l.add(c0334g2);
                    c0334g2.f4176k.add(c0334g);
                    c0334g.f4169b = true;
                    c0334g.f4176k.add(c0333f2);
                    c0334g.f4176k.add(c0333f);
                }
            } else if (i2 == 3 && !c0325d13.y()) {
                C0325d c0325d15 = this.f4192b;
                if (c0325d15.f4059r != 3) {
                    C0334g c0334g3 = c0325d15.f4036d.f4195e;
                    c0334g.f4177l.add(c0334g3);
                    c0334g3.f4176k.add(c0334g);
                    c0334g.f4169b = true;
                    c0334g.f4176k.add(c0333f2);
                    c0334g.f4176k.add(c0333f);
                }
            }
        }
        C0325d c0325d16 = this.f4192b;
        C0324c[] c0324cArr2 = c0325d16.f4020Q;
        C0324c c0324c5 = c0324cArr2[2];
        C0324c c0324c6 = c0324c5.f4003f;
        if (c0324c6 != null && c0324cArr2[3].f4003f != null) {
            if (c0325d16.y()) {
                c0333f2.f4173f = this.f4192b.f4020Q[2].e();
                c0333f.f4173f = -this.f4192b.f4020Q[3].e();
            } else {
                C0333f h6 = AbstractC0342o.h(this.f4192b.f4020Q[2]);
                C0333f h7 = AbstractC0342o.h(this.f4192b.f4020Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f4198j = 4;
            }
            if (this.f4192b.f4009E) {
                c(c0333f3, c0333f2, 1, this.f4184l);
            }
        } else if (c0324c6 != null) {
            C0333f h8 = AbstractC0342o.h(c0324c5);
            if (h8 != null) {
                AbstractC0342o.b(c0333f2, h8, this.f4192b.f4020Q[2].e());
                c(c0333f, c0333f2, 1, c0334g);
                if (this.f4192b.f4009E) {
                    c(c0333f3, c0333f2, 1, this.f4184l);
                }
                if (this.f4194d == 3) {
                    C0325d c0325d17 = this.f4192b;
                    if (c0325d17.f4026W > 0.0f) {
                        C0338k c0338k = c0325d17.f4036d;
                        if (c0338k.f4194d == 3) {
                            c0338k.f4195e.f4176k.add(c0334g);
                            c0334g.f4177l.add(this.f4192b.f4036d.f4195e);
                            c0334g.f4168a = this;
                        }
                    }
                }
            }
        } else {
            C0324c c0324c7 = c0324cArr2[3];
            if (c0324c7.f4003f != null) {
                C0333f h9 = AbstractC0342o.h(c0324c7);
                if (h9 != null) {
                    AbstractC0342o.b(c0333f, h9, -this.f4192b.f4020Q[3].e());
                    c(c0333f2, c0333f, -1, c0334g);
                    if (this.f4192b.f4009E) {
                        c(c0333f3, c0333f2, 1, this.f4184l);
                    }
                }
            } else {
                C0324c c0324c8 = c0324cArr2[4];
                if (c0324c8.f4003f != null) {
                    C0333f h10 = AbstractC0342o.h(c0324c8);
                    if (h10 != null) {
                        AbstractC0342o.b(c0333f3, h10, 0);
                        c(c0333f2, c0333f3, -1, this.f4184l);
                        c(c0333f, c0333f2, 1, c0334g);
                    }
                } else if (!(c0325d16 instanceof s.i) && (c0325d3 = c0325d16.f4023T) != null) {
                    AbstractC0342o.b(c0333f2, c0325d3.f4038e.h, c0325d16.s());
                    c(c0333f, c0333f2, 1, c0334g);
                    if (this.f4192b.f4009E) {
                        c(c0333f3, c0333f2, 1, this.f4184l);
                    }
                    if (this.f4194d == 3) {
                        C0325d c0325d18 = this.f4192b;
                        if (c0325d18.f4026W > 0.0f) {
                            C0338k c0338k2 = c0325d18.f4036d;
                            if (c0338k2.f4194d == 3) {
                                c0338k2.f4195e.f4176k.add(c0334g);
                                c0334g.f4177l.add(this.f4192b.f4036d.f4195e);
                                c0334g.f4168a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0334g.f4177l.size() == 0) {
            c0334g.f4170c = true;
        }
    }

    @Override // t.AbstractC0342o
    public final void e() {
        C0333f c0333f = this.h;
        if (c0333f.f4175j) {
            this.f4192b.f4029Z = c0333f.f4174g;
        }
    }

    @Override // t.AbstractC0342o
    public final void f() {
        this.f4193c = null;
        this.h.c();
        this.i.c();
        this.f4183k.c();
        this.f4195e.c();
        this.f4197g = false;
    }

    @Override // t.AbstractC0342o
    public final boolean k() {
        return this.f4194d != 3 || this.f4192b.f4060s == 0;
    }

    public final void m() {
        this.f4197g = false;
        C0333f c0333f = this.h;
        c0333f.c();
        c0333f.f4175j = false;
        C0333f c0333f2 = this.i;
        c0333f2.c();
        c0333f2.f4175j = false;
        C0333f c0333f3 = this.f4183k;
        c0333f3.c();
        c0333f3.f4175j = false;
        this.f4195e.f4175j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4192b.f4044h0;
    }
}
