package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ObjectIntMap.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001d\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001b\u0010\fJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001d\u0010\fJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010\u0006R\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/collection/MutableObjectIntMap;", "K", "Landroidx/collection/ObjectIntMap;", "", "initialCapacity", "<init>", "(I)V", "", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "key", "findIndex", "(Ljava/lang/Object;)I", "hash1", "findFirstAvailableSlot", "(I)I", "value", "set", "(Ljava/lang/Object;I)V", "default", "put", "(Ljava/lang/Object;II)I", "index", "removeValueAt", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "growthLimit", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MutableObjectIntMap<K> extends ObjectIntMap<K> {
    private int growthLimit;

    public /* synthetic */ MutableObjectIntMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableObjectIntMap(int i) {
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
        this.keys = new Object[max];
        this.values = new int[max];
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

    public final void set(Object key, int value) {
        int findIndex = findIndex(key);
        if (findIndex < 0) {
            findIndex = ~findIndex;
        }
        this.keys[findIndex] = key;
        this.values[findIndex] = value;
    }

    public final int put(Object key, int value, int r5) {
        int findIndex = findIndex(key);
        if (findIndex < 0) {
            findIndex = ~findIndex;
        } else {
            r5 = this.values[findIndex];
        }
        this.keys[findIndex] = key;
        this.values[findIndex] = value;
        return r5;
    }

    public final void removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
        this.keys[index] = null;
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
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int i2 = (i + 7) >> 3;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long j = jArr[i4] & (-9187201950435737472L);
            jArr[i4] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i5 = lastIndex - 1;
        long j2 = 72057594037927935L;
        jArr[i5] = (jArr[i5] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i6 = 0;
        while (i6 != i) {
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j3 = (jArr[i7] >> i8) & 255;
            if (j3 != 128 && j3 == 254) {
                Object obj = objArr[i6];
                int hashCode = (obj != null ? obj.hashCode() : i3) * (-862048943);
                int i9 = (hashCode ^ (hashCode << 16)) >>> 7;
                int findFirstAvailableSlot = findFirstAvailableSlot(i9);
                int i10 = i9 & i;
                if (((findFirstAvailableSlot - i10) & i) / 8 == ((i6 - i10) & i) / 8) {
                    jArr[i7] = ((r8 & 127) << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i3] & j2) | Long.MIN_VALUE;
                } else {
                    int i11 = findFirstAvailableSlot >> 3;
                    long j4 = jArr[i11];
                    int i12 = (findFirstAvailableSlot & 7) << 3;
                    if (((j4 >> i12) & 255) == 128) {
                        jArr[i11] = ((~(255 << i12)) & j4) | ((r8 & 127) << i12);
                        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (128 << i8);
                        objArr[findFirstAvailableSlot] = objArr[i6];
                        objArr[i6] = null;
                        iArr[findFirstAvailableSlot] = iArr[i6];
                        iArr[i6] = 0;
                    } else {
                        jArr[i11] = ((r8 & 127) << i12) | ((~(255 << i12)) & j4);
                        Object obj2 = objArr[findFirstAvailableSlot];
                        objArr[findFirstAvailableSlot] = objArr[i6];
                        objArr[i6] = obj2;
                        int i13 = iArr[findFirstAvailableSlot];
                        iArr[findFirstAvailableSlot] = iArr[i6];
                        iArr[i6] = i13;
                        i6--;
                    }
                    j2 = 72057594037927935L;
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    i6++;
                    i3 = 0;
                }
            }
            i6++;
        }
        initializeGrowth();
    }

    public final void resizeStorage$collection(int newCapacity) {
        int i;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int i2 = this._capacity;
        initializeStorage(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        int[] iArr2 = this.values;
        int i3 = this._capacity;
        int i4 = 0;
        while (i4 < i2) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i4];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i5 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i5 >>> 7);
                i = i4;
                long j = i5 & 127;
                int i6 = findFirstAvailableSlot >> 3;
                int i7 = (findFirstAvailableSlot & 7) << 3;
                long j2 = (j << i7) | (jArr2[i6] & (~(255 << i7)));
                jArr2[i6] = j2;
                jArr2[(((findFirstAvailableSlot - 7) & i3) + (i3 & 7)) >> 3] = j2;
                objArr2[findFirstAvailableSlot] = obj;
                iArr2[findFirstAvailableSlot] = iArr[i];
            } else {
                i = i4;
            }
            i4 = i + 1;
        }
    }

    private final int findIndex(Object key) {
        int hashCode = (key != null ? key.hashCode() : 0) * (-862048943);
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
            int i9 = i3;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (Intrinsics.areEqual(this.keys[numberOfTrailingZeros], key)) {
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
                return ~findFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }
}
