package ne;

import ge.v0;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends v0 {

    /* renamed from: r, reason: collision with root package name */
    public static final e f7277r;

    /* renamed from: i, reason: collision with root package name */
    public c f7278i;

    static {
        int i3 = j.f7285c;
        int i10 = j.f7286d;
        long j = j.f7287e;
        String str = j.f7283a;
        e eVar = new e();
        eVar.f7278i = new c(str, i3, i10, j);
        f7277r = eVar;
    }

    @Override // ge.t
    public final void L(CoroutineContext coroutineContext, Runnable runnable) {
        c.h(this.f7278i, runnable, 6);
    }

    @Override // ge.t
    public final void M(CoroutineContext coroutineContext, Runnable runnable) {
        c.h(this.f7278i, runnable, 2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // ge.t
    public final String toString() {
        return "Dispatchers.Default";
    }
}
