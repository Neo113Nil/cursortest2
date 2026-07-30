package p000createpolar;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLinearLayoutBlazeShadow5947 implements PolarVoyageRoomDaoRogueGamma6879 {
    public final InputStream PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageMotionLayoutTransitionPhantomCosmos1553 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageLinearLayoutBlazeShadow5947(InputStream inputStream, PolarVoyageMotionLayoutTransitionPhantomCosmos1553 polarVoyageMotionLayoutTransitionPhantomCosmos1553) {
        inputStream.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = inputStream;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageMotionLayoutTransitionPhantomCosmos1553;
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final PolarVoyageMotionLayoutTransitionPhantomCosmos1553 PolarVoyageKotlinBetaPulseBeta3653() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final long PolarVoyageLayerDrawableShadowTitaniumOmega1942(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        polarVoyageSnackbarSpectraMasterMaster4120.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageRotateAnimationCyberCelestialDelta4768("byteCount < 0: ", j));
            return 0L;
        }
        try {
            this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageDiffUtilTurboStrike5735();
            PolarVoyageSupervisorJobPixelEliteMega2147 PolarVoyageFCMCelestialCosmosPixel3711 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageFCMCelestialCosmosPixel3711(1);
            int read = this.PolarVoyageItemDecorationUltraDeltaEpic7485.read(PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageZipVortexCelestial6185, PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653, (int) Math.min(j, 8192 - PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653));
            if (read != -1) {
                PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653 += read;
                long j2 = read;
                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 += j2;
                return j2;
            }
            if (PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageMotionLayoutTransitionHeroVision4068 != PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageKotlinBetaPulseBeta3653) {
                return -1L;
            }
            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageFCMCelestialCosmosPixel3711.PolarVoyageZipVortexCelestial6185();
            PolarVoyagePaintFlagsDrawFilterBlazeQuantumNovaX4853.PolarVoyageZipVortexCelestial6185(PolarVoyageFCMCelestialCosmosPixel3711);
            return -1L;
        } catch (AssertionError e) {
            if (PolarVoyageTextViewLegendCosmos5811.PolarVoyageZipVortexCelestial6185(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.close();
    }

    public final String toString() {
        return "source(" + this.PolarVoyageItemDecorationUltraDeltaEpic7485 + ')';
    }
}
