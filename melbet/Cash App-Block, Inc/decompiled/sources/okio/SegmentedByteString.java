package okio;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.time.DurationKt;
import okio.internal._ZlibJvmKt;

/* loaded from: classes3.dex */
public final class SegmentedByteString extends ByteString {
    public final transient int[] directory;
    public final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.EMPTY.data);
        bArr.getClass();
        this.segments = bArr;
        this.directory = iArr;
    }

    @Override // okio.ByteString
    public final String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    public final String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    public final void copyInto(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        long j = i3;
        DurationKt.checkOffsetAndCount(getSize$okio(), i, j);
        DurationKt.checkOffsetAndCount(bArr.length, i2, j);
        int i4 = i3 + i;
        int segment = _ZlibJvmKt.segment(this, i);
        while (i < i4) {
            int[] iArr = this.directory;
            int i5 = segment == 0 ? 0 : iArr[segment - 1];
            int i6 = iArr[segment] - i5;
            byte[][] bArr2 = this.segments;
            int i7 = iArr[bArr2.length + segment];
            int min = Math.min(i4, i6 + i5) - i;
            int i8 = (i - i5) + i7;
            ArraysKt___ArraysJvmKt.copyInto(i2, bArr2[segment], i8, bArr, i8 + min);
            i2 += min;
            i += min;
            segment++;
        }
    }

    @Override // okio.ByteString
    public final ByteString digest$okio(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.segments;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.directory;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new ByteString(digest);
    }

    @Override // okio.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.getSize$okio() == getSize$okio() && rangeEquals(0, getSize$okio(), byteString)) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public final int getSize$okio() {
        return this.directory[this.segments.length - 1];
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.segments;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.directory;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.hashCode = i3;
        return i3;
    }

    @Override // okio.ByteString
    public final String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    public final int indexOf(int i, byte[] bArr) {
        bArr.getClass();
        return toByteString().indexOf(i, bArr);
    }

    @Override // okio.ByteString
    public final byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public final byte internalGet$okio(int i) {
        byte[][] bArr = this.segments;
        int length = bArr.length - 1;
        int[] iArr = this.directory;
        DurationKt.checkOffsetAndCount(iArr[length], i, 1L);
        int segment = _ZlibJvmKt.segment(this, i);
        return bArr[segment][(i - (segment == 0 ? 0 : iArr[segment - 1])) + iArr[bArr.length + segment]];
    }

    @Override // okio.ByteString
    public final int lastIndexOf(int i, byte[] bArr) {
        bArr.getClass();
        return toByteString().lastIndexOf(i, bArr);
    }

    @Override // okio.ByteString
    public final boolean rangeEquals(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i < 0 || i > getSize$okio() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = _ZlibJvmKt.segment(this, i);
        while (i < i4) {
            int[] iArr = this.directory;
            int i5 = segment == 0 ? 0 : iArr[segment - 1];
            int i6 = iArr[segment] - i5;
            byte[][] bArr2 = this.segments;
            int i7 = iArr[bArr2.length + segment];
            int min = Math.min(i4, i6 + i5) - i;
            if (!DurationKt.arrayRangeEquals((i - i5) + i7, bArr2[segment], i2, bArr, min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final String string(Charset charset) {
        charset.getClass();
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    public final ByteString substring(int i, int i2) {
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > getSize$okio()) {
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i2, "endIndex=", " > length(");
            m2m.append(getSize$okio());
            m2m.append(')');
            throw new IllegalArgumentException(m2m.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("endIndex=", i2, i, " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == getSize$okio()) {
            return this;
        }
        if (i == i2) {
            return ByteString.EMPTY;
        }
        int segment = _ZlibJvmKt.segment(this, i);
        int segment2 = _ZlibJvmKt.segment(this, i2 - 1);
        byte[][] bArr = this.segments;
        byte[][] bArr2 = (byte[][]) ArraysKt___ArraysJvmKt.copyOfRange(segment, segment2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.directory;
        if (segment <= segment2) {
            int i4 = segment;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == segment2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = segment != 0 ? iArr2[segment - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new SegmentedByteString(bArr2, iArr);
    }

    @Override // okio.ByteString
    public final ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    public final byte[] toByteArray() {
        byte[] bArr = new byte[getSize$okio()];
        byte[][] bArr2 = this.segments;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.directory;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ArraysKt___ArraysJvmKt.copyInto(i3, bArr2[i], i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    @Override // okio.ByteString
    public final String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public final void write$okio(Buffer buffer, int i) {
        int segment = _ZlibJvmKt.segment(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.directory;
            int i3 = segment == 0 ? 0 : iArr[segment - 1];
            int i4 = iArr[segment] - i3;
            byte[][] bArr = this.segments;
            int i5 = iArr[bArr.length + segment];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            Segment segment2 = new Segment(bArr[segment], i6, i6 + min, true, false);
            Segment segment3 = buffer.head;
            if (segment3 == null) {
                segment2.prev = segment2;
                segment2.next = segment2;
                buffer.head = segment2;
            } else {
                Segment segment4 = segment3.prev;
                segment4.getClass();
                segment4.push(segment2);
            }
            i2 += min;
            segment++;
        }
        buffer.size += i;
    }

    @Override // okio.ByteString
    public final boolean rangeEquals(int i, int i2, ByteString byteString) {
        byteString.getClass();
        if (i >= 0 && i <= getSize$okio() - i2) {
            int i3 = i2 + i;
            int segment = _ZlibJvmKt.segment(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.directory;
                int i5 = segment == 0 ? 0 : iArr[segment - 1];
                int i6 = iArr[segment] - i5;
                byte[][] bArr = this.segments;
                int i7 = iArr[bArr.length + segment];
                int min = Math.min(i3, i6 + i5) - i;
                if (byteString.rangeEquals(i4, (i - i5) + i7, min, bArr[segment])) {
                    i4 += min;
                    i += min;
                    segment++;
                }
            }
            return true;
        }
        return false;
    }
}
