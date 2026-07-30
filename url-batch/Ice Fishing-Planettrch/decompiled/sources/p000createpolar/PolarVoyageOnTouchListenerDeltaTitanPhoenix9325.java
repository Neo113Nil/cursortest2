package p000createpolar;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnTouchListenerDeltaTitanPhoenix9325 extends InputStream {
    public final /* synthetic */ PolarVoyageEventLegendDragon2659 PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageOnTouchListenerDeltaTitanPhoenix9325(PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageEventLegendDragon2659;
    }

    @Override // java.io.InputStream
    public final int available() {
        PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (!polarVoyageEventLegendDragon2659.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            return (int) Math.min(polarVoyageEventLegendDragon2659.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532, 2147483647L);
        }
        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("closed");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = polarVoyageEventLegendDragon2659.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageEventLegendDragon2659.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("closed");
            return 0;
        }
        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageNavigationViewHyperHyperHyperion1793(bArr.length, i, i2);
        if (polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 == 0 && polarVoyageEventLegendDragon2659.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageLayerDrawableShadowTitaniumOmega1942(8192L, polarVoyageSnackbarSpectraMasterMaster4120) == -1) {
            return -1;
        }
        return polarVoyageSnackbarSpectraMasterMaster4120.read(bArr, i, i2);
    }

    public final String toString() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485 + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream outputStream) {
        outputStream.getClass();
        PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = polarVoyageEventLegendDragon2659.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageEventLegendDragon2659.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("closed");
            return 0L;
        }
        long j = 0;
        while (true) {
            if (polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 == 0 && polarVoyageEventLegendDragon2659.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageLayerDrawableShadowTitaniumOmega1942(8192L, polarVoyageSnackbarSpectraMasterMaster4120) == -1) {
                return j;
            }
            long j2 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532;
            j += j2;
            PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageNavigationViewHyperHyperHyperion1793(j2, 0L, j2);
            PolarVoyageSupervisorJobPixelEliteMega2147 polarVoyageSupervisorJobPixelEliteMega2147 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageItemDecorationUltraDeltaEpic7485;
            while (j2 > 0) {
                polarVoyageSupervisorJobPixelEliteMega2147.getClass();
                int min = (int) Math.min(j2, polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageKotlinBetaPulseBeta3653 - polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068);
                outputStream.write(polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageZipVortexCelestial6185, polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068, min);
                int i = polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068 + min;
                polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
                long j3 = min;
                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 -= j3;
                j2 -= j3;
                if (i == polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageKotlinBetaPulseBeta3653) {
                    PolarVoyageSupervisorJobPixelEliteMega2147 PolarVoyageZipVortexCelestial6185 = polarVoyageSupervisorJobPixelEliteMega2147.PolarVoyageZipVortexCelestial6185();
                    polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageZipVortexCelestial6185;
                    PolarVoyagePaintFlagsDrawFilterBlazeQuantumNovaX4853.PolarVoyageZipVortexCelestial6185(polarVoyageSupervisorJobPixelEliteMega2147);
                    polarVoyageSupervisorJobPixelEliteMega2147 = PolarVoyageZipVortexCelestial6185;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = polarVoyageEventLegendDragon2659.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageEventLegendDragon2659.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("closed");
            return 0;
        }
        if (polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 == 0 && polarVoyageEventLegendDragon2659.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageLayerDrawableShadowTitaniumOmega1942(8192L, polarVoyageSnackbarSpectraMasterMaster4120) == -1) {
            return -1;
        }
        return polarVoyageSnackbarSpectraMasterMaster4120.readByte() & 255;
    }
}
