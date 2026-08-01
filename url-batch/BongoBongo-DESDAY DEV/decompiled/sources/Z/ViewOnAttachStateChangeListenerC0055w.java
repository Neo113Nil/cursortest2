package Z;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: Z.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0055w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1218b;

    public ViewOnAttachStateChangeListenerC0055w(x xVar, O o2) {
        this.f1218b = xVar;
        this.f1217a = o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O o2 = this.f1217a;
        o2.k();
        C0042i.f((ViewGroup) o2.f1064c.f1166E.getParent(), this.f1218b.f1219a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
