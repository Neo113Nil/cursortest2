package z1;

import androidx.lifecycle.K;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l a(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = X0.t.f1385a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        h c2 = h.f4831b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        x b2 = j.b(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = A1.c.j(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = A1.c.j(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new l(b2, c2, list2, new K(3, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new l(b2, c2, list2, new K(3, list));
    }

    public static t b(String str) {
        if (str.equals("http/1.0")) {
            return t.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return t.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return t.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return t.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return t.SPDY_3;
        }
        if (str.equals("quic")) {
            return t.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }
}
