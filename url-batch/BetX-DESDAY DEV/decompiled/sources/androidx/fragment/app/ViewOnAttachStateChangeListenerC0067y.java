package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0067y implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S f1433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f1434b;

    public ViewOnAttachStateChangeListenerC0067y(z zVar, S s2) {
        this.f1434b = zVar;
        this.f1433a = s2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        S s2 = this.f1433a;
        s2.k();
        C0052i.f((ViewGroup) s2.f1275c.f1382E.getParent(), this.f1434b.f1435a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
