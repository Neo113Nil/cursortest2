package z2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f9149a = new b();

    public static boolean a(y2.d dVar) {
        int[] iArr = dVar.f8777p0;
        int i = iArr[0];
        int i8 = iArr[1];
        y2.d dVar2 = dVar.T;
        y2.e eVar = dVar2 != null ? (y2.e) dVar2 : null;
        if (eVar != null) {
            int i9 = eVar.f8777p0[0];
        }
        if (eVar != null) {
            int i10 = eVar.f8777p0[1];
        }
        boolean z3 = i == 1 || dVar.A() || i == 2 || (i == 3 && dVar.f8779r == 0 && dVar.W == 0.0f && dVar.t(0)) || (i == 3 && dVar.f8779r == 1 && dVar.u(0, dVar.q()));
        boolean z7 = i8 == 1 || dVar.B() || i8 == 2 || (i8 == 3 && dVar.f8780s == 0 && dVar.W == 0.0f && dVar.t(1)) || (i8 == 3 && dVar.f8780s == 1 && dVar.u(1, dVar.k()));
        return (dVar.W > 0.0f && (z3 || z7)) || (z3 && z7);
    }

    public static n b(y2.d dVar, int i, ArrayList arrayList, n nVar) {
        int i8;
        int i9 = i == 0 ? dVar.f8773n0 : dVar.f8775o0;
        if (i9 != -1 && (nVar == null || i9 != nVar.f9157b)) {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i10);
                if (nVar2.f9157b == i9) {
                    if (nVar != null) {
                        nVar.c(i, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i10++;
                }
            }
        } else if (i9 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof y2.i) {
                y2.i iVar = (y2.i) dVar;
                int i11 = 0;
                while (true) {
                    if (i11 >= iVar.f8832r0) {
                        i8 = -1;
                        break;
                    }
                    y2.d dVar2 = iVar.f8831q0[i11];
                    if ((i == 0 && (i8 = dVar2.f8773n0) != -1) || (i == 1 && (i8 = dVar2.f8775o0) != -1)) {
                        break;
                    }
                    i11++;
                }
                if (i8 != -1) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = (n) arrayList.get(i12);
                        if (nVar3.f9157b == i8) {
                            nVar = nVar3;
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f9156a = new ArrayList();
                nVar.f9159d = null;
                nVar.f9160e = -1;
                int i13 = n.f9155f;
                n.f9155f = i13 + 1;
                nVar.f9157b = i13;
                nVar.f9158c = i;
            }
            arrayList.add(nVar);
        }
        int i14 = nVar.f9157b;
        ArrayList arrayList2 = nVar.f9156a;
        if (arrayList2.contains(dVar)) {
            return nVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof y2.h) {
            y2.h hVar = (y2.h) dVar;
            hVar.f8828t0.c(hVar.f8829u0 == 0 ? 1 : 0, arrayList, nVar);
        }
        if (i == 0) {
            dVar.f8773n0 = i14;
            dVar.I.c(i, arrayList, nVar);
            dVar.K.c(i, arrayList, nVar);
        } else {
            dVar.f8775o0 = i14;
            dVar.J.c(i, arrayList, nVar);
            dVar.M.c(i, arrayList, nVar);
            dVar.L.c(i, arrayList, nVar);
        }
        dVar.P.c(i, arrayList, nVar);
        return nVar;
    }

    public static void c(int i, b3.f fVar, y2.d dVar, boolean z3) {
        y2.c cVar;
        y2.c cVar2;
        boolean z7;
        y2.c cVar3;
        y2.c cVar4;
        if (dVar.f8770m) {
            return;
        }
        if (!(dVar instanceof y2.e) && dVar.z() && a(dVar)) {
            y2.e.V(dVar, fVar, new b());
        }
        y2.c i8 = dVar.i(2);
        y2.c i9 = dVar.i(4);
        int d8 = i8.d();
        int d9 = i9.d();
        HashSet hashSet = i8.f8739a;
        if (hashSet != null && i8.f8741c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                y2.c cVar5 = (y2.c) it.next();
                y2.d dVar2 = cVar5.f8742d;
                int i10 = i + 1;
                boolean a8 = a(dVar2);
                y2.c cVar6 = dVar2.I;
                y2.c cVar7 = dVar2.K;
                if (dVar2.z() && a8) {
                    z7 = true;
                    y2.e.V(dVar2, fVar, new b());
                } else {
                    z7 = true;
                }
                boolean z8 = ((cVar5 == cVar6 && (cVar4 = cVar7.f8744f) != null && cVar4.f8741c) || (cVar5 == cVar7 && (cVar3 = cVar6.f8744f) != null && cVar3.f8741c)) ? z7 : false;
                int i11 = dVar2.f8777p0[0];
                if (i11 != 3 || a8) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f8744f == null) {
                            int e8 = cVar6.e() + d8;
                            dVar2.J(e8, dVar2.q() + e8);
                            c(i10, fVar, dVar2, z3);
                        } else if (cVar5 == cVar7 && cVar6.f8744f == null) {
                            int e9 = d8 - cVar7.e();
                            dVar2.J(e9 - dVar2.q(), e9);
                            c(i10, fVar, dVar2, z3);
                        } else if (z8 && !dVar2.x()) {
                            d(i10, fVar, dVar2, z3);
                        }
                    }
                } else if (i11 == 3 && dVar2.f8783v >= 0 && dVar2.f8782u >= 0 && (dVar2.f8760g0 == 8 || (dVar2.f8779r == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.x() && !dVar2.F && z8 && !dVar2.x()) {
                        e(i10, dVar, fVar, dVar2, z3);
                    }
                }
            }
        }
        if (dVar instanceof y2.h) {
            return;
        }
        HashSet hashSet2 = i9.f8739a;
        if (hashSet2 != null && i9.f8741c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                y2.c cVar8 = (y2.c) it2.next();
                y2.d dVar3 = cVar8.f8742d;
                int i12 = i + 1;
                boolean a9 = a(dVar3);
                y2.c cVar9 = dVar3.I;
                y2.c cVar10 = dVar3.K;
                if (dVar3.z() && a9) {
                    y2.e.V(dVar3, fVar, new b());
                }
                boolean z9 = (cVar8 == cVar9 && (cVar2 = cVar10.f8744f) != null && cVar2.f8741c) || (cVar8 == cVar10 && (cVar = cVar9.f8744f) != null && cVar.f8741c);
                int i13 = dVar3.f8777p0[0];
                if (i13 != 3 || a9) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f8744f == null) {
                            int e10 = cVar9.e() + d9;
                            dVar3.J(e10, dVar3.q() + e10);
                            c(i12, fVar, dVar3, z3);
                        } else if (cVar8 == cVar10 && cVar9.f8744f == null) {
                            int e11 = d9 - cVar10.e();
                            dVar3.J(e11 - dVar3.q(), e11);
                            c(i12, fVar, dVar3, z3);
                        } else if (z9 && !dVar3.x()) {
                            d(i12, fVar, dVar3, z3);
                        }
                    }
                } else if (i13 == 3 && dVar3.f8783v >= 0 && dVar3.f8782u >= 0) {
                    if (dVar3.f8760g0 == 8 || (dVar3.f8779r == 0 && dVar3.W == 0.0f)) {
                        if (!dVar3.x() && !dVar3.F && z9 && !dVar3.x()) {
                            e(i12, dVar, fVar, dVar3, z3);
                        }
                    }
                }
            }
        }
        dVar.f8770m = true;
    }

    public static void d(int i, b3.f fVar, y2.d dVar, boolean z3) {
        float f6 = dVar.f8754d0;
        y2.c cVar = dVar.I;
        int d8 = cVar.f8744f.d();
        y2.c cVar2 = dVar.K;
        int d9 = cVar2.f8744f.d();
        int e8 = cVar.e() + d8;
        int e9 = d9 - cVar2.e();
        if (d8 == d9) {
            f6 = 0.5f;
        } else {
            d8 = e8;
            d9 = e9;
        }
        int q4 = dVar.q();
        int i8 = (d9 - d8) - q4;
        if (d8 > d9) {
            i8 = (d8 - d9) - q4;
        }
        int i9 = ((int) (i8 > 0 ? (f6 * i8) + 0.5f : f6 * i8)) + d8;
        int i10 = i9 + q4;
        if (d8 > d9) {
            i10 = i9 - q4;
        }
        dVar.J(i9, i10);
        c(i + 1, fVar, dVar, z3);
    }

    public static void e(int i, y2.d dVar, b3.f fVar, y2.d dVar2, boolean z3) {
        float f6 = dVar2.f8754d0;
        y2.c cVar = dVar2.I;
        int e8 = cVar.e() + cVar.f8744f.d();
        y2.c cVar2 = dVar2.K;
        int d8 = cVar2.f8744f.d() - cVar2.e();
        if (d8 >= e8) {
            int q4 = dVar2.q();
            if (dVar2.f8760g0 != 8) {
                int i8 = dVar2.f8779r;
                if (i8 == 2) {
                    q4 = (int) (dVar2.f8754d0 * 0.5f * (dVar instanceof y2.e ? dVar.q() : dVar.T.q()));
                } else if (i8 == 0) {
                    q4 = d8 - e8;
                }
                q4 = Math.max(dVar2.f8782u, q4);
                int i9 = dVar2.f8783v;
                if (i9 > 0) {
                    q4 = Math.min(i9, q4);
                }
            }
            int i10 = e8 + ((int) ((f6 * ((d8 - e8) - q4)) + 0.5f));
            dVar2.J(i10, q4 + i10);
            c(i + 1, fVar, dVar2, z3);
        }
    }

    public static void f(int i, b3.f fVar, y2.d dVar) {
        float f6 = dVar.f8756e0;
        y2.c cVar = dVar.J;
        int d8 = cVar.f8744f.d();
        y2.c cVar2 = dVar.L;
        int d9 = cVar2.f8744f.d();
        int e8 = cVar.e() + d8;
        int e9 = d9 - cVar2.e();
        if (d8 == d9) {
            f6 = 0.5f;
        } else {
            d8 = e8;
            d9 = e9;
        }
        int k3 = dVar.k();
        int i8 = (d9 - d8) - k3;
        if (d8 > d9) {
            i8 = (d8 - d9) - k3;
        }
        int i9 = (int) (i8 > 0 ? (f6 * i8) + 0.5f : f6 * i8);
        int i10 = d8 + i9;
        int i11 = i10 + k3;
        if (d8 > d9) {
            i10 = d8 - i9;
            i11 = i10 - k3;
        }
        dVar.K(i10, i11);
        i(i + 1, fVar, dVar);
    }

    public static void g(int i, y2.d dVar, b3.f fVar, y2.d dVar2) {
        float f6 = dVar2.f8756e0;
        y2.c cVar = dVar2.J;
        int e8 = cVar.e() + cVar.f8744f.d();
        y2.c cVar2 = dVar2.L;
        int d8 = cVar2.f8744f.d() - cVar2.e();
        if (d8 >= e8) {
            int k3 = dVar2.k();
            if (dVar2.f8760g0 != 8) {
                int i8 = dVar2.f8780s;
                if (i8 == 2) {
                    k3 = (int) (f6 * 0.5f * (dVar instanceof y2.e ? dVar.k() : dVar.T.k()));
                } else if (i8 == 0) {
                    k3 = d8 - e8;
                }
                k3 = Math.max(dVar2.f8785x, k3);
                int i9 = dVar2.f8786y;
                if (i9 > 0) {
                    k3 = Math.min(i9, k3);
                }
            }
            int i10 = e8 + ((int) ((f6 * ((d8 - e8) - k3)) + 0.5f));
            dVar2.K(i10, k3 + i10);
            i(i + 1, fVar, dVar2);
        }
    }

    public static boolean h(int i, int i8, int i9, int i10) {
        return (i9 == 1 || i9 == 2 || (i9 == 4 && i != 2)) || (i10 == 1 || i10 == 2 || (i10 == 4 && i8 != 2));
    }

    public static void i(int i, b3.f fVar, y2.d dVar) {
        boolean z3;
        y2.c cVar;
        y2.c cVar2;
        y2.c cVar3;
        y2.c cVar4;
        if (dVar.f8772n) {
            return;
        }
        if (!(dVar instanceof y2.e) && dVar.z() && a(dVar)) {
            y2.e.V(dVar, fVar, new b());
        }
        y2.c i8 = dVar.i(3);
        y2.c i9 = dVar.i(5);
        int d8 = i8.d();
        int d9 = i9.d();
        HashSet hashSet = i8.f8739a;
        if (hashSet != null && i8.f8741c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                y2.c cVar5 = (y2.c) it.next();
                y2.d dVar2 = cVar5.f8742d;
                int i10 = i + 1;
                boolean a8 = a(dVar2);
                y2.c cVar6 = dVar2.J;
                y2.c cVar7 = dVar2.L;
                if (dVar2.z() && a8) {
                    y2.e.V(dVar2, fVar, new b());
                }
                boolean z7 = (cVar5 == cVar6 && (cVar4 = cVar7.f8744f) != null && cVar4.f8741c) || (cVar5 == cVar7 && (cVar3 = cVar6.f8744f) != null && cVar3.f8741c);
                int i11 = dVar2.f8777p0[1];
                if (i11 != 3 || a8) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f8744f == null) {
                            int e8 = cVar6.e() + d8;
                            dVar2.K(e8, dVar2.k() + e8);
                            i(i10, fVar, dVar2);
                        } else if (cVar5 == cVar7 && cVar6.f8744f == null) {
                            int e9 = d8 - cVar7.e();
                            dVar2.K(e9 - dVar2.k(), e9);
                            i(i10, fVar, dVar2);
                        } else if (z7 && !dVar2.y()) {
                            f(i10, fVar, dVar2);
                        }
                    }
                } else if (i11 == 3 && dVar2.f8786y >= 0 && dVar2.f8785x >= 0 && (dVar2.f8760g0 == 8 || (dVar2.f8780s == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.y() && !dVar2.F && z7 && !dVar2.y()) {
                        g(i10, dVar, fVar, dVar2);
                    }
                }
            }
        }
        boolean z8 = true;
        z8 = true;
        z8 = true;
        if (dVar instanceof y2.h) {
            return;
        }
        HashSet hashSet2 = i9.f8739a;
        if (hashSet2 != null && i9.f8741c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                y2.c cVar8 = (y2.c) it2.next();
                y2.d dVar3 = cVar8.f8742d;
                int i12 = i + 1;
                boolean a9 = a(dVar3);
                y2.c cVar9 = dVar3.J;
                y2.c cVar10 = dVar3.L;
                if (dVar3.z() && a9) {
                    y2.e.V(dVar3, fVar, new b());
                }
                boolean z9 = (cVar8 == cVar9 && (cVar2 = cVar10.f8744f) != null && cVar2.f8741c) || (cVar8 == cVar10 && (cVar = cVar9.f8744f) != null && cVar.f8741c);
                int i13 = dVar3.f8777p0[1];
                if (i13 != 3 || a9) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f8744f == null) {
                            int e10 = cVar9.e() + d9;
                            dVar3.K(e10, dVar3.k() + e10);
                            i(i12, fVar, dVar3);
                        } else if (cVar8 == cVar10 && cVar9.f8744f == null) {
                            int e11 = d9 - cVar10.e();
                            dVar3.K(e11 - dVar3.k(), e11);
                            i(i12, fVar, dVar3);
                        } else if (z9 && !dVar3.y()) {
                            f(i12, fVar, dVar3);
                        }
                    }
                } else if (i13 == 3 && dVar3.f8786y >= 0 && dVar3.f8785x >= 0 && (dVar3.f8760g0 == 8 || (dVar3.f8780s == 0 && dVar3.W == 0.0f))) {
                    if (!dVar3.y() && !dVar3.F && z9 && !dVar3.y()) {
                        g(i12, dVar, fVar, dVar3);
                    }
                }
            }
        }
        y2.c i14 = dVar.i(6);
        if (i14.f8739a != null && i14.f8741c) {
            int d10 = i14.d();
            Iterator it3 = i14.f8739a.iterator();
            while (it3.hasNext()) {
                y2.c cVar11 = (y2.c) it3.next();
                y2.d dVar4 = cVar11.f8742d;
                int i15 = i + 1;
                boolean a10 = a(dVar4);
                y2.c cVar12 = dVar4.M;
                if (dVar4.z() && a10) {
                    y2.e.V(dVar4, fVar, new b());
                }
                if (dVar4.f8777p0[z8 ? 1 : 0] != 3 || a10) {
                    if (!dVar4.z()) {
                        if (cVar11 == cVar12) {
                            int e12 = cVar11.e() + d10;
                            if (dVar4.E) {
                                int i16 = e12 - dVar4.f8748a0;
                                int i17 = dVar4.V + i16;
                                dVar4.Z = i16;
                                dVar4.J.l(i16);
                                dVar4.L.l(i17);
                                cVar12.l(e12);
                                z3 = z8 ? 1 : 0;
                                dVar4.f8768l = z3;
                            } else {
                                z3 = z8 ? 1 : 0;
                            }
                            i(i15, fVar, dVar4);
                            z8 = z3;
                        }
                    }
                }
                z3 = z8 ? 1 : 0;
                z8 = z3;
            }
        }
        dVar.f8772n = z8;
    }
}
