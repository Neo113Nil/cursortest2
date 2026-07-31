package P2;

import G2.r;
import S1.B;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f3926a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3927b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = r.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(r.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(N2.f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(J2.e.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f3927b = B.M(linkedHashMap);
    }
}
