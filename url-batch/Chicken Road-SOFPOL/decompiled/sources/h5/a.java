package h5;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b3.g;
import java.lang.reflect.Field;
import q3.k0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a extends d3.a {

    /* renamed from: a, reason: collision with root package name */
    public g f3203a;

    @Override // d3.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3203a == null) {
            this.f3203a = new g(view);
        }
        g gVar = this.f3203a;
        View view2 = (View) gVar.f1131f;
        gVar.f1129d = view2.getTop();
        gVar.f1130e = view2.getLeft();
        g gVar2 = this.f3203a;
        View view3 = (View) gVar2.f1131f;
        int top = 0 - (view3.getTop() - gVar2.f1129d);
        Field field = k0.f6120a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - gVar2.f1130e));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
