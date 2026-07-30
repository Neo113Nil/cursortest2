package p000createpolar;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAlertDialogMasterDragon2417 implements ComponentCallbacks2 {
    public final /* synthetic */ PolarVoyageTextViewTitaniumHyperion2777 PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageAlertDialogMasterDragon2417(PolarVoyageTextViewTitaniumHyperion2777 polarVoyageTextViewTitaniumHyperion2777) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageTextViewTitaniumHyperion2777;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        PolarVoyageTextViewTitaniumHyperion2777 polarVoyageTextViewTitaniumHyperion2777 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        synchronized (polarVoyageTextViewTitaniumHyperion2777) {
            if (((PolarVoyageBottomSheetEpicQuantum9585) ((WeakReference) polarVoyageTextViewTitaniumHyperion2777.PolarVoyageMotionLayoutTransitionHeroVision4068).get()) == null) {
                polarVoyageTextViewTitaniumHyperion2777.PolarVoyageBitmapVisionAuroraPixel4705();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        PolarVoyageOnLongClickListenerHyperionAuroraInferno6701 PolarVoyageKotlinBetaPulseBeta3653;
        long PolarVoyageTextInputEditTextNebulaHero6651;
        PolarVoyageTextViewTitaniumHyperion2777 polarVoyageTextViewTitaniumHyperion2777 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        synchronized (polarVoyageTextViewTitaniumHyperion2777) {
            try {
                PolarVoyageBottomSheetEpicQuantum9585 polarVoyageBottomSheetEpicQuantum9585 = (PolarVoyageBottomSheetEpicQuantum9585) ((WeakReference) polarVoyageTextViewTitaniumHyperion2777.PolarVoyageMotionLayoutTransitionHeroVision4068).get();
                if (polarVoyageBottomSheetEpicQuantum9585 != null) {
                    PolarVoyageBannerAdHyperHyperionVision7941 polarVoyageBannerAdHyperHyperionVision7941 = polarVoyageBottomSheetEpicQuantum9585.PolarVoyageZipVortexCelestial6185;
                    if (i >= 40) {
                        PolarVoyageOnLongClickListenerHyperionAuroraInferno6701 PolarVoyageKotlinBetaPulseBeta36532 = polarVoyageBottomSheetEpicQuantum9585.PolarVoyageKotlinBetaPulseBeta3653();
                        if (PolarVoyageKotlinBetaPulseBeta36532 != null) {
                            synchronized (PolarVoyageKotlinBetaPulseBeta36532.PolarVoyageKotlinBetaPulseBeta3653) {
                                ((PolarVoyageTraceMaxDragonMax4845) PolarVoyageKotlinBetaPulseBeta36532.PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653).PolarVoyageViewRogueMaster4778(-1L);
                                PolarVoyageViewModelQuantumDragonPhoenix2767 polarVoyageViewModelQuantumDragonPhoenix2767 = PolarVoyageKotlinBetaPulseBeta36532.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                polarVoyageViewModelQuantumDragonPhoenix2767.PolarVoyageStrictModeLegendEpic1532 = 0;
                                ((LinkedHashMap) polarVoyageViewModelQuantumDragonPhoenix2767.PolarVoyageRotateAnimationCyberCelestialDelta4768).clear();
                            }
                        }
                    } else if (i >= 20) {
                        ((PolarVoyageTextInputLayoutStrikeVisionStorm9598) polarVoyageTextViewTitaniumHyperion2777.PolarVoyageKotlinBetaPulseBeta3653).PolarVoyageZipVortexCelestial6185(polarVoyageBannerAdHyperHyperionVision7941.PolarVoyageZipVortexCelestial6185);
                    } else if (i >= 10 && (PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageBottomSheetEpicQuantum9585.PolarVoyageKotlinBetaPulseBeta3653()) != null) {
                        synchronized (PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageKotlinBetaPulseBeta3653) {
                            PolarVoyageTextInputEditTextNebulaHero6651 = ((PolarVoyageTraceMaxDragonMax4845) PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653).PolarVoyageTextInputEditTextNebulaHero6651();
                        }
                        long j = PolarVoyageTextInputEditTextNebulaHero6651 / 2;
                        synchronized (PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageKotlinBetaPulseBeta3653) {
                            ((PolarVoyageTraceMaxDragonMax4845) PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653).PolarVoyageViewRogueMaster4778(j);
                        }
                    }
                } else {
                    polarVoyageTextViewTitaniumHyperion2777.PolarVoyageBitmapVisionAuroraPixel4705();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
