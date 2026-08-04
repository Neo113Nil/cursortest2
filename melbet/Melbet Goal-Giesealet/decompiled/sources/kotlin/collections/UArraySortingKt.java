package kotlin.collections;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UArraySorting.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", ViewProps.LEFT, ViewProps.RIGHT, "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UArraySortingKt {
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m1212partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte m828getw2LRezQ = UByteArray.m828getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = m828getw2LRezQ & 255;
                if (Intrinsics.compare(UByteArray.m828getw2LRezQ(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m828getw2LRezQ(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte m828getw2LRezQ2 = UByteArray.m828getw2LRezQ(bArr, i);
                UByteArray.m833setVurrAj0(bArr, i, UByteArray.m828getw2LRezQ(bArr, i2));
                UByteArray.m833setVurrAj0(bArr, i2, m828getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m1216quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int m1212partition4UcCI2c = m1212partition4UcCI2c(bArr, i, i2);
        int i3 = m1212partition4UcCI2c - 1;
        if (i < i3) {
            m1216quickSort4UcCI2c(bArr, i, i3);
        }
        if (m1212partition4UcCI2c < i2) {
            m1216quickSort4UcCI2c(bArr, m1212partition4UcCI2c, i2);
        }
    }

    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m1213partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short m1091getMh2AYeg = UShortArray.m1091getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int m1091getMh2AYeg2 = UShortArray.m1091getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = m1091getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(m1091getMh2AYeg2, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m1091getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short m1091getMh2AYeg3 = UShortArray.m1091getMh2AYeg(sArr, i);
                UShortArray.m1096set01HTLdE(sArr, i, UShortArray.m1091getMh2AYeg(sArr, i2));
                UShortArray.m1096set01HTLdE(sArr, i2, m1091getMh2AYeg3);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m1217quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int m1213partitionAa5vz7o = m1213partitionAa5vz7o(sArr, i, i2);
        int i3 = m1213partitionAa5vz7o - 1;
        if (i < i3) {
            m1217quickSortAa5vz7o(sArr, i, i3);
        }
        if (m1213partitionAa5vz7o < i2) {
            m1217quickSortAa5vz7o(sArr, m1213partitionAa5vz7o, i2);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int m1214partitionoBK06Vg(int[] iArr, int i, int i2) {
        int compare;
        int compare2;
        int m907getpVg5ArA = UIntArray.m907getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (compare < 0) {
                i++;
            }
            while (compare2 > 0) {
                i2--;
            }
            if (i <= i2) {
                int m907getpVg5ArA2 = UIntArray.m907getpVg5ArA(iArr, i);
                UIntArray.m912setVXSXFK8(iArr, i, UIntArray.m907getpVg5ArA(iArr, i2));
                UIntArray.m912setVXSXFK8(iArr, i2, m907getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m1218quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int m1214partitionoBK06Vg = m1214partitionoBK06Vg(iArr, i, i2);
        int i3 = m1214partitionoBK06Vg - 1;
        if (i < i3) {
            m1218quickSortoBK06Vg(iArr, i, i3);
        }
        if (m1214partitionoBK06Vg < i2) {
            m1218quickSortoBK06Vg(iArr, m1214partitionoBK06Vg, i2);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    /* renamed from: partition--nroSd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int m1211partitionnroSd4(long[] jArr, int i, int i2) {
        int compare;
        int compare2;
        long m986getsVKNKU = ULongArray.m986getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (compare < 0) {
                i++;
            }
            while (compare2 > 0) {
                i2--;
            }
            if (i <= i2) {
                long m986getsVKNKU2 = ULongArray.m986getsVKNKU(jArr, i);
                ULongArray.m991setk8EXiF4(jArr, i, ULongArray.m986getsVKNKU(jArr, i2));
                ULongArray.m991setk8EXiF4(jArr, i2, m986getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m1215quickSortnroSd4(long[] jArr, int i, int i2) {
        int m1211partitionnroSd4 = m1211partitionnroSd4(jArr, i, i2);
        int i3 = m1211partitionnroSd4 - 1;
        if (i < i3) {
            m1215quickSortnroSd4(jArr, i, i3);
        }
        if (m1211partitionnroSd4 < i2) {
            m1215quickSortnroSd4(jArr, m1211partitionnroSd4, i2);
        }
    }

    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m1220sortArray4UcCI2c(byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m1216quickSort4UcCI2c(array, i, i2 - 1);
    }

    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m1221sortArrayAa5vz7o(short[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m1217quickSortAa5vz7o(array, i, i2 - 1);
    }

    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m1222sortArrayoBK06Vg(int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m1218quickSortoBK06Vg(array, i, i2 - 1);
    }

    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m1219sortArraynroSd4(long[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m1215quickSortnroSd4(array, i, i2 - 1);
    }
}
