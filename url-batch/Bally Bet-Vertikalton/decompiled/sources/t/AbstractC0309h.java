package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0298c;
import s.C0299d;
import s.C0300e;
import v.C0325f;

/* renamed from: t.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0309h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0303b f3767a = new C0303b();

    public static boolean a(C0299d c0299d) {
        int[] iArr = c0299d.f3649p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0299d c0299d2 = c0299d.f3615T;
        C0300e c0300e = c0299d2 != null ? (C0300e) c0299d2 : null;
        if (c0300e != null) {
            int i3 = c0300e.f3649p0[0];
        }
        if (c0300e != null) {
            int i4 = c0300e.f3649p0[1];
        }
        boolean z2 = i == 1 || c0299d.A() || i == 2 || (i == 3 && c0299d.f3651r == 0 && c0299d.f3618W == 0.0f && c0299d.t(0)) || (i == 3 && c0299d.f3651r == 1 && c0299d.u(0, c0299d.q()));
        boolean z3 = i2 == 1 || c0299d.B() || i2 == 2 || (i2 == 3 && c0299d.f3652s == 0 && c0299d.f3618W == 0.0f && c0299d.t(1)) || (i2 == 3 && c0299d.f3652s == 1 && c0299d.u(1, c0299d.k()));
        if (c0299d.f3618W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static C0315n b(C0299d c0299d, int i, ArrayList arrayList, C0315n c0315n) {
        int i2;
        int i3 = i == 0 ? c0299d.f3645n0 : c0299d.f3647o0;
        if (i3 != -1 && (c0315n == null || i3 != c0315n.f3775b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0315n c0315n2 = (C0315n) arrayList.get(i4);
                if (c0315n2.f3775b == i3) {
                    if (c0315n != null) {
                        c0315n.c(i, c0315n2);
                        arrayList.remove(c0315n);
                    }
                    c0315n = c0315n2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c0315n;
        }
        if (c0315n == null) {
            if (c0299d instanceof s.i) {
                s.i iVar = (s.i) c0299d;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.f3735r0) {
                        i2 = -1;
                        break;
                    }
                    C0299d c0299d2 = iVar.f3734q0[i5];
                    if ((i == 0 && (i2 = c0299d2.f3645n0) != -1) || (i == 1 && (i2 = c0299d2.f3647o0) != -1)) {
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
                        C0315n c0315n3 = (C0315n) arrayList.get(i6);
                        if (c0315n3.f3775b == i2) {
                            c0315n = c0315n3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c0315n == null) {
                c0315n = new C0315n();
                c0315n.f3774a = new ArrayList();
                c0315n.d = null;
                c0315n.f3777e = -1;
                int i7 = C0315n.f3773f;
                C0315n.f3773f = i7 + 1;
                c0315n.f3775b = i7;
                c0315n.f3776c = i;
            }
            arrayList.add(c0315n);
        }
        ArrayList arrayList2 = c0315n.f3774a;
        if (!arrayList2.contains(c0299d)) {
            arrayList2.add(c0299d);
            if (c0299d instanceof s.h) {
                s.h hVar = (s.h) c0299d;
                hVar.f3731t0.c(hVar.f3732u0 == 0 ? 1 : 0, arrayList, c0315n);
            }
            int i8 = c0315n.f3775b;
            if (i == 0) {
                c0299d.f3645n0 = i8;
                c0299d.f3604I.c(i, arrayList, c0315n);
                c0299d.f3606K.c(i, arrayList, c0315n);
            } else {
                c0299d.f3647o0 = i8;
                c0299d.f3605J.c(i, arrayList, c0315n);
                c0299d.f3608M.c(i, arrayList, c0315n);
                c0299d.f3607L.c(i, arrayList, c0315n);
            }
            c0299d.f3611P.c(i, arrayList, c0315n);
        }
        return c0315n;
    }

    public static void c(int i, C0299d c0299d, C0325f c0325f, boolean z2) {
        C0298c c0298c;
        C0298c c0298c2;
        C0298c c0298c3;
        C0298c c0298c4;
        if (c0299d.f3642m) {
            return;
        }
        if (!(c0299d instanceof C0300e) && c0299d.z() && a(c0299d)) {
            C0300e.V(c0299d, c0325f, new C0303b());
        }
        C0298c i2 = c0299d.i(2);
        C0298c i3 = c0299d.i(4);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3591a;
        char c2 = 0;
        if (hashSet != null && i2.f3593c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0298c c0298c5 = (C0298c) it.next();
                C0299d c0299d2 = c0298c5.d;
                int i4 = i + 1;
                boolean a2 = a(c0299d2);
                if (c0299d2.z() && a2) {
                    C0300e.V(c0299d2, c0325f, new C0303b());
                }
                C0298c c0298c6 = c0299d2.f3604I;
                C0298c c0298c7 = c0299d2.f3606K;
                char c3 = ((c0298c5 == c0298c6 && (c0298c4 = c0298c7.f3595f) != null && c0298c4.f3593c) || (c0298c5 == c0298c7 && (c0298c3 = c0298c6.f3595f) != null && c0298c3.f3593c)) ? (char) 1 : c2;
                int i5 = c0299d2.f3649p0[c2];
                if (i5 != 3 || a2) {
                    if (!c0299d2.z()) {
                        if (c0298c5 == c0298c6 && c0298c7.f3595f == null) {
                            int e2 = c0298c6.e() + d;
                            c0299d2.J(e2, c0299d2.q() + e2);
                            c(i4, c0299d2, c0325f, z2);
                        } else if (c0298c5 == c0298c7 && c0298c6.f3595f == null) {
                            int e3 = d - c0298c7.e();
                            c0299d2.J(e3 - c0299d2.q(), e3);
                            c(i4, c0299d2, c0325f, z2);
                        } else if (c3 != 0 && !c0299d2.x()) {
                            d(i4, c0299d2, c0325f, z2);
                        }
                    }
                } else if (i5 == 3 && c0299d2.f3655v >= 0 && c0299d2.f3654u >= 0 && ((c0299d2.f3634g0 == 8 || (c0299d2.f3651r == 0 && c0299d2.f3618W == 0.0f)) && !c0299d2.x() && !c0299d2.F && c3 != 0 && !c0299d2.x())) {
                    e(i4, c0299d, c0325f, c0299d2, z2);
                }
                c2 = 0;
            }
        }
        if (c0299d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3591a;
        if (hashSet2 != null && i3.f3593c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0298c c0298c8 = (C0298c) it2.next();
                C0299d c0299d3 = c0298c8.d;
                int i6 = i + 1;
                boolean a3 = a(c0299d3);
                if (c0299d3.z() && a3) {
                    C0300e.V(c0299d3, c0325f, new C0303b());
                }
                C0298c c0298c9 = c0299d3.f3604I;
                C0298c c0298c10 = c0299d3.f3606K;
                boolean z3 = (c0298c8 == c0298c9 && (c0298c2 = c0298c10.f3595f) != null && c0298c2.f3593c) || (c0298c8 == c0298c10 && (c0298c = c0298c9.f3595f) != null && c0298c.f3593c);
                int i7 = c0299d3.f3649p0[0];
                if (i7 != 3 || a3) {
                    if (!c0299d3.z()) {
                        if (c0298c8 == c0298c9 && c0298c10.f3595f == null) {
                            int e4 = c0298c9.e() + d2;
                            c0299d3.J(e4, c0299d3.q() + e4);
                            c(i6, c0299d3, c0325f, z2);
                        } else if (c0298c8 == c0298c10 && c0298c9.f3595f == null) {
                            int e5 = d2 - c0298c10.e();
                            c0299d3.J(e5 - c0299d3.q(), e5);
                            c(i6, c0299d3, c0325f, z2);
                        } else if (z3 && !c0299d3.x()) {
                            d(i6, c0299d3, c0325f, z2);
                        }
                    }
                } else if (i7 == 3 && c0299d3.f3655v >= 0 && c0299d3.f3654u >= 0) {
                    if (c0299d3.f3634g0 != 8) {
                        if (c0299d3.f3651r == 0) {
                            if (c0299d3.f3618W == 0.0f) {
                            }
                        }
                    }
                    if (!c0299d3.x() && !c0299d3.F && z3 && !c0299d3.x()) {
                        e(i6, c0299d, c0325f, c0299d3, z2);
                    }
                }
            }
        }
        c0299d.f3642m = true;
    }

    public static void d(int i, C0299d c0299d, C0325f c0325f, boolean z2) {
        float f2 = c0299d.f3628d0;
        C0298c c0298c = c0299d.f3604I;
        int d = c0298c.f3595f.d();
        C0298c c0298c2 = c0299d.f3606K;
        int d2 = c0298c2.f3595f.d();
        int e2 = c0298c.e() + d;
        int e3 = d2 - c0298c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int q2 = c0299d.q();
        int i2 = (d2 - d) - q2;
        if (d > d2) {
            i2 = (d - d2) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d;
        int i4 = i3 + q2;
        if (d > d2) {
            i4 = i3 - q2;
        }
        c0299d.J(i3, i4);
        c(i + 1, c0299d, c0325f, z2);
    }

    public static void e(int i, C0299d c0299d, C0325f c0325f, C0299d c0299d2, boolean z2) {
        float f2 = c0299d2.f3628d0;
        C0298c c0298c = c0299d2.f3604I;
        int e2 = c0298c.e() + c0298c.f3595f.d();
        C0298c c0298c2 = c0299d2.f3606K;
        int d = c0298c2.f3595f.d() - c0298c2.e();
        if (d >= e2) {
            int q2 = c0299d2.q();
            if (c0299d2.f3634g0 != 8) {
                int i2 = c0299d2.f3651r;
                if (i2 == 2) {
                    q2 = (int) (c0299d2.f3628d0 * 0.5f * (c0299d instanceof C0300e ? c0299d.q() : c0299d.f3615T.q()));
                } else if (i2 == 0) {
                    q2 = d - e2;
                }
                q2 = Math.max(c0299d2.f3654u, q2);
                int i3 = c0299d2.f3655v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - q2)) + 0.5f));
            c0299d2.J(i4, q2 + i4);
            c(i + 1, c0299d2, c0325f, z2);
        }
    }

    public static void f(int i, C0299d c0299d, C0325f c0325f) {
        float f2 = c0299d.f3630e0;
        C0298c c0298c = c0299d.f3605J;
        int d = c0298c.f3595f.d();
        C0298c c0298c2 = c0299d.f3607L;
        int d2 = c0298c2.f3595f.d();
        int e2 = c0298c.e() + d;
        int e3 = d2 - c0298c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int k2 = c0299d.k();
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
        c0299d.K(i4, i5);
        i(i + 1, c0299d, c0325f);
    }

    public static void g(int i, C0299d c0299d, C0325f c0325f, C0299d c0299d2) {
        float f2 = c0299d2.f3630e0;
        C0298c c0298c = c0299d2.f3605J;
        int e2 = c0298c.e() + c0298c.f3595f.d();
        C0298c c0298c2 = c0299d2.f3607L;
        int d = c0298c2.f3595f.d() - c0298c2.e();
        if (d >= e2) {
            int k2 = c0299d2.k();
            if (c0299d2.f3634g0 != 8) {
                int i2 = c0299d2.f3652s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (c0299d instanceof C0300e ? c0299d.k() : c0299d.f3615T.k()));
                } else if (i2 == 0) {
                    k2 = d - e2;
                }
                k2 = Math.max(c0299d2.f3657x, k2);
                int i3 = c0299d2.f3658y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - k2)) + 0.5f));
            c0299d2.K(i4, k2 + i4);
            i(i + 1, c0299d2, c0325f);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, C0299d c0299d, C0325f c0325f) {
        C0298c c0298c;
        C0298c c0298c2;
        C0298c c0298c3;
        C0298c c0298c4;
        C0298c c0298c5;
        if (c0299d.f3644n) {
            return;
        }
        if (!(c0299d instanceof C0300e) && c0299d.z() && a(c0299d)) {
            C0300e.V(c0299d, c0325f, new C0303b());
        }
        C0298c i2 = c0299d.i(3);
        C0298c i3 = c0299d.i(5);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3591a;
        if (hashSet != null && i2.f3593c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0298c c0298c6 = (C0298c) it.next();
                C0299d c0299d2 = c0298c6.d;
                int i4 = i + 1;
                boolean a2 = a(c0299d2);
                if (c0299d2.z() && a2) {
                    C0300e.V(c0299d2, c0325f, new C0303b());
                }
                C0298c c0298c7 = c0299d2.f3605J;
                C0298c c0298c8 = c0299d2.f3607L;
                boolean z2 = (c0298c6 == c0298c7 && (c0298c5 = c0298c8.f3595f) != null && c0298c5.f3593c) || (c0298c6 == c0298c8 && (c0298c4 = c0298c7.f3595f) != null && c0298c4.f3593c);
                int i5 = c0299d2.f3649p0[1];
                if (i5 != 3 || a2) {
                    if (!c0299d2.z()) {
                        if (c0298c6 == c0298c7 && c0298c8.f3595f == null) {
                            int e2 = c0298c7.e() + d;
                            c0299d2.K(e2, c0299d2.k() + e2);
                            i(i4, c0299d2, c0325f);
                        } else if (c0298c6 == c0298c8 && c0298c7.f3595f == null) {
                            int e3 = d - c0298c8.e();
                            c0299d2.K(e3 - c0299d2.k(), e3);
                            i(i4, c0299d2, c0325f);
                        } else if (z2 && !c0299d2.y()) {
                            f(i4, c0299d2, c0325f);
                        }
                    }
                } else if (i5 == 3 && c0299d2.f3658y >= 0 && c0299d2.f3657x >= 0 && (c0299d2.f3634g0 == 8 || (c0299d2.f3652s == 0 && c0299d2.f3618W == 0.0f))) {
                    if (!c0299d2.y() && !c0299d2.F && z2 && !c0299d2.y()) {
                        g(i4, c0299d, c0325f, c0299d2);
                    }
                }
            }
        }
        if (c0299d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3591a;
        if (hashSet2 != null && i3.f3593c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0298c c0298c9 = (C0298c) it2.next();
                C0299d c0299d3 = c0298c9.d;
                int i6 = i + 1;
                boolean a3 = a(c0299d3);
                if (c0299d3.z() && a3) {
                    C0300e.V(c0299d3, c0325f, new C0303b());
                }
                C0298c c0298c10 = c0299d3.f3605J;
                C0298c c0298c11 = c0299d3.f3607L;
                boolean z3 = (c0298c9 == c0298c10 && (c0298c3 = c0298c11.f3595f) != null && c0298c3.f3593c) || (c0298c9 == c0298c11 && (c0298c2 = c0298c10.f3595f) != null && c0298c2.f3593c);
                int i7 = c0299d3.f3649p0[1];
                if (i7 != 3 || a3) {
                    if (!c0299d3.z()) {
                        if (c0298c9 == c0298c10 && c0298c11.f3595f == null) {
                            int e4 = c0298c10.e() + d2;
                            c0299d3.K(e4, c0299d3.k() + e4);
                            i(i6, c0299d3, c0325f);
                        } else if (c0298c9 == c0298c11 && c0298c10.f3595f == null) {
                            int e5 = d2 - c0298c11.e();
                            c0299d3.K(e5 - c0299d3.k(), e5);
                            i(i6, c0299d3, c0325f);
                        } else if (z3 && !c0299d3.y()) {
                            f(i6, c0299d3, c0325f);
                        }
                    }
                } else if (i7 == 3 && c0299d3.f3658y >= 0 && c0299d3.f3657x >= 0) {
                    if (c0299d3.f3634g0 != 8) {
                        if (c0299d3.f3652s == 0) {
                            if (c0299d3.f3618W == 0.0f) {
                            }
                        }
                    }
                    if (!c0299d3.y() && !c0299d3.F && z3 && !c0299d3.y()) {
                        g(i6, c0299d, c0325f, c0299d3);
                    }
                }
            }
        }
        C0298c i8 = c0299d.i(6);
        if (i8.f3591a != null && i8.f3593c) {
            int d3 = i8.d();
            Iterator it3 = i8.f3591a.iterator();
            while (it3.hasNext()) {
                C0298c c0298c12 = (C0298c) it3.next();
                C0299d c0299d4 = c0298c12.d;
                int i9 = i + 1;
                boolean a4 = a(c0299d4);
                if (c0299d4.z() && a4) {
                    C0300e.V(c0299d4, c0325f, new C0303b());
                }
                if (c0299d4.f3649p0[1] != 3 || a4) {
                    if (!c0299d4.z() && c0298c12 == (c0298c = c0299d4.f3608M)) {
                        int e6 = c0298c12.e() + d3;
                        if (c0299d4.f3601E) {
                            int i10 = e6 - c0299d4.f3623a0;
                            int i11 = c0299d4.f3617V + i10;
                            c0299d4.f3621Z = i10;
                            c0299d4.f3605J.l(i10);
                            c0299d4.f3607L.l(i11);
                            c0298c.l(e6);
                            c0299d4.f3640l = true;
                        }
                        i(i9, c0299d4, c0325f);
                    }
                }
            }
        }
        c0299d.f3644n = true;
    }
}
