package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.layout.a;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class kx1 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        long j = u03.l;
        tw2[] tw2VarArr = sw2.b;
        long j2 = 1095216660480L & j;
        if (j2 == 0) {
            j21.a("Cannot perform operation for Unspecified type.");
        }
        a = mi2.n(j2, sw2.c(j) / 2.0f);
    }

    public static final void a(String str, Function1 function1, vl1 vl1Var, boolean z, pw2 pw2Var, Function2 function2, ch2 ch2Var, g81 g81Var, f81 f81Var, boolean z2, int i, int i2, fk2 fk2Var, du2 du2Var, a00 a00Var, int i3, int i4) {
        int i5;
        Function1 function12;
        vl1 vl1Var2;
        Function2 function22;
        pw2 pw2Var2;
        boolean z3;
        int i6;
        ch2 ch2Var2;
        f81 f81Var2;
        a00 a00Var2;
        boolean z4;
        f81 f81Var3;
        int i7;
        ch2 ch2Var3;
        pw2 pw2Var3;
        a00Var.Z(-1922450045);
        if ((i3 & 6) == 0) {
            i5 = (a00Var.f(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            function12 = function1;
            i5 |= a00Var.h(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i3 & 384) == 0) {
            vl1Var2 = vl1Var;
            i5 |= a00Var.f(vl1Var2) ? 256 : 128;
        } else {
            vl1Var2 = vl1Var;
        }
        int i8 = i5 | 27648;
        if ((i3 & 196608) == 0) {
            i8 = 93184 | i5;
        }
        if ((i3 & 1572864) == 0) {
            function22 = function2;
            i8 |= a00Var.h(function22) ? 1048576 : 524288;
        } else {
            function22 = function2;
        }
        int i9 = i8 | 918552576;
        int i10 = i4 | 28086;
        if ((196608 & i4) == 0) {
            i10 |= a00Var.f(g81Var) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        int i11 = i10 | 1572864;
        if ((i4 & 12582912) == 0) {
            i11 |= a00Var.g(z2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i11 |= 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i11 |= a00Var.d(i2) ? 536870912 : 268435456;
        }
        int i12 = 6 | (a00Var.f(fk2Var) ? ' ' : (char) 16) | (a00Var.f(du2Var) ? (char) 256 : (char) 128);
        if ((i9 & 306783379) == 306783378 && (i11 & 306783379) == 306783378 && (i12 & 147) == 146 && a00Var.B()) {
            a00Var.S();
            z4 = z;
            pw2Var3 = pw2Var;
            ch2Var3 = ch2Var;
            f81Var3 = f81Var;
            i7 = i;
            a00Var2 = a00Var;
        } else {
            a00Var.U();
            if ((i3 & 1) == 0 || a00Var.z()) {
                pw2Var2 = (pw2) a00Var.j(yv2.a);
                ch2 ch2Var4 = by1.G;
                z3 = true;
                i6 = z2 ? 1 : Integer.MAX_VALUE;
                ch2Var2 = ch2Var4;
                f81Var2 = f81.a;
            } else {
                a00Var.S();
                z3 = z;
                pw2Var2 = pw2Var;
                ch2Var2 = ch2Var;
                f81Var2 = f81Var;
                i6 = i;
            }
            a00Var.r();
            a00Var.X(30062948);
            Object M = a00Var.M();
            if (M == sz.a) {
                M = new bn1();
                a00Var.i0(M);
            }
            bn1 bn1Var = (bn1) M;
            a00Var.q(false);
            a00Var.X(30069058);
            long b2 = pw2Var2.b();
            if (b2 == 16) {
                b2 = !z3 ? du2Var.c : ((Boolean) yk3.x(bn1Var, a00Var, 0).getValue()).booleanValue() ? du2Var.a : du2Var.b;
            }
            long j = b2;
            a00Var.q(false);
            pw2 d = pw2Var2.d(new pw2(j, 0L, null, null, 0L, 0, 0L, 16777214));
            ca0 ca0Var = (ca0) a00Var.j(p00.h);
            ye a2 = lw2.a.a(du2Var.k);
            int i13 = i6;
            boolean z5 = z3;
            gx1 gx1Var = new gx1(vl1Var2, function22, ca0Var, du2Var, str, function12, z5, d, g81Var, f81Var2, z2, i13, i2, ch2Var2, bn1Var, fk2Var);
            a00Var2 = a00Var;
            yk3.a(a2, yj1.H(-1886965181, gx1Var, a00Var2), a00Var2, 56);
            z4 = z5;
            f81Var3 = f81Var2;
            i7 = i13;
            ch2Var3 = ch2Var2;
            pw2Var3 = pw2Var2;
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new hx1(str, function1, vl1Var, z4, pw2Var3, function2, ch2Var3, g81Var, f81Var3, z2, i7, i2, fk2Var, du2Var, i3, i4);
        }
    }

    public static final void b(Function2 function2, xt0 xt0Var, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z, float f, Function1 function1, my myVar, Function2 function27, yx1 yx1Var, a00 a00Var, int i, int i2) {
        int i3;
        int i4;
        yx1 yx1Var2;
        ao aoVar;
        u81 u81Var;
        ao aoVar2;
        Function2 function28;
        xt0 xt0Var2;
        Function2 function29;
        float f2;
        Function2 function210;
        boolean z2;
        ao aoVar3 = qb2.t;
        ao aoVar4 = qb2.p;
        a00Var.Z(1408290209);
        int i5 = i & 6;
        sl1 sl1Var = sl1.a;
        if (i5 == 0) {
            i3 = i | (a00Var.f(sl1Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= a00Var.h(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= a00Var.h(xt0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= a00Var.h(function22) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= a00Var.h(function23) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if ((196608 & i) == 0) {
            i3 |= a00Var.h(function24) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        if ((1572864 & i) == 0) {
            i3 |= a00Var.h(function25) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= a00Var.h(function26) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= a00Var.g(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= a00Var.c(f) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (a00Var.h(function1) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= a00Var.h(myVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= a00Var.h(function27) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            yx1Var2 = yx1Var;
            i4 |= a00Var.f(yx1Var2) ? 2048 : 1024;
        } else {
            yx1Var2 = yx1Var;
        }
        int i6 = i4;
        if ((i3 & 306783379) == 306783378 && (i6 & 1171) == 1170 && a00Var.B()) {
            a00Var.S();
            function29 = function22;
            function210 = function27;
            xt0Var2 = xt0Var;
            f2 = f;
        } else {
            boolean z3 = ((i6 & 14) == 4) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | ((i6 & 7168) == 2048);
            Object M = a00Var.M();
            if (z3 || M == sz.a) {
                M = new mx1(function1, z, f, yx1Var2);
                a00Var.i0(M);
            }
            mx1 mx1Var = (mx1) M;
            u81 u81Var2 = (u81) a00Var.j(p00.n);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, sl1Var);
            pz.b.getClass();
            Function0 function0 = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(function0);
            } else {
                a00Var.l0();
            }
            sc scVar = oz.f;
            uj2.e(a00Var, mx1Var, scVar);
            sc scVar2 = oz.e;
            uj2.e(a00Var, l, scVar2);
            sc scVar3 = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar3);
            }
            sc scVar4 = oz.d;
            uj2.e(a00Var, E, scVar4);
            myVar.invoke(a00Var, Integer.valueOf((i6 >> 3) & 14));
            a00Var.X(250370369);
            if (function23 != null) {
                vl1 k = a.c(sl1Var, "Leading").k(pu2.i);
                aoVar = aoVar3;
                oj1 e = fp.e(aoVar, false);
                int D2 = iv1.D(a00Var);
                v02 l2 = a00Var.l();
                vl1 E2 = bd3.E(a00Var, k);
                a00Var.b0();
                u81Var = u81Var2;
                if (a00Var.S) {
                    a00Var.k(function0);
                } else {
                    a00Var.l0();
                }
                uj2.e(a00Var, e, scVar);
                uj2.e(a00Var, l2, scVar2);
                if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D2))) {
                    q40.r(D2, a00Var, D2, scVar3);
                }
                uj2.e(a00Var, E2, scVar4);
                function23.invoke(a00Var, Integer.valueOf((i3 >> 12) & 14));
                a00Var.q(true);
            } else {
                aoVar = aoVar3;
                u81Var = u81Var2;
            }
            boolean z4 = false;
            a00Var.q(false);
            a00Var.X(250379492);
            if (function24 != null) {
                vl1 k2 = a.c(sl1Var, "Trailing").k(pu2.i);
                oj1 e2 = fp.e(aoVar, false);
                int D3 = iv1.D(a00Var);
                v02 l3 = a00Var.l();
                vl1 E3 = bd3.E(a00Var, k2);
                a00Var.b0();
                if (a00Var.S) {
                    a00Var.k(function0);
                } else {
                    a00Var.l0();
                }
                uj2.e(a00Var, e2, scVar);
                uj2.e(a00Var, l3, scVar2);
                if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D3))) {
                    q40.r(D3, a00Var, D3, scVar3);
                }
                uj2.e(a00Var, E3, scVar4);
                function24.invoke(a00Var, Integer.valueOf((i3 >> 15) & 14));
                a00Var.q(true);
                z4 = false;
            }
            a00Var.q(z4);
            u81 u81Var3 = u81Var;
            float f3 = androidx.compose.foundation.layout.a.f(yx1Var2, u81Var3);
            float e3 = androidx.compose.foundation.layout.a.e(yx1Var2, u81Var3);
            if (function23 != null) {
                f3 -= pu2.c;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
            }
            if (function24 != null) {
                e3 -= pu2.c;
                if (e3 < 0.0f) {
                    e3 = 0.0f;
                }
            }
            a00Var.X(250410106);
            if (function25 != null) {
                vl1 k3 = androidx.compose.foundation.layout.a.k(b.l(b.e(a.c(sl1Var, "Prefix"), pu2.f, Float.NaN)), f3, 0.0f, pu2.e, 10);
                aoVar2 = aoVar4;
                oj1 e4 = fp.e(aoVar2, false);
                int D4 = iv1.D(a00Var);
                v02 l4 = a00Var.l();
                vl1 E4 = bd3.E(a00Var, k3);
                a00Var.b0();
                if (a00Var.S) {
                    a00Var.k(function0);
                } else {
                    a00Var.l0();
                }
                uj2.e(a00Var, e4, scVar);
                uj2.e(a00Var, l4, scVar2);
                if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D4))) {
                    q40.r(D4, a00Var, D4, scVar3);
                }
                uj2.e(a00Var, E4, scVar4);
                function25.invoke(a00Var, Integer.valueOf((i3 >> 18) & 14));
                a00Var.q(true);
            } else {
                aoVar2 = aoVar4;
            }
            boolean z5 = false;
            a00Var.q(false);
            a00Var.X(250422072);
            if (function26 != null) {
                vl1 k4 = androidx.compose.foundation.layout.a.k(b.l(b.e(a.c(sl1Var, "Suffix"), pu2.f, Float.NaN)), pu2.e, 0.0f, e3, 10);
                oj1 e5 = fp.e(aoVar2, false);
                int D5 = iv1.D(a00Var);
                v02 l5 = a00Var.l();
                vl1 E5 = bd3.E(a00Var, k4);
                a00Var.b0();
                if (a00Var.S) {
                    a00Var.k(function0);
                } else {
                    a00Var.l0();
                }
                uj2.e(a00Var, e5, scVar);
                uj2.e(a00Var, l5, scVar2);
                if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D5))) {
                    q40.r(D5, a00Var, D5, scVar3);
                }
                uj2.e(a00Var, E5, scVar4);
                function28 = function26;
                function28.invoke(a00Var, Integer.valueOf((i3 >> 21) & 14));
                a00Var.q(true);
                z5 = false;
            } else {
                function28 = function26;
            }
            a00Var.q(z5);
            float f4 = pu2.f;
            vl1 l6 = b.l(b.e(sl1Var, f4, Float.NaN));
            if (function25 != null) {
                f3 = 0.0f;
            }
            if (function28 != null) {
                e3 = 0.0f;
            }
            vl1 k5 = androidx.compose.foundation.layout.a.k(l6, f3, 0.0f, e3, 10);
            a00Var.X(250444361);
            if (xt0Var != null) {
                xt0Var2 = xt0Var;
                xt0Var2.a(a.c(sl1Var, "Hint").k(k5), a00Var, Integer.valueOf((i3 >> 3) & 112));
            } else {
                xt0Var2 = xt0Var;
            }
            a00Var.q(false);
            vl1 k6 = a.c(sl1Var, "TextField").k(k5);
            oj1 e6 = fp.e(aoVar2, true);
            int D6 = iv1.D(a00Var);
            v02 l7 = a00Var.l();
            vl1 E6 = bd3.E(a00Var, k6);
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(function0);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e6, scVar);
            uj2.e(a00Var, l7, scVar2);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D6))) {
                q40.r(D6, a00Var, D6, scVar3);
            }
            uj2.e(a00Var, E6, scVar4);
            function2.invoke(a00Var, Integer.valueOf((i3 >> 3) & 14));
            a00Var.q(true);
            a00Var.X(250455481);
            if (function22 != null) {
                f2 = f;
                vl1 c = a.c(b.l(b.e(sl1Var, yk3.K(f4, pu2.g, f2), Float.NaN)), "Label");
                oj1 e7 = fp.e(aoVar2, false);
                int D7 = iv1.D(a00Var);
                v02 l8 = a00Var.l();
                vl1 E7 = bd3.E(a00Var, c);
                a00Var.b0();
                if (a00Var.S) {
                    a00Var.k(function0);
                } else {
                    a00Var.l0();
                }
                uj2.e(a00Var, e7, scVar);
                uj2.e(a00Var, l8, scVar2);
                if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D7))) {
                    q40.r(D7, a00Var, D7, scVar3);
                }
                uj2.e(a00Var, E7, scVar4);
                function29 = function22;
                function29.invoke(a00Var, Integer.valueOf((i3 >> 9) & 14));
                a00Var.q(true);
            } else {
                function29 = function22;
                f2 = f;
            }
            a00Var.q(false);
            a00Var.X(250473414);
            if (function27 != null) {
                vl1 l9 = b.l(b.e(a.c(sl1Var, "Supporting"), pu2.h, Float.NaN));
                float f5 = pu2.b;
                vl1 g = androidx.compose.foundation.layout.a.g(l9, new zx1(f5, pu2.d, f5, 0.0f));
                oj1 e8 = fp.e(aoVar2, false);
                int D8 = iv1.D(a00Var);
                v02 l10 = a00Var.l();
                vl1 E8 = bd3.E(a00Var, g);
                a00Var.b0();
                if (a00Var.S) {
                    a00Var.k(function0);
                } else {
                    a00Var.l0();
                }
                uj2.e(a00Var, e8, scVar);
                uj2.e(a00Var, l10, scVar2);
                if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D8))) {
                    q40.r(D8, a00Var, D8, scVar3);
                }
                uj2.e(a00Var, E8, scVar4);
                function210 = function27;
                function210.invoke(a00Var, Integer.valueOf((i6 >> 6) & 14));
                z2 = true;
                a00Var.q(true);
            } else {
                function210 = function27;
                z2 = true;
            }
            a00Var.q(false);
            a00Var.q(z2);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new ix1(function2, xt0Var2, function29, function23, function24, function25, function26, z, f2, function1, myVar, function210, yx1Var2, i, i2);
        }
    }

    public static final int c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, yx1 yx1Var) {
        int[] iArr = {i7, i3, i4, yk3.L(f, i6, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        float d = yx1Var.d() * f2;
        return Math.max(u10.i(j), Math.max(i, Math.max(i2, si1.b(yk3.K(d, Math.max(d, i6 / 2.0f), f) + i5 + (yx1Var.c() * f2)))) + i8);
    }

    public static final int d(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, float f2, yx1 yx1Var) {
        int i8 = i3 + i4;
        int max = Math.max(i5 + i8, Math.max(i7 + i8, yk3.L(f, i6, 0))) + i + i2;
        u81 u81Var = u81.m;
        return Math.max(max, Math.max(si1.b((i6 + ((yx1Var.b(u81Var) + yx1Var.a(u81Var)) * f2)) * f), u10.j(j)));
    }

    public static final int e(boolean z, int i, int i2, n12 n12Var, n12 n12Var2) {
        if (z) {
            i2 = Math.round(((i - n12Var2.n) / 2.0f) * 1.0f);
        }
        float f = pu2.b;
        return Math.max(i2, (n12Var != null ? n12Var.n : 0) / 2);
    }
}
