package j7;

import c7.r0;
import c7.t;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends r0 implements Executor {

    /* renamed from: h, reason: collision with root package name */
    public static final d f5151h = new d();

    /* renamed from: i, reason: collision with root package name */
    public static final t f5152i;

    static {
        l lVar = l.f5165h;
        int i7 = h7.t.f4708a;
        if (64 >= i7) {
            i7 = 64;
        }
        f5152i = lVar.Y(h7.a.j(i7, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // c7.t
    public final void V(h6.i iVar, Runnable runnable) {
        f5152i.V(iVar, runnable);
    }

    @Override // c7.t
    public final void W(h6.i iVar, Runnable runnable) {
        f5152i.W(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        V(h6.j.f4661f, runnable);
    }

    @Override // c7.t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
