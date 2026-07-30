package androidx.collection;

import f6.p;
import kotlin.collections.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import y5.r;

/* loaded from: classes.dex */
public final class MutableLongObjectMap<V> extends LongObjectMap<V> {
    private int growthLimit;

    public MutableLongObjectMap() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare(r.m1710constructorimpl(r.m1710constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, r.m1710constructorimpl(r.m1710constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                removeDeletedMarkers();
                return;
            }
        }
        resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
    }

    private final int findAbsoluteInsertIndex(long j8) {
        int a8 = a.a(j8) * ScatterMapKt.MurmurHashC1;
        int i8 = a8 ^ (a8 << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this._capacity;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j9 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = i10;
            int i16 = i13;
            long j11 = j9 ^ (j10 * ScatterMapKt.BitmaskLsb);
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i12) & i11;
                if (this.keys[numberOfTrailingZeros] == j8) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i9);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    findFirstAvailableSlot = findFirstAvailableSlot(i9);
                }
                this._size++;
                int i17 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i18 = findFirstAvailableSlot >> 3;
                long j13 = jArr2[i18];
                int i19 = (findFirstAvailableSlot & 7) << 3;
                this.growthLimit = i17 - (((j13 >> i19) & 255) == 128 ? 1 : 0);
                jArr2[i18] = (j13 & (~(255 << i19))) | (j10 << i19);
                int i20 = this._capacity;
                int i21 = ((findFirstAvailableSlot - 7) & i20) + (i20 & 7);
                int i22 = i21 >> 3;
                int i23 = (i21 & 7) << 3;
                jArr2[i22] = ((~(255 << i23)) & jArr2[i22]) | (j10 << i23);
                return findFirstAvailableSlot;
            }
            i13 = i16 + 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final int findFirstAvailableSlot(int i8) {
        int i9 = this._capacity;
        int i10 = i8 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j8 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j9 = j8 & ((~j8) << 7) & (-9187201950435737472L);
            if (j9 != 0) {
                return (i10 + (Long.numberOfTrailingZeros(j9) >> 3)) & i9;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    private final void initializeMetadata(int i8) {
        long[] jArr;
        if (i8 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((i8 + 15) & (-8)) >> 3];
            k.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.metadata = jArr;
        int i9 = i8 >> 3;
        long j8 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j8)) | j8;
        initializeGrowth();
    }

    private final void initializeStorage(int i8) {
        int max = i8 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i8)) : 0;
        this._capacity = max;
        initializeMetadata(max);
        this.keys = new long[max];
        this.values = new Object[max];
    }

    private final void removeDeletedMarkers() {
        long[] jArr = this.metadata;
        int i8 = this._capacity;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = i10 >> 3;
            int i12 = (i10 & 7) << 3;
            if (((jArr[i11] >> i12) & 255) == 254) {
                long[] jArr2 = this.metadata;
                jArr2[i11] = (128 << i12) | (jArr2[i11] & (~(255 << i12)));
                int i13 = this._capacity;
                int i14 = ((i10 - 7) & i13) + (i13 & 7);
                int i15 = i14 >> 3;
                int i16 = (i14 & 7) << 3;
                jArr2[i15] = ((~(255 << i16)) & jArr2[i15]) | (128 << i16);
                i9++;
            }
        }
        this.growthLimit += i9;
    }

    private final void resizeStorage(int i8) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3 = this.metadata;
        long[] jArr4 = this.keys;
        Object[] objArr = this.values;
        int i9 = this._capacity;
        initializeStorage(i8);
        long[] jArr5 = this.keys;
        Object[] objArr2 = this.values;
        int i10 = 0;
        while (i10 < i9) {
            if (((jArr3[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128) {
                long j8 = jArr4[i10];
                int a8 = a.a(j8) * ScatterMapKt.MurmurHashC1;
                int i11 = a8 ^ (a8 << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i11 >>> 7);
                long j9 = i11 & 127;
                long[] jArr6 = this.metadata;
                int i12 = findFirstAvailableSlot >> 3;
                int i13 = (findFirstAvailableSlot & 7) << 3;
                jArr = jArr3;
                jArr2 = jArr4;
                jArr6[i12] = (jArr6[i12] & (~(255 << i13))) | (j9 << i13);
                int i14 = this._capacity;
                int i15 = ((findFirstAvailableSlot - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr6[i16] = (jArr6[i16] & (~(255 << i17))) | (j9 << i17);
                jArr5[findFirstAvailableSlot] = j8;
                objArr2[findFirstAvailableSlot] = objArr[i10];
            } else {
                jArr = jArr3;
                jArr2 = jArr4;
            }
            i10++;
            jArr3 = jArr;
            jArr4 = jArr2;
        }
    }

    private final void writeMetadata(int i8, long j8) {
        long[] jArr = this.metadata;
        int i9 = i8 >> 3;
        int i10 = (i8 & 7) << 3;
        jArr[i9] = (jArr[i9] & (~(255 << i10))) | (j8 << i10);
        int i11 = this._capacity;
        int i12 = ((i8 - 7) & i11) + (i11 & 7);
        int i13 = i12 >> 3;
        int i14 = (i12 & 7) << 3;
        jArr[i13] = (j8 << i14) | (jArr[i13] & (~(255 << i14)));
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            k.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.metadata;
            int i8 = this._capacity;
            int i9 = i8 >> 3;
            long j8 = 255 << ((i8 & 7) << 3);
            jArr2[i9] = (jArr2[i9] & (~j8)) | j8;
        }
        k.fill(this.values, (Object) null, 0, this._capacity);
        initializeGrowth();
    }

    public final V getOrPut(long j8, f6.a defaultValue) {
        s.checkNotNullParameter(defaultValue, "defaultValue");
        V v7 = get(j8);
        if (v7 != null) {
            return v7;
        }
        V v8 = (V) defaultValue.invoke();
        set(j8, v8);
        return v8;
    }

    public final void minusAssign(long j8) {
        remove(j8);
    }

    public final void plusAssign(LongObjectMap<V> from) {
        s.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final V put(long j8, V v7) {
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(j8);
        Object[] objArr = this.values;
        V v8 = (V) objArr[findAbsoluteInsertIndex];
        this.keys[findAbsoluteInsertIndex] = j8;
        objArr[findAbsoluteInsertIndex] = v7;
        return v8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(LongObjectMap<V> from) {
        s.checkNotNullParameter(from, "from");
        long[] jArr = from.keys;
        Object[] objArr = from.values;
        long[] jArr2 = from.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr2[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        int i11 = (i8 << 3) + i10;
                        set(jArr[i11], objArr[i11]);
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V remove(long j8) {
        int i8;
        int a8 = a.a(j8) * ScatterMapKt.MurmurHashC1;
        int i9 = a8 ^ (a8 << 16);
        int i10 = i9 & 127;
        int i11 = this._capacity;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j9 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (i10 * ScatterMapKt.BitmaskLsb) ^ j9;
            long j11 = (~j10) & (j10 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (this.keys[i8] == j8) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        if (i8 >= 0) {
            return removeValueAt(i8);
        }
        return null;
    }

    public final void removeIf(p predicate) {
        s.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        int i11 = (i8 << 3) + i10;
                        if (((Boolean) predicate.invoke(Long.valueOf(this.keys[i11]), this.values[i11])).booleanValue()) {
                            removeValueAt(i11);
                        }
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }

    public final V removeValueAt(int i8) {
        this._size--;
        long[] jArr = this.metadata;
        int i9 = i8 >> 3;
        int i10 = (i8 & 7) << 3;
        jArr[i9] = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        int i11 = this._capacity;
        int i12 = ((i8 - 7) & i11) + (i11 & 7);
        int i13 = i12 >> 3;
        int i14 = (i12 & 7) << 3;
        jArr[i13] = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        Object[] objArr = this.values;
        V v7 = (V) objArr[i8];
        objArr[i8] = null;
        return v7;
    }

    public final void set(long j8, V v7) {
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(j8);
        this.keys[findAbsoluteInsertIndex] = j8;
        this.values[findAbsoluteInsertIndex] = v7;
    }

    public final int trim() {
        int i8 = this._capacity;
        int normalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity >= i8) {
            return 0;
        }
        resizeStorage(normalizeCapacity);
        return i8 - this._capacity;
    }

    public /* synthetic */ MutableLongObjectMap(int i8, int i9, o oVar) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public final void minusAssign(long[] keys) {
        s.checkNotNullParameter(keys, "keys");
        for (long j8 : keys) {
            remove(j8);
        }
    }

    public MutableLongObjectMap(int i8) {
        super(null);
        if (i8 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void minusAssign(LongSet keys) {
        s.checkNotNullParameter(keys, "keys");
        long[] jArr = keys.elements;
        long[] jArr2 = keys.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr2[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        remove(jArr[(i8 << 3) + i10]);
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(long j8, V v7) {
        int i8;
        int a8 = a.a(j8) * ScatterMapKt.MurmurHashC1;
        int i9 = a8 ^ (a8 << 16);
        int i10 = i9 & 127;
        int i11 = this._capacity;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j9 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (i10 * ScatterMapKt.BitmaskLsb) ^ j9;
            long j11 = (~j10) & (j10 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (this.keys[i8] == j8) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        if (i8 < 0 || !s.areEqual(this.values[i8], v7)) {
            return false;
        }
        removeValueAt(i8);
        return true;
    }

    public final void minusAssign(LongList keys) {
        s.checkNotNullParameter(keys, "keys");
        long[] jArr = keys.content;
        int i8 = keys._size;
        for (int i9 = 0; i9 < i8; i9++) {
            remove(jArr[i9]);
        }
    }
}
