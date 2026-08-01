package r1;

import Q0.r;
import i1.p;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f3578a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3579b;

    static {
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = p.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(p.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(p1.f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(l1.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size == 0) {
            map = r.f672a;
        } else if (size != 1) {
            map = new LinkedHashMap(linkedHashMap);
        } else {
            X0.d.e(linkedHashMap, "<this>");
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            map = Collections.singletonMap(entry.getKey(), entry.getValue());
            X0.d.d(map, "with(...)");
        }
        f3579b = map;
    }
}
