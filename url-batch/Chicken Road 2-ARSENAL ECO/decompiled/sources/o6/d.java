package o6;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.i;
import n6.r;
import n6.s;
import n6.w;
import n6.y;
import u0.C0684n;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: f, reason: collision with root package name */
    public final InputStream f5629f;

    /* renamed from: g, reason: collision with root package name */
    public final e f5630g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0684n f5631h;

    public d(C0684n c0684n) {
        this.f5631h = c0684n;
        Socket socket = (Socket) c0684n.f5994g;
        this.f5629f = socket.getInputStream();
        this.f5630g = new e(socket);
    }

    @Override // n6.w
    public final y b() {
        return this.f5630g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i7;
        C0684n c0684n = this.f5631h;
        e eVar = this.f5630g;
        eVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) c0684n.f5995h;
            Socket socket = (Socket) c0684n.f5994g;
            i.e(atomicInteger, "<this>");
            while (true) {
                int i8 = atomicInteger.get();
                if ((i8 & 2) != 0) {
                    i7 = 0;
                    break;
                }
                int i9 = i8 | 2;
                if (atomicInteger.compareAndSet(i8, i9)) {
                    i7 = i9;
                    break;
                }
            }
            if (i7 != 0) {
                if (i7 == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f5629f.close();
                    }
                }
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

    @Override // n6.w
    public final long i(long j4, n6.f fVar) {
        e eVar = this.f5630g;
        eVar.f();
        r F6 = fVar.F(1);
        int min = (int) Math.min(8192L, 8192 - F6.f5552c);
        try {
            eVar.h();
            try {
                int read = this.f5629f.read(F6.f5550a, F6.f5552c, min);
                if (eVar.i()) {
                    throw eVar.j(null);
                }
                if (read != -1) {
                    F6.f5552c += read;
                    long j7 = read;
                    fVar.f5524g += j7;
                    return j7;
                }
                if (F6.f5551b != F6.f5552c) {
                    return -1L;
                }
                fVar.f5523f = F6.a();
                s.a(F6);
                return -1L;
            } catch (IOException e4) {
                if (eVar.i()) {
                    throw eVar.j(e4);
                }
                throw e4;
            } finally {
                eVar.i();
            }
        } catch (AssertionError e7) {
            if (f.a(e7)) {
                throw new IOException(e7);
            }
            throw e7;
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.f5631h.f5994g) + ')';
    }
}
