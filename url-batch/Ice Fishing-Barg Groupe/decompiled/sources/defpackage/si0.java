package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class si0 {
    public static ti0 PxuCJdSBwIXG(SSLSession sSLSession) {
        List list;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            u9.rtx2ld2ELZv4("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            u9.S9EYkSpbGuxq("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        yj lS5Rgt96tfkO = yj.Companion.lS5Rgt96tfkO(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            u9.rtx2ld2ELZv4("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            u9.S9EYkSpbGuxq("tlsVersion == NONE");
            return null;
        }
        dk2.Companion.getClass();
        dk2 PxuCJdSBwIXG = ck2.PxuCJdSBwIXG(protocol);
        try {
            list = mv2.wdg6QnbFHrFF(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            list = p50.rtx2ld2ELZv4;
        }
        return new ti0(PxuCJdSBwIXG, lS5Rgt96tfkO, mv2.wdg6QnbFHrFF(sSLSession.getLocalCertificates()), new ri0(0, list));
    }
}
