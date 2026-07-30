package defpackage;

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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eu1 implements HostnameVerifier {
    public static final eu1 a = new eu1();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return ah0.m;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.b(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return ah0.m;
        }
    }

    public static boolean b(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            lh.c(in1.l(length2, "endIndex < beginIndex: ", " < 0"));
            return false;
        }
        if (length2 > str.length()) {
            StringBuilder n = in1.n(length2, "endIndex > string.length: ", " > ");
            n.append(str.length());
            throw new IllegalArgumentException(n.toString().toString());
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    j = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char charAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[LOOP:1: B:26:0x0061->B:56:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z;
        int length;
        str.getClass();
        if (n33.e.a(str)) {
            String h0 = tk3.h0(str);
            List a2 = a(x509Certificate, 7);
            if (a2 == null || !a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.b(h0, tk3.h0((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            str = str.toLowerCase(locale);
            str.getClass();
        }
        List<String> a3 = a(x509Certificate, 2);
        if (a3 == null || !a3.isEmpty()) {
            for (String str2 : a3) {
                if (str.length() != 0 && !tp2.o(str, ".", false) && !tp2.h(str, "..", false) && str2 != null && str2.length() != 0 && !tp2.o(str2, ".", false) && !tp2.h(str2, "..", false)) {
                    String concat = !tp2.h(str, ".", false) ? str.concat(".") : str;
                    if (!tp2.h(str2, ".", false)) {
                        str2 = str2.concat(".");
                    }
                    if (b(str2)) {
                        Locale locale2 = Locale.US;
                        locale2.getClass();
                        str2 = str2.toLowerCase(locale2);
                        str2.getClass();
                    }
                    if (!up2.q(str2, "*")) {
                        z = concat.equals(str2);
                    } else if (tp2.o(str2, "*.", false) && up2.v(str2, '*', 1, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        if (tp2.h(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || up2.z(concat, '.', length - 1, 4) == -1)) {
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
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
