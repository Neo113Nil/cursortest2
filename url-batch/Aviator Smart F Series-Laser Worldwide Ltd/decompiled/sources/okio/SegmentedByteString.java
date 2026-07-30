package okio;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public final class SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] segments, int[] directory) {
        super(ByteString.EMPTY.getData$okio());
        kotlin.jvm.internal.s.checkNotNullParameter(segments, "segments");
        kotlin.jvm.internal.s.checkNotNullParameter(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        return toByteString();
    }

    @Override // okio.ByteString
    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(asReadOnlyBuffer, "wrap(toByteArray()).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    @Override // okio.ByteString
    public String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    public void copyInto(int i8, byte[] target, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(target, "target");
        long j8 = i10;
        d1.checkOffsetAndCount(size(), i8, j8);
        d1.checkOffsetAndCount(target.length, i9, j8);
        int i11 = i10 + i8;
        int segment = okio.internal.g.segment(this, i8);
        while (i8 < i11) {
            int i12 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i13 = getDirectory$okio()[segment] - i12;
            int i14 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i11, i13 + i12) - i8;
            int i15 = i14 + (i8 - i12);
            kotlin.collections.k.copyInto(getSegments$okio()[segment], target, i9, i15, i15 + min);
            i9 += min;
            i8 += min;
            segment++;
        }
    }

    @Override // okio.ByteString
    public ByteString digest$okio(String algorithm) {
        kotlin.jvm.internal.s.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments$okio().length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = getDirectory$okio()[length + i8];
            int i11 = getDirectory$okio()[i8];
            messageDigest.update(getSegments$okio()[i8], i10, i11 - i9);
            i8++;
            i9 = i11;
        }
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new ByteString(digestBytes);
    }

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public final int[] getDirectory$okio() {
        return this.directory;
    }

    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i8 < length) {
            int i11 = getDirectory$okio()[length + i8];
            int i12 = getDirectory$okio()[i8];
            byte[] bArr = getSegments$okio()[i8];
            int i13 = (i12 - i10) + i11;
            while (i11 < i13) {
                i9 = (i9 * 31) + bArr[i11];
                i11++;
            }
            i8++;
            i10 = i12;
        }
        setHashCode$okio(i9);
        return i9;
    }

    @Override // okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    public ByteString hmac$okio(String algorithm, ByteString key) {
        kotlin.jvm.internal.s.checkNotNullParameter(algorithm, "algorithm");
        kotlin.jvm.internal.s.checkNotNullParameter(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments$okio().length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                int i10 = getDirectory$okio()[length + i8];
                int i11 = getDirectory$okio()[i8];
                mac.update(getSegments$okio()[i8], i10, i11 - i9);
                i8++;
                i9 = i11;
            }
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.s.checkNotNullExpressionValue(doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    @Override // okio.ByteString
    public int indexOf(byte[] other, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return toByteString().indexOf(other, i8);
    }

    @Override // okio.ByteString
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int i8) {
        d1.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i8, 1L);
        int segment = okio.internal.g.segment(this, i8);
        return getSegments$okio()[segment][(i8 - (segment == 0 ? 0 : getDirectory$okio()[segment - 1])) + getDirectory$okio()[getSegments$okio().length + segment]];
    }

    @Override // okio.ByteString
    public int lastIndexOf(byte[] other, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        return toByteString().lastIndexOf(other, i8);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i8, ByteString other, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        if (i8 < 0 || i8 > size() - i10) {
            return false;
        }
        int i11 = i10 + i8;
        int segment = okio.internal.g.segment(this, i8);
        while (i8 < i11) {
            int i12 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i13 = getDirectory$okio()[segment] - i12;
            int i14 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i11, i13 + i12) - i8;
            if (!other.rangeEquals(i9, getSegments$okio()[segment], i14 + (i8 - i12), min)) {
                return false;
            }
            i9 += min;
            i8 += min;
            segment++;
        }
        return true;
    }

    @Override // okio.ByteString
    public String string(Charset charset) {
        kotlin.jvm.internal.s.checkNotNullParameter(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    public ByteString substring(int i8, int i9) {
        int resolveDefaultParameter = d1.resolveDefaultParameter(this, i9);
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i8 + " < 0").toString());
        }
        if (!(resolveDefaultParameter <= size())) {
            throw new IllegalArgumentException(("endIndex=" + resolveDefaultParameter + " > length(" + size() + ')').toString());
        }
        int i10 = resolveDefaultParameter - i8;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + resolveDefaultParameter + " < beginIndex=" + i8).toString());
        }
        if (i8 == 0 && resolveDefaultParameter == size()) {
            return this;
        }
        if (i8 == resolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int segment = okio.internal.g.segment(this, i8);
        int segment2 = okio.internal.g.segment(this, resolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) kotlin.collections.k.copyOfRange(getSegments$okio(), segment, segment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (segment <= segment2) {
            int i11 = segment;
            int i12 = 0;
            while (true) {
                int i13 = i11 + 1;
                iArr[i12] = Math.min(getDirectory$okio()[i11] - i8, i10);
                int i14 = i12 + 1;
                iArr[i12 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i11];
                if (i11 == segment2) {
                    break;
                }
                i11 = i13;
                i12 = i14;
            }
        }
        int i15 = segment != 0 ? getDirectory$okio()[segment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i8 - i15);
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.ByteString
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // okio.ByteString
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            int i11 = getDirectory$okio()[length + i8];
            int i12 = getDirectory$okio()[i8];
            int i13 = i12 - i9;
            kotlin.collections.k.copyInto(getSegments$okio()[i8], bArr, i10, i11, i11 + i13);
            i10 += i13;
            i8++;
            i9 = i12;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public void write(OutputStream out) {
        kotlin.jvm.internal.s.checkNotNullParameter(out, "out");
        int length = getSegments$okio().length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = getDirectory$okio()[length + i8];
            int i11 = getDirectory$okio()[i8];
            out.write(getSegments$okio()[i8], i10, i11 - i9);
            i8++;
            i9 = i11;
        }
    }

    @Override // okio.ByteString
    public void write$okio(c buffer, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(buffer, "buffer");
        int i10 = i8 + i9;
        int segment = okio.internal.g.segment(this, i8);
        while (i8 < i10) {
            int i11 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i12 = getDirectory$okio()[segment] - i11;
            int i13 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i10, i12 + i11) - i8;
            int i14 = i13 + (i8 - i11);
            t0 t0Var = new t0(getSegments$okio()[segment], i14, i14 + min, true, false);
            t0 t0Var2 = buffer.head;
            if (t0Var2 == null) {
                t0Var.prev = t0Var;
                t0Var.next = t0Var;
                buffer.head = t0Var;
            } else {
                kotlin.jvm.internal.s.checkNotNull(t0Var2);
                t0 t0Var3 = t0Var2.prev;
                kotlin.jvm.internal.s.checkNotNull(t0Var3);
                t0Var3.push(t0Var);
            }
            i8 += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + i9);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i8, byte[] other, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        if (i8 < 0 || i8 > size() - i10 || i9 < 0 || i9 > other.length - i10) {
            return false;
        }
        int i11 = i10 + i8;
        int segment = okio.internal.g.segment(this, i8);
        while (i8 < i11) {
            int i12 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i13 = getDirectory$okio()[segment] - i12;
            int i14 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i11, i13 + i12) - i8;
            if (!d1.arrayRangeEquals(getSegments$okio()[segment], i14 + (i8 - i12), other, i9, min)) {
                return false;
            }
            i9 += min;
            i8 += min;
            segment++;
        }
        return true;
    }
}
