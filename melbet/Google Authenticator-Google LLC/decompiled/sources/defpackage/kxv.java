package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxv {
    public static final ThreadLocal a = new ThreadLocal();

    public static final kwf a() {
        ThreadLocal threadLocal = a;
        kwf kwfVar = (kwf) threadLocal.get();
        if (kwfVar != null) {
            return kwfVar;
        }
        kus kusVar = new kus(Thread.currentThread());
        threadLocal.set(kusVar);
        return kusVar;
    }
}
