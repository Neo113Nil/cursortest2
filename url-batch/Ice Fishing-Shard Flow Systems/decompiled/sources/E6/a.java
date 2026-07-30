package E6;

import D6.E;
import D6.u;
import T6.f;
import T6.h;
import T6.w;
import T6.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends E implements w {

    /* renamed from: e, reason: collision with root package name */
    public final u f706e;

    /* renamed from: i, reason: collision with root package name */
    public final long f707i;

    public a(u uVar, long j) {
        this.f706e = uVar;
        this.f707i = j;
    }

    @Override // D6.E
    public final long a() {
        return this.f707i;
    }

    @Override // T6.w
    public final y b() {
        return y.f2655d;
    }

    @Override // D6.E
    public final u d() {
        return this.f706e;
    }

    @Override // D6.E
    public final h g() {
        return T6.b.b(this);
    }

    @Override // T6.w
    public final long o(long j, f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // D6.E, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
