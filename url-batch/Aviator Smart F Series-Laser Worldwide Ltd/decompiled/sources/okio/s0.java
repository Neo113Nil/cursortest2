package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class s0 implements e {
    public final c bufferField;
    public boolean closed;
    public final x0 source;

    public s0(x0 source) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        this.source = source;
        this.bufferField = new c();
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // okio.e, okio.d
    public c buffer() {
        return this.bufferField;
    }

    @Override // okio.e, okio.x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.clear();
    }

    @Override // okio.e
    public boolean exhausted() {
        if (!this.closed) {
            return this.bufferField.exhausted() && this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.e, okio.d
    public c getBuffer() {
        return this.bufferField;
    }

    @Override // okio.e
    public long indexOf(byte b8) {
        return indexOf(b8, 0L, Long.MAX_VALUE);
    }

    @Override // okio.e
    public long indexOfElement(ByteString targetBytes) {
        kotlin.jvm.internal.s.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.e
    public InputStream inputStream() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.e
    public e peek() {
        return j0.buffer(new p0(this));
    }

    @Override // okio.e
    public boolean rangeEquals(long j8, ByteString bytes) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        return rangeEquals(j8, bytes, 0, bytes.size());
    }

    @Override // okio.e
    public int read(byte[] sink) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.e
    public long readAll(v0 sink) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        long j8 = 0;
        while (this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long completeSegmentByteCount = this.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j8 += completeSegmentByteCount;
                sink.write(this.bufferField, completeSegmentByteCount);
            }
        }
        if (this.bufferField.size() <= 0) {
            return j8;
        }
        long size = j8 + this.bufferField.size();
        c cVar = this.bufferField;
        sink.write(cVar, cVar.size());
        return size;
    }

    @Override // okio.e
    public byte readByte() {
        require(1L);
        return this.bufferField.readByte();
    }

    @Override // okio.e
    public byte[] readByteArray() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteArray();
    }

    @Override // okio.e
    public ByteString readByteString() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r1 = kotlin.text.b.checkRadix(16);
        r1 = kotlin.text.b.checkRadix(r1);
        r1 = java.lang.Integer.toString(r8, r1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(r1, "java.lang.Integer.toStri…(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        throw new java.lang.NumberFormatException(kotlin.jvm.internal.s.stringPlus("Expected a digit or '-' but was 0x", r1));
     */
    @Override // okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readDecimalLong() {
        require(1L);
        long j8 = 0;
        while (true) {
            long j9 = j8 + 1;
            if (!request(j9)) {
                break;
            }
            byte b8 = this.bufferField.getByte(j8);
            if ((b8 < ((byte) 48) || b8 > ((byte) 57)) && !(j8 == 0 && b8 == ((byte) 45))) {
                break;
            }
            j8 = j9;
        }
        return this.bufferField.readDecimalLong();
    }

    @Override // okio.e
    public void readFully(byte[] sink) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        try {
            require(sink.length);
            this.bufferField.readFully(sink);
        } catch (EOFException e8) {
            int i8 = 0;
            while (this.bufferField.size() > 0) {
                c cVar = this.bufferField;
                int read = cVar.read(sink, i8, (int) cVar.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i8 += read;
            }
            throw e8;
        }
    }

    @Override // okio.e
    public long readHexadecimalUnsignedLong() {
        byte b8;
        int checkRadix;
        int checkRadix2;
        require(1L);
        int i8 = 0;
        while (true) {
            int i9 = i8 + 1;
            if (!request(i9)) {
                break;
            }
            b8 = this.bufferField.getByte(i8);
            if ((b8 < ((byte) 48) || b8 > ((byte) 57)) && ((b8 < ((byte) 97) || b8 > ((byte) 102)) && (b8 < ((byte) 65) || b8 > ((byte) 70)))) {
                break;
            }
            i8 = i9;
        }
        if (i8 == 0) {
            checkRadix = kotlin.text.b.checkRadix(16);
            checkRadix2 = kotlin.text.b.checkRadix(checkRadix);
            String num = Integer.toString(b8, checkRadix2);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            throw new NumberFormatException(kotlin.jvm.internal.s.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", num));
        }
        return this.bufferField.readHexadecimalUnsignedLong();
    }

    @Override // okio.e
    public int readInt() {
        require(4L);
        return this.bufferField.readInt();
    }

    @Override // okio.e
    public int readIntLe() {
        require(4L);
        return this.bufferField.readIntLe();
    }

    @Override // okio.e
    public long readLong() {
        require(8L);
        return this.bufferField.readLong();
    }

    @Override // okio.e
    public long readLongLe() {
        require(8L);
        return this.bufferField.readLongLe();
    }

    @Override // okio.e
    public short readShort() {
        require(2L);
        return this.bufferField.readShort();
    }

    @Override // okio.e
    public short readShortLe() {
        require(2L);
        return this.bufferField.readShortLe();
    }

    @Override // okio.e
    public String readString(Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        this.bufferField.writeAll(this.source);
        return this.bufferField.readString(charset);
    }

    @Override // okio.e
    public String readUtf8() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readUtf8();
    }

    @Override // okio.e
    public int readUtf8CodePoint() {
        require(1L);
        byte b8 = this.bufferField.getByte(0L);
        if ((b8 & 224) == 192) {
            require(2L);
        } else if ((b8 & 240) == 224) {
            require(3L);
        } else if ((b8 & a4.a.f64m2) == 240) {
            require(4L);
        }
        return this.bufferField.readUtf8CodePoint();
    }

    @Override // okio.e
    public String readUtf8Line() {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return okio.internal.d.readUtf8Line(this.bufferField, indexOf);
        }
        if (this.bufferField.size() != 0) {
            return readUtf8(this.bufferField.size());
        }
        return null;
    }

    @Override // okio.e
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.e
    public boolean request(long j8) {
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
        }
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.bufferField.size() < j8) {
            if (this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.e
    public void require(long j8) {
        if (!request(j8)) {
            throw new EOFException();
        }
    }

    @Override // okio.e
    public int select(m0 options) {
        kotlin.jvm.internal.s.checkNotNullParameter(options, "options");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int selectPrefix = okio.internal.d.selectPrefix(this.bufferField, options, true);
            if (selectPrefix != -2) {
                if (selectPrefix != -1) {
                    this.bufferField.skip(options.getByteStrings$okio()[selectPrefix].size());
                    return selectPrefix;
                }
            } else if (this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.e
    public void skip(long j8) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j8 > 0) {
            if (this.bufferField.size() == 0 && this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j8, this.bufferField.size());
            this.bufferField.skip(min);
            j8 -= min;
        }
    }

    @Override // okio.e, okio.x0
    public y0 timeout() {
        return this.source.timeout();
    }

    public String toString() {
        return "buffer(" + this.source + ')';
    }

    @Override // okio.e
    public long indexOf(byte b8, long j8) {
        return indexOf(b8, j8, Long.MAX_VALUE);
    }

    @Override // okio.e
    public long indexOfElement(ByteString targetBytes, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(targetBytes, "targetBytes");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long indexOfElement = this.bufferField.indexOfElement(targetBytes, j8);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j8 = Math.max(j8, size);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }

    @Override // okio.e
    public String readUtf8LineStrict(long j8) {
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("limit < 0: ", Long.valueOf(j8)).toString());
        }
        long j9 = j8 == Long.MAX_VALUE ? Long.MAX_VALUE : j8 + 1;
        byte b8 = (byte) 10;
        long indexOf = indexOf(b8, 0L, j9);
        if (indexOf != -1) {
            return okio.internal.d.readUtf8Line(this.bufferField, indexOf);
        }
        if (j9 < Long.MAX_VALUE && request(j9) && this.bufferField.getByte(j9 - 1) == ((byte) 13) && request(1 + j9) && this.bufferField.getByte(j9) == b8) {
            return okio.internal.d.readUtf8Line(this.bufferField, j9);
        }
        c cVar = new c();
        c cVar2 = this.bufferField;
        cVar2.copyTo(cVar, 0L, Math.min(32, cVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.size(), j8) + " content=" + cVar.readByteString().hex() + (char) 8230);
    }

    @Override // okio.e
    public long indexOf(ByteString bytes) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.e
    public boolean rangeEquals(long j8, ByteString bytes, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        if (!this.closed) {
            if (j8 >= 0 && i8 >= 0 && i9 >= 0 && bytes.size() - i8 >= i9) {
                if (i9 <= 0) {
                    return true;
                }
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    long j9 = i10 + j8;
                    if (!request(1 + j9) || this.bufferField.getByte(j9) != bytes.getByte(i10 + i8)) {
                        break;
                    }
                    if (i11 >= i9) {
                        return true;
                    }
                    i10 = i11;
                }
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.e
    public byte[] readByteArray(long j8) {
        require(j8);
        return this.bufferField.readByteArray(j8);
    }

    @Override // okio.e
    public ByteString readByteString(long j8) {
        require(j8);
        return this.bufferField.readByteString(j8);
    }

    @Override // okio.e
    public String readString(long j8, Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        require(j8);
        return this.bufferField.readString(j8, charset);
    }

    @Override // okio.e
    public String readUtf8(long j8) {
        require(j8);
        return this.bufferField.readUtf8(j8);
    }

    @Override // okio.e
    public long indexOf(byte b8, long j8, long j9) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j8 && j8 <= j9)) {
            throw new IllegalArgumentException(("fromIndex=" + j8 + " toIndex=" + j9).toString());
        }
        while (j8 < j9) {
            long indexOf = this.bufferField.indexOf(b8, j8, j9);
            if (indexOf != -1) {
                return indexOf;
            }
            long size = this.bufferField.size();
            if (size >= j9 || this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j8 = Math.max(j8, size);
        }
        return -1L;
    }

    @Override // okio.e, okio.x0
    public long read(c sink, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
        }
        if (!(true ^ this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.bufferField.read(sink, Math.min(j8, this.bufferField.size()));
    }

    @Override // okio.e
    public void readFully(c sink, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        try {
            require(j8);
            this.bufferField.readFully(sink, j8);
        } catch (EOFException e8) {
            sink.writeAll(this.bufferField);
            throw e8;
        }
    }

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            s0 s0Var = s0.this;
            if (s0Var.closed) {
                throw new IOException("closed");
            }
            return (int) Math.min(s0Var.bufferField.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            s0.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            s0 s0Var = s0.this;
            if (s0Var.closed) {
                throw new IOException("closed");
            }
            if (s0Var.bufferField.size() == 0) {
                s0 s0Var2 = s0.this;
                if (s0Var2.source.read(s0Var2.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
            }
            return s0.this.bufferField.readByte() & 255;
        }

        public String toString() {
            return s0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i8, int i9) {
            kotlin.jvm.internal.s.checkNotNullParameter(data, "data");
            if (!s0.this.closed) {
                d1.checkOffsetAndCount(data.length, i8, i9);
                if (s0.this.bufferField.size() == 0) {
                    s0 s0Var = s0.this;
                    if (s0Var.source.read(s0Var.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1;
                    }
                }
                return s0.this.bufferField.read(data, i8, i9);
            }
            throw new IOException("closed");
        }
    }

    @Override // okio.e
    public long indexOf(ByteString bytes, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long indexOf = this.bufferField.indexOf(bytes, j8);
            if (indexOf != -1) {
                return indexOf;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j8 = Math.max(j8, (size - bytes.size()) + 1);
        }
    }

    @Override // okio.e
    public int read(byte[] sink, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        long j8 = i9;
        d1.checkOffsetAndCount(sink.length, i8, j8);
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.bufferField.read(sink, i8, (int) Math.min(j8, this.bufferField.size()));
    }
}
