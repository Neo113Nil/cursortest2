package Y4;

import e5.C0347b;
import e5.C0348c;
import e5.C0349d;
import e5.C0350e;
import e5.C0351f;
import e5.C0353h;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f3094a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("default", C0348c.f4012a);
        hashMap.put("sum", C0353h.f4019a);
        hashMap.put("last_value", C0351f.f4017a);
        hashMap.put("drop", C0349d.f4014a);
        C0350e c0350e = C0350e.f4015b;
        hashMap.put("explicit_bucket_histogram", c0350e);
        hashMap.put("base2_exponential_bucket_histogram", C0347b.f4011a);
        HashMap hashMap2 = new HashMap();
        f3094a = hashMap2;
        hashMap2.put(C0348c.class, "default");
        hashMap2.put(C0353h.class, "sum");
        hashMap2.put(C0351f.class, "last_value");
        hashMap2.put(C0349d.class, "drop");
        hashMap2.put(c0350e.getClass(), "explicit_bucket_histogram");
        hashMap2.put(C0347b.class, "base2_exponential_bucket_histogram");
    }

    public static String a(W4.b bVar) {
        String str = (String) f3094a.get(bVar.getClass());
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Unrecognized aggregation ".concat(bVar.getClass().getName()));
    }
}
