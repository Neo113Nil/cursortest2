package x2;

import java.util.concurrent.Executor;
import q2.AbstractC0831s;
import q2.P;
import v2.t;

/* loaded from: classes.dex */
public final class d extends P implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final d f10346f = new d();

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC0831s f10347g;

    static {
        l lVar = l.f10360f;
        int i3 = t.f9828a;
        if (64 >= i3) {
            i3 = 64;
        }
        f10347g = lVar.G(null, v2.a.l("kotlinx.coroutines.io.parallelism", i3, 0, 0, 12));
    }

    @Override // q2.AbstractC0831s
    public final void D(V1.i iVar, Runnable runnable) {
        f10347g.D(iVar, runnable);
    }

    @Override // q2.AbstractC0831s
    public final void E(V1.i iVar, Runnable runnable) {
        f10347g.E(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        D(V1.j.f4558d, runnable);
    }

    @Override // q2.AbstractC0831s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
