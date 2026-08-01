package t;

import java.util.ArrayList;
import q.AbstractC0285e;
import s.C0292c;
import s.C0293d;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306k extends AbstractC0310o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3708k = new int[2];

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
    @Override // t.InterfaceC0299d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0299d interfaceC0299d) {
        float f2;
        float f3;
        float f4;
        int i;
        if (AbstractC0285e.a(this.f3724j) == 3) {
            C0293d c0293d = this.f3719b;
            l(c0293d.f3532I, c0293d.f3534K, 0);
            return;
        }
        C0302g c0302g = this.f3721e;
        boolean z2 = c0302g.f3703j;
        C0301f c0301f = this.h;
        C0301f c0301f2 = this.i;
        if (!z2 && this.d == 3) {
            C0293d c0293d2 = this.f3719b;
            int i2 = c0293d2.f3579r;
            if (i2 == 2) {
                C0293d c0293d3 = c0293d2.f3543T;
                if (c0293d3 != null) {
                    if (c0293d3.d.f3721e.f3703j) {
                        c0302g.d((int) ((r3.f3702g * c0293d2.f3584w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = c0293d2.f3580s;
                if (i3 == 0 || i3 == 3) {
                    C0308m c0308m = c0293d2.f3557e;
                    C0301f c0301f3 = c0308m.h;
                    C0301f c0301f4 = c0308m.i;
                    boolean z3 = c0293d2.f3532I.f3523f != null;
                    boolean z4 = c0293d2.f3533J.f3523f != null;
                    boolean z5 = c0293d2.f3534K.f3523f != null;
                    boolean z6 = c0293d2.f3535L.f3523f != null;
                    int i4 = c0293d2.f3547X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0293d2.f3546W;
                        boolean z7 = c0301f3.f3703j;
                        int[] iArr = f3708k;
                        if (z7 && c0301f4.f3703j) {
                            if (c0301f.f3699c && c0301f2.f3699c) {
                                m(iArr, ((C0301f) c0301f.f3705l.get(0)).f3702g + c0301f.f3701f, ((C0301f) c0301f2.f3705l.get(0)).f3702g - c0301f2.f3701f, c0301f3.f3702g + c0301f3.f3701f, c0301f4.f3702g - c0301f4.f3701f, f5, i4);
                                c0302g.d(iArr[0]);
                                this.f3719b.f3557e.f3721e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0301f.f3703j;
                        ArrayList arrayList = c0301f3.f3705l;
                        if (z8 && c0301f2.f3703j) {
                            if (!c0301f3.f3699c || !c0301f4.f3699c) {
                                return;
                            }
                            m(iArr, c0301f.f3702g + c0301f.f3701f, c0301f2.f3702g - c0301f2.f3701f, ((C0301f) arrayList.get(0)).f3702g + c0301f3.f3701f, ((C0301f) c0301f4.f3705l.get(0)).f3702g - c0301f4.f3701f, f5, i4);
                            c0302g.d(iArr[0]);
                            this.f3719b.f3557e.f3721e.d(iArr[1]);
                        }
                        if (!c0301f.f3699c || !c0301f2.f3699c || !c0301f3.f3699c || !c0301f4.f3699c) {
                            return;
                        }
                        m(iArr, ((C0301f) c0301f.f3705l.get(0)).f3702g + c0301f.f3701f, ((C0301f) c0301f2.f3705l.get(0)).f3702g - c0301f2.f3701f, ((C0301f) arrayList.get(0)).f3702g + c0301f3.f3701f, ((C0301f) c0301f4.f3705l.get(0)).f3702g - c0301f4.f3701f, f5, i4);
                        c0302g.d(iArr[0]);
                        this.f3719b.f3557e.f3721e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0301f.f3699c || !c0301f2.f3699c) {
                            return;
                        }
                        float f6 = c0293d2.f3546W;
                        int i5 = ((C0301f) c0301f.f3705l.get(0)).f3702g + c0301f.f3701f;
                        int i6 = ((C0301f) c0301f2.f3705l.get(0)).f3702g - c0301f2.f3701f;
                        if (i4 == -1 || i4 == 0) {
                            int g2 = g(i6 - i5, 0);
                            int i7 = (int) ((g2 * f6) + 0.5f);
                            int g3 = g(i7, 1);
                            if (i7 != g3) {
                                g2 = (int) ((g3 / f6) + 0.5f);
                            }
                            c0302g.d(g2);
                            this.f3719b.f3557e.f3721e.d(g3);
                        } else if (i4 == 1) {
                            int g4 = g(i6 - i5, 0);
                            int i8 = (int) ((g4 / f6) + 0.5f);
                            int g5 = g(i8, 1);
                            if (i8 != g5) {
                                g4 = (int) ((g5 * f6) + 0.5f);
                            }
                            c0302g.d(g4);
                            this.f3719b.f3557e.f3721e.d(g5);
                        }
                    } else if (z4 && z6) {
                        if (!c0301f3.f3699c || !c0301f4.f3699c) {
                            return;
                        }
                        float f7 = c0293d2.f3546W;
                        int i9 = ((C0301f) c0301f3.f3705l.get(0)).f3702g + c0301f3.f3701f;
                        int i10 = ((C0301f) c0301f4.f3705l.get(0)).f3702g - c0301f4.f3701f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g6 = g(i10 - i9, 1);
                                int i11 = (int) ((g6 * f7) + 0.5f);
                                int g7 = g(i11, 0);
                                if (i11 != g7) {
                                    g6 = (int) ((g7 / f7) + 0.5f);
                                }
                                c0302g.d(g7);
                                this.f3719b.f3557e.f3721e.d(g6);
                            }
                        }
                        int g8 = g(i10 - i9, 1);
                        int i12 = (int) ((g8 / f7) + 0.5f);
                        int g9 = g(i12, 0);
                        if (i12 != g9) {
                            g8 = (int) ((g9 * f7) + 0.5f);
                        }
                        c0302g.d(g9);
                        this.f3719b.f3557e.f3721e.d(g8);
                    }
                } else {
                    int i13 = c0293d2.f3547X;
                    if (i13 == -1) {
                        f2 = c0293d2.f3557e.f3721e.f3702g;
                        f3 = c0293d2.f3546W;
                    } else if (i13 == 0) {
                        f4 = c0293d2.f3557e.f3721e.f3702g / c0293d2.f3546W;
                        i = (int) (f4 + 0.5f);
                        c0302g.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        c0302g.d(i);
                    } else {
                        f2 = c0293d2.f3557e.f3721e.f3702g;
                        f3 = c0293d2.f3546W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    c0302g.d(i);
                }
            }
        }
        if (c0301f.f3699c && c0301f2.f3699c) {
            if (c0301f.f3703j && c0301f2.f3703j && c0302g.f3703j) {
                return;
            }
            if (!c0302g.f3703j && this.d == 3) {
                C0293d c0293d4 = this.f3719b;
                if (c0293d4.f3579r == 0 && !c0293d4.x()) {
                    C0301f c0301f5 = (C0301f) c0301f.f3705l.get(0);
                    C0301f c0301f6 = (C0301f) c0301f2.f3705l.get(0);
                    int i14 = c0301f5.f3702g + c0301f.f3701f;
                    int i15 = c0301f6.f3702g + c0301f2.f3701f;
                    c0301f.d(i14);
                    c0301f2.d(i15);
                    c0302g.d(i15 - i14);
                    return;
                }
            }
            if (!c0302g.f3703j && this.d == 3 && this.f3718a == 1 && c0301f.f3705l.size() > 0 && c0301f2.f3705l.size() > 0) {
                int min = Math.min((((C0301f) c0301f2.f3705l.get(0)).f3702g + c0301f2.f3701f) - (((C0301f) c0301f.f3705l.get(0)).f3702g + c0301f.f3701f), c0302g.f3706m);
                C0293d c0293d5 = this.f3719b;
                int i16 = c0293d5.f3583v;
                int max = Math.max(c0293d5.f3582u, min);
                if (i16 > 0) {
                    max = Math.min(i16, max);
                }
                c0302g.d(max);
            }
            if (c0302g.f3703j) {
                C0301f c0301f7 = (C0301f) c0301f.f3705l.get(0);
                C0301f c0301f8 = (C0301f) c0301f2.f3705l.get(0);
                int i17 = c0301f7.f3702g;
                int i18 = c0301f.f3701f + i17;
                int i19 = c0301f8.f3702g;
                int i20 = c0301f2.f3701f + i19;
                float f8 = this.f3719b.f3556d0;
                if (c0301f7 == c0301f8) {
                    f8 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c0301f.d((int) ((((i19 - i17) - c0302g.f3702g) * f8) + i17 + 0.5f));
                c0301f2.d(c0301f.f3702g + c0302g.f3702g);
            }
        }
    }

    @Override // t.AbstractC0310o
    public final void d() {
        C0293d c0293d;
        C0293d c0293d2;
        int i;
        C0293d c0293d3;
        C0293d c0293d4;
        int i2;
        C0293d c0293d5 = this.f3719b;
        boolean z2 = c0293d5.f3550a;
        C0302g c0302g = this.f3721e;
        if (z2) {
            c0302g.d(c0293d5.q());
        }
        boolean z3 = c0302g.f3703j;
        C0301f c0301f = this.i;
        C0301f c0301f2 = this.h;
        if (!z3) {
            C0293d c0293d6 = this.f3719b;
            int i3 = c0293d6.f3577p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0293d4 = c0293d6.f3543T) != null && ((i2 = c0293d4.f3577p0[0]) == 1 || i2 == 4)) {
                    int q2 = (c0293d4.q() - this.f3719b.f3532I.e()) - this.f3719b.f3534K.e();
                    AbstractC0310o.b(c0301f2, c0293d4.d.h, this.f3719b.f3532I.e());
                    AbstractC0310o.b(c0301f, c0293d4.d.i, -this.f3719b.f3534K.e());
                    c0302g.d(q2);
                    return;
                }
                if (i3 == 1) {
                    c0302g.d(c0293d6.q());
                }
            }
        } else if (this.d == 4 && (c0293d2 = (c0293d = this.f3719b).f3543T) != null && ((i = c0293d2.f3577p0[0]) == 1 || i == 4)) {
            AbstractC0310o.b(c0301f2, c0293d2.d.h, c0293d.f3532I.e());
            AbstractC0310o.b(c0301f, c0293d2.d.i, -this.f3719b.f3534K.e());
            return;
        }
        if (c0302g.f3703j) {
            C0293d c0293d7 = this.f3719b;
            if (c0293d7.f3550a) {
                C0292c[] c0292cArr = c0293d7.f3540Q;
                C0292c c0292c = c0292cArr[0];
                C0292c c0292c2 = c0292c.f3523f;
                if (c0292c2 != null && c0292cArr[1].f3523f != null) {
                    if (c0293d7.x()) {
                        c0301f2.f3701f = this.f3719b.f3540Q[0].e();
                        c0301f.f3701f = -this.f3719b.f3540Q[1].e();
                        return;
                    }
                    C0301f h = AbstractC0310o.h(this.f3719b.f3540Q[0]);
                    if (h != null) {
                        AbstractC0310o.b(c0301f2, h, this.f3719b.f3540Q[0].e());
                    }
                    C0301f h2 = AbstractC0310o.h(this.f3719b.f3540Q[1]);
                    if (h2 != null) {
                        AbstractC0310o.b(c0301f, h2, -this.f3719b.f3540Q[1].e());
                    }
                    c0301f2.f3698b = true;
                    c0301f.f3698b = true;
                    return;
                }
                if (c0292c2 != null) {
                    C0301f h3 = AbstractC0310o.h(c0292c);
                    if (h3 != null) {
                        AbstractC0310o.b(c0301f2, h3, this.f3719b.f3540Q[0].e());
                        AbstractC0310o.b(c0301f, c0301f2, c0302g.f3702g);
                        return;
                    }
                    return;
                }
                C0292c c0292c3 = c0292cArr[1];
                if (c0292c3.f3523f != null) {
                    C0301f h4 = AbstractC0310o.h(c0292c3);
                    if (h4 != null) {
                        AbstractC0310o.b(c0301f, h4, -this.f3719b.f3540Q[1].e());
                        AbstractC0310o.b(c0301f2, c0301f, -c0302g.f3702g);
                        return;
                    }
                    return;
                }
                if ((c0293d7 instanceof s.i) || c0293d7.f3543T == null || c0293d7.i(7).f3523f != null) {
                    return;
                }
                C0293d c0293d8 = this.f3719b;
                AbstractC0310o.b(c0301f2, c0293d8.f3543T.d.h, c0293d8.r());
                AbstractC0310o.b(c0301f, c0301f2, c0302g.f3702g);
                return;
            }
        }
        if (this.d == 3) {
            C0293d c0293d9 = this.f3719b;
            int i4 = c0293d9.f3579r;
            if (i4 == 2) {
                C0293d c0293d10 = c0293d9.f3543T;
                if (c0293d10 != null) {
                    C0302g c0302g2 = c0293d10.f3557e.f3721e;
                    c0302g.f3705l.add(c0302g2);
                    c0302g2.f3704k.add(c0302g);
                    c0302g.f3698b = true;
                    c0302g.f3704k.add(c0301f2);
                    c0302g.f3704k.add(c0301f);
                }
            } else if (i4 == 3) {
                if (c0293d9.f3580s == 3) {
                    c0301f2.f3697a = this;
                    c0301f.f3697a = this;
                    C0308m c0308m = c0293d9.f3557e;
                    c0308m.h.f3697a = this;
                    c0308m.i.f3697a = this;
                    c0302g.f3697a = this;
                    if (c0293d9.y()) {
                        c0302g.f3705l.add(this.f3719b.f3557e.f3721e);
                        this.f3719b.f3557e.f3721e.f3704k.add(c0302g);
                        C0308m c0308m2 = this.f3719b.f3557e;
                        c0308m2.f3721e.f3697a = this;
                        c0302g.f3705l.add(c0308m2.h);
                        c0302g.f3705l.add(this.f3719b.f3557e.i);
                        this.f3719b.f3557e.h.f3704k.add(c0302g);
                        this.f3719b.f3557e.i.f3704k.add(c0302g);
                    } else if (this.f3719b.x()) {
                        this.f3719b.f3557e.f3721e.f3705l.add(c0302g);
                        c0302g.f3704k.add(this.f3719b.f3557e.f3721e);
                    } else {
                        this.f3719b.f3557e.f3721e.f3705l.add(c0302g);
                    }
                } else {
                    C0302g c0302g3 = c0293d9.f3557e.f3721e;
                    c0302g.f3705l.add(c0302g3);
                    c0302g3.f3704k.add(c0302g);
                    this.f3719b.f3557e.h.f3704k.add(c0302g);
                    this.f3719b.f3557e.i.f3704k.add(c0302g);
                    c0302g.f3698b = true;
                    c0302g.f3704k.add(c0301f2);
                    c0302g.f3704k.add(c0301f);
                    c0301f2.f3705l.add(c0302g);
                    c0301f.f3705l.add(c0302g);
                }
            }
        }
        C0293d c0293d11 = this.f3719b;
        C0292c[] c0292cArr2 = c0293d11.f3540Q;
        C0292c c0292c4 = c0292cArr2[0];
        C0292c c0292c5 = c0292c4.f3523f;
        if (c0292c5 != null && c0292cArr2[1].f3523f != null) {
            if (c0293d11.x()) {
                c0301f2.f3701f = this.f3719b.f3540Q[0].e();
                c0301f.f3701f = -this.f3719b.f3540Q[1].e();
                return;
            }
            C0301f h5 = AbstractC0310o.h(this.f3719b.f3540Q[0]);
            C0301f h6 = AbstractC0310o.h(this.f3719b.f3540Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.f3724j = 4;
            return;
        }
        if (c0292c5 != null) {
            C0301f h7 = AbstractC0310o.h(c0292c4);
            if (h7 != null) {
                AbstractC0310o.b(c0301f2, h7, this.f3719b.f3540Q[0].e());
                c(c0301f, c0301f2, 1, c0302g);
                return;
            }
            return;
        }
        C0292c c0292c6 = c0292cArr2[1];
        if (c0292c6.f3523f != null) {
            C0301f h8 = AbstractC0310o.h(c0292c6);
            if (h8 != null) {
                AbstractC0310o.b(c0301f, h8, -this.f3719b.f3540Q[1].e());
                c(c0301f2, c0301f, -1, c0302g);
                return;
            }
            return;
        }
        if ((c0293d11 instanceof s.i) || (c0293d3 = c0293d11.f3543T) == null) {
            return;
        }
        AbstractC0310o.b(c0301f2, c0293d3.d.h, c0293d11.r());
        c(c0301f, c0301f2, 1, c0302g);
    }

    @Override // t.AbstractC0310o
    public final void e() {
        C0301f c0301f = this.h;
        if (c0301f.f3703j) {
            this.f3719b.f3548Y = c0301f.f3702g;
        }
    }

    @Override // t.AbstractC0310o
    public final void f() {
        this.f3720c = null;
        this.h.c();
        this.i.c();
        this.f3721e.c();
        this.f3723g = false;
    }

    @Override // t.AbstractC0310o
    public final boolean k() {
        return this.d != 3 || this.f3719b.f3579r == 0;
    }

    public final void n() {
        this.f3723g = false;
        C0301f c0301f = this.h;
        c0301f.c();
        c0301f.f3703j = false;
        C0301f c0301f2 = this.i;
        c0301f2.c();
        c0301f2.f3703j = false;
        this.f3721e.f3703j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3719b.f3563h0;
    }
}
