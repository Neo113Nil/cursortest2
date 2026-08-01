package v;

import s.AbstractC0380e;
import u.C0386c;
import u.C0387d;

/* renamed from: v.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0406o implements InterfaceC0395d {

    /* renamed from: a, reason: collision with root package name */
    public int f4436a;

    /* renamed from: b, reason: collision with root package name */
    public C0387d f4437b;

    /* renamed from: c, reason: collision with root package name */
    public C0403l f4438c;

    /* renamed from: d, reason: collision with root package name */
    public int f4439d;
    public final C0398g e = new C0398g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f4440f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4441g = false;

    /* renamed from: h, reason: collision with root package name */
    public final C0397f f4442h = new C0397f(this);
    public final C0397f i = new C0397f(this);
    public int j = 1;

    public AbstractC0406o(C0387d c0387d) {
        this.f4437b = c0387d;
    }

    public static void b(C0397f c0397f, C0397f c0397f2, int i) {
        c0397f.f4423l.add(c0397f2);
        c0397f.f4419f = i;
        c0397f2.f4422k.add(c0397f);
    }

    public static C0397f h(C0386c c0386c) {
        C0386c c0386c2 = c0386c.f4226f;
        if (c0386c2 == null) {
            return null;
        }
        int a2 = AbstractC0380e.a(c0386c2.e);
        C0387d c0387d = c0386c2.f4225d;
        if (a2 == 1) {
            return c0387d.f4260d.f4442h;
        }
        if (a2 == 2) {
            return c0387d.e.f4442h;
        }
        if (a2 == 3) {
            return c0387d.f4260d.i;
        }
        if (a2 == 4) {
            return c0387d.e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0387d.e.f4429k;
    }

    public static C0397f i(C0386c c0386c, int i) {
        C0386c c0386c2 = c0386c.f4226f;
        if (c0386c2 == null) {
            return null;
        }
        C0387d c0387d = c0386c2.f4225d;
        AbstractC0406o abstractC0406o = i == 0 ? c0387d.f4260d : c0387d.e;
        int a2 = AbstractC0380e.a(c0386c2.e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0406o.f4442h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0406o.i;
        }
        return null;
    }

    public final void c(C0397f c0397f, C0397f c0397f2, int i, C0398g c0398g) {
        c0397f.f4423l.add(c0397f2);
        c0397f.f4423l.add(this.e);
        c0397f.f4421h = i;
        c0397f.i = c0398g;
        c0397f2.f4422k.add(c0397f);
        c0398g.f4422k.add(c0397f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0387d c0387d = this.f4437b;
            int i3 = c0387d.f4287v;
            max = Math.max(c0387d.f4286u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0387d c0387d2 = this.f4437b;
            int i4 = c0387d2.f4290y;
            max = Math.max(c0387d2.f4289x, i);
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
        if (this.e.j) {
            return r0.f4420g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f4436a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0386c c0386c, C0386c c0386c2, int i) {
        C0397f h2 = h(c0386c);
        C0397f h3 = h(c0386c2);
        if (h2.j && h3.j) {
            int e = c0386c.e() + h2.f4420g;
            int e2 = h3.f4420g - c0386c2.e();
            int i2 = e2 - e;
            C0398g c0398g = this.e;
            if (!c0398g.j && this.f4439d == 3) {
                int i3 = this.f4436a;
                if (i3 == 0) {
                    c0398g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0398g.d(Math.min(g(c0398g.f4424m, i), i2));
                } else if (i3 == 2) {
                    C0387d c0387d = this.f4437b;
                    C0387d c0387d2 = c0387d.f4247T;
                    if (c0387d2 != null) {
                        if ((i == 0 ? c0387d2.f4260d : c0387d2.e).e.j) {
                            c0398g.d(g((int) ((r6.f4420g * (i == 0 ? c0387d.f4288w : c0387d.f4291z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0387d c0387d3 = this.f4437b;
                    AbstractC0406o abstractC0406o = c0387d3.f4260d;
                    if (abstractC0406o.f4439d == 3 && abstractC0406o.f4436a == 3) {
                        C0404m c0404m = c0387d3.e;
                        if (c0404m.f4439d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0406o = c0387d3.e;
                    }
                    if (abstractC0406o.e.j) {
                        float f2 = c0387d3.f4250W;
                        c0398g.d(i == 1 ? (int) ((r6.f4420g / f2) + 0.5f) : (int) ((f2 * r6.f4420g) + 0.5f));
                    }
                }
            }
            if (c0398g.j) {
                int i4 = c0398g.f4420g;
                C0397f c0397f = this.i;
                C0397f c0397f2 = this.f4442h;
                if (i4 == i2) {
                    c0397f2.d(e);
                    c0397f.d(e2);
                    return;
                }
                C0387d c0387d4 = this.f4437b;
                float f3 = i == 0 ? c0387d4.f4261d0 : c0387d4.f4262e0;
                if (h2 == h3) {
                    e = h2.f4420g;
                    e2 = h3.f4420g;
                    f3 = 0.5f;
                }
                c0397f2.d((int) ((((e2 - e) - i4) * f3) + e + 0.5f));
                c0397f.d(c0397f2.f4420g + c0398g.f4420g);
            }
        }
    }
}
