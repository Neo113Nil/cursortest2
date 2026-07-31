package l6;

import F5.j;
import F5.q;
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
import l5.C0512p;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5310a = new c();

    public static List a(X509Certificate x509Certificate, int i7) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return C0512p.f5303f;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && i.a(list.get(0), Integer.valueOf(i7)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x0073->B:52:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String host, X509Certificate x509Certificate) {
        boolean z5;
        int length;
        i.e(host, "host");
        F5.i iVar = Y5.b.f3098a;
        F5.i iVar2 = Y5.b.f3098a;
        iVar2.getClass();
        if (iVar2.f806f.matcher(host).matches()) {
            String b7 = Y5.b.b(host);
            List a7 = a(x509Certificate, 7);
            if (!a7.isEmpty()) {
                Iterator it = a7.iterator();
                while (it.hasNext()) {
                    if (i.a(b7, Y5.b.b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (host.length() == ((int) n6.b.f(host))) {
            Locale US = Locale.US;
            i.d(US, "US");
            host = host.toLowerCase(US);
            i.d(host, "toLowerCase(...)");
        }
        List<String> a8 = a(x509Certificate, 2);
        if (!a8.isEmpty()) {
            for (String str : a8) {
                if (host.length() != 0 && !q.I(host, ".") && !q.B(host, "..") && str != null && str.length() != 0 && !q.I(str, ".") && !q.B(str, "..")) {
                    String concat = !q.B(host, ".") ? host.concat(".") : host;
                    if (!q.B(str, ".")) {
                        str = str.concat(".");
                    }
                    if (str.length() == ((int) n6.b.f(str))) {
                        Locale US2 = Locale.US;
                        i.d(US2, "US");
                        str = str.toLowerCase(US2);
                        i.d(str, "toLowerCase(...)");
                    }
                    if (!j.L(str, "*", false)) {
                        z5 = i.a(concat, str);
                    } else if (q.I(str, "*.") && j.Q(str, '*', 1, 4) == -1 && concat.length() >= str.length() && !"*.".equals(str)) {
                        String substring = str.substring(1);
                        i.d(substring, "substring(...)");
                        if (q.B(concat, substring) && ((length = concat.length() - substring.length()) <= 0 || j.U(concat, '.', length - 1, 4) == -1)) {
                            z5 = true;
                        }
                    }
                    if (!z5) {
                        return true;
                    }
                }
                z5 = false;
                if (!z5) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        i.e(host, "host");
        i.e(session, "session");
        if (host.length() == ((int) n6.b.f(host))) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                i.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return b(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
