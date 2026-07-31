package okio;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class t implements z {

    /* renamed from: b, reason: collision with root package name */
    private final OutputStream f43294b;

    /* renamed from: c, reason: collision with root package name */
    private final C f43295c;

    public t(OutputStream out, C timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f43294b = out;
        this.f43295c = timeout;
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43294b.close();
    }

    @Override // okio.z, java.io.Flushable
    public void flush() {
        this.f43294b.flush();
    }

    @Override // okio.z
    public C timeout() {
        return this.f43295c;
    }

    public String toString() {
        return "sink(" + this.f43294b + ')';
    }

    @Override // okio.z
    public void write(C3372e source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC3369b.b(source.l0(), 0L, j4);
        while (j4 > 0) {
            this.f43295c.throwIfReached();
            w wVar = source.f43260b;
            Intrinsics.checkNotNull(wVar);
            int min = (int) Math.min(j4, wVar.f43306c - wVar.f43305b);
            this.f43294b.write(wVar.f43304a, wVar.f43305b, min);
            wVar.f43305b += min;
            long j5 = min;
            j4 -= j5;
            source.k0(source.l0() - j5);
            if (wVar.f43305b == wVar.f43306c) {
                source.f43260b = wVar.b();
                x.b(wVar);
            }
        }
    }
}
