package q2;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f7918a = new ThreadLocal();

    public static O a() {
        ThreadLocal threadLocal = f7918a;
        O o3 = (O) threadLocal.get();
        if (o3 != null) {
            return o3;
        }
        C0817d c0817d = new C0817d(Thread.currentThread());
        threadLocal.set(c0817d);
        return c0817d;
    }
}
