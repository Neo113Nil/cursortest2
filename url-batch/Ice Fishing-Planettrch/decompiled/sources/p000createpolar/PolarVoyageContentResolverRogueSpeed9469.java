package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageContentResolverRogueSpeed9469 {
    public static final long PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public static final long PolarVoyageBitmapVisionAuroraPixel4705;
    public static final long PolarVoyageDiffUtilTurboStrike5735;
    public static final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
    public static final long PolarVoyageKotlinBetaPulseBeta3653;
    public static final long PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBarcodeScannerInfernoSolarSpark7767(4278190080L);
    public static final long PolarVoyageTextInputEditTextNebulaHero6651;
    public final long PolarVoyageZipVortexCelestial6185;

    static {
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBarcodeScannerInfernoSolarSpark7767(4282664004L);
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBarcodeScannerInfernoSolarSpark7767(4287137928L);
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBarcodeScannerInfernoSolarSpark7767(4291611852L);
        PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBarcodeScannerInfernoSolarSpark7767(4294967295L);
        PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBarcodeScannerInfernoSolarSpark7767(4294901760L);
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBarcodeScannerInfernoSolarSpark7767(4278255360L);
        PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBarcodeScannerInfernoSolarSpark7767(4278190335L);
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBarcodeScannerInfernoSolarSpark7767(4294967040L);
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBarcodeScannerInfernoSolarSpark7767(4278255615L);
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBarcodeScannerInfernoSolarSpark7767(4294902015L);
        PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageKotlinBetaPulseBeta3653(0);
        PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageMotionLayoutTransitionHeroVision4068(0.0f, 0.0f, 0.0f, 0.0f, PolarVoyageCameraViewVortexElite1564.PolarVoyageDisplayMetricsVortexDragon9516);
    }

    public /* synthetic */ PolarVoyageContentResolverRogueSpeed9469(long j) {
        this.PolarVoyageZipVortexCelestial6185 = j;
    }

    public static final float PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j) {
        float PolarVoyageCameraPixelBlaze2629;
        float f;
        if ((63 & j) == 0) {
            PolarVoyageCameraPixelBlaze2629 = (float) PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageCameraPixelBlaze2629((j >>> 56) & 255);
            f = 255.0f;
        } else {
            PolarVoyageCameraPixelBlaze2629 = (float) PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageCameraPixelBlaze2629((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return PolarVoyageCameraPixelBlaze2629 / f;
    }

    public static final float PolarVoyageBitmapVisionAuroraPixel4705(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageCameraPixelBlaze2629((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - PolarVoyageOnGlobalLayoutListenerTitaniumNovaXMaster3544.PolarVoyageZipVortexCelestial6185;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final PolarVoyageFontFamilyHyperionStorm1277 PolarVoyageDiffUtilTurboStrike5735(long j) {
        float[] fArr = PolarVoyageCameraViewVortexElite1564.PolarVoyageZipVortexCelestial6185;
        return PolarVoyageCameraViewVortexElite1564.PolarVoyageCameraViewSpectraMaxSpectra2824[(int) (j & 63)];
    }

    public static final float PolarVoyageItemDecorationUltraDeltaEpic7485(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageCameraPixelBlaze2629((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - PolarVoyageOnGlobalLayoutListenerTitaniumNovaXMaster3544.PolarVoyageZipVortexCelestial6185;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final boolean PolarVoyageKotlinBetaPulseBeta3653(long j, long j2) {
        return j == j2;
    }

    public static long PolarVoyageMotionLayoutTransitionHeroVision4068(long j, float f) {
        return PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageItemDecorationUltraDeltaEpic7485(j), PolarVoyageTextInputEditTextNebulaHero6651(j), PolarVoyageBitmapVisionAuroraPixel4705(j), f, PolarVoyageDiffUtilTurboStrike5735(j));
    }

    public static String PolarVoyageStrictModeLegendEpic1532(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(PolarVoyageItemDecorationUltraDeltaEpic7485(j));
        sb.append(", ");
        sb.append(PolarVoyageTextInputEditTextNebulaHero6651(j));
        sb.append(", ");
        sb.append(PolarVoyageBitmapVisionAuroraPixel4705(j));
        sb.append(", ");
        sb.append(PolarVoyageBarcodeScannerInfernoSolarSpark7767(j));
        sb.append(", ");
        return PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageDrawableDeltaHyperion5742(sb, PolarVoyageDiffUtilTurboStrike5735(j).PolarVoyageZipVortexCelestial6185, ')');
    }

    public static final float PolarVoyageTextInputEditTextNebulaHero6651(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) PolarVoyageVideoCaptureNeoNovaX8992.PolarVoyageCameraPixelBlaze2629((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - PolarVoyageOnGlobalLayoutListenerTitaniumNovaXMaster3544.PolarVoyageZipVortexCelestial6185;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final long PolarVoyageZipVortexCelestial6185(long j, PolarVoyageFontFamilyHyperionStorm1277 polarVoyageFontFamilyHyperionStorm1277) {
        PolarVoyageShapeAppearanceQuantumAlpha7663 polarVoyageShapeAppearanceQuantumAlpha7663;
        PolarVoyageFontFamilyHyperionStorm1277 PolarVoyageDiffUtilTurboStrike57352 = PolarVoyageDiffUtilTurboStrike5735(j);
        int i = PolarVoyageDiffUtilTurboStrike57352.PolarVoyageKotlinBetaPulseBeta3653;
        int i2 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageKotlinBetaPulseBeta3653;
        if ((i | i2) < 0) {
            polarVoyageShapeAppearanceQuantumAlpha7663 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageBitmapMaxTitanTitan7960(PolarVoyageDiffUtilTurboStrike57352, polarVoyageFontFamilyHyperionStorm1277);
        } else {
            PolarVoyageResourceEliteOlympian8553 polarVoyageResourceEliteOlympian8553 = PolarVoyageFirebaseModelInterpreterEliteHyperionHyperion1117.PolarVoyageZipVortexCelestial6185;
            int i3 = i | (i2 << 6);
            Object PolarVoyageMotionLayoutTransitionHeroVision40682 = polarVoyageResourceEliteOlympian8553.PolarVoyageMotionLayoutTransitionHeroVision4068(i3);
            if (PolarVoyageMotionLayoutTransitionHeroVision40682 == null) {
                PolarVoyageMotionLayoutTransitionHeroVision40682 = PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageBitmapMaxTitanTitan7960(PolarVoyageDiffUtilTurboStrike57352, polarVoyageFontFamilyHyperionStorm1277);
                polarVoyageResourceEliteOlympian8553.PolarVoyageItemDecorationUltraDeltaEpic7485(i3, PolarVoyageMotionLayoutTransitionHeroVision40682);
            }
            polarVoyageShapeAppearanceQuantumAlpha7663 = (PolarVoyageShapeAppearanceQuantumAlpha7663) PolarVoyageMotionLayoutTransitionHeroVision40682;
        }
        return polarVoyageShapeAppearanceQuantumAlpha7663.PolarVoyageZipVortexCelestial6185(j);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageContentResolverRogueSpeed9469) {
            return this.PolarVoyageZipVortexCelestial6185 == ((PolarVoyageContentResolverRogueSpeed9469) obj).PolarVoyageZipVortexCelestial6185;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.PolarVoyageZipVortexCelestial6185);
    }

    public final String toString() {
        return PolarVoyageStrictModeLegendEpic1532(this.PolarVoyageZipVortexCelestial6185);
    }
}
