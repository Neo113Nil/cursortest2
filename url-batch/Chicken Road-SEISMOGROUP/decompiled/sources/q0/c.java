package q0;

import java.util.concurrent.Executor;
import k0.AbstractC0055p;
import k0.E;
import p0.AbstractC0084a;
import p0.x;

/* loaded from: classes.dex */
public final class c extends E implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final c f1210d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC0055p f1211e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [p0.j] */
    static {
        k kVar = k.f1226d;
        int i2 = x.f1181a;
        if (64 >= i2) {
            i2 = 64;
        }
        int k2 = AbstractC0084a.k("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12);
        kVar.getClass();
        if (k2 < 1) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + k2).toString());
        }
        if (k2 < j.f1221d) {
            if (k2 < 1) {
                throw new IllegalArgumentException(("Expected positive parallelism level, but got " + k2).toString());
            }
            kVar = new p0.j(kVar, k2);
        }
        f1211e = kVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // k0.AbstractC0055p
    public final void d(W.i iVar, Runnable runnable) {
        f1211e.d(iVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(W.j.f449b, runnable);
    }

    @Override // k0.AbstractC0055p
    public final String toString() {
        return "Dispatchers.IO";
    }
}
