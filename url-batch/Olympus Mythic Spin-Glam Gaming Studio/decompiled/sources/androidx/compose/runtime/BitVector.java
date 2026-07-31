package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlotTable.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/BitVector;", "", "", "index", "", "get", "(I)Z", "nextClear", "(I)I", "", "toString", "()Ljava/lang/String;", "", "first", "J", "second", "", "others", "[J", "getSize", "()I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BitVector {
    private long first;
    private long[] others;
    private long second;

    public final int getSize() {
        return (this.others.length + 2) * 64;
    }

    public final boolean get(int index) {
        int i;
        if (index < 64) {
            return ((1 << index) & this.first) != 0;
        }
        if (index < 128) {
            return ((1 << (index - 64)) & this.second) != 0;
        }
        long[] jArr = this.others;
        int length = jArr.length;
        if (length != 0 && (index / 64) - 2 < length) {
            return ((1 << (index % 64)) & jArr[i]) != 0;
        }
        return false;
    }

    public final int nextClear(int index) {
        int numberOfTrailingZeros;
        if (index < 64 && (numberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.first) >>> index) << index)) < 64) {
            return numberOfTrailingZeros;
        }
        if (index < 128) {
            int i = index - 64;
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.second) >>> i) << i);
            if (numberOfTrailingZeros2 < 64) {
                return numberOfTrailingZeros2 + 64;
            }
        }
        int max = Math.max(index, 128);
        int i2 = (max / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i3 = i2; i3 < length; i3++) {
            long j = ~jArr[i3];
            if (i3 == i2) {
                int i4 = max % 64;
                j = (j >>> i4) << i4;
            }
            int numberOfTrailingZeros3 = Long.numberOfTrailingZeros(j);
            if (numberOfTrailingZeros3 < 64) {
                return (i3 * 64) + 128 + numberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BitVector [");
        int size = getSize();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            if (get(i)) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i);
                z = false;
            }
        }
        sb.append(']');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
