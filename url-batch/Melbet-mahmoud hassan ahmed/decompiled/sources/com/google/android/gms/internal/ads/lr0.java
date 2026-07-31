package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class lr0 extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    final SSLSocketFactory f8056a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ nr0 f8057b;

    lr0(nr0 nr0Var) {
        this.f8057b = nr0Var;
    }

    private final Socket a(Socket socket) {
        int i7;
        int i8;
        i7 = this.f8057b.f9244o;
        if (i7 > 0) {
            i8 = this.f8057b.f9244o;
            socket.setReceiveBufferSize(i8);
        }
        this.f8057b.f9245p.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i7) {
        Socket createSocket = this.f8056a.createSocket(str, i7);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i7, InetAddress inetAddress, int i8) {
        Socket createSocket = this.f8056a.createSocket(str, i7, inetAddress, i8);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7) {
        Socket createSocket = this.f8056a.createSocket(inetAddress, i7);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7, InetAddress inetAddress2, int i8) {
        Socket createSocket = this.f8056a.createSocket(inetAddress, i7, inetAddress2, i8);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i7, boolean z6) {
        Socket createSocket = this.f8056a.createSocket(socket, str, i7, z6);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f8056a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f8056a.getSupportedCipherSuites();
    }
}
