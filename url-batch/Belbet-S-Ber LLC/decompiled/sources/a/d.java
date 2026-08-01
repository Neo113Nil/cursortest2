package a;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements androidx.lifecycle.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f10a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f11b;

    public /* synthetic */ d(j0 j0Var, m mVar) {
        this.f10a = j0Var;
        this.f11b = mVar;
    }

    @Override // androidx.lifecycle.p
    public final void a(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (lVar == androidx.lifecycle.l.ON_CREATE) {
            onBackInvokedDispatcher = this.f11b.getOnBackInvokedDispatcher();
            i3.d.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            this.f10a.b(onBackInvokedDispatcher);
        }
    }
}
