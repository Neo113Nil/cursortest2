package p1;

import K.S;
import K.u0;
import K.w0;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u0.InterfaceC0313a;
import x.C0337d;

/* loaded from: classes.dex */
public final class g implements L.s, InterfaceC0313a, K.r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3336a;

    public /* synthetic */ g(Object obj) {
        this.f3336a = obj;
    }

    @Override // K.r
    public w0 a(View view, w0 w0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3336a;
        if (!Objects.equals(coordinatorLayout.f1386n, w0Var)) {
            coordinatorLayout.f1386n = w0Var;
            boolean z2 = w0Var.d() > 0;
            coordinatorLayout.f1387o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            u0 u0Var = w0Var.f509a;
            if (!u0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = S.f422a;
                    if (childAt.getFitsSystemWindows() && ((C0337d) childAt.getLayoutParams()).f4189a != null && u0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return w0Var;
    }

    @Override // L.s
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3336a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = S.f422a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    public void c(String str, String str2) {
        e1.d.e(str, "name");
        e1.d.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f3336a;
        arrayList.add(str);
        arrayList.add(l1.d.K(str2).toString());
    }

    public k d() {
        return new k((String[]) ((ArrayList) this.f3336a).toArray(new String[0]));
    }

    public void e(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f3336a;
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
                this.f3336a = new ArrayList(20);
                break;
            case 4:
                this.f3336a = new LinkedHashSet();
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                e1.d.e(timeUnit, "timeUnit");
                this.f3336a = new t1.n(s1.d.h, timeUnit);
                break;
        }
    }

    public g(q1.a aVar) {
        this.f3336a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
