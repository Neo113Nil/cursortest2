package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ji implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View f;
    public final /* synthetic */ int g;
    public final /* synthetic */ ki h;
    public final /* synthetic */ ExpandableBehavior i;

    public ji(ExpandableBehavior expandableBehavior, View view, int i, ki kiVar) {
        this.i = expandableBehavior;
        this.f = view;
        this.g = i;
        this.h = kiVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.i;
        if (expandableBehavior.a == this.g) {
            Object obj = this.h;
            expandableBehavior.a((View) obj, view, ((FloatingActionButton) obj).t.a, false);
        }
        return false;
    }
}
