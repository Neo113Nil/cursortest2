package A2;

import E1.AbstractC0033i;
import java.util.concurrent.Executor;
import t2.AbstractC1208s;
import t2.K;
import y2.v;

/* loaded from: classes.dex */
public final class d extends K implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final d f52c = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1208s f53d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [y2.i] */
    static {
        m mVar = m.f68c;
        int i3 = v.f10868a;
        if (64 >= i3) {
            i3 = 64;
        }
        int j3 = y2.a.j(i3, 12, "kotlinx.coroutines.io.parallelism");
        mVar.getClass();
        if (j3 < 1) {
            throw new IllegalArgumentException(AbstractC0033i.h(j3, "Expected positive parallelism level, but got ").toString());
        }
        if (j3 < l.f64d) {
            if (j3 < 1) {
                throw new IllegalArgumentException(AbstractC0033i.h(j3, "Expected positive parallelism level, but got ").toString());
            }
            mVar = new y2.i(mVar, j3);
        }
        f53d = mVar;
    }

    @Override // t2.AbstractC1208s
    public final void c(d2.h hVar, Runnable runnable) {
        f53d.c(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(d2.i.f4951a, runnable);
    }

    @Override // t2.AbstractC1208s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
