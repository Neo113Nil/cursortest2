package W0;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f954a = new ThreadLocal();

    public static H a() {
        ThreadLocal threadLocal = f954a;
        H h2 = (H) threadLocal.get();
        if (h2 != null) {
            return h2;
        }
        C0064d c0064d = new C0064d(Thread.currentThread());
        threadLocal.set(c0064d);
        return c0064d;
    }
}
