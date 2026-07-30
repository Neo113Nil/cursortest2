package defpackage;

import android.view.View;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rp1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View d;
    public final /* synthetic */ o11 e;

    public rp1(View view, o11 o11Var) {
        this.d = view;
        this.e = o11Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.d.removeOnAttachStateChangeListener(this);
        this.e.x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
