package t;

import q.AbstractC0290e;
import s.C0297c;
import s.C0298d;

/* renamed from: t.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0315o implements InterfaceC0304d {

    /* renamed from: a, reason: collision with root package name */
    public int f3794a;

    /* renamed from: b, reason: collision with root package name */
    public C0298d f3795b;

    /* renamed from: c, reason: collision with root package name */
    public C0312l f3796c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0307g f3797e = new C0307g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3798f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3799g = false;
    public final C0306f h = new C0306f(this);
    public final C0306f i = new C0306f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3800j = 1;

    public AbstractC0315o(C0298d c0298d) {
        this.f3795b = c0298d;
    }

    public static void b(C0306f c0306f, C0306f c0306f2, int i) {
        c0306f.f3781l.add(c0306f2);
        c0306f.f3777f = i;
        c0306f2.f3780k.add(c0306f);
    }

    public static C0306f h(C0297c c0297c) {
        C0297c c0297c2 = c0297c.f3611f;
        if (c0297c2 == null) {
            return null;
        }
        int a2 = AbstractC0290e.a(c0297c2.f3610e);
        C0298d c0298d = c0297c2.d;
        if (a2 == 1) {
            return c0298d.d.h;
        }
        if (a2 == 2) {
            return c0298d.f3645e.h;
        }
        if (a2 == 3) {
            return c0298d.d.i;
        }
        if (a2 == 4) {
            return c0298d.f3645e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0298d.f3645e.f3787k;
    }

    public static C0306f i(C0297c c0297c, int i) {
        C0297c c0297c2 = c0297c.f3611f;
        if (c0297c2 == null) {
            return null;
        }
        C0298d c0298d = c0297c2.d;
        AbstractC0315o abstractC0315o = i == 0 ? c0298d.d : c0298d.f3645e;
        int a2 = AbstractC0290e.a(c0297c2.f3610e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0315o.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0315o.i;
        }
        return null;
    }

    public final void c(C0306f c0306f, C0306f c0306f2, int i, C0307g c0307g) {
        c0306f.f3781l.add(c0306f2);
        c0306f.f3781l.add(this.f3797e);
        c0306f.h = i;
        c0306f.i = c0307g;
        c0306f2.f3780k.add(c0306f);
        c0307g.f3780k.add(c0306f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0298d c0298d = this.f3795b;
            int i3 = c0298d.f3671v;
            max = Math.max(c0298d.f3670u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0298d c0298d2 = this.f3795b;
            int i4 = c0298d2.f3674y;
            max = Math.max(c0298d2.f3673x, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public long j() {
        if (this.f3797e.f3779j) {
            return r0.f3778g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3794a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0297c c0297c, C0297c c0297c2, int i) {
        C0306f h = h(c0297c);
        C0306f h2 = h(c0297c2);
        if (h.f3779j && h2.f3779j) {
            int e2 = c0297c.e() + h.f3778g;
            int e3 = h2.f3778g - c0297c2.e();
            int i2 = e3 - e2;
            C0307g c0307g = this.f3797e;
            if (!c0307g.f3779j && this.d == 3) {
                int i3 = this.f3794a;
                if (i3 == 0) {
                    c0307g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0307g.d(Math.min(g(c0307g.f3782m, i), i2));
                } else if (i3 == 2) {
                    C0298d c0298d = this.f3795b;
                    C0298d c0298d2 = c0298d.f3631T;
                    if (c0298d2 != null) {
                        if ((i == 0 ? c0298d2.d : c0298d2.f3645e).f3797e.f3779j) {
                            c0307g.d(g((int) ((r6.f3778g * (i == 0 ? c0298d.f3672w : c0298d.f3675z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0298d c0298d3 = this.f3795b;
                    AbstractC0315o abstractC0315o = c0298d3.d;
                    if (abstractC0315o.d == 3 && abstractC0315o.f3794a == 3) {
                        C0313m c0313m = c0298d3.f3645e;
                        if (c0313m.d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0315o = c0298d3.f3645e;
                    }
                    if (abstractC0315o.f3797e.f3779j) {
                        float f2 = c0298d3.f3634W;
                        c0307g.d(i == 1 ? (int) ((r6.f3778g / f2) + 0.5f) : (int) ((f2 * r6.f3778g) + 0.5f));
                    }
                }
            }
            if (c0307g.f3779j) {
                int i4 = c0307g.f3778g;
                C0306f c0306f = this.i;
                C0306f c0306f2 = this.h;
                if (i4 == i2) {
                    c0306f2.d(e2);
                    c0306f.d(e3);
                    return;
                }
                C0298d c0298d4 = this.f3795b;
                float f3 = i == 0 ? c0298d4.f3644d0 : c0298d4.f3646e0;
                if (h == h2) {
                    e2 = h.f3778g;
                    e3 = h2.f3778g;
                    f3 = 0.5f;
                }
                c0306f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0306f.d(c0306f2.f3778g + c0307g.f3778g);
            }
        }
    }
}
