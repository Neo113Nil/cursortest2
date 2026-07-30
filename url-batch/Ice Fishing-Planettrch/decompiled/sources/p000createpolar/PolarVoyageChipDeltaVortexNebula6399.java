package p000createpolar;

import java.io.FileOutputStream;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageChipDeltaVortexNebula6399 implements PolarVoyageViewEliteBeta6786 {
    public final FileOutputStream PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageMotionLayoutTransitionPhantomCosmos1553 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageChipDeltaVortexNebula6399(FileOutputStream fileOutputStream, PolarVoyageMotionLayoutTransitionPhantomCosmos1553 polarVoyageMotionLayoutTransitionPhantomCosmos1553) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = fileOutputStream;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageMotionLayoutTransitionPhantomCosmos1553;
    }

    @Override // p000createpolar.PolarVoyageViewEliteBeta6786
    public final PolarVoyageMotionLayoutTransitionPhantomCosmos1553 PolarVoyageKotlinBetaPulseBeta3653() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // p000createpolar.PolarVoyageViewEliteBeta6786
    public final void PolarVoyageViewRogueMaster4778(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageNavigationViewHyperHyperHyperion1793(polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532, 0L, j);
        while (j > 0) {
            this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageDiffUtilTurboStrike5735();
            PolarVoyageSupervisorJobPixelEliteMega2147 polarVoyageSupervisorJobPixelEliteMega2147 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageItemDecorationUltraDeltaEpic7485;
            polarVoyageSupervisorJobPixelEliteMega2147.getClass();
            int min = (int) Math.min(j, polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageKotlinBetaPulseBeta3653 - polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068);
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.write(polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageZipVortexCelestial6185, polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068, min);
            int i = polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068 + min;
            polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
            long j2 = min;
            j -= j2;
            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 -= j2;
            if (i == polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageKotlinBetaPulseBeta3653) {
                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageZipVortexCelestial6185();
                PolarVoyagePaintFlagsDrawFilterBlazeQuantumNovaX4853.PolarVoyageZipVortexCelestial6185(polarVoyageSupervisorJobPixelEliteMega2147);
            }
        }
    }

    @Override // p000createpolar.PolarVoyageViewEliteBeta6786, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.close();
    }

    @Override // p000createpolar.PolarVoyageViewEliteBeta6786, java.io.Flushable
    public final void flush() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.flush();
    }

    public final String toString() {
        return "sink(" + this.PolarVoyageItemDecorationUltraDeltaEpic7485 + ')';
    }
}
