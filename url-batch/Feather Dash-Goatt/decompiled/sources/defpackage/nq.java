package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nq extends nw {
    public static final nq h;
    public rn g;

    static {
        int i = qg1.c;
        int i2 = qg1.d;
        long j = qg1.e;
        String str = qg1.a;
        nq nqVar = new nq();
        nqVar.g = new rn(str, i, i2, j);
        h = nqVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.ln
    public final void f(CoroutineContext coroutineContext, Runnable runnable) {
        rn.c(this.g, runnable, 6);
    }

    @Override // defpackage.ln
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        rn.c(this.g, runnable, 2);
    }

    @Override // defpackage.ln
    public final String toString() {
        return "Dispatchers.Default";
    }
}
