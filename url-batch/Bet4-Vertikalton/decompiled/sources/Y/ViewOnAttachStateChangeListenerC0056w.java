package Y;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: Y.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0056w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1137b;

    public ViewOnAttachStateChangeListenerC0056w(x xVar, O o2) {
        this.f1137b = xVar;
        this.f1136a = o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O o2 = this.f1136a;
        o2.k();
        C0043i.f((ViewGroup) o2.f990c.f1087E.getParent(), this.f1137b.f1138a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
