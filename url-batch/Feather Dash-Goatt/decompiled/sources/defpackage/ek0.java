package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class ek0 {
    public static final dk0 a;
    public static final dk0 b;

    static {
        i01 i01Var = i01.c;
        dk0 dk0Var = null;
        try {
            dk0Var = (dk0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = dk0Var;
        b = new dk0();
    }
}
