package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes5.dex */
public final class c implements e, d, Cloneable, ByteChannel {
    public t0 head;
    private long size;

    public static final class a implements Closeable {
        public c buffer;
        public byte[] data;
        public boolean readWrite;
        private t0 segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.buffer != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int i8) {
            if (!(i8 > 0)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("minByteCount <= 0: ", Integer.valueOf(i8)).toString());
            }
            if (!(i8 <= 8192)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("minByteCount > Segment.SIZE: ", Integer.valueOf(i8)).toString());
            }
            c cVar = this.buffer;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
            }
            long size = cVar.size();
            t0 writableSegment$okio = cVar.writableSegment$okio(i8);
            int i9 = 8192 - writableSegment$okio.limit;
            writableSegment$okio.limit = 8192;
            long j8 = i9;
            cVar.setSize$okio(size + j8);
            setSegment$okio(writableSegment$okio);
            this.offset = size;
            this.data = writableSegment$okio.data;
            this.start = 8192 - i9;
            this.end = 8192;
            return j8;
        }

        public final t0 getSegment$okio() {
            return this.segment;
        }

        public final int next() {
            long j8 = this.offset;
            c cVar = this.buffer;
            kotlin.jvm.internal.s.checkNotNull(cVar);
            if (!(j8 != cVar.size())) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j9 = this.offset;
            return seek(j9 == -1 ? 0L : j9 + (this.end - this.start));
        }

        public final long resizeBuffer(long j8) {
            c cVar = this.buffer;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = cVar.size();
            int i8 = 1;
            if (j8 <= size) {
                if (!(j8 >= 0)) {
                    throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("newSize < 0: ", Long.valueOf(j8)).toString());
                }
                long j9 = size - j8;
                while (true) {
                    if (j9 <= 0) {
                        break;
                    }
                    t0 t0Var = cVar.head;
                    kotlin.jvm.internal.s.checkNotNull(t0Var);
                    t0 t0Var2 = t0Var.prev;
                    kotlin.jvm.internal.s.checkNotNull(t0Var2);
                    int i9 = t0Var2.limit;
                    long j10 = i9 - t0Var2.pos;
                    if (j10 > j9) {
                        t0Var2.limit = i9 - ((int) j9);
                        break;
                    }
                    cVar.head = t0Var2.pop();
                    u0.recycle(t0Var2);
                    j9 -= j10;
                }
                setSegment$okio(null);
                this.offset = j8;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j8 > size) {
                long j11 = j8 - size;
                boolean z7 = true;
                while (j11 > 0) {
                    t0 writableSegment$okio = cVar.writableSegment$okio(i8);
                    int min = (int) Math.min(j11, 8192 - writableSegment$okio.limit);
                    writableSegment$okio.limit += min;
                    j11 -= min;
                    if (z7) {
                        setSegment$okio(writableSegment$okio);
                        this.offset = size;
                        this.data = writableSegment$okio.data;
                        int i10 = writableSegment$okio.limit;
                        this.start = i10 - min;
                        this.end = i10;
                        i8 = 1;
                        z7 = false;
                    } else {
                        i8 = 1;
                    }
                }
            }
            cVar.setSize$okio(j8);
            return size;
        }

        public final int seek(long j8) {
            t0 t0Var;
            c cVar = this.buffer;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j8 < -1 || j8 > cVar.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j8 + " > size=" + cVar.size());
            }
            if (j8 == -1 || j8 == cVar.size()) {
                setSegment$okio(null);
                this.offset = j8;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = cVar.size();
            t0 t0Var2 = cVar.head;
            long j9 = 0;
            if (getSegment$okio() != null) {
                long j10 = this.offset;
                int i8 = this.start;
                kotlin.jvm.internal.s.checkNotNull(getSegment$okio());
                long j11 = j10 - (i8 - r9.pos);
                if (j11 > j8) {
                    t0Var = t0Var2;
                    t0Var2 = getSegment$okio();
                    size = j11;
                } else {
                    t0Var = getSegment$okio();
                    j9 = j11;
                }
            } else {
                t0Var = t0Var2;
            }
            if (size - j8 > j8 - j9) {
                while (true) {
                    kotlin.jvm.internal.s.checkNotNull(t0Var);
                    int i9 = t0Var.limit;
                    int i10 = t0Var.pos;
                    if (j8 < (i9 - i10) + j9) {
                        break;
                    }
                    j9 += i9 - i10;
                    t0Var = t0Var.next;
                }
            } else {
                while (size > j8) {
                    kotlin.jvm.internal.s.checkNotNull(t0Var2);
                    t0Var2 = t0Var2.prev;
                    kotlin.jvm.internal.s.checkNotNull(t0Var2);
                    size -= t0Var2.limit - t0Var2.pos;
                }
                j9 = size;
                t0Var = t0Var2;
            }
            if (this.readWrite) {
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                if (t0Var.shared) {
                    t0 unsharedCopy = t0Var.unsharedCopy();
                    if (cVar.head == t0Var) {
                        cVar.head = unsharedCopy;
                    }
                    t0Var = t0Var.push(unsharedCopy);
                    t0 t0Var3 = t0Var.prev;
                    kotlin.jvm.internal.s.checkNotNull(t0Var3);
                    t0Var3.pop();
                }
            }
            setSegment$okio(t0Var);
            this.offset = j8;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            this.data = t0Var.data;
            int i11 = t0Var.pos + ((int) (j8 - j9));
            this.start = i11;
            int i12 = t0Var.limit;
            this.end = i12;
            return i12 - i11;
        }

        public final void setSegment$okio(t0 t0Var) {
            this.segment = t0Var;
        }
    }

    /* renamed from: okio.c$c, reason: collision with other inner class name */
    public static final class C0382c extends OutputStream {
        C0382c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return c.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
            c.this.writeByte(i8);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i8, int i9) {
            kotlin.jvm.internal.s.checkNotNullParameter(data, "data");
            c.this.write(data, i8, i9);
        }
    }

    public static /* synthetic */ c copyTo$default(c cVar, OutputStream outputStream, long j8, long j9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = 0;
        }
        long j10 = j8;
        if ((i8 & 4) != 0) {
            j9 = cVar.size - j10;
        }
        return cVar.copyTo(outputStream, j10, j9);
    }

    private final ByteString digest(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        t0 t0Var = this.head;
        if (t0Var != null) {
            byte[] bArr = t0Var.data;
            int i8 = t0Var.pos;
            messageDigest.update(bArr, i8, t0Var.limit - i8);
            t0 t0Var2 = t0Var.next;
            kotlin.jvm.internal.s.checkNotNull(t0Var2);
            while (t0Var2 != t0Var) {
                byte[] bArr2 = t0Var2.data;
                int i9 = t0Var2.pos;
                messageDigest.update(bArr2, i9, t0Var2.limit - i9);
                t0Var2 = t0Var2.next;
                kotlin.jvm.internal.s.checkNotNull(t0Var2);
            }
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(digest, "messageDigest.digest()");
        return new ByteString(digest);
    }

    private final ByteString hmac(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            t0 t0Var = this.head;
            if (t0Var != null) {
                byte[] bArr = t0Var.data;
                int i8 = t0Var.pos;
                mac.update(bArr, i8, t0Var.limit - i8);
                t0 t0Var2 = t0Var.next;
                kotlin.jvm.internal.s.checkNotNull(t0Var2);
                while (t0Var2 != t0Var) {
                    byte[] bArr2 = t0Var2.data;
                    int i9 = t0Var2.pos;
                    mac.update(bArr2, i9, t0Var2.limit - i9);
                    t0Var2 = t0Var2.next;
                    kotlin.jvm.internal.s.checkNotNull(t0Var2);
                }
            }
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static /* synthetic */ a readAndWriteUnsafe$default(c cVar, a aVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            aVar = d1.getDEFAULT__new_UnsafeCursor();
        }
        return cVar.readAndWriteUnsafe(aVar);
    }

    public static /* synthetic */ a readUnsafe$default(c cVar, a aVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            aVar = d1.getDEFAULT__new_UnsafeCursor();
        }
        return cVar.readUnsafe(aVar);
    }

    public static /* synthetic */ c writeTo$default(c cVar, OutputStream outputStream, long j8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = cVar.size;
        }
        return cVar.writeTo(outputStream, j8);
    }

    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m1448deprecated_getByte(long j8) {
        return getByte(j8);
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final long m1449deprecated_size() {
        return this.size;
    }

    @Override // okio.e, okio.d
    public c buffer() {
        return this;
    }

    public final void clear() {
        skip(size());
    }

    @Override // okio.e, okio.x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        t0 t0Var = this.head;
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        t0 t0Var2 = t0Var.prev;
        kotlin.jvm.internal.s.checkNotNull(t0Var2);
        if (t0Var2.limit < 8192 && t0Var2.owner) {
            size -= r3 - t0Var2.pos;
        }
        return size;
    }

    public final c copy() {
        c cVar = new c();
        if (size() != 0) {
            t0 t0Var = this.head;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            t0 sharedCopy = t0Var.sharedCopy();
            cVar.head = sharedCopy;
            sharedCopy.prev = sharedCopy;
            sharedCopy.next = sharedCopy;
            for (t0 t0Var2 = t0Var.next; t0Var2 != t0Var; t0Var2 = t0Var2.next) {
                t0 t0Var3 = sharedCopy.prev;
                kotlin.jvm.internal.s.checkNotNull(t0Var3);
                kotlin.jvm.internal.s.checkNotNull(t0Var2);
                t0Var3.push(t0Var2.sharedCopy());
            }
            cVar.setSize$okio(size());
        }
        return cVar;
    }

    public final c copyTo(OutputStream out) {
        kotlin.jvm.internal.s.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, 0L, 0L, 6, (Object) null);
    }

    @Override // okio.d
    public c emit() {
        return this;
    }

    @Override // okio.d
    public c emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (size() == cVar.size()) {
                if (size() == 0) {
                    return true;
                }
                t0 t0Var = this.head;
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                t0 t0Var2 = cVar.head;
                kotlin.jvm.internal.s.checkNotNull(t0Var2);
                int i8 = t0Var.pos;
                int i9 = t0Var2.pos;
                long j8 = 0;
                loop0: while (j8 < size()) {
                    long min = Math.min(t0Var.limit - i8, t0Var2.limit - i9);
                    if (0 < min) {
                        long j9 = 0;
                        while (true) {
                            j9++;
                            int i10 = i8 + 1;
                            int i11 = i9 + 1;
                            if (t0Var.data[i8] != t0Var2.data[i9]) {
                                break loop0;
                            }
                            if (j9 >= min) {
                                i8 = i10;
                                i9 = i11;
                                break;
                            }
                            i8 = i10;
                            i9 = i11;
                        }
                    }
                    if (i8 == t0Var.limit) {
                        t0Var = t0Var.next;
                        kotlin.jvm.internal.s.checkNotNull(t0Var);
                        i8 = t0Var.pos;
                    }
                    if (i9 == t0Var2.limit) {
                        t0Var2 = t0Var2.next;
                        kotlin.jvm.internal.s.checkNotNull(t0Var2);
                        i9 = t0Var2.pos;
                    }
                    j8 += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // okio.e
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.d, okio.v0, java.io.Flushable
    public void flush() {
    }

    @Override // okio.e, okio.d
    public c getBuffer() {
        return this;
    }

    public final byte getByte(long j8) {
        d1.checkOffsetAndCount(size(), j8, 1L);
        t0 t0Var = this.head;
        if (t0Var == null) {
            kotlin.jvm.internal.s.checkNotNull(null);
            throw null;
        }
        if (size() - j8 < j8) {
            long size = size();
            while (size > j8) {
                t0Var = t0Var.prev;
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                size -= t0Var.limit - t0Var.pos;
            }
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            return t0Var.data[(int) ((t0Var.pos + j8) - size)];
        }
        long j9 = 0;
        while (true) {
            long j10 = (t0Var.limit - t0Var.pos) + j9;
            if (j10 > j8) {
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                return t0Var.data[(int) ((t0Var.pos + j8) - j9)];
            }
            t0Var = t0Var.next;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            j9 = j10;
        }
    }

    public int hashCode() {
        t0 t0Var = this.head;
        if (t0Var == null) {
            return 0;
        }
        int i8 = 1;
        do {
            int i9 = t0Var.limit;
            for (int i10 = t0Var.pos; i10 < i9; i10++) {
                i8 = (i8 * 31) + t0Var.data[i10];
            }
            t0Var = t0Var.next;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
        } while (t0Var != this.head);
        return i8;
    }

    public final ByteString hmacSha1(ByteString key) {
        kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
        return hmac("HmacSHA1", key);
    }

    public final ByteString hmacSha256(ByteString key) {
        kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
        return hmac("HmacSHA256", key);
    }

    public final ByteString hmacSha512(ByteString key) {
        kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
        return hmac("HmacSHA512", key);
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
        return new b();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final ByteString md5() {
        return digest("MD5");
    }

    @Override // okio.d
    public OutputStream outputStream() {
        return new C0382c();
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

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        t0 t0Var = this.head;
        if (t0Var == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), t0Var.limit - t0Var.pos);
        sink.put(t0Var.data, t0Var.pos, min);
        int i8 = t0Var.pos + min;
        t0Var.pos = i8;
        this.size -= min;
        if (i8 == t0Var.limit) {
            this.head = t0Var.pop();
            u0.recycle(t0Var);
        }
        return min;
    }

    @Override // okio.e
    public long readAll(v0 sink) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    public final a readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @Override // okio.e
    public byte readByte() {
        if (size() == 0) {
            throw new EOFException();
        }
        t0 t0Var = this.head;
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        int i8 = t0Var.pos;
        int i9 = t0Var.limit;
        int i10 = i8 + 1;
        byte b8 = t0Var.data[i8];
        setSize$okio(size() - 1);
        if (i10 == i9) {
            this.head = t0Var.pop();
            u0.recycle(t0Var);
        } else {
            t0Var.pos = i10;
        }
        return b8;
    }

    @Override // okio.e
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.e
    public ByteString readByteString() {
        return readByteString(size());
    }

    @Override // okio.e
    public long readDecimalLong() {
        if (size() == 0) {
            throw new EOFException();
        }
        int i8 = 0;
        long j8 = 0;
        long j9 = -7;
        boolean z7 = false;
        boolean z8 = false;
        do {
            t0 t0Var = this.head;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            byte[] bArr = t0Var.data;
            int i9 = t0Var.pos;
            int i10 = t0Var.limit;
            while (i9 < i10) {
                byte b8 = bArr[i9];
                byte b9 = (byte) 48;
                if (b8 >= b9 && b8 <= ((byte) 57)) {
                    int i11 = b9 - b8;
                    if (j8 < okio.internal.d.OVERFLOW_ZONE || (j8 == okio.internal.d.OVERFLOW_ZONE && i11 < j9)) {
                        c writeByte = new c().writeDecimalLong(j8).writeByte((int) b8);
                        if (!z7) {
                            writeByte.readByte();
                        }
                        throw new NumberFormatException(kotlin.jvm.internal.s.stringPlus("Number too large: ", writeByte.readUtf8()));
                    }
                    j8 = (j8 * 10) + i11;
                } else {
                    if (b8 != ((byte) 45) || i8 != 0) {
                        z8 = true;
                        break;
                    }
                    j9--;
                    z7 = true;
                }
                i9++;
                i8++;
            }
            if (i9 == i10) {
                this.head = t0Var.pop();
                u0.recycle(t0Var);
            } else {
                t0Var.pos = i9;
            }
            if (z8) {
                break;
            }
        } while (this.head != null);
        setSize$okio(size() - i8);
        if (i8 >= (z7 ? 2 : 1)) {
            return z7 ? j8 : -j8;
        }
        if (size() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z7 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + d1.toHexString(getByte(0L)));
    }

    public final c readFrom(InputStream input) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.e
    public void readFully(c sink, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        if (size() >= j8) {
            sink.write(this, j8);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098 A[EDGE_INSN: B:39:0x0098->B:36:0x0098 BREAK  A[LOOP:0: B:4:0x000d->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    @Override // okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readHexadecimalUnsignedLong() {
        int i8;
        if (size() == 0) {
            throw new EOFException();
        }
        int i9 = 0;
        long j8 = 0;
        boolean z7 = false;
        do {
            t0 t0Var = this.head;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            byte[] bArr = t0Var.data;
            int i10 = t0Var.pos;
            int i11 = t0Var.limit;
            while (i10 < i11) {
                byte b8 = bArr[i10];
                byte b9 = (byte) 48;
                if (b8 < b9 || b8 > ((byte) 57)) {
                    byte b10 = (byte) 97;
                    if ((b8 >= b10 && b8 <= ((byte) 102)) || (b8 >= (b10 = (byte) 65) && b8 <= ((byte) 70))) {
                        i8 = (b8 - b10) + 10;
                    } else {
                        if (i9 == 0) {
                            throw new NumberFormatException(kotlin.jvm.internal.s.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", d1.toHexString(b8)));
                        }
                        z7 = true;
                        if (i10 != i11) {
                            this.head = t0Var.pop();
                            u0.recycle(t0Var);
                        } else {
                            t0Var.pos = i10;
                        }
                        if (!z7) {
                            break;
                        }
                    }
                } else {
                    i8 = b8 - b9;
                }
                if (((-1152921504606846976L) & j8) != 0) {
                    throw new NumberFormatException(kotlin.jvm.internal.s.stringPlus("Number too large: ", new c().writeHexadecimalUnsignedLong(j8).writeByte((int) b8).readUtf8()));
                }
                j8 = (j8 << 4) | i8;
                i10++;
                i9++;
            }
            if (i10 != i11) {
            }
            if (!z7) {
            }
        } while (this.head != null);
        setSize$okio(size() - i9);
        return j8;
    }

    @Override // okio.e
    public int readInt() {
        if (size() < 4) {
            throw new EOFException();
        }
        t0 t0Var = this.head;
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        int i8 = t0Var.pos;
        int i9 = t0Var.limit;
        if (i9 - i8 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = t0Var.data;
        int i10 = i8 + 3;
        int i11 = ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 2] & 255) << 8);
        int i12 = i8 + 4;
        int i13 = (bArr[i10] & 255) | i11;
        setSize$okio(size() - 4);
        if (i12 == i9) {
            this.head = t0Var.pop();
            u0.recycle(t0Var);
        } else {
            t0Var.pos = i12;
        }
        return i13;
    }

    @Override // okio.e
    public int readIntLe() {
        return d1.reverseBytes(readInt());
    }

    @Override // okio.e
    public long readLong() {
        if (size() < 8) {
            throw new EOFException();
        }
        t0 t0Var = this.head;
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        int i8 = t0Var.pos;
        int i9 = t0Var.limit;
        if (i9 - i8 < 8) {
            return ((readInt() & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) << 32) | (com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 & readInt());
        }
        byte[] bArr = t0Var.data;
        int i10 = i8 + 7;
        long j8 = ((bArr[i8 + 3] & 255) << 32) | ((bArr[i8] & 255) << 56) | ((bArr[i8 + 1] & 255) << 48) | ((bArr[i8 + 2] & 255) << 40) | ((bArr[i8 + 4] & 255) << 24) | ((bArr[i8 + 5] & 255) << 16) | ((bArr[i8 + 6] & 255) << 8);
        int i11 = i8 + 8;
        long j9 = j8 | (bArr[i10] & 255);
        setSize$okio(size() - 8);
        if (i11 == i9) {
            this.head = t0Var.pop();
            u0.recycle(t0Var);
        } else {
            t0Var.pos = i11;
        }
        return j9;
    }

    @Override // okio.e
    public long readLongLe() {
        return d1.reverseBytes(readLong());
    }

    @Override // okio.e
    public short readShort() {
        if (size() < 2) {
            throw new EOFException();
        }
        t0 t0Var = this.head;
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        int i8 = t0Var.pos;
        int i9 = t0Var.limit;
        if (i9 - i8 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = t0Var.data;
        int i10 = i8 + 1;
        int i11 = (bArr[i8] & 255) << 8;
        int i12 = i8 + 2;
        int i13 = (bArr[i10] & 255) | i11;
        setSize$okio(size() - 2);
        if (i12 == i9) {
            this.head = t0Var.pop();
            u0.recycle(t0Var);
        } else {
            t0Var.pos = i12;
        }
        return (short) i13;
    }

    @Override // okio.e
    public short readShortLe() {
        return d1.reverseBytes(readShort());
    }

    @Override // okio.e
    public String readString(Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        return readString(this.size, charset);
    }

    public final a readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // okio.e
    public String readUtf8() {
        return readString(this.size, kotlin.text.d.UTF_8);
    }

    @Override // okio.e
    public int readUtf8CodePoint() {
        int i8;
        int i9;
        int i10;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b8 = getByte(0L);
        int i11 = 1;
        if ((b8 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
            i8 = b8 & Byte.MAX_VALUE;
            i9 = 1;
            i10 = 0;
        } else if ((b8 & 224) == 192) {
            i8 = b8 & 31;
            i9 = 2;
            i10 = 128;
        } else if ((b8 & 240) == 224) {
            i8 = b8 & 15;
            i9 = 3;
            i10 = 2048;
        } else {
            if ((b8 & a4.a.f64m2) != 240) {
                skip(1L);
                return z0.REPLACEMENT_CODE_POINT;
            }
            i8 = b8 & 7;
            i9 = 4;
            i10 = 65536;
        }
        long j8 = i9;
        if (size() < j8) {
            throw new EOFException("size < " + i9 + ": " + size() + " (to read code point prefixed 0x" + d1.toHexString(b8) + ')');
        }
        if (1 < i9) {
            while (true) {
                int i12 = i11 + 1;
                long j9 = i11;
                byte b9 = getByte(j9);
                if ((b9 & 192) != 128) {
                    skip(j9);
                    return z0.REPLACEMENT_CODE_POINT;
                }
                i8 = (i8 << 6) | (b9 & 63);
                if (i12 >= i9) {
                    break;
                }
                i11 = i12;
            }
        }
        skip(j8);
        return i8 > 1114111 ? z0.REPLACEMENT_CODE_POINT : ((55296 > i8 || i8 > 57343) && i8 >= i10) ? i8 : z0.REPLACEMENT_CODE_POINT;
    }

    @Override // okio.e
    public String readUtf8Line() {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return okio.internal.d.readUtf8Line(this, indexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.e
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.e
    public boolean request(long j8) {
        return this.size >= j8;
    }

    @Override // okio.e
    public void require(long j8) {
        if (this.size < j8) {
            throw new EOFException();
        }
    }

    @Override // okio.e
    public int select(m0 options) {
        kotlin.jvm.internal.s.checkNotNullParameter(options, "options");
        int selectPrefix$default = okio.internal.d.selectPrefix$default(this, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public final void setSize$okio(long j8) {
        this.size = j8;
    }

    public final ByteString sha1() {
        return digest("SHA-1");
    }

    public final ByteString sha256() {
        return digest(org.bouncycastle.pqc.crypto.xmss.o.SHA_256);
    }

    public final ByteString sha512() {
        return digest(org.bouncycastle.pqc.crypto.xmss.o.SHA_512);
    }

    public final long size() {
        return this.size;
    }

    @Override // okio.e
    public void skip(long j8) {
        while (j8 > 0) {
            t0 t0Var = this.head;
            if (t0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j8, t0Var.limit - t0Var.pos);
            long j9 = min;
            setSize$okio(size() - j9);
            j8 -= j9;
            int i8 = t0Var.pos + min;
            t0Var.pos = i8;
            if (i8 == t0Var.limit) {
                this.head = t0Var.pop();
                u0.recycle(t0Var);
            }
        }
    }

    public final ByteString snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(kotlin.jvm.internal.s.stringPlus("size > Int.MAX_VALUE: ", Long.valueOf(size())).toString());
    }

    @Override // okio.e, okio.x0
    public y0 timeout() {
        return y0.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    public final t0 writableSegment$okio(int i8) {
        if (!(i8 >= 1 && i8 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        t0 t0Var = this.head;
        if (t0Var != null) {
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            t0 t0Var2 = t0Var.prev;
            kotlin.jvm.internal.s.checkNotNull(t0Var2);
            return (t0Var2.limit + i8 > 8192 || !t0Var2.owner) ? t0Var2.push(u0.take()) : t0Var2;
        }
        t0 take = u0.take();
        this.head = take;
        take.prev = take;
        take.next = take;
        return take;
    }

    @Override // okio.d
    public long writeAll(x0 source) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        long j8 = 0;
        while (true) {
            long read = source.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j8;
            }
            j8 += read;
        }
    }

    public final c writeTo(OutputStream out) {
        kotlin.jvm.internal.s.checkNotNullParameter(out, "out");
        return writeTo$default(this, out, 0L, 2, null);
    }

    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (c.this.size() > 0) {
                return c.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i8, int i9) {
            kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
            return c.this.read(sink, i8, i9);
        }
    }

    public static /* synthetic */ c copyTo$default(c cVar, c cVar2, long j8, long j9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = 0;
        }
        return cVar.copyTo(cVar2, j8, j9);
    }

    public c clone() {
        return copy();
    }

    public final c copyTo(OutputStream out, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, j8, 0L, 4, (Object) null);
    }

    @Override // okio.e
    public long indexOf(byte b8, long j8) {
        return indexOf(b8, j8, Long.MAX_VALUE);
    }

    @Override // okio.e
    public long indexOfElement(ByteString targetBytes, long j8) {
        int i8;
        int i9;
        kotlin.jvm.internal.s.checkNotNullParameter(targetBytes, "targetBytes");
        long j9 = 0;
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("fromIndex < 0: ", Long.valueOf(j8)).toString());
        }
        t0 t0Var = this.head;
        if (t0Var == null) {
            return -1L;
        }
        if (size() - j8 < j8) {
            j9 = size();
            while (j9 > j8) {
                t0Var = t0Var.prev;
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                j9 -= t0Var.limit - t0Var.pos;
            }
            if (targetBytes.size() == 2) {
                byte b8 = targetBytes.getByte(0);
                byte b9 = targetBytes.getByte(1);
                while (j9 < size()) {
                    byte[] bArr = t0Var.data;
                    i8 = (int) ((t0Var.pos + j8) - j9);
                    int i10 = t0Var.limit;
                    while (i8 < i10) {
                        byte b10 = bArr[i8];
                        if (b10 != b8 && b10 != b9) {
                            i8++;
                        }
                        i9 = t0Var.pos;
                    }
                    j9 += t0Var.limit - t0Var.pos;
                    t0Var = t0Var.next;
                    kotlin.jvm.internal.s.checkNotNull(t0Var);
                    j8 = j9;
                }
                return -1L;
            }
            byte[] internalArray$okio = targetBytes.internalArray$okio();
            while (j9 < size()) {
                byte[] bArr2 = t0Var.data;
                i8 = (int) ((t0Var.pos + j8) - j9);
                int i11 = t0Var.limit;
                while (i8 < i11) {
                    byte b11 = bArr2[i8];
                    int length = internalArray$okio.length;
                    int i12 = 0;
                    while (i12 < length) {
                        byte b12 = internalArray$okio[i12];
                        i12++;
                        if (b11 == b12) {
                            i9 = t0Var.pos;
                        }
                    }
                    i8++;
                }
                j9 += t0Var.limit - t0Var.pos;
                t0Var = t0Var.next;
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                j8 = j9;
            }
            return -1L;
        }
        while (true) {
            long j10 = (t0Var.limit - t0Var.pos) + j9;
            if (j10 > j8) {
                break;
            }
            t0Var = t0Var.next;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            j9 = j10;
        }
        if (targetBytes.size() == 2) {
            byte b13 = targetBytes.getByte(0);
            byte b14 = targetBytes.getByte(1);
            while (j9 < size()) {
                byte[] bArr3 = t0Var.data;
                i8 = (int) ((t0Var.pos + j8) - j9);
                int i13 = t0Var.limit;
                while (i8 < i13) {
                    byte b15 = bArr3[i8];
                    if (b15 != b13 && b15 != b14) {
                        i8++;
                    }
                    i9 = t0Var.pos;
                }
                j9 += t0Var.limit - t0Var.pos;
                t0Var = t0Var.next;
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                j8 = j9;
            }
            return -1L;
        }
        byte[] internalArray$okio2 = targetBytes.internalArray$okio();
        while (j9 < size()) {
            byte[] bArr4 = t0Var.data;
            i8 = (int) ((t0Var.pos + j8) - j9);
            int i14 = t0Var.limit;
            while (i8 < i14) {
                byte b16 = bArr4[i8];
                int length2 = internalArray$okio2.length;
                int i15 = 0;
                while (i15 < length2) {
                    byte b17 = internalArray$okio2[i15];
                    i15++;
                    if (b16 == b17) {
                        i9 = t0Var.pos;
                    }
                }
                i8++;
            }
            j9 += t0Var.limit - t0Var.pos;
            t0Var = t0Var.next;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            j8 = j9;
        }
        return -1L;
        return (i8 - i9) + j9;
    }

    @Override // okio.e
    public boolean rangeEquals(long j8, ByteString bytes, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        if (j8 < 0 || i8 < 0 || i9 < 0 || size() - j8 < i9 || bytes.size() - i8 < i9) {
            return false;
        }
        if (i9 > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (getByte(i10 + j8) != bytes.getByte(i10 + i8)) {
                    return false;
                }
                if (i11 >= i9) {
                    break;
                }
                i10 = i11;
            }
        }
        return true;
    }

    public final a readAndWriteUnsafe(a unsafeCursor) {
        kotlin.jvm.internal.s.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return okio.internal.d.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @Override // okio.e
    public byte[] readByteArray(long j8) {
        if (!(j8 >= 0 && j8 <= 2147483647L)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount: ", Long.valueOf(j8)).toString());
        }
        if (size() < j8) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j8];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.e
    public ByteString readByteString(long j8) {
        if (!(j8 >= 0 && j8 <= 2147483647L)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount: ", Long.valueOf(j8)).toString());
        }
        if (size() < j8) {
            throw new EOFException();
        }
        if (j8 < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new ByteString(readByteArray(j8));
        }
        ByteString snapshot = snapshot((int) j8);
        skip(j8);
        return snapshot;
    }

    public final c readFrom(InputStream input, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
        }
        readFrom(input, j8, false);
        return this;
    }

    @Override // okio.e
    public String readString(long j8, Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        if (!(j8 >= 0 && j8 <= 2147483647L)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount: ", Long.valueOf(j8)).toString());
        }
        if (this.size < j8) {
            throw new EOFException();
        }
        if (j8 == 0) {
            return "";
        }
        t0 t0Var = this.head;
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        int i8 = t0Var.pos;
        if (i8 + j8 > t0Var.limit) {
            return new String(readByteArray(j8), charset);
        }
        int i9 = (int) j8;
        String str = new String(t0Var.data, i8, i9, charset);
        int i10 = t0Var.pos + i9;
        t0Var.pos = i10;
        this.size -= j8;
        if (i10 == t0Var.limit) {
            this.head = t0Var.pop();
            u0.recycle(t0Var);
        }
        return str;
    }

    public final a readUnsafe(a unsafeCursor) {
        kotlin.jvm.internal.s.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return okio.internal.d.commonReadUnsafe(this, unsafeCursor);
    }

    @Override // okio.e
    public String readUtf8(long j8) {
        return readString(j8, kotlin.text.d.UTF_8);
    }

    @Override // okio.e
    public String readUtf8LineStrict(long j8) {
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("limit < 0: ", Long.valueOf(j8)).toString());
        }
        long j9 = j8 != Long.MAX_VALUE ? j8 + 1 : Long.MAX_VALUE;
        byte b8 = (byte) 10;
        long indexOf = indexOf(b8, 0L, j9);
        if (indexOf != -1) {
            return okio.internal.d.readUtf8Line(this, indexOf);
        }
        if (j9 < size() && getByte(j9 - 1) == ((byte) 13) && getByte(j9) == b8) {
            return okio.internal.d.readUtf8Line(this, j9);
        }
        c cVar = new c();
        copyTo(cVar, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j8) + " content=" + cVar.readByteString().hex() + (char) 8230);
    }

    @Override // okio.d
    public c writeByte(int i8) {
        t0 writableSegment$okio = writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i9 = writableSegment$okio.limit;
        writableSegment$okio.limit = i9 + 1;
        bArr[i9] = (byte) i8;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.d
    public c writeDecimalLong(long j8) {
        boolean z7;
        if (j8 == 0) {
            return writeByte(48);
        }
        int i8 = 1;
        if (j8 < 0) {
            j8 = -j8;
            if (j8 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z7 = true;
        } else {
            z7 = false;
        }
        if (j8 >= 100000000) {
            i8 = j8 < MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US ? j8 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j8 < C.NANOS_PER_SECOND ? 9 : 10 : j8 < 100000000000L ? 11 : 12 : j8 < 1000000000000000L ? j8 < 10000000000000L ? 13 : j8 < 100000000000000L ? 14 : 15 : j8 < 100000000000000000L ? j8 < 10000000000000000L ? 16 : 17 : j8 < 1000000000000000000L ? 18 : 19;
        } else if (j8 >= 10000) {
            i8 = j8 < 1000000 ? j8 < 100000 ? 5 : 6 : j8 < 10000000 ? 7 : 8;
        } else if (j8 >= 100) {
            i8 = j8 < 1000 ? 3 : 4;
        } else if (j8 >= 10) {
            i8 = 2;
        }
        if (z7) {
            i8++;
        }
        t0 writableSegment$okio = writableSegment$okio(i8);
        byte[] bArr = writableSegment$okio.data;
        int i9 = writableSegment$okio.limit + i8;
        while (j8 != 0) {
            long j9 = 10;
            i9--;
            bArr[i9] = okio.internal.d.getHEX_DIGIT_BYTES()[(int) (j8 % j9)];
            j8 /= j9;
        }
        if (z7) {
            bArr[i9 - 1] = (byte) 45;
        }
        writableSegment$okio.limit += i8;
        setSize$okio(size() + i8);
        return this;
    }

    @Override // okio.d
    public c writeHexadecimalUnsignedLong(long j8) {
        if (j8 == 0) {
            return writeByte(48);
        }
        long j9 = (j8 >>> 1) | j8;
        long j10 = j9 | (j9 >>> 2);
        long j11 = j10 | (j10 >>> 4);
        long j12 = j11 | (j11 >>> 8);
        long j13 = j12 | (j12 >>> 16);
        long j14 = j13 | (j13 >>> 32);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i8 = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + 3) / 4);
        t0 writableSegment$okio = writableSegment$okio(i8);
        byte[] bArr = writableSegment$okio.data;
        int i9 = writableSegment$okio.limit;
        for (int i10 = (i9 + i8) - 1; i10 >= i9; i10--) {
            bArr[i10] = okio.internal.d.getHEX_DIGIT_BYTES()[(int) (15 & j8)];
            j8 >>>= 4;
        }
        writableSegment$okio.limit += i8;
        setSize$okio(size() + i8);
        return this;
    }

    @Override // okio.d
    public c writeInt(int i8) {
        t0 writableSegment$okio = writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i9 = writableSegment$okio.limit;
        bArr[i9] = (byte) ((i8 >>> 24) & 255);
        bArr[i9 + 1] = (byte) ((i8 >>> 16) & 255);
        bArr[i9 + 2] = (byte) ((i8 >>> 8) & 255);
        bArr[i9 + 3] = (byte) (i8 & 255);
        writableSegment$okio.limit = i9 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.d
    public c writeIntLe(int i8) {
        return writeInt(d1.reverseBytes(i8));
    }

    @Override // okio.d
    public c writeLong(long j8) {
        t0 writableSegment$okio = writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i8 = writableSegment$okio.limit;
        bArr[i8] = (byte) ((j8 >>> 56) & 255);
        bArr[i8 + 1] = (byte) ((j8 >>> 48) & 255);
        bArr[i8 + 2] = (byte) ((j8 >>> 40) & 255);
        bArr[i8 + 3] = (byte) ((j8 >>> 32) & 255);
        bArr[i8 + 4] = (byte) ((j8 >>> 24) & 255);
        bArr[i8 + 5] = (byte) ((j8 >>> 16) & 255);
        bArr[i8 + 6] = (byte) ((j8 >>> 8) & 255);
        bArr[i8 + 7] = (byte) (j8 & 255);
        writableSegment$okio.limit = i8 + 8;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.d
    public c writeLongLe(long j8) {
        return writeLong(d1.reverseBytes(j8));
    }

    @Override // okio.d
    public c writeShort(int i8) {
        t0 writableSegment$okio = writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i9 = writableSegment$okio.limit;
        bArr[i9] = (byte) ((i8 >>> 8) & 255);
        bArr[i9 + 1] = (byte) (i8 & 255);
        writableSegment$okio.limit = i9 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.d
    public c writeShortLe(int i8) {
        return writeShort((int) d1.reverseBytes((short) i8));
    }

    public final c writeTo(OutputStream out, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(out, "out");
        d1.checkOffsetAndCount(this.size, 0L, j8);
        t0 t0Var = this.head;
        while (j8 > 0) {
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            int min = (int) Math.min(j8, t0Var.limit - t0Var.pos);
            out.write(t0Var.data, t0Var.pos, min);
            int i8 = t0Var.pos + min;
            t0Var.pos = i8;
            long j9 = min;
            this.size -= j9;
            j8 -= j9;
            if (i8 == t0Var.limit) {
                t0 pop = t0Var.pop();
                this.head = pop;
                u0.recycle(t0Var);
                t0Var = pop;
            }
        }
        return this;
    }

    @Override // okio.d
    public c writeUtf8CodePoint(int i8) {
        if (i8 < 128) {
            writeByte(i8);
        } else if (i8 < 2048) {
            t0 writableSegment$okio = writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i9 = writableSegment$okio.limit;
            bArr[i9] = (byte) ((i8 >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i9 + 1] = (byte) ((i8 & 63) | 128);
            writableSegment$okio.limit = i9 + 2;
            setSize$okio(size() + 2);
        } else if (55296 <= i8 && i8 <= 57343) {
            writeByte(63);
        } else if (i8 < 65536) {
            t0 writableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i10 = writableSegment$okio2.limit;
            bArr2[i10] = (byte) ((i8 >> 12) | 224);
            bArr2[i10 + 1] = (byte) (((i8 >> 6) & 63) | 128);
            bArr2[i10 + 2] = (byte) ((i8 & 63) | 128);
            writableSegment$okio2.limit = i10 + 3;
            setSize$okio(size() + 3);
        } else {
            if (i8 > 1114111) {
                throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("Unexpected code point: 0x", d1.toHexString(i8)));
            }
            t0 writableSegment$okio3 = writableSegment$okio(4);
            byte[] bArr3 = writableSegment$okio3.data;
            int i11 = writableSegment$okio3.limit;
            bArr3[i11] = (byte) ((i8 >> 18) | 240);
            bArr3[i11 + 1] = (byte) (((i8 >> 12) & 63) | 128);
            bArr3[i11 + 2] = (byte) (((i8 >> 6) & 63) | 128);
            bArr3[i11 + 3] = (byte) ((i8 & 63) | 128);
            writableSegment$okio3.limit = i11 + 4;
            setSize$okio(size() + 4);
        }
        return this;
    }

    public static /* synthetic */ c copyTo$default(c cVar, c cVar2, long j8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = 0;
        }
        return cVar.copyTo(cVar2, j8);
    }

    public final c copyTo(OutputStream out, long j8, long j9) {
        kotlin.jvm.internal.s.checkNotNullParameter(out, "out");
        d1.checkOffsetAndCount(this.size, j8, j9);
        if (j9 == 0) {
            return this;
        }
        t0 t0Var = this.head;
        while (true) {
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            int i8 = t0Var.limit;
            int i9 = t0Var.pos;
            if (j8 < i8 - i9) {
                break;
            }
            j8 -= i8 - i9;
            t0Var = t0Var.next;
        }
        while (j9 > 0) {
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            int min = (int) Math.min(t0Var.limit - r10, j9);
            out.write(t0Var.data, (int) (t0Var.pos + j8), min);
            j9 -= min;
            t0Var = t0Var.next;
            j8 = 0;
        }
        return this;
    }

    @Override // okio.e
    public long indexOf(ByteString bytes) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.d
    public c writeString(String string, Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @Override // okio.d
    public c writeUtf8(String string) {
        kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    private final void readFrom(InputStream inputStream, long j8, boolean z7) {
        while (true) {
            if (j8 <= 0 && !z7) {
                return;
            }
            t0 writableSegment$okio = writableSegment$okio(1);
            int read = inputStream.read(writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j8, 8192 - writableSegment$okio.limit));
            if (read == -1) {
                if (writableSegment$okio.pos == writableSegment$okio.limit) {
                    this.head = writableSegment$okio.pop();
                    u0.recycle(writableSegment$okio);
                }
                if (!z7) {
                    throw new EOFException();
                }
                return;
            }
            writableSegment$okio.limit += read;
            long j9 = read;
            this.size += j9;
            j8 -= j9;
        }
    }

    @Override // okio.e
    public long indexOf(byte b8, long j8, long j9) {
        t0 t0Var;
        int i8;
        long j10 = j8;
        long j11 = j9;
        boolean z7 = false;
        long j12 = 0;
        if (0 <= j10 && j10 <= j11) {
            z7 = true;
        }
        if (!z7) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        long j13 = j11;
        if (j10 == j13 || (t0Var = this.head) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            j12 = size();
            while (j12 > j10) {
                t0Var = t0Var.prev;
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                j12 -= t0Var.limit - t0Var.pos;
            }
            while (j12 < j13) {
                byte[] bArr = t0Var.data;
                int min = (int) Math.min(t0Var.limit, (t0Var.pos + j13) - j12);
                i8 = (int) ((t0Var.pos + j10) - j12);
                while (i8 < min) {
                    if (bArr[i8] != b8) {
                        i8++;
                    }
                }
                j12 += t0Var.limit - t0Var.pos;
                t0Var = t0Var.next;
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                j10 = j12;
            }
            return -1L;
        }
        while (true) {
            long j14 = (t0Var.limit - t0Var.pos) + j12;
            if (j14 > j10) {
                break;
            }
            t0Var = t0Var.next;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            j12 = j14;
        }
        while (j12 < j13) {
            byte[] bArr2 = t0Var.data;
            int min2 = (int) Math.min(t0Var.limit, (t0Var.pos + j13) - j12);
            i8 = (int) ((t0Var.pos + j10) - j12);
            while (i8 < min2) {
                if (bArr2[i8] != b8) {
                    i8++;
                }
            }
            j12 += t0Var.limit - t0Var.pos;
            t0Var = t0Var.next;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            j10 = j12;
        }
        return -1L;
        return (i8 - t0Var.pos) + j12;
    }

    public final ByteString snapshot(int i8) {
        if (i8 == 0) {
            return ByteString.EMPTY;
        }
        d1.checkOffsetAndCount(size(), 0L, i8);
        t0 t0Var = this.head;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            int i12 = t0Var.limit;
            int i13 = t0Var.pos;
            if (i12 != i13) {
                i10 += i12 - i13;
                i11++;
                t0Var = t0Var.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i11][];
        int[] iArr = new int[i11 * 2];
        t0 t0Var2 = this.head;
        int i14 = 0;
        while (i9 < i8) {
            kotlin.jvm.internal.s.checkNotNull(t0Var2);
            bArr[i14] = t0Var2.data;
            i9 += t0Var2.limit - t0Var2.pos;
            iArr[i14] = Math.min(i9, i8);
            iArr[i14 + i11] = t0Var2.pos;
            t0Var2.shared = true;
            i14++;
            t0Var2 = t0Var2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.d
    public c writeUtf8(String string, int i8, int i9) {
        char charAt;
        kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("beginIndex < 0: ", Integer.valueOf(i8)).toString());
        }
        if (i9 >= i8) {
            if (!(i9 <= string.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i9 + " > " + string.length()).toString());
            }
            while (i8 < i9) {
                char charAt2 = string.charAt(i8);
                if (charAt2 < 128) {
                    t0 writableSegment$okio = writableSegment$okio(1);
                    byte[] bArr = writableSegment$okio.data;
                    int i10 = writableSegment$okio.limit - i8;
                    int min = Math.min(i9, 8192 - i10);
                    int i11 = i8 + 1;
                    bArr[i8 + i10] = (byte) charAt2;
                    while (true) {
                        i8 = i11;
                        if (i8 >= min || (charAt = string.charAt(i8)) >= 128) {
                            break;
                        }
                        i11 = i8 + 1;
                        bArr[i8 + i10] = (byte) charAt;
                    }
                    int i12 = writableSegment$okio.limit;
                    int i13 = (i10 + i8) - i12;
                    writableSegment$okio.limit = i12 + i13;
                    setSize$okio(size() + i13);
                } else {
                    if (charAt2 < 2048) {
                        t0 writableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = writableSegment$okio2.data;
                        int i14 = writableSegment$okio2.limit;
                        bArr2[i14] = (byte) ((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        bArr2[i14 + 1] = (byte) ((charAt2 & '?') | 128);
                        writableSegment$okio2.limit = i14 + 2;
                        setSize$okio(size() + 2);
                    } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                        int i15 = i8 + 1;
                        char charAt3 = i15 < i9 ? string.charAt(i15) : (char) 0;
                        if (charAt2 <= 56319 && 56320 <= charAt3 && charAt3 <= 57343) {
                            int i16 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            t0 writableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = writableSegment$okio3.data;
                            int i17 = writableSegment$okio3.limit;
                            bArr3[i17] = (byte) ((i16 >> 18) | 240);
                            bArr3[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                            bArr3[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                            bArr3[i17 + 3] = (byte) ((i16 & 63) | 128);
                            writableSegment$okio3.limit = i17 + 4;
                            setSize$okio(size() + 4);
                            i8 += 2;
                        } else {
                            writeByte(63);
                            i8 = i15;
                        }
                    } else {
                        t0 writableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = writableSegment$okio4.data;
                        int i18 = writableSegment$okio4.limit;
                        bArr4[i18] = (byte) ((charAt2 >> '\f') | 224);
                        bArr4[i18 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr4[i18 + 2] = (byte) ((charAt2 & '?') | 128);
                        writableSegment$okio4.limit = i18 + 3;
                        setSize$okio(size() + 3);
                    }
                    i8++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i9 + " < " + i8).toString());
    }

    @Override // okio.e
    public void readFully(byte[] sink) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        int i8 = 0;
        while (i8 < sink.length) {
            int read = read(sink, i8, sink.length - i8);
            if (read == -1) {
                throw new EOFException();
            }
            i8 += read;
        }
    }

    @Override // okio.d
    public c writeString(String string, int i8, int i9, Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("beginIndex < 0: ", Integer.valueOf(i8)).toString());
        }
        if (i9 >= i8) {
            if (i9 <= string.length()) {
                if (kotlin.jvm.internal.s.areEqual(charset, kotlin.text.d.UTF_8)) {
                    return writeUtf8(string, i8, i9);
                }
                String substring = string.substring(i8, i9);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (substring != null) {
                    byte[] bytes = substring.getBytes(charset);
                    kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    return write(bytes, 0, bytes.length);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new IllegalArgumentException(("endIndex > string.length: " + i9 + " > " + string.length()).toString());
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i9 + " < " + i8).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i8 = remaining;
        while (i8 > 0) {
            t0 writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i8, 8192 - writableSegment$okio.limit);
            source.get(writableSegment$okio.data, writableSegment$okio.limit, min);
            i8 -= min;
            writableSegment$okio.limit += min;
        }
        this.size += remaining;
        return remaining;
    }

    @Override // okio.e
    public int read(byte[] sink) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.e
    public int read(byte[] sink, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        d1.checkOffsetAndCount(sink.length, i8, i9);
        t0 t0Var = this.head;
        if (t0Var == null) {
            return -1;
        }
        int min = Math.min(i9, t0Var.limit - t0Var.pos);
        byte[] bArr = t0Var.data;
        int i10 = t0Var.pos;
        kotlin.collections.k.copyInto(bArr, sink, i8, i10, i10 + min);
        t0Var.pos += min;
        setSize$okio(size() - min);
        if (t0Var.pos == t0Var.limit) {
            this.head = t0Var.pop();
            u0.recycle(t0Var);
        }
        return min;
    }

    public final c copyTo(c out, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(out, "out");
        return copyTo(out, j8, this.size - j8);
    }

    @Override // okio.d
    public c write(ByteString byteString) {
        kotlin.jvm.internal.s.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    public final c copyTo(c out, long j8, long j9) {
        kotlin.jvm.internal.s.checkNotNullParameter(out, "out");
        d1.checkOffsetAndCount(size(), j8, j9);
        if (j9 != 0) {
            out.setSize$okio(out.size() + j9);
            t0 t0Var = this.head;
            while (true) {
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                int i8 = t0Var.limit;
                int i9 = t0Var.pos;
                if (j8 < i8 - i9) {
                    break;
                }
                j8 -= i8 - i9;
                t0Var = t0Var.next;
            }
            while (j9 > 0) {
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                t0 sharedCopy = t0Var.sharedCopy();
                int i10 = sharedCopy.pos + ((int) j8);
                sharedCopy.pos = i10;
                sharedCopy.limit = Math.min(i10 + ((int) j9), sharedCopy.limit);
                t0 t0Var2 = out.head;
                if (t0Var2 == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy;
                    out.head = sharedCopy;
                } else {
                    kotlin.jvm.internal.s.checkNotNull(t0Var2);
                    t0 t0Var3 = t0Var2.prev;
                    kotlin.jvm.internal.s.checkNotNull(t0Var3);
                    t0Var3.push(sharedCopy);
                }
                j9 -= sharedCopy.limit - sharedCopy.pos;
                t0Var = t0Var.next;
                j8 = 0;
            }
        }
        return this;
    }

    @Override // okio.d
    public c write(ByteString byteString, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, i8, i9);
        return this;
    }

    @Override // okio.d
    public c write(byte[] source) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.d
    public c write(byte[] source, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        long j8 = i9;
        d1.checkOffsetAndCount(source.length, i8, j8);
        int i10 = i9 + i8;
        while (i8 < i10) {
            t0 writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i10 - i8, 8192 - writableSegment$okio.limit);
            int i11 = i8 + min;
            kotlin.collections.k.copyInto(source, writableSegment$okio.data, writableSegment$okio.limit, i8, i11);
            writableSegment$okio.limit += min;
            i8 = i11;
        }
        setSize$okio(size() + j8);
        return this;
    }

    @Override // okio.e, okio.x0
    public long read(c sink, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j8 > size()) {
            j8 = size();
        }
        sink.write(this, j8);
        return j8;
    }

    @Override // okio.d
    public c write(x0 source, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        while (j8 > 0) {
            long read = source.read(this, j8);
            if (read == -1) {
                throw new EOFException();
            }
            j8 -= read;
        }
        return this;
    }

    @Override // okio.e
    public long indexOf(ByteString bytes, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(bytes, "bytes");
        if (!(bytes.size() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j9 = 0;
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("fromIndex < 0: ", Long.valueOf(j8)).toString());
        }
        t0 t0Var = this.head;
        if (t0Var != null) {
            if (size() - j8 < j8) {
                long size = size();
                while (size > j8) {
                    t0Var = t0Var.prev;
                    kotlin.jvm.internal.s.checkNotNull(t0Var);
                    size -= t0Var.limit - t0Var.pos;
                }
                byte[] internalArray$okio = bytes.internalArray$okio();
                byte b8 = internalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (size() - size2) + 1;
                t0 t0Var2 = t0Var;
                long j10 = size;
                long j11 = j8;
                while (j10 < size3) {
                    byte[] bArr = t0Var2.data;
                    long j12 = j11;
                    int min = (int) Math.min(t0Var2.limit, (t0Var2.pos + size3) - j10);
                    int i8 = (int) ((t0Var2.pos + j12) - j10);
                    if (i8 < min) {
                        while (true) {
                            int i9 = i8 + 1;
                            if (bArr[i8] == b8 && okio.internal.d.rangeEquals(t0Var2, i9, internalArray$okio, 1, size2)) {
                                return (i8 - t0Var2.pos) + j10;
                            }
                            if (i9 >= min) {
                                break;
                            }
                            i8 = i9;
                        }
                    }
                    j10 += t0Var2.limit - t0Var2.pos;
                    t0Var2 = t0Var2.next;
                    kotlin.jvm.internal.s.checkNotNull(t0Var2);
                    j11 = j10;
                }
            } else {
                while (true) {
                    long j13 = (t0Var.limit - t0Var.pos) + j9;
                    if (j13 > j8) {
                        break;
                    }
                    t0Var = t0Var.next;
                    kotlin.jvm.internal.s.checkNotNull(t0Var);
                    j9 = j13;
                }
                byte[] internalArray$okio2 = bytes.internalArray$okio();
                byte b9 = internalArray$okio2[0];
                int size4 = bytes.size();
                long size5 = (size() - size4) + 1;
                long j14 = j9;
                long j15 = j8;
                while (j14 < size5) {
                    byte[] bArr2 = t0Var.data;
                    long j16 = size5;
                    int min2 = (int) Math.min(t0Var.limit, (t0Var.pos + size5) - j14);
                    int i10 = (int) ((t0Var.pos + j15) - j14);
                    if (i10 < min2) {
                        while (true) {
                            int i11 = i10 + 1;
                            if (bArr2[i10] == b9 && okio.internal.d.rangeEquals(t0Var, i11, internalArray$okio2, 1, size4)) {
                                return (i10 - t0Var.pos) + j14;
                            }
                            if (i11 >= min2) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    j14 += t0Var.limit - t0Var.pos;
                    t0Var = t0Var.next;
                    kotlin.jvm.internal.s.checkNotNull(t0Var);
                    j15 = j14;
                    size5 = j16;
                }
            }
        }
        return -1L;
    }

    @Override // okio.d, okio.v0
    public void write(c source, long j8) {
        t0 t0Var;
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        if (source != this) {
            d1.checkOffsetAndCount(source.size(), 0L, j8);
            while (j8 > 0) {
                t0 t0Var2 = source.head;
                kotlin.jvm.internal.s.checkNotNull(t0Var2);
                int i8 = t0Var2.limit;
                kotlin.jvm.internal.s.checkNotNull(source.head);
                if (j8 < i8 - r2.pos) {
                    t0 t0Var3 = this.head;
                    if (t0Var3 != null) {
                        kotlin.jvm.internal.s.checkNotNull(t0Var3);
                        t0Var = t0Var3.prev;
                    } else {
                        t0Var = null;
                    }
                    if (t0Var != null && t0Var.owner) {
                        if ((t0Var.limit + j8) - (t0Var.shared ? 0 : t0Var.pos) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            t0 t0Var4 = source.head;
                            kotlin.jvm.internal.s.checkNotNull(t0Var4);
                            t0Var4.writeTo(t0Var, (int) j8);
                            source.setSize$okio(source.size() - j8);
                            setSize$okio(size() + j8);
                            return;
                        }
                    }
                    t0 t0Var5 = source.head;
                    kotlin.jvm.internal.s.checkNotNull(t0Var5);
                    source.head = t0Var5.split((int) j8);
                }
                t0 t0Var6 = source.head;
                kotlin.jvm.internal.s.checkNotNull(t0Var6);
                long j9 = t0Var6.limit - t0Var6.pos;
                source.head = t0Var6.pop();
                t0 t0Var7 = this.head;
                if (t0Var7 == null) {
                    this.head = t0Var6;
                    t0Var6.prev = t0Var6;
                    t0Var6.next = t0Var6;
                } else {
                    kotlin.jvm.internal.s.checkNotNull(t0Var7);
                    t0 t0Var8 = t0Var7.prev;
                    kotlin.jvm.internal.s.checkNotNull(t0Var8);
                    t0Var8.push(t0Var6).compact();
                }
                source.setSize$okio(source.size() - j9);
                setSize$okio(size() + j9);
                j8 -= j9;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }
}
