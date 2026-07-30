package okio.internal;

import f6.q;
import kotlin.collections.k;
import kotlin.jvm.internal.s;
import okio.ByteString;
import okio.SegmentedByteString;
import okio.d1;
import okio.t0;

/* loaded from: classes5.dex */
public abstract class g {
    public static final int binarySearch(int[] iArr, int i8, int i9, int i10) {
        s.checkNotNullParameter(iArr, "<this>");
        int i11 = i10 - 1;
        while (i9 <= i11) {
            int i12 = (i9 + i11) >>> 1;
            int i13 = iArr[i12];
            if (i13 < i8) {
                i9 = i12 + 1;
            } else {
                if (i13 <= i8) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return (-i9) - 1;
    }

    public static final void commonCopyInto(SegmentedByteString segmentedByteString, int i8, byte[] target, int i9, int i10) {
        s.checkNotNullParameter(segmentedByteString, "<this>");
        s.checkNotNullParameter(target, "target");
        long j8 = i10;
        d1.checkOffsetAndCount(segmentedByteString.size(), i8, j8);
        d1.checkOffsetAndCount(target.length, i9, j8);
        int i11 = i10 + i8;
        int segment = segment(segmentedByteString, i8);
        while (i8 < i11) {
            int i12 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i13 = segmentedByteString.getDirectory$okio()[segment] - i12;
            int i14 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i11, i13 + i12) - i8;
            int i15 = i14 + (i8 - i12);
            k.copyInto(segmentedByteString.getSegments$okio()[segment], target, i9, i15, i15 + min);
            i9 += min;
            i8 += min;
            segment++;
        }
    }

    public static final boolean commonEquals(SegmentedByteString segmentedByteString, Object obj) {
        s.checkNotNullParameter(segmentedByteString, "<this>");
        if (obj == segmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == segmentedByteString.size() && segmentedByteString.rangeEquals(0, byteString, 0, segmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(SegmentedByteString segmentedByteString) {
        s.checkNotNullParameter(segmentedByteString, "<this>");
        return segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(SegmentedByteString segmentedByteString) {
        s.checkNotNullParameter(segmentedByteString, "<this>");
        int hashCode$okio = segmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = segmentedByteString.getSegments$okio().length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        while (i8 < length) {
            int i11 = segmentedByteString.getDirectory$okio()[length + i8];
            int i12 = segmentedByteString.getDirectory$okio()[i8];
            byte[] bArr = segmentedByteString.getSegments$okio()[i8];
            int i13 = (i12 - i9) + i11;
            while (i11 < i13) {
                i10 = (i10 * 31) + bArr[i11];
                i11++;
            }
            i8++;
            i9 = i12;
        }
        segmentedByteString.setHashCode$okio(i10);
        return i10;
    }

    public static final byte commonInternalGet(SegmentedByteString segmentedByteString, int i8) {
        s.checkNotNullParameter(segmentedByteString, "<this>");
        d1.checkOffsetAndCount(segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length - 1], i8, 1L);
        int segment = segment(segmentedByteString, i8);
        return segmentedByteString.getSegments$okio()[segment][(i8 - (segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1])) + segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment]];
    }

    public static final boolean commonRangeEquals(SegmentedByteString segmentedByteString, int i8, ByteString other, int i9, int i10) {
        s.checkNotNullParameter(segmentedByteString, "<this>");
        s.checkNotNullParameter(other, "other");
        if (i8 < 0 || i8 > segmentedByteString.size() - i10) {
            return false;
        }
        int i11 = i10 + i8;
        int segment = segment(segmentedByteString, i8);
        while (i8 < i11) {
            int i12 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i13 = segmentedByteString.getDirectory$okio()[segment] - i12;
            int i14 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i11, i13 + i12) - i8;
            if (!other.rangeEquals(i9, segmentedByteString.getSegments$okio()[segment], i14 + (i8 - i12), min)) {
                return false;
            }
            i9 += min;
            i8 += min;
            segment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(SegmentedByteString segmentedByteString, int i8, int i9) {
        s.checkNotNullParameter(segmentedByteString, "<this>");
        int resolveDefaultParameter = d1.resolveDefaultParameter(segmentedByteString, i9);
        if (!(i8 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i8 + " < 0").toString());
        }
        if (!(resolveDefaultParameter <= segmentedByteString.size())) {
            throw new IllegalArgumentException(("endIndex=" + resolveDefaultParameter + " > length(" + segmentedByteString.size() + ')').toString());
        }
        int i10 = resolveDefaultParameter - i8;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + resolveDefaultParameter + " < beginIndex=" + i8).toString());
        }
        if (i8 == 0 && resolveDefaultParameter == segmentedByteString.size()) {
            return segmentedByteString;
        }
        if (i8 == resolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int segment = segment(segmentedByteString, i8);
        int segment2 = segment(segmentedByteString, resolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) k.copyOfRange(segmentedByteString.getSegments$okio(), segment, segment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (segment <= segment2) {
            int i11 = segment;
            int i12 = 0;
            while (true) {
                int i13 = i11 + 1;
                iArr[i12] = Math.min(segmentedByteString.getDirectory$okio()[i11] - i8, i10);
                int i14 = i12 + 1;
                iArr[i12 + bArr.length] = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + i11];
                if (i11 == segment2) {
                    break;
                }
                i11 = i13;
                i12 = i14;
            }
        }
        int i15 = segment != 0 ? segmentedByteString.getDirectory$okio()[segment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i8 - i15);
        return new SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(SegmentedByteString segmentedByteString) {
        s.checkNotNullParameter(segmentedByteString, "<this>");
        byte[] bArr = new byte[segmentedByteString.size()];
        int length = segmentedByteString.getSegments$okio().length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            int i11 = segmentedByteString.getDirectory$okio()[length + i8];
            int i12 = segmentedByteString.getDirectory$okio()[i8];
            int i13 = i12 - i9;
            k.copyInto(segmentedByteString.getSegments$okio()[i8], bArr, i10, i11, i11 + i13);
            i10 += i13;
            i8++;
            i9 = i12;
        }
        return bArr;
    }

    public static final void commonWrite(SegmentedByteString segmentedByteString, okio.c buffer, int i8, int i9) {
        s.checkNotNullParameter(segmentedByteString, "<this>");
        s.checkNotNullParameter(buffer, "buffer");
        int i10 = i8 + i9;
        int segment = segment(segmentedByteString, i8);
        while (i8 < i10) {
            int i11 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i12 = segmentedByteString.getDirectory$okio()[segment] - i11;
            int i13 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i10, i12 + i11) - i8;
            int i14 = i13 + (i8 - i11);
            t0 t0Var = new t0(segmentedByteString.getSegments$okio()[segment], i14, i14 + min, true, false);
            t0 t0Var2 = buffer.head;
            if (t0Var2 == null) {
                t0Var.prev = t0Var;
                t0Var.next = t0Var;
                buffer.head = t0Var;
            } else {
                s.checkNotNull(t0Var2);
                t0 t0Var3 = t0Var2.prev;
                s.checkNotNull(t0Var3);
                t0Var3.push(t0Var);
            }
            i8 += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + i9);
    }

    public static final void forEachSegment(SegmentedByteString segmentedByteString, q action) {
        s.checkNotNullParameter(segmentedByteString, "<this>");
        s.checkNotNullParameter(action, "action");
        int length = segmentedByteString.getSegments$okio().length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = segmentedByteString.getDirectory$okio()[length + i8];
            int i11 = segmentedByteString.getDirectory$okio()[i8];
            action.invoke(segmentedByteString.getSegments$okio()[i8], Integer.valueOf(i10), Integer.valueOf(i11 - i9));
            i8++;
            i9 = i11;
        }
    }

    public static final int segment(SegmentedByteString segmentedByteString, int i8) {
        s.checkNotNullParameter(segmentedByteString, "<this>");
        int binarySearch = binarySearch(segmentedByteString.getDirectory$okio(), i8 + 1, 0, segmentedByteString.getSegments$okio().length);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private static final void forEachSegment(SegmentedByteString segmentedByteString, int i8, int i9, q qVar) {
        int segment = segment(segmentedByteString, i8);
        while (i8 < i9) {
            int i10 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i11 = segmentedByteString.getDirectory$okio()[segment] - i10;
            int i12 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i9, i11 + i10) - i8;
            qVar.invoke(segmentedByteString.getSegments$okio()[segment], Integer.valueOf(i12 + (i8 - i10)), Integer.valueOf(min));
            i8 += min;
            segment++;
        }
    }

    public static final boolean commonRangeEquals(SegmentedByteString segmentedByteString, int i8, byte[] other, int i9, int i10) {
        s.checkNotNullParameter(segmentedByteString, "<this>");
        s.checkNotNullParameter(other, "other");
        if (i8 < 0 || i8 > segmentedByteString.size() - i10 || i9 < 0 || i9 > other.length - i10) {
            return false;
        }
        int i11 = i10 + i8;
        int segment = segment(segmentedByteString, i8);
        while (i8 < i11) {
            int i12 = segment == 0 ? 0 : segmentedByteString.getDirectory$okio()[segment - 1];
            int i13 = segmentedByteString.getDirectory$okio()[segment] - i12;
            int i14 = segmentedByteString.getDirectory$okio()[segmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i11, i13 + i12) - i8;
            if (!d1.arrayRangeEquals(segmentedByteString.getSegments$okio()[segment], i14 + (i8 - i12), other, i9, min)) {
                return false;
            }
            i9 += min;
            i8 += min;
            segment++;
        }
        return true;
    }
}
