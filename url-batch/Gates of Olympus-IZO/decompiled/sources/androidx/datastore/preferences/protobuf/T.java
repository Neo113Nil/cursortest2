package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static final S f3826a;

    /* renamed from: b, reason: collision with root package name */
    public static final S f3827b;

    static {
        S s3 = null;
        try {
            s3 = (S) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f3826a = s3;
        f3827b = new S();
    }
}
