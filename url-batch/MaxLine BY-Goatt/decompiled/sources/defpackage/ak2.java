package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.google.firebase.encoders.json.BuildConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ak2 {
    public static long a;
    public static Method b;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, Function1 function1, vl1 vl1Var, boolean z, pw2 pw2Var, Function2 function2, Function2 function22, ch2 ch2Var, g81 g81Var, f81 f81Var, boolean z2, int i, int i2, fk2 fk2Var, du2 du2Var, a00 a00Var, int i3, int i4, int i5) {
        String str2;
        int i6;
        Function1 function12;
        g81 g81Var2;
        pw2 pw2Var2;
        boolean z3;
        ch2 ch2Var2;
        g81 g81Var3;
        int i7;
        int i8;
        f81 f81Var2;
        Object M;
        long b2;
        a00 a00Var2;
        f81 f81Var3;
        ch2 ch2Var3;
        int i9;
        boolean z4;
        g81 g81Var4;
        int i10;
        pw2 pw2Var3;
        n72 s;
        a00Var.Z(-676242365);
        if ((i3 & 6) == 0) {
            str2 = str;
            i6 = (a00Var.f(str2) ? 4 : 2) | i3;
        } else {
            str2 = str;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            function12 = function1;
            i6 |= a00Var.h(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i3 & 384) == 0) {
            i6 |= a00Var.f(vl1Var) ? 256 : 128;
        }
        int i11 = i6 | 27648;
        if ((i3 & 196608) == 0) {
            i11 = 93184 | i6;
        }
        int i12 = 1572864 | i11;
        if ((12582912 & i3) == 0) {
            i12 |= a00Var.h(function2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i12 |= a00Var.h(function22) ? 67108864 : 33554432;
        }
        int i13 = i12 | 805306368;
        int i14 = i4 | 28086;
        int i15 = i5 & 32768;
        if (i15 != 0) {
            i14 = 12807606;
        } else if ((196608 & i4) == 0) {
            g81Var2 = g81Var;
            i14 |= a00Var.f(g81Var2) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
            int i16 = i14 | 840433664;
            int i17 = 6 | (!a00Var.f(fk2Var) ? ' ' : (char) 16) | (a00Var.f(du2Var) ? (char) 256 : (char) 128);
            if ((i13 & 306783379) != 306783378 && (i16 & 306783379) == 306783378 && (i17 & 147) == 146 && a00Var.B()) {
                a00Var.S();
                z4 = z;
                pw2Var3 = pw2Var;
                ch2Var3 = ch2Var;
                f81Var3 = f81Var;
                i10 = i2;
                a00Var2 = a00Var;
                g81Var4 = g81Var2;
                i9 = i;
            } else {
                a00Var.U();
                if ((i3 & 1) != 0 || a00Var.z()) {
                    pw2Var2 = (pw2) a00Var.j(yv2.a);
                    ch2 ch2Var4 = by1.G;
                    g81 g81Var5 = i15 == 0 ? g81.b : g81Var2;
                    z3 = true;
                    ch2Var2 = ch2Var4;
                    g81Var3 = g81Var5;
                    i7 = !z2 ? 1 : Integer.MAX_VALUE;
                    i8 = 1;
                    f81Var2 = f81.a;
                } else {
                    a00Var.S();
                    z3 = z;
                    pw2Var2 = pw2Var;
                    f81Var2 = f81Var;
                    i7 = i;
                    i8 = i2;
                    g81Var3 = g81Var2;
                    ch2Var2 = ch2Var;
                }
                a00Var.r();
                a00Var.X(-508515290);
                M = a00Var.M();
                if (M == sz.a) {
                    M = new bn1();
                    a00Var.i0(M);
                }
                bn1 bn1Var = (bn1) M;
                a00Var.q(false);
                a00Var.X(-508509180);
                b2 = pw2Var2.b();
                if (b2 == 16) {
                    b2 = !z3 ? du2Var.c : ((Boolean) yk3.x(bn1Var, a00Var, 0).getValue()).booleanValue() ? du2Var.a : du2Var.b;
                }
                long j = b2;
                a00Var.q(false);
                pw2 d = pw2Var2.d(new pw2(j, 0L, null, null, 0L, 0, 0L, 16777214));
                pw2 pw2Var4 = pw2Var2;
                Function1 function13 = function12;
                boolean z5 = z3;
                int i18 = i7;
                a00Var2 = a00Var;
                yk3.a(lw2.a.a(du2Var.k), yj1.H(1859145987, new gx1(vl1Var, du2Var, str2, function13, z5, d, g81Var3, f81Var2, z2, i18, i8, ch2Var2, bn1Var, function2, function22, fk2Var), a00Var2), a00Var2, 56);
                f81Var3 = f81Var2;
                ch2Var3 = ch2Var2;
                i9 = i18;
                z4 = z5;
                g81Var4 = g81Var3;
                i10 = i8;
                pw2Var3 = pw2Var4;
            }
            s = a00Var2.s();
            if (s == null) {
                s.d = new tu2(str, function1, vl1Var, z4, pw2Var3, function2, function22, ch2Var3, g81Var4, f81Var3, z2, i9, i10, fk2Var, du2Var, i3, i4, i5);
                return;
            }
            return;
        }
        g81Var2 = g81Var;
        int i162 = i14 | 840433664;
        int i172 = 6 | (!a00Var.f(fk2Var) ? ' ' : (char) 16) | (a00Var.f(du2Var) ? (char) 256 : (char) 128);
        if ((i13 & 306783379) != 306783378) {
        }
        a00Var.U();
        if ((i3 & 1) != 0) {
        }
        pw2Var2 = (pw2) a00Var.j(yv2.a);
        ch2 ch2Var42 = by1.G;
        if (i15 == 0) {
        }
        z3 = true;
        ch2Var2 = ch2Var42;
        g81Var3 = g81Var5;
        i7 = !z2 ? 1 : Integer.MAX_VALUE;
        i8 = 1;
        f81Var2 = f81.a;
        a00Var.r();
        a00Var.X(-508515290);
        M = a00Var.M();
        if (M == sz.a) {
        }
        bn1 bn1Var2 = (bn1) M;
        a00Var.q(false);
        a00Var.X(-508509180);
        b2 = pw2Var2.b();
        if (b2 == 16) {
        }
        long j2 = b2;
        a00Var.q(false);
        pw2 d2 = pw2Var2.d(new pw2(j2, 0L, null, null, 0L, 0, 0L, 16777214));
        pw2 pw2Var42 = pw2Var2;
        Function1 function132 = function12;
        boolean z52 = z3;
        int i182 = i7;
        a00Var2 = a00Var;
        yk3.a(lw2.a.a(du2Var.k), yj1.H(1859145987, new gx1(vl1Var, du2Var, str2, function132, z52, d2, g81Var3, f81Var2, z2, i182, i8, ch2Var2, bn1Var2, function2, function22, fk2Var), a00Var2), a00Var2, 56);
        f81Var3 = f81Var2;
        ch2Var3 = ch2Var2;
        i9 = i182;
        z4 = z52;
        g81Var4 = g81Var3;
        i10 = i8;
        pw2Var3 = pw2Var42;
        s = a00Var2.s();
        if (s == null) {
        }
    }

    public static final void b(Function2 function2, Function2 function22, xt0 xt0Var, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z, float f, my myVar, Function2 function27, yx1 yx1Var, a00 a00Var, int i, int i2) {
        int i3;
        int i4;
        ao aoVar;
        u81 u81Var;
        ao aoVar2;
        float f2;
        float f3;
        xt0 xt0Var2;
        Function2 function28;
        boolean z2;
        Function2 function29 = function27;
        ao aoVar3 = qb2.t;
        ao aoVar4 = qb2.p;
        a00Var.Z(-1830307184);
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
            i3 |= a00Var.h(function22) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= a00Var.h(xt0Var) ? 2048 : 1024;
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
            i4 = i2 | (a00Var.h(myVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= a00Var.h(function29) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= a00Var.f(yx1Var) ? 256 : 128;
        }
        int i6 = i4;
        if ((i3 & 306783379) == 306783378 && (i6 & 147) == 146 && a00Var.B()) {
            a00Var.S();
            function28 = function2;
            f2 = f;
            xt0Var2 = xt0Var;
        } else {
            boolean z3 = ((i6 & 896) == 256) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912);
            Object M = a00Var.M();
            if (z3 || M == sz.a) {
                M = new wu2(z, f, yx1Var);
                a00Var.i0(M);
            }
            wu2 wu2Var = (wu2) M;
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
            uj2.e(a00Var, wu2Var, scVar);
            sc scVar2 = oz.e;
            uj2.e(a00Var, l, scVar2);
            sc scVar3 = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar3);
            }
            sc scVar4 = oz.d;
            uj2.e(a00Var, E, scVar4);
            myVar.invoke(a00Var, Integer.valueOf(i6 & 14));
            a00Var.X(1341517187);
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
            a00Var.X(1341526310);
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
            float f4 = androidx.compose.foundation.layout.a.f(yx1Var, u81Var3);
            float e3 = androidx.compose.foundation.layout.a.e(yx1Var, u81Var3);
            if (function23 != null) {
                f4 -= pu2.c;
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                }
            }
            if (function24 != null) {
                e3 -= pu2.c;
                if (e3 < 0.0f) {
                    e3 = 0.0f;
                }
            }
            a00Var.X(1341556924);
            if (function25 != null) {
                vl1 k3 = androidx.compose.foundation.layout.a.k(b.l(b.e(a.c(sl1Var, "Prefix"), pu2.f, Float.NaN)), f4, 0.0f, pu2.e, 10);
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
            a00Var.X(1341568890);
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
                function26.invoke(a00Var, Integer.valueOf((i3 >> 21) & 14));
                a00Var.q(true);
                z5 = false;
            }
            a00Var.q(z5);
            a00Var.X(1341581092);
            if (function22 != null) {
                f2 = f;
                vl1 k5 = androidx.compose.foundation.layout.a.k(b.l(b.e(a.c(sl1Var, "Label"), yk3.K(pu2.f, pu2.g, f2), Float.NaN)), f4, 0.0f, e3, 10);
                oj1 e6 = fp.e(aoVar2, false);
                int D6 = iv1.D(a00Var);
                f3 = e3;
                v02 l6 = a00Var.l();
                vl1 E6 = bd3.E(a00Var, k5);
                a00Var.b0();
                if (a00Var.S) {
                    a00Var.k(function0);
                } else {
                    a00Var.l0();
                }
                uj2.e(a00Var, e6, scVar);
                uj2.e(a00Var, l6, scVar2);
                if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D6))) {
                    q40.r(D6, a00Var, D6, scVar3);
                }
                uj2.e(a00Var, E6, scVar4);
                function22.invoke(a00Var, Integer.valueOf((i3 >> 6) & 14));
                a00Var.q(true);
            } else {
                f2 = f;
                f3 = e3;
            }
            a00Var.q(false);
            vl1 l7 = b.l(b.e(sl1Var, pu2.f, Float.NaN));
            if (function25 != null) {
                f4 = 0.0f;
            }
            vl1 k6 = androidx.compose.foundation.layout.a.k(l7, f4, 0.0f, function26 == null ? f3 : 0.0f, 10);
            a00Var.X(1341611627);
            if (xt0Var != null) {
                xt0Var2 = xt0Var;
                xt0Var2.a(a.c(sl1Var, "Hint").k(k6), a00Var, Integer.valueOf((i3 >> 6) & 112));
            } else {
                xt0Var2 = xt0Var;
            }
            a00Var.q(false);
            vl1 k7 = a.c(sl1Var, "TextField").k(k6);
            oj1 e7 = fp.e(aoVar2, true);
            int D7 = iv1.D(a00Var);
            v02 l8 = a00Var.l();
            vl1 E7 = bd3.E(a00Var, k7);
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
            function28 = function2;
            function28.invoke(a00Var, Integer.valueOf((i3 >> 3) & 14));
            a00Var.q(true);
            a00Var.X(1341622624);
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
                function29 = function27;
                function29.invoke(a00Var, Integer.valueOf((i6 >> 3) & 14));
                z2 = true;
                a00Var.q(true);
            } else {
                function29 = function27;
                z2 = true;
            }
            a00Var.q(false);
            a00Var.q(z2);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new uu2(function28, function22, xt0Var2, function23, function24, function25, function26, z, f2, myVar, function29, yx1Var, i, i2);
        }
    }

    public static final int c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, yx1 yx1Var) {
        boolean z = i2 > 0;
        float c = (yx1Var.c() + yx1Var.d()) * f2;
        if (z) {
            c = yk3.K(pu2.b * 2.0f * f2, c, f);
        }
        int[] iArr = {i7, i5, i6, yk3.L(f, i2, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        return Math.max(u10.i(j), Math.max(i3, Math.max(i4, si1.b(c + yk3.L(f, 0, i2) + i))) + i8);
    }

    public static void d(String str) {
        str.getClass();
        tf1 a2 = (str.equals("ru") || str.equals("en")) ? tf1.a(str) : tf1.b;
        a2.getClass();
        cf cfVar = df.m;
        if (Build.VERSION.SDK_INT >= 33) {
            Object b2 = df.b();
            if (b2 != null) {
                bf.b(b2, af.a(a2.a.a.toLanguageTags()));
                return;
            }
            return;
        }
        if (a2.equals(df.o)) {
            return;
        }
        synchronized (df.t) {
            df.o = a2;
            df.a();
        }
    }

    public static void e(String str) {
        str.getClass();
        int i = str.equals("light") ? 1 : str.equals("dark") ? 2 : -1;
        cf cfVar = df.m;
        if (i != -1 && i != 0 && i != 1 && i != 2) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (df.n != i) {
            df.n = i;
            synchronized (df.t) {
                try {
                    ii iiVar = df.s;
                    iiVar.getClass();
                    di diVar = new di(iiVar);
                    while (diVar.hasNext()) {
                        df dfVar = (df) ((WeakReference) diVar.next()).get();
                        if (dfVar != null) {
                            ((qf) dfVar).q(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void f(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final String i(int i, a00 a00Var) {
        a00Var.j(AndroidCompositionLocals_androidKt.a);
        return ((Context) a00Var.j(AndroidCompositionLocals_androidKt.b)).getResources().getString(i);
    }

    public static boolean j() {
        if (Build.VERSION.SDK_INT >= 29) {
            return qy2.a();
        }
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final int k(boolean z, int i, int i2, n12 n12Var) {
        return z ? Math.round(((i - n12Var.n) / 2.0f) * 1.0f) : i2;
    }

    public static void l(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            c2.l(window, z);
        } else {
            if (i >= 30) {
                c2.k(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void m(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        ch2.d(i, list.size(), str, " operation requires ");
    }

    public static void n(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        ch2.d(i, list.size(), str, " operation requires at least ");
    }

    public static void o(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        ch2.d(i, arrayList.size(), str, " operation requires at most ");
    }

    public static boolean p(kc3 kc3Var) {
        if (kc3Var == null) {
            return false;
        }
        Double f = kc3Var.f();
        return !f.isNaN() && f.doubleValue() >= 0.0d && f.equals(Double.valueOf(Math.floor(f.doubleValue())));
    }

    public static ld3 q(String str) {
        ld3 ld3Var;
        if (str == null || str.isEmpty()) {
            ld3Var = null;
        } else {
            ld3Var = (ld3) ld3.x0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (ld3Var != null) {
            return ld3Var;
        }
        lh.e(q40.l("Unsupported commandId ", str));
        return null;
    }

    public static boolean r(kc3 kc3Var, kc3 kc3Var2) {
        if (!kc3Var.getClass().equals(kc3Var2.getClass())) {
            return false;
        }
        if ((kc3Var instanceof qc3) || (kc3Var instanceof hc3)) {
            return true;
        }
        if (!(kc3Var instanceof xb3)) {
            return kc3Var instanceof pc3 ? kc3Var.zzc().equals(kc3Var2.zzc()) : kc3Var instanceof sb3 ? kc3Var.a().equals(kc3Var2.a()) : kc3Var == kc3Var2;
        }
        if (Double.isNaN(kc3Var.f().doubleValue()) || Double.isNaN(kc3Var2.f().doubleValue())) {
            return false;
        }
        return kc3Var.f().equals(kc3Var2.f());
    }

    public static int s(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static double t(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return (d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d));
    }

    public static Object u(kc3 kc3Var) {
        if (kc3.f.equals(kc3Var)) {
            return null;
        }
        if (kc3.e.equals(kc3Var)) {
            return BuildConfig.FLAVOR;
        }
        if (kc3Var instanceof fc3) {
            return v((fc3) kc3Var);
        }
        if (!(kc3Var instanceof qb3)) {
            return !kc3Var.f().isNaN() ? kc3Var.f() : kc3Var.zzc();
        }
        ArrayList arrayList = new ArrayList();
        qb3 qb3Var = (qb3) kc3Var;
        int i = 0;
        while (i < qb3Var.n()) {
            if (i >= qb3Var.n()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                sb.append("Out of bounds index: ");
                sb.append(i);
                throw new NoSuchElementException(sb.toString());
            }
            int i2 = i + 1;
            Object u = u(qb3Var.o(i));
            if (u != null) {
                arrayList.add(u);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap v(fc3 fc3Var) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(fc3Var.m.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Object u = u(fc3Var.c(str));
            if (u != null) {
                hashMap.put(str, u);
            }
        }
        return hashMap;
    }

    public static void w(js0 js0Var) {
        int s = s(js0Var.P("runtime.counter").f().doubleValue() + 1.0d);
        if (s <= 1000000) {
            js0Var.N("runtime.counter", new xb3(Double.valueOf(s)));
        } else {
            lh.g("Instructions allowed exceeded");
        }
    }

    public abstract String g(byte[] bArr, int i, int i2);

    public abstract int h(String str, byte[] bArr, int i, int i2);
}
