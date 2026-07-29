package org.apache.a.c.c;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* compiled from: PlainSocketFactory.java */
/* loaded from: classes2.dex */
public class e implements h, j {

    /* renamed from: a, reason: collision with root package name */
    private final a f9680a = null;

    public static e a() {
        return new e();
    }

    @Override // org.apache.a.c.c.h
    public Socket createSocket(org.apache.a.i.d dVar) {
        return new Socket();
    }

    @Override // org.apache.a.c.c.j
    public Socket createSocket() {
        return new Socket();
    }

    @Override // org.apache.a.c.c.h
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, org.apache.a.i.d dVar) throws IOException, org.apache.a.c.f {
        if (inetSocketAddress == null) {
            throw new IllegalArgumentException("Remote address may not be null");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        if (socket == null) {
            socket = createSocket();
        }
        if (inetSocketAddress2 != null) {
            socket.setReuseAddress(org.apache.a.i.c.b(dVar));
            socket.bind(inetSocketAddress2);
        }
        int f = org.apache.a.i.c.f(dVar);
        try {
            socket.setSoTimeout(org.apache.a.i.c.a(dVar));
            socket.connect(inetSocketAddress, f);
            return socket;
        } catch (SocketTimeoutException unused) {
            throw new org.apache.a.c.f("Connect to " + inetSocketAddress + " timed out");
        }
    }

    @Override // org.apache.a.c.c.h, org.apache.a.c.c.j
    public final boolean isSecure(Socket socket) throws IllegalArgumentException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        }
        if (socket.isClosed()) {
            throw new IllegalArgumentException("Socket is closed.");
        }
        return false;
    }

    @Override // org.apache.a.c.c.j
    @Deprecated
    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, org.apache.a.i.d dVar) throws IOException, UnknownHostException, org.apache.a.c.f {
        InetSocketAddress inetSocketAddress;
        InetAddress byName;
        if (inetAddress != null || i2 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i2);
        } else {
            inetSocketAddress = null;
        }
        if (this.f9680a != null) {
            byName = this.f9680a.a(str);
        } else {
            byName = InetAddress.getByName(str);
        }
        return connectSocket(socket, new InetSocketAddress(byName, i), inetSocketAddress, dVar);
    }
}
