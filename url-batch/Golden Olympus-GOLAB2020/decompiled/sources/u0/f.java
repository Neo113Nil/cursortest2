package u0;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f46386a = new HashMap();

    public interface a {
        String a(d dVar);
    }

    public static Map a() {
        return f46386a;
    }

    public static void b(String str, a aVar) {
        f46386a.put(str, aVar);
    }
}
