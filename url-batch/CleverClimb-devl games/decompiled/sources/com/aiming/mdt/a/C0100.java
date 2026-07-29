package com.aiming.mdt.a;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.aiming.mdt.a.ʻʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0100 implements X509TrustManager {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ C0073 f300;

    C0100(C0073 c0073) {
        this.f300 = c0073;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
