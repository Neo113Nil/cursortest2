package org.apache.a.c.c;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/* compiled from: SocketFactory.java */
@Deprecated
/* loaded from: classes2.dex */
public interface j {
    Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, org.apache.a.i.d dVar) throws IOException, UnknownHostException, org.apache.a.c.f;

    Socket createSocket() throws IOException;

    boolean isSecure(Socket socket) throws IllegalArgumentException;
}
