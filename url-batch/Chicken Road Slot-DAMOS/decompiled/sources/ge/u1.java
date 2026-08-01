package ge;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4407a = new ThreadLocal();

    public static p0 a() {
        ThreadLocal threadLocal = f4407a;
        p0 p0Var = (p0) threadLocal.get();
        if (p0Var != null) {
            return p0Var;
        }
        d dVar = new d(Thread.currentThread());
        threadLocal.set(dVar);
        return dVar;
    }
}
