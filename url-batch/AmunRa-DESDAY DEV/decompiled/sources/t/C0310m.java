package t;

import q.AbstractC0285e;
import s.C0294c;
import s.C0295d;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310m extends AbstractC0312o {

    /* renamed from: k, reason: collision with root package name */
    public C0303f f3856k;

    /* renamed from: l, reason: collision with root package name */
    public C0298a f3857l;

    @Override // t.InterfaceC0301d
    public final void a(InterfaceC0301d interfaceC0301d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0285e.a(this.f3869j) == 3) {
            C0295d c0295d = this.f3864b;
            l(c0295d.f3671J, c0295d.f3673L, 1);
            return;
        }
        C0304g c0304g = this.f3866e;
        if (c0304g.f3844c && !c0304g.f3848j && this.d == 3) {
            C0295d c0295d2 = this.f3864b;
            int i2 = c0295d2.f3717s;
            if (i2 == 2) {
                C0295d c0295d3 = c0295d2.f3681T;
                if (c0295d3 != null) {
                    if (c0295d3.f3695e.f3866e.f3848j) {
                        c0304g.d((int) ((r5.f3847g * c0295d2.f3724z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0304g c0304g2 = c0295d2.d.f3866e;
                if (c0304g2.f3848j) {
                    int i3 = c0295d2.f3685X;
                    if (i3 == -1) {
                        f2 = c0304g2.f3847g;
                        f3 = c0295d2.f3684W;
                    } else if (i3 == 0) {
                        f4 = c0304g2.f3847g * c0295d2.f3684W;
                        i = (int) (f4 + 0.5f);
                        c0304g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0304g.d(i);
                    } else {
                        f2 = c0304g2.f3847g;
                        f3 = c0295d2.f3684W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0304g.d(i);
                }
            }
        }
        C0303f c0303f = this.h;
        if (c0303f.f3844c) {
            C0303f c0303f2 = this.i;
            if (c0303f2.f3844c) {
                if (c0303f.f3848j && c0303f2.f3848j && c0304g.f3848j) {
                    return;
                }
                if (!c0304g.f3848j && this.d == 3) {
                    C0295d c0295d4 = this.f3864b;
                    if (c0295d4.f3716r == 0 && !c0295d4.y()) {
                        C0303f c0303f3 = (C0303f) c0303f.f3850l.get(0);
                        C0303f c0303f4 = (C0303f) c0303f2.f3850l.get(0);
                        int i4 = c0303f3.f3847g + c0303f.f3846f;
                        int i5 = c0303f4.f3847g + c0303f2.f3846f;
                        c0303f.d(i4);
                        c0303f2.d(i5);
                        c0304g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0304g.f3848j && this.d == 3 && this.f3863a == 1 && c0303f.f3850l.size() > 0 && c0303f2.f3850l.size() > 0) {
                    C0303f c0303f5 = (C0303f) c0303f.f3850l.get(0);
                    int i6 = (((C0303f) c0303f2.f3850l.get(0)).f3847g + c0303f2.f3846f) - (c0303f5.f3847g + c0303f.f3846f);
                    int i7 = c0304g.f3851m;
                    if (i6 < i7) {
                        c0304g.d(i6);
                    } else {
                        c0304g.d(i7);
                    }
                }
                if (c0304g.f3848j && c0303f.f3850l.size() > 0 && c0303f2.f3850l.size() > 0) {
                    C0303f c0303f6 = (C0303f) c0303f.f3850l.get(0);
                    C0303f c0303f7 = (C0303f) c0303f2.f3850l.get(0);
                    int i8 = c0303f6.f3847g;
                    int i9 = c0303f.f3846f + i8;
                    int i10 = c0303f7.f3847g;
                    int i11 = c0303f2.f3846f + i10;
                    float f5 = this.f3864b.f3696e0;
                    if (c0303f6 == c0303f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0303f.d((int) ((((i10 - i8) - c0304g.f3847g) * f5) + i8 + 0.5f));
                    c0303f2.d(c0303f.f3847g + c0304g.f3847g);
                }
            }
        }
    }

    @Override // t.AbstractC0312o
    public final void d() {
        C0295d c0295d;
        C0295d c0295d2;
        C0295d c0295d3;
        C0295d c0295d4;
        C0295d c0295d5 = this.f3864b;
        boolean z2 = c0295d5.f3688a;
        C0304g c0304g = this.f3866e;
        if (z2) {
            c0304g.d(c0295d5.k());
        }
        boolean z3 = c0304g.f3848j;
        C0303f c0303f = this.i;
        C0303f c0303f2 = this.h;
        if (!z3) {
            C0295d c0295d6 = this.f3864b;
            this.d = c0295d6.f3714p0[1];
            if (c0295d6.f3667E) {
                this.f3857l = new C0298a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0295d4 = this.f3864b.f3681T) != null && c0295d4.f3714p0[1] == 1) {
                    int k2 = (c0295d4.k() - this.f3864b.f3671J.e()) - this.f3864b.f3673L.e();
                    AbstractC0312o.b(c0303f2, c0295d4.f3695e.h, this.f3864b.f3671J.e());
                    AbstractC0312o.b(c0303f, c0295d4.f3695e.i, -this.f3864b.f3673L.e());
                    c0304g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0304g.d(this.f3864b.k());
                }
            }
        } else if (this.d == 4 && (c0295d2 = (c0295d = this.f3864b).f3681T) != null && c0295d2.f3714p0[1] == 1) {
            AbstractC0312o.b(c0303f2, c0295d2.f3695e.h, c0295d.f3671J.e());
            AbstractC0312o.b(c0303f, c0295d2.f3695e.i, -this.f3864b.f3673L.e());
            return;
        }
        boolean z4 = c0304g.f3848j;
        C0303f c0303f3 = this.f3856k;
        if (z4) {
            C0295d c0295d7 = this.f3864b;
            if (c0295d7.f3688a) {
                C0294c[] c0294cArr = c0295d7.f3678Q;
                C0294c c0294c = c0294cArr[2];
                C0294c c0294c2 = c0294c.f3661f;
                if (c0294c2 != null && c0294cArr[3].f3661f != null) {
                    if (c0295d7.y()) {
                        c0303f2.f3846f = this.f3864b.f3678Q[2].e();
                        c0303f.f3846f = -this.f3864b.f3678Q[3].e();
                    } else {
                        C0303f h = AbstractC0312o.h(this.f3864b.f3678Q[2]);
                        if (h != null) {
                            AbstractC0312o.b(c0303f2, h, this.f3864b.f3678Q[2].e());
                        }
                        C0303f h2 = AbstractC0312o.h(this.f3864b.f3678Q[3]);
                        if (h2 != null) {
                            AbstractC0312o.b(c0303f, h2, -this.f3864b.f3678Q[3].e());
                        }
                        c0303f2.f3843b = true;
                        c0303f.f3843b = true;
                    }
                    C0295d c0295d8 = this.f3864b;
                    if (c0295d8.f3667E) {
                        AbstractC0312o.b(c0303f3, c0303f2, c0295d8.f3689a0);
                        return;
                    }
                    return;
                }
                if (c0294c2 != null) {
                    C0303f h3 = AbstractC0312o.h(c0294c);
                    if (h3 != null) {
                        AbstractC0312o.b(c0303f2, h3, this.f3864b.f3678Q[2].e());
                        AbstractC0312o.b(c0303f, c0303f2, c0304g.f3847g);
                        C0295d c0295d9 = this.f3864b;
                        if (c0295d9.f3667E) {
                            AbstractC0312o.b(c0303f3, c0303f2, c0295d9.f3689a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0294c c0294c3 = c0294cArr[3];
                if (c0294c3.f3661f != null) {
                    C0303f h4 = AbstractC0312o.h(c0294c3);
                    if (h4 != null) {
                        AbstractC0312o.b(c0303f, h4, -this.f3864b.f3678Q[3].e());
                        AbstractC0312o.b(c0303f2, c0303f, -c0304g.f3847g);
                    }
                    C0295d c0295d10 = this.f3864b;
                    if (c0295d10.f3667E) {
                        AbstractC0312o.b(c0303f3, c0303f2, c0295d10.f3689a0);
                        return;
                    }
                    return;
                }
                C0294c c0294c4 = c0294cArr[4];
                if (c0294c4.f3661f != null) {
                    C0303f h5 = AbstractC0312o.h(c0294c4);
                    if (h5 != null) {
                        AbstractC0312o.b(c0303f3, h5, 0);
                        AbstractC0312o.b(c0303f2, c0303f3, -this.f3864b.f3689a0);
                        AbstractC0312o.b(c0303f, c0303f2, c0304g.f3847g);
                        return;
                    }
                    return;
                }
                if ((c0295d7 instanceof s.i) || c0295d7.f3681T == null || c0295d7.i(7).f3661f != null) {
                    return;
                }
                C0295d c0295d11 = this.f3864b;
                AbstractC0312o.b(c0303f2, c0295d11.f3681T.f3695e.h, c0295d11.s());
                AbstractC0312o.b(c0303f, c0303f2, c0304g.f3847g);
                C0295d c0295d12 = this.f3864b;
                if (c0295d12.f3667E) {
                    AbstractC0312o.b(c0303f3, c0303f2, c0295d12.f3689a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            c0304g.b(this);
        } else {
            C0295d c0295d13 = this.f3864b;
            int i2 = c0295d13.f3717s;
            if (i2 == 2) {
                C0295d c0295d14 = c0295d13.f3681T;
                if (c0295d14 != null) {
                    C0304g c0304g2 = c0295d14.f3695e.f3866e;
                    c0304g.f3850l.add(c0304g2);
                    c0304g2.f3849k.add(c0304g);
                    c0304g.f3843b = true;
                    c0304g.f3849k.add(c0303f2);
                    c0304g.f3849k.add(c0303f);
                }
            } else if (i2 == 3 && !c0295d13.y()) {
                C0295d c0295d15 = this.f3864b;
                if (c0295d15.f3716r != 3) {
                    C0304g c0304g3 = c0295d15.d.f3866e;
                    c0304g.f3850l.add(c0304g3);
                    c0304g3.f3849k.add(c0304g);
                    c0304g.f3843b = true;
                    c0304g.f3849k.add(c0303f2);
                    c0304g.f3849k.add(c0303f);
                }
            }
        }
        C0295d c0295d16 = this.f3864b;
        C0294c[] c0294cArr2 = c0295d16.f3678Q;
        C0294c c0294c5 = c0294cArr2[2];
        C0294c c0294c6 = c0294c5.f3661f;
        if (c0294c6 != null && c0294cArr2[3].f3661f != null) {
            if (c0295d16.y()) {
                c0303f2.f3846f = this.f3864b.f3678Q[2].e();
                c0303f.f3846f = -this.f3864b.f3678Q[3].e();
            } else {
                C0303f h6 = AbstractC0312o.h(this.f3864b.f3678Q[2]);
                C0303f h7 = AbstractC0312o.h(this.f3864b.f3678Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3869j = 4;
            }
            if (this.f3864b.f3667E) {
                c(c0303f3, c0303f2, 1, this.f3857l);
            }
        } else if (c0294c6 != null) {
            C0303f h8 = AbstractC0312o.h(c0294c5);
            if (h8 != null) {
                AbstractC0312o.b(c0303f2, h8, this.f3864b.f3678Q[2].e());
                c(c0303f, c0303f2, 1, c0304g);
                if (this.f3864b.f3667E) {
                    c(c0303f3, c0303f2, 1, this.f3857l);
                }
                if (this.d == 3) {
                    C0295d c0295d17 = this.f3864b;
                    if (c0295d17.f3684W > 0.0f) {
                        C0308k c0308k = c0295d17.d;
                        if (c0308k.d == 3) {
                            c0308k.f3866e.f3849k.add(c0304g);
                            c0304g.f3850l.add(this.f3864b.d.f3866e);
                            c0304g.f3842a = this;
                        }
                    }
                }
            }
        } else {
            C0294c c0294c7 = c0294cArr2[3];
            if (c0294c7.f3661f != null) {
                C0303f h9 = AbstractC0312o.h(c0294c7);
                if (h9 != null) {
                    AbstractC0312o.b(c0303f, h9, -this.f3864b.f3678Q[3].e());
                    c(c0303f2, c0303f, -1, c0304g);
                    if (this.f3864b.f3667E) {
                        c(c0303f3, c0303f2, 1, this.f3857l);
                    }
                }
            } else {
                C0294c c0294c8 = c0294cArr2[4];
                if (c0294c8.f3661f != null) {
                    C0303f h10 = AbstractC0312o.h(c0294c8);
                    if (h10 != null) {
                        AbstractC0312o.b(c0303f3, h10, 0);
                        c(c0303f2, c0303f3, -1, this.f3857l);
                        c(c0303f, c0303f2, 1, c0304g);
                    }
                } else if (!(c0295d16 instanceof s.i) && (c0295d3 = c0295d16.f3681T) != null) {
                    AbstractC0312o.b(c0303f2, c0295d3.f3695e.h, c0295d16.s());
                    c(c0303f, c0303f2, 1, c0304g);
                    if (this.f3864b.f3667E) {
                        c(c0303f3, c0303f2, 1, this.f3857l);
                    }
                    if (this.d == 3) {
                        C0295d c0295d18 = this.f3864b;
                        if (c0295d18.f3684W > 0.0f) {
                            C0308k c0308k2 = c0295d18.d;
                            if (c0308k2.d == 3) {
                                c0308k2.f3866e.f3849k.add(c0304g);
                                c0304g.f3850l.add(this.f3864b.d.f3866e);
                                c0304g.f3842a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0304g.f3850l.size() == 0) {
            c0304g.f3844c = true;
        }
    }

    @Override // t.AbstractC0312o
    public final void e() {
        C0303f c0303f = this.h;
        if (c0303f.f3848j) {
            this.f3864b.f3687Z = c0303f.f3847g;
        }
    }

    @Override // t.AbstractC0312o
    public final void f() {
        this.f3865c = null;
        this.h.c();
        this.i.c();
        this.f3856k.c();
        this.f3866e.c();
        this.f3868g = false;
    }

    @Override // t.AbstractC0312o
    public final boolean k() {
        return this.d != 3 || this.f3864b.f3717s == 0;
    }

    public final void m() {
        this.f3868g = false;
        C0303f c0303f = this.h;
        c0303f.c();
        c0303f.f3848j = false;
        C0303f c0303f2 = this.i;
        c0303f2.c();
        c0303f2.f3848j = false;
        C0303f c0303f3 = this.f3856k;
        c0303f3.c();
        c0303f3.f3848j = false;
        this.f3866e.f3848j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3864b.f3701h0;
    }
}
