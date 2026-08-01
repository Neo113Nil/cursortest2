package t;

import q.AbstractC0290e;
import s.C0297c;
import s.C0298d;

/* renamed from: t.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0315o implements InterfaceC0304d {

    /* renamed from: a, reason: collision with root package name */
    public int f3772a;

    /* renamed from: b, reason: collision with root package name */
    public C0298d f3773b;

    /* renamed from: c, reason: collision with root package name */
    public C0312l f3774c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0307g f3775e = new C0307g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3776f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3777g = false;
    public final C0306f h = new C0306f(this);
    public final C0306f i = new C0306f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3778j = 1;

    public AbstractC0315o(C0298d c0298d) {
        this.f3773b = c0298d;
    }

    public static void b(C0306f c0306f, C0306f c0306f2, int i) {
        c0306f.f3759l.add(c0306f2);
        c0306f.f3755f = i;
        c0306f2.f3758k.add(c0306f);
    }

    public static C0306f h(C0297c c0297c) {
        C0297c c0297c2 = c0297c.f3589f;
        if (c0297c2 == null) {
            return null;
        }
        int a2 = AbstractC0290e.a(c0297c2.f3588e);
        C0298d c0298d = c0297c2.d;
        if (a2 == 1) {
            return c0298d.d.h;
        }
        if (a2 == 2) {
            return c0298d.f3623e.h;
        }
        if (a2 == 3) {
            return c0298d.d.i;
        }
        if (a2 == 4) {
            return c0298d.f3623e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0298d.f3623e.f3765k;
    }

    public static C0306f i(C0297c c0297c, int i) {
        C0297c c0297c2 = c0297c.f3589f;
        if (c0297c2 == null) {
            return null;
        }
        C0298d c0298d = c0297c2.d;
        AbstractC0315o abstractC0315o = i == 0 ? c0298d.d : c0298d.f3623e;
        int a2 = AbstractC0290e.a(c0297c2.f3588e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0315o.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0315o.i;
        }
        return null;
    }

    public final void c(C0306f c0306f, C0306f c0306f2, int i, C0307g c0307g) {
        c0306f.f3759l.add(c0306f2);
        c0306f.f3759l.add(this.f3775e);
        c0306f.h = i;
        c0306f.i = c0307g;
        c0306f2.f3758k.add(c0306f);
        c0307g.f3758k.add(c0306f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0298d c0298d = this.f3773b;
            int i3 = c0298d.f3649v;
            max = Math.max(c0298d.f3648u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0298d c0298d2 = this.f3773b;
            int i4 = c0298d2.f3652y;
            max = Math.max(c0298d2.f3651x, i);
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
        if (this.f3775e.f3757j) {
            return r0.f3756g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3772a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0297c c0297c, C0297c c0297c2, int i) {
        C0306f h = h(c0297c);
        C0306f h2 = h(c0297c2);
        if (h.f3757j && h2.f3757j) {
            int e2 = c0297c.e() + h.f3756g;
            int e3 = h2.f3756g - c0297c2.e();
            int i2 = e3 - e2;
            C0307g c0307g = this.f3775e;
            if (!c0307g.f3757j && this.d == 3) {
                int i3 = this.f3772a;
                if (i3 == 0) {
                    c0307g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0307g.d(Math.min(g(c0307g.f3760m, i), i2));
                } else if (i3 == 2) {
                    C0298d c0298d = this.f3773b;
                    C0298d c0298d2 = c0298d.f3609T;
                    if (c0298d2 != null) {
                        if ((i == 0 ? c0298d2.d : c0298d2.f3623e).f3775e.f3757j) {
                            c0307g.d(g((int) ((r6.f3756g * (i == 0 ? c0298d.f3650w : c0298d.f3653z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0298d c0298d3 = this.f3773b;
                    AbstractC0315o abstractC0315o = c0298d3.d;
                    if (abstractC0315o.d == 3 && abstractC0315o.f3772a == 3) {
                        C0313m c0313m = c0298d3.f3623e;
                        if (c0313m.d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0315o = c0298d3.f3623e;
                    }
                    if (abstractC0315o.f3775e.f3757j) {
                        float f2 = c0298d3.f3612W;
                        c0307g.d(i == 1 ? (int) ((r6.f3756g / f2) + 0.5f) : (int) ((f2 * r6.f3756g) + 0.5f));
                    }
                }
            }
            if (c0307g.f3757j) {
                int i4 = c0307g.f3756g;
                C0306f c0306f = this.i;
                C0306f c0306f2 = this.h;
                if (i4 == i2) {
                    c0306f2.d(e2);
                    c0306f.d(e3);
                    return;
                }
                C0298d c0298d4 = this.f3773b;
                float f3 = i == 0 ? c0298d4.f3622d0 : c0298d4.f3624e0;
                if (h == h2) {
                    e2 = h.f3756g;
                    e3 = h2.f3756g;
                    f3 = 0.5f;
                }
                c0306f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0306f.d(c0306f2.f3756g + c0307g.f3756g);
            }
        }
    }
}
