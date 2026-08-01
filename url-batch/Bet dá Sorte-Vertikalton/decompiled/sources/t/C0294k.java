package t;

import java.util.ArrayList;
import q.AbstractC0273e;
import s.C0280c;
import s.C0281d;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294k extends AbstractC0298o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3805k = new int[2];

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
    @Override // t.InterfaceC0287d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0287d interfaceC0287d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0273e.a(this.f3821j) == 3) {
            C0281d c0281d = this.f3816b;
            l(c0281d.f3610I, c0281d.f3612K, 0);
            return;
        }
        C0290g c0290g = this.f3818e;
        boolean z2 = c0290g.f3800j;
        C0289f c0289f = this.h;
        C0289f c0289f2 = this.i;
        if (!z2 && this.d == 3) {
            C0281d c0281d2 = this.f3816b;
            int i2 = c0281d2.f3656r;
            if (i2 == 2) {
                C0281d c0281d3 = c0281d2.f3621T;
                if (c0281d3 != null) {
                    if (c0281d3.d.f3818e.f3800j) {
                        c0290g.d((int) ((r3.f3799g * c0281d2.f3661w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0281d2.f3657s;
                if (i3 == 0 || i3 == 3) {
                    C0296m c0296m = c0281d2.f3635e;
                    C0289f c0289f3 = c0296m.h;
                    C0289f c0289f4 = c0296m.i;
                    boolean z3 = c0281d2.f3610I.f3601f != null;
                    boolean z4 = c0281d2.f3611J.f3601f != null;
                    boolean z5 = c0281d2.f3612K.f3601f != null;
                    boolean z6 = c0281d2.f3613L.f3601f != null;
                    int i4 = c0281d2.f3625X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0281d2.f3624W;
                        boolean z7 = c0289f3.f3800j;
                        int[] iArr = f3805k;
                        if (z7 && c0289f4.f3800j) {
                            if (c0289f.f3796c && c0289f2.f3796c) {
                                m(iArr, ((C0289f) c0289f.f3802l.get(0)).f3799g + c0289f.f3798f, ((C0289f) c0289f2.f3802l.get(0)).f3799g - c0289f2.f3798f, c0289f3.f3799g + c0289f3.f3798f, c0289f4.f3799g - c0289f4.f3798f, f5, i4);
                                c0290g.d(iArr[0]);
                                this.f3816b.f3635e.f3818e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0289f.f3800j;
                        ArrayList arrayList = c0289f3.f3802l;
                        if (z8 && c0289f2.f3800j) {
                            if (!c0289f3.f3796c || !c0289f4.f3796c) {
                                return;
                            }
                            m(iArr, c0289f.f3799g + c0289f.f3798f, c0289f2.f3799g - c0289f2.f3798f, ((C0289f) arrayList.get(0)).f3799g + c0289f3.f3798f, ((C0289f) c0289f4.f3802l.get(0)).f3799g - c0289f4.f3798f, f5, i4);
                            c0290g.d(iArr[0]);
                            this.f3816b.f3635e.f3818e.d(iArr[1]);
                        }
                        if (!c0289f.f3796c || !c0289f2.f3796c || !c0289f3.f3796c || !c0289f4.f3796c) {
                            return;
                        }
                        m(iArr, ((C0289f) c0289f.f3802l.get(0)).f3799g + c0289f.f3798f, ((C0289f) c0289f2.f3802l.get(0)).f3799g - c0289f2.f3798f, ((C0289f) arrayList.get(0)).f3799g + c0289f3.f3798f, ((C0289f) c0289f4.f3802l.get(0)).f3799g - c0289f4.f3798f, f5, i4);
                        c0290g.d(iArr[0]);
                        this.f3816b.f3635e.f3818e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0289f.f3796c || !c0289f2.f3796c) {
                            return;
                        }
                        float f6 = c0281d2.f3624W;
                        int i5 = ((C0289f) c0289f.f3802l.get(0)).f3799g + c0289f.f3798f;
                        int i6 = ((C0289f) c0289f2.f3802l.get(0)).f3799g - c0289f2.f3798f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0290g.d(g2);
                            this.f3816b.f3635e.f3818e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0290g.d(g4);
                            this.f3816b.f3635e.f3818e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0289f3.f3796c || !c0289f4.f3796c) {
                            return;
                        }
                        float f7 = c0281d2.f3624W;
                        int i9 = ((C0289f) c0289f3.f3802l.get(0)).f3799g + c0289f3.f3798f;
                        int i10 = ((C0289f) c0289f4.f3802l.get(0)).f3799g - c0289f4.f3798f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0290g.d(g7);
                                this.f3816b.f3635e.f3818e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0290g.d(g9);
                        this.f3816b.f3635e.f3818e.d(g8);
                    }
                } else {
                    int i13 = c0281d2.f3625X;
                    if (i13 == -1) {
                        f2 = c0281d2.f3635e.f3818e.f3799g;
                        f3 = c0281d2.f3624W;
                    } else if (i13 == 0) {
                        f4 = c0281d2.f3635e.f3818e.f3799g / c0281d2.f3624W;
                        i = (int) (f4 + 0.5f);
                        c0290g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0290g.d(i);
                    } else {
                        f2 = c0281d2.f3635e.f3818e.f3799g;
                        f3 = c0281d2.f3624W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0290g.d(i);
                }
            }
        }
        if (c0289f.f3796c && c0289f2.f3796c) {
            if (c0289f.f3800j && c0289f2.f3800j && c0290g.f3800j) {
                return;
            }
            if (!c0290g.f3800j && this.d == 3) {
                C0281d c0281d4 = this.f3816b;
                if (c0281d4.f3656r == 0 && !c0281d4.x()) {
                    C0289f c0289f5 = (C0289f) c0289f.f3802l.get(0);
                    C0289f c0289f6 = (C0289f) c0289f2.f3802l.get(0);
                    int i14 = c0289f5.f3799g + c0289f.f3798f;
                    int i15 = c0289f6.f3799g + c0289f2.f3798f;
                    c0289f.d(i14);
                    c0289f2.d(i15);
                    c0290g.d(i15 - i14);
                    return;
                }
            }
            if (!c0290g.f3800j && this.d == 3 && this.f3815a == 1 && c0289f.f3802l.size() > 0 && c0289f2.f3802l.size() > 0) {
                int min = Math.min((((C0289f) c0289f2.f3802l.get(0)).f3799g + c0289f2.f3798f) - (((C0289f) c0289f.f3802l.get(0)).f3799g + c0289f.f3798f), c0290g.f3803m);
                C0281d c0281d5 = this.f3816b;
                int i16 = c0281d5.f3660v;
                int max = Math.max(c0281d5.f3659u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0290g.d(max);
            }
            if (c0290g.f3800j) {
                C0289f c0289f7 = (C0289f) c0289f.f3802l.get(0);
                C0289f c0289f8 = (C0289f) c0289f2.f3802l.get(0);
                int i17 = c0289f7.f3799g;
                int i18 = c0289f.f3798f + i17;
                int i19 = c0289f8.f3799g;
                int i20 = c0289f2.f3798f + i19;
                float f8 = this.f3816b.f3634d0;
                if (c0289f7 == c0289f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0289f.d((int) ((((i19 - i17) - c0290g.f3799g) * f8) + i17 + 0.5f));
                c0289f2.d(c0289f.f3799g + c0290g.f3799g);
            }
        }
    }

    @Override // t.AbstractC0298o
    public final void d() {
        C0281d c0281d;
        C0281d c0281d2;
        int i;
        C0281d c0281d3;
        C0281d c0281d4;
        int i2;
        C0281d c0281d5 = this.f3816b;
        boolean z2 = c0281d5.f3628a;
        C0290g c0290g = this.f3818e;
        if (z2) {
            c0290g.d(c0281d5.q());
        }
        boolean z3 = c0290g.f3800j;
        C0289f c0289f = this.i;
        C0289f c0289f2 = this.h;
        if (!z3) {
            C0281d c0281d6 = this.f3816b;
            int i3 = c0281d6.f3654p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0281d4 = c0281d6.f3621T) != null && ((i2 = c0281d4.f3654p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0281d4.q() - this.f3816b.f3610I.e()) - this.f3816b.f3612K.e();
                    AbstractC0298o.b(c0289f2, c0281d4.d.h, this.f3816b.f3610I.e());
                    AbstractC0298o.b(c0289f, c0281d4.d.i, -this.f3816b.f3612K.e());
                    c0290g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0290g.d(c0281d6.q());
                }
            }
        } else if (this.d == 4 && (c0281d2 = (c0281d = this.f3816b).f3621T) != null && ((i = c0281d2.f3654p0[0]) == 1 || i == 4)) {
            AbstractC0298o.b(c0289f2, c0281d2.d.h, c0281d.f3610I.e());
            AbstractC0298o.b(c0289f, c0281d2.d.i, -this.f3816b.f3612K.e());
            return;
        }
        if (c0290g.f3800j) {
            C0281d c0281d7 = this.f3816b;
            if (c0281d7.f3628a) {
                C0280c[] c0280cArr = c0281d7.f3618Q;
                C0280c c0280c = c0280cArr[0];
                C0280c c0280c2 = c0280c.f3601f;
                if (c0280c2 != null && c0280cArr[1].f3601f != null) {
                    if (c0281d7.x()) {
                        c0289f2.f3798f = this.f3816b.f3618Q[0].e();
                        c0289f.f3798f = -this.f3816b.f3618Q[1].e();
                        return;
                    }
                    C0289f h = AbstractC0298o.h(this.f3816b.f3618Q[0]);
                    if (h != null) {
                        AbstractC0298o.b(c0289f2, h, this.f3816b.f3618Q[0].e());
                    }
                    C0289f h2 = AbstractC0298o.h(this.f3816b.f3618Q[1]);
                    if (h2 != null) {
                        AbstractC0298o.b(c0289f, h2, -this.f3816b.f3618Q[1].e());
                    }
                    c0289f2.f3795b = true;
                    c0289f.f3795b = true;
                    return;
                }
                if (c0280c2 != null) {
                    C0289f h3 = AbstractC0298o.h(c0280c);
                    if (h3 != null) {
                        AbstractC0298o.b(c0289f2, h3, this.f3816b.f3618Q[0].e());
                        AbstractC0298o.b(c0289f, c0289f2, c0290g.f3799g);
                        return;
                    }
                    return;
                }
                C0280c c0280c3 = c0280cArr[1];
                if (c0280c3.f3601f != null) {
                    C0289f h4 = AbstractC0298o.h(c0280c3);
                    if (h4 != null) {
                        AbstractC0298o.b(c0289f, h4, -this.f3816b.f3618Q[1].e());
                        AbstractC0298o.b(c0289f2, c0289f, -c0290g.f3799g);
                        return;
                    }
                    return;
                }
                if ((c0281d7 instanceof s.i) || c0281d7.f3621T == null || c0281d7.i(7).f3601f != null) {
                    return;
                }
                C0281d c0281d8 = this.f3816b;
                AbstractC0298o.b(c0289f2, c0281d8.f3621T.d.h, c0281d8.r());
                AbstractC0298o.b(c0289f, c0289f2, c0290g.f3799g);
                return;
            }
        }
        if (this.d == 3) {
            C0281d c0281d9 = this.f3816b;
            int i4 = c0281d9.f3656r;
            if (i4 == 2) {
                C0281d c0281d10 = c0281d9.f3621T;
                if (c0281d10 != null) {
                    C0290g c0290g2 = c0281d10.f3635e.f3818e;
                    c0290g.f3802l.add(c0290g2);
                    c0290g2.f3801k.add(c0290g);
                    c0290g.f3795b = true;
                    c0290g.f3801k.add(c0289f2);
                    c0290g.f3801k.add(c0289f);
                }
            } else if (i4 == 3) {
                if (c0281d9.f3657s == 3) {
                    c0289f2.f3794a = this;
                    c0289f.f3794a = this;
                    C0296m c0296m = c0281d9.f3635e;
                    c0296m.h.f3794a = this;
                    c0296m.i.f3794a = this;
                    c0290g.f3794a = this;
                    if (c0281d9.y()) {
                        c0290g.f3802l.add(this.f3816b.f3635e.f3818e);
                        this.f3816b.f3635e.f3818e.f3801k.add(c0290g);
                        C0296m c0296m2 = this.f3816b.f3635e;
                        c0296m2.f3818e.f3794a = this;
                        c0290g.f3802l.add(c0296m2.h);
                        c0290g.f3802l.add(this.f3816b.f3635e.i);
                        this.f3816b.f3635e.h.f3801k.add(c0290g);
                        this.f3816b.f3635e.i.f3801k.add(c0290g);
                    } else if (this.f3816b.x()) {
                        this.f3816b.f3635e.f3818e.f3802l.add(c0290g);
                        c0290g.f3801k.add(this.f3816b.f3635e.f3818e);
                    } else {
                        this.f3816b.f3635e.f3818e.f3802l.add(c0290g);
                    }
                } else {
                    C0290g c0290g3 = c0281d9.f3635e.f3818e;
                    c0290g.f3802l.add(c0290g3);
                    c0290g3.f3801k.add(c0290g);
                    this.f3816b.f3635e.h.f3801k.add(c0290g);
                    this.f3816b.f3635e.i.f3801k.add(c0290g);
                    c0290g.f3795b = true;
                    c0290g.f3801k.add(c0289f2);
                    c0290g.f3801k.add(c0289f);
                    c0289f2.f3802l.add(c0290g);
                    c0289f.f3802l.add(c0290g);
                }
            }
        }
        C0281d c0281d11 = this.f3816b;
        C0280c[] c0280cArr2 = c0281d11.f3618Q;
        C0280c c0280c4 = c0280cArr2[0];
        C0280c c0280c5 = c0280c4.f3601f;
        if (c0280c5 != null && c0280cArr2[1].f3601f != null) {
            if (c0281d11.x()) {
                c0289f2.f3798f = this.f3816b.f3618Q[0].e();
                c0289f.f3798f = -this.f3816b.f3618Q[1].e();
                return;
            }
            C0289f h5 = AbstractC0298o.h(this.f3816b.f3618Q[0]);
            C0289f h6 = AbstractC0298o.h(this.f3816b.f3618Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3821j = 4;
            return;
        }
        if (c0280c5 != null) {
            C0289f h7 = AbstractC0298o.h(c0280c4);
            if (h7 != null) {
                AbstractC0298o.b(c0289f2, h7, this.f3816b.f3618Q[0].e());
                c(c0289f, c0289f2, 1, c0290g);
                return;
            }
            return;
        }
        C0280c c0280c6 = c0280cArr2[1];
        if (c0280c6.f3601f != null) {
            C0289f h8 = AbstractC0298o.h(c0280c6);
            if (h8 != null) {
                AbstractC0298o.b(c0289f, h8, -this.f3816b.f3618Q[1].e());
                c(c0289f2, c0289f, -1, c0290g);
                return;
            }
            return;
        }
        if ((c0281d11 instanceof s.i) || (c0281d3 = c0281d11.f3621T) == null) {
            return;
        }
        AbstractC0298o.b(c0289f2, c0281d3.d.h, c0281d11.r());
        c(c0289f, c0289f2, 1, c0290g);
    }

    @Override // t.AbstractC0298o
    public final void e() {
        C0289f c0289f = this.h;
        if (c0289f.f3800j) {
            this.f3816b.f3626Y = c0289f.f3799g;
        }
    }

    @Override // t.AbstractC0298o
    public final void f() {
        this.f3817c = null;
        this.h.c();
        this.i.c();
        this.f3818e.c();
        this.f3820g = false;
    }

    @Override // t.AbstractC0298o
    public final boolean k() {
        return this.d != 3 || this.f3816b.f3656r == 0;
    }

    public final void n() {
        this.f3820g = false;
        C0289f c0289f = this.h;
        c0289f.c();
        c0289f.f3800j = false;
        C0289f c0289f2 = this.i;
        c0289f2.c();
        c0289f2.f3800j = false;
        this.f3818e.f3800j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3816b.f3641h0;
    }
}
