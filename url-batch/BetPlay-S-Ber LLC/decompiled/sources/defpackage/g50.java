package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class g50 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ViewGroup f;
    public final /* synthetic */ e50 g;

    public g50(ViewGroup viewGroup, e50 e50Var) {
        this.f = viewGroup;
        this.g = e50Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f.addView(this.g, 0);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f.addView(this.g, 0);
        view.removeOnAttachStateChangeListener(this);
    }
}
