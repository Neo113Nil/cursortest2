package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class al extends u7 {
    public final dl g;
    public final boolean h;
    public final /* synthetic */ ExtendedFloatingActionButton i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(ExtendedFloatingActionButton extendedFloatingActionButton, rc0 rc0Var, dl dlVar, boolean z) {
        super(extendedFloatingActionButton, rc0Var);
        this.i = extendedFloatingActionButton;
        this.g = dlVar;
        this.h = z;
    }

    @Override // defpackage.u7
    public final AnimatorSet a() {
        nx nxVar = this.f;
        if (nxVar == null) {
            if (this.e == null) {
                this.e = nx.b(this.a, c());
            }
            nxVar = this.e;
            nxVar.getClass();
        }
        boolean f = nxVar.f("width");
        dl dlVar = this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        if (f) {
            PropertyValuesHolder[] e = nxVar.e("width");
            e[0].setFloatValues(extendedFloatingActionButton.getWidth(), dlVar.e());
            nxVar.g("width", e);
        }
        if (nxVar.f("height")) {
            PropertyValuesHolder[] e2 = nxVar.e("height");
            e2[0].setFloatValues(extendedFloatingActionButton.getHeight(), dlVar.b());
            nxVar.g("height", e2);
        }
        if (nxVar.f("paddingStart")) {
            PropertyValuesHolder[] e3 = nxVar.e("paddingStart");
            e3[0].setFloatValues(extendedFloatingActionButton.getPaddingStart(), dlVar.d());
            nxVar.g("paddingStart", e3);
        }
        if (nxVar.f("paddingEnd")) {
            PropertyValuesHolder[] e4 = nxVar.e("paddingEnd");
            e4[0].setFloatValues(extendedFloatingActionButton.getPaddingEnd(), dlVar.c());
            nxVar.g("paddingEnd", e4);
        }
        if (nxVar.f("labelOpacity")) {
            PropertyValuesHolder[] e5 = nxVar.e("labelOpacity");
            int alpha = Color.alpha(extendedFloatingActionButton.getCurrentOriginalTextColor());
            e5[0].setFloatValues(alpha != 0 ? Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / alpha : 0.0f, this.h ? 1.0f : 0.0f);
            nxVar.g("labelOpacity", e5);
        }
        return b(nxVar);
    }

    @Override // defpackage.u7
    public final int c() {
        return this.h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.u7
    public final void e() {
        this.d.g = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.j0 = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        dl dlVar = this.g;
        layoutParams.width = dlVar.g().width;
        layoutParams.height = dlVar.g().height;
    }

    @Override // defpackage.u7
    public final void f(Animator animator) {
        rc0 rc0Var = this.d;
        Animator animator2 = (Animator) rc0Var.g;
        if (animator2 != null) {
            animator2.cancel();
        }
        rc0Var.g = animator;
        boolean z = this.h;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.i0 = z;
        extendedFloatingActionButton.j0 = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
        extendedFloatingActionButton.A();
    }

    @Override // defpackage.u7
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        boolean z = this.h;
        extendedFloatingActionButton.i0 = z;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z) {
            extendedFloatingActionButton.m0 = layoutParams.width;
            extendedFloatingActionButton.n0 = layoutParams.height;
        }
        dl dlVar = this.g;
        layoutParams.width = dlVar.g().width;
        layoutParams.height = dlVar.g().height;
        if (z) {
            extendedFloatingActionButton.z(extendedFloatingActionButton.l0);
        } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
            extendedFloatingActionButton.z(ColorStateList.valueOf(0));
        }
        extendedFloatingActionButton.setPaddingRelative(dlVar.d(), extendedFloatingActionButton.getPaddingTop(), dlVar.c(), extendedFloatingActionButton.getPaddingBottom());
        extendedFloatingActionButton.requestLayout();
        extendedFloatingActionButton.A();
    }

    @Override // defpackage.u7
    public final boolean h() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        return this.h == extendedFloatingActionButton.i0 || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }
}
