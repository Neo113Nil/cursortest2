package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class lc {
    public int b;
    public boolean c;
    public final ad d;
    public final int e;
    public lc f;
    public e30 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public lc(ad adVar, int i) {
        this.d = adVar;
        this.e = i;
    }

    public final void a(lc lcVar, int i) {
        b(lcVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(lc lcVar, int i, int i2, boolean z) {
        if (lcVar == null) {
            j();
            return true;
        }
        if (!z && !i(lcVar)) {
            return false;
        }
        this.f = lcVar;
        if (lcVar.a == null) {
            lcVar.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ja0 ja0Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                e70.t(((lc) it.next()).d, i, arrayList, ja0Var);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        lc lcVar;
        if (this.d.g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (lcVar = this.f) == null || lcVar.d.g0 != 8) ? this.g : i;
    }

    public final lc f() {
        int i = this.e;
        int h = d30.h(i);
        ad adVar = this.d;
        switch (h) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return adVar.K;
            case 2:
                return adVar.L;
            case 3:
                return adVar.I;
            case 4:
                return adVar.J;
            default:
                throw new AssertionError(d30.g(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((lc) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(lc lcVar) {
        if (lcVar != null) {
            ad adVar = lcVar.d;
            int i = lcVar.e;
            int i2 = this.e;
            if (i != i2) {
                switch (d30.h(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(adVar instanceof om)) {
                            return z;
                        }
                        if (z || i == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(adVar instanceof om)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
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
                        throw new AssertionError(d30.g(i2));
                }
            } else if (i2 != 6 || (adVar.E && this.d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        lc lcVar = this.f;
        if (lcVar != null && (hashSet = lcVar.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        e30 e30Var = this.i;
        if (e30Var == null) {
            this.i = new e30(1);
        } else {
            e30Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + d30.g(this.e);
    }
}
