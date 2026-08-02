package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes9.dex */
public class PersistentOrderedMapLinksIterator implements Iterator, KMappedMarker {
    public final /* synthetic */ int $r8$classId;
    public final Map hashMap;
    public int index;
    public Object nextKey;

    public PersistentOrderedMapLinksIterator(Object obj, Map map, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.nextKey = obj;
                this.hashMap = map;
                break;
            default:
                map.getClass();
                this.nextKey = obj;
                this.hashMap = map;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
            case 0:
                if (this.index < this.hashMap.size()) {
                }
                break;
            default:
                if (this.index < this.hashMap.size()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.$r8$classId) {
            case 0:
                return next();
            default:
                if (!hasNext()) {
                    a$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                Object obj = this.nextKey;
                this.index++;
                Object obj2 = this.hashMap.get(obj);
                if (obj2 == null) {
                    throw new ConcurrentModificationException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Hash code of an element (", ") has changed after it was added to the persistent set.", obj));
                }
                this.nextKey = ((Links) obj2).next;
                return obj;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Iterator
    public LinkedValue next() {
        if (hasNext()) {
            Object obj = this.hashMap.get(this.nextKey);
            if (obj != null) {
                LinkedValue linkedValue = (LinkedValue) obj;
                this.index++;
                this.nextKey = linkedValue.next;
                return linkedValue;
            }
            throw new ConcurrentModificationException(Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("Hash code of a key ("), this.nextKey, ") has changed after it was added to the persistent map."));
        }
        a$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
