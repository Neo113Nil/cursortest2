package org.apache.a.f.c;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.s;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: DefaultClientConnection.java */
/* loaded from: classes2.dex */
public class e extends org.apache.a.f.f implements org.apache.a.c.o, org.apache.a.j.e {

    /* renamed from: d, reason: collision with root package name */
    private volatile Socket f9831d;
    private org.apache.a.m e;
    private boolean f;
    private volatile boolean g;

    /* renamed from: a, reason: collision with root package name */
    private final Log f9828a = LogFactory.getLog(getClass());

    /* renamed from: b, reason: collision with root package name */
    private final Log f9829b = LogFactory.getLog("org.apache.http.headers");

    /* renamed from: c, reason: collision with root package name */
    private final Log f9830c = LogFactory.getLog("org.apache.http.wire");
    private final Map<String, Object> h = new HashMap();

    @Override // org.apache.a.c.o
    public final boolean i() {
        return this.f;
    }

    @Override // org.apache.a.f.f, org.apache.a.c.o
    public final Socket j() {
        return this.f9831d;
    }

    @Override // org.apache.a.c.o
    public void a(Socket socket, org.apache.a.m mVar) throws IOException {
        q();
        this.f9831d = socket;
        this.e = mVar;
        if (this.g) {
            socket.close();
            throw new IOException("Connection already shutdown");
        }
    }

    @Override // org.apache.a.c.o
    public void a(boolean z, org.apache.a.i.d dVar) throws IOException {
        q();
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        this.f = z;
        a(this.f9831d, dVar);
    }

    @Override // org.apache.a.f.f, org.apache.a.i
    public void f() throws IOException {
        this.g = true;
        try {
            super.f();
            this.f9828a.debug("Connection shut down");
            Socket socket = this.f9831d;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            this.f9828a.debug("I/O error shutting down connection", e);
        }
    }

    @Override // org.apache.a.f.f, org.apache.a.i
    public void c() throws IOException {
        try {
            super.c();
            this.f9828a.debug("Connection closed");
        } catch (IOException e) {
            this.f9828a.debug("I/O error closing connection", e);
        }
    }

    @Override // org.apache.a.f.f
    protected org.apache.a.g.f a(Socket socket, int i, org.apache.a.i.d dVar) throws IOException {
        if (i == -1) {
            i = 8192;
        }
        org.apache.a.g.f a2 = super.a(socket, i, dVar);
        return this.f9830c.isDebugEnabled() ? new k(a2, new o(this.f9830c), org.apache.a.i.e.a(dVar)) : a2;
    }

    @Override // org.apache.a.f.f
    protected org.apache.a.g.g b(Socket socket, int i, org.apache.a.i.d dVar) throws IOException {
        if (i == -1) {
            i = 8192;
        }
        org.apache.a.g.g b2 = super.b(socket, i, dVar);
        return this.f9830c.isDebugEnabled() ? new l(b2, new o(this.f9830c), org.apache.a.i.e.a(dVar)) : b2;
    }

    @Override // org.apache.a.f.a
    protected org.apache.a.g.c a(org.apache.a.g.f fVar, s sVar, org.apache.a.i.d dVar) {
        return new h(fVar, null, sVar, dVar);
    }

    @Override // org.apache.a.c.o
    public void a(Socket socket, org.apache.a.m mVar, boolean z, org.apache.a.i.d dVar) throws IOException {
        k();
        if (mVar == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        if (socket != null) {
            this.f9831d = socket;
            a(socket, dVar);
        }
        this.e = mVar;
        this.f = z;
    }

    @Override // org.apache.a.f.a, org.apache.a.h
    public r a() throws org.apache.a.l, IOException {
        r a2 = super.a();
        if (this.f9828a.isDebugEnabled()) {
            this.f9828a.debug("Receiving response: " + a2.a());
        }
        if (this.f9829b.isDebugEnabled()) {
            this.f9829b.debug("<< " + a2.a().toString());
            for (org.apache.a.d dVar : a2.getAllHeaders()) {
                this.f9829b.debug("<< " + dVar.toString());
            }
        }
        return a2;
    }

    @Override // org.apache.a.f.a, org.apache.a.h
    public void a(p pVar) throws org.apache.a.l, IOException {
        if (this.f9828a.isDebugEnabled()) {
            this.f9828a.debug("Sending request: " + pVar.getRequestLine());
        }
        super.a(pVar);
        if (this.f9829b.isDebugEnabled()) {
            this.f9829b.debug(">> " + pVar.getRequestLine().toString());
            for (org.apache.a.d dVar : pVar.getAllHeaders()) {
                this.f9829b.debug(">> " + dVar.toString());
            }
        }
    }

    @Override // org.apache.a.j.e
    public Object a(String str) {
        return this.h.get(str);
    }

    @Override // org.apache.a.j.e
    public void a(String str, Object obj) {
        this.h.put(str, obj);
    }
}
