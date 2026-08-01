package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class y implements View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f555f;
    public final /* synthetic */ z g;

    public y(z zVar, q0 q0Var) {
        this.g = zVar;
        this.f555f = q0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        q0 q0Var = this.f555f;
        u uVar = q0Var.c;
        q0Var.k();
        l.f((ViewGroup) uVar.J.getParent(), this.g.f556f.E()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
