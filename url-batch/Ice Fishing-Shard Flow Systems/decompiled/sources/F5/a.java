package F5;

import L5.e;
import L5.f;
import L5.h;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f764a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("default", L5.c.f1690a);
        hashMap.put("sum", h.f1697a);
        hashMap.put("last_value", f.f1695a);
        hashMap.put("drop", L5.d.f1692a);
        e eVar = e.f1693b;
        hashMap.put("explicit_bucket_histogram", eVar);
        hashMap.put("base2_exponential_bucket_histogram", L5.b.f1689a);
        HashMap hashMap2 = new HashMap();
        f764a = hashMap2;
        hashMap2.put(L5.c.class, "default");
        hashMap2.put(h.class, "sum");
        hashMap2.put(f.class, "last_value");
        hashMap2.put(L5.d.class, "drop");
        hashMap2.put(eVar.getClass(), "explicit_bucket_histogram");
        hashMap2.put(L5.b.class, "base2_exponential_bucket_histogram");
    }

    public static String a(D5.b bVar) {
        String str = (String) f764a.get(bVar.getClass());
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Unrecognized aggregation ".concat(bVar.getClass().getName()));
    }
}
