package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageInAppPurchaseNovaXEliteSpeed5431 implements PolarVoyageManifestShadowShadow5341 {
    public static final PolarVoyageInAppPurchaseNovaXEliteSpeed5431 PolarVoyageMotionLayoutTransitionHeroVision4068 = new PolarVoyageInAppPurchaseNovaXEliteSpeed5431(0);
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageInAppPurchaseNovaXEliteSpeed5431(int i) {
        this.PolarVoyageZipVortexCelestial6185 = i;
    }

    @Override // p000createpolar.PolarVoyageManifestShadowShadow5341
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068(Class cls) {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return PolarVoyageDrawableCompatOlympianPrime6391.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // p000createpolar.PolarVoyageManifestShadowShadow5341
    public final PolarVoyageEditTextMaxBlazeNovaX6704 PolarVoyageZipVortexCelestial6185(Class cls) {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!PolarVoyageDrawableCompatOlympianPrime6391.class.isAssignableFrom(cls)) {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (PolarVoyageEditTextMaxBlazeNovaX6704) PolarVoyageDrawableCompatOlympianPrime6391.PolarVoyageBarcodeScannerInfernoSolarSpark7767(cls.asSubclass(PolarVoyageDrawableCompatOlympianPrime6391.class)).PolarVoyageKotlinBetaPulseBeta3653(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
