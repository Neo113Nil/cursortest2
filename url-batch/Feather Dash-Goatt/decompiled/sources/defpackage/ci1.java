package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class ci1 {
    public static final ThreadLocal a = new ThreadLocal();

    public static ew a() {
        ThreadLocal threadLocal = a;
        ew ewVar = (ew) threadLocal.get();
        if (ewVar != null) {
            return ewVar;
        }
        pd pdVar = new pd(Thread.currentThread());
        threadLocal.set(pdVar);
        return pdVar;
    }
}
