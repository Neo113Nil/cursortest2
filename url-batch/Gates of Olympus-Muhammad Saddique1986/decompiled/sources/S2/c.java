package S2;

import A.k;
import O2.l;
import S1.u;
import f2.j;
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
import n2.AbstractC0730j;
import n2.AbstractC0737q;
import n2.C0728h;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f4332a = new c();

    public static List a(X509Certificate x509Certificate, int i3) {
        Object obj;
        u uVar = u.f4320d;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return uVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && j.a(list.get(0), Integer.valueOf(i3)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return uVar;
        }
    }

    public static boolean b(String str) {
        int i3;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(k.g(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder k3 = k.k(length2, "endIndex > string.length: ", " > ");
            k3.append(str.length());
            throw new IllegalArgumentException(k3.toString().toString());
        }
        long j3 = 0;
        int i4 = 0;
        while (i4 < length2) {
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                j3++;
            } else {
                if (charAt < 2048) {
                    i3 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i3 = 3;
                } else {
                    int i5 = i4 + 1;
                    char charAt2 = i5 < length2 ? str.charAt(i5) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j3++;
                        i4 = i5;
                    } else {
                        j3 += 4;
                        i4 += 2;
                    }
                }
                j3 += i3;
            }
            i4++;
        }
        return length == ((int) j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:1: B:23:0x006e->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z3;
        int length;
        j.f(str, "host");
        byte[] bArr = H2.b.f2632a;
        C0728h c0728h = H2.b.f2637f;
        c0728h.getClass();
        if (c0728h.f7369d.matcher(str).matches()) {
            String w02 = l.w0(str);
            List a3 = a(x509Certificate, 7);
            if (!a3.isEmpty()) {
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    if (j.a(w02, l.w0((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(str)) {
                Locale locale = Locale.US;
                j.e(locale, "US");
                str = str.toLowerCase(locale);
                j.e(str, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> a4 = a(x509Certificate, 2);
            if (!a4.isEmpty()) {
                for (String str2 : a4) {
                    if (str.length() != 0 && !AbstractC0737q.z(str, ".") && !AbstractC0737q.r(str, "..", false) && str2 != null && str2.length() != 0 && !AbstractC0737q.z(str2, ".") && !AbstractC0737q.r(str2, "..", false)) {
                        String concat = !AbstractC0737q.r(str, ".", false) ? str.concat(".") : str;
                        if (!AbstractC0737q.r(str2, ".", false)) {
                            str2 = str2.concat(".");
                        }
                        if (b(str2)) {
                            Locale locale2 = Locale.US;
                            j.e(locale2, "US");
                            str2 = str2.toLowerCase(locale2);
                            j.e(str2, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!AbstractC0730j.C(str2, "*")) {
                            z3 = j.a(concat, str2);
                        } else if (AbstractC0737q.z(str2, "*.") && AbstractC0730j.H(str2, '*', 1, false, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                            String substring = str2.substring(1);
                            j.e(substring, "this as java.lang.String).substring(startIndex)");
                            if (AbstractC0737q.r(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || AbstractC0730j.N(concat, '.', length - 1, 4) == -1)) {
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
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        j.f(str, "host");
        j.f(sSLSession, "session");
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            j.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return c(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
