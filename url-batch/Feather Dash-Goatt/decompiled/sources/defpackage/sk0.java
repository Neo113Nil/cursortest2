package defpackage;

import com.appsflyer.internal.l;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sk0 {
    public final jd0 a;
    public boolean c;
    public boolean d;
    public mm i;
    public final i8 b = new i8(8);
    public final yw e = new yw(23);
    public final eo0 f = new eo0(new jd0[16]);
    public final long g = 1;
    public final eo0 h = new eo0(new rk0[16]);

    public sk0(jd0 jd0Var) {
        this.a = jd0Var;
    }

    public static boolean b(jd0 jd0Var, mm mmVar) {
        boolean o0;
        jd0 jd0Var2 = jd0Var.m;
        nd0 nd0Var = jd0Var.K;
        if (jd0Var2 == null) {
            return false;
        }
        if (mmVar != null) {
            if (jd0Var2 != null) {
                kj0 kj0Var = nd0Var.q;
                kj0Var.getClass();
                o0 = kj0Var.o0(mmVar.a);
            }
            o0 = false;
        } else {
            kj0 kj0Var2 = nd0Var.q;
            mm mmVar2 = kj0Var2 != null ? kj0Var2.q : null;
            if (mmVar2 != null && jd0Var2 != null) {
                kj0Var2.getClass();
                o0 = kj0Var2.o0(mmVar2.a);
            }
            o0 = false;
        }
        jd0 s = jd0Var.s();
        if (o0 && s != null) {
            if (s.m == null) {
                jd0.T(s, false, 3);
                return o0;
            }
            if (jd0Var.r() == hd0.d) {
                jd0.R(s, false, 3);
                return o0;
            }
            if (jd0Var.r() == hd0.e) {
                s.Q(false);
            }
        }
        return o0;
    }

    public static boolean c(jd0 jd0Var, mm mmVar) {
        boolean z;
        if (mmVar != null) {
            if (jd0Var.G == hd0.g) {
                jd0Var.e();
            }
            z = jd0Var.K.p.o0(mmVar.a);
        } else {
            uk0 uk0Var = jd0Var.K.p;
            mm mmVar2 = uk0Var.n ? new mm(uk0Var.h) : null;
            if (mmVar2 != null) {
                if (jd0Var.G == hd0.g) {
                    jd0Var.e();
                }
                z = jd0Var.K.p.o0(mmVar2.a);
            } else {
                z = false;
            }
        }
        jd0 s = jd0Var.s();
        if (z && s != null) {
            if (jd0Var.q() == hd0.d) {
                jd0.T(s, false, 3);
                return z;
            }
            if (jd0Var.q() == hd0.e) {
                s.S(false);
            }
        }
        return z;
    }

    public static boolean h(jd0 jd0Var) {
        kj0 kj0Var;
        kd0 kd0Var;
        if (jd0Var.K.e) {
            return (jd0Var.r() == hd0.g && ((kj0Var = jd0Var.K.q) == null || (kd0Var = kj0Var.u) == null || !kd0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(jd0 jd0Var) {
        if (!jd0Var.p()) {
            return false;
        }
        do {
            if (jd0Var.q() == hd0.g && !jd0Var.K.p.A.e()) {
                jd0 s = jd0Var.s();
                if ((s != null ? s.K.d : null) != fd0.d) {
                    return false;
                }
            }
            jd0Var = jd0Var.s();
            if (jd0Var == null) {
                return false;
            }
        } while (!jd0Var.G());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r3 < r7) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        Object[] objArr;
        yw ywVar = this.e;
        if (z) {
            eo0 eo0Var = (eo0) ywVar.e;
            jd0 jd0Var = this.a;
            if (jd0Var.T > 0) {
                eo0Var.g();
                eo0Var.b(jd0Var);
                jd0Var.S = true;
            }
        }
        eo0 eo0Var2 = (eo0) ywVar.e;
        int i = eo0Var2.g;
        if (i != 0) {
            Arrays.sort(eo0Var2.d, 0, i, r10.d);
            int i2 = eo0Var2.g;
            jd0[] jd0VarArr = (jd0[]) ywVar.g;
            if (jd0VarArr != null) {
                int length = jd0VarArr.length;
                objArr = jd0VarArr;
            }
            objArr = new jd0[Math.max(16, i2)];
            ywVar.g = null;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = eo0Var2.d[i3];
            }
            eo0Var2.g();
            for (int i4 = i2 - 1; -1 < i4; i4--) {
                jd0 jd0Var2 = objArr[i4];
                jd0Var2.getClass();
                if (jd0Var2.S) {
                    yw.j(jd0Var2);
                }
                objArr[i4] = 0;
            }
            ywVar.g = objArr;
        }
    }

    public final void d() {
        eo0 eo0Var = this.h;
        int i = eo0Var.g;
        if (i != 0) {
            Object[] objArr = eo0Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                rk0 rk0Var = (rk0) objArr[i2];
                if (rk0Var.a.F()) {
                    boolean z = rk0Var.b;
                    jd0 jd0Var = rk0Var.a;
                    boolean z2 = rk0Var.c;
                    if (z) {
                        jd0.R(jd0Var, z2, 2);
                    } else {
                        jd0.T(jd0Var, z2, 2);
                    }
                }
            }
            eo0Var.g();
        }
    }

    public final void e(jd0 jd0Var) {
        eo0 x = jd0Var.x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            jd0 jd0Var2 = (jd0) objArr[i2];
            if (Intrinsics.a(jd0Var2.H(), Boolean.TRUE) && !jd0Var2.U) {
                if (this.b.c(jd0Var2)) {
                    jd0Var2.I();
                }
                e(jd0Var2);
            }
        }
    }

    public final void f(jd0 jd0Var, boolean z) {
        if (!this.c) {
            o80.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? jd0Var.K.e : jd0Var.p()) {
            o80.a("node not yet measured");
        }
        g(jd0Var, z);
    }

    public final void g(jd0 jd0Var, boolean z) {
        kj0 kj0Var;
        kd0 kd0Var;
        eo0 x = jd0Var.x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            jd0 jd0Var2 = (jd0) objArr[i2];
            if ((!z && (jd0Var2.q() == hd0.d || jd0Var2.K.p.A.e())) || (z && (jd0Var2.r() == hd0.d || ((kj0Var = jd0Var2.K.q) != null && (kd0Var = kj0Var.u) != null && kd0Var.e())))) {
                boolean r = ca0.r(jd0Var2);
                nd0 nd0Var = jd0Var2.K;
                if (r && !z) {
                    if (nd0Var.e && this.b.c(jd0Var2)) {
                        m(jd0Var2, true, false);
                    } else {
                        f(jd0Var2, true);
                    }
                }
                if (z ? nd0Var.e : jd0Var2.p()) {
                    m(jd0Var2, z, false);
                }
                if (!(z ? nd0Var.e : jd0Var2.p())) {
                    g(jd0Var2, z);
                }
            }
        }
        if (z ? jd0Var.K.e : jd0Var.p()) {
            m(jd0Var, z, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [zl0] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean j(a4 a4Var) {
        boolean z;
        zl0 zl0Var;
        zl0 zl0Var2;
        boolean z2;
        jd0 jd0Var;
        boolean z3;
        i8 i8Var = this.b;
        jd0 jd0Var2 = this.a;
        if (!jd0Var2.F()) {
            o80.a("performMeasureAndLayout called with unattached root");
        }
        if (!jd0Var2.G()) {
            o80.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            o80.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean l = i8Var.l();
                s40 s40Var = (s40) i8Var.e;
                if (l) {
                    z = false;
                    while (true) {
                        s40 s40Var2 = (s40) i8Var.h;
                        s40 s40Var3 = (s40) i8Var.g;
                        if (!((fc1) s40Var.e).isEmpty()) {
                            jd0Var = (jd0) ((fc1) s40Var.e).first();
                            s40Var.v(jd0Var);
                            z3 = jd0Var.m != null;
                            z2 = false;
                        } else if (!((fc1) s40Var3.e).isEmpty()) {
                            jd0Var = (jd0) ((fc1) s40Var3.e).first();
                            s40Var3.v(jd0Var);
                            z3 = jd0Var.m != null;
                            z2 = true;
                        } else {
                            if (((fc1) s40Var2.e).isEmpty()) {
                                break;
                            }
                            jd0 jd0Var3 = (jd0) ((fc1) s40Var2.e).first();
                            s40Var2.v(jd0Var3);
                            z2 = true;
                            jd0Var = jd0Var3;
                            z3 = false;
                        }
                        boolean m = m(jd0Var, z3, z2);
                        if (!z2) {
                            if (jd0Var.K.f) {
                                i8Var.a(jd0Var, ua0.e);
                            }
                            if (jd0Var.o()) {
                                i8Var.a(jd0Var, ua0.h);
                            }
                        }
                        if (jd0Var == jd0Var2 && m) {
                            z = true;
                        }
                    }
                    if (a4Var != null) {
                        a4Var.invoke();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        eo0 eo0Var = this.f;
        Object[] objArr = eo0Var.d;
        int i = eo0Var.g;
        int i2 = 0;
        while (i2 < i) {
            l7 l7Var = ((jd0) objArr[i2]).J;
            v80 v80Var = (v80) l7Var.d;
            boolean g = rp0.g(4194304);
            if (g) {
                zl0Var = v80Var.U;
            } else {
                zl0Var = v80Var.U.i;
                if (zl0Var == null) {
                    i2++;
                    z4 = false;
                }
            }
            o31 o31Var = qp0.Q;
            zl0 L0 = v80Var.L0(g);
            while (L0 != null && (L0.h & 4194304) != 0) {
                if ((L0.g & 4194304) != 0) {
                    zq zqVar = L0;
                    eo0 eo0Var2 = null;
                    while (zqVar != 0) {
                        if (zqVar instanceof sc0) {
                            ((sc0) zqVar).g((v80) l7Var.d);
                        } else if ((zqVar.g & 4194304) != 0 && (zqVar instanceof zq)) {
                            zl0 zl0Var3 = zqVar.t;
                            ?? r15 = z4;
                            zl0Var2 = zqVar;
                            eo0Var2 = eo0Var2;
                            while (zl0Var3 != null) {
                                if ((zl0Var3.g & 4194304) != 0) {
                                    r15++;
                                    eo0Var2 = eo0Var2;
                                    if (r15 == 1) {
                                        zl0Var2 = zl0Var3;
                                    } else {
                                        if (eo0Var2 == null) {
                                            eo0Var2 = new eo0(new zl0[16]);
                                        }
                                        if (zl0Var2 != null) {
                                            eo0Var2.b(zl0Var2);
                                            zl0Var2 = null;
                                        }
                                        eo0Var2.b(zl0Var3);
                                    }
                                }
                                zl0Var3 = zl0Var3.j;
                                zl0Var2 = zl0Var2;
                                eo0Var2 = eo0Var2;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z4 = false;
                                zqVar = zl0Var2;
                                eo0Var2 = eo0Var2;
                            }
                        }
                        zl0Var2 = op.o(eo0Var2);
                        z4 = false;
                        zqVar = zl0Var2;
                        eo0Var2 = eo0Var2;
                    }
                }
                if (L0 != zl0Var) {
                    L0 = L0.j;
                    z4 = false;
                }
            }
            i2++;
            z4 = false;
        }
        eo0Var.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [zl0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [zl0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void k(jd0 jd0Var, long j) {
        int i;
        zl0 zl0Var;
        if (jd0Var.U) {
            return;
        }
        jd0 jd0Var2 = this.a;
        if (jd0Var == jd0Var2) {
            o80.a("measureAndLayout called on root");
        }
        if (!jd0Var2.F()) {
            o80.a("performMeasureAndLayout called with unattached root");
        }
        if (!jd0Var2.G()) {
            o80.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            o80.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                i8 i8Var = this.b;
                ((s40) i8Var.e).v(jd0Var);
                ((s40) i8Var.g).v(jd0Var);
                ((s40) i8Var.h).v(jd0Var);
                if ((b(jd0Var, new mm(j)) || jd0Var.K.f) && Intrinsics.a(jd0Var.H(), Boolean.TRUE)) {
                    jd0Var.I();
                }
                e(jd0Var);
                c(jd0Var, new mm(j));
                if (jd0Var.o() && jd0Var.G()) {
                    jd0Var.P();
                    yw ywVar = this.e;
                    ywVar.getClass();
                    if (jd0Var.T > 0) {
                        ((eo0) ywVar.e).b(jd0Var);
                        jd0Var.S = true;
                    }
                }
                d();
            } finally {
            }
        }
        eo0 eo0Var = this.f;
        Object[] objArr = eo0Var.d;
        int i2 = eo0Var.g;
        for (0; i < i2; i + 1) {
            l7 l7Var = ((jd0) objArr[i]).J;
            v80 v80Var = (v80) l7Var.d;
            if (rp0.g(4194304)) {
                zl0Var = v80Var.U;
            } else {
                zl0Var = v80Var.U.i;
                i = zl0Var == null ? i + 1 : 0;
            }
            o31 o31Var = qp0.Q;
            for (zl0 L0 = v80Var.L0(r5); L0 != null && (L0.h & 4194304) != 0; L0 = L0.j) {
                if ((L0.g & 4194304) != 0) {
                    zq zqVar = L0;
                    ?? r8 = 0;
                    while (zqVar != 0) {
                        if (zqVar instanceof sc0) {
                            ((sc0) zqVar).g((v80) l7Var.d);
                        } else if ((zqVar.g & 4194304) != 0 && (zqVar instanceof zq)) {
                            zl0 zl0Var2 = zqVar.t;
                            int i3 = 0;
                            zqVar = zqVar;
                            r8 = r8;
                            while (zl0Var2 != null) {
                                if ((zl0Var2.g & 4194304) != 0) {
                                    i3++;
                                    r8 = r8;
                                    if (i3 == 1) {
                                        zqVar = zl0Var2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new eo0(new zl0[16]);
                                        }
                                        if (zqVar != 0) {
                                            r8.b(zqVar);
                                            zqVar = 0;
                                        }
                                        r8.b(zl0Var2);
                                    }
                                }
                                zl0Var2 = zl0Var2.j;
                                zqVar = zqVar;
                                r8 = r8;
                            }
                            if (i3 == 1) {
                            }
                        }
                        zqVar = op.o(r8);
                    }
                }
                if (L0 != zl0Var) {
                }
            }
        }
        eo0Var.g();
    }

    public final void l() {
        i8 i8Var = this.b;
        if (i8Var.l()) {
            jd0 jd0Var = this.a;
            if (!jd0Var.F()) {
                o80.a("performMeasureAndLayout called with unattached root");
            }
            if (!jd0Var.G()) {
                o80.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                o80.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((fc1) ((s40) i8Var.h).e).isEmpty() && !((fc1) ((s40) i8Var.e).e).isEmpty()) {
                        if (jd0Var.m != null) {
                            o(jd0Var, true);
                        } else {
                            n(jd0Var);
                        }
                    }
                    o(jd0Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean m(jd0 jd0Var, boolean z, boolean z2) {
        mm mmVar;
        boolean z3;
        yw0 placementScope;
        v80 v80Var;
        jd0 s;
        kj0 kj0Var;
        kd0 kd0Var;
        boolean z4 = jd0Var.U;
        nd0 nd0Var = jd0Var.K;
        if (z4 || (!jd0Var.G() && !nd0Var.p.w && !i(jd0Var) && !Intrinsics.a(jd0Var.H(), Boolean.TRUE) && !h(jd0Var) && !nd0Var.p.A.e() && ((kj0Var = nd0Var.q) == null || (kd0Var = kj0Var.u) == null || !kd0Var.e()))) {
            return false;
        }
        jd0 jd0Var2 = this.a;
        if (jd0Var == jd0Var2) {
            mmVar = this.i;
            mmVar.getClass();
        } else {
            mmVar = null;
        }
        if (z) {
            z3 = nd0Var.e ? b(jd0Var, mmVar) : false;
            if (z2 && ((z3 || nd0Var.f) && Intrinsics.a(jd0Var.H(), Boolean.TRUE))) {
                jd0Var.I();
            }
        } else {
            boolean c = jd0Var.p() ? c(jd0Var, mmVar) : false;
            if (z2 && jd0Var.o() && (jd0Var == jd0Var2 || ((s = jd0Var.s()) != null && s.G() && nd0Var.p.w))) {
                if (jd0Var == jd0Var2) {
                    if (jd0Var.G == hd0.g) {
                        jd0Var.f();
                    }
                    jd0 s2 = jd0Var.s();
                    if (s2 == null || (v80Var = (v80) s2.J.d) == null || (placementScope = v80Var.p) == null) {
                        placementScope = ((d4) md0.a(jd0Var)).getPlacementScope();
                    }
                    yw0.n(placementScope, nd0Var.p, 0, 0);
                } else {
                    jd0Var.P();
                }
                yw ywVar = this.e;
                ywVar.getClass();
                if (jd0Var.T > 0) {
                    ((eo0) ywVar.e).b(jd0Var);
                    jd0Var.S = true;
                }
            }
            z3 = c;
        }
        d();
        return z3;
    }

    public final void n(jd0 jd0Var) {
        eo0 x = jd0Var.x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            jd0 jd0Var2 = (jd0) objArr[i2];
            if (jd0Var2.q() == hd0.d || jd0Var2.K.p.A.e()) {
                if (ca0.r(jd0Var2)) {
                    o(jd0Var2, true);
                } else {
                    n(jd0Var2);
                }
            }
        }
    }

    public final void o(jd0 jd0Var, boolean z) {
        mm mmVar;
        if (jd0Var.U) {
            return;
        }
        if (jd0Var == this.a) {
            mmVar = this.i;
            mmVar.getClass();
        } else {
            mmVar = null;
        }
        if (z) {
            b(jd0Var, mmVar);
        } else {
            c(jd0Var, mmVar);
        }
    }

    public final boolean p(jd0 jd0Var, boolean z) {
        int ordinal = jd0Var.K.d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                this.h.b(new rk0(jd0Var, false, z));
            } else {
                if (ordinal != 4) {
                    l.a();
                    return false;
                }
                if (!jd0Var.p() || z) {
                    jd0Var.K.p.x = true;
                    if (!jd0Var.U && (jd0Var.G() || i(jd0Var))) {
                        jd0 s = jd0Var.s();
                        if (s == null || !s.p()) {
                            this.b.a(jd0Var, ua0.g);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j) {
        mm mmVar = this.i;
        if (mmVar == null ? false : mm.b(mmVar.a, j)) {
            return;
        }
        if (this.c) {
            o80.a("updateRootConstraints called while measuring");
        }
        this.i = new mm(j);
        jd0 jd0Var = this.a;
        jd0 jd0Var2 = jd0Var.m;
        nd0 nd0Var = jd0Var.K;
        if (jd0Var2 != null) {
            nd0Var.e = true;
        }
        nd0Var.p.x = true;
        this.b.a(jd0Var, jd0Var2 != null ? ua0.d : ua0.g);
    }
}
