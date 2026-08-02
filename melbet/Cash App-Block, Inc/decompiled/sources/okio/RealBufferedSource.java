package okio;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.time.DurationKt;

/* loaded from: classes3.dex */
public final class RealBufferedSource implements BufferedSource {
    public final Buffer bufferField;
    public boolean closed;
    public final Source source;

    public RealBufferedSource(Source source) {
        source.getClass();
        this.source = source;
        this.bufferField = new Buffer();
    }

    @Override // okio.BufferedSource
    public final Buffer buffer() {
        return this.bufferField;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.clear();
    }

    @Override // okio.BufferedSource
    public final boolean exhausted() {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return false;
        }
        Buffer buffer = this.bufferField;
        return buffer.exhausted() && this.source.read(buffer, 8192L) == -1;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public final Buffer getBuffer() {
        return this.bufferField;
    }

    public final long indexOf(byte b, long j, long j2) {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return 0L;
        }
        if (0 > j2) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long j3 = 0;
        while (j3 < j2) {
            Buffer buffer = this.bufferField;
            byte b2 = b;
            long j4 = j2;
            long indexOf = buffer.indexOf(b2, j3, j4);
            if (indexOf == -1) {
                long j5 = buffer.size;
                if (j5 >= j4 || this.source.read(buffer, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return indexOf;
            }
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public final long indexOfElement(ByteString byteString) {
        byteString.getClass();
        long j = 0;
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return 0L;
        }
        while (true) {
            Buffer buffer = this.bufferField;
            long indexOfElement = buffer.indexOfElement(j, byteString);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            long j2 = buffer.size;
            if (this.source.read(buffer, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // okio.BufferedSource
    public final InputStream inputStream() {
        return new RealBufferedSource$inputStream$1(this);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.BufferedSource
    public final RealBufferedSource peek() {
        return new RealBufferedSource(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public final boolean rangeEquals(long j, ByteString byteString) {
        byteString.getClass();
        int size$okio = byteString.getSize$okio();
        if (!this.closed) {
            return size$okio >= 0 && j >= 0 && size$okio <= byteString.getSize$okio() && (size$okio == 0 || okio.internal.RealBufferedSource.commonIndexOf(this, byteString, size$okio, j, j + 1) != -1);
        }
        a$$ExternalSyntheticBUOutline0.m$1("closed");
        return false;
    }

    @Override // okio.Source
    public final long read(Buffer buffer, long j) {
        buffer.getClass();
        if (j < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return 0L;
        }
        Buffer buffer2 = this.bufferField;
        if (buffer2.size == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.source.read(buffer2, 8192L) == -1) {
                return -1L;
            }
        }
        return buffer2.read(buffer, Math.min(j, buffer2.size));
    }

    @Override // okio.BufferedSource
    public final long readAll(BufferedSink bufferedSink) {
        Buffer buffer;
        bufferedSink.getClass();
        long j = 0;
        while (true) {
            Source source = this.source;
            buffer = this.bufferField;
            if (source.read(buffer, 8192L) == -1) {
                break;
            }
            long completeSegmentByteCount = buffer.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                bufferedSink.write(buffer, completeSegmentByteCount);
            }
        }
        long j2 = buffer.size;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        bufferedSink.write(buffer, j2);
        return j3;
    }

    @Override // okio.BufferedSource
    public final byte readByte() {
        require(1L);
        return this.bufferField.readByte();
    }

    @Override // okio.BufferedSource
    public final byte[] readByteArray() {
        Source source = this.source;
        Buffer buffer = this.bufferField;
        buffer.writeAll(source);
        return buffer.readByteArray(buffer.size);
    }

    @Override // okio.BufferedSource
    public final ByteString readByteString() {
        Source source = this.source;
        Buffer buffer = this.bufferField;
        buffer.writeAll(source);
        return buffer.readByteString(buffer.size);
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] bArr) {
        Buffer buffer = this.bufferField;
        bArr.getClass();
        try {
            require(bArr.length);
            buffer.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = buffer.size;
                if (j <= 0) {
                    throw e;
                }
                int read = buffer.read(bArr, i, (int) j);
                if (read == -1) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    return;
                }
                i += read;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
    
        r12.size -= r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[LOOP:2: B:23:0x0067->B:31:0x008d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long readHexadecimalUnsignedLong() {
        byte b;
        Buffer buffer;
        int i;
        int i2;
        byte b2;
        require(1L);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            boolean request = request(i5);
            b = 65;
            buffer = this.bufferField;
            if (!request) {
                break;
            }
            b2 = buffer.getByte(i4);
            if ((b2 < 48 || b2 > 57) && ((b2 < 97 || b2 > 102) && (b2 < 65 || b2 > 70))) {
                break;
            }
            i4 = i5;
        }
        if (i4 == 0) {
            String num = Integer.toString(b2, CharsKt.checkRadix(16));
            num.getClass();
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        long j = 0;
        if (buffer.size == 0) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return 0L;
        }
        boolean z = false;
        long j2 = 0;
        while (true) {
            Segment segment = buffer.head;
            segment.getClass();
            byte[] bArr = segment.data;
            long j3 = j;
            int i6 = segment.pos;
            int i7 = segment.limit;
            while (i6 < i7) {
                byte b3 = bArr[i6];
                if (b3 >= 48 && b3 <= 57) {
                    i2 = b3 - 48;
                } else if (b3 >= 97 && b3 <= 102) {
                    i2 = b3 - 87;
                } else if (b3 >= b && b3 <= 70) {
                    i = b3 - 55;
                    if ((j2 & (-1152921504606846976L)) == j3) {
                        Buffer buffer2 = new Buffer();
                        buffer2.writeHexadecimalUnsignedLong(j2);
                        buffer2.m4335writeByte((int) b3);
                        throw new NumberFormatException("Number too large: ".concat(buffer2.readUtf8()));
                    }
                    j2 = (j2 << 4) | i;
                    i6++;
                    i3++;
                    b = 65;
                } else {
                    if (i3 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(DurationKt.toHexString(b3)));
                    }
                    z = true;
                    if (i6 != i7) {
                        buffer.head = segment.pop();
                        SegmentPool.recycle(segment);
                    } else {
                        segment.pos = i6;
                    }
                    if (!!z || buffer.head == null) {
                        break;
                    }
                    j = j3;
                    b = 65;
                }
                i = i2;
                if ((j2 & (-1152921504606846976L)) == j3) {
                }
            }
            if (i6 != i7) {
            }
            if (!z) {
                break;
            }
            break;
        }
    }

    @Override // okio.BufferedSource
    public final int readInt() {
        require(4L);
        return this.bufferField.readInt();
    }

    @Override // okio.BufferedSource
    public final int readIntLe() {
        require(4L);
        return this.bufferField.readIntLe();
    }

    @Override // okio.BufferedSource
    public final long readLong() {
        require(8L);
        return this.bufferField.readLong();
    }

    @Override // okio.BufferedSource
    public final long readLongLe() {
        require(8L);
        return this.bufferField.readLongLe();
    }

    @Override // okio.BufferedSource
    public final short readShort() {
        require(2L);
        return this.bufferField.readShort();
    }

    public final short readShortLe() {
        require(2L);
        return this.bufferField.readShortLe();
    }

    @Override // okio.BufferedSource
    public final String readString(Charset charset) {
        charset.getClass();
        Source source = this.source;
        Buffer buffer = this.bufferField;
        buffer.writeAll(source);
        return buffer.readString(buffer.size, charset);
    }

    @Override // okio.BufferedSource
    public final String readUtf8(long j) {
        require(j);
        return this.bufferField.readString(j, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public final String readUtf8LineStrict(long j) {
        if (j < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long indexOf = indexOf((byte) 10, 0L, j2);
        Buffer buffer = this.bufferField;
        if (indexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(buffer, indexOf);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && buffer.getByte(j2 - 1) == 13 && request(j2 + 1) && buffer.getByte(j2) == 10) {
            return okio.internal.Buffer.readUtf8Line(buffer, j2);
        }
        Buffer buffer2 = new Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32L, buffer.size));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size, j) + " content=" + buffer2.readByteString(buffer2.size).hex() + (char) 8230);
    }

    @Override // okio.BufferedSource
    public final boolean request(long j) {
        Buffer buffer;
        if (j < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount < 0: "));
            return false;
        }
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return false;
        }
        do {
            buffer = this.bufferField;
            if (buffer.size >= j) {
                return true;
            }
        } while (this.source.read(buffer, 8192L) != -1);
        return false;
    }

    @Override // okio.BufferedSource
    public final void require(long j) {
        if (request(j)) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1();
    }

    @Override // okio.BufferedSource
    public final int select(Options options) {
        options.getClass();
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return 0;
        }
        while (true) {
            Buffer buffer = this.bufferField;
            int selectPrefix = okio.internal.Buffer.selectPrefix(buffer, options, true);
            if (selectPrefix != -2) {
                if (selectPrefix != -1) {
                    buffer.skip(options.byteStrings[selectPrefix].getSize$okio());
                    return selectPrefix;
                }
            } else if (this.source.read(buffer, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.BufferedSource
    public final void skip(long j) {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return;
        }
        while (j > 0) {
            Buffer buffer = this.bufferField;
            if (buffer.size == 0 && this.source.read(buffer, 8192L) == -1) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return;
            } else {
                long min = Math.min(j, buffer.size);
                buffer.skip(min);
                j -= min;
            }
        }
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.source.timeout();
    }

    public final String toString() {
        return "buffer(" + this.source + ')';
    }

    @Override // okio.BufferedSource
    public final ByteString readByteString(long j) {
        require(j);
        return this.bufferField.readByteString(j);
    }

    @Override // okio.BufferedSource
    public final void readFully(Buffer buffer, long j) {
        Buffer buffer2 = this.bufferField;
        try {
            require(j);
            buffer2.readFully(buffer, j);
        } catch (EOFException e) {
            buffer.writeAll(buffer2);
            throw e;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        Buffer buffer = this.bufferField;
        if (buffer.size == 0 && this.source.read(buffer, 8192L) == -1) {
            return -1;
        }
        return buffer.read(byteBuffer);
    }

    @Override // okio.BufferedSource
    public final long indexOf(ByteString byteString) {
        long commonIndexOf;
        byteString.getClass();
        commonIndexOf = okio.internal.RealBufferedSource.commonIndexOf(this, byteString, byteString.getSize$okio(), 0L, Long.MAX_VALUE);
        return commonIndexOf;
    }

    @Override // okio.BufferedSource
    public final long indexOf(long j, ByteString byteString) {
        long commonIndexOf;
        byteString.getClass();
        commonIndexOf = okio.internal.RealBufferedSource.commonIndexOf(this, byteString, byteString.getSize$okio(), 0L, j);
        return commonIndexOf;
    }
}
