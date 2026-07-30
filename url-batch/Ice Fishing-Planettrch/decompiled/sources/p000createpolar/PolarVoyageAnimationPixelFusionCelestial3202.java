package p000createpolar;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAnimationPixelFusionCelestial3202 implements PolarVoyagePaintMegaCelestial9975 {
    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final long PolarVoyageKotlinBetaPulseBeta3653;
    public final SparseArray PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageExecutorPulseFusion4869 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAnimationPixelFusionCelestial3202(SparseArray sparseArray, long j, int i, long j2, long j3) {
        PolarVoyageExecutorPulseFusion4869 polarVoyageExecutorPulseFusion4869;
        int i2;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = sparseArray;
        this.PolarVoyageKotlinBetaPulseBeta3653 = j;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i;
        List list = (List) sparseArray.get(i);
        if (list == null || list.isEmpty()) {
            polarVoyageExecutorPulseFusion4869 = null;
        } else {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                PolarVoyageResourceMasterTitanQuantum6217 polarVoyageResourceMasterTitanQuantum6217 = (PolarVoyageResourceMasterTitanQuantum6217) list.get(i4);
                jArr3[i4] = polarVoyageResourceMasterTitanQuantum6217.PolarVoyageItemDecorationUltraDeltaEpic7485;
                jArr[i4] = polarVoyageResourceMasterTitanQuantum6217.PolarVoyageStrictModeLegendEpic1532;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                jArr2[i3] = jArr3[i5] - jArr3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArr3[i6] >= j) {
                i6--;
            }
            iArr[i6] = (int) ((j2 + j3) - jArr[i6]);
            jArr2[i6] = j - jArr3[i6];
            if (i6 < i2) {
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArr = Arrays.copyOf(iArr, i7);
                jArr = Arrays.copyOf(jArr, i7);
                jArr2 = Arrays.copyOf(jArr2, i7);
                jArr3 = Arrays.copyOf(jArr3, i7);
            }
            polarVoyageExecutorPulseFusion4869 = new PolarVoyageExecutorPulseFusion4869(iArr, jArr, jArr2, jArr3);
        }
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageExecutorPulseFusion4869;
    }

    @Override // p000createpolar.PolarVoyagePaintMegaCelestial9975
    public final PolarVoyageViewBindingPulseLegendNovaX4954 PolarVoyageBitmapVisionAuroraPixel4705(long j) {
        PolarVoyageExecutorPulseFusion4869 polarVoyageExecutorPulseFusion4869 = this.PolarVoyageZipVortexCelestial6185;
        if (polarVoyageExecutorPulseFusion4869 != null) {
            return polarVoyageExecutorPulseFusion4869.PolarVoyageBitmapVisionAuroraPixel4705(j);
        }
        PolarVoyageTransitionListenerRogueNeo7756 polarVoyageTransitionListenerRogueNeo7756 = PolarVoyageTransitionListenerRogueNeo7756.PolarVoyageKotlinBetaPulseBeta3653;
        return new PolarVoyageViewBindingPulseLegendNovaX4954(polarVoyageTransitionListenerRogueNeo7756, polarVoyageTransitionListenerRogueNeo7756);
    }

    @Override // p000createpolar.PolarVoyagePaintMegaCelestial9975
    public final boolean PolarVoyageKotlinBetaPulseBeta3653() {
        List list = (List) this.PolarVoyageMotionLayoutTransitionHeroVision4068.get(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // p000createpolar.PolarVoyagePaintMegaCelestial9975
    public final long PolarVoyageTextInputEditTextNebulaHero6651() {
        return this.PolarVoyageKotlinBetaPulseBeta3653;
    }
}
