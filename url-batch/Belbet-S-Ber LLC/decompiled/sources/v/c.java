package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w.n;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f3606b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3607c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3608e;

    /* renamed from: f, reason: collision with root package name */
    public c f3609f;
    public t.f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3605a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3610g = 0;
    public int h = Integer.MIN_VALUE;

    public c(d dVar, int i) {
        this.d = dVar;
        this.f3608e = i;
    }

    public final void a(c cVar, int i) {
        b(cVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i, int i4, boolean z4) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z4 && !i(cVar)) {
            return false;
        }
        this.f3609f = cVar;
        if (cVar.f3605a == null) {
            cVar.f3605a = new HashSet();
        }
        HashSet hashSet = this.f3609f.f3605a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3610g = i;
        this.h = i4;
        return true;
    }

    public final void c(int i, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f3605a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                w.h.b(((c) it.next()).d, i, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f3607c) {
            return this.f3606b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.d.f3622g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (cVar = this.f3609f) == null || cVar.d.f3622g0 != 8) ? this.f3610g : i;
    }

    public final c f() {
        int i = this.f3608e;
        int a5 = t.e.a(i);
        d dVar = this.d;
        switch (a5) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.K;
            case 2:
                return dVar.L;
            case 3:
                return dVar.I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(a4.b.j(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3605a;
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
        return this.f3609f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(c cVar) {
        if (cVar != null) {
            d dVar = cVar.d;
            int i = cVar.f3608e;
            int i4 = this.f3608e;
            if (i != i4) {
                switch (t.e.a(i4)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z4 = i == 2 || i == 4;
                        if (!(dVar instanceof h)) {
                            return z4;
                        }
                        if (z4 || i == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z5 = i == 3 || i == 5;
                        if (!(dVar instanceof h)) {
                            return z5;
                        }
                        if (z5 || i == 9) {
                        }
                        break;
                    case 5:
                        if (i == 2 || i == 4) {
                        }
                        break;
                    case 6:
                        if (i == 6 || i == 8 || i == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(a4.b.j(i4));
                }
            } else if (i4 != 6 || (dVar.E && this.d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f3609f;
        if (cVar != null && (hashSet = cVar.f3605a) != null) {
            hashSet.remove(this);
            if (this.f3609f.f3605a.size() == 0) {
                this.f3609f.f3605a = null;
            }
        }
        this.f3605a = null;
        this.f3609f = null;
        this.f3610g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3607c = false;
        this.f3606b = 0;
    }

    public final void k() {
        t.f fVar = this.i;
        if (fVar == null) {
            this.i = new t.f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i) {
        this.f3606b = i;
        this.f3607c = true;
    }

    public final String toString() {
        return this.d.f3623h0 + ":" + a4.b.j(this.f3608e);
    }
}
