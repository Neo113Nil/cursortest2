package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.ui.draw.a;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.google.android.gms.common.api.Status;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class by1 implements zm2, g, p30, io3, lq2, ih0, yk1, gp0, j90, fp2, xh, zh {
    public static y62 z;
    public final /* synthetic */ int m;
    public static final by1 n = new by1(0);
    public static final /* synthetic */ by1 o = new by1(1);
    public static final by1 p = new by1(3);
    public static final by1 q = new by1(4);
    public static final by1 r = new by1(5);
    public static final by1 s = new by1(6);
    public static final by1 t = new by1(7);
    public static final b71 u = new b71();
    public static final ch2 v = new ch2(0);
    public static final ch2 w = new ch2(1);
    public static final ch2 x = new ch2(2);
    public static final by1 y = new by1(9);
    public static final by1 A = new by1(10);
    public static final by1 B = new by1(11);
    public static final by1 C = new by1(12);
    public static final ch2 D = new ch2(6);
    public static final ch2 E = new ch2(7);
    public static final by1 F = new by1(14);
    public static final ch2 G = new ch2(16);
    public static final n83 H = new n83();
    public static final /* synthetic */ by1 I = new by1(17);
    public static final /* synthetic */ by1 J = new by1(18);
    public static final by1 K = new by1(19);
    public static final /* synthetic */ by1 L = new by1(20);

    public /* synthetic */ by1(int i) {
        this.m = i;
    }

    public static du2 n(long j, long j2, long j3, long j4, long j5, long j6, long j7, a00 a00Var) {
        du2 du2Var;
        long j8 = aw.g;
        gw gwVar = (gw) a00Var.j(hw.a);
        du2 du2Var2 = gwVar.O;
        a00Var.X(27085453);
        if (du2Var2 == null) {
            du2 du2Var3 = new du2(hw.c(gwVar, 18), hw.c(gwVar, 18), aw.b(hw.c(gwVar, 18), 0.38f), hw.c(gwVar, 18), hw.c(gwVar, 39), hw.c(gwVar, 39), hw.c(gwVar, 39), hw.c(gwVar, 39), hw.c(gwVar, 26), hw.c(gwVar, 2), (kw2) a00Var.j(lw2.a), hw.c(gwVar, 26), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 18), 0.38f), hw.c(gwVar, 2), hw.c(gwVar, 19), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 18), 0.38f), hw.c(gwVar, 19), hw.c(gwVar, 19), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 18), 0.38f), hw.c(gwVar, 2), hw.c(gwVar, 26), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 18), 0.38f), hw.c(gwVar, 2), hw.c(gwVar, 19), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 18), 0.38f), hw.c(gwVar, 19), hw.c(gwVar, 19), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 18), 0.38f), hw.c(gwVar, 2), hw.c(gwVar, 19), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 19), 0.38f), hw.c(gwVar, 19), hw.c(gwVar, 19), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 19), 0.38f), hw.c(gwVar, 19));
            gwVar.O = du2Var3;
            du2Var = du2Var3;
        } else {
            du2Var = du2Var2;
        }
        a00Var.q(false);
        return du2Var.a(j, j2, j8, j8, j3, j4, j8, j8, j5, j8, j6, j7, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8, j8);
    }

    public static on1 q(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            h42 o2 = h42.o(fileInputStream);
            on1 on1Var = new on1(false);
            c42[] c42VarArr = (c42[]) Arrays.copyOf(new c42[0], 0);
            on1Var.b();
            if (c42VarArr.length > 0) {
                c42 c42Var = c42VarArr[0];
                throw null;
            }
            Map m = o2.m();
            m.getClass();
            for (Map.Entry entry : m.entrySet()) {
                String str = (String) entry.getKey();
                l42 l42Var = (l42) entry.getValue();
                str.getClass();
                l42Var.getClass();
                int C2 = l42Var.C();
                switch (C2 == 0 ? -1 : e42.a[q40.u(C2)]) {
                    case -1:
                        throw new f50("Value case is null.", null);
                    case 0:
                    default:
                        a.b();
                        return null;
                    case 1:
                        on1Var.d(new b42(str), Boolean.valueOf(l42Var.t()));
                        break;
                    case 2:
                        on1Var.d(new b42(str), Float.valueOf(l42Var.x()));
                        break;
                    case 3:
                        on1Var.d(new b42(str), Double.valueOf(l42Var.w()));
                        break;
                    case 4:
                        on1Var.d(new b42(str), Integer.valueOf(l42Var.y()));
                        break;
                    case 5:
                        on1Var.d(new b42(str), Long.valueOf(l42Var.z()));
                        break;
                    case 6:
                        b42 b42Var = new b42(str);
                        String A2 = l42Var.A();
                        A2.getClass();
                        on1Var.d(b42Var, A2);
                        break;
                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                        b42 b42Var2 = new b42(str);
                        e41 n2 = l42Var.B().n();
                        n2.getClass();
                        on1Var.d(b42Var2, zv.Q(n2));
                        break;
                    case 8:
                        b42 b42Var3 = new b42(str);
                        er u2 = l42Var.u();
                        int size = u2.size();
                        if (size == 0) {
                            bArr = f41.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u2.d(size, bArr2);
                            bArr = bArr2;
                        }
                        bArr.getClass();
                        on1Var.d(b42Var3, bArr);
                        break;
                    case 9:
                        throw new f50("Value not set.", null);
                }
            }
            return new on1(new LinkedHashMap(on1Var.a()), true);
        } catch (u41 e) {
            throw new f50("Unable to parse preferences proto.", e);
        }
    }

    public static Unit r(Object obj, v13 v13Var) {
        vu0 a;
        Map a2 = ((d42) obj).a();
        f42 n2 = h42.n();
        for (Map.Entry entry : a2.entrySet()) {
            b42 b42Var = (b42) entry.getKey();
            Object value = entry.getValue();
            String str = b42Var.a;
            if (value instanceof Boolean) {
                k42 D2 = l42.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D2.c();
                l42.q((l42) D2.n, booleanValue);
                a = D2.a();
            } else if (value instanceof Float) {
                k42 D3 = l42.D();
                float floatValue = ((Number) value).floatValue();
                D3.c();
                l42.r((l42) D3.n, floatValue);
                a = D3.a();
            } else if (value instanceof Double) {
                k42 D4 = l42.D();
                double doubleValue = ((Number) value).doubleValue();
                D4.c();
                l42.o((l42) D4.n, doubleValue);
                a = D4.a();
            } else if (value instanceof Integer) {
                k42 D5 = l42.D();
                int intValue = ((Number) value).intValue();
                D5.c();
                l42.s((l42) D5.n, intValue);
                a = D5.a();
            } else if (value instanceof Long) {
                k42 D6 = l42.D();
                long longValue = ((Number) value).longValue();
                D6.c();
                l42.l((l42) D6.n, longValue);
                a = D6.a();
            } else if (value instanceof String) {
                k42 D7 = l42.D();
                D7.c();
                l42.m((l42) D7.n, (String) value);
                a = D7.a();
            } else if (value instanceof Set) {
                k42 D8 = l42.D();
                i42 o2 = j42.o();
                o2.c();
                j42.l((j42) o2.n, (Set) value);
                D8.c();
                l42.n((l42) D8.n, (j42) o2.a());
                a = D8.a();
            } else {
                if (!(value instanceof byte[])) {
                    lh.g("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return null;
                }
                k42 D9 = l42.D();
                byte[] bArr = (byte[]) value;
                cr c = er.c(bArr, 0, bArr.length);
                D9.c();
                l42.p((l42) D9.n, c);
                a = D9.a();
            }
            n2.getClass();
            str.getClass();
            n2.c();
            h42.l((h42) n2.n).put(str, (l42) a);
        }
        h42 h42Var = (h42) n2.a();
        int a3 = h42Var.a(null);
        Logger logger = kv.f;
        if (a3 > 4096) {
            a3 = 4096;
        }
        kv kvVar = new kv(v13Var, a3);
        h42Var.b(kvVar);
        if (kvVar.d > 0) {
            kvVar.k();
        }
        return Unit.a;
    }

    @Override // defpackage.xh, defpackage.zh
    public float a() {
        switch (this.m) {
        }
        return 0.0f;
    }

    @Override // defpackage.j90
    public boolean c(SSLSocket sSLSocket) {
        return tp2.o(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.zm2
    public boolean d(Object obj, Object obj2) {
        switch (this.m) {
            case 4:
                return obj == obj2;
            default:
                return Intrinsics.b(obj, obj2);
        }
    }

    @Override // defpackage.j90
    public in2 e(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new qb(cls2);
    }

    @Override // defpackage.xh
    public void f(ca0 ca0Var, int i, int[] iArr, u81 u81Var, int[] iArr2) {
        switch (this.m) {
            case 28:
                if (u81Var != u81.m) {
                    s93.M(i, iArr, iArr2, true);
                    break;
                } else {
                    s93.M(i, iArr, iArr2, false);
                    break;
                }
            default:
                if (u81Var != u81.m) {
                    s93.N(i, iArr, iArr2, true);
                    break;
                } else {
                    s93.N(i, iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // defpackage.p30
    public Object g(jt2 jt2Var) {
        switch (this.m) {
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                if (jt2Var.m()) {
                    return (Bundle) jt2Var.i();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(jt2Var.h())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", jt2Var.h());
            default:
                Intent intent = (Intent) ((Bundle) jt2Var.i()).getParcelable("notification_data");
                if (intent != null) {
                    return new cv(intent);
                }
                return null;
        }
    }

    @Override // defpackage.fp2
    public Exception getException(Status status) {
        return status.o != null ? new i92(status) : new ne(status);
    }

    @Override // defpackage.io3
    public boolean h(Class cls) {
        return in3.class.isAssignableFrom(cls);
    }

    @Override // defpackage.zh
    public void i(ca0 ca0Var, int i, int[] iArr, int[] iArr2) {
        switch (this.m) {
            case 28:
                s93.M(i, iArr, iArr2, false);
                break;
            default:
                s93.N(i, iArr, iArr2, false);
                break;
        }
    }

    @Override // defpackage.lq2
    public jt2 j(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = ic2.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? mi2.j(bundle) : mi2.j(null);
    }

    @Override // defpackage.ih0
    public void k(jh0 jh0Var) {
        int i;
        String str = jh0Var.a;
        int i2 = jh0Var.d;
        int length = str.length();
        if (i2 < length) {
            char charAt = str.charAt(i2);
            i = 0;
            while (iv1.H(charAt) && i2 < length) {
                i++;
                i2++;
                if (i2 < length) {
                    charAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char charAt2 = str.charAt(jh0Var.d);
            char charAt3 = str.charAt(jh0Var.d + 1);
            if (iv1.H(charAt2) && iv1.H(charAt3)) {
                jh0Var.d((char) ((charAt3 - '0') + ((charAt2 - '0') * 10) + 130));
                jh0Var.d += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
            }
        }
        char a = jh0Var.a();
        int M = iv1.M(str, jh0Var.d, 0);
        if (M == 0) {
            if (!iv1.I(a)) {
                jh0Var.d((char) (a + 1));
                jh0Var.d++;
                return;
            } else {
                jh0Var.d((char) 235);
                jh0Var.d((char) (a - 127));
                jh0Var.d++;
                return;
            }
        }
        if (M == 1) {
            jh0Var.d((char) 230);
            jh0Var.e = 1;
            return;
        }
        if (M == 2) {
            jh0Var.d((char) 239);
            jh0Var.e = 2;
            return;
        }
        if (M == 3) {
            jh0Var.d((char) 238);
            jh0Var.e = 3;
        } else if (M == 4) {
            jh0Var.d((char) 240);
            jh0Var.e = 4;
        } else if (M != 5) {
            lh.g("Illegal mode: ".concat(String.valueOf(M)));
        } else {
            jh0Var.d((char) 231);
            jh0Var.e = 5;
        }
    }

    public void l(boolean z2, b41 b41Var, du2 du2Var, fk2 fk2Var, a00 a00Var, int i) {
        a00Var.Z(-818661242);
        int i2 = 2;
        int i3 = i | (a00Var.g(z2) ? 4 : 2) | (a00Var.g(false) ? 32 : 16) | (a00Var.f(b41Var) ? 256 : 128) | (a00Var.f(du2Var) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE) | (a00Var.f(fk2Var) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        if ((38347923 & i3) == 38347922 && a00Var.B()) {
            a00Var.S();
        } else {
            a00Var.U();
            if ((i & 1) != 0 && !a00Var.z()) {
                a00Var.S();
            }
            a00Var.r();
            hu2 hu2Var = new hu2(new ga1(0, 4, so2.class, ml2.a(!z2 ? du2Var.g : ((Boolean) yk3.x(b41Var, a00Var, (i3 >> 6) & 14).getValue()).booleanValue() ? du2Var.e : du2Var.f, bd3.P(150, 6, null), a00Var), "value", "getValue()Ljava/lang/Object;"));
            float f = pu2.b;
            fp.a(bd3.n(a.b(sl1.a, new ih2(5, fk2Var, hu2Var)), new ku(i2, b41Var, du2Var, z2)), a00Var, 0);
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new fu2(this, z2, b41Var, du2Var, fk2Var, i);
        }
    }

    public void m(String str, Function2 function2, boolean z2, boolean z3, ch2 ch2Var, b41 b41Var, Function2 function22, Function2 function23, fk2 fk2Var, du2 du2Var, yx1 yx1Var, Function2 function24, a00 a00Var, int i) {
        String str2;
        int i2;
        Function2 function25;
        boolean z4;
        boolean z5;
        int i3;
        yx1 zx1Var;
        Function2 H2;
        Function2 function26;
        yx1 yx1Var2;
        a00Var.Z(289640444);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (a00Var.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            function25 = function2;
            i2 |= a00Var.h(function25) ? 32 : 16;
        } else {
            function25 = function2;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i2 |= a00Var.g(z4) ? 256 : 128;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            z5 = z3;
            i2 |= a00Var.g(z5) ? 2048 : 1024;
        } else {
            z5 = z3;
        }
        int i4 = i & 24576;
        int i5 = Utility.DEFAULT_STREAM_BUFFER_SIZE;
        if (i4 == 0) {
            i2 |= a00Var.f(ch2Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= a00Var.f(b41Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= a00Var.g(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= a00Var.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= a00Var.h(function22) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= a00Var.h(function23) ? 536870912 : 268435456;
        }
        int i6 = 100663296 | (a00Var.h(null) ? 4 : 2) | (a00Var.h(null) ? 32 : 16) | (a00Var.h(null) ? 256 : 128) | (a00Var.h(null) ? 2048 : 1024);
        if (a00Var.f(fk2Var)) {
            i5 = 16384;
        }
        int i7 = i6 | i5 | (a00Var.f(du2Var) ? 131072 : 65536) | 13107200;
        if ((306783379 & i2) == 306783378 && (38347923 & i7) == 38347922 && a00Var.B()) {
            a00Var.S();
            yx1Var2 = yx1Var;
            function26 = function24;
        } else {
            a00Var.U();
            if ((i & 1) == 0 || a00Var.z()) {
                float f = pu2.b;
                i3 = i7 & (-3670017);
                zx1Var = new zx1(f, f, f, f);
                H2 = yj1.H(-435523791, new ex1(z4, b41Var, du2Var, fk2Var, 1), a00Var);
            } else {
                a00Var.S();
                i3 = i7 & (-3670017);
                zx1Var = yx1Var;
                H2 = function24;
            }
            a00Var.r();
            int i8 = i2 << 3;
            int i9 = i2 >> 3;
            int i10 = i2 >> 9;
            int i11 = i3 << 21;
            pu2.a(mv2.m, str2, function25, ch2Var, null, function22, function23, z5, z2, b41Var, zx1Var, du2Var, H2, a00Var, (i8 & 896) | (i8 & 112) | 6 | (i9 & 7168) | (i10 & 57344) | (458752 & i10) | (i10 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), (i9 & 57344) | (i2 & 896) | ((i3 >> 9) & 14) | ((i2 >> 6) & 112) | (i10 & 7168) | ((i3 << 3) & 3670016) | 12582912);
            function26 = H2;
            yx1Var2 = zx1Var;
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new gu2(this, str, function2, z2, z3, ch2Var, b41Var, function22, function23, fk2Var, du2Var, yx1Var2, function26, i);
        }
    }

    @Override // defpackage.yk1
    public boolean o(fk1 fk1Var) {
        return false;
    }

    @Override // defpackage.io3
    public wo3 p(Class cls) {
        if (!in3.class.isAssignableFrom(cls)) {
            lh.e("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (wo3) in3.l(cls.asSubclass(in3.class)).o(3);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    public String toString() {
        switch (this.m) {
            case 4:
                return "ReferentialEqualityPolicy";
            case 10:
                return "Start";
            case 11:
                return "StructuralEqualityPolicy";
            case 28:
                return "Arrangement#Center";
            case 29:
                return "Arrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.yk1
    public void b(fk1 fk1Var, boolean z2) {
    }
}
