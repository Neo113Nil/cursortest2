package k0;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f907a = new ThreadLocal();

    public static D a() {
        ThreadLocal threadLocal = f907a;
        D d2 = (D) threadLocal.get();
        if (d2 != null) {
            return d2;
        }
        C0042c c0042c = new C0042c(Thread.currentThread());
        threadLocal.set(c0042c);
        return c0042c;
    }
}
