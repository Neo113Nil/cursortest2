package defpackage;

import androidx.compose.foundation.layout.a;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class e6 {
    public static final zx1 a = new zx1(24.0f, 24.0f, 24.0f, 24.0f);
    public static final zx1 b;
    public static final zx1 c;

    static {
        a.b(16.0f);
        b = a.b(16.0f);
        c = a.b(24.0f);
    }

    public static final void a(my myVar, vl1 vl1Var, Function2 function2, Function2 function22, fk2 fk2Var, long j, long j2, long j3, long j4, long j5, a00 a00Var, int i) {
        vl1 vl1Var2;
        a00Var.Z(1522575799);
        int i2 = i | 48 | (a00Var.h(null) ? 256 : 128) | (a00Var.h(function2) ? 2048 : 1024) | (a00Var.h(function22) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE) | (a00Var.f(fk2Var) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) | (a00Var.e(j) ? 1048576 : 524288) | (a00Var.c(0.0f) ? 8388608 : 4194304) | (a00Var.e(j2) ? 67108864 : 33554432) | (a00Var.e(j3) ? 536870912 : 268435456);
        int i3 = (a00Var.e(j4) ? (char) 4 : (char) 2) | (a00Var.e(j5) ? ' ' : (char) 16);
        if ((i2 & 306783379) == 306783378 && (i3 & 19) == 18 && a00Var.B()) {
            a00Var.S();
            vl1Var2 = vl1Var;
        } else {
            my H = yj1.H(-2126308228, new u5(function2, function22, j3, j4, j5, j2, myVar), a00Var);
            int i4 = i2 >> 12;
            int i5 = (i4 & 896) | (i4 & 112) | 12582918 | ((i2 >> 9) & 57344);
            sl1 sl1Var = sl1.a;
            kr2.a(sl1Var, fk2Var, j, 0L, H, a00Var, i5, 104);
            vl1Var2 = sl1Var;
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new v5(myVar, vl1Var2, function2, function22, fk2Var, j, j2, j3, j4, j5, i);
        }
    }

    public static final void b(my myVar, a00 a00Var, int i) {
        a00Var.Z(586821353);
        if ((i & 147) == 146 && a00Var.B()) {
            a00Var.S();
        } else {
            Object M = a00Var.M();
            if (M == sz.a) {
                M = new k9(8);
                a00Var.i0(M);
            }
            oj1 oj1Var = (oj1) M;
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, sl1.a);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, oj1Var, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            myVar.invoke(a00Var, 6);
            a00Var.q(true);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new x5(myVar, i, 0);
        }
    }

    public static final void c(Function0 function0, my myVar, vl1 vl1Var, Function2 function2, Function2 function22, Function2 function23, fk2 fk2Var, long j, long j2, long j3, long j4, cb0 cb0Var, a00 a00Var, int i, int i2) {
        int i3;
        my myVar2;
        Function2 function24;
        int i4;
        a00Var.Z(-919826268);
        if ((i & 6) == 0) {
            i3 = (a00Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            myVar2 = myVar;
            i3 |= a00Var.h(myVar2) ? 32 : 16;
        } else {
            myVar2 = myVar;
        }
        if ((i & 384) == 0) {
            i3 |= a00Var.f(vl1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function24 = function2;
            i3 |= a00Var.h(function24) ? 2048 : 1024;
        } else {
            function24 = function2;
        }
        if ((i & 24576) == 0) {
            i3 |= a00Var.h(null) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if ((196608 & i) == 0) {
            i3 |= a00Var.h(function22) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        if ((i & 1572864) == 0) {
            i3 |= a00Var.h(function23) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= a00Var.f(fk2Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= a00Var.e(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= a00Var.e(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (a00Var.e(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= a00Var.e(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= a00Var.c(0.0f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= a00Var.f(cb0Var) ? 2048 : 1024;
        }
        int i5 = i4;
        if ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170 && a00Var.B()) {
            a00Var.S();
        } else {
            d(function0, vl1Var, cb0Var, yj1.H(-1852840226, new z5(function22, function23, fk2Var, j, j2, j3, j4, function24, myVar2), a00Var), a00Var, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new a6(function0, myVar, vl1Var, function2, function22, function23, fk2Var, j, j2, j3, j4, cb0Var, i, i2);
        }
    }

    public static final void d(Function0 function0, vl1 vl1Var, cb0 cb0Var, my myVar, a00 a00Var, int i) {
        int i2;
        a00Var.Z(-1922902937);
        if ((i & 6) == 0) {
            i2 = (a00Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= a00Var.f(vl1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= a00Var.f(cb0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= a00Var.h(myVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && a00Var.B()) {
            a00Var.S();
        } else {
            j8.c(function0, cb0Var, yj1.H(905289008, new c6(vl1Var, myVar), a00Var), a00Var, ((i2 >> 3) & 112) | (i2 & 14) | 384);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new d6(function0, vl1Var, cb0Var, myVar, i, 0);
        }
    }
}
