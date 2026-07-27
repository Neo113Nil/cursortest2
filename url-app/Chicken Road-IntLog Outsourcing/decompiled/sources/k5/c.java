package k5;

import B0.i;
import j5.r;
import j5.s;
import j5.u;
import j5.y;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f10726a;

    /* renamed from: b, reason: collision with root package name */
    public final e f10727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f10728c;

    public c(i iVar) {
        this.f10728c = iVar;
        this.f10726a = ((Socket) iVar.f153b).getOutputStream();
        this.f10727b = new e((Socket) iVar.f153b);
    }

    @Override // j5.u
    public final void B(j5.f fVar, long j2) {
        j5.b.d(fVar.f10495b, 0L, j2);
        while (j2 > 0) {
            e eVar = this.f10727b;
            eVar.f();
            r rVar = fVar.f10494a;
            kotlin.jvm.internal.i.b(rVar);
            int min = (int) Math.min(j2, rVar.f10523c - rVar.f10522b);
            eVar.h();
            try {
                this.f10726a.write(rVar.f10521a, rVar.f10522b, min);
                if (eVar.i()) {
                    throw eVar.j(null);
                }
                int i2 = rVar.f10522b + min;
                rVar.f10522b = i2;
                long j6 = min;
                j2 -= j6;
                fVar.f10495b -= j6;
                if (i2 == rVar.f10523c) {
                    fVar.f10494a = rVar.a();
                    s.a(rVar);
                }
            } catch (IOException e3) {
                if (!eVar.i()) {
                    throw e3;
                }
                throw eVar.j(e3);
            } finally {
                eVar.i();
            }
        }
    }

    @Override // j5.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i2;
        OutputStream outputStream = this.f10726a;
        i iVar = this.f10728c;
        e eVar = this.f10727b;
        eVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) iVar.f154c;
            kotlin.jvm.internal.i.e(atomicInteger, "<this>");
            while (true) {
                int i3 = atomicInteger.get();
                if ((i3 & 1) != 0) {
                    i2 = 0;
                    break;
                }
                int i6 = i3 | 1;
                if (atomicInteger.compareAndSet(i3, i6)) {
                    i2 = i6;
                    break;
                }
            }
            if (i2 != 0) {
                Socket socket = (Socket) iVar.f153b;
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
                if (eVar.i()) {
                    throw eVar.j(null);
                }
            }
        } catch (IOException e3) {
            if (!eVar.i()) {
                throw e3;
            }
            throw eVar.j(e3);
        } finally {
            eVar.i();
        }
    }

    @Override // j5.u
    public final y d() {
        return this.f10727b;
    }

    @Override // j5.u, java.io.Flushable
    public final void flush() {
        e eVar = this.f10727b;
        eVar.h();
        try {
            this.f10726a.flush();
            if (eVar.i()) {
                throw eVar.j(null);
            }
        } catch (IOException e3) {
            if (!eVar.i()) {
                throw e3;
            }
            throw eVar.j(e3);
        } finally {
            eVar.i();
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f10728c.f153b) + ')';
    }
}
