package V3;

import E.AbstractC0005f;
import F2.i;
import G3.B;
import J2.h;
import O3.d;
import O3.l;
import W.u;
import a.AbstractC0124a;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import c3.C0297i;
import com.google.android.gms.internal.play_billing.A0;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import com.google.android.gms.internal.play_billing.AbstractC0353w0;
import com.google.android.gms.internal.play_billing.C0329k0;
import com.google.android.gms.internal.play_billing.C0336n0;
import com.google.android.gms.internal.play_billing.C0355x0;
import com.google.android.gms.internal.play_billing.D0;
import com.google.android.gms.internal.play_billing.M0;
import com.google.android.gms.internal.play_billing.S0;
import com.google.android.gms.internal.play_billing.W0;
import h3.AbstractC0448a;
import io.flutter.plugin.common.MethodCall;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import o3.p;
import r.C1389c;
import r.f;
import r.g;
import x.AbstractC1514c;
import x3.AbstractC1541a;

/* loaded from: classes.dex */
public abstract class b {
    public static int A(byte[] bArr, int i4, C0329k0 c0329k0) {
        int G4 = G(bArr, i4, c0329k0);
        int i5 = c0329k0.f5960a;
        if (i5 < 0) {
            throw new D0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i5 > bArr.length - G4) {
            throw new D0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i5 == 0) {
            c0329k0.f5962c = C0336n0.f5981c;
            return G4;
        }
        c0329k0.f5962c = C0336n0.f(bArr, G4, i5);
        return G4 + i5;
    }

    public static String B(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e4) {
                    String b4 = AbstractC1514c.b(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(b4), (Throwable) e4);
                    str2 = "<" + b4 + " threw " + e4.getClass().getName() + ">";
                }
            }
            objArr[i5] = str2;
            i5++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i6, indexOf);
            sb.append(objArr[i4]);
            i4++;
            i6 = indexOf + 2;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i4 < length2) {
            sb.append(" [");
            sb.append(objArr[i4]);
            for (int i7 = i4 + 1; i7 < objArr.length; i7++) {
                sb.append(", ");
                sb.append(objArr[i7]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static int C(int i4, byte[] bArr) {
        int i5 = bArr[i4] & 255;
        int i6 = bArr[i4 + 1] & 255;
        int i7 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    public static int D(S0 s02, int i4, byte[] bArr, int i5, int i6, A0 a02, C0329k0 c0329k0) {
        AbstractC0353w0 f4 = s02.f();
        S0 s03 = s02;
        byte[] bArr2 = bArr;
        int i7 = i6;
        C0329k0 c0329k02 = c0329k0;
        int L = L(f4, s03, bArr2, i5, i7, c0329k02);
        s03.a(f4);
        c0329k02.f5962c = f4;
        a02.add(f4);
        while (L < i7) {
            C0329k0 c0329k03 = c0329k02;
            int i8 = i7;
            int G4 = G(bArr2, L, c0329k03);
            if (i4 != c0329k03.f5960a) {
                break;
            }
            byte[] bArr3 = bArr2;
            S0 s04 = s03;
            AbstractC0353w0 f5 = s04.f();
            L = L(f5, s04, bArr3, G4, i8, c0329k03);
            s03 = s04;
            bArr2 = bArr3;
            i7 = i8;
            c0329k02 = c0329k03;
            s03.a(f5);
            c0329k02.f5962c = f5;
            a02.add(f5);
        }
        return L;
    }

    public static int E(byte[] bArr, int i4, A0 a02, C0329k0 c0329k0) {
        C0355x0 c0355x0 = (C0355x0) a02;
        int G4 = G(bArr, i4, c0329k0);
        int i5 = c0329k0.f5960a + G4;
        while (G4 < i5) {
            G4 = G(bArr, G4, c0329k0);
            c0355x0.d(c0329k0.f5960a);
        }
        if (G4 == i5) {
            return G4;
        }
        throw new D0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int F(int i4, byte[] bArr, int i5, int i6, W0 w02, C0329k0 c0329k0) {
        if ((i4 >>> 3) == 0) {
            throw new D0("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            int J4 = J(bArr, i5, c0329k0);
            w02.c(i4, Long.valueOf(c0329k0.f5961b));
            return J4;
        }
        if (i7 == 1) {
            w02.c(i4, Long.valueOf(M(i5, bArr)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int G4 = G(bArr, i5, c0329k0);
            int i8 = c0329k0.f5960a;
            if (i8 < 0) {
                throw new D0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 > bArr.length - G4) {
                throw new D0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i8 == 0) {
                w02.c(i4, C0336n0.f5981c);
            } else {
                w02.c(i4, C0336n0.f(bArr, G4, i8));
            }
            return G4 + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new D0("Protocol message contained an invalid tag (zero).");
            }
            w02.c(i4, Integer.valueOf(C(i5, bArr)));
            return i5 + 4;
        }
        int i9 = (i4 & (-8)) | 4;
        W0 b4 = W0.b();
        int i10 = c0329k0.f5963d + 1;
        c0329k0.f5963d = i10;
        if (i10 >= 100) {
            throw new D0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i11 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int G5 = G(bArr, i5, c0329k0);
            int i12 = c0329k0.f5960a;
            if (i12 == i9) {
                i11 = i12;
                i5 = G5;
                break;
            }
            i5 = F(i12, bArr, G5, i6, b4, c0329k0);
            i11 = i12;
        }
        c0329k0.f5963d--;
        if (i5 > i6 || i11 != i9) {
            throw new D0("Failed to parse the message.");
        }
        w02.c(i4, b4);
        return i5;
    }

    public static int G(byte[] bArr, int i4, C0329k0 c0329k0) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        if (b4 < 0) {
            return H(b4, bArr, i5, c0329k0);
        }
        c0329k0.f5960a = b4;
        return i5;
    }

    public static int H(int i4, byte[] bArr, int i5, C0329k0 c0329k0) {
        byte b4 = bArr[i5];
        int i6 = i5 + 1;
        int i7 = i4 & 127;
        if (b4 >= 0) {
            c0329k0.f5960a = i7 | (b4 << 7);
            return i6;
        }
        int i8 = i7 | ((b4 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i6];
        if (b5 >= 0) {
            c0329k0.f5960a = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            c0329k0.f5960a = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            c0329k0.f5960a = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                c0329k0.f5960a = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int I(int i4, byte[] bArr, int i5, int i6, A0 a02, C0329k0 c0329k0) {
        C0355x0 c0355x0 = (C0355x0) a02;
        int G4 = G(bArr, i5, c0329k0);
        c0355x0.d(c0329k0.f5960a);
        while (G4 < i6) {
            int G5 = G(bArr, G4, c0329k0);
            if (i4 != c0329k0.f5960a) {
                break;
            }
            G4 = G(bArr, G5, c0329k0);
            c0355x0.d(c0329k0.f5960a);
        }
        return G4;
    }

    public static int J(byte[] bArr, int i4, C0329k0 c0329k0) {
        long j4 = bArr[i4];
        int i5 = i4 + 1;
        if (j4 >= 0) {
            c0329k0.f5961b = j4;
            return i5;
        }
        int i6 = i4 + 2;
        byte b4 = bArr[i5];
        long j5 = (j4 & 127) | ((b4 & Byte.MAX_VALUE) << 7);
        int i7 = 7;
        while (b4 < 0) {
            int i8 = i6 + 1;
            i7 += 7;
            j5 |= (r10 & Byte.MAX_VALUE) << i7;
            b4 = bArr[i6];
            i6 = i8;
        }
        c0329k0.f5961b = j5;
        return i6;
    }

    public static int K(Object obj, S0 s02, byte[] bArr, int i4, int i5, int i6, C0329k0 c0329k0) {
        M0 m02 = (M0) s02;
        int i7 = c0329k0.f5963d + 1;
        c0329k0.f5963d = i7;
        if (i7 >= 100) {
            throw new D0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int t4 = m02.t(obj, bArr, i4, i5, i6, c0329k0);
        c0329k0.f5963d--;
        c0329k0.f5962c = obj;
        return t4;
    }

    public static int L(Object obj, S0 s02, byte[] bArr, int i4, int i5, C0329k0 c0329k0) {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = H(i7, bArr, i6, c0329k0);
            i7 = c0329k0.f5960a;
        }
        int i8 = i6;
        if (i7 < 0 || i7 > i5 - i8) {
            throw new D0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i9 = c0329k0.f5963d + 1;
        c0329k0.f5963d = i9;
        if (i9 >= 100) {
            throw new D0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i10 = i8 + i7;
        s02.h(obj, bArr, i8, i10, c0329k0);
        c0329k0.f5963d--;
        c0329k0.f5962c = obj;
        return i10;
    }

    public static long M(int i4, byte[] bArr) {
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48) | ((bArr[i4 + 7] & 255) << 56);
    }

    public static void a(i iVar) {
        if (!iVar.f786f) {
            throw new IllegalStateException("AdSession is not started");
        }
        e(iVar);
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static final W3.a d(MethodCall methodCall) {
        Boolean bool = (Boolean) methodCall.argument("isSpeakerphoneOn");
        if (bool == null) {
            throw new IllegalStateException("isSpeakerphoneOn is required");
        }
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) methodCall.argument("stayAwake");
        if (bool2 == null) {
            throw new IllegalStateException("stayAwake is required");
        }
        boolean booleanValue2 = bool2.booleanValue();
        Integer num = (Integer) methodCall.argument("contentType");
        if (num == null) {
            throw new IllegalStateException("contentType is required");
        }
        int intValue = num.intValue();
        Integer num2 = (Integer) methodCall.argument("usageType");
        if (num2 == null) {
            throw new IllegalStateException("usageType is required");
        }
        int intValue2 = num2.intValue();
        Integer num3 = (Integer) methodCall.argument("audioFocus");
        if (num3 == null) {
            throw new IllegalStateException("audioFocus is required");
        }
        int intValue3 = num3.intValue();
        Integer num4 = (Integer) methodCall.argument("audioMode");
        if (num4 != null) {
            return new W3.a(booleanValue, booleanValue2, intValue, intValue2, intValue3, num4.intValue());
        }
        throw new IllegalStateException("audioMode is required");
    }

    public static void e(i iVar) {
        if (iVar.f787g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void f(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                uri.toString();
                return;
            }
            if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                HashMap hashMap = new HashMap();
                for (String str : uri.getQueryParameterNames()) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
                try {
                    d.a(h.f1183b.f1184a.getApplicationContext(), (String) hashMap.get("mechanism"), new t1.h(hashMap));
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            uri.toString();
        }
    }

    public static Object j(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final void k(int i4, int i5) {
        if (i4 > i5) {
            throw new IndexOutOfBoundsException(AbstractC0005f.l("toIndex (", i4, ") is greater than size (", i5, ")."));
        }
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static B o(String javaName) {
        kotlin.jvm.internal.i.e(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return B.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return B.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return B.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return B.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return B.SSL_3_0;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.h(javaName, "Unexpected TLS version: "));
    }

    public static int p(Context context, int i4, int i5) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.resourceId != 0 ? i4 : i5;
    }

    public static final int q(int i4, int i5, int i6) {
        if (i6 > 0) {
            if (i4 < i5) {
                int i7 = i5 % i6;
                if (i7 < 0) {
                    i7 += i6;
                }
                int i8 = i4 % i6;
                if (i8 < 0) {
                    i8 += i6;
                }
                int i9 = (i7 - i8) % i6;
                if (i9 < 0) {
                    i9 += i6;
                }
                return i5 - i9;
            }
        } else {
            if (i6 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i4 > i5) {
                int i10 = -i6;
                int i11 = i4 % i10;
                if (i11 < 0) {
                    i11 += i10;
                }
                int i12 = i5 % i10;
                if (i12 < 0) {
                    i12 += i10;
                }
                int i13 = (i11 - i12) % i10;
                if (i13 < 0) {
                    i13 += i10;
                }
                return i13 + i5;
            }
        }
        return i5;
    }

    public static long r(double d4) {
        AbstractC0124a.g("not a normal value", s(d4));
        int exponent = Math.getExponent(d4);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d4) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean s(double d4) {
        return Math.getExponent(d4) <= 1023;
    }

    public static void t(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void u(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static long x(u uVar, int i4, int i5) {
        uVar.M(i4);
        if (uVar.a() < 5) {
            return -9223372036854775807L;
        }
        int m4 = uVar.m();
        if ((8388608 & m4) != 0 || ((2096896 & m4) >> 8) != i5 || (m4 & 32) == 0 || uVar.z() < 7 || uVar.a() < 7 || (uVar.z() & 16) != 16) {
            return -9223372036854775807L;
        }
        uVar.k(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void y(p pVar, AbstractC1541a abstractC1541a, AbstractC1541a abstractC1541a2) {
        try {
            C3.a.g(C0297i.f5732a, AbstractC0347t0.m(((AbstractC0448a) pVar).create(abstractC1541a, abstractC1541a2)));
        } catch (Throwable th) {
            abstractC1541a2.resumeWith(l.h(th));
            throw th;
        }
    }

    public static final String z(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        Pattern compile = Pattern.compile("(.)(\\p{Upper})");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("$1_$2");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        Pattern compile2 = Pattern.compile("(.) (.)");
        kotlin.jvm.internal.i.d(compile2, "compile(...)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("$1_$2");
        kotlin.jvm.internal.i.d(replaceAll2, "replaceAll(...)");
        String upperCase = replaceAll2.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public abstract boolean g(g gVar, C1389c c1389c, C1389c c1389c2);

    public abstract boolean h(g gVar, Object obj, Object obj2);

    public abstract boolean i(g gVar, f fVar, f fVar2);

    public abstract String l(byte[] bArr, int i4, int i5);

    public abstract int m(String str, byte[] bArr, int i4, int i5);

    public abstract void v(f fVar, f fVar2);

    public abstract void w(f fVar, Thread thread);
}
