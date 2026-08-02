package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.ULong;

/* loaded from: classes4.dex */
public class UCollectionsKt___UCollectionsKt {
    public static long[] toULongArray(Collection collection) {
        collection.getClass();
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((ULong) it.next()).data;
            i++;
        }
        return jArr;
    }
}
