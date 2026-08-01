package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import u.C0386c;
import u.C0387d;
import u.C0388e;
import x.C0415f;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0399h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0393b f4425a = new C0393b();

    public static boolean a(C0387d c0387d) {
        int[] iArr = c0387d.f4281p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0387d c0387d2 = c0387d.f4247T;
        C0388e c0388e = c0387d2 != null ? (C0388e) c0387d2 : null;
        if (c0388e != null) {
            int i3 = c0388e.f4281p0[0];
        }
        if (c0388e != null) {
            int i4 = c0388e.f4281p0[1];
        }
        boolean z2 = i == 1 || c0387d.A() || i == 2 || (i == 3 && c0387d.f4283r == 0 && c0387d.f4250W == 0.0f && c0387d.t(0)) || (i == 3 && c0387d.f4283r == 1 && c0387d.u(0, c0387d.q()));
        boolean z3 = i2 == 1 || c0387d.B() || i2 == 2 || (i2 == 3 && c0387d.f4284s == 0 && c0387d.f4250W == 0.0f && c0387d.t(1)) || (i2 == 3 && c0387d.f4284s == 1 && c0387d.u(1, c0387d.k()));
        if (c0387d.f4250W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static C0405n b(C0387d c0387d, int i, ArrayList arrayList, C0405n c0405n) {
        int i2;
        int i3 = i == 0 ? c0387d.f4278n0 : c0387d.o0;
        if (i3 != -1 && (c0405n == null || i3 != c0405n.f4433b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0405n c0405n2 = (C0405n) arrayList.get(i4);
                if (c0405n2.f4433b == i3) {
                    if (c0405n != null) {
                        c0405n.c(i, c0405n2);
                        arrayList.remove(c0405n);
                    }
                    c0405n = c0405n2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c0405n;
        }
        if (c0405n == null) {
            if (c0387d instanceof u.i) {
                u.i iVar = (u.i) c0387d;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.f4367r0) {
                        i2 = -1;
                        break;
                    }
                    C0387d c0387d2 = iVar.f4366q0[i5];
                    if ((i == 0 && (i2 = c0387d2.f4278n0) != -1) || (i == 1 && (i2 = c0387d2.o0) != -1)) {
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
                        C0405n c0405n3 = (C0405n) arrayList.get(i6);
                        if (c0405n3.f4433b == i2) {
                            c0405n = c0405n3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (c0405n == null) {
                c0405n = new C0405n();
                c0405n.f4432a = new ArrayList();
                c0405n.f4435d = null;
                c0405n.e = -1;
                int i7 = C0405n.f4431f;
                C0405n.f4431f = i7 + 1;
                c0405n.f4433b = i7;
                c0405n.f4434c = i;
            }
            arrayList.add(c0405n);
        }
        ArrayList arrayList2 = c0405n.f4432a;
        if (!arrayList2.contains(c0387d)) {
            arrayList2.add(c0387d);
            if (c0387d instanceof u.h) {
                u.h hVar = (u.h) c0387d;
                hVar.f4363t0.c(hVar.f4364u0 == 0 ? 1 : 0, arrayList, c0405n);
            }
            int i8 = c0405n.f4433b;
            if (i == 0) {
                c0387d.f4278n0 = i8;
                c0387d.f4236I.c(i, arrayList, c0405n);
                c0387d.f4238K.c(i, arrayList, c0405n);
            } else {
                c0387d.o0 = i8;
                c0387d.f4237J.c(i, arrayList, c0405n);
                c0387d.f4240M.c(i, arrayList, c0405n);
                c0387d.f4239L.c(i, arrayList, c0405n);
            }
            c0387d.f4243P.c(i, arrayList, c0405n);
        }
        return c0405n;
    }

    public static void c(int i, C0387d c0387d, C0415f c0415f, boolean z2) {
        C0386c c0386c;
        C0386c c0386c2;
        C0386c c0386c3;
        C0386c c0386c4;
        if (c0387d.f4275m) {
            return;
        }
        if (!(c0387d instanceof C0388e) && c0387d.z() && a(c0387d)) {
            C0388e.V(c0387d, c0415f, new C0393b());
        }
        C0386c i2 = c0387d.i(2);
        C0386c i3 = c0387d.i(4);
        int d2 = i2.d();
        int d3 = i3.d();
        HashSet hashSet = i2.f4222a;
        char c2 = 0;
        if (hashSet != null && i2.f4224c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0386c c0386c5 = (C0386c) it.next();
                C0387d c0387d2 = c0386c5.f4225d;
                int i4 = i + 1;
                boolean a2 = a(c0387d2);
                if (c0387d2.z() && a2) {
                    C0388e.V(c0387d2, c0415f, new C0393b());
                }
                C0386c c0386c6 = c0387d2.f4236I;
                C0386c c0386c7 = c0387d2.f4238K;
                char c3 = ((c0386c5 == c0386c6 && (c0386c4 = c0386c7.f4226f) != null && c0386c4.f4224c) || (c0386c5 == c0386c7 && (c0386c3 = c0386c6.f4226f) != null && c0386c3.f4224c)) ? (char) 1 : c2;
                int i5 = c0387d2.f4281p0[c2];
                if (i5 != 3 || a2) {
                    if (!c0387d2.z()) {
                        if (c0386c5 == c0386c6 && c0386c7.f4226f == null) {
                            int e = c0386c6.e() + d2;
                            c0387d2.J(e, c0387d2.q() + e);
                            c(i4, c0387d2, c0415f, z2);
                        } else if (c0386c5 == c0386c7 && c0386c6.f4226f == null) {
                            int e2 = d2 - c0386c7.e();
                            c0387d2.J(e2 - c0387d2.q(), e2);
                            c(i4, c0387d2, c0415f, z2);
                        } else if (c3 != 0 && !c0387d2.x()) {
                            d(i4, c0387d2, c0415f, z2);
                        }
                    }
                } else if (i5 == 3 && c0387d2.f4287v >= 0 && c0387d2.f4286u >= 0 && ((c0387d2.f4266g0 == 8 || (c0387d2.f4283r == 0 && c0387d2.f4250W == 0.0f)) && !c0387d2.x() && !c0387d2.f4234F && c3 != 0 && !c0387d2.x())) {
                    e(i4, c0387d, c0415f, c0387d2, z2);
                }
                c2 = 0;
            }
        }
        if (c0387d instanceof u.h) {
            return;
        }
        HashSet hashSet2 = i3.f4222a;
        if (hashSet2 != null && i3.f4224c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0386c c0386c8 = (C0386c) it2.next();
                C0387d c0387d3 = c0386c8.f4225d;
                int i6 = i + 1;
                boolean a3 = a(c0387d3);
                if (c0387d3.z() && a3) {
                    C0388e.V(c0387d3, c0415f, new C0393b());
                }
                C0386c c0386c9 = c0387d3.f4236I;
                C0386c c0386c10 = c0387d3.f4238K;
                boolean z3 = (c0386c8 == c0386c9 && (c0386c2 = c0386c10.f4226f) != null && c0386c2.f4224c) || (c0386c8 == c0386c10 && (c0386c = c0386c9.f4226f) != null && c0386c.f4224c);
                int i7 = c0387d3.f4281p0[0];
                if (i7 != 3 || a3) {
                    if (!c0387d3.z()) {
                        if (c0386c8 == c0386c9 && c0386c10.f4226f == null) {
                            int e3 = c0386c9.e() + d3;
                            c0387d3.J(e3, c0387d3.q() + e3);
                            c(i6, c0387d3, c0415f, z2);
                        } else if (c0386c8 == c0386c10 && c0386c9.f4226f == null) {
                            int e4 = d3 - c0386c10.e();
                            c0387d3.J(e4 - c0387d3.q(), e4);
                            c(i6, c0387d3, c0415f, z2);
                        } else if (z3 && !c0387d3.x()) {
                            d(i6, c0387d3, c0415f, z2);
                        }
                    }
                } else if (i7 == 3 && c0387d3.f4287v >= 0 && c0387d3.f4286u >= 0) {
                    if (c0387d3.f4266g0 != 8) {
                        if (c0387d3.f4283r == 0) {
                            if (c0387d3.f4250W == 0.0f) {
                            }
                        }
                    }
                    if (!c0387d3.x() && !c0387d3.f4234F && z3 && !c0387d3.x()) {
                        e(i6, c0387d, c0415f, c0387d3, z2);
                    }
                }
            }
        }
        c0387d.f4275m = true;
    }

    public static void d(int i, C0387d c0387d, C0415f c0415f, boolean z2) {
        float f2 = c0387d.f4261d0;
        C0386c c0386c = c0387d.f4236I;
        int d2 = c0386c.f4226f.d();
        C0386c c0386c2 = c0387d.f4238K;
        int d3 = c0386c2.f4226f.d();
        int e = c0386c.e() + d2;
        int e2 = d3 - c0386c2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e;
            d3 = e2;
        }
        int q2 = c0387d.q();
        int i2 = (d3 - d2) - q2;
        if (d2 > d3) {
            i2 = (d2 - d3) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d2;
        int i4 = i3 + q2;
        if (d2 > d3) {
            i4 = i3 - q2;
        }
        c0387d.J(i3, i4);
        c(i + 1, c0387d, c0415f, z2);
    }

    public static void e(int i, C0387d c0387d, C0415f c0415f, C0387d c0387d2, boolean z2) {
        float f2 = c0387d2.f4261d0;
        C0386c c0386c = c0387d2.f4236I;
        int e = c0386c.e() + c0386c.f4226f.d();
        C0386c c0386c2 = c0387d2.f4238K;
        int d2 = c0386c2.f4226f.d() - c0386c2.e();
        if (d2 >= e) {
            int q2 = c0387d2.q();
            if (c0387d2.f4266g0 != 8) {
                int i2 = c0387d2.f4283r;
                if (i2 == 2) {
                    q2 = (int) (c0387d2.f4261d0 * 0.5f * (c0387d instanceof C0388e ? c0387d.q() : c0387d.f4247T.q()));
                } else if (i2 == 0) {
                    q2 = d2 - e;
                }
                q2 = Math.max(c0387d2.f4286u, q2);
                int i3 = c0387d2.f4287v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e + ((int) ((f2 * ((d2 - e) - q2)) + 0.5f));
            c0387d2.J(i4, q2 + i4);
            c(i + 1, c0387d2, c0415f, z2);
        }
    }

    public static void f(int i, C0387d c0387d, C0415f c0415f) {
        float f2 = c0387d.f4262e0;
        C0386c c0386c = c0387d.f4237J;
        int d2 = c0386c.f4226f.d();
        C0386c c0386c2 = c0387d.f4239L;
        int d3 = c0386c2.f4226f.d();
        int e = c0386c.e() + d2;
        int e2 = d3 - c0386c2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e;
            d3 = e2;
        }
        int k2 = c0387d.k();
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
        c0387d.K(i4, i5);
        i(i + 1, c0387d, c0415f);
    }

    public static void g(int i, C0387d c0387d, C0415f c0415f, C0387d c0387d2) {
        float f2 = c0387d2.f4262e0;
        C0386c c0386c = c0387d2.f4237J;
        int e = c0386c.e() + c0386c.f4226f.d();
        C0386c c0386c2 = c0387d2.f4239L;
        int d2 = c0386c2.f4226f.d() - c0386c2.e();
        if (d2 >= e) {
            int k2 = c0387d2.k();
            if (c0387d2.f4266g0 != 8) {
                int i2 = c0387d2.f4284s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (c0387d instanceof C0388e ? c0387d.k() : c0387d.f4247T.k()));
                } else if (i2 == 0) {
                    k2 = d2 - e;
                }
                k2 = Math.max(c0387d2.f4289x, k2);
                int i3 = c0387d2.f4290y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e + ((int) ((f2 * ((d2 - e) - k2)) + 0.5f));
            c0387d2.K(i4, k2 + i4);
            i(i + 1, c0387d2, c0415f);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, C0387d c0387d, C0415f c0415f) {
        C0386c c0386c;
        C0386c c0386c2;
        C0386c c0386c3;
        C0386c c0386c4;
        C0386c c0386c5;
        if (c0387d.f4277n) {
            return;
        }
        if (!(c0387d instanceof C0388e) && c0387d.z() && a(c0387d)) {
            C0388e.V(c0387d, c0415f, new C0393b());
        }
        C0386c i2 = c0387d.i(3);
        C0386c i3 = c0387d.i(5);
        int d2 = i2.d();
        int d3 = i3.d();
        HashSet hashSet = i2.f4222a;
        if (hashSet != null && i2.f4224c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0386c c0386c6 = (C0386c) it.next();
                C0387d c0387d2 = c0386c6.f4225d;
                int i4 = i + 1;
                boolean a2 = a(c0387d2);
                if (c0387d2.z() && a2) {
                    C0388e.V(c0387d2, c0415f, new C0393b());
                }
                C0386c c0386c7 = c0387d2.f4237J;
                C0386c c0386c8 = c0387d2.f4239L;
                boolean z2 = (c0386c6 == c0386c7 && (c0386c5 = c0386c8.f4226f) != null && c0386c5.f4224c) || (c0386c6 == c0386c8 && (c0386c4 = c0386c7.f4226f) != null && c0386c4.f4224c);
                int i5 = c0387d2.f4281p0[1];
                if (i5 != 3 || a2) {
                    if (!c0387d2.z()) {
                        if (c0386c6 == c0386c7 && c0386c8.f4226f == null) {
                            int e = c0386c7.e() + d2;
                            c0387d2.K(e, c0387d2.k() + e);
                            i(i4, c0387d2, c0415f);
                        } else if (c0386c6 == c0386c8 && c0386c7.f4226f == null) {
                            int e2 = d2 - c0386c8.e();
                            c0387d2.K(e2 - c0387d2.k(), e2);
                            i(i4, c0387d2, c0415f);
                        } else if (z2 && !c0387d2.y()) {
                            f(i4, c0387d2, c0415f);
                        }
                    }
                } else if (i5 == 3 && c0387d2.f4290y >= 0 && c0387d2.f4289x >= 0 && (c0387d2.f4266g0 == 8 || (c0387d2.f4284s == 0 && c0387d2.f4250W == 0.0f))) {
                    if (!c0387d2.y() && !c0387d2.f4234F && z2 && !c0387d2.y()) {
                        g(i4, c0387d, c0415f, c0387d2);
                    }
                }
            }
        }
        if (c0387d instanceof u.h) {
            return;
        }
        HashSet hashSet2 = i3.f4222a;
        if (hashSet2 != null && i3.f4224c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0386c c0386c9 = (C0386c) it2.next();
                C0387d c0387d3 = c0386c9.f4225d;
                int i6 = i + 1;
                boolean a3 = a(c0387d3);
                if (c0387d3.z() && a3) {
                    C0388e.V(c0387d3, c0415f, new C0393b());
                }
                C0386c c0386c10 = c0387d3.f4237J;
                C0386c c0386c11 = c0387d3.f4239L;
                boolean z3 = (c0386c9 == c0386c10 && (c0386c3 = c0386c11.f4226f) != null && c0386c3.f4224c) || (c0386c9 == c0386c11 && (c0386c2 = c0386c10.f4226f) != null && c0386c2.f4224c);
                int i7 = c0387d3.f4281p0[1];
                if (i7 != 3 || a3) {
                    if (!c0387d3.z()) {
                        if (c0386c9 == c0386c10 && c0386c11.f4226f == null) {
                            int e3 = c0386c10.e() + d3;
                            c0387d3.K(e3, c0387d3.k() + e3);
                            i(i6, c0387d3, c0415f);
                        } else if (c0386c9 == c0386c11 && c0386c10.f4226f == null) {
                            int e4 = d3 - c0386c11.e();
                            c0387d3.K(e4 - c0387d3.k(), e4);
                            i(i6, c0387d3, c0415f);
                        } else if (z3 && !c0387d3.y()) {
                            f(i6, c0387d3, c0415f);
                        }
                    }
                } else if (i7 == 3 && c0387d3.f4290y >= 0 && c0387d3.f4289x >= 0) {
                    if (c0387d3.f4266g0 != 8) {
                        if (c0387d3.f4284s == 0) {
                            if (c0387d3.f4250W == 0.0f) {
                            }
                        }
                    }
                    if (!c0387d3.y() && !c0387d3.f4234F && z3 && !c0387d3.y()) {
                        g(i6, c0387d, c0415f, c0387d3);
                    }
                }
            }
        }
        C0386c i8 = c0387d.i(6);
        if (i8.f4222a != null && i8.f4224c) {
            int d4 = i8.d();
            Iterator it3 = i8.f4222a.iterator();
            while (it3.hasNext()) {
                C0386c c0386c12 = (C0386c) it3.next();
                C0387d c0387d4 = c0386c12.f4225d;
                int i9 = i + 1;
                boolean a4 = a(c0387d4);
                if (c0387d4.z() && a4) {
                    C0388e.V(c0387d4, c0415f, new C0393b());
                }
                if (c0387d4.f4281p0[1] != 3 || a4) {
                    if (!c0387d4.z() && c0386c12 == (c0386c = c0387d4.f4240M)) {
                        int e5 = c0386c12.e() + d4;
                        if (c0387d4.f4233E) {
                            int i10 = e5 - c0387d4.f4255a0;
                            int i11 = c0387d4.f4249V + i10;
                            c0387d4.f4253Z = i10;
                            c0387d4.f4237J.l(i10);
                            c0387d4.f4239L.l(i11);
                            c0386c.l(e5);
                            c0387d4.f4273l = true;
                        }
                        i(i9, c0387d4, c0415f);
                    }
                }
            }
        }
        c0387d.f4277n = true;
    }
}
