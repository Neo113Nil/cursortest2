package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ww0 {
    public final z PxuCJdSBwIXG;
    public boolean RAsUl2FVSrh6;
    public boolean TSizfFm2Yiuu;
    public boolean Y1f8riQaR6yg;
    public boolean a92UlCVFR9N8;
    public boolean e9gEMXR7LXtO;
    public z rtx2ld2ELZv4;
    public final /* synthetic */ int wdg6QnbFHrFF;
    public boolean lS5Rgt96tfkO = true;
    public final HashMap OPXfSBeufaJ8 = new HashMap();

    public ww0(z zVar, int i) {
        this.wdg6QnbFHrFF = i;
        this.PxuCJdSBwIXG = zVar;
    }

    public static final void PxuCJdSBwIXG(ww0 ww0Var, u uVar, int i, pd1 pd1Var) {
        HashMap hashMap = ww0Var.OPXfSBeufaJ8;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (ww0Var.wdg6QnbFHrFF) {
                    case 0:
                        ci1 ci1Var = pd1Var.zf8DYfih6EZu;
                        if (ci1Var != null) {
                            uh0 uh0Var = (uh0) ci1Var;
                            float[] lS5Rgt96tfkO = uh0Var.lS5Rgt96tfkO();
                            if (!uh0Var.IAToe7bXGz4N) {
                                j = d51.lS5Rgt96tfkO(j, lS5Rgt96tfkO);
                            }
                        }
                        j = vi0.zf8DYfih6EZu(j, pd1Var.ozEBbv0hFTAB);
                        break;
                    default:
                        w31 vfcx0XMziUg4 = pd1Var.vfcx0XMziUg4();
                        vfcx0XMziUg4.getClass();
                        long j2 = vfcx0XMziUg4.S2OOm9zPNm0h;
                        j = bf1.e9gEMXR7LXtO((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                pd1Var = pd1Var.ZbWwgt3aGe7A;
                pd1Var.getClass();
                if (pd1Var.equals(ww0Var.PxuCJdSBwIXG.BRwzKIf41E4i())) {
                    int round = Math.round(uVar instanceof ak0 ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
                    if (hashMap.containsKey(uVar)) {
                        int intValue = ((Number) w41.POWyO8hTM6YC(uVar, hashMap)).intValue();
                        ak0 ak0Var = x.PxuCJdSBwIXG;
                        round = ((Number) uVar.PxuCJdSBwIXG.rtx2ld2ELZv4(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(uVar, Integer.valueOf(round));
                    return;
                }
            } while (!ww0Var.lS5Rgt96tfkO(pd1Var).containsKey(uVar));
            float TSizfFm2Yiuu = ww0Var.TSizfFm2Yiuu(pd1Var, uVar);
            long floatToRawIntBits3 = Float.floatToRawIntBits(TSizfFm2Yiuu);
            long floatToRawIntBits4 = Float.floatToRawIntBits(TSizfFm2Yiuu);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final void RAsUl2FVSrh6() {
        HashMap hashMap = this.OPXfSBeufaJ8;
        hashMap.clear();
        y yVar = new y(0, this);
        z zVar = this.PxuCJdSBwIXG;
        zVar.x50lh2ztY7Y5(yVar);
        hashMap.putAll(lS5Rgt96tfkO(zVar.BRwzKIf41E4i()));
        this.lS5Rgt96tfkO = false;
    }

    public final int TSizfFm2Yiuu(pd1 pd1Var, u uVar) {
        switch (this.wdg6QnbFHrFF) {
            case 0:
                return pd1Var.yQRudnv4La6p(uVar);
            default:
                w31 vfcx0XMziUg4 = pd1Var.vfcx0XMziUg4();
                vfcx0XMziUg4.getClass();
                return vfcx0XMziUg4.yQRudnv4La6p(uVar);
        }
    }

    public final boolean Y1f8riQaR6yg() {
        return this.TSizfFm2Yiuu || this.e9gEMXR7LXtO || this.a92UlCVFR9N8 || this.RAsUl2FVSrh6;
    }

    public final void a92UlCVFR9N8() {
        this.lS5Rgt96tfkO = true;
        z zVar = this.PxuCJdSBwIXG;
        z XL4ISE6Oc65B = zVar.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B == null) {
            return;
        }
        if (this.TSizfFm2Yiuu) {
            XL4ISE6Oc65B.xbgXKYA2cIfu();
        } else if (this.e9gEMXR7LXtO || this.Y1f8riQaR6yg) {
            XL4ISE6Oc65B.requestLayout();
        }
        if (this.a92UlCVFR9N8) {
            zVar.xbgXKYA2cIfu();
        }
        if (this.RAsUl2FVSrh6) {
            zVar.requestLayout();
        }
        XL4ISE6Oc65B.PxuCJdSBwIXG().a92UlCVFR9N8();
    }

    public final boolean e9gEMXR7LXtO() {
        rtx2ld2ELZv4();
        return this.rtx2ld2ELZv4 != null;
    }

    public final Map lS5Rgt96tfkO(pd1 pd1Var) {
        switch (this.wdg6QnbFHrFF) {
            case 0:
                return pd1Var.IxJ9cAW40yOk().PxuCJdSBwIXG();
            default:
                w31 vfcx0XMziUg4 = pd1Var.vfcx0XMziUg4();
                vfcx0XMziUg4.getClass();
                return vfcx0XMziUg4.IxJ9cAW40yOk().PxuCJdSBwIXG();
        }
    }

    public final void rtx2ld2ELZv4() {
        ww0 PxuCJdSBwIXG;
        ww0 PxuCJdSBwIXG2;
        boolean Y1f8riQaR6yg = Y1f8riQaR6yg();
        z zVar = this.PxuCJdSBwIXG;
        if (!Y1f8riQaR6yg) {
            z XL4ISE6Oc65B = zVar.XL4ISE6Oc65B();
            if (XL4ISE6Oc65B == null) {
                return;
            }
            zVar = XL4ISE6Oc65B.PxuCJdSBwIXG().rtx2ld2ELZv4;
            if (zVar == null || !zVar.PxuCJdSBwIXG().Y1f8riQaR6yg()) {
                z zVar2 = this.rtx2ld2ELZv4;
                if (zVar2 == null || zVar2.PxuCJdSBwIXG().Y1f8riQaR6yg()) {
                    return;
                }
                z XL4ISE6Oc65B2 = zVar2.XL4ISE6Oc65B();
                if (XL4ISE6Oc65B2 != null && (PxuCJdSBwIXG2 = XL4ISE6Oc65B2.PxuCJdSBwIXG()) != null) {
                    PxuCJdSBwIXG2.rtx2ld2ELZv4();
                }
                z XL4ISE6Oc65B3 = zVar2.XL4ISE6Oc65B();
                zVar = (XL4ISE6Oc65B3 == null || (PxuCJdSBwIXG = XL4ISE6Oc65B3.PxuCJdSBwIXG()) == null) ? null : PxuCJdSBwIXG.rtx2ld2ELZv4;
            }
        }
        this.rtx2ld2ELZv4 = zVar;
    }
}
