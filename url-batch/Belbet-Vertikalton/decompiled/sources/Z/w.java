package Z;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class w implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1646b;

    public w(x xVar, O o2) {
        this.f1646b = xVar;
        this.f1645a = o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        O o2 = this.f1645a;
        o2.k();
        C0045i.f((ViewGroup) o2.f1494c.f1595E.getParent(), this.f1646b.f1647a.D()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
