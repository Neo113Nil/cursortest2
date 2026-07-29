package org.apache.a.c.c;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/* compiled from: SchemeSocketFactoryAdaptor.java */
@Deprecated
/* loaded from: classes2.dex */
class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final j f9686a;

    i(j jVar) {
        this.f9686a = jVar;
    }

    @Override // org.apache.a.c.c.h
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, org.apache.a.i.d dVar) throws IOException, UnknownHostException, org.apache.a.c.f {
        InetAddress inetAddress;
        int i;
        String hostName = inetSocketAddress.getHostName();
        int port = inetSocketAddress.getPort();
        if (inetSocketAddress2 != null) {
            inetAddress = inetSocketAddress2.getAddress();
            i = inetSocketAddress2.getPort();
        } else {
            inetAddress = null;
            i = 0;
        }
        return this.f9686a.connectSocket(socket, hostName, port, inetAddress, i, dVar);
    }

    @Override // org.apache.a.c.c.h
    public Socket createSocket(org.apache.a.i.d dVar) throws IOException {
        return this.f9686a.createSocket();
    }

    @Override // org.apache.a.c.c.h, org.apache.a.c.c.j
    public boolean isSecure(Socket socket) throws IllegalArgumentException {
        return this.f9686a.isSecure(socket);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f9686a.equals(((i) obj).f9686a);
        }
        return this.f9686a.equals(obj);
    }

    public int hashCode() {
        return this.f9686a.hashCode();
    }
}
