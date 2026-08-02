package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class S implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f4776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f4777b;

    public S(T t4, m0 m0Var) {
        this.f4777b = t4;
        this.f4776a = m0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        m0 m0Var = this.f4776a;
        F f4 = m0Var.f4925c;
        m0Var.k();
        C0211o.j((ViewGroup) f4.mView.getParent(), this.f4777b.f4778a).i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
