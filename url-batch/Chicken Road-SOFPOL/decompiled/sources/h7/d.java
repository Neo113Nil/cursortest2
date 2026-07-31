package h7;

import a7.n0;
import a7.q;
import f7.t;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends n0 implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final d f3236f = new d();

    /* renamed from: g, reason: collision with root package name */
    public static final q f3237g;

    static {
        l lVar = l.f3250f;
        int i = t.f2801a;
        if (64 >= i) {
            i = 64;
        }
        f3237g = lVar.k(f7.a.j(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h(g6.i.f3046d, runnable);
    }

    @Override // a7.q
    public final void h(g6.h hVar, Runnable runnable) {
        f3237g.h(hVar, runnable);
    }

    @Override // a7.q
    public final String toString() {
        return "Dispatchers.IO";
    }
}
