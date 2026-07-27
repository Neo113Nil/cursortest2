package W2;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4294a = new ThreadLocal();

    public static U a() {
        ThreadLocal threadLocal = f4294a;
        U u4 = (U) threadLocal.get();
        if (u4 != null) {
            return u4;
        }
        C0281d c0281d = new C0281d(Thread.currentThread());
        threadLocal.set(c0281d);
        return c0281d;
    }
}
