package k0;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.net.Socket;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2802a = true;

    public static final void a(p1.a aVar, p1.c cVar, String str) {
        p1.d.i.fine(cVar.f3428b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f3422a);
    }

    public static final boolean b(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        b1.d.e(bArr, "a");
        b1.d.e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static void c(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(n1.b.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static final void d(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static void e(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(n1.b.g("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                sb.append(n1.b.o(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static int f(String str, int i, int i2, boolean z2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z2)) {
                return i;
            }
            i++;
        }
        return i2;
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
    public static final InetAddress g(String str, int i, int i2) {
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
                if (i11 <= i2 && i1.l.v0(str, "::", i7, z2)) {
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
                    if (!i1.l.v0(str, ":", i7, z2)) {
                        if (i1.l.v0(str, ".", i7, z2)) {
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
                                        if (b1.d.f(charAt, 48) < 0 || b1.d.f(charAt, 57) > 0) {
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
                    int p2 = n1.b.p(str.charAt(i7));
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static m1.w h(String str) {
        b1.d.e(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return m1.w.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return m1.w.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return m1.w.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return m1.w.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return m1.w.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static final String i(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static m1.r j(String str) {
        if (str.equals("http/1.0")) {
            return m1.r.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return m1.r.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return m1.r.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return m1.r.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return m1.r.SPDY_3;
        }
        if (str.equals("quic")) {
            return m1.r.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static final boolean k(AssertionError assertionError) {
        Logger logger = z1.m.f4281a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? i1.d.y0(message, "getsockname failed") : false;
    }

    public static m1.k l(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = i1.d.M0(str).toString();
        }
        int H2 = u1.l.H(0, strArr2.length - 1, 2);
        if (H2 >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                c(str2);
                e(str3, str2);
                if (i == H2) {
                    break;
                }
                i += 2;
            }
        }
        return new m1.k(strArr2);
    }

    public static void m(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static B.d n(String str) {
        int i;
        String str2;
        b1.d.e(str, "statusLine");
        boolean w02 = i1.l.w0(str, "HTTP/1.", false);
        m1.r rVar = m1.r.HTTP_1_0;
        if (w02) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                rVar = m1.r.HTTP_1_1;
            }
        } else {
            if (!i1.l.w0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i, i2);
            b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
                b1.d.d(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new B.d(rVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static long o(String str, int i) {
        int f2 = f(str, 0, i, false);
        Matcher matcher = m1.i.f3198m.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (f2 < i) {
            int f3 = f(str, f2 + 1, i, true);
            matcher.region(f2, f3);
            if (i3 == -1 && matcher.usePattern(m1.i.f3198m).matches()) {
                String group = matcher.group(1);
                b1.d.d(group, "matcher.group(1)");
                i3 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                b1.d.d(group2, "matcher.group(2)");
                i6 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                b1.d.d(group3, "matcher.group(3)");
                i7 = Integer.parseInt(group3);
            } else if (i4 == -1 && matcher.usePattern(m1.i.f3197l).matches()) {
                String group4 = matcher.group(1);
                b1.d.d(group4, "matcher.group(1)");
                i4 = Integer.parseInt(group4);
            } else {
                if (i5 == -1) {
                    Pattern pattern = m1.i.f3196k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        b1.d.d(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        b1.d.d(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        b1.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        b1.d.d(pattern2, "MONTH_PATTERN.pattern()");
                        i5 = i1.d.C0(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(m1.i.f3195j).matches()) {
                    String group6 = matcher.group(1);
                    b1.d.d(group6, "matcher.group(1)");
                    i2 = Integer.parseInt(group6);
                }
            }
            f2 = f(str, f3 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i5 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i4 || i4 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i3 < 0 || i3 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 < 0 || i6 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || i7 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(n1.b.f3322e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final z1.c p(Socket socket) {
        Logger logger = z1.m.f4281a;
        z1.u uVar = new z1.u(socket);
        OutputStream outputStream = socket.getOutputStream();
        b1.d.d(outputStream, "getOutputStream(...)");
        return new z1.c(uVar, new z1.c(outputStream, uVar));
    }

    public static final z1.d q(Socket socket) {
        Logger logger = z1.m.f4281a;
        z1.u uVar = new z1.u(socket);
        InputStream inputStream = socket.getInputStream();
        b1.d.d(inputStream, "getInputStream(...)");
        return new z1.d(uVar, 0, new z1.d(inputStream, 1, uVar));
    }

    public static void r(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            v.b(viewGroup, z2);
        } else if (f2802a) {
            try {
                v.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f2802a = false;
            }
        }
    }

    public static final String s(String str) {
        b1.d.e(str, "<this>");
        int i = 0;
        int i2 = -1;
        if (!i1.d.y0(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                b1.d.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                b1.d.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                b1.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = lowerCase.charAt(i3);
                    if (b1.d.f(charAt, 31) <= 0 || b1.d.f(charAt, 127) >= 0 || i1.d.B0(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress g2 = (i1.l.w0(str, "[", false) && str.endsWith("]")) ? g(str, 1, str.length() - 1) : g(str, 0, str.length());
        if (g2 == null) {
            return null;
        }
        byte[] address = g2.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return g2.getHostAddress();
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
        z1.f fVar = new z1.f();
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
                byte[] bArr = n1.b.f3319a;
                fVar.v(((b2 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return fVar.n(fVar.f4269b, i1.a.f2499a);
    }
}
