package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lj1 {
    public final i91 a;
    public boolean c;
    public boolean d;
    public u10 i;
    public final mh b = new mh(9);
    public final tt1 e = new tt1(1);
    public final eo1 f = new eo1(new i91[16]);
    public final long g = 1;
    public final eo1 h = new eo1(new kj1[16]);

    public lj1(i91 i91Var) {
        this.a = i91Var;
    }

    public static boolean b(i91 i91Var, u10 u10Var) {
        boolean v0;
        i91 i91Var2 = i91Var.s;
        m91 m91Var = i91Var.Q;
        if (i91Var2 == null) {
            return false;
        }
        if (u10Var != null) {
            if (i91Var2 != null) {
                xg1 xg1Var = m91Var.q;
                xg1Var.getClass();
                v0 = xg1Var.v0(u10Var.a);
            }
            v0 = false;
        } else {
            xg1 xg1Var2 = m91Var.q;
            u10 u10Var2 = xg1Var2 != null ? xg1Var2.y : null;
            if (u10Var2 != null && i91Var2 != null) {
                xg1Var2.getClass();
                v0 = xg1Var2.v0(u10Var2.a);
            }
            v0 = false;
        }
        i91 u = i91Var.u();
        if (v0 && u != null) {
            if (u.s == null) {
                i91.W(u, false, 3);
                return v0;
            }
            if (i91Var.s() == g91.m) {
                i91.U(u, false, 3);
                return v0;
            }
            if (i91Var.s() == g91.n) {
                u.T(false);
            }
        }
        return v0;
    }

    public static boolean c(i91 i91Var, u10 u10Var) {
        boolean z;
        if (u10Var != null) {
            if (i91Var.M == g91.o) {
                i91Var.e();
            }
            z = i91Var.Q.p.x0(u10Var.a);
        } else {
            nj1 nj1Var = i91Var.Q.p;
            u10 u10Var2 = nj1Var.v ? new u10(nj1Var.p) : null;
            if (u10Var2 != null) {
                if (i91Var.M == g91.o) {
                    i91Var.e();
                }
                z = i91Var.Q.p.x0(u10Var2.a);
            } else {
                i91Var.getClass();
                z = false;
            }
        }
        i91 u = i91Var.u();
        if (z && u != null) {
            if (i91Var.r() == g91.m) {
                i91.W(u, false, 3);
                return z;
            }
            if (i91Var.r() == g91.n) {
                u.V(false);
            }
        }
        return z;
    }

    public static boolean h(i91 i91Var) {
        xg1 xg1Var;
        j91 j91Var;
        if (i91Var.Q.e) {
            return (i91Var.s() == g91.o && ((xg1Var = i91Var.Q.q) == null || (j91Var = xg1Var.C) == null || !j91Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(i91 i91Var) {
        if (!i91Var.q()) {
            return false;
        }
        do {
            if (i91Var.r() == g91.o && !i91Var.Q.p.I.e()) {
                i91 u = i91Var.u();
                if ((u != null ? u.Q.d : null) != e91.m) {
                    return false;
                }
            }
            i91Var = i91Var.u();
            if (i91Var == null) {
                return false;
            }
        } while (!i91Var.J());
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
        tt1 tt1Var = this.e;
        if (z) {
            eo1 eo1Var = (eo1) tt1Var.n;
            i91 i91Var = this.a;
            if (i91Var.X > 0) {
                eo1Var.g();
                eo1Var.b(i91Var);
                i91Var.W = true;
            }
        }
        eo1 eo1Var2 = (eo1) tt1Var.n;
        int i = eo1Var2.o;
        if (i != 0) {
            Arrays.sort(eo1Var2.m, 0, i, zo0.d);
            int i2 = eo1Var2.o;
            i91[] i91VarArr = (i91[]) tt1Var.o;
            if (i91VarArr != null) {
                int length = i91VarArr.length;
                objArr = i91VarArr;
            }
            objArr = new i91[Math.max(16, i2)];
            tt1Var.o = null;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = eo1Var2.m[i3];
            }
            eo1Var2.g();
            for (int i4 = i2 - 1; -1 < i4; i4--) {
                i91 i91Var2 = objArr[i4];
                i91Var2.getClass();
                if (i91Var2.W) {
                    tt1.l(i91Var2);
                }
                objArr[i4] = 0;
            }
            tt1Var.o = objArr;
        }
    }

    public final void d() {
        eo1 eo1Var = this.h;
        int i = eo1Var.o;
        if (i != 0) {
            Object[] objArr = eo1Var.m;
            for (int i2 = 0; i2 < i; i2++) {
                kj1 kj1Var = (kj1) objArr[i2];
                if (kj1Var.a.I()) {
                    boolean z = kj1Var.b;
                    i91 i91Var = kj1Var.a;
                    boolean z2 = kj1Var.c;
                    if (z) {
                        i91.U(i91Var, z2, 2);
                    } else {
                        i91.W(i91Var, z2, 2);
                    }
                }
            }
            eo1Var.g();
        }
    }

    public final void e(i91 i91Var) {
        eo1 y = i91Var.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var2 = (i91) objArr[i2];
            if (Intrinsics.b(i91Var2.K(), Boolean.TRUE) && !i91Var2.Y) {
                if (this.b.j(i91Var2)) {
                    i91Var2.L();
                }
                e(i91Var2);
            }
        }
    }

    public final void f(i91 i91Var, boolean z) {
        if (!this.c) {
            h21.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? i91Var.Q.e : i91Var.q()) {
            h21.a("node not yet measured");
        }
        g(i91Var, z);
    }

    public final void g(i91 i91Var, boolean z) {
        xg1 xg1Var;
        j91 j91Var;
        eo1 y = i91Var.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var2 = (i91) objArr[i2];
            if ((!z && (i91Var2.r() == g91.m || i91Var2.Q.p.I.e())) || (z && (i91Var2.s() == g91.m || ((xg1Var = i91Var2.Q.q) != null && (j91Var = xg1Var.C) != null && j91Var.e())))) {
                boolean N = j8.N(i91Var2);
                m91 m91Var = i91Var2.Q;
                if (N && !z) {
                    if (m91Var.e && this.b.j(i91Var2)) {
                        m(i91Var2, true, false);
                    } else {
                        f(i91Var2, true);
                    }
                }
                if (z ? m91Var.e : i91Var2.q()) {
                    m(i91Var2, z, false);
                }
                if (!(z ? m91Var.e : i91Var2.q())) {
                    g(i91Var2, z);
                }
            }
        }
        if (z ? i91Var.Q.e : i91Var.q()) {
            m(i91Var, z, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [ul1] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean j(q7 q7Var) {
        boolean z;
        ul1 ul1Var;
        ul1 ul1Var2;
        boolean z2;
        i91 i91Var;
        boolean z3;
        mh mhVar = this.b;
        i91 i91Var2 = this.a;
        if (!i91Var2.I()) {
            h21.a("performMeasureAndLayout called with unattached root");
        }
        if (!i91Var2.J()) {
            h21.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            h21.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean x = mhVar.x();
                ar0 ar0Var = (ar0) mhVar.n;
                if (x) {
                    z = false;
                    while (true) {
                        ar0 ar0Var2 = (ar0) mhVar.p;
                        ar0 ar0Var3 = (ar0) mhVar.o;
                        if (!((on2) ar0Var.n).isEmpty()) {
                            i91Var = (i91) ((on2) ar0Var.n).first();
                            ar0Var.x(i91Var);
                            z3 = i91Var.s != null;
                            z2 = false;
                        } else if (!((on2) ar0Var3.n).isEmpty()) {
                            i91Var = (i91) ((on2) ar0Var3.n).first();
                            ar0Var3.x(i91Var);
                            z3 = i91Var.s != null;
                            z2 = true;
                        } else {
                            if (((on2) ar0Var2.n).isEmpty()) {
                                break;
                            }
                            i91 i91Var3 = (i91) ((on2) ar0Var2.n).first();
                            ar0Var2.x(i91Var3);
                            z2 = true;
                            i91Var = i91Var3;
                            z3 = false;
                        }
                        boolean m = m(i91Var, z3, z2);
                        if (!z2) {
                            if (i91Var.Q.f) {
                                mhVar.h(i91Var, w41.n);
                            }
                            if (i91Var.p()) {
                                mhVar.h(i91Var, w41.p);
                            }
                        }
                        if (i91Var == i91Var2 && m) {
                            z = true;
                        }
                    }
                    if (q7Var != null) {
                        q7Var.invoke();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        eo1 eo1Var = this.f;
        Object[] objArr = eo1Var.m;
        int i = eo1Var.o;
        int i2 = 0;
        while (i2 < i) {
            fs1 fs1Var = ((i91) objArr[i2]).P;
            n21 n21Var = fs1Var.c;
            boolean g = ls1.g(128);
            if (g) {
                ul1Var = n21Var.a0;
            } else {
                ul1Var = n21Var.a0.q;
                if (ul1Var == null) {
                    i2++;
                    z4 = false;
                }
            }
            ia2 ia2Var = ks1.V;
            ul1 S0 = n21Var.S0(g);
            while (S0 != null && (S0.p & 128) != 0) {
                if ((S0.o & 128) != 0) {
                    p90 p90Var = S0;
                    eo1 eo1Var2 = null;
                    while (p90Var != 0) {
                        if (p90Var instanceof r81) {
                            ((r81) p90Var).q(fs1Var.c);
                        } else if ((p90Var.o & 128) != 0 && (p90Var instanceof p90)) {
                            ul1 ul1Var3 = p90Var.B;
                            ?? r15 = z4;
                            ul1Var2 = p90Var;
                            eo1Var2 = eo1Var2;
                            while (ul1Var3 != null) {
                                if ((ul1Var3.o & 128) != 0) {
                                    r15++;
                                    eo1Var2 = eo1Var2;
                                    if (r15 == 1) {
                                        ul1Var2 = ul1Var3;
                                    } else {
                                        if (eo1Var2 == null) {
                                            eo1Var2 = new eo1(new ul1[16]);
                                        }
                                        if (ul1Var2 != null) {
                                            eo1Var2.b(ul1Var2);
                                            ul1Var2 = null;
                                        }
                                        eo1Var2.b(ul1Var3);
                                    }
                                }
                                ul1Var3 = ul1Var3.r;
                                ul1Var2 = ul1Var2;
                                eo1Var2 = eo1Var2;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z4 = false;
                                p90Var = ul1Var2;
                                eo1Var2 = eo1Var2;
                            }
                        }
                        ul1Var2 = s03.c(eo1Var2);
                        z4 = false;
                        p90Var = ul1Var2;
                        eo1Var2 = eo1Var2;
                    }
                }
                if (S0 != ul1Var) {
                    S0 = S0.r;
                    z4 = false;
                }
            }
            i2++;
            z4 = false;
        }
        eo1Var.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:26:0x0072, B:28:0x007b, B:29:0x007e, B:32:0x008c, B:34:0x0094, B:35:0x0099, B:37:0x00a1, B:38:0x00a4, B:40:0x00aa, B:42:0x00b0, B:44:0x00bc, B:45:0x00c5, B:48:0x0063, B:50:0x006f), top: B:20:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:26:0x0072, B:28:0x007b, B:29:0x007e, B:32:0x008c, B:34:0x0094, B:35:0x0099, B:37:0x00a1, B:38:0x00a4, B:40:0x00aa, B:42:0x00b0, B:44:0x00bc, B:45:0x00c5, B:48:0x0063, B:50:0x006f), top: B:20:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:26:0x0072, B:28:0x007b, B:29:0x007e, B:32:0x008c, B:34:0x0094, B:35:0x0099, B:37:0x00a1, B:38:0x00a4, B:40:0x00aa, B:42:0x00b0, B:44:0x00bc, B:45:0x00c5, B:48:0x0063, B:50:0x006f), top: B:20:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:26:0x0072, B:28:0x007b, B:29:0x007e, B:32:0x008c, B:34:0x0094, B:35:0x0099, B:37:0x00a1, B:38:0x00a4, B:40:0x00aa, B:42:0x00b0, B:44:0x00bc, B:45:0x00c5, B:48:0x0063, B:50:0x006f), top: B:20:0x003a }] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [ul1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [ul1] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(i91 i91Var, long j) {
        int i;
        ul1 ul1Var;
        boolean x0;
        boolean z = i91Var.Y;
        m91 m91Var = i91Var.Q;
        if (z) {
            return;
        }
        i91 i91Var2 = this.a;
        if (i91Var == i91Var2) {
            h21.a("measureAndLayout called on root");
        }
        if (!i91Var2.I()) {
            h21.a("performMeasureAndLayout called with unattached root");
        }
        if (!i91Var2.J()) {
            h21.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            h21.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                mh mhVar = this.b;
                ((ar0) mhVar.n).x(i91Var);
                ((ar0) mhVar.o).x(i91Var);
                ((ar0) mhVar.p).x(i91Var);
                if (!b(i91Var, new u10(j))) {
                    if (m91Var.f) {
                    }
                    e(i91Var);
                    if (i91Var.M == g91.o) {
                        i91Var.e();
                    }
                    x0 = m91Var.p.x0(j);
                    i91 u = i91Var.u();
                    if (x0 && u != null) {
                        if (i91Var.r() != g91.m) {
                            i91.W(u, false, 3);
                        } else if (i91Var.r() == g91.n) {
                            u.V(false);
                        }
                    }
                    if (i91Var.p() && i91Var.J()) {
                        i91Var.S();
                        tt1 tt1Var = this.e;
                        tt1Var.getClass();
                        if (i91Var.X > 0) {
                            ((eo1) tt1Var.n).b(i91Var);
                            i91Var.W = true;
                        }
                    }
                    d();
                }
                if (Intrinsics.b(i91Var.K(), Boolean.TRUE)) {
                    i91Var.L();
                }
                e(i91Var);
                if (i91Var.M == g91.o) {
                }
                x0 = m91Var.p.x0(j);
                i91 u2 = i91Var.u();
                if (x0) {
                    if (i91Var.r() != g91.m) {
                    }
                }
                if (i91Var.p()) {
                    i91Var.S();
                    tt1 tt1Var2 = this.e;
                    tt1Var2.getClass();
                    if (i91Var.X > 0) {
                    }
                }
                d();
            } finally {
            }
        }
        eo1 eo1Var = this.f;
        Object[] objArr = eo1Var.m;
        int i2 = eo1Var.o;
        for (0; i < i2; i + 1) {
            fs1 fs1Var = ((i91) objArr[i]).P;
            n21 n21Var = fs1Var.c;
            if (ls1.g(128)) {
                ul1Var = n21Var.a0;
            } else {
                ul1Var = n21Var.a0.q;
                i = ul1Var == null ? i + 1 : 0;
            }
            ia2 ia2Var = ks1.V;
            for (ul1 S0 = n21Var.S0(r5); S0 != null && (S0.p & 128) != 0; S0 = S0.r) {
                if ((S0.o & 128) != 0) {
                    p90 p90Var = S0;
                    ?? r8 = 0;
                    while (p90Var != 0) {
                        if (p90Var instanceof r81) {
                            ((r81) p90Var).q(fs1Var.c);
                        } else if ((p90Var.o & 128) != 0 && (p90Var instanceof p90)) {
                            ul1 ul1Var2 = p90Var.B;
                            int i3 = 0;
                            p90Var = p90Var;
                            r8 = r8;
                            while (ul1Var2 != null) {
                                if ((ul1Var2.o & 128) != 0) {
                                    i3++;
                                    r8 = r8;
                                    if (i3 == 1) {
                                        p90Var = ul1Var2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new eo1(new ul1[16]);
                                        }
                                        if (p90Var != 0) {
                                            r8.b(p90Var);
                                            p90Var = 0;
                                        }
                                        r8.b(ul1Var2);
                                    }
                                }
                                ul1Var2 = ul1Var2.r;
                                p90Var = p90Var;
                                r8 = r8;
                            }
                            if (i3 == 1) {
                            }
                        }
                        p90Var = s03.c(r8);
                    }
                }
                if (S0 != ul1Var) {
                }
            }
        }
        eo1Var.g();
    }

    public final void l() {
        mh mhVar = this.b;
        if (mhVar.x()) {
            i91 i91Var = this.a;
            if (!i91Var.I()) {
                h21.a("performMeasureAndLayout called with unattached root");
            }
            if (!i91Var.J()) {
                h21.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                h21.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((on2) ((ar0) mhVar.p).n).isEmpty() && !((on2) ((ar0) mhVar.n).n).isEmpty()) {
                        if (i91Var.s != null) {
                            o(i91Var, true);
                        } else {
                            n(i91Var);
                        }
                    }
                    o(i91Var, false);
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

    public final boolean m(i91 i91Var, boolean z, boolean z2) {
        u10 u10Var;
        boolean z3;
        m12 placementScope;
        n21 n21Var;
        i91 u;
        xg1 xg1Var;
        j91 j91Var;
        boolean z4 = i91Var.Y;
        m91 m91Var = i91Var.Q;
        if (z4 || (!i91Var.J() && !m91Var.p.E && !i(i91Var) && !Intrinsics.b(i91Var.K(), Boolean.TRUE) && !h(i91Var) && !m91Var.p.I.e() && ((xg1Var = m91Var.q) == null || (j91Var = xg1Var.C) == null || !j91Var.e()))) {
            return false;
        }
        i91 i91Var2 = this.a;
        if (i91Var == i91Var2) {
            u10Var = this.i;
            u10Var.getClass();
        } else {
            u10Var = null;
        }
        if (z) {
            z3 = m91Var.e ? b(i91Var, u10Var) : false;
            if (z2 && ((z3 || m91Var.f) && Intrinsics.b(i91Var.K(), Boolean.TRUE))) {
                i91Var.L();
            }
        } else {
            boolean c = i91Var.q() ? c(i91Var, u10Var) : false;
            if (z2 && i91Var.p() && (i91Var == i91Var2 || ((u = i91Var.u()) != null && u.J() && m91Var.p.E))) {
                if (i91Var == i91Var2) {
                    if (i91Var.M == g91.o) {
                        i91Var.f();
                    }
                    i91 u2 = i91Var.u();
                    if (u2 == null || (n21Var = u2.P.c) == null || (placementScope = n21Var.x) == null) {
                        placementScope = ((t7) l91.a(i91Var)).getPlacementScope();
                    }
                    m12.i(placementScope, m91Var.p, 0, 0);
                } else {
                    i91Var.S();
                }
                tt1 tt1Var = this.e;
                tt1Var.getClass();
                if (i91Var.X > 0) {
                    ((eo1) tt1Var.n).b(i91Var);
                    i91Var.W = true;
                }
                ((t7) l91.a(i91Var)).getRectManager().e(i91Var);
            }
            z3 = c;
        }
        d();
        return z3;
    }

    public final void n(i91 i91Var) {
        eo1 y = i91Var.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var2 = (i91) objArr[i2];
            if (i91Var2.r() == g91.m || i91Var2.Q.p.I.e()) {
                if (j8.N(i91Var2)) {
                    o(i91Var2, true);
                } else {
                    n(i91Var2);
                }
            }
        }
    }

    public final void o(i91 i91Var, boolean z) {
        u10 u10Var;
        if (i91Var.Y) {
            return;
        }
        if (i91Var == this.a) {
            u10Var = this.i;
            u10Var.getClass();
        } else {
            u10Var = null;
        }
        if (z) {
            b(i91Var, u10Var);
        } else {
            c(i91Var, u10Var);
        }
    }

    public final boolean p(i91 i91Var, boolean z) {
        int ordinal = i91Var.Q.d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                this.h.b(new kj1(i91Var, false, z));
            } else {
                if (ordinal != 4) {
                    a.b();
                    return false;
                }
                if (!i91Var.q() || z) {
                    i91Var.Q.p.F = true;
                    if (!i91Var.Y && (i91Var.J() || i(i91Var))) {
                        i91 u = i91Var.u();
                        if (u == null || !u.q()) {
                            this.b.h(i91Var, w41.o);
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
        u10 u10Var = this.i;
        if (u10Var == null ? false : u10.b(u10Var.a, j)) {
            return;
        }
        if (this.c) {
            h21.a("updateRootConstraints called while measuring");
        }
        this.i = new u10(j);
        i91 i91Var = this.a;
        i91 i91Var2 = i91Var.s;
        m91 m91Var = i91Var.Q;
        if (i91Var2 != null) {
            m91Var.e = true;
        }
        m91Var.p.F = true;
        this.b.h(i91Var, i91Var2 != null ? w41.m : w41.o);
    }
}
