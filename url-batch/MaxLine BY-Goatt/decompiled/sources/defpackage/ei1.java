package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ei1 {
    public static final di1 a;
    public static final di1 b;

    static {
        q52 q52Var = q52.c;
        di1 di1Var = null;
        try {
            di1Var = (di1) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = di1Var;
        b = new di1();
    }
}
