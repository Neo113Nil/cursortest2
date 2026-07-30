package T6;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o implements u {

    /* renamed from: d, reason: collision with root package name */
    public final OutputStream f2635d;

    /* renamed from: e, reason: collision with root package name */
    public final y f2636e;

    public o(OutputStream out, y timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f2635d = out;
        this.f2636e = timeout;
    }

    @Override // T6.u
    public final y b() {
        return this.f2636e;
    }

    @Override // T6.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2635d.close();
    }

    @Override // T6.u, java.io.Flushable
    public final void flush() {
        this.f2635d.flush();
    }

    public final String toString() {
        return "sink(" + this.f2635d + ')';
    }

    @Override // T6.u
    public final void x(long j, f source) {
        Intrinsics.checkNotNullParameter(source, "source");
        b.d(source.f2617e, 0L, j);
        while (j > 0) {
            this.f2636e.f();
            r rVar = source.f2616d;
            Intrinsics.b(rVar);
            int min = (int) Math.min(j, rVar.f2645c - rVar.f2644b);
            this.f2635d.write(rVar.f2643a, rVar.f2644b, min);
            int i2 = rVar.f2644b + min;
            rVar.f2644b = i2;
            long j7 = min;
            j -= j7;
            source.f2617e -= j7;
            if (i2 == rVar.f2645c) {
                source.f2616d = rVar.a();
                s.a(rVar);
            }
        }
    }
}
