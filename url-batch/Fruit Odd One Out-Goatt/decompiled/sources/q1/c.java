package q1;

import java.util.concurrent.Executor;
import k1.d0;
import k1.p;
import p1.w;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c extends d0 implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final c f1109d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final p f1110e;

    static {
        p pVar = j.f1125d;
        int i2 = w.f1077a;
        if (64 >= i2) {
            i2 = 64;
        }
        int i3 = p1.a.i("kotlinx.coroutines.io.parallelism", i2, 12);
        pVar.getClass();
        if (i3 < 1) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i3).toString());
        }
        if (i3 < i.f1120d) {
            if (i3 < 1) {
                throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i3).toString());
            }
            pVar = new p1.j(pVar, i3);
        }
        f1110e = pVar;
    }

    @Override // k1.p
    public final void b(v0.h hVar, Runnable runnable) {
        f1110e.b(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(v0.i.f1196b, runnable);
    }

    @Override // k1.p
    public final String toString() {
        return "Dispatchers.IO";
    }
}
