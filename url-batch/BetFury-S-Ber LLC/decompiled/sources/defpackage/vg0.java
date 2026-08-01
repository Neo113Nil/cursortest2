package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class vg0 implements Runnable {
    public final View f;
    public final boolean g;
    public final /* synthetic */ SwipeDismissBehavior h;

    public vg0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.h = swipeDismissBehavior;
        this.f = view;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l8 l8Var;
        SwipeDismissBehavior swipeDismissBehavior = this.h;
        jm0 jm0Var = swipeDismissBehavior.a;
        View view = this.f;
        if (jm0Var != null && jm0Var.f()) {
            view.postOnAnimation(this);
        } else {
            if (!this.g || (l8Var = swipeDismissBehavior.b) == null) {
                return;
            }
            l8Var.a(view);
        }
    }
}
