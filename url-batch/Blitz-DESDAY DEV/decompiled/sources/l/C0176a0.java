package l;

import M.InterfaceC0016q;
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
import w0.InterfaceC0295a;
import z.C0321d;

/* renamed from: l.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0176a0 implements Z, N.s, InterfaceC0295a, InterfaceC0016q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2962a;

    public /* synthetic */ C0176a0(Object obj) {
        this.f2962a = obj;
    }

    @Override // l.Z
    public void a(int i) {
    }

    @Override // N.s
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f2962a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = M.Q.f513a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // l.Z
    public void c(int i, float f2) {
    }

    @Override // M.InterfaceC0016q
    public M.v0 d(View view, M.v0 v0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2962a;
        if (!Objects.equals(coordinatorLayout.f1488n, v0Var)) {
            coordinatorLayout.f1488n = v0Var;
            boolean z2 = v0Var.d() > 0;
            coordinatorLayout.f1489o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            M.t0 t0Var = v0Var.f596a;
            if (!t0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = M.Q.f513a;
                    if (childAt.getFitsSystemWindows() && ((C0321d) childAt.getLayoutParams()).f4304a != null && t0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return v0Var;
    }

    @Override // l.Z
    public void e(int i) {
    }

    public void f(String str, String str2) {
        g1.d.e(str, "name");
        g1.d.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f2962a;
        arrayList.add(str);
        arrayList.add(n1.d.R(str2).toString());
    }

    public r1.j g() {
        return new r1.j((String[]) ((ArrayList) this.f2962a).toArray(new String[0]));
    }

    public void h(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f2962a;
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

    public C0176a0(int i) {
        switch (i) {
            case 2:
                this.f2962a = new ArrayList(20);
                break;
            case 5:
                this.f2962a = new LinkedHashSet();
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                g1.d.e(timeUnit, "timeUnit");
                this.f2962a = new v1.n(u1.d.h, timeUnit);
                break;
        }
    }

    public C0176a0(s1.a aVar) {
        this.f2962a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
