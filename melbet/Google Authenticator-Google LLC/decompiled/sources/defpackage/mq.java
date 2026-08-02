package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mq extends mv {
    final /* synthetic */ int a;
    final /* synthetic */ lp b;
    final /* synthetic */ mw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq(mw mwVar, lp lpVar, int i, float f, float f2, float f3, float f4, int i2, lp lpVar2) {
        super(lpVar, i, f, f2, f3, f4);
        this.c = mwVar;
        this.a = i2;
        this.b = lpVar2;
    }

    @Override // defpackage.mv, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.n) {
            return;
        }
        int i = this.a;
        if (i <= 0) {
            ms.d(this.b);
        } else {
            mw mwVar = this.c;
            mwVar.a.add(this.b.a);
            this.k = true;
            mwVar.p.post(new mr(mwVar, this, i, 0));
        }
        mw mwVar2 = this.c;
        lp lpVar = this.b;
        View view = mwVar2.u;
        View view2 = lpVar.a;
        if (view == view2) {
            mwVar2.k(view2);
        }
    }
}
