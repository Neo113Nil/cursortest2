package d;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements androidx.lifecycle.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f3217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f3218e;

    public /* synthetic */ d(c0 c0Var, k kVar) {
        this.f3217d = c0Var;
        this.f3218e = kVar;
    }

    @Override // androidx.lifecycle.s
    public final void d(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (oVar == androidx.lifecycle.o.ON_CREATE) {
            onBackInvokedDispatcher = this.f3218e.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            this.f3217d.b(onBackInvokedDispatcher);
        }
    }
}
