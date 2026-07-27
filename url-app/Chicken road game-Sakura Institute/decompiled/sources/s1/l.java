package s1;

import A.AbstractC0017m;
import A.f0;
import Z2.S;
import android.util.Log;
import androidx.lifecycle.EnumC0475o;
import androidx.lifecycle.Y;
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
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1405I;
import z2.C1407K;
import z2.C1411O;
import z2.C1416U;
import z2.C1433q;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f10527a;

    /* renamed from: b, reason: collision with root package name */
    public final S f10528b;

    /* renamed from: c, reason: collision with root package name */
    public final S f10529c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10530d;

    /* renamed from: e, reason: collision with root package name */
    public final Z2.B f10531e;

    /* renamed from: f, reason: collision with root package name */
    public final Z2.B f10532f;

    /* renamed from: g, reason: collision with root package name */
    public final H f10533g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1183B f10534h;

    public l(C1183B c1183b, H navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f10534h = c1183b;
        this.f10527a = new ReentrantLock(true);
        S c4 = Z2.H.c(C1405I.f11931d);
        this.f10528b = c4;
        S c5 = Z2.H.c(C1407K.f11933d);
        this.f10529c = c5;
        this.f10531e = new Z2.B(c4);
        this.f10532f = new Z2.B(c5);
        this.f10533g = navigator;
    }

    public final void a(C1193i backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f10527a;
        reentrantLock.lock();
        try {
            S s4 = this.f10528b;
            ArrayList A4 = C1403G.A((Collection) s4.getValue(), backStackEntry);
            s4.getClass();
            s4.l(null, A4);
            Unit unit = Unit.f7487a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C1193i entry) {
        p pVar;
        Intrinsics.checkNotNullParameter(entry, "entry");
        C1183B c1183b = this.f10534h;
        LinkedHashMap linkedHashMap = c1183b.f10461z;
        boolean a4 = Intrinsics.a(linkedHashMap.get(entry), Boolean.TRUE);
        Intrinsics.checkNotNullParameter(entry, "entry");
        S s4 = this.f10529c;
        Set set = (Set) s4.getValue();
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C1411O.a(set.size()));
        boolean z4 = false;
        for (Object obj : set) {
            boolean z5 = true;
            if (!z4 && Intrinsics.a(obj, entry)) {
                z4 = true;
                z5 = false;
            }
            if (z5) {
                linkedHashSet.add(obj);
            }
        }
        s4.l(null, linkedHashSet);
        linkedHashMap.remove(entry);
        C1433q c1433q = c1183b.f10442g;
        boolean contains = c1433q.contains(entry);
        S s5 = c1183b.f10444i;
        if (contains) {
            if (this.f10530d) {
                return;
            }
            c1183b.t();
            ArrayList I3 = C1403G.I(c1433q);
            S s6 = c1183b.f10443h;
            s6.getClass();
            s6.l(null, I3);
            ArrayList q2 = c1183b.q();
            s5.getClass();
            s5.l(null, q2);
            return;
        }
        c1183b.s(entry);
        if (entry.f10516n.f5496d.a(EnumC0475o.f5482i)) {
            entry.h(EnumC0475o.f5480d);
        }
        String backStackEntryId = entry.f10514l;
        if (c1433q == null || !c1433q.isEmpty()) {
            Iterator it = c1433q.iterator();
            while (it.hasNext()) {
                if (Intrinsics.a(((C1193i) it.next()).f10514l, backStackEntryId)) {
                    break;
                }
            }
        }
        if (!a4 && (pVar = c1183b.f10451p) != null) {
            Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
            Y y4 = (Y) pVar.f10543b.remove(backStackEntryId);
            if (y4 != null) {
                y4.a();
            }
        }
        c1183b.t();
        ArrayList q4 = c1183b.q();
        s5.getClass();
        s5.l(null, q4);
    }

    public final void c(C1193i popUpTo, boolean z4) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        C1183B c1183b = this.f10534h;
        H b4 = c1183b.f10457v.b(popUpTo.f10510e.f10570d);
        c1183b.f10461z.put(popUpTo, Boolean.valueOf(z4));
        if (!b4.equals(this.f10533g)) {
            Object obj = c1183b.f10458w.get(b4);
            Intrinsics.c(obj);
            ((l) obj).c(popUpTo, z4);
            return;
        }
        m mVar = c1183b.f10460y;
        if (mVar != null) {
            mVar.invoke(popUpTo);
            d(popUpTo);
            return;
        }
        f0 onComplete = new f0(this, popUpTo, z4);
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        C1433q c1433q = c1183b.f10442g;
        int indexOf = c1433q.indexOf(popUpTo);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i2 = indexOf + 1;
        if (i2 != c1433q.f11958i) {
            c1183b.n(((C1193i) c1433q.get(i2)).f10510e.f10575l, true, false);
        }
        C1183B.p(c1183b, popUpTo);
        onComplete.invoke();
        c1183b.u();
        c1183b.b();
    }

    public final void d(C1193i popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f10527a;
        reentrantLock.lock();
        try {
            S s4 = this.f10528b;
            Iterable iterable = (Iterable) s4.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (Intrinsics.a((C1193i) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            s4.getClass();
            s4.l(null, arrayList);
            Unit unit = Unit.f7487a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(C1193i popUpTo, boolean z4) {
        Object obj;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        S s4 = this.f10529c;
        Iterable iterable = (Iterable) s4.getValue();
        boolean z5 = iterable instanceof Collection;
        Z2.B b4 = this.f10531e;
        if (!z5 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C1193i) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) ((S) b4.f4611d).getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C1193i) it2.next()) == popUpTo) {
                        }
                    }
                    return;
                }
            }
        }
        s4.l(null, C1416U.a((Set) s4.getValue(), popUpTo));
        List list = (List) ((S) b4.f4611d).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            C1193i c1193i = (C1193i) obj;
            if (!Intrinsics.a(c1193i, popUpTo)) {
                Z2.z zVar = b4.f4611d;
                if (((List) ((S) zVar).getValue()).lastIndexOf(c1193i) < ((List) ((S) zVar).getValue()).lastIndexOf(popUpTo)) {
                    break;
                }
            }
        }
        C1193i c1193i2 = (C1193i) obj;
        if (c1193i2 != null) {
            s4.l(null, C1416U.a((Set) s4.getValue(), c1193i2));
        }
        c(popUpTo, z4);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [M2.p, kotlin.jvm.functions.Function1] */
    public final void f(C1193i backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        C1183B c1183b = this.f10534h;
        H b4 = c1183b.f10457v.b(backStackEntry.f10510e.f10570d);
        if (!b4.equals(this.f10533g)) {
            Object obj = c1183b.f10458w.get(b4);
            if (obj == null) {
                throw new IllegalStateException(AbstractC0017m.n(new StringBuilder("NavigatorBackStack for "), backStackEntry.f10510e.f10570d, " should already be created").toString());
            }
            ((l) obj).f(backStackEntry);
            return;
        }
        ?? r02 = c1183b.f10459x;
        if (r02 != 0) {
            r02.invoke(backStackEntry);
            a(backStackEntry);
        } else {
            Log.i("NavController", "Ignoring add of destination " + backStackEntry.f10510e + " outside of the call to navigate(). ");
        }
    }
}
