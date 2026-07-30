package p000createpolar;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLintMegaMaxRogue5881 {
    public final HashMap PolarVoyageKotlinBetaPulseBeta3653;
    public final PolarVoyageAlarmManagerAlphaInferno3493 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageResourcesCelestialInferno9280 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageLintMegaMaxRogue5881(Context context, PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493) {
        PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280 = new PolarVoyageResourcesCelestialInferno9280(context, 1);
        this.PolarVoyageKotlinBetaPulseBeta3653 = new HashMap();
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageResourcesCelestialInferno9280;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageAlarmManagerAlphaInferno3493;
    }

    public final synchronized PolarVoyageKeyEventCelestialTitaniumBlaze4887 PolarVoyageZipVortexCelestial6185(String str) {
        if (this.PolarVoyageKotlinBetaPulseBeta3653.containsKey(str)) {
            return (PolarVoyageKeyEventCelestialTitaniumBlaze4887) this.PolarVoyageKotlinBetaPulseBeta3653.get(str);
        }
        CctBackendFactory PolarVoyageLifecycleOlympianOmega3762 = this.PolarVoyageZipVortexCelestial6185.PolarVoyageLifecycleOlympianOmega3762(str);
        if (PolarVoyageLifecycleOlympianOmega3762 == null) {
            return null;
        }
        PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageKeyEventCelestialTitaniumBlaze4887 create = PolarVoyageLifecycleOlympianOmega3762.create(new PolarVoyagePropertyValuesHolderSolarNebula4316((Context) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageBottomSheetOmegaNeo1907, (PolarVoyageRippleDrawablePrimeSpeedMax5890) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageStrictModeLegendEpic1532, (PolarVoyageRippleDrawablePrimeSpeedMax5890) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageRotateAnimationCyberCelestialDelta4768, str));
        this.PolarVoyageKotlinBetaPulseBeta3653.put(str, create);
        return create;
    }
}
