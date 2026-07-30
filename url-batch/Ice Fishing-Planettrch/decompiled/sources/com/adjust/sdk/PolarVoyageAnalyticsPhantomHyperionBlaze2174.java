package com.adjust.sdk;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAnalyticsPhantomHyperionBlaze2174 implements IRunActivityHandler {
    public final /* synthetic */ ActivityHandler PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAnalyticsPhantomHyperionBlaze2174(ActivityHandler activityHandler) {
        this.PolarVoyageZipVortexCelestial6185 = activityHandler;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        AdjustConfig adjustConfig;
        adjustConfig = this.PolarVoyageZipVortexCelestial6185.adjustConfig;
        activityHandler.lambda$setEnabled$5(adjustConfig.startEnabled.booleanValue());
    }
}
