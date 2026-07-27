package y3;

import A.AbstractC0017m;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import m3.u;
import z2.C1405I;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f11693a = new c();

    public static List a(X509Certificate x509Certificate, int i2) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C1405I.f11931d;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.a(list.get(0), Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C1405I.f11931d;
        }
    }

    public static boolean b(String str) {
        int i2;
        int length = str.length();
        int length2 = str.length();
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.h(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder o4 = AbstractC0017m.o(length2, "endIndex > string.length: ", " > ");
            o4.append(str.length());
            throw new IllegalArgumentException(o4.toString().toString());
        }
        long j4 = 0;
        int i4 = 0;
        while (i4 < length2) {
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                j4++;
            } else {
                if (charAt < 2048) {
                    i2 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i2 = 3;
                } else {
                    int i5 = i4 + 1;
                    char charAt2 = i5 < length2 ? str.charAt(i5) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j4++;
                        i4 = i5;
                    } else {
                        j4 += 4;
                        i4 += 2;
                    }
                }
                j4 += i2;
            }
            i4++;
        }
        return length == ((int) j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[LOOP:1: B:27:0x0073->B:60:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String host, X509Certificate certificate) {
        boolean z4;
        int length;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        byte[] bArr = n3.b.f8558a;
        Intrinsics.checkNotNullParameter(host, "<this>");
        if (n3.b.f8563f.b(host)) {
            String j4 = u.j(host);
            List a4 = a(certificate, 7);
            if (a4 == null || !a4.isEmpty()) {
                Iterator it = a4.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.a(j4, u.j((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(host)) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                host = host.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(host, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> a5 = a(certificate, 2);
            if (a5 == null || !a5.isEmpty()) {
                for (String str : a5) {
                    if (host != null && host.length() != 0 && !kotlin.text.u.n(host, ".") && !kotlin.text.u.h(false, host, "..") && str != null && str.length() != 0 && !kotlin.text.u.n(str, ".") && !kotlin.text.u.h(false, str, "..")) {
                        String concat = !kotlin.text.u.h(false, host, ".") ? host.concat(".") : host;
                        if (!kotlin.text.u.h(false, str, ".")) {
                            str = str.concat(".");
                        }
                        if (b(str)) {
                            Locale US2 = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US2, "US");
                            str = str.toLowerCase(US2);
                            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!y.p(str, "*")) {
                            z4 = Intrinsics.a(concat, str);
                        } else if (kotlin.text.u.n(str, "*.") && y.u(str, '*', 1, false, 4) == -1 && concat.length() >= str.length() && !"*.".equals(str)) {
                            String substring = str.substring(1);
                            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                            if (kotlin.text.u.h(false, concat, substring) && ((length = concat.length() - substring.length()) <= 0 || y.z(concat, '.', length - 1, 4) == -1)) {
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
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!b(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return c(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
