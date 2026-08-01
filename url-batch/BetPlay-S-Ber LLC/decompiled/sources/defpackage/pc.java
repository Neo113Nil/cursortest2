package defpackage;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class pc {
    public int b;
    public boolean c;
    public final ed d;
    public final int e;
    public pc f;
    public p30 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public pc(ed edVar, int i) {
        this.d = edVar;
        this.e = i;
    }

    public final void a(pc pcVar, int i) {
        b(pcVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(pc pcVar, int i, int i2, boolean z) {
        if (pcVar == null) {
            j();
            return true;
        }
        if (!z && !i(pcVar)) {
            return false;
        }
        this.f = pcVar;
        if (pcVar.a == null) {
            pcVar.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, qa0 qa0Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                op.t(((pc) it.next()).d, i, arrayList, qa0Var);
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
        pc pcVar;
        if (this.d.g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (pcVar = this.f) == null || pcVar.d.g0 != 8) ? this.g : i;
    }

    public final pc f() {
        int i = this.e;
        int i2 = o30.i(i);
        ed edVar = this.d;
        switch (i2) {
            case 0:
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
            case 7:
            case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                return null;
            case 1:
                return edVar.K;
            case 2:
                return edVar.L;
            case 3:
                return edVar.I;
            case 4:
                return edVar.J;
            default:
                throw new AssertionError(o30.h(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((pc) it.next()).f().h()) {
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
    public final boolean i(pc pcVar) {
        if (pcVar != null) {
            ed edVar = pcVar.d;
            int i = pcVar.e;
            int i2 = this.e;
            if (i != i2) {
                switch (o30.i(i2)) {
                    case 0:
                    case 7:
                    case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(edVar instanceof bn)) {
                            return z;
                        }
                        if (z || i == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(edVar instanceof bn)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                        }
                        break;
                    case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                        if (i == 2 || i == 4) {
                        }
                        break;
                    case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                        if (i == 6 || i == 8 || i == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(o30.h(i2));
                }
            } else if (i2 != 6 || (edVar.E && this.d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        pc pcVar = this.f;
        if (pcVar != null && (hashSet = pcVar.a) != null) {
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
        p30 p30Var = this.i;
        if (p30Var == null) {
            this.i = new p30(1);
        } else {
            p30Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + o30.h(this.e);
    }
}
