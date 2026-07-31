package d1;

import W0.AbstractC0078s;
import W0.I;
import b1.AbstractC0115a;
import b1.x;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c extends I implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public static final c f1829g = new c();

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC0078s f1830h;

    static {
        AbstractC0078s abstractC0078s = l.f1846g;
        int i2 = x.f1779a;
        if (64 >= i2) {
            i2 = 64;
        }
        int j2 = AbstractC0115a.j("kotlinx.coroutines.io.parallelism", i2, 12);
        abstractC0078s.getClass();
        if (j2 < 1) {
            throw new IllegalArgumentException(L.d.e("Expected positive parallelism level, but got ", j2).toString());
        }
        if (j2 < k.f1841d) {
            if (j2 < 1) {
                throw new IllegalArgumentException(L.d.e("Expected positive parallelism level, but got ", j2).toString());
            }
            abstractC0078s = new b1.j(abstractC0078s, j2);
        }
        f1830h = abstractC0078s;
    }

    @Override // W0.AbstractC0078s
    public final void c(G0.i iVar, Runnable runnable) {
        f1830h.c(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(G0.j.f500e, runnable);
    }

    @Override // W0.AbstractC0078s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
