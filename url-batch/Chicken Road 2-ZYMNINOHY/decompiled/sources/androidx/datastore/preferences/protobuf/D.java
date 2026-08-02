package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final C f4558a;

    /* renamed from: b, reason: collision with root package name */
    public static final C f4559b;

    static {
        T t4 = T.f4591c;
        C c4 = null;
        try {
            c4 = (C) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4558a = c4;
        f4559b = new C();
    }
}
