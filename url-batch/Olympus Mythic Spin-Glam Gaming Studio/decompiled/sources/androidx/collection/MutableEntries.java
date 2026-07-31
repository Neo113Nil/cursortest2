package androidx.collection;

import com.safedk.android.analytics.brandsafety.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000f\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001d\u0010\u0014\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\"\u0010\u0015\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0018H\u0096\u0002J\u001c\u0010\u0019\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u001a\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0016J\"\u0010\u001b\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Landroidx/collection/MutableEntries;", "K", "V", "", "", "parent", "Landroidx/collection/MutableScatterMap;", "(Landroidx/collection/MutableScatterMap;)V", "size", "", "getSize", "()I", m.l, "", "element", "addAll", "elements", "", "clear", "", "contains", "containsAll", "isEmpty", "iterator", "", "remove", "removeAll", "retainAll", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MutableEntries<K, V> implements Set<Map.Entry<K, V>>, KMutableSet {
    private final MutableScatterMap parent;

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }

    public MutableEntries(MutableScatterMap parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (TypeIntrinsics.isMutableMapEntry(obj)) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (TypeIntrinsics.isMutableMapEntry(obj)) {
            return remove((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new MutableEntries$iterator$1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<Map.Entry> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : collection) {
            if (!Intrinsics.areEqual(this.parent.get(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public boolean contains(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return Intrinsics.areEqual(this.parent.get(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        boolean z;
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            boolean z2 = false;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Iterator it = elements.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    if (!Intrinsics.areEqual(entry.getKey(), this.parent.keys[i4]) || !Intrinsics.areEqual(entry.getValue(), this.parent.values[i4])) {
                                    }
                                } else {
                                    this.parent.removeValueAt(i4);
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return z2;
                    }
                }
                if (i == length) {
                    z = z2;
                    break;
                }
                i++;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        boolean z;
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            boolean z2 = false;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Iterator it = elements.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    if (Intrinsics.areEqual(entry.getKey(), this.parent.keys[i4]) && Intrinsics.areEqual(entry.getValue(), this.parent.values[i4])) {
                                        this.parent.removeValueAt(i4);
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return z2;
                    }
                }
                if (i == length) {
                    z = z2;
                    break;
                }
                i++;
            }
        } else {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        r15 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean remove(Map.Entry element) {
        int i;
        Intrinsics.checkNotNullParameter(element, "element");
        MutableScatterMap mutableScatterMap = this.parent;
        Object key = element.getKey();
        int hashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = mutableScatterMap._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = mutableScatterMap.metadata;
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
                if (Intrinsics.areEqual(mutableScatterMap.keys[i], key)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i < 0 || !Intrinsics.areEqual(this.parent.values[i], element.getValue())) {
            return false;
        }
        this.parent.removeValueAt(i);
        return true;
    }
}
