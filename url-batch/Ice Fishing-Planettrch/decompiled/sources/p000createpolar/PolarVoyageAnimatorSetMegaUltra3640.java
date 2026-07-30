package p000createpolar;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAnimatorSetMegaUltra3640 extends PolarVoyageConstraintSetCloneNebulaOlympian6913 {
    public long PolarVoyageBottomSheetOmegaNeo1907;
    public boolean PolarVoyageCameraPixelBlaze2629;
    public boolean PolarVoyageDrawableDeltaHyperion5742;
    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ PolarVoyagePoseDetectionPrimeNebula3086 PolarVoyageSnackbarGammaEclipse2140;
    public final long PolarVoyageStrictModeLegendEpic1532;
    public boolean PolarVoyageViewRogueMaster4778;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolarVoyageAnimatorSetMegaUltra3640(PolarVoyagePoseDetectionPrimeNebula3086 polarVoyagePoseDetectionPrimeNebula3086, PolarVoyageRoomDaoRogueGamma6879 polarVoyageRoomDaoRogueGamma6879, long j, boolean z) {
        super(polarVoyageRoomDaoRogueGamma6879);
        polarVoyageRoomDaoRogueGamma6879.getClass();
        this.PolarVoyageSnackbarGammaEclipse2140 = polarVoyagePoseDetectionPrimeNebula3086;
        this.PolarVoyageStrictModeLegendEpic1532 = j;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = z;
        this.PolarVoyageViewRogueMaster4778 = true;
        if (j == 0) {
            PolarVoyageMotionLayoutTransitionHeroVision4068(null);
        }
    }

    @Override // p000createpolar.PolarVoyageConstraintSetCloneNebulaOlympian6913, p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final long PolarVoyageLayerDrawableShadowTitaniumOmega1942(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        PolarVoyagePoseDetectionPrimeNebula3086 polarVoyagePoseDetectionPrimeNebula3086 = this.PolarVoyageSnackbarGammaEclipse2140;
        polarVoyageSnackbarSpectraMasterMaster4120.getClass();
        if (this.PolarVoyageDrawableDeltaHyperion5742) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("closed");
            return 0L;
        }
        try {
            long PolarVoyageLayerDrawableShadowTitaniumOmega1942 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageLayerDrawableShadowTitaniumOmega1942(j, polarVoyageSnackbarSpectraMasterMaster4120);
            if (this.PolarVoyageViewRogueMaster4778) {
                this.PolarVoyageViewRogueMaster4778 = false;
            }
            if (PolarVoyageLayerDrawableShadowTitaniumOmega1942 == -1) {
                PolarVoyageMotionLayoutTransitionHeroVision4068(null);
                return -1L;
            }
            long j2 = this.PolarVoyageBottomSheetOmegaNeo1907 + PolarVoyageLayerDrawableShadowTitaniumOmega1942;
            long j3 = this.PolarVoyageStrictModeLegendEpic1532;
            if (j3 == -1 || j2 <= j3) {
                this.PolarVoyageBottomSheetOmegaNeo1907 = j2;
                if (((PolarVoyageAlertDialogTitanHyper8130) polarVoyagePoseDetectionPrimeNebula3086.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                    PolarVoyageMotionLayoutTransitionHeroVision4068(null);
                }
                return PolarVoyageLayerDrawableShadowTitaniumOmega1942;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            IOException PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068(e);
            PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
            throw PolarVoyageMotionLayoutTransitionHeroVision4068;
        }
    }

    public final IOException PolarVoyageMotionLayoutTransitionHeroVision4068(IOException iOException) {
        if (this.PolarVoyageCameraPixelBlaze2629) {
            return iOException;
        }
        this.PolarVoyageCameraPixelBlaze2629 = true;
        if (iOException == null && this.PolarVoyageViewRogueMaster4778) {
            this.PolarVoyageViewRogueMaster4778 = false;
        }
        return PolarVoyagePoseDetectionPrimeNebula3086.PolarVoyageZipVortexCelestial6185(this.PolarVoyageSnackbarGammaEclipse2140, this.PolarVoyageRotateAnimationCyberCelestialDelta4768, iOException, 8);
    }

    @Override // p000createpolar.PolarVoyageConstraintSetCloneNebulaOlympian6913, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.PolarVoyageDrawableDeltaHyperion5742) {
            return;
        }
        this.PolarVoyageDrawableDeltaHyperion5742 = true;
        try {
            super.close();
            PolarVoyageMotionLayoutTransitionHeroVision4068(null);
        } catch (IOException e) {
            IOException PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068(e);
            PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
            throw PolarVoyageMotionLayoutTransitionHeroVision4068;
        }
    }
}
