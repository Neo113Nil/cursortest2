package o4;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.w0;
import d6.b0;
import d7.e0;
import d7.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final p.b f5631a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f5632b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f5633c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5634d;

    /* renamed from: e, reason: collision with root package name */
    public final d7.y f5635e;

    /* renamed from: f, reason: collision with root package name */
    public final d7.y f5636f;

    /* renamed from: g, reason: collision with root package name */
    public final y f5637g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t f5638h;

    public g(t tVar, y yVar) {
        q6.i.e(yVar, "navigator");
        this.f5638h = tVar;
        this.f5631a = new p.b(3);
        n0 b8 = e0.b(d6.u.f2326d);
        this.f5632b = b8;
        n0 b9 = e0.b(d6.w.f2328d);
        this.f5633c = b9;
        this.f5635e = new d7.y(b8);
        this.f5636f = new d7.y(b9);
        this.f5637g = yVar;
    }

    public final void a(d dVar) {
        q6.i.e(dVar, "backStackEntry");
        synchronized (this.f5631a) {
            n0 n0Var = this.f5632b;
            ArrayList a02 = d6.m.a0((Collection) n0Var.getValue(), dVar);
            n0Var.getClass();
            n0Var.j(null, a02);
        }
    }

    public final d b(o oVar, Bundle bundle) {
        r4.g gVar = this.f5638h.f5685b;
        gVar.getClass();
        return w5.f.c(gVar.f6584a.f5686c, oVar, bundle, gVar.h(), gVar.f6597o);
    }

    public final void c(d dVar) {
        h hVar;
        q6.i.e(dVar, "entry");
        r4.g gVar = this.f5638h.f5685b;
        f fVar = new f(this, dVar);
        n0 n0Var = gVar.f6591h;
        String str = dVar.i;
        LinkedHashMap linkedHashMap = gVar.f6605w;
        boolean a8 = q6.i.a(linkedHashMap.get(dVar), Boolean.TRUE);
        fVar.b();
        linkedHashMap.remove(dVar);
        d6.k kVar = gVar.f6589f;
        if (kVar.contains(dVar)) {
            if (this.f5634d) {
                return;
            }
            gVar.s();
            n0 n0Var2 = gVar.f6590g;
            ArrayList h02 = d6.m.h0(kVar);
            n0Var2.getClass();
            n0Var2.j(null, h02);
            ArrayList p7 = gVar.p();
            n0Var.getClass();
            n0Var.j(null, p7);
            return;
        }
        gVar.r(dVar);
        if (dVar.f5626k.f6571j.f871c.compareTo(androidx.lifecycle.p.f849f) >= 0) {
            dVar.c(androidx.lifecycle.p.f847d);
        }
        if (!kVar.isEmpty()) {
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                if (q6.i.a(((d) it.next()).i, str)) {
                    break;
                }
            }
        }
        if (!a8 && (hVar = gVar.f6597o) != null) {
            q6.i.e(str, "backStackEntryId");
            w0 w0Var = (w0) hVar.f5639b.remove(str);
            if (w0Var != null) {
                w0Var.a();
            }
        }
        gVar.s();
        ArrayList p8 = gVar.p();
        n0Var.getClass();
        n0Var.j(null, p8);
    }

    public final void d(d dVar, boolean z3) {
        r4.g gVar = this.f5638h.f5685b;
        f fVar = new f(this, dVar, z3);
        gVar.getClass();
        y b8 = gVar.f6601s.b(dVar.f5621e.f5670d);
        gVar.f6605w.put(dVar, Boolean.valueOf(z3));
        if (!b8.equals(this.f5637g)) {
            Object obj = gVar.f6602t.get(b8);
            q6.i.b(obj);
            ((g) obj).d(dVar, z3);
            return;
        }
        r4.e eVar = gVar.f6604v;
        if (eVar != null) {
            eVar.i(dVar);
            fVar.b();
            return;
        }
        d6.k kVar = gVar.f6589f;
        int indexOf = kVar.indexOf(dVar);
        if (indexOf < 0) {
            String str = "Ignoring pop of " + dVar + " as it was not found on the current back stack";
            q6.i.e(str, "message");
            Log.i("NavController", str);
            return;
        }
        int i = indexOf + 1;
        if (i != kVar.f2322f) {
            gVar.m(((d) kVar.get(i)).f5621e.f5671e.f4348a, true, false);
        }
        r4.g.o(gVar, dVar);
        fVar.b();
        gVar.f6585b.b();
        gVar.b();
    }

    public final void e(d dVar, boolean z3) {
        Object obj;
        n0 n0Var = this.f5633c;
        Iterable iterable = (Iterable) n0Var.getValue();
        boolean z7 = iterable instanceof Collection;
        d7.y yVar = this.f5635e;
        if (!z7 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((d) it.next()) == dVar) {
                    Iterable iterable2 = (Iterable) yVar.f2430d.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((d) it2.next()) == dVar) {
                        }
                    }
                    return;
                }
            }
        }
        n0Var.j(null, b0.M((Set) n0Var.getValue(), dVar));
        n0 n0Var2 = yVar.f2430d;
        n0 n0Var3 = yVar.f2430d;
        List list = (List) n0Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            d dVar2 = (d) obj;
            if (!q6.i.a(dVar2, dVar) && ((List) n0Var3.getValue()).lastIndexOf(dVar2) < ((List) n0Var3.getValue()).lastIndexOf(dVar)) {
                break;
            }
        }
        d dVar3 = (d) obj;
        if (dVar3 != null) {
            n0Var.j(null, b0.M((Set) n0Var.getValue(), dVar3));
        }
        d(dVar, z3);
    }

    public final void f(d dVar) {
        q6.i.e(dVar, "backStackEntry");
        r4.g gVar = this.f5638h.f5685b;
        gVar.getClass();
        y b8 = gVar.f6601s.b(dVar.f5621e.f5670d);
        if (!b8.equals(this.f5637g)) {
            Object obj = gVar.f6602t.get(b8);
            if (obj != null) {
                ((g) obj).f(dVar);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + dVar.f5621e.f5670d + " should already be created").toString());
        }
        p6.c cVar = gVar.f6603u;
        if (cVar != null) {
            cVar.i(dVar);
            a(dVar);
            return;
        }
        String str = "Ignoring add of destination " + dVar.f5621e + " outside of the call to navigate(). ";
        q6.i.e(str, "message");
        Log.i("NavController", str);
    }
}
