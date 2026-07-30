package kotlin.collections.builders;

import g6.g;
import j6.m;
import j6.v;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.f0;
import kotlin.collections.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, g {
    public static final a Companion = new a(null);
    private static final MapBuilder Empty;
    private static final int INITIAL_CAPACITY = 8;
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
    private static final int MAGIC = -1640531527;
    private static final int TOMBSTONE = -1;
    private z5.c entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private z5.d keysView;
    private int length;
    private int maxProbeDistance;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private z5.e valuesView;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeHashSize(int i8) {
            int coerceAtLeast;
            coerceAtLeast = v.coerceAtLeast(i8, 1);
            return Integer.highestOneBit(coerceAtLeast * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int computeShift(int i8) {
            return Integer.numberOfLeadingZeros(i8) + 1;
        }

        public final MapBuilder getEmpty$kotlin_stdlib() {
            return MapBuilder.Empty;
        }
    }

    public static final class b extends d implements Iterator, g6.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MapBuilder<Object, Object> map) {
            super(map);
            s.checkNotNullParameter(map, "map");
        }

        public final void nextAppendString(StringBuilder sb) {
            s.checkNotNullParameter(sb, "sb");
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = ((MapBuilder) getMap$kotlin_stdlib()).keysArray[getLastIndex$kotlin_stdlib()];
            if (s.areEqual(obj, getMap$kotlin_stdlib())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ((MapBuilder) getMap$kotlin_stdlib()).valuesArray;
            s.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            if (s.areEqual(obj2, getMap$kotlin_stdlib())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            initNext$kotlin_stdlib();
        }

        public final int nextHashCode$kotlin_stdlib() {
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = ((MapBuilder) getMap$kotlin_stdlib()).keysArray[getLastIndex$kotlin_stdlib()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((MapBuilder) getMap$kotlin_stdlib()).valuesArray;
            s.checkNotNull(objArr);
            Object obj2 = objArr[getLastIndex$kotlin_stdlib()];
            int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            initNext$kotlin_stdlib();
            return hashCode2;
        }

        @Override // java.util.Iterator
        public c next() {
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            c cVar = new c(getMap$kotlin_stdlib(), getLastIndex$kotlin_stdlib());
            initNext$kotlin_stdlib();
            return cVar;
        }
    }

    public static final class c implements Map.Entry, g.a {
        private final int index;
        private final MapBuilder<Object, Object> map;

        public c(MapBuilder<Object, Object> map, int i8) {
            s.checkNotNullParameter(map, "map");
            this.map = map;
            this.index = i8;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (s.areEqual(entry.getKey(), getKey()) && s.areEqual(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return ((MapBuilder) this.map).keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = ((MapBuilder) this.map).valuesArray;
            s.checkNotNull(objArr);
            return objArr[this.index];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.map.checkIsMutable$kotlin_stdlib();
            Object[] allocateValuesArray = this.map.allocateValuesArray();
            int i8 = this.index;
            Object obj2 = allocateValuesArray[i8];
            allocateValuesArray[i8] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    public static class d {
        private int index;
        private int lastIndex;
        private final MapBuilder<Object, Object> map;

        public d(MapBuilder<Object, Object> map) {
            s.checkNotNullParameter(map, "map");
            this.map = map;
            this.lastIndex = -1;
            initNext$kotlin_stdlib();
        }

        public final int getIndex$kotlin_stdlib() {
            return this.index;
        }

        public final int getLastIndex$kotlin_stdlib() {
            return this.lastIndex;
        }

        public final MapBuilder<Object, Object> getMap$kotlin_stdlib() {
            return this.map;
        }

        public final boolean hasNext() {
            return this.index < ((MapBuilder) this.map).length;
        }

        public final void initNext$kotlin_stdlib() {
            while (this.index < ((MapBuilder) this.map).length) {
                int[] iArr = ((MapBuilder) this.map).presenceArray;
                int i8 = this.index;
                if (iArr[i8] >= 0) {
                    return;
                } else {
                    this.index = i8 + 1;
                }
            }
        }

        public final void remove() {
            if (this.lastIndex == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.map.checkIsMutable$kotlin_stdlib();
            this.map.removeKeyAt(this.lastIndex);
            this.lastIndex = -1;
        }

        public final void setIndex$kotlin_stdlib(int i8) {
            this.index = i8;
        }

        public final void setLastIndex$kotlin_stdlib(int i8) {
            this.lastIndex = i8;
        }
    }

    public static final class e extends d implements Iterator, g6.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MapBuilder<Object, Object> map) {
            super(map);
            s.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object obj = ((MapBuilder) getMap$kotlin_stdlib()).keysArray[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return obj;
        }
    }

    public static final class f extends d implements Iterator, g6.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MapBuilder<Object, Object> map) {
            super(map);
            s.checkNotNullParameter(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            if (getIndex$kotlin_stdlib() >= ((MapBuilder) getMap$kotlin_stdlib()).length) {
                throw new NoSuchElementException();
            }
            int index$kotlin_stdlib = getIndex$kotlin_stdlib();
            setIndex$kotlin_stdlib(index$kotlin_stdlib + 1);
            setLastIndex$kotlin_stdlib(index$kotlin_stdlib);
            Object[] objArr = ((MapBuilder) getMap$kotlin_stdlib()).valuesArray;
            s.checkNotNull(objArr);
            Object obj = objArr[getLastIndex$kotlin_stdlib()];
            initNext$kotlin_stdlib();
            return obj;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        Empty = mapBuilder;
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i8, int i9) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i8;
        this.length = i9;
        this.hashShift = Companion.computeShift(getHashSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] allocateValuesArray() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) z5.b.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void compact() {
        int i8;
        V[] vArr = this.valuesArray;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i8 = this.length;
            if (i9 >= i8) {
                break;
            }
            if (this.presenceArray[i9] >= 0) {
                K[] kArr = this.keysArray;
                kArr[i10] = kArr[i9];
                if (vArr != null) {
                    vArr[i10] = vArr[i9];
                }
                i10++;
            }
            i9++;
        }
        z5.b.resetRange(this.keysArray, i10, i8);
        if (vArr != null) {
            z5.b.resetRange(vArr, i10, this.length);
        }
        this.length = i10;
    }

    private final boolean contentEquals(Map<?, ?> map) {
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    private final void ensureCapacity(int i8) {
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        if (i8 > getCapacity$kotlin_stdlib()) {
            int capacity$kotlin_stdlib = (getCapacity$kotlin_stdlib() * 3) / 2;
            if (i8 <= capacity$kotlin_stdlib) {
                i8 = capacity$kotlin_stdlib;
            }
            this.keysArray = (K[]) z5.b.copyOfUninitializedElements(this.keysArray, i8);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) z5.b.copyOfUninitializedElements(vArr, i8) : null;
            int[] copyOf = Arrays.copyOf(this.presenceArray, i8);
            s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.presenceArray = copyOf;
            int computeHashSize = Companion.computeHashSize(i8);
            if (computeHashSize > getHashSize()) {
                rehash(computeHashSize);
            }
        }
    }

    private final void ensureExtraCapacity(int i8) {
        if (shouldCompact(i8)) {
            rehash(getHashSize());
        } else {
            ensureCapacity(this.length + i8);
        }
    }

    private final int findKey(K k8) {
        int hash = hash(k8);
        int i8 = this.maxProbeDistance;
        while (true) {
            int i9 = this.hashArray[hash];
            if (i9 == 0) {
                return -1;
            }
            if (i9 > 0) {
                int i10 = i9 - 1;
                if (s.areEqual(this.keysArray[i10], k8)) {
                    return i10;
                }
            }
            i8--;
            if (i8 < 0) {
                return -1;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final int findValue(V v7) {
        int i8 = this.length;
        while (true) {
            i8--;
            if (i8 < 0) {
                return -1;
            }
            if (this.presenceArray[i8] >= 0) {
                V[] vArr = this.valuesArray;
                s.checkNotNull(vArr);
                if (s.areEqual(vArr[i8], v7)) {
                    return i8;
                }
            }
        }
    }

    private final int getHashSize() {
        return this.hashArray.length;
    }

    private final int hash(K k8) {
        return ((k8 != null ? k8.hashCode() : 0) * MAGIC) >>> this.hashShift;
    }

    private final boolean putAllEntries(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z7 = false;
        if (collection.isEmpty()) {
            return false;
        }
        ensureExtraCapacity(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (putEntry(it.next())) {
                z7 = true;
            }
        }
        return z7;
    }

    private final boolean putEntry(Map.Entry<? extends K, ? extends V> entry) {
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        V[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i8 = (-addKey$kotlin_stdlib) - 1;
        if (s.areEqual(entry.getValue(), allocateValuesArray[i8])) {
            return false;
        }
        allocateValuesArray[i8] = entry.getValue();
        return true;
    }

    private final boolean putRehash(int i8) {
        int hash = hash(this.keysArray[i8]);
        int i9 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[hash] == 0) {
                iArr[hash] = i8 + 1;
                this.presenceArray[i8] = hash;
                return true;
            }
            i9--;
            if (i9 < 0) {
                return false;
            }
            hash = hash == 0 ? getHashSize() - 1 : hash - 1;
        }
    }

    private final void rehash(int i8) {
        if (this.length > size()) {
            compact();
        }
        int i9 = 0;
        if (i8 != getHashSize()) {
            this.hashArray = new int[i8];
            this.hashShift = Companion.computeShift(i8);
        } else {
            k.fill(this.hashArray, 0, 0, getHashSize());
        }
        while (i9 < this.length) {
            int i10 = i9 + 1;
            if (!putRehash(i9)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i9 = i10;
        }
    }

    private final void removeHashAt(int i8) {
        int coerceAtMost;
        coerceAtMost = v.coerceAtMost(this.maxProbeDistance * 2, getHashSize() / 2);
        int i9 = coerceAtMost;
        int i10 = 0;
        int i11 = i8;
        do {
            i8 = i8 == 0 ? getHashSize() - 1 : i8 - 1;
            i10++;
            if (i10 > this.maxProbeDistance) {
                this.hashArray[i11] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i12 = iArr[i8];
            if (i12 == 0) {
                iArr[i11] = 0;
                return;
            }
            if (i12 < 0) {
                iArr[i11] = -1;
            } else {
                int i13 = i12 - 1;
                if (((hash(this.keysArray[i13]) - i8) & (getHashSize() - 1)) >= i10) {
                    this.hashArray[i11] = i12;
                    this.presenceArray[i13] = i11;
                }
                i9--;
            }
            i11 = i8;
            i10 = 0;
            i9--;
        } while (i9 >= 0);
        this.hashArray[i11] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeKeyAt(int i8) {
        z5.b.resetAt(this.keysArray, i8);
        removeHashAt(this.presenceArray[i8]);
        this.presenceArray[i8] = -1;
        this.size = size() - 1;
    }

    private final boolean shouldCompact(int i8) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i9 = this.length;
        int i10 = capacity$kotlin_stdlib - i9;
        int size = i9 - size();
        return i10 < i8 && i10 + size >= i8 && size >= getCapacity$kotlin_stdlib() / 4;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K k8) {
        int coerceAtMost;
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int hash = hash(k8);
            coerceAtMost = v.coerceAtMost(this.maxProbeDistance * 2, getHashSize() / 2);
            int i8 = 0;
            while (true) {
                int i9 = this.hashArray[hash];
                if (i9 <= 0) {
                    if (this.length < getCapacity$kotlin_stdlib()) {
                        int i10 = this.length;
                        int i11 = i10 + 1;
                        this.length = i11;
                        this.keysArray[i10] = k8;
                        this.presenceArray[i10] = hash;
                        this.hashArray[hash] = i11;
                        this.size = size() + 1;
                        if (i8 > this.maxProbeDistance) {
                            this.maxProbeDistance = i8;
                        }
                        return i10;
                    }
                    ensureExtraCapacity(1);
                } else {
                    if (s.areEqual(this.keysArray[i9 - 1], k8)) {
                        return -i9;
                    }
                    i8++;
                    if (i8 > coerceAtMost) {
                        rehash(getHashSize() * 2);
                        break;
                    }
                    hash = hash == 0 ? getHashSize() - 1 : hash - 1;
                }
            }
        }
    }

    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = Empty;
        s.checkNotNull(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        f0 it = new m(0, this.length - 1).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            int[] iArr = this.presenceArray;
            int i8 = iArr[nextInt];
            if (i8 >= 0) {
                this.hashArray[i8] = 0;
                iArr[nextInt] = -1;
            }
        }
        z5.b.resetRange(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            z5.b.resetRange(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> m8) {
        s.checkNotNullParameter(m8, "m");
        for (Object obj : m8) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        s.checkNotNullParameter(entry, "entry");
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        s.checkNotNull(vArr);
        return s.areEqual(vArr[findKey], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return findKey(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return findValue(obj) >= 0;
    }

    public final b entriesIterator$kotlin_stdlib() {
        return new b(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && contentEquals((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int findKey = findKey(obj);
        if (findKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        s.checkNotNull(vArr);
        return vArr[findKey];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    public Set<Map.Entry<K, V>> getEntries() {
        z5.c cVar = this.entriesView;
        if (cVar != null) {
            return cVar;
        }
        z5.c cVar2 = new z5.c(this);
        this.entriesView = cVar2;
        return cVar2;
    }

    public Set<K> getKeys() {
        z5.d dVar = this.keysView;
        if (dVar != null) {
            return dVar;
        }
        z5.d dVar2 = new z5.d(this);
        this.keysView = dVar2;
        return dVar2;
    }

    public int getSize() {
        return this.size;
    }

    public Collection<V> getValues() {
        z5.e eVar = this.valuesView;
        if (eVar != null) {
            return eVar;
        }
        z5.e eVar2 = new z5.e(this);
        this.valuesView = eVar2;
        return eVar2;
    }

    @Override // java.util.Map
    public int hashCode() {
        b entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i8 = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            i8 += entriesIterator$kotlin_stdlib.nextHashCode$kotlin_stdlib();
        }
        return i8;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    public final e keysIterator$kotlin_stdlib() {
        return new e(this);
    }

    @Override // java.util.Map
    public V put(K k8, V v7) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(k8);
        V[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = v7;
            return null;
        }
        int i8 = (-addKey$kotlin_stdlib) - 1;
        V v8 = allocateValuesArray[i8];
        allocateValuesArray[i8] = v7;
        return v8;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        s.checkNotNullParameter(from, "from");
        checkIsMutable$kotlin_stdlib();
        putAllEntries(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int removeKey$kotlin_stdlib = removeKey$kotlin_stdlib(obj);
        if (removeKey$kotlin_stdlib < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        s.checkNotNull(vArr);
        V v7 = vArr[removeKey$kotlin_stdlib];
        z5.b.resetAt(vArr, removeKey$kotlin_stdlib);
        return v7;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        s.checkNotNullParameter(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        s.checkNotNull(vArr);
        if (!s.areEqual(vArr[findKey], entry.getValue())) {
            return false;
        }
        removeKeyAt(findKey);
        return true;
    }

    public final int removeKey$kotlin_stdlib(K k8) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(k8);
        if (findKey < 0) {
            return -1;
        }
        removeKeyAt(findKey);
        return findKey;
    }

    public final boolean removeValue$kotlin_stdlib(V v7) {
        checkIsMutable$kotlin_stdlib();
        int findValue = findValue(v7);
        if (findValue < 0) {
            return false;
        }
        removeKeyAt(findValue);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i8 = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i8 > 0) {
                sb.append(", ");
            }
            entriesIterator$kotlin_stdlib.nextAppendString(sb);
            i8++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public final f valuesIterator$kotlin_stdlib() {
        return new f(this);
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i8) {
        this(z5.b.arrayOfUninitializedElements(i8), null, new int[i8], new int[Companion.computeHashSize(i8)], 2, 0);
    }
}
