package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.collections.immutable.implementations.immutableMap.MutableMapEntry;

/* loaded from: classes9.dex */
public final class PersistentOrderedMapBuilderKeysIterator implements Iterator, KMappedMarker {
    public final /* synthetic */ int $r8$classId;
    public final PersistentOrderedMapBuilderLinksIterator internal;

    public PersistentOrderedMapBuilderKeysIterator(PersistentOrderedMapBuilder persistentOrderedMapBuilder, int i) {
        this.$r8$classId = i;
        persistentOrderedMapBuilder.getClass();
        switch (i) {
            case 1:
                this.internal = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.firstKey, persistentOrderedMapBuilder);
                break;
            case 2:
                this.internal = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.firstKey, persistentOrderedMapBuilder);
                break;
            default:
                this.internal = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.firstKey, persistentOrderedMapBuilder);
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
        PersistentOrderedMapBuilderLinksIterator persistentOrderedMapBuilderLinksIterator = this.internal;
        switch (i) {
            case 0:
                persistentOrderedMapBuilderLinksIterator.next();
                return persistentOrderedMapBuilderLinksIterator.lastIteratedKey;
            case 1:
                return new MutableMapEntry(persistentOrderedMapBuilderLinksIterator.builder.hashMapBuilder, persistentOrderedMapBuilderLinksIterator.lastIteratedKey, persistentOrderedMapBuilderLinksIterator.next());
            default:
                return persistentOrderedMapBuilderLinksIterator.next().value;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                this.internal.remove();
                break;
            case 1:
                this.internal.remove();
                break;
            default:
                this.internal.remove();
                break;
        }
    }
}
