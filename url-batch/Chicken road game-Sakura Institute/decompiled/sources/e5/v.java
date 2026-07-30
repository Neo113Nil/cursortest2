package e5;

import android.R;
import android.view.Menu;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import r1.z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2800a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2801b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2802c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2803d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2804e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2805f;

    public v(z0 z0Var) {
        this.f2800a = z0Var;
        this.f2801b = y0.d.f9779e;
        this.f2802c = null;
        this.f2803d = null;
        this.f2804e = null;
        this.f2805f = null;
    }

    public static void i(int i7, Menu menu) {
        int i8;
        int d8 = l.h.d(i7);
        int d9 = l.h.d(i7);
        int d10 = l.h.d(i7);
        if (d10 == 0) {
            i8 = R.string.copy;
        } else if (d10 == 1) {
            i8 = R.string.paste;
        } else if (d10 == 2) {
            i8 = R.string.cut;
        } else {
            if (d10 != 3) {
                throw new b4.c();
            }
            i8 = R.string.selectAll;
        }
        menu.add(0, d8, d9, i8).setShowAsAction(1);
    }

    public static void j(Menu menu, int i7, q6.a aVar) {
        if (aVar != null && menu.findItem(l.h.d(i7)) == null) {
            i(i7, menu);
        } else {
            if (aVar != null || menu.findItem(l.h.d(i7)) == null) {
                return;
            }
            menu.removeItem(l.h.d(i7));
        }
    }

    @Override // e5.d
    public Object a(Class cls) {
        if (!((Set) this.f2800a).contains(t.a(cls))) {
            throw new b4.c("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a3 = ((d) this.f2805f).a(cls);
        if (!cls.equals(x5.a.class)) {
            return a3;
        }
        return new u();
    }

    @Override // e5.d
    public z5.b b(t tVar) {
        if (((Set) this.f2801b).contains(tVar)) {
            return ((d) this.f2805f).b(tVar);
        }
        throw new b4.c("Attempting to request an undeclared dependency Provider<" + tVar + ">.");
    }

    @Override // e5.d
    public z5.b c(t tVar) {
        if (((Set) this.f2804e).contains(tVar)) {
            return ((d) this.f2805f).c(tVar);
        }
        throw new b4.c("Attempting to request an undeclared dependency Provider<Set<" + tVar + ">>.");
    }

    @Override // e5.d
    public Object d(t tVar) {
        if (((Set) this.f2800a).contains(tVar)) {
            return ((d) this.f2805f).d(tVar);
        }
        throw new b4.c("Attempting to request an undeclared dependency " + tVar + ".");
    }

    @Override // e5.d
    public z5.b e(Class cls) {
        return b(t.a(b6.b.class));
    }

    @Override // e5.d
    public Set f(t tVar) {
        if (((Set) this.f2803d).contains(tVar)) {
            return ((d) this.f2805f).f(tVar);
        }
        throw new b4.c("Attempting to request an undeclared dependency Set<" + tVar + ">.");
    }

    @Override // e5.d
    public r g(t tVar) {
        if (((Set) this.f2802c).contains(tVar)) {
            return ((d) this.f2805f).g(tVar);
        }
        throw new b4.c("Attempting to request an undeclared dependency Deferred<" + tVar + ">.");
    }

    @Override // e5.d
    public r h(Class cls) {
        return g(t.a(cls));
    }

    public v(c cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<l> set = cVar.f2762c;
        Set set2 = cVar.f2765f;
        for (l lVar : set) {
            int i7 = lVar.f2787c;
            int i8 = lVar.f2786b;
            boolean z8 = i7 == 0;
            t tVar = lVar.f2785a;
            if (z8) {
                if (i8 == 2) {
                    hashSet4.add(tVar);
                } else {
                    hashSet.add(tVar);
                }
            } else if (i7 == 2) {
                hashSet3.add(tVar);
            } else if (i8 == 2) {
                hashSet5.add(tVar);
            } else {
                hashSet2.add(tVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(t.a(x5.a.class));
        }
        this.f2800a = Collections.unmodifiableSet(hashSet);
        this.f2801b = Collections.unmodifiableSet(hashSet2);
        this.f2802c = Collections.unmodifiableSet(hashSet3);
        this.f2803d = Collections.unmodifiableSet(hashSet4);
        this.f2804e = Collections.unmodifiableSet(hashSet5);
        this.f2805f = dVar;
    }

    public v(v7.d dVar) {
        r6.k.f(dVar, "taskRunner");
        this.f2800a = dVar;
        this.f2805f = z7.h.f10163a;
    }
}
