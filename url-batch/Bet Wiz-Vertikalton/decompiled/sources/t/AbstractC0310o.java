package t;

import q.AbstractC0285e;
import s.C0292c;
import s.C0293d;

/* renamed from: t.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0310o implements InterfaceC0299d {

    /* renamed from: a, reason: collision with root package name */
    public int f3718a;

    /* renamed from: b, reason: collision with root package name */
    public C0293d f3719b;

    /* renamed from: c, reason: collision with root package name */
    public C0307l f3720c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0302g f3721e = new C0302g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3722f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3723g = false;
    public final C0301f h = new C0301f(this);
    public final C0301f i = new C0301f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3724j = 1;

    public AbstractC0310o(C0293d c0293d) {
        this.f3719b = c0293d;
    }

    public static void b(C0301f c0301f, C0301f c0301f2, int i) {
        c0301f.f3705l.add(c0301f2);
        c0301f.f3701f = i;
        c0301f2.f3704k.add(c0301f);
    }

    public static C0301f h(C0292c c0292c) {
        C0292c c0292c2 = c0292c.f3523f;
        if (c0292c2 == null) {
            return null;
        }
        int a2 = AbstractC0285e.a(c0292c2.f3522e);
        C0293d c0293d = c0292c2.d;
        if (a2 == 1) {
            return c0293d.d.h;
        }
        if (a2 == 2) {
            return c0293d.f3557e.h;
        }
        if (a2 == 3) {
            return c0293d.d.i;
        }
        if (a2 == 4) {
            return c0293d.f3557e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0293d.f3557e.f3711k;
    }

    public static C0301f i(C0292c c0292c, int i) {
        C0292c c0292c2 = c0292c.f3523f;
        if (c0292c2 == null) {
            return null;
        }
        C0293d c0293d = c0292c2.d;
        AbstractC0310o abstractC0310o = i == 0 ? c0293d.d : c0293d.f3557e;
        int a2 = AbstractC0285e.a(c0292c2.f3522e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0310o.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0310o.i;
        }
        return null;
    }

    public final void c(C0301f c0301f, C0301f c0301f2, int i, C0302g c0302g) {
        c0301f.f3705l.add(c0301f2);
        c0301f.f3705l.add(this.f3721e);
        c0301f.h = i;
        c0301f.i = c0302g;
        c0301f2.f3704k.add(c0301f);
        c0302g.f3704k.add(c0301f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0293d c0293d = this.f3719b;
            int i3 = c0293d.f3583v;
            max = Math.max(c0293d.f3582u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0293d c0293d2 = this.f3719b;
            int i4 = c0293d2.f3586y;
            max = Math.max(c0293d2.f3585x, i);
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
        if (this.f3721e.f3703j) {
            return r0.f3702g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3718a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0292c c0292c, C0292c c0292c2, int i) {
        C0301f h = h(c0292c);
        C0301f h2 = h(c0292c2);
        if (h.f3703j && h2.f3703j) {
            int e2 = c0292c.e() + h.f3702g;
            int e3 = h2.f3702g - c0292c2.e();
            int i2 = e3 - e2;
            C0302g c0302g = this.f3721e;
            if (!c0302g.f3703j && this.d == 3) {
                int i3 = this.f3718a;
                if (i3 == 0) {
                    c0302g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0302g.d(Math.min(g(c0302g.f3706m, i), i2));
                } else if (i3 == 2) {
                    C0293d c0293d = this.f3719b;
                    C0293d c0293d2 = c0293d.f3543T;
                    if (c0293d2 != null) {
                        if ((i == 0 ? c0293d2.d : c0293d2.f3557e).f3721e.f3703j) {
                            c0302g.d(g((int) ((r6.f3702g * (i == 0 ? c0293d.f3584w : c0293d.f3587z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0293d c0293d3 = this.f3719b;
                    AbstractC0310o abstractC0310o = c0293d3.d;
                    if (abstractC0310o.d == 3 && abstractC0310o.f3718a == 3) {
                        C0308m c0308m = c0293d3.f3557e;
                        if (c0308m.d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0310o = c0293d3.f3557e;
                    }
                    if (abstractC0310o.f3721e.f3703j) {
                        float f2 = c0293d3.f3546W;
                        c0302g.d(i == 1 ? (int) ((r6.f3702g / f2) + 0.5f) : (int) ((f2 * r6.f3702g) + 0.5f));
                    }
                }
            }
            if (c0302g.f3703j) {
                int i4 = c0302g.f3702g;
                C0301f c0301f = this.i;
                C0301f c0301f2 = this.h;
                if (i4 == i2) {
                    c0301f2.d(e2);
                    c0301f.d(e3);
                    return;
                }
                C0293d c0293d4 = this.f3719b;
                float f3 = i == 0 ? c0293d4.f3556d0 : c0293d4.f3558e0;
                if (h == h2) {
                    e2 = h.f3702g;
                    e3 = h2.f3702g;
                    f3 = 0.5f;
                }
                c0301f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0301f.d(c0301f2.f3702g + c0302g.f3702g);
            }
        }
    }
}
