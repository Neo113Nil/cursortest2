package org.apache.a.c;

import java.io.IOException;
import java.net.Socket;

/* compiled from: OperatedClientConnection.java */
/* loaded from: classes2.dex */
public interface o extends org.apache.a.h, org.apache.a.n {
    void a(Socket socket, org.apache.a.m mVar) throws IOException;

    void a(Socket socket, org.apache.a.m mVar, boolean z, org.apache.a.i.d dVar) throws IOException;

    void a(boolean z, org.apache.a.i.d dVar) throws IOException;

    boolean i();

    Socket j();
}
