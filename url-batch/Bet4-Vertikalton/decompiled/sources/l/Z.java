package l;

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
import v0.InterfaceC0307a;

/* loaded from: classes.dex */
public class Z implements Y, L.s, InterfaceC0307a, K.r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2878a;

    public /* synthetic */ Z(Object obj) {
        this.f2878a = obj;
    }

    @Override // l.Y
    public void a(int i) {
    }

    @Override // L.s
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f2878a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = K.T.f423a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(RecyclerView.f1530C0);
        return true;
    }

    @Override // K.r
    public K.z0 c(View view, K.z0 z0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2878a;
        if (!Objects.equals(coordinatorLayout.f1400n, z0Var)) {
            coordinatorLayout.f1400n = z0Var;
            boolean z2 = z0Var.d() > 0;
            coordinatorLayout.f1401o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            K.x0 x0Var = z0Var.f519a;
            if (!x0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = K.T.f423a;
                    if (childAt.getFitsSystemWindows() && ((x.d) childAt.getLayoutParams()).f4193a != null && x0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return z0Var;
    }

    @Override // l.Y
    public void d(int i, float f2) {
    }

    @Override // l.Y
    public void e(int i) {
    }

    public void f(String str, String str2) {
        d1.d.e(str, "name");
        d1.d.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f2878a;
        arrayList.add(str);
        arrayList.add(k1.d.O(str2).toString());
    }

    public o1.j g() {
        return new o1.j((String[]) ((ArrayList) this.f2878a).toArray(new String[0]));
    }

    public void h(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f2878a;
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

    public Z(int i) {
        switch (i) {
            case 2:
                this.f2878a = new ArrayList(20);
                break;
            case 5:
                this.f2878a = new LinkedHashSet();
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                d1.d.e(timeUnit, "timeUnit");
                this.f2878a = new s1.n(r1.d.h, timeUnit);
                break;
        }
    }

    public Z(p1.a aVar) {
        this.f2878a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
