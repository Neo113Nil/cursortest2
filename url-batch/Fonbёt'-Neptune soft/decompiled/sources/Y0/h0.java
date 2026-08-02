package Y0;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1208a = new ThreadLocal();

    public static H a() {
        ThreadLocal threadLocal = f1208a;
        H h2 = (H) threadLocal.get();
        if (h2 != null) {
            return h2;
        }
        C0110d c0110d = new C0110d(Thread.currentThread());
        threadLocal.set(c0110d);
        return c0110d;
    }
}
