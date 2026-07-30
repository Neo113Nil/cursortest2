package k1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f729a = new ThreadLocal();

    public static c0 a() {
        ThreadLocal threadLocal = f729a;
        c0 c0Var = (c0) threadLocal.get();
        if (c0Var != null) {
            return c0Var;
        }
        c cVar = new c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}
