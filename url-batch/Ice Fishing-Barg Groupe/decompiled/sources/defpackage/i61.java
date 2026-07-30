package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class i61 extends m61 implements aq, kw0 {
    public LinkedHashMap VhhvGxCb8gfr;

    @Override // defpackage.kw0
    public final k51 e9gEMXR7LXtO(l51 l51Var, e51 e51Var, long j) {
        float f = ((k10) f2.QrzZRwfaDlRX(this, nr0.TSizfFm2Yiuu)).rtx2ld2ELZv4;
        if (f < 0.0f) {
            f = 0.0f;
        }
        em1 e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(j);
        boolean z = this.S9EYkSpbGuxq && !Float.isNaN(f) && k10.PxuCJdSBwIXG(f, 0.0f) > 0;
        int POWyO8hTM6YC = !Float.isNaN(f) ? l51Var.POWyO8hTM6YC(f) : 0;
        int i = e9gEMXR7LXtO.rtx2ld2ELZv4;
        if (z) {
            i = Math.max(i, POWyO8hTM6YC);
        }
        int i2 = e9gEMXR7LXtO.OPXfSBeufaJ8;
        if (z) {
            i2 = Math.max(i2, POWyO8hTM6YC);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.VhhvGxCb8gfr;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.VhhvGxCb8gfr = linkedHashMap;
            }
            fq2 fq2Var = nr0.lS5Rgt96tfkO;
            int round = Math.round((POWyO8hTM6YC - e9gEMXR7LXtO.rtx2ld2ELZv4) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(fq2Var, Integer.valueOf(round));
            ak0 ak0Var = nr0.PxuCJdSBwIXG;
            int round2 = Math.round((POWyO8hTM6YC - e9gEMXR7LXtO.OPXfSBeufaJ8) / 2.0f);
            linkedHashMap.put(ak0Var, Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        Map map = this.VhhvGxCb8gfr;
        if (map == null) {
            map = q50.rtx2ld2ELZv4;
        }
        return l51Var.jJwa0q7P5wHq(i, i2, map, new h61(i, i2, e9gEMXR7LXtO));
    }
}
