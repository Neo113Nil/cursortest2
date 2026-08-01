package t;

import q.AbstractC0317e;
import s.C0324c;
import s.C0325d;

/* renamed from: t.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0342o implements InterfaceC0331d {

    /* renamed from: a, reason: collision with root package name */
    public int f4191a;

    /* renamed from: b, reason: collision with root package name */
    public C0325d f4192b;

    /* renamed from: c, reason: collision with root package name */
    public C0339l f4193c;

    /* renamed from: d, reason: collision with root package name */
    public int f4194d;

    /* renamed from: e, reason: collision with root package name */
    public final C0334g f4195e = new C0334g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f4196f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4197g = false;
    public final C0333f h = new C0333f(this);
    public final C0333f i = new C0333f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f4198j = 1;

    public AbstractC0342o(C0325d c0325d) {
        this.f4192b = c0325d;
    }

    public static void b(C0333f c0333f, C0333f c0333f2, int i) {
        c0333f.f4177l.add(c0333f2);
        c0333f.f4173f = i;
        c0333f2.f4176k.add(c0333f);
    }

    public static C0333f h(C0324c c0324c) {
        C0324c c0324c2 = c0324c.f4003f;
        if (c0324c2 == null) {
            return null;
        }
        int a2 = AbstractC0317e.a(c0324c2.f4002e);
        C0325d c0325d = c0324c2.f4001d;
        if (a2 == 1) {
            return c0325d.f4036d.h;
        }
        if (a2 == 2) {
            return c0325d.f4038e.h;
        }
        if (a2 == 3) {
            return c0325d.f4036d.i;
        }
        if (a2 == 4) {
            return c0325d.f4038e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0325d.f4038e.f4183k;
    }

    public static C0333f i(C0324c c0324c, int i) {
        C0324c c0324c2 = c0324c.f4003f;
        if (c0324c2 == null) {
            return null;
        }
        C0325d c0325d = c0324c2.f4001d;
        AbstractC0342o abstractC0342o = i == 0 ? c0325d.f4036d : c0325d.f4038e;
        int a2 = AbstractC0317e.a(c0324c2.f4002e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0342o.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0342o.i;
        }
        return null;
    }

    public final void c(C0333f c0333f, C0333f c0333f2, int i, C0334g c0334g) {
        c0333f.f4177l.add(c0333f2);
        c0333f.f4177l.add(this.f4195e);
        c0333f.h = i;
        c0333f.i = c0334g;
        c0333f2.f4176k.add(c0333f);
        c0334g.f4176k.add(c0333f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0325d c0325d = this.f4192b;
            int i3 = c0325d.f4063v;
            max = Math.max(c0325d.f4062u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0325d c0325d2 = this.f4192b;
            int i4 = c0325d2.f4066y;
            max = Math.max(c0325d2.f4065x, i);
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
        if (this.f4195e.f4175j) {
            return r0.f4174g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f4191a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0324c c0324c, C0324c c0324c2, int i) {
        C0333f h = h(c0324c);
        C0333f h2 = h(c0324c2);
        if (h.f4175j && h2.f4175j) {
            int e2 = c0324c.e() + h.f4174g;
            int e3 = h2.f4174g - c0324c2.e();
            int i2 = e3 - e2;
            C0334g c0334g = this.f4195e;
            if (!c0334g.f4175j && this.f4194d == 3) {
                int i3 = this.f4191a;
                if (i3 == 0) {
                    c0334g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0334g.d(Math.min(g(c0334g.f4178m, i), i2));
                } else if (i3 == 2) {
                    C0325d c0325d = this.f4192b;
                    C0325d c0325d2 = c0325d.f4023T;
                    if (c0325d2 != null) {
                        if ((i == 0 ? c0325d2.f4036d : c0325d2.f4038e).f4195e.f4175j) {
                            c0334g.d(g((int) ((r6.f4174g * (i == 0 ? c0325d.f4064w : c0325d.f4067z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0325d c0325d3 = this.f4192b;
                    AbstractC0342o abstractC0342o = c0325d3.f4036d;
                    if (abstractC0342o.f4194d == 3 && abstractC0342o.f4191a == 3) {
                        C0340m c0340m = c0325d3.f4038e;
                        if (c0340m.f4194d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0342o = c0325d3.f4038e;
                    }
                    if (abstractC0342o.f4195e.f4175j) {
                        float f2 = c0325d3.f4026W;
                        c0334g.d(i == 1 ? (int) ((r6.f4174g / f2) + 0.5f) : (int) ((f2 * r6.f4174g) + 0.5f));
                    }
                }
            }
            if (c0334g.f4175j) {
                int i4 = c0334g.f4174g;
                C0333f c0333f = this.i;
                C0333f c0333f2 = this.h;
                if (i4 == i2) {
                    c0333f2.d(e2);
                    c0333f.d(e3);
                    return;
                }
                C0325d c0325d4 = this.f4192b;
                float f3 = i == 0 ? c0325d4.f4037d0 : c0325d4.f4039e0;
                if (h == h2) {
                    e2 = h.f4174g;
                    e3 = h2.f4174g;
                    f3 = 0.5f;
                }
                c0333f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0333f.d(c0333f2.f4174g + c0334g.f4174g);
            }
        }
    }
}
