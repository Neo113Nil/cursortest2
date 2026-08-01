package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.vg;
import defpackage.x7;
import defpackage.y1;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final vg h;

    public BaseTransientBottomBar$Behavior() {
        vg vgVar = new vg(12);
        this.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.h = vgVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean a(View view) {
        this.h.getClass();
        return view instanceof x7;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.rd
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (y1.b == null) {
                    y1.b = new y1();
                }
                synchronized (y1.b.a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (y1.b == null) {
                y1.b = new y1();
            }
            synchronized (y1.b.a) {
            }
        }
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }
}
