package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ld {
    public int b;
    public boolean c;
    public final ae d;
    public final int e;
    public ld f;
    public g60 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public ld(ae aeVar, int i) {
        this.d = aeVar;
        this.e = i;
    }

    public final void a(ld ldVar, int i) {
        b(ldVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(ld ldVar, int i, int i2, boolean z) {
        if (ldVar == null) {
            j();
            return true;
        }
        if (!z && !i(ldVar)) {
            return false;
        }
        this.f = ldVar;
        if (ldVar.a == null) {
            ldVar.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, qd0 qd0Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                b9.n(((ld) it.next()).d, i, arrayList, qd0Var);
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
        ld ldVar;
        if (this.d.g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (ldVar = this.f) == null || ldVar.d.g0 != 8) ? this.g : i;
    }

    public final ld f() {
        int i = this.e;
        int j = f60.j(i);
        ae aeVar = this.d;
        switch (j) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return aeVar.K;
            case 2:
                return aeVar.L;
            case 3:
                return aeVar.I;
            case 4:
                return aeVar.J;
            default:
                throw new AssertionError(f60.i(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ld) it.next()).f().h()) {
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
    public final boolean i(ld ldVar) {
        if (ldVar != null) {
            ae aeVar = ldVar.d;
            int i = ldVar.e;
            int i2 = this.e;
            if (i != i2) {
                switch (f60.j(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(aeVar instanceof yo)) {
                            return z;
                        }
                        if (z || i == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(aeVar instanceof yo)) {
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
                        throw new AssertionError(f60.i(i2));
                }
            } else if (i2 != 6 || (aeVar.E && this.d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        ld ldVar = this.f;
        if (ldVar != null && (hashSet = ldVar.a) != null) {
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
        g60 g60Var = this.i;
        if (g60Var == null) {
            this.i = new g60(1);
        } else {
            g60Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + f60.i(this.e);
    }
}
