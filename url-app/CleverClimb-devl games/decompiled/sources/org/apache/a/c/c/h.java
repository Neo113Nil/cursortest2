package org.apache.a.c.c;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/* compiled from: SchemeSocketFactory.java */
/* loaded from: classes2.dex */
public interface h {
    Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, org.apache.a.i.d dVar) throws IOException, UnknownHostException, org.apache.a.c.f;

    Socket createSocket(org.apache.a.i.d dVar) throws IOException;

    boolean isSecure(Socket socket) throws IllegalArgumentException;
}
