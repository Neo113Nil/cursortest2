package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.e0;
import defpackage.j3;
import defpackage.k0;
import defpackage.y;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class b extends y {
    public final /* synthetic */ AppBarLayout d;
    public final /* synthetic */ CoordinatorLayout e;
    public final /* synthetic */ AppBarLayout.BaseBehavior f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f = baseBehavior;
        this.d = appBarLayout;
        this.e = coordinatorLayout;
    }

    @Override // defpackage.y
    public final void d(View view, k0 k0Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, k0Var.a);
        k0Var.g(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.e;
        AppBarLayout.BaseBehavior baseBehavior = this.f;
        View B = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
        if (B == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((j3) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                if (baseBehavior.y() != (-appBarLayout.getTotalScrollRange())) {
                    k0Var.b(e0.f);
                    k0Var.h(true);
                }
                if (baseBehavior.y() != 0) {
                    if (!B.canScrollVertically(-1)) {
                        k0Var.b(e0.g);
                        k0Var.h(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            k0Var.b(e0.g);
                            k0Var.h(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.y
    public final boolean g(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.d;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f;
        if (baseBehavior.y() != 0) {
            CoordinatorLayout coordinatorLayout = this.e;
            View B = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
            if (!B.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i2 = -appBarLayout.getDownNestedPreScrollRange();
            if (i2 != 0) {
                baseBehavior.E(coordinatorLayout, this.d, B, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
