package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class g00 {
    public static final h00 a;

    static {
        h00 h00Var = null;
        try {
            h00Var = (h00) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (h00Var == null) {
            h00Var = new h00();
        }
        a = h00Var;
    }
}
