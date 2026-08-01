package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class j9 implements Runnable {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public j9(j1 j1Var, k9 k9Var, eu euVar, au auVar) {
        this.j = j1Var;
        this.g = k9Var;
        this.h = euVar;
        this.i = auVar;
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
                l9 l9Var = (l9) ((j1) obj).g;
                eu euVar = (eu) obj3;
                k9 k9Var = (k9) obj4;
                if (k9Var != null) {
                    l9Var.F = true;
                    k9Var.b.c(false);
                    l9Var.F = false;
                }
                if (euVar.isEnabled() && euVar.hasSubMenu()) {
                    ((au) obj2).q(euVar, null, 4);
                    break;
                }
                break;
            default:
                cb0.i((View) obj4, (gb0) obj3, (ya0) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public j9(View view, gb0 gb0Var, ya0 ya0Var, ValueAnimator valueAnimator) {
        this.g = view;
        this.h = gb0Var;
        this.i = ya0Var;
        this.j = valueAnimator;
    }
}
