package com.google.android.material.snackbar;

import a0.a;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import l2.f;
import n2.c;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final f f1004h;

    public BaseTransientBottomBar$Behavior() {
        f fVar = new f(21);
        this.f816e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f817f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.f1004h = fVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, a0.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f1004h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (a.f79h == null) {
                    a.f79h = new a(22);
                }
                synchronized (a.f79h.f81g) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (a.f79h == null) {
                a.f79h = new a(22);
            }
            synchronized (a.f79h.f81g) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f1004h.getClass();
        return view instanceof c;
    }
}
