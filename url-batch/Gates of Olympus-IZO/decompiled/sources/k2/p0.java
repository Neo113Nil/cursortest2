package k2;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f5379a = new ThreadLocal();

    public static O a() {
        ThreadLocal threadLocal = f5379a;
        O o3 = (O) threadLocal.get();
        if (o3 != null) {
            return o3;
        }
        C0532d c0532d = new C0532d(Thread.currentThread());
        threadLocal.set(c0532d);
        return c0532d;
    }
}
