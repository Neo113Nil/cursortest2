package t;

import q.AbstractC0319e;
import s.C0326c;
import s.C0327d;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342m extends AbstractC0344o {

    /* renamed from: k, reason: collision with root package name */
    public C0335f f4187k;

    /* renamed from: l, reason: collision with root package name */
    public C0330a f4188l;

    @Override // t.InterfaceC0333d
    public final void a(InterfaceC0333d interfaceC0333d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0319e.a(this.f4202j) == 3) {
            C0327d c0327d = this.f4196b;
            l(c0327d.f4017J, c0327d.f4019L, 1);
            return;
        }
        C0336g c0336g = this.f4199e;
        if (c0336g.f4174c && !c0336g.f4179j && this.f4198d == 3) {
            C0327d c0327d2 = this.f4196b;
            int i2 = c0327d2.f4064s;
            if (i2 == 2) {
                C0327d c0327d3 = c0327d2.f4027T;
                if (c0327d3 != null) {
                    if (c0327d3.f4042e.f4199e.f4179j) {
                        c0336g.d((int) ((r5.f4178g * c0327d2.f4071z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0336g c0336g2 = c0327d2.f4040d.f4199e;
                if (c0336g2.f4179j) {
                    int i3 = c0327d2.f4031X;
                    if (i3 == -1) {
                        f2 = c0336g2.f4178g;
                        f3 = c0327d2.f4030W;
                    } else if (i3 == 0) {
                        f4 = c0336g2.f4178g * c0327d2.f4030W;
                        i = (int) (f4 + 0.5f);
                        c0336g.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0336g.d(i);
                    } else {
                        f2 = c0336g2.f4178g;
                        f3 = c0327d2.f4030W;
                    }
                    f4 = f2 / f3;
                    i = (int) (f4 + 0.5f);
                    c0336g.d(i);
                }
            }
        }
        C0335f c0335f = this.h;
        if (c0335f.f4174c) {
            C0335f c0335f2 = this.i;
            if (c0335f2.f4174c) {
                if (c0335f.f4179j && c0335f2.f4179j && c0336g.f4179j) {
                    return;
                }
                if (!c0336g.f4179j && this.f4198d == 3) {
                    C0327d c0327d4 = this.f4196b;
                    if (c0327d4.f4063r == 0 && !c0327d4.y()) {
                        C0335f c0335f3 = (C0335f) c0335f.f4181l.get(0);
                        C0335f c0335f4 = (C0335f) c0335f2.f4181l.get(0);
                        int i4 = c0335f3.f4178g + c0335f.f4177f;
                        int i5 = c0335f4.f4178g + c0335f2.f4177f;
                        c0335f.d(i4);
                        c0335f2.d(i5);
                        c0336g.d(i5 - i4);
                        return;
                    }
                }
                if (!c0336g.f4179j && this.f4198d == 3 && this.f4195a == 1 && c0335f.f4181l.size() > 0 && c0335f2.f4181l.size() > 0) {
                    C0335f c0335f5 = (C0335f) c0335f.f4181l.get(0);
                    int i6 = (((C0335f) c0335f2.f4181l.get(0)).f4178g + c0335f2.f4177f) - (c0335f5.f4178g + c0335f.f4177f);
                    int i7 = c0336g.f4182m;
                    if (i6 < i7) {
                        c0336g.d(i6);
                    } else {
                        c0336g.d(i7);
                    }
                }
                if (c0336g.f4179j && c0335f.f4181l.size() > 0 && c0335f2.f4181l.size() > 0) {
                    C0335f c0335f6 = (C0335f) c0335f.f4181l.get(0);
                    C0335f c0335f7 = (C0335f) c0335f2.f4181l.get(0);
                    int i8 = c0335f6.f4178g;
                    int i9 = c0335f.f4177f + i8;
                    int i10 = c0335f7.f4178g;
                    int i11 = c0335f2.f4177f + i10;
                    float f5 = this.f4196b.f4043e0;
                    if (c0335f6 == c0335f7) {
                        f5 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0335f.d((int) ((((i10 - i8) - c0336g.f4178g) * f5) + i8 + 0.5f));
                    c0335f2.d(c0335f.f4178g + c0336g.f4178g);
                }
            }
        }
    }

    @Override // t.AbstractC0344o
    public final void d() {
        C0327d c0327d;
        C0327d c0327d2;
        C0327d c0327d3;
        C0327d c0327d4;
        C0327d c0327d5 = this.f4196b;
        boolean z2 = c0327d5.f4034a;
        C0336g c0336g = this.f4199e;
        if (z2) {
            c0336g.d(c0327d5.k());
        }
        boolean z3 = c0336g.f4179j;
        C0335f c0335f = this.i;
        C0335f c0335f2 = this.h;
        if (!z3) {
            C0327d c0327d6 = this.f4196b;
            this.f4198d = c0327d6.f4061p0[1];
            if (c0327d6.f4013E) {
                this.f4188l = new C0330a(this);
            }
            int i = this.f4198d;
            if (i != 3) {
                if (i == 4 && (c0327d4 = this.f4196b.f4027T) != null && c0327d4.f4061p0[1] == 1) {
                    int k2 = (c0327d4.k() - this.f4196b.f4017J.e()) - this.f4196b.f4019L.e();
                    AbstractC0344o.b(c0335f2, c0327d4.f4042e.h, this.f4196b.f4017J.e());
                    AbstractC0344o.b(c0335f, c0327d4.f4042e.i, -this.f4196b.f4019L.e());
                    c0336g.d(k2);
                    return;
                }
                if (i == 1) {
                    c0336g.d(this.f4196b.k());
                }
            }
        } else if (this.f4198d == 4 && (c0327d2 = (c0327d = this.f4196b).f4027T) != null && c0327d2.f4061p0[1] == 1) {
            AbstractC0344o.b(c0335f2, c0327d2.f4042e.h, c0327d.f4017J.e());
            AbstractC0344o.b(c0335f, c0327d2.f4042e.i, -this.f4196b.f4019L.e());
            return;
        }
        boolean z4 = c0336g.f4179j;
        C0335f c0335f3 = this.f4187k;
        if (z4) {
            C0327d c0327d7 = this.f4196b;
            if (c0327d7.f4034a) {
                C0326c[] c0326cArr = c0327d7.f4024Q;
                C0326c c0326c = c0326cArr[2];
                C0326c c0326c2 = c0326c.f4007f;
                if (c0326c2 != null && c0326cArr[3].f4007f != null) {
                    if (c0327d7.y()) {
                        c0335f2.f4177f = this.f4196b.f4024Q[2].e();
                        c0335f.f4177f = -this.f4196b.f4024Q[3].e();
                    } else {
                        C0335f h = AbstractC0344o.h(this.f4196b.f4024Q[2]);
                        if (h != null) {
                            AbstractC0344o.b(c0335f2, h, this.f4196b.f4024Q[2].e());
                        }
                        C0335f h2 = AbstractC0344o.h(this.f4196b.f4024Q[3]);
                        if (h2 != null) {
                            AbstractC0344o.b(c0335f, h2, -this.f4196b.f4024Q[3].e());
                        }
                        c0335f2.f4173b = true;
                        c0335f.f4173b = true;
                    }
                    C0327d c0327d8 = this.f4196b;
                    if (c0327d8.f4013E) {
                        AbstractC0344o.b(c0335f3, c0335f2, c0327d8.f4035a0);
                        return;
                    }
                    return;
                }
                if (c0326c2 != null) {
                    C0335f h3 = AbstractC0344o.h(c0326c);
                    if (h3 != null) {
                        AbstractC0344o.b(c0335f2, h3, this.f4196b.f4024Q[2].e());
                        AbstractC0344o.b(c0335f, c0335f2, c0336g.f4178g);
                        C0327d c0327d9 = this.f4196b;
                        if (c0327d9.f4013E) {
                            AbstractC0344o.b(c0335f3, c0335f2, c0327d9.f4035a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0326c c0326c3 = c0326cArr[3];
                if (c0326c3.f4007f != null) {
                    C0335f h4 = AbstractC0344o.h(c0326c3);
                    if (h4 != null) {
                        AbstractC0344o.b(c0335f, h4, -this.f4196b.f4024Q[3].e());
                        AbstractC0344o.b(c0335f2, c0335f, -c0336g.f4178g);
                    }
                    C0327d c0327d10 = this.f4196b;
                    if (c0327d10.f4013E) {
                        AbstractC0344o.b(c0335f3, c0335f2, c0327d10.f4035a0);
                        return;
                    }
                    return;
                }
                C0326c c0326c4 = c0326cArr[4];
                if (c0326c4.f4007f != null) {
                    C0335f h5 = AbstractC0344o.h(c0326c4);
                    if (h5 != null) {
                        AbstractC0344o.b(c0335f3, h5, 0);
                        AbstractC0344o.b(c0335f2, c0335f3, -this.f4196b.f4035a0);
                        AbstractC0344o.b(c0335f, c0335f2, c0336g.f4178g);
                        return;
                    }
                    return;
                }
                if ((c0327d7 instanceof s.i) || c0327d7.f4027T == null || c0327d7.i(7).f4007f != null) {
                    return;
                }
                C0327d c0327d11 = this.f4196b;
                AbstractC0344o.b(c0335f2, c0327d11.f4027T.f4042e.h, c0327d11.s());
                AbstractC0344o.b(c0335f, c0335f2, c0336g.f4178g);
                C0327d c0327d12 = this.f4196b;
                if (c0327d12.f4013E) {
                    AbstractC0344o.b(c0335f3, c0335f2, c0327d12.f4035a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.f4198d != 3) {
            c0336g.b(this);
        } else {
            C0327d c0327d13 = this.f4196b;
            int i2 = c0327d13.f4064s;
            if (i2 == 2) {
                C0327d c0327d14 = c0327d13.f4027T;
                if (c0327d14 != null) {
                    C0336g c0336g2 = c0327d14.f4042e.f4199e;
                    c0336g.f4181l.add(c0336g2);
                    c0336g2.f4180k.add(c0336g);
                    c0336g.f4173b = true;
                    c0336g.f4180k.add(c0335f2);
                    c0336g.f4180k.add(c0335f);
                }
            } else if (i2 == 3 && !c0327d13.y()) {
                C0327d c0327d15 = this.f4196b;
                if (c0327d15.f4063r != 3) {
                    C0336g c0336g3 = c0327d15.f4040d.f4199e;
                    c0336g.f4181l.add(c0336g3);
                    c0336g3.f4180k.add(c0336g);
                    c0336g.f4173b = true;
                    c0336g.f4180k.add(c0335f2);
                    c0336g.f4180k.add(c0335f);
                }
            }
        }
        C0327d c0327d16 = this.f4196b;
        C0326c[] c0326cArr2 = c0327d16.f4024Q;
        C0326c c0326c5 = c0326cArr2[2];
        C0326c c0326c6 = c0326c5.f4007f;
        if (c0326c6 != null && c0326cArr2[3].f4007f != null) {
            if (c0327d16.y()) {
                c0335f2.f4177f = this.f4196b.f4024Q[2].e();
                c0335f.f4177f = -this.f4196b.f4024Q[3].e();
            } else {
                C0335f h6 = AbstractC0344o.h(this.f4196b.f4024Q[2]);
                C0335f h7 = AbstractC0344o.h(this.f4196b.f4024Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.f4202j = 4;
            }
            if (this.f4196b.f4013E) {
                c(c0335f3, c0335f2, 1, this.f4188l);
            }
        } else if (c0326c6 != null) {
            C0335f h8 = AbstractC0344o.h(c0326c5);
            if (h8 != null) {
                AbstractC0344o.b(c0335f2, h8, this.f4196b.f4024Q[2].e());
                c(c0335f, c0335f2, 1, c0336g);
                if (this.f4196b.f4013E) {
                    c(c0335f3, c0335f2, 1, this.f4188l);
                }
                if (this.f4198d == 3) {
                    C0327d c0327d17 = this.f4196b;
                    if (c0327d17.f4030W > 0.0f) {
                        C0340k c0340k = c0327d17.f4040d;
                        if (c0340k.f4198d == 3) {
                            c0340k.f4199e.f4180k.add(c0336g);
                            c0336g.f4181l.add(this.f4196b.f4040d.f4199e);
                            c0336g.f4172a = this;
                        }
                    }
                }
            }
        } else {
            C0326c c0326c7 = c0326cArr2[3];
            if (c0326c7.f4007f != null) {
                C0335f h9 = AbstractC0344o.h(c0326c7);
                if (h9 != null) {
                    AbstractC0344o.b(c0335f, h9, -this.f4196b.f4024Q[3].e());
                    c(c0335f2, c0335f, -1, c0336g);
                    if (this.f4196b.f4013E) {
                        c(c0335f3, c0335f2, 1, this.f4188l);
                    }
                }
            } else {
                C0326c c0326c8 = c0326cArr2[4];
                if (c0326c8.f4007f != null) {
                    C0335f h10 = AbstractC0344o.h(c0326c8);
                    if (h10 != null) {
                        AbstractC0344o.b(c0335f3, h10, 0);
                        c(c0335f2, c0335f3, -1, this.f4188l);
                        c(c0335f, c0335f2, 1, c0336g);
                    }
                } else if (!(c0327d16 instanceof s.i) && (c0327d3 = c0327d16.f4027T) != null) {
                    AbstractC0344o.b(c0335f2, c0327d3.f4042e.h, c0327d16.s());
                    c(c0335f, c0335f2, 1, c0336g);
                    if (this.f4196b.f4013E) {
                        c(c0335f3, c0335f2, 1, this.f4188l);
                    }
                    if (this.f4198d == 3) {
                        C0327d c0327d18 = this.f4196b;
                        if (c0327d18.f4030W > 0.0f) {
                            C0340k c0340k2 = c0327d18.f4040d;
                            if (c0340k2.f4198d == 3) {
                                c0340k2.f4199e.f4180k.add(c0336g);
                                c0336g.f4181l.add(this.f4196b.f4040d.f4199e);
                                c0336g.f4172a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0336g.f4181l.size() == 0) {
            c0336g.f4174c = true;
        }
    }

    @Override // t.AbstractC0344o
    public final void e() {
        C0335f c0335f = this.h;
        if (c0335f.f4179j) {
            this.f4196b.f4033Z = c0335f.f4178g;
        }
    }

    @Override // t.AbstractC0344o
    public final void f() {
        this.f4197c = null;
        this.h.c();
        this.i.c();
        this.f4187k.c();
        this.f4199e.c();
        this.f4201g = false;
    }

    @Override // t.AbstractC0344o
    public final boolean k() {
        return this.f4198d != 3 || this.f4196b.f4064s == 0;
    }

    public final void m() {
        this.f4201g = false;
        C0335f c0335f = this.h;
        c0335f.c();
        c0335f.f4179j = false;
        C0335f c0335f2 = this.i;
        c0335f2.c();
        c0335f2.f4179j = false;
        C0335f c0335f3 = this.f4187k;
        c0335f3.c();
        c0335f3.f4179j = false;
        this.f4199e.f4179j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4196b.f4048h0;
    }
}
