package x;

import u.AbstractC5088e;
import w.C5143c;
import w.C5144d;

/* renamed from: x.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5199p implements InterfaceC5187d {

    /* renamed from: a, reason: collision with root package name */
    public int f41757a;

    /* renamed from: b, reason: collision with root package name */
    public C5144d f41758b;

    /* renamed from: c, reason: collision with root package name */
    public C5195l f41759c;

    /* renamed from: d, reason: collision with root package name */
    public int f41760d;

    /* renamed from: e, reason: collision with root package name */
    public final C5190g f41761e = new C5190g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f41762f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41763g = false;

    /* renamed from: h, reason: collision with root package name */
    public final C5189f f41764h = new C5189f(this);
    public final C5189f i = new C5189f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f41765j = 1;

    public AbstractC5199p(C5144d c5144d) {
        this.f41758b = c5144d;
    }

    public static void b(C5189f c5189f, C5189f c5189f2, int i) {
        c5189f.f41743l.add(c5189f2);
        c5189f.f41738f = i;
        c5189f2.f41742k.add(c5189f);
    }

    public static C5189f h(C5143c c5143c) {
        C5143c c5143c2 = c5143c.f41411f;
        if (c5143c2 == null) {
            return null;
        }
        int d2 = AbstractC5088e.d(c5143c2.f41410e);
        C5144d c5144d = c5143c2.f41409d;
        if (d2 == 1) {
            return c5144d.f41444d.f41764h;
        }
        if (d2 == 2) {
            return c5144d.f41446e.f41764h;
        }
        if (d2 == 3) {
            return c5144d.f41444d.i;
        }
        if (d2 == 4) {
            return c5144d.f41446e.i;
        }
        if (d2 != 5) {
            return null;
        }
        return c5144d.f41446e.f41749k;
    }

    public static C5189f i(C5143c c5143c, int i) {
        C5143c c5143c2 = c5143c.f41411f;
        if (c5143c2 == null) {
            return null;
        }
        C5144d c5144d = c5143c2.f41409d;
        AbstractC5199p abstractC5199p = i == 0 ? c5144d.f41444d : c5144d.f41446e;
        int d2 = AbstractC5088e.d(c5143c2.f41410e);
        if (d2 == 1 || d2 == 2) {
            return abstractC5199p.f41764h;
        }
        if (d2 == 3 || d2 == 4) {
            return abstractC5199p.i;
        }
        return null;
    }

    public final void c(C5189f c5189f, C5189f c5189f2, int i, C5190g c5190g) {
        c5189f.f41743l.add(c5189f2);
        c5189f.f41743l.add(this.f41761e);
        c5189f.f41740h = i;
        c5189f.i = c5190g;
        c5189f2.f41742k.add(c5189f);
        c5190g.f41742k.add(c5189f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i4) {
        if (i4 == 0) {
            C5144d c5144d = this.f41758b;
            int i9 = c5144d.f41473v;
            int max = Math.max(c5144d.f41472u, i);
            if (i9 > 0) {
                max = Math.min(i9, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            C5144d c5144d2 = this.f41758b;
            int i10 = c5144d2.f41476y;
            int max2 = Math.max(c5144d2.f41475x, i);
            if (i10 > 0) {
                max2 = Math.min(i10, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.f41761e.f41741j) {
            return r0.f41739g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f41757a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C5143c c5143c, C5143c c5143c2, int i) {
        C5189f h9 = h(c5143c);
        C5189f h10 = h(c5143c2);
        if (h9.f41741j && h10.f41741j) {
            int e6 = c5143c.e() + h9.f41739g;
            int e9 = h10.f41739g - c5143c2.e();
            int i4 = e9 - e6;
            C5190g c5190g = this.f41761e;
            if (!c5190g.f41741j && this.f41760d == 3) {
                int i9 = this.f41757a;
                if (i9 == 0) {
                    c5190g.d(g(i4, i));
                } else if (i9 == 1) {
                    c5190g.d(Math.min(g(c5190g.f41744m, i), i4));
                } else if (i9 == 2) {
                    C5144d c5144d = this.f41758b;
                    C5144d c5144d2 = c5144d.f41432T;
                    if (c5144d2 != null) {
                        if ((i == 0 ? c5144d2.f41444d : c5144d2.f41446e).f41761e.f41741j) {
                            c5190g.d(g((int) ((r6.f41739g * (i == 0 ? c5144d.f41474w : c5144d.f41477z)) + 0.5f), i));
                        }
                    }
                } else if (i9 == 3) {
                    C5144d c5144d3 = this.f41758b;
                    AbstractC5199p abstractC5199p = c5144d3.f41444d;
                    if (abstractC5199p.f41760d == 3 && abstractC5199p.f41757a == 3) {
                        C5196m c5196m = c5144d3.f41446e;
                        if (c5196m.f41760d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC5199p = c5144d3.f41446e;
                    }
                    if (abstractC5199p.f41761e.f41741j) {
                        float f6 = c5144d3.f41435W;
                        c5190g.d(i == 1 ? (int) ((r6.f41739g / f6) + 0.5f) : (int) ((f6 * r6.f41739g) + 0.5f));
                    }
                }
            }
            if (c5190g.f41741j) {
                int i10 = c5190g.f41739g;
                C5189f c5189f = this.i;
                C5189f c5189f2 = this.f41764h;
                if (i10 == i4) {
                    c5189f2.d(e6);
                    c5189f.d(e9);
                    return;
                }
                float f9 = i == 0 ? this.f41758b.f41445d0 : this.f41758b.f41447e0;
                if (h9 == h10) {
                    e6 = h9.f41739g;
                    e9 = h10.f41739g;
                    f9 = 0.5f;
                }
                c5189f2.d((int) ((((e9 - e6) - i10) * f9) + e6 + 0.5f));
                c5189f.d(c5189f2.f41739g + c5190g.f41739g);
            }
        }
    }
}
