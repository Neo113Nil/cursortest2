package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f274a = new ThreadLocal();

    public static m0 a() {
        ThreadLocal threadLocal = f274a;
        m0 m0Var = (m0) threadLocal.get();
        if (m0Var != null) {
            return m0Var;
        }
        d dVar = new d(Thread.currentThread());
        threadLocal.set(dVar);
        return dVar;
    }
}
