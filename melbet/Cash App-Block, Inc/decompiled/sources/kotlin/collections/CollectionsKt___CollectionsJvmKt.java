package kotlin.collections;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class CollectionsKt___CollectionsJvmKt extends CollectionsKt__ReversedViewsKt {
    public static SortedSet toSortedSet(ArrayList arrayList) {
        TreeSet treeSet = new TreeSet();
        CollectionsKt.toCollection(arrayList, treeSet);
        return treeSet;
    }
}
