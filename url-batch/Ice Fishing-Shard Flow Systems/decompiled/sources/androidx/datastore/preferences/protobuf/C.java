package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final B f3420a;

    /* renamed from: b, reason: collision with root package name */
    public static final B f3421b;

    static {
        S s7 = S.f3454c;
        B b7 = null;
        try {
            b7 = (B) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f3420a = b7;
        f3421b = new B();
    }
}
