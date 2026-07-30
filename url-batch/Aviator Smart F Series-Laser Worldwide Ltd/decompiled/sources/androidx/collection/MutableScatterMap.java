package androidx.collection;

import f6.p;
import g6.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.sequences.m;
import y5.r;

/* loaded from: classes.dex */
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {
    private int growthLimit;

    private final class MutableMapWrapper extends ScatterMap<K, V>.MapWrapper implements g {
        public MutableMapWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void clear() {
            MutableScatterMap.this.clear();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Set<Map.Entry<K, V>> getEntries() {
            return new MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Set<K> getKeys() {
            return new MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Collection<V> getValues() {
            return new MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public V put(K k8, V v7) {
            return MutableScatterMap.this.put(k8, v7);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void putAll(Map<? extends K, ? extends V> from) {
            s.checkNotNullParameter(from, "from");
            for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public V remove(Object obj) {
            return MutableScatterMap.this.remove(obj);
        }
    }

    public MutableScatterMap() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare(r.m1710constructorimpl(r.m1710constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, r.m1710constructorimpl(r.m1710constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                resizeStorage(this._capacity);
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
        this.keys = new Object[max];
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
        int i9;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i10 = this._capacity;
        initializeStorage(i8);
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i11 = 0;
        while (i11 < i10) {
            if (((jArr[i11 >> 3] >> ((i11 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i11];
                int hashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i12 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i12 >>> 7);
                long j8 = i12 & 127;
                long[] jArr2 = this.metadata;
                int i13 = findFirstAvailableSlot >> 3;
                int i14 = (findFirstAvailableSlot & 7) << 3;
                i9 = i11;
                jArr2[i13] = (jArr2[i13] & (~(255 << i14))) | (j8 << i14);
                int i15 = this._capacity;
                int i16 = ((findFirstAvailableSlot - 7) & i15) + (i15 & 7);
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                jArr2[i17] = (jArr2[i17] & (~(255 << i18))) | (j8 << i18);
                objArr3[findFirstAvailableSlot] = obj;
                objArr4[findFirstAvailableSlot] = objArr2[i9];
            } else {
                i9 = i11;
            }
            i11 = i9 + 1;
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

    public final Map<K, V> asMutableMap() {
        return new MutableMapWrapper();
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
        k.fill(this.keys, (Object) null, 0, this._capacity);
        initializeGrowth();
    }

    public final V compute(K k8, p computeBlock) {
        s.checkNotNullParameter(computeBlock, "computeBlock");
        int findInsertIndex = findInsertIndex(k8);
        boolean z7 = findInsertIndex < 0;
        V v7 = (V) computeBlock.invoke(k8, z7 ? null : this.values[findInsertIndex]);
        if (z7) {
            int i8 = ~findInsertIndex;
            this.keys[i8] = k8;
            this.values[i8] = v7;
        } else {
            this.values[findInsertIndex] = v7;
        }
        return v7;
    }

    public final int findInsertIndex(K k8) {
        int hashCode = (k8 != null ? k8.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this._capacity;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = i10;
            int i16 = i10;
            long j10 = j8 ^ (j9 * ScatterMapKt.BitmaskLsb);
            for (long j11 = (~j10) & (j10 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
                if (s.areEqual(this.keys[numberOfTrailingZeros], k8)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i9);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    findFirstAvailableSlot = findFirstAvailableSlot(i9);
                }
                this._size++;
                int i17 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i18 = findFirstAvailableSlot >> 3;
                long j12 = jArr2[i18];
                int i19 = (findFirstAvailableSlot & 7) << 3;
                this.growthLimit = i17 - (((j12 >> i19) & 255) == 128 ? 1 : 0);
                jArr2[i18] = (j12 & (~(255 << i19))) | (j9 << i19);
                int i20 = this._capacity;
                int i21 = ((findFirstAvailableSlot - 7) & i20) + (i20 & 7);
                int i22 = i21 >> 3;
                int i23 = (i21 & 7) << 3;
                jArr2[i22] = ((~(255 << i23)) & jArr2[i22]) | (j9 << i23);
                return ~findFirstAvailableSlot;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
        }
    }

    public final V getOrPut(K k8, f6.a defaultValue) {
        s.checkNotNullParameter(defaultValue, "defaultValue");
        V v7 = get(k8);
        if (v7 != null) {
            return v7;
        }
        V v8 = (V) defaultValue.invoke();
        set(k8, v8);
        return v8;
    }

    public final void minusAssign(K k8) {
        remove(k8);
    }

    public final void plusAssign(Pair<? extends K, ? extends V> pair) {
        s.checkNotNullParameter(pair, "pair");
        set(pair.getFirst(), pair.getSecond());
    }

    public final V put(K k8, V v7) {
        int findInsertIndex = findInsertIndex(k8);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        Object[] objArr = this.values;
        V v8 = (V) objArr[findInsertIndex];
        this.keys[findInsertIndex] = k8;
        objArr[findInsertIndex] = v7;
        return v8;
    }

    public final void putAll(Pair<? extends K, ? extends V>[] pairs) {
        s.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V remove(K k8) {
        int i8;
        int i9 = 0;
        int hashCode = (k8 != null ? k8.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this._capacity;
        int i13 = i10 >>> 7;
        loop0: while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.metadata;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j8 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j9 = (i11 * ScatterMapKt.BitmaskLsb) ^ j8;
            long j10 = (~j9) & (j9 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j10) >> 3) + i14) & i12;
                if (s.areEqual(this.keys[i8], k8)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i9 += 8;
            i13 = i14 + i9;
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
                        if (((Boolean) predicate.invoke(this.keys[i11], this.values[i11])).booleanValue()) {
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
        this.keys[i8] = null;
        Object[] objArr = this.values;
        V v7 = (V) objArr[i8];
        objArr[i8] = null;
        return v7;
    }

    public final void set(K k8, V v7) {
        int findInsertIndex = findInsertIndex(k8);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = k8;
        this.values[findInsertIndex] = v7;
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

    public /* synthetic */ MutableScatterMap(int i8, int i9, o oVar) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public final void minusAssign(K[] keys) {
        s.checkNotNullParameter(keys, "keys");
        for (K k8 : keys) {
            remove(k8);
        }
    }

    public final void plusAssign(Pair<? extends K, ? extends V>[] pairs) {
        s.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public MutableScatterMap(int i8) {
        super(null);
        if (i8 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void plusAssign(Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        s.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void putAll(Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        s.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void minusAssign(Iterable<? extends K> keys) {
        s.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(m pairs) {
        s.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(Map<K, ? extends V> from) {
        s.checkNotNullParameter(from, "from");
        putAll(from);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(m pairs) {
        s.checkNotNullParameter(pairs, "pairs");
        Iterator<Object> it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            set(pair.component1(), pair.component2());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(m keys) {
        s.checkNotNullParameter(keys, "keys");
        Iterator<Object> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(ScatterMap<K, V> from) {
        s.checkNotNullParameter(from, "from");
        putAll(from);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(K k8, V v7) {
        int i8;
        int hashCode = (k8 != null ? k8.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = this._capacity;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (i10 * ScatterMapKt.BitmaskLsb) ^ j8;
            long j10 = (~j9) & (j9 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (s.areEqual(this.keys[i8], k8)) {
                    break loop0;
                }
                j10 &= j10 - 1;
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

    public final void putAll(Map<K, ? extends V> from) {
        s.checkNotNullParameter(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<K> keys) {
        s.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.elements;
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
                        remove(objArr[(i8 << 3) + i10]);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ScatterMap<K, V> from) {
        s.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
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
                        set(objArr[i11], objArr2[i11]);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<K> keys) {
        s.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.content;
        int i8 = keys._size;
        for (int i9 = 0; i9 < i8; i9++) {
            remove(objArr[i9]);
        }
    }
}
