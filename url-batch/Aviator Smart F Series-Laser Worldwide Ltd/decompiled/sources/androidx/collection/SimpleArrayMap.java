package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {
    private Object[] array;
    private int[] hashes;
    private int size;

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object obj, T t7) {
        int indexOfKey = indexOfKey(obj);
        return indexOfKey >= 0 ? (T) this.array[(indexOfKey << 1) + 1] : t7;
    }

    private final int indexOf(K k8, int i8) {
        int i9 = this.size;
        if (i9 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.hashes, i9, i8);
        if (binarySearch < 0) {
            return binarySearch;
        }
        if (s.areEqual(k8, this.array[binarySearch << 1])) {
            return binarySearch;
        }
        int i10 = binarySearch + 1;
        while (i10 < i9 && this.hashes[i10] == i8) {
            if (s.areEqual(k8, this.array[i10 << 1])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = binarySearch - 1; i11 >= 0 && this.hashes[i11] == i8; i11--) {
            if (s.areEqual(k8, this.array[i11 << 1])) {
                return i11;
            }
        }
        return ~i10;
    }

    private final int indexOfNull() {
        int i8 = this.size;
        if (i8 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.hashes, i8, 0);
        if (binarySearch < 0) {
            return binarySearch;
        }
        if (this.array[binarySearch << 1] == null) {
            return binarySearch;
        }
        int i9 = binarySearch + 1;
        while (i9 < i8 && this.hashes[i9] == 0) {
            if (this.array[i9 << 1] == null) {
                return i9;
            }
            i9++;
        }
        for (int i10 = binarySearch - 1; i10 >= 0 && this.hashes[i10] == 0; i10--) {
            if (this.array[i10 << 1] == null) {
                return i10;
            }
        }
        return ~i9;
    }

    public final int __restricted$indexOfValue(V v7) {
        int i8 = this.size * 2;
        Object[] objArr = this.array;
        if (v7 == null) {
            for (int i9 = 1; i9 < i8; i9 += 2) {
                if (objArr[i9] == null) {
                    return i9 >> 1;
                }
            }
            return -1;
        }
        for (int i10 = 1; i10 < i8; i10 += 2) {
            if (s.areEqual(v7, objArr[i10])) {
                return i10 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k8) {
        return indexOfKey(k8) >= 0;
    }

    public boolean containsValue(V v7) {
        return __restricted$indexOfValue(v7) >= 0;
    }

    public void ensureCapacity(int i8) {
        int i9 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < i8) {
            int[] copyOf = Arrays.copyOf(iArr, i8);
            s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i8 * 2);
            s.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
        }
        if (this.size != i9) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                if (size() != ((SimpleArrayMap) obj).size()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i8 = this.size;
                for (int i9 = 0; i9 < i8; i9++) {
                    K keyAt = keyAt(i9);
                    V valueAt = valueAt(i9);
                    Object obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!s.areEqual(valueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i10 = this.size;
            for (int i11 = 0; i11 < i10; i11++) {
                K keyAt2 = keyAt(i11);
                V valueAt2 = valueAt(i11);
                Object obj3 = ((Map) obj).get(keyAt2);
                if (valueAt2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(keyAt2)) {
                        return false;
                    }
                } else if (!s.areEqual(valueAt2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public V get(K k8) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey >= 0) {
            return (V) this.array[(indexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object obj, V v7) {
        int indexOfKey = indexOfKey(obj);
        return indexOfKey >= 0 ? (V) this.array[(indexOfKey << 1) + 1] : v7;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i8 = this.size;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            Object obj = objArr[i9];
            i11 += (obj != null ? obj.hashCode() : 0) ^ iArr[i10];
            i10++;
            i9 += 2;
        }
        return i11;
    }

    public int indexOfKey(K k8) {
        return k8 == null ? indexOfNull() : indexOf(k8, k8.hashCode());
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public K keyAt(int i8) {
        if (i8 >= 0 && i8 < this.size) {
            return (K) this.array[i8 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public V put(K k8, V v7) {
        int i8 = this.size;
        int hashCode = k8 != null ? k8.hashCode() : 0;
        int indexOf = k8 != null ? indexOf(k8, hashCode) : indexOfNull();
        if (indexOf >= 0) {
            int i9 = (indexOf << 1) + 1;
            Object[] objArr = this.array;
            V v8 = (V) objArr[i9];
            objArr[i9] = v7;
            return v8;
        }
        int i10 = ~indexOf;
        int[] iArr = this.hashes;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i11);
            s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i11 << 1);
            s.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
            if (i8 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i8) {
            int[] iArr2 = this.hashes;
            int i12 = i10 + 1;
            k.copyInto(iArr2, iArr2, i12, i10, i8);
            Object[] objArr2 = this.array;
            k.copyInto(objArr2, objArr2, i12 << 1, i10 << 1, this.size << 1);
        }
        int i13 = this.size;
        if (i8 == i13) {
            int[] iArr3 = this.hashes;
            if (i10 < iArr3.length) {
                iArr3[i10] = hashCode;
                Object[] objArr3 = this.array;
                int i14 = i10 << 1;
                objArr3[i14] = k8;
                objArr3[i14 + 1] = v7;
                this.size = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> map) {
        s.checkNotNullParameter(map, "map");
        int i8 = map.size;
        ensureCapacity(this.size + i8);
        if (this.size != 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                put(map.keyAt(i9), map.valueAt(i9));
            }
        } else if (i8 > 0) {
            k.copyInto(map.hashes, this.hashes, 0, 0, i8);
            k.copyInto(map.array, this.array, 0, 0, i8 << 1);
            this.size = i8;
        }
    }

    public V putIfAbsent(K k8, V v7) {
        V v8 = get(k8);
        return v8 == null ? put(k8, v7) : v8;
    }

    public V remove(K k8) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public V removeAt(int i8) {
        int i9;
        if (i8 < 0 || i8 >= (i9 = this.size)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
        }
        Object[] objArr = this.array;
        int i10 = i8 << 1;
        V v7 = (V) objArr[i10 + 1];
        if (i9 <= 1) {
            clear();
        } else {
            int i11 = i9 - 1;
            int[] iArr = this.hashes;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                if (i8 < i11) {
                    int i12 = i8 + 1;
                    k.copyInto(iArr, iArr, i8, i12, i9);
                    Object[] objArr2 = this.array;
                    k.copyInto(objArr2, objArr2, i10, i12 << 1, i9 << 1);
                }
                Object[] objArr3 = this.array;
                int i13 = i11 << 1;
                objArr3[i13] = null;
                objArr3[i13 + 1] = null;
            } else {
                int i14 = i9 > 8 ? i9 + (i9 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i14);
                s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.hashes = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.array, i14 << 1);
                s.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                this.array = copyOf2;
                if (i9 != this.size) {
                    throw new ConcurrentModificationException();
                }
                if (i8 > 0) {
                    k.copyInto(iArr, this.hashes, 0, 0, i8);
                    k.copyInto(objArr, this.array, 0, 0, i10);
                }
                if (i8 < i11) {
                    int i15 = i8 + 1;
                    k.copyInto(iArr, this.hashes, i8, i15, i9);
                    k.copyInto(objArr, this.array, i10, i15 << 1, i9 << 1);
                }
            }
            if (i9 != this.size) {
                throw new ConcurrentModificationException();
            }
            this.size = i11;
        }
        return v7;
    }

    public V replace(K k8, V v7) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v7);
        }
        return null;
    }

    public V setValueAt(int i8, V v7) {
        if (i8 < 0 || i8 >= this.size) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
        }
        int i9 = (i8 << 1) + 1;
        Object[] objArr = this.array;
        V v8 = (V) objArr[i9];
        objArr[i9] = v7;
        return v8;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i8 = this.size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i9);
            if (keyAt != sb) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V valueAt = valueAt(i9);
            if (valueAt != sb) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public V valueAt(int i8) {
        if (i8 >= 0 && i8 < this.size) {
            return (V) this.array[(i8 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public SimpleArrayMap(int i8) {
        this.hashes = i8 == 0 ? ContainerHelpersKt.EMPTY_INTS : new int[i8];
        this.array = i8 == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[i8 << 1];
    }

    public boolean remove(K k8, V v7) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey < 0 || !s.areEqual(v7, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public boolean replace(K k8, V v7, V v8) {
        int indexOfKey = indexOfKey(k8);
        if (indexOfKey < 0 || !s.areEqual(v7, valueAt(indexOfKey))) {
            return false;
        }
        setValueAt(indexOfKey, v8);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i8, int i9, o oVar) {
        this((i9 & 1) != 0 ? 0 : i8);
    }

    public SimpleArrayMap(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }
}
