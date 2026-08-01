package t;

import q.AbstractC0273e;
import s.C0280c;
import s.C0281d;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296m extends AbstractC0298o {

    /* renamed from: k, reason: collision with root package name */
    public C0289f f3808k;

    /* renamed from: l, reason: collision with root package name */
    public C0284a f3809l;

    @Override // t.InterfaceC0287d
    public final void a(InterfaceC0287d interfaceC0287d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0273e.a(this.f3821j) == 3) {
            C0281d c0281d = this.f3816b;
            l(c0281d.f3611J, c0281d.f3613L, 1);
            return;
        }
        C0290g c0290g = this.f3818e;
        if (c0290g.f3796c && !c0290g.f3800j && this.d == 3) {
            C0281d c0281d2 = this.f3816b;
            int i2 = c0281d2.f3657s;
            if (i2 == 2) {
                C0281d c0281d3 = c0281d2.f3621T;
                if (c0281d3 != null) {
                    if (c0281d3.f3635e.f3818e.f3800j) {
                        c0290g.d((int) ((r5.f3799g * c0281d2.f3664z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0290g c0290g2 = c0281d2.d.f3818e;
                if (c0290g2.f3800j) {
                    int i3 = c0281d2.f3625X;
                    if (i3 == -1) {
                        f2 = c0290g2.f3799g;
                        f3 = c0281d2.f3624W;
                    } else if (i3 == 0) {
                        f4 = c0290g2.f3799g * c0281d2.f3624W;
                        i = (int) (f4 + 0.5f);
                        c0290g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0290g.d(i);
                    } else {
                        f2 = c0290g2.f3799g;
                        f3 = c0281d2.f3624W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0290g.d(i);
                }
            }
        }
        C0289f c0289f = this.h;
        if (c0289f.f3796c) {
            C0289f c0289f2 = this.i;
            if (c0289f2.f3796c) {
                if (c0289f.f3800j && c0289f2.f3800j && c0290g.f3800j) {
                    return;
                }
                if (!c0290g.f3800j && this.d == 3) {
                    C0281d c0281d4 = this.f3816b;
                    if (c0281d4.f3656r == 0 && !c0281d4.y()) {
                        C0289f c0289f3 = (C0289f) c0289f.f3802l.get(0);
                        C0289f c0289f4 = (C0289f) c0289f2.f3802l.get(0);
                        int i4 = c0289f3.f3799g + c0289f.f3798f;
                        int i5 = c0289f4.f3799g + c0289f2.f3798f;
                        c0289f.d(i4);
                        c0289f2.d(i5);
                        c0290g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0290g.f3800j && this.d == 3 && this.f3815a == 1 && c0289f.f3802l.size() > 0 && c0289f2.f3802l.size() > 0) {
                    C0289f c0289f5 = (C0289f) c0289f.f3802l.get(0);
                    int i6 = (((C0289f) c0289f2.f3802l.get(0)).f3799g + c0289f2.f3798f) - (c0289f5.f3799g + c0289f.f3798f);
                    int i7 = c0290g.f3803m;
                    if (i6 < i7) {
                        c0290g.d(i6);
                    } else {
                        c0290g.d(i7);
                    }
                }
                if (c0290g.f3800j && c0289f.f3802l.size() > 0 && c0289f2.f3802l.size() > 0) {
                    C0289f c0289f6 = (C0289f) c0289f.f3802l.get(0);
                    C0289f c0289f7 = (C0289f) c0289f2.f3802l.get(0);
                    int i8 = c0289f6.f3799g;
                    int i9 = c0289f.f3798f + i8;
                    int i10 = c0289f7.f3799g;
                    int i11 = c0289f2.f3798f + i10;
                    float f5 = this.f3816b.f3636e0;
                    if (c0289f6 == c0289f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0289f.d((int) ((((i10 - i8) - c0290g.f3799g) * f5) + i8 + 0.5f));
                    c0289f2.d(c0289f.f3799g + c0290g.f3799g);
                }
            }
        }
    }

    @Override // t.AbstractC0298o
    public final void d() {
        C0281d c0281d;
        C0281d c0281d2;
        C0281d c0281d3;
        C0281d c0281d4;
        C0281d c0281d5 = this.f3816b;
        boolean z2 = c0281d5.f3628a;
        C0290g c0290g = this.f3818e;
        if (z2) {
            c0290g.d(c0281d5.k());
        }
        boolean z3 = c0290g.f3800j;
        C0289f c0289f = this.i;
        C0289f c0289f2 = this.h;
        if (!z3) {
            C0281d c0281d6 = this.f3816b;
            this.d = c0281d6.f3654p0[1];
            if (c0281d6.f3607E) {
                this.f3809l = new C0284a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0281d4 = this.f3816b.f3621T) != null && c0281d4.f3654p0[1] == 1) {
                    int k2 = (c0281d4.k() - this.f3816b.f3611J.e()) - this.f3816b.f3613L.e();
                    AbstractC0298o.b(c0289f2, c0281d4.f3635e.h, this.f3816b.f3611J.e());
                    AbstractC0298o.b(c0289f, c0281d4.f3635e.i, -this.f3816b.f3613L.e());
                    c0290g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0290g.d(this.f3816b.k());
                }
            }
        } else if (this.d == 4 && (c0281d2 = (c0281d = this.f3816b).f3621T) != null && c0281d2.f3654p0[1] == 1) {
            AbstractC0298o.b(c0289f2, c0281d2.f3635e.h, c0281d.f3611J.e());
            AbstractC0298o.b(c0289f, c0281d2.f3635e.i, -this.f3816b.f3613L.e());
            return;
        }
        boolean z4 = c0290g.f3800j;
        C0289f c0289f3 = this.f3808k;
        if (z4) {
            C0281d c0281d7 = this.f3816b;
            if (c0281d7.f3628a) {
                C0280c[] c0280cArr = c0281d7.f3618Q;
                C0280c c0280c = c0280cArr[2];
                C0280c c0280c2 = c0280c.f3601f;
                if (c0280c2 != null && c0280cArr[3].f3601f != null) {
                    if (c0281d7.y()) {
                        c0289f2.f3798f = this.f3816b.f3618Q[2].e();
                        c0289f.f3798f = -this.f3816b.f3618Q[3].e();
                    } else {
                        C0289f h = AbstractC0298o.h(this.f3816b.f3618Q[2]);
                        if (h != null) {
                            AbstractC0298o.b(c0289f2, h, this.f3816b.f3618Q[2].e());
                        }
                        C0289f h2 = AbstractC0298o.h(this.f3816b.f3618Q[3]);
                        if (h2 != null) {
                            AbstractC0298o.b(c0289f, h2, -this.f3816b.f3618Q[3].e());
                        }
                        c0289f2.f3795b = true;
                        c0289f.f3795b = true;
                    }
                    C0281d c0281d8 = this.f3816b;
                    if (c0281d8.f3607E) {
                        AbstractC0298o.b(c0289f3, c0289f2, c0281d8.f3629a0);
                        return;
                    }
                    return;
                }
                if (c0280c2 != null) {
                    C0289f h3 = AbstractC0298o.h(c0280c);
                    if (h3 != null) {
                        AbstractC0298o.b(c0289f2, h3, this.f3816b.f3618Q[2].e());
                        AbstractC0298o.b(c0289f, c0289f2, c0290g.f3799g);
                        C0281d c0281d9 = this.f3816b;
                        if (c0281d9.f3607E) {
                            AbstractC0298o.b(c0289f3, c0289f2, c0281d9.f3629a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0280c c0280c3 = c0280cArr[3];
                if (c0280c3.f3601f != null) {
                    C0289f h4 = AbstractC0298o.h(c0280c3);
                    if (h4 != null) {
                        AbstractC0298o.b(c0289f, h4, -this.f3816b.f3618Q[3].e());
                        AbstractC0298o.b(c0289f2, c0289f, -c0290g.f3799g);
                    }
                    C0281d c0281d10 = this.f3816b;
                    if (c0281d10.f3607E) {
                        AbstractC0298o.b(c0289f3, c0289f2, c0281d10.f3629a0);
                        return;
                    }
                    return;
                }
                C0280c c0280c4 = c0280cArr[4];
                if (c0280c4.f3601f != null) {
                    C0289f h5 = AbstractC0298o.h(c0280c4);
                    if (h5 != null) {
                        AbstractC0298o.b(c0289f3, h5, 0);
                        AbstractC0298o.b(c0289f2, c0289f3, -this.f3816b.f3629a0);
                        AbstractC0298o.b(c0289f, c0289f2, c0290g.f3799g);
                        return;
                    }
                    return;
                }
                if ((c0281d7 instanceof s.i) || c0281d7.f3621T == null || c0281d7.i(7).f3601f != null) {
                    return;
                }
                C0281d c0281d11 = this.f3816b;
                AbstractC0298o.b(c0289f2, c0281d11.f3621T.f3635e.h, c0281d11.s());
                AbstractC0298o.b(c0289f, c0289f2, c0290g.f3799g);
                C0281d c0281d12 = this.f3816b;
                if (c0281d12.f3607E) {
                    AbstractC0298o.b(c0289f3, c0289f2, c0281d12.f3629a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            c0290g.b(this);
        } else {
            C0281d c0281d13 = this.f3816b;
            int i2 = c0281d13.f3657s;
            if (i2 == 2) {
                C0281d c0281d14 = c0281d13.f3621T;
                if (c0281d14 != null) {
                    C0290g c0290g2 = c0281d14.f3635e.f3818e;
                    c0290g.f3802l.add(c0290g2);
                    c0290g2.f3801k.add(c0290g);
                    c0290g.f3795b = true;
                    c0290g.f3801k.add(c0289f2);
                    c0290g.f3801k.add(c0289f);
                }
            } else if (i2 == 3 && !c0281d13.y()) {
                C0281d c0281d15 = this.f3816b;
                if (c0281d15.f3656r != 3) {
                    C0290g c0290g3 = c0281d15.d.f3818e;
                    c0290g.f3802l.add(c0290g3);
                    c0290g3.f3801k.add(c0290g);
                    c0290g.f3795b = true;
                    c0290g.f3801k.add(c0289f2);
                    c0290g.f3801k.add(c0289f);
                }
            }
        }
        C0281d c0281d16 = this.f3816b;
        C0280c[] c0280cArr2 = c0281d16.f3618Q;
        C0280c c0280c5 = c0280cArr2[2];
        C0280c c0280c6 = c0280c5.f3601f;
        if (c0280c6 != null && c0280cArr2[3].f3601f != null) {
            if (c0281d16.y()) {
                c0289f2.f3798f = this.f3816b.f3618Q[2].e();
                c0289f.f3798f = -this.f3816b.f3618Q[3].e();
            } else {
                C0289f h6 = AbstractC0298o.h(this.f3816b.f3618Q[2]);
                C0289f h7 = AbstractC0298o.h(this.f3816b.f3618Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3821j = 4;
            }
            if (this.f3816b.f3607E) {
                c(c0289f3, c0289f2, 1, this.f3809l);
            }
        } else if (c0280c6 != null) {
            C0289f h8 = AbstractC0298o.h(c0280c5);
            if (h8 != null) {
                AbstractC0298o.b(c0289f2, h8, this.f3816b.f3618Q[2].e());
                c(c0289f, c0289f2, 1, c0290g);
                if (this.f3816b.f3607E) {
                    c(c0289f3, c0289f2, 1, this.f3809l);
                }
                if (this.d == 3) {
                    C0281d c0281d17 = this.f3816b;
                    if (c0281d17.f3624W > 0.0f) {
                        C0294k c0294k = c0281d17.d;
                        if (c0294k.d == 3) {
                            c0294k.f3818e.f3801k.add(c0290g);
                            c0290g.f3802l.add(this.f3816b.d.f3818e);
                            c0290g.f3794a = this;
                        }
                    }
                }
            }
        } else {
            C0280c c0280c7 = c0280cArr2[3];
            if (c0280c7.f3601f != null) {
                C0289f h9 = AbstractC0298o.h(c0280c7);
                if (h9 != null) {
                    AbstractC0298o.b(c0289f, h9, -this.f3816b.f3618Q[3].e());
                    c(c0289f2, c0289f, -1, c0290g);
                    if (this.f3816b.f3607E) {
                        c(c0289f3, c0289f2, 1, this.f3809l);
                    }
                }
            } else {
                C0280c c0280c8 = c0280cArr2[4];
                if (c0280c8.f3601f != null) {
                    C0289f h10 = AbstractC0298o.h(c0280c8);
                    if (h10 != null) {
                        AbstractC0298o.b(c0289f3, h10, 0);
                        c(c0289f2, c0289f3, -1, this.f3809l);
                        c(c0289f, c0289f2, 1, c0290g);
                    }
                } else if (!(c0281d16 instanceof s.i) && (c0281d3 = c0281d16.f3621T) != null) {
                    AbstractC0298o.b(c0289f2, c0281d3.f3635e.h, c0281d16.s());
                    c(c0289f, c0289f2, 1, c0290g);
                    if (this.f3816b.f3607E) {
                        c(c0289f3, c0289f2, 1, this.f3809l);
                    }
                    if (this.d == 3) {
                        C0281d c0281d18 = this.f3816b;
                        if (c0281d18.f3624W > 0.0f) {
                            C0294k c0294k2 = c0281d18.d;
                            if (c0294k2.d == 3) {
                                c0294k2.f3818e.f3801k.add(c0290g);
                                c0290g.f3802l.add(this.f3816b.d.f3818e);
                                c0290g.f3794a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0290g.f3802l.size() == 0) {
            c0290g.f3796c = true;
        }
    }

    @Override // t.AbstractC0298o
    public final void e() {
        C0289f c0289f = this.h;
        if (c0289f.f3800j) {
            this.f3816b.f3627Z = c0289f.f3799g;
        }
    }

    @Override // t.AbstractC0298o
    public final void f() {
        this.f3817c = null;
        this.h.c();
        this.i.c();
        this.f3808k.c();
        this.f3818e.c();
        this.f3820g = false;
    }

    @Override // t.AbstractC0298o
    public final boolean k() {
        return this.d != 3 || this.f3816b.f3657s == 0;
    }

    public final void m() {
        this.f3820g = false;
        C0289f c0289f = this.h;
        c0289f.c();
        c0289f.f3800j = false;
        C0289f c0289f2 = this.i;
        c0289f2.c();
        c0289f2.f3800j = false;
        C0289f c0289f3 = this.f3808k;
        c0289f3.c();
        c0289f3.f3800j = false;
        this.f3818e.f3800j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3816b.f3641h0;
    }
}
