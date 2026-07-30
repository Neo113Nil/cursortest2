package p000createpolar;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageLayoutInflaterTitaniumStrike4588 {
    public static final /* synthetic */ int PolarVoyageZipVortexCelestial6185 = 0;

    static {
        new WeakHashMap();
    }

    public static void PolarVoyageMotionLayoutTransitionHeroVision4068(View view, PolarVoyageBundlePrimeVortexOmega9817 polarVoyageBundlePrimeVortexOmega9817) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(polarVoyageBundlePrimeVortexOmega9817 != null ? new PolarVoyageInterstitialAdInfernoEclipseNebula6187(polarVoyageBundlePrimeVortexOmega9817) : null);
            return;
        }
        PathInterpolator pathInterpolator = PolarVoyageNavigationViewSpectraEpicDragon1046.PolarVoyageBitmapVisionAuroraPixel4705;
        View.OnApplyWindowInsetsListener polarVoyageGradlePluginUltraSpeed3253 = polarVoyageBundlePrimeVortexOmega9817 != null ? new PolarVoyageGradlePluginUltraSpeed3253(view, polarVoyageBundlePrimeVortexOmega9817) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, polarVoyageGradlePluginUltraSpeed3253);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(polarVoyageGradlePluginUltraSpeed3253);
        }
    }

    public static void PolarVoyageZipVortexCelestial6185(ViewGroup viewGroup, PolarVoyageCombineRoguePulse7620 polarVoyageCombineRoguePulse7620) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(polarVoyageCombineRoguePulse7620.PolarVoyageMotionLayoutTransitionHeroVision4068);
    }
}
