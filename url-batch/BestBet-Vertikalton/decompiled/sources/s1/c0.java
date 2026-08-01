package s1;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4036a = new ThreadLocal();

    public static D a() {
        ThreadLocal threadLocal = f4036a;
        D d = (D) threadLocal.get();
        if (d != null) {
            return d;
        }
        C0320c c0320c = new C0320c(Thread.currentThread());
        threadLocal.set(c0320c);
        return c0320c;
    }
}
