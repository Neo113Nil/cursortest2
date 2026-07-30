package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class nj2 {
    public static final ThreadLocal PxuCJdSBwIXG = new ThreadLocal();

    public static t60 PxuCJdSBwIXG() {
        ThreadLocal threadLocal = PxuCJdSBwIXG;
        t60 t60Var = (t60) threadLocal.get();
        if (t60Var != null) {
            return t60Var;
        }
        xd xdVar = new xd(Thread.currentThread());
        threadLocal.set(xdVar);
        return xdVar;
    }
}
