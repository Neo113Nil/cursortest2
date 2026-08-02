package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ss {
    public static final sm a = new sm();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, sd sdVar, te teVar, boolean z) {
        sc scVar;
        sc scVar2;
        float f;
        boolean z2;
        boolean z3;
        sc scVar3;
        sc scVar4;
        if (sdVar.o) {
            return;
        }
        boolean z4 = true;
        b++;
        if (!(sdVar instanceof se) && sdVar.L() && c(sdVar)) {
            se.aa(sdVar, teVar, new sm());
        }
        sc M = sdVar.M(2);
        sc M2 = sdVar.M(4);
        int a2 = M.a();
        int a3 = M2.a();
        HashSet hashSet = M.a;
        if (hashSet != null && M.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                sc scVar5 = (sc) it.next();
                sd sdVar2 = scVar5.d;
                boolean c2 = c(sdVar2);
                if (sdVar2.L() && c2) {
                    f = 0.0f;
                    se.aa(sdVar2, teVar, new sm());
                } else {
                    f = 0.0f;
                }
                sc scVar6 = sdVar2.K;
                if ((scVar5 == scVar6 && (scVar4 = sdVar2.M.e) != null && scVar4.c) || (scVar5 == sdVar2.M && (scVar3 = scVar6.e) != null && scVar3.c)) {
                    z3 = z4;
                    z2 = z3;
                } else {
                    z2 = z4;
                    z3 = false;
                }
                if (sdVar2.O() != 3 || c2) {
                    if (!sdVar2.L()) {
                        if (scVar5 == scVar6 && sdVar2.M.e == null) {
                            int b2 = scVar6.b() + a2;
                            sdVar2.x(b2, sdVar2.j() + b2);
                            a(i2, sdVar2, teVar, z);
                        } else {
                            sc scVar7 = sdVar2.M;
                            if (scVar5 == scVar7 && scVar6.e == null) {
                                int b3 = a2 - scVar7.b();
                                sdVar2.x(b3 - sdVar2.j(), b3);
                                a(i2, sdVar2, teVar, z);
                            } else if (z3 && !sdVar2.J()) {
                                e(i2, teVar, sdVar2, z);
                            }
                        }
                    }
                } else if (sdVar2.O() == 3 && sdVar2.x >= 0 && sdVar2.w >= 0 && ((sdVar2.ai == 8 || (sdVar2.t == 0 && sdVar2.Y == f)) && !sdVar2.J() && !sdVar2.H && z3 && !sdVar2.J())) {
                    f(i2, sdVar, teVar, sdVar2, z);
                }
                z4 = z2;
            }
        }
        boolean z5 = z4;
        if (sdVar instanceof sh) {
            return;
        }
        HashSet hashSet2 = M2.a;
        if (hashSet2 != null && M2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                sc scVar8 = (sc) it2.next();
                sd sdVar3 = scVar8.d;
                boolean c3 = c(sdVar3);
                if (sdVar3.L() && c3) {
                    se.aa(sdVar3, teVar, new sm());
                }
                sc scVar9 = sdVar3.K;
                boolean z6 = ((scVar8 == scVar9 && (scVar2 = sdVar3.M.e) != null && scVar2.c) || (scVar8 == sdVar3.M && (scVar = scVar9.e) != null && scVar.c)) ? z5 : false;
                if (sdVar3.O() != 3 || c3) {
                    if (!sdVar3.L()) {
                        if (scVar8 == scVar9 && sdVar3.M.e == null) {
                            int b4 = scVar9.b() + a3;
                            sdVar3.x(b4, sdVar3.j() + b4);
                            a(i3, sdVar3, teVar, z);
                        } else {
                            sc scVar10 = sdVar3.M;
                            if (scVar8 == scVar10 && scVar9.e == null) {
                                int b5 = a3 - scVar10.b();
                                sdVar3.x(b5 - sdVar3.j(), b5);
                                a(i3, sdVar3, teVar, z);
                            } else if (z6 && !sdVar3.J()) {
                                e(i3, teVar, sdVar3, z);
                            }
                        }
                    }
                } else if (sdVar3.O() == 3 && sdVar3.x >= 0 && sdVar3.w >= 0 && (sdVar3.ai == 8 || (sdVar3.t == 0 && sdVar3.Y == 0.0f))) {
                    if (!sdVar3.J() && !sdVar3.H && z6 && !sdVar3.J()) {
                        f(i3, sdVar, teVar, sdVar3, z);
                    }
                }
            }
        }
        sdVar.o = z5;
    }

    public static void b(int i, sd sdVar, te teVar) {
        sc scVar;
        sc scVar2;
        sc scVar3;
        sc scVar4;
        sc scVar5;
        if (sdVar.p) {
            return;
        }
        c++;
        if (!(sdVar instanceof se) && sdVar.L() && c(sdVar)) {
            se.aa(sdVar, teVar, new sm());
        }
        sc M = sdVar.M(3);
        sc M2 = sdVar.M(5);
        int a2 = M.a();
        int a3 = M2.a();
        HashSet hashSet = M.a;
        if (hashSet != null && M.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                sc scVar6 = (sc) it.next();
                sd sdVar2 = scVar6.d;
                boolean c2 = c(sdVar2);
                if (sdVar2.L() && c2) {
                    se.aa(sdVar2, teVar, new sm());
                }
                sc scVar7 = sdVar2.L;
                boolean z = (scVar6 == scVar7 && (scVar5 = sdVar2.N.e) != null && scVar5.c) || (scVar6 == sdVar2.N && (scVar4 = scVar7.e) != null && scVar4.c);
                if (sdVar2.P() != 3 || c2) {
                    if (!sdVar2.L()) {
                        if (scVar6 == scVar7 && sdVar2.N.e == null) {
                            int b2 = scVar7.b() + a2;
                            sdVar2.y(b2, sdVar2.h() + b2);
                            b(i2, sdVar2, teVar);
                        } else {
                            sc scVar8 = sdVar2.N;
                            if (scVar6 == scVar8 && scVar7.e == null) {
                                int b3 = a2 - scVar8.b();
                                sdVar2.y(b3 - sdVar2.h(), b3);
                                b(i2, sdVar2, teVar);
                            } else if (z && !sdVar2.K()) {
                                g(i2, teVar, sdVar2);
                            }
                        }
                    }
                } else if (sdVar2.P() == 3 && sdVar2.A >= 0 && sdVar2.z >= 0 && (sdVar2.ai == 8 || (sdVar2.u == 0 && sdVar2.Y == 0.0f))) {
                    if (!sdVar2.K() && !sdVar2.H && z && !sdVar2.K()) {
                        h(i2, sdVar, teVar, sdVar2);
                    }
                }
            }
        }
        if (sdVar instanceof sh) {
            return;
        }
        HashSet hashSet2 = M2.a;
        if (hashSet2 != null && M2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                sc scVar9 = (sc) it2.next();
                sd sdVar3 = scVar9.d;
                boolean c3 = c(sdVar3);
                if (sdVar3.L() && c3) {
                    se.aa(sdVar3, teVar, new sm());
                }
                sc scVar10 = sdVar3.L;
                boolean z2 = (scVar9 == scVar10 && (scVar3 = sdVar3.N.e) != null && scVar3.c) || (scVar9 == sdVar3.N && (scVar2 = scVar10.e) != null && scVar2.c);
                if (sdVar3.P() != 3 || c3) {
                    if (sdVar3.L()) {
                        continue;
                    } else if (scVar9 == scVar10 && sdVar3.N.e == null) {
                        int b4 = scVar10.b() + a3;
                        sdVar3.y(b4, sdVar3.h() + b4);
                        b(i3, sdVar3, teVar);
                    } else {
                        sc scVar11 = sdVar3.N;
                        if (scVar9 == scVar11 && scVar10.e == null) {
                            int b5 = a3 - scVar11.b();
                            sdVar3.y(b5 - sdVar3.h(), b5);
                            b(i3, sdVar3, teVar);
                        } else if (z2 && !sdVar3.K()) {
                            g(i3, teVar, sdVar3);
                        }
                    }
                } else if (sdVar3.P() == 3 && sdVar3.A >= 0 && sdVar3.z >= 0 && (sdVar3.ai == 8 || (sdVar3.u == 0 && sdVar3.Y == 0.0f))) {
                    if (!sdVar3.K() && !sdVar3.H && z2 && !sdVar3.K()) {
                        h(i3, sdVar, teVar, sdVar3);
                    }
                }
            }
        }
        sc M3 = sdVar.M(6);
        if (M3.a != null && M3.c) {
            int a4 = M3.a();
            Iterator it3 = M3.a.iterator();
            while (it3.hasNext()) {
                int i4 = i + 1;
                sc scVar12 = (sc) it3.next();
                sd sdVar4 = scVar12.d;
                boolean c4 = c(sdVar4);
                if (sdVar4.L() && c4) {
                    se.aa(sdVar4, teVar, new sm());
                }
                if (sdVar4.P() != 3 || c4) {
                    if (!sdVar4.L() && scVar12 == (scVar = sdVar4.O)) {
                        int b6 = scVar12.b() + a4;
                        if (sdVar4.G) {
                            int i5 = b6 - sdVar4.ac;
                            int i6 = sdVar4.X + i5;
                            sdVar4.ab = i5;
                            sdVar4.L.f(i5);
                            sdVar4.N.f(i6);
                            scVar.f(b6);
                            sdVar4.n = true;
                        }
                        b(i4, sdVar4, teVar);
                    }
                }
            }
        }
        sdVar.p = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r8.H(0) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r8.H(1) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0079, code lost:
    
        if (r8.I(1, r8.h()) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0069, code lost:
    
        if (r1 != 3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0049, code lost:
    
        if (r8.I(0, r8.j()) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0039, code lost:
    
        if (r0 != 3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(sd sdVar) {
        boolean z;
        boolean z2;
        int O = sdVar.O();
        int P = sdVar.P();
        sd sdVar2 = sdVar.V;
        if (sdVar2 == null) {
            sdVar2 = null;
        }
        if (sdVar2 != null) {
            sdVar2.O();
        }
        if (sdVar2 != null) {
            sdVar2.P();
        }
        if (O != 1 && !sdVar.e() && O != 2) {
            if (O == 3) {
                if (sdVar.t == 0) {
                    if (sdVar.Y == 0.0f) {
                    }
                }
            }
            if (sdVar.t == 1) {
            }
            z = false;
            if (P != 1 && !sdVar.f() && P != 2) {
                if (P != 3) {
                    if (sdVar.u == 0) {
                        if (sdVar.Y == 0.0f) {
                        }
                    }
                }
                if (sdVar.u == 1) {
                }
                z2 = false;
                if (sdVar.Y > 0.0f) {
                    if (z || z2) {
                        return true;
                    }
                    z = false;
                    z2 = false;
                }
                return !z && z2;
            }
            z2 = true;
            if (sdVar.Y > 0.0f) {
            }
            if (z) {
            }
        }
        z = true;
        if (P != 1) {
            if (P != 3) {
            }
            if (sdVar.u == 1) {
            }
            z2 = false;
            if (sdVar.Y > 0.0f) {
            }
            if (z) {
            }
        }
        z2 = true;
        if (sdVar.Y > 0.0f) {
        }
        if (z) {
        }
    }

    public static void d(sa saVar, te teVar, int i, boolean z) {
        if (saVar.c()) {
            if (i == 0) {
                a(1, saVar, teVar, z);
            } else {
                b(1, saVar, teVar);
            }
        }
    }

    private static void e(int i, te teVar, sd sdVar, boolean z) {
        float f = sdVar.af;
        sc scVar = sdVar.K;
        int a2 = scVar.e.a();
        sc scVar2 = sdVar.M;
        int a3 = scVar2.e.a();
        int b2 = scVar.b() + a2;
        int b3 = a3 - scVar2.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f = 0.5f;
        }
        int j = sdVar.j();
        int i2 = (b3 - b2) - j;
        if (b2 > b3) {
            i2 = (b2 - b3) - j;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + b2;
        int i4 = i3 + j;
        if (b2 > b3) {
            i4 = i3 - j;
        }
        sdVar.x(i3, i4);
        a(i + 1, sdVar, teVar, z);
    }

    private static void f(int i, sd sdVar, te teVar, sd sdVar2, boolean z) {
        float f = sdVar2.af;
        sc scVar = sdVar2.K;
        int a2 = scVar.e.a() + scVar.b();
        sc scVar2 = sdVar2.M;
        int a3 = scVar2.e.a() - scVar2.b();
        if (a3 >= a2) {
            int j = sdVar2.j();
            int i2 = a3 - a2;
            if (sdVar2.ai != 8) {
                int i3 = sdVar2.t;
                if (i3 == 2) {
                    j = (int) (sdVar2.af * 0.5f * (sdVar instanceof se ? sdVar.j() : sdVar.V.j()));
                } else if (i3 == 0) {
                    j = i2;
                }
                j = Math.max(sdVar2.w, j);
                int i4 = sdVar2.x;
                if (i4 > 0) {
                    j = Math.min(i4, j);
                }
            }
            int i5 = a2 + ((int) ((f * (i2 - j)) + 0.5f));
            sdVar2.x(i5, j + i5);
            a(i + 1, sdVar2, teVar, z);
        }
    }

    private static void g(int i, te teVar, sd sdVar) {
        float f = sdVar.ag;
        sc scVar = sdVar.L;
        int a2 = scVar.e.a();
        sc scVar2 = sdVar.N;
        int a3 = scVar2.e.a();
        int b2 = scVar.b() + a2;
        int b3 = a3 - scVar2.b();
        if (a2 == a3) {
            b3 = a3;
        }
        if (a2 == a3) {
            b2 = a2;
        }
        if (a2 == a3) {
            f = 0.5f;
        }
        int h = sdVar.h();
        int i2 = (b3 - b2) - h;
        if (b2 > b3) {
            i2 = (b2 - b3) - h;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = b2 + i3;
        int i5 = i4 + h;
        if (b2 > b3) {
            i4 = b2 - i3;
            i5 = i4 - h;
        }
        sdVar.y(i4, i5);
        b(i + 1, sdVar, teVar);
    }

    private static void h(int i, sd sdVar, te teVar, sd sdVar2) {
        float f = sdVar2.ag;
        sc scVar = sdVar2.L;
        int a2 = scVar.e.a() + scVar.b();
        sc scVar2 = sdVar2.N;
        int a3 = scVar2.e.a() - scVar2.b();
        if (a3 >= a2) {
            int h = sdVar2.h();
            int i2 = a3 - a2;
            if (sdVar2.ai != 8) {
                int i3 = sdVar2.u;
                if (i3 == 2) {
                    h = (int) (f * 0.5f * (sdVar instanceof se ? sdVar.h() : sdVar.V.h()));
                } else if (i3 == 0) {
                    h = i2;
                }
                h = Math.max(sdVar2.z, h);
                int i4 = sdVar2.A;
                if (i4 > 0) {
                    h = Math.min(i4, h);
                }
            }
            int i5 = a2 + ((int) ((f * (i2 - h)) + 0.5f));
            sdVar2.y(i5, h + i5);
            b(i + 1, sdVar2, teVar);
        }
    }
}
