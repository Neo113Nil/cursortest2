package w4;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h {
    public static Map<String, Object> a(f fVar) {
        u4.d d7 = fVar.d();
        if (d7 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", d7.e());
        hashMap.put("arguments", d7.d());
        return hashMap;
    }
}
