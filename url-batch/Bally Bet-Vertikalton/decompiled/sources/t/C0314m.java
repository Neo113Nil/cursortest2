package t;

import q.AbstractC0291e;
import s.C0298c;
import s.C0299d;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314m extends AbstractC0316o {

    /* renamed from: k, reason: collision with root package name */
    public C0307f f3771k;

    /* renamed from: l, reason: collision with root package name */
    public C0302a f3772l;

    @Override // t.InterfaceC0305d
    public final void a(InterfaceC0305d interfaceC0305d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0291e.a(this.f3784j) == 3) {
            C0299d c0299d = this.f3779b;
            l(c0299d.f3605J, c0299d.f3607L, 1);
            return;
        }
        C0308g c0308g = this.f3781e;
        if (c0308g.f3759c && !c0308g.f3763j && this.d == 3) {
            C0299d c0299d2 = this.f3779b;
            int i2 = c0299d2.f3652s;
            if (i2 == 2) {
                C0299d c0299d3 = c0299d2.f3615T;
                if (c0299d3 != null) {
                    if (c0299d3.f3629e.f3781e.f3763j) {
                        c0308g.d((int) ((r5.f3762g * c0299d2.f3659z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0308g c0308g2 = c0299d2.d.f3781e;
                if (c0308g2.f3763j) {
                    int i3 = c0299d2.f3619X;
                    if (i3 == -1) {
                        f2 = c0308g2.f3762g;
                        f3 = c0299d2.f3618W;
                    } else if (i3 == 0) {
                        f4 = c0308g2.f3762g * c0299d2.f3618W;
                        i = (int) (f4 + 0.5f);
                        c0308g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0308g.d(i);
                    } else {
                        f2 = c0308g2.f3762g;
                        f3 = c0299d2.f3618W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0308g.d(i);
                }
            }
        }
        C0307f c0307f = this.h;
        if (c0307f.f3759c) {
            C0307f c0307f2 = this.i;
            if (c0307f2.f3759c) {
                if (c0307f.f3763j && c0307f2.f3763j && c0308g.f3763j) {
                    return;
                }
                if (!c0308g.f3763j && this.d == 3) {
                    C0299d c0299d4 = this.f3779b;
                    if (c0299d4.f3651r == 0 && !c0299d4.y()) {
                        C0307f c0307f3 = (C0307f) c0307f.f3765l.get(0);
                        C0307f c0307f4 = (C0307f) c0307f2.f3765l.get(0);
                        int i4 = c0307f3.f3762g + c0307f.f3761f;
                        int i5 = c0307f4.f3762g + c0307f2.f3761f;
                        c0307f.d(i4);
                        c0307f2.d(i5);
                        c0308g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0308g.f3763j && this.d == 3 && this.f3778a == 1 && c0307f.f3765l.size() > 0 && c0307f2.f3765l.size() > 0) {
                    C0307f c0307f5 = (C0307f) c0307f.f3765l.get(0);
                    int i6 = (((C0307f) c0307f2.f3765l.get(0)).f3762g + c0307f2.f3761f) - (c0307f5.f3762g + c0307f.f3761f);
                    int i7 = c0308g.f3766m;
                    if (i6 < i7) {
                        c0308g.d(i6);
                    } else {
                        c0308g.d(i7);
                    }
                }
                if (c0308g.f3763j && c0307f.f3765l.size() > 0 && c0307f2.f3765l.size() > 0) {
                    C0307f c0307f6 = (C0307f) c0307f.f3765l.get(0);
                    C0307f c0307f7 = (C0307f) c0307f2.f3765l.get(0);
                    int i8 = c0307f6.f3762g;
                    int i9 = c0307f.f3761f + i8;
                    int i10 = c0307f7.f3762g;
                    int i11 = c0307f2.f3761f + i10;
                    float f5 = this.f3779b.f3630e0;
                    if (c0307f6 == c0307f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0307f.d((int) ((((i10 - i8) - c0308g.f3762g) * f5) + i8 + 0.5f));
                    c0307f2.d(c0307f.f3762g + c0308g.f3762g);
                }
            }
        }
    }

    @Override // t.AbstractC0316o
    public final void d() {
        C0299d c0299d;
        C0299d c0299d2;
        C0299d c0299d3;
        C0299d c0299d4;
        C0299d c0299d5 = this.f3779b;
        boolean z2 = c0299d5.f3622a;
        C0308g c0308g = this.f3781e;
        if (z2) {
            c0308g.d(c0299d5.k());
        }
        boolean z3 = c0308g.f3763j;
        C0307f c0307f = this.i;
        C0307f c0307f2 = this.h;
        if (!z3) {
            C0299d c0299d6 = this.f3779b;
            this.d = c0299d6.f3649p0[1];
            if (c0299d6.f3601E) {
                this.f3772l = new C0302a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0299d4 = this.f3779b.f3615T) != null && c0299d4.f3649p0[1] == 1) {
                    int k2 = (c0299d4.k() - this.f3779b.f3605J.e()) - this.f3779b.f3607L.e();
                    AbstractC0316o.b(c0307f2, c0299d4.f3629e.h, this.f3779b.f3605J.e());
                    AbstractC0316o.b(c0307f, c0299d4.f3629e.i, -this.f3779b.f3607L.e());
                    c0308g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0308g.d(this.f3779b.k());
                }
            }
        } else if (this.d == 4 && (c0299d2 = (c0299d = this.f3779b).f3615T) != null && c0299d2.f3649p0[1] == 1) {
            AbstractC0316o.b(c0307f2, c0299d2.f3629e.h, c0299d.f3605J.e());
            AbstractC0316o.b(c0307f, c0299d2.f3629e.i, -this.f3779b.f3607L.e());
            return;
        }
        boolean z4 = c0308g.f3763j;
        C0307f c0307f3 = this.f3771k;
        if (z4) {
            C0299d c0299d7 = this.f3779b;
            if (c0299d7.f3622a) {
                C0298c[] c0298cArr = c0299d7.f3612Q;
                C0298c c0298c = c0298cArr[2];
                C0298c c0298c2 = c0298c.f3595f;
                if (c0298c2 != null && c0298cArr[3].f3595f != null) {
                    if (c0299d7.y()) {
                        c0307f2.f3761f = this.f3779b.f3612Q[2].e();
                        c0307f.f3761f = -this.f3779b.f3612Q[3].e();
                    } else {
                        C0307f h = AbstractC0316o.h(this.f3779b.f3612Q[2]);
                        if (h != null) {
                            AbstractC0316o.b(c0307f2, h, this.f3779b.f3612Q[2].e());
                        }
                        C0307f h2 = AbstractC0316o.h(this.f3779b.f3612Q[3]);
                        if (h2 != null) {
                            AbstractC0316o.b(c0307f, h2, -this.f3779b.f3612Q[3].e());
                        }
                        c0307f2.f3758b = true;
                        c0307f.f3758b = true;
                    }
                    C0299d c0299d8 = this.f3779b;
                    if (c0299d8.f3601E) {
                        AbstractC0316o.b(c0307f3, c0307f2, c0299d8.f3623a0);
                        return;
                    }
                    return;
                }
                if (c0298c2 != null) {
                    C0307f h3 = AbstractC0316o.h(c0298c);
                    if (h3 != null) {
                        AbstractC0316o.b(c0307f2, h3, this.f3779b.f3612Q[2].e());
                        AbstractC0316o.b(c0307f, c0307f2, c0308g.f3762g);
                        C0299d c0299d9 = this.f3779b;
                        if (c0299d9.f3601E) {
                            AbstractC0316o.b(c0307f3, c0307f2, c0299d9.f3623a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0298c c0298c3 = c0298cArr[3];
                if (c0298c3.f3595f != null) {
                    C0307f h4 = AbstractC0316o.h(c0298c3);
                    if (h4 != null) {
                        AbstractC0316o.b(c0307f, h4, -this.f3779b.f3612Q[3].e());
                        AbstractC0316o.b(c0307f2, c0307f, -c0308g.f3762g);
                    }
                    C0299d c0299d10 = this.f3779b;
                    if (c0299d10.f3601E) {
                        AbstractC0316o.b(c0307f3, c0307f2, c0299d10.f3623a0);
                        return;
                    }
                    return;
                }
                C0298c c0298c4 = c0298cArr[4];
                if (c0298c4.f3595f != null) {
                    C0307f h5 = AbstractC0316o.h(c0298c4);
                    if (h5 != null) {
                        AbstractC0316o.b(c0307f3, h5, 0);
                        AbstractC0316o.b(c0307f2, c0307f3, -this.f3779b.f3623a0);
                        AbstractC0316o.b(c0307f, c0307f2, c0308g.f3762g);
                        return;
                    }
                    return;
                }
                if ((c0299d7 instanceof s.i) || c0299d7.f3615T == null || c0299d7.i(7).f3595f != null) {
                    return;
                }
                C0299d c0299d11 = this.f3779b;
                AbstractC0316o.b(c0307f2, c0299d11.f3615T.f3629e.h, c0299d11.s());
                AbstractC0316o.b(c0307f, c0307f2, c0308g.f3762g);
                C0299d c0299d12 = this.f3779b;
                if (c0299d12.f3601E) {
                    AbstractC0316o.b(c0307f3, c0307f2, c0299d12.f3623a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            c0308g.b(this);
        } else {
            C0299d c0299d13 = this.f3779b;
            int i2 = c0299d13.f3652s;
            if (i2 == 2) {
                C0299d c0299d14 = c0299d13.f3615T;
                if (c0299d14 != null) {
                    C0308g c0308g2 = c0299d14.f3629e.f3781e;
                    c0308g.f3765l.add(c0308g2);
                    c0308g2.f3764k.add(c0308g);
                    c0308g.f3758b = true;
                    c0308g.f3764k.add(c0307f2);
                    c0308g.f3764k.add(c0307f);
                }
            } else if (i2 == 3 && !c0299d13.y()) {
                C0299d c0299d15 = this.f3779b;
                if (c0299d15.f3651r != 3) {
                    C0308g c0308g3 = c0299d15.d.f3781e;
                    c0308g.f3765l.add(c0308g3);
                    c0308g3.f3764k.add(c0308g);
                    c0308g.f3758b = true;
                    c0308g.f3764k.add(c0307f2);
                    c0308g.f3764k.add(c0307f);
                }
            }
        }
        C0299d c0299d16 = this.f3779b;
        C0298c[] c0298cArr2 = c0299d16.f3612Q;
        C0298c c0298c5 = c0298cArr2[2];
        C0298c c0298c6 = c0298c5.f3595f;
        if (c0298c6 != null && c0298cArr2[3].f3595f != null) {
            if (c0299d16.y()) {
                c0307f2.f3761f = this.f3779b.f3612Q[2].e();
                c0307f.f3761f = -this.f3779b.f3612Q[3].e();
            } else {
                C0307f h6 = AbstractC0316o.h(this.f3779b.f3612Q[2]);
                C0307f h7 = AbstractC0316o.h(this.f3779b.f3612Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3784j = 4;
            }
            if (this.f3779b.f3601E) {
                c(c0307f3, c0307f2, 1, this.f3772l);
            }
        } else if (c0298c6 != null) {
            C0307f h8 = AbstractC0316o.h(c0298c5);
            if (h8 != null) {
                AbstractC0316o.b(c0307f2, h8, this.f3779b.f3612Q[2].e());
                c(c0307f, c0307f2, 1, c0308g);
                if (this.f3779b.f3601E) {
                    c(c0307f3, c0307f2, 1, this.f3772l);
                }
                if (this.d == 3) {
                    C0299d c0299d17 = this.f3779b;
                    if (c0299d17.f3618W > 0.0f) {
                        C0312k c0312k = c0299d17.d;
                        if (c0312k.d == 3) {
                            c0312k.f3781e.f3764k.add(c0308g);
                            c0308g.f3765l.add(this.f3779b.d.f3781e);
                            c0308g.f3757a = this;
                        }
                    }
                }
            }
        } else {
            C0298c c0298c7 = c0298cArr2[3];
            if (c0298c7.f3595f != null) {
                C0307f h9 = AbstractC0316o.h(c0298c7);
                if (h9 != null) {
                    AbstractC0316o.b(c0307f, h9, -this.f3779b.f3612Q[3].e());
                    c(c0307f2, c0307f, -1, c0308g);
                    if (this.f3779b.f3601E) {
                        c(c0307f3, c0307f2, 1, this.f3772l);
                    }
                }
            } else {
                C0298c c0298c8 = c0298cArr2[4];
                if (c0298c8.f3595f != null) {
                    C0307f h10 = AbstractC0316o.h(c0298c8);
                    if (h10 != null) {
                        AbstractC0316o.b(c0307f3, h10, 0);
                        c(c0307f2, c0307f3, -1, this.f3772l);
                        c(c0307f, c0307f2, 1, c0308g);
                    }
                } else if (!(c0299d16 instanceof s.i) && (c0299d3 = c0299d16.f3615T) != null) {
                    AbstractC0316o.b(c0307f2, c0299d3.f3629e.h, c0299d16.s());
                    c(c0307f, c0307f2, 1, c0308g);
                    if (this.f3779b.f3601E) {
                        c(c0307f3, c0307f2, 1, this.f3772l);
                    }
                    if (this.d == 3) {
                        C0299d c0299d18 = this.f3779b;
                        if (c0299d18.f3618W > 0.0f) {
                            C0312k c0312k2 = c0299d18.d;
                            if (c0312k2.d == 3) {
                                c0312k2.f3781e.f3764k.add(c0308g);
                                c0308g.f3765l.add(this.f3779b.d.f3781e);
                                c0308g.f3757a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0308g.f3765l.size() == 0) {
            c0308g.f3759c = true;
        }
    }

    @Override // t.AbstractC0316o
    public final void e() {
        C0307f c0307f = this.h;
        if (c0307f.f3763j) {
            this.f3779b.f3621Z = c0307f.f3762g;
        }
    }

    @Override // t.AbstractC0316o
    public final void f() {
        this.f3780c = null;
        this.h.c();
        this.i.c();
        this.f3771k.c();
        this.f3781e.c();
        this.f3783g = false;
    }

    @Override // t.AbstractC0316o
    public final boolean k() {
        return this.d != 3 || this.f3779b.f3652s == 0;
    }

    public final void m() {
        this.f3783g = false;
        C0307f c0307f = this.h;
        c0307f.c();
        c0307f.f3763j = false;
        C0307f c0307f2 = this.i;
        c0307f2.c();
        c0307f2.f3763j = false;
        C0307f c0307f3 = this.f3771k;
        c0307f3.c();
        c0307f3.f3763j = false;
        this.f3781e.f3763j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3779b.f3635h0;
    }
}
