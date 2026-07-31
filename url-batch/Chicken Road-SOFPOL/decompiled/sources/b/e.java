package b;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f969e;

    public /* synthetic */ e(t tVar, l lVar) {
        this.f968d = tVar;
        this.f969e = lVar;
    }

    @Override // androidx.lifecycle.s
    public final void b(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (oVar == androidx.lifecycle.o.ON_CREATE) {
            onBackInvokedDispatcher = this.f969e.getOnBackInvokedDispatcher();
            q6.i.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            this.f968d.a(onBackInvokedDispatcher);
        }
    }
}
