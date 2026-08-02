package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final C f2221a;

    /* renamed from: b, reason: collision with root package name */
    public static final C f2222b;

    static {
        C c3;
        T t3 = T.f2253c;
        try {
            c3 = (C) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c3 = null;
        }
        f2221a = c3;
        f2222b = new C();
    }
}
