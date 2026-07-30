package p000createpolar;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageObjectAnimatorAuroraPhoenix1946 extends PolarVoyageR8QuantumEpic6903 {
    final /* synthetic */ PolarVoyageSnackbarEliteUltra4527 this$0;

    /* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
    public static final class PolarVoyageOnGlobalLayoutListenerVortexEpic7760 extends PolarVoyageR8QuantumEpic6903 {
        final /* synthetic */ PolarVoyageSnackbarEliteUltra4527 this$0;

        public PolarVoyageOnGlobalLayoutListenerVortexEpic7760(PolarVoyageSnackbarEliteUltra4527 polarVoyageSnackbarEliteUltra4527) {
            this.this$0 = polarVoyageSnackbarEliteUltra4527;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.PolarVoyageKotlinBetaPulseBeta3653();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            PolarVoyageSnackbarEliteUltra4527 polarVoyageSnackbarEliteUltra4527 = this.this$0;
            int i = polarVoyageSnackbarEliteUltra4527.PolarVoyageItemDecorationUltraDeltaEpic7485 + 1;
            polarVoyageSnackbarEliteUltra4527.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
            if (i == 1 && polarVoyageSnackbarEliteUltra4527.PolarVoyageBottomSheetOmegaNeo1907) {
                polarVoyageSnackbarEliteUltra4527.PolarVoyageCameraPixelBlaze2629.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageMaterialButtonSpeedStormGamma5612.ON_START);
                polarVoyageSnackbarEliteUltra4527.PolarVoyageBottomSheetOmegaNeo1907 = false;
            }
        }
    }

    public PolarVoyageObjectAnimatorAuroraPhoenix1946(PolarVoyageSnackbarEliteUltra4527 polarVoyageSnackbarEliteUltra4527) {
        this.this$0 = polarVoyageSnackbarEliteUltra4527;
    }

    @Override // p000createpolar.PolarVoyageR8QuantumEpic6903, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = PolarVoyageDrawableMasterTitanQuantum4990.PolarVoyageStrictModeLegendEpic1532;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((PolarVoyageDrawableMasterTitanQuantum4990) findFragmentByTag).PolarVoyageItemDecorationUltraDeltaEpic7485 = this.this$0.PolarVoyageSnackbarGammaEclipse2140;
        }
    }

    @Override // p000createpolar.PolarVoyageR8QuantumEpic6903, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        PolarVoyageSnackbarEliteUltra4527 polarVoyageSnackbarEliteUltra4527 = this.this$0;
        int i = polarVoyageSnackbarEliteUltra4527.PolarVoyageStrictModeLegendEpic1532 - 1;
        polarVoyageSnackbarEliteUltra4527.PolarVoyageStrictModeLegendEpic1532 = i;
        if (i == 0) {
            Handler handler = polarVoyageSnackbarEliteUltra4527.PolarVoyageViewRogueMaster4778;
            handler.getClass();
            handler.postDelayed(polarVoyageSnackbarEliteUltra4527.PolarVoyageDrawableDeltaHyperion5742, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        PolarVoyageRoomDatabaseNebulaTurbo9943.PolarVoyageStrictModeLegendEpic1532(activity, new PolarVoyageOnGlobalLayoutListenerVortexEpic7760(this.this$0));
    }

    @Override // p000createpolar.PolarVoyageR8QuantumEpic6903, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        PolarVoyageSnackbarEliteUltra4527 polarVoyageSnackbarEliteUltra4527 = this.this$0;
        int i = polarVoyageSnackbarEliteUltra4527.PolarVoyageItemDecorationUltraDeltaEpic7485 - 1;
        polarVoyageSnackbarEliteUltra4527.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        if (i == 0 && polarVoyageSnackbarEliteUltra4527.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            polarVoyageSnackbarEliteUltra4527.PolarVoyageCameraPixelBlaze2629.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageMaterialButtonSpeedStormGamma5612.ON_STOP);
            polarVoyageSnackbarEliteUltra4527.PolarVoyageBottomSheetOmegaNeo1907 = true;
        }
    }
}
