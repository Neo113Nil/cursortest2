package org.apache.a.c.d;

import com.cmplay.base.util.webview.util.WebUtils;
import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* compiled from: AbstractVerifier.java */
/* loaded from: classes2.dex */
public abstract class a implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f9687a = {"ac", WebUtils.CO, "com", "ed", "edu", "go", "gouv", "gov", TJAdUnitConstants.String.VIDEO_INFO, "lg", "ne", "net", "or", "org"};

    static {
        Arrays.sort(f9687a);
    }

    @Override // org.apache.a.c.d.h
    public final void a(String str, SSLSocket sSLSocket) throws IOException {
        if (str == null) {
            throw new NullPointerException("host to verify is null");
        }
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        a(str, (X509Certificate) session.getPeerCertificates()[0]);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException unused) {
            return false;
        }
    }

    public final void a(String str, X509Certificate x509Certificate) throws SSLException {
        a(str, a(x509Certificate), a(x509Certificate, str));
    }

    public final void a(String str, String[] strArr, String[] strArr2, boolean z) throws SSLException {
        boolean endsWith;
        LinkedList linkedList = new LinkedList();
        if (strArr != null && strArr.length > 0 && strArr[0] != null) {
            linkedList.add(strArr[0]);
        }
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                if (str2 != null) {
                    linkedList.add(str2);
                }
            }
        }
        if (linkedList.isEmpty()) {
            throw new SSLException("Certificate for <" + str + "> doesn't contain CN or DNS subjectAlt");
        }
        StringBuilder sb = new StringBuilder();
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        Iterator it = linkedList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
            sb.append(" <");
            sb.append(lowerCase2);
            sb.append('>');
            if (it.hasNext()) {
                sb.append(" OR");
            }
            String[] split = lowerCase2.split("\\.");
            if (split.length >= 3 && split[0].endsWith("*") && a(lowerCase2) && !c(str)) {
                if (split[0].length() > 1) {
                    String substring = split[0].substring(0, split.length - 2);
                    endsWith = lowerCase.startsWith(substring) && lowerCase.substring(substring.length()).endsWith(lowerCase2.substring(split[0].length()));
                } else {
                    endsWith = lowerCase.endsWith(lowerCase2.substring(1));
                }
                if (endsWith && z) {
                    z2 = b(lowerCase) == b(lowerCase2);
                } else {
                    z2 = endsWith;
                }
            } else {
                z2 = lowerCase.equals(lowerCase2);
            }
            if (z2) {
                break;
            }
        }
        if (z2) {
            return;
        }
        throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) sb));
    }

    public static boolean a(String str) {
        String[] split = str.split("\\.");
        return (split.length == 3 && split[2].length() == 2 && Arrays.binarySearch(f9687a, split[1]) >= 0) ? false : true;
    }

    public static String[] a(X509Certificate x509Certificate) {
        LinkedList linkedList = new LinkedList();
        StringTokenizer stringTokenizer = new StringTokenizer(x509Certificate.getSubjectX500Principal().toString(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("CN=");
            if (indexOf >= 0) {
                linkedList.add(nextToken.substring(indexOf + 3));
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    private static String[] a(X509Certificate x509Certificate, String str) {
        Collection<List<?>> collection;
        int i = c(str) ? 7 : 2;
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            Logger.getLogger(a.class.getName()).log(Level.FINE, "Error parsing certificate.", (Throwable) e);
            collection = null;
        }
        if (collection != null) {
            for (List<?> list : collection) {
                if (((Integer) list.get(0)).intValue() == i) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    public static int b(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    private static boolean c(String str) {
        return str != null && (org.apache.a.c.e.a.a(str) || org.apache.a.c.e.a.d(str));
    }
}
