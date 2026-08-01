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
import k.InterfaceC0155k;
import k.InterfaceC0168x;
import k.MenuC0157m;
import k.SubMenuC0144E;
import t0.InterfaceC0316a;
import x.C0338d;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0242k implements InterfaceC0168x, InterfaceC0155k, InterfaceC0223a0, L.s, InterfaceC0316a, K.r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2985a;

    public /* synthetic */ C0242k(Object obj) {
        this.f2985a = obj;
    }

    public void a(int i) {
    }

    @Override // k.InterfaceC0168x
    public void b(MenuC0157m menuC0157m, boolean z2) {
        if (menuC0157m instanceof SubMenuC0144E) {
            ((SubMenuC0144E) menuC0157m).f2604z.k().c(false);
        }
        InterfaceC0168x interfaceC0168x = ((C0244l) this.f2985a).f2989e;
        if (interfaceC0168x != null) {
            interfaceC0168x.b(menuC0157m, z2);
        }
    }

    @Override // k.InterfaceC0168x
    public boolean c(MenuC0157m menuC0157m) {
        C0244l c0244l = (C0244l) this.f2985a;
        if (menuC0157m == c0244l.f2988c) {
            return false;
        }
        ((SubMenuC0144E) menuC0157m).f2603A.getClass();
        c0244l.getClass();
        InterfaceC0168x interfaceC0168x = c0244l.f2989e;
        if (interfaceC0168x != null) {
            return interfaceC0168x.c(menuC0157m);
        }
        return false;
    }

    @Override // K.r
    public K.x0 d(View view, K.x0 x0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2985a;
        if (!Objects.equals(coordinatorLayout.f1277n, x0Var)) {
            coordinatorLayout.f1277n = x0Var;
            boolean z2 = x0Var.d() > 0;
            coordinatorLayout.f1278o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            K.v0 v0Var = x0Var.f468a;
            if (!v0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = K.T.f381a;
                    if (childAt.getFitsSystemWindows() && ((C0338d) childAt.getLayoutParams()).f4151a != null && v0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return x0Var;
    }

    @Override // L.s
    public boolean e(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f2985a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = K.T.f381a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    public void f(int i, float f2) {
    }

    @Override // k.InterfaceC0155k
    public void g(MenuC0157m menuC0157m) {
        W0 w02 = ((ActionMenuView) this.f2985a).f1185u;
        if (w02 != null) {
            w02.g(menuC0157m);
        }
    }

    @Override // k.InterfaceC0155k
    public boolean h(MenuC0157m menuC0157m, MenuItem menuItem) {
        InterfaceC0250o interfaceC0250o = ((ActionMenuView) this.f2985a).f1190z;
        if (interfaceC0250o != null) {
            Iterator it = ((CopyOnWriteArrayList) ((W0) interfaceC0250o).f2918a.f1209G.f432c).iterator();
            while (it.hasNext()) {
                if (((X.B) it.next()).f784a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void i(int i) {
    }

    public C0242k() {
        this.f2985a = new LinkedHashSet();
    }

    public C0242k(j1.a aVar) {
        this.f2985a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
