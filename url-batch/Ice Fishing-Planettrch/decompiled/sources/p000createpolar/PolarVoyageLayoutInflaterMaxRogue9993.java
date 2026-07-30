package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageLayoutInflaterMaxRogue9993 {
    public static final float[] PolarVoyageZipVortexCelestial6185;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float[] fArr = new float[101];
        PolarVoyageZipVortexCelestial6185 = fArr;
        float[] fArr2 = new float[101];
        float f10 = 0.0f;
        int i = 0;
        float f11 = 0.0f;
        while (true) {
            float f12 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f13 = i / 100.0f;
            float f14 = 1.0f;
            while (true) {
                f = ((f14 - f10) / 2.0f) + f10;
                f2 = f12 - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f15 = (((f * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                f5 = f12;
                if (Math.abs(f15 - f13) < 1.0E-5d) {
                    break;
                }
                if (f15 > f13) {
                    f14 = f;
                } else {
                    f10 = f;
                }
                f12 = f5;
            }
            float f16 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f17 = f5;
            while (true) {
                f6 = ((f17 - f11) / 2.0f) + f11;
                f7 = f5 - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f18 = (((f7 * f16) + f6) * f8) + f9;
                float f19 = f17;
                if (Math.abs(f18 - f13) >= 1.0E-5d) {
                    if (f18 > f13) {
                        f17 = f6;
                    } else {
                        f11 = f6;
                        f17 = f19;
                    }
                    f16 = 0.5f;
                }
            }
            fArr2[i] = (((f6 * 0.35000002f) + (f7 * 0.175f)) * f8) + f9;
            i++;
        }
    }

    public static PolarVoyageMLKitNeoUltra6003 PolarVoyageZipVortexCelestial6185(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float PolarVoyageAlertDialogCyberHeroQuantum3938 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageAlertDialogCyberHeroQuantum3938(f, 0.0f, 1.0f);
        int i = (int) (100.0f * PolarVoyageAlertDialogCyberHeroQuantum3938);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = PolarVoyageZipVortexCelestial6185;
            float f5 = fArr[i];
            float f6 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            float f7 = ((PolarVoyageAlertDialogCyberHeroQuantum3938 - f4) * f6) + f5;
            f2 = f6;
            f3 = f7;
        }
        return new PolarVoyageMLKitNeoUltra6003(f3, f2);
    }
}
