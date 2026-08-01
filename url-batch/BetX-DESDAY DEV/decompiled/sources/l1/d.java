package l1;

import K.B0;
import K.InterfaceC0025v;
import K.X;
import K.z0;
import L.s;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t0.InterfaceC0345a;
import x.C0366d;

/* loaded from: classes.dex */
public final class d implements s, InterfaceC0345a, InterfaceC0025v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3527a;

    public /* synthetic */ d(Object obj) {
        this.f3527a = obj;
    }

    @Override // L.s
    public boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3527a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = X.f419a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f1728d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // K.InterfaceC0025v
    public B0 c(View view, B0 b02) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3527a;
        if (!Objects.equals(coordinatorLayout.f1142n, b02)) {
            coordinatorLayout.f1142n = b02;
            boolean z2 = b02.d() > 0;
            coordinatorLayout.f1143o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            z0 z0Var = b02.f396a;
            if (!z0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = X.f419a;
                    if (childAt.getFitsSystemWindows() && ((C0366d) childAt.getLayoutParams()).f4594a != null && z0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return b02;
    }

    public d() {
        this.f3527a = new LinkedHashSet();
    }

    public d(j1.a aVar) {
        this.f3527a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
