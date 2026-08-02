package com.google.android.libraries.material.speeddial.expandable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.material.speeddial.FloatingSpeedDialView;
import defpackage.dih;
import defpackage.dmk;
import defpackage.doa;
import defpackage.tw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExpandableScrimBehavior extends tw {
    public boolean a;

    public ExpandableScrimBehavior() {
    }

    private final void J(View view, ExpandableFloatingActionButton expandableFloatingActionButton) {
        boolean z = this.a;
        boolean z2 = expandableFloatingActionButton.b;
        if (z != z2) {
            this.a = z2;
            if (z2) {
                view.setAlpha(0.0f);
                view.setVisibility(0);
            }
            view.animate().alpha(true == this.a ? 1.0f : 0.0f).setDuration(200L).setInterpolator(dmk.c).setListener(new doa(this, view));
        }
    }

    private static boolean K(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // defpackage.tw
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 || !this.a) {
            return false;
        }
        ExpandableFloatingActionButton o = dih.o(coordinatorLayout, view);
        FloatingSpeedDialView floatingSpeedDialView = (FloatingSpeedDialView) dih.p(coordinatorLayout, view, FloatingSpeedDialView.class);
        return (o == null || K(coordinatorLayout, o, motionEvent) || floatingSpeedDialView == null || K(coordinatorLayout, floatingSpeedDialView, motionEvent)) ? false : true;
    }

    @Override // defpackage.tw
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        ExpandableFloatingActionButton o = dih.o(coordinatorLayout, view);
        if (o != null) {
            J(view, o);
        }
        coordinatorLayout.j(view, i);
        return true;
    }

    @Override // defpackage.tw
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ExpandableFloatingActionButton o;
        if (motionEvent.getActionMasked() == 1 && this.a && (o = dih.o(coordinatorLayout, view)) != null) {
            o.d(false);
        }
        return true;
    }

    @Override // defpackage.tw
    public final boolean o() {
        return this.a;
    }

    @Override // defpackage.tw
    public final boolean p(View view, View view2) {
        return (view2 instanceof ExpandableFloatingActionButton) || (view2 instanceof FloatingSpeedDialView);
    }

    @Override // defpackage.tw
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view2 instanceof ExpandableFloatingActionButton) {
            J(view, (ExpandableFloatingActionButton) view2);
        }
    }

    public ExpandableScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
