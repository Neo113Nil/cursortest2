package U6;

import P0.n;
import T6.r;
import T6.s;
import T6.w;
import T6.y;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: d, reason: collision with root package name */
    public final InputStream f2742d;

    /* renamed from: e, reason: collision with root package name */
    public final e f2743e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f2744i;

    public d(n nVar) {
        this.f2744i = nVar;
        Socket socket = (Socket) nVar.f2214e;
        this.f2742d = socket.getInputStream();
        this.f2743e = new e(socket);
    }

    @Override // T6.w
    public final y b() {
        return this.f2743e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i2;
        n nVar = this.f2744i;
        e eVar = this.f2743e;
        eVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) nVar.f2215i;
            Socket socket = (Socket) nVar.f2214e;
            Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
            while (true) {
                int i5 = atomicInteger.get();
                if ((i5 & 2) != 0) {
                    i2 = 0;
                    break;
                }
                int i7 = i5 | 2;
                if (atomicInteger.compareAndSet(i5, i7)) {
                    i2 = i7;
                    break;
                }
            }
            if (i2 != 0) {
                if (i2 == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f2742d.close();
                    }
                }
                Unit unit = Unit.f6114a;
                if (eVar.i()) {
                    throw eVar.j(null);
                }
            }
        } catch (IOException e7) {
            if (!eVar.i()) {
                throw e7;
            }
            throw eVar.j(e7);
        } finally {
            eVar.i();
        }
    }

    @Override // T6.w
    public final long o(long j, T6.f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        e eVar = this.f2743e;
        eVar.f();
        r E7 = sink.E(1);
        int min = (int) Math.min(8192L, 8192 - E7.f2645c);
        try {
            eVar.h();
            try {
                int read = this.f2742d.read(E7.f2643a, E7.f2645c, min);
                if (eVar.i()) {
                    throw eVar.j(null);
                }
                if (read != -1) {
                    E7.f2645c += read;
                    long j7 = read;
                    sink.f2617e += j7;
                    return j7;
                }
                if (E7.f2644b != E7.f2645c) {
                    return -1L;
                }
                sink.f2616d = E7.a();
                s.a(E7);
                return -1L;
            } catch (IOException e7) {
                if (eVar.i()) {
                    throw eVar.j(e7);
                }
                throw e7;
            } finally {
                eVar.i();
            }
        } catch (AssertionError e8) {
            if (f.a(e8)) {
                throw new IOException(e8);
            }
            throw e8;
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.f2744i.f2214e) + ')';
    }
}
