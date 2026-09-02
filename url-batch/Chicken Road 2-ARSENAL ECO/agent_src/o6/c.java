package o6;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.i;
import n6.r;
import n6.s;
import n6.u;
import n6.y;
import u0.C0684n;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: f, reason: collision with root package name */
    public final OutputStream f5626f;

    /* renamed from: g, reason: collision with root package name */
    public final e f5627g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0684n f5628h;

    public c(C0684n c0684n) {
        this.f5628h = c0684n;
        Socket socket = (Socket) c0684n.f5994g;
        this.f5626f = socket.getOutputStream();
        this.f5627g = new e(socket);
    }

    @Override // n6.u
    public final y b() {
        return this.f5627g;
    }

    @Override // n6.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i7;
        OutputStream outputStream = this.f5626f;
        C0684n c0684n = this.f5628h;
        e eVar = this.f5627g;
        eVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) c0684n.f5995h;
            Socket socket = (Socket) c0684n.f5994g;
            i.e(atomicInteger, "<this>");
            while (true) {
                int i8 = atomicInteger.get();
                if ((i8 & 1) != 0) {
                    i7 = 0;
                    break;
                }
                int i9 = i8 | 1;
                if (atomicInteger.compareAndSet(i8, i9)) {
                    i7 = i9;
                    break;
                }
            }
            if (i7 != 0) {
                if (i7 != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                if (eVar.i()) {
                    throw eVar.j(null);
                }
            }
        } catch (IOException e4) {
            if (!eVar.i()) {
                throw e4;
            }
            throw eVar.j(e4);
        } finally {
            eVar.i();
        }
    }

    @Override // n6.u, java.io.Flushable
    public final void flush() {
        e eVar = this.f5627g;
        eVar.h();
        try {
            this.f5626f.flush();
            if (eVar.i()) {
                throw eVar.j(null);
            }
        } catch (IOException e4) {
            if (!eVar.i()) {
                throw e4;
            }
            throw eVar.j(e4);
        } finally {
            eVar.i();
        }
    }

    @Override // n6.u
    public final void l(long j4, n6.f fVar) {
        n6.b.d(fVar.f5524g, 0L, j4);
        while (j4 > 0) {
            e eVar = this.f5627g;
            eVar.f();
            r rVar = fVar.f5523f;
            i.b(rVar);
            int min = (int) Math.min(j4, rVar.f5552c - rVar.f5551b);
            eVar.h();
            try {
                try {
                    this.f5626f.write(rVar.f5550a, rVar.f5551b, min);
                    if (eVar.i()) {
                        throw eVar.j(null);
                    }
                    int i7 = rVar.f5551b + min;
                    rVar.f5551b = i7;
                    long j7 = min;
                    j4 -= j7;
                    fVar.f5524g -= j7;
                    if (i7 == rVar.f5552c) {
                        fVar.f5523f = rVar.a();
                        s.a(rVar);
                    }
                } catch (IOException e4) {
                    if (!eVar.i()) {
                        throw e4;
                    }
                    throw eVar.j(e4);
                }
            } catch (Throwable th) {
                eVar.i();
                throw th;
            }
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f5628h.f5994g) + ')';
    }
}
