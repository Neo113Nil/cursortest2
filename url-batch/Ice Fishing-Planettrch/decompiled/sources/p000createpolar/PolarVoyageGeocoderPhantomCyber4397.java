package p000createpolar;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGeocoderPhantomCyber4397 implements PolarVoyageRoomDaoRogueGamma6879 {
    public int PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageCameraPixelBlaze2629;
    public final PolarVoyageThemeOverlayShadowPulse8967 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;
    public int PolarVoyageViewRogueMaster4778;

    public PolarVoyageGeocoderPhantomCyber4397(PolarVoyageThemeOverlayShadowPulse8967 polarVoyageThemeOverlayShadowPulse8967) {
        polarVoyageThemeOverlayShadowPulse8967.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageThemeOverlayShadowPulse8967;
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final PolarVoyageMotionLayoutTransitionPhantomCosmos1553 PolarVoyageKotlinBetaPulseBeta3653() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653();
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final long PolarVoyageLayerDrawableShadowTitaniumOmega1942(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        int i;
        int readInt;
        polarVoyageSnackbarSpectraMasterMaster4120.getClass();
        do {
            int i2 = this.PolarVoyageViewRogueMaster4778;
            PolarVoyageThemeOverlayShadowPulse8967 polarVoyageThemeOverlayShadowPulse8967 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i2 == 0) {
                polarVoyageThemeOverlayShadowPulse8967.skip(this.PolarVoyageCameraPixelBlaze2629);
                this.PolarVoyageCameraPixelBlaze2629 = 0;
                if ((this.PolarVoyageRotateAnimationCyberCelestialDelta4768 & 4) == 0) {
                    i = this.PolarVoyageBottomSheetOmegaNeo1907;
                    int PolarVoyageViewRogueMaster4778 = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageViewRogueMaster4778(polarVoyageThemeOverlayShadowPulse8967);
                    this.PolarVoyageViewRogueMaster4778 = PolarVoyageViewRogueMaster4778;
                    this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageViewRogueMaster4778;
                    int readByte = polarVoyageThemeOverlayShadowPulse8967.readByte() & 255;
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageThemeOverlayShadowPulse8967.readByte() & 255;
                    Logger logger = PolarVoyageInputFilterCelestialEpicEclipse5119.PolarVoyageBottomSheetOmegaNeo1907;
                    if (logger.isLoggable(Level.FINE)) {
                        PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967 = PolarVoyageDrawerLayoutBlazeOmegaUltra4339.PolarVoyageZipVortexCelestial6185;
                        logger.fine(PolarVoyageDrawerLayoutBlazeOmegaUltra4339.PolarVoyageMotionLayoutTransitionHeroVision4068(true, this.PolarVoyageBottomSheetOmegaNeo1907, this.PolarVoyageStrictModeLegendEpic1532, readByte, this.PolarVoyageRotateAnimationCyberCelestialDelta4768));
                    }
                    readInt = polarVoyageThemeOverlayShadowPulse8967.readInt() & Integer.MAX_VALUE;
                    this.PolarVoyageBottomSheetOmegaNeo1907 = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long PolarVoyageLayerDrawableShadowTitaniumOmega1942 = polarVoyageThemeOverlayShadowPulse8967.PolarVoyageLayerDrawableShadowTitaniumOmega1942(Math.min(j, i2), polarVoyageSnackbarSpectraMasterMaster4120);
                if (PolarVoyageLayerDrawableShadowTitaniumOmega1942 != -1) {
                    this.PolarVoyageViewRogueMaster4778 -= (int) PolarVoyageLayerDrawableShadowTitaniumOmega1942;
                    return PolarVoyageLayerDrawableShadowTitaniumOmega1942;
                }
            }
            return -1L;
        } while (readInt == i);
        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
