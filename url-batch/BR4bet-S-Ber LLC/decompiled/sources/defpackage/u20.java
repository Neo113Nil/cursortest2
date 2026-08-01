package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class u20 {
    public static final v20 a;

    static {
        v20 v20Var = null;
        try {
            v20Var = (v20) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (v20Var == null) {
            v20Var = new v20();
        }
        a = v20Var;
    }

    public static gb a(Class cls) {
        a.getClass();
        return new gb(cls);
    }
}
