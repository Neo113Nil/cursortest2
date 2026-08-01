package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.a0;
import defpackage.g0;
import defpackage.m0;
import defpackage.r3;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class b extends a0 {
    public final /* synthetic */ AppBarLayout d;
    public final /* synthetic */ CoordinatorLayout e;
    public final /* synthetic */ AppBarLayout.BaseBehavior f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f = baseBehavior;
        this.d = appBarLayout;
        this.e = coordinatorLayout;
    }

    @Override // defpackage.a0
    public final void d(View view, m0 m0Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, m0Var.a);
        m0Var.g(ScrollView.class.getName());
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
            if (((r3) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                if (baseBehavior.y() != (-appBarLayout.getTotalScrollRange())) {
                    m0Var.b(g0.f);
                    m0Var.h(true);
                }
                if (baseBehavior.y() != 0) {
                    if (!B.canScrollVertically(-1)) {
                        m0Var.b(g0.g);
                        m0Var.h(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            m0Var.b(g0.g);
                            m0Var.h(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.a0
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
