package T0;

import M0.AbstractC0060s;
import M0.I;
import R0.AbstractC0068a;
import R0.x;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c extends I implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public static final c f969g = new c();

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC0060s f970h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [R0.j] */
    static {
        l lVar = l.f986g;
        int i2 = x.f940a;
        if (64 >= i2) {
            i2 = 64;
        }
        int l2 = AbstractC0068a.l("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12);
        lVar.getClass();
        if (l2 < 1) {
            throw new IllegalArgumentException(F0.h.e("Expected positive parallelism level, but got ", l2).toString());
        }
        if (l2 < k.f981d) {
            if (l2 < 1) {
                throw new IllegalArgumentException(F0.h.e("Expected positive parallelism level, but got ", l2).toString());
            }
            lVar = new R0.j(lVar, l2);
        }
        f970h = lVar;
    }

    @Override // M0.AbstractC0060s
    public final void c(w0.i iVar, Runnable runnable) {
        f970h.c(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(w0.j.f3082e, runnable);
    }

    @Override // M0.AbstractC0060s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
