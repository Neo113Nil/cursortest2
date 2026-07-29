package org.apache.a.f;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.a.f.f.o;
import org.apache.a.g.g;
import org.apache.a.n;

/* compiled from: SocketHttpClientConnection.java */
/* loaded from: classes2.dex */
public class f extends a implements n {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f9891a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Socket f9892b = null;

    protected void q() {
        if (this.f9891a) {
            throw new IllegalStateException("Connection is already open");
        }
    }

    @Override // org.apache.a.f.a
    protected void k() {
        if (!this.f9891a) {
            throw new IllegalStateException("Connection is not open");
        }
    }

    protected org.apache.a.g.f a(Socket socket, int i, org.apache.a.i.d dVar) throws IOException {
        return new org.apache.a.f.f.n(socket, i, dVar);
    }

    protected g b(Socket socket, int i, org.apache.a.i.d dVar) throws IOException {
        return new o(socket, i, dVar);
    }

    protected void a(Socket socket, org.apache.a.i.d dVar) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.f9892b = socket;
        int d2 = org.apache.a.i.c.d(dVar);
        a(a(socket, d2, dVar), b(socket, d2, dVar), dVar);
        this.f9891a = true;
    }

    @Override // org.apache.a.i
    public boolean d() {
        return this.f9891a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Socket j() {
        return this.f9892b;
    }

    @Override // org.apache.a.n
    public InetAddress g() {
        if (this.f9892b != null) {
            return this.f9892b.getInetAddress();
        }
        return null;
    }

    @Override // org.apache.a.n
    public int h() {
        if (this.f9892b != null) {
            return this.f9892b.getPort();
        }
        return -1;
    }

    @Override // org.apache.a.i
    public void b(int i) {
        k();
        if (this.f9892b != null) {
            try {
                this.f9892b.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    @Override // org.apache.a.i
    public void f() throws IOException {
        this.f9891a = false;
        Socket socket = this.f9892b;
        if (socket != null) {
            socket.close();
        }
    }

    @Override // org.apache.a.i
    public void c() throws IOException {
        if (this.f9891a) {
            this.f9891a = false;
            Socket socket = this.f9892b;
            try {
                o();
                try {
                    try {
                        socket.shutdownOutput();
                    } catch (IOException unused) {
                    }
                    socket.shutdownInput();
                } catch (IOException | UnsupportedOperationException unused2) {
                }
            } finally {
                socket.close();
            }
        }
    }
}
