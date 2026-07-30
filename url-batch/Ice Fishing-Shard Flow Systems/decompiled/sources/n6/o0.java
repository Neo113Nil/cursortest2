package n6;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f7069a = new ThreadLocal();

    public static P a() {
        ThreadLocal threadLocal = f7069a;
        P p7 = (P) threadLocal.get();
        if (p7 != null) {
            return p7;
        }
        C0771d c0771d = new C0771d(Thread.currentThread());
        threadLocal.set(c0771d);
        return c0771d;
    }
}
