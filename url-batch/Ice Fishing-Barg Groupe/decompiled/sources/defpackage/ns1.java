package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ns1 extends td2 {
    public final /* synthetic */ Object a92UlCVFR9N8;
    public final /* synthetic */ int e9gEMXR7LXtO = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns1(vs1 vs1Var) {
        super(o0.gPXPFXrUH4XX(new StringBuilder(), vs1Var.cpQdD2nAriOS, " writer"), true);
        this.a92UlCVFR9N8 = vs1Var;
    }

    @Override // defpackage.td2
    public final long PxuCJdSBwIXG() {
        switch (this.e9gEMXR7LXtO) {
            case 0:
                os1 os1Var = (os1) this.a92UlCVFR9N8;
                long nanoTime = System.nanoTime();
                long j = (nanoTime - os1Var.PxuCJdSBwIXG) + 1;
                Iterator it = os1Var.Y1f8riQaR6yg.iterator();
                it.getClass();
                ls1 ls1Var = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                ls1 ls1Var2 = null;
                ls1 ls1Var3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    ls1 ls1Var4 = (ls1) it.next();
                    ls1Var4.getClass();
                    synchronized (ls1Var4) {
                        if (os1Var.PxuCJdSBwIXG(ls1Var4, nanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = ls1Var4.XL4ISE6Oc65B;
                            if (j3 < j) {
                                ls1Var2 = ls1Var4;
                                j = j3;
                            }
                            i++;
                            if (j3 < j2) {
                                ls1Var3 = ls1Var4;
                                j2 = j3;
                            }
                        }
                    }
                }
                if (ls1Var2 != null) {
                    ls1Var = ls1Var2;
                } else if (i > 5) {
                    j = j2;
                    ls1Var = ls1Var3;
                } else {
                    j = -1;
                }
                if (ls1Var == null) {
                    if (ls1Var3 != null) {
                        return (j2 + os1Var.PxuCJdSBwIXG) - nanoTime;
                    }
                    if (i2 > 0) {
                        return os1Var.PxuCJdSBwIXG;
                    }
                    return -1L;
                }
                synchronized (ls1Var) {
                    if (ls1Var.BRwzKIf41E4i.isEmpty() && ls1Var.XL4ISE6Oc65B == j) {
                        ls1Var.dgRBjINgWbAK = true;
                        os1Var.Y1f8riQaR6yg.remove(ls1Var);
                        mv2.TSizfFm2Yiuu(ls1Var.e9gEMXR7LXtO);
                        if (os1Var.Y1f8riQaR6yg.isEmpty()) {
                            zd2 zd2Var = os1Var.lS5Rgt96tfkO;
                            synchronized (zd2Var.PxuCJdSBwIXG) {
                                if (zd2Var.PxuCJdSBwIXG()) {
                                    zd2Var.PxuCJdSBwIXG.TSizfFm2Yiuu(zd2Var);
                                }
                            }
                        }
                    }
                }
                return 0L;
            default:
                vs1 vs1Var = (vs1) this.a92UlCVFR9N8;
                try {
                } catch (IOException e) {
                    vs1.TSizfFm2Yiuu(vs1Var, e, 2);
                }
                return vs1Var.a92UlCVFR9N8() ? 0L : -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns1(os1 os1Var, String str) {
        super(str, true);
        this.a92UlCVFR9N8 = os1Var;
    }
}
