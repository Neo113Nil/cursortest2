package x3;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f16040a = new ThreadLocal();

    public static AbstractC1534I a() {
        ThreadLocal threadLocal = f16040a;
        AbstractC1534I abstractC1534I = (AbstractC1534I) threadLocal.get();
        if (abstractC1534I != null) {
            return abstractC1534I;
        }
        C1544d c1544d = new C1544d(Thread.currentThread());
        threadLocal.set(c1544d);
        return c1544d;
    }
}
