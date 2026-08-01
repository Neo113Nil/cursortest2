package t;

import q.AbstractC0273e;
import s.C0280c;
import s.C0281d;

/* renamed from: t.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0298o implements InterfaceC0287d {

    /* renamed from: a, reason: collision with root package name */
    public int f3815a;

    /* renamed from: b, reason: collision with root package name */
    public C0281d f3816b;

    /* renamed from: c, reason: collision with root package name */
    public C0295l f3817c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0290g f3818e = new C0290g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3819f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3820g = false;
    public final C0289f h = new C0289f(this);
    public final C0289f i = new C0289f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3821j = 1;

    public AbstractC0298o(C0281d c0281d) {
        this.f3816b = c0281d;
    }

    public static void b(C0289f c0289f, C0289f c0289f2, int i) {
        c0289f.f3802l.add(c0289f2);
        c0289f.f3798f = i;
        c0289f2.f3801k.add(c0289f);
    }

    public static C0289f h(C0280c c0280c) {
        C0280c c0280c2 = c0280c.f3601f;
        if (c0280c2 == null) {
            return null;
        }
        int a2 = AbstractC0273e.a(c0280c2.f3600e);
        C0281d c0281d = c0280c2.d;
        if (a2 == 1) {
            return c0281d.d.h;
        }
        if (a2 == 2) {
            return c0281d.f3635e.h;
        }
        if (a2 == 3) {
            return c0281d.d.i;
        }
        if (a2 == 4) {
            return c0281d.f3635e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0281d.f3635e.f3808k;
    }

    public static C0289f i(C0280c c0280c, int i) {
        C0280c c0280c2 = c0280c.f3601f;
        if (c0280c2 == null) {
            return null;
        }
        C0281d c0281d = c0280c2.d;
        AbstractC0298o abstractC0298o = i == 0 ? c0281d.d : c0281d.f3635e;
        int a2 = AbstractC0273e.a(c0280c2.f3600e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0298o.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0298o.i;
        }
        return null;
    }

    public final void c(C0289f c0289f, C0289f c0289f2, int i, C0290g c0290g) {
        c0289f.f3802l.add(c0289f2);
        c0289f.f3802l.add(this.f3818e);
        c0289f.h = i;
        c0289f.i = c0290g;
        c0289f2.f3801k.add(c0289f);
        c0290g.f3801k.add(c0289f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0281d c0281d = this.f3816b;
            int i3 = c0281d.f3660v;
            max = Math.max(c0281d.f3659u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0281d c0281d2 = this.f3816b;
            int i4 = c0281d2.f3663y;
            max = Math.max(c0281d2.f3662x, i);
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
        if (this.f3818e.f3800j) {
            return r0.f3799g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3815a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0280c c0280c, C0280c c0280c2, int i) {
        C0289f h = h(c0280c);
        C0289f h2 = h(c0280c2);
        if (h.f3800j && h2.f3800j) {
            int e2 = c0280c.e() + h.f3799g;
            int e3 = h2.f3799g - c0280c2.e();
            int i2 = e3 - e2;
            C0290g c0290g = this.f3818e;
            if (!c0290g.f3800j && this.d == 3) {
                int i3 = this.f3815a;
                if (i3 == 0) {
                    c0290g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0290g.d(Math.min(g(c0290g.f3803m, i), i2));
                } else if (i3 == 2) {
                    C0281d c0281d = this.f3816b;
                    C0281d c0281d2 = c0281d.f3621T;
                    if (c0281d2 != null) {
                        if ((i == 0 ? c0281d2.d : c0281d2.f3635e).f3818e.f3800j) {
                            c0290g.d(g((int) ((r6.f3799g * (i == 0 ? c0281d.f3661w : c0281d.f3664z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0281d c0281d3 = this.f3816b;
                    AbstractC0298o abstractC0298o = c0281d3.d;
                    if (abstractC0298o.d == 3 && abstractC0298o.f3815a == 3) {
                        C0296m c0296m = c0281d3.f3635e;
                        if (c0296m.d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0298o = c0281d3.f3635e;
                    }
                    if (abstractC0298o.f3818e.f3800j) {
                        float f2 = c0281d3.f3624W;
                        c0290g.d(i == 1 ? (int) ((r6.f3799g / f2) + 0.5f) : (int) ((f2 * r6.f3799g) + 0.5f));
                    }
                }
            }
            if (c0290g.f3800j) {
                int i4 = c0290g.f3799g;
                C0289f c0289f = this.i;
                C0289f c0289f2 = this.h;
                if (i4 == i2) {
                    c0289f2.d(e2);
                    c0289f.d(e3);
                    return;
                }
                C0281d c0281d4 = this.f3816b;
                float f3 = i == 0 ? c0281d4.f3634d0 : c0281d4.f3636e0;
                if (h == h2) {
                    e2 = h.f3799g;
                    e3 = h2.f3799g;
                    f3 = 0.5f;
                }
                c0289f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0289f.d(c0289f2.f3799g + c0290g.f3799g);
            }
        }
    }
}
