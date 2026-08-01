package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1117b;

    public w(x xVar, O o2) {
        this.f1117b = xVar;
        this.f1116a = o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O o2 = this.f1116a;
        o2.k();
        C0040i.f((ViewGroup) o2.f970c.f1067E.getParent(), this.f1117b.f1118a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
