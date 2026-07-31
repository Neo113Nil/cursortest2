package m6;

/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final f2 f19284a = new f2();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<z0> f19285b = new ThreadLocal<>();

    private f2() {
    }

    public final z0 a() {
        ThreadLocal<z0> threadLocal = f19285b;
        z0 z0Var = threadLocal.get();
        if (z0Var != null) {
            return z0Var;
        }
        z0 a7 = c1.a();
        threadLocal.set(a7);
        return a7;
    }

    public final void b() {
        f19285b.set(null);
    }

    public final void c(z0 z0Var) {
        f19285b.set(z0Var);
    }
}
