package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p.b;
import q0.e;
import y5.c;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final b f1957h;

    public BaseTransientBottomBar$Behavior() {
        b bVar = new b(19);
        this.f1837e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f1838f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f1836d = 0;
        this.f1957h = bVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, d3.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f1957h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (e.f5937b == null) {
                    e.f5937b = new e();
                }
                synchronized (e.f5937b.f5938a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (e.f5937b == null) {
                e.f5937b = new e();
            }
            synchronized (e.f5937b.f5938a) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f1957h.getClass();
        return view instanceof c;
    }
}
