package p000createpolar;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageOrientationSensorPrimeAurora5884 {
    public static final HashMap PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static final SparseArray PolarVoyageZipVortexCelestial6185 = new SparseArray();

    static {
        HashMap hashMap = new HashMap();
        PolarVoyageMotionLayoutTransitionHeroVision4068 = hashMap;
        hashMap.put(PolarVoyageWithContextMasterSpeed4365.PolarVoyageItemDecorationUltraDeltaEpic7485, 0);
        hashMap.put(PolarVoyageWithContextMasterSpeed4365.PolarVoyageStrictModeLegendEpic1532, 1);
        hashMap.put(PolarVoyageWithContextMasterSpeed4365.PolarVoyageRotateAnimationCyberCelestialDelta4768, 2);
        for (PolarVoyageWithContextMasterSpeed4365 polarVoyageWithContextMasterSpeed4365 : hashMap.keySet()) {
            PolarVoyageZipVortexCelestial6185.append(((Integer) PolarVoyageMotionLayoutTransitionHeroVision4068.get(polarVoyageWithContextMasterSpeed4365)).intValue(), polarVoyageWithContextMasterSpeed4365);
        }
    }

    public static PolarVoyageWithContextMasterSpeed4365 PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        PolarVoyageWithContextMasterSpeed4365 polarVoyageWithContextMasterSpeed4365 = (PolarVoyageWithContextMasterSpeed4365) PolarVoyageZipVortexCelestial6185.get(i);
        if (polarVoyageWithContextMasterSpeed4365 != null) {
            return polarVoyageWithContextMasterSpeed4365;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Unknown Priority for value ", i));
        return null;
    }

    public static int PolarVoyageZipVortexCelestial6185(PolarVoyageWithContextMasterSpeed4365 polarVoyageWithContextMasterSpeed4365) {
        Integer num = (Integer) PolarVoyageMotionLayoutTransitionHeroVision4068.get(polarVoyageWithContextMasterSpeed4365);
        if (num != null) {
            return num.intValue();
        }
        PolarVoyageR8UltraEliteBeta8736.PolarVoyageBitmapMaxTitanTitan7960(polarVoyageWithContextMasterSpeed4365, "PriorityMapping is missing known Priority value ");
        return 0;
    }
}
