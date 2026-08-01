package l;

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
import u0.InterfaceC0318a;
import x.C0335d;

/* renamed from: l.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0207a0 implements Z, L.s, InterfaceC0318a, K.r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2889a;

    public /* synthetic */ C0207a0(Object obj) {
        this.f2889a = obj;
    }

    @Override // l.Z
    public void a(int i) {
    }

    @Override // L.s
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f2889a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = K.S.f369a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // K.r
    public K.w0 c(View view, K.w0 w0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2889a;
        if (!Objects.equals(coordinatorLayout.f1341n, w0Var)) {
            coordinatorLayout.f1341n = w0Var;
            boolean z2 = w0Var.d() > 0;
            coordinatorLayout.f1342o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            K.u0 u0Var = w0Var.f456a;
            if (!u0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = K.S.f369a;
                    if (childAt.getFitsSystemWindows() && ((C0335d) childAt.getLayoutParams()).f4154a != null && u0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return w0Var;
    }

    @Override // l.Z
    public void d(int i, float f2) {
    }

    @Override // l.Z
    public void e(int i) {
    }

    public void f(String str, String str2) {
        b1.d.e(str, "name");
        b1.d.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f2889a;
        arrayList.add(str);
        arrayList.add(i1.d.E0(str2).toString());
    }

    public m1.j g() {
        return new m1.j((String[]) ((ArrayList) this.f2889a).toArray(new String[0]));
    }

    public void h(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f2889a;
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

    public C0207a0(int i) {
        switch (i) {
            case 2:
                this.f2889a = new ArrayList(20);
                break;
            case 3:
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                b1.d.e(timeUnit, "timeUnit");
                this.f2889a = new q1.n(p1.d.h, timeUnit);
                break;
            case 4:
                this.f2889a = new LinkedHashSet();
                break;
        }
    }

    public C0207a0(n1.a aVar) {
        this.f2889a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
