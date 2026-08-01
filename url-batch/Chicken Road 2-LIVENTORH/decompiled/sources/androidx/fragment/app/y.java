package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class y implements View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f576f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f577g;

    public y(z zVar, q0 q0Var) {
        this.f577g = zVar;
        this.f576f = q0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        q0 q0Var = this.f576f;
        u uVar = q0Var.f511c;
        q0Var.k();
        l.f((ViewGroup) uVar.J.getParent(), this.f577g.f578f.C()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
