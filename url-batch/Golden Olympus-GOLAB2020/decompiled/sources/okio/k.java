package okio;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class k implements B {

    @NotNull
    private final B delegate;

    public k(B delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @NotNull
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final B m259deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @NotNull
    public final B delegate() {
        return this.delegate;
    }

    @Override // okio.B
    public long read(C3372e sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, j4);
    }

    @Override // okio.B
    @NotNull
    public C timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
