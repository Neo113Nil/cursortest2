package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xe {
    public int b;
    public boolean c;
    public final rf d;
    public final we e;
    public xe f;
    public je0 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public xe(rf rfVar, we weVar) {
        this.d = rfVar;
        this.e = weVar;
    }

    public final void a(xe xeVar, int i) {
        b(xeVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(xe xeVar, int i, int i2, boolean z) {
        if (xeVar == null) {
            j();
            return true;
        }
        if (!z && !i(xeVar)) {
            return false;
        }
        this.f = xeVar;
        if (xeVar.a == null) {
            xeVar.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, sn0 sn0Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                mv.o(((xe) it.next()).d, i, arrayList, sn0Var);
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
        xe xeVar;
        if (this.d.h0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (xeVar = this.f) == null || xeVar.d.h0 != 8) ? this.g : i;
    }

    public final xe f() {
        we weVar = this.e;
        int ordinal = weVar.ordinal();
        rf rfVar = this.d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return rfVar.K;
            case 2:
                return rfVar.L;
            case 3:
                return rfVar.I;
            case 4:
                return rfVar.J;
            default:
                throw new AssertionError(weVar.name());
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((xe) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(xe xeVar) {
        if (xeVar != null) {
            rf rfVar = xeVar.d;
            we weVar = xeVar.e;
            we weVar2 = this.e;
            if (weVar != weVar2) {
                switch (weVar2) {
                    case NONE:
                    case CENTER_X:
                    case CENTER_Y:
                        break;
                    case LEFT:
                    case RIGHT:
                        boolean z = weVar == we.LEFT || weVar == we.RIGHT;
                        if (!(rfVar instanceof os)) {
                            return z;
                        }
                        if (z || weVar == we.CENTER_X) {
                        }
                        break;
                    case TOP:
                    case BOTTOM:
                        boolean z2 = weVar == we.TOP || weVar == we.BOTTOM;
                        if (!(rfVar instanceof os)) {
                            return z2;
                        }
                        if (z2 || weVar == we.CENTER_Y) {
                        }
                        break;
                    case BASELINE:
                        if (weVar == we.LEFT || weVar == we.RIGHT) {
                        }
                        break;
                    case CENTER:
                        if (weVar == we.BASELINE || weVar == we.CENTER_X || weVar == we.CENTER_Y) {
                        }
                        break;
                    default:
                        throw new AssertionError(weVar2.name());
                }
            } else if (weVar2 != we.BASELINE || (rfVar.E && this.d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        xe xeVar = this.f;
        if (xeVar != null && (hashSet = xeVar.a) != null) {
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
        je0 je0Var = this.i;
        if (je0Var == null) {
            this.i = new je0(ie0.UNRESTRICTED);
        } else {
            je0Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.i0 + ":" + this.e.toString();
    }
}
