package p000createpolar;

import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRotateAnimationHyperionPixelCelestial5757 implements PolarVoyageFCMSparkPhantomEpic4405 {
    public final ArrayList PolarVoyageZipVortexCelestial6185;

    public PolarVoyageRotateAnimationHyperionPixelCelestial5757(int i) {
        switch (i) {
            case 1:
                this.PolarVoyageZipVortexCelestial6185 = new ArrayList();
                break;
            default:
                this.PolarVoyageZipVortexCelestial6185 = new ArrayList(20);
                break;
        }
    }

    @Override // p000createpolar.PolarVoyageFCMSparkPhantomEpic4405
    public long PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j) {
        ArrayList arrayList = this.PolarVoyageZipVortexCelestial6185;
        if (arrayList.isEmpty() || j < ((PolarVoyageConstraintSetCloneOlympianMegaVision9846) arrayList.get(0)).PolarVoyageMotionLayoutTransitionHeroVision4068) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((PolarVoyageConstraintSetCloneOlympianMegaVision9846) arrayList.get(i)).PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                PolarVoyageConstraintSetCloneOlympianMegaVision9846 polarVoyageConstraintSetCloneOlympianMegaVision9846 = (PolarVoyageConstraintSetCloneOlympianMegaVision9846) arrayList.get(i - 1);
                long j3 = polarVoyageConstraintSetCloneOlympianMegaVision9846.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                return (j3 == -9223372036854775807L || j3 > j) ? polarVoyageConstraintSetCloneOlympianMegaVision9846.PolarVoyageMotionLayoutTransitionHeroVision4068 : j3;
            }
        }
        PolarVoyageConstraintSetCloneOlympianMegaVision9846 polarVoyageConstraintSetCloneOlympianMegaVision98462 = (PolarVoyageConstraintSetCloneOlympianMegaVision9846) PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageDiffUtilDragonSpeedEclipse6225(arrayList);
        long j4 = polarVoyageConstraintSetCloneOlympianMegaVision98462.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        return (j4 == -9223372036854775807L || j < j4) ? polarVoyageConstraintSetCloneOlympianMegaVision98462.PolarVoyageMotionLayoutTransitionHeroVision4068 : j4;
    }

    @Override // p000createpolar.PolarVoyageFCMSparkPhantomEpic4405
    public void PolarVoyageBitmapVisionAuroraPixel4705(long j) {
        int PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageTextInputEditTextNebulaHero6651(j);
        if (PolarVoyageTextInputEditTextNebulaHero6651 == 0) {
            return;
        }
        ArrayList arrayList = this.PolarVoyageZipVortexCelestial6185;
        long j2 = ((PolarVoyageConstraintSetCloneOlympianMegaVision9846) arrayList.get(PolarVoyageTextInputEditTextNebulaHero6651 - 1)).PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (j2 == -9223372036854775807L || j2 >= j) {
            PolarVoyageTextInputEditTextNebulaHero6651--;
        }
        arrayList.subList(0, PolarVoyageTextInputEditTextNebulaHero6651).clear();
    }

    public PolarVoyageCoroutineScopeDeltaInferno4802 PolarVoyageDiffUtilTurboStrike5735() {
        return new PolarVoyageCoroutineScopeDeltaInferno4802((String[]) this.PolarVoyageZipVortexCelestial6185.toArray(new String[0]));
    }

    public void PolarVoyageItemDecorationUltraDeltaEpic7485(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.PolarVoyageZipVortexCelestial6185;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // p000createpolar.PolarVoyageFCMSparkPhantomEpic4405
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageConstraintSetCloneOlympianMegaVision9846 polarVoyageConstraintSetCloneOlympianMegaVision9846, long j) {
        boolean z;
        int size;
        long j2 = polarVoyageConstraintSetCloneOlympianMegaVision9846.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = polarVoyageConstraintSetCloneOlympianMegaVision9846.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
                ArrayList arrayList = this.PolarVoyageZipVortexCelestial6185;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j2 >= ((PolarVoyageConstraintSetCloneOlympianMegaVision9846) arrayList.get(size)).PolarVoyageMotionLayoutTransitionHeroVision4068) {
                        arrayList.add(size + 1, polarVoyageConstraintSetCloneOlympianMegaVision9846);
                        return z;
                    }
                    if (((PolarVoyageConstraintSetCloneOlympianMegaVision9846) arrayList.get(size)).PolarVoyageMotionLayoutTransitionHeroVision4068 <= j) {
                        z = false;
                    }
                }
                arrayList.add(0, polarVoyageConstraintSetCloneOlympianMegaVision9846);
                return z;
            }
        }
        z = false;
        ArrayList arrayList2 = this.PolarVoyageZipVortexCelestial6185;
        while (size >= 0) {
        }
        arrayList2.add(0, polarVoyageConstraintSetCloneOlympianMegaVision9846);
        return z;
    }

    @Override // p000createpolar.PolarVoyageFCMSparkPhantomEpic4405
    public long PolarVoyageMotionLayoutTransitionHeroVision4068(long j) {
        ArrayList arrayList = this.PolarVoyageZipVortexCelestial6185;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((PolarVoyageConstraintSetCloneOlympianMegaVision9846) arrayList.get(0)).PolarVoyageMotionLayoutTransitionHeroVision4068) {
            return ((PolarVoyageConstraintSetCloneOlympianMegaVision9846) arrayList.get(0)).PolarVoyageMotionLayoutTransitionHeroVision4068;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            PolarVoyageConstraintSetCloneOlympianMegaVision9846 polarVoyageConstraintSetCloneOlympianMegaVision9846 = (PolarVoyageConstraintSetCloneOlympianMegaVision9846) arrayList.get(i);
            long j2 = polarVoyageConstraintSetCloneOlympianMegaVision9846.PolarVoyageMotionLayoutTransitionHeroVision4068;
            long j3 = polarVoyageConstraintSetCloneOlympianMegaVision9846.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (j < j2) {
                long j4 = ((PolarVoyageConstraintSetCloneOlympianMegaVision9846) arrayList.get(i - 1)).PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((PolarVoyageConstraintSetCloneOlympianMegaVision9846) PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageDiffUtilDragonSpeedEclipse6225(arrayList)).PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    public int PolarVoyageTextInputEditTextNebulaHero6651(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.PolarVoyageZipVortexCelestial6185;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((PolarVoyageConstraintSetCloneOlympianMegaVision9846) arrayList.get(i)).PolarVoyageMotionLayoutTransitionHeroVision4068) {
                return i;
            }
            i++;
        }
    }

    @Override // p000createpolar.PolarVoyageFCMSparkPhantomEpic4405
    public PolarVoyageDialogPhantomEliteAurora3058 PolarVoyageZipVortexCelestial6185(long j) {
        int PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageTextInputEditTextNebulaHero6651(j);
        if (PolarVoyageTextInputEditTextNebulaHero6651 == 0) {
            PolarVoyageTextRecognitionPrimeVortexHero1477 polarVoyageTextRecognitionPrimeVortexHero1477 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageStrictModeLegendEpic1532;
            return PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778;
        }
        PolarVoyageConstraintSetCloneOlympianMegaVision9846 polarVoyageConstraintSetCloneOlympianMegaVision9846 = (PolarVoyageConstraintSetCloneOlympianMegaVision9846) this.PolarVoyageZipVortexCelestial6185.get(PolarVoyageTextInputEditTextNebulaHero6651 - 1);
        long j2 = polarVoyageConstraintSetCloneOlympianMegaVision9846.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (j2 == -9223372036854775807L || j < j2) {
            return polarVoyageConstraintSetCloneOlympianMegaVision9846.PolarVoyageZipVortexCelestial6185;
        }
        PolarVoyageTextRecognitionPrimeVortexHero1477 polarVoyageTextRecognitionPrimeVortexHero14772 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageStrictModeLegendEpic1532;
        return PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778;
    }

    @Override // p000createpolar.PolarVoyageFCMSparkPhantomEpic4405
    public void clear() {
        this.PolarVoyageZipVortexCelestial6185.clear();
    }
}
