package O0;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: b, reason: collision with root package name */
    private static p0 f1245b;

    /* renamed from: a, reason: collision with root package name */
    private volatile Map f1246a = new HashMap();

    private p0() {
    }

    private V a(String str) {
        if (!this.f1246a.containsKey(str)) {
            this.f1246a.put(str, new V());
        }
        return (V) this.f1246a.get(str);
    }

    public static p0 c() {
        if (f1245b == null) {
            d();
        }
        return f1245b;
    }

    private static synchronized void d() {
        synchronized (p0.class) {
            if (f1245b == null) {
                f1245b = new p0();
            }
        }
    }

    public V b(String str, long j4) {
        V a4 = a(str);
        a4.b(j4);
        return a4;
    }
}
