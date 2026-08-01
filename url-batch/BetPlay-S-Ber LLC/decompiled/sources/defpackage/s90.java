package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class s90 extends rd {
    public vc a;

    public void a(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }

    @Override // defpackage.rd
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        a(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new vc(view);
        }
        vc vcVar = this.a;
        View view2 = (View) vcVar.c;
        vcVar.a = view2.getTop();
        vcVar.b = view2.getLeft();
        vc vcVar2 = this.a;
        View view3 = (View) vcVar2.c;
        int top = 0 - (view3.getTop() - vcVar2.a);
        WeakHashMap weakHashMap = e90.a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - vcVar2.b));
        return true;
    }
}
