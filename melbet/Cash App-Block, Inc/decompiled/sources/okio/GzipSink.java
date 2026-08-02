package okio;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes3.dex */
public final class GzipSink implements Sink {
    public boolean closed;
    public final CRC32 crc;
    public final Deflater deflater;
    public final DeflaterSink deflaterSink;
    public final RealBufferedSink sink;

    public GzipSink(BufferedSink bufferedSink) {
        bufferedSink.getClass();
        RealBufferedSink realBufferedSink = new RealBufferedSink(bufferedSink);
        this.sink = realBufferedSink;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink(realBufferedSink, deflater);
        this.crc = new CRC32();
        Buffer buffer = realBufferedSink.bufferField;
        buffer.m4337writeShort(8075);
        buffer.m4335writeByte(8);
        buffer.m4335writeByte(0);
        buffer.m4336writeInt(0);
        buffer.m4335writeByte(0);
        buffer.m4335writeByte(0);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.deflater;
        RealBufferedSink realBufferedSink = this.sink;
        if (this.closed) {
            return;
        }
        try {
            DeflaterSink deflaterSink = this.deflaterSink;
            deflaterSink.deflater.finish();
            deflaterSink.deflate(false);
            realBufferedSink.writeIntLe((int) this.crc.getValue());
            realBufferedSink.writeIntLe((int) deflater.getBytesRead());
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            realBufferedSink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        this.deflaterSink.flush();
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return this.sink.sink.timeout();
    }

    @Override // okio.Sink
    public final void write(Buffer buffer, long j) {
        buffer.getClass();
        if (j < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount < 0: "));
            return;
        }
        if (j == 0) {
            return;
        }
        Segment segment = buffer.head;
        segment.getClass();
        long j2 = j;
        while (j2 > 0) {
            int min = (int) Math.min(j2, segment.limit - segment.pos);
            this.crc.update(segment.data, segment.pos, min);
            j2 -= min;
            segment = segment.next;
            segment.getClass();
        }
        this.deflaterSink.write(buffer, j);
    }
}
