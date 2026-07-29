package com.aiming.mdt.a;

import android.os.Build;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.a.c.d.d;

/* renamed from: com.aiming.mdt.a.ʻʽʾˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0073 extends SSLSocketFactory {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String[] f170;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String[] f171;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final X509TrustManager f172 = new C0100(this);

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private SSLSocketFactory f173;

    static {
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            if (sSLSocket != null) {
                LinkedList linkedList = new LinkedList();
                for (String str : sSLSocket.getSupportedProtocols()) {
                    if (!str.toUpperCase().contains(d.SSL)) {
                        linkedList.add(str);
                    }
                }
                f171 = (String[]) linkedList.toArray(new String[linkedList.size()]);
                if (Build.VERSION.SDK_INT < 21) {
                    List asList = Arrays.asList("TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECHDE_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
                    List asList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
                    HashSet hashSet = new HashSet(asList);
                    hashSet.retainAll(asList2);
                    hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
                    f170 = (String[]) hashSet.toArray(new String[hashSet.size()]);
                }
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
        }
    }

    public C0073() {
        try {
            SSLContext sSLContext = SSLContext.getInstance(d.TLS);
            sSLContext.init(null, new X509TrustManager[]{this.f172}, null);
            this.f173 = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static void m222(SSLSocket sSLSocket) {
        if (f171 != null) {
            sSLSocket.setEnabledProtocols(f171);
        }
        if (Build.VERSION.SDK_INT >= 21 || f170 == null) {
            return;
        }
        sSLSocket.setEnabledCipherSuites(f170);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f173.createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            m222((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f173.createSocket(str, i, inetAddress, i2);
        if (createSocket instanceof SSLSocket) {
            m222((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f173.createSocket(inetAddress, i);
        if (createSocket instanceof SSLSocket) {
            m222((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f173.createSocket(inetAddress, i, inetAddress2, i2);
        if (createSocket instanceof SSLSocket) {
            m222((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f173.createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            m222((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return f170;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return f170;
    }
}
