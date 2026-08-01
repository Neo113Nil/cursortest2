package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0324c;
import s.C0325d;
import s.C0326e;
import v.C0350f;

/* renamed from: t.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0335h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0329b f4179a = new C0329b();

    public static boolean a(C0325d c0325d) {
        int[] iArr = c0325d.f4057p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0325d c0325d2 = c0325d.f4023T;
        C0326e c0326e = c0325d2 != null ? (C0326e) c0325d2 : null;
        if (c0326e != null) {
            int i3 = c0326e.f4057p0[0];
        }
        if (c0326e != null) {
            int i4 = c0326e.f4057p0[1];
        }
        boolean z2 = i == 1 || c0325d.A() || i == 2 || (i == 3 && c0325d.f4059r == 0 && c0325d.f4026W == 0.0f && c0325d.t(0)) || (i == 3 && c0325d.f4059r == 1 && c0325d.u(0, c0325d.q()));
        boolean z3 = i2 == 1 || c0325d.B() || i2 == 2 || (i2 == 3 && c0325d.f4060s == 0 && c0325d.f4026W == 0.0f && c0325d.t(1)) || (i2 == 3 && c0325d.f4060s == 1 && c0325d.u(1, c0325d.k()));
        if (c0325d.f4026W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static C0341n b(C0325d c0325d, int i, ArrayList arrayList, C0341n c0341n) {
        int i2;
        int i3 = i == 0 ? c0325d.f4053n0 : c0325d.f4055o0;
        if (i3 != -1 && (c0341n == null || i3 != c0341n.f4187b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0341n c0341n2 = (C0341n) arrayList.get(i4);
                if (c0341n2.f4187b == i3) {
                    if (c0341n != null) {
                        c0341n.c(i, c0341n2);
                        arrayList.remove(c0341n);
                    }
                    c0341n = c0341n2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c0341n;
        }
        if (c0341n == null) {
            if (c0325d instanceof s.i) {
                s.i iVar = (s.i) c0325d;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.f4143r0) {
                        i2 = -1;
                        break;
                    }
                    C0325d c0325d2 = iVar.f4142q0[i5];
                    if ((i == 0 && (i2 = c0325d2.f4053n0) != -1) || (i == 1 && (i2 = c0325d2.f4055o0) != -1)) {
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
                        C0341n c0341n3 = (C0341n) arrayList.get(i6);
                        if (c0341n3.f4187b == i2) {
                            c0341n = c0341n3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c0341n == null) {
                c0341n = new C0341n();
                c0341n.f4186a = new ArrayList();
                c0341n.f4189d = null;
                c0341n.f4190e = -1;
                int i7 = C0341n.f4185f;
                C0341n.f4185f = i7 + 1;
                c0341n.f4187b = i7;
                c0341n.f4188c = i;
            }
            arrayList.add(c0341n);
        }
        ArrayList arrayList2 = c0341n.f4186a;
        if (!arrayList2.contains(c0325d)) {
            arrayList2.add(c0325d);
            if (c0325d instanceof s.h) {
                s.h hVar = (s.h) c0325d;
                hVar.f4139t0.c(hVar.f4140u0 == 0 ? 1 : 0, arrayList, c0341n);
            }
            int i8 = c0341n.f4187b;
            if (i == 0) {
                c0325d.f4053n0 = i8;
                c0325d.f4012I.c(i, arrayList, c0341n);
                c0325d.f4014K.c(i, arrayList, c0341n);
            } else {
                c0325d.f4055o0 = i8;
                c0325d.f4013J.c(i, arrayList, c0341n);
                c0325d.f4016M.c(i, arrayList, c0341n);
                c0325d.f4015L.c(i, arrayList, c0341n);
            }
            c0325d.f4019P.c(i, arrayList, c0341n);
        }
        return c0341n;
    }

    public static void c(int i, C0325d c0325d, C0350f c0350f, boolean z2) {
        C0324c c0324c;
        C0324c c0324c2;
        C0324c c0324c3;
        C0324c c0324c4;
        if (c0325d.f4051m) {
            return;
        }
        if (!(c0325d instanceof C0326e) && c0325d.z() && a(c0325d)) {
            C0326e.V(c0325d, c0350f, new C0329b());
        }
        C0324c i2 = c0325d.i(2);
        C0324c i3 = c0325d.i(4);
        int d2 = i2.d();
        int d3 = i3.d();
        HashSet hashSet = i2.f3998a;
        char c2 = 0;
        if (hashSet != null && i2.f4000c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0324c c0324c5 = (C0324c) it.next();
                C0325d c0325d2 = c0324c5.f4001d;
                int i4 = i + 1;
                boolean a2 = a(c0325d2);
                if (c0325d2.z() && a2) {
                    C0326e.V(c0325d2, c0350f, new C0329b());
                }
                C0324c c0324c6 = c0325d2.f4012I;
                C0324c c0324c7 = c0325d2.f4014K;
                char c3 = ((c0324c5 == c0324c6 && (c0324c4 = c0324c7.f4003f) != null && c0324c4.f4000c) || (c0324c5 == c0324c7 && (c0324c3 = c0324c6.f4003f) != null && c0324c3.f4000c)) ? (char) 1 : c2;
                int i5 = c0325d2.f4057p0[c2];
                if (i5 != 3 || a2) {
                    if (!c0325d2.z()) {
                        if (c0324c5 == c0324c6 && c0324c7.f4003f == null) {
                            int e2 = c0324c6.e() + d2;
                            c0325d2.J(e2, c0325d2.q() + e2);
                            c(i4, c0325d2, c0350f, z2);
                        } else if (c0324c5 == c0324c7 && c0324c6.f4003f == null) {
                            int e3 = d2 - c0324c7.e();
                            c0325d2.J(e3 - c0325d2.q(), e3);
                            c(i4, c0325d2, c0350f, z2);
                        } else if (c3 != 0 && !c0325d2.x()) {
                            d(i4, c0325d2, c0350f, z2);
                        }
                    }
                } else if (i5 == 3 && c0325d2.f4063v >= 0 && c0325d2.f4062u >= 0 && ((c0325d2.f4043g0 == 8 || (c0325d2.f4059r == 0 && c0325d2.f4026W == 0.0f)) && !c0325d2.x() && !c0325d2.F && c3 != 0 && !c0325d2.x())) {
                    e(i4, c0325d, c0350f, c0325d2, z2);
                }
                c2 = 0;
            }
        }
        if (c0325d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3998a;
        if (hashSet2 != null && i3.f4000c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0324c c0324c8 = (C0324c) it2.next();
                C0325d c0325d3 = c0324c8.f4001d;
                int i6 = i + 1;
                boolean a3 = a(c0325d3);
                if (c0325d3.z() && a3) {
                    C0326e.V(c0325d3, c0350f, new C0329b());
                }
                C0324c c0324c9 = c0325d3.f4012I;
                C0324c c0324c10 = c0325d3.f4014K;
                boolean z3 = (c0324c8 == c0324c9 && (c0324c2 = c0324c10.f4003f) != null && c0324c2.f4000c) || (c0324c8 == c0324c10 && (c0324c = c0324c9.f4003f) != null && c0324c.f4000c);
                int i7 = c0325d3.f4057p0[0];
                if (i7 != 3 || a3) {
                    if (!c0325d3.z()) {
                        if (c0324c8 == c0324c9 && c0324c10.f4003f == null) {
                            int e4 = c0324c9.e() + d3;
                            c0325d3.J(e4, c0325d3.q() + e4);
                            c(i6, c0325d3, c0350f, z2);
                        } else if (c0324c8 == c0324c10 && c0324c9.f4003f == null) {
                            int e5 = d3 - c0324c10.e();
                            c0325d3.J(e5 - c0325d3.q(), e5);
                            c(i6, c0325d3, c0350f, z2);
                        } else if (z3 && !c0325d3.x()) {
                            d(i6, c0325d3, c0350f, z2);
                        }
                    }
                } else if (i7 == 3 && c0325d3.f4063v >= 0 && c0325d3.f4062u >= 0) {
                    if (c0325d3.f4043g0 != 8) {
                        if (c0325d3.f4059r == 0) {
                            if (c0325d3.f4026W == 0.0f) {
                            }
                        }
                    }
                    if (!c0325d3.x() && !c0325d3.F && z3 && !c0325d3.x()) {
                        e(i6, c0325d, c0350f, c0325d3, z2);
                    }
                }
            }
        }
        c0325d.f4051m = true;
    }

    public static void d(int i, C0325d c0325d, C0350f c0350f, boolean z2) {
        float f2 = c0325d.f4037d0;
        C0324c c0324c = c0325d.f4012I;
        int d2 = c0324c.f4003f.d();
        C0324c c0324c2 = c0325d.f4014K;
        int d3 = c0324c2.f4003f.d();
        int e2 = c0324c.e() + d2;
        int e3 = d3 - c0324c2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int q2 = c0325d.q();
        int i2 = (d3 - d2) - q2;
        if (d2 > d3) {
            i2 = (d2 - d3) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d2;
        int i4 = i3 + q2;
        if (d2 > d3) {
            i4 = i3 - q2;
        }
        c0325d.J(i3, i4);
        c(i + 1, c0325d, c0350f, z2);
    }

    public static void e(int i, C0325d c0325d, C0350f c0350f, C0325d c0325d2, boolean z2) {
        float f2 = c0325d2.f4037d0;
        C0324c c0324c = c0325d2.f4012I;
        int e2 = c0324c.e() + c0324c.f4003f.d();
        C0324c c0324c2 = c0325d2.f4014K;
        int d2 = c0324c2.f4003f.d() - c0324c2.e();
        if (d2 >= e2) {
            int q2 = c0325d2.q();
            if (c0325d2.f4043g0 != 8) {
                int i2 = c0325d2.f4059r;
                if (i2 == 2) {
                    q2 = (int) (c0325d2.f4037d0 * 0.5f * (c0325d instanceof C0326e ? c0325d.q() : c0325d.f4023T.q()));
                } else if (i2 == 0) {
                    q2 = d2 - e2;
                }
                q2 = Math.max(c0325d2.f4062u, q2);
                int i3 = c0325d2.f4063v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d2 - e2) - q2)) + 0.5f));
            c0325d2.J(i4, q2 + i4);
            c(i + 1, c0325d2, c0350f, z2);
        }
    }

    public static void f(int i, C0325d c0325d, C0350f c0350f) {
        float f2 = c0325d.f4039e0;
        C0324c c0324c = c0325d.f4013J;
        int d2 = c0324c.f4003f.d();
        C0324c c0324c2 = c0325d.f4015L;
        int d3 = c0324c2.f4003f.d();
        int e2 = c0324c.e() + d2;
        int e3 = d3 - c0324c2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int k2 = c0325d.k();
        int i2 = (d3 - d2) - k2;
        if (d2 > d3) {
            i2 = (d2 - d3) - k2;
        }
        int i3 = (int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2);
        int i4 = d2 + i3;
        int i5 = i4 + k2;
        if (d2 > d3) {
            i4 = d2 - i3;
            i5 = i4 - k2;
        }
        c0325d.K(i4, i5);
        i(i + 1, c0325d, c0350f);
    }

    public static void g(int i, C0325d c0325d, C0350f c0350f, C0325d c0325d2) {
        float f2 = c0325d2.f4039e0;
        C0324c c0324c = c0325d2.f4013J;
        int e2 = c0324c.e() + c0324c.f4003f.d();
        C0324c c0324c2 = c0325d2.f4015L;
        int d2 = c0324c2.f4003f.d() - c0324c2.e();
        if (d2 >= e2) {
            int k2 = c0325d2.k();
            if (c0325d2.f4043g0 != 8) {
                int i2 = c0325d2.f4060s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (c0325d instanceof C0326e ? c0325d.k() : c0325d.f4023T.k()));
                } else if (i2 == 0) {
                    k2 = d2 - e2;
                }
                k2 = Math.max(c0325d2.f4065x, k2);
                int i3 = c0325d2.f4066y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d2 - e2) - k2)) + 0.5f));
            c0325d2.K(i4, k2 + i4);
            i(i + 1, c0325d2, c0350f);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, C0325d c0325d, C0350f c0350f) {
        C0324c c0324c;
        C0324c c0324c2;
        C0324c c0324c3;
        C0324c c0324c4;
        C0324c c0324c5;
        if (c0325d.f4052n) {
            return;
        }
        if (!(c0325d instanceof C0326e) && c0325d.z() && a(c0325d)) {
            C0326e.V(c0325d, c0350f, new C0329b());
        }
        C0324c i2 = c0325d.i(3);
        C0324c i3 = c0325d.i(5);
        int d2 = i2.d();
        int d3 = i3.d();
        HashSet hashSet = i2.f3998a;
        if (hashSet != null && i2.f4000c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0324c c0324c6 = (C0324c) it.next();
                C0325d c0325d2 = c0324c6.f4001d;
                int i4 = i + 1;
                boolean a2 = a(c0325d2);
                if (c0325d2.z() && a2) {
                    C0326e.V(c0325d2, c0350f, new C0329b());
                }
                C0324c c0324c7 = c0325d2.f4013J;
                C0324c c0324c8 = c0325d2.f4015L;
                boolean z2 = (c0324c6 == c0324c7 && (c0324c5 = c0324c8.f4003f) != null && c0324c5.f4000c) || (c0324c6 == c0324c8 && (c0324c4 = c0324c7.f4003f) != null && c0324c4.f4000c);
                int i5 = c0325d2.f4057p0[1];
                if (i5 != 3 || a2) {
                    if (!c0325d2.z()) {
                        if (c0324c6 == c0324c7 && c0324c8.f4003f == null) {
                            int e2 = c0324c7.e() + d2;
                            c0325d2.K(e2, c0325d2.k() + e2);
                            i(i4, c0325d2, c0350f);
                        } else if (c0324c6 == c0324c8 && c0324c7.f4003f == null) {
                            int e3 = d2 - c0324c8.e();
                            c0325d2.K(e3 - c0325d2.k(), e3);
                            i(i4, c0325d2, c0350f);
                        } else if (z2 && !c0325d2.y()) {
                            f(i4, c0325d2, c0350f);
                        }
                    }
                } else if (i5 == 3 && c0325d2.f4066y >= 0 && c0325d2.f4065x >= 0 && (c0325d2.f4043g0 == 8 || (c0325d2.f4060s == 0 && c0325d2.f4026W == 0.0f))) {
                    if (!c0325d2.y() && !c0325d2.F && z2 && !c0325d2.y()) {
                        g(i4, c0325d, c0350f, c0325d2);
                    }
                }
            }
        }
        if (c0325d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3998a;
        if (hashSet2 != null && i3.f4000c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0324c c0324c9 = (C0324c) it2.next();
                C0325d c0325d3 = c0324c9.f4001d;
                int i6 = i + 1;
                boolean a3 = a(c0325d3);
                if (c0325d3.z() && a3) {
                    C0326e.V(c0325d3, c0350f, new C0329b());
                }
                C0324c c0324c10 = c0325d3.f4013J;
                C0324c c0324c11 = c0325d3.f4015L;
                boolean z3 = (c0324c9 == c0324c10 && (c0324c3 = c0324c11.f4003f) != null && c0324c3.f4000c) || (c0324c9 == c0324c11 && (c0324c2 = c0324c10.f4003f) != null && c0324c2.f4000c);
                int i7 = c0325d3.f4057p0[1];
                if (i7 != 3 || a3) {
                    if (!c0325d3.z()) {
                        if (c0324c9 == c0324c10 && c0324c11.f4003f == null) {
                            int e4 = c0324c10.e() + d3;
                            c0325d3.K(e4, c0325d3.k() + e4);
                            i(i6, c0325d3, c0350f);
                        } else if (c0324c9 == c0324c11 && c0324c10.f4003f == null) {
                            int e5 = d3 - c0324c11.e();
                            c0325d3.K(e5 - c0325d3.k(), e5);
                            i(i6, c0325d3, c0350f);
                        } else if (z3 && !c0325d3.y()) {
                            f(i6, c0325d3, c0350f);
                        }
                    }
                } else if (i7 == 3 && c0325d3.f4066y >= 0 && c0325d3.f4065x >= 0) {
                    if (c0325d3.f4043g0 != 8) {
                        if (c0325d3.f4060s == 0) {
                            if (c0325d3.f4026W == 0.0f) {
                            }
                        }
                    }
                    if (!c0325d3.y() && !c0325d3.F && z3 && !c0325d3.y()) {
                        g(i6, c0325d, c0350f, c0325d3);
                    }
                }
            }
        }
        C0324c i8 = c0325d.i(6);
        if (i8.f3998a != null && i8.f4000c) {
            int d4 = i8.d();
            Iterator it3 = i8.f3998a.iterator();
            while (it3.hasNext()) {
                C0324c c0324c12 = (C0324c) it3.next();
                C0325d c0325d4 = c0324c12.f4001d;
                int i9 = i + 1;
                boolean a4 = a(c0325d4);
                if (c0325d4.z() && a4) {
                    C0326e.V(c0325d4, c0350f, new C0329b());
                }
                if (c0325d4.f4057p0[1] != 3 || a4) {
                    if (!c0325d4.z() && c0324c12 == (c0324c = c0325d4.f4016M)) {
                        int e6 = c0324c12.e() + d4;
                        if (c0325d4.f4009E) {
                            int i10 = e6 - c0325d4.f4031a0;
                            int i11 = c0325d4.f4025V + i10;
                            c0325d4.f4029Z = i10;
                            c0325d4.f4013J.l(i10);
                            c0325d4.f4015L.l(i11);
                            c0324c.l(e6);
                            c0325d4.f4049l = true;
                        }
                        i(i9, c0325d4, c0350f);
                    }
                }
            }
        }
        c0325d.f4052n = true;
    }
}
