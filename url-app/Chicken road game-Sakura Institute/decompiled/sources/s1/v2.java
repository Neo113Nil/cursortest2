package s1;

import android.view.View;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v2 implements View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f8452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0.t1 f8453g;

    public v2(View view, g0.t1 t1Var) {
        this.f8452f = view;
        this.f8453g = t1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8452f.removeOnAttachStateChangeListener(this);
        this.f8453g.s();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
