package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wx0 extends m61 implements kw0 {
    public static final ux0 Companion = new ux0();
    public static final tx0 pnx5pC0XzaCw = new tx0();
    public ef S2OOm9zPNm0h;
    public vy0 VhhvGxCb8gfr;
    public th1 ZbWwgt3aGe7A;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0020, code lost:
    
        if (r4.ZbWwgt3aGe7A == defpackage.th1.rtx2ld2ELZv4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0012, code lost:
    
        if (r4.ZbWwgt3aGe7A == defpackage.th1.OPXfSBeufaJ8) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W7ceZOzvrRuI(rx0 rx0Var, int i) {
        ld.Companion.getClass();
        if (i != 5 && i != 6) {
            if (i != 3 && i != 4) {
                if (i != 1 && i != 2) {
                    u9.rtx2ld2ELZv4("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
            }
            return !X1HMmH2Ks65g(i) ? rx0Var.PxuCJdSBwIXG <= 0 : rx0Var.lS5Rgt96tfkO >= this.VhhvGxCb8gfr.PxuCJdSBwIXG.RAsUl2FVSrh6().r3s1LDPKFs1S - 1;
        }
    }

    public final boolean X1HMmH2Ks65g(int i) {
        ld.Companion.getClass();
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
            int ordinal = zv.zf8DYfih6EZu(this).BjEWd04qc7Mw.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            u9.gPXPFXrUH4XX();
            return false;
        }
        if (i != 4) {
            u9.rtx2ld2ELZv4("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int ordinal2 = zv.zf8DYfih6EZu(this).BjEWd04qc7Mw.ordinal();
        if (ordinal2 == 0) {
            return true;
        }
        if (ordinal2 == 1) {
            return false;
        }
        u9.gPXPFXrUH4XX();
        return false;
    }

    @Override // defpackage.kw0
    public final k51 e9gEMXR7LXtO(l51 l51Var, e51 e51Var, long j) {
        em1 e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(j);
        return l51Var.jJwa0q7P5wHq(e9gEMXR7LXtO.rtx2ld2ELZv4, e9gEMXR7LXtO.OPXfSBeufaJ8, q50.rtx2ld2ELZv4, new pa(e9gEMXR7LXtO, 4));
    }
}
