package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fp1 {
    public final ReentrantLock a;
    public final vo2 b;
    public final vo2 c;
    public boolean d;
    public final m62 e;
    public final m62 f;
    public final cr1 g;
    public final /* synthetic */ up1 h;

    public fp1(up1 up1Var, cr1 cr1Var) {
        cr1Var.getClass();
        this.h = up1Var;
        this.a = new ReentrantLock(true);
        vo2 f = zm3.f(ah0.m);
        this.b = f;
        vo2 f2 = zm3.f(fh0.m);
        this.c = f2;
        this.e = new m62(f);
        this.f = new m62(f2);
        this.g = cr1Var;
    }

    public final void a(cp1 cp1Var) {
        cp1Var.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            vo2 vo2Var = this.b;
            vo2Var.j(null, zv.F((Collection) vo2Var.getValue(), cp1Var));
            Unit unit = Unit.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(cp1 cp1Var) {
        hp1 hp1Var;
        cp1Var.getClass();
        up1 up1Var = this.h;
        LinkedHashMap linkedHashMap = up1Var.z;
        vo2 vo2Var = up1Var.i;
        bi biVar = up1Var.g;
        boolean b = Intrinsics.b(linkedHashMap.get(cp1Var), Boolean.TRUE);
        String str = cp1Var.r;
        vo2 vo2Var2 = this.c;
        Set set = (Set) vo2Var2.getValue();
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(li1.a(set.size()));
        boolean z = false;
        for (Object obj : set) {
            boolean z2 = true;
            if (!z && Intrinsics.b(obj, cp1Var)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
        vo2Var2.j(null, linkedHashSet);
        up1Var.z.remove(cp1Var);
        if (biVar.contains(cp1Var)) {
            if (this.d) {
                return;
            }
            up1Var.s();
            vo2 vo2Var3 = up1Var.h;
            ArrayList N = zv.N(biVar);
            vo2Var3.getClass();
            vo2Var3.j(null, N);
            ArrayList p = up1Var.p();
            vo2Var.getClass();
            vo2Var.j(null, p);
            return;
        }
        up1Var.r(cp1Var);
        if (cp1Var.t.c.compareTo(zc1.o) >= 0) {
            cp1Var.w = zc1.m;
            cp1Var.b();
        }
        if (biVar == null || !biVar.isEmpty()) {
            Iterator it = biVar.iterator();
            while (it.hasNext()) {
                if (Intrinsics.b(((cp1) it.next()).r, str)) {
                    break;
                }
            }
        }
        if (!b && (hp1Var = up1Var.p) != null) {
            str.getClass();
            t53 t53Var = (t53) hp1Var.b.remove(str);
            if (t53Var != null) {
                t53Var.a();
            }
        }
        up1Var.s();
        ArrayList p2 = up1Var.p();
        vo2Var.getClass();
        vo2Var.j(null, p2);
    }

    public final void c(cp1 cp1Var, boolean z) {
        cp1Var.getClass();
        up1 up1Var = this.h;
        cr1 b = up1Var.v.b(cp1Var.n.m);
        up1Var.z.put(cp1Var, Boolean.valueOf(z));
        if (!b.equals(this.g)) {
            Object obj = up1Var.w.get(b);
            obj.getClass();
            ((fp1) obj).c(cp1Var, z);
            return;
        }
        g40 g40Var = up1Var.y;
        if (g40Var != null) {
            g40Var.invoke(cp1Var);
            d(cp1Var);
            return;
        }
        k7 k7Var = new k7(this, cp1Var, z);
        bi biVar = up1Var.g;
        int indexOf = biVar.indexOf(cp1Var);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + cp1Var + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != biVar.o) {
            up1Var.m(((cp1) biVar.get(i)).n.r, true, false);
        }
        up1.o(up1Var, cp1Var);
        k7Var.invoke();
        up1Var.t();
        up1Var.b();
    }

    public final void d(cp1 cp1Var) {
        cp1Var.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            vo2 vo2Var = this.b;
            Iterable iterable = (Iterable) vo2Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (Intrinsics.b((cp1) obj, cp1Var)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            vo2Var.j(null, arrayList);
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(cp1 cp1Var, boolean z) {
        Object obj;
        cp1Var.getClass();
        vo2 vo2Var = this.c;
        Iterable iterable = (Iterable) vo2Var.getValue();
        boolean z2 = iterable instanceof Collection;
        m62 m62Var = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((cp1) it.next()) == cp1Var) {
                    Iterable iterable2 = (Iterable) m62Var.m.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((cp1) it2.next()) == cp1Var) {
                        }
                    }
                    return;
                }
            }
        }
        vo2Var.j(null, sj2.d((Set) vo2Var.getValue(), cp1Var));
        vo2 vo2Var2 = m62Var.m;
        vo2 vo2Var3 = m62Var.m;
        List list = (List) vo2Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            cp1 cp1Var2 = (cp1) obj;
            if (!Intrinsics.b(cp1Var2, cp1Var) && ((List) vo2Var3.getValue()).lastIndexOf(cp1Var2) < ((List) vo2Var3.getValue()).lastIndexOf(cp1Var)) {
                break;
            }
        }
        cp1 cp1Var3 = (cp1) obj;
        if (cp1Var3 != null) {
            vo2Var.j(null, sj2.d((Set) vo2Var.getValue(), cp1Var3));
        }
        c(cp1Var, z);
    }

    public final void f(cp1 cp1Var) {
        cp1Var.getClass();
        up1 up1Var = this.h;
        cr1 b = up1Var.v.b(cp1Var.n.m);
        if (!b.equals(this.g)) {
            Object obj = up1Var.w.get(b);
            if (obj != null) {
                ((fp1) obj).f(cp1Var);
                return;
            } else {
                b71.h(q40.p(new StringBuilder("NavigatorBackStack for "), cp1Var.n.m, " should already be created"));
                return;
            }
        }
        Function1 function1 = up1Var.x;
        if (function1 != null) {
            function1.invoke(cp1Var);
            a(cp1Var);
        } else {
            Log.i("NavController", "Ignoring add of destination " + cp1Var.n + " outside of the call to navigate(). ");
        }
    }
}
