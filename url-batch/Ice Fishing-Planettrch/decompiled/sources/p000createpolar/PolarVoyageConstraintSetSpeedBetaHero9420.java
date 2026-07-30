package p000createpolar;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageConstraintSetSpeedBetaHero9420 {
    public static void PolarVoyageMotionLayoutTransitionHeroVision4068(View view, PolarVoyageBillingClientHeroForce6622 polarVoyageBillingClientHeroForce6622) {
        PolarVoyageLicensingHyperionVision8455 polarVoyageLicensingHyperionVision8455 = polarVoyageBillingClientHeroForce6622 != null ? new PolarVoyageLicensingHyperionVision8455(view, polarVoyageBillingClientHeroForce6622) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, polarVoyageLicensingHyperionVision8455);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (polarVoyageLicensingHyperionVision8455 != null) {
            view.setOnApplyWindowInsetsListener(polarVoyageLicensingHyperionVision8455);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void PolarVoyageZipVortexCelestial6185(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }
}
