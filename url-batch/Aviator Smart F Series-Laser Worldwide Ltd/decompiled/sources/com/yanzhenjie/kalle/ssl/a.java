package com.yanzhenjie.kalle.ssl;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public class a {
    public static final HostnameVerifier HOSTNAME_VERIFIER = new C0349a();
    public static final SSLSocketFactory SSL_SOCKET_FACTORY = new b();

    /* renamed from: com.yanzhenjie.kalle.ssl.a$a, reason: collision with other inner class name */
    static class C0349a implements HostnameVerifier {
        C0349a() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }
}
