package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLiveDataScopeDeltaNeoInferno5892 {
    public final int[] PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final int PolarVoyageBitmapVisionAuroraPixel4705;
    public final long[] PolarVoyageDiffUtilTurboStrike5735;
    public final int[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final long[] PolarVoyageKotlinBetaPulseBeta3653;
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final long PolarVoyageStrictModeLegendEpic1532;
    public final int[] PolarVoyageTextInputEditTextNebulaHero6651;
    public final PolarVoyageMotionSceneGammaPrime9344 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageLiveDataScopeDeltaNeoInferno5892(PolarVoyageMotionSceneGammaPrime9344 polarVoyageMotionSceneGammaPrime9344, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j, int i2) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(iArr.length == jArr2.length);
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(jArr.length == jArr2.length);
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(iArr2.length == jArr2.length);
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageMotionSceneGammaPrime9344;
        this.PolarVoyageKotlinBetaPulseBeta3653 = jArr;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = iArr;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = i;
        this.PolarVoyageDiffUtilTurboStrike5735 = jArr2;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = iArr2;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = iArr3;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = z;
        this.PolarVoyageStrictModeLegendEpic1532 = j;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int PolarVoyageMotionLayoutTransitionHeroVision4068(long j) {
        long[] jArr = this.PolarVoyageDiffUtilTurboStrike5735;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            return PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185(jArr, j, true);
        }
        int[] iArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int length = iArr.length - 1;
        int i = 0;
        int i2 = -1;
        while (i <= length) {
            int i3 = ((length - i) / 2) + i;
            if (jArr[iArr[i3]] >= j) {
                length = i3 - 1;
                i2 = i3;
            } else {
                i = i3 + 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 < iArr.length - 1) {
                int i4 = i2 + 1;
                if (jArr[iArr[i4]] != j2) {
                    break;
                }
                i2 = i4;
            }
        }
        return iArr[i2];
    }

    public final int PolarVoyageZipVortexCelestial6185(long j) {
        long[] jArr = this.PolarVoyageDiffUtilTurboStrike5735;
        if (jArr.length <= 0) {
            return -1;
        }
        int i = 0;
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            return PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageBarcodeScannerInfernoSolarSpark7767(jArr, j, false);
        }
        int[] iArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int length = iArr.length - 1;
        int i2 = -1;
        while (i <= length) {
            int i3 = ((length - i) / 2) + i;
            if (jArr[iArr[i3]] <= j) {
                i = i3 + 1;
                i2 = i3;
            } else {
                length = i3 - 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 > 0 && jArr[iArr[i2 - 1]] == j2) {
                i2--;
            }
        }
        return iArr[i2];
    }
}
