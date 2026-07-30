package androidx.collection;

import f6.p;
import kotlin.collections.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import y5.r;

/* loaded from: classes.dex */
public final class MutableIntFloatMap extends IntFloatMap {
    private int growthLimit;

    public MutableIntFloatMap() {
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

    private final int findInsertIndex(int i8) {
        int i9 = ScatterMapKt.MurmurHashC1 * i8;
        int i10 = i9 ^ (i9 << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this._capacity;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j8 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j9 = i12;
            int i18 = i15;
            long j10 = j8 ^ (j9 * ScatterMapKt.BitmaskLsb);
            for (long j11 = (~j10) & (j10 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j11) >> 3)) & i13;
                if (this.keys[numberOfTrailingZeros] == i8) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i11);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    findFirstAvailableSlot = findFirstAvailableSlot(i11);
                }
                this._size++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = findFirstAvailableSlot >> 3;
                long j12 = jArr2[i20];
                int i21 = (findFirstAvailableSlot & 7) << 3;
                this.growthLimit = i19 - (((j12 >> i21) & 255) == 128 ? 1 : 0);
                jArr2[i20] = (j12 & (~(255 << i21))) | (j9 << i21);
                int i22 = this._capacity;
                int i23 = ((findFirstAvailableSlot - 7) & i22) + (i22 & 7);
                int i24 = i23 >> 3;
                int i25 = (i23 & 7) << 3;
                jArr2[i24] = ((~(255 << i25)) & jArr2[i24]) | (j9 << i25);
                return ~findFirstAvailableSlot;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
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
        this.keys = new int[max];
        this.values = new float[max];
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
        int[] iArr;
        long[] jArr2 = this.metadata;
        int[] iArr2 = this.keys;
        float[] fArr = this.values;
        int i9 = this._capacity;
        initializeStorage(i8);
        int[] iArr3 = this.keys;
        float[] fArr2 = this.values;
        int i10 = 0;
        while (i10 < i9) {
            if (((jArr2[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128) {
                int i11 = iArr2[i10];
                int i12 = ScatterMapKt.MurmurHashC1 * i11;
                int i13 = i12 ^ (i12 << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i13 >>> 7);
                long j8 = i13 & 127;
                long[] jArr3 = this.metadata;
                int i14 = findFirstAvailableSlot >> 3;
                int i15 = (findFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                jArr3[i14] = (jArr3[i14] & (~(255 << i15))) | (j8 << i15);
                int i16 = this._capacity;
                int i17 = ((findFirstAvailableSlot - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr3[i18] = ((~(255 << i19)) & jArr3[i18]) | (j8 << i19);
                iArr3[findFirstAvailableSlot] = i11;
                fArr2[findFirstAvailableSlot] = fArr[i10];
            } else {
                jArr = jArr2;
                iArr = iArr2;
            }
            i10++;
            jArr2 = jArr;
            iArr2 = iArr;
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
        initializeGrowth();
    }

    public final float getOrPut(int i8, f6.a defaultValue) {
        s.checkNotNullParameter(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(i8);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        float floatValue = ((Number) defaultValue.invoke()).floatValue();
        put(i8, floatValue);
        return floatValue;
    }

    public final void minusAssign(int i8) {
        remove(i8);
    }

    public final void plusAssign(IntFloatMap from) {
        s.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void put(int i8, float f8) {
        set(i8, f8);
    }

    public final void putAll(IntFloatMap from) {
        s.checkNotNullParameter(from, "from");
        int[] iArr = from.keys;
        float[] fArr = from.values;
        long[] jArr = from.metadata;
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
                        set(iArr[i11], fArr[i11]);
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

    public final void remove(int i8) {
        int findKeyIndex = findKeyIndex(i8);
        if (findKeyIndex >= 0) {
            removeValueAt(findKeyIndex);
        }
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
                        if (((Boolean) predicate.invoke(Integer.valueOf(this.keys[i11]), Float.valueOf(this.values[i11]))).booleanValue()) {
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

    public final void removeValueAt(int i8) {
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
    }

    public final void set(int i8, float f8) {
        int findInsertIndex = findInsertIndex(i8);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = i8;
        this.values[findInsertIndex] = f8;
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

    public /* synthetic */ MutableIntFloatMap(int i8, int i9, o oVar) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public final void minusAssign(int[] keys) {
        s.checkNotNullParameter(keys, "keys");
        for (int i8 : keys) {
            remove(i8);
        }
    }

    public final float put(int i8, float f8, float f9) {
        int findInsertIndex = findInsertIndex(i8);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        } else {
            f9 = this.values[findInsertIndex];
        }
        this.keys[findInsertIndex] = i8;
        this.values[findInsertIndex] = f8;
        return f9;
    }

    public MutableIntFloatMap(int i8) {
        super(null);
        if (i8 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final boolean remove(int i8, float f8) {
        int findKeyIndex = findKeyIndex(i8);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != f8) {
            return false;
        }
        removeValueAt(findKeyIndex);
        return true;
    }

    public final void minusAssign(IntSet keys) {
        s.checkNotNullParameter(keys, "keys");
        int[] iArr = keys.elements;
        long[] jArr = keys.metadata;
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
                        remove(iArr[(i8 << 3) + i10]);
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

    public final void minusAssign(IntList keys) {
        s.checkNotNullParameter(keys, "keys");
        int[] iArr = keys.content;
        int i8 = keys._size;
        for (int i9 = 0; i9 < i8; i9++) {
            remove(iArr[i9]);
        }
    }
}
