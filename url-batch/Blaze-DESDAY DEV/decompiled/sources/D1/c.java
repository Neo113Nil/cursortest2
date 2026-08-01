package D1;

import V0.p;
import g1.g;
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
import k0.AbstractC0180a;
import n1.l;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f188a = new c();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        p pVar = p.f917a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return pVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && g1.d.a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return pVar;
        }
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
        int i2 = 0;
        while (i2 < length2) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    i = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char charAt2 = i3 < length2 ? str.charAt(i3) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i2 = i3;
                    } else {
                        j2 += 4;
                        i2 += 2;
                    }
                }
                j2 += i;
            }
            i2++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:1: B:23:0x0070->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z2;
        int length;
        g1.d.e(str, "host");
        byte[] bArr = s1.b.f3721a;
        g gVar = s1.b.f3725f;
        gVar.getClass();
        if (((Pattern) gVar.f2551b).matcher(str).matches()) {
            String s2 = AbstractC0180a.s(str);
            List a2 = a(x509Certificate, 7);
            if (!a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    if (g1.d.a(s2, AbstractC0180a.s((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(str)) {
                Locale locale = Locale.US;
                g1.d.d(locale, "US");
                str = str.toLowerCase(locale);
                g1.d.d(str, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> a3 = a(x509Certificate, 2);
            if (!a3.isEmpty()) {
                for (String str2 : a3) {
                    if (str.length() != 0 && !l.y(str, ".", false) && !str.endsWith("..") && str2 != null && str2.length() != 0 && !l.y(str2, ".", false) && !str2.endsWith("..")) {
                        String concat = !str.endsWith(".") ? str.concat(".") : str;
                        if (!str2.endsWith(".")) {
                            str2 = str2.concat(".");
                        }
                        if (b(str2)) {
                            Locale locale2 = Locale.US;
                            g1.d.d(locale2, "US");
                            str2 = str2.toLowerCase(locale2);
                            g1.d.d(str2, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!n1.d.A(str2, "*")) {
                            z2 = g1.d.a(concat, str2);
                        } else if (l.y(str2, "*.", false) && n1.d.D(str2, '*', 1, false, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                            String substring = str2.substring(1);
                            g1.d.d(substring, "this as java.lang.String).substring(startIndex)");
                            if (concat.endsWith(substring) && ((length = concat.length() - substring.length()) <= 0 || n1.d.H(concat, '.', length - 1, 4) == -1)) {
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            return true;
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        g1.d.e(str, "host");
        g1.d.e(sSLSession, "session");
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            g1.d.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return c(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
