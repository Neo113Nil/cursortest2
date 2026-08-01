package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0292c;
import s.C0293d;
import s.C0294e;
import v.C0319f;

/* renamed from: t.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0303h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0297b f3707a = new C0297b();

    public static boolean a(C0293d c0293d) {
        int[] iArr = c0293d.f3577p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0293d c0293d2 = c0293d.f3543T;
        C0294e c0294e = c0293d2 != null ? (C0294e) c0293d2 : null;
        if (c0294e != null) {
            int i3 = c0294e.f3577p0[0];
        }
        if (c0294e != null) {
            int i4 = c0294e.f3577p0[1];
        }
        boolean z2 = i == 1 || c0293d.A() || i == 2 || (i == 3 && c0293d.f3579r == 0 && c0293d.f3546W == 0.0f && c0293d.t(0)) || (i == 3 && c0293d.f3579r == 1 && c0293d.u(0, c0293d.q()));
        boolean z3 = i2 == 1 || c0293d.B() || i2 == 2 || (i2 == 3 && c0293d.f3580s == 0 && c0293d.f3546W == 0.0f && c0293d.t(1)) || (i2 == 3 && c0293d.f3580s == 1 && c0293d.u(1, c0293d.k()));
        if (c0293d.f3546W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static C0309n b(C0293d c0293d, int i, ArrayList arrayList, C0309n c0309n) {
        int i2;
        int i3 = i == 0 ? c0293d.n0 : c0293d.f3575o0;
        if (i3 != -1 && (c0309n == null || i3 != c0309n.f3715b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0309n c0309n2 = (C0309n) arrayList.get(i4);
                if (c0309n2.f3715b == i3) {
                    if (c0309n != null) {
                        c0309n.c(i, c0309n2);
                        arrayList.remove(c0309n);
                    }
                    c0309n = c0309n2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c0309n;
        }
        if (c0309n == null) {
            if (c0293d instanceof s.i) {
                s.i iVar = (s.i) c0293d;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.f3663r0) {
                        i2 = -1;
                        break;
                    }
                    C0293d c0293d2 = iVar.f3662q0[i5];
                    if ((i == 0 && (i2 = c0293d2.n0) != -1) || (i == 1 && (i2 = c0293d2.f3575o0) != -1)) {
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
                        C0309n c0309n3 = (C0309n) arrayList.get(i6);
                        if (c0309n3.f3715b == i2) {
                            c0309n = c0309n3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c0309n == null) {
                c0309n = new C0309n();
                c0309n.f3714a = new ArrayList();
                c0309n.d = null;
                c0309n.f3717e = -1;
                int i7 = C0309n.f3713f;
                C0309n.f3713f = i7 + 1;
                c0309n.f3715b = i7;
                c0309n.f3716c = i;
            }
            arrayList.add(c0309n);
        }
        ArrayList arrayList2 = c0309n.f3714a;
        if (!arrayList2.contains(c0293d)) {
            arrayList2.add(c0293d);
            if (c0293d instanceof s.h) {
                s.h hVar = (s.h) c0293d;
                hVar.f3659t0.c(hVar.f3660u0 == 0 ? 1 : 0, arrayList, c0309n);
            }
            int i8 = c0309n.f3715b;
            if (i == 0) {
                c0293d.n0 = i8;
                c0293d.f3532I.c(i, arrayList, c0309n);
                c0293d.f3534K.c(i, arrayList, c0309n);
            } else {
                c0293d.f3575o0 = i8;
                c0293d.f3533J.c(i, arrayList, c0309n);
                c0293d.f3536M.c(i, arrayList, c0309n);
                c0293d.f3535L.c(i, arrayList, c0309n);
            }
            c0293d.f3539P.c(i, arrayList, c0309n);
        }
        return c0309n;
    }

    public static void c(int i, C0293d c0293d, C0319f c0319f, boolean z2) {
        C0292c c0292c;
        C0292c c0292c2;
        C0292c c0292c3;
        C0292c c0292c4;
        if (c0293d.f3571m) {
            return;
        }
        if (!(c0293d instanceof C0294e) && c0293d.z() && a(c0293d)) {
            C0294e.V(c0293d, c0319f, new C0297b());
        }
        C0292c i2 = c0293d.i(2);
        C0292c i3 = c0293d.i(4);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3519a;
        char c2 = 0;
        if (hashSet != null && i2.f3521c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0292c c0292c5 = (C0292c) it.next();
                C0293d c0293d2 = c0292c5.d;
                int i4 = i + 1;
                boolean a2 = a(c0293d2);
                if (c0293d2.z() && a2) {
                    C0294e.V(c0293d2, c0319f, new C0297b());
                }
                C0292c c0292c6 = c0293d2.f3532I;
                C0292c c0292c7 = c0293d2.f3534K;
                char c3 = ((c0292c5 == c0292c6 && (c0292c4 = c0292c7.f3523f) != null && c0292c4.f3521c) || (c0292c5 == c0292c7 && (c0292c3 = c0292c6.f3523f) != null && c0292c3.f3521c)) ? (char) 1 : c2;
                int i5 = c0293d2.f3577p0[c2];
                if (i5 != 3 || a2) {
                    if (!c0293d2.z()) {
                        if (c0292c5 == c0292c6 && c0292c7.f3523f == null) {
                            int e2 = c0292c6.e() + d;
                            c0293d2.J(e2, c0293d2.q() + e2);
                            c(i4, c0293d2, c0319f, z2);
                        } else if (c0292c5 == c0292c7 && c0292c6.f3523f == null) {
                            int e3 = d - c0292c7.e();
                            c0293d2.J(e3 - c0293d2.q(), e3);
                            c(i4, c0293d2, c0319f, z2);
                        } else if (c3 != 0 && !c0293d2.x()) {
                            d(i4, c0293d2, c0319f, z2);
                        }
                    }
                } else if (i5 == 3 && c0293d2.f3583v >= 0 && c0293d2.f3582u >= 0 && ((c0293d2.f3562g0 == 8 || (c0293d2.f3579r == 0 && c0293d2.f3546W == 0.0f)) && !c0293d2.x() && !c0293d2.F && c3 != 0 && !c0293d2.x())) {
                    e(i4, c0293d, c0319f, c0293d2, z2);
                }
                c2 = 0;
            }
        }
        if (c0293d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3519a;
        if (hashSet2 != null && i3.f3521c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0292c c0292c8 = (C0292c) it2.next();
                C0293d c0293d3 = c0292c8.d;
                int i6 = i + 1;
                boolean a3 = a(c0293d3);
                if (c0293d3.z() && a3) {
                    C0294e.V(c0293d3, c0319f, new C0297b());
                }
                C0292c c0292c9 = c0293d3.f3532I;
                C0292c c0292c10 = c0293d3.f3534K;
                boolean z3 = (c0292c8 == c0292c9 && (c0292c2 = c0292c10.f3523f) != null && c0292c2.f3521c) || (c0292c8 == c0292c10 && (c0292c = c0292c9.f3523f) != null && c0292c.f3521c);
                int i7 = c0293d3.f3577p0[0];
                if (i7 != 3 || a3) {
                    if (!c0293d3.z()) {
                        if (c0292c8 == c0292c9 && c0292c10.f3523f == null) {
                            int e4 = c0292c9.e() + d2;
                            c0293d3.J(e4, c0293d3.q() + e4);
                            c(i6, c0293d3, c0319f, z2);
                        } else if (c0292c8 == c0292c10 && c0292c9.f3523f == null) {
                            int e5 = d2 - c0292c10.e();
                            c0293d3.J(e5 - c0293d3.q(), e5);
                            c(i6, c0293d3, c0319f, z2);
                        } else if (z3 && !c0293d3.x()) {
                            d(i6, c0293d3, c0319f, z2);
                        }
                    }
                } else if (i7 == 3 && c0293d3.f3583v >= 0 && c0293d3.f3582u >= 0) {
                    if (c0293d3.f3562g0 != 8) {
                        if (c0293d3.f3579r == 0) {
                            if (c0293d3.f3546W == 0.0f) {
                            }
                        }
                    }
                    if (!c0293d3.x() && !c0293d3.F && z3 && !c0293d3.x()) {
                        e(i6, c0293d, c0319f, c0293d3, z2);
                    }
                }
            }
        }
        c0293d.f3571m = true;
    }

    public static void d(int i, C0293d c0293d, C0319f c0319f, boolean z2) {
        float f2 = c0293d.f3556d0;
        C0292c c0292c = c0293d.f3532I;
        int d = c0292c.f3523f.d();
        C0292c c0292c2 = c0293d.f3534K;
        int d2 = c0292c2.f3523f.d();
        int e2 = c0292c.e() + d;
        int e3 = d2 - c0292c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int q2 = c0293d.q();
        int i2 = (d2 - d) - q2;
        if (d > d2) {
            i2 = (d - d2) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d;
        int i4 = i3 + q2;
        if (d > d2) {
            i4 = i3 - q2;
        }
        c0293d.J(i3, i4);
        c(i + 1, c0293d, c0319f, z2);
    }

    public static void e(int i, C0293d c0293d, C0319f c0319f, C0293d c0293d2, boolean z2) {
        float f2 = c0293d2.f3556d0;
        C0292c c0292c = c0293d2.f3532I;
        int e2 = c0292c.e() + c0292c.f3523f.d();
        C0292c c0292c2 = c0293d2.f3534K;
        int d = c0292c2.f3523f.d() - c0292c2.e();
        if (d >= e2) {
            int q2 = c0293d2.q();
            if (c0293d2.f3562g0 != 8) {
                int i2 = c0293d2.f3579r;
                if (i2 == 2) {
                    q2 = (int) (c0293d2.f3556d0 * 0.5f * (c0293d instanceof C0294e ? c0293d.q() : c0293d.f3543T.q()));
                } else if (i2 == 0) {
                    q2 = d - e2;
                }
                q2 = Math.max(c0293d2.f3582u, q2);
                int i3 = c0293d2.f3583v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - q2)) + 0.5f));
            c0293d2.J(i4, q2 + i4);
            c(i + 1, c0293d2, c0319f, z2);
        }
    }

    public static void f(int i, C0293d c0293d, C0319f c0319f) {
        float f2 = c0293d.f3558e0;
        C0292c c0292c = c0293d.f3533J;
        int d = c0292c.f3523f.d();
        C0292c c0292c2 = c0293d.f3535L;
        int d2 = c0292c2.f3523f.d();
        int e2 = c0292c.e() + d;
        int e3 = d2 - c0292c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int k2 = c0293d.k();
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
        c0293d.K(i4, i5);
        i(i + 1, c0293d, c0319f);
    }

    public static void g(int i, C0293d c0293d, C0319f c0319f, C0293d c0293d2) {
        float f2 = c0293d2.f3558e0;
        C0292c c0292c = c0293d2.f3533J;
        int e2 = c0292c.e() + c0292c.f3523f.d();
        C0292c c0292c2 = c0293d2.f3535L;
        int d = c0292c2.f3523f.d() - c0292c2.e();
        if (d >= e2) {
            int k2 = c0293d2.k();
            if (c0293d2.f3562g0 != 8) {
                int i2 = c0293d2.f3580s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (c0293d instanceof C0294e ? c0293d.k() : c0293d.f3543T.k()));
                } else if (i2 == 0) {
                    k2 = d - e2;
                }
                k2 = Math.max(c0293d2.f3585x, k2);
                int i3 = c0293d2.f3586y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - k2)) + 0.5f));
            c0293d2.K(i4, k2 + i4);
            i(i + 1, c0293d2, c0319f);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, C0293d c0293d, C0319f c0319f) {
        C0292c c0292c;
        C0292c c0292c2;
        C0292c c0292c3;
        C0292c c0292c4;
        C0292c c0292c5;
        if (c0293d.f3573n) {
            return;
        }
        if (!(c0293d instanceof C0294e) && c0293d.z() && a(c0293d)) {
            C0294e.V(c0293d, c0319f, new C0297b());
        }
        C0292c i2 = c0293d.i(3);
        C0292c i3 = c0293d.i(5);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3519a;
        if (hashSet != null && i2.f3521c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0292c c0292c6 = (C0292c) it.next();
                C0293d c0293d2 = c0292c6.d;
                int i4 = i + 1;
                boolean a2 = a(c0293d2);
                if (c0293d2.z() && a2) {
                    C0294e.V(c0293d2, c0319f, new C0297b());
                }
                C0292c c0292c7 = c0293d2.f3533J;
                C0292c c0292c8 = c0293d2.f3535L;
                boolean z2 = (c0292c6 == c0292c7 && (c0292c5 = c0292c8.f3523f) != null && c0292c5.f3521c) || (c0292c6 == c0292c8 && (c0292c4 = c0292c7.f3523f) != null && c0292c4.f3521c);
                int i5 = c0293d2.f3577p0[1];
                if (i5 != 3 || a2) {
                    if (!c0293d2.z()) {
                        if (c0292c6 == c0292c7 && c0292c8.f3523f == null) {
                            int e2 = c0292c7.e() + d;
                            c0293d2.K(e2, c0293d2.k() + e2);
                            i(i4, c0293d2, c0319f);
                        } else if (c0292c6 == c0292c8 && c0292c7.f3523f == null) {
                            int e3 = d - c0292c8.e();
                            c0293d2.K(e3 - c0293d2.k(), e3);
                            i(i4, c0293d2, c0319f);
                        } else if (z2 && !c0293d2.y()) {
                            f(i4, c0293d2, c0319f);
                        }
                    }
                } else if (i5 == 3 && c0293d2.f3586y >= 0 && c0293d2.f3585x >= 0 && (c0293d2.f3562g0 == 8 || (c0293d2.f3580s == 0 && c0293d2.f3546W == 0.0f))) {
                    if (!c0293d2.y() && !c0293d2.F && z2 && !c0293d2.y()) {
                        g(i4, c0293d, c0319f, c0293d2);
                    }
                }
            }
        }
        if (c0293d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3519a;
        if (hashSet2 != null && i3.f3521c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0292c c0292c9 = (C0292c) it2.next();
                C0293d c0293d3 = c0292c9.d;
                int i6 = i + 1;
                boolean a3 = a(c0293d3);
                if (c0293d3.z() && a3) {
                    C0294e.V(c0293d3, c0319f, new C0297b());
                }
                C0292c c0292c10 = c0293d3.f3533J;
                C0292c c0292c11 = c0293d3.f3535L;
                boolean z3 = (c0292c9 == c0292c10 && (c0292c3 = c0292c11.f3523f) != null && c0292c3.f3521c) || (c0292c9 == c0292c11 && (c0292c2 = c0292c10.f3523f) != null && c0292c2.f3521c);
                int i7 = c0293d3.f3577p0[1];
                if (i7 != 3 || a3) {
                    if (!c0293d3.z()) {
                        if (c0292c9 == c0292c10 && c0292c11.f3523f == null) {
                            int e4 = c0292c10.e() + d2;
                            c0293d3.K(e4, c0293d3.k() + e4);
                            i(i6, c0293d3, c0319f);
                        } else if (c0292c9 == c0292c11 && c0292c10.f3523f == null) {
                            int e5 = d2 - c0292c11.e();
                            c0293d3.K(e5 - c0293d3.k(), e5);
                            i(i6, c0293d3, c0319f);
                        } else if (z3 && !c0293d3.y()) {
                            f(i6, c0293d3, c0319f);
                        }
                    }
                } else if (i7 == 3 && c0293d3.f3586y >= 0 && c0293d3.f3585x >= 0) {
                    if (c0293d3.f3562g0 != 8) {
                        if (c0293d3.f3580s == 0) {
                            if (c0293d3.f3546W == 0.0f) {
                            }
                        }
                    }
                    if (!c0293d3.y() && !c0293d3.F && z3 && !c0293d3.y()) {
                        g(i6, c0293d, c0319f, c0293d3);
                    }
                }
            }
        }
        C0292c i8 = c0293d.i(6);
        if (i8.f3519a != null && i8.f3521c) {
            int d3 = i8.d();
            Iterator it3 = i8.f3519a.iterator();
            while (it3.hasNext()) {
                C0292c c0292c12 = (C0292c) it3.next();
                C0293d c0293d4 = c0292c12.d;
                int i9 = i + 1;
                boolean a4 = a(c0293d4);
                if (c0293d4.z() && a4) {
                    C0294e.V(c0293d4, c0319f, new C0297b());
                }
                if (c0293d4.f3577p0[1] != 3 || a4) {
                    if (!c0293d4.z() && c0292c12 == (c0292c = c0293d4.f3536M)) {
                        int e6 = c0292c12.e() + d3;
                        if (c0293d4.f3529E) {
                            int i10 = e6 - c0293d4.f3551a0;
                            int i11 = c0293d4.f3545V + i10;
                            c0293d4.f3549Z = i10;
                            c0293d4.f3533J.l(i10);
                            c0293d4.f3535L.l(i11);
                            c0292c.l(e6);
                            c0293d4.f3569l = true;
                        }
                        i(i9, c0293d4, c0319f);
                    }
                }
            }
        }
        c0293d.f3573n = true;
    }
}
