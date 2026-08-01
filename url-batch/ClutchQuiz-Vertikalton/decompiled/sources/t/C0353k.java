package t;

import java.util.ArrayList;
import q.AbstractC0317e;
import s.C0339c;
import s.C0340d;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353k extends AbstractC0358p {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3701k = new int[2];

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
    @Override // t.InterfaceC0346d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0346d interfaceC0346d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0317e.a(this.f3717j) == 3) {
            C0340d c0340d = this.f3712b;
            l(c0340d.f3504I, c0340d.f3506K, 0);
            return;
        }
        C0349g c0349g = this.f3714e;
        boolean z2 = c0349g.f3696j;
        C0348f c0348f = this.h;
        C0348f c0348f2 = this.i;
        if (!z2 && this.d == 3) {
            C0340d c0340d2 = this.f3712b;
            int i2 = c0340d2.f3551r;
            if (i2 == 2) {
                C0340d c0340d3 = c0340d2.f3515T;
                if (c0340d3 != null) {
                    if (c0340d3.d.f3714e.f3696j) {
                        c0349g.d((int) ((r3.f3695g * c0340d2.f3556w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0340d2.f3552s;
                if (i3 == 0 || i3 == 3) {
                    C0355m c0355m = c0340d2.f3529e;
                    C0348f c0348f3 = c0355m.h;
                    C0348f c0348f4 = c0355m.i;
                    boolean z3 = c0340d2.f3504I.f3495f != null;
                    boolean z4 = c0340d2.f3505J.f3495f != null;
                    boolean z5 = c0340d2.f3506K.f3495f != null;
                    boolean z6 = c0340d2.f3507L.f3495f != null;
                    int i4 = c0340d2.f3519X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0340d2.f3518W;
                        boolean z7 = c0348f3.f3696j;
                        int[] iArr = f3701k;
                        if (z7 && c0348f4.f3696j) {
                            if (c0348f.f3692c && c0348f2.f3692c) {
                                m(iArr, ((C0348f) c0348f.f3698l.get(0)).f3695g + c0348f.f3694f, ((C0348f) c0348f2.f3698l.get(0)).f3695g - c0348f2.f3694f, c0348f3.f3695g + c0348f3.f3694f, c0348f4.f3695g - c0348f4.f3694f, f5, i4);
                                c0349g.d(iArr[0]);
                                this.f3712b.f3529e.f3714e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0348f.f3696j;
                        ArrayList arrayList = c0348f3.f3698l;
                        if (z8 && c0348f2.f3696j) {
                            if (!c0348f3.f3692c || !c0348f4.f3692c) {
                                return;
                            }
                            m(iArr, c0348f.f3695g + c0348f.f3694f, c0348f2.f3695g - c0348f2.f3694f, ((C0348f) arrayList.get(0)).f3695g + c0348f3.f3694f, ((C0348f) c0348f4.f3698l.get(0)).f3695g - c0348f4.f3694f, f5, i4);
                            c0349g.d(iArr[0]);
                            this.f3712b.f3529e.f3714e.d(iArr[1]);
                        }
                        if (!c0348f.f3692c || !c0348f2.f3692c || !c0348f3.f3692c || !c0348f4.f3692c) {
                            return;
                        }
                        m(iArr, ((C0348f) c0348f.f3698l.get(0)).f3695g + c0348f.f3694f, ((C0348f) c0348f2.f3698l.get(0)).f3695g - c0348f2.f3694f, ((C0348f) arrayList.get(0)).f3695g + c0348f3.f3694f, ((C0348f) c0348f4.f3698l.get(0)).f3695g - c0348f4.f3694f, f5, i4);
                        c0349g.d(iArr[0]);
                        this.f3712b.f3529e.f3714e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0348f.f3692c || !c0348f2.f3692c) {
                            return;
                        }
                        float f6 = c0340d2.f3518W;
                        int i5 = ((C0348f) c0348f.f3698l.get(0)).f3695g + c0348f.f3694f;
                        int i6 = ((C0348f) c0348f2.f3698l.get(0)).f3695g - c0348f2.f3694f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0349g.d(g2);
                            this.f3712b.f3529e.f3714e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0349g.d(g4);
                            this.f3712b.f3529e.f3714e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0348f3.f3692c || !c0348f4.f3692c) {
                            return;
                        }
                        float f7 = c0340d2.f3518W;
                        int i9 = ((C0348f) c0348f3.f3698l.get(0)).f3695g + c0348f3.f3694f;
                        int i10 = ((C0348f) c0348f4.f3698l.get(0)).f3695g - c0348f4.f3694f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0349g.d(g7);
                                this.f3712b.f3529e.f3714e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0349g.d(g9);
                        this.f3712b.f3529e.f3714e.d(g8);
                    }
                } else {
                    int i13 = c0340d2.f3519X;
                    if (i13 == -1) {
                        f2 = c0340d2.f3529e.f3714e.f3695g;
                        f3 = c0340d2.f3518W;
                    } else if (i13 == 0) {
                        f4 = c0340d2.f3529e.f3714e.f3695g / c0340d2.f3518W;
                        i = (int) (f4 + 0.5f);
                        c0349g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0349g.d(i);
                    } else {
                        f2 = c0340d2.f3529e.f3714e.f3695g;
                        f3 = c0340d2.f3518W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0349g.d(i);
                }
            }
        }
        if (c0348f.f3692c && c0348f2.f3692c) {
            if (c0348f.f3696j && c0348f2.f3696j && c0349g.f3696j) {
                return;
            }
            if (!c0349g.f3696j && this.d == 3) {
                C0340d c0340d4 = this.f3712b;
                if (c0340d4.f3551r == 0 && !c0340d4.x()) {
                    C0348f c0348f5 = (C0348f) c0348f.f3698l.get(0);
                    C0348f c0348f6 = (C0348f) c0348f2.f3698l.get(0);
                    int i14 = c0348f5.f3695g + c0348f.f3694f;
                    int i15 = c0348f6.f3695g + c0348f2.f3694f;
                    c0348f.d(i14);
                    c0348f2.d(i15);
                    c0349g.d(i15 - i14);
                    return;
                }
            }
            if (!c0349g.f3696j && this.d == 3 && this.f3711a == 1 && c0348f.f3698l.size() > 0 && c0348f2.f3698l.size() > 0) {
                int min = Math.min((((C0348f) c0348f2.f3698l.get(0)).f3695g + c0348f2.f3694f) - (((C0348f) c0348f.f3698l.get(0)).f3695g + c0348f.f3694f), c0349g.f3699m);
                C0340d c0340d5 = this.f3712b;
                int i16 = c0340d5.f3555v;
                int max = Math.max(c0340d5.f3554u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0349g.d(max);
            }
            if (c0349g.f3696j) {
                C0348f c0348f7 = (C0348f) c0348f.f3698l.get(0);
                C0348f c0348f8 = (C0348f) c0348f2.f3698l.get(0);
                int i17 = c0348f7.f3695g;
                int i18 = c0348f.f3694f + i17;
                int i19 = c0348f8.f3695g;
                int i20 = c0348f2.f3694f + i19;
                float f8 = this.f3712b.f3528d0;
                if (c0348f7 == c0348f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0348f.d((int) ((((i19 - i17) - c0349g.f3695g) * f8) + i17 + 0.5f));
                c0348f2.d(c0348f.f3695g + c0349g.f3695g);
            }
        }
    }

    @Override // t.AbstractC0358p
    public final void d() {
        C0340d c0340d;
        C0340d c0340d2;
        int i;
        C0340d c0340d3;
        C0340d c0340d4;
        int i2;
        C0340d c0340d5 = this.f3712b;
        boolean z2 = c0340d5.f3522a;
        C0349g c0349g = this.f3714e;
        if (z2) {
            c0349g.d(c0340d5.q());
        }
        boolean z3 = c0349g.f3696j;
        C0348f c0348f = this.i;
        C0348f c0348f2 = this.h;
        if (!z3) {
            C0340d c0340d6 = this.f3712b;
            int i3 = c0340d6.f3549p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0340d4 = c0340d6.f3515T) != null && ((i2 = c0340d4.f3549p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0340d4.q() - this.f3712b.f3504I.e()) - this.f3712b.f3506K.e();
                    AbstractC0358p.b(c0348f2, c0340d4.d.h, this.f3712b.f3504I.e());
                    AbstractC0358p.b(c0348f, c0340d4.d.i, -this.f3712b.f3506K.e());
                    c0349g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0349g.d(c0340d6.q());
                }
            }
        } else if (this.d == 4 && (c0340d2 = (c0340d = this.f3712b).f3515T) != null && ((i = c0340d2.f3549p0[0]) == 1 || i == 4)) {
            AbstractC0358p.b(c0348f2, c0340d2.d.h, c0340d.f3504I.e());
            AbstractC0358p.b(c0348f, c0340d2.d.i, -this.f3712b.f3506K.e());
            return;
        }
        if (c0349g.f3696j) {
            C0340d c0340d7 = this.f3712b;
            if (c0340d7.f3522a) {
                C0339c[] c0339cArr = c0340d7.f3512Q;
                C0339c c0339c = c0339cArr[0];
                C0339c c0339c2 = c0339c.f3495f;
                if (c0339c2 != null && c0339cArr[1].f3495f != null) {
                    if (c0340d7.x()) {
                        c0348f2.f3694f = this.f3712b.f3512Q[0].e();
                        c0348f.f3694f = -this.f3712b.f3512Q[1].e();
                        return;
                    }
                    C0348f h = AbstractC0358p.h(this.f3712b.f3512Q[0]);
                    if (h != null) {
                        AbstractC0358p.b(c0348f2, h, this.f3712b.f3512Q[0].e());
                    }
                    C0348f h2 = AbstractC0358p.h(this.f3712b.f3512Q[1]);
                    if (h2 != null) {
                        AbstractC0358p.b(c0348f, h2, -this.f3712b.f3512Q[1].e());
                    }
                    c0348f2.f3691b = true;
                    c0348f.f3691b = true;
                    return;
                }
                if (c0339c2 != null) {
                    C0348f h3 = AbstractC0358p.h(c0339c);
                    if (h3 != null) {
                        AbstractC0358p.b(c0348f2, h3, this.f3712b.f3512Q[0].e());
                        AbstractC0358p.b(c0348f, c0348f2, c0349g.f3695g);
                        return;
                    }
                    return;
                }
                C0339c c0339c3 = c0339cArr[1];
                if (c0339c3.f3495f != null) {
                    C0348f h4 = AbstractC0358p.h(c0339c3);
                    if (h4 != null) {
                        AbstractC0358p.b(c0348f, h4, -this.f3712b.f3512Q[1].e());
                        AbstractC0358p.b(c0348f2, c0348f, -c0349g.f3695g);
                        return;
                    }
                    return;
                }
                if ((c0340d7 instanceof s.i) || c0340d7.f3515T == null || c0340d7.i(7).f3495f != null) {
                    return;
                }
                C0340d c0340d8 = this.f3712b;
                AbstractC0358p.b(c0348f2, c0340d8.f3515T.d.h, c0340d8.r());
                AbstractC0358p.b(c0348f, c0348f2, c0349g.f3695g);
                return;
            }
        }
        if (this.d == 3) {
            C0340d c0340d9 = this.f3712b;
            int i4 = c0340d9.f3551r;
            if (i4 == 2) {
                C0340d c0340d10 = c0340d9.f3515T;
                if (c0340d10 != null) {
                    C0349g c0349g2 = c0340d10.f3529e.f3714e;
                    c0349g.f3698l.add(c0349g2);
                    c0349g2.f3697k.add(c0349g);
                    c0349g.f3691b = true;
                    c0349g.f3697k.add(c0348f2);
                    c0349g.f3697k.add(c0348f);
                }
            } else if (i4 == 3) {
                if (c0340d9.f3552s == 3) {
                    c0348f2.f3690a = this;
                    c0348f.f3690a = this;
                    C0355m c0355m = c0340d9.f3529e;
                    c0355m.h.f3690a = this;
                    c0355m.i.f3690a = this;
                    c0349g.f3690a = this;
                    if (c0340d9.y()) {
                        c0349g.f3698l.add(this.f3712b.f3529e.f3714e);
                        this.f3712b.f3529e.f3714e.f3697k.add(c0349g);
                        C0355m c0355m2 = this.f3712b.f3529e;
                        c0355m2.f3714e.f3690a = this;
                        c0349g.f3698l.add(c0355m2.h);
                        c0349g.f3698l.add(this.f3712b.f3529e.i);
                        this.f3712b.f3529e.h.f3697k.add(c0349g);
                        this.f3712b.f3529e.i.f3697k.add(c0349g);
                    } else if (this.f3712b.x()) {
                        this.f3712b.f3529e.f3714e.f3698l.add(c0349g);
                        c0349g.f3697k.add(this.f3712b.f3529e.f3714e);
                    } else {
                        this.f3712b.f3529e.f3714e.f3698l.add(c0349g);
                    }
                } else {
                    C0349g c0349g3 = c0340d9.f3529e.f3714e;
                    c0349g.f3698l.add(c0349g3);
                    c0349g3.f3697k.add(c0349g);
                    this.f3712b.f3529e.h.f3697k.add(c0349g);
                    this.f3712b.f3529e.i.f3697k.add(c0349g);
                    c0349g.f3691b = true;
                    c0349g.f3697k.add(c0348f2);
                    c0349g.f3697k.add(c0348f);
                    c0348f2.f3698l.add(c0349g);
                    c0348f.f3698l.add(c0349g);
                }
            }
        }
        C0340d c0340d11 = this.f3712b;
        C0339c[] c0339cArr2 = c0340d11.f3512Q;
        C0339c c0339c4 = c0339cArr2[0];
        C0339c c0339c5 = c0339c4.f3495f;
        if (c0339c5 != null && c0339cArr2[1].f3495f != null) {
            if (c0340d11.x()) {
                c0348f2.f3694f = this.f3712b.f3512Q[0].e();
                c0348f.f3694f = -this.f3712b.f3512Q[1].e();
                return;
            }
            C0348f h5 = AbstractC0358p.h(this.f3712b.f3512Q[0]);
            C0348f h6 = AbstractC0358p.h(this.f3712b.f3512Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3717j = 4;
            return;
        }
        if (c0339c5 != null) {
            C0348f h7 = AbstractC0358p.h(c0339c4);
            if (h7 != null) {
                AbstractC0358p.b(c0348f2, h7, this.f3712b.f3512Q[0].e());
                c(c0348f, c0348f2, 1, c0349g);
                return;
            }
            return;
        }
        C0339c c0339c6 = c0339cArr2[1];
        if (c0339c6.f3495f != null) {
            C0348f h8 = AbstractC0358p.h(c0339c6);
            if (h8 != null) {
                AbstractC0358p.b(c0348f, h8, -this.f3712b.f3512Q[1].e());
                c(c0348f2, c0348f, -1, c0349g);
                return;
            }
            return;
        }
        if ((c0340d11 instanceof s.i) || (c0340d3 = c0340d11.f3515T) == null) {
            return;
        }
        AbstractC0358p.b(c0348f2, c0340d3.d.h, c0340d11.r());
        c(c0348f, c0348f2, 1, c0349g);
    }

    @Override // t.AbstractC0358p
    public final void e() {
        C0348f c0348f = this.h;
        if (c0348f.f3696j) {
            this.f3712b.f3520Y = c0348f.f3695g;
        }
    }

    @Override // t.AbstractC0358p
    public final void f() {
        this.f3713c = null;
        this.h.c();
        this.i.c();
        this.f3714e.c();
        this.f3716g = false;
    }

    @Override // t.AbstractC0358p
    public final boolean k() {
        return this.d != 3 || this.f3712b.f3551r == 0;
    }

    public final void n() {
        this.f3716g = false;
        C0348f c0348f = this.h;
        c0348f.c();
        c0348f.f3696j = false;
        C0348f c0348f2 = this.i;
        c0348f2.c();
        c0348f2.f3696j = false;
        this.f3714e.f3696j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3712b.f3535h0;
    }
}
