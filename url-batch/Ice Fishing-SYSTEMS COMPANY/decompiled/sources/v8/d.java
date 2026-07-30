package v8;

import S0.i;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.h;
import u8.s;
import u8.t;
import u8.x;
import u8.z;

/* loaded from: classes2.dex */
public final class d implements x {

    /* renamed from: n, reason: collision with root package name */
    public final InputStream f41381n;

    /* renamed from: u, reason: collision with root package name */
    public final e f41382u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f41383v;

    public d(i iVar) {
        this.f41383v = iVar;
        this.f41381n = ((Socket) iVar.f2901u).getInputStream();
        this.f41382u = new e((Socket) iVar.f2901u);
    }

    @Override // u8.x
    public final z L() {
        return this.f41382u;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        i iVar = this.f41383v;
        e eVar = this.f41382u;
        eVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) iVar.f2902v;
            h.e(atomicInteger, "<this>");
            while (true) {
                int i4 = atomicInteger.get();
                if ((i4 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i9 = i4 | 2;
                if (atomicInteger.compareAndSet(i4, i9)) {
                    i = i9;
                    break;
                }
            }
            if (i != 0) {
                Socket socket = (Socket) iVar.f2901u;
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f41381n.close();
                    }
                }
                if (eVar.i()) {
                    throw eVar.j(null);
                }
            }
        } catch (IOException e6) {
            if (!eVar.i()) {
                throw e6;
            }
            throw eVar.j(e6);
        } finally {
            eVar.i();
        }
    }

    @Override // u8.x
    public final long f(long j9, u8.e sink) {
        h.e(sink, "sink");
        e eVar = this.f41382u;
        eVar.f();
        s J = sink.J(1);
        int min = (int) Math.min(8192L, 8192 - J.f41313c);
        try {
            eVar.h();
            try {
                int read = this.f41381n.read(J.f41311a, J.f41313c, min);
                if (eVar.i()) {
                    throw eVar.j(null);
                }
                if (read != -1) {
                    J.f41313c += read;
                    long j10 = read;
                    sink.f41277u += j10;
                    return j10;
                }
                if (J.f41312b != J.f41313c) {
                    return -1L;
                }
                sink.f41276n = J.a();
                t.a(J);
                return -1L;
            } catch (IOException e6) {
                if (eVar.i()) {
                    throw eVar.j(e6);
                }
                throw e6;
            } finally {
                eVar.i();
            }
        } catch (AssertionError e9) {
            if (f.a(e9)) {
                throw new IOException(e9);
            }
            throw e9;
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.f41383v.f2901u) + ')';
    }
}
