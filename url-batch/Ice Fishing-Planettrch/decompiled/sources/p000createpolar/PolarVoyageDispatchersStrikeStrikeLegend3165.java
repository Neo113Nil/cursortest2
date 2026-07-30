package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDispatchersStrikeStrikeLegend3165 extends PolarVoyageFontFamilyHyperionStorm1277 {
    public final /* synthetic */ int PolarVoyageBarcodeScannerInfernoSolarSpark7767;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PolarVoyageDispatchersStrikeStrikeLegend3165(int i, int i2, long j, String str) {
        super(i, j, str);
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2;
    }

    @Override // p000createpolar.PolarVoyageFontFamilyHyperionStorm1277
    public final long PolarVoyageBarcodeScannerInfernoSolarSpark7767(float f, float f2, float f3) {
        long floatToRawIntBits;
        long j;
        switch (this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f2 < -128.0f) {
                    f2 = -128.0f;
                }
                if (f2 > 128.0f) {
                    f2 = 128.0f;
                }
                float f4 = (f + 16.0f) / 116.0f;
                float f5 = (f2 * 0.002f) + f4;
                float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
                float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
                float[] fArr = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageStrictModeLegendEpic1532;
                float f8 = f6 * fArr[0];
                float f9 = f7 * fArr[1];
                long floatToRawIntBits2 = Float.floatToRawIntBits(f8);
                floatToRawIntBits = Float.floatToRawIntBits(f9);
                j = floatToRawIntBits2 << 32;
                break;
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                float f10 = f2 <= 2.0f ? f2 : 2.0f;
                long floatToRawIntBits3 = Float.floatToRawIntBits(f);
                floatToRawIntBits = Float.floatToRawIntBits(f10);
                j = floatToRawIntBits3 << 32;
                break;
        }
        return j | (floatToRawIntBits & 4294967295L);
    }

    @Override // p000createpolar.PolarVoyageFontFamilyHyperionStorm1277
    public final float PolarVoyageBitmapVisionAuroraPixel4705(float f, float f2, float f3) {
        switch (this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f3 < -128.0f) {
                    f3 = -128.0f;
                }
                if (f3 > 128.0f) {
                    f3 = 128.0f;
                }
                float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
                return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageStrictModeLegendEpic1532[2];
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    return 2.0f;
                }
                return f3;
        }
    }

    @Override // p000createpolar.PolarVoyageFontFamilyHyperionStorm1277
    public final long PolarVoyageDiffUtilTurboStrike5735(float f, float f2, float f3, float f4, PolarVoyageFontFamilyHyperionStorm1277 polarVoyageFontFamilyHyperionStorm1277) {
        switch (this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                float[] fArr = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageStrictModeLegendEpic1532;
                float f5 = f / fArr[0];
                float f6 = f2 / fArr[1];
                float f7 = f3 / fArr[2];
                float cbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
                float cbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
                float cbrt3 = f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f;
                float f8 = (116.0f * cbrt2) - 16.0f;
                float f9 = (cbrt - cbrt2) * 500.0f;
                float f10 = (cbrt2 - cbrt3) * 200.0f;
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                if (f8 > 100.0f) {
                    f8 = 100.0f;
                }
                if (f9 < -128.0f) {
                    f9 = -128.0f;
                }
                if (f9 > 128.0f) {
                    f9 = 128.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                return PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageMotionLayoutTransitionHeroVision4068(f8, f9, f10 <= 128.0f ? f10 : 128.0f, f4, polarVoyageFontFamilyHyperionStorm1277);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                if (f2 > 2.0f) {
                    f2 = 2.0f;
                }
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                return PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageMotionLayoutTransitionHeroVision4068(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, polarVoyageFontFamilyHyperionStorm1277);
        }
    }

    @Override // p000createpolar.PolarVoyageFontFamilyHyperionStorm1277
    public final float PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        switch (this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return i == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // p000createpolar.PolarVoyageFontFamilyHyperionStorm1277
    public final float PolarVoyageZipVortexCelestial6185(int i) {
        switch (this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return i == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }
}
