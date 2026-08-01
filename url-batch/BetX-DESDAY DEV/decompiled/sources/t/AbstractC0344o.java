package t;

import q.AbstractC0319e;
import s.C0326c;
import s.C0327d;

/* renamed from: t.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0344o implements InterfaceC0333d {

    /* renamed from: a, reason: collision with root package name */
    public int f4195a;

    /* renamed from: b, reason: collision with root package name */
    public C0327d f4196b;

    /* renamed from: c, reason: collision with root package name */
    public C0341l f4197c;

    /* renamed from: d, reason: collision with root package name */
    public int f4198d;

    /* renamed from: e, reason: collision with root package name */
    public final C0336g f4199e = new C0336g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f4200f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4201g = false;
    public final C0335f h = new C0335f(this);
    public final C0335f i = new C0335f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f4202j = 1;

    public AbstractC0344o(C0327d c0327d) {
        this.f4196b = c0327d;
    }

    public static void b(C0335f c0335f, C0335f c0335f2, int i) {
        c0335f.f4181l.add(c0335f2);
        c0335f.f4177f = i;
        c0335f2.f4180k.add(c0335f);
    }

    public static C0335f h(C0326c c0326c) {
        C0326c c0326c2 = c0326c.f4007f;
        if (c0326c2 == null) {
            return null;
        }
        int a2 = AbstractC0319e.a(c0326c2.f4006e);
        C0327d c0327d = c0326c2.f4005d;
        if (a2 == 1) {
            return c0327d.f4040d.h;
        }
        if (a2 == 2) {
            return c0327d.f4042e.h;
        }
        if (a2 == 3) {
            return c0327d.f4040d.i;
        }
        if (a2 == 4) {
            return c0327d.f4042e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return c0327d.f4042e.f4187k;
    }

    public static C0335f i(C0326c c0326c, int i) {
        C0326c c0326c2 = c0326c.f4007f;
        if (c0326c2 == null) {
            return null;
        }
        C0327d c0327d = c0326c2.f4005d;
        AbstractC0344o abstractC0344o = i == 0 ? c0327d.f4040d : c0327d.f4042e;
        int a2 = AbstractC0319e.a(c0326c2.f4006e);
        if (a2 == 1 || a2 == 2) {
            return abstractC0344o.h;
        }
        if (a2 == 3 || a2 == 4) {
            return abstractC0344o.i;
        }
        return null;
    }

    public final void c(C0335f c0335f, C0335f c0335f2, int i, C0336g c0336g) {
        c0335f.f4181l.add(c0335f2);
        c0335f.f4181l.add(this.f4199e);
        c0335f.h = i;
        c0335f.i = c0336g;
        c0335f2.f4180k.add(c0335f);
        c0336g.f4180k.add(c0335f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C0327d c0327d = this.f4196b;
            int i3 = c0327d.f4067v;
            max = Math.max(c0327d.f4066u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C0327d c0327d2 = this.f4196b;
            int i4 = c0327d2.f4070y;
            max = Math.max(c0327d2.f4069x, i);
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
        if (this.f4199e.f4179j) {
            return r0.f4178g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f4195a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0326c c0326c, C0326c c0326c2, int i) {
        C0335f h = h(c0326c);
        C0335f h2 = h(c0326c2);
        if (h.f4179j && h2.f4179j) {
            int e2 = c0326c.e() + h.f4178g;
            int e3 = h2.f4178g - c0326c2.e();
            int i2 = e3 - e2;
            C0336g c0336g = this.f4199e;
            if (!c0336g.f4179j && this.f4198d == 3) {
                int i3 = this.f4195a;
                if (i3 == 0) {
                    c0336g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0336g.d(Math.min(g(c0336g.f4182m, i), i2));
                } else if (i3 == 2) {
                    C0327d c0327d = this.f4196b;
                    C0327d c0327d2 = c0327d.f4027T;
                    if (c0327d2 != null) {
                        if ((i == 0 ? c0327d2.f4040d : c0327d2.f4042e).f4199e.f4179j) {
                            c0336g.d(g((int) ((r6.f4178g * (i == 0 ? c0327d.f4068w : c0327d.f4071z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C0327d c0327d3 = this.f4196b;
                    AbstractC0344o abstractC0344o = c0327d3.f4040d;
                    if (abstractC0344o.f4198d == 3 && abstractC0344o.f4195a == 3) {
                        C0342m c0342m = c0327d3.f4042e;
                        if (c0342m.f4198d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC0344o = c0327d3.f4042e;
                    }
                    if (abstractC0344o.f4199e.f4179j) {
                        float f2 = c0327d3.f4030W;
                        c0336g.d(i == 1 ? (int) ((r6.f4178g / f2) + 0.5f) : (int) ((f2 * r6.f4178g) + 0.5f));
                    }
                }
            }
            if (c0336g.f4179j) {
                int i4 = c0336g.f4178g;
                C0335f c0335f = this.i;
                C0335f c0335f2 = this.h;
                if (i4 == i2) {
                    c0335f2.d(e2);
                    c0335f.d(e3);
                    return;
                }
                C0327d c0327d4 = this.f4196b;
                float f3 = i == 0 ? c0327d4.f4041d0 : c0327d4.f4043e0;
                if (h == h2) {
                    e2 = h.f4178g;
                    e3 = h2.f4178g;
                    f3 = 0.5f;
                }
                c0335f2.d((int) ((((e3 - e2) - i4) * f3) + e2 + 0.5f));
                c0335f.d(c0335f2.f4178g + c0336g.f4178g);
            }
        }
    }
}
