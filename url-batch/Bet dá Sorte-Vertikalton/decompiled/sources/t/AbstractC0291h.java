package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0280c;
import s.C0281d;
import s.C0282e;
import v.C0311f;

/* renamed from: t.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0291h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0285b f3804a = new C0285b();

    public static boolean a(C0281d c0281d) {
        int[] iArr = c0281d.f3654p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0281d c0281d2 = c0281d.f3621T;
        C0282e c0282e = c0281d2 != null ? (C0282e) c0281d2 : null;
        if (c0282e != null) {
            int i3 = c0282e.f3654p0[0];
        }
        if (c0282e != null) {
            int i4 = c0282e.f3654p0[1];
        }
        boolean z2 = i == 1 || c0281d.A() || i == 2 || (i == 3 && c0281d.f3656r == 0 && c0281d.f3624W == 0.0f && c0281d.t(0)) || (i == 3 && c0281d.f3656r == 1 && c0281d.u(0, c0281d.q()));
        boolean z3 = i2 == 1 || c0281d.B() || i2 == 2 || (i2 == 3 && c0281d.f3657s == 0 && c0281d.f3624W == 0.0f && c0281d.t(1)) || (i2 == 3 && c0281d.f3657s == 1 && c0281d.u(1, c0281d.k()));
        if (c0281d.f3624W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static C0297n b(C0281d c0281d, int i, ArrayList arrayList, C0297n c0297n) {
        int i2;
        int i3 = i == 0 ? c0281d.n0 : c0281d.f3652o0;
        if (i3 != -1 && (c0297n == null || i3 != c0297n.f3812b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0297n c0297n2 = (C0297n) arrayList.get(i4);
                if (c0297n2.f3812b == i3) {
                    if (c0297n != null) {
                        c0297n.c(i, c0297n2);
                        arrayList.remove(c0297n);
                    }
                    c0297n = c0297n2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c0297n;
        }
        if (c0297n == null) {
            if (c0281d instanceof s.i) {
                s.i iVar = (s.i) c0281d;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.f3739r0) {
                        i2 = -1;
                        break;
                    }
                    C0281d c0281d2 = iVar.f3738q0[i5];
                    if ((i == 0 && (i2 = c0281d2.n0) != -1) || (i == 1 && (i2 = c0281d2.f3652o0) != -1)) {
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
                        C0297n c0297n3 = (C0297n) arrayList.get(i6);
                        if (c0297n3.f3812b == i2) {
                            c0297n = c0297n3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c0297n == null) {
                c0297n = new C0297n();
                c0297n.f3811a = new ArrayList();
                c0297n.d = null;
                c0297n.f3814e = -1;
                int i7 = C0297n.f3810f;
                C0297n.f3810f = i7 + 1;
                c0297n.f3812b = i7;
                c0297n.f3813c = i;
            }
            arrayList.add(c0297n);
        }
        ArrayList arrayList2 = c0297n.f3811a;
        if (!arrayList2.contains(c0281d)) {
            arrayList2.add(c0281d);
            if (c0281d instanceof s.h) {
                s.h hVar = (s.h) c0281d;
                hVar.f3735t0.c(hVar.f3736u0 == 0 ? 1 : 0, arrayList, c0297n);
            }
            int i8 = c0297n.f3812b;
            if (i == 0) {
                c0281d.n0 = i8;
                c0281d.f3610I.c(i, arrayList, c0297n);
                c0281d.f3612K.c(i, arrayList, c0297n);
            } else {
                c0281d.f3652o0 = i8;
                c0281d.f3611J.c(i, arrayList, c0297n);
                c0281d.f3614M.c(i, arrayList, c0297n);
                c0281d.f3613L.c(i, arrayList, c0297n);
            }
            c0281d.f3617P.c(i, arrayList, c0297n);
        }
        return c0297n;
    }

    public static void c(int i, C0281d c0281d, C0311f c0311f, boolean z2) {
        C0280c c0280c;
        C0280c c0280c2;
        C0280c c0280c3;
        C0280c c0280c4;
        if (c0281d.f3648m) {
            return;
        }
        if (!(c0281d instanceof C0282e) && c0281d.z() && a(c0281d)) {
            C0282e.V(c0281d, c0311f, new C0285b());
        }
        C0280c i2 = c0281d.i(2);
        C0280c i3 = c0281d.i(4);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3597a;
        char c2 = 0;
        if (hashSet != null && i2.f3599c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0280c c0280c5 = (C0280c) it.next();
                C0281d c0281d2 = c0280c5.d;
                int i4 = i + 1;
                boolean a2 = a(c0281d2);
                if (c0281d2.z() && a2) {
                    C0282e.V(c0281d2, c0311f, new C0285b());
                }
                C0280c c0280c6 = c0281d2.f3610I;
                C0280c c0280c7 = c0281d2.f3612K;
                char c3 = ((c0280c5 == c0280c6 && (c0280c4 = c0280c7.f3601f) != null && c0280c4.f3599c) || (c0280c5 == c0280c7 && (c0280c3 = c0280c6.f3601f) != null && c0280c3.f3599c)) ? (char) 1 : c2;
                int i5 = c0281d2.f3654p0[c2];
                if (i5 != 3 || a2) {
                    if (!c0281d2.z()) {
                        if (c0280c5 == c0280c6 && c0280c7.f3601f == null) {
                            int e2 = c0280c6.e() + d;
                            c0281d2.J(e2, c0281d2.q() + e2);
                            c(i4, c0281d2, c0311f, z2);
                        } else if (c0280c5 == c0280c7 && c0280c6.f3601f == null) {
                            int e3 = d - c0280c7.e();
                            c0281d2.J(e3 - c0281d2.q(), e3);
                            c(i4, c0281d2, c0311f, z2);
                        } else if (c3 != 0 && !c0281d2.x()) {
                            d(i4, c0281d2, c0311f, z2);
                        }
                    }
                } else if (i5 == 3 && c0281d2.f3660v >= 0 && c0281d2.f3659u >= 0 && ((c0281d2.f3640g0 == 8 || (c0281d2.f3656r == 0 && c0281d2.f3624W == 0.0f)) && !c0281d2.x() && !c0281d2.F && c3 != 0 && !c0281d2.x())) {
                    e(i4, c0281d, c0311f, c0281d2, z2);
                }
                c2 = 0;
            }
        }
        if (c0281d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3597a;
        if (hashSet2 != null && i3.f3599c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0280c c0280c8 = (C0280c) it2.next();
                C0281d c0281d3 = c0280c8.d;
                int i6 = i + 1;
                boolean a3 = a(c0281d3);
                if (c0281d3.z() && a3) {
                    C0282e.V(c0281d3, c0311f, new C0285b());
                }
                C0280c c0280c9 = c0281d3.f3610I;
                C0280c c0280c10 = c0281d3.f3612K;
                boolean z3 = (c0280c8 == c0280c9 && (c0280c2 = c0280c10.f3601f) != null && c0280c2.f3599c) || (c0280c8 == c0280c10 && (c0280c = c0280c9.f3601f) != null && c0280c.f3599c);
                int i7 = c0281d3.f3654p0[0];
                if (i7 != 3 || a3) {
                    if (!c0281d3.z()) {
                        if (c0280c8 == c0280c9 && c0280c10.f3601f == null) {
                            int e4 = c0280c9.e() + d2;
                            c0281d3.J(e4, c0281d3.q() + e4);
                            c(i6, c0281d3, c0311f, z2);
                        } else if (c0280c8 == c0280c10 && c0280c9.f3601f == null) {
                            int e5 = d2 - c0280c10.e();
                            c0281d3.J(e5 - c0281d3.q(), e5);
                            c(i6, c0281d3, c0311f, z2);
                        } else if (z3 && !c0281d3.x()) {
                            d(i6, c0281d3, c0311f, z2);
                        }
                    }
                } else if (i7 == 3 && c0281d3.f3660v >= 0 && c0281d3.f3659u >= 0) {
                    if (c0281d3.f3640g0 != 8) {
                        if (c0281d3.f3656r == 0) {
                            if (c0281d3.f3624W == 0.0f) {
                            }
                        }
                    }
                    if (!c0281d3.x() && !c0281d3.F && z3 && !c0281d3.x()) {
                        e(i6, c0281d, c0311f, c0281d3, z2);
                    }
                }
            }
        }
        c0281d.f3648m = true;
    }

    public static void d(int i, C0281d c0281d, C0311f c0311f, boolean z2) {
        float f2 = c0281d.f3634d0;
        C0280c c0280c = c0281d.f3610I;
        int d = c0280c.f3601f.d();
        C0280c c0280c2 = c0281d.f3612K;
        int d2 = c0280c2.f3601f.d();
        int e2 = c0280c.e() + d;
        int e3 = d2 - c0280c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int q2 = c0281d.q();
        int i2 = (d2 - d) - q2;
        if (d > d2) {
            i2 = (d - d2) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d;
        int i4 = i3 + q2;
        if (d > d2) {
            i4 = i3 - q2;
        }
        c0281d.J(i3, i4);
        c(i + 1, c0281d, c0311f, z2);
    }

    public static void e(int i, C0281d c0281d, C0311f c0311f, C0281d c0281d2, boolean z2) {
        float f2 = c0281d2.f3634d0;
        C0280c c0280c = c0281d2.f3610I;
        int e2 = c0280c.e() + c0280c.f3601f.d();
        C0280c c0280c2 = c0281d2.f3612K;
        int d = c0280c2.f3601f.d() - c0280c2.e();
        if (d >= e2) {
            int q2 = c0281d2.q();
            if (c0281d2.f3640g0 != 8) {
                int i2 = c0281d2.f3656r;
                if (i2 == 2) {
                    q2 = (int) (c0281d2.f3634d0 * 0.5f * (c0281d instanceof C0282e ? c0281d.q() : c0281d.f3621T.q()));
                } else if (i2 == 0) {
                    q2 = d - e2;
                }
                q2 = Math.max(c0281d2.f3659u, q2);
                int i3 = c0281d2.f3660v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - q2)) + 0.5f));
            c0281d2.J(i4, q2 + i4);
            c(i + 1, c0281d2, c0311f, z2);
        }
    }

    public static void f(int i, C0281d c0281d, C0311f c0311f) {
        float f2 = c0281d.f3636e0;
        C0280c c0280c = c0281d.f3611J;
        int d = c0280c.f3601f.d();
        C0280c c0280c2 = c0281d.f3613L;
        int d2 = c0280c2.f3601f.d();
        int e2 = c0280c.e() + d;
        int e3 = d2 - c0280c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int k2 = c0281d.k();
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
        c0281d.K(i4, i5);
        i(i + 1, c0281d, c0311f);
    }

    public static void g(int i, C0281d c0281d, C0311f c0311f, C0281d c0281d2) {
        float f2 = c0281d2.f3636e0;
        C0280c c0280c = c0281d2.f3611J;
        int e2 = c0280c.e() + c0280c.f3601f.d();
        C0280c c0280c2 = c0281d2.f3613L;
        int d = c0280c2.f3601f.d() - c0280c2.e();
        if (d >= e2) {
            int k2 = c0281d2.k();
            if (c0281d2.f3640g0 != 8) {
                int i2 = c0281d2.f3657s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (c0281d instanceof C0282e ? c0281d.k() : c0281d.f3621T.k()));
                } else if (i2 == 0) {
                    k2 = d - e2;
                }
                k2 = Math.max(c0281d2.f3662x, k2);
                int i3 = c0281d2.f3663y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - k2)) + 0.5f));
            c0281d2.K(i4, k2 + i4);
            i(i + 1, c0281d2, c0311f);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, C0281d c0281d, C0311f c0311f) {
        C0280c c0280c;
        C0280c c0280c2;
        C0280c c0280c3;
        C0280c c0280c4;
        C0280c c0280c5;
        if (c0281d.f3650n) {
            return;
        }
        if (!(c0281d instanceof C0282e) && c0281d.z() && a(c0281d)) {
            C0282e.V(c0281d, c0311f, new C0285b());
        }
        C0280c i2 = c0281d.i(3);
        C0280c i3 = c0281d.i(5);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3597a;
        if (hashSet != null && i2.f3599c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0280c c0280c6 = (C0280c) it.next();
                C0281d c0281d2 = c0280c6.d;
                int i4 = i + 1;
                boolean a2 = a(c0281d2);
                if (c0281d2.z() && a2) {
                    C0282e.V(c0281d2, c0311f, new C0285b());
                }
                C0280c c0280c7 = c0281d2.f3611J;
                C0280c c0280c8 = c0281d2.f3613L;
                boolean z2 = (c0280c6 == c0280c7 && (c0280c5 = c0280c8.f3601f) != null && c0280c5.f3599c) || (c0280c6 == c0280c8 && (c0280c4 = c0280c7.f3601f) != null && c0280c4.f3599c);
                int i5 = c0281d2.f3654p0[1];
                if (i5 != 3 || a2) {
                    if (!c0281d2.z()) {
                        if (c0280c6 == c0280c7 && c0280c8.f3601f == null) {
                            int e2 = c0280c7.e() + d;
                            c0281d2.K(e2, c0281d2.k() + e2);
                            i(i4, c0281d2, c0311f);
                        } else if (c0280c6 == c0280c8 && c0280c7.f3601f == null) {
                            int e3 = d - c0280c8.e();
                            c0281d2.K(e3 - c0281d2.k(), e3);
                            i(i4, c0281d2, c0311f);
                        } else if (z2 && !c0281d2.y()) {
                            f(i4, c0281d2, c0311f);
                        }
                    }
                } else if (i5 == 3 && c0281d2.f3663y >= 0 && c0281d2.f3662x >= 0 && (c0281d2.f3640g0 == 8 || (c0281d2.f3657s == 0 && c0281d2.f3624W == 0.0f))) {
                    if (!c0281d2.y() && !c0281d2.F && z2 && !c0281d2.y()) {
                        g(i4, c0281d, c0311f, c0281d2);
                    }
                }
            }
        }
        if (c0281d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3597a;
        if (hashSet2 != null && i3.f3599c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0280c c0280c9 = (C0280c) it2.next();
                C0281d c0281d3 = c0280c9.d;
                int i6 = i + 1;
                boolean a3 = a(c0281d3);
                if (c0281d3.z() && a3) {
                    C0282e.V(c0281d3, c0311f, new C0285b());
                }
                C0280c c0280c10 = c0281d3.f3611J;
                C0280c c0280c11 = c0281d3.f3613L;
                boolean z3 = (c0280c9 == c0280c10 && (c0280c3 = c0280c11.f3601f) != null && c0280c3.f3599c) || (c0280c9 == c0280c11 && (c0280c2 = c0280c10.f3601f) != null && c0280c2.f3599c);
                int i7 = c0281d3.f3654p0[1];
                if (i7 != 3 || a3) {
                    if (!c0281d3.z()) {
                        if (c0280c9 == c0280c10 && c0280c11.f3601f == null) {
                            int e4 = c0280c10.e() + d2;
                            c0281d3.K(e4, c0281d3.k() + e4);
                            i(i6, c0281d3, c0311f);
                        } else if (c0280c9 == c0280c11 && c0280c10.f3601f == null) {
                            int e5 = d2 - c0280c11.e();
                            c0281d3.K(e5 - c0281d3.k(), e5);
                            i(i6, c0281d3, c0311f);
                        } else if (z3 && !c0281d3.y()) {
                            f(i6, c0281d3, c0311f);
                        }
                    }
                } else if (i7 == 3 && c0281d3.f3663y >= 0 && c0281d3.f3662x >= 0) {
                    if (c0281d3.f3640g0 != 8) {
                        if (c0281d3.f3657s == 0) {
                            if (c0281d3.f3624W == 0.0f) {
                            }
                        }
                    }
                    if (!c0281d3.y() && !c0281d3.F && z3 && !c0281d3.y()) {
                        g(i6, c0281d, c0311f, c0281d3);
                    }
                }
            }
        }
        C0280c i8 = c0281d.i(6);
        if (i8.f3597a != null && i8.f3599c) {
            int d3 = i8.d();
            Iterator it3 = i8.f3597a.iterator();
            while (it3.hasNext()) {
                C0280c c0280c12 = (C0280c) it3.next();
                C0281d c0281d4 = c0280c12.d;
                int i9 = i + 1;
                boolean a4 = a(c0281d4);
                if (c0281d4.z() && a4) {
                    C0282e.V(c0281d4, c0311f, new C0285b());
                }
                if (c0281d4.f3654p0[1] != 3 || a4) {
                    if (!c0281d4.z() && c0280c12 == (c0280c = c0281d4.f3614M)) {
                        int e6 = c0280c12.e() + d3;
                        if (c0281d4.f3607E) {
                            int i10 = e6 - c0281d4.f3629a0;
                            int i11 = c0281d4.f3623V + i10;
                            c0281d4.f3627Z = i10;
                            c0281d4.f3611J.l(i10);
                            c0281d4.f3613L.l(i11);
                            c0280c.l(e6);
                            c0281d4.f3646l = true;
                        }
                        i(i9, c0281d4, c0311f);
                    }
                }
            }
        }
        c0281d.f3650n = true;
    }
}
