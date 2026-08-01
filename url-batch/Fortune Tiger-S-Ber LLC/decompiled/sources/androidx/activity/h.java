package androidx.activity;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements androidx.lifecycle.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.i f106b;

    public /* synthetic */ h(h0 h0Var, f.i iVar) {
        this.f105a = h0Var;
        this.f106b = iVar;
    }

    @Override // androidx.lifecycle.p
    public final void a(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        if (lVar == androidx.lifecycle.l.ON_CREATE) {
            OnBackInvokedDispatcher a4 = i.a(this.f106b);
            h0 h0Var = this.f105a;
            h0Var.f110e = a4;
            h0Var.d(h0Var.g);
        }
    }
}
