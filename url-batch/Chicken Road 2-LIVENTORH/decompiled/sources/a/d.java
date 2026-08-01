package a;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements androidx.lifecycle.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f11f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f12g;

    public /* synthetic */ d(g0 g0Var, m mVar) {
        this.f11f = g0Var;
        this.f12g = mVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (lVar == androidx.lifecycle.l.ON_CREATE) {
            onBackInvokedDispatcher = this.f12g.getOnBackInvokedDispatcher();
            f3.d.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            this.f11f.a(onBackInvokedDispatcher);
        }
    }
}
