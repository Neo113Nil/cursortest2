package com.adjust.sdk;

import java.util.ArrayList;
import p000createpolar.PolarVoyageVibratorInfernoPhoenixFusion4401;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBarcodeScannerTitanRogue6678 {
    public final ActivityHandler PolarVoyageZipVortexCelestial6185;
    public final ArrayList PolarVoyageMotionLayoutTransitionHeroVision4068 = new ArrayList();
    public int PolarVoyageKotlinBetaPulseBeta3653 = 0;

    public PolarVoyageBarcodeScannerTitanRogue6678(ActivityHandler activityHandler) {
        this.PolarVoyageZipVortexCelestial6185 = activityHandler;
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(String str, IRunActivityHandler iRunActivityHandler) {
        int i = this.PolarVoyageKotlinBetaPulseBeta3653;
        ActivityHandler activityHandler = this.PolarVoyageZipVortexCelestial6185;
        if (i != 3) {
            iRunActivityHandler.run(activityHandler);
        } else {
            activityHandler.getAdjustConfig().getLogger().debug(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBottomSheetOmegaNeo1907("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            activityHandler.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
        }
    }

    public final void PolarVoyageZipVortexCelestial6185(Runnable runnable, String str) {
        if (this.PolarVoyageKotlinBetaPulseBeta3653 != 3) {
            runnable.run();
        } else {
            this.PolarVoyageZipVortexCelestial6185.getAdjustConfig().getLogger().debug(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBottomSheetOmegaNeo1907("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            this.PolarVoyageMotionLayoutTransitionHeroVision4068.add(runnable);
        }
    }
}
