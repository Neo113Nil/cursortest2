package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.collections.immutable.internal.EndOfChain;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class PersistentOrderedMapBuilderLinksIterator implements Iterator, KMappedMarker {
    public final PersistentOrderedMapBuilder builder;
    public int expectedModCount;
    public int index;
    public Object lastIteratedKey;
    public Object nextKey;
    public boolean nextWasInvoked;

    public PersistentOrderedMapBuilderLinksIterator(Object obj, PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        persistentOrderedMapBuilder.getClass();
        this.nextKey = obj;
        this.builder = persistentOrderedMapBuilder;
        this.lastIteratedKey = EndOfChain.INSTANCE;
        this.expectedModCount = persistentOrderedMapBuilder.hashMapBuilder.modCount;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.index < this.builder.hashMapBuilder.getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final LinkedValue next() {
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = this.builder;
        if (persistentOrderedMapBuilder.hashMapBuilder.modCount != this.expectedModCount) {
            Drop$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        Object obj = this.nextKey;
        this.lastIteratedKey = obj;
        this.nextWasInvoked = true;
        this.index++;
        V v = persistentOrderedMapBuilder.hashMapBuilder.get(obj);
        if (v == 0) {
            throw new ConcurrentModificationException(Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("Hash code of a key ("), this.nextKey, ") has changed after it was added to the persistent map."));
        }
        LinkedValue linkedValue = (LinkedValue) v;
        this.nextKey = linkedValue.next;
        return linkedValue;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.nextWasInvoked) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        }
        Object obj = this.lastIteratedKey;
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = this.builder;
        TypeIntrinsics.asMutableMap(persistentOrderedMapBuilder).remove(obj);
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = persistentOrderedMapBuilder.hashMapBuilder.modCount;
        this.index--;
    }
}
