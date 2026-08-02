package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.fhz;
import defpackage.fig;
import defpackage.fiq;
import defpackage.tw;
import defpackage.tz;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends tw {
    private Rect a;
    private final boolean b;
    private final boolean c;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fig.a);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.c = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    private static boolean J(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof tz) {
            return ((tz) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final boolean K(View view, fhz fhzVar) {
        return (this.b || this.c) && ((tz) fhzVar.getLayoutParams()).f == view.getId();
    }

    private final void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, fhz fhzVar) {
        if (K(appBarLayout, fhzVar)) {
            Rect rect = this.a;
            if (rect == null) {
                rect = new Rect();
                this.a = rect;
            }
            fiq.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                int i = fhz.k;
                throw null;
            }
            int i2 = fhz.k;
            throw null;
        }
    }

    private final void M(View view, fhz fhzVar) {
        if (K(view, fhzVar)) {
            if (view.getTop() >= (fhzVar.getHeight() / 2) + ((tz) fhzVar.getLayoutParams()).topMargin) {
                throw null;
            }
            throw null;
        }
    }

    @Override // defpackage.tw
    public final void h(tz tzVar) {
        if (tzVar.h == 0) {
            tzVar.h = 80;
        }
    }

    @Override // defpackage.tw
    public final /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        fhz fhzVar = (fhz) view;
        List a = coordinatorLayout.a(fhzVar);
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) a.get(i2);
            if (view2 instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view2, fhzVar);
            } else if (J(view2)) {
                M(view2, fhzVar);
            }
        }
        coordinatorLayout.j(fhzVar, i);
        return true;
    }

    @Override // defpackage.tw
    public final /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2) {
        fhz fhzVar = (fhz) view;
        if (view2 instanceof AppBarLayout) {
            L(coordinatorLayout, (AppBarLayout) view2, fhzVar);
        } else if (J(view2)) {
            M(view2, fhzVar);
        }
    }

    @Override // defpackage.tw
    public final /* bridge */ /* synthetic */ boolean z(View view, Rect rect) {
        return false;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }
}
