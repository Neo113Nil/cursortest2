package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.fpj;
import defpackage.fpp;
import defpackage.hrz;
import defpackage.kee;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final hrz g = new hrz(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean J(View view) {
        return view instanceof fpj;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.tw
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        hrz hrzVar = this.g;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                fpp.a().f((kee) hrzVar.a);
            }
        } else if (coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            fpp.a().e((kee) hrzVar.a);
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }
}
