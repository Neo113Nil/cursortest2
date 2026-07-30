package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class nc0 {
    public static final Object[] TSizfFm2Yiuu;
    public static final float[] PxuCJdSBwIXG = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile s82 lS5Rgt96tfkO = new s82();

    static {
        Object[] objArr = new Object[0];
        TSizfFm2Yiuu = objArr;
        synchronized (objArr) {
            lS5Rgt96tfkO.Y1f8riQaR6yg(115, new pc0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            lS5Rgt96tfkO.Y1f8riQaR6yg(130, new pc0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            lS5Rgt96tfkO.Y1f8riQaR6yg(150, new pc0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            lS5Rgt96tfkO.Y1f8riQaR6yg(180, new pc0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            lS5Rgt96tfkO.Y1f8riQaR6yg(200, new pc0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((lS5Rgt96tfkO.TSizfFm2Yiuu(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        gp0.lS5Rgt96tfkO("You should only apply non-linear scaling to font scales > 1");
    }

    public static mc0 PxuCJdSBwIXG(float f) {
        float TSizfFm2Yiuu2;
        mc0 mc0Var;
        float[] fArr = PxuCJdSBwIXG;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        mc0 mc0Var2 = (mc0) lS5Rgt96tfkO.lS5Rgt96tfkO(i);
        if (mc0Var2 != null) {
            return mc0Var2;
        }
        s82 s82Var = lS5Rgt96tfkO;
        if (s82Var.rtx2ld2ELZv4) {
            zv.wdg6QnbFHrFF(s82Var);
        }
        int VhhvGxCb8gfr = mm2.VhhvGxCb8gfr(s82Var.OPXfSBeufaJ8, s82Var.dgRBjINgWbAK, i);
        if (VhhvGxCb8gfr >= 0) {
            return (mc0) lS5Rgt96tfkO.a92UlCVFR9N8(VhhvGxCb8gfr);
        }
        int i2 = -(VhhvGxCb8gfr + 1);
        int i3 = i2 - 1;
        if (i2 >= lS5Rgt96tfkO.e9gEMXR7LXtO()) {
            pc0 pc0Var = new pc0(new float[]{1.0f}, new float[]{f});
            lS5Rgt96tfkO(f, pc0Var);
            return pc0Var;
        }
        if (i3 < 0) {
            mc0Var = new pc0(fArr, fArr);
            TSizfFm2Yiuu2 = 1.0f;
        } else {
            TSizfFm2Yiuu2 = lS5Rgt96tfkO.TSizfFm2Yiuu(i3) / 100.0f;
            mc0Var = (mc0) lS5Rgt96tfkO.a92UlCVFR9N8(i3);
        }
        float TSizfFm2Yiuu3 = lS5Rgt96tfkO.TSizfFm2Yiuu(i2) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, TSizfFm2Yiuu2 == TSizfFm2Yiuu3 ? 0.0f : (f - TSizfFm2Yiuu2) / (TSizfFm2Yiuu3 - TSizfFm2Yiuu2))) * 1.0f) + 0.0f;
        mc0 mc0Var3 = (mc0) lS5Rgt96tfkO.a92UlCVFR9N8(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float lS5Rgt96tfkO2 = mc0Var.lS5Rgt96tfkO(f2);
            fArr2[i4] = ((mc0Var3.lS5Rgt96tfkO(f2) - lS5Rgt96tfkO2) * max) + lS5Rgt96tfkO2;
        }
        pc0 pc0Var2 = new pc0(fArr, fArr2);
        lS5Rgt96tfkO(f, pc0Var2);
        return pc0Var2;
    }

    public static void lS5Rgt96tfkO(float f, pc0 pc0Var) {
        synchronized (TSizfFm2Yiuu) {
            s82 clone = lS5Rgt96tfkO.clone();
            clone.Y1f8riQaR6yg((int) (f * 100.0f), pc0Var);
            lS5Rgt96tfkO = clone;
        }
    }
}
