package p000createpolar;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageDataBindingStrikeStorm9369 {
    public static final PolarVoyageButtonBetaFusion6638 PolarVoyageZipVortexCelestial6185;

    static {
        String str;
        int i = PolarVoyageSoundPoolEclipseMaster7246.PolarVoyageZipVortexCelestial6185;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = PolarVoyageViewModelScopeRogueFusion1953.PolarVoyageNavigationViewHyperHyperHyperion1793(PolarVoyageViewModelScopeRogueFusion1953.PolarVoyageSnackbarGammaEclipse2140(Arrays.asList(new PolarVoyageRotateDrawableForceSpeed2904()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((PolarVoyageRotateDrawableForceSpeed2904) obj).getClass();
                    do {
                        ((PolarVoyageRotateDrawableForceSpeed2904) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((PolarVoyageRotateDrawableForceSpeed2904) obj) == null) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                PolarVoyageZipVortexCelestial6185 = new PolarVoyageButtonBetaFusion6638(PolarVoyageFirebaseDeltaSpark1229.PolarVoyageZipVortexCelestial6185(mainLooper));
            } else {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
