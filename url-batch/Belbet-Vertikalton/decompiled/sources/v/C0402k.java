package v;

import java.util.ArrayList;
import s.AbstractC0380e;
import u.C0386c;
import u.C0387d;

/* renamed from: v.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402k extends AbstractC0406o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f4426k = new int[2];

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
    @Override // v.InterfaceC0395d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0395d interfaceC0395d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0380e.a(this.j) == 3) {
            C0387d c0387d = this.f4437b;
            l(c0387d.f4236I, c0387d.f4238K, 0);
            return;
        }
        C0398g c0398g = this.e;
        boolean z2 = c0398g.j;
        C0397f c0397f = this.f4442h;
        C0397f c0397f2 = this.i;
        if (!z2 && this.f4439d == 3) {
            C0387d c0387d2 = this.f4437b;
            int i2 = c0387d2.f4283r;
            if (i2 == 2) {
                C0387d c0387d3 = c0387d2.f4247T;
                if (c0387d3 != null) {
                    if (c0387d3.f4260d.e.j) {
                        c0398g.d((int) ((r3.f4420g * c0387d2.f4288w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0387d2.f4284s;
                if (i3 == 0 || i3 == 3) {
                    C0404m c0404m = c0387d2.e;
                    C0397f c0397f3 = c0404m.f4442h;
                    C0397f c0397f4 = c0404m.i;
                    boolean z3 = c0387d2.f4236I.f4226f != null;
                    boolean z4 = c0387d2.f4237J.f4226f != null;
                    boolean z5 = c0387d2.f4238K.f4226f != null;
                    boolean z6 = c0387d2.f4239L.f4226f != null;
                    int i4 = c0387d2.f4251X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0387d2.f4250W;
                        boolean z7 = c0397f3.j;
                        int[] iArr = f4426k;
                        if (z7 && c0397f4.j) {
                            if (c0397f.f4417c && c0397f2.f4417c) {
                                m(iArr, ((C0397f) c0397f.f4423l.get(0)).f4420g + c0397f.f4419f, ((C0397f) c0397f2.f4423l.get(0)).f4420g - c0397f2.f4419f, c0397f3.f4420g + c0397f3.f4419f, c0397f4.f4420g - c0397f4.f4419f, f5, i4);
                                c0398g.d(iArr[0]);
                                this.f4437b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0397f.j;
                        ArrayList arrayList = c0397f3.f4423l;
                        if (z8 && c0397f2.j) {
                            if (!c0397f3.f4417c || !c0397f4.f4417c) {
                                return;
                            }
                            m(iArr, c0397f.f4420g + c0397f.f4419f, c0397f2.f4420g - c0397f2.f4419f, ((C0397f) arrayList.get(0)).f4420g + c0397f3.f4419f, ((C0397f) c0397f4.f4423l.get(0)).f4420g - c0397f4.f4419f, f5, i4);
                            c0398g.d(iArr[0]);
                            this.f4437b.e.e.d(iArr[1]);
                        }
                        if (!c0397f.f4417c || !c0397f2.f4417c || !c0397f3.f4417c || !c0397f4.f4417c) {
                            return;
                        }
                        m(iArr, ((C0397f) c0397f.f4423l.get(0)).f4420g + c0397f.f4419f, ((C0397f) c0397f2.f4423l.get(0)).f4420g - c0397f2.f4419f, ((C0397f) arrayList.get(0)).f4420g + c0397f3.f4419f, ((C0397f) c0397f4.f4423l.get(0)).f4420g - c0397f4.f4419f, f5, i4);
                        c0398g.d(iArr[0]);
                        this.f4437b.e.e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0397f.f4417c || !c0397f2.f4417c) {
                            return;
                        }
                        float f6 = c0387d2.f4250W;
                        int i5 = ((C0397f) c0397f.f4423l.get(0)).f4420g + c0397f.f4419f;
                        int i6 = ((C0397f) c0397f2.f4423l.get(0)).f4420g - c0397f2.f4419f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0398g.d(g2);
                            this.f4437b.e.e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0398g.d(g4);
                            this.f4437b.e.e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0397f3.f4417c || !c0397f4.f4417c) {
                            return;
                        }
                        float f7 = c0387d2.f4250W;
                        int i9 = ((C0397f) c0397f3.f4423l.get(0)).f4420g + c0397f3.f4419f;
                        int i10 = ((C0397f) c0397f4.f4423l.get(0)).f4420g - c0397f4.f4419f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0398g.d(g7);
                                this.f4437b.e.e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0398g.d(g9);
                        this.f4437b.e.e.d(g8);
                    }
                } else {
                    int i13 = c0387d2.f4251X;
                    if (i13 == -1) {
                        f2 = c0387d2.e.e.f4420g;
                        f3 = c0387d2.f4250W;
                    } else if (i13 == 0) {
                        f4 = c0387d2.e.e.f4420g / c0387d2.f4250W;
                        i = (int) (f4 + 0.5f);
                        c0398g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0398g.d(i);
                    } else {
                        f2 = c0387d2.e.e.f4420g;
                        f3 = c0387d2.f4250W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0398g.d(i);
                }
            }
        }
        if (c0397f.f4417c && c0397f2.f4417c) {
            if (c0397f.j && c0397f2.j && c0398g.j) {
                return;
            }
            if (!c0398g.j && this.f4439d == 3) {
                C0387d c0387d4 = this.f4437b;
                if (c0387d4.f4283r == 0 && !c0387d4.x()) {
                    C0397f c0397f5 = (C0397f) c0397f.f4423l.get(0);
                    C0397f c0397f6 = (C0397f) c0397f2.f4423l.get(0);
                    int i14 = c0397f5.f4420g + c0397f.f4419f;
                    int i15 = c0397f6.f4420g + c0397f2.f4419f;
                    c0397f.d(i14);
                    c0397f2.d(i15);
                    c0398g.d(i15 - i14);
                    return;
                }
            }
            if (!c0398g.j && this.f4439d == 3 && this.f4436a == 1 && c0397f.f4423l.size() > 0 && c0397f2.f4423l.size() > 0) {
                int min = Math.min((((C0397f) c0397f2.f4423l.get(0)).f4420g + c0397f2.f4419f) - (((C0397f) c0397f.f4423l.get(0)).f4420g + c0397f.f4419f), c0398g.f4424m);
                C0387d c0387d5 = this.f4437b;
                int i16 = c0387d5.f4287v;
                int max = Math.max(c0387d5.f4286u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0398g.d(max);
            }
            if (c0398g.j) {
                C0397f c0397f7 = (C0397f) c0397f.f4423l.get(0);
                C0397f c0397f8 = (C0397f) c0397f2.f4423l.get(0);
                int i17 = c0397f7.f4420g;
                int i18 = c0397f.f4419f + i17;
                int i19 = c0397f8.f4420g;
                int i20 = c0397f2.f4419f + i19;
                float f8 = this.f4437b.f4261d0;
                if (c0397f7 == c0397f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0397f.d((int) ((((i19 - i17) - c0398g.f4420g) * f8) + i17 + 0.5f));
                c0397f2.d(c0397f.f4420g + c0398g.f4420g);
            }
        }
    }

    @Override // v.AbstractC0406o
    public final void d() {
        C0387d c0387d;
        C0387d c0387d2;
        int i;
        C0387d c0387d3;
        C0387d c0387d4;
        int i2;
        C0387d c0387d5 = this.f4437b;
        boolean z2 = c0387d5.f4254a;
        C0398g c0398g = this.e;
        if (z2) {
            c0398g.d(c0387d5.q());
        }
        boolean z3 = c0398g.j;
        C0397f c0397f = this.i;
        C0397f c0397f2 = this.f4442h;
        if (!z3) {
            C0387d c0387d6 = this.f4437b;
            int i3 = c0387d6.f4281p0[0];
            this.f4439d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0387d4 = c0387d6.f4247T) != null && ((i2 = c0387d4.f4281p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0387d4.q() - this.f4437b.f4236I.e()) - this.f4437b.f4238K.e();
                    AbstractC0406o.b(c0397f2, c0387d4.f4260d.f4442h, this.f4437b.f4236I.e());
                    AbstractC0406o.b(c0397f, c0387d4.f4260d.i, -this.f4437b.f4238K.e());
                    c0398g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0398g.d(c0387d6.q());
                }
            }
        } else if (this.f4439d == 4 && (c0387d2 = (c0387d = this.f4437b).f4247T) != null && ((i = c0387d2.f4281p0[0]) == 1 || i == 4)) {
            AbstractC0406o.b(c0397f2, c0387d2.f4260d.f4442h, c0387d.f4236I.e());
            AbstractC0406o.b(c0397f, c0387d2.f4260d.i, -this.f4437b.f4238K.e());
            return;
        }
        if (c0398g.j) {
            C0387d c0387d7 = this.f4437b;
            if (c0387d7.f4254a) {
                C0386c[] c0386cArr = c0387d7.f4244Q;
                C0386c c0386c = c0386cArr[0];
                C0386c c0386c2 = c0386c.f4226f;
                if (c0386c2 != null && c0386cArr[1].f4226f != null) {
                    if (c0387d7.x()) {
                        c0397f2.f4419f = this.f4437b.f4244Q[0].e();
                        c0397f.f4419f = -this.f4437b.f4244Q[1].e();
                        return;
                    }
                    C0397f h2 = AbstractC0406o.h(this.f4437b.f4244Q[0]);
                    if (h2 != null) {
                        AbstractC0406o.b(c0397f2, h2, this.f4437b.f4244Q[0].e());
                    }
                    C0397f h3 = AbstractC0406o.h(this.f4437b.f4244Q[1]);
                    if (h3 != null) {
                        AbstractC0406o.b(c0397f, h3, -this.f4437b.f4244Q[1].e());
                    }
                    c0397f2.f4416b = true;
                    c0397f.f4416b = true;
                    return;
                }
                if (c0386c2 != null) {
                    C0397f h4 = AbstractC0406o.h(c0386c);
                    if (h4 != null) {
                        AbstractC0406o.b(c0397f2, h4, this.f4437b.f4244Q[0].e());
                        AbstractC0406o.b(c0397f, c0397f2, c0398g.f4420g);
                        return;
                    }
                    return;
                }
                C0386c c0386c3 = c0386cArr[1];
                if (c0386c3.f4226f != null) {
                    C0397f h5 = AbstractC0406o.h(c0386c3);
                    if (h5 != null) {
                        AbstractC0406o.b(c0397f, h5, -this.f4437b.f4244Q[1].e());
                        AbstractC0406o.b(c0397f2, c0397f, -c0398g.f4420g);
                        return;
                    }
                    return;
                }
                if ((c0387d7 instanceof u.i) || c0387d7.f4247T == null || c0387d7.i(7).f4226f != null) {
                    return;
                }
                C0387d c0387d8 = this.f4437b;
                AbstractC0406o.b(c0397f2, c0387d8.f4247T.f4260d.f4442h, c0387d8.r());
                AbstractC0406o.b(c0397f, c0397f2, c0398g.f4420g);
                return;
            }
        }
        if (this.f4439d == 3) {
            C0387d c0387d9 = this.f4437b;
            int i4 = c0387d9.f4283r;
            if (i4 == 2) {
                C0387d c0387d10 = c0387d9.f4247T;
                if (c0387d10 != null) {
                    C0398g c0398g2 = c0387d10.e.e;
                    c0398g.f4423l.add(c0398g2);
                    c0398g2.f4422k.add(c0398g);
                    c0398g.f4416b = true;
                    c0398g.f4422k.add(c0397f2);
                    c0398g.f4422k.add(c0397f);
                }
            } else if (i4 == 3) {
                if (c0387d9.f4284s == 3) {
                    c0397f2.f4415a = this;
                    c0397f.f4415a = this;
                    C0404m c0404m = c0387d9.e;
                    c0404m.f4442h.f4415a = this;
                    c0404m.i.f4415a = this;
                    c0398g.f4415a = this;
                    if (c0387d9.y()) {
                        c0398g.f4423l.add(this.f4437b.e.e);
                        this.f4437b.e.e.f4422k.add(c0398g);
                        C0404m c0404m2 = this.f4437b.e;
                        c0404m2.e.f4415a = this;
                        c0398g.f4423l.add(c0404m2.f4442h);
                        c0398g.f4423l.add(this.f4437b.e.i);
                        this.f4437b.e.f4442h.f4422k.add(c0398g);
                        this.f4437b.e.i.f4422k.add(c0398g);
                    } else if (this.f4437b.x()) {
                        this.f4437b.e.e.f4423l.add(c0398g);
                        c0398g.f4422k.add(this.f4437b.e.e);
                    } else {
                        this.f4437b.e.e.f4423l.add(c0398g);
                    }
                } else {
                    C0398g c0398g3 = c0387d9.e.e;
                    c0398g.f4423l.add(c0398g3);
                    c0398g3.f4422k.add(c0398g);
                    this.f4437b.e.f4442h.f4422k.add(c0398g);
                    this.f4437b.e.i.f4422k.add(c0398g);
                    c0398g.f4416b = true;
                    c0398g.f4422k.add(c0397f2);
                    c0398g.f4422k.add(c0397f);
                    c0397f2.f4423l.add(c0398g);
                    c0397f.f4423l.add(c0398g);
                }
            }
        }
        C0387d c0387d11 = this.f4437b;
        C0386c[] c0386cArr2 = c0387d11.f4244Q;
        C0386c c0386c4 = c0386cArr2[0];
        C0386c c0386c5 = c0386c4.f4226f;
        if (c0386c5 != null && c0386cArr2[1].f4226f != null) {
            if (c0387d11.x()) {
                c0397f2.f4419f = this.f4437b.f4244Q[0].e();
                c0397f.f4419f = -this.f4437b.f4244Q[1].e();
                return;
            }
            C0397f h6 = AbstractC0406o.h(this.f4437b.f4244Q[0]);
            C0397f h7 = AbstractC0406o.h(this.f4437b.f4244Q[1]);
            if (h6 != null) {
                h6.b(this);
            }
            if (h7 != null) {
                h7.b(this);
            }
            this.j = 4;
            return;
        }
        if (c0386c5 != null) {
            C0397f h8 = AbstractC0406o.h(c0386c4);
            if (h8 != null) {
                AbstractC0406o.b(c0397f2, h8, this.f4437b.f4244Q[0].e());
                c(c0397f, c0397f2, 1, c0398g);
                return;
            }
            return;
        }
        C0386c c0386c6 = c0386cArr2[1];
        if (c0386c6.f4226f != null) {
            C0397f h9 = AbstractC0406o.h(c0386c6);
            if (h9 != null) {
                AbstractC0406o.b(c0397f, h9, -this.f4437b.f4244Q[1].e());
                c(c0397f2, c0397f, -1, c0398g);
                return;
            }
            return;
        }
        if ((c0387d11 instanceof u.i) || (c0387d3 = c0387d11.f4247T) == null) {
            return;
        }
        AbstractC0406o.b(c0397f2, c0387d3.f4260d.f4442h, c0387d11.r());
        c(c0397f, c0397f2, 1, c0398g);
    }

    @Override // v.AbstractC0406o
    public final void e() {
        C0397f c0397f = this.f4442h;
        if (c0397f.j) {
            this.f4437b.f4252Y = c0397f.f4420g;
        }
    }

    @Override // v.AbstractC0406o
    public final void f() {
        this.f4438c = null;
        this.f4442h.c();
        this.i.c();
        this.e.c();
        this.f4441g = false;
    }

    @Override // v.AbstractC0406o
    public final boolean k() {
        return this.f4439d != 3 || this.f4437b.f4283r == 0;
    }

    public final void n() {
        this.f4441g = false;
        C0397f c0397f = this.f4442h;
        c0397f.c();
        c0397f.j = false;
        C0397f c0397f2 = this.i;
        c0397f2.c();
        c0397f2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4437b.f4268h0;
    }
}
