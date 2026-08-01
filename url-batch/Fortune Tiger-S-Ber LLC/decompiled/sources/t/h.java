package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3343a = new b();

    public static boolean a(s.d dVar) {
        int[] iArr = dVar.f3259p0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        s.d dVar2 = dVar.T;
        s.e eVar = dVar2 != null ? (s.e) dVar2 : null;
        if (eVar != null) {
            int i6 = eVar.f3259p0[0];
        }
        if (eVar != null) {
            int i7 = eVar.f3259p0[1];
        }
        boolean z3 = i4 == 1 || dVar.A() || i4 == 2 || (i4 == 3 && dVar.f3261r == 0 && dVar.W == 0.0f && dVar.t(0)) || (i4 == 3 && dVar.f3261r == 1 && dVar.u(0, dVar.q()));
        boolean z4 = i5 == 1 || dVar.B() || i5 == 2 || (i5 == 3 && dVar.f3262s == 0 && dVar.W == 0.0f && dVar.t(1)) || (i5 == 3 && dVar.f3262s == 1 && dVar.u(1, dVar.k()));
        return (dVar.W > 0.0f && (z3 || z4)) || (z3 && z4);
    }

    public static n b(s.d dVar, int i4, ArrayList arrayList, n nVar) {
        int i5;
        int i6 = i4 == 0 ? dVar.f3255n0 : dVar.f3257o0;
        if (i6 != -1 && (nVar == null || i6 != nVar.f3351b)) {
            int i7 = 0;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i7);
                if (nVar2.f3351b == i6) {
                    if (nVar != null) {
                        nVar.c(i4, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i7++;
                }
            }
        } else if (i6 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof s.i) {
                s.i iVar = (s.i) dVar;
                int i8 = 0;
                while (true) {
                    if (i8 >= iVar.f3312r0) {
                        i5 = -1;
                        break;
                    }
                    s.d dVar2 = iVar.f3311q0[i8];
                    if ((i4 == 0 && (i5 = dVar2.f3255n0) != -1) || (i4 == 1 && (i5 = dVar2.f3257o0) != -1)) {
                        break;
                    }
                    i8++;
                }
                if (i5 != -1) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = (n) arrayList.get(i9);
                        if (nVar3.f3351b == i5) {
                            nVar = nVar3;
                            break;
                        }
                        i9++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f3350a = new ArrayList();
                nVar.f3352d = null;
                nVar.f3353e = -1;
                int i10 = n.f3349f;
                n.f3349f = i10 + 1;
                nVar.f3351b = i10;
                nVar.c = i4;
            }
            arrayList.add(nVar);
        }
        int i11 = nVar.f3351b;
        ArrayList arrayList2 = nVar.f3350a;
        if (arrayList2.contains(dVar)) {
            return nVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof s.h) {
            s.h hVar = (s.h) dVar;
            hVar.f3308t0.c(hVar.f3309u0 == 0 ? 1 : 0, arrayList, nVar);
        }
        if (i4 == 0) {
            dVar.f3255n0 = i11;
            dVar.I.c(i4, arrayList, nVar);
            dVar.K.c(i4, arrayList, nVar);
        } else {
            dVar.f3257o0 = i11;
            dVar.J.c(i4, arrayList, nVar);
            dVar.M.c(i4, arrayList, nVar);
            dVar.L.c(i4, arrayList, nVar);
        }
        dVar.P.c(i4, arrayList, nVar);
        return nVar;
    }

    public static void c(int i4, s.d dVar, v.f fVar, boolean z3) {
        s.c cVar;
        s.c cVar2;
        boolean z4;
        s.c cVar3;
        s.c cVar4;
        if (dVar.f3252m) {
            return;
        }
        if (!(dVar instanceof s.e) && dVar.z() && a(dVar)) {
            s.e.V(dVar, fVar, new b());
        }
        s.c i5 = dVar.i(2);
        s.c i6 = dVar.i(4);
        int d4 = i5.d();
        int d5 = i6.d();
        HashSet hashSet = i5.f3227a;
        if (hashSet != null && i5.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                s.c cVar5 = (s.c) it.next();
                s.d dVar2 = cVar5.f3229d;
                int i7 = i4 + 1;
                boolean a4 = a(dVar2);
                s.c cVar6 = dVar2.I;
                s.c cVar7 = dVar2.K;
                if (dVar2.z() && a4) {
                    z4 = true;
                    s.e.V(dVar2, fVar, new b());
                } else {
                    z4 = true;
                }
                boolean z5 = ((cVar5 == cVar6 && (cVar4 = cVar7.f3231f) != null && cVar4.c) || (cVar5 == cVar7 && (cVar3 = cVar6.f3231f) != null && cVar3.c)) ? z4 : false;
                int i8 = dVar2.f3259p0[0];
                if (i8 != 3 || a4) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f3231f == null) {
                            int e4 = cVar6.e() + d4;
                            dVar2.J(e4, dVar2.q() + e4);
                            c(i7, dVar2, fVar, z3);
                        } else if (cVar5 == cVar7 && cVar6.f3231f == null) {
                            int e5 = d4 - cVar7.e();
                            dVar2.J(e5 - dVar2.q(), e5);
                            c(i7, dVar2, fVar, z3);
                        } else if (z5 && !dVar2.x()) {
                            d(i7, dVar2, fVar, z3);
                        }
                    }
                } else if (i8 == 3 && dVar2.f3265v >= 0 && dVar2.f3264u >= 0 && (dVar2.f3242g0 == 8 || (dVar2.f3261r == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.x() && !dVar2.F && z5 && !dVar2.x()) {
                        e(i7, dVar, fVar, dVar2, z3);
                    }
                }
            }
        }
        if (dVar instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i6.f3227a;
        if (hashSet2 != null && i6.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                s.c cVar8 = (s.c) it2.next();
                s.d dVar3 = cVar8.f3229d;
                int i9 = i4 + 1;
                boolean a5 = a(dVar3);
                s.c cVar9 = dVar3.I;
                s.c cVar10 = dVar3.K;
                if (dVar3.z() && a5) {
                    s.e.V(dVar3, fVar, new b());
                }
                boolean z6 = (cVar8 == cVar9 && (cVar2 = cVar10.f3231f) != null && cVar2.c) || (cVar8 == cVar10 && (cVar = cVar9.f3231f) != null && cVar.c);
                int i10 = dVar3.f3259p0[0];
                if (i10 != 3 || a5) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f3231f == null) {
                            int e6 = cVar9.e() + d5;
                            dVar3.J(e6, dVar3.q() + e6);
                            c(i9, dVar3, fVar, z3);
                        } else if (cVar8 == cVar10 && cVar9.f3231f == null) {
                            int e7 = d5 - cVar10.e();
                            dVar3.J(e7 - dVar3.q(), e7);
                            c(i9, dVar3, fVar, z3);
                        } else if (z6 && !dVar3.x()) {
                            d(i9, dVar3, fVar, z3);
                        }
                    }
                } else if (i10 == 3 && dVar3.f3265v >= 0 && dVar3.f3264u >= 0) {
                    if (dVar3.f3242g0 == 8 || (dVar3.f3261r == 0 && dVar3.W == 0.0f)) {
                        if (!dVar3.x() && !dVar3.F && z6 && !dVar3.x()) {
                            e(i9, dVar, fVar, dVar3, z3);
                        }
                    }
                }
            }
        }
        dVar.f3252m = true;
    }

    public static void d(int i4, s.d dVar, v.f fVar, boolean z3) {
        float f4 = dVar.f3238d0;
        s.c cVar = dVar.I;
        int d4 = cVar.f3231f.d();
        s.c cVar2 = dVar.K;
        int d5 = cVar2.f3231f.d();
        int e4 = cVar.e() + d4;
        int e5 = d5 - cVar2.e();
        if (d4 == d5) {
            f4 = 0.5f;
        } else {
            d4 = e4;
            d5 = e5;
        }
        int q4 = dVar.q();
        int i5 = (d5 - d4) - q4;
        if (d4 > d5) {
            i5 = (d4 - d5) - q4;
        }
        int i6 = ((int) (i5 > 0 ? (f4 * i5) + 0.5f : f4 * i5)) + d4;
        int i7 = i6 + q4;
        if (d4 > d5) {
            i7 = i6 - q4;
        }
        dVar.J(i6, i7);
        c(i4 + 1, dVar, fVar, z3);
    }

    public static void e(int i4, s.d dVar, v.f fVar, s.d dVar2, boolean z3) {
        float f4 = dVar2.f3238d0;
        s.c cVar = dVar2.I;
        int e4 = cVar.e() + cVar.f3231f.d();
        s.c cVar2 = dVar2.K;
        int d4 = cVar2.f3231f.d() - cVar2.e();
        if (d4 >= e4) {
            int q4 = dVar2.q();
            if (dVar2.f3242g0 != 8) {
                int i5 = dVar2.f3261r;
                if (i5 == 2) {
                    q4 = (int) (dVar2.f3238d0 * 0.5f * (dVar instanceof s.e ? dVar.q() : dVar.T.q()));
                } else if (i5 == 0) {
                    q4 = d4 - e4;
                }
                q4 = Math.max(dVar2.f3264u, q4);
                int i6 = dVar2.f3265v;
                if (i6 > 0) {
                    q4 = Math.min(i6, q4);
                }
            }
            int i7 = e4 + ((int) ((f4 * ((d4 - e4) - q4)) + 0.5f));
            dVar2.J(i7, q4 + i7);
            c(i4 + 1, dVar2, fVar, z3);
        }
    }

    public static void f(int i4, s.d dVar, v.f fVar) {
        float f4 = dVar.f3240e0;
        s.c cVar = dVar.J;
        int d4 = cVar.f3231f.d();
        s.c cVar2 = dVar.L;
        int d5 = cVar2.f3231f.d();
        int e4 = cVar.e() + d4;
        int e5 = d5 - cVar2.e();
        if (d4 == d5) {
            f4 = 0.5f;
        } else {
            d4 = e4;
            d5 = e5;
        }
        int k4 = dVar.k();
        int i5 = (d5 - d4) - k4;
        if (d4 > d5) {
            i5 = (d4 - d5) - k4;
        }
        int i6 = (int) (i5 > 0 ? (f4 * i5) + 0.5f : f4 * i5);
        int i7 = d4 + i6;
        int i8 = i7 + k4;
        if (d4 > d5) {
            i7 = d4 - i6;
            i8 = i7 - k4;
        }
        dVar.K(i7, i8);
        i(i4 + 1, dVar, fVar);
    }

    public static void g(int i4, s.d dVar, v.f fVar, s.d dVar2) {
        float f4 = dVar2.f3240e0;
        s.c cVar = dVar2.J;
        int e4 = cVar.e() + cVar.f3231f.d();
        s.c cVar2 = dVar2.L;
        int d4 = cVar2.f3231f.d() - cVar2.e();
        if (d4 >= e4) {
            int k4 = dVar2.k();
            if (dVar2.f3242g0 != 8) {
                int i5 = dVar2.f3262s;
                if (i5 == 2) {
                    k4 = (int) (f4 * 0.5f * (dVar instanceof s.e ? dVar.k() : dVar.T.k()));
                } else if (i5 == 0) {
                    k4 = d4 - e4;
                }
                k4 = Math.max(dVar2.f3267x, k4);
                int i6 = dVar2.f3268y;
                if (i6 > 0) {
                    k4 = Math.min(i6, k4);
                }
            }
            int i7 = e4 + ((int) ((f4 * ((d4 - e4) - k4)) + 0.5f));
            dVar2.K(i7, k4 + i7);
            i(i4 + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i4, int i5, int i6, int i7) {
        return (i6 == 1 || i6 == 2 || (i6 == 4 && i4 != 2)) || (i7 == 1 || i7 == 2 || (i7 == 4 && i5 != 2));
    }

    public static void i(int i4, s.d dVar, v.f fVar) {
        boolean z3;
        s.c cVar;
        s.c cVar2;
        s.c cVar3;
        s.c cVar4;
        if (dVar.f3254n) {
            return;
        }
        if (!(dVar instanceof s.e) && dVar.z() && a(dVar)) {
            s.e.V(dVar, fVar, new b());
        }
        s.c i5 = dVar.i(3);
        s.c i6 = dVar.i(5);
        int d4 = i5.d();
        int d5 = i6.d();
        HashSet hashSet = i5.f3227a;
        if (hashSet != null && i5.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                s.c cVar5 = (s.c) it.next();
                s.d dVar2 = cVar5.f3229d;
                int i7 = i4 + 1;
                boolean a4 = a(dVar2);
                s.c cVar6 = dVar2.J;
                s.c cVar7 = dVar2.L;
                if (dVar2.z() && a4) {
                    s.e.V(dVar2, fVar, new b());
                }
                boolean z4 = (cVar5 == cVar6 && (cVar4 = cVar7.f3231f) != null && cVar4.c) || (cVar5 == cVar7 && (cVar3 = cVar6.f3231f) != null && cVar3.c);
                int i8 = dVar2.f3259p0[1];
                if (i8 != 3 || a4) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f3231f == null) {
                            int e4 = cVar6.e() + d4;
                            dVar2.K(e4, dVar2.k() + e4);
                            i(i7, dVar2, fVar);
                        } else if (cVar5 == cVar7 && cVar6.f3231f == null) {
                            int e5 = d4 - cVar7.e();
                            dVar2.K(e5 - dVar2.k(), e5);
                            i(i7, dVar2, fVar);
                        } else if (z4 && !dVar2.y()) {
                            f(i7, dVar2, fVar);
                        }
                    }
                } else if (i8 == 3 && dVar2.f3268y >= 0 && dVar2.f3267x >= 0 && (dVar2.f3242g0 == 8 || (dVar2.f3262s == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.y() && !dVar2.F && z4 && !dVar2.y()) {
                        g(i7, dVar, fVar, dVar2);
                    }
                }
            }
        }
        boolean z5 = true;
        z5 = true;
        z5 = true;
        if (dVar instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i6.f3227a;
        if (hashSet2 != null && i6.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                s.c cVar8 = (s.c) it2.next();
                s.d dVar3 = cVar8.f3229d;
                int i9 = i4 + 1;
                boolean a5 = a(dVar3);
                s.c cVar9 = dVar3.J;
                s.c cVar10 = dVar3.L;
                if (dVar3.z() && a5) {
                    s.e.V(dVar3, fVar, new b());
                }
                boolean z6 = (cVar8 == cVar9 && (cVar2 = cVar10.f3231f) != null && cVar2.c) || (cVar8 == cVar10 && (cVar = cVar9.f3231f) != null && cVar.c);
                int i10 = dVar3.f3259p0[1];
                if (i10 != 3 || a5) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f3231f == null) {
                            int e6 = cVar9.e() + d5;
                            dVar3.K(e6, dVar3.k() + e6);
                            i(i9, dVar3, fVar);
                        } else if (cVar8 == cVar10 && cVar9.f3231f == null) {
                            int e7 = d5 - cVar10.e();
                            dVar3.K(e7 - dVar3.k(), e7);
                            i(i9, dVar3, fVar);
                        } else if (z6 && !dVar3.y()) {
                            f(i9, dVar3, fVar);
                        }
                    }
                } else if (i10 == 3 && dVar3.f3268y >= 0 && dVar3.f3267x >= 0 && (dVar3.f3242g0 == 8 || (dVar3.f3262s == 0 && dVar3.W == 0.0f))) {
                    if (!dVar3.y() && !dVar3.F && z6 && !dVar3.y()) {
                        g(i9, dVar, fVar, dVar3);
                    }
                }
            }
        }
        s.c i11 = dVar.i(6);
        if (i11.f3227a != null && i11.c) {
            int d6 = i11.d();
            Iterator it3 = i11.f3227a.iterator();
            while (it3.hasNext()) {
                s.c cVar11 = (s.c) it3.next();
                s.d dVar4 = cVar11.f3229d;
                int i12 = i4 + 1;
                boolean a6 = a(dVar4);
                s.c cVar12 = dVar4.M;
                if (dVar4.z() && a6) {
                    s.e.V(dVar4, fVar, new b());
                }
                if (dVar4.f3259p0[z5 ? 1 : 0] != 3 || a6) {
                    if (!dVar4.z()) {
                        if (cVar11 == cVar12) {
                            int e8 = cVar11.e() + d6;
                            if (dVar4.E) {
                                int i13 = e8 - dVar4.a0;
                                int i14 = dVar4.V + i13;
                                dVar4.Z = i13;
                                dVar4.J.l(i13);
                                dVar4.L.l(i14);
                                cVar12.l(e8);
                                z3 = z5 ? 1 : 0;
                                dVar4.f3250l = z3;
                            } else {
                                z3 = z5 ? 1 : 0;
                            }
                            i(i12, dVar4, fVar);
                            z5 = z3;
                        }
                    }
                }
                z3 = z5 ? 1 : 0;
                z5 = z3;
            }
        }
        dVar.f3254n = z5;
    }
}
