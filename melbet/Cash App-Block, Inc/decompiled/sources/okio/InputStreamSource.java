package okio;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.io.IOException;
import java.io.InputStream;
import okio.internal._JavaIoKt;

/* loaded from: classes3.dex */
public final class InputStreamSource implements Source {
    public final InputStream input;
    public final Timeout timeout;

    public InputStreamSource(InputStream inputStream, Timeout timeout) {
        inputStream.getClass();
        this.input = inputStream;
        this.timeout = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.input.close();
    }

    @Override // okio.Source
    public final long read(Buffer buffer, long j) {
        buffer.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount < 0: "));
            return 0L;
        }
        try {
            this.timeout.throwIfReached();
            Segment writableSegment$okio = buffer.writableSegment$okio(1);
            int read = this.input.read(writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j, 8192 - writableSegment$okio.limit));
            if (read != -1) {
                writableSegment$okio.limit += read;
                long j2 = read;
                buffer.size += j2;
                return j2;
            }
            if (writableSegment$okio.pos != writableSegment$okio.limit) {
                return -1L;
            }
            buffer.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
            return -1L;
        } catch (AssertionError e) {
            if (_JavaIoKt.isAndroidGetsocknameError(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.timeout;
    }

    public final String toString() {
        return "source(" + this.input + ')';
    }
}
