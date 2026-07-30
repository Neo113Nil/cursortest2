package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final I f3432a;

    /* renamed from: b, reason: collision with root package name */
    public static final I f3433b;

    static {
        S s7 = S.f3454c;
        I i2 = null;
        try {
            i2 = (I) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f3432a = i2;
        f3433b = new I();
    }
}
