package x;

import K.InterfaceC0017s;
import K.S;
import K.u0;
import K.w0;
import L.t;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377a implements InterfaceC0017s, t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3993a;

    public /* synthetic */ C0377a(Object obj) {
        this.f3993a = obj;
    }

    @Override // L.t
    public boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3993a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = S.f365a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // K.InterfaceC0017s
    public w0 c(View view, w0 w0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3993a;
        if (!Objects.equals(coordinatorLayout.f1423n, w0Var)) {
            coordinatorLayout.f1423n = w0Var;
            boolean z2 = w0Var.d() > 0;
            coordinatorLayout.f1424o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            u0 u0Var = w0Var.f451a;
            if (!u0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = S.f365a;
                    if (childAt.getFitsSystemWindows() && ((C0381e) childAt.getLayoutParams()).f3995a != null && u0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return w0Var;
    }
}
