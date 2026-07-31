package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.C1924SegmentedByteString;
import com.applovin.shadow.okio.Segment;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SegmentedByteString.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000f\u001a\u00020\r*\u00020\u00072\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aD\u0010\u000f\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000bH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0013\u001a$\u0010\u0015\u001a\u00020\u0014*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0018\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0014\u0010\u001c\u001a\u00020\f*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a,\u0010\"\u001a\u00020\r*\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a4\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b'\u0010(\u001a4\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b'\u0010)\u001a4\u0010,\u001a\u00020\r*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b,\u0010-\u001a\u001e\u0010/\u001a\u00020&*\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010.H\u0080\b¢\u0006\u0004\b/\u00100\u001a\u0014\u00101\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b1\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, d2 = {"", "", "value", "fromIndex", "toIndex", "binarySearch", "([IIII)I", "Lcom/applovin/shadow/okio/SegmentedByteString;", "pos", "segment", "(Lcom/applovin/shadow/okio/SegmentedByteString;I)I", "Lkotlin/Function3;", "", "", "action", "forEachSegment", "(Lcom/applovin/shadow/okio/SegmentedByteString;Lkotlin/jvm/functions/Function3;)V", "beginIndex", "endIndex", "(Lcom/applovin/shadow/okio/SegmentedByteString;IILkotlin/jvm/functions/Function3;)V", "Lcom/applovin/shadow/okio/ByteString;", "commonSubstring", "(Lcom/applovin/shadow/okio/SegmentedByteString;II)Lcom/applovin/shadow/okio/ByteString;", "", "commonInternalGet", "(Lcom/applovin/shadow/okio/SegmentedByteString;I)B", "commonGetSize", "(Lcom/applovin/shadow/okio/SegmentedByteString;)I", "commonToByteArray", "(Lcom/applovin/shadow/okio/SegmentedByteString;)[B", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "offset", "byteCount", "commonWrite", "(Lcom/applovin/shadow/okio/SegmentedByteString;Lcom/applovin/shadow/okio/Buffer;II)V", "other", "otherOffset", "", "commonRangeEquals", "(Lcom/applovin/shadow/okio/SegmentedByteString;ILcom/applovin/shadow/okio/ByteString;II)Z", "(Lcom/applovin/shadow/okio/SegmentedByteString;I[BII)Z", "target", "targetOffset", "commonCopyInto", "(Lcom/applovin/shadow/okio/SegmentedByteString;I[BII)V", "", "commonEquals", "(Lcom/applovin/shadow/okio/SegmentedByteString;Ljava/lang/Object;)Z", "commonHashCode", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.applovin.shadow.okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes6.dex */
public final class SegmentedByteString {
    public static final int binarySearch(@NotNull int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int segment(@NotNull C1924SegmentedByteString c1924SegmentedByteString, int i) {
        Intrinsics.checkNotNullParameter(c1924SegmentedByteString, "<this>");
        int binarySearch = binarySearch(c1924SegmentedByteString.getDirectory(), i + 1, 0, c1924SegmentedByteString.getSegments().length);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public static final void forEachSegment(@NotNull C1924SegmentedByteString c1924SegmentedByteString, @NotNull Function3 action) {
        Intrinsics.checkNotNullParameter(c1924SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = c1924SegmentedByteString.getSegments().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = c1924SegmentedByteString.getDirectory()[length + i];
            int i4 = c1924SegmentedByteString.getDirectory()[i];
            action.invoke(c1924SegmentedByteString.getSegments()[i], Integer.valueOf(i3), Integer.valueOf(i4 - i2));
            i++;
            i2 = i4;
        }
    }

    public static final void commonWrite(@NotNull C1924SegmentedByteString c1924SegmentedByteString, @NotNull Buffer buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(c1924SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i3 = i + i2;
        int segment = segment(c1924SegmentedByteString, i);
        while (i < i3) {
            int i4 = segment == 0 ? 0 : c1924SegmentedByteString.getDirectory()[segment - 1];
            int i5 = c1924SegmentedByteString.getDirectory()[segment] - i4;
            int i6 = c1924SegmentedByteString.getDirectory()[c1924SegmentedByteString.getSegments().length + segment];
            int min = Math.min(i3, i5 + i4) - i;
            int i7 = i6 + (i - i4);
            Segment segment2 = new Segment(c1924SegmentedByteString.getSegments()[segment], i7, i7 + min, true, false);
            Segment segment3 = buffer.head;
            if (segment3 == null) {
                segment2.prev = segment2;
                segment2.next = segment2;
                buffer.head = segment2;
            } else {
                Intrinsics.checkNotNull(segment3);
                Segment segment4 = segment3.prev;
                Intrinsics.checkNotNull(segment4);
                segment4.push(segment2);
            }
            i += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + i2);
    }

    private static final void forEachSegment(C1924SegmentedByteString c1924SegmentedByteString, int i, int i2, Function3 function3) {
        int segment = segment(c1924SegmentedByteString, i);
        while (i < i2) {
            int i3 = segment == 0 ? 0 : c1924SegmentedByteString.getDirectory()[segment - 1];
            int i4 = c1924SegmentedByteString.getDirectory()[segment] - i3;
            int i5 = c1924SegmentedByteString.getDirectory()[c1924SegmentedByteString.getSegments().length + segment];
            int min = Math.min(i2, i4 + i3) - i;
            function3.invoke(c1924SegmentedByteString.getSegments()[segment], Integer.valueOf(i5 + (i - i3)), Integer.valueOf(min));
            i += min;
            segment++;
        }
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull C1924SegmentedByteString c1924SegmentedByteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(c1924SegmentedByteString, "<this>");
        int resolveDefaultParameter = com.applovin.shadow.okio.SegmentedByteString.resolveDefaultParameter(c1924SegmentedByteString, i2);
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
        if (resolveDefaultParameter > c1924SegmentedByteString.size()) {
            throw new IllegalArgumentException(("endIndex=" + resolveDefaultParameter + " > length(" + c1924SegmentedByteString.size() + ')').toString());
        }
        int i3 = resolveDefaultParameter - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(("endIndex=" + resolveDefaultParameter + " < beginIndex=" + i).toString());
        }
        if (i == 0 && resolveDefaultParameter == c1924SegmentedByteString.size()) {
            return c1924SegmentedByteString;
        }
        if (i == resolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int segment = segment(c1924SegmentedByteString, i);
        int segment2 = segment(c1924SegmentedByteString, resolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) ArraysKt.copyOfRange(c1924SegmentedByteString.getSegments(), segment, segment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (segment <= segment2) {
            int i4 = segment;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(c1924SegmentedByteString.getDirectory()[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr.length] = c1924SegmentedByteString.getDirectory()[c1924SegmentedByteString.getSegments().length + i4];
                if (i4 == segment2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = segment != 0 ? c1924SegmentedByteString.getDirectory()[segment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i - i7);
        return new C1924SegmentedByteString(bArr, iArr);
    }

    public static final byte commonInternalGet(@NotNull C1924SegmentedByteString c1924SegmentedByteString, int i) {
        Intrinsics.checkNotNullParameter(c1924SegmentedByteString, "<this>");
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c1924SegmentedByteString.getDirectory()[c1924SegmentedByteString.getSegments().length - 1], i, 1L);
        int segment = segment(c1924SegmentedByteString, i);
        return c1924SegmentedByteString.getSegments()[segment][(i - (segment == 0 ? 0 : c1924SegmentedByteString.getDirectory()[segment - 1])) + c1924SegmentedByteString.getDirectory()[c1924SegmentedByteString.getSegments().length + segment]];
    }

    public static final int commonGetSize(@NotNull C1924SegmentedByteString c1924SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c1924SegmentedByteString, "<this>");
        return c1924SegmentedByteString.getDirectory()[c1924SegmentedByteString.getSegments().length - 1];
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull C1924SegmentedByteString c1924SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c1924SegmentedByteString, "<this>");
        byte[] bArr = new byte[c1924SegmentedByteString.size()];
        int length = c1924SegmentedByteString.getSegments().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = c1924SegmentedByteString.getDirectory()[length + i];
            int i5 = c1924SegmentedByteString.getDirectory()[i];
            int i6 = i5 - i2;
            ArraysKt.copyInto(c1924SegmentedByteString.getSegments()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public static final boolean commonRangeEquals(@NotNull C1924SegmentedByteString c1924SegmentedByteString, int i, @NotNull ByteString other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(c1924SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > c1924SegmentedByteString.size() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = segment(c1924SegmentedByteString, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : c1924SegmentedByteString.getDirectory()[segment - 1];
            int i6 = c1924SegmentedByteString.getDirectory()[segment] - i5;
            int i7 = c1924SegmentedByteString.getDirectory()[c1924SegmentedByteString.getSegments().length + segment];
            int min = Math.min(i4, i6 + i5) - i;
            if (!other.rangeEquals(i2, c1924SegmentedByteString.getSegments()[segment], i7 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }

    public static final boolean commonRangeEquals(@NotNull C1924SegmentedByteString c1924SegmentedByteString, int i, @NotNull byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(c1924SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > c1924SegmentedByteString.size() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = segment(c1924SegmentedByteString, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : c1924SegmentedByteString.getDirectory()[segment - 1];
            int i6 = c1924SegmentedByteString.getDirectory()[segment] - i5;
            int i7 = c1924SegmentedByteString.getDirectory()[c1924SegmentedByteString.getSegments().length + segment];
            int min = Math.min(i4, i6 + i5) - i;
            if (!com.applovin.shadow.okio.SegmentedByteString.arrayRangeEquals(c1924SegmentedByteString.getSegments()[segment], i7 + (i - i5), other, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }

    public static final void commonCopyInto(@NotNull C1924SegmentedByteString c1924SegmentedByteString, int i, @NotNull byte[] target, int i2, int i3) {
        Intrinsics.checkNotNullParameter(c1924SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        long j = i3;
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c1924SegmentedByteString.size(), i, j);
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(target.length, i2, j);
        int i4 = i3 + i;
        int segment = segment(c1924SegmentedByteString, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : c1924SegmentedByteString.getDirectory()[segment - 1];
            int i6 = c1924SegmentedByteString.getDirectory()[segment] - i5;
            int i7 = c1924SegmentedByteString.getDirectory()[c1924SegmentedByteString.getSegments().length + segment];
            int min = Math.min(i4, i6 + i5) - i;
            int i8 = i7 + (i - i5);
            ArraysKt.copyInto(c1924SegmentedByteString.getSegments()[segment], target, i2, i8, i8 + min);
            i2 += min;
            i += min;
            segment++;
        }
    }

    public static final boolean commonEquals(@NotNull C1924SegmentedByteString c1924SegmentedByteString, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(c1924SegmentedByteString, "<this>");
        if (obj == c1924SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c1924SegmentedByteString.size() && c1924SegmentedByteString.rangeEquals(0, byteString, 0, c1924SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonHashCode(@NotNull C1924SegmentedByteString c1924SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c1924SegmentedByteString, "<this>");
        int hashCode = c1924SegmentedByteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = c1924SegmentedByteString.getSegments().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = c1924SegmentedByteString.getDirectory()[length + i];
            int i5 = c1924SegmentedByteString.getDirectory()[i];
            byte[] bArr = c1924SegmentedByteString.getSegments()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        c1924SegmentedByteString.setHashCode$okio(i2);
        return i2;
    }
}
