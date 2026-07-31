package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntIntMap.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0015\u0010\nR\u001c\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u0003R\u001c\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u0003R\u001c\u0010\u001e\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u0012\u0004\b\u001f\u0010\u0003R\u001c\u0010 \u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u0003R\u001c\u0010#\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b#\u0010!\u0012\u0004\b$\u0010\u0003R\u0011\u0010&\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b%\u0010\u000eR\u0011\u0010(\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b'\u0010\u000e\u0082\u0001\u0001)¨\u0006*"}, d2 = {"Landroidx/collection/IntIntMap;", "", "<init>", "()V", "", "isEmpty", "()Z", "", "key", "get", "(I)I", "containsKey", "(I)Z", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "findKeyIndex", "", "metadata", "[J", "getMetadata$annotations", "", "keys", "[I", "getKeys$annotations", "values", "getValues$annotations", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableIntIntMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class IntIntMap {
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public int[] values;

    public /* synthetic */ IntIntMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IntIntMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
        this.values = IntSetKt.getEmptyIntArray();
    }

    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final int get(int key) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0) {
            RuntimeHelpersKt.throwNoSuchElementException("Cannot find value for key " + key);
        }
        return this.values[findKeyIndex];
    }

    public int hashCode() {
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr[i6];
                            i3 += Integer.hashCode(iArr2[i6]) ^ Integer.hashCode(i7);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final boolean containsKey(int key) {
        return findKeyIndex(key) >= 0;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IntIntMap)) {
            return false;
        }
        IntIntMap intIntMap = (IntIntMap) other;
        if (intIntMap.get_size() != get_size()) {
            return false;
        }
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        int i6 = iArr2[i4];
                        int findKeyIndex = intIntMap.findKeyIndex(i5);
                        if (findKeyIndex < 0 || i6 != intIntMap.values[findKeyIndex]) {
                            break loop0;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
        return false;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            int i7 = iArr2[i5];
                            sb.append(i6);
                            sb.append("=");
                            sb.append(i7);
                            i2++;
                            if (i2 < this._size) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final int findKeyIndex(int key) {
        int hashCode = Integer.hashCode(key) * (-862048943);
        int i = hashCode ^ (hashCode << 16);
        int i2 = i & 127;
        int i3 = this._capacity;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (i2 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.keys[numberOfTrailingZeros] == key) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }
}
