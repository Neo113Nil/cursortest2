package org.apache.a.c.c;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/* compiled from: LayeredSchemeSocketFactoryAdaptor.java */
@Deprecated
/* loaded from: classes2.dex */
class c extends i implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f9679a;

    c(d dVar) {
        super(dVar);
        this.f9679a = dVar;
    }

    @Override // org.apache.a.c.c.b
    public Socket createLayeredSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        return this.f9679a.createSocket(socket, str, i, z);
    }
}
