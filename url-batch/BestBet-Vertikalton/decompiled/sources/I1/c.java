package I1;

import Y0.t;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import z1.p;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f547a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f548b;

    static {
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = p.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(p.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(G1.g.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C1.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size == 0) {
            map = t.f1517a;
        } else if (size != 1) {
            map = new LinkedHashMap(linkedHashMap);
        } else {
            k1.e.e(linkedHashMap, "<this>");
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            map = Collections.singletonMap(entry.getKey(), entry.getValue());
            k1.e.d(map, "with(...)");
        }
        f548b = map;
    }
}
