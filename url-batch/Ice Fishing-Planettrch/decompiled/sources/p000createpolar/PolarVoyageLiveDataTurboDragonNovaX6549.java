package p000createpolar;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageLiveDataTurboDragonNovaX6549 {
    public static String PolarVoyageBarcodeScannerInfernoSolarSpark7767(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean PolarVoyageBitmapVisionAuroraPixel4705(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static ArrayList PolarVoyageKotlinBetaPulseBeta3653(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Object PolarVoyageMotionLayoutTransitionHeroVision4068(Bundle bundle, String str) {
        return bundle.getParcelable(str, PolarVoyageServiceInfoVortexEpicTurbo8786.class);
    }

    public static PackageInfo PolarVoyageZipVortexCelestial6185(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
