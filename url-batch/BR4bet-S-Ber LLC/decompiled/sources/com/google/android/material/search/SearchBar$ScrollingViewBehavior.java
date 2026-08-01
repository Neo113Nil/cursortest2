package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    public boolean g;

    public SearchBar$ScrollingViewBehavior() {
        this.g = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.oe
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.h(coordinatorLayout, view, view2);
        if (!this.g && (view2 instanceof AppBarLayout)) {
            this.g = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setTouchscreenBlocksFocus(false);
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }
        return false;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = false;
    }
}
