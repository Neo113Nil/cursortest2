package v;

import s.AbstractC0267e;
import u.C0274c;
import u.C0275d;

/* renamed from: v.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0292o implements InterfaceC0281d {

    /* renamed from: a, reason: collision with root package name */
    public int f3835a;

    /* renamed from: b, reason: collision with root package name */
    public C0275d f3836b;

    /* renamed from: c, reason: collision with root package name */
    public C0289l f3837c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0284g f3838e = new C0284g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3839f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3840g = false;
    public final C0283f h = new C0283f(this);
    public final C0283f i = new C0283f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3841j = 1;

    public AbstractC0292o(C0275d c0275d) {
        this.f3836b = c0275d;
    }

    public static void b(C0283f c0283f, C0283f c0283f2, int i) {
        c0283f.f3822l.add(c0283f2);
        c0283f.f3818f = i;
        c0283f2.f3821k.add(c0283f);
    }

    public static C0283f h(C0274c c0274c) {
        C0274c c0274c2 = c0274c.f3639f;
        if (c0274c2 == null) {
            return null;
        }
        int a2 = AbstractC0267e.a(c0274c2.f3638e);
        C0275d c0275d = c0274c2.d;
        if (a2 == 1) {
            return c0275d.d.h;
        }
        if (a2 == 2) {
            return c0275d.f3673e.h;
        }
        if (a2 == 3) {
            return c0275d.d.i;
        }
        if (a2 == 4) {
            return c0275d.f3673e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0275d.f3673e.f3828k;
    }

    public static C0283f i(C0274c c0274c, int i) {
        C0274c c0274c2 = c0274c.f3639f;
        if (c0274c2 == null) {
            return null;
        }
        C0275d c0275d = c0274c2.d;
        AbstractC0292o abstractC0292o = i == 0 ? c0275d.d : c0275d.f3673e;
        int a2 = AbstractC0267e.a(c0274c2.f3638e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0292o.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0292o.i;
        }
        return null;
    }

    public final void c(C0283f c0283f, C0283f c0283f2, int i, C0284g c0284g) {
        c0283f.f3822l.add(c0283f2);
        c0283f.f3822l.add(this.f3838e);
        c0283f.h = i;
        c0283f.i = c0284g;
        c0283f2.f3821k.add(c0283f);
        c0284g.f3821k.add(c0283f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0275d c0275d = this.f3836b;
            int i3 = c0275d.f3699v;
            max = Math.max(c0275d.f3698u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0275d c0275d2 = this.f3836b;
            int i4 = c0275d2.f3702y;
            max = Math.max(c0275d2.f3701x, i);
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
        if (this.f3838e.f3820j) {
            return r0.f3819g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3835a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0274c c0274c, C0274c c0274c2, int i) {
        C0283f h = h(c0274c);
        C0283f h2 = h(c0274c2);
        if (h.f3820j && h2.f3820j) {
            int e2 = c0274c.e() + h.f3819g;
            int e3 = h2.f3819g - c0274c2.e();
            int i2 = e3 - e2;
            C0284g c0284g = this.f3838e;
            if (!c0284g.f3820j && this.d == 3) {
                int i3 = this.f3835a;
                if (i3 == 0) {
                    c0284g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0284g.d(Math.min(g(c0284g.f3823m, i), i2));
                } else if (i3 == 2) {
                    C0275d c0275d = this.f3836b;
                    C0275d c0275d2 = c0275d.f3659T;
                    if (c0275d2 != null) {
                        if ((i == 0 ? c0275d2.d : c0275d2.f3673e).f3838e.f3820j) {
                            c0284g.d(g((int) ((r6.f3819g * (i == 0 ? c0275d.f3700w : c0275d.f3703z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0275d c0275d3 = this.f3836b;
                    AbstractC0292o abstractC0292o = c0275d3.d;
                    if (abstractC0292o.d == 3 && abstractC0292o.f3835a == 3) {
                        C0290m c0290m = c0275d3.f3673e;
                        if (c0290m.d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0292o = c0275d3.f3673e;
                    }
                    if (abstractC0292o.f3838e.f3820j) {
                        float f2 = c0275d3.f3662W;
                        c0284g.d(i == 1 ? (int) ((r6.f3819g / f2) + 0.5f) : (int) ((f2 * r6.f3819g) + 0.5f));
                    }
                }
            }
            if (c0284g.f3820j) {
                int i4 = c0284g.f3819g;
                C0283f c0283f = this.i;
                C0283f c0283f2 = this.h;
                if (i4 == i2) {
                    c0283f2.d(e2);
                    c0283f.d(e3);
                    return;
                }
                C0275d c0275d4 = this.f3836b;
                float f3 = i == 0 ? c0275d4.f3672d0 : c0275d4.f3674e0;
                if (h == h2) {
                    e2 = h.f3819g;
                    e3 = h2.f3819g;
                    f3 = 0.5f;
                }
                c0283f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0283f.d(c0283f2.f3819g + c0284g.f3819g);
            }
        }
    }
}
