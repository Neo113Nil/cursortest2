package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class bx2 {
    public static final ThreadLocal a = new ThreadLocal();

    public static pi0 a() {
        ThreadLocal threadLocal = a;
        pi0 pi0Var = (pi0) threadLocal.get();
        if (pi0Var != null) {
            return pi0Var;
        }
        ro roVar = new ro(Thread.currentThread());
        threadLocal.set(roVar);
        return roVar;
    }
}
