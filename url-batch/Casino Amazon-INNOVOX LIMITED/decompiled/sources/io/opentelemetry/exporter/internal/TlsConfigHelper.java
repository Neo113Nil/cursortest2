package io.opentelemetry.exporter.internal;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public class TlsConfigHelper {

    @Nullable
    private X509KeyManager keyManager;

    @Nullable
    private SSLContext sslContext;

    @Nullable
    private X509TrustManager trustManager;

    public void setTrustManagerFromCerts(byte[] bArr) {
        if (this.trustManager != null) {
            throw new IllegalStateException("trustManager has been previously configured");
        }
        try {
            this.trustManager = TlsUtil.trustManager(bArr);
        } catch (SSLException e) {
            throw new IllegalStateException("Error creating X509TrustManager with provided certs. Are they valid X.509 in PEM format?", e);
        }
    }

    public void setKeyManagerFromCerts(byte[] bArr, byte[] bArr2) {
        if (this.keyManager != null) {
            throw new IllegalStateException("keyManager has been previously configured");
        }
        try {
            this.keyManager = TlsUtil.keyManager(bArr, bArr2);
        } catch (SSLException e) {
            throw new IllegalStateException("Error creating X509KeyManager with provided certs. Are they valid X.509 in PEM format?", e);
        }
    }

    public void setSslContext(SSLContext sSLContext, X509TrustManager x509TrustManager) {
        if (this.sslContext != null || this.trustManager != null) {
            throw new IllegalStateException("sslContext or trustManager has been previously configured");
        }
        this.trustManager = x509TrustManager;
        this.sslContext = sSLContext;
    }

    @Nullable
    public X509KeyManager getKeyManager() {
        return this.keyManager;
    }

    @Nullable
    public X509TrustManager getTrustManager() {
        return this.trustManager;
    }

    @Nullable
    public SSLContext getSslContext() {
        SSLContext sSLContext = this.sslContext;
        if (sSLContext != null) {
            return sSLContext;
        }
        try {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            X509KeyManager x509KeyManager = this.keyManager;
            KeyManager[] keyManagerArr = x509KeyManager == null ? null : new KeyManager[]{x509KeyManager};
            X509TrustManager x509TrustManager = this.trustManager;
            sSLContext2.init(keyManagerArr, x509TrustManager == null ? null : new TrustManager[]{x509TrustManager}, null);
            return sSLContext2;
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public TlsConfigHelper copy() {
        TlsConfigHelper tlsConfigHelper = new TlsConfigHelper();
        tlsConfigHelper.keyManager = this.keyManager;
        tlsConfigHelper.trustManager = this.trustManager;
        tlsConfigHelper.sslContext = this.sslContext;
        return tlsConfigHelper;
    }
}
