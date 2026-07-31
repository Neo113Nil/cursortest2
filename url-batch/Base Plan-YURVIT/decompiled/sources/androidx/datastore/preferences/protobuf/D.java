package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final C f1448a;

    /* renamed from: b, reason: collision with root package name */
    public static final C f1449b;

    static {
        T t = T.f1483c;
        C c2 = null;
        try {
            c2 = (C) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1448a = c2;
        f1449b = new C();
    }
}
