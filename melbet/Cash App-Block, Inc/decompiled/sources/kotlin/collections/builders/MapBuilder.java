package kotlin.collections.builders;

import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.time.DurationKt;

/* loaded from: classes.dex */
public final class MapBuilder implements Map, Serializable, KMutableMap {
    public static final Companion Companion = new Companion(null);
    public static final MapBuilder Empty;
    public MapBuilderEntries entriesView;
    public int[] hashArray;
    public int hashShift;
    public boolean isReadOnly;
    public Object[] keysArray;
    public MapBuilderKeys keysView;
    public int length;
    public int maxProbeDistance;
    public int modCount;
    public int[] presenceArray;
    public int size;
    public Object[] valuesArray;
    public MapBuilderValues valuesView;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final class EntryRef implements Map.Entry, KMutableMap.Entry {
        public final int expectedModCount;
        public final int index;
        public final MapBuilder map;

        public EntryRef(MapBuilder mapBuilder, int i) {
            mapBuilder.getClass();
            this.map = mapBuilder;
            this.index = i;
            this.expectedModCount = mapBuilder.modCount;
        }

        public final void checkForComodification$6() {
            if (this.map.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            checkForComodification$6();
            return this.map.keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            checkForComodification$6();
            Object[] objArr = this.map.valuesArray;
            objArr.getClass();
            return objArr[this.index];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Object key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            checkForComodification$6();
            MapBuilder mapBuilder = this.map;
            mapBuilder.checkIsMutable$kotlin_stdlib();
            Object[] objArr = mapBuilder.valuesArray;
            if (objArr == null) {
                int length = mapBuilder.keysArray.length;
                if (length < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3("capacity must be non-negative.");
                    return null;
                }
                objArr = new Object[length];
                mapBuilder.valuesArray = objArr;
            }
            int i = this.index;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    public final class KeysItr extends Itr implements Iterator, KMappedMarker {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ KeysItr(MapBuilder mapBuilder, int i) {
            super(mapBuilder);
            this.$r8$classId = i;
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i = this.$r8$classId;
            Serializable serializable = this.map;
            switch (i) {
                case 0:
                    checkForComodification$kotlin_stdlib();
                    int i2 = this.index;
                    MapBuilder mapBuilder = (MapBuilder) serializable;
                    if (i2 >= mapBuilder.length) {
                        a$$ExternalSyntheticBUOutline0.m();
                        break;
                    } else {
                        this.index = i2 + 1;
                        this.lastIndex = i2;
                        Object obj = mapBuilder.keysArray[i2];
                        initNext$kotlin_stdlib();
                        break;
                    }
                case 1:
                    checkForComodification$kotlin_stdlib();
                    int i3 = this.index;
                    MapBuilder mapBuilder2 = (MapBuilder) serializable;
                    if (i3 >= mapBuilder2.length) {
                        a$$ExternalSyntheticBUOutline0.m();
                        break;
                    } else {
                        this.index = i3 + 1;
                        this.lastIndex = i3;
                        EntryRef entryRef = new EntryRef(mapBuilder2, i3);
                        initNext$kotlin_stdlib();
                        break;
                    }
                default:
                    checkForComodification$kotlin_stdlib();
                    int i4 = this.index;
                    MapBuilder mapBuilder3 = (MapBuilder) serializable;
                    if (i4 >= mapBuilder3.length) {
                        a$$ExternalSyntheticBUOutline0.m();
                        break;
                    } else {
                        this.index = i4 + 1;
                        this.lastIndex = i4;
                        Object[] objArr = mapBuilder3.valuesArray;
                        objArr.getClass();
                        Object obj2 = objArr[this.lastIndex];
                        initNext$kotlin_stdlib();
                        break;
                    }
            }
            return null;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        Empty = mapBuilder;
    }

    public MapBuilder(int i) {
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        Companion.getClass();
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.keysArray = objArr;
        this.valuesArray = null;
        this.presenceArray = iArr;
        this.hashArray = new int[highestOneBit];
        this.maxProbeDistance = 2;
        this.length = 0;
        this.hashShift = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int addKey$kotlin_stdlib(Object obj) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int hash = hash(obj);
            int i = this.maxProbeDistance * 2;
            int length = this.hashArray.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i3 = iArr[hash];
                if (i3 == 0) {
                    int i4 = this.length;
                    Object[] objArr = this.keysArray;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.length = i5;
                        objArr[i4] = obj;
                        this.presenceArray[i4] = hash;
                        iArr[hash] = i5;
                        this.size++;
                        this.modCount++;
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                    ensureExtraCapacity$1(1);
                } else {
                    if (Intrinsics.areEqual(this.keysArray[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        rehash(this.hashArray.length * 2);
                        break;
                    }
                    hash = hash == 0 ? this.hashArray.length - 1 : hash - 1;
                }
            }
        }
    }

    public final MapBuilder build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (this.size > 0) {
            return this;
        }
        MapBuilder mapBuilder = Empty;
        mapBuilder.getClass();
        return mapBuilder;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            OptionalProvider$$ExternalSyntheticLambda0.m();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        checkIsMutable$kotlin_stdlib();
        int i = this.length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.hashArray[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        DurationKt.resetRange(0, this.length, this.keysArray);
        Object[] objArr = this.valuesArray;
        if (objArr != null) {
            DurationKt.resetRange(0, this.length, objArr);
        }
        this.size = 0;
        this.length = 0;
        this.modCount++;
    }

    public final void compact(boolean z) {
        int i;
        Object[] objArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.keysArray;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.hashArray[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        DurationKt.resetRange(i3, i, this.keysArray);
        if (objArr != null) {
            DurationKt.resetRange(i3, this.length, objArr);
        }
        this.length = i3;
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection collection) {
        boolean areEqual;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int findKey = findKey(entry.getKey());
                    if (findKey < 0) {
                        areEqual = false;
                    } else {
                        Object[] objArr = this.valuesArray;
                        objArr.getClass();
                        areEqual = Intrinsics.areEqual(objArr[findKey], entry.getValue());
                    }
                    if (!areEqual) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return findKey(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return findValue(obj) >= 0;
    }

    public final void ensureExtraCapacity$1(int i) {
        Object[] objArr = this.keysArray;
        int length = objArr.length;
        int i2 = this.length;
        int i3 = length - i2;
        int i4 = i2 - this.size;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            compact(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            AbstractList.Companion companion = AbstractList.Companion;
            int length2 = objArr.length;
            companion.getClass();
            int newCapacity$kotlin_stdlib = AbstractList.Companion.newCapacity$kotlin_stdlib(length2, i5);
            Object[] objArr2 = this.keysArray;
            objArr2.getClass();
            this.keysArray = Arrays.copyOf(objArr2, newCapacity$kotlin_stdlib);
            Object[] objArr3 = this.valuesArray;
            this.valuesArray = objArr3 != null ? Arrays.copyOf(objArr3, newCapacity$kotlin_stdlib) : null;
            this.presenceArray = Arrays.copyOf(this.presenceArray, newCapacity$kotlin_stdlib);
            Companion.getClass();
            int highestOneBit = Integer.highestOneBit((newCapacity$kotlin_stdlib >= 1 ? newCapacity$kotlin_stdlib : 1) * 3);
            if (highestOneBit > this.hashArray.length) {
                rehash(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        MapBuilderEntries mapBuilderEntries = this.entriesView;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries mapBuilderEntries2 = new MapBuilderEntries(this);
        this.entriesView = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.size == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    public final int findKey(Object obj) {
        int hash = hash(obj);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[hash];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (Intrinsics.areEqual(this.keysArray[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            hash = hash == 0 ? this.hashArray.length - 1 : hash - 1;
        }
    }

    public final int findValue(Object obj) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                Object[] objArr = this.valuesArray;
                objArr.getClass();
                if (Intrinsics.areEqual(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int findKey = findKey(obj);
        if (findKey < 0) {
            return null;
        }
        Object[] objArr = this.valuesArray;
        objArr.getClass();
        return objArr[findKey];
    }

    public final int hash(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    @Override // java.util.Map
    public final int hashCode() {
        KeysItr keysItr = new KeysItr(this, 1);
        int i = 0;
        while (keysItr.hasNext()) {
            int i2 = keysItr.index;
            MapBuilder mapBuilder = (MapBuilder) keysItr.map;
            if (i2 >= mapBuilder.length) {
                a$$ExternalSyntheticBUOutline0.m();
                return 0;
            }
            keysItr.index = i2 + 1;
            keysItr.lastIndex = i2;
            Object obj = mapBuilder.keysArray[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = mapBuilder.valuesArray;
            objArr.getClass();
            Object obj2 = objArr[keysItr.lastIndex];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            keysItr.initNext$kotlin_stdlib();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        MapBuilderKeys mapBuilderKeys = this.keysView;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys mapBuilderKeys2 = new MapBuilderKeys(this, 0);
        this.keysView = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(obj);
        Object[] objArr = this.valuesArray;
        if (objArr == null) {
            int length = this.keysArray.length;
            if (length < 0) {
                a$$ExternalSyntheticBUOutline0.m$3("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.valuesArray = objArr;
        }
        if (addKey$kotlin_stdlib >= 0) {
            objArr[addKey$kotlin_stdlib] = obj2;
            return null;
        }
        int i = (-addKey$kotlin_stdlib) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        checkIsMutable$kotlin_stdlib();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        ensureExtraCapacity$1(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
            Object[] objArr = this.valuesArray;
            if (objArr == null) {
                int length = this.keysArray.length;
                if (length < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.valuesArray = objArr;
                }
            }
            if (addKey$kotlin_stdlib >= 0) {
                objArr[addKey$kotlin_stdlib] = entry.getValue();
            } else {
                int i = (-addKey$kotlin_stdlib) - 1;
                if (!Intrinsics.areEqual(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r3[r0] = r6;
        r5.presenceArray[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void rehash(int i) {
        this.modCount++;
        int i2 = 0;
        if (this.length > this.size) {
            compact(false);
        }
        this.hashArray = new int[i];
        Companion.getClass();
        this.hashShift = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.length) {
            int i3 = i2 + 1;
            int hash = hash(this.keysArray[i2]);
            int i4 = this.maxProbeDistance;
            while (true) {
                int[] iArr = this.hashArray;
                if (iArr[hash] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$1("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                hash = hash == 0 ? iArr.length - 1 : hash - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(obj);
        if (findKey < 0) {
            return null;
        }
        Object[] objArr = this.valuesArray;
        objArr.getClass();
        Object obj2 = objArr[findKey];
        removeEntryAt(findKey);
        return obj2;
    }

    public final void removeEntryAt(int i) {
        int i2;
        int i3;
        int hash;
        int[] iArr;
        Object[] objArr = this.keysArray;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.valuesArray;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.presenceArray[i];
        loop0: while (true) {
            int i5 = i4;
            int i6 = 0;
            do {
                i4 = i4 == 0 ? this.hashArray.length - 1 : i4 - 1;
                int[] iArr2 = this.hashArray;
                i2 = iArr2[i4];
                i6++;
                if (i6 > this.maxProbeDistance) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    hash = hash(this.keysArray[i3]) - i4;
                    iArr = this.hashArray;
                }
            } while ((hash & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.presenceArray[i3] = i5;
        }
        this.presenceArray[i] = -1;
        this.size--;
        this.modCount++;
    }

    @Override // java.util.Map
    public final int size() {
        return this.size;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.size * 3) + 2);
        sb.append("{");
        KeysItr keysItr = new KeysItr(this, 1);
        int i = 0;
        while (keysItr.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = keysItr.index;
            MapBuilder mapBuilder = (MapBuilder) keysItr.map;
            if (i2 >= mapBuilder.length) {
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            keysItr.index = i2 + 1;
            keysItr.lastIndex = i2;
            Object obj = mapBuilder.keysArray[i2];
            if (obj == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = mapBuilder.valuesArray;
            objArr.getClass();
            Object obj2 = objArr[keysItr.lastIndex];
            if (obj2 == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            keysItr.initNext$kotlin_stdlib();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        MapBuilderValues mapBuilderValues = this.valuesView;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues mapBuilderValues2 = new MapBuilderValues(this);
        this.valuesView = mapBuilderValues2;
        return mapBuilderValues2;
    }

    public abstract class Itr {
        public int expectedModCount;
        public int index;
        public int lastIndex;
        public final Serializable map;

        public Itr(MapBuilder mapBuilder) {
            mapBuilder.getClass();
            this.map = mapBuilder;
            this.lastIndex = -1;
            this.expectedModCount = mapBuilder.modCount;
            initNext$kotlin_stdlib();
        }

        public void checkForComodification$kotlin_stdlib() {
            if (((MapBuilder) this.map).modCount == this.expectedModCount) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m$1();
        }

        public abstract Object frameworkGet(View view);

        public abstract void frameworkSet(View view, Object obj);

        public Object get(View view) {
            if (Build.VERSION.SDK_INT >= this.lastIndex) {
                return frameworkGet(view);
            }
            Object tag = view.getTag(this.index);
            if (((Class) this.map).isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public boolean hasNext() {
            return this.index < ((MapBuilder) this.map).length;
        }

        public void initNext$kotlin_stdlib() {
            while (true) {
                int i = this.index;
                MapBuilder mapBuilder = (MapBuilder) this.map;
                if (i >= mapBuilder.length || mapBuilder.presenceArray[i] >= 0) {
                    return;
                } else {
                    this.index = i + 1;
                }
            }
        }

        public void remove() {
            MapBuilder mapBuilder = (MapBuilder) this.map;
            checkForComodification$kotlin_stdlib();
            if (this.lastIndex == -1) {
                a$$ExternalSyntheticBUOutline0.m$1("Call next() before removing element from the iterator.");
                return;
            }
            mapBuilder.checkIsMutable$kotlin_stdlib();
            mapBuilder.removeEntryAt(this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = mapBuilder.modCount;
        }

        public void set(View view, Object obj) {
            if (Build.VERSION.SDK_INT >= this.lastIndex) {
                frameworkSet(view, obj);
            } else if (shouldUpdate(get(view), obj)) {
                ViewCompat.ensureAccessibilityDelegateCompat(view);
                view.setTag(this.index, obj);
                ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, this.expectedModCount);
            }
        }

        public abstract boolean shouldUpdate(Object obj, Object obj2);

        public Itr(int i, Class cls, int i2, int i3) {
            this.index = i;
            this.map = cls;
            this.expectedModCount = i2;
            this.lastIndex = i3;
        }
    }

    public MapBuilder() {
        this(8);
    }
}
