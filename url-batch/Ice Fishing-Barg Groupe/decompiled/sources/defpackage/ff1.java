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

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ff1 implements HostnameVerifier {
    public static final ff1 PxuCJdSBwIXG = new ff1();

    public static List PxuCJdSBwIXG(X509Certificate x509Certificate, int i) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return p50.rtx2ld2ELZv4;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && cs0.wdg6QnbFHrFF(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x005d->B:52:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean TSizfFm2Yiuu(String str, X509Certificate x509Certificate) {
        boolean z;
        int length;
        str.getClass();
        if (iv2.PxuCJdSBwIXG.TSizfFm2Yiuu(str)) {
            String lS5Rgt96tfkO = iv2.lS5Rgt96tfkO(str);
            List PxuCJdSBwIXG2 = PxuCJdSBwIXG(x509Certificate, 7);
            if (!PxuCJdSBwIXG2.isEmpty()) {
                Iterator it = PxuCJdSBwIXG2.iterator();
                while (it.hasNext()) {
                    if (cs0.wdg6QnbFHrFF(lS5Rgt96tfkO, iv2.lS5Rgt96tfkO((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (lS5Rgt96tfkO(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            str = str.toLowerCase(locale);
            str.getClass();
        }
        List<String> PxuCJdSBwIXG3 = PxuCJdSBwIXG(x509Certificate, 2);
        if (!PxuCJdSBwIXG3.isEmpty()) {
            for (String str2 : PxuCJdSBwIXG3) {
                if (str.length() != 0 && !pa2.yQRudnv4La6p(str, ".", false) && !str.endsWith("..") && str2 != null && str2.length() != 0 && !pa2.yQRudnv4La6p(str2, ".", false) && !str2.endsWith("..")) {
                    String concat = !str.endsWith(".") ? str.concat(".") : str;
                    if (!str2.endsWith(".")) {
                        str2 = str2.concat(".");
                    }
                    if (lS5Rgt96tfkO(str2)) {
                        Locale locale2 = Locale.US;
                        locale2.getClass();
                        str2 = str2.toLowerCase(locale2);
                        str2.getClass();
                    }
                    if (!ia2.jJwa0q7P5wHq(str2, "*", false)) {
                        z = concat.equals(str2);
                    } else if (pa2.yQRudnv4La6p(str2, "*.", false) && ia2.rxipThha848g(str2, '*', 1, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        if (concat.endsWith(substring) && ((length = concat.length() - substring.length()) <= 0 || ia2.v6yxfmkxNKhL(concat, '.', length - 1, 4) == -1)) {
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

    public static boolean lS5Rgt96tfkO(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            u9.e9gEMXR7LXtO(o0.OPXfSBeufaJ8(length2, "endIndex < beginIndex: ", " < 0"));
            return false;
        }
        if (length2 > str.length()) {
            StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(length2, "endIndex > string.length: ", " > ");
            BRwzKIf41E4i.append(str.length());
            throw new IllegalArgumentException(BRwzKIf41E4i.toString().toString());
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

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (lS5Rgt96tfkO(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return TSizfFm2Yiuu(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
