package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class um0 extends hg {
    public ac a;
    public int b = 0;

    public um0() {
    }

    @Override // defpackage.hg
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        x(coordinatorLayout, view, i);
        if (this.a == null) {
            ac acVar = new ac();
            acVar.d = view;
            this.a = acVar;
        }
        ac acVar2 = this.a;
        View view2 = (View) acVar2.d;
        acVar2.a = view2.getTop();
        acVar2.b = view2.getLeft();
        this.a.c();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        ac acVar3 = this.a;
        if (acVar3.c != i2) {
            acVar3.c = i2;
            acVar3.c();
        }
        this.b = 0;
        return true;
    }

    public final int w() {
        ac acVar = this.a;
        if (acVar != null) {
            return acVar.c;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.r(view, i);
    }

    public um0(int i) {
    }
}
