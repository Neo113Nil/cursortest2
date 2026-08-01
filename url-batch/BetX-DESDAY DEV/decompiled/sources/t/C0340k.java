package t;

import java.util.ArrayList;
import q.AbstractC0319e;
import s.C0326c;
import s.C0327d;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340k extends AbstractC0344o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f4184k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f2) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f2) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f2) + 0.5f);
        int i9 = (int) ((i6 / f2) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // t.InterfaceC0333d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0333d interfaceC0333d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0319e.a(this.f4202j) == 3) {
            C0327d c0327d = this.f4196b;
            l(c0327d.f4016I, c0327d.f4018K, 0);
            return;
        }
        C0336g c0336g = this.f4199e;
        boolean z2 = c0336g.f4179j;
        C0335f c0335f = this.h;
        C0335f c0335f2 = this.i;
        if (!z2 && this.f4198d == 3) {
            C0327d c0327d2 = this.f4196b;
            int i2 = c0327d2.f4063r;
            if (i2 == 2) {
                C0327d c0327d3 = c0327d2.f4027T;
                if (c0327d3 != null) {
                    if (c0327d3.f4040d.f4199e.f4179j) {
                        c0336g.d((int) ((r3.f4178g * c0327d2.f4068w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0327d2.f4064s;
                if (i3 == 0 || i3 == 3) {
                    C0342m c0342m = c0327d2.f4042e;
                    C0335f c0335f3 = c0342m.h;
                    C0335f c0335f4 = c0342m.i;
                    boolean z3 = c0327d2.f4016I.f4007f != null;
                    boolean z4 = c0327d2.f4017J.f4007f != null;
                    boolean z5 = c0327d2.f4018K.f4007f != null;
                    boolean z6 = c0327d2.f4019L.f4007f != null;
                    int i4 = c0327d2.f4031X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0327d2.f4030W;
                        boolean z7 = c0335f3.f4179j;
                        int[] iArr = f4184k;
                        if (z7 && c0335f4.f4179j) {
                            if (c0335f.f4174c && c0335f2.f4174c) {
                                m(iArr, ((C0335f) c0335f.f4181l.get(0)).f4178g + c0335f.f4177f, ((C0335f) c0335f2.f4181l.get(0)).f4178g - c0335f2.f4177f, c0335f3.f4178g + c0335f3.f4177f, c0335f4.f4178g - c0335f4.f4177f, f5, i4);
                                c0336g.d(iArr[0]);
                                this.f4196b.f4042e.f4199e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0335f.f4179j;
                        ArrayList arrayList = c0335f3.f4181l;
                        if (z8 && c0335f2.f4179j) {
                            if (!c0335f3.f4174c || !c0335f4.f4174c) {
                                return;
                            }
                            m(iArr, c0335f.f4178g + c0335f.f4177f, c0335f2.f4178g - c0335f2.f4177f, ((C0335f) arrayList.get(0)).f4178g + c0335f3.f4177f, ((C0335f) c0335f4.f4181l.get(0)).f4178g - c0335f4.f4177f, f5, i4);
                            c0336g.d(iArr[0]);
                            this.f4196b.f4042e.f4199e.d(iArr[1]);
                        }
                        if (!c0335f.f4174c || !c0335f2.f4174c || !c0335f3.f4174c || !c0335f4.f4174c) {
                            return;
                        }
                        m(iArr, ((C0335f) c0335f.f4181l.get(0)).f4178g + c0335f.f4177f, ((C0335f) c0335f2.f4181l.get(0)).f4178g - c0335f2.f4177f, ((C0335f) arrayList.get(0)).f4178g + c0335f3.f4177f, ((C0335f) c0335f4.f4181l.get(0)).f4178g - c0335f4.f4177f, f5, i4);
                        c0336g.d(iArr[0]);
                        this.f4196b.f4042e.f4199e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0335f.f4174c || !c0335f2.f4174c) {
                            return;
                        }
                        float f6 = c0327d2.f4030W;
                        int i5 = ((C0335f) c0335f.f4181l.get(0)).f4178g + c0335f.f4177f;
                        int i6 = ((C0335f) c0335f2.f4181l.get(0)).f4178g - c0335f2.f4177f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0336g.d(g2);
                            this.f4196b.f4042e.f4199e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0336g.d(g4);
                            this.f4196b.f4042e.f4199e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0335f3.f4174c || !c0335f4.f4174c) {
                            return;
                        }
                        float f7 = c0327d2.f4030W;
                        int i9 = ((C0335f) c0335f3.f4181l.get(0)).f4178g + c0335f3.f4177f;
                        int i10 = ((C0335f) c0335f4.f4181l.get(0)).f4178g - c0335f4.f4177f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0336g.d(g7);
                                this.f4196b.f4042e.f4199e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0336g.d(g9);
                        this.f4196b.f4042e.f4199e.d(g8);
                    }
                } else {
                    int i13 = c0327d2.f4031X;
                    if (i13 == -1) {
                        f2 = c0327d2.f4042e.f4199e.f4178g;
                        f3 = c0327d2.f4030W;
                    } else if (i13 == 0) {
                        f4 = c0327d2.f4042e.f4199e.f4178g / c0327d2.f4030W;
                        i = (int) (f4 + 0.5f);
                        c0336g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0336g.d(i);
                    } else {
                        f2 = c0327d2.f4042e.f4199e.f4178g;
                        f3 = c0327d2.f4030W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0336g.d(i);
                }
            }
        }
        if (c0335f.f4174c && c0335f2.f4174c) {
            if (c0335f.f4179j && c0335f2.f4179j && c0336g.f4179j) {
                return;
            }
            if (!c0336g.f4179j && this.f4198d == 3) {
                C0327d c0327d4 = this.f4196b;
                if (c0327d4.f4063r == 0 && !c0327d4.x()) {
                    C0335f c0335f5 = (C0335f) c0335f.f4181l.get(0);
                    C0335f c0335f6 = (C0335f) c0335f2.f4181l.get(0);
                    int i14 = c0335f5.f4178g + c0335f.f4177f;
                    int i15 = c0335f6.f4178g + c0335f2.f4177f;
                    c0335f.d(i14);
                    c0335f2.d(i15);
                    c0336g.d(i15 - i14);
                    return;
                }
            }
            if (!c0336g.f4179j && this.f4198d == 3 && this.f4195a == 1 && c0335f.f4181l.size() > 0 && c0335f2.f4181l.size() > 0) {
                int min = Math.min((((C0335f) c0335f2.f4181l.get(0)).f4178g + c0335f2.f4177f) - (((C0335f) c0335f.f4181l.get(0)).f4178g + c0335f.f4177f), c0336g.f4182m);
                C0327d c0327d5 = this.f4196b;
                int i16 = c0327d5.f4067v;
                int max = Math.max(c0327d5.f4066u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0336g.d(max);
            }
            if (c0336g.f4179j) {
                C0335f c0335f7 = (C0335f) c0335f.f4181l.get(0);
                C0335f c0335f8 = (C0335f) c0335f2.f4181l.get(0);
                int i17 = c0335f7.f4178g;
                int i18 = c0335f.f4177f + i17;
                int i19 = c0335f8.f4178g;
                int i20 = c0335f2.f4177f + i19;
                float f8 = this.f4196b.f4041d0;
                if (c0335f7 == c0335f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0335f.d((int) ((((i19 - i17) - c0336g.f4178g) * f8) + i17 + 0.5f));
                c0335f2.d(c0335f.f4178g + c0336g.f4178g);
            }
        }
    }

    @Override // t.AbstractC0344o
    public final void d() {
        C0327d c0327d;
        C0327d c0327d2;
        int i;
        C0327d c0327d3;
        C0327d c0327d4;
        int i2;
        C0327d c0327d5 = this.f4196b;
        boolean z2 = c0327d5.f4034a;
        C0336g c0336g = this.f4199e;
        if (z2) {
            c0336g.d(c0327d5.q());
        }
        boolean z3 = c0336g.f4179j;
        C0335f c0335f = this.i;
        C0335f c0335f2 = this.h;
        if (!z3) {
            C0327d c0327d6 = this.f4196b;
            int i3 = c0327d6.f4061p0[0];
            this.f4198d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0327d4 = c0327d6.f4027T) != null && ((i2 = c0327d4.f4061p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0327d4.q() - this.f4196b.f4016I.e()) - this.f4196b.f4018K.e();
                    AbstractC0344o.b(c0335f2, c0327d4.f4040d.h, this.f4196b.f4016I.e());
                    AbstractC0344o.b(c0335f, c0327d4.f4040d.i, -this.f4196b.f4018K.e());
                    c0336g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0336g.d(c0327d6.q());
                }
            }
        } else if (this.f4198d == 4 && (c0327d2 = (c0327d = this.f4196b).f4027T) != null && ((i = c0327d2.f4061p0[0]) == 1 || i == 4)) {
            AbstractC0344o.b(c0335f2, c0327d2.f4040d.h, c0327d.f4016I.e());
            AbstractC0344o.b(c0335f, c0327d2.f4040d.i, -this.f4196b.f4018K.e());
            return;
        }
        if (c0336g.f4179j) {
            C0327d c0327d7 = this.f4196b;
            if (c0327d7.f4034a) {
                C0326c[] c0326cArr = c0327d7.f4024Q;
                C0326c c0326c = c0326cArr[0];
                C0326c c0326c2 = c0326c.f4007f;
                if (c0326c2 != null && c0326cArr[1].f4007f != null) {
                    if (c0327d7.x()) {
                        c0335f2.f4177f = this.f4196b.f4024Q[0].e();
                        c0335f.f4177f = -this.f4196b.f4024Q[1].e();
                        return;
                    }
                    C0335f h = AbstractC0344o.h(this.f4196b.f4024Q[0]);
                    if (h != null) {
                        AbstractC0344o.b(c0335f2, h, this.f4196b.f4024Q[0].e());
                    }
                    C0335f h2 = AbstractC0344o.h(this.f4196b.f4024Q[1]);
                    if (h2 != null) {
                        AbstractC0344o.b(c0335f, h2, -this.f4196b.f4024Q[1].e());
                    }
                    c0335f2.f4173b = true;
                    c0335f.f4173b = true;
                    return;
                }
                if (c0326c2 != null) {
                    C0335f h3 = AbstractC0344o.h(c0326c);
                    if (h3 != null) {
                        AbstractC0344o.b(c0335f2, h3, this.f4196b.f4024Q[0].e());
                        AbstractC0344o.b(c0335f, c0335f2, c0336g.f4178g);
                        return;
                    }
                    return;
                }
                C0326c c0326c3 = c0326cArr[1];
                if (c0326c3.f4007f != null) {
                    C0335f h4 = AbstractC0344o.h(c0326c3);
                    if (h4 != null) {
                        AbstractC0344o.b(c0335f, h4, -this.f4196b.f4024Q[1].e());
                        AbstractC0344o.b(c0335f2, c0335f, -c0336g.f4178g);
                        return;
                    }
                    return;
                }
                if ((c0327d7 instanceof s.i) || c0327d7.f4027T == null || c0327d7.i(7).f4007f != null) {
                    return;
                }
                C0327d c0327d8 = this.f4196b;
                AbstractC0344o.b(c0335f2, c0327d8.f4027T.f4040d.h, c0327d8.r());
                AbstractC0344o.b(c0335f, c0335f2, c0336g.f4178g);
                return;
            }
        }
        if (this.f4198d == 3) {
            C0327d c0327d9 = this.f4196b;
            int i4 = c0327d9.f4063r;
            if (i4 == 2) {
                C0327d c0327d10 = c0327d9.f4027T;
                if (c0327d10 != null) {
                    C0336g c0336g2 = c0327d10.f4042e.f4199e;
                    c0336g.f4181l.add(c0336g2);
                    c0336g2.f4180k.add(c0336g);
                    c0336g.f4173b = true;
                    c0336g.f4180k.add(c0335f2);
                    c0336g.f4180k.add(c0335f);
                }
            } else if (i4 == 3) {
                if (c0327d9.f4064s == 3) {
                    c0335f2.f4172a = this;
                    c0335f.f4172a = this;
                    C0342m c0342m = c0327d9.f4042e;
                    c0342m.h.f4172a = this;
                    c0342m.i.f4172a = this;
                    c0336g.f4172a = this;
                    if (c0327d9.y()) {
                        c0336g.f4181l.add(this.f4196b.f4042e.f4199e);
                        this.f4196b.f4042e.f4199e.f4180k.add(c0336g);
                        C0342m c0342m2 = this.f4196b.f4042e;
                        c0342m2.f4199e.f4172a = this;
                        c0336g.f4181l.add(c0342m2.h);
                        c0336g.f4181l.add(this.f4196b.f4042e.i);
                        this.f4196b.f4042e.h.f4180k.add(c0336g);
                        this.f4196b.f4042e.i.f4180k.add(c0336g);
                    } else if (this.f4196b.x()) {
                        this.f4196b.f4042e.f4199e.f4181l.add(c0336g);
                        c0336g.f4180k.add(this.f4196b.f4042e.f4199e);
                    } else {
                        this.f4196b.f4042e.f4199e.f4181l.add(c0336g);
                    }
                } else {
                    C0336g c0336g3 = c0327d9.f4042e.f4199e;
                    c0336g.f4181l.add(c0336g3);
                    c0336g3.f4180k.add(c0336g);
                    this.f4196b.f4042e.h.f4180k.add(c0336g);
                    this.f4196b.f4042e.i.f4180k.add(c0336g);
                    c0336g.f4173b = true;
                    c0336g.f4180k.add(c0335f2);
                    c0336g.f4180k.add(c0335f);
                    c0335f2.f4181l.add(c0336g);
                    c0335f.f4181l.add(c0336g);
                }
            }
        }
        C0327d c0327d11 = this.f4196b;
        C0326c[] c0326cArr2 = c0327d11.f4024Q;
        C0326c c0326c4 = c0326cArr2[0];
        C0326c c0326c5 = c0326c4.f4007f;
        if (c0326c5 != null && c0326cArr2[1].f4007f != null) {
            if (c0327d11.x()) {
                c0335f2.f4177f = this.f4196b.f4024Q[0].e();
                c0335f.f4177f = -this.f4196b.f4024Q[1].e();
                return;
            }
            C0335f h5 = AbstractC0344o.h(this.f4196b.f4024Q[0]);
            C0335f h6 = AbstractC0344o.h(this.f4196b.f4024Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f4202j = 4;
            return;
        }
        if (c0326c5 != null) {
            C0335f h7 = AbstractC0344o.h(c0326c4);
            if (h7 != null) {
                AbstractC0344o.b(c0335f2, h7, this.f4196b.f4024Q[0].e());
                c(c0335f, c0335f2, 1, c0336g);
                return;
            }
            return;
        }
        C0326c c0326c6 = c0326cArr2[1];
        if (c0326c6.f4007f != null) {
            C0335f h8 = AbstractC0344o.h(c0326c6);
            if (h8 != null) {
                AbstractC0344o.b(c0335f, h8, -this.f4196b.f4024Q[1].e());
                c(c0335f2, c0335f, -1, c0336g);
                return;
            }
            return;
        }
        if ((c0327d11 instanceof s.i) || (c0327d3 = c0327d11.f4027T) == null) {
            return;
        }
        AbstractC0344o.b(c0335f2, c0327d3.f4040d.h, c0327d11.r());
        c(c0335f, c0335f2, 1, c0336g);
    }

    @Override // t.AbstractC0344o
    public final void e() {
        C0335f c0335f = this.h;
        if (c0335f.f4179j) {
            this.f4196b.f4032Y = c0335f.f4178g;
        }
    }

    @Override // t.AbstractC0344o
    public final void f() {
        this.f4197c = null;
        this.h.c();
        this.i.c();
        this.f4199e.c();
        this.f4201g = false;
    }

    @Override // t.AbstractC0344o
    public final boolean k() {
        return this.f4198d != 3 || this.f4196b.f4063r == 0;
    }

    public final void n() {
        this.f4201g = false;
        C0335f c0335f = this.h;
        c0335f.c();
        c0335f.f4179j = false;
        C0335f c0335f2 = this.i;
        c0335f2.c();
        c0335f2.f4179j = false;
        this.f4199e.f4179j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4196b.f4048h0;
    }
}
