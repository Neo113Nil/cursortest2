package defpackage;

import android.animation.Animator;
import android.view.View;
import com.google.android.libraries.material.productlockup.AnimatableProductLockupView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fni implements fer {
    final /* synthetic */ fnr a;
    final /* synthetic */ gam b;
    private final /* synthetic */ int c;

    public fni(fnr fnrVar, gam gamVar, int i) {
        this.c = i;
        this.b = gamVar;
        this.a = fnrVar;
    }

    @Override // defpackage.fer
    public final void a() {
        int i = this.c;
        fnr fnrVar = this.a;
        if (i != 0) {
            fnrVar.r.c(true);
            fng fngVar = fnrVar.a;
            if (!fngVar.i()) {
                fngVar.d();
            }
            fngVar.j(4, true);
            if (fnrVar.w == this.b) {
                fnrVar.w = null;
                return;
            }
            return;
        }
        fnrVar.r.c(false);
        fnrVar.c.setVisibility(8);
        fng fngVar2 = fnrVar.a;
        if (!fngVar2.i()) {
            fnrVar.j.clearFocus();
        }
        fngVar2.j(2, true);
        if (fnrVar.w == this.b) {
            fnrVar.w = null;
        }
    }

    @Override // defpackage.fer
    public final void b() {
        int i = this.c;
        fnr fnrVar = this.a;
        if (i == 0) {
            fnrVar.r.d(false);
            fnrVar.a.j(1, true);
            return;
        }
        fnrVar.r.d(true);
        fnrVar.c.setVisibility(0);
        fmt fmtVar = fnrVar.p;
        fmy fmyVar = fmtVar.D;
        Animator animator = fmyVar.a;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = fmyVar.b;
        if (animator2 != null) {
            animator2.end();
        }
        View view = fmtVar.E;
        if (view instanceof AnimatableProductLockupView) {
            ((AnimatableProductLockupView) view).a.d();
        }
        if (view != null) {
            view.setAlpha(0.0f);
        }
    }
}
