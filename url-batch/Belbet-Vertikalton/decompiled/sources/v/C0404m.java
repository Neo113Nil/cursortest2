package v;

import s.AbstractC0380e;
import u.C0386c;
import u.C0387d;

/* renamed from: v.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404m extends AbstractC0406o {

    /* renamed from: k, reason: collision with root package name */
    public C0397f f4429k;

    /* renamed from: l, reason: collision with root package name */
    public C0392a f4430l;

    @Override // v.InterfaceC0395d
    public final void a(InterfaceC0395d interfaceC0395d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0380e.a(this.j) == 3) {
            C0387d c0387d = this.f4437b;
            l(c0387d.f4237J, c0387d.f4239L, 1);
            return;
        }
        C0398g c0398g = this.e;
        if (c0398g.f4417c && !c0398g.j && this.f4439d == 3) {
            C0387d c0387d2 = this.f4437b;
            int i2 = c0387d2.f4284s;
            if (i2 == 2) {
                C0387d c0387d3 = c0387d2.f4247T;
                if (c0387d3 != null) {
                    if (c0387d3.e.e.j) {
                        c0398g.d((int) ((r5.f4420g * c0387d2.f4291z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0398g c0398g2 = c0387d2.f4260d.e;
                if (c0398g2.j) {
                    int i3 = c0387d2.f4251X;
                    if (i3 == -1) {
                        f2 = c0398g2.f4420g;
                        f3 = c0387d2.f4250W;
                    } else if (i3 == 0) {
                        f4 = c0398g2.f4420g * c0387d2.f4250W;
                        i = (int) (f4 + 0.5f);
                        c0398g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0398g.d(i);
                    } else {
                        f2 = c0398g2.f4420g;
                        f3 = c0387d2.f4250W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0398g.d(i);
                }
            }
        }
        C0397f c0397f = this.f4442h;
        if (c0397f.f4417c) {
            C0397f c0397f2 = this.i;
            if (c0397f2.f4417c) {
                if (c0397f.j && c0397f2.j && c0398g.j) {
                    return;
                }
                if (!c0398g.j && this.f4439d == 3) {
                    C0387d c0387d4 = this.f4437b;
                    if (c0387d4.f4283r == 0 && !c0387d4.y()) {
                        C0397f c0397f3 = (C0397f) c0397f.f4423l.get(0);
                        C0397f c0397f4 = (C0397f) c0397f2.f4423l.get(0);
                        int i4 = c0397f3.f4420g + c0397f.f4419f;
                        int i5 = c0397f4.f4420g + c0397f2.f4419f;
                        c0397f.d(i4);
                        c0397f2.d(i5);
                        c0398g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0398g.j && this.f4439d == 3 && this.f4436a == 1 && c0397f.f4423l.size() > 0 && c0397f2.f4423l.size() > 0) {
                    C0397f c0397f5 = (C0397f) c0397f.f4423l.get(0);
                    int i6 = (((C0397f) c0397f2.f4423l.get(0)).f4420g + c0397f2.f4419f) - (c0397f5.f4420g + c0397f.f4419f);
                    int i7 = c0398g.f4424m;
                    if (i6 < i7) {
                        c0398g.d(i6);
                    } else {
                        c0398g.d(i7);
                    }
                }
                if (c0398g.j && c0397f.f4423l.size() > 0 && c0397f2.f4423l.size() > 0) {
                    C0397f c0397f6 = (C0397f) c0397f.f4423l.get(0);
                    C0397f c0397f7 = (C0397f) c0397f2.f4423l.get(0);
                    int i8 = c0397f6.f4420g;
                    int i9 = c0397f.f4419f + i8;
                    int i10 = c0397f7.f4420g;
                    int i11 = c0397f2.f4419f + i10;
                    float f5 = this.f4437b.f4262e0;
                    if (c0397f6 == c0397f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0397f.d((int) ((((i10 - i8) - c0398g.f4420g) * f5) + i8 + 0.5f));
                    c0397f2.d(c0397f.f4420g + c0398g.f4420g);
                }
            }
        }
    }

    @Override // v.AbstractC0406o
    public final void d() {
        C0387d c0387d;
        C0387d c0387d2;
        C0387d c0387d3;
        C0387d c0387d4;
        C0387d c0387d5 = this.f4437b;
        boolean z2 = c0387d5.f4254a;
        C0398g c0398g = this.e;
        if (z2) {
            c0398g.d(c0387d5.k());
        }
        boolean z3 = c0398g.j;
        C0397f c0397f = this.i;
        C0397f c0397f2 = this.f4442h;
        if (!z3) {
            C0387d c0387d6 = this.f4437b;
            this.f4439d = c0387d6.f4281p0[1];
            if (c0387d6.f4233E) {
                this.f4430l = new C0392a(this);
            }
            int i = this.f4439d;
            if (i != 3) {
                if (i == 4 && (c0387d4 = this.f4437b.f4247T) != null && c0387d4.f4281p0[1] == 1) {
                    int k2 = (c0387d4.k() - this.f4437b.f4237J.e()) - this.f4437b.f4239L.e();
                    AbstractC0406o.b(c0397f2, c0387d4.e.f4442h, this.f4437b.f4237J.e());
                    AbstractC0406o.b(c0397f, c0387d4.e.i, -this.f4437b.f4239L.e());
                    c0398g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0398g.d(this.f4437b.k());
                }
            }
        } else if (this.f4439d == 4 && (c0387d2 = (c0387d = this.f4437b).f4247T) != null && c0387d2.f4281p0[1] == 1) {
            AbstractC0406o.b(c0397f2, c0387d2.e.f4442h, c0387d.f4237J.e());
            AbstractC0406o.b(c0397f, c0387d2.e.i, -this.f4437b.f4239L.e());
            return;
        }
        boolean z4 = c0398g.j;
        C0397f c0397f3 = this.f4429k;
        if (z4) {
            C0387d c0387d7 = this.f4437b;
            if (c0387d7.f4254a) {
                C0386c[] c0386cArr = c0387d7.f4244Q;
                C0386c c0386c = c0386cArr[2];
                C0386c c0386c2 = c0386c.f4226f;
                if (c0386c2 != null && c0386cArr[3].f4226f != null) {
                    if (c0387d7.y()) {
                        c0397f2.f4419f = this.f4437b.f4244Q[2].e();
                        c0397f.f4419f = -this.f4437b.f4244Q[3].e();
                    } else {
                        C0397f h2 = AbstractC0406o.h(this.f4437b.f4244Q[2]);
                        if (h2 != null) {
                            AbstractC0406o.b(c0397f2, h2, this.f4437b.f4244Q[2].e());
                        }
                        C0397f h3 = AbstractC0406o.h(this.f4437b.f4244Q[3]);
                        if (h3 != null) {
                            AbstractC0406o.b(c0397f, h3, -this.f4437b.f4244Q[3].e());
                        }
                        c0397f2.f4416b = true;
                        c0397f.f4416b = true;
                    }
                    C0387d c0387d8 = this.f4437b;
                    if (c0387d8.f4233E) {
                        AbstractC0406o.b(c0397f3, c0397f2, c0387d8.f4255a0);
                        return;
                    }
                    return;
                }
                if (c0386c2 != null) {
                    C0397f h4 = AbstractC0406o.h(c0386c);
                    if (h4 != null) {
                        AbstractC0406o.b(c0397f2, h4, this.f4437b.f4244Q[2].e());
                        AbstractC0406o.b(c0397f, c0397f2, c0398g.f4420g);
                        C0387d c0387d9 = this.f4437b;
                        if (c0387d9.f4233E) {
                            AbstractC0406o.b(c0397f3, c0397f2, c0387d9.f4255a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0386c c0386c3 = c0386cArr[3];
                if (c0386c3.f4226f != null) {
                    C0397f h5 = AbstractC0406o.h(c0386c3);
                    if (h5 != null) {
                        AbstractC0406o.b(c0397f, h5, -this.f4437b.f4244Q[3].e());
                        AbstractC0406o.b(c0397f2, c0397f, -c0398g.f4420g);
                    }
                    C0387d c0387d10 = this.f4437b;
                    if (c0387d10.f4233E) {
                        AbstractC0406o.b(c0397f3, c0397f2, c0387d10.f4255a0);
                        return;
                    }
                    return;
                }
                C0386c c0386c4 = c0386cArr[4];
                if (c0386c4.f4226f != null) {
                    C0397f h6 = AbstractC0406o.h(c0386c4);
                    if (h6 != null) {
                        AbstractC0406o.b(c0397f3, h6, 0);
                        AbstractC0406o.b(c0397f2, c0397f3, -this.f4437b.f4255a0);
                        AbstractC0406o.b(c0397f, c0397f2, c0398g.f4420g);
                        return;
                    }
                    return;
                }
                if ((c0387d7 instanceof u.i) || c0387d7.f4247T == null || c0387d7.i(7).f4226f != null) {
                    return;
                }
                C0387d c0387d11 = this.f4437b;
                AbstractC0406o.b(c0397f2, c0387d11.f4247T.e.f4442h, c0387d11.s());
                AbstractC0406o.b(c0397f, c0397f2, c0398g.f4420g);
                C0387d c0387d12 = this.f4437b;
                if (c0387d12.f4233E) {
                    AbstractC0406o.b(c0397f3, c0397f2, c0387d12.f4255a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.f4439d != 3) {
            c0398g.b(this);
        } else {
            C0387d c0387d13 = this.f4437b;
            int i2 = c0387d13.f4284s;
            if (i2 == 2) {
                C0387d c0387d14 = c0387d13.f4247T;
                if (c0387d14 != null) {
                    C0398g c0398g2 = c0387d14.e.e;
                    c0398g.f4423l.add(c0398g2);
                    c0398g2.f4422k.add(c0398g);
                    c0398g.f4416b = true;
                    c0398g.f4422k.add(c0397f2);
                    c0398g.f4422k.add(c0397f);
                }
            } else if (i2 == 3 && !c0387d13.y()) {
                C0387d c0387d15 = this.f4437b;
                if (c0387d15.f4283r != 3) {
                    C0398g c0398g3 = c0387d15.f4260d.e;
                    c0398g.f4423l.add(c0398g3);
                    c0398g3.f4422k.add(c0398g);
                    c0398g.f4416b = true;
                    c0398g.f4422k.add(c0397f2);
                    c0398g.f4422k.add(c0397f);
                }
            }
        }
        C0387d c0387d16 = this.f4437b;
        C0386c[] c0386cArr2 = c0387d16.f4244Q;
        C0386c c0386c5 = c0386cArr2[2];
        C0386c c0386c6 = c0386c5.f4226f;
        if (c0386c6 != null && c0386cArr2[3].f4226f != null) {
            if (c0387d16.y()) {
                c0397f2.f4419f = this.f4437b.f4244Q[2].e();
                c0397f.f4419f = -this.f4437b.f4244Q[3].e();
            } else {
                C0397f h7 = AbstractC0406o.h(this.f4437b.f4244Q[2]);
                C0397f h8 = AbstractC0406o.h(this.f4437b.f4244Q[3]);
                if (h7 != null) {
                    h7.b(this);
                }
                if (h8 != null) {
                    h8.b(this);
                }
                this.j = 4;
            }
            if (this.f4437b.f4233E) {
                c(c0397f3, c0397f2, 1, this.f4430l);
            }
        } else if (c0386c6 != null) {
            C0397f h9 = AbstractC0406o.h(c0386c5);
            if (h9 != null) {
                AbstractC0406o.b(c0397f2, h9, this.f4437b.f4244Q[2].e());
                c(c0397f, c0397f2, 1, c0398g);
                if (this.f4437b.f4233E) {
                    c(c0397f3, c0397f2, 1, this.f4430l);
                }
                if (this.f4439d == 3) {
                    C0387d c0387d17 = this.f4437b;
                    if (c0387d17.f4250W > 0.0f) {
                        C0402k c0402k = c0387d17.f4260d;
                        if (c0402k.f4439d == 3) {
                            c0402k.e.f4422k.add(c0398g);
                            c0398g.f4423l.add(this.f4437b.f4260d.e);
                            c0398g.f4415a = this;
                        }
                    }
                }
            }
        } else {
            C0386c c0386c7 = c0386cArr2[3];
            if (c0386c7.f4226f != null) {
                C0397f h10 = AbstractC0406o.h(c0386c7);
                if (h10 != null) {
                    AbstractC0406o.b(c0397f, h10, -this.f4437b.f4244Q[3].e());
                    c(c0397f2, c0397f, -1, c0398g);
                    if (this.f4437b.f4233E) {
                        c(c0397f3, c0397f2, 1, this.f4430l);
                    }
                }
            } else {
                C0386c c0386c8 = c0386cArr2[4];
                if (c0386c8.f4226f != null) {
                    C0397f h11 = AbstractC0406o.h(c0386c8);
                    if (h11 != null) {
                        AbstractC0406o.b(c0397f3, h11, 0);
                        c(c0397f2, c0397f3, -1, this.f4430l);
                        c(c0397f, c0397f2, 1, c0398g);
                    }
                } else if (!(c0387d16 instanceof u.i) && (c0387d3 = c0387d16.f4247T) != null) {
                    AbstractC0406o.b(c0397f2, c0387d3.e.f4442h, c0387d16.s());
                    c(c0397f, c0397f2, 1, c0398g);
                    if (this.f4437b.f4233E) {
                        c(c0397f3, c0397f2, 1, this.f4430l);
                    }
                    if (this.f4439d == 3) {
                        C0387d c0387d18 = this.f4437b;
                        if (c0387d18.f4250W > 0.0f) {
                            C0402k c0402k2 = c0387d18.f4260d;
                            if (c0402k2.f4439d == 3) {
                                c0402k2.e.f4422k.add(c0398g);
                                c0398g.f4423l.add(this.f4437b.f4260d.e);
                                c0398g.f4415a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0398g.f4423l.size() == 0) {
            c0398g.f4417c = true;
        }
    }

    @Override // v.AbstractC0406o
    public final void e() {
        C0397f c0397f = this.f4442h;
        if (c0397f.j) {
            this.f4437b.f4253Z = c0397f.f4420g;
        }
    }

    @Override // v.AbstractC0406o
    public final void f() {
        this.f4438c = null;
        this.f4442h.c();
        this.i.c();
        this.f4429k.c();
        this.e.c();
        this.f4441g = false;
    }

    @Override // v.AbstractC0406o
    public final boolean k() {
        return this.f4439d != 3 || this.f4437b.f4284s == 0;
    }

    public final void m() {
        this.f4441g = false;
        C0397f c0397f = this.f4442h;
        c0397f.c();
        c0397f.j = false;
        C0397f c0397f2 = this.i;
        c0397f2.c();
        c0397f2.j = false;
        C0397f c0397f3 = this.f4429k;
        c0397f3.c();
        c0397f3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4437b.f4268h0;
    }
}
