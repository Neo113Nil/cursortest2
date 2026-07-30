package b;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.lifecycle.t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f1155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f1156g;

    public /* synthetic */ g(i0 i0Var, o oVar) {
        this.f1155f = i0Var;
        this.f1156g = oVar;
    }

    @Override // androidx.lifecycle.t
    public final void c(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        if (nVar == androidx.lifecycle.n.ON_CREATE) {
            OnBackInvokedDispatcher a3 = h.f1159a.a(this.f1156g);
            r6.k.f(a3, "invoker");
            i0 i0Var = this.f1155f;
            i0Var.f1165e = a3;
            i0Var.d(i0Var.f1167g);
        }
    }
}
