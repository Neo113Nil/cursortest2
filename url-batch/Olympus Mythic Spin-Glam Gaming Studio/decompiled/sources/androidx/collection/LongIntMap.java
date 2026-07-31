package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LongIntMap.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0003R\u001c\u0010\u0018\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003R\u001c\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u0003R\u001c\u0010\u001e\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010\u0003R\u001c\u0010!\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b!\u0010\u001f\u0012\u0004\b\"\u0010\u0003R\u0011\u0010$\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010\tR\u0011\u0010&\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b%\u0010\t\u0082\u0001\u0001'¨\u0006("}, d2 = {"Landroidx/collection/LongIntMap;", "", "<init>", "()V", "", "isEmpty", "()Z", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "key", "findKeyIndex", "(J)I", "", "metadata", "[J", "getMetadata$annotations", "keys", "getKeys$annotations", "", "values", "[I", "getValues$annotations", "_capacity", "I", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableLongIntMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class LongIntMap {
    public int _capacity;
    public int _size;
    public long[] keys;
    public long[] metadata;
    public int[] values;

    public /* synthetic */ LongIntMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LongIntMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.getEmptyLongArray();
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

    public int hashCode() {
        long[] jArr = this.keys;
        int[] iArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            long j2 = jArr[i6];
                            i3 += Integer.hashCode(iArr[i6]) ^ Long.hashCode(j2);
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

    public boolean equals(Object other) {
        int i;
        if (other == this) {
            return true;
        }
        if (!(other instanceof LongIntMap)) {
            return false;
        }
        LongIntMap longIntMap = (LongIntMap) other;
        if (longIntMap.get_size() != get_size()) {
            return false;
        }
        long[] jArr = this.keys;
        int[] iArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            i = i5;
                            long j2 = jArr[i6];
                            int i7 = iArr[i6];
                            int findKeyIndex = longIntMap.findKeyIndex(j2);
                            if (findKeyIndex < 0 || i7 != longIntMap.values[findKeyIndex]) {
                                break loop0;
                            }
                            i3 = 8;
                        } else {
                            i = i5;
                        }
                        j >>= i3;
                        i5 = i + 1;
                    }
                    if (i4 != i3) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
            return false;
        }
        return true;
    }

    public String toString() {
        int i;
        int i2;
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        long[] jArr = this.keys;
        int[] iArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            int i8 = iArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(i8);
                            i4++;
                            if (i4 < this._size) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i9 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i9;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final int findKeyIndex(long key) {
        int hashCode = Long.hashCode(key) * (-862048943);
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
