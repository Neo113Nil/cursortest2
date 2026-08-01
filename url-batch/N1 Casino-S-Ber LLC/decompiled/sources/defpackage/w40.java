package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class w40 implements Runnable {
    public final View f;
    public final boolean g;
    public final /* synthetic */ SwipeDismissBehavior h;

    public w40(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.h = swipeDismissBehavior;
        this.f = view;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n7 n7Var;
        SwipeDismissBehavior swipeDismissBehavior = this.h;
        z80 z80Var = swipeDismissBehavior.a;
        View view = this.f;
        if (z80Var != null && z80Var.f()) {
            view.postOnAnimation(this);
        } else {
            if (!this.g || (n7Var = swipeDismissBehavior.b) == null) {
                return;
            }
            n7Var.a(view);
        }
    }
}
