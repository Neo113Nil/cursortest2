package p000createpolar;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageIntentUltraNovaX6364 implements PolarVoyageRoomDaoRogueGamma6879 {
    public final PolarVoyageFlipAnimationMaxSolar1737 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public long PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageIntentUltraNovaX6364(PolarVoyageFlipAnimationMaxSolar1737 polarVoyageFlipAnimationMaxSolar1737, long j) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageFlipAnimationMaxSolar1737;
        this.PolarVoyageStrictModeLegendEpic1532 = j;
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final PolarVoyageMotionLayoutTransitionPhantomCosmos1553 PolarVoyageKotlinBetaPulseBeta3653() {
        return PolarVoyageMotionLayoutTransitionPhantomCosmos1553.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final long PolarVoyageLayerDrawableShadowTitaniumOmega1942(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        long j2;
        long j3;
        int i;
        polarVoyageSnackbarSpectraMasterMaster4120.getClass();
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("closed");
            return 0L;
        }
        PolarVoyageFlipAnimationMaxSolar1737 polarVoyageFlipAnimationMaxSolar1737 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        long j4 = this.PolarVoyageStrictModeLegendEpic1532;
        if (j < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageRotateAnimationCyberCelestialDelta4768("byteCount < 0: ", j));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                j2 = -1;
                break;
            }
            PolarVoyageSupervisorJobPixelEliteMega2147 PolarVoyageFCMCelestialCosmosPixel3711 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageFCMCelestialCosmosPixel3711(1);
            byte[] bArr = PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageZipVortexCelestial6185;
            int i2 = PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653;
            j2 = -1;
            int min = (int) Math.min(j5 - j6, 8192 - i2);
            synchronized (polarVoyageFlipAnimationMaxSolar1737) {
                bArr.getClass();
                polarVoyageFlipAnimationMaxSolar1737.PolarVoyageBottomSheetOmegaNeo1907.seek(j6);
                i = 0;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int read = polarVoyageFlipAnimationMaxSolar1737.PolarVoyageBottomSheetOmegaNeo1907.read(bArr, i2, min - i);
                    if (read != -1) {
                        i += read;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageMotionLayoutTransitionHeroVision4068 == PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653) {
                    polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageZipVortexCelestial6185();
                    PolarVoyagePaintFlagsDrawFilterBlazeQuantumNovaX4853.PolarVoyageZipVortexCelestial6185(PolarVoyageFCMCelestialCosmosPixel3711);
                }
                if (j4 == j6) {
                    j3 = -1;
                }
            } else {
                PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653 += i;
                long j7 = i;
                j6 += j7;
                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 += j7;
            }
        }
        j3 = j6 - j4;
        if (j3 != j2) {
            this.PolarVoyageStrictModeLegendEpic1532 += j3;
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        PolarVoyageFlipAnimationMaxSolar1737 polarVoyageFlipAnimationMaxSolar1737 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            return;
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = true;
        ReentrantLock reentrantLock = polarVoyageFlipAnimationMaxSolar1737.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        reentrantLock.lock();
        try {
            int i = polarVoyageFlipAnimationMaxSolar1737.PolarVoyageStrictModeLegendEpic1532 - 1;
            polarVoyageFlipAnimationMaxSolar1737.PolarVoyageStrictModeLegendEpic1532 = i;
            if (i == 0) {
                if (polarVoyageFlipAnimationMaxSolar1737.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                    synchronized (polarVoyageFlipAnimationMaxSolar1737) {
                        polarVoyageFlipAnimationMaxSolar1737.PolarVoyageBottomSheetOmegaNeo1907.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
