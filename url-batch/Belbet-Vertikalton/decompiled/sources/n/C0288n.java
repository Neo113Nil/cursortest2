package n;

import M.InterfaceC0020p;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b1.EnumC0098a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import m.InterfaceC0227k;
import m.MenuC0229m;
import y0.C0425d;
import y0.DialogC0426e;
import z.C0430d;
import z0.InterfaceC0434a;

/* renamed from: n.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0288n implements InterfaceC0227k, Z, u1.b, N.r, InterfaceC0020p, InterfaceC0434a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3676a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3677b;

    public /* synthetic */ C0288n(int i, Object obj) {
        this.f3676a = i;
        this.f3677b = obj;
    }

    public void a(int i) {
    }

    @Override // N.r
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3677b;
        if (!swipeDismissBehavior.v(view)) {
            return false;
        }
        WeakHashMap weakHashMap = M.P.f711a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f2254d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // m.InterfaceC0227k
    public boolean c(MenuC0229m menuC0229m, MenuItem menuItem) {
        InterfaceC0290o interfaceC0290o = ((ActionMenuView) this.f3677b).f1763z;
        if (interfaceC0290o != null) {
            Iterator it = ((CopyOnWriteArrayList) ((b1) interfaceC0290o).f3601a.f1783G.f592c).iterator();
            while (it.hasNext()) {
                if (((Z.B) it.next()).f1424a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // u1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(u1.c cVar, a1.d dVar) {
        u1.a aVar;
        int i;
        Throwable th;
        v1.g gVar;
        if (dVar instanceof u1.a) {
            aVar = (u1.a) dVar;
            int i2 = aVar.f4382d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f4382d = i2 - Integer.MIN_VALUE;
                Object obj = aVar.f4380b;
                EnumC0098a enumC0098a = EnumC0098a.f2223a;
                i = aVar.f4382d;
                W0.i iVar = W0.i.f1345a;
                if (i != 0) {
                    H1.d.i0(obj);
                    v1.g gVar2 = new v1.g(cVar, aVar.getContext());
                    try {
                        aVar.f4379a = gVar2;
                        aVar.f4382d = 1;
                        Object d2 = ((androidx.room.e) this.f3677b).d(gVar2, aVar);
                        if (d2 != enumC0098a) {
                            d2 = iVar;
                        }
                        if (d2 == enumC0098a) {
                            return enumC0098a;
                        }
                        gVar = gVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        gVar = gVar2;
                        gVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.f4379a;
                    try {
                        H1.d.i0(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        gVar.releaseIntercepted();
                        throw th;
                    }
                }
                gVar.releaseIntercepted();
                return iVar;
            }
        }
        aVar = new u1.a(this, dVar);
        Object obj2 = aVar.f4380b;
        EnumC0098a enumC0098a2 = EnumC0098a.f2223a;
        i = aVar.f4382d;
        W0.i iVar2 = W0.i.f1345a;
        if (i != 0) {
        }
        gVar.releaseIntercepted();
        return iVar2;
    }

    public void d(int i, float f2) {
    }

    @Override // M.InterfaceC0020p
    public M.t0 e(View view, M.t0 t0Var) {
        Object obj = this.f3677b;
        switch (this.f3676a) {
            case 4:
                DialogC0426e dialogC0426e = (DialogC0426e) obj;
                C0425d c0425d = dialogC0426e.f4727m;
                if (c0425d != null) {
                    dialogC0426e.f4722f.f2278W.remove(c0425d);
                }
                C0425d c0425d2 = new C0425d(dialogC0426e.i, t0Var);
                dialogC0426e.f4727m = c0425d2;
                c0425d2.e(dialogC0426e.getWindow());
                BottomSheetBehavior bottomSheetBehavior = dialogC0426e.f4722f;
                C0425d c0425d3 = dialogC0426e.f4727m;
                ArrayList arrayList = bottomSheetBehavior.f2278W;
                if (!arrayList.contains(c0425d3)) {
                    arrayList.add(c0425d3);
                    break;
                }
                break;
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                if (!Objects.equals(coordinatorLayout.f1850n, t0Var)) {
                    coordinatorLayout.f1850n = t0Var;
                    boolean z2 = t0Var.d() > 0;
                    coordinatorLayout.f1851o = z2;
                    coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
                    M.r0 r0Var = t0Var.f794a;
                    if (!r0Var.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = M.P.f711a;
                            if (!childAt.getFitsSystemWindows() || ((C0430d) childAt.getLayoutParams()).f4768a == null || !r0Var.m()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                    break;
                }
                break;
        }
        return t0Var;
    }

    @Override // m.InterfaceC0227k
    public void f(MenuC0229m menuC0229m) {
        b1 b1Var = ((ActionMenuView) this.f3677b).f1758u;
        if (b1Var != null) {
            b1Var.f(menuC0229m);
        }
    }

    public void g(int i) {
    }

    public void h(String str, String str2) {
        j1.h.e(str, "name");
        j1.h.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f3677b;
        arrayList.add(str);
        arrayList.add(q1.e.L0(str2).toString());
    }

    public z1.m i() {
        return new z1.m((String[]) ((ArrayList) this.f3677b).toArray(new String[0]));
    }

    public void j(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f3677b;
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

    public C0288n(int i) {
        this.f3676a = i;
        switch (i) {
            case 8:
                this.f3677b = new ArrayList(20);
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                j1.h.e(timeUnit, "timeUnit");
                this.f3677b = new D1.n(C1.f.f148h, timeUnit);
                break;
        }
    }
}
