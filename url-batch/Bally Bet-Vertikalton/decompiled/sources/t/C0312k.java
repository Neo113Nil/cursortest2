package t;

import java.util.ArrayList;
import q.AbstractC0291e;
import s.C0298c;
import s.C0299d;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312k extends AbstractC0316o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3768k = new int[2];

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
    @Override // t.InterfaceC0305d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0305d interfaceC0305d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0291e.a(this.f3784j) == 3) {
            C0299d c0299d = this.f3779b;
            l(c0299d.f3604I, c0299d.f3606K, 0);
            return;
        }
        C0308g c0308g = this.f3781e;
        boolean z2 = c0308g.f3763j;
        C0307f c0307f = this.h;
        C0307f c0307f2 = this.i;
        if (!z2 && this.d == 3) {
            C0299d c0299d2 = this.f3779b;
            int i2 = c0299d2.f3651r;
            if (i2 == 2) {
                C0299d c0299d3 = c0299d2.f3615T;
                if (c0299d3 != null) {
                    if (c0299d3.d.f3781e.f3763j) {
                        c0308g.d((int) ((r3.f3762g * c0299d2.f3656w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0299d2.f3652s;
                if (i3 == 0 || i3 == 3) {
                    C0314m c0314m = c0299d2.f3629e;
                    C0307f c0307f3 = c0314m.h;
                    C0307f c0307f4 = c0314m.i;
                    boolean z3 = c0299d2.f3604I.f3595f != null;
                    boolean z4 = c0299d2.f3605J.f3595f != null;
                    boolean z5 = c0299d2.f3606K.f3595f != null;
                    boolean z6 = c0299d2.f3607L.f3595f != null;
                    int i4 = c0299d2.f3619X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0299d2.f3618W;
                        boolean z7 = c0307f3.f3763j;
                        int[] iArr = f3768k;
                        if (z7 && c0307f4.f3763j) {
                            if (c0307f.f3759c && c0307f2.f3759c) {
                                m(iArr, ((C0307f) c0307f.f3765l.get(0)).f3762g + c0307f.f3761f, ((C0307f) c0307f2.f3765l.get(0)).f3762g - c0307f2.f3761f, c0307f3.f3762g + c0307f3.f3761f, c0307f4.f3762g - c0307f4.f3761f, f5, i4);
                                c0308g.d(iArr[0]);
                                this.f3779b.f3629e.f3781e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0307f.f3763j;
                        ArrayList arrayList = c0307f3.f3765l;
                        if (z8 && c0307f2.f3763j) {
                            if (!c0307f3.f3759c || !c0307f4.f3759c) {
                                return;
                            }
                            m(iArr, c0307f.f3762g + c0307f.f3761f, c0307f2.f3762g - c0307f2.f3761f, ((C0307f) arrayList.get(0)).f3762g + c0307f3.f3761f, ((C0307f) c0307f4.f3765l.get(0)).f3762g - c0307f4.f3761f, f5, i4);
                            c0308g.d(iArr[0]);
                            this.f3779b.f3629e.f3781e.d(iArr[1]);
                        }
                        if (!c0307f.f3759c || !c0307f2.f3759c || !c0307f3.f3759c || !c0307f4.f3759c) {
                            return;
                        }
                        m(iArr, ((C0307f) c0307f.f3765l.get(0)).f3762g + c0307f.f3761f, ((C0307f) c0307f2.f3765l.get(0)).f3762g - c0307f2.f3761f, ((C0307f) arrayList.get(0)).f3762g + c0307f3.f3761f, ((C0307f) c0307f4.f3765l.get(0)).f3762g - c0307f4.f3761f, f5, i4);
                        c0308g.d(iArr[0]);
                        this.f3779b.f3629e.f3781e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0307f.f3759c || !c0307f2.f3759c) {
                            return;
                        }
                        float f6 = c0299d2.f3618W;
                        int i5 = ((C0307f) c0307f.f3765l.get(0)).f3762g + c0307f.f3761f;
                        int i6 = ((C0307f) c0307f2.f3765l.get(0)).f3762g - c0307f2.f3761f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0308g.d(g2);
                            this.f3779b.f3629e.f3781e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0308g.d(g4);
                            this.f3779b.f3629e.f3781e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0307f3.f3759c || !c0307f4.f3759c) {
                            return;
                        }
                        float f7 = c0299d2.f3618W;
                        int i9 = ((C0307f) c0307f3.f3765l.get(0)).f3762g + c0307f3.f3761f;
                        int i10 = ((C0307f) c0307f4.f3765l.get(0)).f3762g - c0307f4.f3761f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0308g.d(g7);
                                this.f3779b.f3629e.f3781e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0308g.d(g9);
                        this.f3779b.f3629e.f3781e.d(g8);
                    }
                } else {
                    int i13 = c0299d2.f3619X;
                    if (i13 == -1) {
                        f2 = c0299d2.f3629e.f3781e.f3762g;
                        f3 = c0299d2.f3618W;
                    } else if (i13 == 0) {
                        f4 = c0299d2.f3629e.f3781e.f3762g / c0299d2.f3618W;
                        i = (int) (f4 + 0.5f);
                        c0308g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0308g.d(i);
                    } else {
                        f2 = c0299d2.f3629e.f3781e.f3762g;
                        f3 = c0299d2.f3618W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0308g.d(i);
                }
            }
        }
        if (c0307f.f3759c && c0307f2.f3759c) {
            if (c0307f.f3763j && c0307f2.f3763j && c0308g.f3763j) {
                return;
            }
            if (!c0308g.f3763j && this.d == 3) {
                C0299d c0299d4 = this.f3779b;
                if (c0299d4.f3651r == 0 && !c0299d4.x()) {
                    C0307f c0307f5 = (C0307f) c0307f.f3765l.get(0);
                    C0307f c0307f6 = (C0307f) c0307f2.f3765l.get(0);
                    int i14 = c0307f5.f3762g + c0307f.f3761f;
                    int i15 = c0307f6.f3762g + c0307f2.f3761f;
                    c0307f.d(i14);
                    c0307f2.d(i15);
                    c0308g.d(i15 - i14);
                    return;
                }
            }
            if (!c0308g.f3763j && this.d == 3 && this.f3778a == 1 && c0307f.f3765l.size() > 0 && c0307f2.f3765l.size() > 0) {
                int min = Math.min((((C0307f) c0307f2.f3765l.get(0)).f3762g + c0307f2.f3761f) - (((C0307f) c0307f.f3765l.get(0)).f3762g + c0307f.f3761f), c0308g.f3766m);
                C0299d c0299d5 = this.f3779b;
                int i16 = c0299d5.f3655v;
                int max = Math.max(c0299d5.f3654u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0308g.d(max);
            }
            if (c0308g.f3763j) {
                C0307f c0307f7 = (C0307f) c0307f.f3765l.get(0);
                C0307f c0307f8 = (C0307f) c0307f2.f3765l.get(0);
                int i17 = c0307f7.f3762g;
                int i18 = c0307f.f3761f + i17;
                int i19 = c0307f8.f3762g;
                int i20 = c0307f2.f3761f + i19;
                float f8 = this.f3779b.f3628d0;
                if (c0307f7 == c0307f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0307f.d((int) ((((i19 - i17) - c0308g.f3762g) * f8) + i17 + 0.5f));
                c0307f2.d(c0307f.f3762g + c0308g.f3762g);
            }
        }
    }

    @Override // t.AbstractC0316o
    public final void d() {
        C0299d c0299d;
        C0299d c0299d2;
        int i;
        C0299d c0299d3;
        C0299d c0299d4;
        int i2;
        C0299d c0299d5 = this.f3779b;
        boolean z2 = c0299d5.f3622a;
        C0308g c0308g = this.f3781e;
        if (z2) {
            c0308g.d(c0299d5.q());
        }
        boolean z3 = c0308g.f3763j;
        C0307f c0307f = this.i;
        C0307f c0307f2 = this.h;
        if (!z3) {
            C0299d c0299d6 = this.f3779b;
            int i3 = c0299d6.f3649p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0299d4 = c0299d6.f3615T) != null && ((i2 = c0299d4.f3649p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0299d4.q() - this.f3779b.f3604I.e()) - this.f3779b.f3606K.e();
                    AbstractC0316o.b(c0307f2, c0299d4.d.h, this.f3779b.f3604I.e());
                    AbstractC0316o.b(c0307f, c0299d4.d.i, -this.f3779b.f3606K.e());
                    c0308g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0308g.d(c0299d6.q());
                }
            }
        } else if (this.d == 4 && (c0299d2 = (c0299d = this.f3779b).f3615T) != null && ((i = c0299d2.f3649p0[0]) == 1 || i == 4)) {
            AbstractC0316o.b(c0307f2, c0299d2.d.h, c0299d.f3604I.e());
            AbstractC0316o.b(c0307f, c0299d2.d.i, -this.f3779b.f3606K.e());
            return;
        }
        if (c0308g.f3763j) {
            C0299d c0299d7 = this.f3779b;
            if (c0299d7.f3622a) {
                C0298c[] c0298cArr = c0299d7.f3612Q;
                C0298c c0298c = c0298cArr[0];
                C0298c c0298c2 = c0298c.f3595f;
                if (c0298c2 != null && c0298cArr[1].f3595f != null) {
                    if (c0299d7.x()) {
                        c0307f2.f3761f = this.f3779b.f3612Q[0].e();
                        c0307f.f3761f = -this.f3779b.f3612Q[1].e();
                        return;
                    }
                    C0307f h = AbstractC0316o.h(this.f3779b.f3612Q[0]);
                    if (h != null) {
                        AbstractC0316o.b(c0307f2, h, this.f3779b.f3612Q[0].e());
                    }
                    C0307f h2 = AbstractC0316o.h(this.f3779b.f3612Q[1]);
                    if (h2 != null) {
                        AbstractC0316o.b(c0307f, h2, -this.f3779b.f3612Q[1].e());
                    }
                    c0307f2.f3758b = true;
                    c0307f.f3758b = true;
                    return;
                }
                if (c0298c2 != null) {
                    C0307f h3 = AbstractC0316o.h(c0298c);
                    if (h3 != null) {
                        AbstractC0316o.b(c0307f2, h3, this.f3779b.f3612Q[0].e());
                        AbstractC0316o.b(c0307f, c0307f2, c0308g.f3762g);
                        return;
                    }
                    return;
                }
                C0298c c0298c3 = c0298cArr[1];
                if (c0298c3.f3595f != null) {
                    C0307f h4 = AbstractC0316o.h(c0298c3);
                    if (h4 != null) {
                        AbstractC0316o.b(c0307f, h4, -this.f3779b.f3612Q[1].e());
                        AbstractC0316o.b(c0307f2, c0307f, -c0308g.f3762g);
                        return;
                    }
                    return;
                }
                if ((c0299d7 instanceof s.i) || c0299d7.f3615T == null || c0299d7.i(7).f3595f != null) {
                    return;
                }
                C0299d c0299d8 = this.f3779b;
                AbstractC0316o.b(c0307f2, c0299d8.f3615T.d.h, c0299d8.r());
                AbstractC0316o.b(c0307f, c0307f2, c0308g.f3762g);
                return;
            }
        }
        if (this.d == 3) {
            C0299d c0299d9 = this.f3779b;
            int i4 = c0299d9.f3651r;
            if (i4 == 2) {
                C0299d c0299d10 = c0299d9.f3615T;
                if (c0299d10 != null) {
                    C0308g c0308g2 = c0299d10.f3629e.f3781e;
                    c0308g.f3765l.add(c0308g2);
                    c0308g2.f3764k.add(c0308g);
                    c0308g.f3758b = true;
                    c0308g.f3764k.add(c0307f2);
                    c0308g.f3764k.add(c0307f);
                }
            } else if (i4 == 3) {
                if (c0299d9.f3652s == 3) {
                    c0307f2.f3757a = this;
                    c0307f.f3757a = this;
                    C0314m c0314m = c0299d9.f3629e;
                    c0314m.h.f3757a = this;
                    c0314m.i.f3757a = this;
                    c0308g.f3757a = this;
                    if (c0299d9.y()) {
                        c0308g.f3765l.add(this.f3779b.f3629e.f3781e);
                        this.f3779b.f3629e.f3781e.f3764k.add(c0308g);
                        C0314m c0314m2 = this.f3779b.f3629e;
                        c0314m2.f3781e.f3757a = this;
                        c0308g.f3765l.add(c0314m2.h);
                        c0308g.f3765l.add(this.f3779b.f3629e.i);
                        this.f3779b.f3629e.h.f3764k.add(c0308g);
                        this.f3779b.f3629e.i.f3764k.add(c0308g);
                    } else if (this.f3779b.x()) {
                        this.f3779b.f3629e.f3781e.f3765l.add(c0308g);
                        c0308g.f3764k.add(this.f3779b.f3629e.f3781e);
                    } else {
                        this.f3779b.f3629e.f3781e.f3765l.add(c0308g);
                    }
                } else {
                    C0308g c0308g3 = c0299d9.f3629e.f3781e;
                    c0308g.f3765l.add(c0308g3);
                    c0308g3.f3764k.add(c0308g);
                    this.f3779b.f3629e.h.f3764k.add(c0308g);
                    this.f3779b.f3629e.i.f3764k.add(c0308g);
                    c0308g.f3758b = true;
                    c0308g.f3764k.add(c0307f2);
                    c0308g.f3764k.add(c0307f);
                    c0307f2.f3765l.add(c0308g);
                    c0307f.f3765l.add(c0308g);
                }
            }
        }
        C0299d c0299d11 = this.f3779b;
        C0298c[] c0298cArr2 = c0299d11.f3612Q;
        C0298c c0298c4 = c0298cArr2[0];
        C0298c c0298c5 = c0298c4.f3595f;
        if (c0298c5 != null && c0298cArr2[1].f3595f != null) {
            if (c0299d11.x()) {
                c0307f2.f3761f = this.f3779b.f3612Q[0].e();
                c0307f.f3761f = -this.f3779b.f3612Q[1].e();
                return;
            }
            C0307f h5 = AbstractC0316o.h(this.f3779b.f3612Q[0]);
            C0307f h6 = AbstractC0316o.h(this.f3779b.f3612Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3784j = 4;
            return;
        }
        if (c0298c5 != null) {
            C0307f h7 = AbstractC0316o.h(c0298c4);
            if (h7 != null) {
                AbstractC0316o.b(c0307f2, h7, this.f3779b.f3612Q[0].e());
                c(c0307f, c0307f2, 1, c0308g);
                return;
            }
            return;
        }
        C0298c c0298c6 = c0298cArr2[1];
        if (c0298c6.f3595f != null) {
            C0307f h8 = AbstractC0316o.h(c0298c6);
            if (h8 != null) {
                AbstractC0316o.b(c0307f, h8, -this.f3779b.f3612Q[1].e());
                c(c0307f2, c0307f, -1, c0308g);
                return;
            }
            return;
        }
        if ((c0299d11 instanceof s.i) || (c0299d3 = c0299d11.f3615T) == null) {
            return;
        }
        AbstractC0316o.b(c0307f2, c0299d3.d.h, c0299d11.r());
        c(c0307f, c0307f2, 1, c0308g);
    }

    @Override // t.AbstractC0316o
    public final void e() {
        C0307f c0307f = this.h;
        if (c0307f.f3763j) {
            this.f3779b.f3620Y = c0307f.f3762g;
        }
    }

    @Override // t.AbstractC0316o
    public final void f() {
        this.f3780c = null;
        this.h.c();
        this.i.c();
        this.f3781e.c();
        this.f3783g = false;
    }

    @Override // t.AbstractC0316o
    public final boolean k() {
        return this.d != 3 || this.f3779b.f3651r == 0;
    }

    public final void n() {
        this.f3783g = false;
        C0307f c0307f = this.h;
        c0307f.c();
        c0307f.f3763j = false;
        C0307f c0307f2 = this.i;
        c0307f2.c();
        c0307f2.f3763j = false;
        this.f3781e.f3763j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3779b.f3635h0;
    }
}
