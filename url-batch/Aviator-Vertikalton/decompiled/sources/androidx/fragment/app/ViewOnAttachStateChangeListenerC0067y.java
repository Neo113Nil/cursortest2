package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0067y implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S f1432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f1433b;

    public ViewOnAttachStateChangeListenerC0067y(z zVar, S s2) {
        this.f1433b = zVar;
        this.f1432a = s2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        S s2 = this.f1432a;
        s2.k();
        C0052i.f((ViewGroup) s2.f1274c.f1381E.getParent(), this.f1433b.f1434a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
