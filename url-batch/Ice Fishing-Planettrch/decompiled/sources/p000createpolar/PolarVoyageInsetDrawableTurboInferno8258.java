package p000createpolar;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageInsetDrawableTurboInferno8258 implements PolarVoyageRoomDaoRogueGamma6879 {
    public boolean PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageEventLegendDragon2659 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final Inflater PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageInsetDrawableTurboInferno8258(PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659, Inflater inflater) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageEventLegendDragon2659;
        this.PolarVoyageStrictModeLegendEpic1532 = inflater;
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final PolarVoyageMotionLayoutTransitionPhantomCosmos1553 PolarVoyageKotlinBetaPulseBeta3653() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653();
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final long PolarVoyageLayerDrawableShadowTitaniumOmega1942(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        polarVoyageSnackbarSpectraMasterMaster4120.getClass();
        do {
            long PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068(j, polarVoyageSnackbarSpectraMasterMaster4120);
            if (PolarVoyageMotionLayoutTransitionHeroVision4068 > 0) {
                return PolarVoyageMotionLayoutTransitionHeroVision4068;
            }
            Inflater inflater = this.PolarVoyageStrictModeLegendEpic1532;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageMotionLayoutTransitionHeroVision4068());
        throw new EOFException("source exhausted prematurely");
    }

    public final long PolarVoyageMotionLayoutTransitionHeroVision4068(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        Inflater inflater = this.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageSnackbarSpectraMasterMaster4120.getClass();
        if (j < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageRotateAnimationCyberCelestialDelta4768("byteCount < 0: ", j));
            return 0L;
        }
        if (this.PolarVoyageBottomSheetOmegaNeo1907) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                PolarVoyageSupervisorJobPixelEliteMega2147 PolarVoyageFCMCelestialCosmosPixel3711 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageFCMCelestialCosmosPixel3711(1);
                int min = (int) Math.min(j, 8192 - PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653);
                boolean needsInput = inflater.needsInput();
                PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (needsInput && !polarVoyageEventLegendDragon2659.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                    PolarVoyageSupervisorJobPixelEliteMega2147 polarVoyageSupervisorJobPixelEliteMega2147 = polarVoyageEventLegendDragon2659.PolarVoyageStrictModeLegendEpic1532.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    polarVoyageSupervisorJobPixelEliteMega2147.getClass();
                    int i = polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageKotlinBetaPulseBeta3653;
                    int i2 = polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    int i3 = i - i2;
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i3;
                    inflater.setInput(polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageZipVortexCelestial6185, i2, i3);
                }
                int inflate = inflater.inflate(PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageZipVortexCelestial6185, PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653, min);
                int i4 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768 -= remaining;
                    polarVoyageEventLegendDragon2659.skip(remaining);
                }
                if (inflate > 0) {
                    PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653 += inflate;
                    long j2 = inflate;
                    polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 += j2;
                    return j2;
                }
                if (PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageMotionLayoutTransitionHeroVision4068 == PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653) {
                    polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageZipVortexCelestial6185();
                    PolarVoyagePaintFlagsDrawFilterBlazeQuantumNovaX4853.PolarVoyageZipVortexCelestial6185(PolarVoyageFCMCelestialCosmosPixel3711);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.PolarVoyageBottomSheetOmegaNeo1907) {
            return;
        }
        this.PolarVoyageStrictModeLegendEpic1532.end();
        this.PolarVoyageBottomSheetOmegaNeo1907 = true;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.close();
    }
}
