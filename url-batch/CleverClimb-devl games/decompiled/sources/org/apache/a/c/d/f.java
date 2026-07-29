package org.apache.a.c.d;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: TrustManagerDecorator.java */
/* loaded from: classes2.dex */
class f implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    private final X509TrustManager f9688a;

    /* renamed from: b, reason: collision with root package name */
    private final g f9689b;

    f(X509TrustManager x509TrustManager, g gVar) {
        this.f9688a = x509TrustManager;
        this.f9689b = gVar;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f9688a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (this.f9689b.a(x509CertificateArr, str)) {
            return;
        }
        this.f9688a.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.f9688a.getAcceptedIssuers();
    }
}
