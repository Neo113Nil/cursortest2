package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTypefaceNebulaNovaXLegend1453 implements PolarVoyageFragmentTransactionOlympianSparkMega1365 {
    public boolean PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageInputMethodManagerEclipseMegaBlaze2928 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Object PolarVoyageRotateAnimationCyberCelestialDelta4768 = new Object();
    public final PolarVoyageNavigationViewNebulaNovaXPhoenix7849 PolarVoyageStrictModeLegendEpic1532;
    public final PolarVoyageThemeOverlayShadowPulse8967 PolarVoyageViewRogueMaster4778;

    public PolarVoyageTypefaceNebulaNovaXLegend1453(PolarVoyageThemeOverlayShadowPulse8967 polarVoyageThemeOverlayShadowPulse8967, PolarVoyageInputMethodManagerEclipseMegaBlaze2928 polarVoyageInputMethodManagerEclipseMegaBlaze2928, PolarVoyageNavigationViewNebulaNovaXPhoenix7849 polarVoyageNavigationViewNebulaNovaXPhoenix7849) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageInputMethodManagerEclipseMegaBlaze2928;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageNavigationViewNebulaNovaXPhoenix7849;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageThemeOverlayShadowPulse8967;
    }

    @Override // p000createpolar.PolarVoyageFragmentTransactionOlympianSparkMega1365
    public final PolarVoyageThemeOverlayShadowPulse8967 PolarVoyageLooperThreadAlphaPrime1279() {
        PolarVoyageThemeOverlayShadowPulse8967 polarVoyageThemeOverlayShadowPulse8967;
        synchronized (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            try {
                if (this.PolarVoyageBottomSheetOmegaNeo1907) {
                    throw new IllegalStateException("closed");
                }
                polarVoyageThemeOverlayShadowPulse8967 = this.PolarVoyageViewRogueMaster4778;
                if (polarVoyageThemeOverlayShadowPulse8967 == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return polarVoyageThemeOverlayShadowPulse8967;
    }

    @Override // p000createpolar.PolarVoyageFragmentTransactionOlympianSparkMega1365
    public final PolarVoyageNavigationViewNebulaNovaXPhoenix7849 PolarVoyageNavigationViewHyperHyperHyperion1793() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // p000createpolar.PolarVoyageFragmentTransactionOlympianSparkMega1365
    public final PolarVoyageCameraPhantomNova9854 PolarVoyageRemoteModelManagerOlympianCelestial9141() {
        synchronized (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            if (this.PolarVoyageBottomSheetOmegaNeo1907) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = true;
            PolarVoyageThemeOverlayShadowPulse8967 polarVoyageThemeOverlayShadowPulse8967 = this.PolarVoyageViewRogueMaster4778;
            if (polarVoyageThemeOverlayShadowPulse8967 != null) {
                try {
                    polarVoyageThemeOverlayShadowPulse8967.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // p000createpolar.PolarVoyageFragmentTransactionOlympianSparkMega1365
    public final PolarVoyageInputMethodManagerEclipseMegaBlaze2928 getFileSystem() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }
}
