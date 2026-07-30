package p000createpolar;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageEventEpicPulseTitanium4610 implements PolarVoyageLintForceShadowPhoenix2901 {
    public final Object PolarVoyageBottomSheetOmegaNeo1907 = new Object();
    public ThreadPoolExecutor PolarVoyageCameraPixelBlaze2629;
    public ThreadPoolExecutor PolarVoyageDrawableDeltaHyperion5742;
    public final Context PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageWithContextGammaMaster7108 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public PolarVoyageRewardedAdPixelMaxEclipse6420 PolarVoyageSnackbarGammaEclipse2140;
    public final PolarVoyageInstrumentationMaxLegendBeta6222 PolarVoyageStrictModeLegendEpic1532;
    public Handler PolarVoyageViewRogueMaster4778;

    public PolarVoyageEventEpicPulseTitanium4610(Context context, PolarVoyageInstrumentationMaxLegendBeta6222 polarVoyageInstrumentationMaxLegendBeta6222) {
        PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageBottomSheetOmegaNeo1907(context, "Context cannot be null");
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = context.getApplicationContext();
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageInstrumentationMaxLegendBeta6222;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageInputFilterThunderPulseVision4837.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    public final PolarVoyageProcessCameraProviderDragonEpicCosmos5977 PolarVoyageKotlinBetaPulseBeta3653() {
        try {
            PolarVoyageWithContextGammaMaster7108 polarVoyageWithContextGammaMaster7108 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            Context context = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            PolarVoyageInstrumentationMaxLegendBeta6222 polarVoyageInstrumentationMaxLegendBeta6222 = this.PolarVoyageStrictModeLegendEpic1532;
            polarVoyageWithContextGammaMaster7108.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{polarVoyageInstrumentationMaxLegendBeta6222}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            PolarVoyageViewModelQuantumDragonPhoenix2767 PolarVoyageZipVortexCelestial6185 = PolarVoyageAnimationAuroraHeroHero7652.PolarVoyageZipVortexCelestial6185(context, Collections.unmodifiableList(arrayList));
            int i = PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532;
            if (i != 0) {
                throw new RuntimeException(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("fetchFonts failed (", i, ")"));
            }
            PolarVoyageProcessCameraProviderDragonEpicCosmos5977[] polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr = (PolarVoyageProcessCameraProviderDragonEpicCosmos5977[]) ((List) PolarVoyageZipVortexCelestial6185.PolarVoyageRotateAnimationCyberCelestialDelta4768).get(0);
            if (polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr == null || polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        synchronized (this.PolarVoyageBottomSheetOmegaNeo1907) {
            try {
                this.PolarVoyageSnackbarGammaEclipse2140 = null;
                Handler handler = this.PolarVoyageViewRogueMaster4778;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.PolarVoyageViewRogueMaster4778 = null;
                ThreadPoolExecutor threadPoolExecutor = this.PolarVoyageDrawableDeltaHyperion5742;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.PolarVoyageCameraPixelBlaze2629 = null;
                this.PolarVoyageDrawableDeltaHyperion5742 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000createpolar.PolarVoyageLintForceShadowPhoenix2901
    public final void PolarVoyageZipVortexCelestial6185(PolarVoyageRewardedAdPixelMaxEclipse6420 polarVoyageRewardedAdPixelMaxEclipse6420) {
        synchronized (this.PolarVoyageBottomSheetOmegaNeo1907) {
            this.PolarVoyageSnackbarGammaEclipse2140 = polarVoyageRewardedAdPixelMaxEclipse6420;
        }
        synchronized (this.PolarVoyageBottomSheetOmegaNeo1907) {
            try {
                if (this.PolarVoyageSnackbarGammaEclipse2140 == null) {
                    return;
                }
                if (this.PolarVoyageCameraPixelBlaze2629 == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new PolarVoyageRealtimeDatabaseHyperionStormOmega8666("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.PolarVoyageDrawableDeltaHyperion5742 = threadPoolExecutor;
                    this.PolarVoyageCameraPixelBlaze2629 = threadPoolExecutor;
                }
                this.PolarVoyageCameraPixelBlaze2629.execute(new PolarVoyageLightSensorSparkBlazeTitanium9192(19, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
