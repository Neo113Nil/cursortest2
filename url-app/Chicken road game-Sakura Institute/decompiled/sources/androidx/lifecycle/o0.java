package androidx.lifecycle;

import java.io.Closeable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o0 implements t, Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final String f1013f;

    /* renamed from: g, reason: collision with root package name */
    public final n0 f1014g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1015h;

    public o0(String str, n0 n0Var) {
        this.f1013f = str;
        this.f1014g = n0Var;
    }

    @Override // androidx.lifecycle.t
    public final void c(v vVar, n nVar) {
        if (nVar == n.ON_DESTROY) {
            this.f1015h = false;
            vVar.f().f(this);
        }
    }

    public final void k(x xVar, x3.e eVar) {
        r6.k.f(eVar, "registry");
        r6.k.f(xVar, "lifecycle");
        if (this.f1015h) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1015h = true;
        xVar.a(this);
        eVar.c(this.f1013f, this.f1014g.f1006e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
