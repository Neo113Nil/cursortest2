package y1;

import G1.AbstractC0001b;
import java.util.concurrent.Executor;
import s1.AbstractC0332o;
import s1.E;
import w1.r;

/* loaded from: classes.dex */
public final class c extends E implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final c f4593c = new c();
    public static final AbstractC0332o d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [w1.g] */
    static {
        l lVar = l.f4606c;
        int i = r.f4517a;
        if (64 >= i) {
            i = 64;
        }
        int e2 = w1.a.e("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        lVar.getClass();
        if (e2 < 1) {
            throw new IllegalArgumentException(AbstractC0001b.f("Expected positive parallelism level, but got ", e2).toString());
        }
        if (e2 < k.d) {
            if (e2 < 1) {
                throw new IllegalArgumentException(AbstractC0001b.f("Expected positive parallelism level, but got ", e2).toString());
            }
            lVar = new w1.g(lVar, e2);
        }
        d = lVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        r(b1.k.f2050a, runnable);
    }

    @Override // s1.AbstractC0332o
    public final void r(b1.j jVar, Runnable runnable) {
        d.r(jVar, runnable);
    }

    @Override // s1.AbstractC0332o
    public final String toString() {
        return "Dispatchers.IO";
    }
}
