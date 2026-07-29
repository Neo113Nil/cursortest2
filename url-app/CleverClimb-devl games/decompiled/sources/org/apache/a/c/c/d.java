package org.apache.a.c.c;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/* compiled from: LayeredSocketFactory.java */
@Deprecated
/* loaded from: classes2.dex */
public interface d extends j {
    Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException;
}
