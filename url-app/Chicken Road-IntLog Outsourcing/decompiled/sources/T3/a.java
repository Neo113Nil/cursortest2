package T3;

import Z3.e;
import Z3.f;
import Z3.h;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f2799a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("default", Z3.c.f3780a);
        hashMap.put("sum", h.f3787a);
        hashMap.put("last_value", f.f3785a);
        hashMap.put("drop", Z3.d.f3782a);
        e eVar = e.f3783b;
        hashMap.put("explicit_bucket_histogram", eVar);
        hashMap.put("base2_exponential_bucket_histogram", Z3.b.f3779a);
        HashMap hashMap2 = new HashMap();
        f2799a = hashMap2;
        hashMap2.put(Z3.c.class, "default");
        hashMap2.put(h.class, "sum");
        hashMap2.put(f.class, "last_value");
        hashMap2.put(Z3.d.class, "drop");
        hashMap2.put(eVar.getClass(), "explicit_bucket_histogram");
        hashMap2.put(Z3.b.class, "base2_exponential_bucket_histogram");
    }

    public static String a(R3.b bVar) {
        String str = (String) f2799a.get(bVar.getClass());
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Unrecognized aggregation ".concat(bVar.getClass().getName()));
    }
}
