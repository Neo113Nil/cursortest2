package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final P f2251a;

    /* renamed from: b, reason: collision with root package name */
    public static final P f2252b;

    static {
        P p3;
        T t3 = T.f2253c;
        try {
            p3 = (P) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            p3 = null;
        }
        f2251a = p3;
        f2252b = new P();
    }
}
