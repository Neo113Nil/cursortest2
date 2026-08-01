package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0295c;
import s.C0296d;
import s.C0297e;
import v.C0324f;

/* renamed from: t.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0306h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0300b f3727a = new C0300b();

    public static boolean a(C0296d c0296d) {
        int[] iArr = c0296d.f3601p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0296d c0296d2 = c0296d.f3567T;
        C0297e c0297e = c0296d2 != null ? (C0297e) c0296d2 : null;
        if (c0297e != null) {
            int i3 = c0297e.f3601p0[0];
        }
        if (c0297e != null) {
            int i4 = c0297e.f3601p0[1];
        }
        boolean z2 = i == 1 || c0296d.A() || i == 2 || (i == 3 && c0296d.f3603r == 0 && c0296d.f3570W == 0.0f && c0296d.t(0)) || (i == 3 && c0296d.f3603r == 1 && c0296d.u(0, c0296d.q()));
        boolean z3 = i2 == 1 || c0296d.B() || i2 == 2 || (i2 == 3 && c0296d.f3604s == 0 && c0296d.f3570W == 0.0f && c0296d.t(1)) || (i2 == 3 && c0296d.f3604s == 1 && c0296d.u(1, c0296d.k()));
        if (c0296d.f3570W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static C0312n b(C0296d c0296d, int i, ArrayList arrayList, C0312n c0312n) {
        int i2;
        int i3 = i == 0 ? c0296d.n0 : c0296d.f3599o0;
        if (i3 != -1 && (c0312n == null || i3 != c0312n.f3735b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0312n c0312n2 = (C0312n) arrayList.get(i4);
                if (c0312n2.f3735b == i3) {
                    if (c0312n != null) {
                        c0312n.c(i, c0312n2);
                        arrayList.remove(c0312n);
                    }
                    c0312n = c0312n2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c0312n;
        }
        if (c0312n == null) {
            if (c0296d instanceof s.i) {
                s.i iVar = (s.i) c0296d;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.f3686r0) {
                        i2 = -1;
                        break;
                    }
                    C0296d c0296d2 = iVar.f3685q0[i5];
                    if ((i == 0 && (i2 = c0296d2.n0) != -1) || (i == 1 && (i2 = c0296d2.f3599o0) != -1)) {
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
                        C0312n c0312n3 = (C0312n) arrayList.get(i6);
                        if (c0312n3.f3735b == i2) {
                            c0312n = c0312n3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c0312n == null) {
                c0312n = new C0312n();
                c0312n.f3734a = new ArrayList();
                c0312n.d = null;
                c0312n.f3737e = -1;
                int i7 = C0312n.f3733f;
                C0312n.f3733f = i7 + 1;
                c0312n.f3735b = i7;
                c0312n.f3736c = i;
            }
            arrayList.add(c0312n);
        }
        ArrayList arrayList2 = c0312n.f3734a;
        if (!arrayList2.contains(c0296d)) {
            arrayList2.add(c0296d);
            if (c0296d instanceof s.h) {
                s.h hVar = (s.h) c0296d;
                hVar.f3682t0.c(hVar.f3683u0 == 0 ? 1 : 0, arrayList, c0312n);
            }
            int i8 = c0312n.f3735b;
            if (i == 0) {
                c0296d.n0 = i8;
                c0296d.f3556I.c(i, arrayList, c0312n);
                c0296d.f3558K.c(i, arrayList, c0312n);
            } else {
                c0296d.f3599o0 = i8;
                c0296d.f3557J.c(i, arrayList, c0312n);
                c0296d.f3560M.c(i, arrayList, c0312n);
                c0296d.f3559L.c(i, arrayList, c0312n);
            }
            c0296d.f3563P.c(i, arrayList, c0312n);
        }
        return c0312n;
    }

    public static void c(int i, C0296d c0296d, C0324f c0324f, boolean z2) {
        C0295c c0295c;
        C0295c c0295c2;
        C0295c c0295c3;
        C0295c c0295c4;
        if (c0296d.f3595m) {
            return;
        }
        if (!(c0296d instanceof C0297e) && c0296d.z() && a(c0296d)) {
            C0297e.V(c0296d, c0324f, new C0300b());
        }
        C0295c i2 = c0296d.i(2);
        C0295c i3 = c0296d.i(4);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3543a;
        char c2 = 0;
        if (hashSet != null && i2.f3545c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0295c c0295c5 = (C0295c) it.next();
                C0296d c0296d2 = c0295c5.d;
                int i4 = i + 1;
                boolean a2 = a(c0296d2);
                if (c0296d2.z() && a2) {
                    C0297e.V(c0296d2, c0324f, new C0300b());
                }
                C0295c c0295c6 = c0296d2.f3556I;
                C0295c c0295c7 = c0296d2.f3558K;
                char c3 = ((c0295c5 == c0295c6 && (c0295c4 = c0295c7.f3547f) != null && c0295c4.f3545c) || (c0295c5 == c0295c7 && (c0295c3 = c0295c6.f3547f) != null && c0295c3.f3545c)) ? (char) 1 : c2;
                int i5 = c0296d2.f3601p0[c2];
                if (i5 != 3 || a2) {
                    if (!c0296d2.z()) {
                        if (c0295c5 == c0295c6 && c0295c7.f3547f == null) {
                            int e2 = c0295c6.e() + d;
                            c0296d2.J(e2, c0296d2.q() + e2);
                            c(i4, c0296d2, c0324f, z2);
                        } else if (c0295c5 == c0295c7 && c0295c6.f3547f == null) {
                            int e3 = d - c0295c7.e();
                            c0296d2.J(e3 - c0296d2.q(), e3);
                            c(i4, c0296d2, c0324f, z2);
                        } else if (c3 != 0 && !c0296d2.x()) {
                            d(i4, c0296d2, c0324f, z2);
                        }
                    }
                } else if (i5 == 3 && c0296d2.f3607v >= 0 && c0296d2.f3606u >= 0 && ((c0296d2.f3586g0 == 8 || (c0296d2.f3603r == 0 && c0296d2.f3570W == 0.0f)) && !c0296d2.x() && !c0296d2.F && c3 != 0 && !c0296d2.x())) {
                    e(i4, c0296d, c0324f, c0296d2, z2);
                }
                c2 = 0;
            }
        }
        if (c0296d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3543a;
        if (hashSet2 != null && i3.f3545c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0295c c0295c8 = (C0295c) it2.next();
                C0296d c0296d3 = c0295c8.d;
                int i6 = i + 1;
                boolean a3 = a(c0296d3);
                if (c0296d3.z() && a3) {
                    C0297e.V(c0296d3, c0324f, new C0300b());
                }
                C0295c c0295c9 = c0296d3.f3556I;
                C0295c c0295c10 = c0296d3.f3558K;
                boolean z3 = (c0295c8 == c0295c9 && (c0295c2 = c0295c10.f3547f) != null && c0295c2.f3545c) || (c0295c8 == c0295c10 && (c0295c = c0295c9.f3547f) != null && c0295c.f3545c);
                int i7 = c0296d3.f3601p0[0];
                if (i7 != 3 || a3) {
                    if (!c0296d3.z()) {
                        if (c0295c8 == c0295c9 && c0295c10.f3547f == null) {
                            int e4 = c0295c9.e() + d2;
                            c0296d3.J(e4, c0296d3.q() + e4);
                            c(i6, c0296d3, c0324f, z2);
                        } else if (c0295c8 == c0295c10 && c0295c9.f3547f == null) {
                            int e5 = d2 - c0295c10.e();
                            c0296d3.J(e5 - c0296d3.q(), e5);
                            c(i6, c0296d3, c0324f, z2);
                        } else if (z3 && !c0296d3.x()) {
                            d(i6, c0296d3, c0324f, z2);
                        }
                    }
                } else if (i7 == 3 && c0296d3.f3607v >= 0 && c0296d3.f3606u >= 0) {
                    if (c0296d3.f3586g0 != 8) {
                        if (c0296d3.f3603r == 0) {
                            if (c0296d3.f3570W == 0.0f) {
                            }
                        }
                    }
                    if (!c0296d3.x() && !c0296d3.F && z3 && !c0296d3.x()) {
                        e(i6, c0296d, c0324f, c0296d3, z2);
                    }
                }
            }
        }
        c0296d.f3595m = true;
    }

    public static void d(int i, C0296d c0296d, C0324f c0324f, boolean z2) {
        float f2 = c0296d.f3580d0;
        C0295c c0295c = c0296d.f3556I;
        int d = c0295c.f3547f.d();
        C0295c c0295c2 = c0296d.f3558K;
        int d2 = c0295c2.f3547f.d();
        int e2 = c0295c.e() + d;
        int e3 = d2 - c0295c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int q2 = c0296d.q();
        int i2 = (d2 - d) - q2;
        if (d > d2) {
            i2 = (d - d2) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d;
        int i4 = i3 + q2;
        if (d > d2) {
            i4 = i3 - q2;
        }
        c0296d.J(i3, i4);
        c(i + 1, c0296d, c0324f, z2);
    }

    public static void e(int i, C0296d c0296d, C0324f c0324f, C0296d c0296d2, boolean z2) {
        float f2 = c0296d2.f3580d0;
        C0295c c0295c = c0296d2.f3556I;
        int e2 = c0295c.e() + c0295c.f3547f.d();
        C0295c c0295c2 = c0296d2.f3558K;
        int d = c0295c2.f3547f.d() - c0295c2.e();
        if (d >= e2) {
            int q2 = c0296d2.q();
            if (c0296d2.f3586g0 != 8) {
                int i2 = c0296d2.f3603r;
                if (i2 == 2) {
                    q2 = (int) (c0296d2.f3580d0 * 0.5f * (c0296d instanceof C0297e ? c0296d.q() : c0296d.f3567T.q()));
                } else if (i2 == 0) {
                    q2 = d - e2;
                }
                q2 = Math.max(c0296d2.f3606u, q2);
                int i3 = c0296d2.f3607v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - q2)) + 0.5f));
            c0296d2.J(i4, q2 + i4);
            c(i + 1, c0296d2, c0324f, z2);
        }
    }

    public static void f(int i, C0296d c0296d, C0324f c0324f) {
        float f2 = c0296d.f3582e0;
        C0295c c0295c = c0296d.f3557J;
        int d = c0295c.f3547f.d();
        C0295c c0295c2 = c0296d.f3559L;
        int d2 = c0295c2.f3547f.d();
        int e2 = c0295c.e() + d;
        int e3 = d2 - c0295c2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int k2 = c0296d.k();
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
        c0296d.K(i4, i5);
        i(i + 1, c0296d, c0324f);
    }

    public static void g(int i, C0296d c0296d, C0324f c0324f, C0296d c0296d2) {
        float f2 = c0296d2.f3582e0;
        C0295c c0295c = c0296d2.f3557J;
        int e2 = c0295c.e() + c0295c.f3547f.d();
        C0295c c0295c2 = c0296d2.f3559L;
        int d = c0295c2.f3547f.d() - c0295c2.e();
        if (d >= e2) {
            int k2 = c0296d2.k();
            if (c0296d2.f3586g0 != 8) {
                int i2 = c0296d2.f3604s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (c0296d instanceof C0297e ? c0296d.k() : c0296d.f3567T.k()));
                } else if (i2 == 0) {
                    k2 = d - e2;
                }
                k2 = Math.max(c0296d2.f3609x, k2);
                int i3 = c0296d2.f3610y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - k2)) + 0.5f));
            c0296d2.K(i4, k2 + i4);
            i(i + 1, c0296d2, c0324f);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, C0296d c0296d, C0324f c0324f) {
        C0295c c0295c;
        C0295c c0295c2;
        C0295c c0295c3;
        C0295c c0295c4;
        C0295c c0295c5;
        if (c0296d.f3597n) {
            return;
        }
        if (!(c0296d instanceof C0297e) && c0296d.z() && a(c0296d)) {
            C0297e.V(c0296d, c0324f, new C0300b());
        }
        C0295c i2 = c0296d.i(3);
        C0295c i3 = c0296d.i(5);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3543a;
        if (hashSet != null && i2.f3545c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0295c c0295c6 = (C0295c) it.next();
                C0296d c0296d2 = c0295c6.d;
                int i4 = i + 1;
                boolean a2 = a(c0296d2);
                if (c0296d2.z() && a2) {
                    C0297e.V(c0296d2, c0324f, new C0300b());
                }
                C0295c c0295c7 = c0296d2.f3557J;
                C0295c c0295c8 = c0296d2.f3559L;
                boolean z2 = (c0295c6 == c0295c7 && (c0295c5 = c0295c8.f3547f) != null && c0295c5.f3545c) || (c0295c6 == c0295c8 && (c0295c4 = c0295c7.f3547f) != null && c0295c4.f3545c);
                int i5 = c0296d2.f3601p0[1];
                if (i5 != 3 || a2) {
                    if (!c0296d2.z()) {
                        if (c0295c6 == c0295c7 && c0295c8.f3547f == null) {
                            int e2 = c0295c7.e() + d;
                            c0296d2.K(e2, c0296d2.k() + e2);
                            i(i4, c0296d2, c0324f);
                        } else if (c0295c6 == c0295c8 && c0295c7.f3547f == null) {
                            int e3 = d - c0295c8.e();
                            c0296d2.K(e3 - c0296d2.k(), e3);
                            i(i4, c0296d2, c0324f);
                        } else if (z2 && !c0296d2.y()) {
                            f(i4, c0296d2, c0324f);
                        }
                    }
                } else if (i5 == 3 && c0296d2.f3610y >= 0 && c0296d2.f3609x >= 0 && (c0296d2.f3586g0 == 8 || (c0296d2.f3604s == 0 && c0296d2.f3570W == 0.0f))) {
                    if (!c0296d2.y() && !c0296d2.F && z2 && !c0296d2.y()) {
                        g(i4, c0296d, c0324f, c0296d2);
                    }
                }
            }
        }
        if (c0296d instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3543a;
        if (hashSet2 != null && i3.f3545c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0295c c0295c9 = (C0295c) it2.next();
                C0296d c0296d3 = c0295c9.d;
                int i6 = i + 1;
                boolean a3 = a(c0296d3);
                if (c0296d3.z() && a3) {
                    C0297e.V(c0296d3, c0324f, new C0300b());
                }
                C0295c c0295c10 = c0296d3.f3557J;
                C0295c c0295c11 = c0296d3.f3559L;
                boolean z3 = (c0295c9 == c0295c10 && (c0295c3 = c0295c11.f3547f) != null && c0295c3.f3545c) || (c0295c9 == c0295c11 && (c0295c2 = c0295c10.f3547f) != null && c0295c2.f3545c);
                int i7 = c0296d3.f3601p0[1];
                if (i7 != 3 || a3) {
                    if (!c0296d3.z()) {
                        if (c0295c9 == c0295c10 && c0295c11.f3547f == null) {
                            int e4 = c0295c10.e() + d2;
                            c0296d3.K(e4, c0296d3.k() + e4);
                            i(i6, c0296d3, c0324f);
                        } else if (c0295c9 == c0295c11 && c0295c10.f3547f == null) {
                            int e5 = d2 - c0295c11.e();
                            c0296d3.K(e5 - c0296d3.k(), e5);
                            i(i6, c0296d3, c0324f);
                        } else if (z3 && !c0296d3.y()) {
                            f(i6, c0296d3, c0324f);
                        }
                    }
                } else if (i7 == 3 && c0296d3.f3610y >= 0 && c0296d3.f3609x >= 0) {
                    if (c0296d3.f3586g0 != 8) {
                        if (c0296d3.f3604s == 0) {
                            if (c0296d3.f3570W == 0.0f) {
                            }
                        }
                    }
                    if (!c0296d3.y() && !c0296d3.F && z3 && !c0296d3.y()) {
                        g(i6, c0296d, c0324f, c0296d3);
                    }
                }
            }
        }
        C0295c i8 = c0296d.i(6);
        if (i8.f3543a != null && i8.f3545c) {
            int d3 = i8.d();
            Iterator it3 = i8.f3543a.iterator();
            while (it3.hasNext()) {
                C0295c c0295c12 = (C0295c) it3.next();
                C0296d c0296d4 = c0295c12.d;
                int i9 = i + 1;
                boolean a4 = a(c0296d4);
                if (c0296d4.z() && a4) {
                    C0297e.V(c0296d4, c0324f, new C0300b());
                }
                if (c0296d4.f3601p0[1] != 3 || a4) {
                    if (!c0296d4.z() && c0295c12 == (c0295c = c0296d4.f3560M)) {
                        int e6 = c0295c12.e() + d3;
                        if (c0296d4.f3553E) {
                            int i10 = e6 - c0296d4.f3575a0;
                            int i11 = c0296d4.f3569V + i10;
                            c0296d4.f3573Z = i10;
                            c0296d4.f3557J.l(i10);
                            c0296d4.f3559L.l(i11);
                            c0295c.l(e6);
                            c0296d4.f3593l = true;
                        }
                        i(i9, c0296d4, c0324f);
                    }
                }
            }
        }
        c0296d.f3597n = true;
    }
}
