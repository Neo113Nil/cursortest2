package defpackage;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class cl extends u7 {
    public final /* synthetic */ ExtendedFloatingActionButton g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(ExtendedFloatingActionButton extendedFloatingActionButton, rc0 rc0Var) {
        super(extendedFloatingActionButton, rc0Var);
        this.g = extendedFloatingActionButton;
    }

    @Override // defpackage.u7
    public final int c() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // defpackage.u7
    public final void e() {
        this.d.g = null;
        this.g.V = 0;
    }

    @Override // defpackage.u7
    public final void f(Animator animator) {
        rc0 rc0Var = this.d;
        Animator animator2 = (Animator) rc0Var.g;
        if (animator2 != null) {
            animator2.cancel();
        }
        rc0Var.g = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.V = 2;
    }

    @Override // defpackage.u7
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // defpackage.u7
    public final boolean h() {
        t7 t7Var = ExtendedFloatingActionButton.o0;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.V;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }
}
