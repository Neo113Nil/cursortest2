package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;
import okio.j;
import okio.z;

@Metadata
/* loaded from: classes3.dex */
public class FaultHidingSink extends j {

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f42684f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f42685g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(z delegate, Function1 onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f42684f = onException;
    }

    @Override // okio.j, okio.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f42685g) {
            return;
        }
        try {
            super.close();
        } catch (IOException e4) {
            this.f42685g = true;
            this.f42684f.invoke(e4);
        }
    }

    @Override // okio.j, okio.z, java.io.Flushable
    public void flush() {
        if (this.f42685g) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e4) {
            this.f42685g = true;
            this.f42684f.invoke(e4);
        }
    }

    @Override // okio.j, okio.z
    public void write(C3372e source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f42685g) {
            source.H(j4);
            return;
        }
        try {
            super.write(source, j4);
        } catch (IOException e4) {
            this.f42685g = true;
            this.f42684f.invoke(e4);
        }
    }
}
