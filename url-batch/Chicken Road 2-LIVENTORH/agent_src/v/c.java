package v;

import androidx.fragment.app.w0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w.n;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f3385b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3386c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3387e;

    /* renamed from: f, reason: collision with root package name */
    public c f3388f;
    public t.f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3384a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3389g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f3390h = Integer.MIN_VALUE;

    public c(d dVar, int i) {
        this.d = dVar;
        this.f3387e = i;
    }

    public final void a(c cVar, int i) {
        b(cVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i, int i4, boolean z3) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z3 && !i(cVar)) {
            return false;
        }
        this.f3388f = cVar;
        if (cVar.f3384a == null) {
            cVar.f3384a = new HashSet();
        }
        HashSet hashSet = this.f3388f.f3384a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3389g = i;
        this.f3390h = i4;
        return true;
    }

    public final void c(int i, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f3384a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                w.h.b(((c) it.next()).d, i, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f3386c) {
            return this.f3385b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.d.f3402g0 == 8) {
            return 0;
        }
        int i = this.f3390h;
        return (i == Integer.MIN_VALUE || (cVar = this.f3388f) == null || cVar.d.f3402g0 != 8) ? this.f3389g : i;
    }

    public final c f() {
        int i = this.f3387e;
        int a2 = t.e.a(i);
        d dVar = this.d;
        switch (a2) {
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
                throw new AssertionError(w0.g(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3384a;
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
        return this.f3388f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(c cVar) {
        if (cVar != null) {
            d dVar = cVar.d;
            int i = cVar.f3387e;
            int i4 = this.f3387e;
            if (i != i4) {
                switch (t.e.a(i4)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z3 = i == 2 || i == 4;
                        if (!(dVar instanceof h)) {
                            return z3;
                        }
                        if (z3 || i == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z4 = i == 3 || i == 5;
                        if (!(dVar instanceof h)) {
                            return z4;
                        }
                        if (z4 || i == 9) {
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
                        throw new AssertionError(w0.g(i4));
                }
            } else if (i4 != 6 || (dVar.E && this.d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f3388f;
        if (cVar != null && (hashSet = cVar.f3384a) != null) {
            hashSet.remove(this);
            if (this.f3388f.f3384a.size() == 0) {
                this.f3388f.f3384a = null;
            }
        }
        this.f3384a = null;
        this.f3388f = null;
        this.f3389g = 0;
        this.f3390h = Integer.MIN_VALUE;
        this.f3386c = false;
        this.f3385b = 0;
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
        this.f3385b = i;
        this.f3386c = true;
    }

    public final String toString() {
        return this.d.f3404h0 + ":" + w0.g(this.f3387e);
    }
}
