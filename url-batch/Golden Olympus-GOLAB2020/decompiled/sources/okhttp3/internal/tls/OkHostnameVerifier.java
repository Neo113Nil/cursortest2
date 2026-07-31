package okhttp3.internal.tls;

import io.jsonwebtoken.JwtParser;
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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.D;

@Metadata
/* loaded from: classes3.dex */
public final class OkHostnameVerifier implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final OkHostnameVerifier f43165a = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List c(X509Certificate x509Certificate, int i4) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i4)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) D.b(str, 0, 0, 3, null));
    }

    private final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !StringsKt.K(str, ".", false, 2, null) && !StringsKt.v(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !StringsKt.K(str2, ".", false, 2, null) && !StringsKt.v(str2, "..", false, 2, null)) {
            if (!StringsKt.v(str, ".", false, 2, null)) {
                str = str + JwtParser.SEPARATOR_CHAR;
            }
            String str3 = str;
            if (!StringsKt.v(str2, ".", false, 2, null)) {
                str2 = str2 + JwtParser.SEPARATOR_CHAR;
            }
            String b4 = b(str2);
            if (!StringsKt.P(b4, "*", false, 2, null)) {
                return Intrinsics.areEqual(str3, b4);
            }
            if (!StringsKt.K(b4, "*.", false, 2, null) || StringsKt.b0(b4, '*', 1, false, 4, null) != -1 || str3.length() < b4.length() || Intrinsics.areEqual("*.", b4)) {
                return false;
            }
            String substring = b4.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            if (!StringsKt.v(str3, substring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - substring.length();
            return length <= 0 || StringsKt.g0(str3, JwtParser.SEPARATOR_CHAR, length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String b4 = b(str);
        List c4 = c(x509Certificate, 2);
        if ((c4 instanceof Collection) && c4.isEmpty()) {
            return false;
        }
        Iterator it = c4.iterator();
        while (it.hasNext()) {
            if (f43165a.f(b4, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String e4 = HostnamesKt.e(str);
        List c4 = c(x509Certificate, 7);
        if ((c4 instanceof Collection) && c4.isEmpty()) {
            return false;
        }
        Iterator it = c4.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(e4, HostnamesKt.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List a(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return CollectionsKt.plus((Collection) c(certificate, 7), (Iterable) c(certificate, 2));
    }

    public final boolean e(String host, X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return Util.i(host) ? h(host, certificate) : g(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
