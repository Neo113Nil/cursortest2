package u0;

import I.C0187z0;
import android.view.View;

/* loaded from: classes.dex */
public final class Z0 implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f9296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0187z0 f9297e;

    public Z0(View view, C0187z0 c0187z0) {
        this.f9296d = view;
        this.f9297e = c0187z0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f9296d.removeOnAttachStateChangeListener(this);
        this.f9297e.s();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
