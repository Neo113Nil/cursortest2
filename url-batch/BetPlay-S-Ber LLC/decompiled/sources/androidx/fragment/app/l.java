package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class l implements View.OnAttachStateChangeListener {
    public final /* synthetic */ q f;
    public final /* synthetic */ m g;

    public l(m mVar, q qVar) {
        this.g = mVar;
        this.f = qVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        q qVar = this.f;
        Fragment fragment = qVar.c;
        qVar.j();
        f.h((ViewGroup) fragment.mView.getParent(), this.g.f.E()).g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
