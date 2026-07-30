package p000createpolar;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.PermissionRequest;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageLightSensorSparkBlazeTitanium9192 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageLightSensorSparkBlazeTitanium9192(PolarVoyageCountDownTimerNovaXNebula3211 polarVoyageCountDownTimerNovaXNebula3211, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 17;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageCountDownTimerNovaXNebula3211;
    }

    private final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        PolarVoyageServiceUltraUltraNeo9663 polarVoyageServiceUltraUltraNeo9663 = (PolarVoyageServiceUltraUltraNeo9663) this.PolarVoyageStrictModeLegendEpic1532;
        synchronized (((ArrayDeque) polarVoyageServiceUltraUltraNeo9663.PolarVoyageBottomSheetOmegaNeo1907)) {
            SharedPreferences.Editor edit = ((SharedPreferences) polarVoyageServiceUltraUltraNeo9663.PolarVoyageItemDecorationUltraDeltaEpic7485).edit();
            String str = (String) polarVoyageServiceUltraUltraNeo9663.PolarVoyageStrictModeLegendEpic1532;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) polarVoyageServiceUltraUltraNeo9663.PolarVoyageBottomSheetOmegaNeo1907).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) polarVoyageServiceUltraUltraNeo9663.PolarVoyageRotateAnimationCyberCelestialDelta4768);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }

    private final void PolarVoyageZipVortexCelestial6185() {
        PolarVoyageEventEpicPulseTitanium4610 polarVoyageEventEpicPulseTitanium4610 = (PolarVoyageEventEpicPulseTitanium4610) this.PolarVoyageStrictModeLegendEpic1532;
        synchronized (polarVoyageEventEpicPulseTitanium4610.PolarVoyageBottomSheetOmegaNeo1907) {
            try {
                if (polarVoyageEventEpicPulseTitanium4610.PolarVoyageSnackbarGammaEclipse2140 == null) {
                    return;
                }
                try {
                    PolarVoyageProcessCameraProviderDragonEpicCosmos5977 PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageEventEpicPulseTitanium4610.PolarVoyageKotlinBetaPulseBeta3653();
                    int i = PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageDiffUtilTurboStrike5735;
                    if (i == 2) {
                        synchronized (polarVoyageEventEpicPulseTitanium4610.PolarVoyageBottomSheetOmegaNeo1907) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        int i2 = PolarVoyageFirebaseMaxRogue5033.PolarVoyageZipVortexCelestial6185;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        PolarVoyageWithContextGammaMaster7108 polarVoyageWithContextGammaMaster7108 = polarVoyageEventEpicPulseTitanium4610.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                        Context context = polarVoyageEventEpicPulseTitanium4610.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        polarVoyageWithContextGammaMaster7108.getClass();
                        PolarVoyageProcessCameraProviderDragonEpicCosmos5977[] polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr = {PolarVoyageKotlinBetaPulseBeta3653};
                        PolarVoyageLiveDataSpectraNebulaPixel5961 polarVoyageLiveDataSpectraNebulaPixel5961 = PolarVoyageDisplayMetricsQuantumStormEclipse7538.PolarVoyageZipVortexCelestial6185;
                        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageMotionLayoutTransitionHeroVision4068("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageDisplayMetricsQuantumStormEclipse7538.PolarVoyageZipVortexCelestial6185.PolarVoyageBitmapVisionAuroraPixel4705(context, polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr);
                            Trace.endSection();
                            MappedByteBuffer PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageZipVortexCelestial6185, polarVoyageEventEpicPulseTitanium4610.PolarVoyageItemDecorationUltraDeltaEpic7485);
                            if (PolarVoyageBottomSheetOmegaNeo1907 == null || PolarVoyageBitmapVisionAuroraPixel4705 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = new PolarVoyageAnimatorCelestialDeltaMaster5821(PolarVoyageBitmapVisionAuroraPixel4705, PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageAlertDialogCyberHeroQuantum3938(PolarVoyageBottomSheetOmegaNeo1907));
                                Trace.endSection();
                                synchronized (polarVoyageEventEpicPulseTitanium4610.PolarVoyageBottomSheetOmegaNeo1907) {
                                    try {
                                        PolarVoyageRewardedAdPixelMaxEclipse6420 polarVoyageRewardedAdPixelMaxEclipse6420 = polarVoyageEventEpicPulseTitanium4610.PolarVoyageSnackbarGammaEclipse2140;
                                        if (polarVoyageRewardedAdPixelMaxEclipse6420 != null) {
                                            polarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageAnimatorCelestialDeltaMaster5821);
                                        }
                                    } finally {
                                    }
                                }
                                polarVoyageEventEpicPulseTitanium4610.PolarVoyageMotionLayoutTransitionHeroVision4068();
                            } finally {
                                int i3 = PolarVoyageFirebaseMaxRogue5033.PolarVoyageZipVortexCelestial6185;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (polarVoyageEventEpicPulseTitanium4610.PolarVoyageBottomSheetOmegaNeo1907) {
                        try {
                            PolarVoyageRewardedAdPixelMaxEclipse6420 polarVoyageRewardedAdPixelMaxEclipse64202 = polarVoyageEventEpicPulseTitanium4610.PolarVoyageSnackbarGammaEclipse2140;
                            if (polarVoyageRewardedAdPixelMaxEclipse64202 != null) {
                                polarVoyageRewardedAdPixelMaxEclipse64202.PolarVoyageAlertDialogCyberHeroQuantum3938(th2);
                            }
                            polarVoyageEventEpicPulseTitanium4610.PolarVoyageMotionLayoutTransitionHeroVision4068();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr;
        int i;
        int[] iArr2;
        Object obj;
        String PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
        TelephonyManager telephonyManager;
        int i2 = 8;
        int i3 = 0;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageFragmentStormBetaCyber4755 polarVoyageFragmentStormBetaCyber4755 = (PolarVoyageFragmentStormBetaCyber4755) this.PolarVoyageStrictModeLegendEpic1532;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    polarVoyageFragmentStormBetaCyber4755.PolarVoyageMotionLayoutTransitionHeroVision4068();
                    return;
                } finally {
                }
            case 1:
                PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium4787 = (PolarVoyageRewardedAdUltraTitanium4787) this.PolarVoyageStrictModeLegendEpic1532;
                polarVoyageRewardedAdUltraTitanium4787.PolarVoyageAlarmManagerBetaMaxPhantom7852 = false;
                MotionEvent motionEvent = polarVoyageRewardedAdUltraTitanium4787.PolarVoyageLocationListenerInfernoQuantumOlympian6900;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    polarVoyageRewardedAdUltraTitanium4787.PolarVoyageFlingGestureEclipsePrimeMax1376(motionEvent);
                    return;
                } else {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                PolarVoyageTransitionManagerHeroNovaX3322 polarVoyageTransitionManagerHeroNovaX3322 = (PolarVoyageTransitionManagerHeroNovaX3322) this.PolarVoyageStrictModeLegendEpic1532;
                Trace.beginSection("measureAndLayout");
                try {
                    polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageMotionLayoutForceEpicAurora7183(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageTextInputEditTextNebulaHero6651();
                        Trace.endSection();
                        polarVoyageTransitionManagerHeroNovaX3322.PolarVoyageGuidelineStormSolar2850 = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 3:
                PolarVoyageRotateAnimationShadowPulse6120 polarVoyageRotateAnimationShadowPulse6120 = (PolarVoyageRotateAnimationShadowPulse6120) this.PolarVoyageStrictModeLegendEpic1532;
                boolean PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageRotateAnimationShadowPulse6120.PolarVoyageItemDecorationUltraDeltaEpic7485();
                PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium47872 = polarVoyageRotateAnimationShadowPulse6120.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (PolarVoyageItemDecorationUltraDeltaEpic7485) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        polarVoyageRewardedAdUltraTitanium47872.PolarVoyageMotionLayoutForceEpicAurora7183(true);
                        PolarVoyageResourceEliteOlympian8553 polarVoyageResourceEliteOlympian8553 = polarVoyageRotateAnimationShadowPulse6120.PolarVoyageAnimatorSetSparkUltraMax8233;
                        int[] iArr3 = polarVoyageResourceEliteOlympian8553.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        long[] jArr = polarVoyageResourceEliteOlympian8553.PolarVoyageZipVortexCelestial6185;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        if ((255 & j) < 128) {
                                            int i7 = iArr3[(i4 << 3) + i6];
                                            if (!polarVoyageRotateAnimationShadowPulse6120.PolarVoyageTextInputEditTextNebulaHero6651().PolarVoyageZipVortexCelestial6185(i7)) {
                                                i = i2;
                                                iArr2 = iArr3;
                                                polarVoyageRotateAnimationShadowPulse6120.PolarVoyageBottomSheetOmegaNeo1907.add(new PolarVoyageBindingAdapterMaxHeroSpectra2067(i7, polarVoyageRotateAnimationShadowPulse6120.PolarVoyageNavigationViewHyperHyperHyperion1793, PolarVoyageTextViewAuroraMasterThunder1502.PolarVoyageStrictModeLegendEpic1532, null));
                                                polarVoyageRotateAnimationShadowPulse6120.PolarVoyageSnackbarGammaEclipse2140.PolarVoyageRemoteModelManagerOlympianCelestial9141(PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185);
                                                j >>= i;
                                                i6++;
                                                iArr3 = iArr2;
                                                i2 = i;
                                            }
                                        }
                                        i = i2;
                                        iArr2 = iArr3;
                                        j >>= i;
                                        i6++;
                                        iArr3 = iArr2;
                                        i2 = i;
                                    }
                                    iArr = iArr3;
                                    if (i5 == i2) {
                                    }
                                } else {
                                    iArr = iArr3;
                                }
                                if (i4 != length) {
                                    i4++;
                                    iArr3 = iArr;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        polarVoyageRotateAnimationShadowPulse6120.PolarVoyageViewRogueMaster4778(polarVoyageRewardedAdUltraTitanium47872.getSemanticsOwner().PolarVoyageZipVortexCelestial6185(), polarVoyageRotateAnimationShadowPulse6120.PolarVoyageBitmapMaxTitanTitan7960);
                        Trace.endSection();
                        polarVoyageRotateAnimationShadowPulse6120.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageRotateAnimationShadowPulse6120.PolarVoyageTextInputEditTextNebulaHero6651());
                        polarVoyageRotateAnimationShadowPulse6120.PolarVoyageRemoteModelManagerOlympianCelestial9141();
                        polarVoyageRotateAnimationShadowPulse6120.PolarVoyageDisplayMetricsVortexDragon9516 = false;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                return;
            case 4:
                PolarVoyageImageAnalysisNovaUltra4777 polarVoyageImageAnalysisNovaUltra4777 = (PolarVoyageImageAnalysisNovaUltra4777) this.PolarVoyageStrictModeLegendEpic1532;
                synchronized (polarVoyageImageAnalysisNovaUltra4777.PolarVoyageZipVortexCelestial6185) {
                    try {
                        if (polarVoyageImageAnalysisNovaUltra4777.PolarVoyageCameraPixelBlaze2629) {
                            return;
                        }
                        long j2 = polarVoyageImageAnalysisNovaUltra4777.PolarVoyageViewRogueMaster4778 - 1;
                        polarVoyageImageAnalysisNovaUltra4777.PolarVoyageViewRogueMaster4778 = j2;
                        if (j2 > 0) {
                            return;
                        }
                        if (j2 >= 0) {
                            polarVoyageImageAnalysisNovaUltra4777.PolarVoyageZipVortexCelestial6185();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (polarVoyageImageAnalysisNovaUltra4777.PolarVoyageZipVortexCelestial6185) {
                            polarVoyageImageAnalysisNovaUltra4777.PolarVoyageDrawableDeltaHyperion5742 = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                PolarVoyagePoseDetectionPrimeNebula3086 polarVoyagePoseDetectionPrimeNebula3086 = (PolarVoyagePoseDetectionPrimeNebula3086) this.PolarVoyageStrictModeLegendEpic1532;
                ((Context) polarVoyagePoseDetectionPrimeNebula3086.PolarVoyageStrictModeLegendEpic1532).unregisterReceiver((PolarVoyageAnalyticsVortexNovaDragon9493) polarVoyagePoseDetectionPrimeNebula3086.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                PolarVoyageAnalyticsVortexNovaDragon9493 polarVoyageAnalyticsVortexNovaDragon9493 = (PolarVoyageAnalyticsVortexNovaDragon9493) this.PolarVoyageStrictModeLegendEpic1532;
                if (polarVoyageAnalyticsVortexNovaDragon9493.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                    polarVoyageAnalyticsVortexNovaDragon9493.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185.PolarVoyageLifecycleOlympianOmega3762(3, false);
                    return;
                }
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                ((PolarVoyageLiveDataSolarQuantumUltra7998) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageKotlinBetaPulseBeta3653();
                return;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                PolarVoyageInterpolatorTitaniumOlympian2745 polarVoyageInterpolatorTitaniumOlympian2745 = (PolarVoyageInterpolatorTitaniumOlympian2745) this.PolarVoyageStrictModeLegendEpic1532;
                polarVoyageInterpolatorTitaniumOlympian2745.getClass();
                if (Thread.currentThread() == polarVoyageInterpolatorTitaniumOlympian2745.PolarVoyageZipVortexCelestial6185) {
                    polarVoyageInterpolatorTitaniumOlympian2745.PolarVoyageBitmapVisionAuroraPixel4705(-1, new PolarVoyageCamera2MasterPulse1881(13));
                    return;
                }
                return;
            case 9:
                PermissionRequest permissionRequest = (PermissionRequest) this.PolarVoyageStrictModeLegendEpic1532;
                permissionRequest.grant(permissionRequest.getResources());
                return;
            case 10:
                PolarVoyageRoomEntityHeroTurbo6056 polarVoyageRoomEntityHeroTurbo6056 = (PolarVoyageRoomEntityHeroTurbo6056) this.PolarVoyageStrictModeLegendEpic1532;
                Runnable runnable = polarVoyageRoomEntityHeroTurbo6056.PolarVoyageStrictModeLegendEpic1532;
                if (runnable != null) {
                    runnable.run();
                    polarVoyageRoomEntityHeroTurbo6056.PolarVoyageStrictModeLegendEpic1532 = null;
                    return;
                }
                return;
            case 11:
                PolarVoyageKeyframeCelestialCelestialInferno5913.PolarVoyageBarcodeScannerInfernoSolarSpark7767((PolarVoyageKeyframeCelestialCelestialInferno5913) this.PolarVoyageStrictModeLegendEpic1532);
                return;
            case 12:
                PolarVoyageDatabaseVortexUltraNova4004 polarVoyageDatabaseVortexUltraNova4004 = (PolarVoyageDatabaseVortexUltraNova4004) this.PolarVoyageStrictModeLegendEpic1532;
                polarVoyageDatabaseVortexUltraNova4004.PolarVoyageToolbarEclipseInfernoHero6368(polarVoyageDatabaseVortexUltraNova4004.PolarVoyageFCMCelestialCosmosPixel3711(), 1028, new PolarVoyageAdapterFusionMasterGamma8495(24));
                polarVoyageDatabaseVortexUltraNova4004.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                return;
            case 13:
                PolarVoyageMediaPlayerDeltaQuantumHyper7669 polarVoyageMediaPlayerDeltaQuantumHyper7669 = (PolarVoyageMediaPlayerDeltaQuantumHyper7669) this.PolarVoyageStrictModeLegendEpic1532;
                if (polarVoyageMediaPlayerDeltaQuantumHyper7669.PolarVoyageClipboardManagerAuroraPixel8666 >= 300000) {
                    ((PolarVoyageLifecycleTitaniumHyper4694) polarVoyageMediaPlayerDeltaQuantumHyper7669.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageStrictModeLegendEpic1532).PolarVoyageAssetManagerMasterTurboSpeed3099 = true;
                    polarVoyageMediaPlayerDeltaQuantumHyper7669.PolarVoyageClipboardManagerAuroraPixel8666 = 0L;
                    return;
                }
                return;
            case 14:
                ((PolarVoyageDrawableMaxNovaX8749) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageTextInputEditTextNebulaHero6651();
                return;
            case 15:
                ((PolarVoyageCameraEliteHyperion3107) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                return;
            case 16:
                PolarVoyageGradlePluginDragonEpicDelta4266 polarVoyageGradlePluginDragonEpicDelta4266 = (PolarVoyageGradlePluginDragonEpicDelta4266) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageVideoCaptureSolarDragonGamma9082 polarVoyageVideoCaptureSolarDragonGamma9082 = polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageActivityInfoBetaQuantum8726;
                Context context = polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageBitmapVisionAuroraPixel4705;
                String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                int generateAudioSessionId = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageActivityInfoBetaQuantum8726(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                polarVoyageVideoCaptureSolarDragonGamma9082.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((PolarVoyagePropertyValuesHolderHyperionUltra8479) polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageKotlinBetaPulseBeta3653).PolarVoyageZipVortexCelestial6185.getLooper()) {
                    obj = polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageBitmapVisionAuroraPixel4705;
                } else {
                    PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(myLooper == ((PolarVoyagePropertyValuesHolderHyperionUltra8479) polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageMotionLayoutTransitionHeroVision4068).PolarVoyageZipVortexCelestial6185.getLooper());
                    obj = polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageDiffUtilTurboStrike5735;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageDiffUtilTurboStrike5735 = valueOf;
                    PolarVoyageTextRecognitionBetaStrike2727 polarVoyageTextRecognitionBetaStrike2727 = new PolarVoyageTextRecognitionBetaStrike2727(polarVoyageVideoCaptureSolarDragonGamma9082, valueOf, i3);
                    PolarVoyagePropertyValuesHolderHyperionUltra8479 polarVoyagePropertyValuesHolderHyperionUltra8479 = (PolarVoyagePropertyValuesHolderHyperionUltra8479) polarVoyageVideoCaptureSolarDragonGamma9082.PolarVoyageKotlinBetaPulseBeta3653;
                    if (polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageZipVortexCelestial6185.getLooper().getThread().isAlive()) {
                        polarVoyagePropertyValuesHolderHyperionUltra8479.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageTextRecognitionBetaStrike2727);
                    }
                    polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageLayerDrawableShadowTitaniumOmega1942(1, 10, Integer.valueOf(generateAudioSessionId));
                    polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageLayerDrawableShadowTitaniumOmega1942(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 17:
                PolarVoyageDatabaseVortexUltraNova4004 polarVoyageDatabaseVortexUltraNova40042 = ((PolarVoyageCountDownTimerNovaXNebula3211) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageDiffUtilDragonSpeedEclipse6225;
                polarVoyageDatabaseVortexUltraNova40042.PolarVoyageToolbarEclipseInfernoHero6368(polarVoyageDatabaseVortexUltraNova40042.PolarVoyageFCMCelestialCosmosPixel3711(), 1034, new PolarVoyageAdapterFusionMasterGamma8495(16));
                return;
            case 18:
                PolarVoyageActivityInfoBetaFusion4959 polarVoyageActivityInfoBetaFusion4959 = (PolarVoyageActivityInfoBetaFusion4959) this.PolarVoyageStrictModeLegendEpic1532;
                try {
                    synchronized (polarVoyageActivityInfoBetaFusion4959) {
                    }
                    try {
                        polarVoyageActivityInfoBetaFusion4959.PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageActivityInfoBetaFusion4959.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageActivityInfoBetaFusion4959.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                        return;
                    } finally {
                        polarVoyageActivityInfoBetaFusion4959.PolarVoyageZipVortexCelestial6185(true);
                    }
                } catch (PolarVoyageAssetManagerQuantumSpectraPhoenix6233 e) {
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 19:
                PolarVoyageZipVortexCelestial6185();
                return;
            case 20:
                Iterator it = ((ArrayList) ((PolarVoyageAnimatorCelestialBeta6967) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBitmapVisionAuroraPixel4705).iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                    return;
                }
                return;
            case 21:
                PolarVoyageCamera2OmegaBlaze5174 polarVoyageCamera2OmegaBlaze5174 = (PolarVoyageCamera2OmegaBlaze5174) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageRotateDrawableSolarShadowSpark3117 polarVoyageRotateDrawableSolarShadowSpark3117 = (PolarVoyageRotateDrawableSolarShadowSpark3117) polarVoyageCamera2OmegaBlaze5174.PolarVoyageZipVortexCelestial6185.get();
                if (polarVoyageRotateDrawableSolarShadowSpark3117 != null) {
                    int PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageCamera2OmegaBlaze5174.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageMotionLayoutTransitionHeroVision4068();
                    PolarVoyageSnackbarTitanSpectra1637 polarVoyageSnackbarTitanSpectra1637 = polarVoyageRotateDrawableSolarShadowSpark3117.PolarVoyageZipVortexCelestial6185;
                    synchronized (polarVoyageSnackbarTitanSpectra1637) {
                        int i8 = polarVoyageSnackbarTitanSpectra1637.PolarVoyageDrawableDeltaHyperion5742;
                        if (i8 == 0 || polarVoyageSnackbarTitanSpectra1637.PolarVoyageBitmapVisionAuroraPixel4705) {
                            if (i8 != PolarVoyageMotionLayoutTransitionHeroVision4068 || polarVoyageSnackbarTitanSpectra1637.PolarVoyageSnackbarGammaEclipse2140 == null) {
                                polarVoyageSnackbarTitanSpectra1637.PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageMotionLayoutTransitionHeroVision4068;
                                if (PolarVoyageMotionLayoutTransitionHeroVision4068 != 1 && PolarVoyageMotionLayoutTransitionHeroVision4068 != 0 && PolarVoyageMotionLayoutTransitionHeroVision4068 != 8) {
                                    if (polarVoyageSnackbarTitanSpectra1637.PolarVoyageSnackbarGammaEclipse2140 == null) {
                                        Context context2 = polarVoyageSnackbarTitanSpectra1637.PolarVoyageZipVortexCelestial6185;
                                        String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                                        if (context2 != null && (telephonyManager = (TelephonyManager) context2.getSystemService("phone")) != null) {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (!TextUtils.isEmpty(networkCountryIso)) {
                                                PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(networkCountryIso);
                                                polarVoyageSnackbarTitanSpectra1637.PolarVoyageSnackbarGammaEclipse2140 = PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
                                            }
                                        }
                                        PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(Locale.getDefault().getCountry());
                                        polarVoyageSnackbarTitanSpectra1637.PolarVoyageSnackbarGammaEclipse2140 = PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149;
                                    }
                                    polarVoyageSnackbarTitanSpectra1637.PolarVoyageViewRogueMaster4778 = polarVoyageSnackbarTitanSpectra1637.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision4068);
                                    polarVoyageSnackbarTitanSpectra1637.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getClass();
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    polarVoyageSnackbarTitanSpectra1637.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageSnackbarTitanSpectra1637.PolarVoyageTextInputEditTextNebulaHero6651 > 0 ? (int) (elapsedRealtime - polarVoyageSnackbarTitanSpectra1637.PolarVoyageItemDecorationUltraDeltaEpic7485) : 0, polarVoyageSnackbarTitanSpectra1637.PolarVoyageStrictModeLegendEpic1532, polarVoyageSnackbarTitanSpectra1637.PolarVoyageViewRogueMaster4778);
                                    polarVoyageSnackbarTitanSpectra1637.PolarVoyageItemDecorationUltraDeltaEpic7485 = elapsedRealtime;
                                    polarVoyageSnackbarTitanSpectra1637.PolarVoyageStrictModeLegendEpic1532 = 0L;
                                    polarVoyageSnackbarTitanSpectra1637.PolarVoyageBottomSheetOmegaNeo1907 = 0L;
                                    polarVoyageSnackbarTitanSpectra1637.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 0L;
                                    PolarVoyageIntentServicePixelMaxElite4283 polarVoyageIntentServicePixelMaxElite4283 = polarVoyageSnackbarTitanSpectra1637.PolarVoyageDiffUtilTurboStrike5735;
                                    ((ArrayList) polarVoyageIntentServicePixelMaxElite4283.PolarVoyageDiffUtilTurboStrike5735).clear();
                                    polarVoyageIntentServicePixelMaxElite4283.PolarVoyageMotionLayoutTransitionHeroVision4068 = -1;
                                    polarVoyageIntentServicePixelMaxElite4283.PolarVoyageKotlinBetaPulseBeta3653 = 0;
                                    polarVoyageIntentServicePixelMaxElite4283.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 22:
                ((PolarVoyageToolbarHyperionSpectra8567) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageCameraPixelBlaze2629--;
                return;
            case 23:
                PolarVoyageSnackbarEliteUltra4527 polarVoyageSnackbarEliteUltra4527 = (PolarVoyageSnackbarEliteUltra4527) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageGradientDrawableNeoVisionSpeed1253 polarVoyageGradientDrawableNeoVisionSpeed1253 = polarVoyageSnackbarEliteUltra4527.PolarVoyageCameraPixelBlaze2629;
                if (polarVoyageSnackbarEliteUltra4527.PolarVoyageStrictModeLegendEpic1532 == 0) {
                    polarVoyageSnackbarEliteUltra4527.PolarVoyageRotateAnimationCyberCelestialDelta4768 = true;
                    polarVoyageGradientDrawableNeoVisionSpeed1253.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageMaterialButtonSpeedStormGamma5612.ON_PAUSE);
                }
                if (polarVoyageSnackbarEliteUltra4527.PolarVoyageItemDecorationUltraDeltaEpic7485 == 0 && polarVoyageSnackbarEliteUltra4527.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                    polarVoyageGradientDrawableNeoVisionSpeed1253.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageMaterialButtonSpeedStormGamma5612.ON_STOP);
                    polarVoyageSnackbarEliteUltra4527.PolarVoyageBottomSheetOmegaNeo1907 = true;
                    return;
                }
                return;
            case 24:
                throw null;
            case 25:
                PolarVoyageMotionLayoutTransitionHeroVision4068();
                return;
            case 26:
                PolarVoyageKotlinRogueDragonCelestial6887 polarVoyageKotlinRogueDragonCelestial6887 = (PolarVoyageKotlinRogueDragonCelestial6887) this.PolarVoyageStrictModeLegendEpic1532;
                polarVoyageKotlinRogueDragonCelestial6887.PolarVoyageItemDecorationUltraDeltaEpic7485.postVsyncCallback(polarVoyageKotlinRogueDragonCelestial6887);
                return;
            case 27:
                PolarVoyageContextShadowStrikeCelestial9029 polarVoyageContextShadowStrikeCelestial9029 = (PolarVoyageContextShadowStrikeCelestial9029) this.PolarVoyageStrictModeLegendEpic1532;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + polarVoyageContextShadowStrikeCelestial9029.PolarVoyageZipVortexCelestial6185.getAction() + " finishing.");
                polarVoyageContextShadowStrikeCelestial9029.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653(null);
                return;
            default:
                PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = (PolarVoyageAnimatorCelestialDeltaMaster5821) this.PolarVoyageStrictModeLegendEpic1532;
                ((PolarVoyageExoPlayerNeoDelta8060) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778).PolarVoyageRotateAnimationCyberCelestialDelta4768(new PolarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273(29, polarVoyageAnimatorCelestialDeltaMaster5821));
                return;
        }
    }

    public /* synthetic */ PolarVoyageLightSensorSparkBlazeTitanium9192(int i, Object obj, Object obj2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj2;
    }

    public /* synthetic */ PolarVoyageLightSensorSparkBlazeTitanium9192(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }
}
