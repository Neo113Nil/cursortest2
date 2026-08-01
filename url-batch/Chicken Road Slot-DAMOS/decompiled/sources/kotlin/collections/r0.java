package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class r0 extends q0 {
    public static List j(Map map) {
        map.getClass();
        if (map.size() == 0) {
            return j0.f5574d;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return j0.f5574d;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return x.c(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
