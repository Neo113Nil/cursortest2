package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class si extends vn {
    public static final si i;
    public zg h;

    static {
        int i2 = lh0.c;
        int i3 = lh0.d;
        long j = lh0.e;
        String str = lh0.a;
        si siVar = new si();
        siVar.h = new zg(i2, i3, j, str);
        i = siVar;
    }

    @Override // defpackage.tg
    public final void O(qg qgVar, Runnable runnable) {
        this.h.n(runnable, false);
    }

    @Override // defpackage.tg
    public final tg Q(int i2) {
        mv.g(1);
        return 1 >= lh0.c ? this : super.Q(1);
    }

    @Override // defpackage.vn
    public final Executor R() {
        return this.h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.tg
    public final String toString() {
        return "Dispatchers.Default";
    }
}
