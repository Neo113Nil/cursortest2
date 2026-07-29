package com.unity3d.player;

import android.os.Build;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public final class a extends SSLSocketFactory {

    /* renamed from: c, reason: collision with root package name */
    private static volatile SSLSocketFactory f9346c;

    /* renamed from: d, reason: collision with root package name */
    private static final Object[] f9347d = new Object[0];
    private static final boolean e;

    /* renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f9348a;

    /* renamed from: b, reason: collision with root package name */
    private final C0405a f9349b;

    /* renamed from: com.unity3d.player.a$a, reason: collision with other inner class name */
    class C0405a implements HandshakeCompletedListener {
        C0405a() {
        }

        @Override // javax.net.ssl.HandshakeCompletedListener
        public final void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
            SSLSession session = handshakeCompletedEvent.getSession();
            session.getCipherSuite();
            session.getProtocol();
            try {
                session.getPeerPrincipal().getName();
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT < 20) {
            z = true;
        }
        e = z;
    }

    private a() {
        SSLContext sSLContext = SSLContext.getInstance(org.apache.a.c.d.d.TLS);
        sSLContext.init(null, null, null);
        this.f9348a = sSLContext.getSocketFactory();
        this.f9349b = new C0405a();
    }

    private static Socket a(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket) && e) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        }
        return socket;
    }

    public static SSLSocketFactory a() {
        synchronized (f9347d) {
            if (f9346c != null) {
                return f9346c;
            }
            try {
                a aVar = new a();
                f9346c = aVar;
                return aVar;
            } catch (Exception e2) {
                e.Log(5, "CustomSSLSocketFactory: Failed to create SSLSocketFactory (" + e2.getMessage() + ")");
                return null;
            }
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return a(this.f9348a.createSocket());
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return a(this.f9348a.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a(this.f9348a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return a(this.f9348a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a(this.f9348a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return a(this.f9348a.createSocket(socket, str, i, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f9348a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f9348a.getSupportedCipherSuites();
    }
}
