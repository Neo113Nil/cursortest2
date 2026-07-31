package com.yandex.mobile.ads.impl;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sd1 implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final sd1 f31696a = new sd1();

    private sd1() {
    }

    @NotNull
    public static List a(@NotNull X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return CollectionsKt.plus((Collection) a(certificate, 7), (Iterable) a(certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(@NotNull String host, @NotNull SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (host.length() == ((int) okio.D.b(host, 0, 0, 3, null))) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return a(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }

    private static List a(X509Certificate x509Certificate, int i4) {
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

    public static boolean a(@NotNull String host, @NotNull X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        if (v82.a(host)) {
            String a4 = pf0.a(host);
            List a5 = a(certificate, 7);
            if (!(a5 instanceof Collection) || !a5.isEmpty()) {
                Iterator it = a5.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(a4, pf0.a((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (host.length() == ((int) okio.D.b(host, 0, 0, 3, null))) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                host = host.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(host, "toLowerCase(...)");
            }
            List a6 = a(certificate, 2);
            if (!(a6 instanceof Collection) || !a6.isEmpty()) {
                Iterator it2 = a6.iterator();
                while (it2.hasNext()) {
                    if (a(host, (String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean a(String str, String str2) {
        if (str != null && str.length() != 0 && !StringsKt.K(str, ".", false, 2, null) && !StringsKt.v(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !StringsKt.K(str2, ".", false, 2, null) && !StringsKt.v(str2, "..", false, 2, null)) {
            if (!StringsKt.v(str, ".", false, 2, null)) {
                str = str + ".";
            }
            String str3 = str;
            if (!StringsKt.v(str2, ".", false, 2, null)) {
                str2 = str2 + ".";
            }
            if (str2.length() == ((int) okio.D.b(str2, 0, 0, 3, null))) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str2 = str2.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            }
            String str4 = str2;
            if (!StringsKt.P(str4, "*", false, 2, null)) {
                return Intrinsics.areEqual(str3, str4);
            }
            if (!StringsKt.K(str4, "*.", false, 2, null) || StringsKt.b0(str4, '*', 1, false, 4, null) != -1 || str3.length() < str4.length() || Intrinsics.areEqual("*.", str4)) {
                return false;
            }
            String substring = str4.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (!StringsKt.v(str3, substring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - substring.length();
            return length <= 0 || StringsKt.g0(str3, JwtParser.SEPARATOR_CHAR, length + (-1), false, 4, null) == -1;
        }
        return false;
    }
}
