package q1;

import android.util.Log;
import androidx.lifecycle.EnumC0230o;
import androidx.lifecycle.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import n2.AbstractC0682G;
import n2.C0676A;
import n2.C0692Q;
import n2.InterfaceC0719y;

/* renamed from: q1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0787k {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f6912a;

    /* renamed from: b, reason: collision with root package name */
    public final C0692Q f6913b;

    /* renamed from: c, reason: collision with root package name */
    public final C0692Q f6914c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6915d;

    /* renamed from: e, reason: collision with root package name */
    public final C0676A f6916e;

    /* renamed from: f, reason: collision with root package name */
    public final C0676A f6917f;

    /* renamed from: g, reason: collision with root package name */
    public final J f6918g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0775D f6919h;

    public C0787k(C0775D c0775d, J j3) {
        Z1.i.f(j3, "navigator");
        this.f6919h = c0775d;
        this.f6912a = new ReentrantLock(true);
        C0692Q b2 = AbstractC0682G.b(M1.u.f2803d);
        this.f6913b = b2;
        C0692Q b3 = AbstractC0682G.b(M1.w.f2805d);
        this.f6914c = b3;
        this.f6916e = new C0676A(b2);
        this.f6917f = new C0676A(b3);
        this.f6918g = j3;
    }

    public final void a(C0784h c0784h) {
        Z1.i.f(c0784h, "backStackEntry");
        ReentrantLock reentrantLock = this.f6912a;
        reentrantLock.lock();
        try {
            C0692Q c0692q = this.f6913b;
            ArrayList v0 = M1.l.v0((Collection) c0692q.getValue(), c0784h);
            c0692q.getClass();
            c0692q.k(null, v0);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C0784h c0784h) {
        p pVar;
        Z1.i.f(c0784h, "entry");
        C0775D c0775d = this.f6919h;
        boolean a3 = Z1.i.a(c0775d.f6852z.get(c0784h), Boolean.TRUE);
        C0692Q c0692q = this.f6914c;
        Set set = (Set) c0692q.getValue();
        Z1.i.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(M1.B.I(set.size()));
        boolean z3 = false;
        for (Object obj : set) {
            boolean z4 = true;
            if (!z3 && Z1.i.a(obj, c0784h)) {
                z3 = true;
                z4 = false;
            }
            if (z4) {
                linkedHashSet.add(obj);
            }
        }
        c0692q.k(null, linkedHashSet);
        c0775d.f6852z.remove(c0784h);
        M1.j jVar = c0775d.f6834g;
        boolean contains = jVar.contains(c0784h);
        C0692Q c0692q2 = c0775d.f6836i;
        if (contains) {
            if (this.f6915d) {
                return;
            }
            c0775d.s();
            ArrayList D02 = M1.l.D0(jVar);
            C0692Q c0692q3 = c0775d.f6835h;
            c0692q3.getClass();
            c0692q3.k(null, D02);
            ArrayList p = c0775d.p();
            c0692q2.getClass();
            c0692q2.k(null, p);
            return;
        }
        c0775d.r(c0784h);
        if (c0784h.f6901k.f4041d.compareTo(EnumC0230o.f4027f) >= 0) {
            c0784h.h(EnumC0230o.f4025d);
        }
        String str = c0784h.f6899i;
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (it.hasNext()) {
                if (Z1.i.a(((C0784h) it.next()).f6899i, str)) {
                    break;
                }
            }
        }
        if (!a3 && (pVar = c0775d.p) != null) {
            Z1.i.f(str, "backStackEntryId");
            a0 a0Var = (a0) pVar.f6933b.remove(str);
            if (a0Var != null) {
                a0Var.a();
            }
        }
        c0775d.s();
        ArrayList p3 = c0775d.p();
        c0692q2.getClass();
        c0692q2.k(null, p3);
    }

    public final void c(C0784h c0784h, boolean z3) {
        Z1.i.f(c0784h, "popUpTo");
        C0775D c0775d = this.f6919h;
        J b2 = c0775d.f6848v.b(c0784h.f6895e.f6962d);
        c0775d.f6852z.put(c0784h, Boolean.valueOf(z3));
        if (!b2.equals(this.f6918g)) {
            Object obj = c0775d.f6849w.get(b2);
            Z1.i.c(obj);
            ((C0787k) obj).c(c0784h, z3);
            return;
        }
        C0788l c0788l = c0775d.f6851y;
        if (c0788l != null) {
            c0788l.j(c0784h);
            d(c0784h);
            return;
        }
        M1.j jVar = c0775d.f6834g;
        int indexOf = jVar.indexOf(c0784h);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + c0784h + " as it was not found on the current back stack");
            return;
        }
        int i3 = indexOf + 1;
        if (i3 != jVar.f2799f) {
            c0775d.m(((C0784h) jVar.get(i3)).f6895e.f6967i, true, false);
        }
        C0775D.o(c0775d, c0784h);
        d(c0784h);
        c0775d.t();
        c0775d.b();
    }

    public final void d(C0784h c0784h) {
        Z1.i.f(c0784h, "popUpTo");
        ReentrantLock reentrantLock = this.f6912a;
        reentrantLock.lock();
        try {
            C0692Q c0692q = this.f6913b;
            Iterable iterable = (Iterable) c0692q.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (Z1.i.a((C0784h) obj, c0784h)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            c0692q.getClass();
            c0692q.k(null, arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(C0784h c0784h, boolean z3) {
        Object obj;
        Z1.i.f(c0784h, "popUpTo");
        C0692Q c0692q = this.f6914c;
        Iterable iterable = (Iterable) c0692q.getValue();
        boolean z4 = iterable instanceof Collection;
        C0676A c0676a = this.f6916e;
        if (!z4 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C0784h) it.next()) == c0784h) {
                    Iterable iterable2 = (Iterable) ((C0692Q) c0676a.f6272d).getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C0784h) it2.next()) == c0784h) {
                        }
                    }
                    return;
                }
            }
        }
        c0692q.k(null, M1.E.O((Set) c0692q.getValue(), c0784h));
        List list = (List) ((C0692Q) c0676a.f6272d).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            C0784h c0784h2 = (C0784h) obj;
            if (!Z1.i.a(c0784h2, c0784h)) {
                InterfaceC0719y interfaceC0719y = c0676a.f6272d;
                if (((List) ((C0692Q) interfaceC0719y).getValue()).lastIndexOf(c0784h2) < ((List) ((C0692Q) interfaceC0719y).getValue()).lastIndexOf(c0784h)) {
                    break;
                }
            }
        }
        C0784h c0784h3 = (C0784h) obj;
        if (c0784h3 != null) {
            c0692q.k(null, M1.E.O((Set) c0692q.getValue(), c0784h3));
        }
        c(c0784h, z3);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [Y1.c, Z1.j] */
    public final void f(C0784h c0784h) {
        Z1.i.f(c0784h, "backStackEntry");
        C0775D c0775d = this.f6919h;
        J b2 = c0775d.f6848v.b(c0784h.f6895e.f6962d);
        if (!b2.equals(this.f6918g)) {
            Object obj = c0775d.f6849w.get(b2);
            if (obj != null) {
                ((C0787k) obj).f(c0784h);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + c0784h.f6895e.f6962d + " should already be created").toString());
        }
        ?? r02 = c0775d.f6850x;
        if (r02 != 0) {
            r02.j(c0784h);
            a(c0784h);
        } else {
            Log.i("NavController", "Ignoring add of destination " + c0784h.f6895e + " outside of the call to navigate(). ");
        }
    }
}
