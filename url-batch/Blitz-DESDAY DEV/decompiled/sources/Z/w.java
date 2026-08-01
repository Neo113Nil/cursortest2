package Z;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1227b;

    public w(x xVar, O o2) {
        this.f1227b = xVar;
        this.f1226a = o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O o2 = this.f1226a;
        o2.k();
        C0039i.f((ViewGroup) o2.f1079c.f1176E.getParent(), this.f1227b.f1228a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
