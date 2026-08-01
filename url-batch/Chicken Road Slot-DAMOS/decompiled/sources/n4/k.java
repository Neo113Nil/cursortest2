package n4;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import je.l0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.o0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final k5.c f7077a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f7078b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f7079c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7080d;

    /* renamed from: e, reason: collision with root package name */
    public final je.w f7081e;

    /* renamed from: f, reason: collision with root package name */
    public final je.w f7082f;
    public final h0 g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f7083h;

    public k(x xVar, h0 h0Var) {
        h0Var.getClass();
        this.f7083h = xVar;
        this.f7077a = new k5.c(15);
        l0 b10 = je.b0.b(j0.f5574d);
        this.f7078b = b10;
        l0 b11 = je.b0.b(kotlin.collections.l0.f5576d);
        this.f7079c = b11;
        this.f7081e = je.b0.e(b10);
        this.f7082f = je.b0.e(b11);
        this.g = h0Var;
    }

    public final void a(h hVar) {
        hVar.getClass();
        synchronized (this.f7077a) {
            l0 l0Var = this.f7078b;
            l0Var.k(null, CollectionsKt.F((Collection) l0Var.getValue(), hVar));
        }
    }

    public final h b(s sVar, Bundle bundle) {
        q4.h hVar = this.f7083h.f7130b;
        hVar.getClass();
        return k5.c.h(hVar.f7994a.f7131c, sVar, bundle, hVar.j(), hVar.f8006o);
    }

    public final void c(h hVar) {
        l lVar;
        hVar.getClass();
        q4.h hVar2 = this.f7083h.f7130b;
        l0 l0Var = hVar2.f8000h;
        LinkedHashMap linkedHashMap = hVar2.f8014w;
        boolean a9 = Intrinsics.a(linkedHashMap.get(hVar), Boolean.TRUE);
        l0 l0Var2 = this.f7079c;
        Set set = (Set) l0Var2.getValue();
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(o0.a(set.size()));
        boolean z10 = false;
        for (Object obj : set) {
            boolean z11 = true;
            if (!z10 && Intrinsics.a(obj, hVar)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj);
            }
        }
        l0Var2.k(null, linkedHashSet);
        linkedHashMap.remove(hVar);
        kotlin.collections.s sVar = hVar2.f7999f;
        if (sVar.contains(hVar)) {
            if (this.f7080d) {
                return;
            }
            hVar2.t();
            l0 l0Var3 = hVar2.g;
            ArrayList arrayList = new ArrayList(sVar);
            l0Var3.getClass();
            l0Var3.k(null, arrayList);
            ArrayList q3 = hVar2.q();
            l0Var.getClass();
            l0Var.k(null, q3);
            return;
        }
        hVar2.s(hVar);
        String str = hVar.f7067t;
        q4.c cVar = hVar.f7069v;
        if (cVar.j.f737c.compareTo(androidx.lifecycle.p.f709i) >= 0) {
            cVar.f7978k = androidx.lifecycle.p.f707d;
            cVar.b();
        }
        if (!sVar.isEmpty()) {
            Iterator it = sVar.iterator();
            while (it.hasNext()) {
                if (Intrinsics.a(((h) it.next()).f7067t, str)) {
                    break;
                }
            }
        }
        if (!a9 && (lVar = hVar2.f8006o) != null) {
            str.getClass();
            z0 z0Var = (z0) lVar.f7084b.remove(str);
            if (z0Var != null) {
                z0Var.a();
            }
        }
        hVar2.t();
        ArrayList q7 = hVar2.q();
        l0Var.getClass();
        l0Var.k(null, q7);
    }

    public final void d(h hVar, boolean z10) {
        hVar.getClass();
        q4.h hVar2 = this.f7083h.f7130b;
        a4.a aVar = new a4.a(this, hVar, z10);
        hVar2.getClass();
        h0 b10 = hVar2.f8010s.b(hVar.f7063e.f7114d);
        hVar2.f8014w.put(hVar, Boolean.valueOf(z10));
        if (!b10.equals(this.g)) {
            Object obj = hVar2.f8011t.get(b10);
            obj.getClass();
            ((k) obj).d(hVar, z10);
            return;
        }
        q4.d dVar = hVar2.f8013v;
        if (dVar != null) {
            dVar.invoke(hVar);
            aVar.invoke();
            return;
        }
        kotlin.collections.s sVar = hVar2.f7999f;
        int indexOf = sVar.indexOf(hVar);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + hVar + " as it was not found on the current back stack");
            return;
        }
        int i3 = indexOf + 1;
        if (i3 != sVar.f5583i) {
            hVar2.n(((h) sVar.get(i3)).f7063e.f7115e.f1694a, true, false);
        }
        q4.h.p(hVar2, hVar);
        aVar.invoke();
        hVar2.f7995b.invoke();
        hVar2.b();
    }

    public final void e(h hVar, boolean z10) {
        Object obj;
        hVar.getClass();
        l0 l0Var = this.f7079c;
        Iterable iterable = (Iterable) l0Var.getValue();
        boolean z11 = iterable instanceof Collection;
        je.w wVar = this.f7081e;
        if (!z11 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((h) it.next()) == hVar) {
                    Iterable iterable2 = (Iterable) wVar.f5239d.getValue();
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
        l0Var.k(null, w0.c((Set) l0Var.getValue(), hVar));
        l0 l0Var2 = wVar.f5239d;
        l0 l0Var3 = wVar.f5239d;
        List list = (List) l0Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            h hVar2 = (h) obj;
            if (!Intrinsics.a(hVar2, hVar) && ((List) l0Var3.getValue()).lastIndexOf(hVar2) < ((List) l0Var3.getValue()).lastIndexOf(hVar)) {
                break;
            }
        }
        h hVar3 = (h) obj;
        if (hVar3 != null) {
            l0Var.k(null, w0.c((Set) l0Var.getValue(), hVar3));
        }
        d(hVar, z10);
    }

    public final void f(h hVar) {
        hVar.getClass();
        q4.h hVar2 = this.f7083h.f7130b;
        hVar2.getClass();
        h0 b10 = hVar2.f8010s.b(hVar.f7063e.f7114d);
        if (!b10.equals(this.g)) {
            Object obj = hVar2.f8011t.get(b10);
            if (obj == null) {
                throw new IllegalStateException(v4.a.o(new StringBuilder("NavigatorBackStack for "), hVar.f7063e.f7114d, " should already be created").toString());
            }
            ((k) obj).f(hVar);
            return;
        }
        Function1 function1 = hVar2.f8012u;
        if (function1 != null) {
            function1.invoke(hVar);
            a(hVar);
        } else {
            Log.i("NavController", "Ignoring add of destination " + hVar.f7063e + " outside of the call to navigate(). ");
        }
    }
}
