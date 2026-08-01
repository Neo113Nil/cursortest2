package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xn implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View f;
    public final /* synthetic */ int g;
    public final /* synthetic */ yn h;
    public final /* synthetic */ ExpandableBehavior i;

    public xn(ExpandableBehavior expandableBehavior, View view, int i, yn ynVar) {
        this.i = expandableBehavior;
        this.f = view;
        this.g = i;
        this.h = ynVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.i;
        if (expandableBehavior.a == this.g) {
            Object obj = this.h;
            expandableBehavior.w((View) obj, view, ((FloatingActionButton) obj).t.a, false);
        }
        return false;
    }
}
