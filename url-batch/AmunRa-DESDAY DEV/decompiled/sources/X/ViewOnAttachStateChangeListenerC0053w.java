package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0053w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1045b;

    public ViewOnAttachStateChangeListenerC0053w(x xVar, O o2) {
        this.f1045b = xVar;
        this.f1044a = o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O o2 = this.f1044a;
        o2.k();
        C0040i.f((ViewGroup) o2.f901c.f995E.getParent(), this.f1045b.f1046a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
