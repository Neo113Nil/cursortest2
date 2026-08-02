package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.internal.time.zzfh;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes9.dex */
public final class SmallSortedMap$1 extends AbstractMap {
    public static final /* synthetic */ int $r8$clinit = 0;
    public boolean isImmutable;
    public volatile zzfh lazyEntrySet;
    public final int maxArraySize;
    public List entryList = Collections.EMPTY_LIST;
    public Map overflowEntries = Collections.EMPTY_MAP;

    public SmallSortedMap$1(int i) {
        this.maxArraySize = i;
    }

    public final int binarySearchInArray(Comparable comparable) {
        int i;
        int size = this.entryList.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((SmallSortedMap$Entry) this.entryList.get(i2)).key);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((SmallSortedMap$Entry) this.entryList.get(i4)).key);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void checkMutable() {
        if (this.isImmutable) {
            OptionalProvider$$ExternalSyntheticLambda0.m();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        checkMutable();
        if (!this.entryList.isEmpty()) {
            this.entryList.clear();
        }
        if (this.overflowEntries.isEmpty()) {
            return;
        }
        this.overflowEntries.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return binarySearchInArray(comparable) >= 0 || this.overflowEntries.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new zzfh(this, 6);
        }
        return this.lazyEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        return binarySearchInArray >= 0 ? ((SmallSortedMap$Entry) this.entryList.get(binarySearchInArray)).value : this.overflowEntries.get(comparable);
    }

    public final Iterable getOverflowEntries() {
        return this.overflowEntries.isEmpty() ? Utf8.ITERABLE : this.overflowEntries.entrySet();
    }

    public final SortedMap getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            this.overflowEntries = new TreeMap();
        }
        return (SortedMap) this.overflowEntries;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: put$kotlin$reflect$jvm$internal$impl$protobuf$SmallSortedMap, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        checkMutable();
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return ((SmallSortedMap$Entry) this.entryList.get(binarySearchInArray)).setValue(obj);
        }
        checkMutable();
        boolean isEmpty = this.entryList.isEmpty();
        int i = this.maxArraySize;
        if (isEmpty && !(this.entryList instanceof ArrayList)) {
            this.entryList = new ArrayList(i);
        }
        int i2 = -(binarySearchInArray + 1);
        if (i2 >= i) {
            return getOverflowEntriesMutable().put(comparable, obj);
        }
        if (this.entryList.size() == i) {
            SmallSortedMap$Entry smallSortedMap$Entry = (SmallSortedMap$Entry) this.entryList.remove(i - 1);
            getOverflowEntriesMutable().put(smallSortedMap$Entry.key, smallSortedMap$Entry.value);
        }
        this.entryList.add(i2, new SmallSortedMap$Entry(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        checkMutable();
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return removeArrayEntryAt(binarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    public final Object removeArrayEntryAt(int i) {
        checkMutable();
        Object obj = ((SmallSortedMap$Entry) this.entryList.remove(i)).value;
        if (!this.overflowEntries.isEmpty()) {
            Iterator it = getOverflowEntriesMutable().entrySet().iterator();
            List list = this.entryList;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new SmallSortedMap$Entry(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.overflowEntries.size() + this.entryList.size();
    }
}
