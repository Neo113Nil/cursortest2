package t;

import q.AbstractC0290e;
import s.C0297c;
import s.C0298d;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313m extends AbstractC0315o {

    /* renamed from: k, reason: collision with root package name */
    public C0306f f3766k;

    /* renamed from: l, reason: collision with root package name */
    public C0301a f3767l;

    @Override // t.InterfaceC0304d
    public final void a(InterfaceC0304d interfaceC0304d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0290e.a(this.f3779j) == 3) {
            C0298d c0298d = this.f3774b;
            l(c0298d.f3600J, c0298d.f3602L, 1);
            return;
        }
        C0307g c0307g = this.f3776e;
        if (c0307g.f3754c && !c0307g.f3758j && this.d == 3) {
            C0298d c0298d2 = this.f3774b;
            int i2 = c0298d2.f3647s;
            if (i2 == 2) {
                C0298d c0298d3 = c0298d2.f3610T;
                if (c0298d3 != null) {
                    if (c0298d3.f3624e.f3776e.f3758j) {
                        c0307g.d((int) ((r5.f3757g * c0298d2.f3654z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0307g c0307g2 = c0298d2.d.f3776e;
                if (c0307g2.f3758j) {
                    int i3 = c0298d2.f3614X;
                    if (i3 == -1) {
                        f2 = c0307g2.f3757g;
                        f3 = c0298d2.f3613W;
                    } else if (i3 == 0) {
                        f4 = c0307g2.f3757g * c0298d2.f3613W;
                        i = (int) (f4 + 0.5f);
                        c0307g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0307g.d(i);
                    } else {
                        f2 = c0307g2.f3757g;
                        f3 = c0298d2.f3613W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0307g.d(i);
                }
            }
        }
        C0306f c0306f = this.h;
        if (c0306f.f3754c) {
            C0306f c0306f2 = this.i;
            if (c0306f2.f3754c) {
                if (c0306f.f3758j && c0306f2.f3758j && c0307g.f3758j) {
                    return;
                }
                if (!c0307g.f3758j && this.d == 3) {
                    C0298d c0298d4 = this.f3774b;
                    if (c0298d4.f3646r == 0 && !c0298d4.y()) {
                        C0306f c0306f3 = (C0306f) c0306f.f3760l.get(0);
                        C0306f c0306f4 = (C0306f) c0306f2.f3760l.get(0);
                        int i4 = c0306f3.f3757g + c0306f.f3756f;
                        int i5 = c0306f4.f3757g + c0306f2.f3756f;
                        c0306f.d(i4);
                        c0306f2.d(i5);
                        c0307g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0307g.f3758j && this.d == 3 && this.f3773a == 1 && c0306f.f3760l.size() > 0 && c0306f2.f3760l.size() > 0) {
                    C0306f c0306f5 = (C0306f) c0306f.f3760l.get(0);
                    int i6 = (((C0306f) c0306f2.f3760l.get(0)).f3757g + c0306f2.f3756f) - (c0306f5.f3757g + c0306f.f3756f);
                    int i7 = c0307g.f3761m;
                    if (i6 < i7) {
                        c0307g.d(i6);
                    } else {
                        c0307g.d(i7);
                    }
                }
                if (c0307g.f3758j && c0306f.f3760l.size() > 0 && c0306f2.f3760l.size() > 0) {
                    C0306f c0306f6 = (C0306f) c0306f.f3760l.get(0);
                    C0306f c0306f7 = (C0306f) c0306f2.f3760l.get(0);
                    int i8 = c0306f6.f3757g;
                    int i9 = c0306f.f3756f + i8;
                    int i10 = c0306f7.f3757g;
                    int i11 = c0306f2.f3756f + i10;
                    float f5 = this.f3774b.f3625e0;
                    if (c0306f6 == c0306f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0306f.d((int) ((((i10 - i8) - c0307g.f3757g) * f5) + i8 + 0.5f));
                    c0306f2.d(c0306f.f3757g + c0307g.f3757g);
                }
            }
        }
    }

    @Override // t.AbstractC0315o
    public final void d() {
        C0298d c0298d;
        C0298d c0298d2;
        C0298d c0298d3;
        C0298d c0298d4;
        C0298d c0298d5 = this.f3774b;
        boolean z2 = c0298d5.f3617a;
        C0307g c0307g = this.f3776e;
        if (z2) {
            c0307g.d(c0298d5.k());
        }
        boolean z3 = c0307g.f3758j;
        C0306f c0306f = this.i;
        C0306f c0306f2 = this.h;
        if (!z3) {
            C0298d c0298d6 = this.f3774b;
            this.d = c0298d6.f3644p0[1];
            if (c0298d6.f3596E) {
                this.f3767l = new C0301a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0298d4 = this.f3774b.f3610T) != null && c0298d4.f3644p0[1] == 1) {
                    int k2 = (c0298d4.k() - this.f3774b.f3600J.e()) - this.f3774b.f3602L.e();
                    AbstractC0315o.b(c0306f2, c0298d4.f3624e.h, this.f3774b.f3600J.e());
                    AbstractC0315o.b(c0306f, c0298d4.f3624e.i, -this.f3774b.f3602L.e());
                    c0307g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0307g.d(this.f3774b.k());
                }
            }
        } else if (this.d == 4 && (c0298d2 = (c0298d = this.f3774b).f3610T) != null && c0298d2.f3644p0[1] == 1) {
            AbstractC0315o.b(c0306f2, c0298d2.f3624e.h, c0298d.f3600J.e());
            AbstractC0315o.b(c0306f, c0298d2.f3624e.i, -this.f3774b.f3602L.e());
            return;
        }
        boolean z4 = c0307g.f3758j;
        C0306f c0306f3 = this.f3766k;
        if (z4) {
            C0298d c0298d7 = this.f3774b;
            if (c0298d7.f3617a) {
                C0297c[] c0297cArr = c0298d7.f3607Q;
                C0297c c0297c = c0297cArr[2];
                C0297c c0297c2 = c0297c.f3590f;
                if (c0297c2 != null && c0297cArr[3].f3590f != null) {
                    if (c0298d7.y()) {
                        c0306f2.f3756f = this.f3774b.f3607Q[2].e();
                        c0306f.f3756f = -this.f3774b.f3607Q[3].e();
                    } else {
                        C0306f h = AbstractC0315o.h(this.f3774b.f3607Q[2]);
                        if (h != null) {
                            AbstractC0315o.b(c0306f2, h, this.f3774b.f3607Q[2].e());
                        }
                        C0306f h2 = AbstractC0315o.h(this.f3774b.f3607Q[3]);
                        if (h2 != null) {
                            AbstractC0315o.b(c0306f, h2, -this.f3774b.f3607Q[3].e());
                        }
                        c0306f2.f3753b = true;
                        c0306f.f3753b = true;
                    }
                    C0298d c0298d8 = this.f3774b;
                    if (c0298d8.f3596E) {
                        AbstractC0315o.b(c0306f3, c0306f2, c0298d8.f3618a0);
                        return;
                    }
                    return;
                }
                if (c0297c2 != null) {
                    C0306f h3 = AbstractC0315o.h(c0297c);
                    if (h3 != null) {
                        AbstractC0315o.b(c0306f2, h3, this.f3774b.f3607Q[2].e());
                        AbstractC0315o.b(c0306f, c0306f2, c0307g.f3757g);
                        C0298d c0298d9 = this.f3774b;
                        if (c0298d9.f3596E) {
                            AbstractC0315o.b(c0306f3, c0306f2, c0298d9.f3618a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0297c c0297c3 = c0297cArr[3];
                if (c0297c3.f3590f != null) {
                    C0306f h4 = AbstractC0315o.h(c0297c3);
                    if (h4 != null) {
                        AbstractC0315o.b(c0306f, h4, -this.f3774b.f3607Q[3].e());
                        AbstractC0315o.b(c0306f2, c0306f, -c0307g.f3757g);
                    }
                    C0298d c0298d10 = this.f3774b;
                    if (c0298d10.f3596E) {
                        AbstractC0315o.b(c0306f3, c0306f2, c0298d10.f3618a0);
                        return;
                    }
                    return;
                }
                C0297c c0297c4 = c0297cArr[4];
                if (c0297c4.f3590f != null) {
                    C0306f h5 = AbstractC0315o.h(c0297c4);
                    if (h5 != null) {
                        AbstractC0315o.b(c0306f3, h5, 0);
                        AbstractC0315o.b(c0306f2, c0306f3, -this.f3774b.f3618a0);
                        AbstractC0315o.b(c0306f, c0306f2, c0307g.f3757g);
                        return;
                    }
                    return;
                }
                if ((c0298d7 instanceof s.i) || c0298d7.f3610T == null || c0298d7.i(7).f3590f != null) {
                    return;
                }
                C0298d c0298d11 = this.f3774b;
                AbstractC0315o.b(c0306f2, c0298d11.f3610T.f3624e.h, c0298d11.s());
                AbstractC0315o.b(c0306f, c0306f2, c0307g.f3757g);
                C0298d c0298d12 = this.f3774b;
                if (c0298d12.f3596E) {
                    AbstractC0315o.b(c0306f3, c0306f2, c0298d12.f3618a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            c0307g.b(this);
        } else {
            C0298d c0298d13 = this.f3774b;
            int i2 = c0298d13.f3647s;
            if (i2 == 2) {
                C0298d c0298d14 = c0298d13.f3610T;
                if (c0298d14 != null) {
                    C0307g c0307g2 = c0298d14.f3624e.f3776e;
                    c0307g.f3760l.add(c0307g2);
                    c0307g2.f3759k.add(c0307g);
                    c0307g.f3753b = true;
                    c0307g.f3759k.add(c0306f2);
                    c0307g.f3759k.add(c0306f);
                }
            } else if (i2 == 3 && !c0298d13.y()) {
                C0298d c0298d15 = this.f3774b;
                if (c0298d15.f3646r != 3) {
                    C0307g c0307g3 = c0298d15.d.f3776e;
                    c0307g.f3760l.add(c0307g3);
                    c0307g3.f3759k.add(c0307g);
                    c0307g.f3753b = true;
                    c0307g.f3759k.add(c0306f2);
                    c0307g.f3759k.add(c0306f);
                }
            }
        }
        C0298d c0298d16 = this.f3774b;
        C0297c[] c0297cArr2 = c0298d16.f3607Q;
        C0297c c0297c5 = c0297cArr2[2];
        C0297c c0297c6 = c0297c5.f3590f;
        if (c0297c6 != null && c0297cArr2[3].f3590f != null) {
            if (c0298d16.y()) {
                c0306f2.f3756f = this.f3774b.f3607Q[2].e();
                c0306f.f3756f = -this.f3774b.f3607Q[3].e();
            } else {
                C0306f h6 = AbstractC0315o.h(this.f3774b.f3607Q[2]);
                C0306f h7 = AbstractC0315o.h(this.f3774b.f3607Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3779j = 4;
            }
            if (this.f3774b.f3596E) {
                c(c0306f3, c0306f2, 1, this.f3767l);
            }
        } else if (c0297c6 != null) {
            C0306f h8 = AbstractC0315o.h(c0297c5);
            if (h8 != null) {
                AbstractC0315o.b(c0306f2, h8, this.f3774b.f3607Q[2].e());
                c(c0306f, c0306f2, 1, c0307g);
                if (this.f3774b.f3596E) {
                    c(c0306f3, c0306f2, 1, this.f3767l);
                }
                if (this.d == 3) {
                    C0298d c0298d17 = this.f3774b;
                    if (c0298d17.f3613W > 0.0f) {
                        C0311k c0311k = c0298d17.d;
                        if (c0311k.d == 3) {
                            c0311k.f3776e.f3759k.add(c0307g);
                            c0307g.f3760l.add(this.f3774b.d.f3776e);
                            c0307g.f3752a = this;
                        }
                    }
                }
            }
        } else {
            C0297c c0297c7 = c0297cArr2[3];
            if (c0297c7.f3590f != null) {
                C0306f h9 = AbstractC0315o.h(c0297c7);
                if (h9 != null) {
                    AbstractC0315o.b(c0306f, h9, -this.f3774b.f3607Q[3].e());
                    c(c0306f2, c0306f, -1, c0307g);
                    if (this.f3774b.f3596E) {
                        c(c0306f3, c0306f2, 1, this.f3767l);
                    }
                }
            } else {
                C0297c c0297c8 = c0297cArr2[4];
                if (c0297c8.f3590f != null) {
                    C0306f h10 = AbstractC0315o.h(c0297c8);
                    if (h10 != null) {
                        AbstractC0315o.b(c0306f3, h10, 0);
                        c(c0306f2, c0306f3, -1, this.f3767l);
                        c(c0306f, c0306f2, 1, c0307g);
                    }
                } else if (!(c0298d16 instanceof s.i) && (c0298d3 = c0298d16.f3610T) != null) {
                    AbstractC0315o.b(c0306f2, c0298d3.f3624e.h, c0298d16.s());
                    c(c0306f, c0306f2, 1, c0307g);
                    if (this.f3774b.f3596E) {
                        c(c0306f3, c0306f2, 1, this.f3767l);
                    }
                    if (this.d == 3) {
                        C0298d c0298d18 = this.f3774b;
                        if (c0298d18.f3613W > 0.0f) {
                            C0311k c0311k2 = c0298d18.d;
                            if (c0311k2.d == 3) {
                                c0311k2.f3776e.f3759k.add(c0307g);
                                c0307g.f3760l.add(this.f3774b.d.f3776e);
                                c0307g.f3752a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0307g.f3760l.size() == 0) {
            c0307g.f3754c = true;
        }
    }

    @Override // t.AbstractC0315o
    public final void e() {
        C0306f c0306f = this.h;
        if (c0306f.f3758j) {
            this.f3774b.f3616Z = c0306f.f3757g;
        }
    }

    @Override // t.AbstractC0315o
    public final void f() {
        this.f3775c = null;
        this.h.c();
        this.i.c();
        this.f3766k.c();
        this.f3776e.c();
        this.f3778g = false;
    }

    @Override // t.AbstractC0315o
    public final boolean k() {
        return this.d != 3 || this.f3774b.f3647s == 0;
    }

    public final void m() {
        this.f3778g = false;
        C0306f c0306f = this.h;
        c0306f.c();
        c0306f.f3758j = false;
        C0306f c0306f2 = this.i;
        c0306f2.c();
        c0306f2.f3758j = false;
        C0306f c0306f3 = this.f3766k;
        c0306f3.c();
        c0306f3.f3758j = false;
        this.f3776e.f3758j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3774b.f3630h0;
    }
}
