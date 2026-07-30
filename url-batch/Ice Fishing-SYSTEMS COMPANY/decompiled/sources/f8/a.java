package f8;

import e8.q;
import e8.y;
import kotlin.jvm.internal.h;
import u8.e;
import u8.g;
import u8.x;
import u8.z;

/* loaded from: classes2.dex */
public final class a extends y implements x {

    /* renamed from: u, reason: collision with root package name */
    public final q f37811u;

    /* renamed from: v, reason: collision with root package name */
    public final long f37812v;

    public a(q qVar, long j9) {
        this.f37811u = qVar;
        this.f37812v = j9;
    }

    @Override // u8.x
    public final z L() {
        return z.f41323d;
    }

    @Override // e8.y
    public final long b() {
        return this.f37812v;
    }

    @Override // u8.x
    public final long f(long j9, e sink) {
        h.e(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // e8.y
    public final q j() {
        return this.f37811u;
    }

    @Override // e8.y
    public final g z() {
        return u8.b.b(this);
    }

    @Override // e8.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
