package r1;

import O0.r;
import O0.t;
import i1.u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f3966a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3967b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = u.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(u.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(p1.f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(l1.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        f3967b = size != 0 ? size != 1 ? new LinkedHashMap(linkedHashMap) : t.w0(linkedHashMap) : r.f695a;
    }
}
