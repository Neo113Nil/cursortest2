package Y;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1497b;

    public w(x xVar, O o2) {
        this.f1497b = xVar;
        this.f1496a = o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O o2 = this.f1496a;
        o2.k();
        C0042i.f((ViewGroup) o2.f1349c.f1446E.getParent(), this.f1497b.f1498a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
