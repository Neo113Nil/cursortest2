package x1;

import android.view.View;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a2 implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f8354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.y1 f8355e;

    public a2(View view, m0.y1 y1Var) {
        this.f8354d = view;
        this.f8355e = y1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8354d.removeOnAttachStateChangeListener(this);
        this.f8355e.v();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
