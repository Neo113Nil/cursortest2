package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cb1 implements zl1 {
    public static final ab1 e = new ab1();
    public final db1 a;
    public final mp b;
    public final u81 c;
    public final ww1 d;

    public cb1(db1 db1Var, mp mpVar, u81 u81Var, ww1 ww1Var) {
        this.a = db1Var;
        this.b = mpVar;
        this.c = u81Var;
        this.d = ww1Var;
    }

    @Override // defpackage.zl1
    public final u52 getKey() {
        return wn.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0019, code lost:
    
        if (r2 == defpackage.ww1.m) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x000d, code lost:
    
        if (r2 == defpackage.ww1.n) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(za1 za1Var, int i) {
        ww1 ww1Var = this.d;
        if (i != 5 && i != 6) {
            if (i != 3 && i != 4) {
                if (i != 1 && i != 2) {
                    lh.g("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
            }
            return !m(i) ? za1Var.a <= 0 : za1Var.b >= this.a.b() - 1;
        }
    }

    public final boolean m(int i) {
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i != 5) {
                if (i != 6) {
                    u81 u81Var = this.c;
                    if (i == 3) {
                        int ordinal = u81Var.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                a.b();
                                return false;
                            }
                        }
                    } else {
                        if (i != 4) {
                            lh.g("Lazy list does not support beyond bounds layout for the specified direction");
                            return false;
                        }
                        int ordinal2 = u81Var.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                a.b();
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.zl1
    public final Object getValue() {
        return this;
    }
}
