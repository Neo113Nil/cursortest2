package l;

import K.InterfaceC0025v;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g.C0147I;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.InterfaceC0198k;
import k.MenuC0200m;
import t0.InterfaceC0343a;
import x.C0364d;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0274n implements InterfaceC0198k, InterfaceC0251b0, L.s, InterfaceC0343a, InterfaceC0025v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3416a;

    public /* synthetic */ C0274n(Object obj) {
        this.f3416a = obj;
    }

    public void a(int i) {
    }

    @Override // L.s
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3416a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = K.X.f418a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f1750d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // K.InterfaceC0025v
    public K.B0 c(View view, K.B0 b02) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3416a;
        if (!Objects.equals(coordinatorLayout.f1141n, b02)) {
            coordinatorLayout.f1141n = b02;
            boolean z2 = b02.d() > 0;
            coordinatorLayout.f1142o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            K.z0 z0Var = b02.f395a;
            if (!z0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = K.X.f418a;
                    if (childAt.getFitsSystemWindows() && ((C0364d) childAt.getLayoutParams()).f4590a != null && z0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return b02;
    }

    public void d(int i, float f2) {
    }

    @Override // k.InterfaceC0198k
    public void e(MenuC0200m menuC0200m) {
        InterfaceC0198k interfaceC0198k = ((ActionMenuView) this.f3416a).f1042v;
        if (interfaceC0198k != null) {
            interfaceC0198k.e(menuC0200m);
        }
    }

    @Override // k.InterfaceC0198k
    public boolean f(MenuC0200m menuC0200m, MenuItem menuItem) {
        boolean onMenuItemSelected;
        InterfaceC0276o interfaceC0276o = ((ActionMenuView) this.f3416a).f1035A;
        if (interfaceC0276o == null) {
            return false;
        }
        Toolbar toolbar = ((X0) interfaceC0276o).f3316a;
        if (toolbar.f1066G.a()) {
            onMenuItemSelected = true;
        } else {
            b1 b1Var = toolbar.f1068I;
            onMenuItemSelected = b1Var != null ? ((C0147I) b1Var).f2496a.f2498b.f2596a.onMenuItemSelected(0, menuItem) : false;
        }
        return onMenuItemSelected;
    }

    public void g(int i) {
    }

    public C0274n() {
        this.f3416a = new LinkedHashSet();
    }

    public C0274n(j1.a aVar) {
        this.f3416a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
