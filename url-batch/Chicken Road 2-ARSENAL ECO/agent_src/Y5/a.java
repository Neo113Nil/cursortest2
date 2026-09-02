package Y5;

import X5.q;
import X5.y;
import n6.f;
import n6.h;
import n6.w;

/* loaded from: classes.dex */
public final class a extends y implements w {

    /* renamed from: g, reason: collision with root package name */
    public final q f3096g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3097h;

    public a(q qVar, long j4) {
        this.f3096g = qVar;
        this.f3097h = j4;
    }

    @Override // X5.y
    public final long a() {
        return this.f3097h;
    }

    @Override // n6.w
    public final n6.y b() {
        return n6.y.f5562d;
    }

    @Override // X5.y
    public final q d() {
        return this.f3096g;
    }

    @Override // X5.y
    public final h e() {
        return n6.b.b(this);
    }

    @Override // n6.w
    public final long i(long j4, f fVar) {
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // X5.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
