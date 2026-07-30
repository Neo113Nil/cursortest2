package p000createpolar;

import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDigitalInkRecognitionMegaVortex5073 {
    public final ArrayList PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final PolarVoyageResourceEliteOlympian8553 PolarVoyageBitmapVisionAuroraPixel4705;
    public final PolarVoyageInterpolatorCelestialFusion9132 PolarVoyageDiffUtilTurboStrike5735;
    public int PolarVoyageKotlinBetaPulseBeta3653;
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final ArrayList PolarVoyageZipVortexCelestial6185;

    public PolarVoyageDigitalInkRecognitionMegaVortex5073(int i, ArrayList arrayList) {
        this.PolarVoyageZipVortexCelestial6185 = arrayList;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        if (i < 0) {
            PolarVoyageMaterialButtonNovaPhoenix3934.PolarVoyageZipVortexCelestial6185("Invalid start index");
        }
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new ArrayList();
        PolarVoyageResourceEliteOlympian8553 polarVoyageResourceEliteOlympian8553 = new PolarVoyageResourceEliteOlympian8553();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PolarVoyageCamera2DragonForce7029 polarVoyageCamera2DragonForce7029 = (PolarVoyageCamera2DragonForce7029) this.PolarVoyageZipVortexCelestial6185.get(i3);
            int i4 = polarVoyageCamera2DragonForce7029.PolarVoyageKotlinBetaPulseBeta3653;
            int i5 = polarVoyageCamera2DragonForce7029.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            polarVoyageResourceEliteOlympian8553.PolarVoyageItemDecorationUltraDeltaEpic7485(i4, new PolarVoyageSharedPreferencesNebulaLegendAurora4616(i3, i2, i5));
            i2 += i5;
        }
        this.PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageResourceEliteOlympian8553;
        this.PolarVoyageDiffUtilTurboStrike5735 = new PolarVoyageInterpolatorCelestialFusion9132(new PolarVoyageToastForceSolarDragon5561(this));
    }

    public final boolean PolarVoyageZipVortexCelestial6185(int i, int i2) {
        PolarVoyageSharedPreferencesNebulaLegendAurora4616 polarVoyageSharedPreferencesNebulaLegendAurora4616;
        int i3;
        int i4;
        PolarVoyageResourceEliteOlympian8553 polarVoyageResourceEliteOlympian8553 = this.PolarVoyageBitmapVisionAuroraPixel4705;
        PolarVoyageSharedPreferencesNebulaLegendAurora4616 polarVoyageSharedPreferencesNebulaLegendAurora46162 = (PolarVoyageSharedPreferencesNebulaLegendAurora4616) polarVoyageResourceEliteOlympian8553.PolarVoyageMotionLayoutTransitionHeroVision4068(i);
        if (polarVoyageSharedPreferencesNebulaLegendAurora46162 == null) {
            return false;
        }
        int i5 = polarVoyageSharedPreferencesNebulaLegendAurora46162.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i6 = i2 - polarVoyageSharedPreferencesNebulaLegendAurora46162.PolarVoyageKotlinBetaPulseBeta3653;
        polarVoyageSharedPreferencesNebulaLegendAurora46162.PolarVoyageKotlinBetaPulseBeta3653 = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = polarVoyageResourceEliteOlympian8553.PolarVoyageKotlinBetaPulseBeta3653;
        long[] jArr = polarVoyageResourceEliteOlympian8553.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (polarVoyageSharedPreferencesNebulaLegendAurora4616 = (PolarVoyageSharedPreferencesNebulaLegendAurora4616) objArr[(i7 << 3) + i9]).PolarVoyageMotionLayoutTransitionHeroVision4068) >= i5 && polarVoyageSharedPreferencesNebulaLegendAurora4616 != polarVoyageSharedPreferencesNebulaLegendAurora46162 && (i4 = i3 + i6) >= 0) {
                        polarVoyageSharedPreferencesNebulaLegendAurora4616.PolarVoyageMotionLayoutTransitionHeroVision4068 = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
