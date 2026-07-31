package okio;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class j implements z {

    @NotNull
    private final z delegate;

    public j(z delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @NotNull
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final z m258deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @NotNull
    public final z delegate() {
        return this.delegate;
    }

    @Override // okio.z, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // okio.z
    @NotNull
    public C timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // okio.z
    public void write(C3372e source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.delegate.write(source, j4);
    }
}
