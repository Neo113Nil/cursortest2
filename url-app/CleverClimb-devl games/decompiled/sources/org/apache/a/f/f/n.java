package org.apache.a.f.f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;

/* compiled from: SocketInputBuffer.java */
/* loaded from: classes2.dex */
public class n extends c implements org.apache.a.g.b {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f9931a = h();

    /* renamed from: b, reason: collision with root package name */
    private final Socket f9932b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9933c;

    private static Class h() {
        try {
            return Class.forName("java.net.SocketTimeoutException");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static boolean a(InterruptedIOException interruptedIOException) {
        if (f9931a != null) {
            return f9931a.isInstance(interruptedIOException);
        }
        return true;
    }

    public n(Socket socket, int i, org.apache.a.i.d dVar) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        }
        this.f9932b = socket;
        this.f9933c = false;
        i = i < 0 ? socket.getReceiveBufferSize() : i;
        a(socket.getInputStream(), i < 1024 ? 1024 : i, dVar);
    }

    @Override // org.apache.a.f.f.c
    protected int f() throws IOException {
        int f = super.f();
        this.f9933c = f == -1;
        return f;
    }

    @Override // org.apache.a.g.f
    public boolean a(int i) throws IOException {
        boolean g = g();
        if (!g) {
            int soTimeout = this.f9932b.getSoTimeout();
            try {
                this.f9932b.setSoTimeout(i);
                f();
                return g();
            } catch (InterruptedIOException e) {
                if (!a(e)) {
                    throw e;
                }
            } finally {
                this.f9932b.setSoTimeout(soTimeout);
            }
        }
        return g;
    }

    @Override // org.apache.a.g.b
    public boolean c() {
        return this.f9933c;
    }
}
