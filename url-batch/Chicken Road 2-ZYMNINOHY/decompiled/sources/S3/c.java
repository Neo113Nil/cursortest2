package S3;

import E.AbstractC0005f;
import O3.l;
import d3.q;
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
import kotlin.jvm.internal.i;
import w3.AbstractC1510g;
import w3.C1509f;
import w3.o;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2606a = new c();

    public static List a(X509Certificate x509Certificate, int i4) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return q.f8333a;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && i.a(list.get(0), Integer.valueOf(i4)) && (obj = list.get(1)) != null) {
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
            throw new IllegalArgumentException(AbstractC0005f.k(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder r4 = AbstractC0005f.r(length2, "endIndex > string.length: ", " > ");
            r4.append(str.length());
            throw new IllegalArgumentException(r4.toString().toString());
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

    /* JADX WARN: Removed duplicated region for block: B:51:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x0073->B:52:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String host, X509Certificate certificate) {
        boolean z;
        int length;
        i.e(host, "host");
        i.e(certificate, "certificate");
        byte[] bArr = H3.b.f1103a;
        C1509f c1509f = H3.b.f1107e;
        c1509f.getClass();
        if (c1509f.f15950a.matcher(host).matches()) {
            String x4 = l.x(host);
            List a3 = a(certificate, 7);
            if (!a3.isEmpty()) {
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    if (i.a(x4, l.x((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(host)) {
            Locale US = Locale.US;
            i.d(US, "US");
            host = host.toLowerCase(US);
            i.d(host, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> a4 = a(certificate, 2);
        if (!a4.isEmpty()) {
            for (String str : a4) {
                if (host.length() != 0 && !o.a0(host, ".", false) && !o.V(host, "..") && str != null && str.length() != 0 && !o.a0(str, ".", false) && !o.V(str, "..")) {
                    String h2 = !o.V(host, ".") ? i.h(".", host) : host;
                    if (!o.V(str, ".")) {
                        str = i.h(".", str);
                    }
                    if (b(str)) {
                        Locale US2 = Locale.US;
                        i.d(US2, "US");
                        str = str.toLowerCase(US2);
                        i.d(str, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!AbstractC1510g.c0(str, "*")) {
                        z = i.a(h2, str);
                    } else if (o.a0(str, "*.", false) && AbstractC1510g.g0(str, '*', 1, 4) == -1 && h2.length() >= str.length() && !"*.".equals(str)) {
                        String substring = str.substring(1);
                        i.d(substring, "this as java.lang.String).substring(startIndex)");
                        if (o.V(h2, substring) && ((length = h2.length() - substring.length()) <= 0 || AbstractC1510g.k0(h2, '.', length - 1, 4) == -1)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        return true;
                    }
                }
                z = false;
                if (!z) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        i.e(host, "host");
        i.e(session, "session");
        if (b(host)) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                if (certificate != null) {
                    return c(host, (X509Certificate) certificate);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
