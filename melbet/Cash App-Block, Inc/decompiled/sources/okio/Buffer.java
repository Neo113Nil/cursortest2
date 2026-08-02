package okio;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.text.Charsets;
import kotlin.time.DurationKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    public Segment head;
    public long size;

    public final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        public Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.buffer == null) {
                a$$ExternalSyntheticBUOutline0.m$1("not attached to a buffer");
                return;
            }
            this.buffer = null;
            this.segment = null;
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final void resizeBuffer(long j) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                a$$ExternalSyntheticBUOutline0.m$1("not attached to a buffer");
                return;
            }
            if (!this.readWrite) {
                a$$ExternalSyntheticBUOutline0.m$1("resizeBuffer() only permitted for read/write buffers");
                return;
            }
            long j2 = buffer.size;
            if (j <= j2) {
                if (j < 0) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "newSize < 0: "));
                    return;
                }
                long j3 = j2 - j;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    Segment segment = buffer.head;
                    segment.getClass();
                    Segment segment2 = segment.prev;
                    segment2.getClass();
                    int i = segment2.limit;
                    long j4 = i - segment2.pos;
                    if (j4 > j3) {
                        segment2.limit = i - ((int) j3);
                        break;
                    } else {
                        buffer.head = segment2.pop();
                        SegmentPool.recycle(segment2);
                        j3 -= j4;
                    }
                }
                this.segment = null;
                this.offset = j;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                int i2 = 1;
                boolean z = true;
                for (long j6 = 0; j5 > j6; j6 = 0) {
                    Segment writableSegment$okio = buffer.writableSegment$okio(i2);
                    int min = (int) Math.min(j5, 8192 - writableSegment$okio.limit);
                    int i3 = writableSegment$okio.limit + min;
                    writableSegment$okio.limit = i3;
                    j5 -= min;
                    if (z) {
                        this.segment = writableSegment$okio;
                        this.offset = j2;
                        this.data = writableSegment$okio.data;
                        this.start = i3 - min;
                        this.end = i3;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            buffer.size = j;
        }

        public final int seek(long j) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                a$$ExternalSyntheticBUOutline0.m$1("not attached to a buffer");
                return 0;
            }
            if (j >= -1) {
                long j2 = buffer.size;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.segment = null;
                        this.offset = j;
                        this.data = null;
                        this.start = -1;
                        this.end = -1;
                        return -1;
                    }
                    Segment segment = buffer.head;
                    Segment segment2 = this.segment;
                    long j3 = 0;
                    if (segment2 != null) {
                        long j4 = this.offset - (this.start - segment2.pos);
                        if (j4 > j) {
                            segment2 = segment;
                            segment = segment2;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        segment2 = segment;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            segment2.getClass();
                            long j5 = (segment2.limit - segment2.pos) + j3;
                            if (j < j5) {
                                break;
                            }
                            segment2 = segment2.next;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            segment.getClass();
                            segment = segment.prev;
                            segment.getClass();
                            j2 -= segment.limit - segment.pos;
                        }
                        segment2 = segment;
                        j3 = j2;
                    }
                    if (this.readWrite) {
                        segment2.getClass();
                        if (segment2.shared) {
                            byte[] bArr = segment2.data;
                            Segment segment3 = new Segment(Arrays.copyOf(bArr, bArr.length), segment2.pos, segment2.limit, false, true);
                            if (buffer.head == segment2) {
                                buffer.head = segment3;
                            }
                            segment2.push(segment3);
                            Segment segment4 = segment3.prev;
                            segment4.getClass();
                            segment4.pop();
                            segment2 = segment3;
                        }
                    }
                    this.segment = segment2;
                    this.offset = j;
                    segment2.getClass();
                    this.data = segment2.data;
                    int i = segment2.pos + ((int) (j - j3));
                    this.start = i;
                    int i2 = segment2.limit;
                    this.end = i2;
                    return i2 - i;
                }
            }
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "offset=", " > size=");
            m1149m.append(buffer.size);
            throw new ArrayIndexOutOfBoundsException(m1149m.toString());
        }
    }

    @Override // okio.BufferedSource
    public final Buffer buffer() {
        return this;
    }

    public final void clear() {
        skip(this.size);
    }

    public final Buffer clone() {
        Buffer buffer = new Buffer();
        if (this.size == 0) {
            return buffer;
        }
        Segment segment = this.head;
        segment.getClass();
        Segment sharedCopy = segment.sharedCopy();
        buffer.head = sharedCopy;
        sharedCopy.prev = sharedCopy;
        sharedCopy.next = sharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = sharedCopy.prev;
            segment3.getClass();
            segment2.getClass();
            segment3.push(segment2.sharedCopy());
        }
        buffer.size = this.size;
        return buffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, okio.Sink
    public final void close() {
    }

    public final long completeSegmentByteCount() {
        long j = this.size;
        if (j == 0) {
            return 0L;
        }
        Segment segment = this.head;
        segment.getClass();
        Segment segment2 = segment.prev;
        segment2.getClass();
        return (segment2.limit >= 8192 || !segment2.owner) ? j : j - (r2 - segment2.pos);
    }

    public final void copyTo(Buffer buffer, long j, long j2) {
        buffer.getClass();
        long j3 = j;
        DurationKt.checkOffsetAndCount(this.size, j3, j2);
        if (j2 == 0) {
            return;
        }
        buffer.size += j2;
        Segment segment = this.head;
        while (true) {
            segment.getClass();
            long j4 = segment.limit - segment.pos;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            segment = segment.next;
        }
        long j5 = j2;
        while (j5 > 0) {
            segment.getClass();
            Segment sharedCopy = segment.sharedCopy();
            int i = sharedCopy.pos + ((int) j3);
            sharedCopy.pos = i;
            sharedCopy.limit = Math.min(i + ((int) j5), sharedCopy.limit);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                sharedCopy.prev = sharedCopy;
                sharedCopy.next = sharedCopy;
                buffer.head = sharedCopy;
            } else {
                Segment segment3 = segment2.prev;
                segment3.getClass();
                segment3.push(sharedCopy);
            }
            j5 -= sharedCopy.limit - sharedCopy.pos;
            segment = segment.next;
            j3 = 0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        long j = this.size;
        Buffer buffer = (Buffer) obj;
        if (j != buffer.size) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        Segment segment = this.head;
        segment.getClass();
        Segment segment2 = buffer.head;
        segment2.getClass();
        int i = segment.pos;
        int i2 = segment2.pos;
        long j2 = 0;
        while (j2 < this.size) {
            long min = Math.min(segment.limit - i, segment2.limit - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (segment.data[i] != segment2.data[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == segment.limit) {
                segment = segment.next;
                segment.getClass();
                i = segment.pos;
            }
            if (i2 == segment2.limit) {
                segment2 = segment2.next;
                segment2.getClass();
                i2 = segment2.pos;
            }
            j2 += min;
        }
        return true;
    }

    @Override // okio.BufferedSource
    public final boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public final Buffer getBuffer() {
        return this;
    }

    public final byte getByte(long j) {
        DurationKt.checkOffsetAndCount(this.size, j, 1L);
        Segment segment = this.head;
        segment.getClass();
        long j2 = this.size;
        if (j2 - j < j) {
            while (j2 > j) {
                segment = segment.prev;
                segment.getClass();
                j2 -= segment.limit - segment.pos;
            }
            return segment.data[(int) ((segment.pos + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = segment.limit;
            int i2 = segment.pos;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return segment.data[(int) ((i2 + j) - j3)];
            }
            segment = segment.next;
            segment.getClass();
            j3 = j4;
        }
    }

    public final int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
            segment.getClass();
        } while (segment != this.head);
        return i;
    }

    public final long indexOf(byte b, long j, long j2) {
        Segment segment;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.size);
            Boxes$$ExternalSyntheticOutline1.m1151m(j3, " fromIndex=", " toIndex=", sb);
            sb.append(j4);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j6 = this.size;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (segment = this.head) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                segment = segment.prev;
                segment.getClass();
                j6 -= segment.limit - segment.pos;
            }
            while (j6 < j4) {
                byte[] bArr = segment.data;
                long j8 = j7;
                int min = (int) Math.min(segment.limit, (segment.pos + j4) - j6);
                for (int i = (int) ((segment.pos + j3) - j6); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - segment.pos) + j6;
                    }
                }
                j6 += segment.limit - segment.pos;
                segment = segment.next;
                segment.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = (segment.limit - segment.pos) + j5;
            if (j9 > j3) {
                break;
            }
            segment = segment.next;
            segment.getClass();
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = segment.data;
            int min2 = (int) Math.min(segment.limit, (segment.pos + j4) - j5);
            for (int i2 = (int) ((segment.pos + j3) - j5); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - segment.pos) + j5;
                }
            }
            j5 += segment.limit - segment.pos;
            segment = segment.next;
            segment.getClass();
            j3 = j5;
        }
        return -1L;
    }

    public final long indexOfElement(long j, ByteString byteString) {
        byteString.getClass();
        long j2 = 0;
        if (j < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "fromIndex < 0: "));
            return 0L;
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        long j3 = this.size;
        if (j3 - j < j) {
            while (j3 > j) {
                segment = segment.prev;
                segment.getClass();
                j3 -= segment.limit - segment.pos;
            }
            if (byteString.getSize$okio() == 2) {
                byte internalGet$okio = byteString.internalGet$okio(0);
                byte internalGet$okio2 = byteString.internalGet$okio(1);
                while (j3 < this.size) {
                    byte[] bArr = segment.data;
                    int i = segment.limit;
                    for (int i2 = (int) ((segment.pos + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == internalGet$okio || b == internalGet$okio2) {
                            return (i2 - segment.pos) + j3;
                        }
                    }
                    j3 += segment.limit - segment.pos;
                    segment = segment.next;
                    segment.getClass();
                    j = j3;
                }
            } else {
                byte[] internalArray$okio = byteString.internalArray$okio();
                while (j3 < this.size) {
                    byte[] bArr2 = segment.data;
                    int i3 = segment.limit;
                    for (int i4 = (int) ((segment.pos + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : internalArray$okio) {
                            if (b2 == b3) {
                                return (i4 - segment.pos) + j3;
                            }
                        }
                    }
                    j3 += segment.limit - segment.pos;
                    segment = segment.next;
                    segment.getClass();
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = (segment.limit - segment.pos) + j2;
            if (j4 > j) {
                break;
            }
            segment = segment.next;
            segment.getClass();
            j2 = j4;
        }
        if (byteString.getSize$okio() == 2) {
            byte internalGet$okio3 = byteString.internalGet$okio(0);
            byte internalGet$okio4 = byteString.internalGet$okio(1);
            while (j2 < this.size) {
                byte[] bArr3 = segment.data;
                int i5 = segment.limit;
                for (int i6 = (int) ((segment.pos + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == internalGet$okio3 || b4 == internalGet$okio4) {
                        return (i6 - segment.pos) + j2;
                    }
                }
                j2 += segment.limit - segment.pos;
                segment = segment.next;
                segment.getClass();
                j = j2;
            }
        } else {
            byte[] internalArray$okio2 = byteString.internalArray$okio();
            while (j2 < this.size) {
                byte[] bArr4 = segment.data;
                int i7 = segment.limit;
                for (int i8 = (int) ((segment.pos + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : internalArray$okio2) {
                        if (b5 == b6) {
                            return (i8 - segment.pos) + j2;
                        }
                    }
                }
                j2 += segment.limit - segment.pos;
                segment = segment.next;
                segment.getClass();
                j = j2;
            }
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public final InputStream inputStream() {
        return new Buffer$inputStream$1(this, 0);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // okio.BufferedSource
    public final RealBufferedSource peek() {
        return new RealBufferedSource(new PeekSource(this));
    }

    public final boolean rangeEquals(int i, long j, ByteString byteString) {
        byteString.getClass();
        if (i >= 0 && j >= 0 && i + j <= this.size && i <= byteString.getSize$okio()) {
            return i == 0 || okio.internal.Buffer.commonIndexOf(this, byteString, j, j + 1, i) != -1;
        }
        return false;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        DurationKt.checkOffsetAndCount(bArr.length, i, i2);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2, segment.limit - segment.pos);
        byte[] bArr2 = segment.data;
        int i3 = segment.pos;
        ArraysKt___ArraysJvmKt.copyInto(i, bArr2, i3, bArr, i3 + min);
        int i4 = segment.pos + min;
        segment.pos = i4;
        this.size -= min;
        if (i4 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    @Override // okio.BufferedSource
    public final long readAll(BufferedSink bufferedSink) {
        bufferedSink.getClass();
        long j = this.size;
        if (j > 0) {
            bufferedSink.write(this, j);
        }
        return j;
    }

    public final void readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        unsafeCursor.getClass();
        byte[] bArr = okio.internal.Buffer.HEX_DIGIT_BYTES;
        if (unsafeCursor.buffer != null) {
            a$$ExternalSyntheticBUOutline0.m$1("already attached to a buffer");
        } else {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = true;
        }
    }

    @Override // okio.BufferedSource
    public final byte readByte() {
        if (this.size == 0) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return (byte) 0;
        }
        Segment segment = this.head;
        segment.getClass();
        int i = segment.pos;
        int i2 = segment.limit;
        int i3 = i + 1;
        byte b = segment.data[i];
        this.size--;
        if (i3 != i2) {
            segment.pos = i3;
            return b;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return b;
    }

    public final byte[] readByteArray(long j) {
        if (j < 0 || j > 2147483647L) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount: "));
            return null;
        }
        if (this.size < j) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    public final ByteString readByteString(long j) {
        if (j < 0 || j > 2147483647L) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount: "));
            return null;
        }
        if (this.size < j) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        if (j < 4096) {
            return new ByteString(readByteArray(j));
        }
        ByteString snapshot = snapshot((int) j);
        skip(j);
        return snapshot;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        r3 = r19.size - r1;
        r19.size = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r3 == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        r1 = androidx.camera.video.Recorder$$ExternalSyntheticOutline2.m108m(r1, " but was 0x");
        r1.append(kotlin.time.DurationKt.toHexString(getByte(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c8, code lost:
    
        r3 = r17;
        okio.Path$$ExternalSyntheticBUOutline0.m$1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cd, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
    
        r14 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long readDecimalLong() {
        long j;
        byte b;
        long j2 = 0;
        if (this.size == 0) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return 0L;
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            Segment segment = this.head;
            segment.getClass();
            byte[] bArr = segment.data;
            int i2 = segment.pos;
            int i3 = segment.limit;
            while (i2 < i3) {
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + i4;
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            j = j2;
            if (i2 == i3) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i2;
            }
            if (z2 || this.head == null) {
                break;
            }
            j2 = j;
        }
        Buffer buffer = new Buffer();
        buffer.writeDecimalLong(j3);
        buffer.m4335writeByte((int) b);
        if (!z) {
            buffer.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(buffer.readUtf8()));
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] bArr) {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            i += read;
        }
    }

    @Override // okio.BufferedSource
    public final int readInt() {
        if (this.size < 4) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return 0;
        }
        Segment segment = this.head;
        segment.getClass();
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.size -= 4;
        if (i5 != i2) {
            segment.pos = i5;
            return i6;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return i6;
    }

    @Override // okio.BufferedSource
    public final int readIntLe() {
        return DurationKt.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public final long readLong() {
        if (this.size < 8) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return 0L;
        }
        Segment segment = this.head;
        segment.getClass();
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 8) {
            return ((readInt() & BodyPartID.bodyIdMax) << 32) | (BodyPartID.bodyIdMax & readInt());
        }
        byte[] bArr = segment.data;
        int i3 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        this.size -= 8;
        if (i4 != i2) {
            segment.pos = i4;
            return j2;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return j2;
    }

    @Override // okio.BufferedSource
    public final long readLongLe() {
        return DurationKt.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public final short readShort() {
        if (this.size < 2) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return (short) 0;
        }
        Segment segment = this.head;
        segment.getClass();
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.size -= 2;
        if (i5 == i2) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i5;
        }
        return (short) i6;
    }

    public final short readShortLe() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public final String readString(long j, Charset charset) {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount: "));
            return null;
        }
        if (this.size < j) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        if (j == 0) {
            return "";
        }
        Segment segment = this.head;
        segment.getClass();
        int i = segment.pos;
        if (i + j > segment.limit) {
            return new String(readByteArray(j), charset);
        }
        int i2 = (int) j;
        String str = new String(segment.data, i, i2, charset);
        int i3 = segment.pos + i2;
        segment.pos = i3;
        this.size -= j;
        if (i3 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    public final String readUtf8() {
        return readString(this.size, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public final String readUtf8LineStrict(long j) {
        if (j < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long indexOf = indexOf((byte) 10, 0L, j2);
        if (indexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, indexOf);
        }
        if (j2 < this.size && getByte(j2 - 1) == 13 && getByte(j2) == 10) {
            return okio.internal.Buffer.readUtf8Line(this, j2);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32L, this.size));
        throw new EOFException("\\n not found: limit=" + Math.min(this.size, j) + " content=" + buffer.readByteString(buffer.size).hex() + (char) 8230);
    }

    @Override // okio.BufferedSource
    public final boolean request(long j) {
        return this.size >= j;
    }

    @Override // okio.BufferedSource
    public final void require(long j) {
        if (this.size >= j) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1();
    }

    @Override // okio.BufferedSource
    public final int select(Options options) {
        options.getClass();
        int selectPrefix = okio.internal.Buffer.selectPrefix(this, options, false);
        if (selectPrefix == -1) {
            return -1;
        }
        skip(options.byteStrings[selectPrefix].getSize$okio());
        return selectPrefix;
    }

    @Override // okio.BufferedSource
    public final void skip(long j) {
        while (j > 0) {
            Segment segment = this.head;
            if (segment == null) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            int min = (int) Math.min(j, segment.limit - segment.pos);
            long j2 = min;
            this.size -= j2;
            j -= j2;
            int i = segment.pos + min;
            segment.pos = i;
            if (i == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public final ByteString snapshot(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        DurationKt.checkOffsetAndCount(this.size, 0L, i);
        Segment segment = this.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            segment.getClass();
            int i5 = segment.limit;
            int i6 = segment.pos;
            if (i5 == i6) {
                a$$ExternalSyntheticBUOutline0.m$1((Object) "s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = this.head;
        int i7 = 0;
        while (i2 < i) {
            segment2.getClass();
            bArr[i7] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.pos;
            segment2.shared = true;
            i7++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return Timeout.NONE;
    }

    public final String toString() {
        return snapshot().toString();
    }

    public final Segment writableSegment$okio(int i) {
        if (i < 1 || i > 8192) {
            a$$ExternalSyntheticBUOutline0.m$3("unexpected capacity");
            return null;
        }
        Segment segment = this.head;
        if (segment == null) {
            Segment take = SegmentPool.take();
            this.head = take;
            take.prev = take;
            take.next = take;
            return take;
        }
        Segment segment2 = segment.prev;
        segment2.getClass();
        if (segment2.limit + i <= 8192 && segment2.owner) {
            return segment2;
        }
        Segment take2 = SegmentPool.take();
        segment2.push(take2);
        return take2;
    }

    @Override // okio.Sink
    public final void write(Buffer buffer, long j) {
        Segment take;
        buffer.getClass();
        if (buffer == this) {
            a$$ExternalSyntheticBUOutline0.m$3("source == this");
            return;
        }
        DurationKt.checkOffsetAndCount(buffer.size, 0L, j);
        while (j > 0) {
            Segment segment = buffer.head;
            segment.getClass();
            int i = segment.limit;
            Segment segment2 = buffer.head;
            segment2.getClass();
            long j2 = i - segment2.pos;
            int i2 = 0;
            if (j < j2) {
                Segment segment3 = this.head;
                Segment segment4 = segment3 != null ? segment3.prev : null;
                if (segment4 != null && segment4.owner) {
                    if ((segment4.limit + j) - (segment4.shared ? 0 : segment4.pos) <= 8192) {
                        Segment segment5 = buffer.head;
                        segment5.getClass();
                        segment5.writeTo(segment4, (int) j);
                        buffer.size -= j;
                        this.size += j;
                        return;
                    }
                }
                Segment segment6 = buffer.head;
                segment6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > segment6.limit - segment6.pos) {
                    a$$ExternalSyntheticBUOutline0.m$3("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    take = segment6.sharedCopy();
                } else {
                    take = SegmentPool.take();
                    byte[] bArr = segment6.data;
                    byte[] bArr2 = take.data;
                    int i4 = segment6.pos;
                    ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr2, 0, i4, i4 + i3, 2);
                }
                take.limit = take.pos + i3;
                segment6.pos += i3;
                Segment segment7 = segment6.prev;
                segment7.getClass();
                segment7.push(take);
                buffer.head = take;
            }
            Segment segment8 = buffer.head;
            segment8.getClass();
            long j3 = segment8.limit - segment8.pos;
            buffer.head = segment8.pop();
            Segment segment9 = this.head;
            if (segment9 == null) {
                this.head = segment8;
                segment8.prev = segment8;
                segment8.next = segment8;
            } else {
                Segment segment10 = segment9.prev;
                segment10.getClass();
                segment10.push(segment8);
                Segment segment11 = segment8.prev;
                if (segment11 == segment8) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot compact");
                    return;
                }
                segment11.getClass();
                if (segment11.owner) {
                    int i5 = segment8.limit - segment8.pos;
                    Segment segment12 = segment8.prev;
                    segment12.getClass();
                    int i6 = 8192 - segment12.limit;
                    Segment segment13 = segment8.prev;
                    segment13.getClass();
                    if (!segment13.shared) {
                        Segment segment14 = segment8.prev;
                        segment14.getClass();
                        i2 = segment14.pos;
                    }
                    if (i5 <= i6 + i2) {
                        Segment segment15 = segment8.prev;
                        segment15.getClass();
                        segment8.writeTo(segment15, i5);
                        segment8.pop();
                        SegmentPool.recycle(segment8);
                    }
                }
            }
            buffer.size -= j3;
            this.size += j3;
            j -= j3;
        }
    }

    @Override // okio.BufferedSink
    public final long writeAll(Source source) {
        source.getClass();
        long j = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* renamed from: writeByte, reason: collision with other method in class */
    public final void m4335writeByte(int i) {
        Segment writableSegment$okio = writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        writableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        this.size++;
    }

    public final void writeDecimalLong(long j) {
        boolean z;
        if (j == 0) {
            m4335writeByte(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m4339writeUtf8("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = okio.internal.Buffer.HEX_DIGIT_BYTES;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = numberOfLeadingZeros + (j > okio.internal.Buffer.DigitCountToLargestValue[numberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        Segment writableSegment$okio = writableSegment$okio(i);
        byte[] bArr2 = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = okio.internal.Buffer.HEX_DIGIT_BYTES[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        writableSegment$okio.limit += i;
        this.size += i;
    }

    public final void writeHexadecimalUnsignedLong(long j) {
        if (j == 0) {
            m4335writeByte(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        Segment writableSegment$okio = writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = okio.internal.Buffer.HEX_DIGIT_BYTES[(int) (15 & j)];
            j >>>= 4;
        }
        writableSegment$okio.limit += i;
        this.size += i;
    }

    /* renamed from: writeInt, reason: collision with other method in class */
    public final void m4336writeInt(int i) {
        Segment writableSegment$okio = writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        writableSegment$okio.limit = i2 + 4;
        this.size += 4;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeIntLe(int i) {
        m4336writeInt(DurationKt.reverseBytes(i));
        return this;
    }

    public final void writeLong(long j) {
        Segment writableSegment$okio = writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i = writableSegment$okio.limit;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        writableSegment$okio.limit = i + 8;
        this.size += 8;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeLongLe(long j) {
        writeLong(DurationKt.reverseBytes(j));
        return this;
    }

    /* renamed from: writeShort, reason: collision with other method in class */
    public final void m4337writeShort(int i) {
        Segment writableSegment$okio = writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        writableSegment$okio.limit = i2 + 2;
        this.size += 2;
    }

    /* renamed from: writeUtf8, reason: collision with other method in class */
    public final void m4338writeUtf8(int i, int i2, String str) {
        char charAt;
        str.getClass();
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            Path$$ExternalSyntheticBUOutline0.m$1(str.length(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i2, "endIndex > string.length: ", " > "));
            return;
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                Segment writableSegment$okio = writableSegment$okio(1);
                byte[] bArr = writableSegment$okio.data;
                int i3 = writableSegment$okio.limit - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = writableSegment$okio.limit;
                int i6 = (i3 + i) - i5;
                writableSegment$okio.limit = i5 + i6;
                this.size += i6;
            } else {
                if (charAt2 < 2048) {
                    Segment writableSegment$okio2 = writableSegment$okio(2);
                    byte[] bArr2 = writableSegment$okio2.data;
                    int i7 = writableSegment$okio2.limit;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio2.limit = i7 + 2;
                    this.size += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    Segment writableSegment$okio3 = writableSegment$okio(3);
                    byte[] bArr3 = writableSegment$okio3.data;
                    int i8 = writableSegment$okio3.limit;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio3.limit = i8 + 3;
                    this.size += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        m4335writeByte(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        Segment writableSegment$okio4 = writableSegment$okio(4);
                        byte[] bArr4 = writableSegment$okio4.data;
                        int i11 = writableSegment$okio4.limit;
                        bArr4[i11] = (byte) ((i10 >> 18) | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        writableSegment$okio4.limit = i11 + 4;
                        this.size += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void writeUtf8CodePoint(int i) {
        if (i < 128) {
            m4335writeByte(i);
            return;
        }
        if (i < 2048) {
            Segment writableSegment$okio = writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i2 = writableSegment$okio.limit;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            writableSegment$okio.limit = i2 + 2;
            this.size += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m4335writeByte(63);
            return;
        }
        if (i < 65536) {
            Segment writableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i3 = writableSegment$okio2.limit;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            writableSegment$okio2.limit = i3 + 3;
            this.size += 3;
            return;
        }
        if (i > 1114111) {
            a$$ExternalSyntheticBUOutline0.m$3("Unexpected code point: 0x".concat(DurationKt.toHexString(i)));
            return;
        }
        Segment writableSegment$okio3 = writableSegment$okio(4);
        byte[] bArr3 = writableSegment$okio3.data;
        int i4 = writableSegment$okio3.limit;
        bArr3[i4] = (byte) ((i >> 18) | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        writableSegment$okio3.limit = i4 + 4;
        this.size += 4;
    }

    @Override // okio.BufferedSource
    public final String readUtf8(long j) {
        return readString(j, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public final void readFully(Buffer buffer, long j) {
        long j2 = this.size;
        if (j2 >= j) {
            buffer.write(this, j);
        } else {
            buffer.write(this, j2);
            Path$$ExternalSyntheticBUOutline0.m$1();
        }
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeByte(int i) {
        m4335writeByte(i);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeShort(int i) {
        m4337writeShort(i);
        return this;
    }

    @Override // okio.BufferedSource
    public final byte[] readByteArray() {
        return readByteArray(this.size);
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeInt(int i) {
        m4336writeInt(i);
        return this;
    }

    @Override // okio.BufferedSource
    public final boolean rangeEquals(long j, ByteString byteString) {
        byteString.getClass();
        return rangeEquals(byteString.getSize$okio(), j, byteString);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
        byteBuffer.put(segment.data, segment.pos, min);
        int i = segment.pos + min;
        segment.pos = i;
        this.size -= min;
        if (i == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    @Override // okio.BufferedSource
    public final ByteString readByteString() {
        return readByteString(this.size);
    }

    @Override // okio.Source
    public final long read(Buffer buffer, long j) {
        buffer.getClass();
        if (j >= 0) {
            long j2 = this.size;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            buffer.write(this, j);
            return j;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount < 0: "));
        return 0L;
    }

    public final ByteString snapshot() {
        long j = this.size;
        if (j <= 2147483647L) {
            return snapshot((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.size).toString());
    }

    @Override // okio.BufferedSource
    public final String readString(Charset charset) {
        charset.getClass();
        return readString(this.size, charset);
    }

    @Override // okio.BufferedSource
    public final long indexOf(ByteString byteString) {
        byteString.getClass();
        return indexOf(Long.MAX_VALUE, byteString);
    }

    @Override // okio.BufferedSource
    public final long indexOf(long j, ByteString byteString) {
        byteString.getClass();
        byte[] bArr = okio.internal.Buffer.HEX_DIGIT_BYTES;
        return okio.internal.Buffer.commonIndexOf(this, byteString, 0L, j, byteString.getSize$okio());
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(ByteString byteString) {
        m4333write(byteString);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr) {
        m4334write(bArr);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m4333write(ByteString byteString) {
        byteString.getClass();
        byteString.write$okio(this, byteString.getSize$okio());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i, 8192 - writableSegment$okio.limit);
            byteBuffer.get(writableSegment$okio.data, writableSegment$okio.limit, min);
            i -= min;
            writableSegment$okio.limit += min;
        }
        this.size += remaining;
        return remaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m4334write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        DurationKt.checkOffsetAndCount(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i3 - i, 8192 - writableSegment$okio.limit);
            int i4 = i + min;
            ArraysKt___ArraysJvmKt.copyInto(writableSegment$okio.limit, bArr, i, writableSegment$okio.data, i4);
            writableSegment$okio.limit += min;
            i = i4;
        }
        this.size += j;
    }

    public final void write(Source source, long j) {
        source.getClass();
        while (j > 0) {
            long read = source.read(this, j);
            if (read == -1) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            j -= read;
        }
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeUtf8(String str) {
        m4339writeUtf8(str);
        return this;
    }

    /* renamed from: writeUtf8, reason: collision with other method in class */
    public final void m4339writeUtf8(String str) {
        str.getClass();
        m4338writeUtf8(0, str.length(), str);
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeUtf8(int i, int i2, String str) {
        m4338writeUtf8(i, i2, str);
        return this;
    }

    @Override // okio.BufferedSource
    public final long indexOfElement(ByteString byteString) {
        byteString.getClass();
        return indexOfElement(0L, byteString);
    }
}
