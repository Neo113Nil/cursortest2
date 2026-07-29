package com.aiming.mdt.a;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.aiming.mdt.a.ʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0191 implements X509TrustManager {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private final List<String> f666 = Arrays.asList("S7g1rSNao6g2EUBbylVSMu8TqeOAgZPlUeWoCEQE6G8=", "qo1QyzYCUCM6TTpkflyWle2ERuNQ8q7/99oCt1RmDgk=", "qiYwp7YXsE0KKUureoyqpQFubb5gSDeoOoVxn6tmfrU=");

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (x509CertificateArr.length == 0) {
            throw new IllegalArgumentException("null or zero-length certificate chain");
        }
        int length = x509CertificateArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (this.f666.contains(new C0158(x509CertificateArr[i]).toString())) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder("Certificate is not in trusted list (");
        sb.append(this.f666.toString());
        sb.append(")");
        throw new CertificateException(sb.toString());
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyTrustManager [trustKeys=");
        sb.append(this.f666.toString());
        sb.append("]");
        return sb.toString();
    }
}
