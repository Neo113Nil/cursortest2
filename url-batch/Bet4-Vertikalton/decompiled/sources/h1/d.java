package h1;

import S0.p;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.I;
import c1.l;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
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
import l0.x;
import m.C0260a;
import o1.f;
import o1.i;
import o1.n;
import o1.q;
import o1.v;
import p.g;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static long f2523a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2524b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2525c = true;
    public static Field d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2526e;

    public static final void a(r1.a aVar, r1.c cVar, String str) {
        r1.d.i.fine(cVar.f3515b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f3509a);
    }

    public static void b(StringBuilder sb, Object obj, l lVar) {
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

    public static View f(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static final String g(long j2) {
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
    public static i h(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = p.f795a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        f c2 = f.f3274b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        v g2 = C0260a.g(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = p1.b.j(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = p1.b.j(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new i(g2, c2, list2, new I(1, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new i(g2, c2, list2, new I(1, list));
    }

    public static n i(String str) {
        d1.d.e(str, "<this>");
        Matcher matcher = n.f3323c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        d1.d.d(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        d1.d.d(locale, "US");
        d1.d.d(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        d1.d.d(group2, "typeSubtype.group(2)");
        d1.d.d(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = n.d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                d1.d.d(substring, "this as java.lang.String).substring(startIndex)");
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
                } else if (k1.l.y(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    d1.d.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new n(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static boolean k() {
        boolean isEnabled;
        try {
            if (f2524b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2524b == null) {
                f2523a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2524b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2524b.invoke(null, Long.valueOf(f2523a))).booleanValue();
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

    public static B.d l(String str) {
        int i;
        String str2;
        d1.d.e(str, "statusLine");
        boolean y2 = k1.l.y(str, "HTTP/1.", false);
        q qVar = q.HTTP_1_0;
        if (y2) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                qVar = q.HTTP_1_1;
            }
        } else {
            if (!k1.l.y(str, "ICY ", false)) {
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
            d1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
                d1.d.d(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new B.d(qVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static String m(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        B1.i iVar = B1.i.d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        d1.d.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i = 0;
        w1.d.m(encoded.length, 0, length);
        byte[] e02 = S0.f.e0(0, length, encoded);
        B1.i iVar2 = new B1.i(e02);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(e02, 0, iVar2.a());
        byte[] digest = messageDigest.digest();
        d1.d.b(digest);
        new B1.i(digest);
        byte[] bArr = B1.a.f55a;
        d1.d.e(bArr, "map");
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
        sb.append(new String(bArr2, k1.a.f2754a));
        return sb.toString();
    }

    public static a r(c cVar, int i) {
        d1.d.e(cVar, "<this>");
        boolean z2 = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z2) {
            if (cVar.f2519c <= 0) {
                i = -i;
            }
            return new a(cVar.f2517a, cVar.f2518b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static c s(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new c(i, i2 - 1, 1);
        }
        c cVar = c.d;
        return c.d;
    }

    public abstract boolean c(g gVar, p.c cVar);

    public abstract boolean d(g gVar, Object obj, Object obj2);

    public abstract boolean e(g gVar, p.f fVar, p.f fVar2);

    public float j(View view) {
        if (f2525c) {
            try {
                return x.a(view);
            } catch (NoSuchMethodError unused) {
                f2525c = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void n(p.f fVar, p.f fVar2);

    public abstract void o(p.f fVar, Thread thread);

    public void p(View view, float f2) {
        if (f2525c) {
            try {
                x.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f2525c = false;
            }
        }
        view.setAlpha(f2);
    }

    public void q(View view, int i) {
        if (!f2526e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2526e = true;
        }
        Field field = d;
        if (field != null) {
            try {
                d.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
