package com.google.android.libraries.material.speeddial.expandable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.material.speeddial.FloatingSpeedDialView;
import defpackage.dih;
import defpackage.dnn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExpandableFloatingSpeedDialBehavior extends FloatingSpeedDialView.Behavior {
    private boolean a;

    public ExpandableFloatingSpeedDialBehavior() {
    }

    private final void K(FloatingSpeedDialView floatingSpeedDialView, ExpandableFloatingActionButton expandableFloatingActionButton) {
        boolean z = this.a;
        boolean z2 = expandableFloatingActionButton.b;
        if (z != z2) {
            this.a = z2;
            if (floatingSpeedDialView.c != z2) {
                floatingSpeedDialView.c = z2;
                if (z2) {
                    floatingSpeedDialView.setVisibility(0);
                } else {
                    floatingSpeedDialView.invalidate();
                }
                ViewTreeObserver viewTreeObserver = floatingSpeedDialView.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new dnn(floatingSpeedDialView, viewTreeObserver, z2));
            }
        }
    }

    @Override // com.google.android.libraries.material.speeddial.FloatingSpeedDialView.Behavior
    public final void J(CoordinatorLayout coordinatorLayout, FloatingSpeedDialView floatingSpeedDialView, int i) {
        ExpandableFloatingActionButton o = dih.o(coordinatorLayout, floatingSpeedDialView);
        if (o != null) {
            K(floatingSpeedDialView, o);
        }
        super.J(coordinatorLayout, floatingSpeedDialView, i);
    }

    @Override // com.google.android.libraries.material.speeddial.FloatingSpeedDialView.Behavior, defpackage.tw
    public final /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        J(coordinatorLayout, (FloatingSpeedDialView) view, i);
        return true;
    }

    @Override // defpackage.tw
    public final /* synthetic */ boolean p(View view, View view2) {
        return view2 instanceof ExpandableFloatingActionButton;
    }

    @Override // defpackage.tw
    public final /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2) {
        FloatingSpeedDialView floatingSpeedDialView = (FloatingSpeedDialView) view;
        if (view2 instanceof ExpandableFloatingActionButton) {
            K(floatingSpeedDialView, (ExpandableFloatingActionButton) view2);
        }
    }

    public ExpandableFloatingSpeedDialBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
