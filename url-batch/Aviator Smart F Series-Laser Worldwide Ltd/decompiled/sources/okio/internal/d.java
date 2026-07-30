package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.primitives.UnsignedBytes;
import f6.p;
import java.io.EOFException;
import kotlin.collections.k;
import kotlin.jvm.internal.s;
import okhttp3.internal.connection.RealConnection;
import okio.ByteString;
import okio.SegmentedByteString;
import okio.c;
import okio.c1;
import okio.d1;
import okio.m0;
import okio.t0;
import okio.u0;
import okio.v0;
import okio.x0;
import okio.z0;

/* loaded from: classes5.dex */
public abstract class d {
    private static final byte[] HEX_DIGIT_BYTES = c1.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(okio.c cVar) {
        s.checkNotNullParameter(cVar, "<this>");
        cVar.skip(cVar.size());
    }

    public static final void commonClose(c.a aVar) {
        s.checkNotNullParameter(aVar, "<this>");
        if (!(aVar.buffer != null)) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        aVar.buffer = null;
        aVar.setSegment$okio(null);
        aVar.offset = -1L;
        aVar.data = null;
        aVar.start = -1;
        aVar.end = -1;
    }

    public static final long commonCompleteSegmentByteCount(okio.c cVar) {
        s.checkNotNullParameter(cVar, "<this>");
        long size = cVar.size();
        if (size == 0) {
            return 0L;
        }
        t0 t0Var = cVar.head;
        s.checkNotNull(t0Var);
        t0 t0Var2 = t0Var.prev;
        s.checkNotNull(t0Var2);
        return (t0Var2.limit >= 8192 || !t0Var2.owner) ? size : size - (r2 - t0Var2.pos);
    }

    public static final okio.c commonCopy(okio.c cVar) {
        s.checkNotNullParameter(cVar, "<this>");
        okio.c cVar2 = new okio.c();
        if (cVar.size() == 0) {
            return cVar2;
        }
        t0 t0Var = cVar.head;
        s.checkNotNull(t0Var);
        t0 sharedCopy = t0Var.sharedCopy();
        cVar2.head = sharedCopy;
        sharedCopy.prev = sharedCopy;
        sharedCopy.next = sharedCopy;
        for (t0 t0Var2 = t0Var.next; t0Var2 != t0Var; t0Var2 = t0Var2.next) {
            t0 t0Var3 = sharedCopy.prev;
            s.checkNotNull(t0Var3);
            s.checkNotNull(t0Var2);
            t0Var3.push(t0Var2.sharedCopy());
        }
        cVar2.setSize$okio(cVar.size());
        return cVar2;
    }

    public static final okio.c commonCopyTo(okio.c cVar, okio.c out, long j8, long j9) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(out, "out");
        d1.checkOffsetAndCount(cVar.size(), j8, j9);
        if (j9 == 0) {
            return cVar;
        }
        out.setSize$okio(out.size() + j9);
        t0 t0Var = cVar.head;
        while (true) {
            s.checkNotNull(t0Var);
            int i8 = t0Var.limit;
            int i9 = t0Var.pos;
            if (j8 < i8 - i9) {
                break;
            }
            j8 -= i8 - i9;
            t0Var = t0Var.next;
        }
        while (j9 > 0) {
            s.checkNotNull(t0Var);
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
                s.checkNotNull(t0Var2);
                t0 t0Var3 = t0Var2.prev;
                s.checkNotNull(t0Var3);
                t0Var3.push(sharedCopy);
            }
            j9 -= sharedCopy.limit - sharedCopy.pos;
            t0Var = t0Var.next;
            j8 = 0;
        }
        return cVar;
    }

    public static final boolean commonEquals(okio.c cVar, Object obj) {
        s.checkNotNullParameter(cVar, "<this>");
        if (cVar == obj) {
            return true;
        }
        if (!(obj instanceof okio.c)) {
            return false;
        }
        okio.c cVar2 = (okio.c) obj;
        if (cVar.size() != cVar2.size()) {
            return false;
        }
        if (cVar.size() == 0) {
            return true;
        }
        t0 t0Var = cVar.head;
        s.checkNotNull(t0Var);
        t0 t0Var2 = cVar2.head;
        s.checkNotNull(t0Var2);
        int i8 = t0Var.pos;
        int i9 = t0Var2.pos;
        long j8 = 0;
        while (j8 < cVar.size()) {
            long min = Math.min(t0Var.limit - i8, t0Var2.limit - i9);
            if (0 < min) {
                long j9 = 0;
                while (true) {
                    j9++;
                    int i10 = i8 + 1;
                    int i11 = i9 + 1;
                    if (t0Var.data[i8] != t0Var2.data[i9]) {
                        return false;
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
                s.checkNotNull(t0Var);
                i8 = t0Var.pos;
            }
            if (i9 == t0Var2.limit) {
                t0Var2 = t0Var2.next;
                s.checkNotNull(t0Var2);
                i9 = t0Var2.pos;
            }
            j8 += min;
        }
        return true;
    }

    public static final long commonExpandBuffer(c.a aVar, int i8) {
        s.checkNotNullParameter(aVar, "<this>");
        if (!(i8 > 0)) {
            throw new IllegalArgumentException(s.stringPlus("minByteCount <= 0: ", Integer.valueOf(i8)).toString());
        }
        if (!(i8 <= 8192)) {
            throw new IllegalArgumentException(s.stringPlus("minByteCount > Segment.SIZE: ", Integer.valueOf(i8)).toString());
        }
        okio.c cVar = aVar.buffer;
        if (cVar == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!aVar.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
        }
        long size = cVar.size();
        t0 writableSegment$okio = cVar.writableSegment$okio(i8);
        int i9 = 8192 - writableSegment$okio.limit;
        writableSegment$okio.limit = 8192;
        long j8 = i9;
        cVar.setSize$okio(size + j8);
        aVar.setSegment$okio(writableSegment$okio);
        aVar.offset = size;
        aVar.data = writableSegment$okio.data;
        aVar.start = 8192 - i9;
        aVar.end = 8192;
        return j8;
    }

    public static final byte commonGet(okio.c cVar, long j8) {
        s.checkNotNullParameter(cVar, "<this>");
        d1.checkOffsetAndCount(cVar.size(), j8, 1L);
        t0 t0Var = cVar.head;
        if (t0Var == null) {
            s.checkNotNull(null);
            throw null;
        }
        if (cVar.size() - j8 < j8) {
            long size = cVar.size();
            while (size > j8) {
                t0Var = t0Var.prev;
                s.checkNotNull(t0Var);
                size -= t0Var.limit - t0Var.pos;
            }
            s.checkNotNull(t0Var);
            return t0Var.data[(int) ((t0Var.pos + j8) - size)];
        }
        long j9 = 0;
        while (true) {
            long j10 = (t0Var.limit - t0Var.pos) + j9;
            if (j10 > j8) {
                s.checkNotNull(t0Var);
                return t0Var.data[(int) ((t0Var.pos + j8) - j9)];
            }
            t0Var = t0Var.next;
            s.checkNotNull(t0Var);
            j9 = j10;
        }
    }

    public static final int commonHashCode(okio.c cVar) {
        s.checkNotNullParameter(cVar, "<this>");
        t0 t0Var = cVar.head;
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
            s.checkNotNull(t0Var);
        } while (t0Var != cVar.head);
        return i8;
    }

    public static final long commonIndexOf(okio.c cVar, byte b8, long j8, long j9) {
        t0 t0Var;
        long j10 = j8;
        long j11 = j9;
        s.checkNotNullParameter(cVar, "<this>");
        boolean z7 = false;
        long j12 = 0;
        if (0 <= j10 && j10 <= j11) {
            z7 = true;
        }
        if (!z7) {
            throw new IllegalArgumentException(("size=" + cVar.size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > cVar.size()) {
            j11 = cVar.size();
        }
        long j13 = j11;
        if (j10 == j13 || (t0Var = cVar.head) == null) {
            return -1L;
        }
        if (cVar.size() - j10 < j10) {
            long size = cVar.size();
            while (size > j10) {
                t0Var = t0Var.prev;
                s.checkNotNull(t0Var);
                size -= t0Var.limit - t0Var.pos;
            }
            while (size < j13) {
                byte[] bArr = t0Var.data;
                int min = (int) Math.min(t0Var.limit, (t0Var.pos + j13) - size);
                for (int i8 = (int) ((t0Var.pos + j10) - size); i8 < min; i8++) {
                    if (bArr[i8] == b8) {
                        return (i8 - t0Var.pos) + size;
                    }
                }
                size += t0Var.limit - t0Var.pos;
                t0Var = t0Var.next;
                s.checkNotNull(t0Var);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j14 = (t0Var.limit - t0Var.pos) + j12;
            if (j14 > j10) {
                break;
            }
            t0Var = t0Var.next;
            s.checkNotNull(t0Var);
            j12 = j14;
        }
        while (j12 < j13) {
            byte[] bArr2 = t0Var.data;
            int min2 = (int) Math.min(t0Var.limit, (t0Var.pos + j13) - j12);
            for (int i9 = (int) ((t0Var.pos + j10) - j12); i9 < min2; i9++) {
                if (bArr2[i9] == b8) {
                    return (i9 - t0Var.pos) + j12;
                }
            }
            j12 += t0Var.limit - t0Var.pos;
            t0Var = t0Var.next;
            s.checkNotNull(t0Var);
            j10 = j12;
        }
        return -1L;
    }

    public static final long commonIndexOfElement(okio.c cVar, ByteString targetBytes, long j8) {
        int i8;
        int i9;
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(targetBytes, "targetBytes");
        long j9 = 0;
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(s.stringPlus("fromIndex < 0: ", Long.valueOf(j8)).toString());
        }
        t0 t0Var = cVar.head;
        if (t0Var == null) {
            return -1L;
        }
        if (cVar.size() - j8 < j8) {
            j9 = cVar.size();
            while (j9 > j8) {
                t0Var = t0Var.prev;
                s.checkNotNull(t0Var);
                j9 -= t0Var.limit - t0Var.pos;
            }
            if (targetBytes.size() == 2) {
                byte b8 = targetBytes.getByte(0);
                byte b9 = targetBytes.getByte(1);
                while (j9 < cVar.size()) {
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
                    s.checkNotNull(t0Var);
                    j8 = j9;
                }
            } else {
                byte[] internalArray$okio = targetBytes.internalArray$okio();
                while (j9 < cVar.size()) {
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
                    s.checkNotNull(t0Var);
                    j8 = j9;
                }
            }
            return -1L;
        }
        while (true) {
            long j10 = (t0Var.limit - t0Var.pos) + j9;
            if (j10 > j8) {
                break;
            }
            t0Var = t0Var.next;
            s.checkNotNull(t0Var);
            j9 = j10;
        }
        if (targetBytes.size() == 2) {
            byte b13 = targetBytes.getByte(0);
            byte b14 = targetBytes.getByte(1);
            while (j9 < cVar.size()) {
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
                s.checkNotNull(t0Var);
                j8 = j9;
            }
        } else {
            byte[] internalArray$okio2 = targetBytes.internalArray$okio();
            while (j9 < cVar.size()) {
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
                s.checkNotNull(t0Var);
                j8 = j9;
            }
        }
        return -1L;
        return (i8 - i9) + j9;
    }

    public static final int commonNext(c.a aVar) {
        s.checkNotNullParameter(aVar, "<this>");
        long j8 = aVar.offset;
        okio.c cVar = aVar.buffer;
        s.checkNotNull(cVar);
        if (!(j8 != cVar.size())) {
            throw new IllegalStateException("no more bytes".toString());
        }
        long j9 = aVar.offset;
        return aVar.seek(j9 == -1 ? 0L : j9 + (aVar.end - aVar.start));
    }

    public static final boolean commonRangeEquals(okio.c cVar, long j8, ByteString bytes, int i8, int i9) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(bytes, "bytes");
        if (j8 < 0 || i8 < 0 || i9 < 0 || cVar.size() - j8 < i9 || bytes.size() - i8 < i9) {
            return false;
        }
        if (i9 <= 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (cVar.getByte(i10 + j8) != bytes.getByte(i10 + i8)) {
                return false;
            }
            if (i11 >= i9) {
                return true;
            }
            i10 = i11;
        }
    }

    public static final int commonRead(okio.c cVar, byte[] sink) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(sink, "sink");
        return cVar.read(sink, 0, sink.length);
    }

    public static final long commonReadAll(okio.c cVar, v0 sink) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(sink, "sink");
        long size = cVar.size();
        if (size > 0) {
            sink.write(cVar, size);
        }
        return size;
    }

    public static final c.a commonReadAndWriteUnsafe(okio.c cVar, c.a unsafeCursor) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        c.a resolveDefaultParameter = d1.resolveDefaultParameter(unsafeCursor);
        if (!(resolveDefaultParameter.buffer == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        resolveDefaultParameter.buffer = cVar;
        resolveDefaultParameter.readWrite = true;
        return resolveDefaultParameter;
    }

    public static final byte commonReadByte(okio.c cVar) {
        s.checkNotNullParameter(cVar, "<this>");
        if (cVar.size() == 0) {
            throw new EOFException();
        }
        t0 t0Var = cVar.head;
        s.checkNotNull(t0Var);
        int i8 = t0Var.pos;
        int i9 = t0Var.limit;
        int i10 = i8 + 1;
        byte b8 = t0Var.data[i8];
        cVar.setSize$okio(cVar.size() - 1);
        if (i10 == i9) {
            cVar.head = t0Var.pop();
            u0.recycle(t0Var);
        } else {
            t0Var.pos = i10;
        }
        return b8;
    }

    public static final byte[] commonReadByteArray(okio.c cVar) {
        s.checkNotNullParameter(cVar, "<this>");
        return cVar.readByteArray(cVar.size());
    }

    public static final ByteString commonReadByteString(okio.c cVar) {
        s.checkNotNullParameter(cVar, "<this>");
        return cVar.readByteString(cVar.size());
    }

    public static final long commonReadDecimalLong(okio.c cVar) {
        s.checkNotNullParameter(cVar, "<this>");
        if (cVar.size() == 0) {
            throw new EOFException();
        }
        int i8 = 0;
        long j8 = 0;
        long j9 = -7;
        boolean z7 = false;
        boolean z8 = false;
        do {
            t0 t0Var = cVar.head;
            s.checkNotNull(t0Var);
            byte[] bArr = t0Var.data;
            int i9 = t0Var.pos;
            int i10 = t0Var.limit;
            while (i9 < i10) {
                byte b8 = bArr[i9];
                byte b9 = (byte) 48;
                if (b8 >= b9 && b8 <= ((byte) 57)) {
                    int i11 = b9 - b8;
                    if (j8 < OVERFLOW_ZONE || (j8 == OVERFLOW_ZONE && i11 < j9)) {
                        okio.c writeByte = new okio.c().writeDecimalLong(j8).writeByte((int) b8);
                        if (!z7) {
                            writeByte.readByte();
                        }
                        throw new NumberFormatException(s.stringPlus("Number too large: ", writeByte.readUtf8()));
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
                cVar.head = t0Var.pop();
                u0.recycle(t0Var);
            } else {
                t0Var.pos = i9;
            }
            if (z8) {
                break;
            }
        } while (cVar.head != null);
        cVar.setSize$okio(cVar.size() - i8);
        if (i8 >= (z7 ? 2 : 1)) {
            return z7 ? j8 : -j8;
        }
        if (cVar.size() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z7 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + d1.toHexString(cVar.getByte(0L)));
    }

    public static final void commonReadFully(okio.c cVar, byte[] sink) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(sink, "sink");
        int i8 = 0;
        while (i8 < sink.length) {
            int read = cVar.read(sink, i8, sink.length - i8);
            if (read == -1) {
                throw new EOFException();
            }
            i8 += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d A[EDGE_INSN: B:39:0x009d->B:36:0x009d BREAK  A[LOOP:0: B:4:0x0012->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long commonReadHexadecimalUnsignedLong(okio.c cVar) {
        int i8;
        s.checkNotNullParameter(cVar, "<this>");
        if (cVar.size() == 0) {
            throw new EOFException();
        }
        int i9 = 0;
        long j8 = 0;
        boolean z7 = false;
        do {
            t0 t0Var = cVar.head;
            s.checkNotNull(t0Var);
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
                            throw new NumberFormatException(s.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", d1.toHexString(b8)));
                        }
                        z7 = true;
                        if (i10 != i11) {
                            cVar.head = t0Var.pop();
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
                    throw new NumberFormatException(s.stringPlus("Number too large: ", new okio.c().writeHexadecimalUnsignedLong(j8).writeByte((int) b8).readUtf8()));
                }
                j8 = (j8 << 4) | i8;
                i10++;
                i9++;
            }
            if (i10 != i11) {
            }
            if (!z7) {
            }
        } while (cVar.head != null);
        cVar.setSize$okio(cVar.size() - i9);
        return j8;
    }

    public static final int commonReadInt(okio.c cVar) {
        s.checkNotNullParameter(cVar, "<this>");
        if (cVar.size() < 4) {
            throw new EOFException();
        }
        t0 t0Var = cVar.head;
        s.checkNotNull(t0Var);
        int i8 = t0Var.pos;
        int i9 = t0Var.limit;
        if (i9 - i8 < 4) {
            return (cVar.readByte() & 255) | ((cVar.readByte() & 255) << 24) | ((cVar.readByte() & 255) << 16) | ((cVar.readByte() & 255) << 8);
        }
        byte[] bArr = t0Var.data;
        int i10 = i8 + 3;
        int i11 = ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 2] & 255) << 8);
        int i12 = i8 + 4;
        int i13 = (bArr[i10] & 255) | i11;
        cVar.setSize$okio(cVar.size() - 4);
        if (i12 == i9) {
            cVar.head = t0Var.pop();
            u0.recycle(t0Var);
        } else {
            t0Var.pos = i12;
        }
        return i13;
    }

    public static final long commonReadLong(okio.c cVar) {
        s.checkNotNullParameter(cVar, "<this>");
        if (cVar.size() < 8) {
            throw new EOFException();
        }
        t0 t0Var = cVar.head;
        s.checkNotNull(t0Var);
        int i8 = t0Var.pos;
        int i9 = t0Var.limit;
        if (i9 - i8 < 8) {
            return ((cVar.readInt() & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) << 32) | (com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 & cVar.readInt());
        }
        byte[] bArr = t0Var.data;
        int i10 = i8 + 7;
        long j8 = ((bArr[i8 + 3] & 255) << 32) | ((bArr[i8] & 255) << 56) | ((bArr[i8 + 1] & 255) << 48) | ((bArr[i8 + 2] & 255) << 40) | ((bArr[i8 + 4] & 255) << 24) | ((bArr[i8 + 5] & 255) << 16) | ((bArr[i8 + 6] & 255) << 8);
        int i11 = i8 + 8;
        long j9 = j8 | (bArr[i10] & 255);
        cVar.setSize$okio(cVar.size() - 8);
        if (i11 == i9) {
            cVar.head = t0Var.pop();
            u0.recycle(t0Var);
        } else {
            t0Var.pos = i11;
        }
        return j9;
    }

    public static final short commonReadShort(okio.c cVar) {
        s.checkNotNullParameter(cVar, "<this>");
        if (cVar.size() < 2) {
            throw new EOFException();
        }
        t0 t0Var = cVar.head;
        s.checkNotNull(t0Var);
        int i8 = t0Var.pos;
        int i9 = t0Var.limit;
        if (i9 - i8 < 2) {
            return (short) ((cVar.readByte() & 255) | ((cVar.readByte() & 255) << 8));
        }
        byte[] bArr = t0Var.data;
        int i10 = i8 + 1;
        int i11 = (bArr[i8] & 255) << 8;
        int i12 = i8 + 2;
        int i13 = (bArr[i10] & 255) | i11;
        cVar.setSize$okio(cVar.size() - 2);
        if (i12 == i9) {
            cVar.head = t0Var.pop();
            u0.recycle(t0Var);
        } else {
            t0Var.pos = i12;
        }
        return (short) i13;
    }

    public static final c.a commonReadUnsafe(okio.c cVar, c.a unsafeCursor) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        c.a resolveDefaultParameter = d1.resolveDefaultParameter(unsafeCursor);
        if (!(resolveDefaultParameter.buffer == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        resolveDefaultParameter.buffer = cVar;
        resolveDefaultParameter.readWrite = false;
        return resolveDefaultParameter;
    }

    public static final String commonReadUtf8(okio.c cVar, long j8) {
        s.checkNotNullParameter(cVar, "<this>");
        if (!(j8 >= 0 && j8 <= 2147483647L)) {
            throw new IllegalArgumentException(s.stringPlus("byteCount: ", Long.valueOf(j8)).toString());
        }
        if (cVar.size() < j8) {
            throw new EOFException();
        }
        if (j8 == 0) {
            return "";
        }
        t0 t0Var = cVar.head;
        s.checkNotNull(t0Var);
        int i8 = t0Var.pos;
        if (i8 + j8 > t0Var.limit) {
            return h.commonToUtf8String$default(cVar.readByteArray(j8), 0, 0, 3, null);
        }
        int i9 = (int) j8;
        String commonToUtf8String = h.commonToUtf8String(t0Var.data, i8, i8 + i9);
        t0Var.pos += i9;
        cVar.setSize$okio(cVar.size() - j8);
        if (t0Var.pos == t0Var.limit) {
            cVar.head = t0Var.pop();
            u0.recycle(t0Var);
        }
        return commonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(okio.c cVar) {
        int i8;
        int i9;
        int i10;
        s.checkNotNullParameter(cVar, "<this>");
        if (cVar.size() == 0) {
            throw new EOFException();
        }
        byte b8 = cVar.getByte(0L);
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
                cVar.skip(1L);
                return z0.REPLACEMENT_CODE_POINT;
            }
            i8 = b8 & 7;
            i9 = 4;
            i10 = 65536;
        }
        long j8 = i9;
        if (cVar.size() < j8) {
            throw new EOFException("size < " + i9 + ": " + cVar.size() + " (to read code point prefixed 0x" + d1.toHexString(b8) + ')');
        }
        if (1 < i9) {
            while (true) {
                int i12 = i11 + 1;
                long j9 = i11;
                byte b9 = cVar.getByte(j9);
                if ((b9 & 192) != 128) {
                    cVar.skip(j9);
                    return z0.REPLACEMENT_CODE_POINT;
                }
                i8 = (i8 << 6) | (b9 & 63);
                if (i12 >= i9) {
                    break;
                }
                i11 = i12;
            }
        }
        cVar.skip(j8);
        return i8 > 1114111 ? z0.REPLACEMENT_CODE_POINT : ((55296 > i8 || i8 > 57343) && i8 >= i10) ? i8 : z0.REPLACEMENT_CODE_POINT;
    }

    public static final String commonReadUtf8Line(okio.c cVar) {
        s.checkNotNullParameter(cVar, "<this>");
        long indexOf = cVar.indexOf((byte) 10);
        if (indexOf != -1) {
            return readUtf8Line(cVar, indexOf);
        }
        if (cVar.size() != 0) {
            return cVar.readUtf8(cVar.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(okio.c cVar, long j8) {
        s.checkNotNullParameter(cVar, "<this>");
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(s.stringPlus("limit < 0: ", Long.valueOf(j8)).toString());
        }
        long j9 = j8 != Long.MAX_VALUE ? j8 + 1 : Long.MAX_VALUE;
        byte b8 = (byte) 10;
        long indexOf = cVar.indexOf(b8, 0L, j9);
        if (indexOf != -1) {
            return readUtf8Line(cVar, indexOf);
        }
        if (j9 < cVar.size() && cVar.getByte(j9 - 1) == ((byte) 13) && cVar.getByte(j9) == b8) {
            return readUtf8Line(cVar, j9);
        }
        okio.c cVar2 = new okio.c();
        cVar.copyTo(cVar2, 0L, Math.min(32, cVar.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(cVar.size(), j8) + " content=" + cVar2.readByteString().hex() + (char) 8230);
    }

    public static final long commonResizeBuffer(c.a aVar, long j8) {
        s.checkNotNullParameter(aVar, "<this>");
        okio.c cVar = aVar.buffer;
        if (cVar == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!aVar.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        long size = cVar.size();
        int i8 = 1;
        if (j8 <= size) {
            if (!(j8 >= 0)) {
                throw new IllegalArgumentException(s.stringPlus("newSize < 0: ", Long.valueOf(j8)).toString());
            }
            long j9 = size - j8;
            while (true) {
                if (j9 <= 0) {
                    break;
                }
                t0 t0Var = cVar.head;
                s.checkNotNull(t0Var);
                t0 t0Var2 = t0Var.prev;
                s.checkNotNull(t0Var2);
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
            aVar.setSegment$okio(null);
            aVar.offset = j8;
            aVar.data = null;
            aVar.start = -1;
            aVar.end = -1;
        } else if (j8 > size) {
            long j11 = j8 - size;
            boolean z7 = true;
            while (j11 > 0) {
                t0 writableSegment$okio = cVar.writableSegment$okio(i8);
                int min = (int) Math.min(j11, 8192 - writableSegment$okio.limit);
                writableSegment$okio.limit += min;
                j11 -= min;
                if (z7) {
                    aVar.setSegment$okio(writableSegment$okio);
                    aVar.offset = size;
                    aVar.data = writableSegment$okio.data;
                    int i10 = writableSegment$okio.limit;
                    aVar.start = i10 - min;
                    aVar.end = i10;
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

    public static final int commonSeek(c.a aVar, long j8) {
        t0 t0Var;
        s.checkNotNullParameter(aVar, "<this>");
        okio.c cVar = aVar.buffer;
        if (cVar == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (j8 < -1 || j8 > cVar.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j8 + " > size=" + cVar.size());
        }
        if (j8 == -1 || j8 == cVar.size()) {
            aVar.setSegment$okio(null);
            aVar.offset = j8;
            aVar.data = null;
            aVar.start = -1;
            aVar.end = -1;
            return -1;
        }
        long size = cVar.size();
        t0 t0Var2 = cVar.head;
        long j9 = 0;
        if (aVar.getSegment$okio() != null) {
            long j10 = aVar.offset;
            int i8 = aVar.start;
            s.checkNotNull(aVar.getSegment$okio());
            long j11 = j10 - (i8 - r9.pos);
            if (j11 > j8) {
                t0Var = t0Var2;
                t0Var2 = aVar.getSegment$okio();
                size = j11;
            } else {
                t0Var = aVar.getSegment$okio();
                j9 = j11;
            }
        } else {
            t0Var = t0Var2;
        }
        if (size - j8 > j8 - j9) {
            while (true) {
                s.checkNotNull(t0Var);
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
                s.checkNotNull(t0Var2);
                t0Var2 = t0Var2.prev;
                s.checkNotNull(t0Var2);
                size -= t0Var2.limit - t0Var2.pos;
            }
            j9 = size;
            t0Var = t0Var2;
        }
        if (aVar.readWrite) {
            s.checkNotNull(t0Var);
            if (t0Var.shared) {
                t0 unsharedCopy = t0Var.unsharedCopy();
                if (cVar.head == t0Var) {
                    cVar.head = unsharedCopy;
                }
                t0Var = t0Var.push(unsharedCopy);
                t0 t0Var3 = t0Var.prev;
                s.checkNotNull(t0Var3);
                t0Var3.pop();
            }
        }
        aVar.setSegment$okio(t0Var);
        aVar.offset = j8;
        s.checkNotNull(t0Var);
        aVar.data = t0Var.data;
        int i11 = t0Var.pos + ((int) (j8 - j9));
        aVar.start = i11;
        int i12 = t0Var.limit;
        aVar.end = i12;
        return i12 - i11;
    }

    public static final int commonSelect(okio.c cVar, m0 options) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(options, "options");
        int selectPrefix$default = selectPrefix$default(cVar, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        cVar.skip(options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public static final void commonSkip(okio.c cVar, long j8) {
        s.checkNotNullParameter(cVar, "<this>");
        while (j8 > 0) {
            t0 t0Var = cVar.head;
            if (t0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j8, t0Var.limit - t0Var.pos);
            long j9 = min;
            cVar.setSize$okio(cVar.size() - j9);
            j8 -= j9;
            int i8 = t0Var.pos + min;
            t0Var.pos = i8;
            if (i8 == t0Var.limit) {
                cVar.head = t0Var.pop();
                u0.recycle(t0Var);
            }
        }
    }

    public static final ByteString commonSnapshot(okio.c cVar) {
        s.checkNotNullParameter(cVar, "<this>");
        if (cVar.size() <= 2147483647L) {
            return cVar.snapshot((int) cVar.size());
        }
        throw new IllegalStateException(s.stringPlus("size > Int.MAX_VALUE: ", Long.valueOf(cVar.size())).toString());
    }

    public static final t0 commonWritableSegment(okio.c cVar, int i8) {
        s.checkNotNullParameter(cVar, "<this>");
        if (!(i8 >= 1 && i8 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        t0 t0Var = cVar.head;
        if (t0Var != null) {
            s.checkNotNull(t0Var);
            t0 t0Var2 = t0Var.prev;
            s.checkNotNull(t0Var2);
            return (t0Var2.limit + i8 > 8192 || !t0Var2.owner) ? t0Var2.push(u0.take()) : t0Var2;
        }
        t0 take = u0.take();
        cVar.head = take;
        take.prev = take;
        take.next = take;
        return take;
    }

    public static final okio.c commonWrite(okio.c cVar, ByteString byteString, int i8, int i9) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(cVar, i8, i9);
        return cVar;
    }

    public static /* synthetic */ okio.c commonWrite$default(okio.c cVar, ByteString byteString, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = byteString.size();
        }
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(cVar, i8, i9);
        return cVar;
    }

    public static final long commonWriteAll(okio.c cVar, x0 source) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(source, "source");
        long j8 = 0;
        while (true) {
            long read = source.read(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j8;
            }
            j8 += read;
        }
    }

    public static final okio.c commonWriteByte(okio.c cVar, int i8) {
        s.checkNotNullParameter(cVar, "<this>");
        t0 writableSegment$okio = cVar.writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i9 = writableSegment$okio.limit;
        writableSegment$okio.limit = i9 + 1;
        bArr[i9] = (byte) i8;
        cVar.setSize$okio(cVar.size() + 1);
        return cVar;
    }

    public static final okio.c commonWriteDecimalLong(okio.c cVar, long j8) {
        boolean z7;
        s.checkNotNullParameter(cVar, "<this>");
        if (j8 == 0) {
            return cVar.writeByte(48);
        }
        int i8 = 1;
        if (j8 < 0) {
            j8 = -j8;
            if (j8 < 0) {
                return cVar.writeUtf8("-9223372036854775808");
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
        t0 writableSegment$okio = cVar.writableSegment$okio(i8);
        byte[] bArr = writableSegment$okio.data;
        int i9 = writableSegment$okio.limit + i8;
        while (j8 != 0) {
            long j9 = 10;
            i9--;
            bArr[i9] = getHEX_DIGIT_BYTES()[(int) (j8 % j9)];
            j8 /= j9;
        }
        if (z7) {
            bArr[i9 - 1] = (byte) 45;
        }
        writableSegment$okio.limit += i8;
        cVar.setSize$okio(cVar.size() + i8);
        return cVar;
    }

    public static final okio.c commonWriteHexadecimalUnsignedLong(okio.c cVar, long j8) {
        s.checkNotNullParameter(cVar, "<this>");
        if (j8 == 0) {
            return cVar.writeByte(48);
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
        t0 writableSegment$okio = cVar.writableSegment$okio(i8);
        byte[] bArr = writableSegment$okio.data;
        int i9 = writableSegment$okio.limit;
        for (int i10 = (i9 + i8) - 1; i10 >= i9; i10--) {
            bArr[i10] = getHEX_DIGIT_BYTES()[(int) (15 & j8)];
            j8 >>>= 4;
        }
        writableSegment$okio.limit += i8;
        cVar.setSize$okio(cVar.size() + i8);
        return cVar;
    }

    public static final okio.c commonWriteInt(okio.c cVar, int i8) {
        s.checkNotNullParameter(cVar, "<this>");
        t0 writableSegment$okio = cVar.writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i9 = writableSegment$okio.limit;
        bArr[i9] = (byte) ((i8 >>> 24) & 255);
        bArr[i9 + 1] = (byte) ((i8 >>> 16) & 255);
        bArr[i9 + 2] = (byte) ((i8 >>> 8) & 255);
        bArr[i9 + 3] = (byte) (i8 & 255);
        writableSegment$okio.limit = i9 + 4;
        cVar.setSize$okio(cVar.size() + 4);
        return cVar;
    }

    public static final okio.c commonWriteLong(okio.c cVar, long j8) {
        s.checkNotNullParameter(cVar, "<this>");
        t0 writableSegment$okio = cVar.writableSegment$okio(8);
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
        cVar.setSize$okio(cVar.size() + 8);
        return cVar;
    }

    public static final okio.c commonWriteShort(okio.c cVar, int i8) {
        s.checkNotNullParameter(cVar, "<this>");
        t0 writableSegment$okio = cVar.writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i9 = writableSegment$okio.limit;
        bArr[i9] = (byte) ((i8 >>> 8) & 255);
        bArr[i9 + 1] = (byte) (i8 & 255);
        writableSegment$okio.limit = i9 + 2;
        cVar.setSize$okio(cVar.size() + 2);
        return cVar;
    }

    public static final okio.c commonWriteUtf8(okio.c cVar, String string, int i8, int i9) {
        char charAt;
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(string, "string");
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(s.stringPlus("beginIndex < 0: ", Integer.valueOf(i8)).toString());
        }
        if (!(i9 >= i8)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i9 + " < " + i8).toString());
        }
        if (!(i9 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i9 + " > " + string.length()).toString());
        }
        while (i8 < i9) {
            char charAt2 = string.charAt(i8);
            if (charAt2 < 128) {
                t0 writableSegment$okio = cVar.writableSegment$okio(1);
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
                cVar.setSize$okio(cVar.size() + i13);
            } else {
                if (charAt2 < 2048) {
                    t0 writableSegment$okio2 = cVar.writableSegment$okio(2);
                    byte[] bArr2 = writableSegment$okio2.data;
                    int i14 = writableSegment$okio2.limit;
                    bArr2[i14] = (byte) ((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    bArr2[i14 + 1] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio2.limit = i14 + 2;
                    cVar.setSize$okio(cVar.size() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    t0 writableSegment$okio3 = cVar.writableSegment$okio(3);
                    byte[] bArr3 = writableSegment$okio3.data;
                    int i15 = writableSegment$okio3.limit;
                    bArr3[i15] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio3.limit = i15 + 3;
                    cVar.setSize$okio(cVar.size() + 3);
                } else {
                    int i16 = i8 + 1;
                    char charAt3 = i16 < i9 ? string.charAt(i16) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 > 57343) {
                        cVar.writeByte(63);
                        i8 = i16;
                    } else {
                        int i17 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        t0 writableSegment$okio4 = cVar.writableSegment$okio(4);
                        byte[] bArr4 = writableSegment$okio4.data;
                        int i18 = writableSegment$okio4.limit;
                        bArr4[i18] = (byte) ((i17 >> 18) | 240);
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | 128);
                        writableSegment$okio4.limit = i18 + 4;
                        cVar.setSize$okio(cVar.size() + 4);
                        i8 += 2;
                    }
                }
                i8++;
            }
        }
        return cVar;
    }

    public static final okio.c commonWriteUtf8CodePoint(okio.c cVar, int i8) {
        s.checkNotNullParameter(cVar, "<this>");
        if (i8 < 128) {
            cVar.writeByte(i8);
        } else if (i8 < 2048) {
            t0 writableSegment$okio = cVar.writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i9 = writableSegment$okio.limit;
            bArr[i9] = (byte) ((i8 >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i9 + 1] = (byte) ((i8 & 63) | 128);
            writableSegment$okio.limit = i9 + 2;
            cVar.setSize$okio(cVar.size() + 2);
        } else if (55296 <= i8 && i8 <= 57343) {
            cVar.writeByte(63);
        } else if (i8 < 65536) {
            t0 writableSegment$okio2 = cVar.writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i10 = writableSegment$okio2.limit;
            bArr2[i10] = (byte) ((i8 >> 12) | 224);
            bArr2[i10 + 1] = (byte) (((i8 >> 6) & 63) | 128);
            bArr2[i10 + 2] = (byte) ((i8 & 63) | 128);
            writableSegment$okio2.limit = i10 + 3;
            cVar.setSize$okio(cVar.size() + 3);
        } else {
            if (i8 > 1114111) {
                throw new IllegalArgumentException(s.stringPlus("Unexpected code point: 0x", d1.toHexString(i8)));
            }
            t0 writableSegment$okio3 = cVar.writableSegment$okio(4);
            byte[] bArr3 = writableSegment$okio3.data;
            int i11 = writableSegment$okio3.limit;
            bArr3[i11] = (byte) ((i8 >> 18) | 240);
            bArr3[i11 + 1] = (byte) (((i8 >> 12) & 63) | 128);
            bArr3[i11 + 2] = (byte) (((i8 >> 6) & 63) | 128);
            bArr3[i11 + 3] = (byte) ((i8 & 63) | 128);
            writableSegment$okio3.limit = i11 + 4;
            cVar.setSize$okio(cVar.size() + 4);
        }
        return cVar;
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    public static final boolean rangeEquals(t0 segment, int i8, byte[] bytes, int i9, int i10) {
        s.checkNotNullParameter(segment, "segment");
        s.checkNotNullParameter(bytes, "bytes");
        int i11 = segment.limit;
        byte[] bArr = segment.data;
        while (i9 < i10) {
            if (i8 == i11) {
                segment = segment.next;
                s.checkNotNull(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i8 = segment.pos;
                i11 = segment.limit;
            }
            if (bArr[i8] != bytes[i9]) {
                return false;
            }
            i8++;
            i9++;
        }
        return true;
    }

    public static final String readUtf8Line(okio.c cVar, long j8) {
        s.checkNotNullParameter(cVar, "<this>");
        if (j8 > 0) {
            long j9 = j8 - 1;
            if (cVar.getByte(j9) == ((byte) 13)) {
                String readUtf8 = cVar.readUtf8(j9);
                cVar.skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = cVar.readUtf8(j8);
        cVar.skip(1L);
        return readUtf82;
    }

    public static final <T> T seek(okio.c cVar, long j8, p lambda) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(lambda, "lambda");
        t0 t0Var = cVar.head;
        if (t0Var == null) {
            return (T) lambda.invoke(null, -1L);
        }
        if (cVar.size() - j8 < j8) {
            long size = cVar.size();
            while (size > j8) {
                t0Var = t0Var.prev;
                s.checkNotNull(t0Var);
                size -= t0Var.limit - t0Var.pos;
            }
            return (T) lambda.invoke(t0Var, Long.valueOf(size));
        }
        long j9 = 0;
        while (true) {
            long j10 = (t0Var.limit - t0Var.pos) + j9;
            if (j10 > j8) {
                return (T) lambda.invoke(t0Var, Long.valueOf(j9));
            }
            t0Var = t0Var.next;
            s.checkNotNull(t0Var);
            j9 = j10;
        }
    }

    public static final int selectPrefix(okio.c cVar, m0 options, boolean z7) {
        int i8;
        int i9;
        t0 t0Var;
        int i10;
        int i11;
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(options, "options");
        t0 t0Var2 = cVar.head;
        if (t0Var2 == null) {
            return z7 ? -2 : -1;
        }
        byte[] bArr = t0Var2.data;
        int i12 = t0Var2.pos;
        int i13 = t0Var2.limit;
        int[] trie$okio = options.getTrie$okio();
        t0 t0Var3 = t0Var2;
        int i14 = 0;
        int i15 = -1;
        loop0: while (true) {
            int i16 = i14 + 1;
            int i17 = trie$okio[i14];
            int i18 = i14 + 2;
            int i19 = trie$okio[i16];
            if (i19 != -1) {
                i15 = i19;
            }
            if (t0Var3 == null) {
                break;
            }
            if (i17 >= 0) {
                i8 = i12 + 1;
                int i20 = bArr[i12] & 255;
                int i21 = i18 + i17;
                while (i18 != i21) {
                    if (i20 == trie$okio[i18]) {
                        i9 = trie$okio[i18 + i17];
                        if (i8 == i13) {
                            t0Var3 = t0Var3.next;
                            s.checkNotNull(t0Var3);
                            i8 = t0Var3.pos;
                            bArr = t0Var3.data;
                            i13 = t0Var3.limit;
                            if (t0Var3 == t0Var2) {
                                t0Var3 = null;
                            }
                        }
                    } else {
                        i18++;
                    }
                }
                return i15;
            }
            int i22 = i18 + (i17 * (-1));
            while (true) {
                int i23 = i12 + 1;
                int i24 = i18 + 1;
                if ((bArr[i12] & 255) != trie$okio[i18]) {
                    return i15;
                }
                boolean z8 = i24 == i22;
                if (i23 == i13) {
                    s.checkNotNull(t0Var3);
                    t0 t0Var4 = t0Var3.next;
                    s.checkNotNull(t0Var4);
                    i11 = t0Var4.pos;
                    byte[] bArr2 = t0Var4.data;
                    i10 = t0Var4.limit;
                    if (t0Var4 != t0Var2) {
                        t0Var = t0Var4;
                        bArr = bArr2;
                    } else {
                        if (!z8) {
                            break loop0;
                        }
                        bArr = bArr2;
                        t0Var = null;
                    }
                } else {
                    t0Var = t0Var3;
                    i10 = i13;
                    i11 = i23;
                }
                if (z8) {
                    i9 = trie$okio[i24];
                    i8 = i11;
                    i13 = i10;
                    t0Var3 = t0Var;
                    break;
                }
                i12 = i11;
                i13 = i10;
                t0Var3 = t0Var;
                i18 = i24;
            }
            if (i9 >= 0) {
                return i9;
            }
            i14 = -i9;
            i12 = i8;
        }
        if (z7) {
            return -2;
        }
        return i15;
    }

    public static /* synthetic */ int selectPrefix$default(okio.c cVar, m0 m0Var, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return selectPrefix(cVar, m0Var, z7);
    }

    public static final int commonRead(okio.c cVar, byte[] sink, int i8, int i9) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(sink, "sink");
        d1.checkOffsetAndCount(sink.length, i8, i9);
        t0 t0Var = cVar.head;
        if (t0Var == null) {
            return -1;
        }
        int min = Math.min(i9, t0Var.limit - t0Var.pos);
        byte[] bArr = t0Var.data;
        int i10 = t0Var.pos;
        k.copyInto(bArr, sink, i8, i10, i10 + min);
        t0Var.pos += min;
        cVar.setSize$okio(cVar.size() - min);
        if (t0Var.pos == t0Var.limit) {
            cVar.head = t0Var.pop();
            u0.recycle(t0Var);
        }
        return min;
    }

    public static final byte[] commonReadByteArray(okio.c cVar, long j8) {
        s.checkNotNullParameter(cVar, "<this>");
        if (!(j8 >= 0 && j8 <= 2147483647L)) {
            throw new IllegalArgumentException(s.stringPlus("byteCount: ", Long.valueOf(j8)).toString());
        }
        if (cVar.size() < j8) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j8];
        cVar.readFully(bArr);
        return bArr;
    }

    public static final ByteString commonReadByteString(okio.c cVar, long j8) {
        s.checkNotNullParameter(cVar, "<this>");
        if (!(j8 >= 0 && j8 <= 2147483647L)) {
            throw new IllegalArgumentException(s.stringPlus("byteCount: ", Long.valueOf(j8)).toString());
        }
        if (cVar.size() < j8) {
            throw new EOFException();
        }
        if (j8 < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new ByteString(cVar.readByteArray(j8));
        }
        ByteString snapshot = cVar.snapshot((int) j8);
        cVar.skip(j8);
        return snapshot;
    }

    public static final okio.c commonWrite(okio.c cVar, byte[] source) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(source, "source");
        return cVar.write(source, 0, source.length);
    }

    public static final okio.c commonWrite(okio.c cVar, byte[] source, int i8, int i9) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(source, "source");
        long j8 = i9;
        d1.checkOffsetAndCount(source.length, i8, j8);
        int i10 = i9 + i8;
        while (i8 < i10) {
            t0 writableSegment$okio = cVar.writableSegment$okio(1);
            int min = Math.min(i10 - i8, 8192 - writableSegment$okio.limit);
            int i11 = i8 + min;
            k.copyInto(source, writableSegment$okio.data, writableSegment$okio.limit, i8, i11);
            writableSegment$okio.limit += min;
            i8 = i11;
        }
        cVar.setSize$okio(cVar.size() + j8);
        return cVar;
    }

    public static final void commonReadFully(okio.c cVar, okio.c sink, long j8) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(sink, "sink");
        if (cVar.size() >= j8) {
            sink.write(cVar, j8);
        } else {
            sink.write(cVar, cVar.size());
            throw new EOFException();
        }
    }

    public static final ByteString commonSnapshot(okio.c cVar, int i8) {
        s.checkNotNullParameter(cVar, "<this>");
        if (i8 == 0) {
            return ByteString.EMPTY;
        }
        d1.checkOffsetAndCount(cVar.size(), 0L, i8);
        t0 t0Var = cVar.head;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            s.checkNotNull(t0Var);
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
        t0 t0Var2 = cVar.head;
        int i14 = 0;
        while (i9 < i8) {
            s.checkNotNull(t0Var2);
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

    public static final okio.c commonWrite(okio.c cVar, x0 source, long j8) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(source, "source");
        while (j8 > 0) {
            long read = source.read(cVar, j8);
            if (read == -1) {
                throw new EOFException();
            }
            j8 -= read;
        }
        return cVar;
    }

    public static final long commonRead(okio.c cVar, okio.c sink, long j8) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(sink, "sink");
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
        }
        if (cVar.size() == 0) {
            return -1L;
        }
        if (j8 > cVar.size()) {
            j8 = cVar.size();
        }
        sink.write(cVar, j8);
        return j8;
    }

    public static final void commonWrite(okio.c cVar, okio.c source, long j8) {
        t0 t0Var;
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(source, "source");
        if (source != cVar) {
            d1.checkOffsetAndCount(source.size(), 0L, j8);
            while (j8 > 0) {
                t0 t0Var2 = source.head;
                s.checkNotNull(t0Var2);
                int i8 = t0Var2.limit;
                s.checkNotNull(source.head);
                if (j8 < i8 - r2.pos) {
                    t0 t0Var3 = cVar.head;
                    if (t0Var3 != null) {
                        s.checkNotNull(t0Var3);
                        t0Var = t0Var3.prev;
                    } else {
                        t0Var = null;
                    }
                    if (t0Var != null && t0Var.owner) {
                        if ((t0Var.limit + j8) - (t0Var.shared ? 0 : t0Var.pos) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            t0 t0Var4 = source.head;
                            s.checkNotNull(t0Var4);
                            t0Var4.writeTo(t0Var, (int) j8);
                            source.setSize$okio(source.size() - j8);
                            cVar.setSize$okio(cVar.size() + j8);
                            return;
                        }
                    }
                    t0 t0Var5 = source.head;
                    s.checkNotNull(t0Var5);
                    source.head = t0Var5.split((int) j8);
                }
                t0 t0Var6 = source.head;
                s.checkNotNull(t0Var6);
                long j9 = t0Var6.limit - t0Var6.pos;
                source.head = t0Var6.pop();
                t0 t0Var7 = cVar.head;
                if (t0Var7 == null) {
                    cVar.head = t0Var6;
                    t0Var6.prev = t0Var6;
                    t0Var6.next = t0Var6;
                } else {
                    s.checkNotNull(t0Var7);
                    t0 t0Var8 = t0Var7.prev;
                    s.checkNotNull(t0Var8);
                    t0Var8.push(t0Var6).compact();
                }
                source.setSize$okio(source.size() - j9);
                cVar.setSize$okio(cVar.size() + j9);
                j8 -= j9;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public static final long commonIndexOf(okio.c cVar, ByteString bytes, long j8) {
        s.checkNotNullParameter(cVar, "<this>");
        s.checkNotNullParameter(bytes, "bytes");
        if (!(bytes.size() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j9 = 0;
        if (j8 >= 0) {
            t0 t0Var = cVar.head;
            if (t0Var == null) {
                return -1L;
            }
            if (cVar.size() - j8 < j8) {
                long size = cVar.size();
                while (size > j8) {
                    t0Var = t0Var.prev;
                    s.checkNotNull(t0Var);
                    size -= t0Var.limit - t0Var.pos;
                }
                byte[] internalArray$okio = bytes.internalArray$okio();
                byte b8 = internalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (cVar.size() - size2) + 1;
                long j10 = size;
                t0 t0Var2 = t0Var;
                long j11 = j8;
                while (j10 < size3) {
                    byte[] bArr = t0Var2.data;
                    t0 t0Var3 = t0Var2;
                    int min = (int) Math.min(t0Var2.limit, (t0Var2.pos + size3) - j10);
                    int i8 = (int) ((t0Var3.pos + j11) - j10);
                    if (i8 < min) {
                        while (true) {
                            int i9 = i8 + 1;
                            if (bArr[i8] == b8 && rangeEquals(t0Var3, i9, internalArray$okio, 1, size2)) {
                                return (i8 - t0Var3.pos) + j10;
                            }
                            if (i9 >= min) {
                                break;
                            }
                            i8 = i9;
                        }
                    }
                    j10 += t0Var3.limit - t0Var3.pos;
                    t0Var2 = t0Var3.next;
                    s.checkNotNull(t0Var2);
                    j11 = j10;
                }
                return -1L;
            }
            while (true) {
                long j12 = (t0Var.limit - t0Var.pos) + j9;
                if (j12 > j8) {
                    break;
                }
                t0Var = t0Var.next;
                s.checkNotNull(t0Var);
                j9 = j12;
            }
            byte[] internalArray$okio2 = bytes.internalArray$okio();
            byte b9 = internalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (cVar.size() - size4) + 1;
            long j13 = j9;
            t0 t0Var4 = t0Var;
            long j14 = j8;
            while (j13 < size5) {
                byte[] bArr2 = t0Var4.data;
                long j15 = size5;
                int min2 = (int) Math.min(t0Var4.limit, (t0Var4.pos + size5) - j13);
                int i10 = (int) ((t0Var4.pos + j14) - j13);
                if (i10 < min2) {
                    while (true) {
                        int i11 = i10 + 1;
                        if (bArr2[i10] == b9 && rangeEquals(t0Var4, i11, internalArray$okio2, 1, size4)) {
                            return (i10 - t0Var4.pos) + j13;
                        }
                        if (i11 >= min2) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                j13 += t0Var4.limit - t0Var4.pos;
                t0Var4 = t0Var4.next;
                s.checkNotNull(t0Var4);
                size5 = j15;
                j14 = j13;
            }
            return -1L;
        }
        throw new IllegalArgumentException(s.stringPlus("fromIndex < 0: ", Long.valueOf(j8)).toString());
    }
}
