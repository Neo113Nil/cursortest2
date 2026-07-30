package U6;

import P0.n;
import T6.r;
import T6.s;
import T6.u;
import T6.y;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: d, reason: collision with root package name */
    public final OutputStream f2739d;

    /* renamed from: e, reason: collision with root package name */
    public final e f2740e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f2741i;

    public c(n nVar) {
        this.f2741i = nVar;
        Socket socket = (Socket) nVar.f2214e;
        this.f2739d = socket.getOutputStream();
        this.f2740e = new e(socket);
    }

    @Override // T6.u
    public final y b() {
        return this.f2740e;
    }

    @Override // T6.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i2;
        OutputStream outputStream = this.f2739d;
        n nVar = this.f2741i;
        e eVar = this.f2740e;
        eVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) nVar.f2215i;
            Socket socket = (Socket) nVar.f2214e;
            Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
            while (true) {
                int i5 = atomicInteger.get();
                if ((i5 & 1) != 0) {
                    i2 = 0;
                    break;
                }
                int i7 = i5 | 1;
                if (atomicInteger.compareAndSet(i5, i7)) {
                    i2 = i7;
                    break;
                }
            }
            if (i2 != 0) {
                if (i2 != 3) {
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

    @Override // T6.u, java.io.Flushable
    public final void flush() {
        e eVar = this.f2740e;
        eVar.h();
        try {
            this.f2739d.flush();
            Unit unit = Unit.f6114a;
            if (eVar.i()) {
                throw eVar.j(null);
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

    public final String toString() {
        return "sink(" + ((Socket) this.f2741i.f2214e) + ')';
    }

    @Override // T6.u
    public final void x(long j, T6.f source) {
        Intrinsics.checkNotNullParameter(source, "source");
        T6.b.d(source.f2617e, 0L, j);
        while (j > 0) {
            e eVar = this.f2740e;
            eVar.f();
            r rVar = source.f2616d;
            Intrinsics.b(rVar);
            int min = (int) Math.min(j, rVar.f2645c - rVar.f2644b);
            eVar.h();
            try {
                try {
                    this.f2739d.write(rVar.f2643a, rVar.f2644b, min);
                    Unit unit = Unit.f6114a;
                    if (eVar.i()) {
                        throw eVar.j(null);
                    }
                    int i2 = rVar.f2644b + min;
                    rVar.f2644b = i2;
                    long j7 = min;
                    j -= j7;
                    source.f2617e -= j7;
                    if (i2 == rVar.f2645c) {
                        source.f2616d = rVar.a();
                        s.a(rVar);
                    }
                } catch (IOException e7) {
                    if (!eVar.i()) {
                        throw e7;
                    }
                    throw eVar.j(e7);
                }
            } catch (Throwable th) {
                eVar.i();
                throw th;
            }
        }
    }
}
