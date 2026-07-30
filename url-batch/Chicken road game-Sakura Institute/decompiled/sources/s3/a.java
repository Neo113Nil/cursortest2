package s3;

import c7.u;
import c7.x;
import c7.x0;
import h6.i;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements AutoCloseable, x {

    /* renamed from: f, reason: collision with root package name */
    public final i f8521f;

    public a(i iVar) {
        k.f(iVar, "coroutineContext");
        this.f8521f = iVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        x0 x0Var = (x0) this.f8521f.u(u.f1748g);
        if (x0Var != null) {
            x0Var.c(null);
        }
    }

    @Override // c7.x
    public final i k() {
        return this.f8521f;
    }
}
