package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0326c;
import s.C0327d;
import s.C0328e;
import v.C0352f;

/* renamed from: t.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0337h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0331b f4183a = new C0331b();

    public static boolean a(C0327d c0327d) {
        int[] iArr = c0327d.f4061p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0327d c0327d2 = c0327d.f4027T;
        C0328e c0328e = c0327d2 != null ? (C0328e) c0327d2 : null;
        if (c0328e != null) {
            int i3 = c0328e.f4061p0[0];
        }
        if (c0328e != null) {
            int i4 = c0328e.f4061p0[1];
        }
        boolean z2 = i == 1 || c0327d.A() || i == 2 || (i == 3 && c0327d.f4063r == 0 && c0327d.f4030W == 0.0f && c0327d.t(0)) || (i == 3 && c0327d.f4063r == 1 && c0327d.u(0, c0327d.q()));
        boolean z3 = i2 == 1 || c0327d.B() || i2 == 2 || (i2 == 3 && c0327d.f4064s == 0 && c0327d.f4030W == 0.0f && c0327d.t(1)) || (i2 == 3 && c0327d.f4064s == 1 && c0327d.u(1, c0327d.k()));
        if (c0327d.f4030W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static C0343n b(C0327d c0327d, int i, ArrayList arrayList, C0343n c0343n) {
        int i2;
        int i3 = i == 0 ? c0327d.f4057n0 : c0327d.f4059o0;
        if (i3 != -1 && (c0343n == null || i3 != c0343n.f4191b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0343n c0343n2 = (C0343n) arrayList.get(i4);
                if (c0343n2.f4191b == i3) {
                    if (c0343n != null) {
                        c0343n.c(i, c0343n2);
                        arrayList.remove(c0343n);
                    }
                    c0343n = c0343n2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c0343n;
        }
        if (c0343n == null) {
            if (c0327d instanceof s.i) {
                s.i iVar = (s.i) c0327d;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.f4147r0) {
                        i2 = -1;
                        break;
                    }
                    C0327d c0327d2 = iVar.f4146q0[i5];
                    if ((i == 0 && (i2 = c0327d2.f4057n0) != -1) || (i == 1 && (i2 = c0327d2.f4059o0) != -1)) {
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
                        C0343n c0343n3 = (C0343n) arrayList.get(i6);
                        if (c0343n3.f4191b == i2) {
                            c0343n = c0343n3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c0343n == null) {
                c0343n = new C0343n();
                c0343n.f4190a = new ArrayList();
                c0343n.f4193d = null;
                c0343n.f4194e = -1;
                int i7 = C0343n.f4189f;
                C0343n.f4189f = i7 + 1;
                c0343n.f4191b = i7;
                c0343n.f4192c = i;
            }
            arrayList.add(c0343n);
        }
        ArrayList arrayList2 = c0343n.f4190a;
        if (!arrayList2.contains(c0327d)) {
            arrayList2.add(c0327d);
            if (c0327d instanceof s.h) {
                s.h hVar = (s.h) c0327d;
                hVar.f4143t0.c(hVar.f4144u0 == 0 ? 1 : 0, arrayList, c0343n);
            }
            int i8 = c0343n.f4191b;
            if (i == 0) {
                c0327d.f4057n0 = i8;
                c0327d.f4016I.c(i, arrayList, c0343n);
                c0327d.f4018K.c(i, arrayList, c0343n);
            } else {
                c0327d.f4059o0 = i8;
                c0327d.f4017J.c(i, arrayList, c0343n);
                c0327d.f4020M.c(i, arrayList, c0343n);
                c0327d.f4019L.c(i, arrayList, c0343n);
            }
            c0327d.f4023P.c(i, arrayList, c0343n);
        }
        return c0343n;
    }

    public static void c(int i, C0327d c0327d, C0352f c0352f, boolean z2) {
        C0326c c0326c;
        C0326c c0326c2;
        C0326c c0326c3;
        C0326c c0326c4;
        if (c0327d.f4055m) {
            return;
        }
        if (!(c0327d instanceof C0328e) && c0327d.z() && a(c0327d)) {
            C0328e.V(c0327d, c0352f, new C0331b());
        }
        C0326c i2 = c0327d.i(2);
        C0326c i3 = c0327d.i(4);
        int d2 = i2.d();
        int d3 = i3.d();
        HashSet hashSet = i2.f4002a;
        char c2 = 0;
        if (hashSet != null && i2.f4004c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0326c c0326c5 = (C0326c) it.next();
                C0327d c0327d2 = c0326c5.f4005d;
                int i4 = i + 1;
                boolean a2 = a(c0327d2);
                if (c0327d2.z() && a2) {
                    C0328e.V(c0327d2, c0352f, new C0331b());
                }
                C0326c c0326c6 = c0327d2.f4016I;
                C0326c c0326c7 = c0327d2.f4018K;
                char c3 = ((c0326c5 == c0326c6 && (c0326c4 = c0326c7.f4007f) != null && c0326c4.f4004c) || (c0326c5 == c0326c7 && (c0326c3 = c0326c6.f4007f) != null && c0326c3.f4004c)) ? (char) 1 : c2;
                int i5 = c0327d2.f4061p0[c2];
                if (i5 != 3 || a2) {
                    if (!c0327d2.z()) {
                        if (c0326c5 == c0326c6 && c0326c7.f4007f == null) {
                            int e2 = c0326c6.e() + d2;
                            c0327d2.J(e2, c0327d2.q() + e2);
                            c(i4, c0327d2, c0352f, z2);
                        } else if (c0326c5 == c0326c7 && c0326c6.f4007f == null) {
                            int e3 = d2 - c0326c7.e();
                            c0327d2.J(e3 - c0327d2.q(), e3);
                            c(i4, c0327d2, c0352f, z2);
                        } else if (c3 != 0 && !c0327d2.x()) {
                            d(i4, c0327d2, c0352f, z2);
                        }
                    }
                } else if (i5 == 3 && c0327d2.f4067v >= 0 && c0327d2.f4066u >= 0 && ((c0327d2.f4047g0 == 8 || (c0327d2.f4063r == 0 && c0327d2.f4030W == 0.0f)) && !c0327d2.x() && !c0327d2.F && c3 != 0 && !c0327d2.x())) {
                    e(i4, c0327d, c0352f, c0327d2, z2);
                }
                c2 = 0;
            }
        }
        if (c0327d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f4002a;
        if (hashSet2 != null && i3.f4004c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0326c c0326c8 = (C0326c) it2.next();
                C0327d c0327d3 = c0326c8.f4005d;
                int i6 = i + 1;
                boolean a3 = a(c0327d3);
                if (c0327d3.z() && a3) {
                    C0328e.V(c0327d3, c0352f, new C0331b());
                }
                C0326c c0326c9 = c0327d3.f4016I;
                C0326c c0326c10 = c0327d3.f4018K;
                boolean z3 = (c0326c8 == c0326c9 && (c0326c2 = c0326c10.f4007f) != null && c0326c2.f4004c) || (c0326c8 == c0326c10 && (c0326c = c0326c9.f4007f) != null && c0326c.f4004c);
                int i7 = c0327d3.f4061p0[0];
                if (i7 != 3 || a3) {
                    if (!c0327d3.z()) {
                        if (c0326c8 == c0326c9 && c0326c10.f4007f == null) {
                            int e4 = c0326c9.e() + d3;
                            c0327d3.J(e4, c0327d3.q() + e4);
                            c(i6, c0327d3, c0352f, z2);
                        } else if (c0326c8 == c0326c10 && c0326c9.f4007f == null) {
                            int e5 = d3 - c0326c10.e();
                            c0327d3.J(e5 - c0327d3.q(), e5);
                            c(i6, c0327d3, c0352f, z2);
                        } else if (z3 && !c0327d3.x()) {
                            d(i6, c0327d3, c0352f, z2);
                        }
                    }
                } else if (i7 == 3 && c0327d3.f4067v >= 0 && c0327d3.f4066u >= 0) {
                    if (c0327d3.f4047g0 != 8) {
                        if (c0327d3.f4063r == 0) {
                            if (c0327d3.f4030W == 0.0f) {
                            }
                        }
                    }
                    if (!c0327d3.x() && !c0327d3.F && z3 && !c0327d3.x()) {
                        e(i6, c0327d, c0352f, c0327d3, z2);
                    }
                }
            }
        }
        c0327d.f4055m = true;
    }

    public static void d(int i, C0327d c0327d, C0352f c0352f, boolean z2) {
        float f2 = c0327d.f4041d0;
        C0326c c0326c = c0327d.f4016I;
        int d2 = c0326c.f4007f.d();
        C0326c c0326c2 = c0327d.f4018K;
        int d3 = c0326c2.f4007f.d();
        int e2 = c0326c.e() + d2;
        int e3 = d3 - c0326c2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int q2 = c0327d.q();
        int i2 = (d3 - d2) - q2;
        if (d2 > d3) {
            i2 = (d2 - d3) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d2;
        int i4 = i3 + q2;
        if (d2 > d3) {
            i4 = i3 - q2;
        }
        c0327d.J(i3, i4);
        c(i + 1, c0327d, c0352f, z2);
    }

    public static void e(int i, C0327d c0327d, C0352f c0352f, C0327d c0327d2, boolean z2) {
        float f2 = c0327d2.f4041d0;
        C0326c c0326c = c0327d2.f4016I;
        int e2 = c0326c.e() + c0326c.f4007f.d();
        C0326c c0326c2 = c0327d2.f4018K;
        int d2 = c0326c2.f4007f.d() - c0326c2.e();
        if (d2 >= e2) {
            int q2 = c0327d2.q();
            if (c0327d2.f4047g0 != 8) {
                int i2 = c0327d2.f4063r;
                if (i2 == 2) {
                    q2 = (int) (c0327d2.f4041d0 * 0.5f * (c0327d instanceof C0328e ? c0327d.q() : c0327d.f4027T.q()));
                } else if (i2 == 0) {
                    q2 = d2 - e2;
                }
                q2 = Math.max(c0327d2.f4066u, q2);
                int i3 = c0327d2.f4067v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d2 - e2) - q2)) + 0.5f));
            c0327d2.J(i4, q2 + i4);
            c(i + 1, c0327d2, c0352f, z2);
        }
    }

    public static void f(int i, C0327d c0327d, C0352f c0352f) {
        float f2 = c0327d.f4043e0;
        C0326c c0326c = c0327d.f4017J;
        int d2 = c0326c.f4007f.d();
        C0326c c0326c2 = c0327d.f4019L;
        int d3 = c0326c2.f4007f.d();
        int e2 = c0326c.e() + d2;
        int e3 = d3 - c0326c2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int k2 = c0327d.k();
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
        c0327d.K(i4, i5);
        i(i + 1, c0327d, c0352f);
    }

    public static void g(int i, C0327d c0327d, C0352f c0352f, C0327d c0327d2) {
        float f2 = c0327d2.f4043e0;
        C0326c c0326c = c0327d2.f4017J;
        int e2 = c0326c.e() + c0326c.f4007f.d();
        C0326c c0326c2 = c0327d2.f4019L;
        int d2 = c0326c2.f4007f.d() - c0326c2.e();
        if (d2 >= e2) {
            int k2 = c0327d2.k();
            if (c0327d2.f4047g0 != 8) {
                int i2 = c0327d2.f4064s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (c0327d instanceof C0328e ? c0327d.k() : c0327d.f4027T.k()));
                } else if (i2 == 0) {
                    k2 = d2 - e2;
                }
                k2 = Math.max(c0327d2.f4069x, k2);
                int i3 = c0327d2.f4070y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d2 - e2) - k2)) + 0.5f));
            c0327d2.K(i4, k2 + i4);
            i(i + 1, c0327d2, c0352f);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, C0327d c0327d, C0352f c0352f) {
        C0326c c0326c;
        C0326c c0326c2;
        C0326c c0326c3;
        C0326c c0326c4;
        C0326c c0326c5;
        if (c0327d.f4056n) {
            return;
        }
        if (!(c0327d instanceof C0328e) && c0327d.z() && a(c0327d)) {
            C0328e.V(c0327d, c0352f, new C0331b());
        }
        C0326c i2 = c0327d.i(3);
        C0326c i3 = c0327d.i(5);
        int d2 = i2.d();
        int d3 = i3.d();
        HashSet hashSet = i2.f4002a;
        if (hashSet != null && i2.f4004c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0326c c0326c6 = (C0326c) it.next();
                C0327d c0327d2 = c0326c6.f4005d;
                int i4 = i + 1;
                boolean a2 = a(c0327d2);
                if (c0327d2.z() && a2) {
                    C0328e.V(c0327d2, c0352f, new C0331b());
                }
                C0326c c0326c7 = c0327d2.f4017J;
                C0326c c0326c8 = c0327d2.f4019L;
                boolean z2 = (c0326c6 == c0326c7 && (c0326c5 = c0326c8.f4007f) != null && c0326c5.f4004c) || (c0326c6 == c0326c8 && (c0326c4 = c0326c7.f4007f) != null && c0326c4.f4004c);
                int i5 = c0327d2.f4061p0[1];
                if (i5 != 3 || a2) {
                    if (!c0327d2.z()) {
                        if (c0326c6 == c0326c7 && c0326c8.f4007f == null) {
                            int e2 = c0326c7.e() + d2;
                            c0327d2.K(e2, c0327d2.k() + e2);
                            i(i4, c0327d2, c0352f);
                        } else if (c0326c6 == c0326c8 && c0326c7.f4007f == null) {
                            int e3 = d2 - c0326c8.e();
                            c0327d2.K(e3 - c0327d2.k(), e3);
                            i(i4, c0327d2, c0352f);
                        } else if (z2 && !c0327d2.y()) {
                            f(i4, c0327d2, c0352f);
                        }
                    }
                } else if (i5 == 3 && c0327d2.f4070y >= 0 && c0327d2.f4069x >= 0 && (c0327d2.f4047g0 == 8 || (c0327d2.f4064s == 0 && c0327d2.f4030W == 0.0f))) {
                    if (!c0327d2.y() && !c0327d2.F && z2 && !c0327d2.y()) {
                        g(i4, c0327d, c0352f, c0327d2);
                    }
                }
            }
        }
        if (c0327d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f4002a;
        if (hashSet2 != null && i3.f4004c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0326c c0326c9 = (C0326c) it2.next();
                C0327d c0327d3 = c0326c9.f4005d;
                int i6 = i + 1;
                boolean a3 = a(c0327d3);
                if (c0327d3.z() && a3) {
                    C0328e.V(c0327d3, c0352f, new C0331b());
                }
                C0326c c0326c10 = c0327d3.f4017J;
                C0326c c0326c11 = c0327d3.f4019L;
                boolean z3 = (c0326c9 == c0326c10 && (c0326c3 = c0326c11.f4007f) != null && c0326c3.f4004c) || (c0326c9 == c0326c11 && (c0326c2 = c0326c10.f4007f) != null && c0326c2.f4004c);
                int i7 = c0327d3.f4061p0[1];
                if (i7 != 3 || a3) {
                    if (!c0327d3.z()) {
                        if (c0326c9 == c0326c10 && c0326c11.f4007f == null) {
                            int e4 = c0326c10.e() + d3;
                            c0327d3.K(e4, c0327d3.k() + e4);
                            i(i6, c0327d3, c0352f);
                        } else if (c0326c9 == c0326c11 && c0326c10.f4007f == null) {
                            int e5 = d3 - c0326c11.e();
                            c0327d3.K(e5 - c0327d3.k(), e5);
                            i(i6, c0327d3, c0352f);
                        } else if (z3 && !c0327d3.y()) {
                            f(i6, c0327d3, c0352f);
                        }
                    }
                } else if (i7 == 3 && c0327d3.f4070y >= 0 && c0327d3.f4069x >= 0) {
                    if (c0327d3.f4047g0 != 8) {
                        if (c0327d3.f4064s == 0) {
                            if (c0327d3.f4030W == 0.0f) {
                            }
                        }
                    }
                    if (!c0327d3.y() && !c0327d3.F && z3 && !c0327d3.y()) {
                        g(i6, c0327d, c0352f, c0327d3);
                    }
                }
            }
        }
        C0326c i8 = c0327d.i(6);
        if (i8.f4002a != null && i8.f4004c) {
            int d4 = i8.d();
            Iterator it3 = i8.f4002a.iterator();
            while (it3.hasNext()) {
                C0326c c0326c12 = (C0326c) it3.next();
                C0327d c0327d4 = c0326c12.f4005d;
                int i9 = i + 1;
                boolean a4 = a(c0327d4);
                if (c0327d4.z() && a4) {
                    C0328e.V(c0327d4, c0352f, new C0331b());
                }
                if (c0327d4.f4061p0[1] != 3 || a4) {
                    if (!c0327d4.z() && c0326c12 == (c0326c = c0327d4.f4020M)) {
                        int e6 = c0326c12.e() + d4;
                        if (c0327d4.f4013E) {
                            int i10 = e6 - c0327d4.f4035a0;
                            int i11 = c0327d4.f4029V + i10;
                            c0327d4.f4033Z = i10;
                            c0327d4.f4017J.l(i10);
                            c0327d4.f4019L.l(i11);
                            c0326c.l(e6);
                            c0327d4.f4053l = true;
                        }
                        i(i9, c0327d4, c0352f);
                    }
                }
            }
        }
        c0327d.f4056n = true;
    }
}
