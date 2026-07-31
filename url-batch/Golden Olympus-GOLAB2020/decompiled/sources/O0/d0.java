package O0;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    static Map f1192b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static d0 f1193c;

    /* renamed from: a, reason: collision with root package name */
    private C0420u f1194a = new C0420u();

    private d0() {
    }

    public static d0 e() {
        if (f1193c == null) {
            f();
        }
        return f1193c;
    }

    private static synchronized void f() {
        synchronized (d0.class) {
            if (f1193c == null) {
                f1193c = new d0();
            }
        }
    }

    public J a(String str) {
        return (J) f1192b.get(str);
    }

    public Set b() {
        return f1192b.keySet();
    }

    public void c(String str, J j4) {
        f1192b.put(str, j4);
    }

    public C0420u d() {
        return this.f1194a;
    }
}
