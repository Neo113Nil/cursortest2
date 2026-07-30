package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class no1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ FrameLayout e;
    public final /* synthetic */ x80 g;
    public final /* synthetic */ ao0 h;
    public final /* synthetic */ ao0 i;

    public no1(FrameLayout frameLayout, FrameLayout frameLayout2, x80 x80Var, ao0 ao0Var, ao0 ao0Var2) {
        this.d = frameLayout;
        this.e = frameLayout2;
        this.g = x80Var;
        this.h = ao0Var;
        this.i = ao0Var2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        this.d.removeOnAttachStateChangeListener(this);
        int i = ln1.a;
        FrameLayout frameLayout = this.e;
        fn1.a(frameLayout);
        frameLayout.post(new io1(frameLayout, this.g, this.h, this.i));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
