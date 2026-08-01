package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class qi implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View f;
    public final /* synthetic */ int g;
    public final /* synthetic */ ri h;
    public final /* synthetic */ ExpandableBehavior i;

    public qi(ExpandableBehavior expandableBehavior, View view, int i, ri riVar) {
        this.i = expandableBehavior;
        this.f = view;
        this.g = i;
        this.h = riVar;
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
