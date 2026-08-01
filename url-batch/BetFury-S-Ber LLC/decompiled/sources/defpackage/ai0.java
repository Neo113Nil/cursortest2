package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class ai0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static ln a() {
        ThreadLocal threadLocal = a;
        ln lnVar = (ln) threadLocal.get();
        if (lnVar != null) {
            return lnVar;
        }
        z8 z8Var = new z8(Thread.currentThread());
        threadLocal.set(z8Var);
        return z8Var;
    }
}
