package s;

import Y.V;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0287e;
import q.C0288f;
import t.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f3544b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3545c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3546e;

    /* renamed from: f, reason: collision with root package name */
    public c f3547f;
    public C0288f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3543a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3548g = 0;
    public int h = Integer.MIN_VALUE;

    public c(d dVar, int i) {
        this.d = dVar;
        this.f3546e = i;
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
        this.f3547f = cVar;
        if (cVar.f3543a == null) {
            cVar.f3543a = new HashSet();
        }
        HashSet hashSet = this.f3547f.f3543a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3548g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f3543a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                t.h.b(((c) it.next()).d, i, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f3545c) {
            return this.f3544b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.d.f3586g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (cVar = this.f3547f) == null || cVar.d.f3586g0 != 8) ? this.f3548g : i;
    }

    public final c f() {
        int i = this.f3546e;
        int a2 = AbstractC0287e.a(i);
        d dVar = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f3558K;
            case 2:
                return dVar.f3559L;
            case 3:
                return dVar.f3556I;
            case 4:
                return dVar.f3557J;
            default:
                throw new AssertionError(V.i(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3543a;
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
        return this.f3547f != null;
    }

    public final boolean i(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i = this.f3546e;
        d dVar = cVar.d;
        int i2 = cVar.f3546e;
        if (i2 == i) {
            return i != 6 || (dVar.f3553E && this.d.f3553E);
        }
        switch (AbstractC0287e.a(i)) {
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
        c cVar = this.f3547f;
        if (cVar != null && (hashSet = cVar.f3543a) != null) {
            hashSet.remove(this);
            if (this.f3547f.f3543a.size() == 0) {
                this.f3547f.f3543a = null;
            }
        }
        this.f3543a = null;
        this.f3547f = null;
        this.f3548g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3545c = false;
        this.f3544b = 0;
    }

    public final void k() {
        C0288f c0288f = this.i;
        if (c0288f == null) {
            this.i = new C0288f(1);
        } else {
            c0288f.c();
        }
    }

    public final void l(int i) {
        this.f3544b = i;
        this.f3545c = true;
    }

    public final String toString() {
        return this.d.f3587h0 + ":" + V.i(this.f3546e);
    }
}
