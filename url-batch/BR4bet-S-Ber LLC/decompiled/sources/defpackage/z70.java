package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class z70 implements Runnable {
    public final View f;
    public final boolean g;
    public final /* synthetic */ SwipeDismissBehavior h;

    public z70(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.h = swipeDismissBehavior;
        this.f = view;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z7 z7Var;
        SwipeDismissBehavior swipeDismissBehavior = this.h;
        kc0 kc0Var = swipeDismissBehavior.a;
        View view = this.f;
        if (kc0Var != null && kc0Var.f()) {
            view.postOnAnimation(this);
        } else {
            if (!this.g || (z7Var = swipeDismissBehavior.b) == null) {
                return;
            }
            z7Var.a(view);
        }
    }
}
