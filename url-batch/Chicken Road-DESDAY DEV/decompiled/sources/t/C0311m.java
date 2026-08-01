package t;

import q.AbstractC0288e;
import s.C0295c;
import s.C0296d;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311m extends AbstractC0313o {

    /* renamed from: k, reason: collision with root package name */
    public C0304f f3731k;

    /* renamed from: l, reason: collision with root package name */
    public C0299a f3732l;

    @Override // t.InterfaceC0302d
    public final void a(InterfaceC0302d interfaceC0302d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0288e.a(this.f3744j) == 3) {
            C0296d c0296d = this.f3739b;
            l(c0296d.f3557J, c0296d.f3559L, 1);
            return;
        }
        C0305g c0305g = this.f3741e;
        if (c0305g.f3719c && !c0305g.f3723j && this.d == 3) {
            C0296d c0296d2 = this.f3739b;
            int i2 = c0296d2.f3604s;
            if (i2 == 2) {
                C0296d c0296d3 = c0296d2.f3567T;
                if (c0296d3 != null) {
                    if (c0296d3.f3581e.f3741e.f3723j) {
                        c0305g.d((int) ((r5.f3722g * c0296d2.f3611z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0305g c0305g2 = c0296d2.d.f3741e;
                if (c0305g2.f3723j) {
                    int i3 = c0296d2.f3571X;
                    if (i3 == -1) {
                        f2 = c0305g2.f3722g;
                        f3 = c0296d2.f3570W;
                    } else if (i3 == 0) {
                        f4 = c0305g2.f3722g * c0296d2.f3570W;
                        i = (int) (f4 + 0.5f);
                        c0305g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0305g.d(i);
                    } else {
                        f2 = c0305g2.f3722g;
                        f3 = c0296d2.f3570W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0305g.d(i);
                }
            }
        }
        C0304f c0304f = this.h;
        if (c0304f.f3719c) {
            C0304f c0304f2 = this.i;
            if (c0304f2.f3719c) {
                if (c0304f.f3723j && c0304f2.f3723j && c0305g.f3723j) {
                    return;
                }
                if (!c0305g.f3723j && this.d == 3) {
                    C0296d c0296d4 = this.f3739b;
                    if (c0296d4.f3603r == 0 && !c0296d4.y()) {
                        C0304f c0304f3 = (C0304f) c0304f.f3725l.get(0);
                        C0304f c0304f4 = (C0304f) c0304f2.f3725l.get(0);
                        int i4 = c0304f3.f3722g + c0304f.f3721f;
                        int i5 = c0304f4.f3722g + c0304f2.f3721f;
                        c0304f.d(i4);
                        c0304f2.d(i5);
                        c0305g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0305g.f3723j && this.d == 3 && this.f3738a == 1 && c0304f.f3725l.size() > 0 && c0304f2.f3725l.size() > 0) {
                    C0304f c0304f5 = (C0304f) c0304f.f3725l.get(0);
                    int i6 = (((C0304f) c0304f2.f3725l.get(0)).f3722g + c0304f2.f3721f) - (c0304f5.f3722g + c0304f.f3721f);
                    int i7 = c0305g.f3726m;
                    if (i6 < i7) {
                        c0305g.d(i6);
                    } else {
                        c0305g.d(i7);
                    }
                }
                if (c0305g.f3723j && c0304f.f3725l.size() > 0 && c0304f2.f3725l.size() > 0) {
                    C0304f c0304f6 = (C0304f) c0304f.f3725l.get(0);
                    C0304f c0304f7 = (C0304f) c0304f2.f3725l.get(0);
                    int i8 = c0304f6.f3722g;
                    int i9 = c0304f.f3721f + i8;
                    int i10 = c0304f7.f3722g;
                    int i11 = c0304f2.f3721f + i10;
                    float f5 = this.f3739b.f3582e0;
                    if (c0304f6 == c0304f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0304f.d((int) ((((i10 - i8) - c0305g.f3722g) * f5) + i8 + 0.5f));
                    c0304f2.d(c0304f.f3722g + c0305g.f3722g);
                }
            }
        }
    }

    @Override // t.AbstractC0313o
    public final void d() {
        C0296d c0296d;
        C0296d c0296d2;
        C0296d c0296d3;
        C0296d c0296d4;
        C0296d c0296d5 = this.f3739b;
        boolean z2 = c0296d5.f3574a;
        C0305g c0305g = this.f3741e;
        if (z2) {
            c0305g.d(c0296d5.k());
        }
        boolean z3 = c0305g.f3723j;
        C0304f c0304f = this.i;
        C0304f c0304f2 = this.h;
        if (!z3) {
            C0296d c0296d6 = this.f3739b;
            this.d = c0296d6.f3601p0[1];
            if (c0296d6.f3553E) {
                this.f3732l = new C0299a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0296d4 = this.f3739b.f3567T) != null && c0296d4.f3601p0[1] == 1) {
                    int k2 = (c0296d4.k() - this.f3739b.f3557J.e()) - this.f3739b.f3559L.e();
                    AbstractC0313o.b(c0304f2, c0296d4.f3581e.h, this.f3739b.f3557J.e());
                    AbstractC0313o.b(c0304f, c0296d4.f3581e.i, -this.f3739b.f3559L.e());
                    c0305g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0305g.d(this.f3739b.k());
                }
            }
        } else if (this.d == 4 && (c0296d2 = (c0296d = this.f3739b).f3567T) != null && c0296d2.f3601p0[1] == 1) {
            AbstractC0313o.b(c0304f2, c0296d2.f3581e.h, c0296d.f3557J.e());
            AbstractC0313o.b(c0304f, c0296d2.f3581e.i, -this.f3739b.f3559L.e());
            return;
        }
        boolean z4 = c0305g.f3723j;
        C0304f c0304f3 = this.f3731k;
        if (z4) {
            C0296d c0296d7 = this.f3739b;
            if (c0296d7.f3574a) {
                C0295c[] c0295cArr = c0296d7.f3564Q;
                C0295c c0295c = c0295cArr[2];
                C0295c c0295c2 = c0295c.f3547f;
                if (c0295c2 != null && c0295cArr[3].f3547f != null) {
                    if (c0296d7.y()) {
                        c0304f2.f3721f = this.f3739b.f3564Q[2].e();
                        c0304f.f3721f = -this.f3739b.f3564Q[3].e();
                    } else {
                        C0304f h = AbstractC0313o.h(this.f3739b.f3564Q[2]);
                        if (h != null) {
                            AbstractC0313o.b(c0304f2, h, this.f3739b.f3564Q[2].e());
                        }
                        C0304f h2 = AbstractC0313o.h(this.f3739b.f3564Q[3]);
                        if (h2 != null) {
                            AbstractC0313o.b(c0304f, h2, -this.f3739b.f3564Q[3].e());
                        }
                        c0304f2.f3718b = true;
                        c0304f.f3718b = true;
                    }
                    C0296d c0296d8 = this.f3739b;
                    if (c0296d8.f3553E) {
                        AbstractC0313o.b(c0304f3, c0304f2, c0296d8.f3575a0);
                        return;
                    }
                    return;
                }
                if (c0295c2 != null) {
                    C0304f h3 = AbstractC0313o.h(c0295c);
                    if (h3 != null) {
                        AbstractC0313o.b(c0304f2, h3, this.f3739b.f3564Q[2].e());
                        AbstractC0313o.b(c0304f, c0304f2, c0305g.f3722g);
                        C0296d c0296d9 = this.f3739b;
                        if (c0296d9.f3553E) {
                            AbstractC0313o.b(c0304f3, c0304f2, c0296d9.f3575a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0295c c0295c3 = c0295cArr[3];
                if (c0295c3.f3547f != null) {
                    C0304f h4 = AbstractC0313o.h(c0295c3);
                    if (h4 != null) {
                        AbstractC0313o.b(c0304f, h4, -this.f3739b.f3564Q[3].e());
                        AbstractC0313o.b(c0304f2, c0304f, -c0305g.f3722g);
                    }
                    C0296d c0296d10 = this.f3739b;
                    if (c0296d10.f3553E) {
                        AbstractC0313o.b(c0304f3, c0304f2, c0296d10.f3575a0);
                        return;
                    }
                    return;
                }
                C0295c c0295c4 = c0295cArr[4];
                if (c0295c4.f3547f != null) {
                    C0304f h5 = AbstractC0313o.h(c0295c4);
                    if (h5 != null) {
                        AbstractC0313o.b(c0304f3, h5, 0);
                        AbstractC0313o.b(c0304f2, c0304f3, -this.f3739b.f3575a0);
                        AbstractC0313o.b(c0304f, c0304f2, c0305g.f3722g);
                        return;
                    }
                    return;
                }
                if ((c0296d7 instanceof s.i) || c0296d7.f3567T == null || c0296d7.i(7).f3547f != null) {
                    return;
                }
                C0296d c0296d11 = this.f3739b;
                AbstractC0313o.b(c0304f2, c0296d11.f3567T.f3581e.h, c0296d11.s());
                AbstractC0313o.b(c0304f, c0304f2, c0305g.f3722g);
                C0296d c0296d12 = this.f3739b;
                if (c0296d12.f3553E) {
                    AbstractC0313o.b(c0304f3, c0304f2, c0296d12.f3575a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            c0305g.b(this);
        } else {
            C0296d c0296d13 = this.f3739b;
            int i2 = c0296d13.f3604s;
            if (i2 == 2) {
                C0296d c0296d14 = c0296d13.f3567T;
                if (c0296d14 != null) {
                    C0305g c0305g2 = c0296d14.f3581e.f3741e;
                    c0305g.f3725l.add(c0305g2);
                    c0305g2.f3724k.add(c0305g);
                    c0305g.f3718b = true;
                    c0305g.f3724k.add(c0304f2);
                    c0305g.f3724k.add(c0304f);
                }
            } else if (i2 == 3 && !c0296d13.y()) {
                C0296d c0296d15 = this.f3739b;
                if (c0296d15.f3603r != 3) {
                    C0305g c0305g3 = c0296d15.d.f3741e;
                    c0305g.f3725l.add(c0305g3);
                    c0305g3.f3724k.add(c0305g);
                    c0305g.f3718b = true;
                    c0305g.f3724k.add(c0304f2);
                    c0305g.f3724k.add(c0304f);
                }
            }
        }
        C0296d c0296d16 = this.f3739b;
        C0295c[] c0295cArr2 = c0296d16.f3564Q;
        C0295c c0295c5 = c0295cArr2[2];
        C0295c c0295c6 = c0295c5.f3547f;
        if (c0295c6 != null && c0295cArr2[3].f3547f != null) {
            if (c0296d16.y()) {
                c0304f2.f3721f = this.f3739b.f3564Q[2].e();
                c0304f.f3721f = -this.f3739b.f3564Q[3].e();
            } else {
                C0304f h6 = AbstractC0313o.h(this.f3739b.f3564Q[2]);
                C0304f h7 = AbstractC0313o.h(this.f3739b.f3564Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3744j = 4;
            }
            if (this.f3739b.f3553E) {
                c(c0304f3, c0304f2, 1, this.f3732l);
            }
        } else if (c0295c6 != null) {
            C0304f h8 = AbstractC0313o.h(c0295c5);
            if (h8 != null) {
                AbstractC0313o.b(c0304f2, h8, this.f3739b.f3564Q[2].e());
                c(c0304f, c0304f2, 1, c0305g);
                if (this.f3739b.f3553E) {
                    c(c0304f3, c0304f2, 1, this.f3732l);
                }
                if (this.d == 3) {
                    C0296d c0296d17 = this.f3739b;
                    if (c0296d17.f3570W > 0.0f) {
                        C0309k c0309k = c0296d17.d;
                        if (c0309k.d == 3) {
                            c0309k.f3741e.f3724k.add(c0305g);
                            c0305g.f3725l.add(this.f3739b.d.f3741e);
                            c0305g.f3717a = this;
                        }
                    }
                }
            }
        } else {
            C0295c c0295c7 = c0295cArr2[3];
            if (c0295c7.f3547f != null) {
                C0304f h9 = AbstractC0313o.h(c0295c7);
                if (h9 != null) {
                    AbstractC0313o.b(c0304f, h9, -this.f3739b.f3564Q[3].e());
                    c(c0304f2, c0304f, -1, c0305g);
                    if (this.f3739b.f3553E) {
                        c(c0304f3, c0304f2, 1, this.f3732l);
                    }
                }
            } else {
                C0295c c0295c8 = c0295cArr2[4];
                if (c0295c8.f3547f != null) {
                    C0304f h10 = AbstractC0313o.h(c0295c8);
                    if (h10 != null) {
                        AbstractC0313o.b(c0304f3, h10, 0);
                        c(c0304f2, c0304f3, -1, this.f3732l);
                        c(c0304f, c0304f2, 1, c0305g);
                    }
                } else if (!(c0296d16 instanceof s.i) && (c0296d3 = c0296d16.f3567T) != null) {
                    AbstractC0313o.b(c0304f2, c0296d3.f3581e.h, c0296d16.s());
                    c(c0304f, c0304f2, 1, c0305g);
                    if (this.f3739b.f3553E) {
                        c(c0304f3, c0304f2, 1, this.f3732l);
                    }
                    if (this.d == 3) {
                        C0296d c0296d18 = this.f3739b;
                        if (c0296d18.f3570W > 0.0f) {
                            C0309k c0309k2 = c0296d18.d;
                            if (c0309k2.d == 3) {
                                c0309k2.f3741e.f3724k.add(c0305g);
                                c0305g.f3725l.add(this.f3739b.d.f3741e);
                                c0305g.f3717a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0305g.f3725l.size() == 0) {
            c0305g.f3719c = true;
        }
    }

    @Override // t.AbstractC0313o
    public final void e() {
        C0304f c0304f = this.h;
        if (c0304f.f3723j) {
            this.f3739b.f3573Z = c0304f.f3722g;
        }
    }

    @Override // t.AbstractC0313o
    public final void f() {
        this.f3740c = null;
        this.h.c();
        this.i.c();
        this.f3731k.c();
        this.f3741e.c();
        this.f3743g = false;
    }

    @Override // t.AbstractC0313o
    public final boolean k() {
        return this.d != 3 || this.f3739b.f3604s == 0;
    }

    public final void m() {
        this.f3743g = false;
        C0304f c0304f = this.h;
        c0304f.c();
        c0304f.f3723j = false;
        C0304f c0304f2 = this.i;
        c0304f2.c();
        c0304f2.f3723j = false;
        C0304f c0304f3 = this.f3731k;
        c0304f3.c();
        c0304f3.f3723j = false;
        this.f3741e.f3723j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3739b.f3587h0;
    }
}
