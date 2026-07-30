package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class ik0 extends hk0 {
    public static Map c(Pair... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(hk0.a(pairArr.length));
            d(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        ov ovVar = ov.d;
        ovVar.getClass();
        return ovVar;
    }

    public static final void d(HashMap hashMap, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            hashMap.put(pair.d, pair.e);
        }
    }

    public static Map e(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            ov ovVar = ov.d;
            ovVar.getClass();
            return ovVar;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }
}
