package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static final S f5027a;

    /* renamed from: b, reason: collision with root package name */
    public static final S f5028b;

    static {
        S s3 = null;
        try {
            s3 = (S) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f5027a = s3;
        f5028b = new S();
    }
}
