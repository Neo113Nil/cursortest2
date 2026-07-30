package M0;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f665a = new ThreadLocal();

    public static H a() {
        ThreadLocal threadLocal = f665a;
        H h2 = (H) threadLocal.get();
        if (h2 != null) {
            return h2;
        }
        C0046d c0046d = new C0046d(Thread.currentThread());
        threadLocal.set(c0046d);
        return c0046d;
    }
}
