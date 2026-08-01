package s;

import androidx.fragment.app.w0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t.n;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f3228b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final d f3229d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3230e;

    /* renamed from: f, reason: collision with root package name */
    public c f3231f;

    /* renamed from: i, reason: collision with root package name */
    public q.f f3232i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3227a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public c(d dVar, int i4) {
        this.f3229d = dVar;
        this.f3230e = i4;
    }

    public final void a(c cVar, int i4) {
        b(cVar, i4, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i4, int i5, boolean z3) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z3 && !i(cVar)) {
            return false;
        }
        this.f3231f = cVar;
        if (cVar.f3227a == null) {
            cVar.f3227a = new HashSet();
        }
        HashSet hashSet = this.f3231f.f3227a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i4;
        this.h = i5;
        return true;
    }

    public final void c(int i4, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f3227a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                t.h.b(((c) it.next()).f3229d, i4, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.f3228b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f3229d.f3242g0 == 8) {
            return 0;
        }
        int i4 = this.h;
        return (i4 == Integer.MIN_VALUE || (cVar = this.f3231f) == null || cVar.f3229d.f3242g0 != 8) ? this.g : i4;
    }

    public final c f() {
        int i4 = this.f3230e;
        int a4 = q.e.a(i4);
        d dVar = this.f3229d;
        switch (a4) {
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
                throw new AssertionError(w0.i(i4));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3227a;
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
        return this.f3231f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(c cVar) {
        if (cVar != null) {
            d dVar = cVar.f3229d;
            int i4 = cVar.f3230e;
            int i5 = this.f3230e;
            if (i4 != i5) {
                switch (q.e.a(i5)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z3 = i4 == 2 || i4 == 4;
                        if (!(dVar instanceof h)) {
                            return z3;
                        }
                        if (z3 || i4 == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z4 = i4 == 3 || i4 == 5;
                        if (!(dVar instanceof h)) {
                            return z4;
                        }
                        if (z4 || i4 == 9) {
                        }
                        break;
                    case 5:
                        if (i4 == 2 || i4 == 4) {
                        }
                        break;
                    case 6:
                        if (i4 == 6 || i4 == 8 || i4 == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(w0.i(i5));
                }
            } else if (i5 != 6 || (dVar.E && this.f3229d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f3231f;
        if (cVar != null && (hashSet = cVar.f3227a) != null) {
            hashSet.remove(this);
            if (this.f3231f.f3227a.size() == 0) {
                this.f3231f.f3227a = null;
            }
        }
        this.f3227a = null;
        this.f3231f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.f3228b = 0;
    }

    public final void k() {
        q.f fVar = this.f3232i;
        if (fVar == null) {
            this.f3232i = new q.f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i4) {
        this.f3228b = i4;
        this.c = true;
    }

    public final String toString() {
        return this.f3229d.f3243h0 + ":" + w0.i(this.f3230e);
    }
}
