package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3760a = new b();

    public static boolean a(v.d dVar) {
        int[] iArr = dVar.f3637p0;
        int i = iArr[0];
        int i4 = iArr[1];
        v.d dVar2 = dVar.T;
        v.e eVar = dVar2 != null ? (v.e) dVar2 : null;
        if (eVar != null) {
            int i5 = eVar.f3637p0[0];
        }
        if (eVar != null) {
            int i6 = eVar.f3637p0[1];
        }
        boolean z4 = i == 1 || dVar.A() || i == 2 || (i == 3 && dVar.f3639r == 0 && dVar.W == 0.0f && dVar.t(0)) || (i == 3 && dVar.f3639r == 1 && dVar.u(0, dVar.q()));
        boolean z5 = i4 == 1 || dVar.B() || i4 == 2 || (i4 == 3 && dVar.f3640s == 0 && dVar.W == 0.0f && dVar.t(1)) || (i4 == 3 && dVar.f3640s == 1 && dVar.u(1, dVar.k()));
        return (dVar.W > 0.0f && (z4 || z5)) || (z4 && z5);
    }

    public static n b(v.d dVar, int i, ArrayList arrayList, n nVar) {
        int i4;
        int i5 = i == 0 ? dVar.f3633n0 : dVar.f3635o0;
        if (i5 != -1 && (nVar == null || i5 != nVar.f3768b)) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i6);
                if (nVar2.f3768b == i5) {
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
                    if (i7 >= iVar.f3690r0) {
                        i4 = -1;
                        break;
                    }
                    v.d dVar2 = iVar.f3689q0[i7];
                    if ((i == 0 && (i4 = dVar2.f3633n0) != -1) || (i == 1 && (i4 = dVar2.f3635o0) != -1)) {
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
                        if (nVar3.f3768b == i4) {
                            nVar = nVar3;
                            break;
                        }
                        i8++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f3767a = new ArrayList();
                nVar.d = null;
                nVar.f3770e = -1;
                int i9 = n.f3766f;
                n.f3766f = i9 + 1;
                nVar.f3768b = i9;
                nVar.f3769c = i;
            }
            arrayList.add(nVar);
        }
        int i10 = nVar.f3768b;
        ArrayList arrayList2 = nVar.f3767a;
        if (arrayList2.contains(dVar)) {
            return nVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof v.h) {
            v.h hVar = (v.h) dVar;
            hVar.f3686t0.c(hVar.f3687u0 == 0 ? 1 : 0, arrayList, nVar);
        }
        if (i == 0) {
            dVar.f3633n0 = i10;
            dVar.I.c(i, arrayList, nVar);
            dVar.K.c(i, arrayList, nVar);
        } else {
            dVar.f3635o0 = i10;
            dVar.J.c(i, arrayList, nVar);
            dVar.M.c(i, arrayList, nVar);
            dVar.L.c(i, arrayList, nVar);
        }
        dVar.P.c(i, arrayList, nVar);
        return nVar;
    }

    public static void c(int i, v.d dVar, y.f fVar, boolean z4) {
        v.c cVar;
        v.c cVar2;
        boolean z5;
        v.c cVar3;
        v.c cVar4;
        if (dVar.f3630m) {
            return;
        }
        if (!(dVar instanceof v.e) && dVar.z() && a(dVar)) {
            v.e.V(dVar, fVar, new b());
        }
        v.c i4 = dVar.i(2);
        v.c i5 = dVar.i(4);
        int d = i4.d();
        int d5 = i5.d();
        HashSet hashSet = i4.f3605a;
        if (hashSet != null && i4.f3607c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                v.c cVar5 = (v.c) it.next();
                v.d dVar2 = cVar5.d;
                int i6 = i + 1;
                boolean a5 = a(dVar2);
                v.c cVar6 = dVar2.I;
                v.c cVar7 = dVar2.K;
                if (dVar2.z() && a5) {
                    z5 = true;
                    v.e.V(dVar2, fVar, new b());
                } else {
                    z5 = true;
                }
                boolean z6 = ((cVar5 == cVar6 && (cVar4 = cVar7.f3609f) != null && cVar4.f3607c) || (cVar5 == cVar7 && (cVar3 = cVar6.f3609f) != null && cVar3.f3607c)) ? z5 : false;
                int i7 = dVar2.f3637p0[0];
                if (i7 != 3 || a5) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f3609f == null) {
                            int e4 = cVar6.e() + d;
                            dVar2.J(e4, dVar2.q() + e4);
                            c(i6, dVar2, fVar, z4);
                        } else if (cVar5 == cVar7 && cVar6.f3609f == null) {
                            int e5 = d - cVar7.e();
                            dVar2.J(e5 - dVar2.q(), e5);
                            c(i6, dVar2, fVar, z4);
                        } else if (z6 && !dVar2.x()) {
                            d(i6, dVar2, fVar, z4);
                        }
                    }
                } else if (i7 == 3 && dVar2.f3643v >= 0 && dVar2.f3642u >= 0 && (dVar2.f3622g0 == 8 || (dVar2.f3639r == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.x() && !dVar2.F && z6 && !dVar2.x()) {
                        e(i6, dVar, fVar, dVar2, z4);
                    }
                }
            }
        }
        if (dVar instanceof v.h) {
            return;
        }
        HashSet hashSet2 = i5.f3605a;
        if (hashSet2 != null && i5.f3607c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                v.c cVar8 = (v.c) it2.next();
                v.d dVar3 = cVar8.d;
                int i8 = i + 1;
                boolean a6 = a(dVar3);
                v.c cVar9 = dVar3.I;
                v.c cVar10 = dVar3.K;
                if (dVar3.z() && a6) {
                    v.e.V(dVar3, fVar, new b());
                }
                boolean z7 = (cVar8 == cVar9 && (cVar2 = cVar10.f3609f) != null && cVar2.f3607c) || (cVar8 == cVar10 && (cVar = cVar9.f3609f) != null && cVar.f3607c);
                int i9 = dVar3.f3637p0[0];
                if (i9 != 3 || a6) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f3609f == null) {
                            int e6 = cVar9.e() + d5;
                            dVar3.J(e6, dVar3.q() + e6);
                            c(i8, dVar3, fVar, z4);
                        } else if (cVar8 == cVar10 && cVar9.f3609f == null) {
                            int e7 = d5 - cVar10.e();
                            dVar3.J(e7 - dVar3.q(), e7);
                            c(i8, dVar3, fVar, z4);
                        } else if (z7 && !dVar3.x()) {
                            d(i8, dVar3, fVar, z4);
                        }
                    }
                } else if (i9 == 3 && dVar3.f3643v >= 0 && dVar3.f3642u >= 0) {
                    if (dVar3.f3622g0 == 8 || (dVar3.f3639r == 0 && dVar3.W == 0.0f)) {
                        if (!dVar3.x() && !dVar3.F && z7 && !dVar3.x()) {
                            e(i8, dVar, fVar, dVar3, z4);
                        }
                    }
                }
            }
        }
        dVar.f3630m = true;
    }

    public static void d(int i, v.d dVar, y.f fVar, boolean z4) {
        float f5 = dVar.d0;
        v.c cVar = dVar.I;
        int d = cVar.f3609f.d();
        v.c cVar2 = dVar.K;
        int d5 = cVar2.f3609f.d();
        int e4 = cVar.e() + d;
        int e5 = d5 - cVar2.e();
        if (d == d5) {
            f5 = 0.5f;
        } else {
            d = e4;
            d5 = e5;
        }
        int q4 = dVar.q();
        int i4 = (d5 - d) - q4;
        if (d > d5) {
            i4 = (d - d5) - q4;
        }
        int i5 = ((int) (i4 > 0 ? (f5 * i4) + 0.5f : f5 * i4)) + d;
        int i6 = i5 + q4;
        if (d > d5) {
            i6 = i5 - q4;
        }
        dVar.J(i5, i6);
        c(i + 1, dVar, fVar, z4);
    }

    public static void e(int i, v.d dVar, y.f fVar, v.d dVar2, boolean z4) {
        float f5 = dVar2.d0;
        v.c cVar = dVar2.I;
        int e4 = cVar.e() + cVar.f3609f.d();
        v.c cVar2 = dVar2.K;
        int d = cVar2.f3609f.d() - cVar2.e();
        if (d >= e4) {
            int q4 = dVar2.q();
            if (dVar2.f3622g0 != 8) {
                int i4 = dVar2.f3639r;
                if (i4 == 2) {
                    q4 = (int) (dVar2.d0 * 0.5f * (dVar instanceof v.e ? dVar.q() : dVar.T.q()));
                } else if (i4 == 0) {
                    q4 = d - e4;
                }
                q4 = Math.max(dVar2.f3642u, q4);
                int i5 = dVar2.f3643v;
                if (i5 > 0) {
                    q4 = Math.min(i5, q4);
                }
            }
            int i6 = e4 + ((int) ((f5 * ((d - e4) - q4)) + 0.5f));
            dVar2.J(i6, q4 + i6);
            c(i + 1, dVar2, fVar, z4);
        }
    }

    public static void f(int i, v.d dVar, y.f fVar) {
        float f5 = dVar.f3618e0;
        v.c cVar = dVar.J;
        int d = cVar.f3609f.d();
        v.c cVar2 = dVar.L;
        int d5 = cVar2.f3609f.d();
        int e4 = cVar.e() + d;
        int e5 = d5 - cVar2.e();
        if (d == d5) {
            f5 = 0.5f;
        } else {
            d = e4;
            d5 = e5;
        }
        int k4 = dVar.k();
        int i4 = (d5 - d) - k4;
        if (d > d5) {
            i4 = (d - d5) - k4;
        }
        int i5 = (int) (i4 > 0 ? (f5 * i4) + 0.5f : f5 * i4);
        int i6 = d + i5;
        int i7 = i6 + k4;
        if (d > d5) {
            i6 = d - i5;
            i7 = i6 - k4;
        }
        dVar.K(i6, i7);
        i(i + 1, dVar, fVar);
    }

    public static void g(int i, v.d dVar, y.f fVar, v.d dVar2) {
        float f5 = dVar2.f3618e0;
        v.c cVar = dVar2.J;
        int e4 = cVar.e() + cVar.f3609f.d();
        v.c cVar2 = dVar2.L;
        int d = cVar2.f3609f.d() - cVar2.e();
        if (d >= e4) {
            int k4 = dVar2.k();
            if (dVar2.f3622g0 != 8) {
                int i4 = dVar2.f3640s;
                if (i4 == 2) {
                    k4 = (int) (f5 * 0.5f * (dVar instanceof v.e ? dVar.k() : dVar.T.k()));
                } else if (i4 == 0) {
                    k4 = d - e4;
                }
                k4 = Math.max(dVar2.f3645x, k4);
                int i5 = dVar2.f3646y;
                if (i5 > 0) {
                    k4 = Math.min(i5, k4);
                }
            }
            int i6 = e4 + ((int) ((f5 * ((d - e4) - k4)) + 0.5f));
            dVar2.K(i6, k4 + i6);
            i(i + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i, int i4, int i5, int i6) {
        return (i5 == 1 || i5 == 2 || (i5 == 4 && i != 2)) || (i6 == 1 || i6 == 2 || (i6 == 4 && i4 != 2));
    }

    public static void i(int i, v.d dVar, y.f fVar) {
        boolean z4;
        v.c cVar;
        v.c cVar2;
        v.c cVar3;
        v.c cVar4;
        if (dVar.f3632n) {
            return;
        }
        if (!(dVar instanceof v.e) && dVar.z() && a(dVar)) {
            v.e.V(dVar, fVar, new b());
        }
        v.c i4 = dVar.i(3);
        v.c i5 = dVar.i(5);
        int d = i4.d();
        int d5 = i5.d();
        HashSet hashSet = i4.f3605a;
        if (hashSet != null && i4.f3607c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                v.c cVar5 = (v.c) it.next();
                v.d dVar2 = cVar5.d;
                int i6 = i + 1;
                boolean a5 = a(dVar2);
                v.c cVar6 = dVar2.J;
                v.c cVar7 = dVar2.L;
                if (dVar2.z() && a5) {
                    v.e.V(dVar2, fVar, new b());
                }
                boolean z5 = (cVar5 == cVar6 && (cVar4 = cVar7.f3609f) != null && cVar4.f3607c) || (cVar5 == cVar7 && (cVar3 = cVar6.f3609f) != null && cVar3.f3607c);
                int i7 = dVar2.f3637p0[1];
                if (i7 != 3 || a5) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f3609f == null) {
                            int e4 = cVar6.e() + d;
                            dVar2.K(e4, dVar2.k() + e4);
                            i(i6, dVar2, fVar);
                        } else if (cVar5 == cVar7 && cVar6.f3609f == null) {
                            int e5 = d - cVar7.e();
                            dVar2.K(e5 - dVar2.k(), e5);
                            i(i6, dVar2, fVar);
                        } else if (z5 && !dVar2.y()) {
                            f(i6, dVar2, fVar);
                        }
                    }
                } else if (i7 == 3 && dVar2.f3646y >= 0 && dVar2.f3645x >= 0 && (dVar2.f3622g0 == 8 || (dVar2.f3640s == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.y() && !dVar2.F && z5 && !dVar2.y()) {
                        g(i6, dVar, fVar, dVar2);
                    }
                }
            }
        }
        boolean z6 = true;
        z6 = true;
        z6 = true;
        if (dVar instanceof v.h) {
            return;
        }
        HashSet hashSet2 = i5.f3605a;
        if (hashSet2 != null && i5.f3607c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                v.c cVar8 = (v.c) it2.next();
                v.d dVar3 = cVar8.d;
                int i8 = i + 1;
                boolean a6 = a(dVar3);
                v.c cVar9 = dVar3.J;
                v.c cVar10 = dVar3.L;
                if (dVar3.z() && a6) {
                    v.e.V(dVar3, fVar, new b());
                }
                boolean z7 = (cVar8 == cVar9 && (cVar2 = cVar10.f3609f) != null && cVar2.f3607c) || (cVar8 == cVar10 && (cVar = cVar9.f3609f) != null && cVar.f3607c);
                int i9 = dVar3.f3637p0[1];
                if (i9 != 3 || a6) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f3609f == null) {
                            int e6 = cVar9.e() + d5;
                            dVar3.K(e6, dVar3.k() + e6);
                            i(i8, dVar3, fVar);
                        } else if (cVar8 == cVar10 && cVar9.f3609f == null) {
                            int e7 = d5 - cVar10.e();
                            dVar3.K(e7 - dVar3.k(), e7);
                            i(i8, dVar3, fVar);
                        } else if (z7 && !dVar3.y()) {
                            f(i8, dVar3, fVar);
                        }
                    }
                } else if (i9 == 3 && dVar3.f3646y >= 0 && dVar3.f3645x >= 0 && (dVar3.f3622g0 == 8 || (dVar3.f3640s == 0 && dVar3.W == 0.0f))) {
                    if (!dVar3.y() && !dVar3.F && z7 && !dVar3.y()) {
                        g(i8, dVar, fVar, dVar3);
                    }
                }
            }
        }
        v.c i10 = dVar.i(6);
        if (i10.f3605a != null && i10.f3607c) {
            int d6 = i10.d();
            Iterator it3 = i10.f3605a.iterator();
            while (it3.hasNext()) {
                v.c cVar11 = (v.c) it3.next();
                v.d dVar4 = cVar11.d;
                int i11 = i + 1;
                boolean a7 = a(dVar4);
                v.c cVar12 = dVar4.M;
                if (dVar4.z() && a7) {
                    v.e.V(dVar4, fVar, new b());
                }
                if (dVar4.f3637p0[z6 ? 1 : 0] != 3 || a7) {
                    if (!dVar4.z()) {
                        if (cVar11 == cVar12) {
                            int e8 = cVar11.e() + d6;
                            if (dVar4.E) {
                                int i12 = e8 - dVar4.f3612a0;
                                int i13 = dVar4.V + i12;
                                dVar4.Z = i12;
                                dVar4.J.l(i12);
                                dVar4.L.l(i13);
                                cVar12.l(e8);
                                z4 = z6 ? 1 : 0;
                                dVar4.f3628l = z4;
                            } else {
                                z4 = z6 ? 1 : 0;
                            }
                            i(i11, dVar4, fVar);
                            z6 = z4;
                        }
                    }
                }
                z4 = z6 ? 1 : 0;
                z6 = z4;
            }
        }
        dVar.f3632n = z6;
    }
}
