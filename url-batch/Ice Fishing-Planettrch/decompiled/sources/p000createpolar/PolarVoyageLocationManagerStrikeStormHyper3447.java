package p000createpolar;

import android.content.Intent;
import android.content.IntentSender;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageLocationManagerStrikeStormHyper3447 implements Runnable {
    public final /* synthetic */ Object PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageLocationManagerStrikeStormHyper3447(int i, int i2, Object obj, Object obj2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i2;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
        this.PolarVoyageBottomSheetOmegaNeo1907 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageBottomSheetOmegaNeo1907;
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Object obj2 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageFlipAnimationPrimePulse2668 polarVoyageFlipAnimationPrimePulse2668 = (PolarVoyageFlipAnimationPrimePulse2668) obj2;
                Serializable serializable = (Serializable) ((PolarVoyageRealtimeDatabaseEclipseUltra8894) obj).PolarVoyageStrictModeLegendEpic1532;
                String str = (String) polarVoyageFlipAnimationPrimePulse2668.PolarVoyageZipVortexCelestial6185.get(Integer.valueOf(i2));
                if (str != null) {
                    PolarVoyageSoundPoolSolarForceAurora4666 polarVoyageSoundPoolSolarForceAurora4666 = (PolarVoyageSoundPoolSolarForceAurora4666) polarVoyageFlipAnimationPrimePulse2668.PolarVoyageBitmapVisionAuroraPixel4705.get(str);
                    if ((polarVoyageSoundPoolSolarForceAurora4666 != null ? polarVoyageSoundPoolSolarForceAurora4666.PolarVoyageZipVortexCelestial6185 : null) != null) {
                        PolarVoyageRippleDrawableUltraHeroDelta6612 polarVoyageRippleDrawableUltraHeroDelta6612 = polarVoyageSoundPoolSolarForceAurora4666.PolarVoyageZipVortexCelestial6185;
                        if (polarVoyageFlipAnimationPrimePulse2668.PolarVoyageBarcodeScannerInfernoSolarSpark7767.remove(str)) {
                            polarVoyageRippleDrawableUltraHeroDelta6612.PolarVoyageMotionLayoutTransitionHeroVision4068(serializable);
                            break;
                        }
                    } else {
                        polarVoyageFlipAnimationPrimePulse2668.PolarVoyageTextInputEditTextNebulaHero6651.remove(str);
                        polarVoyageFlipAnimationPrimePulse2668.PolarVoyageDiffUtilTurboStrike5735.put(str, serializable);
                        break;
                    }
                }
                break;
            case 1:
                ((PolarVoyageFlipAnimationPrimePulse2668) obj2).PolarVoyageZipVortexCelestial6185(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 2:
                ((PolarVoyagePermissionInfoNebulaSparkCosmos8006) ((PolarVoyageGeocoderEclipsePulseUltra5219) obj2).PolarVoyageKotlinBetaPulseBeta3653).PolarVoyageContentProviderHyperSpark3838(i2, obj);
                break;
            default:
                PolarVoyageMapBlazeAlpha6089 polarVoyageMapBlazeAlpha6089 = (PolarVoyageMapBlazeAlpha6089) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    PolarVoyageGeocoderNovaStrike6149 polarVoyageGeocoderNovaStrike6149 = (PolarVoyageGeocoderNovaStrike6149) it.next();
                    if (!polarVoyageGeocoderNovaStrike6149.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                        if (i2 != -1) {
                            polarVoyageGeocoderNovaStrike6149.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185(i2);
                        }
                        polarVoyageGeocoderNovaStrike6149.PolarVoyageKotlinBetaPulseBeta3653 = true;
                        polarVoyageMapBlazeAlpha6089.PolarVoyageZipVortexCelestial6185(polarVoyageGeocoderNovaStrike6149.PolarVoyageZipVortexCelestial6185);
                    }
                }
                break;
        }
    }
}
