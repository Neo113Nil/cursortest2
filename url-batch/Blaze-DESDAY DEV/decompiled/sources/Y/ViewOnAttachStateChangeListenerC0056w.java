package Y;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: Y.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0056w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1165b;

    public ViewOnAttachStateChangeListenerC0056w(x xVar, O o2) {
        this.f1165b = xVar;
        this.f1164a = o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O o2 = this.f1164a;
        o2.k();
        C0043i.f((ViewGroup) o2.f1017c.f1114E.getParent(), this.f1165b.f1166a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
