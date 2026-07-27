package s0;

import G.C0236z0;
import android.view.View;

/* loaded from: classes.dex */
public final class a1 implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f10171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0236z0 f10172e;

    public a1(View view, C0236z0 c0236z0) {
        this.f10171d = view;
        this.f10172e = c0236z0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10171d.removeOnAttachStateChangeListener(this);
        this.f10172e.s();
    }
}
