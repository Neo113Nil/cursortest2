package defpackage;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.a;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class yi1 {
    public static final yb2 a = zb2.a(16.0f);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final Function0 function0, vl1 vl1Var, x01 x01Var, boolean z, a00 a00Var, final int i, final int i2) {
        vl1 vl1Var2;
        int i3;
        x01 x01Var2;
        int i4;
        int i5;
        final boolean z2;
        final vl1 vl1Var3;
        n72 s;
        int i6;
        vl1 vl1Var4;
        str.getClass();
        function0.getClass();
        a00Var.Z(1307166131);
        int i7 = (a00Var.f(str) ? 4 : 2) | i | (a00Var.h(function0) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 != 0) {
            i7 |= 384;
        } else if ((i & 384) == 0) {
            vl1Var2 = vl1Var;
            i7 |= a00Var.f(vl1Var2) ? 256 : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i4 = i7 | 3072;
                x01Var2 = x01Var;
            } else {
                x01Var2 = x01Var;
                i4 = i7 | (a00Var.f(x01Var2) ? 2048 : 1024);
            }
            i5 = i4 | 24576;
            if (a00Var.P(i5 & 1, (i5 & 9363) == 9362)) {
                a00Var.S();
                z2 = z;
                vl1Var3 = vl1Var2;
            } else {
                if (i8 != 0) {
                    vl1Var4 = sl1.a;
                    i6 = i3;
                } else {
                    i6 = i3;
                    vl1Var4 = vl1Var2;
                }
                if (i6 != 0) {
                    x01Var2 = null;
                }
                int i9 = (i5 & 14) | 3456 | (i5 & 112);
                int i10 = i5 << 6;
                d(str, function0, new xd1(qv.g(new aw(cw.p), new aw(cw.q)), 0L, 9187343241974906880L), aw.c, vl1Var4, x01Var2, a00Var, 1572864 | (i10 & 458752) | i9 | (57344 & i10));
                vl1Var3 = vl1Var4;
                z2 = true;
            }
            final x01 x01Var3 = x01Var2;
            s = a00Var.s();
            if (s == null) {
                s.d = new Function2() { // from class: vi1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        yi1.a(str, function0, vl1Var3, x01Var3, z2, (a00) obj, s03.R(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        vl1Var2 = vl1Var;
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        i5 = i4 | 24576;
        if (a00Var.P(i5 & 1, (i5 & 9363) == 9362)) {
        }
        final x01 x01Var32 = x01Var2;
        s = a00Var.s();
        if (s == null) {
        }
    }

    public static final void b(final String str, final x01 x01Var, final long j, a00 a00Var, final int i) {
        int i2;
        a00 a00Var2 = a00Var;
        a00Var2.Z(367748867);
        if ((i & 6) == 0) {
            i2 = (a00Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= a00Var2.f(x01Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= a00Var2.e(j) ? 256 : 128;
        }
        int i3 = i2;
        if (a00Var2.P(i3 & 1, (i3 & 147) != 146)) {
            fc2 a2 = ec2.a(new yh(8.0f, true, sc.o), qb2.z, a00Var2, 54);
            int D = iv1.D(a00Var2);
            v02 l = a00Var2.l();
            vl1 E = bd3.E(a00Var2, sl1.a);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a2, oz.f);
            uj2.e(a00Var2, l, oz.e);
            sc scVar = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar);
            }
            uj2.e(a00Var2, E, oz.d);
            if (x01Var != null) {
                a00Var2.X(2141557778);
                k01.a(x01Var, null, null, j, a00Var2, ((i3 >> 3) & 14) | 48 | ((i3 << 3) & 7168), 4);
            } else {
                a00Var2.X(1960112675);
            }
            a00Var2.q(false);
            yv2.b(str, null, j, 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, null, a00Var, (i3 & 14) | 196608 | (i3 & 896), 0, 131034);
            a00Var2 = a00Var;
            a00Var2.q(true);
        } else {
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new Function2() { // from class: xi1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yi1.b(str, x01Var, j, (a00) obj, s03.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(String str, Function0 function0, vl1 vl1Var, long j, a00 a00Var, int i) {
        vl1 vl1Var2;
        str.getClass();
        function0.getClass();
        a00Var.Z(-2029245484);
        int i2 = i | (a00Var.f(str) ? 4 : 2) | (a00Var.h(function0) ? 32 : 16) | 3456;
        if (a00Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            sl1 sl1Var = sl1.a;
            yb2 yb2Var = a;
            vl1 i3 = a.i(androidx.compose.foundation.a.e(7, yk3.u(sl1Var, yb2Var).k(new BorderModifierNodeElement(1.5f, new nn2(j), yb2Var)), null, function0, false), 20.0f, 12.0f);
            oj1 e = fp.e(qb2.t, false);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, i3);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            b(str, null, j, a00Var, (i2 & 14) | 432);
            a00Var.q(true);
            vl1Var2 = sl1Var;
        } else {
            a00Var.S();
            vl1Var2 = vl1Var;
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new c51(str, function0, vl1Var2, j, i);
        }
    }

    public static final void d(final String str, final Function0 function0, final xd1 xd1Var, final long j, final vl1 vl1Var, final x01 x01Var, a00 a00Var, final int i) {
        int i2;
        a00Var.Z(1896002929);
        if ((i & 6) == 0) {
            i2 = (a00Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= a00Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= a00Var.f(xd1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= a00Var.e(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= a00Var.f(vl1Var) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= a00Var.f(x01Var) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        if ((1572864 & i) == 0) {
            i2 |= a00Var.g(true) ? 1048576 : 524288;
        }
        if (a00Var.P(i2 & 1, (599187 & i2) != 599186)) {
            vl1 i3 = a.i(androidx.compose.foundation.a.e(6, androidx.compose.foundation.a.a(yk3.u(vl1Var, a), xd1Var), null, function0, true), 20.0f, 13.0f);
            oj1 e = fp.e(qb2.t, false);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, i3);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            b(str, x01Var, j, a00Var, (i2 & 14) | ((i2 >> 12) & 112) | ((i2 >> 3) & 896));
            a00Var.q(true);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new Function2() { // from class: wi1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yi1.d(str, function0, xd1Var, j, vl1Var, x01Var, (a00) obj, s03.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(String str, Function0 function0, vl1 vl1Var, boolean z, a00 a00Var, int i) {
        boolean z2;
        str.getClass();
        function0.getClass();
        a00Var.Z(1295958292);
        int i2 = i | (a00Var.f(str) ? 4 : 2) | (a00Var.h(function0) ? 32 : 16) | 27648;
        if (a00Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            d(str, function0, new xd1(qv.g(new aw(cw.c), new aw(cw.d)), 0L, 9187343241974906880L), cw.x, vl1Var, null, a00Var, (i2 & 112) | (i2 & 14) | 3456 | 1794048);
            z2 = true;
        } else {
            a00Var.S();
            z2 = z;
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new ok(i, vl1Var, str, function0, z2);
        }
    }
}
