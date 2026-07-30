package p000createpolar;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageTextWatcherPhantomStorm4467 implements PolarVoyageKeyEventSpeedInfernoThunder5692, PolarVoyageDebugCelestialOlympianVortex5319, PolarVoyageMapBlazeAlpha6089, PolarVoyageServiceSolarDeltaFusion9632, PolarVoyageMotionEventSpectraNebula3314, PolarVoyageScaleAnimationVortexAurora2886, PolarVoyageFontFamilyTurboHero9597, PolarVoyageGuidelineForceNebulaPhoenix2255, PolarVoyageFlowCollectorOmegaHyperion3803 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageTextWatcherPhantomStorm4467(PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280, String str) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 7;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageResourcesCelestialInferno9280;
        this.PolarVoyageStrictModeLegendEpic1532 = str;
    }

    @Override // p000createpolar.PolarVoyageMotionEventSpectraNebula3314
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767(Object obj) {
        Context context = (Context) this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356 = (PolarVoyageDisplayMetricsSpectraNeoHero6356) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageAlertDialogVortexStorm8075 polarVoyageAlertDialogVortexStorm8075 = (PolarVoyageAlertDialogVortexStorm8075) obj;
        String str = polarVoyageAlertDialogVortexStorm8075.PolarVoyageMotionLayoutTransitionHeroVision4068;
        return ((str.equals(polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageSnackbarGammaEclipse2140) || str.equals(PolarVoyageAccelerometerRogueCyberBlaze8567.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageDisplayMetricsSpectraNeoHero6356))) && polarVoyageAlertDialogVortexStorm8075.PolarVoyageKotlinBetaPulseBeta3653(context, polarVoyageDisplayMetricsSpectraNeoHero6356, false) && polarVoyageAlertDialogVortexStorm8075.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageDisplayMetricsSpectraNeoHero6356)) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x068a A[ORIG_RETURN, RETURN] */
    @Override // p000createpolar.PolarVoyageDebugCelestialOlympianVortex5319
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void PolarVoyageBitmapVisionAuroraPixel4705(Object obj, PolarVoyagePagingBetaNovaMax1456 polarVoyagePagingBetaNovaMax1456) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        PolarVoyageResourcePhoenixMaster2270 polarVoyageResourcePhoenixMaster2270;
        int i7;
        int i8;
        int i9;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i10;
        int i11;
        boolean z2;
        PolarVoyageAudioManagerPulseMega5140 polarVoyageAudioManagerPulseMega5140;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356;
        PolarVoyageGraphElitePhantom2858 polarVoyageGraphElitePhantom2858;
        int i12;
        PolarVoyageDatabaseVortexUltraNova4004 polarVoyageDatabaseVortexUltraNova4004 = (PolarVoyageDatabaseVortexUltraNova4004) this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageGradlePluginDragonEpicDelta4266 polarVoyageGradlePluginDragonEpicDelta4266 = (PolarVoyageGradlePluginDragonEpicDelta4266) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageAudioManagerPulseMega5140 polarVoyageAudioManagerPulseMega51402 = (PolarVoyageAudioManagerPulseMega5140) obj;
        SparseArray sparseArray = polarVoyageDatabaseVortexUltraNova4004.PolarVoyageBitmapVisionAuroraPixel4705;
        SparseArray sparseArray2 = new SparseArray(polarVoyagePagingBetaNovaMax1456.PolarVoyageZipVortexCelestial6185.size());
        for (int i13 = 0; i13 < polarVoyagePagingBetaNovaMax1456.PolarVoyageZipVortexCelestial6185.size(); i13++) {
            SparseBooleanArray sparseBooleanArray = polarVoyagePagingBetaNovaMax1456.PolarVoyageZipVortexCelestial6185;
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDisplayMetricsVortexDragon9516(i13, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i13);
            PolarVoyageLayoutInflaterPulseBeta9407 polarVoyageLayoutInflaterPulseBeta9407 = (PolarVoyageLayoutInflaterPulseBeta9407) sparseArray.get(keyAt);
            polarVoyageLayoutInflaterPulseBeta9407.getClass();
            sparseArray2.append(keyAt, polarVoyageLayoutInflaterPulseBeta9407);
        }
        polarVoyageAudioManagerPulseMega51402.getClass();
        if (polarVoyagePagingBetaNovaMax1456.PolarVoyageZipVortexCelestial6185.size() == 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            boolean z3 = true;
            if (i14 >= polarVoyagePagingBetaNovaMax1456.PolarVoyageZipVortexCelestial6185.size()) {
                break;
            }
            SparseBooleanArray sparseBooleanArray2 = polarVoyagePagingBetaNovaMax1456.PolarVoyageZipVortexCelestial6185;
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDisplayMetricsVortexDragon9516(i14, sparseBooleanArray2.size());
            int keyAt2 = sparseBooleanArray2.keyAt(i14);
            PolarVoyageLayoutInflaterPulseBeta9407 polarVoyageLayoutInflaterPulseBeta94072 = (PolarVoyageLayoutInflaterPulseBeta9407) sparseArray2.get(keyAt2);
            polarVoyageLayoutInflaterPulseBeta94072.getClass();
            PolarVoyageDiffUtilPrimeOlympianRogue7951 polarVoyageDiffUtilPrimeOlympianRogue7951 = polarVoyageAudioManagerPulseMega51402.PolarVoyageKotlinBetaPulseBeta3653;
            if (keyAt2 == 0) {
                synchronized (polarVoyageDiffUtilPrimeOlympianRogue7951) {
                    try {
                        polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getClass();
                        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566 = polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageBitmapVisionAuroraPixel4705;
                        polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageLayoutInflaterPulseBeta94072.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        Iterator it = polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageKotlinBetaPulseBeta3653.values().iterator();
                        while (it.hasNext()) {
                            PolarVoyageLayoutInflaterCyberUltraNebula5991 polarVoyageLayoutInflaterCyberUltraNebula5991 = (PolarVoyageLayoutInflaterCyberUltraNebula5991) it.next();
                            if (polarVoyageLayoutInflaterCyberUltraNebula5991.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageRoomDaoPulseShadow5566, polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageBitmapVisionAuroraPixel4705) && !polarVoyageLayoutInflaterCyberUltraNebula5991.PolarVoyageZipVortexCelestial6185(polarVoyageLayoutInflaterPulseBeta94072)) {
                            }
                            it.remove();
                            if (polarVoyageLayoutInflaterCyberUltraNebula5991.PolarVoyageZipVortexCelestial6185.equals(polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageDiffUtilTurboStrike5735)) {
                                polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageZipVortexCelestial6185(polarVoyageLayoutInflaterCyberUltraNebula5991);
                            }
                            if (polarVoyageLayoutInflaterCyberUltraNebula5991.PolarVoyageBitmapVisionAuroraPixel4705) {
                                polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageLayoutInflaterPulseBeta94072, polarVoyageLayoutInflaterCyberUltraNebula5991.PolarVoyageZipVortexCelestial6185);
                            }
                        }
                        polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageLayoutInflaterPulseBeta94072);
                    } finally {
                    }
                }
            } else if (keyAt2 == 11) {
                int i15 = polarVoyageAudioManagerPulseMega51402.PolarVoyageViewRogueMaster4778;
                synchronized (polarVoyageDiffUtilPrimeOlympianRogue7951) {
                    try {
                        polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getClass();
                        if (i15 != 0) {
                            z3 = false;
                        }
                        Iterator it2 = polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageKotlinBetaPulseBeta3653.values().iterator();
                        while (it2.hasNext()) {
                            PolarVoyageLayoutInflaterCyberUltraNebula5991 polarVoyageLayoutInflaterCyberUltraNebula59912 = (PolarVoyageLayoutInflaterCyberUltraNebula5991) it2.next();
                            if (polarVoyageLayoutInflaterCyberUltraNebula59912.PolarVoyageZipVortexCelestial6185(polarVoyageLayoutInflaterPulseBeta94072)) {
                                it2.remove();
                                boolean equals = polarVoyageLayoutInflaterCyberUltraNebula59912.PolarVoyageZipVortexCelestial6185.equals(polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageDiffUtilTurboStrike5735);
                                if (equals) {
                                    polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageZipVortexCelestial6185(polarVoyageLayoutInflaterCyberUltraNebula59912);
                                }
                                if (polarVoyageLayoutInflaterCyberUltraNebula59912.PolarVoyageBitmapVisionAuroraPixel4705) {
                                    if (z3 && equals) {
                                        boolean z4 = polarVoyageLayoutInflaterCyberUltraNebula59912.PolarVoyageDiffUtilTurboStrike5735;
                                    }
                                    polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageLayoutInflaterPulseBeta94072, polarVoyageLayoutInflaterCyberUltraNebula59912.PolarVoyageZipVortexCelestial6185);
                                }
                            }
                        }
                        polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageLayoutInflaterPulseBeta94072);
                    } finally {
                    }
                }
            } else {
                polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageLayoutInflaterPulseBeta94072);
            }
            i14++;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (polarVoyagePagingBetaNovaMax1456.PolarVoyageZipVortexCelestial6185.get(0)) {
            PolarVoyageLayoutInflaterPulseBeta9407 polarVoyageLayoutInflaterPulseBeta94073 = (PolarVoyageLayoutInflaterPulseBeta9407) sparseArray2.get(0);
            polarVoyageLayoutInflaterPulseBeta94073.getClass();
            if (polarVoyageAudioManagerPulseMega51402.PolarVoyageBottomSheetOmegaNeo1907 != null) {
                polarVoyageAudioManagerPulseMega51402.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLayoutInflaterPulseBeta94073.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageLayoutInflaterPulseBeta94073.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
            }
        }
        if (polarVoyagePagingBetaNovaMax1456.PolarVoyageZipVortexCelestial6185.get(2) && polarVoyageAudioManagerPulseMega51402.PolarVoyageBottomSheetOmegaNeo1907 != null) {
            polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageViewBindingPulseHeroSpeed5705();
            PolarVoyageTextRecognitionPrimeVortexHero1477 listIterator = ((PolarVoyageInstrumentationUltraTitanUltra1540) polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageKotlinHeroHyper4083.PolarVoyageStrictModeLegendEpic1532.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageZipVortexCelestial6185.listIterator(0);
            loop4: while (true) {
                if (!listIterator.hasNext()) {
                    polarVoyageGraphElitePhantom2858 = null;
                    break;
                }
                PolarVoyageLayoutInflaterBetaShadow3557 polarVoyageLayoutInflaterBetaShadow3557 = (PolarVoyageLayoutInflaterBetaShadow3557) listIterator.next();
                for (int i16 = 0; i16 < polarVoyageLayoutInflaterBetaShadow3557.PolarVoyageZipVortexCelestial6185; i16++) {
                    if (polarVoyageLayoutInflaterBetaShadow3557.PolarVoyageBitmapVisionAuroraPixel4705[i16] && (polarVoyageGraphElitePhantom2858 = polarVoyageLayoutInflaterBetaShadow3557.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767[i16].PolarVoyageAnimatorSetSparkUltraMax8233) != null) {
                        break loop4;
                    }
                }
            }
            if (polarVoyageGraphElitePhantom2858 != null) {
                PlaybackMetrics.Builder PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageColorStateListCelestialAurora5082.PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageAudioManagerPulseMega51402.PolarVoyageBottomSheetOmegaNeo1907);
                int i17 = 0;
                while (true) {
                    if (i17 >= polarVoyageGraphElitePhantom2858.PolarVoyageBottomSheetOmegaNeo1907) {
                        i12 = 1;
                        break;
                    }
                    UUID uuid = polarVoyageGraphElitePhantom2858.PolarVoyageItemDecorationUltraDeltaEpic7485[i17].PolarVoyageStrictModeLegendEpic1532;
                    if (uuid.equals(PolarVoyageAnnotationProcessorPhantomBeta1851.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
                        i12 = 3;
                        break;
                    } else if (uuid.equals(PolarVoyageAnnotationProcessorPhantomBeta1851.PolarVoyageBitmapVisionAuroraPixel4705)) {
                        i12 = 2;
                        break;
                    } else {
                        if (uuid.equals(PolarVoyageAnnotationProcessorPhantomBeta1851.PolarVoyageKotlinBetaPulseBeta3653)) {
                            i12 = 6;
                            break;
                        }
                        i17++;
                    }
                }
                PolarVoyageRotateAnimationCyberCelestialDelta4768.setDrmType(i12);
            }
        }
        if (polarVoyagePagingBetaNovaMax1456.PolarVoyageZipVortexCelestial6185.get(1011)) {
            polarVoyageAudioManagerPulseMega51402.PolarVoyageLooperThreadAlphaPrime1279++;
        }
        PolarVoyageAssetManagerQuantumSpectraPhoenix6233 polarVoyageAssetManagerQuantumSpectraPhoenix6233 = polarVoyageAudioManagerPulseMega51402.PolarVoyageSnackbarGammaEclipse2140;
        if (polarVoyageAssetManagerQuantumSpectraPhoenix6233 == null) {
            i6 = 13;
            i2 = 6;
            i3 = 8;
            i4 = 7;
            i5 = 9;
        } else {
            int i18 = polarVoyageAssetManagerQuantumSpectraPhoenix6233.PolarVoyageItemDecorationUltraDeltaEpic7485;
            Context context = polarVoyageAudioManagerPulseMega51402.PolarVoyageZipVortexCelestial6185;
            boolean z5 = polarVoyageAudioManagerPulseMega51402.PolarVoyageMotionLayoutForceEpicAurora7183 == 4;
            if (i18 == 1001) {
                polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(20, 0);
            } else {
                if (polarVoyageAssetManagerQuantumSpectraPhoenix6233 instanceof PolarVoyageAssetManagerQuantumSpectraPhoenix6233) {
                    z = polarVoyageAssetManagerQuantumSpectraPhoenix6233.PolarVoyageRotateAnimationCyberCelestialDelta4768 == 1;
                    i = polarVoyageAssetManagerQuantumSpectraPhoenix6233.PolarVoyageDrawableDeltaHyperion5742;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = polarVoyageAssetManagerQuantumSpectraPhoenix6233.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i19 = 28;
                    i2 = 6;
                    i3 = 8;
                    i4 = 7;
                    i5 = 9;
                    if (z && (i == 0 || i == 1)) {
                        polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(35, 0);
                    } else if (z && i == 3) {
                        polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(15, 0);
                    } else if (z && i == 2) {
                        polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(23, 0);
                    } else {
                        if (cause instanceof PolarVoyageLayerUltraForcePulse6616) {
                            i6 = 13;
                            polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(13, PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageRemoteModelManagerOlympianCelestial9141(((PolarVoyageLayerUltraForcePulse6616) cause).PolarVoyageBottomSheetOmegaNeo1907));
                        } else {
                            i6 = 13;
                            if (cause instanceof PolarVoyageHandlerQuantumQuantum8438) {
                                polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(14, ((PolarVoyageHandlerQuantumQuantum8438) cause).PolarVoyageItemDecorationUltraDeltaEpic7485);
                            } else if (cause instanceof OutOfMemoryError) {
                                polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(14, 0);
                            } else if (cause instanceof PolarVoyageProfilerDragonGammaPhantom1524) {
                                polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(17, 0);
                            } else if (cause instanceof PolarVoyageLocationListenerNebulaEclipseDelta5052) {
                                polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(18, ((PolarVoyageLocationListenerNebulaEclipseDelta5052) cause).PolarVoyageItemDecorationUltraDeltaEpic7485);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageContentProviderHyperSpark3838(errorCode2)) {
                                    case 6002:
                                        i19 = 24;
                                        break;
                                    case 6003:
                                        break;
                                    case 6004:
                                        i19 = 25;
                                        break;
                                    case 6005:
                                        i19 = 26;
                                        break;
                                    default:
                                        i19 = 27;
                                        break;
                                }
                                polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(i19, errorCode2);
                            } else {
                                polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(22, 0);
                            }
                        }
                        timeSinceCreatedMillis = PolarVoyageColorStateListPixelHeroHyper2660.PolarVoyageBarcodeScannerInfernoSolarSpark7767().setTimeSinceCreatedMillis(elapsedRealtime - polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705);
                        errorCode = timeSinceCreatedMillis.setErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageZipVortexCelestial6185);
                        subErrorCode = errorCode.setSubErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageMotionLayoutTransitionHeroVision4068);
                        exception = subErrorCode.setException(polarVoyageAssetManagerQuantumSpectraPhoenix6233);
                        build = exception.build();
                        polarVoyageAudioManagerPulseMega51402.PolarVoyageMotionLayoutTransitionHeroVision4068.execute(new PolarVoyageMediaPlayerNebulaTurboLegend3509(25, polarVoyageAudioManagerPulseMega51402, build));
                        polarVoyageAudioManagerPulseMega51402.PolarVoyageActivityInfoBetaQuantum8726 = true;
                        polarVoyageAudioManagerPulseMega51402.PolarVoyageSnackbarGammaEclipse2140 = null;
                    }
                    i6 = 13;
                    timeSinceCreatedMillis = PolarVoyageColorStateListPixelHeroHyper2660.PolarVoyageBarcodeScannerInfernoSolarSpark7767().setTimeSinceCreatedMillis(elapsedRealtime - polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705);
                    errorCode = timeSinceCreatedMillis.setErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageZipVortexCelestial6185);
                    subErrorCode = errorCode.setSubErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageMotionLayoutTransitionHeroVision4068);
                    exception = subErrorCode.setException(polarVoyageAssetManagerQuantumSpectraPhoenix6233);
                    build = exception.build();
                    polarVoyageAudioManagerPulseMega51402.PolarVoyageMotionLayoutTransitionHeroVision4068.execute(new PolarVoyageMediaPlayerNebulaTurboLegend3509(25, polarVoyageAudioManagerPulseMega51402, build));
                    polarVoyageAudioManagerPulseMega51402.PolarVoyageActivityInfoBetaQuantum8726 = true;
                    polarVoyageAudioManagerPulseMega51402.PolarVoyageSnackbarGammaEclipse2140 = null;
                } else if (cause instanceof PolarVoyageBundleOmegaElite5533) {
                    polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(5, ((PolarVoyageBundleOmegaElite5533) cause).PolarVoyageRotateAnimationCyberCelestialDelta4768);
                } else {
                    if ((cause instanceof PolarVoyageClipboardManagerBetaForce6328) || (cause instanceof PolarVoyageToastNeoOmega7549)) {
                        i2 = 6;
                        i5 = 9;
                        i3 = 8;
                        i4 = 7;
                        polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(z5 ? 10 : 11, 0);
                    } else {
                        boolean z6 = cause instanceof PolarVoyageMotionLayoutTurboVortex2225;
                        if (z6 || (cause instanceof PolarVoyageGraphPhoenixNebulaDragon8619)) {
                            i7 = 9;
                            if (PolarVoyageMLKitQuantumEpic5634.PolarVoyageZipVortexCelestial6185(context).PolarVoyageMotionLayoutTransitionHeroVision4068() == 1) {
                                polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i2 = 6;
                                    polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(6, 0);
                                    i5 = 9;
                                    i6 = 13;
                                    i3 = 8;
                                    i4 = 7;
                                    timeSinceCreatedMillis = PolarVoyageColorStateListPixelHeroHyper2660.PolarVoyageBarcodeScannerInfernoSolarSpark7767().setTimeSinceCreatedMillis(elapsedRealtime - polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705);
                                    errorCode = timeSinceCreatedMillis.setErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageZipVortexCelestial6185);
                                    subErrorCode = errorCode.setSubErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageMotionLayoutTransitionHeroVision4068);
                                    exception = subErrorCode.setException(polarVoyageAssetManagerQuantumSpectraPhoenix6233);
                                    build = exception.build();
                                    polarVoyageAudioManagerPulseMega51402.PolarVoyageMotionLayoutTransitionHeroVision4068.execute(new PolarVoyageMediaPlayerNebulaTurboLegend3509(25, polarVoyageAudioManagerPulseMega51402, build));
                                    polarVoyageAudioManagerPulseMega51402.PolarVoyageActivityInfoBetaQuantum8726 = true;
                                    polarVoyageAudioManagerPulseMega51402.PolarVoyageSnackbarGammaEclipse2140 = null;
                                } else {
                                    i2 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i8 = 7;
                                        polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(7, 0);
                                    } else {
                                        i8 = 7;
                                        if (z6 && ((PolarVoyageMotionLayoutTurboVortex2225) cause).PolarVoyageStrictModeLegendEpic1532 == 1) {
                                            polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(4, 0);
                                        } else {
                                            polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(8, 0);
                                            i5 = 9;
                                            i3 = 8;
                                            i4 = 7;
                                        }
                                    }
                                    i5 = 9;
                                    i4 = i8;
                                    i6 = 13;
                                    i3 = 8;
                                    timeSinceCreatedMillis = PolarVoyageColorStateListPixelHeroHyper2660.PolarVoyageBarcodeScannerInfernoSolarSpark7767().setTimeSinceCreatedMillis(elapsedRealtime - polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705);
                                    errorCode = timeSinceCreatedMillis.setErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageZipVortexCelestial6185);
                                    subErrorCode = errorCode.setSubErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageMotionLayoutTransitionHeroVision4068);
                                    exception = subErrorCode.setException(polarVoyageAssetManagerQuantumSpectraPhoenix6233);
                                    build = exception.build();
                                    polarVoyageAudioManagerPulseMega51402.PolarVoyageMotionLayoutTransitionHeroVision4068.execute(new PolarVoyageMediaPlayerNebulaTurboLegend3509(25, polarVoyageAudioManagerPulseMega51402, build));
                                    polarVoyageAudioManagerPulseMega51402.PolarVoyageActivityInfoBetaQuantum8726 = true;
                                    polarVoyageAudioManagerPulseMega51402.PolarVoyageSnackbarGammaEclipse2140 = null;
                                }
                            }
                        } else if (i18 == 1002) {
                            polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(21, 0);
                        } else if (cause instanceof PolarVoyagePagingSourceEpicCyber8929) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageRemoteModelManagerOlympianCelestial9141(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageContentProviderHyperSpark3838(PolarVoyageRemoteModelManagerOlympianCelestial9141)) {
                                    case 6002:
                                        i9 = 24;
                                        break;
                                    case 6003:
                                        i9 = 28;
                                        break;
                                    case 6004:
                                        i9 = 25;
                                        break;
                                    case 6005:
                                        i9 = 26;
                                        break;
                                    default:
                                        i9 = 27;
                                        break;
                                }
                                polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(i9, PolarVoyageRemoteModelManagerOlympianCelestial9141);
                            } else {
                                polarVoyageResourcePhoenixMaster2270 = cause3 instanceof MediaDrmResetException ? new PolarVoyageResourcePhoenixMaster2270(27, 0) : cause3 instanceof NotProvisionedException ? new PolarVoyageResourcePhoenixMaster2270(24, 0) : cause3 instanceof DeniedByServerException ? new PolarVoyageResourcePhoenixMaster2270(29, 0) : cause3 instanceof PolarVoyageMotionSceneGammaDeltaBeta5184 ? new PolarVoyageResourcePhoenixMaster2270(23, 0) : cause3 instanceof PolarVoyageRoomRogueNeoDelta2273 ? new PolarVoyageResourcePhoenixMaster2270(28, 0) : new PolarVoyageResourcePhoenixMaster2270(30, 0);
                            }
                        } else if ((cause instanceof PolarVoyageWithContextVisionSolar8714) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            polarVoyageResourcePhoenixMaster2270 = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new PolarVoyageResourcePhoenixMaster2270(32, 0) : new PolarVoyageResourcePhoenixMaster2270(31, 0);
                        } else {
                            i7 = 9;
                            polarVoyageResourcePhoenixMaster2270 = new PolarVoyageResourcePhoenixMaster2270(9, 0);
                        }
                        i5 = i7;
                        i6 = 13;
                        i2 = 6;
                        i3 = 8;
                        i4 = 7;
                        timeSinceCreatedMillis = PolarVoyageColorStateListPixelHeroHyper2660.PolarVoyageBarcodeScannerInfernoSolarSpark7767().setTimeSinceCreatedMillis(elapsedRealtime - polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705);
                        errorCode = timeSinceCreatedMillis.setErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageZipVortexCelestial6185);
                        subErrorCode = errorCode.setSubErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageMotionLayoutTransitionHeroVision4068);
                        exception = subErrorCode.setException(polarVoyageAssetManagerQuantumSpectraPhoenix6233);
                        build = exception.build();
                        polarVoyageAudioManagerPulseMega51402.PolarVoyageMotionLayoutTransitionHeroVision4068.execute(new PolarVoyageMediaPlayerNebulaTurboLegend3509(25, polarVoyageAudioManagerPulseMega51402, build));
                        polarVoyageAudioManagerPulseMega51402.PolarVoyageActivityInfoBetaQuantum8726 = true;
                        polarVoyageAudioManagerPulseMega51402.PolarVoyageSnackbarGammaEclipse2140 = null;
                    }
                    i6 = 13;
                    timeSinceCreatedMillis = PolarVoyageColorStateListPixelHeroHyper2660.PolarVoyageBarcodeScannerInfernoSolarSpark7767().setTimeSinceCreatedMillis(elapsedRealtime - polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705);
                    errorCode = timeSinceCreatedMillis.setErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageZipVortexCelestial6185);
                    subErrorCode = errorCode.setSubErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageMotionLayoutTransitionHeroVision4068);
                    exception = subErrorCode.setException(polarVoyageAssetManagerQuantumSpectraPhoenix6233);
                    build = exception.build();
                    polarVoyageAudioManagerPulseMega51402.PolarVoyageMotionLayoutTransitionHeroVision4068.execute(new PolarVoyageMediaPlayerNebulaTurboLegend3509(25, polarVoyageAudioManagerPulseMega51402, build));
                    polarVoyageAudioManagerPulseMega51402.PolarVoyageActivityInfoBetaQuantum8726 = true;
                    polarVoyageAudioManagerPulseMega51402.PolarVoyageSnackbarGammaEclipse2140 = null;
                }
            }
            i6 = 13;
            i2 = 6;
            i3 = 8;
            i4 = 7;
            i5 = 9;
            timeSinceCreatedMillis = PolarVoyageColorStateListPixelHeroHyper2660.PolarVoyageBarcodeScannerInfernoSolarSpark7767().setTimeSinceCreatedMillis(elapsedRealtime - polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705);
            errorCode = timeSinceCreatedMillis.setErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageZipVortexCelestial6185);
            subErrorCode = errorCode.setSubErrorCode(polarVoyageResourcePhoenixMaster2270.PolarVoyageMotionLayoutTransitionHeroVision4068);
            exception = subErrorCode.setException(polarVoyageAssetManagerQuantumSpectraPhoenix6233);
            build = exception.build();
            polarVoyageAudioManagerPulseMega51402.PolarVoyageMotionLayoutTransitionHeroVision4068.execute(new PolarVoyageMediaPlayerNebulaTurboLegend3509(25, polarVoyageAudioManagerPulseMega51402, build));
            polarVoyageAudioManagerPulseMega51402.PolarVoyageActivityInfoBetaQuantum8726 = true;
            polarVoyageAudioManagerPulseMega51402.PolarVoyageSnackbarGammaEclipse2140 = null;
        }
        if (polarVoyagePagingBetaNovaMax1456.PolarVoyageZipVortexCelestial6185.get(2)) {
            polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageViewBindingPulseHeroSpeed5705();
            PolarVoyageInstrumentationUltraTitanUltra1540 polarVoyageInstrumentationUltraTitanUltra1540 = (PolarVoyageInstrumentationUltraTitanUltra1540) polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageKotlinHeroHyper4083.PolarVoyageStrictModeLegendEpic1532.PolarVoyageBottomSheetOmegaNeo1907;
            boolean PolarVoyageZipVortexCelestial6185 = polarVoyageInstrumentationUltraTitanUltra1540.PolarVoyageZipVortexCelestial6185(2);
            boolean PolarVoyageZipVortexCelestial61852 = polarVoyageInstrumentationUltraTitanUltra1540.PolarVoyageZipVortexCelestial6185(1);
            boolean PolarVoyageZipVortexCelestial61853 = polarVoyageInstrumentationUltraTitanUltra1540.PolarVoyageZipVortexCelestial6185(3);
            if (PolarVoyageZipVortexCelestial6185 || PolarVoyageZipVortexCelestial61852 || PolarVoyageZipVortexCelestial61853) {
                if (PolarVoyageZipVortexCelestial6185) {
                    polarVoyageDisplayMetricsSpectraNeoHero6356 = null;
                } else {
                    polarVoyageDisplayMetricsSpectraNeoHero6356 = null;
                    if (!Objects.equals(polarVoyageAudioManagerPulseMega51402.PolarVoyageAnimatorSetSparkUltraMax8233, null)) {
                        polarVoyageAudioManagerPulseMega51402.PolarVoyageAnimatorSetSparkUltraMax8233 = null;
                        polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705(1, elapsedRealtime, null);
                    }
                }
                if (!PolarVoyageZipVortexCelestial61852 && !Objects.equals(polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapMaxTitanTitan7960, polarVoyageDisplayMetricsSpectraNeoHero6356)) {
                    polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapMaxTitanTitan7960 = polarVoyageDisplayMetricsSpectraNeoHero6356;
                    polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705(0, elapsedRealtime, polarVoyageDisplayMetricsSpectraNeoHero6356);
                }
                if (!PolarVoyageZipVortexCelestial61853 && !Objects.equals(polarVoyageAudioManagerPulseMega51402.PolarVoyageDisplayMetricsVortexDragon9516, polarVoyageDisplayMetricsSpectraNeoHero6356)) {
                    polarVoyageAudioManagerPulseMega51402.PolarVoyageDisplayMetricsVortexDragon9516 = polarVoyageDisplayMetricsSpectraNeoHero6356;
                    polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705(2, elapsedRealtime, polarVoyageDisplayMetricsSpectraNeoHero6356);
                }
            }
        }
        if (polarVoyageAudioManagerPulseMega51402.PolarVoyageZipVortexCelestial6185(polarVoyageAudioManagerPulseMega51402.PolarVoyageContentProviderHyperSpark3838)) {
            PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero63562 = (PolarVoyageDisplayMetricsSpectraNeoHero6356) polarVoyageAudioManagerPulseMega51402.PolarVoyageContentProviderHyperSpark3838.PolarVoyageStrictModeLegendEpic1532;
            if (polarVoyageDisplayMetricsSpectraNeoHero63562.PolarVoyageMotionLayoutForceEpicAurora7183 != -1) {
                if (!Objects.equals(polarVoyageAudioManagerPulseMega51402.PolarVoyageAnimatorSetSparkUltraMax8233, polarVoyageDisplayMetricsSpectraNeoHero63562)) {
                    polarVoyageAudioManagerPulseMega51402.PolarVoyageAnimatorSetSparkUltraMax8233 = polarVoyageDisplayMetricsSpectraNeoHero63562;
                    polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705(1, elapsedRealtime, polarVoyageDisplayMetricsSpectraNeoHero63562);
                }
                polarVoyageAudioManagerPulseMega51402.PolarVoyageContentProviderHyperSpark3838 = null;
            }
        }
        if (polarVoyageAudioManagerPulseMega51402.PolarVoyageZipVortexCelestial6185(polarVoyageAudioManagerPulseMega51402.PolarVoyageRemoteModelManagerOlympianCelestial9141)) {
            PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero63563 = (PolarVoyageDisplayMetricsSpectraNeoHero6356) polarVoyageAudioManagerPulseMega51402.PolarVoyageRemoteModelManagerOlympianCelestial9141.PolarVoyageStrictModeLegendEpic1532;
            if (!Objects.equals(polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapMaxTitanTitan7960, polarVoyageDisplayMetricsSpectraNeoHero63563)) {
                polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapMaxTitanTitan7960 = polarVoyageDisplayMetricsSpectraNeoHero63563;
                polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705(0, elapsedRealtime, polarVoyageDisplayMetricsSpectraNeoHero63563);
            }
            polarVoyageAudioManagerPulseMega51402.PolarVoyageRemoteModelManagerOlympianCelestial9141 = null;
        }
        if (polarVoyageAudioManagerPulseMega51402.PolarVoyageZipVortexCelestial6185(polarVoyageAudioManagerPulseMega51402.PolarVoyageNavigationViewHyperHyperHyperion1793)) {
            PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero63564 = (PolarVoyageDisplayMetricsSpectraNeoHero6356) polarVoyageAudioManagerPulseMega51402.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageStrictModeLegendEpic1532;
            if (!Objects.equals(polarVoyageAudioManagerPulseMega51402.PolarVoyageDisplayMetricsVortexDragon9516, polarVoyageDisplayMetricsSpectraNeoHero63564)) {
                polarVoyageAudioManagerPulseMega51402.PolarVoyageDisplayMetricsVortexDragon9516 = polarVoyageDisplayMetricsSpectraNeoHero63564;
                polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705(2, elapsedRealtime, polarVoyageDisplayMetricsSpectraNeoHero63564);
            }
            polarVoyageAudioManagerPulseMega51402.PolarVoyageNavigationViewHyperHyperHyperion1793 = null;
        }
        switch (PolarVoyageMLKitQuantumEpic5634.PolarVoyageZipVortexCelestial6185(polarVoyageAudioManagerPulseMega51402.PolarVoyageZipVortexCelestial6185).PolarVoyageMotionLayoutTransitionHeroVision4068()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i10 = 0;
                break;
            case 1:
                i10 = i5;
                break;
            case 2:
                i10 = 2;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 5;
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                i10 = i2;
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
            default:
                i10 = 1;
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                i10 = 3;
                break;
            case 9:
                i10 = i3;
                break;
            case 10:
                i10 = i4;
                break;
        }
        if (i10 != polarVoyageAudioManagerPulseMega51402.PolarVoyageDrawableDeltaHyperion5742) {
            polarVoyageAudioManagerPulseMega51402.PolarVoyageDrawableDeltaHyperion5742 = i10;
            networkType = PolarVoyageColorStateListPixelHeroHyper2660.PolarVoyageKotlinBetaPulseBeta3653().setNetworkType(i10);
            timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705);
            build3 = timeSinceCreatedMillis3.build();
            polarVoyageAudioManagerPulseMega51402.PolarVoyageMotionLayoutTransitionHeroVision4068.execute(new PolarVoyageMediaPlayerNebulaTurboLegend3509(24, polarVoyageAudioManagerPulseMega51402, build3));
        }
        if (polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageDrawableDeltaHyperion5742() != 2) {
            polarVoyageAudioManagerPulseMega51402.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = false;
        }
        polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageViewBindingPulseHeroSpeed5705();
        if (polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageKotlinHeroHyper4083.PolarVoyageDiffUtilTurboStrike5735 == null) {
            polarVoyageAudioManagerPulseMega51402.PolarVoyageAlertDialogCyberHeroQuantum3938 = false;
            i11 = 10;
        } else {
            i11 = 10;
            if (polarVoyagePagingBetaNovaMax1456.PolarVoyageZipVortexCelestial6185.get(10)) {
                polarVoyageAudioManagerPulseMega51402.PolarVoyageAlertDialogCyberHeroQuantum3938 = true;
            }
        }
        int PolarVoyageDrawableDeltaHyperion5742 = polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageDrawableDeltaHyperion5742();
        if (polarVoyageAudioManagerPulseMega51402.PolarVoyageLayerDrawableShadowTitaniumOmega1942) {
            i6 = 5;
        } else if (!polarVoyageAudioManagerPulseMega51402.PolarVoyageAlertDialogCyberHeroQuantum3938) {
            if (PolarVoyageDrawableDeltaHyperion5742 == 4) {
                i6 = 11;
            } else {
                i6 = 12;
                int i20 = 2;
                if (PolarVoyageDrawableDeltaHyperion5742 == 2) {
                    int i21 = polarVoyageAudioManagerPulseMega51402.PolarVoyageCameraPixelBlaze2629;
                    if (i21 != 0 && i21 != 2 && i21 != 12) {
                        if (polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageCameraPixelBlaze2629()) {
                            polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageViewBindingPulseHeroSpeed5705();
                            i6 = polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageKotlinHeroHyper4083.PolarVoyageDrawableDeltaHyperion5742 != 0 ? i11 : i2;
                        } else {
                            i6 = i4;
                        }
                    }
                    i6 = i20;
                } else {
                    i20 = 3;
                    if (PolarVoyageDrawableDeltaHyperion5742 != 3) {
                        z2 = true;
                        if (PolarVoyageDrawableDeltaHyperion5742 != 1 || polarVoyageAudioManagerPulseMega51402.PolarVoyageCameraPixelBlaze2629 == 0) {
                            i6 = polarVoyageAudioManagerPulseMega51402.PolarVoyageCameraPixelBlaze2629;
                        }
                        if (polarVoyageAudioManagerPulseMega51402.PolarVoyageCameraPixelBlaze2629 != i6) {
                            polarVoyageAudioManagerPulseMega51402.PolarVoyageCameraPixelBlaze2629 = i6;
                            polarVoyageAudioManagerPulseMega51402.PolarVoyageActivityInfoBetaQuantum8726 = z2;
                            state = PolarVoyageColorStateListPixelHeroHyper2660.PolarVoyageTextInputEditTextNebulaHero6651().setState(polarVoyageAudioManagerPulseMega51402.PolarVoyageCameraPixelBlaze2629);
                            timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - polarVoyageAudioManagerPulseMega51402.PolarVoyageBitmapVisionAuroraPixel4705);
                            build2 = timeSinceCreatedMillis2.build();
                            polarVoyageAudioManagerPulseMega51402.PolarVoyageMotionLayoutTransitionHeroVision4068.execute(new PolarVoyageMediaPlayerNebulaTurboLegend3509(27, polarVoyageAudioManagerPulseMega51402, build2));
                        }
                        if (polarVoyagePagingBetaNovaMax1456.PolarVoyageZipVortexCelestial6185.get(1028)) {
                            return;
                        }
                        PolarVoyageDiffUtilPrimeOlympianRogue7951 polarVoyageDiffUtilPrimeOlympianRogue79512 = polarVoyageAudioManagerPulseMega51402.PolarVoyageKotlinBetaPulseBeta3653;
                        PolarVoyageLayoutInflaterPulseBeta9407 polarVoyageLayoutInflaterPulseBeta94074 = (PolarVoyageLayoutInflaterPulseBeta9407) sparseArray2.get(1028);
                        polarVoyageLayoutInflaterPulseBeta94074.getClass();
                        synchronized (polarVoyageDiffUtilPrimeOlympianRogue79512) {
                            try {
                                String str = polarVoyageDiffUtilPrimeOlympianRogue79512.PolarVoyageDiffUtilTurboStrike5735;
                                if (str != null) {
                                    PolarVoyageLayoutInflaterCyberUltraNebula5991 polarVoyageLayoutInflaterCyberUltraNebula59913 = (PolarVoyageLayoutInflaterCyberUltraNebula5991) polarVoyageDiffUtilPrimeOlympianRogue79512.PolarVoyageKotlinBetaPulseBeta3653.get(str);
                                    polarVoyageLayoutInflaterCyberUltraNebula59913.getClass();
                                    polarVoyageDiffUtilPrimeOlympianRogue79512.PolarVoyageZipVortexCelestial6185(polarVoyageLayoutInflaterCyberUltraNebula59913);
                                }
                                Iterator it3 = polarVoyageDiffUtilPrimeOlympianRogue79512.PolarVoyageKotlinBetaPulseBeta3653.values().iterator();
                                while (it3.hasNext()) {
                                    PolarVoyageLayoutInflaterCyberUltraNebula5991 polarVoyageLayoutInflaterCyberUltraNebula59914 = (PolarVoyageLayoutInflaterCyberUltraNebula5991) it3.next();
                                    it3.remove();
                                    if (polarVoyageLayoutInflaterCyberUltraNebula59914.PolarVoyageBitmapVisionAuroraPixel4705 && (polarVoyageAudioManagerPulseMega5140 = polarVoyageDiffUtilPrimeOlympianRogue79512.PolarVoyageBarcodeScannerInfernoSolarSpark7767) != null) {
                                        polarVoyageAudioManagerPulseMega5140.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageLayoutInflaterPulseBeta94074, polarVoyageLayoutInflaterCyberUltraNebula59914.PolarVoyageZipVortexCelestial6185);
                                    }
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    if (polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageCameraPixelBlaze2629()) {
                        polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageViewBindingPulseHeroSpeed5705();
                        if (polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageKotlinHeroHyper4083.PolarVoyageDrawableDeltaHyperion5742 != 0) {
                            i6 = i5;
                        }
                        i6 = i20;
                    } else {
                        i6 = 4;
                    }
                }
            }
        }
        z2 = true;
        if (polarVoyageAudioManagerPulseMega51402.PolarVoyageCameraPixelBlaze2629 != i6) {
        }
        if (polarVoyagePagingBetaNovaMax1456.PolarVoyageZipVortexCelestial6185.get(1028)) {
        }
    }

    @Override // p000createpolar.PolarVoyageServiceSolarDeltaFusion9632
    public void PolarVoyageDiffUtilTurboStrike5735(PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995) {
        ((FirebaseMessagingService) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185((Intent) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
    }

    @Override // p000createpolar.PolarVoyageFlowCollectorOmegaHyperion3803
    public Object PolarVoyageKotlinBetaPulseBeta3653() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageWorkManagerVortexNova2773 polarVoyageWorkManagerVortexNova2773 = (PolarVoyageWorkManagerVortexNova2773) this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case 9:
                Iterable iterable = (Iterable) obj;
                PolarVoyageExoPlayerNeoDelta8060 polarVoyageExoPlayerNeoDelta8060 = polarVoyageWorkManagerVortexNova2773.PolarVoyageKotlinBetaPulseBeta3653;
                polarVoyageExoPlayerNeoDelta8060.getClass();
                if (iterable.iterator().hasNext()) {
                    polarVoyageExoPlayerNeoDelta8060.PolarVoyageMotionLayoutTransitionHeroVision4068().compileStatement("DELETE FROM events WHERE _id in ".concat(PolarVoyageExoPlayerNeoDelta8060.PolarVoyageCameraPixelBlaze2629(iterable))).execute();
                    break;
                }
                break;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    polarVoyageWorkManagerVortexNova2773.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532(((Integer) r2.getValue()).intValue(), PolarVoyageLocationListenerPulseTitan6571.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // p000createpolar.PolarVoyageKeyEventSpeedInfernoThunder5692
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageServiceUltraUltraNeo9663 polarVoyageServiceUltraUltraNeo9663) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        String str = (String) this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageTextViewLegendTurbo6617 polarVoyageTextViewLegendTurbo6617 = (PolarVoyageTextViewLegendTurbo6617) obj;
                try {
                    Trace.beginSection(str);
                    return polarVoyageTextViewLegendTurbo6617.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageServiceUltraUltraNeo9663);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) polarVoyageServiceUltraUltraNeo9663.PolarVoyageKotlinBetaPulseBeta3653(Context.class);
                int i2 = ((PolarVoyageBroadcastDragonShadowRogue6783) obj).PolarVoyageItemDecorationUltraDeltaEpic7485;
                String str2 = "";
                switch (i2) {
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            str2 = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        break;
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            str2 = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        break;
                    case 9:
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str2 = "embedded";
                                        break;
                                    }
                                } else {
                                    str2 = "auto";
                                    break;
                                }
                            } else {
                                str2 = "watch";
                                break;
                            }
                        } else {
                            str2 = "tv";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            str2 = FirebaseCommonRegistrar.PolarVoyageZipVortexCelestial6185(installerPackageName);
                            break;
                        }
                        break;
                }
                return new PolarVoyageFirebaseHeroHero8936(str, str2);
        }
    }

    @Override // p000createpolar.PolarVoyageFontFamilyTurboHero9597
    public Object PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995) {
        PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280 = (PolarVoyageResourcesCelestialInferno9280) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        String str = (String) this.PolarVoyageStrictModeLegendEpic1532;
        synchronized (polarVoyageResourcesCelestialInferno9280) {
            ((PolarVoyageContentObserverThunderOmega9101) polarVoyageResourcesCelestialInferno9280.PolarVoyageRotateAnimationCyberCelestialDelta4768).remove(str);
        }
        return polarVoyageDialogFragmentTitanCelestial7995;
    }

    @Override // p000createpolar.PolarVoyageMapBlazeAlpha6089
    public void PolarVoyageZipVortexCelestial6185(Object obj) {
        PolarVoyageLayoutInflaterPulseBeta9407 polarVoyageLayoutInflaterPulseBeta9407 = (PolarVoyageLayoutInflaterPulseBeta9407) this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageTextViewStormLegend8893 polarVoyageTextViewStormLegend8893 = (PolarVoyageTextViewStormLegend8893) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageAudioManagerPulseMega5140 polarVoyageAudioManagerPulseMega5140 = (PolarVoyageAudioManagerPulseMega5140) obj;
        polarVoyageAudioManagerPulseMega5140.getClass();
        PolarVoyageCombineBlazePulse1497 polarVoyageCombineBlazePulse1497 = polarVoyageLayoutInflaterPulseBeta9407.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (polarVoyageCombineBlazePulse1497 == null) {
            return;
        }
        PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356 = polarVoyageTextViewStormLegend8893.PolarVoyageMotionLayoutTransitionHeroVision4068;
        polarVoyageDisplayMetricsSpectraNeoHero6356.getClass();
        PolarVoyageDiffUtilPrimeOlympianRogue7951 polarVoyageDiffUtilPrimeOlympianRogue7951 = polarVoyageAudioManagerPulseMega5140.PolarVoyageKotlinBetaPulseBeta3653;
        PolarVoyageRoomDaoPulseShadow5566 polarVoyageRoomDaoPulseShadow5566 = polarVoyageLayoutInflaterPulseBeta9407.PolarVoyageMotionLayoutTransitionHeroVision4068;
        polarVoyageCombineBlazePulse1497.getClass();
        PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280 = new PolarVoyageResourcesCelestialInferno9280(0, polarVoyageDisplayMetricsSpectraNeoHero6356, polarVoyageDiffUtilPrimeOlympianRogue7951.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageRoomDaoPulseShadow5566, polarVoyageCombineBlazePulse1497));
        int i = polarVoyageTextViewStormLegend8893.PolarVoyageZipVortexCelestial6185;
        if (i != 0) {
            if (i == 1) {
                polarVoyageAudioManagerPulseMega5140.PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageResourcesCelestialInferno9280;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                polarVoyageAudioManagerPulseMega5140.PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageResourcesCelestialInferno9280;
                return;
            }
        }
        polarVoyageAudioManagerPulseMega5140.PolarVoyageContentProviderHyperSpark3838 = polarVoyageResourcesCelestialInferno9280;
    }

    @Override // p000createpolar.PolarVoyageScaleAnimationVortexAurora2886
    public void accept(Object obj) {
        PolarVoyageTextWatcherLegendHero8414 polarVoyageTextWatcherLegendHero8414 = (PolarVoyageTextWatcherLegendHero8414) this.PolarVoyageStrictModeLegendEpic1532;
        ((PolarVoyageNestedScrollViewNeoTurbo2079) obj).PolarVoyageBitmapMaxTitanTitan7960(polarVoyageTextWatcherLegendHero8414.PolarVoyageZipVortexCelestial6185, polarVoyageTextWatcherLegendHero8414.PolarVoyageMotionLayoutTransitionHeroVision4068, (PolarVoyageTextViewStormLegend8893) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
    }

    @Override // p000createpolar.PolarVoyageGuidelineForceNebulaPhoenix2255
    public Object apply(Object obj) {
        PolarVoyageExoPlayerNeoDelta8060 polarVoyageExoPlayerNeoDelta8060 = (PolarVoyageExoPlayerNeoDelta8060) this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageLayoutInfernoSpeed9711 polarVoyageLayoutInfernoSpeed9711 = (PolarVoyageLayoutInfernoSpeed9711) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        PolarVoyageCameraViewHyperPhantom1342 polarVoyageCameraViewHyperPhantom1342 = polarVoyageExoPlayerNeoDelta8060.PolarVoyageBottomSheetOmegaNeo1907;
        ArrayList PolarVoyageDiffUtilTurboStrike5735 = polarVoyageExoPlayerNeoDelta8060.PolarVoyageDiffUtilTurboStrike5735(sQLiteDatabase, polarVoyageLayoutInfernoSpeed9711, polarVoyageCameraViewHyperPhantom1342.PolarVoyageMotionLayoutTransitionHeroVision4068);
        for (PolarVoyageWithContextMasterSpeed4365 polarVoyageWithContextMasterSpeed4365 : PolarVoyageWithContextMasterSpeed4365.values()) {
            if (polarVoyageWithContextMasterSpeed4365 != polarVoyageLayoutInfernoSpeed9711.PolarVoyageKotlinBetaPulseBeta3653) {
                int size = polarVoyageCameraViewHyperPhantom1342.PolarVoyageMotionLayoutTransitionHeroVision4068 - PolarVoyageDiffUtilTurboStrike5735.size();
                if (size <= 0) {
                    break;
                }
                PolarVoyageAlarmManagerAlphaInferno3493 PolarVoyageZipVortexCelestial6185 = PolarVoyageLayoutInfernoSpeed9711.PolarVoyageZipVortexCelestial6185();
                PolarVoyageZipVortexCelestial6185.PolarVoyageCameraViewSpectraMaxSpectra2824(polarVoyageLayoutInfernoSpeed9711.PolarVoyageZipVortexCelestial6185);
                if (polarVoyageWithContextMasterSpeed4365 == null) {
                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageItemDecorationUltraDeltaEpic7485("Null priority");
                    return null;
                }
                PolarVoyageZipVortexCelestial6185.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageWithContextMasterSpeed4365;
                PolarVoyageZipVortexCelestial6185.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageLayoutInfernoSpeed9711.PolarVoyageMotionLayoutTransitionHeroVision4068;
                PolarVoyageDiffUtilTurboStrike5735.addAll(polarVoyageExoPlayerNeoDelta8060.PolarVoyageDiffUtilTurboStrike5735(sQLiteDatabase, PolarVoyageZipVortexCelestial6185.PolarVoyageDiffUtilTurboStrike5735(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < PolarVoyageDiffUtilTurboStrike5735.size(); i++) {
            sb.append(((PolarVoyageLaunchInfernoVision5784) PolarVoyageDiffUtilTurboStrike5735.get(i)).PolarVoyageZipVortexCelestial6185);
            if (i < PolarVoyageDiffUtilTurboStrike5735.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new PolarVoyageSharedFlowSpectraSpeedHyperion9446(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = PolarVoyageDiffUtilTurboStrike5735.listIterator();
        while (listIterator.hasNext()) {
            PolarVoyageLaunchInfernoVision5784 polarVoyageLaunchInfernoVision5784 = (PolarVoyageLaunchInfernoVision5784) listIterator.next();
            long j2 = polarVoyageLaunchInfernoVision5784.PolarVoyageZipVortexCelestial6185;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                PolarVoyageStateEpicSpectraThunder6774 PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageLaunchInfernoVision5784.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageKotlinBetaPulseBeta3653();
                for (PolarVoyageSharedFlowSpectraSpeedHyperion9446 polarVoyageSharedFlowSpectraSpeedHyperion9446 : (Set) hashMap.get(Long.valueOf(j2))) {
                    PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageDiffUtilTurboStrike5735(polarVoyageSharedFlowSpectraSpeedHyperion9446.PolarVoyageZipVortexCelestial6185, polarVoyageSharedFlowSpectraSpeedHyperion9446.PolarVoyageMotionLayoutTransitionHeroVision4068);
                }
                listIterator.set(new PolarVoyageLaunchInfernoVision5784(j2, polarVoyageLaunchInfernoVision5784.PolarVoyageMotionLayoutTransitionHeroVision4068, PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageItemDecorationUltraDeltaEpic7485()));
            }
        }
        return PolarVoyageDiffUtilTurboStrike5735;
    }

    public /* synthetic */ PolarVoyageTextWatcherPhantomStorm4467(int i, Object obj, Object obj2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj2;
    }
}
