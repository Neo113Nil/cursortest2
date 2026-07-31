package y2;

import a0.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import z2.n;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f8740b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8741c;

    /* renamed from: d, reason: collision with root package name */
    public final d f8742d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8743e;

    /* renamed from: f, reason: collision with root package name */
    public c f8744f;
    public w2.f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f8739a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f8745g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f8746h = Integer.MIN_VALUE;

    public c(d dVar, int i) {
        this.f8742d = dVar;
        this.f8743e = i;
    }

    public final void a(c cVar, int i) {
        b(cVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i, int i8, boolean z3) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z3 && !i(cVar)) {
            return false;
        }
        this.f8744f = cVar;
        if (cVar.f8739a == null) {
            cVar.f8739a = new HashSet();
        }
        HashSet hashSet = this.f8744f.f8739a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f8745g = i;
        this.f8746h = i8;
        return true;
    }

    public final void c(int i, ArrayList arrayList, n nVar) {
        HashSet hashSet = this.f8739a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                z2.h.b(((c) it.next()).f8742d, i, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f8741c) {
            return this.f8740b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f8742d.f8760g0 == 8) {
            return 0;
        }
        int i = this.f8746h;
        return (i == Integer.MIN_VALUE || (cVar = this.f8744f) == null || cVar.f8742d.f8760g0 != 8) ? this.f8745g : i;
    }

    public final c f() {
        int i = this.f8743e;
        int a8 = w2.e.a(i);
        d dVar = this.f8742d;
        switch (a8) {
            case 0:
            case 5:
            case 6:
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case 1:
                return dVar.K;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return dVar.L;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return dVar.I;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return dVar.J;
            default:
                throw new AssertionError(q.r(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f8739a;
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
        return this.f8744f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(c cVar) {
        if (cVar != null) {
            d dVar = cVar.f8742d;
            int i = cVar.f8743e;
            int i8 = this.f8743e;
            if (i != i8) {
                switch (w2.e.a(i8)) {
                    case 0:
                    case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                        break;
                    case 1:
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        boolean z3 = i == 2 || i == 4;
                        if (!(dVar instanceof h)) {
                            return z3;
                        }
                        if (z3 || i == 8) {
                        }
                        break;
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        boolean z7 = i == 3 || i == 5;
                        if (!(dVar instanceof h)) {
                            return z7;
                        }
                        if (z7 || i == 9) {
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
                        throw new AssertionError(q.r(i8));
                }
            } else if (i8 != 6 || (dVar.E && this.f8742d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f8744f;
        if (cVar != null && (hashSet = cVar.f8739a) != null) {
            hashSet.remove(this);
            if (this.f8744f.f8739a.size() == 0) {
                this.f8744f.f8739a = null;
            }
        }
        this.f8739a = null;
        this.f8744f = null;
        this.f8745g = 0;
        this.f8746h = Integer.MIN_VALUE;
        this.f8741c = false;
        this.f8740b = 0;
    }

    public final void k() {
        w2.f fVar = this.i;
        if (fVar == null) {
            this.i = new w2.f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i) {
        this.f8740b = i;
        this.f8741c = true;
    }

    public final String toString() {
        return this.f8742d.f8762h0 + ":" + q.r(this.f8743e);
    }
}
