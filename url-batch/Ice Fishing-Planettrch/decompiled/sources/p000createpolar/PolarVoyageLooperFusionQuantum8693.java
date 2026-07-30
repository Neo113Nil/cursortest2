package p000createpolar;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLooperFusionQuantum8693 extends PolarVoyagePermissionHyperCelestial9056 {
    @Override // p000createpolar.PolarVoyageDatabaseTitanRogue6600, p000createpolar.PolarVoyageIntentServiceOmegaPrime2552, p000createpolar.PolarVoyageStateStormPhantom4957
    public void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageConstraintSetTitanEpicNova7758 polarVoyageConstraintSetTitanEpicNova7758, PolarVoyageConstraintSetTitanEpicNova7758 polarVoyageConstraintSetTitanEpicNova77582, Window window, View view, boolean z, boolean z2) {
        polarVoyageConstraintSetTitanEpicNova7758.getClass();
        polarVoyageConstraintSetTitanEpicNova77582.getClass();
        window.getClass();
        view.getClass();
        PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageBottomSheetOmegaNeo1907(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof PolarVoyagePlaceholderOmegaGamma2612)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        int i3 = Build.VERSION.SDK_INT;
        PolarVoyagePackageManagerNeoNeoTurbo8097 polarVoyagePushNotificationSpeedTitanElite6058 = i3 >= 35 ? new PolarVoyagePushNotificationSpeedTitanElite6058(window) : i3 >= 30 ? new PolarVoyageAudioManagerCelestialHyperionOlympian2810(window) : i3 >= 26 ? new PolarVoyageLayoutInflaterCyberVortex9051(window) : new PolarVoyageVectorDrawableCompatNovaXCyber9205(window);
        polarVoyagePushNotificationSpeedTitanElite6058.PolarVoyageViewRogueMaster4778(!z);
        polarVoyagePushNotificationSpeedTitanElite6058.PolarVoyageBottomSheetOmegaNeo1907(true ^ z2);
    }
}
