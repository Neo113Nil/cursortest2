package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ffv implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public ffv(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kee keeVar;
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        abs absVar = swipeDismissBehavior.a;
        if (absVar != null && absVar.l()) {
            this.b.postOnAnimation(this);
        } else {
            if (!this.c || (keeVar = swipeDismissBehavior.f) == null) {
                return;
            }
            keeVar.h(this.b);
        }
    }
}
