package t;

import q.AbstractC0285e;
import s.C0294c;
import s.C0295d;

/* renamed from: t.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0312o implements InterfaceC0301d {

    /* renamed from: a, reason: collision with root package name */
    public int f3863a;

    /* renamed from: b, reason: collision with root package name */
    public C0295d f3864b;

    /* renamed from: c, reason: collision with root package name */
    public C0309l f3865c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0304g f3866e = new C0304g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3867f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3868g = false;
    public final C0303f h = new C0303f(this);
    public final C0303f i = new C0303f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3869j = 1;

    public AbstractC0312o(C0295d c0295d) {
        this.f3864b = c0295d;
    }

    public static void b(C0303f c0303f, C0303f c0303f2, int i) {
        c0303f.f3850l.add(c0303f2);
        c0303f.f3846f = i;
        c0303f2.f3849k.add(c0303f);
    }

    public static C0303f h(C0294c c0294c) {
        C0294c c0294c2 = c0294c.f3661f;
        if (c0294c2 == null) {
            return null;
        }
        int a2 = AbstractC0285e.a(c0294c2.f3660e);
        C0295d c0295d = c0294c2.d;
        if (a2 == 1) {
            return c0295d.d.h;
        }
        if (a2 == 2) {
            return c0295d.f3695e.h;
        }
        if (a2 == 3) {
            return c0295d.d.i;
        }
        if (a2 == 4) {
            return c0295d.f3695e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0295d.f3695e.f3856k;
    }

    public static C0303f i(C0294c c0294c, int i) {
        C0294c c0294c2 = c0294c.f3661f;
        if (c0294c2 == null) {
            return null;
        }
        C0295d c0295d = c0294c2.d;
        AbstractC0312o abstractC0312o = i == 0 ? c0295d.d : c0295d.f3695e;
        int a2 = AbstractC0285e.a(c0294c2.f3660e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0312o.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0312o.i;
        }
        return null;
    }

    public final void c(C0303f c0303f, C0303f c0303f2, int i, C0304g c0304g) {
        c0303f.f3850l.add(c0303f2);
        c0303f.f3850l.add(this.f3866e);
        c0303f.h = i;
        c0303f.i = c0304g;
        c0303f2.f3849k.add(c0303f);
        c0304g.f3849k.add(c0303f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0295d c0295d = this.f3864b;
            int i3 = c0295d.f3720v;
            max = Math.max(c0295d.f3719u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0295d c0295d2 = this.f3864b;
            int i4 = c0295d2.f3723y;
            max = Math.max(c0295d2.f3722x, i);
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
        if (this.f3866e.f3848j) {
            return r0.f3847g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f3863a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0294c c0294c, C0294c c0294c2, int i) {
        C0303f h = h(c0294c);
        C0303f h2 = h(c0294c2);
        if (h.f3848j && h2.f3848j) {
            int e2 = c0294c.e() + h.f3847g;
            int e3 = h2.f3847g - c0294c2.e();
            int i2 = e3 - e2;
            C0304g c0304g = this.f3866e;
            if (!c0304g.f3848j && this.d == 3) {
                int i3 = this.f3863a;
                if (i3 == 0) {
                    c0304g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0304g.d(Math.min(g(c0304g.f3851m, i), i2));
                } else if (i3 == 2) {
                    C0295d c0295d = this.f3864b;
                    C0295d c0295d2 = c0295d.f3681T;
                    if (c0295d2 != null) {
                        if ((i == 0 ? c0295d2.d : c0295d2.f3695e).f3866e.f3848j) {
                            c0304g.d(g((int) ((r6.f3847g * (i == 0 ? c0295d.f3721w : c0295d.f3724z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0295d c0295d3 = this.f3864b;
                    AbstractC0312o abstractC0312o = c0295d3.d;
                    if (abstractC0312o.d == 3 && abstractC0312o.f3863a == 3) {
                        C0310m c0310m = c0295d3.f3695e;
                        if (c0310m.d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0312o = c0295d3.f3695e;
                    }
                    if (abstractC0312o.f3866e.f3848j) {
                        float f2 = c0295d3.f3684W;
                        c0304g.d(i == 1 ? (int) ((r6.f3847g / f2) + 0.5f) : (int) ((f2 * r6.f3847g) + 0.5f));
                    }
                }
            }
            if (c0304g.f3848j) {
                int i4 = c0304g.f3847g;
                C0303f c0303f = this.i;
                C0303f c0303f2 = this.h;
                if (i4 == i2) {
                    c0303f2.d(e2);
                    c0303f.d(e3);
                    return;
                }
                C0295d c0295d4 = this.f3864b;
                float f3 = i == 0 ? c0295d4.f3694d0 : c0295d4.f3696e0;
                if (h == h2) {
                    e2 = h.f3847g;
                    e3 = h2.f3847g;
                    f3 = 0.5f;
                }
                c0303f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0303f.d(c0303f2.f3847g + c0304g.f3847g);
            }
        }
    }
}
