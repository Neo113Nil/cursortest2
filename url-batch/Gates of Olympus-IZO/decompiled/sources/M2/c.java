package M2;

import H2.AbstractC0080b;
import M1.u;
import Z1.i;
import a.AbstractC0157a;
import h2.AbstractC0447i;
import h2.AbstractC0454p;
import h2.C0446h;
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

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2815a = new c();

    public static List a(X509Certificate x509Certificate, int i3) {
        Object obj;
        u uVar = u.f2803d;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return uVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && i.a(list.get(0), Integer.valueOf(i3)) && (obj = list.get(1)) != null) {
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
            throw new IllegalArgumentException(AbstractC0080b.i("endIndex < beginIndex: ", length2, " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder l3 = AbstractC0080b.l("endIndex > string.length: ", length2, " > ");
            l3.append(str.length());
            throw new IllegalArgumentException(l3.toString().toString());
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
        i.f(str, "host");
        byte[] bArr = B2.c.f415a;
        C0446h c0446h = B2.c.f420f;
        c0446h.getClass();
        if (c0446h.f5078d.matcher(str).matches()) {
            String X2 = AbstractC0157a.X(str);
            List a3 = a(x509Certificate, 7);
            if (!a3.isEmpty()) {
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    if (i.a(X2, AbstractC0157a.X((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(str)) {
                Locale locale = Locale.US;
                i.e(locale, "US");
                str = str.toLowerCase(locale);
                i.e(str, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> a4 = a(x509Certificate, 2);
            if (!a4.isEmpty()) {
                for (String str2 : a4) {
                    if (str.length() != 0 && !AbstractC0454p.i0(str, ".") && !AbstractC0454p.c0(str, "..", false) && str2 != null && str2.length() != 0 && !AbstractC0454p.i0(str2, ".") && !AbstractC0454p.c0(str2, "..", false)) {
                        String concat = !AbstractC0454p.c0(str, ".", false) ? str.concat(".") : str;
                        if (!AbstractC0454p.c0(str2, ".", false)) {
                            str2 = str2.concat(".");
                        }
                        if (b(str2)) {
                            Locale locale2 = Locale.US;
                            i.e(locale2, "US");
                            str2 = str2.toLowerCase(locale2);
                            i.e(str2, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!AbstractC0447i.l0(str2, "*")) {
                            z3 = i.a(concat, str2);
                        } else if (AbstractC0454p.i0(str2, "*.") && AbstractC0447i.q0(str2, '*', 1, false, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                            String substring = str2.substring(1);
                            i.e(substring, "this as java.lang.String).substring(startIndex)");
                            if (AbstractC0454p.c0(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || AbstractC0447i.v0(concat, '.', length - 1, 4) == -1)) {
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
        i.f(str, "host");
        i.f(sSLSession, "session");
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            i.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return c(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
