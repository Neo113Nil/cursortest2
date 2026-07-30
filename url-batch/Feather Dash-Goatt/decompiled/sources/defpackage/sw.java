package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class sw {
    public static final rw a = new rw();
    public static final rw b;

    static {
        i01 i01Var = i01.c;
        rw rwVar = null;
        try {
            rwVar = (rw) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = rwVar;
    }
}
