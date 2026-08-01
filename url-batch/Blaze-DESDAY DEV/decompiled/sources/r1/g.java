package r1;

import K.T;
import K.x0;
import K.z0;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v0.InterfaceC0308a;

/* loaded from: classes.dex */
public final class g implements L.s, InterfaceC0308a, K.r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3436a;

    public /* synthetic */ g(Object obj) {
        this.f3436a = obj;
    }

    @Override // K.r
    public z0 a(View view, z0 z0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3436a;
        if (!Objects.equals(coordinatorLayout.f1431n, z0Var)) {
            coordinatorLayout.f1431n = z0Var;
            boolean z2 = z0Var.d() > 0;
            coordinatorLayout.f1432o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            x0 x0Var = z0Var.f536a;
            if (!x0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = T.f440a;
                    if (childAt.getFitsSystemWindows() && ((x.d) childAt.getLayoutParams()).f4105a != null && x0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return z0Var;
    }

    @Override // L.s
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3436a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = T.f440a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(RecyclerView.f1559A0);
        return true;
    }

    public void c(String str, String str2) {
        g1.d.e(str, "name");
        g1.d.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f3436a;
        arrayList.add(str);
        arrayList.add(n1.d.O(str2).toString());
    }

    public k d() {
        return new k((String[]) ((ArrayList) this.f3436a).toArray(new String[0]));
    }

    public void e(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f3436a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public g(int i) {
        switch (i) {
            case 1:
                this.f3436a = new ArrayList(20);
                break;
            case 5:
                this.f3436a = new LinkedHashSet();
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                g1.d.e(timeUnit, "timeUnit");
                this.f3436a = new v1.n(u1.d.h, timeUnit);
                break;
        }
    }

    public g(s1.a aVar) {
        this.f3436a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
