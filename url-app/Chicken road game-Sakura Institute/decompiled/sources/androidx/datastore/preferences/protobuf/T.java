package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static final S f5301a;

    /* renamed from: b, reason: collision with root package name */
    public static final S f5302b;

    static {
        S s4 = null;
        try {
            s4 = (S) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f5301a = s4;
        f5302b = new S();
    }
}
