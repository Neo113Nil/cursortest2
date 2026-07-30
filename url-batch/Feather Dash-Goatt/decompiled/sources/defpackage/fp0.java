package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class fp0 {
    public static final ep0 a;
    public static final ep0 b;

    static {
        i01 i01Var = i01.c;
        ep0 ep0Var = null;
        try {
            ep0Var = (ep0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = ep0Var;
        b = new ep0();
    }
}
