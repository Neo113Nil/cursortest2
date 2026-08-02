package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ffu implements aas {
    final /* synthetic */ SwipeDismissBehavior a;

    public ffu(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r0 == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    @Override // defpackage.aas
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(View view) {
        int width;
        kee keeVar;
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        boolean z = false;
        if (!swipeDismissBehavior.J(view)) {
            return false;
        }
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.c;
        if (i != 0) {
            z = z2;
        }
        if (i != 1 || z) {
            width = view.getWidth();
            int i2 = yq.a;
            view.offsetLeftAndRight(width);
            view.setAlpha(0.0f);
            keeVar = swipeDismissBehavior.f;
            if (keeVar != null) {
                keeVar.h(view);
            }
            return true;
        }
        width = -view.getWidth();
        int i22 = yq.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        keeVar = swipeDismissBehavior.f;
        if (keeVar != null) {
        }
        return true;
    }
}
