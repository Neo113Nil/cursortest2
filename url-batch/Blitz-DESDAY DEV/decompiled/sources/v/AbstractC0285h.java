package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import u.C0274c;
import u.C0275d;
import u.C0276e;
import x.C0305f;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0285h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0279b f3824a = new C0279b();

    public static boolean a(C0275d c0275d) {
        int[] iArr = c0275d.p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0275d c0275d2 = c0275d.f3659T;
        C0276e c0276e = c0275d2 != null ? (C0276e) c0275d2 : null;
        if (c0276e != null) {
            int i3 = c0276e.p0[0];
        }
        if (c0276e != null) {
            int i4 = c0276e.p0[1];
        }
        boolean z2 = i == 1 || c0275d.A() || i == 2 || (i == 3 && c0275d.f3695r == 0 && c0275d.f3662W == 0.0f && c0275d.t(0)) || (i == 3 && c0275d.f3695r == 1 && c0275d.u(0, c0275d.q()));
        boolean z3 = i2 == 1 || c0275d.B() || i2 == 2 || (i2 == 3 && c0275d.f3696s == 0 && c0275d.f3662W == 0.0f && c0275d.t(1)) || (i2 == 3 && c0275d.f3696s == 1 && c0275d.u(1, c0275d.k()));
        if (c0275d.f3662W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static C0291n b(C0275d c0275d, int i, ArrayList arrayList, C0291n c0291n) {
        int i2;
        int i3 = i == 0 ? c0275d.f3690n0 : c0275d.f3692o0;
        if (i3 != -1 && (c0291n == null || i3 != c0291n.f3832b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0291n c0291n2 = (C0291n) arrayList.get(i4);
                if (c0291n2.f3832b == i3) {
                    if (c0291n != null) {
                        c0291n.c(i, c0291n2);
                        arrayList.remove(c0291n);
                    }
                    c0291n = c0291n2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c0291n;
        }
        if (c0291n == null) {
            if (c0275d instanceof u.i) {
                u.i iVar = (u.i) c0275d;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.f3780r0) {
                        i2 = -1;
                        break;
                    }
                    C0275d c0275d2 = iVar.f3779q0[i5];
                    if ((i == 0 && (i2 = c0275d2.f3690n0) != -1) || (i == 1 && (i2 = c0275d2.f3692o0) != -1)) {
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
                        C0291n c0291n3 = (C0291n) arrayList.get(i6);
                        if (c0291n3.f3832b == i2) {
                            c0291n = c0291n3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c0291n == null) {
                c0291n = new C0291n();
                c0291n.f3831a = new ArrayList();
                c0291n.d = null;
                c0291n.f3834e = -1;
                int i7 = C0291n.f3830f;
                C0291n.f3830f = i7 + 1;
                c0291n.f3832b = i7;
                c0291n.f3833c = i;
            }
            arrayList.add(c0291n);
        }
        ArrayList arrayList2 = c0291n.f3831a;
        if (!arrayList2.contains(c0275d)) {
            arrayList2.add(c0275d);
            if (c0275d instanceof u.h) {
                u.h hVar = (u.h) c0275d;
                hVar.f3776t0.c(hVar.f3777u0 == 0 ? 1 : 0, arrayList, c0291n);
            }
            int i8 = c0291n.f3832b;
            if (i == 0) {
                c0275d.f3690n0 = i8;
                c0275d.f3648I.c(i, arrayList, c0291n);
                c0275d.f3650K.c(i, arrayList, c0291n);
            } else {
                c0275d.f3692o0 = i8;
                c0275d.f3649J.c(i, arrayList, c0291n);
                c0275d.f3652M.c(i, arrayList, c0291n);
                c0275d.f3651L.c(i, arrayList, c0291n);
            }
            c0275d.f3655P.c(i, arrayList, c0291n);
        }
        return c0291n;
    }

    public static void c(int i, C0275d c0275d, C0305f c0305f, boolean z2) {
        C0274c c0274c;
        C0274c c0274c2;
        C0274c c0274c3;
        C0274c c0274c4;
        if (c0275d.f3687m) {
            return;
        }
        if (!(c0275d instanceof C0276e) && c0275d.z() && a(c0275d)) {
            C0276e.V(c0275d, c0305f, new C0279b());
        }
        C0274c i2 = c0275d.i(2);
        C0274c i3 = c0275d.i(4);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3635a;
        char c2 = 0;
        if (hashSet != null && i2.f3637c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0274c c0274c5 = (C0274c) it.next();
                C0275d c0275d2 = c0274c5.d;
                int i4 = i + 1;
                boolean a2 = a(c0275d2);
                if (c0275d2.z() && a2) {
                    C0276e.V(c0275d2, c0305f, new C0279b());
                }
                C0274c c0274c6 = c0275d2.f3648I;
                C0274c c0274c7 = c0275d2.f3650K;
                char c3 = ((c0274c5 == c0274c6 && (c0274c4 = c0274c7.f3639f) != null && c0274c4.f3637c) || (c0274c5 == c0274c7 && (c0274c3 = c0274c6.f3639f) != null && c0274c3.f3637c)) ? (char) 1 : c2;
                int i5 = c0275d2.p0[c2];
                if (i5 != 3 || a2) {
                    if (!c0275d2.z()) {
                        if (c0274c5 == c0274c6 && c0274c7.f3639f == null) {
                            int e2 = c0274c6.e() + d;
                            c0275d2.J(e2, c0275d2.q() + e2);
                            c(i4, c0275d2, c0305f, z2);
                        } else if (c0274c5 == c0274c7 && c0274c6.f3639f == null) {
                            int e3 = d - c0274c7.e();
                            c0275d2.J(e3 - c0275d2.q(), e3);
                            c(i4, c0275d2, c0305f, z2);
                        } else if (c3 != 0 && !c0275d2.x()) {
                            d(i4, c0275d2, c0305f, z2);
                        }
                    }
                } else if (i5 == 3 && c0275d2.f3699v >= 0 && c0275d2.f3698u >= 0 && ((c0275d2.f3678g0 == 8 || (c0275d2.f3695r == 0 && c0275d2.f3662W == 0.0f)) && !c0275d2.x() && !c0275d2.f3646F && c3 != 0 && !c0275d2.x())) {
                    e(i4, c0275d, c0305f, c0275d2, z2);
                }
                c2 = 0;
            }
        }
        if (c0275d instanceof u.h) {
            return;
        }
        HashSet hashSet2 = i3.f3635a;
        if (hashSet2 != null && i3.f3637c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0274c c0274c8 = (C0274c) it2.next();
                C0275d c0275d3 = c0274c8.d;
                int i6 = i + 1;
                boolean a3 = a(c0275d3);
                if (c0275d3.z() && a3) {
                    C0276e.V(c0275d3, c0305f, new C0279b());
                }
                C0274c c0274c9 = c0275d3.f3648I;
                C0274c c0274c10 = c0275d3.f3650K;
                boolean z3 = (c0274c8 == c0274c9 && (c0274c2 = c0274c10.f3639f) != null && c0274c2.f3637c) || (c0274c8 == c0274c10 && (c0274c = c0274c9.f3639f) != null && c0274c.f3637c);
                int i7 = c0275d3.p0[0];
                if (i7 != 3 || a3) {
                    if (!c0275d3.z()) {
                        if (c0274c8 == c0274c9 && c0274c10.f3639f == null) {
                            int e4 = c0274c9.e() + d2;
                            c0275d3.J(e4, c0275d3.q() + e4);
                            c(i6, c0275d3, c0305f, z2);
                        } else if (c0274c8 == c0274c10 && c0274c9.f3639f == null) {
                            int e5 = d2 - c0274c10.e();
                            c0275d3.J(e5 - c0275d3.q(), e5);
                            c(i6, c0275d3, c0305f, z2);
                        } else if (z3 && !c0275d3.x()) {
                            d(i6, c0275d3, c0305f, z2);
                        }
                    }
                } else if (i7 == 3 && c0275d3.f3699v >= 0 && c0275d3.f3698u >= 0) {
                    if (c0275d3.f3678g0 != 8) {
                        if (c0275d3.f3695r == 0) {
                            if (c0275d3.f3662W == 0.0f) {
                            }
                        }
                    }
                    if (!c0275d3.x() && !c0275d3.f3646F && z3 && !c0275d3.x()) {
                        e(i6, c0275d, c0305f, c0275d3, z2);
                    }
                }
            }
        }
        c0275d.f3687m = true;
    }

    public static void d(int i, C0275d c0275d, C0305f c0305f, boolean z2) {
        float f2 = c0275d.f3672d0;
        C0274c c0274c = c0275d.f3648I;
        int d = c0274c.f3639f.d();
        C0274c c0274c2 = c0275d.f3650K;
        int d2 = c0274c2.f3639f.d();
        int e2 = c0274c.e() + d;
        int e3 = d2 - c0274c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int q2 = c0275d.q();
        int i2 = (d2 - d) - q2;
        if (d > d2) {
            i2 = (d - d2) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d;
        int i4 = i3 + q2;
        if (d > d2) {
            i4 = i3 - q2;
        }
        c0275d.J(i3, i4);
        c(i + 1, c0275d, c0305f, z2);
    }

    public static void e(int i, C0275d c0275d, C0305f c0305f, C0275d c0275d2, boolean z2) {
        float f2 = c0275d2.f3672d0;
        C0274c c0274c = c0275d2.f3648I;
        int e2 = c0274c.e() + c0274c.f3639f.d();
        C0274c c0274c2 = c0275d2.f3650K;
        int d = c0274c2.f3639f.d() - c0274c2.e();
        if (d >= e2) {
            int q2 = c0275d2.q();
            if (c0275d2.f3678g0 != 8) {
                int i2 = c0275d2.f3695r;
                if (i2 == 2) {
                    q2 = (int) (c0275d2.f3672d0 * 0.5f * (c0275d instanceof C0276e ? c0275d.q() : c0275d.f3659T.q()));
                } else if (i2 == 0) {
                    q2 = d - e2;
                }
                q2 = Math.max(c0275d2.f3698u, q2);
                int i3 = c0275d2.f3699v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - q2)) + 0.5f));
            c0275d2.J(i4, q2 + i4);
            c(i + 1, c0275d2, c0305f, z2);
        }
    }

    public static void f(int i, C0275d c0275d, C0305f c0305f) {
        float f2 = c0275d.f3674e0;
        C0274c c0274c = c0275d.f3649J;
        int d = c0274c.f3639f.d();
        C0274c c0274c2 = c0275d.f3651L;
        int d2 = c0274c2.f3639f.d();
        int e2 = c0274c.e() + d;
        int e3 = d2 - c0274c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int k2 = c0275d.k();
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
        c0275d.K(i4, i5);
        i(i + 1, c0275d, c0305f);
    }

    public static void g(int i, C0275d c0275d, C0305f c0305f, C0275d c0275d2) {
        float f2 = c0275d2.f3674e0;
        C0274c c0274c = c0275d2.f3649J;
        int e2 = c0274c.e() + c0274c.f3639f.d();
        C0274c c0274c2 = c0275d2.f3651L;
        int d = c0274c2.f3639f.d() - c0274c2.e();
        if (d >= e2) {
            int k2 = c0275d2.k();
            if (c0275d2.f3678g0 != 8) {
                int i2 = c0275d2.f3696s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (c0275d instanceof C0276e ? c0275d.k() : c0275d.f3659T.k()));
                } else if (i2 == 0) {
                    k2 = d - e2;
                }
                k2 = Math.max(c0275d2.f3701x, k2);
                int i3 = c0275d2.f3702y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - k2)) + 0.5f));
            c0275d2.K(i4, k2 + i4);
            i(i + 1, c0275d2, c0305f);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, C0275d c0275d, C0305f c0305f) {
        C0274c c0274c;
        C0274c c0274c2;
        C0274c c0274c3;
        C0274c c0274c4;
        C0274c c0274c5;
        if (c0275d.f3689n) {
            return;
        }
        if (!(c0275d instanceof C0276e) && c0275d.z() && a(c0275d)) {
            C0276e.V(c0275d, c0305f, new C0279b());
        }
        C0274c i2 = c0275d.i(3);
        C0274c i3 = c0275d.i(5);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3635a;
        if (hashSet != null && i2.f3637c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0274c c0274c6 = (C0274c) it.next();
                C0275d c0275d2 = c0274c6.d;
                int i4 = i + 1;
                boolean a2 = a(c0275d2);
                if (c0275d2.z() && a2) {
                    C0276e.V(c0275d2, c0305f, new C0279b());
                }
                C0274c c0274c7 = c0275d2.f3649J;
                C0274c c0274c8 = c0275d2.f3651L;
                boolean z2 = (c0274c6 == c0274c7 && (c0274c5 = c0274c8.f3639f) != null && c0274c5.f3637c) || (c0274c6 == c0274c8 && (c0274c4 = c0274c7.f3639f) != null && c0274c4.f3637c);
                int i5 = c0275d2.p0[1];
                if (i5 != 3 || a2) {
                    if (!c0275d2.z()) {
                        if (c0274c6 == c0274c7 && c0274c8.f3639f == null) {
                            int e2 = c0274c7.e() + d;
                            c0275d2.K(e2, c0275d2.k() + e2);
                            i(i4, c0275d2, c0305f);
                        } else if (c0274c6 == c0274c8 && c0274c7.f3639f == null) {
                            int e3 = d - c0274c8.e();
                            c0275d2.K(e3 - c0275d2.k(), e3);
                            i(i4, c0275d2, c0305f);
                        } else if (z2 && !c0275d2.y()) {
                            f(i4, c0275d2, c0305f);
                        }
                    }
                } else if (i5 == 3 && c0275d2.f3702y >= 0 && c0275d2.f3701x >= 0 && (c0275d2.f3678g0 == 8 || (c0275d2.f3696s == 0 && c0275d2.f3662W == 0.0f))) {
                    if (!c0275d2.y() && !c0275d2.f3646F && z2 && !c0275d2.y()) {
                        g(i4, c0275d, c0305f, c0275d2);
                    }
                }
            }
        }
        if (c0275d instanceof u.h) {
            return;
        }
        HashSet hashSet2 = i3.f3635a;
        if (hashSet2 != null && i3.f3637c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0274c c0274c9 = (C0274c) it2.next();
                C0275d c0275d3 = c0274c9.d;
                int i6 = i + 1;
                boolean a3 = a(c0275d3);
                if (c0275d3.z() && a3) {
                    C0276e.V(c0275d3, c0305f, new C0279b());
                }
                C0274c c0274c10 = c0275d3.f3649J;
                C0274c c0274c11 = c0275d3.f3651L;
                boolean z3 = (c0274c9 == c0274c10 && (c0274c3 = c0274c11.f3639f) != null && c0274c3.f3637c) || (c0274c9 == c0274c11 && (c0274c2 = c0274c10.f3639f) != null && c0274c2.f3637c);
                int i7 = c0275d3.p0[1];
                if (i7 != 3 || a3) {
                    if (!c0275d3.z()) {
                        if (c0274c9 == c0274c10 && c0274c11.f3639f == null) {
                            int e4 = c0274c10.e() + d2;
                            c0275d3.K(e4, c0275d3.k() + e4);
                            i(i6, c0275d3, c0305f);
                        } else if (c0274c9 == c0274c11 && c0274c10.f3639f == null) {
                            int e5 = d2 - c0274c11.e();
                            c0275d3.K(e5 - c0275d3.k(), e5);
                            i(i6, c0275d3, c0305f);
                        } else if (z3 && !c0275d3.y()) {
                            f(i6, c0275d3, c0305f);
                        }
                    }
                } else if (i7 == 3 && c0275d3.f3702y >= 0 && c0275d3.f3701x >= 0) {
                    if (c0275d3.f3678g0 != 8) {
                        if (c0275d3.f3696s == 0) {
                            if (c0275d3.f3662W == 0.0f) {
                            }
                        }
                    }
                    if (!c0275d3.y() && !c0275d3.f3646F && z3 && !c0275d3.y()) {
                        g(i6, c0275d, c0305f, c0275d3);
                    }
                }
            }
        }
        C0274c i8 = c0275d.i(6);
        if (i8.f3635a != null && i8.f3637c) {
            int d3 = i8.d();
            Iterator it3 = i8.f3635a.iterator();
            while (it3.hasNext()) {
                C0274c c0274c12 = (C0274c) it3.next();
                C0275d c0275d4 = c0274c12.d;
                int i9 = i + 1;
                boolean a4 = a(c0275d4);
                if (c0275d4.z() && a4) {
                    C0276e.V(c0275d4, c0305f, new C0279b());
                }
                if (c0275d4.p0[1] != 3 || a4) {
                    if (!c0275d4.z() && c0274c12 == (c0274c = c0275d4.f3652M)) {
                        int e6 = c0274c12.e() + d3;
                        if (c0275d4.f3645E) {
                            int i10 = e6 - c0275d4.f3667a0;
                            int i11 = c0275d4.f3661V + i10;
                            c0275d4.f3665Z = i10;
                            c0275d4.f3649J.l(i10);
                            c0275d4.f3651L.l(i11);
                            c0274c.l(e6);
                            c0275d4.f3685l = true;
                        }
                        i(i9, c0275d4, c0305f);
                    }
                }
            }
        }
        c0275d.f3689n = true;
    }
}
