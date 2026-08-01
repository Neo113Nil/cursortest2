package k0;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.I;
import j0.AbstractC0143a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2726a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2727b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2728c;

    public static final boolean a(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        b1.d.e(bArr, "a");
        b1.d.e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void e(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m1.i g(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = T0.q.f829a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        m1.f c2 = m1.f.f3140b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        m1.v i = AbstractC0143a.i(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = n1.b.j(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = n1.b.j(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new m1.i(i, c2, list2, new I(1, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new m1.i(i, c2, list2, new I(1, list));
    }

    public static m1.n h(String str) {
        b1.d.e(str, "<this>");
        Matcher matcher = m1.n.f3189c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        b1.d.d(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        b1.d.d(locale, "US");
        b1.d.d(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        b1.d.d(group2, "typeSubtype.group(2)");
        b1.d.d(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = m1.n.d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                b1.d.d(substring, "this as java.lang.String).substring(startIndex)");
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
                } else if (i1.l.o0(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    b1.d.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new m1.n(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static int i(Context context, int i, int i2) {
        Integer num;
        TypedValue S2 = u1.l.S(context, i);
        if (S2 != null) {
            int i3 = S2.resourceId;
            num = Integer.valueOf(i3 != 0 ? A.b.a(context, i3) : S2.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static int j(View view, int i) {
        Context context = view.getContext();
        TypedValue W2 = u1.l.W(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = W2.resourceId;
        return i2 != 0 ? A.b.a(context, i2) : W2.data;
    }

    public static final boolean l(AssertionError assertionError) {
        Logger logger = z1.m.f4280a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? i1.d.q0(message, "getsockname failed") : false;
    }

    public static boolean m(int i) {
        boolean z2;
        if (i != 0) {
            ThreadLocal threadLocal = C.a.f56a;
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

    public static int n(int i, int i2, float f2) {
        return C.a.b(C.a.d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static final boolean o(String str) {
        b1.d.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static String p(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        z1.i iVar = z1.i.d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        b1.d.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i = 0;
        e(encoded.length, 0, length);
        byte[] l02 = T0.g.l0(0, length, encoded);
        z1.i iVar2 = new z1.i(l02);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(l02, 0, iVar2.a());
        byte[] digest = messageDigest.digest();
        b1.d.b(digest);
        new z1.i(digest);
        byte[] bArr = z1.a.f4254a;
        b1.d.e(bArr, "map");
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
        sb.append(new String(bArr2, i1.a.f2460a));
        return sb.toString();
    }

    public static final z1.c u(Socket socket) {
        Logger logger = z1.m.f4280a;
        z1.u uVar = new z1.u(socket);
        OutputStream outputStream = socket.getOutputStream();
        b1.d.d(outputStream, "getOutputStream(...)");
        return new z1.c(uVar, new z1.c(outputStream, uVar));
    }

    public static final z1.d v(Socket socket) {
        Logger logger = z1.m.f4280a;
        z1.u uVar = new z1.u(socket);
        InputStream inputStream = socket.getInputStream();
        b1.d.d(inputStream, "getInputStream(...)");
        return new z1.d(uVar, 0, new z1.d(inputStream, 1, uVar));
    }

    public abstract boolean b(p.g gVar, p.c cVar);

    public abstract boolean c(p.g gVar, Object obj, Object obj2);

    public abstract boolean d(p.g gVar, p.f fVar, p.f fVar2);

    public float k(View view) {
        if (f2726a) {
            try {
                return y.a(view);
            } catch (NoSuchMethodError unused) {
                f2726a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void q(p.f fVar, p.f fVar2);

    public abstract void r(p.f fVar, Thread thread);

    public void s(View view, float f2) {
        if (f2726a) {
            try {
                y.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f2726a = false;
            }
        }
        view.setAlpha(f2);
    }

    public void t(View view, int i) {
        if (!f2728c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2727b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2728c = true;
        }
        Field field = f2727b;
        if (field != null) {
            try {
                f2727b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
