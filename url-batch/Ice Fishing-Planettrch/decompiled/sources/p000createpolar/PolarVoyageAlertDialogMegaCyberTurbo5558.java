package p000createpolar;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAlertDialogMegaCyberTurbo5558 {
    public static final ArrayList PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new ArrayList();
    public WeakReference PolarVoyageKotlinBetaPulseBeta3653;
    public SparseArray PolarVoyageMotionLayoutTransitionHeroVision4068;
    public WeakHashMap PolarVoyageZipVortexCelestial6185;

    public final View PolarVoyageZipVortexCelestial6185(View view) {
        int size;
        WeakHashMap weakHashMap = this.PolarVoyageZipVortexCelestial6185;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185(viewGroup.getChildAt(childCount));
                    if (PolarVoyageZipVortexCelestial6185 != null) {
                        return PolarVoyageZipVortexCelestial6185;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
            }
        }
        return null;
    }
}
