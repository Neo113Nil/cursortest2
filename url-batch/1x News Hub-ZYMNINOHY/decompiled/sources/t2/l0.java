package t2;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f10423a = new ThreadLocal();

    public static J a() {
        ThreadLocal threadLocal = f10423a;
        J j3 = (J) threadLocal.get();
        if (j3 != null) {
            return j3;
        }
        C1194d c1194d = new C1194d(Thread.currentThread());
        threadLocal.set(c1194d);
        return c1194d;
    }
}
