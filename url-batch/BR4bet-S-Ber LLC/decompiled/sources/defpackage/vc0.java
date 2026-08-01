package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class vc0 extends oe {
    public ro a;
    public int b = 0;

    public vc0() {
    }

    @Override // defpackage.oe
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        x(coordinatorLayout, view, i);
        if (this.a == null) {
            ro roVar = new ro();
            roVar.d = view;
            this.a = roVar;
        }
        ro roVar2 = this.a;
        View view2 = (View) roVar2.d;
        roVar2.a = view2.getTop();
        roVar2.b = view2.getLeft();
        this.a.b();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        ro roVar3 = this.a;
        if (roVar3.c != i2) {
            roVar3.c = i2;
            roVar3.b();
        }
        this.b = 0;
        return true;
    }

    public final int w() {
        ro roVar = this.a;
        if (roVar != null) {
            return roVar.c;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }

    public vc0(int i) {
    }
}
