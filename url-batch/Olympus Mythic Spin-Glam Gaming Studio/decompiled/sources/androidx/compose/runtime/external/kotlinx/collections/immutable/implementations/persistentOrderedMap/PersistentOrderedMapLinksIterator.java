package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yandex.div.core.ScrollDirection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: PersistentOrderedMapContentIterators.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B+\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "", "nextKey", "", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "", "hasNext", "()Z", ScrollDirection.NEXT, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "Ljava/lang/Object;", "getNextKey$runtime", "()Ljava/lang/Object;", "setNextKey$runtime", "(Ljava/lang/Object;)V", "Ljava/util/Map;", "", "index", "I", "getIndex$runtime", "()I", "setIndex$runtime", "(I)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMappedMarker {
    private final Map hashMap;
    private int index;
    private Object nextKey;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PersistentOrderedMapLinksIterator(Object obj, Map map) {
        this.nextKey = obj;
        this.hashMap = map;
    }

    /* renamed from: getNextKey$runtime, reason: from getter */
    public final Object getNextKey() {
        return this.nextKey;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.hashMap.size();
    }

    @Override // java.util.Iterator
    public LinkedValue next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.hashMap.get(this.nextKey);
        if (obj == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map.");
        }
        LinkedValue linkedValue = (LinkedValue) obj;
        this.index++;
        this.nextKey = linkedValue.getNext();
        return linkedValue;
    }
}
