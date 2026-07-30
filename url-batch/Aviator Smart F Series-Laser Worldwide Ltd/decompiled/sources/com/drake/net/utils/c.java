package com.drake.net.utils;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class c {
    public static final c INSTANCE = new c();
    private static HostnameVerifier UnSafeHostnameVerifier = new HostnameVerifier() { // from class: com.drake.net.utils.b
        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            boolean m159UnSafeHostnameVerifier$lambda0;
            m159UnSafeHostnameVerifier$lambda0 = c.m159UnSafeHostnameVerifier$lambda0(str, sSLSession);
            return m159UnSafeHostnameVerifier$lambda0;
        }
    };
    private static X509TrustManager UnSafeTrustManager = new a();

    public static final class a implements X509TrustManager {
        a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] chain, String authType) {
            s.checkNotNullParameter(chain, "chain");
            s.checkNotNullParameter(authType, "authType");
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] chain, String authType) {
            s.checkNotNullParameter(chain, "chain");
            s.checkNotNullParameter(authType, "authType");
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnSafeHostnameVerifier$lambda-0, reason: not valid java name */
    public static final boolean m159UnSafeHostnameVerifier$lambda0(String str, SSLSession sSLSession) {
        return true;
    }

    public final HostnameVerifier getUnSafeHostnameVerifier() {
        return UnSafeHostnameVerifier;
    }

    public final X509TrustManager getUnSafeTrustManager() {
        return UnSafeTrustManager;
    }

    public final void setUnSafeHostnameVerifier(HostnameVerifier hostnameVerifier) {
        s.checkNotNullParameter(hostnameVerifier, "<set-?>");
        UnSafeHostnameVerifier = hostnameVerifier;
    }

    public final void setUnSafeTrustManager(X509TrustManager x509TrustManager) {
        s.checkNotNullParameter(x509TrustManager, "<set-?>");
        UnSafeTrustManager = x509TrustManager;
    }
}
