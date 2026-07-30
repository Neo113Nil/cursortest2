package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class I {
    public static H a(Object obj, Object obj2) {
        H h7 = (H) obj;
        H h8 = (H) obj2;
        if (!h8.isEmpty()) {
            if (!h7.f3431d) {
                h7 = h7.b();
            }
            h7.a();
            if (!h8.isEmpty()) {
                h7.putAll(h8);
            }
        }
        return h7;
    }
}
