package org.apache.a.f.c;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: DefaultClientConnectionOperator.java */
/* loaded from: classes2.dex */
public class f implements org.apache.a.c.d {

    /* renamed from: a, reason: collision with root package name */
    protected final org.apache.a.c.c.g f9832a;

    /* renamed from: b, reason: collision with root package name */
    private final Log f9833b = LogFactory.getLog(getClass());

    public f(org.apache.a.c.c.g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Scheme registry amy not be null");
        }
        this.f9832a = gVar;
    }

    @Override // org.apache.a.c.d
    public org.apache.a.c.o a() {
        return new e();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6 A[SYNTHETIC] */
    @Override // org.apache.a.c.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(org.apache.a.c.o oVar, org.apache.a.m mVar, InetAddress inetAddress, org.apache.a.j.e eVar, org.apache.a.i.d dVar) throws IOException {
        org.apache.a.j.e eVar2;
        if (oVar == null) {
            throw new IllegalArgumentException("Connection may not be null");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("Target host may not be null");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters may not be null");
        }
        if (oVar.d()) {
            throw new IllegalStateException("Connection must not be open");
        }
        org.apache.a.c.c.f a2 = this.f9832a.a(mVar.c());
        org.apache.a.c.c.h b2 = a2.b();
        InetAddress[] a3 = a(mVar.a());
        int a4 = a2.a(mVar.b());
        int i = 0;
        int i2 = 0;
        while (i2 < a3.length) {
            InetAddress inetAddress2 = a3[i2];
            boolean z = i2 == a3.length - 1;
            Socket createSocket = b2.createSocket(dVar);
            oVar.a(createSocket, mVar);
            i iVar = new i(mVar, inetAddress2, a4);
            InetSocketAddress inetSocketAddress = inetAddress != null ? new InetSocketAddress(inetAddress, i) : null;
            if (this.f9833b.isDebugEnabled()) {
                this.f9833b.debug("Connecting to " + iVar);
            }
            try {
                Socket connectSocket = b2.connectSocket(createSocket, iVar, inetSocketAddress, dVar);
                if (createSocket != connectSocket) {
                    oVar.a(connectSocket, mVar);
                    eVar2 = eVar;
                    createSocket = connectSocket;
                } else {
                    eVar2 = eVar;
                }
                try {
                    a(createSocket, eVar2, dVar);
                    oVar.a(b2.isSecure(createSocket), dVar);
                    return;
                } catch (ConnectException e) {
                    e = e;
                    if (z) {
                        throw new org.apache.a.c.l(mVar, e);
                    }
                    if (!this.f9833b.isDebugEnabled()) {
                        this.f9833b.debug("Connect to " + iVar + " timed out. Connection will be retried using another IP address");
                    }
                    i2++;
                    i = 0;
                } catch (org.apache.a.c.f e2) {
                    e = e2;
                    if (z) {
                        throw e;
                    }
                    if (!this.f9833b.isDebugEnabled()) {
                    }
                    i2++;
                    i = 0;
                }
            } catch (ConnectException e3) {
                e = e3;
            } catch (org.apache.a.c.f e4) {
                e = e4;
            }
        }
    }

    @Override // org.apache.a.c.d
    public void a(org.apache.a.c.o oVar, org.apache.a.m mVar, org.apache.a.j.e eVar, org.apache.a.i.d dVar) throws IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("Connection may not be null");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("Target host may not be null");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters may not be null");
        }
        if (!oVar.d()) {
            throw new IllegalStateException("Connection must be open");
        }
        org.apache.a.c.c.f a2 = this.f9832a.a(mVar.c());
        if (!(a2.b() instanceof org.apache.a.c.c.b)) {
            throw new IllegalArgumentException("Target scheme (" + a2.c() + ") must have layered socket factory.");
        }
        org.apache.a.c.c.b bVar = (org.apache.a.c.c.b) a2.b();
        try {
            Socket createLayeredSocket = bVar.createLayeredSocket(oVar.j(), mVar.a(), mVar.b(), true);
            a(createLayeredSocket, eVar, dVar);
            oVar.a(createLayeredSocket, mVar, bVar.isSecure(createLayeredSocket), dVar);
        } catch (ConnectException e) {
            throw new org.apache.a.c.l(mVar, e);
        }
    }

    protected void a(Socket socket, org.apache.a.j.e eVar, org.apache.a.i.d dVar) throws IOException {
        socket.setTcpNoDelay(org.apache.a.i.c.c(dVar));
        socket.setSoTimeout(org.apache.a.i.c.a(dVar));
        int e = org.apache.a.i.c.e(dVar);
        if (e >= 0) {
            socket.setSoLinger(e > 0, e);
        }
    }

    protected InetAddress[] a(String str) throws UnknownHostException {
        return InetAddress.getAllByName(str);
    }
}
