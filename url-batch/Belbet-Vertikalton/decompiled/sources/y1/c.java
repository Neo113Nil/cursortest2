package y1;

import G1.AbstractC0001b;
import java.util.concurrent.Executor;
import r1.AbstractC0366p;
import r1.F;
import w1.v;

/* loaded from: classes.dex */
public final class c extends F implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final c f4746c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0366p f4747d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [w1.h] */
    static {
        l lVar = l.f4762c;
        int i = v.f4502a;
        if (64 >= i) {
            i = 64;
        }
        int l2 = w1.a.l("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        lVar.getClass();
        if (l2 < 1) {
            throw new IllegalArgumentException(AbstractC0001b.e("Expected positive parallelism level, but got ", l2).toString());
        }
        if (l2 < k.f4758d) {
            if (l2 < 1) {
                throw new IllegalArgumentException(AbstractC0001b.e("Expected positive parallelism level, but got ", l2).toString());
            }
            lVar = new w1.h(lVar, l2);
        }
        f4747d = lVar;
    }

    @Override // r1.AbstractC0366p
    public final void D(a1.i iVar, Runnable runnable) {
        f4747d.D(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        D(a1.j.f1673a, runnable);
    }

    @Override // r1.AbstractC0366p
    public final String toString() {
        return "Dispatchers.IO";
    }
}
