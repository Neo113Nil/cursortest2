package t3;

import android.util.Log;
import androidx.lifecycle.b1;
import f7.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f8811a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f8812b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f8813c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8814d;

    /* renamed from: e, reason: collision with root package name */
    public final f7.z f8815e;

    /* renamed from: f, reason: collision with root package name */
    public final f7.z f8816f;

    /* renamed from: g, reason: collision with root package name */
    public final g0 f8817g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0 f8818h;

    public k(b0 b0Var, g0 g0Var) {
        r6.k.f(g0Var, "navigator");
        this.f8818h = b0Var;
        this.f8811a = new ReentrantLock(true);
        q0 c4 = f7.f0.c(e6.u.f2826f);
        this.f8812b = c4;
        q0 c6 = f7.f0.c(e6.w.f2828f);
        this.f8813c = c6;
        this.f8815e = new f7.z(c4);
        this.f8816f = new f7.z(c6);
        this.f8817g = g0Var;
    }

    public final void a(h hVar) {
        r6.k.f(hVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f8811a;
        reentrantLock.lock();
        try {
            q0 q0Var = this.f8812b;
            ArrayList q02 = e6.l.q0((Collection) q0Var.getValue(), hVar);
            q0Var.getClass();
            q0Var.l(null, q02);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(h hVar) {
        o oVar;
        r6.k.f(hVar, "entry");
        String str = hVar.f8796k;
        b0 b0Var = this.f8818h;
        LinkedHashMap linkedHashMap = b0Var.f8770z;
        q0 q0Var = b0Var.f8753i;
        e6.j jVar = b0Var.f8751g;
        boolean a3 = r6.k.a(linkedHashMap.get(hVar), Boolean.TRUE);
        q0 q0Var2 = this.f8813c;
        Set set = (Set) q0Var2.getValue();
        r6.k.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(e6.d0.h0(set.size()));
        boolean z8 = false;
        for (Object obj : set) {
            boolean z9 = true;
            if (!z8 && r6.k.a(obj, hVar)) {
                z8 = true;
                z9 = false;
            }
            if (z9) {
                linkedHashSet.add(obj);
            }
        }
        q0Var2.l(null, linkedHashSet);
        b0Var.f8770z.remove(hVar);
        if (jVar.contains(hVar)) {
            if (this.f8814d) {
                return;
            }
            b0Var.q();
            q0 q0Var3 = b0Var.f8752h;
            ArrayList x02 = e6.l.x0(jVar);
            q0Var3.getClass();
            q0Var3.l(null, x02);
            ArrayList n8 = b0Var.n();
            q0Var.getClass();
            q0Var.l(null, n8);
            return;
        }
        b0Var.p(hVar);
        if (hVar.f8798m.f1046d.compareTo(androidx.lifecycle.o.f1009h) >= 0) {
            hVar.h(androidx.lifecycle.o.f1007f);
        }
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (it.hasNext()) {
                if (r6.k.a(((h) it.next()).f8796k, str)) {
                    break;
                }
            }
        }
        if (!a3 && (oVar = b0Var.f8760p) != null) {
            r6.k.f(str, "backStackEntryId");
            b1 b1Var = (b1) oVar.f8828b.remove(str);
            if (b1Var != null) {
                b1Var.a();
            }
        }
        b0Var.q();
        ArrayList n9 = b0Var.n();
        q0Var.getClass();
        q0Var.l(null, n9);
    }

    public final void c(h hVar, boolean z8) {
        r6.k.f(hVar, "popUpTo");
        b0 b0Var = this.f8818h;
        g0 b9 = b0Var.f8766v.b(hVar.f8792g.f8857f);
        b0Var.f8770z.put(hVar, Boolean.valueOf(z8));
        if (!b9.equals(this.f8817g)) {
            Object obj = b0Var.f8767w.get(b9);
            r6.k.c(obj);
            ((k) obj).c(hVar, z8);
            return;
        }
        l lVar = b0Var.f8769y;
        if (lVar != null) {
            lVar.f(hVar);
            d(hVar);
            return;
        }
        e6.j jVar = b0Var.f8751g;
        int indexOf = jVar.indexOf(hVar);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + hVar + " as it was not found on the current back stack");
            return;
        }
        int i7 = indexOf + 1;
        if (i7 != jVar.f2822h) {
            b0Var.k(((h) jVar.get(i7)).f8792g.f8862k, true, false);
        }
        b0.m(b0Var, hVar);
        d(hVar);
        b0Var.r();
        b0Var.b();
    }

    public final void d(h hVar) {
        r6.k.f(hVar, "popUpTo");
        ReentrantLock reentrantLock = this.f8811a;
        reentrantLock.lock();
        try {
            q0 q0Var = this.f8812b;
            Iterable iterable = (Iterable) q0Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (r6.k.a((h) obj, hVar)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            q0Var.getClass();
            q0Var.l(null, arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(h hVar, boolean z8) {
        Object obj;
        r6.k.f(hVar, "popUpTo");
        q0 q0Var = this.f8813c;
        Iterable iterable = (Iterable) q0Var.getValue();
        boolean z9 = iterable instanceof Collection;
        f7.z zVar = this.f8815e;
        if (!z9 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((h) it.next()) == hVar) {
                    Iterable iterable2 = (Iterable) zVar.f3566f.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((h) it2.next()) == hVar) {
                        }
                    }
                    return;
                }
            }
        }
        q0Var.l(null, e6.g0.U((Set) q0Var.getValue(), hVar));
        q0 q0Var2 = zVar.f3566f;
        q0 q0Var3 = zVar.f3566f;
        List list = (List) q0Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            h hVar2 = (h) obj;
            if (!r6.k.a(hVar2, hVar) && ((List) q0Var3.getValue()).lastIndexOf(hVar2) < ((List) q0Var3.getValue()).lastIndexOf(hVar)) {
                break;
            }
        }
        h hVar3 = (h) obj;
        if (hVar3 != null) {
            q0Var.l(null, e6.g0.U((Set) q0Var.getValue(), hVar3));
        }
        c(hVar, z8);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [q6.c, r6.l] */
    public final void f(h hVar) {
        r6.k.f(hVar, "backStackEntry");
        b0 b0Var = this.f8818h;
        g0 b9 = b0Var.f8766v.b(hVar.f8792g.f8857f);
        if (!b9.equals(this.f8817g)) {
            Object obj = b0Var.f8767w.get(b9);
            if (obj == null) {
                throw new IllegalStateException(a0.m.m(new StringBuilder("NavigatorBackStack for "), hVar.f8792g.f8857f, " should already be created").toString());
            }
            ((k) obj).f(hVar);
            return;
        }
        ?? r02 = b0Var.f8768x;
        if (r02 != 0) {
            r02.f(hVar);
            a(hVar);
        } else {
            Log.i("NavController", "Ignoring add of destination " + hVar.f8792g + " outside of the call to navigate(). ");
        }
    }
}
