package kotlin.collections;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UArraySorting.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u0014\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0016\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class UArraySortingKt {
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m669partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte m289getw2LRezQ = UByteArray.m289getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = m289getw2LRezQ & 255;
                if (Intrinsics.compare(UByteArray.m289getw2LRezQ(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m289getw2LRezQ(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte m289getw2LRezQ2 = UByteArray.m289getw2LRezQ(bArr, i);
                UByteArray.m294setVurrAj0(bArr, i, UByteArray.m289getw2LRezQ(bArr, i2));
                UByteArray.m294setVurrAj0(bArr, i2, m289getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m673quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int m669partition4UcCI2c = m669partition4UcCI2c(bArr, i, i2);
        int i3 = m669partition4UcCI2c - 1;
        if (i < i3) {
            m673quickSort4UcCI2c(bArr, i, i3);
        }
        if (m669partition4UcCI2c < i2) {
            m673quickSort4UcCI2c(bArr, m669partition4UcCI2c, i2);
        }
    }

    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m670partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short m552getMh2AYeg = UShortArray.m552getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int m552getMh2AYeg2 = UShortArray.m552getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = m552getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(m552getMh2AYeg2, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m552getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short m552getMh2AYeg3 = UShortArray.m552getMh2AYeg(sArr, i);
                UShortArray.m557set01HTLdE(sArr, i, UShortArray.m552getMh2AYeg(sArr, i2));
                UShortArray.m557set01HTLdE(sArr, i2, m552getMh2AYeg3);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m674quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int m670partitionAa5vz7o = m670partitionAa5vz7o(sArr, i, i2);
        int i3 = m670partitionAa5vz7o - 1;
        if (i < i3) {
            m674quickSortAa5vz7o(sArr, i, i3);
        }
        if (m670partitionAa5vz7o < i2) {
            m674quickSortAa5vz7o(sArr, m670partitionAa5vz7o, i2);
        }
    }

    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m671partitionoBK06Vg(int[] iArr, int i, int i2) {
        int m368getpVg5ArA = UIntArray.m368getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compareUnsigned(UIntArray.m368getpVg5ArA(iArr, i), m368getpVg5ArA) < 0) {
                i++;
            }
            while (Integer.compareUnsigned(UIntArray.m368getpVg5ArA(iArr, i2), m368getpVg5ArA) > 0) {
                i2--;
            }
            if (i <= i2) {
                int m368getpVg5ArA2 = UIntArray.m368getpVg5ArA(iArr, i);
                UIntArray.m373setVXSXFK8(iArr, i, UIntArray.m368getpVg5ArA(iArr, i2));
                UIntArray.m373setVXSXFK8(iArr, i2, m368getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m675quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int m671partitionoBK06Vg = m671partitionoBK06Vg(iArr, i, i2);
        int i3 = m671partitionoBK06Vg - 1;
        if (i < i3) {
            m675quickSortoBK06Vg(iArr, i, i3);
        }
        if (m671partitionoBK06Vg < i2) {
            m675quickSortoBK06Vg(iArr, m671partitionoBK06Vg, i2);
        }
    }

    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m668partitionnroSd4(long[] jArr, int i, int i2) {
        long m447getsVKNKU = ULongArray.m447getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compareUnsigned(ULongArray.m447getsVKNKU(jArr, i), m447getsVKNKU) < 0) {
                i++;
            }
            while (Long.compareUnsigned(ULongArray.m447getsVKNKU(jArr, i2), m447getsVKNKU) > 0) {
                i2--;
            }
            if (i <= i2) {
                long m447getsVKNKU2 = ULongArray.m447getsVKNKU(jArr, i);
                ULongArray.m452setk8EXiF4(jArr, i, ULongArray.m447getsVKNKU(jArr, i2));
                ULongArray.m452setk8EXiF4(jArr, i2, m447getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m672quickSortnroSd4(long[] jArr, int i, int i2) {
        int m668partitionnroSd4 = m668partitionnroSd4(jArr, i, i2);
        int i3 = m668partitionnroSd4 - 1;
        if (i < i3) {
            m672quickSortnroSd4(jArr, i, i3);
        }
        if (m668partitionnroSd4 < i2) {
            m672quickSortnroSd4(jArr, m668partitionnroSd4, i2);
        }
    }

    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m677sortArray4UcCI2c(byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m673quickSort4UcCI2c(array, i, i2 - 1);
    }

    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m678sortArrayAa5vz7o(short[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m674quickSortAa5vz7o(array, i, i2 - 1);
    }

    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m679sortArrayoBK06Vg(int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m675quickSortoBK06Vg(array, i, i2 - 1);
    }

    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m676sortArraynroSd4(long[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m672quickSortnroSd4(array, i, i2 - 1);
    }
}
