package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class r0 implements d {
    public final c bufferField;
    public boolean closed;
    public final v0 sink;

    public r0(v0 sink) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        this.sink = sink;
        this.bufferField = new c();
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // okio.d
    public c buffer() {
        return this.bufferField;
    }

    @Override // okio.d, okio.v0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        try {
            if (this.bufferField.size() > 0) {
                v0 v0Var = this.sink;
                c cVar = this.bufferField;
                v0Var.write(cVar, cVar.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.d
    public d emit() {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = this.bufferField.size();
        if (size > 0) {
            this.sink.write(this.bufferField, size);
        }
        return this;
    }

    @Override // okio.d
    public d emitCompleteSegments() {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long completeSegmentByteCount = this.bufferField.completeSegmentByteCount();
        if (completeSegmentByteCount > 0) {
            this.sink.write(this.bufferField, completeSegmentByteCount);
        }
        return this;
    }

    @Override // okio.d, okio.v0, java.io.Flushable
    public void flush() {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.bufferField.size() > 0) {
            v0 v0Var = this.sink;
            c cVar = this.bufferField;
            v0Var.write(cVar, cVar.size());
        }
        this.sink.flush();
    }

    @Override // okio.d
    public c getBuffer() {
        return this.bufferField;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.d
    public OutputStream outputStream() {
        return new a();
    }

    @Override // okio.d, okio.v0
    public y0 timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return "buffer(" + this.sink + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        int write = this.bufferField.write(source);
        emitCompleteSegments();
        return write;
    }

    @Override // okio.d
    public long writeAll(x0 source) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        long j8 = 0;
        while (true) {
            long read = source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j8;
            }
            j8 += read;
            emitCompleteSegments();
        }
    }

    @Override // okio.d
    public d writeByte(int i8) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeByte(i8);
        return emitCompleteSegments();
    }

    @Override // okio.d
    public d writeDecimalLong(long j8) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeDecimalLong(j8);
        return emitCompleteSegments();
    }

    @Override // okio.d
    public d writeHexadecimalUnsignedLong(long j8) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeHexadecimalUnsignedLong(j8);
        return emitCompleteSegments();
    }

    @Override // okio.d
    public d writeInt(int i8) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeInt(i8);
        return emitCompleteSegments();
    }

    @Override // okio.d
    public d writeIntLe(int i8) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeIntLe(i8);
        return emitCompleteSegments();
    }

    @Override // okio.d
    public d writeLong(long j8) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeLong(j8);
        return emitCompleteSegments();
    }

    @Override // okio.d
    public d writeLongLe(long j8) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeLongLe(j8);
        return emitCompleteSegments();
    }

    @Override // okio.d
    public d writeShort(int i8) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeShort(i8);
        return emitCompleteSegments();
    }

    @Override // okio.d
    public d writeShortLe(int i8) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeShortLe(i8);
        return emitCompleteSegments();
    }

    @Override // okio.d
    public d writeString(String string, Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeString(string, charset);
        return emitCompleteSegments();
    }

    @Override // okio.d
    public d writeUtf8(String string) {
        kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeUtf8(string);
        return emitCompleteSegments();
    }

    @Override // okio.d
    public d writeUtf8CodePoint(int i8) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeUtf8CodePoint(i8);
        return emitCompleteSegments();
    }

    @Override // okio.d, okio.v0
    public void write(c source, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        if (!this.closed) {
            this.bufferField.write(source, j8);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public d writeString(String string, int i8, int i9, Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        if (!this.closed) {
            this.bufferField.writeString(string, i8, i9, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public d writeUtf8(String string, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
        if (!this.closed) {
            this.bufferField.writeUtf8(string, i8, i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            r0.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            r0 r0Var = r0.this;
            if (r0Var.closed) {
                return;
            }
            r0Var.flush();
        }

        public String toString() {
            return r0.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
            r0 r0Var = r0.this;
            if (r0Var.closed) {
                throw new IOException("closed");
            }
            r0Var.bufferField.writeByte((int) ((byte) i8));
            r0.this.emitCompleteSegments();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i8, int i9) {
            kotlin.jvm.internal.s.checkNotNullParameter(data, "data");
            r0 r0Var = r0.this;
            if (!r0Var.closed) {
                r0Var.bufferField.write(data, i8, i9);
                r0.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // okio.d
    public d write(ByteString byteString) {
        kotlin.jvm.internal.s.checkNotNullParameter(byteString, "byteString");
        if (!this.closed) {
            this.bufferField.write(byteString);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public d write(ByteString byteString, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(byteString, "byteString");
        if (!this.closed) {
            this.bufferField.write(byteString, i8, i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public d write(byte[] source) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        if (!this.closed) {
            this.bufferField.write(source);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public d write(byte[] source, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        if (!this.closed) {
            this.bufferField.write(source, i8, i9);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.d
    public d write(x0 source, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        while (j8 > 0) {
            long read = source.read(this.bufferField, j8);
            if (read != -1) {
                j8 -= read;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}
