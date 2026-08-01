package k;

import K.InterfaceC0020p;
import K.Q;
import K.u0;
import K.w0;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import i0.C0163a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import l.C0242k;
import l.InterfaceC0248n;
import l.V0;
import l.X;
import l0.C0276c;

/* renamed from: k.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0191o implements InterfaceC0201y, InterfaceC0187k, X, InterfaceC0020p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3187a;

    public /* synthetic */ C0191o(Object obj) {
        this.f3187a = obj;
    }

    public static C0.d k(C0276c c0276c) {
        HashMap hashMap = new HashMap(5);
        hashMap.put("id", new C0163a("id", "INTEGER", true, 1, null, 1));
        hashMap.put("title", new C0163a("title", "TEXT", true, 0, null, 1));
        hashMap.put("symbolIndex", new C0163a("symbolIndex", "INTEGER", true, 0, null, 1));
        hashMap.put("createdAt", new C0163a("createdAt", "INTEGER", true, 0, null, 1));
        hashMap.put("active", new C0163a("active", "INTEGER", true, 0, null, 1));
        i0.e eVar = new i0.e("habits", hashMap, new HashSet(0), new HashSet(0));
        i0.e a2 = i0.e.a(c0276c, "habits");
        if (!eVar.equals(a2)) {
            return new C0.d("habits(com.fortunequest.neontrack.data.HabitEntity).\n Expected:\n" + eVar + "\n Found:\n" + a2, false);
        }
        HashMap hashMap2 = new HashMap(2);
        hashMap2.put("habitId", new C0163a("habitId", "INTEGER", true, 1, null, 1));
        hashMap2.put("dayEpoch", new C0163a("dayEpoch", "INTEGER", true, 2, null, 1));
        i0.e eVar2 = new i0.e("completions", hashMap2, new HashSet(0), new HashSet(0));
        i0.e a3 = i0.e.a(c0276c, "completions");
        if (!eVar2.equals(a3)) {
            return new C0.d("completions(com.fortunequest.neontrack.data.HabitCompletionEntity).\n Expected:\n" + eVar2 + "\n Found:\n" + a3, false);
        }
        HashMap hashMap3 = new HashMap(7);
        hashMap3.put("id", new C0163a("id", "INTEGER", true, 1, null, 1));
        hashMap3.put("currentStreak", new C0163a("currentStreak", "INTEGER", true, 0, null, 1));
        hashMap3.put("bestStreak", new C0163a("bestStreak", "INTEGER", true, 0, null, 1));
        hashMap3.put("lastCompletedDay", new C0163a("lastCompletedDay", "INTEGER", true, 0, null, 1));
        hashMap3.put("lastOpenedDay", new C0163a("lastOpenedDay", "INTEGER", true, 0, null, 1));
        hashMap3.put("graceRemaining", new C0163a("graceRemaining", "INTEGER", true, 0, null, 1));
        hashMap3.put("multiplier", new C0163a("multiplier", "REAL", true, 0, null, 1));
        i0.e eVar3 = new i0.e("streak_state", hashMap3, new HashSet(0), new HashSet(0));
        i0.e a4 = i0.e.a(c0276c, "streak_state");
        if (eVar3.equals(a4)) {
            return new C0.d((String) null, true);
        }
        return new C0.d("streak_state(com.fortunequest.neontrack.data.StreakStateEntity).\n Expected:\n" + eVar3 + "\n Found:\n" + a4, false);
    }

    @Override // l.X
    public void a(int i) {
    }

    @Override // k.InterfaceC0201y
    public void b(MenuC0189m menuC0189m, boolean z2) {
        if (menuC0189m instanceof SubMenuC0176F) {
            ((SubMenuC0176F) menuC0189m).f3104z.k().c(false);
        }
        InterfaceC0201y interfaceC0201y = ((C0242k) this.f3187a).f3411e;
        if (interfaceC0201y != null) {
            interfaceC0201y.b(menuC0189m, z2);
        }
    }

    @Override // k.InterfaceC0201y
    public boolean c(MenuC0189m menuC0189m) {
        C0242k c0242k = (C0242k) this.f3187a;
        if (menuC0189m == c0242k.f3410c) {
            return false;
        }
        ((SubMenuC0176F) menuC0189m).f3103A.getClass();
        c0242k.getClass();
        InterfaceC0201y interfaceC0201y = c0242k.f3411e;
        if (interfaceC0201y != null) {
            return interfaceC0201y.c(menuC0189m);
        }
        return false;
    }

    @Override // K.InterfaceC0020p
    public w0 d(View view, w0 w0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3187a;
        if (!Objects.equals(coordinatorLayout.f1804n, w0Var)) {
            coordinatorLayout.f1804n = w0Var;
            boolean z2 = w0Var.d() > 0;
            coordinatorLayout.f1805o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            u0 u0Var = w0Var.f668a;
            if (!u0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = Q.f578a;
                    if (childAt.getFitsSystemWindows() && ((x.d) childAt.getLayoutParams()).f4525a != null && u0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return w0Var;
    }

    @Override // l.X
    public void e(int i, float f2) {
    }

    @Override // k.InterfaceC0187k
    public void f(MenuC0189m menuC0189m) {
        V0 v02 = ((ActionMenuView) this.f3187a).f1712u;
        if (v02 != null) {
            v02.f(menuC0189m);
        }
    }

    @Override // k.InterfaceC0187k
    public boolean g(MenuC0189m menuC0189m, MenuItem menuItem) {
        InterfaceC0248n interfaceC0248n = ((ActionMenuView) this.f3187a).f1717z;
        if (interfaceC0248n != null) {
            Iterator it = ((CopyOnWriteArrayList) ((V0) interfaceC0248n).f3341a.f1736G.f4191b).iterator();
            while (it.hasNext()) {
                if (((Y.B) it.next()).f1282a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.X
    public void h(int i) {
    }

    public void i(String str, String str2) {
        k1.e.e(str, "name");
        k1.e.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f3187a;
        arrayList.add(str);
        arrayList.add(r1.d.T(str2).toString());
    }

    public z1.j j() {
        return new z1.j((String[]) ((ArrayList) this.f3187a).toArray(new String[0]));
    }

    public void l(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f3187a;
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

    public C0191o(int i) {
        switch (i) {
            case 7:
                this.f3187a = new ArrayList(20);
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                k1.e.e(timeUnit, "timeUnit");
                this.f3187a = new D1.n(C1.d.h, timeUnit);
                break;
        }
    }
}
