package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ua implements Runnable {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public ua(o0 o0Var, va vaVar, u10 u10Var, r10 r10Var) {
        this.j = o0Var;
        this.g = vaVar;
        this.h = u10Var;
        this.i = r10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Object obj = this.j;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                wa waVar = (wa) ((o0) obj).g;
                u10 u10Var = (u10) obj3;
                va vaVar = (va) obj4;
                if (vaVar != null) {
                    waVar.F = true;
                    vaVar.b.c(false);
                    waVar.F = false;
                }
                if (u10Var.isEnabled() && u10Var.hasSubMenu()) {
                    ((r10) obj2).q(u10Var, null, 4);
                    break;
                }
                break;
            default:
                fo0.i((View) obj4, (jo0) obj3, (tl0) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public ua(View view, jo0 jo0Var, tl0 tl0Var, ValueAnimator valueAnimator) {
        this.g = view;
        this.h = jo0Var;
        this.i = tl0Var;
        this.j = valueAnimator;
    }
}
