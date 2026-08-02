package okio;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class InflaterSource implements Source {
    public int bufferBytesHeldByInflater;
    public boolean closed;
    public final Inflater inflater;
    public final RealBufferedSource source;

    public InflaterSource(RealBufferedSource realBufferedSource, Inflater inflater) {
        this.source = realBufferedSource;
        this.inflater = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    @Override // okio.Source
    public final long read(Buffer buffer, long j) {
        buffer.getClass();
        do {
            long readOrInflate = readOrInflate(buffer, j);
            if (readOrInflate > 0) {
                return readOrInflate;
            }
            Inflater inflater = this.inflater;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.exhausted());
        Path$$ExternalSyntheticBUOutline0.m$1("source exhausted prematurely");
        return 0L;
    }

    public final long readOrInflate(Buffer buffer, long j) {
        Inflater inflater = this.inflater;
        buffer.getClass();
        if (j < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                Segment writableSegment$okio = buffer.writableSegment$okio(1);
                int min = (int) Math.min(j, 8192 - writableSegment$okio.limit);
                boolean needsInput = inflater.needsInput();
                RealBufferedSource realBufferedSource = this.source;
                if (needsInput && !realBufferedSource.exhausted()) {
                    Segment segment = realBufferedSource.bufferField.head;
                    segment.getClass();
                    int i = segment.limit;
                    int i2 = segment.pos;
                    int i3 = i - i2;
                    this.bufferBytesHeldByInflater = i3;
                    inflater.setInput(segment.data, i2, i3);
                }
                int inflate = inflater.inflate(writableSegment$okio.data, writableSegment$okio.limit, min);
                int i4 = this.bufferBytesHeldByInflater;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.bufferBytesHeldByInflater -= remaining;
                    realBufferedSource.skip(remaining);
                }
                if (inflate > 0) {
                    writableSegment$okio.limit += inflate;
                    long j2 = inflate;
                    buffer.size += j2;
                    return j2;
                }
                if (writableSegment$okio.pos == writableSegment$okio.limit) {
                    buffer.head = writableSegment$okio.pop();
                    SegmentPool.recycle(writableSegment$okio);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.source.source.timeout();
    }
}
