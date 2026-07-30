package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final P f1393a;

    /* renamed from: b, reason: collision with root package name */
    public static final P f1394b;

    static {
        T t2 = T.f1395c;
        P p2 = null;
        try {
            p2 = (P) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1393a = p2;
        f1394b = new P();
    }
}
