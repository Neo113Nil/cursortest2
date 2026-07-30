package p000createpolar;

import android.content.Context;
import android.content.Intent;
import com.polarvoyage.glacialoceans.icepathfinder.quest.PolarContentScreen;
import com.polarvoyage.glacialoceans.icepathfinder.quest.PolarHolderScreen;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRewardedAdRogueNovaNebula9319 {
    public static void PolarVoyageZipVortexCelestial6185(Context context, PolarVoyageConstraintSetClonePixelVortex4921 polarVoyageConstraintSetClonePixelVortex4921) {
        if (polarVoyageConstraintSetClonePixelVortex4921.equals(PolarVoyageManifestOmegaPrimeAlpha6432.PolarVoyageViewRogueMaster4778)) {
            context.startActivity(new Intent(context, (Class<?>) PolarHolderScreen.class));
        } else {
            if (!(polarVoyageConstraintSetClonePixelVortex4921 instanceof PolarVoyageIntentMaxEpicEpic4370)) {
                PolarVoyageAdapterFusionMasterGamma8495.PolarVoyageMotionLayoutTransitionHeroVision4068();
                return;
            }
            Intent intent = new Intent(context, (Class<?>) PolarContentScreen.class);
            intent.putExtra("PolarTransferTag", ((PolarVoyageIntentMaxEpicEpic4370) polarVoyageConstraintSetClonePixelVortex4921).PolarVoyageViewRogueMaster4778);
            context.startActivity(intent);
        }
    }
}
