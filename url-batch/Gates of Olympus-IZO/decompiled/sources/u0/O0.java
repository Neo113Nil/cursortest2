package u0;

import android.view.View;

/* loaded from: classes.dex */
public final class O0 implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f8220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I.A0 f8221e;

    public O0(View view, I.A0 a02) {
        this.f8220d = view;
        this.f8221e = a02;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8220d.removeOnAttachStateChangeListener(this);
        this.f8221e.s();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
