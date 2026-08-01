package t;

import Z.V;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import r.AbstractC0290e;
import r.C0291f;
import u.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f3745b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3746c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3747e;

    /* renamed from: f, reason: collision with root package name */
    public c f3748f;
    public C0291f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3744a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3749g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f3750h = Integer.MIN_VALUE;

    public c(d dVar, int i) {
        this.d = dVar;
        this.f3747e = i;
    }

    public final void a(c cVar, int i) {
        b(cVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i, int i2, boolean z2) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z2 && !i(cVar)) {
            return false;
        }
        this.f3748f = cVar;
        if (cVar.f3744a == null) {
            cVar.f3744a = new HashSet();
        }
        HashSet hashSet = this.f3748f.f3744a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3749g = i;
        this.f3750h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f3744a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                u.h.b(((c) it.next()).d, i, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f3746c) {
            return this.f3745b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.d.f3788g0 == 8) {
            return 0;
        }
        int i = this.f3750h;
        return (i == Integer.MIN_VALUE || (cVar = this.f3748f) == null || cVar.d.f3788g0 != 8) ? this.f3749g : i;
    }

    public final c f() {
        int i = this.f3747e;
        int a2 = AbstractC0290e.a(i);
        d dVar = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f3760K;
            case 2:
                return dVar.f3761L;
            case 3:
                return dVar.f3758I;
            case 4:
                return dVar.f3759J;
            default:
                throw new AssertionError(V.i(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3744a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f3748f != null;
    }

    public final boolean i(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i = this.f3747e;
        d dVar = cVar.d;
        int i2 = cVar.f3747e;
        if (i2 == i) {
            return i != 6 || (dVar.f3755E && this.d.f3755E);
        }
        switch (AbstractC0290e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (dVar instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (dVar instanceof h) {
                    return z3 || i2 == 9;
                }
                return z3;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(V.i(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f3748f;
        if (cVar != null && (hashSet = cVar.f3744a) != null) {
            hashSet.remove(this);
            if (this.f3748f.f3744a.size() == 0) {
                this.f3748f.f3744a = null;
            }
        }
        this.f3744a = null;
        this.f3748f = null;
        this.f3749g = 0;
        this.f3750h = Integer.MIN_VALUE;
        this.f3746c = false;
        this.f3745b = 0;
    }

    public final void k() {
        C0291f c0291f = this.i;
        if (c0291f == null) {
            this.i = new C0291f(1);
        } else {
            c0291f.c();
        }
    }

    public final void l(int i) {
        this.f3745b = i;
        this.f3746c = true;
    }

    public final String toString() {
        return this.d.f3790h0 + ":" + V.i(this.f3747e);
    }
}
