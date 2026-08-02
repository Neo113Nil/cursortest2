package f1;

import Y0.AbstractC0124s;
import Y0.I;
import d1.AbstractC0184a;
import d1.x;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c extends I implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public static final c f2199g = new c();

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC0124s f2200h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [d1.j] */
    static {
        l lVar = l.f2216g;
        int i2 = x.f2109a;
        if (64 >= i2) {
            i2 = 64;
        }
        int k2 = AbstractC0184a.k("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12);
        lVar.getClass();
        if (k2 < 1) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + k2).toString());
        }
        if (k2 < k.f2211d) {
            if (k2 < 1) {
                throw new IllegalArgumentException(("Expected positive parallelism level, but got " + k2).toString());
            }
            lVar = new d1.j(lVar, k2);
        }
        f2200h = lVar;
    }

    @Override // Y0.AbstractC0124s
    public final void c(H0.i iVar, Runnable runnable) {
        f2200h.c(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(H0.j.f503e, runnable);
    }

    @Override // Y0.AbstractC0124s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
