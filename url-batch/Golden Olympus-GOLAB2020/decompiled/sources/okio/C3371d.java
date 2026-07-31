package okio;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: okio.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3371d implements z {
    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.z, java.io.Flushable
    public void flush() {
    }

    @Override // okio.z
    public C timeout() {
        return C.NONE;
    }

    @Override // okio.z
    public void write(C3372e source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.H(j4);
    }
}
