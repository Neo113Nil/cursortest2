package kotlinx.collections.immutable.implementations.immutableMap;

import androidx.collection.MapEntry;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue;

/* loaded from: classes9.dex */
public final class MutableMapEntry extends MapEntry implements KMutableMap.Entry {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object parentIterator;
    public Object value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMapEntry(Map map, Object obj, LinkedValue linkedValue) {
        super(1, obj, linkedValue.value);
        map.getClass();
        this.parentIterator = map;
        this.value = linkedValue;
    }

    @Override // androidx.collection.MapEntry, java.util.Map.Entry
    public final Object getValue() {
        switch (this.$r8$classId) {
            case 0:
                return this.value;
            default:
                return ((LinkedValue) this.value).value;
        }
    }

    @Override // androidx.collection.MapEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.key;
        Object obj3 = this.parentIterator;
        switch (i) {
            case 0:
                Object obj4 = this.value;
                this.value = obj;
                PersistentHashMapBuilderBaseIterator persistentHashMapBuilderBaseIterator = (PersistentHashMapBuilderBaseIterator) ((SmartSet.ArrayIterator) obj3).arrayIterator;
                PersistentHashMapBuilder persistentHashMapBuilder = persistentHashMapBuilderBaseIterator.builder;
                if (!persistentHashMapBuilder.containsKey(obj2)) {
                    return obj4;
                }
                boolean z = persistentHashMapBuilderBaseIterator.hasNext;
                if (!z) {
                    persistentHashMapBuilder.put(obj2, obj);
                } else {
                    if (!z) {
                        a$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }
                    TrieNodeBaseIterator trieNodeBaseIterator = persistentHashMapBuilderBaseIterator.path[persistentHashMapBuilderBaseIterator.pathLastIndex];
                    Object obj5 = trieNodeBaseIterator.buffer[trieNodeBaseIterator.index];
                    persistentHashMapBuilder.put(obj2, obj);
                    persistentHashMapBuilderBaseIterator.resetPath(obj5 != null ? obj5.hashCode() : 0, persistentHashMapBuilder.node, obj5, 0, 0, false);
                }
                persistentHashMapBuilderBaseIterator.expectedModCount = persistentHashMapBuilder.modCount;
                return obj4;
            default:
                LinkedValue linkedValue = (LinkedValue) this.value;
                Object obj6 = linkedValue.value;
                LinkedValue linkedValue2 = new LinkedValue(obj, linkedValue.previous, linkedValue.next);
                this.value = linkedValue2;
                ((Map) obj3).put(obj2, linkedValue2);
                return obj6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMapEntry(SmartSet.ArrayIterator arrayIterator, Object obj, Object obj2) {
        super(1, obj, obj2);
        arrayIterator.getClass();
        this.parentIterator = arrayIterator;
        this.value = obj2;
    }
}
