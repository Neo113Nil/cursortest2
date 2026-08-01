package t;

import q.AbstractC0291e;
import s.C0298c;
import s.C0299d;

/* renamed from: t.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0316o implements InterfaceC0305d {

    /* renamed from: a, reason: collision with root package name */
    public int f3778a;

    /* renamed from: b, reason: collision with root package name */
    public C0299d f3779b;

    /* renamed from: c, reason: collision with root package name */
    public C0313l f3780c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0308g f3781e = new C0308g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3782f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3783g = false;
    public final C0307f h = new C0307f(this);
    public final C0307f i = new C0307f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3784j = 1;

    public AbstractC0316o(C0299d c0299d) {
        this.f3779b = c0299d;
    }

    public static void b(C0307f c0307f, C0307f c0307f2, int i) {
        c0307f.f3765l.add(c0307f2);
        c0307f.f3761f = i;
        c0307f2.f3764k.add(c0307f);
    }

    public static C0307f h(C0298c c0298c) {
        C0298c c0298c2 = c0298c.f3595f;
        if (c0298c2 == null) {
            return null;
        }
        int a2 = AbstractC0291e.a(c0298c2.f3594e);
        C0299d c0299d = c0298c2.d;
        if (a2 == 1) {
            return c0299d.d.h;
        }
        if (a2 == 2) {
            return c0299d.f3629e.h;
        }
        if (a2 == 3) {
            return c0299d.d.i;
        }
        if (a2 == 4) {
            return c0299d.f3629e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0299d.f3629e.f3771k;
    }

    public static C0307f i(C0298c c0298c, int i) {
        C0298c c0298c2 = c0298c.f3595f;
        if (c0298c2 == null) {
            return null;
        }
        C0299d c0299d = c0298c2.d;
        AbstractC0316o abstractC0316o = i == 0 ? c0299d.d : c0299d.f3629e;
        int a2 = AbstractC0291e.a(c0298c2.f3594e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0316o.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0316o.i;
        }
        return null;
    }

    public final void c(C0307f c0307f, C0307f c0307f2, int i, C0308g c0308g) {
        c0307f.f3765l.add(c0307f2);
        c0307f.f3765l.add(this.f3781e);
        c0307f.h = i;
        c0307f.i = c0308g;
        c0307f2.f3764k.add(c0307f);
        c0308g.f3764k.add(c0307f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0299d c0299d = this.f3779b;
            int i3 = c0299d.f3655v;
            max = Math.max(c0299d.f3654u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0299d c0299d2 = this.f3779b;
            int i4 = c0299d2.f3658y;
            max = Math.max(c0299d2.f3657x, i);
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
        if (this.f3781e.f3763j) {
            return r0.f3762g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3778a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0298c c0298c, C0298c c0298c2, int i) {
        C0307f h = h(c0298c);
        C0307f h2 = h(c0298c2);
        if (h.f3763j && h2.f3763j) {
            int e2 = c0298c.e() + h.f3762g;
            int e3 = h2.f3762g - c0298c2.e();
            int i2 = e3 - e2;
            C0308g c0308g = this.f3781e;
            if (!c0308g.f3763j && this.d == 3) {
                int i3 = this.f3778a;
                if (i3 == 0) {
                    c0308g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0308g.d(Math.min(g(c0308g.f3766m, i), i2));
                } else if (i3 == 2) {
                    C0299d c0299d = this.f3779b;
                    C0299d c0299d2 = c0299d.f3615T;
                    if (c0299d2 != null) {
                        if ((i == 0 ? c0299d2.d : c0299d2.f3629e).f3781e.f3763j) {
                            c0308g.d(g((int) ((r6.f3762g * (i == 0 ? c0299d.f3656w : c0299d.f3659z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0299d c0299d3 = this.f3779b;
                    AbstractC0316o abstractC0316o = c0299d3.d;
                    if (abstractC0316o.d == 3 && abstractC0316o.f3778a == 3) {
                        C0314m c0314m = c0299d3.f3629e;
                        if (c0314m.d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0316o = c0299d3.f3629e;
                    }
                    if (abstractC0316o.f3781e.f3763j) {
                        float f2 = c0299d3.f3618W;
                        c0308g.d(i == 1 ? (int) ((r6.f3762g / f2) + 0.5f) : (int) ((f2 * r6.f3762g) + 0.5f));
                    }
                }
            }
            if (c0308g.f3763j) {
                int i4 = c0308g.f3762g;
                C0307f c0307f = this.i;
                C0307f c0307f2 = this.h;
                if (i4 == i2) {
                    c0307f2.d(e2);
                    c0307f.d(e3);
                    return;
                }
                C0299d c0299d4 = this.f3779b;
                float f3 = i == 0 ? c0299d4.f3628d0 : c0299d4.f3630e0;
                if (h == h2) {
                    e2 = h.f3762g;
                    e3 = h2.f3762g;
                    f3 = 0.5f;
                }
                c0307f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0307f.d(c0307f2.f3762g + c0308g.f3762g);
            }
        }
    }
}
