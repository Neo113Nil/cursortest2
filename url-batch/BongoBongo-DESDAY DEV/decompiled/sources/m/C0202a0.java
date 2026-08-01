package m;

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
import w0.InterfaceC0310a;

/* renamed from: m.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0202a0 implements Z, M.s, InterfaceC0310a, L.r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3068a;

    public /* synthetic */ C0202a0(Object obj) {
        this.f3068a = obj;
    }

    @Override // m.Z
    public void a(int i) {
    }

    @Override // M.s
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3068a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = L.T.f490a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(RecyclerView.A0);
        return true;
    }

    @Override // m.Z
    public void c(int i, float f2) {
    }

    @Override // L.r
    public L.z0 d(View view, L.z0 z0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3068a;
        if (!Objects.equals(coordinatorLayout.f1489n, z0Var)) {
            coordinatorLayout.f1489n = z0Var;
            boolean z2 = z0Var.d() > 0;
            coordinatorLayout.f1490o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            L.x0 x0Var = z0Var.f589a;
            if (!x0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = L.T.f490a;
                    if (childAt.getFitsSystemWindows() && ((y.d) childAt.getLayoutParams()).f4299a != null && x0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return z0Var;
    }

    @Override // m.Z
    public void e(int i) {
    }

    public void f(String str, String str2) {
        h1.d.e(str, "name");
        h1.d.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f3068a;
        arrayList.add(str);
        arrayList.add(o1.d.S(str2).toString());
    }

    public s1.j g() {
        return new s1.j((String[]) ((ArrayList) this.f3068a).toArray(new String[0]));
    }

    public void h(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f3068a;
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

    public C0202a0(int i) {
        switch (i) {
            case 2:
                this.f3068a = new ArrayList(20);
                break;
            case 6:
                this.f3068a = new LinkedHashSet();
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                h1.d.e(timeUnit, "timeUnit");
                this.f3068a = new w1.n(v1.d.f3967h, timeUnit);
                break;
        }
    }

    public C0202a0(t1.a aVar) {
        this.f3068a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
