package O7;

/* loaded from: classes2.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2620a = new ThreadLocal();

    public static P a() {
        ThreadLocal threadLocal = f2620a;
        P p6 = (P) threadLocal.get();
        if (p6 != null) {
            return p6;
        }
        C0379d c0379d = new C0379d(Thread.currentThread());
        threadLocal.set(c0379d);
        return c0379d;
    }
}
