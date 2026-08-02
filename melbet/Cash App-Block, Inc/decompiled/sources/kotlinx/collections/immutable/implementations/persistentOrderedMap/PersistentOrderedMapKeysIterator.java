package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.collection.MapEntry;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes9.dex */
public final class PersistentOrderedMapKeysIterator implements Iterator, KMappedMarker {
    public final /* synthetic */ int $r8$classId;
    public final PersistentOrderedMapLinksIterator internal;

    public PersistentOrderedMapKeysIterator(PersistentOrderedMap persistentOrderedMap, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.internal = new PersistentOrderedMapLinksIterator(persistentOrderedMap.firstKey, persistentOrderedMap.hashMap, 0);
                break;
            case 2:
                this.internal = new PersistentOrderedMapLinksIterator(persistentOrderedMap.firstKey, persistentOrderedMap.hashMap, 0);
                break;
            default:
                this.internal = new PersistentOrderedMapLinksIterator(persistentOrderedMap.firstKey, persistentOrderedMap.hashMap, 0);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
        }
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.$r8$classId;
        PersistentOrderedMapLinksIterator persistentOrderedMapLinksIterator = this.internal;
        switch (i) {
            case 0:
                Object obj = persistentOrderedMapLinksIterator.nextKey;
                persistentOrderedMapLinksIterator.next();
                return obj;
            case 1:
                return new MapEntry(1, persistentOrderedMapLinksIterator.nextKey, persistentOrderedMapLinksIterator.next().value);
            default:
                return persistentOrderedMapLinksIterator.next().value;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
