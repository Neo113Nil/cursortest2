package H5;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1094a = new ThreadLocal();

    public static P a() {
        ThreadLocal threadLocal = f1094a;
        P p4 = (P) threadLocal.get();
        if (p4 != null) {
            return p4;
        }
        C0144d c0144d = new C0144d(Thread.currentThread());
        threadLocal.set(c0144d);
        return c0144d;
    }
}
