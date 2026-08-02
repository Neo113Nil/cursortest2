package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap;

/* loaded from: classes4.dex */
public class GroupingKt__GroupingJVMKt {
    public static Map eachCount(Grouping grouping) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator sourceIterator = grouping.sourceIterator();
        while (sourceIterator.hasNext()) {
            String keyOf = grouping.keyOf(sourceIterator.next());
            Object obj = linkedHashMap.get(keyOf);
            if (obj == null && !linkedHashMap.containsKey(keyOf)) {
                obj = new Ref$IntRef();
            }
            Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
            ref$IntRef.element++;
            linkedHashMap.put(keyOf, ref$IntRef);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            entry.getClass();
            if ((entry instanceof KMappedMarker) && !(entry instanceof KMutableMap.Entry)) {
                TypeIntrinsics.throwCce(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((Ref$IntRef) entry.getValue()).element));
        }
        return TypeIntrinsics.asMutableMap(linkedHashMap);
    }
}
