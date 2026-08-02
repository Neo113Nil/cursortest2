package okhttp3.internal;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.RealBufferedSource;
import okio.Source;
import okio.Timeout;

/* loaded from: classes3.dex */
public final class UnreadableResponseBody extends ResponseBody implements Source {
    public final long contentLength;
    public final MediaType mediaType;

    public UnreadableResponseBody(MediaType mediaType, long j) {
        this.mediaType = mediaType;
        this.contentLength = j;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.mediaType;
    }

    @Override // okio.Source
    public final long read(Buffer buffer, long j) {
        buffer.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // okhttp3.ResponseBody
    public final BufferedSource source() {
        return new RealBufferedSource(this);
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return Timeout.NONE;
    }
}
