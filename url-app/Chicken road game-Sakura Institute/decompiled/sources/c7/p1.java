package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1729a = new ThreadLocal();

    public static q0 a() {
        ThreadLocal threadLocal = f1729a;
        q0 q0Var = (q0) threadLocal.get();
        if (q0Var != null) {
            return q0Var;
        }
        d dVar = new d(Thread.currentThread());
        threadLocal.set(dVar);
        return dVar;
    }
}
