package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class yh0 {
    public static final xh0 a;
    public static final xh0 b;

    static {
        i01 i01Var = i01.c;
        xh0 xh0Var = null;
        try {
            xh0Var = (xh0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = xh0Var;
        b = new xh0();
    }
}
