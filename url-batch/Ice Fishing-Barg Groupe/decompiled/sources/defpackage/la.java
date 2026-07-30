package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class la {
    public static final int PxuCJdSBwIXG;

    static {
        Object uv1Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            uv1Var = property != null ? pa2.KUoIVIumpKat(property) : null;
        } catch (Throwable th) {
            uv1Var = new uv1(th);
        }
        Integer num = (Integer) (uv1Var instanceof uv1 ? null : uv1Var);
        PxuCJdSBwIXG = num != null ? num.intValue() : 2097152;
    }
}
