package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t80 extends ej0 {
    public static final t80 p;
    public z40 o;

    static {
        int i = rt2.c;
        int i2 = rt2.d;
        long j = rt2.e;
        String str = rt2.a;
        t80 t80Var = new t80();
        t80Var.o = new z40(str, i, i2, j);
        p = t80Var;
    }

    @Override // defpackage.t40
    public final void N(CoroutineContext coroutineContext, Runnable runnable) {
        z40.m(this.o, runnable, 6);
    }

    @Override // defpackage.t40
    public final void O(CoroutineContext coroutineContext, Runnable runnable) {
        z40.m(this.o, runnable, 2);
    }

    @Override // defpackage.t40
    public final t40 Q(int i) {
        l41.u(1);
        return 1 >= rt2.c ? this : super.Q(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.t40
    public final String toString() {
        return "Dispatchers.Default";
    }
}
