package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes.dex */
public class CollectionsKt__CollectionsJVMKt {
    public static ListBuilder build(List list) {
        list.getClass();
        ListBuilder listBuilder = (ListBuilder) list;
        listBuilder.checkIsMutable$1();
        listBuilder.isReadOnly = true;
        return listBuilder.length > 0 ? listBuilder : ListBuilder.Empty;
    }

    public static ListBuilder createListBuilder() {
        return new ListBuilder(0, 1, null);
    }

    public static List listOf(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List shuffled(Iterable iterable) {
        iterable.getClass();
        List mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList);
        return mutableList;
    }
}
