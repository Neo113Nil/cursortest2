package R6;

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
import kotlin.collections.A;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.p;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2443a = new c();

    public static List a(X509Certificate x509Certificate, int i2) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return A.f6115d;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.a(list.get(0), Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return A.f6115d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[LOOP:1: B:26:0x0078->B:58:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String host, X509Certificate certificate) {
        boolean z7;
        int length;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        Regex regex = E6.b.f708a;
        Intrinsics.checkNotNullParameter(host, "<this>");
        if (E6.b.f708a.c(host)) {
            String b7 = E6.b.b(host);
            List a7 = a(certificate, 7);
            if (a7 == null || !a7.isEmpty()) {
                Iterator it = a7.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.a(b7, E6.b.b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (host.length() == ((int) T6.b.f(host))) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            host = host.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(host, "toLowerCase(...)");
        }
        List<String> a8 = a(certificate, 2);
        if (a8 == null || !a8.isEmpty()) {
            for (String str : a8) {
                if (host != null && host.length() != 0 && !p.l(host, ".") && !p.f(host, "..") && str != null && str.length() != 0 && !p.l(str, ".") && !p.f(str, "..")) {
                    String concat = !p.f(host, ".") ? host.concat(".") : host;
                    if (!p.f(str, ".")) {
                        str = str.concat(".");
                    }
                    if (str.length() == ((int) T6.b.f(str))) {
                        Locale US2 = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US2, "US");
                        str = str.toLowerCase(US2);
                        Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                    }
                    if (!StringsKt.u(str, "*", false)) {
                        z7 = Intrinsics.a(concat, str);
                    } else if (p.l(str, "*.") && StringsKt.x(str, '*', 1, 4) == -1 && concat.length() >= str.length() && !"*.".equals(str)) {
                        String substring = str.substring(1);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        if (p.f(concat, substring) && ((length = concat.length() - substring.length()) <= 0 || StringsKt.B(concat, '.', length - 1, 4) == -1)) {
                            z7 = true;
                        }
                    }
                    if (!z7) {
                        return true;
                    }
                }
                z7 = false;
                if (!z7) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (host.length() == ((int) T6.b.f(host))) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                Intrinsics.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return b(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
