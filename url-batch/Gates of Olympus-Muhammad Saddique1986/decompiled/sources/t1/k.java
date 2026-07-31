package t1;

import F.C0129x0;
import android.util.Log;
import androidx.lifecycle.EnumC0286o;
import androidx.lifecycle.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import t2.AbstractC1035F;
import t2.C1030A;
import t2.C1045P;
import t2.InterfaceC1072y;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f8891a;

    /* renamed from: b, reason: collision with root package name */
    public final C1045P f8892b;

    /* renamed from: c, reason: collision with root package name */
    public final C1045P f8893c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8894d;

    /* renamed from: e, reason: collision with root package name */
    public final C1030A f8895e;

    /* renamed from: f, reason: collision with root package name */
    public final C1030A f8896f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1019G f8897g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1013A f8898h;

    public k(C1013A c1013a, AbstractC1019G abstractC1019G) {
        f2.j.f(abstractC1019G, "navigator");
        this.f8898h = c1013a;
        this.f8891a = new ReentrantLock(true);
        C1045P c2 = AbstractC1035F.c(S1.u.f4320d);
        this.f8892b = c2;
        C1045P c3 = AbstractC1035F.c(S1.w.f4322d);
        this.f8893c = c3;
        this.f8895e = new C1030A(c2);
        this.f8896f = new C1030A(c3);
        this.f8897g = abstractC1019G;
    }

    public final void a(C1028h c1028h) {
        f2.j.f(c1028h, "backStackEntry");
        ReentrantLock reentrantLock = this.f8891a;
        reentrantLock.lock();
        try {
            C1045P c1045p = this.f8892b;
            ArrayList T02 = S1.l.T0((Collection) c1045p.getValue(), c1028h);
            c1045p.getClass();
            c1045p.l(null, T02);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C1028h c1028h) {
        n nVar;
        f2.j.f(c1028h, "entry");
        C1013A c1013a = this.f8898h;
        boolean a3 = f2.j.a(c1013a.f8831z.get(c1028h), Boolean.TRUE);
        C1045P c1045p = this.f8893c;
        Set set = (Set) c1045p.getValue();
        f2.j.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(S1.B.J(set.size()));
        boolean z3 = false;
        for (Object obj : set) {
            boolean z4 = true;
            if (!z3 && f2.j.a(obj, c1028h)) {
                z3 = true;
                z4 = false;
            }
            if (z4) {
                linkedHashSet.add(obj);
            }
        }
        c1045p.l(null, linkedHashSet);
        c1013a.f8831z.remove(c1028h);
        S1.j jVar = c1013a.f8812g;
        boolean contains = jVar.contains(c1028h);
        C1045P c1045p2 = c1013a.f8814i;
        if (contains) {
            if (this.f8894d) {
                return;
            }
            c1013a.q();
            ArrayList b12 = S1.l.b1(jVar);
            C1045P c1045p3 = c1013a.f8813h;
            c1045p3.getClass();
            c1045p3.l(null, b12);
            ArrayList n3 = c1013a.n();
            c1045p2.getClass();
            c1045p2.l(null, n3);
            return;
        }
        c1013a.p(c1028h);
        if (c1028h.f8880k.f5242d.compareTo(EnumC0286o.f5228f) >= 0) {
            c1028h.h(EnumC0286o.f5226d);
        }
        String str = c1028h.f8878i;
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (it.hasNext()) {
                if (f2.j.a(((C1028h) it.next()).f8878i, str)) {
                    break;
                }
            }
        }
        if (!a3 && (nVar = c1013a.f8821p) != null) {
            f2.j.f(str, "backStackEntryId");
            a0 a0Var = (a0) nVar.f8902b.remove(str);
            if (a0Var != null) {
                a0Var.a();
            }
        }
        c1013a.q();
        ArrayList n4 = c1013a.n();
        c1045p2.getClass();
        c1045p2.l(null, n4);
    }

    public final void c(C1028h c1028h, boolean z3) {
        f2.j.f(c1028h, "popUpTo");
        C1013A c1013a = this.f8898h;
        AbstractC1019G b3 = c1013a.f8827v.b(c1028h.f8874e.f8931d);
        c1013a.f8831z.put(c1028h, Boolean.valueOf(z3));
        if (!b3.equals(this.f8897g)) {
            Object obj = c1013a.f8828w.get(b3);
            f2.j.c(obj);
            ((k) obj).c(c1028h, z3);
            return;
        }
        C0129x0 c0129x0 = c1013a.f8830y;
        if (c0129x0 != null) {
            c0129x0.n(c1028h);
            d(c1028h);
            return;
        }
        S1.j jVar = c1013a.f8812g;
        int indexOf = jVar.indexOf(c1028h);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + c1028h + " as it was not found on the current back stack");
            return;
        }
        int i3 = indexOf + 1;
        if (i3 != jVar.f4316f) {
            c1013a.k(((C1028h) jVar.get(i3)).f8874e.f8936i, true, false);
        }
        C1013A.m(c1013a, c1028h);
        d(c1028h);
        c1013a.r();
        c1013a.b();
    }

    public final void d(C1028h c1028h) {
        f2.j.f(c1028h, "popUpTo");
        ReentrantLock reentrantLock = this.f8891a;
        reentrantLock.lock();
        try {
            C1045P c1045p = this.f8892b;
            Iterable iterable = (Iterable) c1045p.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (f2.j.a((C1028h) obj, c1028h)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            c1045p.getClass();
            c1045p.l(null, arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(C1028h c1028h, boolean z3) {
        Object obj;
        f2.j.f(c1028h, "popUpTo");
        C1045P c1045p = this.f8893c;
        Iterable iterable = (Iterable) c1045p.getValue();
        boolean z4 = iterable instanceof Collection;
        C1030A c1030a = this.f8895e;
        if (!z4 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C1028h) it.next()) == c1028h) {
                    Iterable iterable2 = (Iterable) ((C1045P) c1030a.f8956d).getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C1028h) it2.next()) == c1028h) {
                        }
                    }
                    return;
                }
            }
        }
        c1045p.l(null, S1.D.b0((Set) c1045p.getValue(), c1028h));
        List list = (List) ((C1045P) c1030a.f8956d).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            C1028h c1028h2 = (C1028h) obj;
            if (!f2.j.a(c1028h2, c1028h)) {
                InterfaceC1072y interfaceC1072y = c1030a.f8956d;
                if (((List) ((C1045P) interfaceC1072y).getValue()).lastIndexOf(c1028h2) < ((List) ((C1045P) interfaceC1072y).getValue()).lastIndexOf(c1028h)) {
                    break;
                }
            }
        }
        C1028h c1028h3 = (C1028h) obj;
        if (c1028h3 != null) {
            c1045p.l(null, S1.D.b0((Set) c1045p.getValue(), c1028h3));
        }
        c(c1028h, z3);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [e2.c, f2.k] */
    public final void f(C1028h c1028h) {
        f2.j.f(c1028h, "backStackEntry");
        C1013A c1013a = this.f8898h;
        AbstractC1019G b3 = c1013a.f8827v.b(c1028h.f8874e.f8931d);
        if (!b3.equals(this.f8897g)) {
            Object obj = c1013a.f8828w.get(b3);
            if (obj != null) {
                ((k) obj).f(c1028h);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + c1028h.f8874e.f8931d + " should already be created").toString());
        }
        ?? r02 = c1013a.f8829x;
        if (r02 != 0) {
            r02.n(c1028h);
            a(c1028h);
        } else {
            Log.i("NavController", "Ignoring add of destination " + c1028h.f8874e + " outside of the call to navigate(). ");
        }
    }
}
