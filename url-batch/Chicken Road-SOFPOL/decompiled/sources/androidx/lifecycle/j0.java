package androidx.lifecycle;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j0 implements s, AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public final String f833d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f834e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f835f;

    public j0(String str, i0 i0Var) {
        this.f833d = str;
        this.f834e = i0Var;
    }

    @Override // androidx.lifecycle.s
    public final void b(u uVar, o oVar) {
        if (oVar == o.ON_DESTROY) {
            this.f835f = false;
            uVar.g().f(this);
        }
    }

    public final void e(w wVar, x4.e eVar) {
        q6.i.e(eVar, "registry");
        q6.i.e(wVar, "lifecycle");
        if (this.f835f) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f835f = true;
        wVar.a(this);
        eVar.f(this.f833d, (b.g) this.f834e.f832b.f2978a);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
