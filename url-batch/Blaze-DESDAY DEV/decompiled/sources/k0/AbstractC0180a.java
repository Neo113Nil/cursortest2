package k0;

import E1.i;
import V0.p;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.lifecycle.I;
import f1.l;
import g1.d;
import i0.g;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import l0.v;
import p.c;
import r1.f;
import r1.j;
import r1.o;
import r1.w;
import s1.b;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0180a {

    /* renamed from: a, reason: collision with root package name */
    public static long f2782a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2783b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2784c = true;

    public static void a(StringBuilder sb, Object obj, l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.e(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r7 == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r8 != (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress e(String str, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 16;
        byte[] bArr = new byte[16];
        boolean z2 = false;
        int i7 = i;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        while (true) {
            if (i7 >= i2) {
                i3 = i6;
                break;
            }
            if (i8 != i6) {
                int i11 = i7 + 2;
                if (i11 <= i2 && n1.l.x(str, "::", i7, z2)) {
                    if (i9 == -1) {
                        i8 += 2;
                        if (i11 != i2) {
                            i9 = i8;
                            i10 = i11;
                            i7 = i10;
                            int i12 = 0;
                            while (i7 < i2) {
                            }
                            i5 = i7 - i10;
                            if (i5 == 0) {
                                break;
                            }
                            break;
                        }
                        i3 = i6;
                        i9 = i8;
                        break;
                    }
                    return null;
                }
                if (i8 != 0) {
                    if (!n1.l.x(str, ":", i7, z2)) {
                        if (n1.l.x(str, ".", i7, z2)) {
                            int i13 = i8 - 2;
                            int i14 = i13;
                            loop2: while (true) {
                                if (i10 < i2) {
                                    if (i14 == i6) {
                                        break;
                                    }
                                    if (i14 != i13) {
                                        if (str.charAt(i10) != '.') {
                                            break;
                                        }
                                        i10++;
                                    }
                                    ?? r14 = z2;
                                    int i15 = i10;
                                    while (i15 < i2) {
                                        char charAt = str.charAt(i15);
                                        if (d.f(charAt, 48) < 0 || d.f(charAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 == 0 && i10 != i15) || (i4 = ((r14 * 10) + charAt) - 48) > 255) {
                                            break loop2;
                                        }
                                        i15++;
                                        r14 = i4;
                                    }
                                    if (i15 - i10 == 0) {
                                        break;
                                    }
                                    bArr[i14] = (byte) r14;
                                    i14++;
                                    i10 = i15;
                                    i6 = 16;
                                    z2 = false;
                                } else if (i14 == i8 + 2) {
                                    i8 += 2;
                                    i3 = 16;
                                }
                            }
                        }
                        return null;
                    }
                    i7++;
                }
                i10 = i7;
                i7 = i10;
                int i122 = 0;
                while (i7 < i2) {
                    int p2 = b.p(str.charAt(i7));
                    if (p2 == -1) {
                        break;
                    }
                    i122 = (i122 << 4) + p2;
                    i7++;
                }
                i5 = i7 - i10;
                if (i5 == 0 || i5 > 4) {
                    break;
                }
                int i16 = i8 + 1;
                bArr[i8] = (byte) ((i122 >>> 8) & 255);
                i8 += 2;
                bArr[i16] = (byte) (i122 & 255);
                i6 = 16;
                z2 = false;
            } else {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j f(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = p.f917a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        f c2 = f.f3419b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        w i = g.i(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = b.j(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = b.j(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new j(i, c2, list2, new I(1, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new j(i, c2, list2, new I(1, list));
    }

    public static o g(String str) {
        d.e(str, "<this>");
        Matcher matcher = o.f3469c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        d.d(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        d.d(locale, "US");
        d.d(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        d.d(group2, "typeSubtype.group(2)");
        d.d(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = o.d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                d.d(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (n1.l.y(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    d.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new o(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static int h(Context context, int i, int i2) {
        Integer num;
        TypedValue f02 = z1.d.f0(context, i);
        if (f02 != null) {
            int i3 = f02.resourceId;
            num = Integer.valueOf(i3 != 0 ? A.b.a(context, i3) : f02.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static int i(View view, int i) {
        Context context = view.getContext();
        TypedValue j02 = z1.d.j0(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = j02.resourceId;
        return i2 != 0 ? A.b.a(context, i2) : j02.data;
    }

    public static boolean j(int i) {
        boolean z2;
        if (i != 0) {
            ThreadLocal threadLocal = C.a.f70a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d = red / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = green / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = blue / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            z2 = false;
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d4;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            if (d4 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    public static boolean k() {
        boolean isEnabled;
        try {
            if (f2783b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2783b == null) {
                f2782a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2783b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2783b.invoke(null, Long.valueOf(f2782a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static int l(int i, int i2, float f2) {
        return C.a.b(C.a.d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static void m(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final boolean n(String str) {
        d.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static String o(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        i iVar = i.d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        d.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i = 0;
        z1.l.d(encoded.length, 0, length);
        byte[] f02 = V0.f.f0(0, length, encoded);
        i iVar2 = new i(f02);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(f02, 0, iVar2.a());
        byte[] digest = messageDigest.digest();
        d.b(digest);
        new i(digest);
        byte[] bArr = E1.a.f189a;
        d.e(bArr, "map");
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i2 = 0;
        while (i < length2) {
            byte b2 = digest[i];
            int i3 = i + 2;
            byte b3 = digest[i + 1];
            i += 3;
            byte b4 = digest[i3];
            bArr2[i2] = bArr[(b2 & 255) >> 2];
            bArr2[i2 + 1] = bArr[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i2 += 4;
            bArr2[i4] = bArr[b4 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b5 = digest[i];
            bArr2[i2] = bArr[(b5 & 255) >> 2];
            bArr2[1 + i2] = bArr[(b5 & 3) << 4];
            bArr2[2 + i2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length3 == 2) {
            int i5 = i + 1;
            byte b6 = digest[i];
            byte b7 = digest[i5];
            bArr2[i2] = bArr[(b6 & 255) >> 2];
            bArr2[1 + i2] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr2[i2 + 2] = bArr[(b7 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        sb.append(new String(bArr2, n1.a.f3243a));
        return sb.toString();
    }

    public static void r(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            v.b(viewGroup, z2);
        } else if (f2784c) {
            try {
                v.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f2784c = false;
            }
        }
    }

    public static final String s(String str) {
        d.e(str, "<this>");
        int i = 0;
        int i2 = -1;
        if (!n1.d.A(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                d.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                d.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = lowerCase.charAt(i3);
                    if (d.f(charAt, 31) <= 0 || d.f(charAt, 127) >= 0 || n1.d.D(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress e2 = (n1.l.y(str, "[", false) && str.endsWith("]")) ? e(str, 1, str.length() - 1) : e(str, 0, str.length());
        if (e2 == null) {
            return null;
        }
        byte[] address = e2.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return e2.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        E1.f fVar = new E1.f();
        while (i < address.length) {
            if (i == i2) {
                fVar.u(58);
                i += i5;
                if (i == 16) {
                    fVar.u(58);
                }
            } else {
                if (i > 0) {
                    fVar.u(58);
                }
                byte b2 = address[i];
                byte[] bArr = b.f3721a;
                fVar.v(((b2 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return fVar.n(fVar.f203b, n1.a.f3243a);
    }

    public abstract boolean b(p.g gVar, c cVar);

    public abstract boolean c(p.g gVar, Object obj, Object obj2);

    public abstract boolean d(p.g gVar, p.f fVar, p.f fVar2);

    public abstract void p(p.f fVar, p.f fVar2);

    public abstract void q(p.f fVar, Thread thread);
}
