package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0294c;
import s.C0295d;
import s.C0296e;
import v.C0321f;

/* renamed from: t.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0305h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0299b f3852a = new C0299b();

    public static boolean a(C0295d c0295d) {
        int[] iArr = c0295d.f3714p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0295d c0295d2 = c0295d.f3681T;
        C0296e c0296e = c0295d2 != null ? (C0296e) c0295d2 : null;
        if (c0296e != null) {
            int i3 = c0296e.f3714p0[0];
        }
        if (c0296e != null) {
            int i4 = c0296e.f3714p0[1];
        }
        boolean z2 = i == 1 || c0295d.A() || i == 2 || (i == 3 && c0295d.f3716r == 0 && c0295d.f3684W == 0.0f && c0295d.t(0)) || (i == 3 && c0295d.f3716r == 1 && c0295d.u(0, c0295d.q()));
        boolean z3 = i2 == 1 || c0295d.B() || i2 == 2 || (i2 == 3 && c0295d.f3717s == 0 && c0295d.f3684W == 0.0f && c0295d.t(1)) || (i2 == 3 && c0295d.f3717s == 1 && c0295d.u(1, c0295d.k()));
        if (c0295d.f3684W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static C0311n b(C0295d c0295d, int i, ArrayList arrayList, C0311n c0311n) {
        int i2;
        int i3 = i == 0 ? c0295d.n0 : c0295d.f3712o0;
        if (i3 != -1 && (c0311n == null || i3 != c0311n.f3860b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0311n c0311n2 = (C0311n) arrayList.get(i4);
                if (c0311n2.f3860b == i3) {
                    if (c0311n != null) {
                        c0311n.c(i, c0311n2);
                        arrayList.remove(c0311n);
                    }
                    c0311n = c0311n2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c0311n;
        }
        if (c0311n == null) {
            if (c0295d instanceof s.i) {
                s.i iVar = (s.i) c0295d;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.f3799r0) {
                        i2 = -1;
                        break;
                    }
                    C0295d c0295d2 = iVar.f3798q0[i5];
                    if ((i == 0 && (i2 = c0295d2.n0) != -1) || (i == 1 && (i2 = c0295d2.f3712o0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        C0311n c0311n3 = (C0311n) arrayList.get(i6);
                        if (c0311n3.f3860b == i2) {
                            c0311n = c0311n3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c0311n == null) {
                c0311n = new C0311n();
                c0311n.f3859a = new ArrayList();
                c0311n.d = null;
                c0311n.f3862e = -1;
                int i7 = C0311n.f3858f;
                C0311n.f3858f = i7 + 1;
                c0311n.f3860b = i7;
                c0311n.f3861c = i;
            }
            arrayList.add(c0311n);
        }
        ArrayList arrayList2 = c0311n.f3859a;
        if (!arrayList2.contains(c0295d)) {
            arrayList2.add(c0295d);
            if (c0295d instanceof s.h) {
                s.h hVar = (s.h) c0295d;
                hVar.f3795t0.c(hVar.f3796u0 == 0 ? 1 : 0, arrayList, c0311n);
            }
            int i8 = c0311n.f3860b;
            if (i == 0) {
                c0295d.n0 = i8;
                c0295d.f3670I.c(i, arrayList, c0311n);
                c0295d.f3672K.c(i, arrayList, c0311n);
            } else {
                c0295d.f3712o0 = i8;
                c0295d.f3671J.c(i, arrayList, c0311n);
                c0295d.f3674M.c(i, arrayList, c0311n);
                c0295d.f3673L.c(i, arrayList, c0311n);
            }
            c0295d.f3677P.c(i, arrayList, c0311n);
        }
        return c0311n;
    }

    public static void c(int i, C0295d c0295d, C0321f c0321f, boolean z2) {
        C0294c c0294c;
        C0294c c0294c2;
        C0294c c0294c3;
        C0294c c0294c4;
        if (c0295d.f3708m) {
            return;
        }
        if (!(c0295d instanceof C0296e) && c0295d.z() && a(c0295d)) {
            C0296e.V(c0295d, c0321f, new C0299b());
        }
        C0294c i2 = c0295d.i(2);
        C0294c i3 = c0295d.i(4);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3657a;
        char c2 = 0;
        if (hashSet != null && i2.f3659c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0294c c0294c5 = (C0294c) it.next();
                C0295d c0295d2 = c0294c5.d;
                int i4 = i + 1;
                boolean a2 = a(c0295d2);
                if (c0295d2.z() && a2) {
                    C0296e.V(c0295d2, c0321f, new C0299b());
                }
                C0294c c0294c6 = c0295d2.f3670I;
                C0294c c0294c7 = c0295d2.f3672K;
                char c3 = ((c0294c5 == c0294c6 && (c0294c4 = c0294c7.f3661f) != null && c0294c4.f3659c) || (c0294c5 == c0294c7 && (c0294c3 = c0294c6.f3661f) != null && c0294c3.f3659c)) ? (char) 1 : c2;
                int i5 = c0295d2.f3714p0[c2];
                if (i5 != 3 || a2) {
                    if (!c0295d2.z()) {
                        if (c0294c5 == c0294c6 && c0294c7.f3661f == null) {
                            int e2 = c0294c6.e() + d;
                            c0295d2.J(e2, c0295d2.q() + e2);
                            c(i4, c0295d2, c0321f, z2);
                        } else if (c0294c5 == c0294c7 && c0294c6.f3661f == null) {
                            int e3 = d - c0294c7.e();
                            c0295d2.J(e3 - c0295d2.q(), e3);
                            c(i4, c0295d2, c0321f, z2);
                        } else if (c3 != 0 && !c0295d2.x()) {
                            d(i4, c0295d2, c0321f, z2);
                        }
                    }
                } else if (i5 == 3 && c0295d2.f3720v >= 0 && c0295d2.f3719u >= 0 && ((c0295d2.f3700g0 == 8 || (c0295d2.f3716r == 0 && c0295d2.f3684W == 0.0f)) && !c0295d2.x() && !c0295d2.F && c3 != 0 && !c0295d2.x())) {
                    e(i4, c0295d, c0321f, c0295d2, z2);
                }
                c2 = 0;
            }
        }
        if (c0295d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3657a;
        if (hashSet2 != null && i3.f3659c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0294c c0294c8 = (C0294c) it2.next();
                C0295d c0295d3 = c0294c8.d;
                int i6 = i + 1;
                boolean a3 = a(c0295d3);
                if (c0295d3.z() && a3) {
                    C0296e.V(c0295d3, c0321f, new C0299b());
                }
                C0294c c0294c9 = c0295d3.f3670I;
                C0294c c0294c10 = c0295d3.f3672K;
                boolean z3 = (c0294c8 == c0294c9 && (c0294c2 = c0294c10.f3661f) != null && c0294c2.f3659c) || (c0294c8 == c0294c10 && (c0294c = c0294c9.f3661f) != null && c0294c.f3659c);
                int i7 = c0295d3.f3714p0[0];
                if (i7 != 3 || a3) {
                    if (!c0295d3.z()) {
                        if (c0294c8 == c0294c9 && c0294c10.f3661f == null) {
                            int e4 = c0294c9.e() + d2;
                            c0295d3.J(e4, c0295d3.q() + e4);
                            c(i6, c0295d3, c0321f, z2);
                        } else if (c0294c8 == c0294c10 && c0294c9.f3661f == null) {
                            int e5 = d2 - c0294c10.e();
                            c0295d3.J(e5 - c0295d3.q(), e5);
                            c(i6, c0295d3, c0321f, z2);
                        } else if (z3 && !c0295d3.x()) {
                            d(i6, c0295d3, c0321f, z2);
                        }
                    }
                } else if (i7 == 3 && c0295d3.f3720v >= 0 && c0295d3.f3719u >= 0) {
                    if (c0295d3.f3700g0 != 8) {
                        if (c0295d3.f3716r == 0) {
                            if (c0295d3.f3684W == 0.0f) {
                            }
                        }
                    }
                    if (!c0295d3.x() && !c0295d3.F && z3 && !c0295d3.x()) {
                        e(i6, c0295d, c0321f, c0295d3, z2);
                    }
                }
            }
        }
        c0295d.f3708m = true;
    }

    public static void d(int i, C0295d c0295d, C0321f c0321f, boolean z2) {
        float f2 = c0295d.f3694d0;
        C0294c c0294c = c0295d.f3670I;
        int d = c0294c.f3661f.d();
        C0294c c0294c2 = c0295d.f3672K;
        int d2 = c0294c2.f3661f.d();
        int e2 = c0294c.e() + d;
        int e3 = d2 - c0294c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int q2 = c0295d.q();
        int i2 = (d2 - d) - q2;
        if (d > d2) {
            i2 = (d - d2) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d;
        int i4 = i3 + q2;
        if (d > d2) {
            i4 = i3 - q2;
        }
        c0295d.J(i3, i4);
        c(i + 1, c0295d, c0321f, z2);
    }

    public static void e(int i, C0295d c0295d, C0321f c0321f, C0295d c0295d2, boolean z2) {
        float f2 = c0295d2.f3694d0;
        C0294c c0294c = c0295d2.f3670I;
        int e2 = c0294c.e() + c0294c.f3661f.d();
        C0294c c0294c2 = c0295d2.f3672K;
        int d = c0294c2.f3661f.d() - c0294c2.e();
        if (d >= e2) {
            int q2 = c0295d2.q();
            if (c0295d2.f3700g0 != 8) {
                int i2 = c0295d2.f3716r;
                if (i2 == 2) {
                    q2 = (int) (c0295d2.f3694d0 * 0.5f * (c0295d instanceof C0296e ? c0295d.q() : c0295d.f3681T.q()));
                } else if (i2 == 0) {
                    q2 = d - e2;
                }
                q2 = Math.max(c0295d2.f3719u, q2);
                int i3 = c0295d2.f3720v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - q2)) + 0.5f));
            c0295d2.J(i4, q2 + i4);
            c(i + 1, c0295d2, c0321f, z2);
        }
    }

    public static void f(int i, C0295d c0295d, C0321f c0321f) {
        float f2 = c0295d.f3696e0;
        C0294c c0294c = c0295d.f3671J;
        int d = c0294c.f3661f.d();
        C0294c c0294c2 = c0295d.f3673L;
        int d2 = c0294c2.f3661f.d();
        int e2 = c0294c.e() + d;
        int e3 = d2 - c0294c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int k2 = c0295d.k();
        int i2 = (d2 - d) - k2;
        if (d > d2) {
            i2 = (d - d2) - k2;
        }
        int i3 = (int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2);
        int i4 = d + i3;
        int i5 = i4 + k2;
        if (d > d2) {
            i4 = d - i3;
            i5 = i4 - k2;
        }
        c0295d.K(i4, i5);
        i(i + 1, c0295d, c0321f);
    }

    public static void g(int i, C0295d c0295d, C0321f c0321f, C0295d c0295d2) {
        float f2 = c0295d2.f3696e0;
        C0294c c0294c = c0295d2.f3671J;
        int e2 = c0294c.e() + c0294c.f3661f.d();
        C0294c c0294c2 = c0295d2.f3673L;
        int d = c0294c2.f3661f.d() - c0294c2.e();
        if (d >= e2) {
            int k2 = c0295d2.k();
            if (c0295d2.f3700g0 != 8) {
                int i2 = c0295d2.f3717s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (c0295d instanceof C0296e ? c0295d.k() : c0295d.f3681T.k()));
                } else if (i2 == 0) {
                    k2 = d - e2;
                }
                k2 = Math.max(c0295d2.f3722x, k2);
                int i3 = c0295d2.f3723y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - k2)) + 0.5f));
            c0295d2.K(i4, k2 + i4);
            i(i + 1, c0295d2, c0321f);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, C0295d c0295d, C0321f c0321f) {
        C0294c c0294c;
        C0294c c0294c2;
        C0294c c0294c3;
        C0294c c0294c4;
        C0294c c0294c5;
        if (c0295d.f3710n) {
            return;
        }
        if (!(c0295d instanceof C0296e) && c0295d.z() && a(c0295d)) {
            C0296e.V(c0295d, c0321f, new C0299b());
        }
        C0294c i2 = c0295d.i(3);
        C0294c i3 = c0295d.i(5);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3657a;
        if (hashSet != null && i2.f3659c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0294c c0294c6 = (C0294c) it.next();
                C0295d c0295d2 = c0294c6.d;
                int i4 = i + 1;
                boolean a2 = a(c0295d2);
                if (c0295d2.z() && a2) {
                    C0296e.V(c0295d2, c0321f, new C0299b());
                }
                C0294c c0294c7 = c0295d2.f3671J;
                C0294c c0294c8 = c0295d2.f3673L;
                boolean z2 = (c0294c6 == c0294c7 && (c0294c5 = c0294c8.f3661f) != null && c0294c5.f3659c) || (c0294c6 == c0294c8 && (c0294c4 = c0294c7.f3661f) != null && c0294c4.f3659c);
                int i5 = c0295d2.f3714p0[1];
                if (i5 != 3 || a2) {
                    if (!c0295d2.z()) {
                        if (c0294c6 == c0294c7 && c0294c8.f3661f == null) {
                            int e2 = c0294c7.e() + d;
                            c0295d2.K(e2, c0295d2.k() + e2);
                            i(i4, c0295d2, c0321f);
                        } else if (c0294c6 == c0294c8 && c0294c7.f3661f == null) {
                            int e3 = d - c0294c8.e();
                            c0295d2.K(e3 - c0295d2.k(), e3);
                            i(i4, c0295d2, c0321f);
                        } else if (z2 && !c0295d2.y()) {
                            f(i4, c0295d2, c0321f);
                        }
                    }
                } else if (i5 == 3 && c0295d2.f3723y >= 0 && c0295d2.f3722x >= 0 && (c0295d2.f3700g0 == 8 || (c0295d2.f3717s == 0 && c0295d2.f3684W == 0.0f))) {
                    if (!c0295d2.y() && !c0295d2.F && z2 && !c0295d2.y()) {
                        g(i4, c0295d, c0321f, c0295d2);
                    }
                }
            }
        }
        if (c0295d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3657a;
        if (hashSet2 != null && i3.f3659c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0294c c0294c9 = (C0294c) it2.next();
                C0295d c0295d3 = c0294c9.d;
                int i6 = i + 1;
                boolean a3 = a(c0295d3);
                if (c0295d3.z() && a3) {
                    C0296e.V(c0295d3, c0321f, new C0299b());
                }
                C0294c c0294c10 = c0295d3.f3671J;
                C0294c c0294c11 = c0295d3.f3673L;
                boolean z3 = (c0294c9 == c0294c10 && (c0294c3 = c0294c11.f3661f) != null && c0294c3.f3659c) || (c0294c9 == c0294c11 && (c0294c2 = c0294c10.f3661f) != null && c0294c2.f3659c);
                int i7 = c0295d3.f3714p0[1];
                if (i7 != 3 || a3) {
                    if (!c0295d3.z()) {
                        if (c0294c9 == c0294c10 && c0294c11.f3661f == null) {
                            int e4 = c0294c10.e() + d2;
                            c0295d3.K(e4, c0295d3.k() + e4);
                            i(i6, c0295d3, c0321f);
                        } else if (c0294c9 == c0294c11 && c0294c10.f3661f == null) {
                            int e5 = d2 - c0294c11.e();
                            c0295d3.K(e5 - c0295d3.k(), e5);
                            i(i6, c0295d3, c0321f);
                        } else if (z3 && !c0295d3.y()) {
                            f(i6, c0295d3, c0321f);
                        }
                    }
                } else if (i7 == 3 && c0295d3.f3723y >= 0 && c0295d3.f3722x >= 0) {
                    if (c0295d3.f3700g0 != 8) {
                        if (c0295d3.f3717s == 0) {
                            if (c0295d3.f3684W == 0.0f) {
                            }
                        }
                    }
                    if (!c0295d3.y() && !c0295d3.F && z3 && !c0295d3.y()) {
                        g(i6, c0295d, c0321f, c0295d3);
                    }
                }
            }
        }
        C0294c i8 = c0295d.i(6);
        if (i8.f3657a != null && i8.f3659c) {
            int d3 = i8.d();
            Iterator it3 = i8.f3657a.iterator();
            while (it3.hasNext()) {
                C0294c c0294c12 = (C0294c) it3.next();
                C0295d c0295d4 = c0294c12.d;
                int i9 = i + 1;
                boolean a4 = a(c0295d4);
                if (c0295d4.z() && a4) {
                    C0296e.V(c0295d4, c0321f, new C0299b());
                }
                if (c0295d4.f3714p0[1] != 3 || a4) {
                    if (!c0295d4.z() && c0294c12 == (c0294c = c0295d4.f3674M)) {
                        int e6 = c0294c12.e() + d3;
                        if (c0295d4.f3667E) {
                            int i10 = e6 - c0295d4.f3689a0;
                            int i11 = c0295d4.f3683V + i10;
                            c0295d4.f3687Z = i10;
                            c0295d4.f3671J.l(i10);
                            c0295d4.f3673L.l(i11);
                            c0294c.l(e6);
                            c0295d4.f3706l = true;
                        }
                        i(i9, c0295d4, c0321f);
                    }
                }
            }
        }
        c0295d.f3710n = true;
    }
}
