package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageProGuardVisionRogue4249 extends PolarVoyageAccelerometerAuroraTitanSpeed7821 {
    public static final /* synthetic */ int PolarVoyageCameraPixelBlaze2629 = 0;
    public boolean PolarVoyageBottomSheetOmegaNeo1907;
    public long PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public PolarVoyageMLKitNovaXNovaSpectra9261 PolarVoyageViewRogueMaster4778;

    public final void PolarVoyageAlarmManagerShadowHyperBeta8339(PolarVoyageRoomDaoEclipseFusion1874 polarVoyageRoomDaoEclipseFusion1874) {
        PolarVoyageMLKitNovaXNovaSpectra9261 polarVoyageMLKitNovaXNovaSpectra9261 = this.PolarVoyageViewRogueMaster4778;
        if (polarVoyageMLKitNovaXNovaSpectra9261 == null) {
            polarVoyageMLKitNovaXNovaSpectra9261 = new PolarVoyageMLKitNovaXNovaSpectra9261();
            this.PolarVoyageViewRogueMaster4778 = polarVoyageMLKitNovaXNovaSpectra9261;
        }
        polarVoyageMLKitNovaXNovaSpectra9261.addLast(polarVoyageRoomDaoEclipseFusion1874);
    }

    public final boolean PolarVoyageCanvasElitePhoenix4750() {
        PolarVoyageMLKitNovaXNovaSpectra9261 polarVoyageMLKitNovaXNovaSpectra9261 = this.PolarVoyageViewRogueMaster4778;
        if (polarVoyageMLKitNovaXNovaSpectra9261 == null) {
            return false;
        }
        PolarVoyageRoomDaoEclipseFusion1874 polarVoyageRoomDaoEclipseFusion1874 = (PolarVoyageRoomDaoEclipseFusion1874) (polarVoyageMLKitNovaXNovaSpectra9261.isEmpty() ? null : polarVoyageMLKitNovaXNovaSpectra9261.removeFirst());
        if (polarVoyageRoomDaoEclipseFusion1874 == null) {
            return false;
        }
        polarVoyageRoomDaoEclipseFusion1874.run();
        return true;
    }

    public abstract long PolarVoyageConfigurationMaxSpectraForce5418();

    @Override // p000createpolar.PolarVoyageAccelerometerAuroraTitanSpeed7821
    public final PolarVoyageAccelerometerAuroraTitanSpeed7821 PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(int i) {
        PolarVoyageR8VisionOmegaNebula9943.PolarVoyageCameraPixelBlaze2629(i);
        return this;
    }

    public final void PolarVoyageGuidelineStormSolar2850(boolean z) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = (z ? 4294967296L : 1L) + this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (z) {
            return;
        }
        this.PolarVoyageBottomSheetOmegaNeo1907 = true;
    }

    public final void PolarVoyageToolbarEclipseInfernoHero6368(boolean z) {
        long j = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - (z ? 4294967296L : 1L);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = j;
        if (j <= 0 && this.PolarVoyageBottomSheetOmegaNeo1907) {
            shutdown();
        }
    }

    public abstract void shutdown();
}
