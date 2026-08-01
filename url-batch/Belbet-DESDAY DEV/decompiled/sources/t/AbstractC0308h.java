package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0297c;
import s.C0298d;
import s.C0299e;
import v.C0324f;

/* renamed from: t.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0308h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0302b f3784a = new C0302b();

    public static boolean a(C0298d c0298d) {
        int[] iArr = c0298d.f3666p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0298d c0298d2 = c0298d.f3632T;
        C0299e c0299e = c0298d2 != null ? (C0299e) c0298d2 : null;
        if (c0299e != null) {
            int i3 = c0299e.f3666p0[0];
        }
        if (c0299e != null) {
            int i4 = c0299e.f3666p0[1];
        }
        boolean z2 = i == 1 || c0298d.A() || i == 2 || (i == 3 && c0298d.f3668r == 0 && c0298d.f3635W == 0.0f && c0298d.t(0)) || (i == 3 && c0298d.f3668r == 1 && c0298d.u(0, c0298d.q()));
        boolean z3 = i2 == 1 || c0298d.B() || i2 == 2 || (i2 == 3 && c0298d.f3669s == 0 && c0298d.f3635W == 0.0f && c0298d.t(1)) || (i2 == 3 && c0298d.f3669s == 1 && c0298d.u(1, c0298d.k()));
        if (c0298d.f3635W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static C0314n b(C0298d c0298d, int i, ArrayList arrayList, C0314n c0314n) {
        int i2;
        int i3 = i == 0 ? c0298d.f3662n0 : c0298d.f3664o0;
        if (i3 != -1 && (c0314n == null || i3 != c0314n.f3792b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0314n c0314n2 = (C0314n) arrayList.get(i4);
                if (c0314n2.f3792b == i3) {
                    if (c0314n != null) {
                        c0314n.c(i, c0314n2);
                        arrayList.remove(c0314n);
                    }
                    c0314n = c0314n2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c0314n;
        }
        if (c0314n == null) {
            if (c0298d instanceof s.i) {
                s.i iVar = (s.i) c0298d;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.f3752r0) {
                        i2 = -1;
                        break;
                    }
                    C0298d c0298d2 = iVar.f3751q0[i5];
                    if ((i == 0 && (i2 = c0298d2.f3662n0) != -1) || (i == 1 && (i2 = c0298d2.f3664o0) != -1)) {
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
                        C0314n c0314n3 = (C0314n) arrayList.get(i6);
                        if (c0314n3.f3792b == i2) {
                            c0314n = c0314n3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c0314n == null) {
                c0314n = new C0314n();
                c0314n.f3791a = new ArrayList();
                c0314n.d = null;
                c0314n.f3794e = -1;
                int i7 = C0314n.f3790f;
                C0314n.f3790f = i7 + 1;
                c0314n.f3792b = i7;
                c0314n.f3793c = i;
            }
            arrayList.add(c0314n);
        }
        ArrayList arrayList2 = c0314n.f3791a;
        if (!arrayList2.contains(c0298d)) {
            arrayList2.add(c0298d);
            if (c0298d instanceof s.h) {
                s.h hVar = (s.h) c0298d;
                hVar.f3748t0.c(hVar.f3749u0 == 0 ? 1 : 0, arrayList, c0314n);
            }
            int i8 = c0314n.f3792b;
            if (i == 0) {
                c0298d.f3662n0 = i8;
                c0298d.f3621I.c(i, arrayList, c0314n);
                c0298d.f3623K.c(i, arrayList, c0314n);
            } else {
                c0298d.f3664o0 = i8;
                c0298d.f3622J.c(i, arrayList, c0314n);
                c0298d.f3625M.c(i, arrayList, c0314n);
                c0298d.f3624L.c(i, arrayList, c0314n);
            }
            c0298d.f3628P.c(i, arrayList, c0314n);
        }
        return c0314n;
    }

    public static void c(int i, C0298d c0298d, C0324f c0324f, boolean z2) {
        C0297c c0297c;
        C0297c c0297c2;
        C0297c c0297c3;
        C0297c c0297c4;
        if (c0298d.f3659m) {
            return;
        }
        if (!(c0298d instanceof C0299e) && c0298d.z() && a(c0298d)) {
            C0299e.V(c0298d, c0324f, new C0302b());
        }
        C0297c i2 = c0298d.i(2);
        C0297c i3 = c0298d.i(4);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3608a;
        char c2 = 0;
        if (hashSet != null && i2.f3610c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0297c c0297c5 = (C0297c) it.next();
                C0298d c0298d2 = c0297c5.d;
                int i4 = i + 1;
                boolean a2 = a(c0298d2);
                if (c0298d2.z() && a2) {
                    C0299e.V(c0298d2, c0324f, new C0302b());
                }
                C0297c c0297c6 = c0298d2.f3621I;
                C0297c c0297c7 = c0298d2.f3623K;
                char c3 = ((c0297c5 == c0297c6 && (c0297c4 = c0297c7.f3612f) != null && c0297c4.f3610c) || (c0297c5 == c0297c7 && (c0297c3 = c0297c6.f3612f) != null && c0297c3.f3610c)) ? (char) 1 : c2;
                int i5 = c0298d2.f3666p0[c2];
                if (i5 != 3 || a2) {
                    if (!c0298d2.z()) {
                        if (c0297c5 == c0297c6 && c0297c7.f3612f == null) {
                            int e2 = c0297c6.e() + d;
                            c0298d2.J(e2, c0298d2.q() + e2);
                            c(i4, c0298d2, c0324f, z2);
                        } else if (c0297c5 == c0297c7 && c0297c6.f3612f == null) {
                            int e3 = d - c0297c7.e();
                            c0298d2.J(e3 - c0298d2.q(), e3);
                            c(i4, c0298d2, c0324f, z2);
                        } else if (c3 != 0 && !c0298d2.x()) {
                            d(i4, c0298d2, c0324f, z2);
                        }
                    }
                } else if (i5 == 3 && c0298d2.f3672v >= 0 && c0298d2.f3671u >= 0 && ((c0298d2.f3651g0 == 8 || (c0298d2.f3668r == 0 && c0298d2.f3635W == 0.0f)) && !c0298d2.x() && !c0298d2.F && c3 != 0 && !c0298d2.x())) {
                    e(i4, c0298d, c0324f, c0298d2, z2);
                }
                c2 = 0;
            }
        }
        if (c0298d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3608a;
        if (hashSet2 != null && i3.f3610c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0297c c0297c8 = (C0297c) it2.next();
                C0298d c0298d3 = c0297c8.d;
                int i6 = i + 1;
                boolean a3 = a(c0298d3);
                if (c0298d3.z() && a3) {
                    C0299e.V(c0298d3, c0324f, new C0302b());
                }
                C0297c c0297c9 = c0298d3.f3621I;
                C0297c c0297c10 = c0298d3.f3623K;
                boolean z3 = (c0297c8 == c0297c9 && (c0297c2 = c0297c10.f3612f) != null && c0297c2.f3610c) || (c0297c8 == c0297c10 && (c0297c = c0297c9.f3612f) != null && c0297c.f3610c);
                int i7 = c0298d3.f3666p0[0];
                if (i7 != 3 || a3) {
                    if (!c0298d3.z()) {
                        if (c0297c8 == c0297c9 && c0297c10.f3612f == null) {
                            int e4 = c0297c9.e() + d2;
                            c0298d3.J(e4, c0298d3.q() + e4);
                            c(i6, c0298d3, c0324f, z2);
                        } else if (c0297c8 == c0297c10 && c0297c9.f3612f == null) {
                            int e5 = d2 - c0297c10.e();
                            c0298d3.J(e5 - c0298d3.q(), e5);
                            c(i6, c0298d3, c0324f, z2);
                        } else if (z3 && !c0298d3.x()) {
                            d(i6, c0298d3, c0324f, z2);
                        }
                    }
                } else if (i7 == 3 && c0298d3.f3672v >= 0 && c0298d3.f3671u >= 0) {
                    if (c0298d3.f3651g0 != 8) {
                        if (c0298d3.f3668r == 0) {
                            if (c0298d3.f3635W == 0.0f) {
                            }
                        }
                    }
                    if (!c0298d3.x() && !c0298d3.F && z3 && !c0298d3.x()) {
                        e(i6, c0298d, c0324f, c0298d3, z2);
                    }
                }
            }
        }
        c0298d.f3659m = true;
    }

    public static void d(int i, C0298d c0298d, C0324f c0324f, boolean z2) {
        float f2 = c0298d.f3645d0;
        C0297c c0297c = c0298d.f3621I;
        int d = c0297c.f3612f.d();
        C0297c c0297c2 = c0298d.f3623K;
        int d2 = c0297c2.f3612f.d();
        int e2 = c0297c.e() + d;
        int e3 = d2 - c0297c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int q2 = c0298d.q();
        int i2 = (d2 - d) - q2;
        if (d > d2) {
            i2 = (d - d2) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d;
        int i4 = i3 + q2;
        if (d > d2) {
            i4 = i3 - q2;
        }
        c0298d.J(i3, i4);
        c(i + 1, c0298d, c0324f, z2);
    }

    public static void e(int i, C0298d c0298d, C0324f c0324f, C0298d c0298d2, boolean z2) {
        float f2 = c0298d2.f3645d0;
        C0297c c0297c = c0298d2.f3621I;
        int e2 = c0297c.e() + c0297c.f3612f.d();
        C0297c c0297c2 = c0298d2.f3623K;
        int d = c0297c2.f3612f.d() - c0297c2.e();
        if (d >= e2) {
            int q2 = c0298d2.q();
            if (c0298d2.f3651g0 != 8) {
                int i2 = c0298d2.f3668r;
                if (i2 == 2) {
                    q2 = (int) (c0298d2.f3645d0 * 0.5f * (c0298d instanceof C0299e ? c0298d.q() : c0298d.f3632T.q()));
                } else if (i2 == 0) {
                    q2 = d - e2;
                }
                q2 = Math.max(c0298d2.f3671u, q2);
                int i3 = c0298d2.f3672v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - q2)) + 0.5f));
            c0298d2.J(i4, q2 + i4);
            c(i + 1, c0298d2, c0324f, z2);
        }
    }

    public static void f(int i, C0298d c0298d, C0324f c0324f) {
        float f2 = c0298d.f3647e0;
        C0297c c0297c = c0298d.f3622J;
        int d = c0297c.f3612f.d();
        C0297c c0297c2 = c0298d.f3624L;
        int d2 = c0297c2.f3612f.d();
        int e2 = c0297c.e() + d;
        int e3 = d2 - c0297c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int k2 = c0298d.k();
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
        c0298d.K(i4, i5);
        i(i + 1, c0298d, c0324f);
    }

    public static void g(int i, C0298d c0298d, C0324f c0324f, C0298d c0298d2) {
        float f2 = c0298d2.f3647e0;
        C0297c c0297c = c0298d2.f3622J;
        int e2 = c0297c.e() + c0297c.f3612f.d();
        C0297c c0297c2 = c0298d2.f3624L;
        int d = c0297c2.f3612f.d() - c0297c2.e();
        if (d >= e2) {
            int k2 = c0298d2.k();
            if (c0298d2.f3651g0 != 8) {
                int i2 = c0298d2.f3669s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (c0298d instanceof C0299e ? c0298d.k() : c0298d.f3632T.k()));
                } else if (i2 == 0) {
                    k2 = d - e2;
                }
                k2 = Math.max(c0298d2.f3674x, k2);
                int i3 = c0298d2.f3675y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - k2)) + 0.5f));
            c0298d2.K(i4, k2 + i4);
            i(i + 1, c0298d2, c0324f);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, C0298d c0298d, C0324f c0324f) {
        C0297c c0297c;
        C0297c c0297c2;
        C0297c c0297c3;
        C0297c c0297c4;
        C0297c c0297c5;
        if (c0298d.f3661n) {
            return;
        }
        if (!(c0298d instanceof C0299e) && c0298d.z() && a(c0298d)) {
            C0299e.V(c0298d, c0324f, new C0302b());
        }
        C0297c i2 = c0298d.i(3);
        C0297c i3 = c0298d.i(5);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3608a;
        if (hashSet != null && i2.f3610c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0297c c0297c6 = (C0297c) it.next();
                C0298d c0298d2 = c0297c6.d;
                int i4 = i + 1;
                boolean a2 = a(c0298d2);
                if (c0298d2.z() && a2) {
                    C0299e.V(c0298d2, c0324f, new C0302b());
                }
                C0297c c0297c7 = c0298d2.f3622J;
                C0297c c0297c8 = c0298d2.f3624L;
                boolean z2 = (c0297c6 == c0297c7 && (c0297c5 = c0297c8.f3612f) != null && c0297c5.f3610c) || (c0297c6 == c0297c8 && (c0297c4 = c0297c7.f3612f) != null && c0297c4.f3610c);
                int i5 = c0298d2.f3666p0[1];
                if (i5 != 3 || a2) {
                    if (!c0298d2.z()) {
                        if (c0297c6 == c0297c7 && c0297c8.f3612f == null) {
                            int e2 = c0297c7.e() + d;
                            c0298d2.K(e2, c0298d2.k() + e2);
                            i(i4, c0298d2, c0324f);
                        } else if (c0297c6 == c0297c8 && c0297c7.f3612f == null) {
                            int e3 = d - c0297c8.e();
                            c0298d2.K(e3 - c0298d2.k(), e3);
                            i(i4, c0298d2, c0324f);
                        } else if (z2 && !c0298d2.y()) {
                            f(i4, c0298d2, c0324f);
                        }
                    }
                } else if (i5 == 3 && c0298d2.f3675y >= 0 && c0298d2.f3674x >= 0 && (c0298d2.f3651g0 == 8 || (c0298d2.f3669s == 0 && c0298d2.f3635W == 0.0f))) {
                    if (!c0298d2.y() && !c0298d2.F && z2 && !c0298d2.y()) {
                        g(i4, c0298d, c0324f, c0298d2);
                    }
                }
            }
        }
        if (c0298d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3608a;
        if (hashSet2 != null && i3.f3610c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0297c c0297c9 = (C0297c) it2.next();
                C0298d c0298d3 = c0297c9.d;
                int i6 = i + 1;
                boolean a3 = a(c0298d3);
                if (c0298d3.z() && a3) {
                    C0299e.V(c0298d3, c0324f, new C0302b());
                }
                C0297c c0297c10 = c0298d3.f3622J;
                C0297c c0297c11 = c0298d3.f3624L;
                boolean z3 = (c0297c9 == c0297c10 && (c0297c3 = c0297c11.f3612f) != null && c0297c3.f3610c) || (c0297c9 == c0297c11 && (c0297c2 = c0297c10.f3612f) != null && c0297c2.f3610c);
                int i7 = c0298d3.f3666p0[1];
                if (i7 != 3 || a3) {
                    if (!c0298d3.z()) {
                        if (c0297c9 == c0297c10 && c0297c11.f3612f == null) {
                            int e4 = c0297c10.e() + d2;
                            c0298d3.K(e4, c0298d3.k() + e4);
                            i(i6, c0298d3, c0324f);
                        } else if (c0297c9 == c0297c11 && c0297c10.f3612f == null) {
                            int e5 = d2 - c0297c11.e();
                            c0298d3.K(e5 - c0298d3.k(), e5);
                            i(i6, c0298d3, c0324f);
                        } else if (z3 && !c0298d3.y()) {
                            f(i6, c0298d3, c0324f);
                        }
                    }
                } else if (i7 == 3 && c0298d3.f3675y >= 0 && c0298d3.f3674x >= 0) {
                    if (c0298d3.f3651g0 != 8) {
                        if (c0298d3.f3669s == 0) {
                            if (c0298d3.f3635W == 0.0f) {
                            }
                        }
                    }
                    if (!c0298d3.y() && !c0298d3.F && z3 && !c0298d3.y()) {
                        g(i6, c0298d, c0324f, c0298d3);
                    }
                }
            }
        }
        C0297c i8 = c0298d.i(6);
        if (i8.f3608a != null && i8.f3610c) {
            int d3 = i8.d();
            Iterator it3 = i8.f3608a.iterator();
            while (it3.hasNext()) {
                C0297c c0297c12 = (C0297c) it3.next();
                C0298d c0298d4 = c0297c12.d;
                int i9 = i + 1;
                boolean a4 = a(c0298d4);
                if (c0298d4.z() && a4) {
                    C0299e.V(c0298d4, c0324f, new C0302b());
                }
                if (c0298d4.f3666p0[1] != 3 || a4) {
                    if (!c0298d4.z() && c0297c12 == (c0297c = c0298d4.f3625M)) {
                        int e6 = c0297c12.e() + d3;
                        if (c0298d4.f3618E) {
                            int i10 = e6 - c0298d4.f3640a0;
                            int i11 = c0298d4.f3634V + i10;
                            c0298d4.f3638Z = i10;
                            c0298d4.f3622J.l(i10);
                            c0298d4.f3624L.l(i11);
                            c0297c.l(e6);
                            c0298d4.f3657l = true;
                        }
                        i(i9, c0298d4, c0324f);
                    }
                }
            }
        }
        c0298d.f3661n = true;
    }
}
