package r2;

import java.util.concurrent.Executor;
import k2.AbstractC0546s;
import k2.P;
import p2.u;

/* loaded from: classes.dex */
public final class d extends P implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final d f7321f = new d();

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC0546s f7322g;

    static {
        l lVar = l.f7335f;
        int i3 = u.f6808a;
        if (64 >= i3) {
            i3 = 64;
        }
        f7322g = lVar.R(null, p2.a.l("kotlinx.coroutines.io.parallelism", i3, 0, 0, 12));
    }

    @Override // k2.AbstractC0546s
    public final void P(P1.i iVar, Runnable runnable) {
        f7322g.P(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        P(P1.j.f3073d, runnable);
    }

    @Override // k2.AbstractC0546s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
