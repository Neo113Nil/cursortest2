package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class s2 {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = xy.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(xy.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(zp.class.getName(), "okhttp.Http2");
        linkedHashMap.put(l80.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size == 0) {
            map = jk.f;
        } else if (size != 1) {
            map = new LinkedHashMap(linkedHashMap);
        } else {
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            map = Collections.singletonMap(entry.getKey(), entry.getValue());
            map.getClass();
        }
        b = map;
    }
}
