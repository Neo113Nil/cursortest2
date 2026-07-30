package defpackage;

import com.appsflyer.internal.l;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class je0 extends zl0 implements ad0 {
    public static final he0 v = new he0();
    public jf0 s;
    public ee t;
    public et0 u;

    public final boolean A0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int ordinal = op.I(this).D.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            l.a();
            return false;
        }
        if (i != 4) {
            dd0.j("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int ordinal2 = op.I(this).D.ordinal();
        if (ordinal2 == 0) {
            return true;
        }
        if (ordinal2 == 1) {
            return false;
        }
        l.a();
        return false;
    }

    @Override // defpackage.ad0
    public final wk0 P(ej0 ej0Var, qk0 qk0Var, long j) {
        zw0 c = qk0Var.c(j);
        return xk0.q(ej0Var, c.d, c.e, new aa(c, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001b, code lost:
    
        if (r4.u == defpackage.et0.d) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x000d, code lost:
    
        if (r4.u == defpackage.et0.e) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z0(fe0 fe0Var, int i) {
        if (i != 5 && i != 6) {
            if (i != 3 && i != 4) {
                if (i != 1 && i != 2) {
                    dd0.j("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
            }
            return !A0(i) ? fe0Var.a <= 0 : fe0Var.b >= this.s.a.g().n - 1;
        }
    }
}
