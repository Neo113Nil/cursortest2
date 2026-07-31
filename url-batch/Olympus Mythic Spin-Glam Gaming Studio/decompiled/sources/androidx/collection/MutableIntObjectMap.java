package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: IntObjectMap.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ \u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001b\u0010\fJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001e\u0010\u0006R\u0016\u0010 \u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/collection/MutableIntObjectMap;", "V", "Landroidx/collection/IntObjectMap;", "", "initialCapacity", "<init>", "(I)V", "", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "key", "findAbsoluteInsertIndex", "(I)I", "hash1", "findFirstAvailableSlot", "value", "set", "(ILjava/lang/Object;)V", "remove", "(I)Ljava/lang/Object;", "index", "removeValueAt", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "growthLimit", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MutableIntObjectMap<V> extends IntObjectMap<V> {
    private int growthLimit;

    public /* synthetic */ MutableIntObjectMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableIntObjectMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    private final void initializeStorage(int initialCapacity) {
        int max = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = max;
        initializeMetadata(max);
        this.keys = new int[max];
        this.values = new Object[max];
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.metadata = jArr;
        int i = capacity >> 3;
        long j = 255 << ((capacity & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final void set(int key, Object value) {
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(key);
        this.keys[findAbsoluteInsertIndex] = key;
        this.values[findAbsoluteInsertIndex] = value;
    }

    public final Object removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
        Object[] objArr = this.values;
        Object obj = objArr[index];
        objArr[index] = null;
        return obj;
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i = this._capacity;
        int i2 = hash1 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    private final int findAbsoluteInsertIndex(int key) {
        int hashCode = Integer.hashCode(key) * (-862048943);
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i6;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.keys[numberOfTrailingZeros] == key) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    findFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = findFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (findFirstAvailableSlot & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this._capacity;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((findFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return findFirstAvailableSlot;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(int key) {
        int i;
        int hashCode = Integer.hashCode(key) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.keys[i] == key) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i >= 0) {
            return removeValueAt(i);
        }
        return null;
    }

    public final void adjustStorage$collection() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare(ULong.m8077constructorimpl(ULong.m8077constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m8077constructorimpl(ULong.m8077constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
    }

    public final void dropDeletes$collection() {
        long[] jArr = this.metadata;
        int i = this._capacity;
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        int i2 = (i + 7) >> 3;
        char c = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = jArr[i3] & (-9187201950435737472L);
            jArr[i3] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i4 = lastIndex - 1;
        long j2 = 72057594037927935L;
        jArr[i4] = (jArr[i4] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i5 = 0;
        while (i5 != i) {
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j3 = (jArr[i6] >> i7) & 255;
            if (j3 != 128 && j3 == 254) {
                int hashCode = Integer.hashCode(iArr[i5]) * (-862048943);
                int i8 = (hashCode ^ (hashCode << 16)) >>> 7;
                int findFirstAvailableSlot = findFirstAvailableSlot(i8);
                int i9 = i8 & i;
                if (((findFirstAvailableSlot - i9) & i) / 8 == ((i5 - i9) & i) / 8) {
                    jArr[i6] = ((r8 & 127) << i7) | ((~(255 << i7)) & jArr[i6]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[c] & j2) | Long.MIN_VALUE;
                } else {
                    int i10 = findFirstAvailableSlot >> 3;
                    long j4 = jArr[i10];
                    int i11 = (findFirstAvailableSlot & 7) << 3;
                    if (((j4 >> i11) & 255) == 128) {
                        jArr[i10] = ((~(255 << i11)) & j4) | ((r8 & 127) << i11);
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        iArr[findFirstAvailableSlot] = iArr[i5];
                        iArr[i5] = 0;
                        objArr[findFirstAvailableSlot] = objArr[i5];
                        objArr[i5] = null;
                    } else {
                        jArr[i10] = ((r8 & 127) << i11) | ((~(255 << i11)) & j4);
                        int i12 = iArr[findFirstAvailableSlot];
                        iArr[findFirstAvailableSlot] = iArr[i5];
                        iArr[i5] = i12;
                        Object obj = objArr[findFirstAvailableSlot];
                        objArr[findFirstAvailableSlot] = objArr[i5];
                        objArr[i5] = obj;
                        i5--;
                    }
                    j2 = 72057594037927935L;
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    i5++;
                    c = 0;
                }
            }
            i5++;
        }
        initializeGrowth();
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        MutableIntObjectMap<V> mutableIntObjectMap = this;
        long[] jArr2 = mutableIntObjectMap.metadata;
        int[] iArr = mutableIntObjectMap.keys;
        Object[] objArr = mutableIntObjectMap.values;
        int i = mutableIntObjectMap._capacity;
        initializeStorage(newCapacity);
        long[] jArr3 = mutableIntObjectMap.metadata;
        int[] iArr2 = mutableIntObjectMap.keys;
        Object[] objArr2 = mutableIntObjectMap.values;
        int i2 = mutableIntObjectMap._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr[i3];
                int hashCode = Integer.hashCode(i4) * (-862048943);
                int i5 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = mutableIntObjectMap.findFirstAvailableSlot(i5 >>> 7);
                long j = i5 & 127;
                int i6 = findFirstAvailableSlot >> 3;
                int i7 = (findFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j2 = (jArr3[i6] & (~(255 << i7))) | (j << i7);
                jArr3[i6] = j2;
                jArr3[(((findFirstAvailableSlot - 7) & i2) + (i2 & 7)) >> 3] = j2;
                iArr2[findFirstAvailableSlot] = i4;
                objArr2[findFirstAvailableSlot] = objArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            mutableIntObjectMap = this;
            jArr2 = jArr;
        }
    }
}
