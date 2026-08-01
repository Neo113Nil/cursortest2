package d2;

import android.view.View;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j2 implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f3448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.z1 f3449e;

    public j2(View view, n0.z1 z1Var) {
        this.f3448d = view;
        this.f3449e = z1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3448d.removeOnAttachStateChangeListener(this);
        this.f3449e.u();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
