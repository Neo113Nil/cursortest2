package p000createpolar;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFlipAnimationHeroSpectra8345 {
    public final HashMap PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final HashMap PolarVoyageZipVortexCelestial6185 = new HashMap();

    public PolarVoyageFlipAnimationHeroSpectra8345(HashMap hashMap) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            PolarVoyageMaterialButtonSpeedStormGamma5612 polarVoyageMaterialButtonSpeedStormGamma5612 = (PolarVoyageMaterialButtonSpeedStormGamma5612) entry.getValue();
            List list = (List) this.PolarVoyageZipVortexCelestial6185.get(polarVoyageMaterialButtonSpeedStormGamma5612);
            if (list == null) {
                list = new ArrayList();
                this.PolarVoyageZipVortexCelestial6185.put(polarVoyageMaterialButtonSpeedStormGamma5612, list);
            }
            list.add((PolarVoyageLiveDataScopeGammaVision2150) entry.getKey());
        }
    }

    public static void PolarVoyageZipVortexCelestial6185(List list, PolarVoyageTranslateAnimationMegaCyber7300 polarVoyageTranslateAnimationMegaCyber7300, PolarVoyageMaterialButtonSpeedStormGamma5612 polarVoyageMaterialButtonSpeedStormGamma5612, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                PolarVoyageLiveDataScopeGammaVision2150 polarVoyageLiveDataScopeGammaVision2150 = (PolarVoyageLiveDataScopeGammaVision2150) list.get(size);
                Method method = polarVoyageLiveDataScopeGammaVision2150.PolarVoyageMotionLayoutTransitionHeroVision4068;
                try {
                    int i = polarVoyageLiveDataScopeGammaVision2150.PolarVoyageZipVortexCelestial6185;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, polarVoyageTranslateAnimationMegaCyber7300);
                    } else if (i == 2) {
                        method.invoke(obj, polarVoyageTranslateAnimationMegaCyber7300, polarVoyageMaterialButtonSpeedStormGamma5612);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
