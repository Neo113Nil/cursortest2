package t;

import q.AbstractC0317e;
import s.C0339c;
import s.C0340d;

/* renamed from: t.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0358p implements InterfaceC0346d {

    /* renamed from: a, reason: collision with root package name */
    public int f3711a;

    /* renamed from: b, reason: collision with root package name */
    public C0340d f3712b;

    /* renamed from: c, reason: collision with root package name */
    public C0354l f3713c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0349g f3714e = new C0349g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3715f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3716g = false;
    public final C0348f h = new C0348f(this);
    public final C0348f i = new C0348f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3717j = 1;

    public AbstractC0358p(C0340d c0340d) {
        this.f3712b = c0340d;
    }

    public static void b(C0348f c0348f, C0348f c0348f2, int i) {
        c0348f.f3698l.add(c0348f2);
        c0348f.f3694f = i;
        c0348f2.f3697k.add(c0348f);
    }

    public static C0348f h(C0339c c0339c) {
        C0339c c0339c2 = c0339c.f3495f;
        if (c0339c2 == null) {
            return null;
        }
        int a2 = AbstractC0317e.a(c0339c2.f3494e);
        C0340d c0340d = c0339c2.d;
        if (a2 == 1) {
            return c0340d.d.h;
        }
        if (a2 == 2) {
            return c0340d.f3529e.h;
        }
        if (a2 == 3) {
            return c0340d.d.i;
        }
        if (a2 == 4) {
            return c0340d.f3529e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0340d.f3529e.f3704k;
    }

    public static C0348f i(C0339c c0339c, int i) {
        C0339c c0339c2 = c0339c.f3495f;
        if (c0339c2 == null) {
            return null;
        }
        C0340d c0340d = c0339c2.d;
        AbstractC0358p abstractC0358p = i == 0 ? c0340d.d : c0340d.f3529e;
        int a2 = AbstractC0317e.a(c0339c2.f3494e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0358p.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0358p.i;
        }
        return null;
    }

    public final void c(C0348f c0348f, C0348f c0348f2, int i, C0349g c0349g) {
        c0348f.f3698l.add(c0348f2);
        c0348f.f3698l.add(this.f3714e);
        c0348f.h = i;
        c0348f.i = c0349g;
        c0348f2.f3697k.add(c0348f);
        c0349g.f3697k.add(c0348f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0340d c0340d = this.f3712b;
            int i3 = c0340d.f3555v;
            max = Math.max(c0340d.f3554u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0340d c0340d2 = this.f3712b;
            int i4 = c0340d2.f3558y;
            max = Math.max(c0340d2.f3557x, i);
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
        if (this.f3714e.f3696j) {
            return r0.f3695g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3711a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0339c c0339c, C0339c c0339c2, int i) {
        C0348f h = h(c0339c);
        C0348f h2 = h(c0339c2);
        if (h.f3696j && h2.f3696j) {
            int e2 = c0339c.e() + h.f3695g;
            int e3 = h2.f3695g - c0339c2.e();
            int i2 = e3 - e2;
            C0349g c0349g = this.f3714e;
            if (!c0349g.f3696j && this.d == 3) {
                int i3 = this.f3711a;
                if (i3 == 0) {
                    c0349g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0349g.d(Math.min(g(c0349g.f3699m, i), i2));
                } else if (i3 == 2) {
                    C0340d c0340d = this.f3712b;
                    C0340d c0340d2 = c0340d.f3515T;
                    if (c0340d2 != null) {
                        if ((i == 0 ? c0340d2.d : c0340d2.f3529e).f3714e.f3696j) {
                            c0349g.d(g((int) ((r6.f3695g * (i == 0 ? c0340d.f3556w : c0340d.f3559z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0340d c0340d3 = this.f3712b;
                    AbstractC0358p abstractC0358p = c0340d3.d;
                    if (abstractC0358p.d == 3 && abstractC0358p.f3711a == 3) {
                        C0355m c0355m = c0340d3.f3529e;
                        if (c0355m.d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0358p = c0340d3.f3529e;
                    }
                    if (abstractC0358p.f3714e.f3696j) {
                        float f2 = c0340d3.f3518W;
                        c0349g.d(i == 1 ? (int) ((r6.f3695g / f2) + 0.5f) : (int) ((f2 * r6.f3695g) + 0.5f));
                    }
                }
            }
            if (c0349g.f3696j) {
                int i4 = c0349g.f3695g;
                C0348f c0348f = this.i;
                C0348f c0348f2 = this.h;
                if (i4 == i2) {
                    c0348f2.d(e2);
                    c0348f.d(e3);
                    return;
                }
                C0340d c0340d4 = this.f3712b;
                float f3 = i == 0 ? c0340d4.f3528d0 : c0340d4.f3530e0;
                if (h == h2) {
                    e2 = h.f3695g;
                    e3 = h2.f3695g;
                    f3 = 0.5f;
                }
                c0348f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0348f.d(c0348f2.f3695g + c0349g.f3695g);
            }
        }
    }
}
