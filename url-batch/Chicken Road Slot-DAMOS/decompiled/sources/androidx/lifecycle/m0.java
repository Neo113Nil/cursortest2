package androidx.lifecycle;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m0 implements s, AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public final String f699d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f700e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f701i;

    public m0(String str, l0 l0Var) {
        this.f699d = str;
        this.f700e = l0Var;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, o oVar) {
        if (oVar == o.ON_DESTROY) {
            this.f701i = false;
            uVar.g().f(this);
        }
    }

    public final void j(w wVar, c6.l lVar) {
        lVar.getClass();
        wVar.getClass();
        if (this.f701i) {
            kotlin.collections.i0.l("Already attached to lifecycleOwner");
            return;
        }
        this.f701i = true;
        wVar.a(this);
        lVar.i(this.f699d, (d.f) this.f700e.f698b.f2802s);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
