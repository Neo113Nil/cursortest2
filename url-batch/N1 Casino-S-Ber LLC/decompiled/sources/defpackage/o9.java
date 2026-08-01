package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class o9 implements Runnable {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public o9(k0 k0Var, p9 p9Var, pt ptVar, mt mtVar) {
        this.j = k0Var;
        this.g = p9Var;
        this.h = ptVar;
        this.i = mtVar;
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
                q9 q9Var = (q9) ((k0) obj).g;
                pt ptVar = (pt) obj3;
                p9 p9Var = (p9) obj4;
                if (p9Var != null) {
                    q9Var.F = true;
                    p9Var.b.c(false);
                    q9Var.F = false;
                }
                if (ptVar.isEnabled() && ptVar.hasSubMenu()) {
                    ((mt) obj2).q(ptVar, null, 4);
                    break;
                }
                break;
            default:
                ta0.i((View) obj4, (xa0) obj3, (q4) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public o9(View view, xa0 xa0Var, q4 q4Var, ValueAnimator valueAnimator) {
        this.g = view;
        this.h = xa0Var;
        this.i = q4Var;
        this.j = valueAnimator;
    }
}
