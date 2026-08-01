package s;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import androidx.lifecycle.h0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p3.l;
import t3.m;
import t3.p;
import t3.w;
import x2.q;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class a {
    public static final void a(w3.a aVar, w3.b bVar, String str) {
        w3.c.i.fine(bVar.f3826b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f3822a);
    }

    public static final String b(Object[] objArr, int i, int i4, x2.d dVar) {
        StringBuilder sb = new StringBuilder((i4 * 3) + 2);
        sb.append("[");
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i5];
            if (obj == dVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        i3.d.d(sb2, "toString(...)");
        return sb2;
    }

    public static void c(Throwable th, Throwable th2) {
        i3.d.e(th, "<this>");
        i3.d.e(th2, "exception");
        if (th != th2) {
            Integer num = e3.a.f1389a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = d3.a.f1306a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = t(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean e4 = e(i, rect, rect2);
        if (e(i, rect, rect3) || !e4) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static boolean e(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void i(int i, int i4, int i5) {
        if (i >= 0 && i4 <= i5) {
            if (i > i4) {
                throw new IllegalArgumentException(a4.b.d(i, i4, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i4 + ", size: " + i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress j(String str, int i, int i4) {
        int i5;
        byte[] bArr = new byte[16];
        int i6 = i;
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        while (true) {
            if (i6 >= i4) {
                break;
            }
            if (i7 == 16) {
                return null;
            }
            int i10 = i6 + 2;
            if (i10 <= i4 && l.p0(str, "::", i6, false)) {
                if (i8 != -1) {
                    return null;
                }
                i7 += 2;
                i8 = i7;
                if (i10 == i4) {
                    break;
                }
                i9 = i10;
                int i11 = 0;
                i6 = i9;
                while (i6 < i4) {
                }
                i5 = i6 - i9;
                return i5 == 0 ? null : null;
            }
            if (i7 != 0) {
                if (l.p0(str, ":", i6, false)) {
                    i6++;
                } else {
                    if (!l.p0(str, ".", i6, false)) {
                        return null;
                    }
                    int i12 = i7 - 2;
                    int i13 = i12;
                    while (i9 < i4) {
                        if (i13 == 16) {
                            return null;
                        }
                        if (i13 != i12) {
                            if (str.charAt(i9) != '.') {
                                return null;
                            }
                            i9++;
                        }
                        int i14 = 0;
                        int i15 = i9;
                        while (i15 < i4) {
                            char charAt = str.charAt(i15);
                            if (i3.d.f(charAt, 48) < 0 || i3.d.f(charAt, 57) > 0) {
                                break;
                            }
                            if ((i14 == 0 && i9 != i15) || ((i14 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i15++;
                        }
                        if (i15 - i9 == 0) {
                            return null;
                        }
                        bArr[i13] = (byte) i14;
                        i13++;
                        i9 = i15;
                    }
                    if (i13 != i7 + 2) {
                        return null;
                    }
                    i7 += 2;
                }
            }
            i9 = i6;
            int i112 = 0;
            i6 = i9;
            while (i6 < i4) {
                int o4 = u3.b.o(str.charAt(i6));
                if (o4 == -1) {
                    break;
                }
                i112 = (i112 << 4) + o4;
                i6++;
            }
            i5 = i6 - i9;
            if (i5 == 0 && i5 <= 4) {
                int i16 = i7 + 1;
                bArr[i7] = (byte) (255 & (i112 >>> 8));
                i7 += 2;
                bArr[i16] = (byte) (i112 & 255);
            }
        }
        if (i7 != 16) {
            if (i8 == -1) {
                return null;
            }
            int i17 = i7 - i8;
            System.arraycopy(bArr, i8, bArr, 16 - i17, i17);
            Arrays.fill(bArr, i8, (16 - i7) + i8, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final String k(long j2) {
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t3.i l(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = q.f3887f;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        t3.f c5 = t3.f.f3418b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        w j2 = r1.b.j(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = u3.b.i(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = u3.b.i(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new t3.i(j2, c5, list2, new h0(1, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new t3.i(j2, c5, list2, new h0(1, list));
    }

    public static m m(String str) {
        i3.d.e(str, "<this>");
        Matcher matcher = m.f3461c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        i3.d.d(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        i3.d.d(locale, "US");
        i3.d.d(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        i3.d.d(group2, "typeSubtype.group(2)");
        i3.d.d(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = m.d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                i3.d.d(substring, "this as java.lang.String).substring(startIndex)");
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
                } else if (l.q0(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    i3.d.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new m(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static boolean q(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i4 = rect.right;
            int i5 = rect2.right;
            return (i4 > i5 || rect.left >= i5) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            return (i6 > i7 || rect.top >= i7) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i8 = rect.left;
            int i9 = rect2.left;
            return (i8 < i9 || rect.right <= i9) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i10 = rect.top;
        int i11 = rect2.top;
        return (i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom;
    }

    public static boolean r(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static List s(Object obj) {
        List singletonList = Collections.singletonList(obj);
        i3.d.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static int t(int i, Rect rect, Rect rect2) {
        int i4;
        int i5;
        if (i == 17) {
            i4 = rect.left;
            i5 = rect2.right;
        } else if (i == 33) {
            i4 = rect.top;
            i5 = rect2.bottom;
        } else if (i == 66) {
            i4 = rect2.left;
            i5 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i4 = rect2.top;
            i5 = rect.bottom;
        }
        return Math.max(0, i4 - i5);
    }

    public static int u(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static e0.d v(String str) {
        int i;
        String str2;
        i3.d.e(str, "statusLine");
        boolean q02 = l.q0(str, "HTTP/1.", false);
        p pVar = p.HTTP_1_0;
        if (q02) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                pVar = p.HTTP_1_1;
            }
        } else {
            if (!l.q0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i4 = i + 3;
        if (str.length() < i4) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i, i4);
            i3.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i4) {
                str2 = "";
            } else {
                if (str.charAt(i4) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
                i3.d.d(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new e0.d(pVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static String w(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        g4.i iVar = g4.i.i;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        i3.d.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i = 0;
        b4.d.k(encoded.length, 0, length);
        r1.b.h(length, encoded.length);
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, length);
        i3.d.d(copyOfRange, "copyOfRange(...)");
        g4.i iVar2 = new g4.i(copyOfRange);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(copyOfRange, 0, iVar2.a());
        byte[] digest = messageDigest.digest();
        i3.d.b(digest);
        new g4.i(digest);
        byte[] bArr = g4.a.f1923a;
        i3.d.e(bArr, "map");
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i4 = 0;
        while (i < length2) {
            byte b2 = digest[i];
            int i5 = i + 2;
            byte b5 = digest[i + 1];
            i += 3;
            byte b6 = digest[i5];
            bArr2[i4] = bArr[(b2 & 255) >> 2];
            bArr2[i4 + 1] = bArr[((b2 & 3) << 4) | ((b5 & 255) >> 4)];
            int i6 = i4 + 3;
            bArr2[i4 + 2] = bArr[((b5 & 15) << 2) | ((b6 & 255) >> 6)];
            i4 += 4;
            bArr2[i6] = bArr[b6 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b7 = digest[i];
            bArr2[i4] = bArr[(b7 & 255) >> 2];
            bArr2[i4 + 1] = bArr[(b7 & 3) << 4];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
        } else if (length3 == 2) {
            int i7 = i + 1;
            byte b8 = digest[i];
            byte b9 = digest[i7];
            bArr2[i4] = bArr[(b8 & 255) >> 2];
            bArr2[i4 + 1] = bArr[((b8 & 3) << 4) | ((b9 & 255) >> 4)];
            bArr2[i4 + 2] = bArr[(b9 & 15) << 2];
            bArr2[i4 + 3] = 61;
        }
        sb.append(new String(bArr2, p3.a.f3089a));
        return sb.toString();
    }

    public static final String z(String str) {
        i3.d.e(str, "<this>");
        int i = -1;
        int i4 = 0;
        if (!p3.d.s0(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                i3.d.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                i3.d.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                i3.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char charAt = lowerCase.charAt(i5);
                    if (i3.d.f(charAt, 31) <= 0 || i3.d.f(charAt, 127) >= 0 || p3.d.w0(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress j2 = (l.q0(str, "[", false) && str.endsWith("]")) ? j(str, 1, str.length() - 1) : j(str, 0, str.length());
        if (j2 == null) {
            return null;
        }
        byte[] address = j2.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return j2.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < address.length) {
            int i8 = i6;
            while (i8 < 16 && address[i8] == 0 && address[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i6;
            if (i9 > i7 && i9 >= 4) {
                i = i6;
                i7 = i9;
            }
            i6 = i8 + 2;
        }
        g4.f fVar = new g4.f();
        while (i4 < address.length) {
            if (i4 == i) {
                fVar.x(58);
                i4 += i7;
                if (i4 == 16) {
                    fVar.x(58);
                }
            } else {
                if (i4 > 0) {
                    fVar.x(58);
                }
                byte b2 = address[i4];
                byte[] bArr = u3.b.f3581a;
                fVar.y(((b2 & 255) << 8) | (address[i4 + 1] & 255));
                i4 += 2;
            }
        }
        return fVar.r(fVar.f1935g, p3.a.f3089a);
    }

    public abstract boolean f(h hVar, d dVar);

    public abstract boolean g(h hVar, Object obj, Object obj2);

    public abstract boolean h(h hVar, g gVar, g gVar2);

    public abstract int n(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int o();

    public abstract ViewPropertyAnimator p(View view, int i);

    public abstract void x(g gVar, g gVar2);

    public abstract void y(g gVar, Thread thread);
}
