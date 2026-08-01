package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ba implements Runnable {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public ba(rc0 rc0Var, ca caVar, qw qwVar, mw mwVar) {
        this.j = rc0Var;
        this.g = caVar;
        this.h = qwVar;
        this.i = mwVar;
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
                da daVar = (da) ((rc0) obj).g;
                qw qwVar = (qw) obj3;
                ca caVar = (ca) obj4;
                if (caVar != null) {
                    daVar.F = true;
                    caVar.b.c(false);
                    daVar.F = false;
                }
                if (qwVar.isEnabled() && qwVar.hasSubMenu()) {
                    ((mw) obj2).q(qwVar, null, 4);
                    break;
                }
                break;
            default:
                ae0.i((View) obj4, (ee0) obj3, (a5) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public ba(View view, ee0 ee0Var, a5 a5Var, ValueAnimator valueAnimator) {
        this.g = view;
        this.h = ee0Var;
        this.i = a5Var;
        this.j = valueAnimator;
    }
}
