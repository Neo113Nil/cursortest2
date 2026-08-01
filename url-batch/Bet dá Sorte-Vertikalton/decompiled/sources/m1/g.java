package m1;

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
import x.C0322d;

/* loaded from: classes.dex */
public final class g implements L.s, K.r, y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3189a;

    public /* synthetic */ g(Object obj) {
        this.f3189a = obj;
    }

    @Override // K.r
    public w0 a(View view, w0 w0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3189a;
        if (!Objects.equals(coordinatorLayout.f1358n, w0Var)) {
            coordinatorLayout.f1358n = w0Var;
            boolean z2 = w0Var.d() > 0;
            coordinatorLayout.f1359o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            u0 u0Var = w0Var.f438a;
            if (!u0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = S.f351a;
                    if (childAt.getFitsSystemWindows() && ((C0322d) childAt.getLayoutParams()).f4184a != null && u0Var.m()) {
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
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3189a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = S.f351a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    public void c(String str, String str2) {
        b1.d.e(str, "name");
        b1.d.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f3189a;
        arrayList.add(str);
        arrayList.add(i1.d.M0(str2).toString());
    }

    public k d() {
        return new k((String[]) ((ArrayList) this.f3189a).toArray(new String[0]));
    }

    public void e(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f3189a;
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
                this.f3189a = new ArrayList(20);
                break;
            case 2:
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                b1.d.e(timeUnit, "timeUnit");
                this.f3189a = new q1.n(p1.d.h, timeUnit);
                break;
            case 3:
                this.f3189a = new LinkedHashSet();
                break;
        }
    }

    public g(n1.a aVar) {
        this.f3189a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
