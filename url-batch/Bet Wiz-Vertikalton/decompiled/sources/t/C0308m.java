package t;

import q.AbstractC0285e;
import s.C0292c;
import s.C0293d;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308m extends AbstractC0310o {

    /* renamed from: k, reason: collision with root package name */
    public C0301f f3711k;

    /* renamed from: l, reason: collision with root package name */
    public C0296a f3712l;

    @Override // t.InterfaceC0299d
    public final void a(InterfaceC0299d interfaceC0299d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0285e.a(this.f3724j) == 3) {
            C0293d c0293d = this.f3719b;
            l(c0293d.f3533J, c0293d.f3535L, 1);
            return;
        }
        C0302g c0302g = this.f3721e;
        if (c0302g.f3699c && !c0302g.f3703j && this.d == 3) {
            C0293d c0293d2 = this.f3719b;
            int i2 = c0293d2.f3580s;
            if (i2 == 2) {
                C0293d c0293d3 = c0293d2.f3543T;
                if (c0293d3 != null) {
                    if (c0293d3.f3557e.f3721e.f3703j) {
                        c0302g.d((int) ((r5.f3702g * c0293d2.f3587z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0302g c0302g2 = c0293d2.d.f3721e;
                if (c0302g2.f3703j) {
                    int i3 = c0293d2.f3547X;
                    if (i3 == -1) {
                        f2 = c0302g2.f3702g;
                        f3 = c0293d2.f3546W;
                    } else if (i3 == 0) {
                        f4 = c0302g2.f3702g * c0293d2.f3546W;
                        i = (int) (f4 + 0.5f);
                        c0302g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0302g.d(i);
                    } else {
                        f2 = c0302g2.f3702g;
                        f3 = c0293d2.f3546W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0302g.d(i);
                }
            }
        }
        C0301f c0301f = this.h;
        if (c0301f.f3699c) {
            C0301f c0301f2 = this.i;
            if (c0301f2.f3699c) {
                if (c0301f.f3703j && c0301f2.f3703j && c0302g.f3703j) {
                    return;
                }
                if (!c0302g.f3703j && this.d == 3) {
                    C0293d c0293d4 = this.f3719b;
                    if (c0293d4.f3579r == 0 && !c0293d4.y()) {
                        C0301f c0301f3 = (C0301f) c0301f.f3705l.get(0);
                        C0301f c0301f4 = (C0301f) c0301f2.f3705l.get(0);
                        int i4 = c0301f3.f3702g + c0301f.f3701f;
                        int i5 = c0301f4.f3702g + c0301f2.f3701f;
                        c0301f.d(i4);
                        c0301f2.d(i5);
                        c0302g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0302g.f3703j && this.d == 3 && this.f3718a == 1 && c0301f.f3705l.size() > 0 && c0301f2.f3705l.size() > 0) {
                    C0301f c0301f5 = (C0301f) c0301f.f3705l.get(0);
                    int i6 = (((C0301f) c0301f2.f3705l.get(0)).f3702g + c0301f2.f3701f) - (c0301f5.f3702g + c0301f.f3701f);
                    int i7 = c0302g.f3706m;
                    if (i6 < i7) {
                        c0302g.d(i6);
                    } else {
                        c0302g.d(i7);
                    }
                }
                if (c0302g.f3703j && c0301f.f3705l.size() > 0 && c0301f2.f3705l.size() > 0) {
                    C0301f c0301f6 = (C0301f) c0301f.f3705l.get(0);
                    C0301f c0301f7 = (C0301f) c0301f2.f3705l.get(0);
                    int i8 = c0301f6.f3702g;
                    int i9 = c0301f.f3701f + i8;
                    int i10 = c0301f7.f3702g;
                    int i11 = c0301f2.f3701f + i10;
                    float f5 = this.f3719b.f3558e0;
                    if (c0301f6 == c0301f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0301f.d((int) ((((i10 - i8) - c0302g.f3702g) * f5) + i8 + 0.5f));
                    c0301f2.d(c0301f.f3702g + c0302g.f3702g);
                }
            }
        }
    }

    @Override // t.AbstractC0310o
    public final void d() {
        C0293d c0293d;
        C0293d c0293d2;
        C0293d c0293d3;
        C0293d c0293d4;
        C0293d c0293d5 = this.f3719b;
        boolean z2 = c0293d5.f3550a;
        C0302g c0302g = this.f3721e;
        if (z2) {
            c0302g.d(c0293d5.k());
        }
        boolean z3 = c0302g.f3703j;
        C0301f c0301f = this.i;
        C0301f c0301f2 = this.h;
        if (!z3) {
            C0293d c0293d6 = this.f3719b;
            this.d = c0293d6.f3577p0[1];
            if (c0293d6.f3529E) {
                this.f3712l = new C0296a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0293d4 = this.f3719b.f3543T) != null && c0293d4.f3577p0[1] == 1) {
                    int k2 = (c0293d4.k() - this.f3719b.f3533J.e()) - this.f3719b.f3535L.e();
                    AbstractC0310o.b(c0301f2, c0293d4.f3557e.h, this.f3719b.f3533J.e());
                    AbstractC0310o.b(c0301f, c0293d4.f3557e.i, -this.f3719b.f3535L.e());
                    c0302g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0302g.d(this.f3719b.k());
                }
            }
        } else if (this.d == 4 && (c0293d2 = (c0293d = this.f3719b).f3543T) != null && c0293d2.f3577p0[1] == 1) {
            AbstractC0310o.b(c0301f2, c0293d2.f3557e.h, c0293d.f3533J.e());
            AbstractC0310o.b(c0301f, c0293d2.f3557e.i, -this.f3719b.f3535L.e());
            return;
        }
        boolean z4 = c0302g.f3703j;
        C0301f c0301f3 = this.f3711k;
        if (z4) {
            C0293d c0293d7 = this.f3719b;
            if (c0293d7.f3550a) {
                C0292c[] c0292cArr = c0293d7.f3540Q;
                C0292c c0292c = c0292cArr[2];
                C0292c c0292c2 = c0292c.f3523f;
                if (c0292c2 != null && c0292cArr[3].f3523f != null) {
                    if (c0293d7.y()) {
                        c0301f2.f3701f = this.f3719b.f3540Q[2].e();
                        c0301f.f3701f = -this.f3719b.f3540Q[3].e();
                    } else {
                        C0301f h = AbstractC0310o.h(this.f3719b.f3540Q[2]);
                        if (h != null) {
                            AbstractC0310o.b(c0301f2, h, this.f3719b.f3540Q[2].e());
                        }
                        C0301f h2 = AbstractC0310o.h(this.f3719b.f3540Q[3]);
                        if (h2 != null) {
                            AbstractC0310o.b(c0301f, h2, -this.f3719b.f3540Q[3].e());
                        }
                        c0301f2.f3698b = true;
                        c0301f.f3698b = true;
                    }
                    C0293d c0293d8 = this.f3719b;
                    if (c0293d8.f3529E) {
                        AbstractC0310o.b(c0301f3, c0301f2, c0293d8.f3551a0);
                        return;
                    }
                    return;
                }
                if (c0292c2 != null) {
                    C0301f h3 = AbstractC0310o.h(c0292c);
                    if (h3 != null) {
                        AbstractC0310o.b(c0301f2, h3, this.f3719b.f3540Q[2].e());
                        AbstractC0310o.b(c0301f, c0301f2, c0302g.f3702g);
                        C0293d c0293d9 = this.f3719b;
                        if (c0293d9.f3529E) {
                            AbstractC0310o.b(c0301f3, c0301f2, c0293d9.f3551a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0292c c0292c3 = c0292cArr[3];
                if (c0292c3.f3523f != null) {
                    C0301f h4 = AbstractC0310o.h(c0292c3);
                    if (h4 != null) {
                        AbstractC0310o.b(c0301f, h4, -this.f3719b.f3540Q[3].e());
                        AbstractC0310o.b(c0301f2, c0301f, -c0302g.f3702g);
                    }
                    C0293d c0293d10 = this.f3719b;
                    if (c0293d10.f3529E) {
                        AbstractC0310o.b(c0301f3, c0301f2, c0293d10.f3551a0);
                        return;
                    }
                    return;
                }
                C0292c c0292c4 = c0292cArr[4];
                if (c0292c4.f3523f != null) {
                    C0301f h5 = AbstractC0310o.h(c0292c4);
                    if (h5 != null) {
                        AbstractC0310o.b(c0301f3, h5, 0);
                        AbstractC0310o.b(c0301f2, c0301f3, -this.f3719b.f3551a0);
                        AbstractC0310o.b(c0301f, c0301f2, c0302g.f3702g);
                        return;
                    }
                    return;
                }
                if ((c0293d7 instanceof s.i) || c0293d7.f3543T == null || c0293d7.i(7).f3523f != null) {
                    return;
                }
                C0293d c0293d11 = this.f3719b;
                AbstractC0310o.b(c0301f2, c0293d11.f3543T.f3557e.h, c0293d11.s());
                AbstractC0310o.b(c0301f, c0301f2, c0302g.f3702g);
                C0293d c0293d12 = this.f3719b;
                if (c0293d12.f3529E) {
                    AbstractC0310o.b(c0301f3, c0301f2, c0293d12.f3551a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            c0302g.b(this);
        } else {
            C0293d c0293d13 = this.f3719b;
            int i2 = c0293d13.f3580s;
            if (i2 == 2) {
                C0293d c0293d14 = c0293d13.f3543T;
                if (c0293d14 != null) {
                    C0302g c0302g2 = c0293d14.f3557e.f3721e;
                    c0302g.f3705l.add(c0302g2);
                    c0302g2.f3704k.add(c0302g);
                    c0302g.f3698b = true;
                    c0302g.f3704k.add(c0301f2);
                    c0302g.f3704k.add(c0301f);
                }
            } else if (i2 == 3 && !c0293d13.y()) {
                C0293d c0293d15 = this.f3719b;
                if (c0293d15.f3579r != 3) {
                    C0302g c0302g3 = c0293d15.d.f3721e;
                    c0302g.f3705l.add(c0302g3);
                    c0302g3.f3704k.add(c0302g);
                    c0302g.f3698b = true;
                    c0302g.f3704k.add(c0301f2);
                    c0302g.f3704k.add(c0301f);
                }
            }
        }
        C0293d c0293d16 = this.f3719b;
        C0292c[] c0292cArr2 = c0293d16.f3540Q;
        C0292c c0292c5 = c0292cArr2[2];
        C0292c c0292c6 = c0292c5.f3523f;
        if (c0292c6 != null && c0292cArr2[3].f3523f != null) {
            if (c0293d16.y()) {
                c0301f2.f3701f = this.f3719b.f3540Q[2].e();
                c0301f.f3701f = -this.f3719b.f3540Q[3].e();
            } else {
                C0301f h6 = AbstractC0310o.h(this.f3719b.f3540Q[2]);
                C0301f h7 = AbstractC0310o.h(this.f3719b.f3540Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3724j = 4;
            }
            if (this.f3719b.f3529E) {
                c(c0301f3, c0301f2, 1, this.f3712l);
            }
        } else if (c0292c6 != null) {
            C0301f h8 = AbstractC0310o.h(c0292c5);
            if (h8 != null) {
                AbstractC0310o.b(c0301f2, h8, this.f3719b.f3540Q[2].e());
                c(c0301f, c0301f2, 1, c0302g);
                if (this.f3719b.f3529E) {
                    c(c0301f3, c0301f2, 1, this.f3712l);
                }
                if (this.d == 3) {
                    C0293d c0293d17 = this.f3719b;
                    if (c0293d17.f3546W > 0.0f) {
                        C0306k c0306k = c0293d17.d;
                        if (c0306k.d == 3) {
                            c0306k.f3721e.f3704k.add(c0302g);
                            c0302g.f3705l.add(this.f3719b.d.f3721e);
                            c0302g.f3697a = this;
                        }
                    }
                }
            }
        } else {
            C0292c c0292c7 = c0292cArr2[3];
            if (c0292c7.f3523f != null) {
                C0301f h9 = AbstractC0310o.h(c0292c7);
                if (h9 != null) {
                    AbstractC0310o.b(c0301f, h9, -this.f3719b.f3540Q[3].e());
                    c(c0301f2, c0301f, -1, c0302g);
                    if (this.f3719b.f3529E) {
                        c(c0301f3, c0301f2, 1, this.f3712l);
                    }
                }
            } else {
                C0292c c0292c8 = c0292cArr2[4];
                if (c0292c8.f3523f != null) {
                    C0301f h10 = AbstractC0310o.h(c0292c8);
                    if (h10 != null) {
                        AbstractC0310o.b(c0301f3, h10, 0);
                        c(c0301f2, c0301f3, -1, this.f3712l);
                        c(c0301f, c0301f2, 1, c0302g);
                    }
                } else if (!(c0293d16 instanceof s.i) && (c0293d3 = c0293d16.f3543T) != null) {
                    AbstractC0310o.b(c0301f2, c0293d3.f3557e.h, c0293d16.s());
                    c(c0301f, c0301f2, 1, c0302g);
                    if (this.f3719b.f3529E) {
                        c(c0301f3, c0301f2, 1, this.f3712l);
                    }
                    if (this.d == 3) {
                        C0293d c0293d18 = this.f3719b;
                        if (c0293d18.f3546W > 0.0f) {
                            C0306k c0306k2 = c0293d18.d;
                            if (c0306k2.d == 3) {
                                c0306k2.f3721e.f3704k.add(c0302g);
                                c0302g.f3705l.add(this.f3719b.d.f3721e);
                                c0302g.f3697a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0302g.f3705l.size() == 0) {
            c0302g.f3699c = true;
        }
    }

    @Override // t.AbstractC0310o
    public final void e() {
        C0301f c0301f = this.h;
        if (c0301f.f3703j) {
            this.f3719b.f3549Z = c0301f.f3702g;
        }
    }

    @Override // t.AbstractC0310o
    public final void f() {
        this.f3720c = null;
        this.h.c();
        this.i.c();
        this.f3711k.c();
        this.f3721e.c();
        this.f3723g = false;
    }

    @Override // t.AbstractC0310o
    public final boolean k() {
        return this.d != 3 || this.f3719b.f3580s == 0;
    }

    public final void m() {
        this.f3723g = false;
        C0301f c0301f = this.h;
        c0301f.c();
        c0301f.f3703j = false;
        C0301f c0301f2 = this.i;
        c0301f2.c();
        c0301f2.f3703j = false;
        C0301f c0301f3 = this.f3711k;
        c0301f3.c();
        c0301f3.f3703j = false;
        this.f3721e.f3703j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3719b.f3563h0;
    }
}
