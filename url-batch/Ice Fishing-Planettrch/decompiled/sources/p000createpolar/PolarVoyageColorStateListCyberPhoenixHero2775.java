package p000createpolar;

import android.os.Build;
import android.os.StrictMode;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageColorStateListCyberPhoenixHero2775 implements PolarVoyageRemoteConfigEliteSpectra7350 {
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageColorStateListCyberPhoenixHero2775(int i) {
        this.PolarVoyageZipVortexCelestial6185 = i;
    }

    @Override // p000createpolar.PolarVoyageRemoteConfigEliteSpectra7350
    public final Object get() {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Collections.EMPTY_SET;
            case 1:
                PolarVoyageRotateDrawableLegendForce9155 polarVoyageRotateDrawableLegendForce9155 = ExecutorsRegistrar.PolarVoyageZipVortexCelestial6185;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                if (Build.VERSION.SDK_INT >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new PolarVoyageScaleGestureDetectorHyperFusion3036(Executors.newFixedThreadPool(4, new PolarVoyageThemeOverlayUltraInferno5971("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.PolarVoyageBarcodeScannerInfernoSolarSpark7767.get());
            case 2:
                PolarVoyageRotateDrawableLegendForce9155 polarVoyageRotateDrawableLegendForce91552 = ExecutorsRegistrar.PolarVoyageZipVortexCelestial6185;
                return new PolarVoyageScaleGestureDetectorHyperFusion3036(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new PolarVoyageThemeOverlayUltraInferno5971("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.PolarVoyageBarcodeScannerInfernoSolarSpark7767.get());
            case 3:
                PolarVoyageRotateDrawableLegendForce9155 polarVoyageRotateDrawableLegendForce91553 = ExecutorsRegistrar.PolarVoyageZipVortexCelestial6185;
                return new PolarVoyageScaleGestureDetectorHyperFusion3036(Executors.newCachedThreadPool(new PolarVoyageThemeOverlayUltraInferno5971("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.PolarVoyageBarcodeScannerInfernoSolarSpark7767.get());
            case 4:
                PolarVoyageRotateDrawableLegendForce9155 polarVoyageRotateDrawableLegendForce91554 = ExecutorsRegistrar.PolarVoyageZipVortexCelestial6185;
                return Executors.newSingleThreadScheduledExecutor(new PolarVoyageThemeOverlayUltraInferno5971("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
