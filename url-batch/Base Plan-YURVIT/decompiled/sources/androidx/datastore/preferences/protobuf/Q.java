package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final P f1481a;

    /* renamed from: b, reason: collision with root package name */
    public static final P f1482b;

    static {
        T t = T.f1483c;
        P p2 = null;
        try {
            p2 = (P) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1481a = p2;
        f1482b = new P();
    }
}
