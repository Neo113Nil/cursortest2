package okhttp3.internal.tls;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal._HostnamesCommonKt;
import okio.Utf8;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    public static List getSubjectAltNames(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return EmptyList.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[LOOP:1: B:26:0x006e->B:56:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean verify(String str, X509Certificate x509Certificate) {
        boolean z;
        int length;
        str.getClass();
        if (_HostnamesCommonKt.VERIFY_AS_IP_ADDRESS.matches(str)) {
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
            List subjectAltNames = getSubjectAltNames(x509Certificate, 7);
            if (!(subjectAltNames instanceof Collection) || !subjectAltNames.isEmpty()) {
                Iterator it = subjectAltNames.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(canonicalHost, _HostnamesCommonKt.toCanonicalHost((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (str.length() == ((int) Utf8.size$default(str))) {
            Locale locale = Locale.US;
            str = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, str, locale);
        }
        List<String> subjectAltNames2 = getSubjectAltNames(x509Certificate, 2);
        if (!(subjectAltNames2 instanceof Collection) || !subjectAltNames2.isEmpty()) {
            for (String str2 : subjectAltNames2) {
                if (str.length() != 0 && !StringsKt__StringsJVMKt.startsWith(str, ".", false) && !StringsKt__StringsJVMKt.endsWith(str, "..", false) && str2 != null && str2.length() != 0 && !StringsKt__StringsJVMKt.startsWith(str2, ".", false) && !StringsKt__StringsJVMKt.endsWith(str2, "..", false)) {
                    String concat = !StringsKt__StringsJVMKt.endsWith(str, ".", false) ? str.concat(".") : str;
                    if (!StringsKt__StringsJVMKt.endsWith(str2, ".", false)) {
                        str2 = str2.concat(".");
                    }
                    if (str2.length() == ((int) Utf8.size$default(str2))) {
                        Locale locale2 = Locale.US;
                        str2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale2, str2, locale2);
                    }
                    if (!StringsKt.contains((CharSequence) str2, (CharSequence) Marker.ANY_MARKER, false)) {
                        z = concat.equals(str2);
                    } else if (StringsKt__StringsJVMKt.startsWith(str2, "*.", false) && StringsKt.indexOf$default((CharSequence) str2, '*', 1, false, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        if (StringsKt__StringsJVMKt.endsWith(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || StringsKt.lastIndexOf$default('.', length - 1, 4, (CharSequence) concat) == -1)) {
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
        if (str.length() == ((int) Utf8.size$default(str))) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return verify(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
