package P3;

import G3.s;
import d3.t;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f2095a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2096b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = s.class.getPackage();
        String name = r22 == null ? null : r22.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(s.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(N3.g.class.getName(), "okhttp.Http2");
        linkedHashMap.put(J3.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f2096b = t.G(linkedHashMap);
    }
}
