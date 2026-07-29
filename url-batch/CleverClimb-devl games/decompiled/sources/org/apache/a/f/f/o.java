package org.apache.a.f.f;

import java.io.IOException;
import java.net.Socket;

/* compiled from: SocketOutputBuffer.java */
/* loaded from: classes2.dex */
public class o extends d {
    public o(Socket socket, int i, org.apache.a.i.d dVar) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        }
        i = i < 0 ? socket.getSendBufferSize() : i;
        a(socket.getOutputStream(), i < 1024 ? 1024 : i, dVar);
    }
}
