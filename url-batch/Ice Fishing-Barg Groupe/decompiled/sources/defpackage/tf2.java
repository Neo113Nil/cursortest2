package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tf2 {
    public static void PxuCJdSBwIXG(gi giVar, long j, df1 df1Var, ji2 ji2Var, j4 j4Var) {
        r4 r4Var;
        int lS5Rgt96tfkO = df1Var.lS5Rgt96tfkO(vi2.a92UlCVFR9N8(j));
        int lS5Rgt96tfkO2 = df1Var.lS5Rgt96tfkO(vi2.e9gEMXR7LXtO(j));
        if (lS5Rgt96tfkO != lS5Rgt96tfkO2) {
            r71 r71Var = ji2Var.lS5Rgt96tfkO;
            v8 v8Var = (v8) r71Var.PxuCJdSBwIXG.lS5Rgt96tfkO;
            if (lS5Rgt96tfkO < 0 || lS5Rgt96tfkO > lS5Rgt96tfkO2 || lS5Rgt96tfkO2 > v8Var.OPXfSBeufaJ8.length()) {
                fp0.PxuCJdSBwIXG("Start(" + lS5Rgt96tfkO + ") or End(" + lS5Rgt96tfkO2 + ") is out of range [0.." + v8Var.OPXfSBeufaJ8.length() + "), or start > end!");
            }
            if (lS5Rgt96tfkO == lS5Rgt96tfkO2) {
                r4Var = t4.PxuCJdSBwIXG();
            } else {
                r4 PxuCJdSBwIXG = t4.PxuCJdSBwIXG();
                kj0.S9EYkSpbGuxq(r71Var.rtx2ld2ELZv4, jh0.rtx2ld2ELZv4(lS5Rgt96tfkO, lS5Rgt96tfkO2), new h61(PxuCJdSBwIXG, lS5Rgt96tfkO, lS5Rgt96tfkO2, 2));
                r4Var = PxuCJdSBwIXG;
            }
            giVar.a92UlCVFR9N8(r4Var, j4Var);
        }
    }

    public static void lS5Rgt96tfkO(oh2 oh2Var, lf2 lf2Var, ji2 ji2Var, bw0 bw0Var, ei2 ei2Var, boolean z, df1 df1Var) {
        long PxuCJdSBwIXG;
        qt1 qt1Var;
        if (z) {
            int lS5Rgt96tfkO = df1Var.lS5Rgt96tfkO(vi2.e9gEMXR7LXtO(oh2Var.lS5Rgt96tfkO));
            String str = vf2.PxuCJdSBwIXG;
            if (lS5Rgt96tfkO < ji2Var.PxuCJdSBwIXG.PxuCJdSBwIXG.OPXfSBeufaJ8.length()) {
                qt1Var = ji2Var.lS5Rgt96tfkO(lS5Rgt96tfkO);
            } else if (lS5Rgt96tfkO != 0) {
                qt1Var = ji2Var.lS5Rgt96tfkO(lS5Rgt96tfkO - 1);
            } else {
                PxuCJdSBwIXG = vf2.PxuCJdSBwIXG(lf2Var.lS5Rgt96tfkO, lf2Var.RAsUl2FVSrh6, lf2Var.rtx2ld2ELZv4, vf2.PxuCJdSBwIXG, 1);
                qt1Var = new qt1(0.0f, 0.0f, 1.0f, (int) (PxuCJdSBwIXG & 4294967295L));
            }
            float f = qt1Var.lS5Rgt96tfkO;
            float f2 = qt1Var.PxuCJdSBwIXG;
            long Pf0ThKz3j5YS = bw0Var.Pf0ThKz3j5YS((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (Pf0ThKz3j5YS >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (Pf0ThKz3j5YS & 4294967295L));
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            float f3 = qt1Var.TSizfFm2Yiuu - f2;
            float f4 = qt1Var.Y1f8riQaR6yg - f;
            qt1 PxuCJdSBwIXG2 = xi0.PxuCJdSBwIXG(floatToRawIntBits, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
            if (cs0.wdg6QnbFHrFF((ei2) ei2Var.PxuCJdSBwIXG.lS5Rgt96tfkO.get(), ei2Var)) {
                ei2Var.lS5Rgt96tfkO.rtx2ld2ELZv4(PxuCJdSBwIXG2);
            }
        }
    }
}
