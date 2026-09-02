package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3538a = new b();

    public static boolean a(v.d dVar) {
        int[] iArr = dVar.f3418p0;
        int i = iArr[0];
        int i4 = iArr[1];
        v.d dVar2 = dVar.T;
        v.e eVar = dVar2 != null ? (v.e) dVar2 : null;
        if (eVar != null) {
            int i5 = eVar.f3418p0[0];
        }
        if (eVar != null) {
            int i6 = eVar.f3418p0[1];
        }
        boolean z3 = i == 1 || dVar.A() || i == 2 || (i == 3 && dVar.f3420r == 0 && dVar.W == 0.0f && dVar.t(0)) || (i == 3 && dVar.f3420r == 1 && dVar.u(0, dVar.q()));
        boolean z4 = i4 == 1 || dVar.B() || i4 == 2 || (i4 == 3 && dVar.f3421s == 0 && dVar.W == 0.0f && dVar.t(1)) || (i4 == 3 && dVar.f3421s == 1 && dVar.u(1, dVar.k()));
        return (dVar.W > 0.0f && (z3 || z4)) || (z3 && z4);
    }

    public static n b(v.d dVar, int i, ArrayList arrayList, n nVar) {
        int i4;
        int i5 = i == 0 ? dVar.f3414n0 : dVar.f3416o0;
        if (i5 != -1 && (nVar == null || i5 != nVar.f3546b)) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i6);
                if (nVar2.f3546b == i5) {
                    if (nVar != null) {
                        nVar.c(i, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i6++;
                }
            }
        } else if (i5 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof v.i) {
                v.i iVar = (v.i) dVar;
                int i7 = 0;
                while (true) {
                    if (i7 >= iVar.f3472r0) {
                        i4 = -1;
                        break;
                    }
                    v.d dVar2 = iVar.f3471q0[i7];
                    if ((i == 0 && (i4 = dVar2.f3414n0) != -1) || (i == 1 && (i4 = dVar2.f3416o0) != -1)) {
                        break;
                    }
                    i7++;
                }
                if (i4 != -1) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = (n) arrayList.get(i8);
                        if (nVar3.f3546b == i4) {
                            nVar = nVar3;
                            break;
                        }
                        i8++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f3545a = new ArrayList();
                nVar.d = null;
                nVar.f3548e = -1;
                int i9 = n.f3544f;
                n.f3544f = i9 + 1;
                nVar.f3546b = i9;
                nVar.f3547c = i;
            }
            arrayList.add(nVar);
        }
        int i10 = nVar.f3546b;
        ArrayList arrayList2 = nVar.f3545a;
        if (arrayList2.contains(dVar)) {
            return nVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof v.h) {
            v.h hVar = (v.h) dVar;
            hVar.f3468t0.c(hVar.f3469u0 == 0 ? 1 : 0, arrayList, nVar);
        }
        if (i == 0) {
            dVar.f3414n0 = i10;
            dVar.I.c(i, arrayList, nVar);
            dVar.K.c(i, arrayList, nVar);
        } else {
            dVar.f3416o0 = i10;
            dVar.J.c(i, arrayList, nVar);
            dVar.M.c(i, arrayList, nVar);
            dVar.L.c(i, arrayList, nVar);
        }
        dVar.P.c(i, arrayList, nVar);
        return nVar;
    }

    public static void c(int i, v.d dVar, y.f fVar, boolean z3) {
        v.c cVar;
        v.c cVar2;
        boolean z4;
        v.c cVar3;
        v.c cVar4;
        if (dVar.f3411m) {
            return;
        }
        if (!(dVar instanceof v.e) && dVar.z() && a(dVar)) {
            v.e.V(dVar, fVar, new b());
        }
        v.c i4 = dVar.i(2);
        v.c i5 = dVar.i(4);
        int d = i4.d();
        int d3 = i5.d();
        HashSet hashSet = i4.f3384a;
        if (hashSet != null && i4.f3386c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                v.c cVar5 = (v.c) it.next();
                v.d dVar2 = cVar5.d;
                int i6 = i + 1;
                boolean a2 = a(dVar2);
                v.c cVar6 = dVar2.I;
                v.c cVar7 = dVar2.K;
                if (dVar2.z() && a2) {
                    z4 = true;
                    v.e.V(dVar2, fVar, new b());
                } else {
                    z4 = true;
                }
                boolean z5 = ((cVar5 == cVar6 && (cVar4 = cVar7.f3388f) != null && cVar4.f3386c) || (cVar5 == cVar7 && (cVar3 = cVar6.f3388f) != null && cVar3.f3386c)) ? z4 : false;
                int i7 = dVar2.f3418p0[0];
                if (i7 != 3 || a2) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f3388f == null) {
                            int e4 = cVar6.e() + d;
                            dVar2.J(e4, dVar2.q() + e4);
                            c(i6, dVar2, fVar, z3);
                        } else if (cVar5 == cVar7 && cVar6.f3388f == null) {
                            int e5 = d - cVar7.e();
                            dVar2.J(e5 - dVar2.q(), e5);
                            c(i6, dVar2, fVar, z3);
                        } else if (z5 && !dVar2.x()) {
                            d(i6, dVar2, fVar, z3);
                        }
                    }
                } else if (i7 == 3 && dVar2.f3424v >= 0 && dVar2.f3423u >= 0 && (dVar2.f3402g0 == 8 || (dVar2.f3420r == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.x() && !dVar2.F && z5 && !dVar2.x()) {
                        e(i6, dVar, fVar, dVar2, z3);
                    }
                }
            }
        }
        if (dVar instanceof v.h) {
            return;
        }
        HashSet hashSet2 = i5.f3384a;
        if (hashSet2 != null && i5.f3386c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                v.c cVar8 = (v.c) it2.next();
                v.d dVar3 = cVar8.d;
                int i8 = i + 1;
                boolean a4 = a(dVar3);
                v.c cVar9 = dVar3.I;
                v.c cVar10 = dVar3.K;
                if (dVar3.z() && a4) {
                    v.e.V(dVar3, fVar, new b());
                }
                boolean z6 = (cVar8 == cVar9 && (cVar2 = cVar10.f3388f) != null && cVar2.f3386c) || (cVar8 == cVar10 && (cVar = cVar9.f3388f) != null && cVar.f3386c);
                int i9 = dVar3.f3418p0[0];
                if (i9 != 3 || a4) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f3388f == null) {
                            int e6 = cVar9.e() + d3;
                            dVar3.J(e6, dVar3.q() + e6);
                            c(i8, dVar3, fVar, z3);
                        } else if (cVar8 == cVar10 && cVar9.f3388f == null) {
                            int e7 = d3 - cVar10.e();
                            dVar3.J(e7 - dVar3.q(), e7);
                            c(i8, dVar3, fVar, z3);
                        } else if (z6 && !dVar3.x()) {
                            d(i8, dVar3, fVar, z3);
                        }
                    }
                } else if (i9 == 3 && dVar3.f3424v >= 0 && dVar3.f3423u >= 0) {
                    if (dVar3.f3402g0 == 8 || (dVar3.f3420r == 0 && dVar3.W == 0.0f)) {
                        if (!dVar3.x() && !dVar3.F && z6 && !dVar3.x()) {
                            e(i8, dVar, fVar, dVar3, z3);
                        }
                    }
                }
            }
        }
        dVar.f3411m = true;
    }

    public static void d(int i, v.d dVar, y.f fVar, boolean z3) {
        float f2 = dVar.d0;
        v.c cVar = dVar.I;
        int d = cVar.f3388f.d();
        v.c cVar2 = dVar.K;
        int d3 = cVar2.f3388f.d();
        int e4 = cVar.e() + d;
        int e5 = d3 - cVar2.e();
        if (d == d3) {
            f2 = 0.5f;
        } else {
            d = e4;
            d3 = e5;
        }
        int q3 = dVar.q();
        int i4 = (d3 - d) - q3;
        if (d > d3) {
            i4 = (d - d3) - q3;
        }
        int i5 = ((int) (i4 > 0 ? (f2 * i4) + 0.5f : f2 * i4)) + d;
        int i6 = i5 + q3;
        if (d > d3) {
            i6 = i5 - q3;
        }
        dVar.J(i5, i6);
        c(i + 1, dVar, fVar, z3);
    }

    public static void e(int i, v.d dVar, y.f fVar, v.d dVar2, boolean z3) {
        float f2 = dVar2.d0;
        v.c cVar = dVar2.I;
        int e4 = cVar.e() + cVar.f3388f.d();
        v.c cVar2 = dVar2.K;
        int d = cVar2.f3388f.d() - cVar2.e();
        if (d >= e4) {
            int q3 = dVar2.q();
            if (dVar2.f3402g0 != 8) {
                int i4 = dVar2.f3420r;
                if (i4 == 2) {
                    q3 = (int) (dVar2.d0 * 0.5f * (dVar instanceof v.e ? dVar.q() : dVar.T.q()));
                } else if (i4 == 0) {
                    q3 = d - e4;
                }
                q3 = Math.max(dVar2.f3423u, q3);
                int i5 = dVar2.f3424v;
                if (i5 > 0) {
                    q3 = Math.min(i5, q3);
                }
            }
            int i6 = e4 + ((int) ((f2 * ((d - e4) - q3)) + 0.5f));
            dVar2.J(i6, q3 + i6);
            c(i + 1, dVar2, fVar, z3);
        }
    }

    public static void f(int i, v.d dVar, y.f fVar) {
        float f2 = dVar.f3398e0;
        v.c cVar = dVar.J;
        int d = cVar.f3388f.d();
        v.c cVar2 = dVar.L;
        int d3 = cVar2.f3388f.d();
        int e4 = cVar.e() + d;
        int e5 = d3 - cVar2.e();
        if (d == d3) {
            f2 = 0.5f;
        } else {
            d = e4;
            d3 = e5;
        }
        int k4 = dVar.k();
        int i4 = (d3 - d) - k4;
        if (d > d3) {
            i4 = (d - d3) - k4;
        }
        int i5 = (int) (i4 > 0 ? (f2 * i4) + 0.5f : f2 * i4);
        int i6 = d + i5;
        int i7 = i6 + k4;
        if (d > d3) {
            i6 = d - i5;
            i7 = i6 - k4;
        }
        dVar.K(i6, i7);
        i(i + 1, dVar, fVar);
    }

    public static void g(int i, v.d dVar, y.f fVar, v.d dVar2) {
        float f2 = dVar2.f3398e0;
        v.c cVar = dVar2.J;
        int e4 = cVar.e() + cVar.f3388f.d();
        v.c cVar2 = dVar2.L;
        int d = cVar2.f3388f.d() - cVar2.e();
        if (d >= e4) {
            int k4 = dVar2.k();
            if (dVar2.f3402g0 != 8) {
                int i4 = dVar2.f3421s;
                if (i4 == 2) {
                    k4 = (int) (f2 * 0.5f * (dVar instanceof v.e ? dVar.k() : dVar.T.k()));
                } else if (i4 == 0) {
                    k4 = d - e4;
                }
                k4 = Math.max(dVar2.f3426x, k4);
                int i5 = dVar2.f3427y;
                if (i5 > 0) {
                    k4 = Math.min(i5, k4);
                }
            }
            int i6 = e4 + ((int) ((f2 * ((d - e4) - k4)) + 0.5f));
            dVar2.K(i6, k4 + i6);
            i(i + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i, int i4, int i5, int i6) {
        return (i5 == 1 || i5 == 2 || (i5 == 4 && i != 2)) || (i6 == 1 || i6 == 2 || (i6 == 4 && i4 != 2));
    }

    public static void i(int i, v.d dVar, y.f fVar) {
        boolean z3;
        v.c cVar;
        v.c cVar2;
        v.c cVar3;
        v.c cVar4;
        if (dVar.f3413n) {
            return;
        }
        if (!(dVar instanceof v.e) && dVar.z() && a(dVar)) {
            v.e.V(dVar, fVar, new b());
        }
        v.c i4 = dVar.i(3);
        v.c i5 = dVar.i(5);
        int d = i4.d();
        int d3 = i5.d();
        HashSet hashSet = i4.f3384a;
        if (hashSet != null && i4.f3386c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                v.c cVar5 = (v.c) it.next();
                v.d dVar2 = cVar5.d;
                int i6 = i + 1;
                boolean a2 = a(dVar2);
                v.c cVar6 = dVar2.J;
                v.c cVar7 = dVar2.L;
                if (dVar2.z() && a2) {
                    v.e.V(dVar2, fVar, new b());
                }
                boolean z4 = (cVar5 == cVar6 && (cVar4 = cVar7.f3388f) != null && cVar4.f3386c) || (cVar5 == cVar7 && (cVar3 = cVar6.f3388f) != null && cVar3.f3386c);
                int i7 = dVar2.f3418p0[1];
                if (i7 != 3 || a2) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f3388f == null) {
                            int e4 = cVar6.e() + d;
                            dVar2.K(e4, dVar2.k() + e4);
                            i(i6, dVar2, fVar);
                        } else if (cVar5 == cVar7 && cVar6.f3388f == null) {
                            int e5 = d - cVar7.e();
                            dVar2.K(e5 - dVar2.k(), e5);
                            i(i6, dVar2, fVar);
                        } else if (z4 && !dVar2.y()) {
                            f(i6, dVar2, fVar);
                        }
                    }
                } else if (i7 == 3 && dVar2.f3427y >= 0 && dVar2.f3426x >= 0 && (dVar2.f3402g0 == 8 || (dVar2.f3421s == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.y() && !dVar2.F && z4 && !dVar2.y()) {
                        g(i6, dVar, fVar, dVar2);
                    }
                }
            }
        }
        boolean z5 = true;
        z5 = true;
        z5 = true;
        if (dVar instanceof v.h) {
            return;
        }
        HashSet hashSet2 = i5.f3384a;
        if (hashSet2 != null && i5.f3386c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                v.c cVar8 = (v.c) it2.next();
                v.d dVar3 = cVar8.d;
                int i8 = i + 1;
                boolean a4 = a(dVar3);
                v.c cVar9 = dVar3.J;
                v.c cVar10 = dVar3.L;
                if (dVar3.z() && a4) {
                    v.e.V(dVar3, fVar, new b());
                }
                boolean z6 = (cVar8 == cVar9 && (cVar2 = cVar10.f3388f) != null && cVar2.f3386c) || (cVar8 == cVar10 && (cVar = cVar9.f3388f) != null && cVar.f3386c);
                int i9 = dVar3.f3418p0[1];
                if (i9 != 3 || a4) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f3388f == null) {
                            int e6 = cVar9.e() + d3;
                            dVar3.K(e6, dVar3.k() + e6);
                            i(i8, dVar3, fVar);
                        } else if (cVar8 == cVar10 && cVar9.f3388f == null) {
                            int e7 = d3 - cVar10.e();
                            dVar3.K(e7 - dVar3.k(), e7);
                            i(i8, dVar3, fVar);
                        } else if (z6 && !dVar3.y()) {
                            f(i8, dVar3, fVar);
                        }
                    }
                } else if (i9 == 3 && dVar3.f3427y >= 0 && dVar3.f3426x >= 0 && (dVar3.f3402g0 == 8 || (dVar3.f3421s == 0 && dVar3.W == 0.0f))) {
                    if (!dVar3.y() && !dVar3.F && z6 && !dVar3.y()) {
                        g(i8, dVar, fVar, dVar3);
                    }
                }
            }
        }
        v.c i10 = dVar.i(6);
        if (i10.f3384a != null && i10.f3386c) {
            int d4 = i10.d();
            Iterator it3 = i10.f3384a.iterator();
            while (it3.hasNext()) {
                v.c cVar11 = (v.c) it3.next();
                v.d dVar4 = cVar11.d;
                int i11 = i + 1;
                boolean a5 = a(dVar4);
                v.c cVar12 = dVar4.M;
                if (dVar4.z() && a5) {
                    v.e.V(dVar4, fVar, new b());
                }
                if (dVar4.f3418p0[z5 ? 1 : 0] != 3 || a5) {
                    if (!dVar4.z()) {
                        if (cVar11 == cVar12) {
                            int e8 = cVar11.e() + d4;
                            if (dVar4.E) {
                                int i12 = e8 - dVar4.f3392a0;
                                int i13 = dVar4.V + i12;
                                dVar4.Z = i12;
                                dVar4.J.l(i12);
                                dVar4.L.l(i13);
                                cVar12.l(e8);
                                z3 = z5 ? 1 : 0;
                                dVar4.f3409l = z3;
                            } else {
                                z3 = z5 ? 1 : 0;
                            }
                            i(i11, dVar4, fVar);
                            z5 = z3;
                        }
                    }
                }
                z3 = z5 ? 1 : 0;
                z5 = z3;
            }
        }
        dVar.f3413n = z5;
    }
}
