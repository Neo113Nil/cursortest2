package org.apache.a.c.d;

import java.io.IOException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;

/* compiled from: X509HostnameVerifier.java */
/* loaded from: classes2.dex */
public interface h extends HostnameVerifier {
    void a(String str, SSLSocket sSLSocket) throws IOException;

    void a(String str, String[] strArr, String[] strArr2) throws SSLException;
}
