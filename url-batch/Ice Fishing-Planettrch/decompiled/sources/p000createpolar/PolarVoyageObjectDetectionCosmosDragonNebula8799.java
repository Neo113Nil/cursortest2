package p000createpolar;

import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageObjectDetectionCosmosDragonNebula8799 {
    public static Insets PolarVoyageBarcodeScannerInfernoSolarSpark7767(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void PolarVoyageBitmapVisionAuroraPixel4705(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void PolarVoyageDiffUtilTurboStrike5735(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void PolarVoyageItemDecorationUltraDeltaEpic7485(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static CharSequence PolarVoyageKotlinBetaPulseBeta3653(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static void PolarVoyageTextInputEditTextNebulaHero6651(View view) {
        view.setImportantForContentCapture(1);
    }

    public static Icon PolarVoyageZipVortexCelestial6185(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }
}
