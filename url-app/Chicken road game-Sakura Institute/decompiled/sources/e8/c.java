package e8;

import a0.m;
import e6.u;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import r6.k;
import z6.g;
import z6.h;
import z6.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2891a = new c();

    public static List a(X509Certificate x509Certificate, int i7) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return u.f2826f;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && k.a(list.get(0), Integer.valueOf(i7)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        int i7;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(m.g(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder n8 = m.n(length2, "endIndex > string.length: ", " > ");
            n8.append(str.length());
            throw new IllegalArgumentException(n8.toString().toString());
        }
        long j8 = 0;
        int i8 = 0;
        while (i8 < length2) {
            char charAt = str.charAt(i8);
            if (charAt < 128) {
                j8++;
            } else {
                if (charAt < 2048) {
                    i7 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i7 = 3;
                } else {
                    int i9 = i8 + 1;
                    char charAt2 = i9 < length2 ? str.charAt(i9) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j8++;
                        i8 = i9;
                    } else {
                        j8 += 4;
                        i8 += 2;
                    }
                }
                j8 += i7;
            }
            i8++;
        }
        return length == ((int) j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x006e->B:52:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z8;
        int length;
        k.f(str, "host");
        byte[] bArr = t7.b.f8932a;
        g gVar = t7.b.f8937f;
        gVar.getClass();
        if (gVar.f10131f.matcher(str).matches()) {
            String S = r4.a.S(str);
            List a3 = a(x509Certificate, 7);
            if (!a3.isEmpty()) {
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    if (k.a(S, r4.a.S((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(str)) {
            Locale locale = Locale.US;
            k.e(locale, "US");
            str = str.toLowerCase(locale);
            k.e(str, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> a9 = a(x509Certificate, 2);
        if (!a9.isEmpty()) {
            for (String str2 : a9) {
                if (str.length() != 0 && !o.v(str, ".") && !o.o(false, str, "..") && str2 != null && str2.length() != 0 && !o.v(str2, ".") && !o.o(false, str2, "..")) {
                    String concat = !o.o(false, str, ".") ? str.concat(".") : str;
                    if (!o.o(false, str2, ".")) {
                        str2 = str2.concat(".");
                    }
                    if (b(str2)) {
                        Locale locale2 = Locale.US;
                        k.e(locale2, "US");
                        str2 = str2.toLowerCase(locale2);
                        k.e(str2, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!h.y(str2, "*")) {
                        z8 = k.a(concat, str2);
                    } else if (o.v(str2, "*.") && h.D(str2, '*', 1, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        k.e(substring, "this as java.lang.String).substring(startIndex)");
                        if (o.o(false, concat, substring) && ((length = concat.length() - substring.length()) <= 0 || h.J(concat, '.', length - 1, 4) == -1)) {
                            z8 = true;
                        }
                    }
                    if (!z8) {
                        return true;
                    }
                }
                z8 = false;
                if (!z8) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        k.f(str, "host");
        k.f(sSLSession, "session");
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                k.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
