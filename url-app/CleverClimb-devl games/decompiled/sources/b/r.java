package b;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: Handshake.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final af f2124a;

    /* renamed from: b, reason: collision with root package name */
    private final h f2125b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Certificate> f2126c;

    /* renamed from: d, reason: collision with root package name */
    private final List<Certificate> f2127d;

    private r(af afVar, h hVar, List<Certificate> list, List<Certificate> list2) {
        this.f2124a = afVar;
        this.f2125b = hVar;
        this.f2126c = list;
        this.f2127d = list2;
    }

    public static r a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List emptyList;
        List emptyList2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        h a2 = h.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        af a3 = af.a(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        if (certificateArr != null) {
            emptyList = b.a.c.a(certificateArr);
        } else {
            emptyList = Collections.emptyList();
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            emptyList2 = b.a.c.a(localCertificates);
        } else {
            emptyList2 = Collections.emptyList();
        }
        return new r(a3, a2, emptyList, emptyList2);
    }

    public h a() {
        return this.f2125b;
    }

    public List<Certificate> b() {
        return this.f2126c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return b.a.c.a(this.f2125b, rVar.f2125b) && this.f2125b.equals(rVar.f2125b) && this.f2126c.equals(rVar.f2126c) && this.f2127d.equals(rVar.f2127d);
    }

    public int hashCode() {
        return ((((((527 + (this.f2124a != null ? this.f2124a.hashCode() : 0)) * 31) + this.f2125b.hashCode()) * 31) + this.f2126c.hashCode()) * 31) + this.f2127d.hashCode();
    }
}
