package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0052w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1091b;

    public ViewOnAttachStateChangeListenerC0052w(x xVar, O o2) {
        this.f1091b = xVar;
        this.f1090a = o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O o2 = this.f1090a;
        o2.k();
        C0039i.f((ViewGroup) o2.f944c.f1041E.getParent(), this.f1091b.f1092a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
