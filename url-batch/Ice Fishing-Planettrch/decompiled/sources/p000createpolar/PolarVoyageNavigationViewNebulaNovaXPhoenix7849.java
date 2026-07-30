package p000createpolar;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import coil3.compose.internal.ContentPainterElement;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageNavigationViewNebulaNovaXPhoenix7849 {
    public static PolarVoyageNavigationPrimePhoenix7347 PolarVoyageBottomSheetOmegaNeo1907;
    public static final PolarVoyageResourcesCelestialInferno9280 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public static final PolarVoyageResourcesCelestialInferno9280 PolarVoyageStrictModeLegendEpic1532;
    public static final PolarVoyageResourcesCelestialInferno9280 PolarVoyageTextInputEditTextNebulaHero6651;
    public static AudioManager PolarVoyageZipVortexCelestial6185;
    public static final PolarVoyageBarcodeScannerElitePhoenix6619 PolarVoyageMotionLayoutTransitionHeroVision4068 = new PolarVoyageBarcodeScannerElitePhoenix6619();
    public static final PolarVoyageScrollViewNovaMega6604 PolarVoyageKotlinBetaPulseBeta3653 = new PolarVoyageScrollViewNovaMega6604();
    public static final PolarVoyageResourcesUltraBlazeSpectra7401 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageResourcesUltraBlazeSpectra7401();
    public static final byte[] PolarVoyageBitmapVisionAuroraPixel4705 = {54, 58, 53, 62, 50, 57, 35, 1, 50, 52, 35, 56, 37, 20, 56, 58, 39, 62, 59, 50, 37};
    public static final StackTraceElement[] PolarVoyageDiffUtilTurboStrike5735 = new StackTraceElement[0];
    public static final Object PolarVoyageRotateAnimationCyberCelestialDelta4768 = new Object();

    static {
        int i = 21;
        PolarVoyageTextInputEditTextNebulaHero6651 = new PolarVoyageResourcesCelestialInferno9280(i, new PolarVoyageOnClickListenerNeoAlpha7671(10), new PolarVoyageScaleGestureDetectorOlympianTurboSpeed9034(25));
        PolarVoyageItemDecorationUltraDeltaEpic7485 = new PolarVoyageResourcesCelestialInferno9280(i, new PolarVoyageOnClickListenerNeoAlpha7671(11), new PolarVoyageScaleGestureDetectorOlympianTurboSpeed9034(26));
        PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageResourcesCelestialInferno9280(i, new PolarVoyageOnClickListenerNeoAlpha7671(12), new PolarVoyageScaleGestureDetectorOlympianTurboSpeed9034(27));
    }

    public static synchronized AudioManager PolarVoyageActivityInfoBetaQuantum8726(Context context) {
        synchronized (PolarVoyageNavigationViewNebulaNovaXPhoenix7849.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    PolarVoyageZipVortexCelestial6185 = null;
                }
                AudioManager audioManager = PolarVoyageZipVortexCelestial6185;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    PolarVoyageBindingAdapterStrikeCosmos6770 polarVoyageBindingAdapterStrikeCosmos6770 = new PolarVoyageBindingAdapterStrikeCosmos6770();
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyagePackageManagerCelestialPhoenix8393().execute(new PolarVoyageMediaPlayerNebulaTurboLegend3509(4, applicationContext, polarVoyageBindingAdapterStrikeCosmos6770));
                    polarVoyageBindingAdapterStrikeCosmos6770.PolarVoyageZipVortexCelestial6185();
                    AudioManager audioManager2 = PolarVoyageZipVortexCelestial6185;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                PolarVoyageZipVortexCelestial6185 = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName PolarVoyageAlarmManagerShadowHyperBeta8339(Context context, Intent intent) {
        synchronized (PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            try {
                PolarVoyageRemoteModelManagerOlympianCelestial9141(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageZipVortexCelestial6185();
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final boolean PolarVoyageAlertDialogCyberHeroQuantum3938(long j, long j2) {
        return j == j2;
    }

    public static final long PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j) {
        long j2 = j << 32;
        int i = PolarVoyageContentResolverRogueSpeed9469.PolarVoyageItemDecorationUltraDeltaEpic7485;
        return j2;
    }

    public static void PolarVoyageBitmapMaxTitanTitan7960(Intent intent) {
        synchronized (PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            try {
                if (PolarVoyageBottomSheetOmegaNeo1907 != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageKotlinBetaPulseBeta3653();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long PolarVoyageBitmapVisionAuroraPixel4705(int i, int i2, int i3) {
        return PolarVoyageKotlinBetaPulseBeta3653(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final void PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon8768, PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718) {
        PolarVoyageRunnableNovaXOlympian7121 polarVoyageRunnableNovaXOlympian7121 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageConfigurationMaxSpectraForce5418.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutForceEpicAurora7183;
        polarVoyageRunnableNovaXOlympian7121.PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587(PolarVoyageR8LegendPixelInferno6137.PolarVoyageKotlinBetaPulseBeta3653);
        PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageKeyframeEpicNovaXCyber9821(polarVoyageRunnableNovaXOlympian7121, 0, polarVoyageFragmentPulseEliteDragon8768);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0080 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object PolarVoyageCameraPixelBlaze2629(List list, PolarVoyageTimerStormElite7612 polarVoyageTimerStormElite7612, PolarVoyageMotionSceneHyperVisionVision6497 polarVoyageMotionSceneHyperVisionVision6497) {
        PolarVoyageClipboardManagerUltraTitan4546 polarVoyageClipboardManagerUltraTitan4546;
        int i;
        List list2;
        PolarVoyageFragmentTransactionMaxMaxMega5005 polarVoyageFragmentTransactionMaxMaxMega5005;
        Iterator it;
        Throwable th;
        if (polarVoyageMotionSceneHyperVisionVision6497 instanceof PolarVoyageClipboardManagerUltraTitan4546) {
            polarVoyageClipboardManagerUltraTitan4546 = (PolarVoyageClipboardManagerUltraTitan4546) polarVoyageMotionSceneHyperVisionVision6497;
            int i2 = polarVoyageClipboardManagerUltraTitan4546.PolarVoyageDrawableDeltaHyperion5742;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polarVoyageClipboardManagerUltraTitan4546.PolarVoyageDrawableDeltaHyperion5742 = i2 - Integer.MIN_VALUE;
                Object obj = polarVoyageClipboardManagerUltraTitan4546.PolarVoyageCameraPixelBlaze2629;
                i = polarVoyageClipboardManagerUltraTitan4546.PolarVoyageDrawableDeltaHyperion5742;
                Object obj2 = PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (i != 0) {
                    PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                    ArrayList arrayList = new ArrayList();
                    PolarVoyageMotionSceneDragonTitaniumTurbo1948 polarVoyageMotionSceneDragonTitaniumTurbo1948 = new PolarVoyageMotionSceneDragonTitaniumTurbo1948(list, arrayList, null);
                    polarVoyageClipboardManagerUltraTitan4546.PolarVoyageBottomSheetOmegaNeo1907 = arrayList;
                    polarVoyageClipboardManagerUltraTitan4546.PolarVoyageDrawableDeltaHyperion5742 = 1;
                    if (polarVoyageTimerStormElite7612.PolarVoyageZipVortexCelestial6185(polarVoyageMotionSceneDragonTitaniumTurbo1948, polarVoyageClipboardManagerUltraTitan4546) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = polarVoyageClipboardManagerUltraTitan4546.PolarVoyageViewRogueMaster4778;
                        polarVoyageFragmentTransactionMaxMaxMega5005 = (PolarVoyageFragmentTransactionMaxMaxMega5005) polarVoyageClipboardManagerUltraTitan4546.PolarVoyageBottomSheetOmegaNeo1907;
                        try {
                            PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                        } catch (Throwable th2) {
                            Object obj3 = polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485;
                            if (obj3 == null) {
                                polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485 = th2;
                            } else {
                                PolarVoyageTransformNeoTitanium1654.PolarVoyageItemDecorationUltraDeltaEpic7485((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax1492 = (PolarVoyageStateFlowNebulaMax1492) it.next();
                            polarVoyageClipboardManagerUltraTitan4546.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageFragmentTransactionMaxMaxMega5005;
                            polarVoyageClipboardManagerUltraTitan4546.PolarVoyageViewRogueMaster4778 = it;
                            polarVoyageClipboardManagerUltraTitan4546.PolarVoyageDrawableDeltaHyperion5742 = 2;
                            if (polarVoyageStateFlowNebulaMax1492.PolarVoyageZipVortexCelestial6185(polarVoyageClipboardManagerUltraTitan4546) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        if (th == null) {
                            return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                        }
                        throw th;
                    }
                    list2 = (List) polarVoyageClipboardManagerUltraTitan4546.PolarVoyageBottomSheetOmegaNeo1907;
                    PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                }
                polarVoyageFragmentTransactionMaxMaxMega5005 = new PolarVoyageFragmentTransactionMaxMaxMega5005();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (th == null) {
                }
            }
        }
        polarVoyageClipboardManagerUltraTitan4546 = new PolarVoyageClipboardManagerUltraTitan4546(polarVoyageMotionSceneHyperVisionVision6497);
        Object obj4 = polarVoyageClipboardManagerUltraTitan4546.PolarVoyageCameraPixelBlaze2629;
        i = polarVoyageClipboardManagerUltraTitan4546.PolarVoyageDrawableDeltaHyperion5742;
        Object obj22 = PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i != 0) {
        }
        polarVoyageFragmentTransactionMaxMaxMega5005 = new PolarVoyageFragmentTransactionMaxMaxMega5005();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) polarVoyageFragmentTransactionMaxMaxMega5005.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (th == null) {
        }
    }

    public static final long PolarVoyageCameraViewSpectraMaxSpectra2824(long j, boolean z, int i, float f) {
        int PolarVoyageItemDecorationUltraDeltaEpic74852 = ((z || i == 2 || i == 4 || i == 5) && PolarVoyageClipDrawableOmegaInferno8443.PolarVoyageBarcodeScannerInfernoSolarSpark7767(j)) ? PolarVoyageClipDrawableOmegaInferno8443.PolarVoyageItemDecorationUltraDeltaEpic7485(j) : Integer.MAX_VALUE;
        if (PolarVoyageClipDrawableOmegaInferno8443.PolarVoyageRotateAnimationCyberCelestialDelta4768(j) != PolarVoyageItemDecorationUltraDeltaEpic74852) {
            PolarVoyageItemDecorationUltraDeltaEpic74852 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageCameraViewSpectraMaxSpectra2824(PolarVoyageAdapterBlazeMasterVision5429.PolarVoyageMotionLayoutTransitionHeroVision4068(f), PolarVoyageClipDrawableOmegaInferno8443.PolarVoyageRotateAnimationCyberCelestialDelta4768(j), PolarVoyageItemDecorationUltraDeltaEpic74852);
        }
        return PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageCameraViewSpectraMaxSpectra2824(0, PolarVoyageItemDecorationUltraDeltaEpic74852, 0, PolarVoyageClipDrawableOmegaInferno8443.PolarVoyageTextInputEditTextNebulaHero6651(j));
    }

    public static final String PolarVoyageCanvasElitePhoenix4750(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageZipVortexCelestial6185;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageBitmapMaxTitanTitan7960(i2, 8, 8);
        return new String(cArr2, i2, 8 - i2);
    }

    public static final Object PolarVoyageCardViewAlphaVortexCelestial9747(PolarVoyageBitmapMegaPixelNovaX8457 polarVoyageBitmapMegaPixelNovaX8457, PolarVoyageRecyclerViewShadowRogue1249 polarVoyageRecyclerViewShadowRogue1249) {
        polarVoyageRecyclerViewShadowRogue1249.getClass();
        Object obj = polarVoyageBitmapMegaPixelNovaX8457.get(polarVoyageRecyclerViewShadowRogue1249);
        if (obj == null) {
            obj = polarVoyageRecyclerViewShadowRogue1249.PolarVoyageMotionLayoutTransitionHeroVision4068();
        }
        return ((PolarVoyageColorStateListInflaterSparkNebula5326) obj).PolarVoyageZipVortexCelestial6185(polarVoyageBitmapMegaPixelNovaX8457);
    }

    public static final Bitmap.Config PolarVoyageConfigurationMaxSpectraForce5418(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i2 < 26 || i != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static void PolarVoyageContentProviderHyperSpark3838(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList4.get(i8)).PolarVoyageBarcodeScannerInfernoSolarSpark7767() < i7) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Failed requirement.");
                return;
            }
        }
        PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967 = (PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList.get(i2);
        PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo29672 = (PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList4.get(i3 - 1);
        if (i7 == polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageBarcodeScannerInfernoSolarSpark7767()) {
            int intValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo29673 = (PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList4.get(i9);
            i4 = i9;
            i5 = intValue;
            polarVoyagePropertyValuesHolderVortexNeo2967 = polarVoyagePropertyValuesHolderVortexNeo29673;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageStrictModeLegendEpic1532(i7) == polarVoyagePropertyValuesHolderVortexNeo29672.PolarVoyageStrictModeLegendEpic1532(i7)) {
            int min = Math.min(polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageBarcodeScannerInfernoSolarSpark7767(), polarVoyagePropertyValuesHolderVortexNeo29672.PolarVoyageBarcodeScannerInfernoSolarSpark7767());
            int i10 = 0;
            for (int i11 = i7; i11 < min && polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageStrictModeLegendEpic1532(i11) == polarVoyagePropertyValuesHolderVortexNeo29672.PolarVoyageStrictModeLegendEpic1532(i11); i11++) {
                i10++;
            }
            long j3 = (polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 / 4) + j + 2 + i10 + 1;
            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageGuidelineStormSolar2850(-i10);
            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageGuidelineStormSolar2850(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageGuidelineStormSolar2850(polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageStrictModeLegendEpic1532(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList4.get(i4)).PolarVoyageBarcodeScannerInfernoSolarSpark7767()) {
                    polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageGuidelineStormSolar2850(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Check failed.");
                    return;
                }
            }
            PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster41202 = new PolarVoyageSnackbarSpectraMasterMaster4120();
            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageGuidelineStormSolar2850(((int) ((polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageStrictModeLegendEpic1532 / 4) + j3)) * (-1));
            PolarVoyageContentProviderHyperSpark3838(j3, polarVoyageSnackbarSpectraMasterMaster41202, i12, arrayList4, i4, i3, arrayList5);
            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageFlingGestureEclipsePrimeMax1376(polarVoyageSnackbarSpectraMasterMaster41202);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList4.get(i14 - 1)).PolarVoyageStrictModeLegendEpic1532(i7) != ((PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList4.get(i14)).PolarVoyageStrictModeLegendEpic1532(i7)) {
                i13++;
            }
        }
        long j4 = (polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 / 4) + j + 2 + (i13 * 2);
        polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageGuidelineStormSolar2850(i13);
        polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageGuidelineStormSolar2850(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int PolarVoyageStrictModeLegendEpic15322 = ((PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList4.get(i15)).PolarVoyageStrictModeLegendEpic1532(i7);
            if (i15 == i4 || PolarVoyageStrictModeLegendEpic15322 != ((PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList4.get(i15 - 1)).PolarVoyageStrictModeLegendEpic1532(i7)) {
                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageGuidelineStormSolar2850(PolarVoyageStrictModeLegendEpic15322 & 255);
            }
        }
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster41203 = new PolarVoyageSnackbarSpectraMasterMaster4120();
        int i16 = i4;
        while (i16 < i3) {
            byte PolarVoyageStrictModeLegendEpic15323 = ((PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList4.get(i16)).PolarVoyageStrictModeLegendEpic1532(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (PolarVoyageStrictModeLegendEpic15323 != ((PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList4.get(i18)).PolarVoyageStrictModeLegendEpic1532(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((PolarVoyagePropertyValuesHolderVortexNeo2967) arrayList4.get(i16)).PolarVoyageBarcodeScannerInfernoSolarSpark7767()) {
                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageGuidelineStormSolar2850(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageGuidelineStormSolar2850(((int) ((polarVoyageSnackbarSpectraMasterMaster41203.PolarVoyageStrictModeLegendEpic1532 / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                PolarVoyageContentProviderHyperSpark3838(j2, polarVoyageSnackbarSpectraMasterMaster41203, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageFlingGestureEclipsePrimeMax1376(polarVoyageSnackbarSpectraMasterMaster41203);
    }

    public static Object PolarVoyageDiffUtilDragonSpeedEclipse6225(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
        return null;
    }

    public static final void PolarVoyageDiffUtilTurboStrike5735(Object obj, PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax1492, PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718) {
        boolean PolarVoyageDiffUtilTurboStrike57352 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(obj);
        Object PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
        if (PolarVoyageDiffUtilTurboStrike57352 || PolarVoyageAlarmManagerShadowHyperBeta8339 == PolarVoyageAnimationEliteMasterHero7289.PolarVoyageZipVortexCelestial6185) {
            PolarVoyageAlarmManagerShadowHyperBeta8339 = new PolarVoyageObserverTurboSpeed4054(polarVoyageStateFlowNebulaMax1492);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta8339);
        }
    }

    public static final PolarVoyageRealtimeDatabaseShadowPhantomHyperion1256 PolarVoyageDisplayMetricsVortexDragon9516(PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718) {
        return new PolarVoyageAnimatedVectorDrawableTitanGammaOlympian3150(polarVoyageFlowCollectorEliteStrike5718.PolarVoyagePoseDetectionCosmosVision6217);
    }

    public static final boolean PolarVoyageDrawableDeltaHyperion5742(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(PolarVoyageDebugStrikeEclipseQuantum3290 polarVoyageDebugStrikeEclipseQuantum3290, PolarVoyageTextInputLayoutTitaniumGamma2126 polarVoyageTextInputLayoutTitaniumGamma2126, boolean z) {
        Object obj = PolarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageDrawableDeltaHyperion5742.get(polarVoyageDebugStrikeEclipseQuantum3290);
        Throwable PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageBitmapVisionAuroraPixel4705(obj);
        Object polarVoyageTraceThunderMaster6506 = PolarVoyageBitmapVisionAuroraPixel47052 != null ? new PolarVoyageTraceThunderMaster6506(PolarVoyageBitmapVisionAuroraPixel47052) : polarVoyageDebugStrikeEclipseQuantum3290.PolarVoyageDiffUtilTurboStrike5735(obj);
        if (!z) {
            polarVoyageTextInputLayoutTitaniumGamma2126.PolarVoyageViewRogueMaster4778(polarVoyageTraceThunderMaster6506);
            return;
        }
        polarVoyageTextInputLayoutTitaniumGamma2126.getClass();
        PolarVoyageContentProviderEclipseSolarVortex9392 polarVoyageContentProviderEclipseSolarVortex9392 = (PolarVoyageContentProviderEclipseSolarVortex9392) polarVoyageTextInputLayoutTitaniumGamma2126;
        PolarVoyageMotionSceneHyperVisionVision6497 polarVoyageMotionSceneHyperVisionVision6497 = polarVoyageContentProviderEclipseSolarVortex9392.PolarVoyageViewRogueMaster4778;
        Object obj2 = polarVoyageContentProviderEclipseSolarVortex9392.PolarVoyageDrawableDeltaHyperion5742;
        PolarVoyageEventNebulaCelestialOlympian6822 context = polarVoyageMotionSceneHyperVisionVision6497.getContext();
        Object PolarVoyageWithContextPulseSolarHyperion4393 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageWithContextPulseSolarHyperion4393(context, obj2);
        PolarVoyageObjectDetectionMaxEliteNovaX1593 PolarVoyageSensorManagerFusionPixelSolar7026 = PolarVoyageWithContextPulseSolarHyperion4393 != PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDiffUtilTurboStrike5735 ? PolarVoyageR8VisionOmegaNebula9943.PolarVoyageSensorManagerFusionPixelSolar7026(polarVoyageMotionSceneHyperVisionVision6497, context, PolarVoyageWithContextPulseSolarHyperion4393) : null;
        try {
            polarVoyageMotionSceneHyperVisionVision6497.PolarVoyageViewRogueMaster4778(polarVoyageTraceThunderMaster6506);
            if (PolarVoyageSensorManagerFusionPixelSolar7026 == null || PolarVoyageSensorManagerFusionPixelSolar7026.PolarVoyageObserverEliteUltra2793()) {
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageHandlerThreadMaxAurora5064(context, PolarVoyageWithContextPulseSolarHyperion4393);
            }
        } catch (Throwable th) {
            if (PolarVoyageSensorManagerFusionPixelSolar7026 == null || PolarVoyageSensorManagerFusionPixelSolar7026.PolarVoyageObserverEliteUltra2793()) {
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageHandlerThreadMaxAurora5064(context, PolarVoyageWithContextPulseSolarHyperion4393);
            }
            throw th;
        }
    }

    public static PolarVoyageZoomStateAlphaVision6590 PolarVoyageFlingGestureEclipsePrimeMax1376(PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312) {
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(1);
        int PolarVoyageLifecycleOlympianOmega3762 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageLifecycleOlympianOmega3762();
        long j = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068 + PolarVoyageLifecycleOlympianOmega3762;
        int i = PolarVoyageLifecycleOlympianOmega3762 / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long PolarVoyageBitmapMaxTitanTitan7960 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageBitmapMaxTitanTitan7960();
            if (PolarVoyageBitmapMaxTitanTitan7960 == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = PolarVoyageBitmapMaxTitanTitan7960;
            jArr2[i2] = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageBitmapMaxTitanTitan7960();
            polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(2);
            i2++;
        }
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750((int) (j - polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068));
        return new PolarVoyageZoomStateAlphaVision6590(23, jArr, jArr2);
    }

    public static final int PolarVoyageGuidelineStormSolar2850(long j) {
        float[] fArr = PolarVoyageCameraViewVortexElite1564.PolarVoyageZipVortexCelestial6185;
        return (int) (PolarVoyageContentResolverRogueSpeed9469.PolarVoyageZipVortexCelestial6185(j, PolarVoyageCameraViewVortexElite1564.PolarVoyageBitmapVisionAuroraPixel4705) >>> 32);
    }

    public static final void PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718, PolarVoyageObjectDetectionThunderHyperInferno3620 polarVoyageObjectDetectionThunderHyperInferno3620, Object obj) {
        PolarVoyageEventNebulaCelestialOlympian6822 polarVoyageEventNebulaCelestialOlympian6822 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyagePoseDetectionCosmosVision6217;
        boolean PolarVoyageDiffUtilTurboStrike57352 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(obj);
        Object PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
        if (PolarVoyageDiffUtilTurboStrike57352 || PolarVoyageAlarmManagerShadowHyperBeta8339 == PolarVoyageAnimationEliteMasterHero7289.PolarVoyageZipVortexCelestial6185) {
            PolarVoyageAlarmManagerShadowHyperBeta8339 = new PolarVoyageZoomStateStrikeFusionBeta1966(polarVoyageEventNebulaCelestialOlympian6822, polarVoyageObjectDetectionThunderHyperInferno3620);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta8339);
        }
    }

    public static final long PolarVoyageKotlinBetaPulseBeta3653(int i) {
        long j = i << 32;
        int i2 = PolarVoyageContentResolverRogueSpeed9469.PolarVoyageItemDecorationUltraDeltaEpic7485;
        return j;
    }

    public static final String PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static Set PolarVoyageLifecycleOlympianOmega3762() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final int PolarVoyageLooperThreadAlphaPrime1279(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            PolarVoyageLinearLayoutHyperionMega9664 polarVoyageLinearLayoutHyperionMega9664 = (PolarVoyageLinearLayoutHyperionMega9664) list.get(i3);
            char c = polarVoyageLinearLayoutHyperionMega9664.PolarVoyageBarcodeScannerInfernoSolarSpark7767 > i ? (char) 1 : polarVoyageLinearLayoutHyperionMega9664.PolarVoyageBitmapVisionAuroraPixel4705 <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static boolean PolarVoyageMotionLayoutForceEpicAurora7183(Context context) {
        boolean isHdr;
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null) {
            isHdr = display.isHdr();
            if (isHdr && (hdrCapabilities = display.getHdrCapabilities()) != null) {
                for (int i : hdrCapabilities.getSupportedHdrTypes()) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long PolarVoyageMotionLayoutTransitionHeroVision4068(float f, float f2, float f3, float f4, PolarVoyageFontFamilyHyperionStorm1277 polarVoyageFontFamilyHyperionStorm1277) {
        int i;
        int i2;
        int i3;
        float PolarVoyageMotionLayoutTransitionHeroVision40682;
        float PolarVoyageZipVortexCelestial61852;
        int i4;
        int i5;
        int i6;
        int i7;
        float PolarVoyageMotionLayoutTransitionHeroVision40683;
        float PolarVoyageZipVortexCelestial61853;
        int i8;
        int i9;
        int i10;
        if (polarVoyageFontFamilyHyperionStorm1277.PolarVoyageKotlinBetaPulseBeta3653()) {
            float f5 = f4 < 0.0f ? 0.0f : f4;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            int i11 = ((int) ((f5 * 255.0f) + 0.5f)) << 24;
            float f6 = f < 0.0f ? 0.0f : f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = i11 | (((int) ((f6 * 255.0f) + 0.5f)) << 16);
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 8);
            long j = (i13 | ((int) ((((f3 >= 0.0f ? f3 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i14 = PolarVoyageContentResolverRogueSpeed9469.PolarVoyageItemDecorationUltraDeltaEpic7485;
            return j;
        }
        if (((int) (polarVoyageFontFamilyHyperionStorm1277.PolarVoyageMotionLayoutTransitionHeroVision4068 >> 32)) != 3) {
            PolarVoyageZipSpectraDragon2553.PolarVoyageZipVortexCelestial6185("Color only works with ColorSpaces with 3 components");
        }
        int i15 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageKotlinBetaPulseBeta3653;
        if (i15 == -1) {
            PolarVoyageZipSpectraDragon2553.PolarVoyageZipVortexCelestial6185("Unknown color space, please use a color space in ColorSpaces");
        }
        float PolarVoyageMotionLayoutTransitionHeroVision40684 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageMotionLayoutTransitionHeroVision4068(0);
        float PolarVoyageZipVortexCelestial61854 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageZipVortexCelestial6185(0);
        if (f >= PolarVoyageMotionLayoutTransitionHeroVision40684) {
            PolarVoyageMotionLayoutTransitionHeroVision40684 = f;
        }
        if (PolarVoyageMotionLayoutTransitionHeroVision40684 <= PolarVoyageZipVortexCelestial61854) {
            PolarVoyageZipVortexCelestial61854 = PolarVoyageMotionLayoutTransitionHeroVision40684;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(PolarVoyageZipVortexCelestial61854);
        int i16 = floatToRawIntBits >>> 31;
        int i17 = (floatToRawIntBits >>> 23) & 255;
        int i18 = floatToRawIntBits & 8388607;
        if (i17 == 255) {
            i2 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i19 = i18 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i19) + 1) | (i16 << 15);
                    short s = (short) i3;
                    PolarVoyageMotionLayoutTransitionHeroVision40682 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageMotionLayoutTransitionHeroVision4068(1);
                    PolarVoyageZipVortexCelestial61852 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageZipVortexCelestial6185(1);
                    if (f2 >= PolarVoyageMotionLayoutTransitionHeroVision40682) {
                        PolarVoyageMotionLayoutTransitionHeroVision40682 = f2;
                    }
                    if (PolarVoyageMotionLayoutTransitionHeroVision40682 <= PolarVoyageZipVortexCelestial61852) {
                        PolarVoyageZipVortexCelestial61852 = PolarVoyageMotionLayoutTransitionHeroVision40682;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(PolarVoyageZipVortexCelestial61852);
                    int i20 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i21 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i21 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i22 = i21 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i22) + 1) | (i20 << 15);
                                short s2 = (short) i7;
                                PolarVoyageMotionLayoutTransitionHeroVision40683 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageMotionLayoutTransitionHeroVision4068(2);
                                PolarVoyageZipVortexCelestial61853 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageZipVortexCelestial6185(2);
                                if (f3 >= PolarVoyageMotionLayoutTransitionHeroVision40683) {
                                    PolarVoyageMotionLayoutTransitionHeroVision40683 = f3;
                                }
                                if (PolarVoyageMotionLayoutTransitionHeroVision40683 <= PolarVoyageZipVortexCelestial61853) {
                                    PolarVoyageZipVortexCelestial61853 = PolarVoyageMotionLayoutTransitionHeroVision40683;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(PolarVoyageZipVortexCelestial61853);
                                int i23 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i24 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i24 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i25 = i8 - 112;
                                    if (i25 >= 31) {
                                        i9 = 0;
                                        r7 = 49;
                                    } else if (i25 > 0) {
                                        int i26 = i24 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i25 << 10) | i26) + 1) | (i23 << 15);
                                            long j2 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i27 = PolarVoyageContentResolverRogueSpeed9469.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                            return j2;
                                        }
                                        i9 = i26;
                                        r7 = i25;
                                    } else if (i25 >= -10) {
                                        int i28 = (i24 | 8388608) >> (1 - i25);
                                        if ((i28 & 4096) != 0) {
                                            i28 += 8192;
                                        }
                                        i9 = i28 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i23 << 15) | (r7 << 10);
                                if (f4 >= 0.0f) {
                                }
                                long j22 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i272 = PolarVoyageContentResolverRogueSpeed9469.PolarVoyageItemDecorationUltraDeltaEpic7485;
                                return j22;
                            }
                            i6 = i22;
                        } else if (i5 >= -10) {
                            int i29 = (i21 | 8388608) >> (1 - i5);
                            if ((i29 & 4096) != 0) {
                                i29 += 8192;
                            }
                            i6 = i29 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i20 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    PolarVoyageMotionLayoutTransitionHeroVision40683 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageMotionLayoutTransitionHeroVision4068(2);
                    PolarVoyageZipVortexCelestial61853 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageZipVortexCelestial6185(2);
                    if (f3 >= PolarVoyageMotionLayoutTransitionHeroVision40683) {
                    }
                    if (PolarVoyageMotionLayoutTransitionHeroVision40683 <= PolarVoyageZipVortexCelestial61853) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(PolarVoyageZipVortexCelestial61853);
                    int i232 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i242 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i232 << 15) | (r7 << 10);
                    if (f4 >= 0.0f) {
                    }
                    long j222 = (i15 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i2722 = PolarVoyageContentResolverRogueSpeed9469.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    return j222;
                }
                i2 = i19;
            } else if (i >= -10) {
                int i30 = (i18 | 8388608) >> (1 - i);
                if ((i30 & 4096) != 0) {
                    i30 += 8192;
                }
                i2 = i30 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i16 << 15) | (i << 10);
        short s3 = (short) i3;
        PolarVoyageMotionLayoutTransitionHeroVision40682 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageMotionLayoutTransitionHeroVision4068(1);
        PolarVoyageZipVortexCelestial61852 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageZipVortexCelestial6185(1);
        if (f2 >= PolarVoyageMotionLayoutTransitionHeroVision40682) {
        }
        if (PolarVoyageMotionLayoutTransitionHeroVision40682 <= PolarVoyageZipVortexCelestial61852) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(PolarVoyageZipVortexCelestial61852);
        int i202 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i212 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i202 << 15) | (i5 << 10);
        short s222 = (short) i7;
        PolarVoyageMotionLayoutTransitionHeroVision40683 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageMotionLayoutTransitionHeroVision4068(2);
        PolarVoyageZipVortexCelestial61853 = polarVoyageFontFamilyHyperionStorm1277.PolarVoyageZipVortexCelestial6185(2);
        if (f3 >= PolarVoyageMotionLayoutTransitionHeroVision40683) {
        }
        if (PolarVoyageMotionLayoutTransitionHeroVision40683 <= PolarVoyageZipVortexCelestial61853) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(PolarVoyageZipVortexCelestial61853);
        int i2322 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2422 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2322 << 15) | (r7 << 10);
        if (f4 >= 0.0f) {
        }
        long j2222 = (i15 & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i27222 = PolarVoyageContentResolverRogueSpeed9469.PolarVoyageItemDecorationUltraDeltaEpic7485;
        return j2222;
    }

    public static final PolarVoyageBitmapMegaPixelNovaX8457 PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587(PolarVoyageCardViewPhoenixUltra6990[] polarVoyageCardViewPhoenixUltra6990Arr, PolarVoyageBitmapMegaPixelNovaX8457 polarVoyageBitmapMegaPixelNovaX8457, PolarVoyageBitmapMegaPixelNovaX8457 polarVoyageBitmapMegaPixelNovaX84572) {
        PolarVoyageAnimatorSetHyperSolar2355 polarVoyageAnimatorSetHyperSolar2355 = new PolarVoyageAnimatorSetHyperSolar2355(PolarVoyageBitmapMegaPixelNovaX8457.PolarVoyageBottomSheetOmegaNeo1907);
        for (PolarVoyageCardViewPhoenixUltra6990 polarVoyageCardViewPhoenixUltra6990 : polarVoyageCardViewPhoenixUltra6990Arr) {
            PolarVoyageRecyclerViewShadowRogue1249 polarVoyageRecyclerViewShadowRogue1249 = polarVoyageCardViewPhoenixUltra6990.PolarVoyageZipVortexCelestial6185;
            if (polarVoyageCardViewPhoenixUltra6990.PolarVoyageDiffUtilTurboStrike5735 || !polarVoyageBitmapMegaPixelNovaX8457.containsKey(polarVoyageRecyclerViewShadowRogue1249)) {
                polarVoyageAnimatorSetHyperSolar2355.put(polarVoyageRecyclerViewShadowRogue1249, polarVoyageRecyclerViewShadowRogue1249.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageCardViewPhoenixUltra6990, (PolarVoyageColorStateListInflaterSparkNebula5326) polarVoyageBitmapMegaPixelNovaX84572.get(polarVoyageRecyclerViewShadowRogue1249)));
            }
        }
        return polarVoyageAnimatorSetHyperSolar2355.PolarVoyageZipVortexCelestial6185();
    }

    public static final void PolarVoyageNavigationViewHyperHyperHyperion1793(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final int PolarVoyagePackageManagerCelestialPhoenix8393(int i, List list) {
        int i2;
        int i3 = ((PolarVoyageLinearLayoutHyperionMega9664) PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageAccelerometerUltraSolarSolar9029(list)).PolarVoyageKotlinBetaPulseBeta3653;
        if (i > ((PolarVoyageLinearLayoutHyperionMega9664) PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageAccelerometerUltraSolarSolar9029(list)).PolarVoyageKotlinBetaPulseBeta3653) {
            PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageZipVortexCelestial6185("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            PolarVoyageLinearLayoutHyperionMega9664 polarVoyageLinearLayoutHyperionMega9664 = (PolarVoyageLinearLayoutHyperionMega9664) list.get(i2);
            char c = polarVoyageLinearLayoutHyperionMega9664.PolarVoyageMotionLayoutTransitionHeroVision4068 > i ? (char) 1 : polarVoyageLinearLayoutHyperionMega9664.PolarVoyageKotlinBetaPulseBeta3653 <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder PolarVoyageContentProviderHyperSpark3838 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("Found paragraph index ", i2, " should be in range [0, ");
        PolarVoyageContentProviderHyperSpark3838.append(list.size());
        PolarVoyageContentProviderHyperSpark3838.append(").\nDebug info: index=");
        PolarVoyageContentProviderHyperSpark3838.append(i);
        PolarVoyageContentProviderHyperSpark3838.append(", paragraphs=[");
        PolarVoyageContentProviderHyperSpark3838.append(PolarVoyageDragEventStrikeVortexLegend8366.PolarVoyageZipVortexCelestial6185(list, null, new PolarVoyageMergePhoenixGamma5628(12), 31));
        PolarVoyageContentProviderHyperSpark3838.append(']');
        PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageZipVortexCelestial6185(PolarVoyageContentProviderHyperSpark3838.toString());
        return i2;
    }

    public static void PolarVoyageRemoteModelManagerOlympianCelestial9141(Context context) {
        if (PolarVoyageBottomSheetOmegaNeo1907 == null) {
            PolarVoyageNavigationPrimePhoenix7347 polarVoyageNavigationPrimePhoenix7347 = new PolarVoyageNavigationPrimePhoenix7347(context);
            PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageNavigationPrimePhoenix7347;
            synchronized (polarVoyageNavigationPrimePhoenix7347.PolarVoyageZipVortexCelestial6185) {
                polarVoyageNavigationPrimePhoenix7347.PolarVoyageTextInputEditTextNebulaHero6651 = true;
            }
        }
    }

    public static final void PolarVoyageRotateAnimationCyberCelestialDelta4768(final boolean z, PolarVoyageObjectDetectionThunderHyperInferno3620 polarVoyageObjectDetectionThunderHyperInferno3620, PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718, int i) {
        int i2;
        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(-642000585);
        if ((i & 6) == 0) {
            i2 = (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageTextInputEditTextNebulaHero6651(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageObjectDetectionThunderHyperInferno3620) ? 32 : 16;
        }
        if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCanvasElitePhoenix4750(i2 & 1, (i2 & 19) != 18)) {
            Object obj = (PolarVoyageSupervisorJobPrimeHeroSpeed9173) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageGestureDetectorNeoNebulaVortex3743.PolarVoyageZipVortexCelestial6185);
            if (obj == null) {
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(950836184);
                View view = (View) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFlowSparkNovaX7791.PolarVoyageDiffUtilTurboStrike5735);
                view.getClass();
                while (true) {
                    if (view == null) {
                        obj = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                    Object obj2 = tag instanceof PolarVoyageSupervisorJobPrimeHeroSpeed9173 ? (PolarVoyageSupervisorJobPrimeHeroSpeed9173) tag : null;
                    if (obj2 != null) {
                        obj = obj2;
                        break;
                    } else {
                        Object PolarVoyageStrictModeLegendEpic15322 = PolarVoyageLayoutOmegaVortex4134.PolarVoyageStrictModeLegendEpic1532(view);
                        view = PolarVoyageStrictModeLegendEpic15322 instanceof View ? (View) PolarVoyageStrictModeLegendEpic15322 : null;
                    }
                }
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
            } else {
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(950834231);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
            }
            if (obj == null) {
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(1512740606);
                obj = (PolarVoyageCameraEclipsePixel2902) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageLiveDataScopeHeroBlaze8599.PolarVoyageZipVortexCelestial6185);
                if (obj == null) {
                    polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(1208426157);
                    View view2 = (View) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFlowSparkNovaX7791.PolarVoyageDiffUtilTurboStrike5735);
                    view2.getClass();
                    while (true) {
                        if (view2 == null) {
                            obj = null;
                            break;
                        }
                        Object tag2 = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                        Object obj3 = tag2 instanceof PolarVoyageCameraEclipsePixel2902 ? (PolarVoyageCameraEclipsePixel2902) tag2 : null;
                        if (obj3 != null) {
                            obj = obj3;
                            break;
                        } else {
                            Object PolarVoyageStrictModeLegendEpic15323 = PolarVoyageLayoutOmegaVortex4134.PolarVoyageStrictModeLegendEpic1532(view2);
                            view2 = PolarVoyageStrictModeLegendEpic15323 instanceof View ? (View) PolarVoyageStrictModeLegendEpic15323 : null;
                        }
                    }
                } else {
                    polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(1208423708);
                }
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
                if (obj == null) {
                    polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(1208428160);
                    Object obj4 = (Context) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFlowSparkNovaX7791.PolarVoyageMotionLayoutTransitionHeroVision4068);
                    while (true) {
                        if (!(obj4 instanceof ContextWrapper)) {
                            obj4 = null;
                            break;
                        } else if (obj4 instanceof PolarVoyageCameraEclipsePixel2902) {
                            break;
                        } else {
                            obj4 = ((ContextWrapper) obj4).getBaseContext();
                        }
                    }
                    obj = (PolarVoyageCameraEclipsePixel2902) obj4;
                } else {
                    polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(1208423789);
                }
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
            } else {
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(1512737723);
            }
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
            if (obj == null) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean PolarVoyageDiffUtilTurboStrike57352 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(obj);
            Object PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            Object obj5 = PolarVoyageAnimationEliteMasterHero7289.PolarVoyageZipVortexCelestial6185;
            if (PolarVoyageDiffUtilTurboStrike57352 || PolarVoyageAlarmManagerShadowHyperBeta8339 == obj5) {
                PolarVoyageSupervisorJobPrimeHeroSpeed9173 polarVoyageSupervisorJobPrimeHeroSpeed9173 = obj instanceof PolarVoyageSupervisorJobPrimeHeroSpeed9173 ? (PolarVoyageSupervisorJobPrimeHeroSpeed9173) obj : null;
                PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageKotlinBetaPulseBeta36532 = polarVoyageSupervisorJobPrimeHeroSpeed9173 != null ? polarVoyageSupervisorJobPrimeHeroSpeed9173.PolarVoyageKotlinBetaPulseBeta3653() : null;
                PolarVoyageCameraEclipsePixel2902 polarVoyageCameraEclipsePixel2902 = obj instanceof PolarVoyageCameraEclipsePixel2902 ? (PolarVoyageCameraEclipsePixel2902) obj : null;
                PolarVoyageAlarmManagerShadowHyperBeta8339 = new PolarVoyageTransitionManagerAuroraHeroSpeed1475(PolarVoyageKotlinBetaPulseBeta36532, polarVoyageCameraEclipsePixel2902 != null ? polarVoyageCameraEclipsePixel2902.PolarVoyageZipVortexCelestial6185() : null);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta8339);
            }
            Object obj6 = (PolarVoyageTransitionManagerAuroraHeroSpeed1475) PolarVoyageAlarmManagerShadowHyperBeta8339;
            Object PolarVoyageAlarmManagerShadowHyperBeta83392 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            if (PolarVoyageAlarmManagerShadowHyperBeta83392 == obj5) {
                PolarVoyageAlarmManagerShadowHyperBeta83392 = PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageFlowCollectorEliteStrike5718);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta83392);
            }
            PolarVoyageRealtimeDatabaseShadowPhantomHyperion1256 polarVoyageRealtimeDatabaseShadowPhantomHyperion1256 = (PolarVoyageRealtimeDatabaseShadowPhantomHyperion1256) PolarVoyageAlarmManagerShadowHyperBeta83392;
            long j = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageColorStateListEliteStrikeOlympian8131;
            boolean PolarVoyageDiffUtilTurboStrike57353 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(obj6) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBitmapVisionAuroraPixel4705(j);
            Object PolarVoyageAlarmManagerShadowHyperBeta83393 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            if (PolarVoyageDiffUtilTurboStrike57353 || PolarVoyageAlarmManagerShadowHyperBeta83393 == obj5) {
                PolarVoyageAlarmManagerShadowHyperBeta83393 = new PolarVoyageMotionSceneCyberCelestialAlpha2457(polarVoyageRealtimeDatabaseShadowPhantomHyperion1256, new PolarVoyageNavigationViewMegaInfernoTurbo5561(j, obj));
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta83393);
            }
            final PolarVoyageMotionSceneCyberCelestialAlpha2457 polarVoyageMotionSceneCyberCelestialAlpha2457 = (PolarVoyageMotionSceneCyberCelestialAlpha2457) PolarVoyageAlarmManagerShadowHyperBeta83393;
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(-348514256);
            boolean PolarVoyageItemDecorationUltraDeltaEpic74852 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageMotionSceneCyberCelestialAlpha2457) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageObjectDetectionThunderHyperInferno3620);
            Object PolarVoyageAlarmManagerShadowHyperBeta83394 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            if (PolarVoyageItemDecorationUltraDeltaEpic74852 || PolarVoyageAlarmManagerShadowHyperBeta83394 == obj5) {
                PolarVoyageAlarmManagerShadowHyperBeta83394 = new PolarVoyageSnackbarElitePixelTitan9268(13, polarVoyageMotionSceneCyberCelestialAlpha2457, polarVoyageObjectDetectionThunderHyperInferno3620);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta83394);
            }
            PolarVoyageBottomSheetOmegaNeo1907((PolarVoyageFragmentPulseEliteDragon8768) PolarVoyageAlarmManagerShadowHyperBeta83394, polarVoyageFlowCollectorEliteStrike5718);
            int i4 = i2;
            Boolean valueOf = Boolean.valueOf(z);
            int i5 = i4 & 14;
            boolean PolarVoyageItemDecorationUltraDeltaEpic74853 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageMotionSceneCyberCelestialAlpha2457) | (i5 == 4);
            Object PolarVoyageAlarmManagerShadowHyperBeta83395 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            if (PolarVoyageItemDecorationUltraDeltaEpic74853 || PolarVoyageAlarmManagerShadowHyperBeta83395 == obj5) {
                PolarVoyageAlarmManagerShadowHyperBeta83395 = new PolarVoyageStateFlowNebulaMax1492() { // from class: create-polar.PolarVoyageFCMHeroTurbo5707
                    @Override // p000createpolar.PolarVoyageStateFlowNebulaMax1492
                    public final Object PolarVoyageZipVortexCelestial6185(Object obj7) {
                        PolarVoyageMotionSceneCyberCelestialAlpha2457 polarVoyageMotionSceneCyberCelestialAlpha24572 = PolarVoyageMotionSceneCyberCelestialAlpha2457.this;
                        polarVoyageMotionSceneCyberCelestialAlpha24572.PolarVoyageBitmapVisionAuroraPixel4705(z);
                        return new PolarVoyagePreviewPulseCelestial8048((PolarVoyageViewDragonUltraMax6431) obj7, polarVoyageMotionSceneCyberCelestialAlpha24572);
                    }
                };
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta83395);
            }
            PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageZipVortexCelestial6185(valueOf, polarVoyageMotionSceneCyberCelestialAlpha2457, null, (PolarVoyageStateFlowNebulaMax1492) PolarVoyageAlarmManagerShadowHyperBeta83395, polarVoyageFlowCollectorEliteStrike5718, i5);
            boolean PolarVoyageItemDecorationUltraDeltaEpic74854 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(obj6) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageMotionSceneCyberCelestialAlpha2457);
            Object PolarVoyageAlarmManagerShadowHyperBeta83396 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            if (PolarVoyageItemDecorationUltraDeltaEpic74854 || PolarVoyageAlarmManagerShadowHyperBeta83396 == obj5) {
                PolarVoyageAlarmManagerShadowHyperBeta83396 = new PolarVoyageVibratorMasterAlphaNova2131(i3, obj6, polarVoyageMotionSceneCyberCelestialAlpha2457);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta83396);
            }
            PolarVoyageTextInputEditTextNebulaHero6651(obj6, polarVoyageMotionSceneCyberCelestialAlpha2457, (PolarVoyageStateFlowNebulaMax1492) PolarVoyageAlarmManagerShadowHyperBeta83396, polarVoyageFlowCollectorEliteStrike5718);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
        } else {
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDatabaseCosmosSpectraSolar3905();
        }
        PolarVoyageInputMethodManagerFusionForceElite3024 PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageNavigationViewHyperHyperHyperion1793();
        if (PolarVoyageNavigationViewHyperHyperHyperion1793 != null) {
            PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageMapInfernoBeta3176(z, polarVoyageObjectDetectionThunderHyperInferno3620, i);
        }
    }

    public static final Object PolarVoyageSnackbarGammaEclipse2140(PolarVoyageRemoteModelManagerSpectraShadowNeo2910 polarVoyageRemoteModelManagerSpectraShadowNeo2910, PolarVoyageIntentEpicFusion7087 polarVoyageIntentEpicFusion7087, PolarVoyageFirebaseModelInterpreterNovaPhantomGamma2331 polarVoyageFirebaseModelInterpreterNovaPhantomGamma2331) {
        Object obj;
        PolarVoyageCardViewNebulaTitanGamma6305 PolarVoyageColorStateListEliteStrikeOlympian8131;
        Object PolarVoyageMotionLayoutForceEpicAurora7183;
        PolarVoyageDataBindingRogueOlympianPulse5004 polarVoyageDataBindingRogueOlympianPulse5004;
        if (((PolarVoyageGyroscopePulseAurora9729) polarVoyageRemoteModelManagerSpectraShadowNeo2910).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageDisplayMetricsVortexDragon9516) {
            PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora9729 = (PolarVoyageGyroscopePulseAurora9729) polarVoyageRemoteModelManagerSpectraShadowNeo2910;
            if (!polarVoyageGyroscopePulseAurora9729.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageDisplayMetricsVortexDragon9516) {
                PolarVoyagePackageManagerUltraQuantumInferno5642.PolarVoyageMotionLayoutTransitionHeroVision4068("visitAncestors called on an unattached node");
            }
            PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora97292 = polarVoyageGyroscopePulseAurora9729.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageViewRogueMaster4778;
            PolarVoyageConfigurationMegaTitaniumQuantum2348 PolarVoyageKeyframeEpicNovaXCyber9821 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageKeyframeEpicNovaXCyber9821(polarVoyageRemoteModelManagerSpectraShadowNeo2910);
            loop0: while (true) {
                obj = null;
                if (PolarVoyageKeyframeEpicNovaXCyber9821 == null) {
                    break;
                }
                if ((((PolarVoyageGyroscopePulseAurora9729) PolarVoyageKeyframeEpicNovaXCyber9821.PolarVoyageAlarmManagerShadowHyperBeta8339.PolarVoyageTextInputEditTextNebulaHero6651).PolarVoyageBottomSheetOmegaNeo1907 & 524288) != 0) {
                    while (polarVoyageGyroscopePulseAurora97292 != null) {
                        if ((polarVoyageGyroscopePulseAurora97292.PolarVoyageRotateAnimationCyberCelestialDelta4768 & 524288) != 0) {
                            PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora97293 = polarVoyageGyroscopePulseAurora97292;
                            PolarVoyageDigitalInkRecognitionBetaDelta4802 polarVoyageDigitalInkRecognitionBetaDelta4802 = null;
                            while (polarVoyageGyroscopePulseAurora97293 != null) {
                                if (polarVoyageGyroscopePulseAurora97293 instanceof PolarVoyageMenuUltraNeo9086) {
                                    obj = polarVoyageGyroscopePulseAurora97293;
                                    break loop0;
                                }
                                if ((polarVoyageGyroscopePulseAurora97293.PolarVoyageRotateAnimationCyberCelestialDelta4768 & 524288) != 0 && (polarVoyageGyroscopePulseAurora97293 instanceof PolarVoyageServiceInfoPhantomBlaze1511)) {
                                    int i = 0;
                                    for (PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora97294 = ((PolarVoyageServiceInfoPhantomBlaze1511) polarVoyageGyroscopePulseAurora97293).PolarVoyageMotionLayoutForceEpicAurora7183; polarVoyageGyroscopePulseAurora97294 != null; polarVoyageGyroscopePulseAurora97294 = polarVoyageGyroscopePulseAurora97294.PolarVoyageCameraPixelBlaze2629) {
                                        if ((polarVoyageGyroscopePulseAurora97294.PolarVoyageRotateAnimationCyberCelestialDelta4768 & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                polarVoyageGyroscopePulseAurora97293 = polarVoyageGyroscopePulseAurora97294;
                                            } else {
                                                if (polarVoyageDigitalInkRecognitionBetaDelta4802 == null) {
                                                    polarVoyageDigitalInkRecognitionBetaDelta4802 = new PolarVoyageDigitalInkRecognitionBetaDelta4802(new PolarVoyageGyroscopePulseAurora9729[16]);
                                                }
                                                if (polarVoyageGyroscopePulseAurora97293 != null) {
                                                    polarVoyageDigitalInkRecognitionBetaDelta4802.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageGyroscopePulseAurora97293);
                                                    polarVoyageGyroscopePulseAurora97293 = null;
                                                }
                                                polarVoyageDigitalInkRecognitionBetaDelta4802.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageGyroscopePulseAurora97294);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                polarVoyageGyroscopePulseAurora97293 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageDigitalInkRecognitionBetaDelta4802);
                            }
                        }
                        polarVoyageGyroscopePulseAurora97292 = polarVoyageGyroscopePulseAurora97292.PolarVoyageViewRogueMaster4778;
                    }
                }
                PolarVoyageKeyframeEpicNovaXCyber9821 = PolarVoyageKeyframeEpicNovaXCyber9821.PolarVoyageNavigationViewHyperHyperHyperion1793();
                polarVoyageGyroscopePulseAurora97292 = (PolarVoyageKeyframeEpicNovaXCyber9821 == null || (polarVoyageDataBindingRogueOlympianPulse5004 = PolarVoyageKeyframeEpicNovaXCyber9821.PolarVoyageAlarmManagerShadowHyperBeta8339) == null) ? null : (PolarVoyageImageViewNebulaStorm3990) polarVoyageDataBindingRogueOlympianPulse5004.PolarVoyageDiffUtilTurboStrike5735;
            }
            PolarVoyageMenuUltraNeo9086 polarVoyageMenuUltraNeo9086 = (PolarVoyageMenuUltraNeo9086) obj;
            if (polarVoyageMenuUltraNeo9086 != null && (PolarVoyageMotionLayoutForceEpicAurora7183 = polarVoyageMenuUltraNeo9086.PolarVoyageMotionLayoutForceEpicAurora7183((PolarVoyageColorStateListEliteStrikeOlympian8131 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageColorStateListEliteStrikeOlympian8131(polarVoyageRemoteModelManagerSpectraShadowNeo2910)), new PolarVoyageTextWatcherInfernoPhoenix6234(2, polarVoyageIntentEpicFusion7087, PolarVoyageColorStateListEliteStrikeOlympian8131), polarVoyageFirebaseModelInterpreterNovaPhantomGamma2331)) == PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                return PolarVoyageMotionLayoutForceEpicAurora7183;
            }
        }
        return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
    }

    public static final void PolarVoyageStrictModeLegendEpic1532(Object obj, Object obj2, PolarVoyageObjectDetectionThunderHyperInferno3620 polarVoyageObjectDetectionThunderHyperInferno3620, PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718) {
        PolarVoyageEventNebulaCelestialOlympian6822 polarVoyageEventNebulaCelestialOlympian6822 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyagePoseDetectionCosmosVision6217;
        boolean PolarVoyageDiffUtilTurboStrike57352 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(obj) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(obj2);
        Object PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
        if (PolarVoyageDiffUtilTurboStrike57352 || PolarVoyageAlarmManagerShadowHyperBeta8339 == PolarVoyageAnimationEliteMasterHero7289.PolarVoyageZipVortexCelestial6185) {
            PolarVoyageAlarmManagerShadowHyperBeta8339 = new PolarVoyageZoomStateStrikeFusionBeta1966(polarVoyageEventNebulaCelestialOlympian6822, polarVoyageObjectDetectionThunderHyperInferno3620);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta8339);
        }
    }

    public static final void PolarVoyageTextInputEditTextNebulaHero6651(Object obj, Object obj2, PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax1492, PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718) {
        boolean PolarVoyageDiffUtilTurboStrike57352 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(obj) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(obj2);
        Object PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
        if (PolarVoyageDiffUtilTurboStrike57352 || PolarVoyageAlarmManagerShadowHyperBeta8339 == PolarVoyageAnimationEliteMasterHero7289.PolarVoyageZipVortexCelestial6185) {
            PolarVoyageAlarmManagerShadowHyperBeta8339 = new PolarVoyageObserverTurboSpeed4054(polarVoyageStateFlowNebulaMax1492);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta8339);
        }
    }

    public static void PolarVoyageToolbarEclipseInfernoHero6368(List list, PolarVoyageTypefaceNebulaAurora4762 polarVoyageTypefaceNebulaAurora4762, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (polarVoyageTypefaceNebulaAurora4762.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static final PolarVoyageGyroscopePulseAurora9729 PolarVoyageViewRogueMaster4778(PolarVoyageRemoteModelManagerSpectraShadowNeo2910 polarVoyageRemoteModelManagerSpectraShadowNeo2910, int i) {
        PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora9729 = ((PolarVoyageGyroscopePulseAurora9729) polarVoyageRemoteModelManagerSpectraShadowNeo2910).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageCameraPixelBlaze2629;
        if (polarVoyageGyroscopePulseAurora9729 == null || (polarVoyageGyroscopePulseAurora9729.PolarVoyageBottomSheetOmegaNeo1907 & i) == 0) {
            return null;
        }
        while (polarVoyageGyroscopePulseAurora9729 != null) {
            int i2 = polarVoyageGyroscopePulseAurora9729.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return polarVoyageGyroscopePulseAurora9729;
            }
            polarVoyageGyroscopePulseAurora9729 = polarVoyageGyroscopePulseAurora9729.PolarVoyageCameraPixelBlaze2629;
        }
        return null;
    }

    public static final void PolarVoyageZipVortexCelestial6185(final PolarVoyageTextInputEditTextNovaTitanium6378 polarVoyageTextInputEditTextNovaTitanium6378, final PolarVoyageViewPrimeShadowSolar4883 polarVoyageViewPrimeShadowSolar4883, final PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax1492, final PolarVoyageAdMobEpicBetaDelta7902 polarVoyageAdMobEpicBetaDelta7902, final PolarVoyageCameraXMasterUltra1270 polarVoyageCameraXMasterUltra1270, PolarVoyageFlowCollectorEliteStrike5718 polarVoyageFlowCollectorEliteStrike5718, final int i, final int i2) {
        int i3;
        polarVoyageFlowCollectorEliteStrike5718.PolarVoyageProcessCameraProviderQuantumCosmosPulse5576(1236588022);
        int i4 = (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageTextInputEditTextNovaTitanium6378) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i4 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageViewPrimeShadowSolar4883) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageStateFlowNebulaMax1492) ? 2048 : 1024;
        }
        PolarVoyageKeyEventEpicAuroraNova2273 polarVoyageKeyEventEpicAuroraNova2273 = null;
        if ((i & 24576) == 0) {
            i4 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageItemDecorationUltraDeltaEpic7485(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageAdMobEpicBetaDelta7902) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(polarVoyageCameraXMasterUltra1270) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageKotlinBetaPulseBeta3653(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBarcodeScannerInfernoSolarSpark7767(1) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageTextInputEditTextNebulaHero6651(true) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCanvasElitePhoenix4750(i4 & 1, ((306783379 & i4) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            Object obj = polarVoyageTextInputEditTextNovaTitanium6378.PolarVoyageZipVortexCelestial6185;
            int i5 = PolarVoyageServiceConnectionPulseSolar5941.PolarVoyageMotionLayoutTransitionHeroVision4068;
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(-329318062);
            Object obj2 = PolarVoyageAnimationEliteMasterHero7289.PolarVoyageZipVortexCelestial6185;
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(-1008595950);
            Context context = (Context) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageFlowSparkNovaX7791.PolarVoyageMotionLayoutTransitionHeroVision4068);
            PolarVoyageLayerDrawableCyberMaster6225 PolarVoyageZipVortexCelestial61852 = PolarVoyageServiceConnectionPulseSolar5941.PolarVoyageZipVortexCelestial6185(polarVoyageCameraXMasterUltra1270, polarVoyageFlowCollectorEliteStrike5718);
            boolean PolarVoyageDiffUtilTurboStrike57352 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(context) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(obj) | polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDiffUtilTurboStrike5735(PolarVoyageZipVortexCelestial61852);
            Object PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339();
            if (PolarVoyageDiffUtilTurboStrike57352 || PolarVoyageAlarmManagerShadowHyperBeta8339 == obj2) {
                PolarVoyageGradlePluginCelestialNeoThunder7162 polarVoyageGradlePluginCelestialNeoThunder7162 = new PolarVoyageGradlePluginCelestialNeoThunder7162(context);
                polarVoyageGradlePluginCelestialNeoThunder7162.PolarVoyageKotlinBetaPulseBeta3653 = obj;
                polarVoyageGradlePluginCelestialNeoThunder7162.PolarVoyageViewRogueMaster4778 = PolarVoyageZipVortexCelestial61852;
                PolarVoyageAlarmManagerShadowHyperBeta8339 = polarVoyageGradlePluginCelestialNeoThunder7162.PolarVoyageZipVortexCelestial6185();
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageCameraViewEclipseLegendStrike8028(PolarVoyageAlarmManagerShadowHyperBeta8339);
            }
            PolarVoyageLooperThreadStrikeCosmos3425 polarVoyageLooperThreadStrikeCosmos3425 = (PolarVoyageLooperThreadStrikeCosmos3425) PolarVoyageAlarmManagerShadowHyperBeta8339;
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
            Object obj3 = polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (obj3 instanceof PolarVoyageGradlePluginCelestialNeoThunder7162) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
                return;
            }
            if (obj3 instanceof PolarVoyageTextInputEditTextSparkSpeed1622) {
                PolarVoyageServiceConnectionPulseSolar5941.PolarVoyageKotlinBetaPulseBeta3653("ImageBitmap");
                throw null;
            }
            if (obj3 instanceof PolarVoyageModelInputOutputNovaEclipseThunder2191) {
                PolarVoyageServiceConnectionPulseSolar5941.PolarVoyageKotlinBetaPulseBeta3653("ImageVector");
                throw null;
            }
            if (obj3 instanceof PolarVoyageBroadcastReceiverAlphaDeltaSpectra2219) {
                PolarVoyageServiceConnectionPulseSolar5941.PolarVoyageKotlinBetaPulseBeta3653("Painter");
                throw null;
            }
            if (polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageKotlinBetaPulseBeta3653 != null) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("request.target must be null.");
                return;
            }
            if (((PolarVoyageGradientDrawableNeoVisionSpeed1253) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, PolarVoyageFragmentManagerVisionVortex1127.PolarVoyageBitmapVisionAuroraPixel4705)) != null) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("request.lifecycle must be null.");
                return;
            }
            PolarVoyageBottomSheetEpicQuantum9585 polarVoyageBottomSheetEpicQuantum9585 = polarVoyageTextInputEditTextNovaTitanium6378.PolarVoyageKotlinBetaPulseBeta3653;
            PolarVoyageMagnetometerHyperionHeroSpark2089 polarVoyageMagnetometerHyperionHeroSpark2089 = polarVoyageTextInputEditTextNovaTitanium6378.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (((Boolean) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageCamera2VisionPhoenixNovaX9193.PolarVoyageZipVortexCelestial6185)).booleanValue()) {
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(2019030948);
                polarVoyageKeyEventEpicAuroraNova2273 = (PolarVoyageKeyEventEpicAuroraNova2273) polarVoyageFlowCollectorEliteStrike5718.PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageCrashlyticsDeltaNovaStrike3854.PolarVoyageZipVortexCelestial6185);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
            } else {
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageMotionSceneStormSolarBeta2208(2019088453);
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(false);
            }
            PolarVoyageViewPrimeShadowSolar4883 PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageViewPrimeShadowSolar4883.PolarVoyageBitmapVisionAuroraPixel4705(new ContentPainterElement(polarVoyageLooperThreadStrikeCosmos3425, polarVoyageBottomSheetEpicQuantum9585, polarVoyageMagnetometerHyperionHeroSpark2089, polarVoyageStateFlowNebulaMax1492, polarVoyageAdMobEpicBetaDelta7902, polarVoyageCameraXMasterUltra1270, polarVoyageKeyEventEpicAuroraNova2273));
            PolarVoyageTypefaceRogueSpark5596 polarVoyageTypefaceRogueSpark5596 = PolarVoyageTypefaceRogueSpark5596.PolarVoyageItemDecorationUltraDeltaEpic7485;
            int hashCode = Long.hashCode(polarVoyageFlowCollectorEliteStrike5718.PolarVoyageColorStateListEliteStrikeOlympian8131);
            PolarVoyageViewPrimeShadowSolar4883 PolarVoyageAlertDialogNovaXCelestial4954 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAlertDialogNovaXCelestial4954(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageBitmapVisionAuroraPixel47052);
            PolarVoyageBitmapMegaPixelNovaX8457 PolarVoyageViewRogueMaster4778 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageViewRogueMaster4778();
            PolarVoyageContextNeoDelta3168.PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
            PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon8768 = PolarVoyageProGuardPrimePrime8435.PolarVoyageMotionLayoutTransitionHeroVision4068;
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415();
            if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954) {
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageFragmentPulseEliteDragon8768);
            } else {
                polarVoyageFlowCollectorEliteStrike5718.PolarVoyageBottomSheetNovaXNova5051();
            }
            PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageTypefaceRogueSpark5596);
            PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageViewRogueMaster4778);
            PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageFlowCollectorEliteStrike5718, PolarVoyageProGuardPrimePrime8435.PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageAlertDialogNovaXCelestial4954);
            PolarVoyageLaunchFusionGamma3061 polarVoyageLaunchFusionGamma3061 = PolarVoyageProGuardPrimePrime8435.PolarVoyageDiffUtilTurboStrike5735;
            if (polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlertDialogNovaXCelestial4954 || !PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageFlowCollectorEliteStrike5718.PolarVoyageAlarmManagerShadowHyperBeta8339(), Integer.valueOf(hashCode))) {
                PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBitmapMaxTitanTitan7960(hashCode, polarVoyageFlowCollectorEliteStrike5718, hashCode, polarVoyageLaunchFusionGamma3061);
            }
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageContentProviderHyperSpark3838(true);
        } else {
            polarVoyageFlowCollectorEliteStrike5718.PolarVoyageDatabaseCosmosSpectraSolar3905();
        }
        PolarVoyageInputMethodManagerFusionForceElite3024 PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageFlowCollectorEliteStrike5718.PolarVoyageNavigationViewHyperHyperHyperion1793();
        if (PolarVoyageNavigationViewHyperHyperHyperion1793 != null) {
            PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageObjectDetectionThunderHyperInferno3620() { // from class: create-polar.PolarVoyageTextInputLayoutLegendCosmosVision7522
                @Override // p000createpolar.PolarVoyageObjectDetectionThunderHyperInferno3620
                public final Object PolarVoyageDiffUtilTurboStrike5735(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageZipVortexCelestial6185(PolarVoyageTextInputEditTextNovaTitanium6378.this, polarVoyageViewPrimeShadowSolar4883, polarVoyageStateFlowNebulaMax1492, polarVoyageAdMobEpicBetaDelta7902, polarVoyageCameraXMasterUltra1270, (PolarVoyageFlowCollectorEliteStrike5718) obj4, PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageKotlinHeroHyper4083(i | 1), PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageKotlinHeroHyper4083(i2));
                    return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                }
            };
        }
    }

    public abstract List PolarVoyageAnimatorSetSparkUltraMax8233(String str, List list);

    public PolarVoyageRealtimeDatabaseEclipseUltra8894 PolarVoyageFCMCelestialCosmosPixel3711(Context context, Object obj) {
        return null;
    }

    public abstract Intent PolarVoyageLayerDrawableShadowTitaniumOmega1942(Context context, Object obj);

    public abstract Object PolarVoyageViewBindingPulseHeroSpeed5705(Intent intent, int i);
}
