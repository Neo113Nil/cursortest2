package k5;

import B0.i;
import j5.r;
import j5.s;
import j5.w;
import j5.y;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f10729a;

    /* renamed from: b, reason: collision with root package name */
    public final e f10730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f10731c;

    public d(i iVar) {
        this.f10731c = iVar;
        this.f10729a = ((Socket) iVar.f153b).getInputStream();
        this.f10730b = new e((Socket) iVar.f153b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i2;
        i iVar = this.f10731c;
        e eVar = this.f10730b;
        eVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) iVar.f154c;
            kotlin.jvm.internal.i.e(atomicInteger, "<this>");
            while (true) {
                int i3 = atomicInteger.get();
                if ((i3 & 2) != 0) {
                    i2 = 0;
                    break;
                }
                int i6 = i3 | 2;
                if (atomicInteger.compareAndSet(i3, i6)) {
                    i2 = i6;
                    break;
                }
            }
            if (i2 != 0) {
                Socket socket = (Socket) iVar.f153b;
                if (i2 == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f10729a.close();
                    }
                }
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

    @Override // j5.w
    public final y d() {
        return this.f10730b;
    }

    @Override // j5.w
    public final long s(j5.f sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        e eVar = this.f10730b;
        eVar.f();
        r F2 = sink.F(1);
        int min = (int) Math.min(8192L, 8192 - F2.f10523c);
        try {
            eVar.h();
            try {
                int read = this.f10729a.read(F2.f10521a, F2.f10523c, min);
                if (eVar.i()) {
                    throw eVar.j(null);
                }
                if (read != -1) {
                    F2.f10523c += read;
                    long j6 = read;
                    sink.f10495b += j6;
                    return j6;
                }
                if (F2.f10522b != F2.f10523c) {
                    return -1L;
                }
                sink.f10494a = F2.a();
                s.a(F2);
                return -1L;
            } catch (IOException e3) {
                if (eVar.i()) {
                    throw eVar.j(e3);
                }
                throw e3;
            } finally {
                eVar.i();
            }
        } catch (AssertionError e6) {
            if (f.a(e6)) {
                throw new IOException(e6);
            }
            throw e6;
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.f10731c.f153b) + ')';
    }
}
