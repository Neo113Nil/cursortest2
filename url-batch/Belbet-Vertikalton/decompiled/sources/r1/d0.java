package r1;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4066a = new ThreadLocal();

    public static E a() {
        ThreadLocal threadLocal = f4066a;
        E e = (E) threadLocal.get();
        if (e != null) {
            return e;
        }
        C0353c c0353c = new C0353c(Thread.currentThread());
        threadLocal.set(c0353c);
        return c0353c;
    }
}
