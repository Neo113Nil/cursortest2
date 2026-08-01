package t;

import q.AbstractC0290e;
import s.C0297c;
import s.C0298d;

/* renamed from: t.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0315o implements InterfaceC0304d {

    /* renamed from: a, reason: collision with root package name */
    public int f3790a;

    /* renamed from: b, reason: collision with root package name */
    public C0298d f3791b;

    /* renamed from: c, reason: collision with root package name */
    public C0312l f3792c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0307g f3793e = new C0307g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3794f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3795g = false;
    public final C0306f h = new C0306f(this);
    public final C0306f i = new C0306f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3796j = 1;

    public AbstractC0315o(C0298d c0298d) {
        this.f3791b = c0298d;
    }

    public static void b(C0306f c0306f, C0306f c0306f2, int i) {
        c0306f.f3777l.add(c0306f2);
        c0306f.f3773f = i;
        c0306f2.f3776k.add(c0306f);
    }

    public static C0306f h(C0297c c0297c) {
        C0297c c0297c2 = c0297c.f3607f;
        if (c0297c2 == null) {
            return null;
        }
        int a2 = AbstractC0290e.a(c0297c2.f3606e);
        C0298d c0298d = c0297c2.d;
        if (a2 == 1) {
            return c0298d.d.h;
        }
        if (a2 == 2) {
            return c0298d.f3641e.h;
        }
        if (a2 == 3) {
            return c0298d.d.i;
        }
        if (a2 == 4) {
            return c0298d.f3641e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0298d.f3641e.f3783k;
    }

    public static C0306f i(C0297c c0297c, int i) {
        C0297c c0297c2 = c0297c.f3607f;
        if (c0297c2 == null) {
            return null;
        }
        C0298d c0298d = c0297c2.d;
        AbstractC0315o abstractC0315o = i == 0 ? c0298d.d : c0298d.f3641e;
        int a2 = AbstractC0290e.a(c0297c2.f3606e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0315o.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0315o.i;
        }
        return null;
    }

    public final void c(C0306f c0306f, C0306f c0306f2, int i, C0307g c0307g) {
        c0306f.f3777l.add(c0306f2);
        c0306f.f3777l.add(this.f3793e);
        c0306f.h = i;
        c0306f.i = c0307g;
        c0306f2.f3776k.add(c0306f);
        c0307g.f3776k.add(c0306f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0298d c0298d = this.f3791b;
            int i3 = c0298d.f3667v;
            max = Math.max(c0298d.f3666u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0298d c0298d2 = this.f3791b;
            int i4 = c0298d2.f3670y;
            max = Math.max(c0298d2.f3669x, i);
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
        if (this.f3793e.f3775j) {
            return r0.f3774g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3790a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0297c c0297c, C0297c c0297c2, int i) {
        C0306f h = h(c0297c);
        C0306f h2 = h(c0297c2);
        if (h.f3775j && h2.f3775j) {
            int e2 = c0297c.e() + h.f3774g;
            int e3 = h2.f3774g - c0297c2.e();
            int i2 = e3 - e2;
            C0307g c0307g = this.f3793e;
            if (!c0307g.f3775j && this.d == 3) {
                int i3 = this.f3790a;
                if (i3 == 0) {
                    c0307g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0307g.d(Math.min(g(c0307g.f3778m, i), i2));
                } else if (i3 == 2) {
                    C0298d c0298d = this.f3791b;
                    C0298d c0298d2 = c0298d.f3627T;
                    if (c0298d2 != null) {
                        if ((i == 0 ? c0298d2.d : c0298d2.f3641e).f3793e.f3775j) {
                            c0307g.d(g((int) ((r6.f3774g * (i == 0 ? c0298d.f3668w : c0298d.f3671z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0298d c0298d3 = this.f3791b;
                    AbstractC0315o abstractC0315o = c0298d3.d;
                    if (abstractC0315o.d == 3 && abstractC0315o.f3790a == 3) {
                        C0313m c0313m = c0298d3.f3641e;
                        if (c0313m.d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0315o = c0298d3.f3641e;
                    }
                    if (abstractC0315o.f3793e.f3775j) {
                        float f2 = c0298d3.f3630W;
                        c0307g.d(i == 1 ? (int) ((r6.f3774g / f2) + 0.5f) : (int) ((f2 * r6.f3774g) + 0.5f));
                    }
                }
            }
            if (c0307g.f3775j) {
                int i4 = c0307g.f3774g;
                C0306f c0306f = this.i;
                C0306f c0306f2 = this.h;
                if (i4 == i2) {
                    c0306f2.d(e2);
                    c0306f.d(e3);
                    return;
                }
                C0298d c0298d4 = this.f3791b;
                float f3 = i == 0 ? c0298d4.f3640d0 : c0298d4.f3642e0;
                if (h == h2) {
                    e2 = h.f3774g;
                    e3 = h2.f3774g;
                    f3 = 0.5f;
                }
                c0306f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0306f.d(c0306f2.f3774g + c0307g.f3774g);
            }
        }
    }
}
