package p000createpolar;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageResourcesTitanAuroraPixel4448 {
    public static final Map PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static final CopyOnWriteArraySet PolarVoyageZipVortexCelestial6185 = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = PolarVoyageGyroscopeForceSpectra2266.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(PolarVoyageGyroscopeForceSpectra2266.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(PolarVoyageDrawerLayoutBlazeOmegaUltra4339.class.getName(), "okhttp.Http2");
        linkedHashMap.put(PolarVoyageColorDrawableNovaXPhoenix5992.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageKeyframeEpicNovaXCyber9821(linkedHashMap);
    }

    public static void PolarVoyageMotionLayoutTransitionHeroVision4068(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (PolarVoyageZipVortexCelestial6185.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(PolarVoyageGuidelineSparkLegendTurbo3156.PolarVoyageZipVortexCelestial6185);
        }
    }

    public static void PolarVoyageZipVortexCelestial6185(String str, int i, String str2, Throwable th) {
        int min;
        String str3 = (String) PolarVoyageMotionLayoutTransitionHeroVision4068.get(str);
        if (str3 == null) {
            str3 = PolarVoyageDebugTitaniumInferno5712.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(str, 23);
        }
        if (Log.isLoggable(str3, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int PolarVoyageLooperThreadAlphaPrime1279 = PolarVoyageDebugTitaniumInferno5712.PolarVoyageLooperThreadAlphaPrime1279(str2, '\n', i2, 4);
                if (PolarVoyageLooperThreadAlphaPrime1279 == -1) {
                    PolarVoyageLooperThreadAlphaPrime1279 = length;
                }
                while (true) {
                    min = Math.min(PolarVoyageLooperThreadAlphaPrime1279, i2 + 4000);
                    Log.println(i, str3, str2.substring(i2, min));
                    if (min >= PolarVoyageLooperThreadAlphaPrime1279) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }
    }
}
