package org.apache.a.c.c;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/* compiled from: LayeredSchemeSocketFactory.java */
/* loaded from: classes2.dex */
public interface b extends h {
    Socket createLayeredSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException;
}
