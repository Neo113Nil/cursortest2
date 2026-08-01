package l;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.InterfaceC0156k;
import k.MenuC0158m;
import u0.InterfaceC0315a;
import x.C0331d;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0229n implements InterfaceC0156k, InterfaceC0204a0, L.s, InterfaceC0315a, K.r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3111a;

    public /* synthetic */ C0229n(Object obj) {
        this.f3111a = obj;
    }

    public void a(int i) {
    }

    @Override // L.s
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3111a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = K.S.f362a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // K.r
    public K.w0 c(View view, K.w0 w0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3111a;
        if (!Objects.equals(coordinatorLayout.f1316n, w0Var)) {
            coordinatorLayout.f1316n = w0Var;
            boolean z2 = w0Var.d() > 0;
            coordinatorLayout.f1317o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            K.u0 u0Var = w0Var.f449a;
            if (!u0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = K.S.f362a;
                    if (childAt.getFitsSystemWindows() && ((C0331d) childAt.getLayoutParams()).f4146a != null && u0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return w0Var;
    }

    public void d(int i, float f2) {
    }

    @Override // k.InterfaceC0156k
    public void e(MenuC0158m menuC0158m) {
        W0 w02 = ((ActionMenuView) this.f3111a).f1224u;
        if (w02 != null) {
            w02.e(menuC0158m);
        }
    }

    @Override // k.InterfaceC0156k
    public boolean f(MenuC0158m menuC0158m, MenuItem menuItem) {
        InterfaceC0231o interfaceC0231o = ((ActionMenuView) this.f3111a).f1229z;
        if (interfaceC0231o != null) {
            Iterator it = ((CopyOnWriteArrayList) ((W0) interfaceC0231o).f3019a.f1248G.f416c).iterator();
            while (it.hasNext()) {
                if (((X.B) it.next()).f833a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void g(int i) {
    }

    public C0229n() {
        this.f3111a = new LinkedHashSet();
    }

    public C0229n(l1.a aVar) {
        this.f3111a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
