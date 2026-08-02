package okio.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.text.Charsets;
import kotlin.time.DurationKt;
import okio.ByteString;
import okio.Options;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Segment;

/* renamed from: okio.internal.-Buffer, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class Buffer {
    public static final long[] DigitCountToLargestValue;
    public static final byte[] HEX_DIGIT_BYTES;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        bytes.getClass();
        HEX_DIGIT_BYTES = bytes;
        DigitCountToLargestValue = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long commonIndexOf(okio.Buffer buffer, ByteString byteString, long j, long j2, int i) {
        Segment segment;
        long j3 = j;
        long j4 = j2;
        byteString.getClass();
        long j5 = i;
        DurationKt.checkOffsetAndCount(byteString.getSize$okio(), 0L, j5);
        if (i <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j3, "fromIndex < 0: "));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j3, "fromIndex > toIndex: ", " > ");
            m1149m.append(j4);
            throw new IllegalArgumentException(m1149m.toString().toString());
        }
        long j6 = buffer.size;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (segment = buffer.head) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                segment = segment.prev;
                segment.getClass();
                j6 -= segment.limit - segment.pos;
            }
            byte[] internalArray$okio = byteString.internalArray$okio();
            byte b = internalArray$okio[0];
            long min = Math.min(j4, (buffer.size - j5) + 1);
            while (j6 < min) {
                byte[] bArr = segment.data;
                int min2 = (int) Math.min(segment.limit, (segment.pos + min) - j6);
                for (int i2 = (int) ((segment.pos + j3) - j6); i2 < min2; i2++) {
                    if (bArr[i2] == b && rangeEquals(segment, i2 + 1, internalArray$okio, 1, i)) {
                        return (i2 - segment.pos) + j6;
                    }
                }
                j6 += segment.limit - segment.pos;
                segment = segment.next;
                segment.getClass();
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + (segment.limit - segment.pos);
            if (j8 > j3) {
                break;
            }
            segment = segment.next;
            segment.getClass();
            j7 = j8;
        }
        byte[] internalArray$okio2 = byteString.internalArray$okio();
        byte b2 = internalArray$okio2[0];
        long min3 = Math.min(j4, (buffer.size - j5) + 1);
        while (j7 < min3) {
            byte[] bArr2 = segment.data;
            int min4 = (int) Math.min(segment.limit, (segment.pos + min3) - j7);
            for (int i3 = (int) ((segment.pos + j3) - j7); i3 < min4; i3++) {
                if (bArr2[i3] == b2 && rangeEquals(segment, i3 + 1, internalArray$okio2, 1, i)) {
                    return (i3 - segment.pos) + j7;
                }
            }
            j7 += segment.limit - segment.pos;
            segment = segment.next;
            segment.getClass();
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean rangeEquals(Segment segment, int i, byte[] bArr, int i2, int i3) {
        int i4 = segment.limit;
        byte[] bArr2 = segment.data;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.next;
                segment.getClass();
                byte[] bArr3 = segment.data;
                bArr2 = bArr3;
                i = segment.pos;
                i4 = segment.limit;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String readUtf8Line(okio.Buffer buffer, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (buffer.getByte(j2) == 13) {
                String readString = buffer.readString(j2, Charsets.UTF_8);
                buffer.skip(2L);
                return readString;
            }
        }
        String readString2 = buffer.readString(j, Charsets.UTF_8);
        buffer.skip(1L);
        return readString2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int selectPrefix(okio.Buffer buffer, Options options, boolean z) {
        int i;
        int i2;
        int i3;
        Segment segment;
        int i4;
        options.getClass();
        Segment segment2 = buffer.head;
        if (segment2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = segment2.data;
        int i5 = segment2.pos;
        int i6 = segment2.limit;
        int[] iArr = options.trie;
        Segment segment3 = segment2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (segment3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            segment3 = segment3.next;
                            segment3.getClass();
                            int i16 = segment3.pos;
                            byte[] bArr2 = segment3.data;
                            i2 = segment3.limit;
                            if (segment3 == segment2) {
                                i3 = i16;
                                bArr = bArr2;
                                segment3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                break loop0;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) != iArr[i11]) {
                    break loop0;
                }
                boolean z2 = i20 == i18;
                if (i19 == i6) {
                    segment3.getClass();
                    Segment segment4 = segment3.next;
                    segment4.getClass();
                    i3 = segment4.pos;
                    byte[] bArr3 = segment4.data;
                    i4 = segment4.limit;
                    if (segment4 != segment2) {
                        segment = segment4;
                        bArr = bArr3;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr3;
                        segment = null;
                    }
                } else {
                    segment = segment3;
                    i4 = i6;
                    i3 = i19;
                }
                if (z2) {
                    i = iArr[i20];
                    int i21 = i4;
                    segment3 = segment;
                    i2 = i21;
                    break;
                }
                i5 = i3;
                i6 = i4;
                segment3 = segment;
                i11 = i20;
            }
        }
        return i7;
    }
}
