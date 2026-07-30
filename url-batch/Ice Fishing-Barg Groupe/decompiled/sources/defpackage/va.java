package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class va {
    public static final void PxuCJdSBwIXG(va vaVar, xa xaVar) {
        vaVar.getClass();
        if (xa.OPXfSBeufaJ8 == null) {
            xa.OPXfSBeufaJ8 = new xa();
            wa waVar = new wa("Okio Watchdog");
            waVar.setDaemon(true);
            waVar.start();
        }
        long nanoTime = System.nanoTime();
        long j = xaVar.TSizfFm2Yiuu;
        boolean z = xaVar.PxuCJdSBwIXG;
        if (j != 0 && z) {
            xaVar.RAsUl2FVSrh6 = Math.min(j, xaVar.TSizfFm2Yiuu() - nanoTime) + nanoTime;
        } else if (j != 0) {
            xaVar.RAsUl2FVSrh6 = nanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            xaVar.RAsUl2FVSrh6 = xaVar.TSizfFm2Yiuu();
        }
        um umVar = xa.rtx2ld2ELZv4;
        int i = umVar.lS5Rgt96tfkO + 1;
        umVar.lS5Rgt96tfkO = i;
        xa[] xaVarArr = (xa[]) umVar.TSizfFm2Yiuu;
        if (i == xaVarArr.length) {
            xa[] xaVarArr2 = new xa[i * 2];
            na.hVNtCUZb4tYH(xaVarArr, xaVarArr2, 0, 0, 14);
            umVar.TSizfFm2Yiuu = xaVarArr2;
        }
        umVar.a92UlCVFR9N8(i, xaVar);
        if (xaVar.a92UlCVFR9N8 == 1) {
            xa.dgRBjINgWbAK.signal();
        }
    }

    public static xa lS5Rgt96tfkO() {
        um umVar = xa.rtx2ld2ELZv4;
        xa xaVar = ((xa[]) umVar.TSizfFm2Yiuu)[1];
        if (xaVar == null) {
            long nanoTime = System.nanoTime();
            xa.dgRBjINgWbAK.await(xa.x50lh2ztY7Y5, TimeUnit.MILLISECONDS);
            if (((xa[]) umVar.TSizfFm2Yiuu)[1] != null || System.nanoTime() - nanoTime < xa.cpQdD2nAriOS) {
                return null;
            }
            return xa.OPXfSBeufaJ8;
        }
        long nanoTime2 = xaVar.RAsUl2FVSrh6 - System.nanoTime();
        if (nanoTime2 > 0) {
            xa.dgRBjINgWbAK.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        umVar.x50lh2ztY7Y5(xaVar);
        xaVar.e9gEMXR7LXtO = 2;
        return xaVar;
    }
}
