package o1;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3333a = new ThreadLocal();

    public static D a() {
        ThreadLocal threadLocal = f3333a;
        D d = (D) threadLocal.get();
        if (d != null) {
            return d;
        }
        C0284c c0284c = new C0284c(Thread.currentThread());
        threadLocal.set(c0284c);
        return c0284c;
    }
}
