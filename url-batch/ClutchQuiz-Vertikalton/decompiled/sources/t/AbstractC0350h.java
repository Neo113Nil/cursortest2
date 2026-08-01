package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0339c;
import s.C0340d;
import s.C0341e;
import v.C0367f;

/* renamed from: t.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0350h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0344b f3700a = new C0344b();

    public static boolean a(C0340d c0340d) {
        int[] iArr = c0340d.f3549p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0340d c0340d2 = c0340d.f3515T;
        C0341e c0341e = c0340d2 != null ? (C0341e) c0340d2 : null;
        if (c0341e != null) {
            int i3 = c0341e.f3549p0[0];
        }
        if (c0341e != null) {
            int i4 = c0341e.f3549p0[1];
        }
        boolean z2 = i == 1 || c0340d.A() || i == 2 || (i == 3 && c0340d.f3551r == 0 && c0340d.f3518W == 0.0f && c0340d.t(0)) || (i == 3 && c0340d.f3551r == 1 && c0340d.u(0, c0340d.q()));
        boolean z3 = i2 == 1 || c0340d.B() || i2 == 2 || (i2 == 3 && c0340d.f3552s == 0 && c0340d.f3518W == 0.0f && c0340d.t(1)) || (i2 == 3 && c0340d.f3552s == 1 && c0340d.u(1, c0340d.k()));
        if (c0340d.f3518W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static C0357o b(C0340d c0340d, int i, ArrayList arrayList, C0357o c0357o) {
        int i2;
        int i3 = i == 0 ? c0340d.f3545n0 : c0340d.f3547o0;
        if (i3 != -1 && (c0357o == null || i3 != c0357o.f3708b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0357o c0357o2 = (C0357o) arrayList.get(i4);
                if (c0357o2.f3708b == i3) {
                    if (c0357o != null) {
                        c0357o.c(i, c0357o2);
                        arrayList.remove(c0357o);
                    }
                    c0357o = c0357o2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c0357o;
        }
        if (c0357o == null) {
            if (c0340d instanceof s.i) {
                s.i iVar = (s.i) c0340d;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.f3633r0) {
                        i2 = -1;
                        break;
                    }
                    C0340d c0340d2 = iVar.q0[i5];
                    if ((i == 0 && (i2 = c0340d2.f3545n0) != -1) || (i == 1 && (i2 = c0340d2.f3547o0) != -1)) {
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
                        C0357o c0357o3 = (C0357o) arrayList.get(i6);
                        if (c0357o3.f3708b == i2) {
                            c0357o = c0357o3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c0357o == null) {
                c0357o = new C0357o();
                c0357o.f3707a = new ArrayList();
                c0357o.d = null;
                c0357o.f3710e = -1;
                int i7 = C0357o.f3706f;
                C0357o.f3706f = i7 + 1;
                c0357o.f3708b = i7;
                c0357o.f3709c = i;
            }
            arrayList.add(c0357o);
        }
        ArrayList arrayList2 = c0357o.f3707a;
        if (!arrayList2.contains(c0340d)) {
            arrayList2.add(c0340d);
            if (c0340d instanceof s.h) {
                s.h hVar = (s.h) c0340d;
                hVar.f3630t0.c(hVar.f3631u0 == 0 ? 1 : 0, arrayList, c0357o);
            }
            int i8 = c0357o.f3708b;
            if (i == 0) {
                c0340d.f3545n0 = i8;
                c0340d.f3504I.c(i, arrayList, c0357o);
                c0340d.f3506K.c(i, arrayList, c0357o);
            } else {
                c0340d.f3547o0 = i8;
                c0340d.f3505J.c(i, arrayList, c0357o);
                c0340d.f3508M.c(i, arrayList, c0357o);
                c0340d.f3507L.c(i, arrayList, c0357o);
            }
            c0340d.f3511P.c(i, arrayList, c0357o);
        }
        return c0357o;
    }

    public static void c(int i, C0340d c0340d, C0367f c0367f, boolean z2) {
        C0339c c0339c;
        C0339c c0339c2;
        C0339c c0339c3;
        C0339c c0339c4;
        if (c0340d.f3543m) {
            return;
        }
        if (!(c0340d instanceof C0341e) && c0340d.z() && a(c0340d)) {
            C0341e.V(c0340d, c0367f, new C0344b());
        }
        C0339c i2 = c0340d.i(2);
        C0339c i3 = c0340d.i(4);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3491a;
        char c2 = 0;
        if (hashSet != null && i2.f3493c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0339c c0339c5 = (C0339c) it.next();
                C0340d c0340d2 = c0339c5.d;
                int i4 = i + 1;
                boolean a2 = a(c0340d2);
                if (c0340d2.z() && a2) {
                    C0341e.V(c0340d2, c0367f, new C0344b());
                }
                C0339c c0339c6 = c0340d2.f3504I;
                C0339c c0339c7 = c0340d2.f3506K;
                char c3 = ((c0339c5 == c0339c6 && (c0339c4 = c0339c7.f3495f) != null && c0339c4.f3493c) || (c0339c5 == c0339c7 && (c0339c3 = c0339c6.f3495f) != null && c0339c3.f3493c)) ? (char) 1 : c2;
                int i5 = c0340d2.f3549p0[c2];
                if (i5 != 3 || a2) {
                    if (!c0340d2.z()) {
                        if (c0339c5 == c0339c6 && c0339c7.f3495f == null) {
                            int e2 = c0339c6.e() + d;
                            c0340d2.J(e2, c0340d2.q() + e2);
                            c(i4, c0340d2, c0367f, z2);
                        } else if (c0339c5 == c0339c7 && c0339c6.f3495f == null) {
                            int e3 = d - c0339c7.e();
                            c0340d2.J(e3 - c0340d2.q(), e3);
                            c(i4, c0340d2, c0367f, z2);
                        } else if (c3 != 0 && !c0340d2.x()) {
                            d(i4, c0340d2, c0367f, z2);
                        }
                    }
                } else if (i5 == 3 && c0340d2.f3555v >= 0 && c0340d2.f3554u >= 0 && ((c0340d2.f3534g0 == 8 || (c0340d2.f3551r == 0 && c0340d2.f3518W == 0.0f)) && !c0340d2.x() && !c0340d2.F && c3 != 0 && !c0340d2.x())) {
                    e(i4, c0340d, c0367f, c0340d2, z2);
                }
                c2 = 0;
            }
        }
        if (c0340d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3491a;
        if (hashSet2 != null && i3.f3493c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0339c c0339c8 = (C0339c) it2.next();
                C0340d c0340d3 = c0339c8.d;
                int i6 = i + 1;
                boolean a3 = a(c0340d3);
                if (c0340d3.z() && a3) {
                    C0341e.V(c0340d3, c0367f, new C0344b());
                }
                C0339c c0339c9 = c0340d3.f3504I;
                C0339c c0339c10 = c0340d3.f3506K;
                boolean z3 = (c0339c8 == c0339c9 && (c0339c2 = c0339c10.f3495f) != null && c0339c2.f3493c) || (c0339c8 == c0339c10 && (c0339c = c0339c9.f3495f) != null && c0339c.f3493c);
                int i7 = c0340d3.f3549p0[0];
                if (i7 != 3 || a3) {
                    if (!c0340d3.z()) {
                        if (c0339c8 == c0339c9 && c0339c10.f3495f == null) {
                            int e4 = c0339c9.e() + d2;
                            c0340d3.J(e4, c0340d3.q() + e4);
                            c(i6, c0340d3, c0367f, z2);
                        } else if (c0339c8 == c0339c10 && c0339c9.f3495f == null) {
                            int e5 = d2 - c0339c10.e();
                            c0340d3.J(e5 - c0340d3.q(), e5);
                            c(i6, c0340d3, c0367f, z2);
                        } else if (z3 && !c0340d3.x()) {
                            d(i6, c0340d3, c0367f, z2);
                        }
                    }
                } else if (i7 == 3 && c0340d3.f3555v >= 0 && c0340d3.f3554u >= 0) {
                    if (c0340d3.f3534g0 != 8) {
                        if (c0340d3.f3551r == 0) {
                            if (c0340d3.f3518W == 0.0f) {
                            }
                        }
                    }
                    if (!c0340d3.x() && !c0340d3.F && z3 && !c0340d3.x()) {
                        e(i6, c0340d, c0367f, c0340d3, z2);
                    }
                }
            }
        }
        c0340d.f3543m = true;
    }

    public static void d(int i, C0340d c0340d, C0367f c0367f, boolean z2) {
        float f2 = c0340d.f3528d0;
        C0339c c0339c = c0340d.f3504I;
        int d = c0339c.f3495f.d();
        C0339c c0339c2 = c0340d.f3506K;
        int d2 = c0339c2.f3495f.d();
        int e2 = c0339c.e() + d;
        int e3 = d2 - c0339c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int q2 = c0340d.q();
        int i2 = (d2 - d) - q2;
        if (d > d2) {
            i2 = (d - d2) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d;
        int i4 = i3 + q2;
        if (d > d2) {
            i4 = i3 - q2;
        }
        c0340d.J(i3, i4);
        c(i + 1, c0340d, c0367f, z2);
    }

    public static void e(int i, C0340d c0340d, C0367f c0367f, C0340d c0340d2, boolean z2) {
        float f2 = c0340d2.f3528d0;
        C0339c c0339c = c0340d2.f3504I;
        int e2 = c0339c.e() + c0339c.f3495f.d();
        C0339c c0339c2 = c0340d2.f3506K;
        int d = c0339c2.f3495f.d() - c0339c2.e();
        if (d >= e2) {
            int q2 = c0340d2.q();
            if (c0340d2.f3534g0 != 8) {
                int i2 = c0340d2.f3551r;
                if (i2 == 2) {
                    q2 = (int) (c0340d2.f3528d0 * 0.5f * (c0340d instanceof C0341e ? c0340d.q() : c0340d.f3515T.q()));
                } else if (i2 == 0) {
                    q2 = d - e2;
                }
                q2 = Math.max(c0340d2.f3554u, q2);
                int i3 = c0340d2.f3555v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - q2)) + 0.5f));
            c0340d2.J(i4, q2 + i4);
            c(i + 1, c0340d2, c0367f, z2);
        }
    }

    public static void f(int i, C0340d c0340d, C0367f c0367f) {
        float f2 = c0340d.f3530e0;
        C0339c c0339c = c0340d.f3505J;
        int d = c0339c.f3495f.d();
        C0339c c0339c2 = c0340d.f3507L;
        int d2 = c0339c2.f3495f.d();
        int e2 = c0339c.e() + d;
        int e3 = d2 - c0339c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int k2 = c0340d.k();
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
        c0340d.K(i4, i5);
        i(i + 1, c0340d, c0367f);
    }

    public static void g(int i, C0340d c0340d, C0367f c0367f, C0340d c0340d2) {
        float f2 = c0340d2.f3530e0;
        C0339c c0339c = c0340d2.f3505J;
        int e2 = c0339c.e() + c0339c.f3495f.d();
        C0339c c0339c2 = c0340d2.f3507L;
        int d = c0339c2.f3495f.d() - c0339c2.e();
        if (d >= e2) {
            int k2 = c0340d2.k();
            if (c0340d2.f3534g0 != 8) {
                int i2 = c0340d2.f3552s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (c0340d instanceof C0341e ? c0340d.k() : c0340d.f3515T.k()));
                } else if (i2 == 0) {
                    k2 = d - e2;
                }
                k2 = Math.max(c0340d2.f3557x, k2);
                int i3 = c0340d2.f3558y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - k2)) + 0.5f));
            c0340d2.K(i4, k2 + i4);
            i(i + 1, c0340d2, c0367f);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, C0340d c0340d, C0367f c0367f) {
        C0339c c0339c;
        C0339c c0339c2;
        C0339c c0339c3;
        C0339c c0339c4;
        C0339c c0339c5;
        if (c0340d.f3544n) {
            return;
        }
        if (!(c0340d instanceof C0341e) && c0340d.z() && a(c0340d)) {
            C0341e.V(c0340d, c0367f, new C0344b());
        }
        C0339c i2 = c0340d.i(3);
        C0339c i3 = c0340d.i(5);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3491a;
        if (hashSet != null && i2.f3493c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0339c c0339c6 = (C0339c) it.next();
                C0340d c0340d2 = c0339c6.d;
                int i4 = i + 1;
                boolean a2 = a(c0340d2);
                if (c0340d2.z() && a2) {
                    C0341e.V(c0340d2, c0367f, new C0344b());
                }
                C0339c c0339c7 = c0340d2.f3505J;
                C0339c c0339c8 = c0340d2.f3507L;
                boolean z2 = (c0339c6 == c0339c7 && (c0339c5 = c0339c8.f3495f) != null && c0339c5.f3493c) || (c0339c6 == c0339c8 && (c0339c4 = c0339c7.f3495f) != null && c0339c4.f3493c);
                int i5 = c0340d2.f3549p0[1];
                if (i5 != 3 || a2) {
                    if (!c0340d2.z()) {
                        if (c0339c6 == c0339c7 && c0339c8.f3495f == null) {
                            int e2 = c0339c7.e() + d;
                            c0340d2.K(e2, c0340d2.k() + e2);
                            i(i4, c0340d2, c0367f);
                        } else if (c0339c6 == c0339c8 && c0339c7.f3495f == null) {
                            int e3 = d - c0339c8.e();
                            c0340d2.K(e3 - c0340d2.k(), e3);
                            i(i4, c0340d2, c0367f);
                        } else if (z2 && !c0340d2.y()) {
                            f(i4, c0340d2, c0367f);
                        }
                    }
                } else if (i5 == 3 && c0340d2.f3558y >= 0 && c0340d2.f3557x >= 0 && (c0340d2.f3534g0 == 8 || (c0340d2.f3552s == 0 && c0340d2.f3518W == 0.0f))) {
                    if (!c0340d2.y() && !c0340d2.F && z2 && !c0340d2.y()) {
                        g(i4, c0340d, c0367f, c0340d2);
                    }
                }
            }
        }
        if (c0340d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3491a;
        if (hashSet2 != null && i3.f3493c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0339c c0339c9 = (C0339c) it2.next();
                C0340d c0340d3 = c0339c9.d;
                int i6 = i + 1;
                boolean a3 = a(c0340d3);
                if (c0340d3.z() && a3) {
                    C0341e.V(c0340d3, c0367f, new C0344b());
                }
                C0339c c0339c10 = c0340d3.f3505J;
                C0339c c0339c11 = c0340d3.f3507L;
                boolean z3 = (c0339c9 == c0339c10 && (c0339c3 = c0339c11.f3495f) != null && c0339c3.f3493c) || (c0339c9 == c0339c11 && (c0339c2 = c0339c10.f3495f) != null && c0339c2.f3493c);
                int i7 = c0340d3.f3549p0[1];
                if (i7 != 3 || a3) {
                    if (!c0340d3.z()) {
                        if (c0339c9 == c0339c10 && c0339c11.f3495f == null) {
                            int e4 = c0339c10.e() + d2;
                            c0340d3.K(e4, c0340d3.k() + e4);
                            i(i6, c0340d3, c0367f);
                        } else if (c0339c9 == c0339c11 && c0339c10.f3495f == null) {
                            int e5 = d2 - c0339c11.e();
                            c0340d3.K(e5 - c0340d3.k(), e5);
                            i(i6, c0340d3, c0367f);
                        } else if (z3 && !c0340d3.y()) {
                            f(i6, c0340d3, c0367f);
                        }
                    }
                } else if (i7 == 3 && c0340d3.f3558y >= 0 && c0340d3.f3557x >= 0) {
                    if (c0340d3.f3534g0 != 8) {
                        if (c0340d3.f3552s == 0) {
                            if (c0340d3.f3518W == 0.0f) {
                            }
                        }
                    }
                    if (!c0340d3.y() && !c0340d3.F && z3 && !c0340d3.y()) {
                        g(i6, c0340d, c0367f, c0340d3);
                    }
                }
            }
        }
        C0339c i8 = c0340d.i(6);
        if (i8.f3491a != null && i8.f3493c) {
            int d3 = i8.d();
            Iterator it3 = i8.f3491a.iterator();
            while (it3.hasNext()) {
                C0339c c0339c12 = (C0339c) it3.next();
                C0340d c0340d4 = c0339c12.d;
                int i9 = i + 1;
                boolean a4 = a(c0340d4);
                if (c0340d4.z() && a4) {
                    C0341e.V(c0340d4, c0367f, new C0344b());
                }
                if (c0340d4.f3549p0[1] != 3 || a4) {
                    if (!c0340d4.z() && c0339c12 == (c0339c = c0340d4.f3508M)) {
                        int e6 = c0339c12.e() + d3;
                        if (c0340d4.f3501E) {
                            int i10 = e6 - c0340d4.f3523a0;
                            int i11 = c0340d4.f3517V + i10;
                            c0340d4.f3521Z = i10;
                            c0340d4.f3505J.l(i10);
                            c0340d4.f3507L.l(i11);
                            c0339c.l(e6);
                            c0340d4.f3541l = true;
                        }
                        i(i9, c0340d4, c0367f);
                    }
                }
            }
        }
        c0340d.f3544n = true;
    }
}
