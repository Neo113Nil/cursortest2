package u;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0301b f3932a = new C0301b();

    public static boolean a(t.d dVar) {
        int[] iArr = dVar.p0;
        int i = iArr[0];
        int i2 = iArr[1];
        t.d dVar2 = dVar.f3769T;
        t.e eVar = dVar2 != null ? (t.e) dVar2 : null;
        if (eVar != null) {
            int i3 = eVar.p0[0];
        }
        if (eVar != null) {
            int i4 = eVar.p0[1];
        }
        boolean z2 = i == 1 || dVar.A() || i == 2 || (i == 3 && dVar.f3805r == 0 && dVar.f3772W == RecyclerView.A0 && dVar.t(0)) || (i == 3 && dVar.f3805r == 1 && dVar.u(0, dVar.q()));
        boolean z3 = i2 == 1 || dVar.B() || i2 == 2 || (i2 == 3 && dVar.f3806s == 0 && dVar.f3772W == RecyclerView.A0 && dVar.t(1)) || (i2 == 3 && dVar.f3806s == 1 && dVar.u(1, dVar.k()));
        if (dVar.f3772W <= RecyclerView.A0 || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static n b(t.d dVar, int i, ArrayList arrayList, n nVar) {
        int i2;
        int i3 = i == 0 ? dVar.f3800n0 : dVar.f3802o0;
        if (i3 != -1 && (nVar == null || i3 != nVar.f3940b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i4);
                if (nVar2.f3940b == i3) {
                    if (nVar != null) {
                        nVar.c(i, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof t.i) {
                t.i iVar = (t.i) dVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.f3891r0) {
                        i2 = -1;
                        break;
                    }
                    t.d dVar2 = iVar.f3890q0[i5];
                    if ((i == 0 && (i2 = dVar2.f3800n0) != -1) || (i == 1 && (i2 = dVar2.f3802o0) != -1)) {
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
                        n nVar3 = (n) arrayList.get(i6);
                        if (nVar3.f3940b == i2) {
                            nVar = nVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f3939a = new ArrayList();
                nVar.d = null;
                nVar.f3942e = -1;
                int i7 = n.f3938f;
                n.f3938f = i7 + 1;
                nVar.f3940b = i7;
                nVar.f3941c = i;
            }
            arrayList.add(nVar);
        }
        ArrayList arrayList2 = nVar.f3939a;
        if (!arrayList2.contains(dVar)) {
            arrayList2.add(dVar);
            if (dVar instanceof t.h) {
                t.h hVar = (t.h) dVar;
                hVar.f3887t0.c(hVar.f3888u0 == 0 ? 1 : 0, arrayList, nVar);
            }
            int i8 = nVar.f3940b;
            if (i == 0) {
                dVar.f3800n0 = i8;
                dVar.f3758I.c(i, arrayList, nVar);
                dVar.f3760K.c(i, arrayList, nVar);
            } else {
                dVar.f3802o0 = i8;
                dVar.f3759J.c(i, arrayList, nVar);
                dVar.f3762M.c(i, arrayList, nVar);
                dVar.f3761L.c(i, arrayList, nVar);
            }
            dVar.f3765P.c(i, arrayList, nVar);
        }
        return nVar;
    }

    public static void c(int i, t.d dVar, w.f fVar, boolean z2) {
        t.c cVar;
        t.c cVar2;
        t.c cVar3;
        t.c cVar4;
        if (dVar.f3797m) {
            return;
        }
        if (!(dVar instanceof t.e) && dVar.z() && a(dVar)) {
            t.e.V(dVar, fVar, new C0301b());
        }
        t.c i2 = dVar.i(2);
        t.c i3 = dVar.i(4);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3744a;
        char c2 = 0;
        if (hashSet != null && i2.f3746c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                t.c cVar5 = (t.c) it.next();
                t.d dVar2 = cVar5.d;
                int i4 = i + 1;
                boolean a2 = a(dVar2);
                if (dVar2.z() && a2) {
                    t.e.V(dVar2, fVar, new C0301b());
                }
                t.c cVar6 = dVar2.f3758I;
                t.c cVar7 = dVar2.f3760K;
                char c3 = ((cVar5 == cVar6 && (cVar4 = cVar7.f3748f) != null && cVar4.f3746c) || (cVar5 == cVar7 && (cVar3 = cVar6.f3748f) != null && cVar3.f3746c)) ? (char) 1 : c2;
                int i5 = dVar2.p0[c2];
                if (i5 != 3 || a2) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f3748f == null) {
                            int e2 = cVar6.e() + d;
                            dVar2.J(e2, dVar2.q() + e2);
                            c(i4, dVar2, fVar, z2);
                        } else if (cVar5 == cVar7 && cVar6.f3748f == null) {
                            int e3 = d - cVar7.e();
                            dVar2.J(e3 - dVar2.q(), e3);
                            c(i4, dVar2, fVar, z2);
                        } else if (c3 != 0 && !dVar2.x()) {
                            d(i4, dVar2, fVar, z2);
                        }
                    }
                } else if (i5 == 3 && dVar2.f3809v >= 0 && dVar2.f3808u >= 0 && ((dVar2.f3788g0 == 8 || (dVar2.f3805r == 0 && dVar2.f3772W == RecyclerView.A0)) && !dVar2.x() && !dVar2.f3756F && c3 != 0 && !dVar2.x())) {
                    e(i4, dVar, fVar, dVar2, z2);
                }
                c2 = 0;
            }
        }
        if (dVar instanceof t.h) {
            return;
        }
        HashSet hashSet2 = i3.f3744a;
        if (hashSet2 != null && i3.f3746c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                t.c cVar8 = (t.c) it2.next();
                t.d dVar3 = cVar8.d;
                int i6 = i + 1;
                boolean a3 = a(dVar3);
                if (dVar3.z() && a3) {
                    t.e.V(dVar3, fVar, new C0301b());
                }
                t.c cVar9 = dVar3.f3758I;
                t.c cVar10 = dVar3.f3760K;
                boolean z3 = (cVar8 == cVar9 && (cVar2 = cVar10.f3748f) != null && cVar2.f3746c) || (cVar8 == cVar10 && (cVar = cVar9.f3748f) != null && cVar.f3746c);
                int i7 = dVar3.p0[0];
                if (i7 != 3 || a3) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f3748f == null) {
                            int e4 = cVar9.e() + d2;
                            dVar3.J(e4, dVar3.q() + e4);
                            c(i6, dVar3, fVar, z2);
                        } else if (cVar8 == cVar10 && cVar9.f3748f == null) {
                            int e5 = d2 - cVar10.e();
                            dVar3.J(e5 - dVar3.q(), e5);
                            c(i6, dVar3, fVar, z2);
                        } else if (z3 && !dVar3.x()) {
                            d(i6, dVar3, fVar, z2);
                        }
                    }
                } else if (i7 == 3 && dVar3.f3809v >= 0 && dVar3.f3808u >= 0) {
                    if (dVar3.f3788g0 != 8) {
                        if (dVar3.f3805r == 0) {
                            if (dVar3.f3772W == RecyclerView.A0) {
                            }
                        }
                    }
                    if (!dVar3.x() && !dVar3.f3756F && z3 && !dVar3.x()) {
                        e(i6, dVar, fVar, dVar3, z2);
                    }
                }
            }
        }
        dVar.f3797m = true;
    }

    public static void d(int i, t.d dVar, w.f fVar, boolean z2) {
        float f2 = dVar.f3782d0;
        t.c cVar = dVar.f3758I;
        int d = cVar.f3748f.d();
        t.c cVar2 = dVar.f3760K;
        int d2 = cVar2.f3748f.d();
        int e2 = cVar.e() + d;
        int e3 = d2 - cVar2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int q2 = dVar.q();
        int i2 = (d2 - d) - q2;
        if (d > d2) {
            i2 = (d - d2) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d;
        int i4 = i3 + q2;
        if (d > d2) {
            i4 = i3 - q2;
        }
        dVar.J(i3, i4);
        c(i + 1, dVar, fVar, z2);
    }

    public static void e(int i, t.d dVar, w.f fVar, t.d dVar2, boolean z2) {
        float f2 = dVar2.f3782d0;
        t.c cVar = dVar2.f3758I;
        int e2 = cVar.e() + cVar.f3748f.d();
        t.c cVar2 = dVar2.f3760K;
        int d = cVar2.f3748f.d() - cVar2.e();
        if (d >= e2) {
            int q2 = dVar2.q();
            if (dVar2.f3788g0 != 8) {
                int i2 = dVar2.f3805r;
                if (i2 == 2) {
                    q2 = (int) (dVar2.f3782d0 * 0.5f * (dVar instanceof t.e ? dVar.q() : dVar.f3769T.q()));
                } else if (i2 == 0) {
                    q2 = d - e2;
                }
                q2 = Math.max(dVar2.f3808u, q2);
                int i3 = dVar2.f3809v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - q2)) + 0.5f));
            dVar2.J(i4, q2 + i4);
            c(i + 1, dVar2, fVar, z2);
        }
    }

    public static void f(int i, t.d dVar, w.f fVar) {
        float f2 = dVar.f3784e0;
        t.c cVar = dVar.f3759J;
        int d = cVar.f3748f.d();
        t.c cVar2 = dVar.f3761L;
        int d2 = cVar2.f3748f.d();
        int e2 = cVar.e() + d;
        int e3 = d2 - cVar2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int k2 = dVar.k();
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
        dVar.K(i4, i5);
        i(i + 1, dVar, fVar);
    }

    public static void g(int i, t.d dVar, w.f fVar, t.d dVar2) {
        float f2 = dVar2.f3784e0;
        t.c cVar = dVar2.f3759J;
        int e2 = cVar.e() + cVar.f3748f.d();
        t.c cVar2 = dVar2.f3761L;
        int d = cVar2.f3748f.d() - cVar2.e();
        if (d >= e2) {
            int k2 = dVar2.k();
            if (dVar2.f3788g0 != 8) {
                int i2 = dVar2.f3806s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (dVar instanceof t.e ? dVar.k() : dVar.f3769T.k()));
                } else if (i2 == 0) {
                    k2 = d - e2;
                }
                k2 = Math.max(dVar2.f3811x, k2);
                int i3 = dVar2.f3812y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - k2)) + 0.5f));
            dVar2.K(i4, k2 + i4);
            i(i + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, t.d dVar, w.f fVar) {
        t.c cVar;
        t.c cVar2;
        t.c cVar3;
        t.c cVar4;
        t.c cVar5;
        if (dVar.f3799n) {
            return;
        }
        if (!(dVar instanceof t.e) && dVar.z() && a(dVar)) {
            t.e.V(dVar, fVar, new C0301b());
        }
        t.c i2 = dVar.i(3);
        t.c i3 = dVar.i(5);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3744a;
        if (hashSet != null && i2.f3746c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                t.c cVar6 = (t.c) it.next();
                t.d dVar2 = cVar6.d;
                int i4 = i + 1;
                boolean a2 = a(dVar2);
                if (dVar2.z() && a2) {
                    t.e.V(dVar2, fVar, new C0301b());
                }
                t.c cVar7 = dVar2.f3759J;
                t.c cVar8 = dVar2.f3761L;
                boolean z2 = (cVar6 == cVar7 && (cVar5 = cVar8.f3748f) != null && cVar5.f3746c) || (cVar6 == cVar8 && (cVar4 = cVar7.f3748f) != null && cVar4.f3746c);
                int i5 = dVar2.p0[1];
                if (i5 != 3 || a2) {
                    if (!dVar2.z()) {
                        if (cVar6 == cVar7 && cVar8.f3748f == null) {
                            int e2 = cVar7.e() + d;
                            dVar2.K(e2, dVar2.k() + e2);
                            i(i4, dVar2, fVar);
                        } else if (cVar6 == cVar8 && cVar7.f3748f == null) {
                            int e3 = d - cVar8.e();
                            dVar2.K(e3 - dVar2.k(), e3);
                            i(i4, dVar2, fVar);
                        } else if (z2 && !dVar2.y()) {
                            f(i4, dVar2, fVar);
                        }
                    }
                } else if (i5 == 3 && dVar2.f3812y >= 0 && dVar2.f3811x >= 0 && (dVar2.f3788g0 == 8 || (dVar2.f3806s == 0 && dVar2.f3772W == RecyclerView.A0))) {
                    if (!dVar2.y() && !dVar2.f3756F && z2 && !dVar2.y()) {
                        g(i4, dVar, fVar, dVar2);
                    }
                }
            }
        }
        if (dVar instanceof t.h) {
            return;
        }
        HashSet hashSet2 = i3.f3744a;
        if (hashSet2 != null && i3.f3746c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                t.c cVar9 = (t.c) it2.next();
                t.d dVar3 = cVar9.d;
                int i6 = i + 1;
                boolean a3 = a(dVar3);
                if (dVar3.z() && a3) {
                    t.e.V(dVar3, fVar, new C0301b());
                }
                t.c cVar10 = dVar3.f3759J;
                t.c cVar11 = dVar3.f3761L;
                boolean z3 = (cVar9 == cVar10 && (cVar3 = cVar11.f3748f) != null && cVar3.f3746c) || (cVar9 == cVar11 && (cVar2 = cVar10.f3748f) != null && cVar2.f3746c);
                int i7 = dVar3.p0[1];
                if (i7 != 3 || a3) {
                    if (!dVar3.z()) {
                        if (cVar9 == cVar10 && cVar11.f3748f == null) {
                            int e4 = cVar10.e() + d2;
                            dVar3.K(e4, dVar3.k() + e4);
                            i(i6, dVar3, fVar);
                        } else if (cVar9 == cVar11 && cVar10.f3748f == null) {
                            int e5 = d2 - cVar11.e();
                            dVar3.K(e5 - dVar3.k(), e5);
                            i(i6, dVar3, fVar);
                        } else if (z3 && !dVar3.y()) {
                            f(i6, dVar3, fVar);
                        }
                    }
                } else if (i7 == 3 && dVar3.f3812y >= 0 && dVar3.f3811x >= 0) {
                    if (dVar3.f3788g0 != 8) {
                        if (dVar3.f3806s == 0) {
                            if (dVar3.f3772W == RecyclerView.A0) {
                            }
                        }
                    }
                    if (!dVar3.y() && !dVar3.f3756F && z3 && !dVar3.y()) {
                        g(i6, dVar, fVar, dVar3);
                    }
                }
            }
        }
        t.c i8 = dVar.i(6);
        if (i8.f3744a != null && i8.f3746c) {
            int d3 = i8.d();
            Iterator it3 = i8.f3744a.iterator();
            while (it3.hasNext()) {
                t.c cVar12 = (t.c) it3.next();
                t.d dVar4 = cVar12.d;
                int i9 = i + 1;
                boolean a4 = a(dVar4);
                if (dVar4.z() && a4) {
                    t.e.V(dVar4, fVar, new C0301b());
                }
                if (dVar4.p0[1] != 3 || a4) {
                    if (!dVar4.z() && cVar12 == (cVar = dVar4.f3762M)) {
                        int e6 = cVar12.e() + d3;
                        if (dVar4.f3755E) {
                            int i10 = e6 - dVar4.f3777a0;
                            int i11 = dVar4.f3771V + i10;
                            dVar4.f3775Z = i10;
                            dVar4.f3759J.l(i10);
                            dVar4.f3761L.l(i11);
                            cVar.l(e6);
                            dVar4.f3796l = true;
                        }
                        i(i9, dVar4, fVar);
                    }
                }
            }
        }
        dVar.f3799n = true;
    }
}
