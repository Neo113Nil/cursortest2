package p000createpolar;

import android.R;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageItemDecorationHyperStorm1816 {
    public static final ViewGroup.LayoutParams PolarVoyageZipVortexCelestial6185 = new ViewGroup.LayoutParams(-2, -2);

    public static void PolarVoyageZipVortexCelestial6185(PolarVoyageBannerAdPhoenixForcePhoenix6096 polarVoyageBannerAdPhoenixForcePhoenix6096, PolarVoyageProximitySensorStrikeEclipse8832 polarVoyageProximitySensorStrikeEclipse8832) {
        View childAt = ((ViewGroup) polarVoyageBannerAdPhoenixForcePhoenix6096.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        PolarVoyageAudioManagerEclipseStrike5881 polarVoyageAudioManagerEclipseStrike5881 = childAt instanceof PolarVoyageAudioManagerEclipseStrike5881 ? (PolarVoyageAudioManagerEclipseStrike5881) childAt : null;
        if (polarVoyageAudioManagerEclipseStrike5881 != null) {
            polarVoyageAudioManagerEclipseStrike5881.setParentCompositionContext(null);
            polarVoyageAudioManagerEclipseStrike5881.setContent(polarVoyageProximitySensorStrikeEclipse8832);
            return;
        }
        PolarVoyageAudioManagerEclipseStrike5881 polarVoyageAudioManagerEclipseStrike58812 = new PolarVoyageAudioManagerEclipseStrike5881(polarVoyageBannerAdPhoenixForcePhoenix6096);
        polarVoyageAudioManagerEclipseStrike58812.setParentCompositionContext(null);
        polarVoyageAudioManagerEclipseStrike58812.setContent(polarVoyageProximitySensorStrikeEclipse8832);
        View decorView = polarVoyageBannerAdPhoenixForcePhoenix6096.getWindow().getDecorView();
        if (PolarVoyageVelocityTrackerShadowHyperionShadow8259.PolarVoyageRotateAnimationCyberCelestialDelta4768(decorView) == null) {
            decorView.setTag(com.polarvoyage.glacialoceans.icepathfinder.quest.R.id.view_tree_lifecycle_owner, polarVoyageBannerAdPhoenixForcePhoenix6096);
        }
        if (PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageKotlinBetaPulseBeta3653(decorView) == null) {
            decorView.setTag(com.polarvoyage.glacialoceans.icepathfinder.quest.R.id.view_tree_view_model_store_owner, polarVoyageBannerAdPhoenixForcePhoenix6096);
        }
        if (PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageRotateAnimationCyberCelestialDelta4768(decorView) == null) {
            decorView.setTag(com.polarvoyage.glacialoceans.icepathfinder.quest.R.id.view_tree_saved_state_registry_owner, polarVoyageBannerAdPhoenixForcePhoenix6096);
        }
        polarVoyageBannerAdPhoenixForcePhoenix6096.setContentView(polarVoyageAudioManagerEclipseStrike58812, PolarVoyageZipVortexCelestial6185);
    }
}
