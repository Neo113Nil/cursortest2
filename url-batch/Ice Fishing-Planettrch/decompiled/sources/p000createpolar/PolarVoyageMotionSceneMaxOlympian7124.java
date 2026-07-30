package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMotionSceneMaxOlympian7124 implements PolarVoyageFragmentTransactionOlympianSparkMega1365 {
    public final AutoCloseable PolarVoyageBottomSheetOmegaNeo1907;
    public boolean PolarVoyageCameraPixelBlaze2629;
    public PolarVoyageEventLegendDragon2659 PolarVoyageDrawableDeltaHyperion5742;
    public final PolarVoyageCameraPhantomNova9854 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final String PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageInputMethodManagerEclipseMegaBlaze2928 PolarVoyageStrictModeLegendEpic1532;
    public final Object PolarVoyageViewRogueMaster4778 = new Object();

    public PolarVoyageMotionSceneMaxOlympian7124(PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854, PolarVoyageInputMethodManagerEclipseMegaBlaze2928 polarVoyageInputMethodManagerEclipseMegaBlaze2928, String str, AutoCloseable autoCloseable) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageCameraPhantomNova9854;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageInputMethodManagerEclipseMegaBlaze2928;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = str;
        this.PolarVoyageBottomSheetOmegaNeo1907 = autoCloseable;
    }

    @Override // p000createpolar.PolarVoyageFragmentTransactionOlympianSparkMega1365
    public final PolarVoyageThemeOverlayShadowPulse8967 PolarVoyageLooperThreadAlphaPrime1279() {
        synchronized (this.PolarVoyageViewRogueMaster4778) {
            if (this.PolarVoyageCameraPixelBlaze2629) {
                throw new IllegalStateException("closed");
            }
            PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659 = this.PolarVoyageDrawableDeltaHyperion5742;
            if (polarVoyageEventLegendDragon2659 != null) {
                return polarVoyageEventLegendDragon2659;
            }
            PolarVoyageRoomDaoRogueGamma6879 PolarVoyageAlertDialogCyberHeroQuantum3938 = this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageAlertDialogCyberHeroQuantum3938(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
            PolarVoyageAlertDialogCyberHeroQuantum3938.getClass();
            PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon26592 = new PolarVoyageEventLegendDragon2659(PolarVoyageAlertDialogCyberHeroQuantum3938);
            this.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageEventLegendDragon26592;
            return polarVoyageEventLegendDragon26592;
        }
    }

    @Override // p000createpolar.PolarVoyageFragmentTransactionOlympianSparkMega1365
    public final PolarVoyageNavigationViewNebulaNovaXPhoenix7849 PolarVoyageNavigationViewHyperHyperHyperion1793() {
        return null;
    }

    @Override // p000createpolar.PolarVoyageFragmentTransactionOlympianSparkMega1365
    public final PolarVoyageCameraPhantomNova9854 PolarVoyageRemoteModelManagerOlympianCelestial9141() {
        PolarVoyageCameraPhantomNova9854 polarVoyageCameraPhantomNova9854;
        synchronized (this.PolarVoyageViewRogueMaster4778) {
            if (this.PolarVoyageCameraPixelBlaze2629) {
                throw new IllegalStateException("closed");
            }
            polarVoyageCameraPhantomNova9854 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        }
        return polarVoyageCameraPhantomNova9854;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.PolarVoyageViewRogueMaster4778) {
            this.PolarVoyageCameraPixelBlaze2629 = true;
            PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659 = this.PolarVoyageDrawableDeltaHyperion5742;
            if (polarVoyageEventLegendDragon2659 != null) {
                try {
                    polarVoyageEventLegendDragon2659.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            AutoCloseable autoCloseable = this.PolarVoyageBottomSheetOmegaNeo1907;
            if (autoCloseable != null) {
                try {
                    PolarVoyageRealtimeDatabaseCyberShadowForce7689.PolarVoyageDiffUtilTurboStrike5735(autoCloseable);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // p000createpolar.PolarVoyageFragmentTransactionOlympianSparkMega1365
    public final PolarVoyageInputMethodManagerEclipseMegaBlaze2928 getFileSystem() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }
}
