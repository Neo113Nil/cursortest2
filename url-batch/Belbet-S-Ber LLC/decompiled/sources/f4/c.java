package f4;

import i3.f;
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
import p3.l;
import x2.q;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1441a = new c();

    public static List a(X509Certificate x509Certificate, int i) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return q.f3887f;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && i3.d.a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + length2 + " < 0").toString());
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j2 = 0;
        int i4 = 0;
        while (i4 < length2) {
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    i = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i = 3;
                } else {
                    int i5 = i4 + 1;
                    char charAt2 = i5 < length2 ? str.charAt(i5) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i4 = i5;
                    } else {
                        j2 += 4;
                        i4 += 2;
                    }
                }
                j2 += i;
            }
            i4++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x0070->B:52:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z4;
        int length;
        i3.d.e(str, "host");
        byte[] bArr = u3.b.f3581a;
        f fVar = u3.b.f3585f;
        fVar.getClass();
        if (((Pattern) fVar.f2074g).matcher(str).matches()) {
            String z5 = s.a.z(str);
            List a5 = a(x509Certificate, 7);
            if (!a5.isEmpty()) {
                Iterator it = a5.iterator();
                while (it.hasNext()) {
                    if (i3.d.a(z5, s.a.z((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(str)) {
            Locale locale = Locale.US;
            i3.d.d(locale, "US");
            str = str.toLowerCase(locale);
            i3.d.d(str, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> a6 = a(x509Certificate, 2);
        if (!a6.isEmpty()) {
            for (String str2 : a6) {
                if (str.length() != 0 && !l.q0(str, ".", false) && !str.endsWith("..") && str2 != null && str2.length() != 0 && !l.q0(str2, ".", false) && !str2.endsWith("..")) {
                    String concat = !str.endsWith(".") ? str.concat(".") : str;
                    if (!str2.endsWith(".")) {
                        str2 = str2.concat(".");
                    }
                    if (b(str2)) {
                        Locale locale2 = Locale.US;
                        i3.d.d(locale2, "US");
                        str2 = str2.toLowerCase(locale2);
                        i3.d.d(str2, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!p3.d.s0(str2, "*")) {
                        z4 = i3.d.a(concat, str2);
                    } else if (l.q0(str2, "*.", false) && p3.d.w0(str2, '*', 1, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        i3.d.d(substring, "this as java.lang.String).substring(startIndex)");
                        if (concat.endsWith(substring) && ((length = concat.length() - substring.length()) <= 0 || p3.d.z0(concat, '.', length - 1, 4) == -1)) {
                            z4 = true;
                        }
                    }
                    if (!z4) {
                        return true;
                    }
                }
                z4 = false;
                if (!z4) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        i3.d.e(str, "host");
        i3.d.e(sSLSession, "session");
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                i3.d.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
