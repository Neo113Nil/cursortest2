package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class a21 {
    public static final b21 a;

    static {
        b21 b21Var = null;
        try {
            b21Var = (b21) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (b21Var == null) {
            b21Var = new b21();
        }
        a = b21Var;
    }

    public static yg a(Class cls) {
        a.getClass();
        return new yg(cls);
    }
}
