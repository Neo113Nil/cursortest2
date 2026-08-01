package t;

import q.AbstractC0317e;
import s.C0339c;
import s.C0340d;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355m extends AbstractC0358p {

    /* renamed from: k, reason: collision with root package name */
    public C0348f f3704k;

    /* renamed from: l, reason: collision with root package name */
    public C0343a f3705l;

    @Override // t.InterfaceC0346d
    public final void a(InterfaceC0346d interfaceC0346d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0317e.a(this.f3717j) == 3) {
            C0340d c0340d = this.f3712b;
            l(c0340d.f3505J, c0340d.f3507L, 1);
            return;
        }
        C0349g c0349g = this.f3714e;
        if (c0349g.f3692c && !c0349g.f3696j && this.d == 3) {
            C0340d c0340d2 = this.f3712b;
            int i2 = c0340d2.f3552s;
            if (i2 == 2) {
                C0340d c0340d3 = c0340d2.f3515T;
                if (c0340d3 != null) {
                    if (c0340d3.f3529e.f3714e.f3696j) {
                        c0349g.d((int) ((r5.f3695g * c0340d2.f3559z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0349g c0349g2 = c0340d2.d.f3714e;
                if (c0349g2.f3696j) {
                    int i3 = c0340d2.f3519X;
                    if (i3 == -1) {
                        f2 = c0349g2.f3695g;
                        f3 = c0340d2.f3518W;
                    } else if (i3 == 0) {
                        f4 = c0349g2.f3695g * c0340d2.f3518W;
                        i = (int) (f4 + 0.5f);
                        c0349g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0349g.d(i);
                    } else {
                        f2 = c0349g2.f3695g;
                        f3 = c0340d2.f3518W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0349g.d(i);
                }
            }
        }
        C0348f c0348f = this.h;
        if (c0348f.f3692c) {
            C0348f c0348f2 = this.i;
            if (c0348f2.f3692c) {
                if (c0348f.f3696j && c0348f2.f3696j && c0349g.f3696j) {
                    return;
                }
                if (!c0349g.f3696j && this.d == 3) {
                    C0340d c0340d4 = this.f3712b;
                    if (c0340d4.f3551r == 0 && !c0340d4.y()) {
                        C0348f c0348f3 = (C0348f) c0348f.f3698l.get(0);
                        C0348f c0348f4 = (C0348f) c0348f2.f3698l.get(0);
                        int i4 = c0348f3.f3695g + c0348f.f3694f;
                        int i5 = c0348f4.f3695g + c0348f2.f3694f;
                        c0348f.d(i4);
                        c0348f2.d(i5);
                        c0349g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0349g.f3696j && this.d == 3 && this.f3711a == 1 && c0348f.f3698l.size() > 0 && c0348f2.f3698l.size() > 0) {
                    C0348f c0348f5 = (C0348f) c0348f.f3698l.get(0);
                    int i6 = (((C0348f) c0348f2.f3698l.get(0)).f3695g + c0348f2.f3694f) - (c0348f5.f3695g + c0348f.f3694f);
                    int i7 = c0349g.f3699m;
                    if (i6 < i7) {
                        c0349g.d(i6);
                    } else {
                        c0349g.d(i7);
                    }
                }
                if (c0349g.f3696j && c0348f.f3698l.size() > 0 && c0348f2.f3698l.size() > 0) {
                    C0348f c0348f6 = (C0348f) c0348f.f3698l.get(0);
                    C0348f c0348f7 = (C0348f) c0348f2.f3698l.get(0);
                    int i8 = c0348f6.f3695g;
                    int i9 = c0348f.f3694f + i8;
                    int i10 = c0348f7.f3695g;
                    int i11 = c0348f2.f3694f + i10;
                    float f5 = this.f3712b.f3530e0;
                    if (c0348f6 == c0348f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0348f.d((int) ((((i10 - i8) - c0349g.f3695g) * f5) + i8 + 0.5f));
                    c0348f2.d(c0348f.f3695g + c0349g.f3695g);
                }
            }
        }
    }

    @Override // t.AbstractC0358p
    public final void d() {
        C0340d c0340d;
        C0340d c0340d2;
        C0340d c0340d3;
        C0340d c0340d4;
        C0340d c0340d5 = this.f3712b;
        boolean z2 = c0340d5.f3522a;
        C0349g c0349g = this.f3714e;
        if (z2) {
            c0349g.d(c0340d5.k());
        }
        boolean z3 = c0349g.f3696j;
        C0348f c0348f = this.i;
        C0348f c0348f2 = this.h;
        if (!z3) {
            C0340d c0340d6 = this.f3712b;
            this.d = c0340d6.f3549p0[1];
            if (c0340d6.f3501E) {
                this.f3705l = new C0343a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0340d4 = this.f3712b.f3515T) != null && c0340d4.f3549p0[1] == 1) {
                    int k2 = (c0340d4.k() - this.f3712b.f3505J.e()) - this.f3712b.f3507L.e();
                    AbstractC0358p.b(c0348f2, c0340d4.f3529e.h, this.f3712b.f3505J.e());
                    AbstractC0358p.b(c0348f, c0340d4.f3529e.i, -this.f3712b.f3507L.e());
                    c0349g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0349g.d(this.f3712b.k());
                }
            }
        } else if (this.d == 4 && (c0340d2 = (c0340d = this.f3712b).f3515T) != null && c0340d2.f3549p0[1] == 1) {
            AbstractC0358p.b(c0348f2, c0340d2.f3529e.h, c0340d.f3505J.e());
            AbstractC0358p.b(c0348f, c0340d2.f3529e.i, -this.f3712b.f3507L.e());
            return;
        }
        boolean z4 = c0349g.f3696j;
        C0348f c0348f3 = this.f3704k;
        if (z4) {
            C0340d c0340d7 = this.f3712b;
            if (c0340d7.f3522a) {
                C0339c[] c0339cArr = c0340d7.f3512Q;
                C0339c c0339c = c0339cArr[2];
                C0339c c0339c2 = c0339c.f3495f;
                if (c0339c2 != null && c0339cArr[3].f3495f != null) {
                    if (c0340d7.y()) {
                        c0348f2.f3694f = this.f3712b.f3512Q[2].e();
                        c0348f.f3694f = -this.f3712b.f3512Q[3].e();
                    } else {
                        C0348f h = AbstractC0358p.h(this.f3712b.f3512Q[2]);
                        if (h != null) {
                            AbstractC0358p.b(c0348f2, h, this.f3712b.f3512Q[2].e());
                        }
                        C0348f h2 = AbstractC0358p.h(this.f3712b.f3512Q[3]);
                        if (h2 != null) {
                            AbstractC0358p.b(c0348f, h2, -this.f3712b.f3512Q[3].e());
                        }
                        c0348f2.f3691b = true;
                        c0348f.f3691b = true;
                    }
                    C0340d c0340d8 = this.f3712b;
                    if (c0340d8.f3501E) {
                        AbstractC0358p.b(c0348f3, c0348f2, c0340d8.f3523a0);
                        return;
                    }
                    return;
                }
                if (c0339c2 != null) {
                    C0348f h3 = AbstractC0358p.h(c0339c);
                    if (h3 != null) {
                        AbstractC0358p.b(c0348f2, h3, this.f3712b.f3512Q[2].e());
                        AbstractC0358p.b(c0348f, c0348f2, c0349g.f3695g);
                        C0340d c0340d9 = this.f3712b;
                        if (c0340d9.f3501E) {
                            AbstractC0358p.b(c0348f3, c0348f2, c0340d9.f3523a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0339c c0339c3 = c0339cArr[3];
                if (c0339c3.f3495f != null) {
                    C0348f h4 = AbstractC0358p.h(c0339c3);
                    if (h4 != null) {
                        AbstractC0358p.b(c0348f, h4, -this.f3712b.f3512Q[3].e());
                        AbstractC0358p.b(c0348f2, c0348f, -c0349g.f3695g);
                    }
                    C0340d c0340d10 = this.f3712b;
                    if (c0340d10.f3501E) {
                        AbstractC0358p.b(c0348f3, c0348f2, c0340d10.f3523a0);
                        return;
                    }
                    return;
                }
                C0339c c0339c4 = c0339cArr[4];
                if (c0339c4.f3495f != null) {
                    C0348f h5 = AbstractC0358p.h(c0339c4);
                    if (h5 != null) {
                        AbstractC0358p.b(c0348f3, h5, 0);
                        AbstractC0358p.b(c0348f2, c0348f3, -this.f3712b.f3523a0);
                        AbstractC0358p.b(c0348f, c0348f2, c0349g.f3695g);
                        return;
                    }
                    return;
                }
                if ((c0340d7 instanceof s.i) || c0340d7.f3515T == null || c0340d7.i(7).f3495f != null) {
                    return;
                }
                C0340d c0340d11 = this.f3712b;
                AbstractC0358p.b(c0348f2, c0340d11.f3515T.f3529e.h, c0340d11.s());
                AbstractC0358p.b(c0348f, c0348f2, c0349g.f3695g);
                C0340d c0340d12 = this.f3712b;
                if (c0340d12.f3501E) {
                    AbstractC0358p.b(c0348f3, c0348f2, c0340d12.f3523a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.d != 3) {
            c0349g.b(this);
        } else {
            C0340d c0340d13 = this.f3712b;
            int i2 = c0340d13.f3552s;
            if (i2 == 2) {
                C0340d c0340d14 = c0340d13.f3515T;
                if (c0340d14 != null) {
                    C0349g c0349g2 = c0340d14.f3529e.f3714e;
                    c0349g.f3698l.add(c0349g2);
                    c0349g2.f3697k.add(c0349g);
                    c0349g.f3691b = true;
                    c0349g.f3697k.add(c0348f2);
                    c0349g.f3697k.add(c0348f);
                }
            } else if (i2 == 3 && !c0340d13.y()) {
                C0340d c0340d15 = this.f3712b;
                if (c0340d15.f3551r != 3) {
                    C0349g c0349g3 = c0340d15.d.f3714e;
                    c0349g.f3698l.add(c0349g3);
                    c0349g3.f3697k.add(c0349g);
                    c0349g.f3691b = true;
                    c0349g.f3697k.add(c0348f2);
                    c0349g.f3697k.add(c0348f);
                }
            }
        }
        C0340d c0340d16 = this.f3712b;
        C0339c[] c0339cArr2 = c0340d16.f3512Q;
        C0339c c0339c5 = c0339cArr2[2];
        C0339c c0339c6 = c0339c5.f3495f;
        if (c0339c6 != null && c0339cArr2[3].f3495f != null) {
            if (c0340d16.y()) {
                c0348f2.f3694f = this.f3712b.f3512Q[2].e();
                c0348f.f3694f = -this.f3712b.f3512Q[3].e();
            } else {
                C0348f h6 = AbstractC0358p.h(this.f3712b.f3512Q[2]);
                C0348f h7 = AbstractC0358p.h(this.f3712b.f3512Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f3717j = 4;
            }
            if (this.f3712b.f3501E) {
                c(c0348f3, c0348f2, 1, this.f3705l);
            }
        } else if (c0339c6 != null) {
            C0348f h8 = AbstractC0358p.h(c0339c5);
            if (h8 != null) {
                AbstractC0358p.b(c0348f2, h8, this.f3712b.f3512Q[2].e());
                c(c0348f, c0348f2, 1, c0349g);
                if (this.f3712b.f3501E) {
                    c(c0348f3, c0348f2, 1, this.f3705l);
                }
                if (this.d == 3) {
                    C0340d c0340d17 = this.f3712b;
                    if (c0340d17.f3518W > 0.0f) {
                        C0353k c0353k = c0340d17.d;
                        if (c0353k.d == 3) {
                            c0353k.f3714e.f3697k.add(c0349g);
                            c0349g.f3698l.add(this.f3712b.d.f3714e);
                            c0349g.f3690a = this;
                        }
                    }
                }
            }
        } else {
            C0339c c0339c7 = c0339cArr2[3];
            if (c0339c7.f3495f != null) {
                C0348f h9 = AbstractC0358p.h(c0339c7);
                if (h9 != null) {
                    AbstractC0358p.b(c0348f, h9, -this.f3712b.f3512Q[3].e());
                    c(c0348f2, c0348f, -1, c0349g);
                    if (this.f3712b.f3501E) {
                        c(c0348f3, c0348f2, 1, this.f3705l);
                    }
                }
            } else {
                C0339c c0339c8 = c0339cArr2[4];
                if (c0339c8.f3495f != null) {
                    C0348f h10 = AbstractC0358p.h(c0339c8);
                    if (h10 != null) {
                        AbstractC0358p.b(c0348f3, h10, 0);
                        c(c0348f2, c0348f3, -1, this.f3705l);
                        c(c0348f, c0348f2, 1, c0349g);
                    }
                } else if (!(c0340d16 instanceof s.i) && (c0340d3 = c0340d16.f3515T) != null) {
                    AbstractC0358p.b(c0348f2, c0340d3.f3529e.h, c0340d16.s());
                    c(c0348f, c0348f2, 1, c0349g);
                    if (this.f3712b.f3501E) {
                        c(c0348f3, c0348f2, 1, this.f3705l);
                    }
                    if (this.d == 3) {
                        C0340d c0340d18 = this.f3712b;
                        if (c0340d18.f3518W > 0.0f) {
                            C0353k c0353k2 = c0340d18.d;
                            if (c0353k2.d == 3) {
                                c0353k2.f3714e.f3697k.add(c0349g);
                                c0349g.f3698l.add(this.f3712b.d.f3714e);
                                c0349g.f3690a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0349g.f3698l.size() == 0) {
            c0349g.f3692c = true;
        }
    }

    @Override // t.AbstractC0358p
    public final void e() {
        C0348f c0348f = this.h;
        if (c0348f.f3696j) {
            this.f3712b.f3521Z = c0348f.f3695g;
        }
    }

    @Override // t.AbstractC0358p
    public final void f() {
        this.f3713c = null;
        this.h.c();
        this.i.c();
        this.f3704k.c();
        this.f3714e.c();
        this.f3716g = false;
    }

    @Override // t.AbstractC0358p
    public final boolean k() {
        return this.d != 3 || this.f3712b.f3552s == 0;
    }

    public final void m() {
        this.f3716g = false;
        C0348f c0348f = this.h;
        c0348f.c();
        c0348f.f3696j = false;
        C0348f c0348f2 = this.i;
        c0348f2.c();
        c0348f2.f3696j = false;
        C0348f c0348f3 = this.f3704k;
        c0348f3.c();
        c0348f3.f3696j = false;
        this.f3714e.f3696j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3712b.f3535h0;
    }
}
