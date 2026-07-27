package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class I {
    public static int a(Object obj, int i2, Object obj2) {
        H h3 = (H) obj;
        G g6 = (G) obj2;
        int i3 = 0;
        if (!h3.isEmpty()) {
            for (Map.Entry entry : h3.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                g6.getClass();
                int Z2 = C0217l.Z(i2);
                int a6 = G.a(g6.f4366a, key, value);
                i3 += C0217l.b0(a6) + a6 + Z2;
            }
        }
        return i3;
    }

    public static H b(Object obj, Object obj2) {
        H h3 = (H) obj;
        H h6 = (H) obj2;
        if (!h6.isEmpty()) {
            if (!h3.f4368a) {
                h3 = h3.c();
            }
            h3.a();
            if (!h6.isEmpty()) {
                h3.putAll(h6);
            }
        }
        return h3;
    }

    public static void c(Object obj) {
        ((H) obj).f4368a = false;
    }
}
