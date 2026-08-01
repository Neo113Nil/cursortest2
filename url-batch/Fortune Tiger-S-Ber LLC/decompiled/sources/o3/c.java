package o3;

import b3.e;
import b3.m;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import n2.o;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2995a = new c();

    public static List a(X509Certificate x509Certificate, int i4) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return o.f2953f;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && u2.c.a(list.get(0), Integer.valueOf(i4)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        int i4;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + length2 + " < 0").toString());
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j4 = 0;
        int i5 = 0;
        while (i5 < length2) {
            char charAt = str.charAt(i5);
            if (charAt < 128) {
                j4++;
            } else {
                if (charAt < 2048) {
                    i4 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i4 = 3;
                } else {
                    int i6 = i5 + 1;
                    char charAt2 = i6 < length2 ? str.charAt(i6) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j4++;
                        i5 = i6;
                    } else {
                        j4 += 4;
                        i5 += 2;
                    }
                }
                j4 += i4;
            }
            i5++;
        }
        return length == ((int) j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x0070->B:52:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z3;
        int length;
        u2.c.e(str, "host");
        byte[] bArr = d3.c.f1490a;
        b3.d dVar = d3.c.f1494f;
        dVar.getClass();
        if (((Pattern) dVar.g).matcher(str).matches()) {
            String i02 = k3.d.i0(str);
            List a4 = a(x509Certificate, 7);
            if (!a4.isEmpty()) {
                Iterator it = a4.iterator();
                while (it.hasNext()) {
                    if (u2.c.a(i02, k3.d.i0((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(str)) {
            Locale locale = Locale.US;
            u2.c.d(locale, "US");
            str = str.toLowerCase(locale);
            u2.c.d(str, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> a5 = a(x509Certificate, 2);
        if (!a5.isEmpty()) {
            for (String str2 : a5) {
                if (str.length() != 0 && !m.b0(str, ".", false) && !str.endsWith("..") && str2 != null && str2.length() != 0 && !m.b0(str2, ".", false) && !str2.endsWith("..")) {
                    String concat = !str.endsWith(".") ? str.concat(".") : str;
                    if (!str2.endsWith(".")) {
                        str2 = str2.concat(".");
                    }
                    if (b(str2)) {
                        Locale locale2 = Locale.US;
                        u2.c.d(locale2, "US");
                        str2 = str2.toLowerCase(locale2);
                        u2.c.d(str2, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!e.d0(str2, "*")) {
                        z3 = u2.c.a(concat, str2);
                    } else if (m.b0(str2, "*.", false) && e.g0(str2, '*', 1, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        u2.c.d(substring, "this as java.lang.String).substring(startIndex)");
                        if (concat.endsWith(substring) && ((length = concat.length() - substring.length()) <= 0 || e.k0(concat, '.', length - 1, 4) == -1)) {
                            z3 = true;
                        }
                    }
                    if (!z3) {
                        return true;
                    }
                }
                z3 = false;
                if (!z3) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        u2.c.e(str, "host");
        u2.c.e(sSLSession, "session");
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                u2.c.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
