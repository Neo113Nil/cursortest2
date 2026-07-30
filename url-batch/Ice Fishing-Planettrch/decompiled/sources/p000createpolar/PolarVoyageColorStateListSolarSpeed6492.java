package p000createpolar;

import java.io.IOException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageColorStateListSolarSpeed6492 extends PolarVoyageConstraintSetCloneNebulaOlympian6913 {
    public long PolarVoyageBottomSheetOmegaNeo1907;
    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final long PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageColorStateListSolarSpeed6492(PolarVoyageRoomDaoRogueGamma6879 polarVoyageRoomDaoRogueGamma6879, long j, boolean z) {
        super(polarVoyageRoomDaoRogueGamma6879);
        this.PolarVoyageStrictModeLegendEpic1532 = j;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = z;
    }

    @Override // p000createpolar.PolarVoyageConstraintSetCloneNebulaOlympian6913, p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final long PolarVoyageLayerDrawableShadowTitaniumOmega1942(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        polarVoyageSnackbarSpectraMasterMaster4120.getClass();
        long j2 = this.PolarVoyageBottomSheetOmegaNeo1907;
        long j3 = this.PolarVoyageStrictModeLegendEpic1532;
        if (j2 > j3) {
            j = 0;
        } else if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long PolarVoyageLayerDrawableShadowTitaniumOmega1942 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageLayerDrawableShadowTitaniumOmega1942(j, polarVoyageSnackbarSpectraMasterMaster4120);
        if (PolarVoyageLayerDrawableShadowTitaniumOmega1942 != -1) {
            this.PolarVoyageBottomSheetOmegaNeo1907 += PolarVoyageLayerDrawableShadowTitaniumOmega1942;
        }
        long j5 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if ((j5 >= j3 || PolarVoyageLayerDrawableShadowTitaniumOmega1942 != -1) && j5 <= j3) {
            return PolarVoyageLayerDrawableShadowTitaniumOmega1942;
        }
        if (PolarVoyageLayerDrawableShadowTitaniumOmega1942 > 0 && j5 > j3) {
            long j6 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 - (j5 - j3);
            PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster41202 = new PolarVoyageSnackbarSpectraMasterMaster4120();
            polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageFlingGestureEclipsePrimeMax1376(polarVoyageSnackbarSpectraMasterMaster4120);
            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageViewRogueMaster4778(j6, polarVoyageSnackbarSpectraMasterMaster41202);
            polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageMotionLayoutTransitionHeroVision4068();
        }
        throw new IOException("expected " + j3 + " bytes but got " + this.PolarVoyageBottomSheetOmegaNeo1907);
    }
}
