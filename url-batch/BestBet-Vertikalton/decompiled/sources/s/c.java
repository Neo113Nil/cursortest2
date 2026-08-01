package s;

import G1.AbstractC0001b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0309e;
import q.C0310f;
import t.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f3864b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3865c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3866e;

    /* renamed from: f, reason: collision with root package name */
    public c f3867f;
    public C0310f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3863a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3868g = 0;
    public int h = Integer.MIN_VALUE;

    public c(d dVar, int i) {
        this.d = dVar;
        this.f3866e = i;
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
        this.f3867f = cVar;
        if (cVar.f3863a == null) {
            cVar.f3863a = new HashSet();
        }
        HashSet hashSet = this.f3867f.f3863a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3868g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f3863a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                t.h.b(((c) it.next()).d, i, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f3865c) {
            return this.f3864b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.d.f3906g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (cVar = this.f3867f) == null || cVar.d.f3906g0 != 8) ? this.f3868g : i;
    }

    public final c f() {
        int i = this.f3866e;
        int a2 = AbstractC0309e.a(i);
        d dVar = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f3878K;
            case 2:
                return dVar.f3879L;
            case 3:
                return dVar.f3876I;
            case 4:
                return dVar.f3877J;
            default:
                throw new AssertionError(AbstractC0001b.k(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3863a;
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
        return this.f3867f != null;
    }

    public final boolean i(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i = this.f3866e;
        d dVar = cVar.d;
        int i2 = cVar.f3866e;
        if (i2 == i) {
            return i != 6 || (dVar.f3873E && this.d.f3873E);
        }
        switch (AbstractC0309e.a(i)) {
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
                throw new AssertionError(AbstractC0001b.k(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f3867f;
        if (cVar != null && (hashSet = cVar.f3863a) != null) {
            hashSet.remove(this);
            if (this.f3867f.f3863a.size() == 0) {
                this.f3867f.f3863a = null;
            }
        }
        this.f3863a = null;
        this.f3867f = null;
        this.f3868g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3865c = false;
        this.f3864b = 0;
    }

    public final void k() {
        C0310f c0310f = this.i;
        if (c0310f == null) {
            this.i = new C0310f(1);
        } else {
            c0310f.c();
        }
    }

    public final void l(int i) {
        this.f3864b = i;
        this.f3865c = true;
    }

    public final String toString() {
        return this.d.f3907h0 + ":" + AbstractC0001b.k(this.f3866e);
    }
}
