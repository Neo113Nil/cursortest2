package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final P f4589a;

    /* renamed from: b, reason: collision with root package name */
    public static final P f4590b;

    static {
        T t4 = T.f4591c;
        P p2 = null;
        try {
            p2 = (P) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4589a = p2;
        f4590b = new P();
    }
}
