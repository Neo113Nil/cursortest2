package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fez extends wv {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ CoordinatorLayout b;
    final /* synthetic */ AppBarLayout.BaseBehavior d;

    public fez(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
        this.a = appBarLayout;
        this.b = coordinatorLayout;
        this.d = baseBehavior;
    }

    @Override // defpackage.wv
    public final void c(View view, aah aahVar) {
        super.c(view, aahVar);
        aahVar.o(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.a;
        if (appBarLayout.f() == 0) {
            return;
        }
        AppBarLayout.BaseBehavior baseBehavior = this.d;
        View R = AppBarLayout.BaseBehavior.R(this.b);
        if (R != null) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((ffb) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                    if (baseBehavior.L() != (-appBarLayout.f())) {
                        aahVar.h(aag.d);
                        aahVar.J();
                    }
                    if (baseBehavior.L() != 0) {
                        if (!R.canScrollVertically(-1)) {
                            aahVar.h(aag.e);
                            aahVar.J();
                            return;
                        } else {
                            if ((-appBarLayout.b()) != 0) {
                                aahVar.h(aag.e);
                                aahVar.J();
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.wv
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 4096) {
            this.a.i(false);
            return true;
        }
        if (i != 8192) {
            return super.i(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.d;
        if (baseBehavior.L() != 0) {
            CoordinatorLayout coordinatorLayout = this.b;
            View R = AppBarLayout.BaseBehavior.R(coordinatorLayout);
            boolean canScrollVertically = R.canScrollVertically(-1);
            AppBarLayout appBarLayout = this.a;
            if (!canScrollVertically) {
                appBarLayout.i(true);
                return true;
            }
            int i2 = -appBarLayout.b();
            if (i2 != 0) {
                baseBehavior.S(coordinatorLayout, appBarLayout, R, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
