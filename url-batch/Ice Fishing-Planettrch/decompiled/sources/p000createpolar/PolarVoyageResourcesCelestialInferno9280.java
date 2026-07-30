package p000createpolar;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageResourcesCelestialInferno9280 implements PolarVoyageModelInputOutputInfernoBeta7978, PolarVoyageClipboardManagerQuantumCelestialAlpha6291, PolarVoyageAlphaAnimationHeroTitanium5808, PolarVoyageTabLayoutNeoNeo7623, PolarVoyageVideoCaptureLegendTitan7950, PolarVoyageAdMobForceVortexBeta7549 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageResourcesCelestialInferno9280(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        switch (i) {
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageKeyframeThunderMegaVortex8492();
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageKeyframeThunderMegaVortex8492();
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageSharedElementSpectraNeo7351(0);
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageSharedElementSpectraNeo7351(0);
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageDigitalInkRecognitionBetaDelta4802(new PolarVoyageConfigurationMegaTitaniumQuantum2348[16]);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [create-polar.PolarVoyageGyroscopePulseAurora9729] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [create-polar.PolarVoyageGyroscopePulseAurora9729] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [create-polar.PolarVoyageDigitalInkRecognitionBetaDelta4802] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [create-polar.PolarVoyageDigitalInkRecognitionBetaDelta4802] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void PolarVoyageActivityInfoBetaQuantum8726(PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum2348) {
        if (polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageKeyframeEpicNovaXCyber9821 > 0) {
            if (polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageGuidelineStormSolar2850.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == PolarVoyageLifecycleCameraControllerNebulaRogue7869.PolarVoyageViewRogueMaster4778 && !polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageDrawableDeltaHyperion5742() && !polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageSnackbarGammaEclipse2140() && !polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageMotionSceneStormSolarBeta2208 && polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageCardViewAlphaVortexCelestial9747()) {
                PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora9729 = (PolarVoyageGyroscopePulseAurora9729) polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageAlarmManagerShadowHyperBeta8339.PolarVoyageTextInputEditTextNebulaHero6651;
                if ((polarVoyageGyroscopePulseAurora9729.PolarVoyageBottomSheetOmegaNeo1907 & 256) != 0) {
                    while (polarVoyageGyroscopePulseAurora9729 != null) {
                        if ((polarVoyageGyroscopePulseAurora9729.PolarVoyageRotateAnimationCyberCelestialDelta4768 & 256) != 0) {
                            PolarVoyageServiceInfoPhantomBlaze1511 polarVoyageServiceInfoPhantomBlaze1511 = polarVoyageGyroscopePulseAurora9729;
                            ?? r5 = 0;
                            while (polarVoyageServiceInfoPhantomBlaze1511 != 0) {
                                if (polarVoyageServiceInfoPhantomBlaze1511 instanceof PolarVoyageAnimationSetInfernoNovaX2643) {
                                    PolarVoyageAnimationSetInfernoNovaX2643 polarVoyageAnimationSetInfernoNovaX2643 = (PolarVoyageAnimationSetInfernoNovaX2643) polarVoyageServiceInfoPhantomBlaze1511;
                                    polarVoyageAnimationSetInfernoNovaX2643.PolarVoyageViewRogueMaster4778(PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageAlertDialogNovaXCelestial4954(polarVoyageAnimationSetInfernoNovaX2643, 256));
                                } else if ((polarVoyageServiceInfoPhantomBlaze1511.PolarVoyageRotateAnimationCyberCelestialDelta4768 & 256) != 0 && (polarVoyageServiceInfoPhantomBlaze1511 instanceof PolarVoyageServiceInfoPhantomBlaze1511)) {
                                    PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora97292 = polarVoyageServiceInfoPhantomBlaze1511.PolarVoyageMotionLayoutForceEpicAurora7183;
                                    int i = 0;
                                    polarVoyageServiceInfoPhantomBlaze1511 = polarVoyageServiceInfoPhantomBlaze1511;
                                    r5 = r5;
                                    while (polarVoyageGyroscopePulseAurora97292 != null) {
                                        if ((polarVoyageGyroscopePulseAurora97292.PolarVoyageRotateAnimationCyberCelestialDelta4768 & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                polarVoyageServiceInfoPhantomBlaze1511 = polarVoyageGyroscopePulseAurora97292;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new PolarVoyageDigitalInkRecognitionBetaDelta4802(new PolarVoyageGyroscopePulseAurora9729[16]);
                                                }
                                                if (polarVoyageServiceInfoPhantomBlaze1511 != 0) {
                                                    r5.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageServiceInfoPhantomBlaze1511);
                                                    polarVoyageServiceInfoPhantomBlaze1511 = 0;
                                                }
                                                r5.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageGyroscopePulseAurora97292);
                                            }
                                        }
                                        polarVoyageGyroscopePulseAurora97292 = polarVoyageGyroscopePulseAurora97292.PolarVoyageCameraPixelBlaze2629;
                                        polarVoyageServiceInfoPhantomBlaze1511 = polarVoyageServiceInfoPhantomBlaze1511;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                polarVoyageServiceInfoPhantomBlaze1511 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageBarcodeScannerInfernoSolarSpark7767(r5);
                            }
                        }
                        if ((polarVoyageGyroscopePulseAurora9729.PolarVoyageBottomSheetOmegaNeo1907 & 256) == 0) {
                            break;
                        } else {
                            polarVoyageGyroscopePulseAurora9729 = polarVoyageGyroscopePulseAurora9729.PolarVoyageCameraPixelBlaze2629;
                        }
                    }
                }
            }
            polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageColorStateListEliteStrikeOlympian8131 = false;
            PolarVoyageDigitalInkRecognitionBetaDelta4802 PolarVoyageMotionLayoutForceEpicAurora7183 = polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageMotionLayoutForceEpicAurora7183();
            Object[] objArr = PolarVoyageMotionLayoutForceEpicAurora7183.PolarVoyageItemDecorationUltraDeltaEpic7485;
            int i2 = PolarVoyageMotionLayoutForceEpicAurora7183.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            for (int i3 = 0; i3 < i2; i3++) {
                PolarVoyageActivityInfoBetaQuantum8726((PolarVoyageConfigurationMegaTitaniumQuantum2348) objArr[i3]);
            }
        }
    }

    public void PolarVoyageAlarmManagerShadowHyperBeta8339(Bundle bundle) {
        PolarVoyageItemDecorationPixelCyber7641 polarVoyageItemDecorationPixelCyber7641 = (PolarVoyageItemDecorationPixelCyber7641) this.PolarVoyageStrictModeLegendEpic1532;
        Bundle PolarVoyageStrictModeLegendEpic1532 = PolarVoyageTransformNeoTitanium1654.PolarVoyageStrictModeLegendEpic1532((PolarVoyageRippleDrawableRogueBlazeBlaze8980[]) Arrays.copyOf(new PolarVoyageRippleDrawableRogueBlazeBlaze8980[0], 0));
        Bundle bundle2 = polarVoyageItemDecorationPixelCyber7641.PolarVoyageDiffUtilTurboStrike5735;
        if (bundle2 != null) {
            PolarVoyageStrictModeLegendEpic1532.putAll(bundle2);
        }
        synchronized (polarVoyageItemDecorationPixelCyber7641.PolarVoyageKotlinBetaPulseBeta3653) {
            for (Map.Entry entry : polarVoyageItemDecorationPixelCyber7641.PolarVoyageBarcodeScannerInfernoSolarSpark7767.entrySet()) {
                String str = (String) entry.getKey();
                Bundle PolarVoyageZipVortexCelestial6185 = ((PolarVoyageNotificationManagerTitaniumPulse7448) entry.getValue()).PolarVoyageZipVortexCelestial6185();
                str.getClass();
                PolarVoyageStrictModeLegendEpic1532.putBundle(str, PolarVoyageZipVortexCelestial6185);
            }
        }
        if (PolarVoyageStrictModeLegendEpic1532.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", PolarVoyageStrictModeLegendEpic1532);
    }

    @Override // p000createpolar.PolarVoyageAlphaAnimationHeroTitanium5808
    public PolarVoyageStateListAnimatorVortexSparkSpeed3559 PolarVoyageAlertDialogCyberHeroQuantum3938(PolarVoyageMotionEventDeltaNovaXShadow3329 polarVoyageMotionEventDeltaNovaXShadow3329, long j) {
        int PolarVoyageZipVortexCelestial6185;
        long position = polarVoyageMotionEventDeltaNovaXShadow3329.getPosition();
        int min = (int) Math.min(20000L, polarVoyageMotionEventDeltaNovaXShadow3329.PolarVoyageBarcodeScannerInfernoSolarSpark7767() - position);
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312 = (PolarVoyageTextRecognitionHeroOmega1312) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageToolbarEclipseInfernoHero6368(min);
        polarVoyageMotionEventDeltaNovaXShadow3329.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185, 0, min);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() >= 4) {
            if (PolarVoyageGraphPulsePhoenixCyber5342.PolarVoyageZipVortexCelestial6185(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185, polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068) != 442) {
                polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(1);
            } else {
                polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(4);
                long PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageFlingGestureSolarPrime1455.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageTextRecognitionHeroOmega1312);
                if (PolarVoyageKotlinBetaPulseBeta3653 != -9223372036854775807L) {
                    long PolarVoyageMotionLayoutTransitionHeroVision4068 = ((PolarVoyageSupervisorJobStrikeCelestialGamma8770) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageKotlinBetaPulseBeta3653);
                    if (PolarVoyageMotionLayoutTransitionHeroVision4068 > j) {
                        return j2 == -9223372036854775807L ? new PolarVoyageStateListAnimatorVortexSparkSpeed3559(-1, PolarVoyageMotionLayoutTransitionHeroVision4068, position) : new PolarVoyageStateListAnimatorVortexSparkSpeed3559(0, -9223372036854775807L, position + i2);
                    }
                    j2 = PolarVoyageMotionLayoutTransitionHeroVision4068;
                    long j3 = 100000 + j2;
                    i2 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    if (j3 > j) {
                        return new PolarVoyageStateListAnimatorVortexSparkSpeed3559(0, -9223372036854775807L, position + i2);
                    }
                }
                int i3 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageKotlinBetaPulseBeta3653;
                if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() >= 10) {
                    polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(9);
                    int PolarVoyagePackageManagerCelestialPhoenix8393 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyagePackageManagerCelestialPhoenix8393() & 7;
                    if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() >= PolarVoyagePackageManagerCelestialPhoenix8393) {
                        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(PolarVoyagePackageManagerCelestialPhoenix8393);
                        if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() >= 4) {
                            if (PolarVoyageGraphPulsePhoenixCyber5342.PolarVoyageZipVortexCelestial6185(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185, polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068) == 443) {
                                polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(4);
                                int PolarVoyageCardViewAlphaVortexCelestial9747 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747();
                                if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() < PolarVoyageCardViewAlphaVortexCelestial9747) {
                                    polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(i3);
                                } else {
                                    polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(PolarVoyageCardViewAlphaVortexCelestial9747);
                                }
                            }
                            while (true) {
                                if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() < 4 || (PolarVoyageZipVortexCelestial6185 = PolarVoyageGraphPulsePhoenixCyber5342.PolarVoyageZipVortexCelestial6185(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185, polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068)) == 442 || PolarVoyageZipVortexCelestial6185 == 441 || (PolarVoyageZipVortexCelestial6185 >>> 8) != 1) {
                                    break;
                                }
                                polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCanvasElitePhoenix4750(4);
                                if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() < 2) {
                                    polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(i3);
                                    break;
                                }
                                polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(Math.min(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068 + polarVoyageTextRecognitionHeroOmega1312.PolarVoyageCardViewAlphaVortexCelestial9747()));
                            }
                        } else {
                            polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(i3);
                        }
                    } else {
                        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(i3);
                    }
                } else {
                    polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(i3);
                }
                i = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068;
            }
        }
        return j2 != -9223372036854775807L ? new PolarVoyageStateListAnimatorVortexSparkSpeed3559(-2, j2, position + i) : PolarVoyageStateListAnimatorVortexSparkSpeed3559.PolarVoyageBitmapVisionAuroraPixel4705;
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageAnimatorSetSparkUltraMax8233(int i, long j) {
        ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).releaseOutputBuffer(i, j);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, PolarVoyageToastStormTitaniumUltra7487 polarVoyageToastStormTitaniumUltra7487, long j, int i2) {
        ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).queueSecureInputBuffer(i, 0, polarVoyageToastStormTitaniumUltra7487.PolarVoyageStrictModeLegendEpic1532, j, i2);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public int PolarVoyageBitmapMaxTitanTitan7960() {
        return ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).dequeueInputBuffer(0L);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageBitmapVisionAuroraPixel4705(int i, int i2, long j, int i3) {
        ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // p000createpolar.PolarVoyageClipboardManagerQuantumCelestialAlpha6291
    public List PolarVoyageBottomSheetOmegaNeo1907(Integer num) {
        List PolarVoyageBottomSheetOmegaNeo1907 = ((PolarVoyageClipboardManagerQuantumCelestialAlpha6291) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBottomSheetOmegaNeo1907(null);
        PolarVoyageFCMVisionPrime8878 polarVoyageFCMVisionPrime8878 = (PolarVoyageFCMVisionPrime8878) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i = polarVoyageFCMVisionPrime8878.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
        return i < 0 ? PolarVoyageBottomSheetOmegaNeo1907 : PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageProximitySensorStrikeNeo2764(PolarVoyageR8VisionOmegaNebula9943.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageFCMVisionPrime8878, num, i, Integer.valueOf(polarVoyageFCMVisionPrime8878.PolarVoyageDiffUtilDragonSpeedEclipse6225(i, polarVoyageFCMVisionPrime8878.PolarVoyageMotionLayoutTransitionHeroVision4068))), PolarVoyageBottomSheetOmegaNeo1907);
    }

    @Override // p000createpolar.PolarVoyageVideoCaptureLegendTitan7950
    public Object PolarVoyageCameraPixelBlaze2629(PolarVoyageHandlerOlympianPixel4283 polarVoyageHandlerOlympianPixel4283, Object obj) {
        return ((PolarVoyageObjectDetectionThunderHyperInferno3620) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageDiffUtilTurboStrike5735(polarVoyageHandlerOlympianPixel4283, obj);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageCameraViewSpectraMaxSpectra2824(ArrayList arrayList) {
        ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).unsubscribeFromVendorParameters(arrayList);
    }

    public void PolarVoyageCanvasElitePhoenix4750() {
        if (!((PolarVoyageItemDecorationPixelCyber7641) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageItemDecorationUltraDeltaEpic7485) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Can not perform this action after onSaveInstanceState");
            return;
        }
        PolarVoyageDebugForceAurora3372 polarVoyageDebugForceAurora3372 = (PolarVoyageDebugForceAurora3372) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (polarVoyageDebugForceAurora3372 == null) {
            polarVoyageDebugForceAurora3372 = new PolarVoyageDebugForceAurora3372(this);
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageDebugForceAurora3372;
        try {
            PolarVoyageFirebaseModelInterpreterCosmosStrikeMax3011.class.getDeclaredConstructor(null);
            PolarVoyageDebugForceAurora3372 polarVoyageDebugForceAurora33722 = (PolarVoyageDebugForceAurora3372) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (polarVoyageDebugForceAurora33722 != null) {
                polarVoyageDebugForceAurora33722.PolarVoyageZipVortexCelestial6185.add(PolarVoyageFirebaseModelInterpreterCosmosStrikeMax3011.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + PolarVoyageFirebaseModelInterpreterCosmosStrikeMax3011.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public void PolarVoyageCardViewAlphaVortexCelestial9747(PolarVoyageAnimatorAuroraCelestial2773 polarVoyageAnimatorAuroraCelestial2773) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", polarVoyageAnimatorAuroraCelestial2773.PolarVoyageZipVortexCelestial6185);
            jSONObject.put("Status", PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageLooperThreadAlphaPrime1279(polarVoyageAnimatorAuroraCelestial2773.PolarVoyageMotionLayoutTransitionHeroVision4068));
            jSONObject.put("AuthToken", polarVoyageAnimatorAuroraCelestial2773.PolarVoyageKotlinBetaPulseBeta3653);
            jSONObject.put("RefreshToken", polarVoyageAnimatorAuroraCelestial2773.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
            jSONObject.put("TokenCreationEpochInSecs", polarVoyageAnimatorAuroraCelestial2773.PolarVoyageDiffUtilTurboStrike5735);
            jSONObject.put("ExpiresInSecs", polarVoyageAnimatorAuroraCelestial2773.PolarVoyageBitmapVisionAuroraPixel4705);
            jSONObject.put("FisError", polarVoyageAnimatorAuroraCelestial2773.PolarVoyageTextInputEditTextNebulaHero6651);
            PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598 = (PolarVoyageRewardedAdEliteNova2598) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(Constants.ENCODING));
            fileOutputStream.close();
            if (createTempFile.renameTo(PolarVoyageDiffUtilDragonSpeedEclipse6225())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void PolarVoyageConfigurationMaxSpectraForce5418(String str, PolarVoyageNotificationManagerTitaniumPulse7448 polarVoyageNotificationManagerTitaniumPulse7448) {
        polarVoyageNotificationManagerTitaniumPulse7448.getClass();
        PolarVoyageItemDecorationPixelCyber7641 polarVoyageItemDecorationPixelCyber7641 = (PolarVoyageItemDecorationPixelCyber7641) this.PolarVoyageStrictModeLegendEpic1532;
        synchronized (polarVoyageItemDecorationPixelCyber7641.PolarVoyageKotlinBetaPulseBeta3653) {
            if (polarVoyageItemDecorationPixelCyber7641.PolarVoyageBarcodeScannerInfernoSolarSpark7767.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            polarVoyageItemDecorationPixelCyber7641.PolarVoyageBarcodeScannerInfernoSolarSpark7767.put(str, polarVoyageNotificationManagerTitaniumPulse7448);
        }
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageContentProviderHyperSpark3838(Surface surface) {
        ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).setOutputSurface(surface);
    }

    public File PolarVoyageDiffUtilDragonSpeedEclipse6225() {
        if (((File) this.PolarVoyageStrictModeLegendEpic1532) == null) {
            synchronized (this) {
                try {
                    if (((File) this.PolarVoyageStrictModeLegendEpic1532) == null) {
                        PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598 = (PolarVoyageRewardedAdEliteNova2598) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                        polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
                        this.PolarVoyageStrictModeLegendEpic1532 = new File(polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185.getFilesDir(), "PersistedInstallation." + ((PolarVoyageRewardedAdEliteNova2598) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageKotlinBetaPulseBeta3653() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public int PolarVoyageDiffUtilTurboStrike5735(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageDisplayMetricsVortexDragon9516(ArrayList arrayList) {
        ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).subscribeToVendorParameters(arrayList);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageDrawableDeltaHyperion5742() {
        ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).detachOutputSurface();
    }

    public PolarVoyageNotificationManagerTitaniumPulse7448 PolarVoyageFCMCelestialCosmosPixel3711() {
        PolarVoyageNotificationManagerTitaniumPulse7448 polarVoyageNotificationManagerTitaniumPulse7448;
        PolarVoyageItemDecorationPixelCyber7641 polarVoyageItemDecorationPixelCyber7641 = (PolarVoyageItemDecorationPixelCyber7641) this.PolarVoyageStrictModeLegendEpic1532;
        synchronized (polarVoyageItemDecorationPixelCyber7641.PolarVoyageKotlinBetaPulseBeta3653) {
            Iterator it = polarVoyageItemDecorationPixelCyber7641.PolarVoyageBarcodeScannerInfernoSolarSpark7767.entrySet().iterator();
            do {
                polarVoyageNotificationManagerTitaniumPulse7448 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                PolarVoyageNotificationManagerTitaniumPulse7448 polarVoyageNotificationManagerTitaniumPulse74482 = (PolarVoyageNotificationManagerTitaniumPulse7448) entry.getValue();
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    polarVoyageNotificationManagerTitaniumPulse7448 = polarVoyageNotificationManagerTitaniumPulse74482;
                }
            } while (polarVoyageNotificationManagerTitaniumPulse7448 == null);
        }
        return polarVoyageNotificationManagerTitaniumPulse7448;
    }

    public Object PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(Object obj, Object obj2) {
        JSONObject jSONObject;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 10:
                String str = (String) obj;
                JSONObject jSONObject2 = (JSONObject) obj2;
                str.getClass();
                jSONObject2.getClass();
                return (PolarVoyageDebugTitaniumInferno5712.PolarVoyageDiffUtilDragonSpeedEclipse6225(str) || (jSONObject = (JSONObject) ((PolarVoyageToolbarHeroSpeed2535) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185(str)) == null) ? jSONObject2 : (JSONObject) ((PolarVoyageResourcesCelestialInferno9280) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(jSONObject, jSONObject2);
            default:
                JSONObject jSONObject3 = (JSONObject) obj;
                JSONObject jSONObject4 = (JSONObject) obj2;
                jSONObject3.getClass();
                jSONObject4.getClass();
                return (JSONObject) ((PolarVoyageAdapterTitanSpark4027) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageAlertDialogCyberHeroQuantum3938(new PolarVoyageNotificationHyperionVision4932((PolarVoyageTransitionListenerCelestialElite5453) ((PolarVoyageAdapterTitanSpark4027) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185(jSONObject3)), jSONObject4);
        }
    }

    public Object PolarVoyageFlingGestureEclipsePrimeMax1376(Object obj) {
        Object polarVoyageTraceThunderMaster6506;
        Object polarVoyageTraceThunderMaster65062;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                PolarVoyageFirebaseSpectraMegaTurbo5813 polarVoyageFirebaseSpectraMegaTurbo5813 = (PolarVoyageFirebaseSpectraMegaTurbo5813) obj;
                polarVoyageFirebaseSpectraMegaTurbo5813.getClass();
                try {
                    polarVoyageTraceThunderMaster6506 = (PolarVoyageActionBarHyperionSpectra5124) ((PolarVoyageResourcesCelestialInferno9280) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageFlingGestureEclipsePrimeMax1376((PolarVoyageFCMEpicTitan6482) ((PolarVoyageDrawableCosmosEclipseMax6944) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageContentProviderHyperSpark3838(polarVoyageFirebaseSpectraMegaTurbo5813));
                } catch (Throwable th) {
                    polarVoyageTraceThunderMaster6506 = new PolarVoyageTraceThunderMaster6506(th);
                }
                Object obj2 = PolarVoyageActionBarHyperionSpectra5124.PolarVoyageZipVortexCelestial6185;
                if (polarVoyageTraceThunderMaster6506 instanceof PolarVoyageTraceThunderMaster6506) {
                    polarVoyageTraceThunderMaster6506 = obj2;
                }
                return (PolarVoyageActionBarHyperionSpectra5124) polarVoyageTraceThunderMaster6506;
            default:
                PolarVoyageFCMEpicTitan6482 polarVoyageFCMEpicTitan6482 = (PolarVoyageFCMEpicTitan6482) obj;
                polarVoyageFCMEpicTitan6482.getClass();
                try {
                    ((PolarVoyageSQLiteMegaCyber1273) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageZipVortexCelestial6185 = ((PolarVoyageGyroscopeForceSpectra2266) ((PolarVoyageAdapterTitanSpark4027) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageMotionLayoutForceEpicAurora7183()).PolarVoyageZipVortexCelestial6185(polarVoyageFCMEpicTitan6482.PolarVoyageZipVortexCelestial6185, (PolarVoyageHandlerThreadFusionForce1494) polarVoyageFCMEpicTitan6482.PolarVoyageMotionLayoutTransitionHeroVision4068);
                    polarVoyageTraceThunderMaster65062 = PolarVoyageActionBarHyperionSpectra5124.PolarVoyageMotionLayoutTransitionHeroVision4068;
                } catch (Throwable th2) {
                    polarVoyageTraceThunderMaster65062 = new PolarVoyageTraceThunderMaster6506(th2);
                }
                Object obj3 = PolarVoyageActionBarHyperionSpectra5124.PolarVoyageZipVortexCelestial6185;
                if (polarVoyageTraceThunderMaster65062 instanceof PolarVoyageTraceThunderMaster6506) {
                    polarVoyageTraceThunderMaster65062 = obj3;
                }
                return (PolarVoyageActionBarHyperionSpectra5124) polarVoyageTraceThunderMaster65062;
        }
    }

    public PolarVoyageAnimatorAuroraCelestial2773 PolarVoyageGuidelineStormSolar2850() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(PolarVoyageDiffUtilDragonSpeedEclipse6225());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageActivityInfoBetaQuantum8726(5)[optInt];
        if (i == 0) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageItemDecorationUltraDeltaEpic7485("Null registrationStatus");
            return null;
        }
        String str = i == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new PolarVoyageAnimatorAuroraCelestial2773(optString, i, optString2, optString3, optLong2, optLong, optString4);
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Missing required properties:".concat(str));
        return null;
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageKotlinBetaPulseBeta3653(Bundle bundle) {
        ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).setParameters(bundle);
    }

    @Override // p000createpolar.PolarVoyageAlphaAnimationHeroTitanium5808
    public void PolarVoyageLayerDrawableShadowTitaniumOmega1942() {
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312 = (PolarVoyageTextRecognitionHeroOmega1312) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        byte[] bArr = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutTransitionHeroVision4068;
        polarVoyageTextRecognitionHeroOmega1312.getClass();
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageAlarmManagerShadowHyperBeta8339(bArr, bArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory PolarVoyageLifecycleOlympianOmega3762(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) == null) {
            Context context = (Context) this.PolarVoyageStrictModeLegendEpic1532;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = map;
        }
        String str4 = (String) ((Map) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    public Bundle PolarVoyageLooperThreadAlphaPrime1279(String str) {
        Bundle bundle;
        PolarVoyageItemDecorationPixelCyber7641 polarVoyageItemDecorationPixelCyber7641 = (PolarVoyageItemDecorationPixelCyber7641) this.PolarVoyageStrictModeLegendEpic1532;
        if (!polarVoyageItemDecorationPixelCyber7641.PolarVoyageTextInputEditTextNebulaHero6651) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = polarVoyageItemDecorationPixelCyber7641.PolarVoyageDiffUtilTurboStrike5735;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageBottomSheetOmegaNeo1907(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            polarVoyageItemDecorationPixelCyber7641.PolarVoyageDiffUtilTurboStrike5735 = null;
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        if (r11 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dc, code lost:
    
        r9 = r3;
        r16 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0107, code lost:
    
        if (r13 == null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r15v23 */
    @Override // p000createpolar.PolarVoyageTabLayoutNeoNeo7623
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void PolarVoyageMotionLayoutForceEpicAurora7183(PolarVoyageItemDecorationOlympianMax4846 polarVoyageItemDecorationOlympianMax4846, PolarVoyageResourcesBlazeDragon3291 polarVoyageResourcesBlazeDragon3291) {
        PolarVoyageRoomDaoRogueGamma6879 PolarVoyageTextInputEditTextNebulaHero6651;
        PolarVoyageViewEliteBeta6786 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int intValue;
        int i;
        int i2;
        int i3;
        String str;
        int i4 = 0;
        try {
            PolarVoyageFocusMeteringActionAuroraFusionSpeed7565 PolarVoyageZipVortexCelestial6185 = ((PolarVoyageCountDownTimerMegaLegendTurbo5868) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185(polarVoyageResourcesBlazeDragon3291);
            PolarVoyageCoroutineScopeDeltaInferno4802 polarVoyageCoroutineScopeDeltaInferno4802 = polarVoyageResourcesBlazeDragon3291.PolarVoyageCameraPixelBlaze2629;
            int size = polarVoyageCoroutineScopeDeltaInferno4802.size();
            int i5 = 0;
            boolean z = 0;
            boolean z2 = 0;
            boolean z3 = 0;
            boolean z4 = 0;
            Integer num = null;
            Integer num2 = null;
            while (i5 < size) {
                int i6 = 1;
                if (polarVoyageCoroutineScopeDeltaInferno4802.PolarVoyageMotionLayoutTransitionHeroVision4068(i5).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                    String PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageCoroutineScopeDeltaInferno4802.PolarVoyageBitmapVisionAuroraPixel4705(i5);
                    int i7 = i4;
                    z = z;
                    z2 = z2;
                    z3 = z3;
                    z4 = z4;
                    while (i7 < PolarVoyageBitmapVisionAuroraPixel4705.length()) {
                        PolarVoyageCoroutineScopeDeltaInferno4802 polarVoyageCoroutineScopeDeltaInferno48022 = polarVoyageCoroutineScopeDeltaInferno4802;
                        int PolarVoyageBarcodeScannerInfernoSolarSpark77672 = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageBitmapVisionAuroraPixel4705, ',', i7, i4, 4);
                        int PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBitmapVisionAuroraPixel4705, ';', i7, PolarVoyageBarcodeScannerInfernoSolarSpark77672);
                        int PolarVoyageTextInputEditTextNebulaHero66512 = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBitmapVisionAuroraPixel4705, i7, PolarVoyageKotlinBetaPulseBeta3653);
                        String substring = PolarVoyageBitmapVisionAuroraPixel4705.substring(PolarVoyageTextInputEditTextNebulaHero66512, PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBitmapVisionAuroraPixel4705, PolarVoyageTextInputEditTextNebulaHero66512, PolarVoyageKotlinBetaPulseBeta3653));
                        i7 = PolarVoyageKotlinBetaPulseBeta3653 + 1;
                        int i8 = z4;
                        if (substring.equalsIgnoreCase("permessage-deflate")) {
                            if (z != 0) {
                                i8 = i6;
                            }
                            while (i7 < PolarVoyageBarcodeScannerInfernoSolarSpark77672) {
                                int PolarVoyageKotlinBetaPulseBeta36532 = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBitmapVisionAuroraPixel4705, ';', i7, PolarVoyageBarcodeScannerInfernoSolarSpark77672);
                                int PolarVoyageKotlinBetaPulseBeta36533 = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBitmapVisionAuroraPixel4705, '=', i7, PolarVoyageKotlinBetaPulseBeta36532);
                                int PolarVoyageTextInputEditTextNebulaHero66513 = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBitmapVisionAuroraPixel4705, i7, PolarVoyageKotlinBetaPulseBeta36533);
                                String substring2 = PolarVoyageBitmapVisionAuroraPixel4705.substring(PolarVoyageTextInputEditTextNebulaHero66513, PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBitmapVisionAuroraPixel4705, PolarVoyageTextInputEditTextNebulaHero66513, PolarVoyageKotlinBetaPulseBeta36533));
                                if (PolarVoyageKotlinBetaPulseBeta36533 < PolarVoyageKotlinBetaPulseBeta36532) {
                                    int PolarVoyageTextInputEditTextNebulaHero66514 = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageBitmapVisionAuroraPixel4705, PolarVoyageKotlinBetaPulseBeta36533 + 1, PolarVoyageKotlinBetaPulseBeta36532);
                                    str = PolarVoyageBitmapVisionAuroraPixel4705.substring(PolarVoyageTextInputEditTextNebulaHero66514, PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBitmapVisionAuroraPixel4705, PolarVoyageTextInputEditTextNebulaHero66514, PolarVoyageKotlinBetaPulseBeta36532));
                                    i = PolarVoyageBarcodeScannerInfernoSolarSpark77672;
                                    i2 = PolarVoyageKotlinBetaPulseBeta36532;
                                    if (str.length() >= 2 && PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str, "\"", false) && PolarVoyageDebugTitaniumInferno5712.PolarVoyageCameraViewSpectraMaxSpectra2824(str, "\"")) {
                                        i3 = i6;
                                        str = str.substring(i3, str.length() - 1);
                                    } else {
                                        i3 = i6;
                                    }
                                } else {
                                    i = PolarVoyageBarcodeScannerInfernoSolarSpark77672;
                                    i2 = PolarVoyageKotlinBetaPulseBeta36532;
                                    i3 = i6;
                                    str = null;
                                }
                                int i9 = i2 + 1;
                                i8 = i8;
                                if (substring2.equalsIgnoreCase("client_max_window_bits")) {
                                    if (num != null) {
                                        i8 = i3;
                                    }
                                    num = str != null ? PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageLayerDrawableShadowTitaniumOmega1942(str) : null;
                                } else {
                                    i8 = i8;
                                    if (substring2.equalsIgnoreCase("client_no_context_takeover")) {
                                        if (z2 != 0) {
                                            i8 = i3;
                                        }
                                        if (str != null) {
                                            i8 = i3;
                                        }
                                        i7 = i9;
                                        z2 = i3;
                                        i6 = z2 ? 1 : 0;
                                    } else {
                                        i8 = i8;
                                        if (substring2.equalsIgnoreCase("server_max_window_bits")) {
                                            if (num2 != null) {
                                                i8 = i3;
                                            }
                                            num2 = str != null ? PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageLayerDrawableShadowTitaniumOmega1942(str) : null;
                                        } else {
                                            i8 = i8;
                                            if (substring2.equalsIgnoreCase("server_no_context_takeover")) {
                                                if (z3 != 0) {
                                                    i8 = i3;
                                                }
                                                if (str != null) {
                                                    i8 = i3;
                                                }
                                                i7 = i9;
                                                z3 = i3;
                                                i6 = z3 ? 1 : 0;
                                            }
                                        }
                                        i7 = i9;
                                        i8 = i3;
                                        i6 = i8 == true ? 1 : 0;
                                    }
                                }
                                PolarVoyageBarcodeScannerInfernoSolarSpark77672 = i;
                            }
                            z = i6;
                            i6 = z ? 1 : 0;
                        } else {
                            i8 = i6;
                            i6 = i8 == true ? 1 : 0;
                        }
                        polarVoyageCoroutineScopeDeltaInferno4802 = polarVoyageCoroutineScopeDeltaInferno48022;
                        i4 = 0;
                        z = z;
                        z2 = z2;
                        z3 = z3;
                        z4 = i8;
                    }
                }
                i5++;
                polarVoyageCoroutineScopeDeltaInferno4802 = polarVoyageCoroutineScopeDeltaInferno4802;
                i4 = 0;
                z = z;
                z2 = z2;
                z3 = z3;
                z4 = z4;
            }
            int i10 = 1;
            ((PolarVoyageCountDownTimerMegaLegendTurbo5868) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageViewModelCyberFusion4118(z, num, z2, num2, z3, z4);
            if (z4 != 0 || num != null || (num2 != null && (8 > (intValue = num2.intValue()) || intValue >= 16))) {
                PolarVoyageCountDownTimerMegaLegendTurbo5868 polarVoyageCountDownTimerMegaLegendTurbo5868 = (PolarVoyageCountDownTimerMegaLegendTurbo5868) this.PolarVoyageStrictModeLegendEpic1532;
                synchronized (polarVoyageCountDownTimerMegaLegendTurbo5868) {
                    polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageContentProviderHyperSpark3838.clear();
                    polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageMotionLayoutTransitionHeroVision4068("unexpected Sec-WebSocket-Extensions in response header", 1010);
                }
            }
            String str2 = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageMotionLayoutTransitionHeroVision4068 + " WebSocket " + ((PolarVoyageLinearLayoutMaxForce8672) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageZipVortexCelestial6185.PolarVoyageDiffUtilTurboStrike5735();
            PolarVoyageCountDownTimerMegaLegendTurbo5868 polarVoyageCountDownTimerMegaLegendTurbo58682 = (PolarVoyageCountDownTimerMegaLegendTurbo5868) this.PolarVoyageStrictModeLegendEpic1532;
            PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493 = new PolarVoyageAlarmManagerAlphaInferno3493(PolarVoyageZipVortexCelestial6185);
            PolarVoyageViewModelCyberFusion4118 polarVoyageViewModelCyberFusion4118 = polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            polarVoyageViewModelCyberFusion4118.getClass();
            synchronized (polarVoyageCountDownTimerMegaLegendTurbo58682) {
                try {
                    polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageCameraPixelBlaze2629 = str2;
                    polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageAlarmManagerAlphaInferno3493;
                    polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageNotificationForcePulse9896((PolarVoyageFragmentTurboMax6129) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageBottomSheetOmegaNeo1907, polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageViewModelCyberFusion4118.PolarVoyageZipVortexCelestial6185, polarVoyageViewModelCyberFusion4118.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageBitmapVisionAuroraPixel4705);
                    polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageGraphMaxSpectra7752(polarVoyageCountDownTimerMegaLegendTurbo58682);
                    long j = polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageKotlinBetaPulseBeta3653;
                    if (j != 0) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                        PolarVoyageDrawerLayoutTurboStrikeTitanium4854 polarVoyageDrawerLayoutTurboStrikeTitanium4854 = polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageViewRogueMaster4778;
                        String concat = str2.concat(" ping");
                        PolarVoyageServiceSpectraDelta5404 polarVoyageServiceSpectraDelta5404 = new PolarVoyageServiceSpectraDelta5404(polarVoyageCountDownTimerMegaLegendTurbo58682, nanos, i10);
                        polarVoyageDrawerLayoutTurboStrikeTitanium4854.getClass();
                        polarVoyageDrawerLayoutTurboStrikeTitanium4854.PolarVoyageKotlinBetaPulseBeta3653(new PolarVoyageAuthHyperNovaXAlpha4860(concat, polarVoyageServiceSpectraDelta5404), nanos);
                    }
                    if (!polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageContentProviderHyperSpark3838.isEmpty()) {
                        polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageBitmapVisionAuroraPixel4705();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageFragmentTransactionAlphaNova6660((PolarVoyageEventLegendDragon2659) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageCountDownTimerMegaLegendTurbo58682, polarVoyageViewModelCyberFusion4118.PolarVoyageZipVortexCelestial6185, polarVoyageViewModelCyberFusion4118.PolarVoyageBitmapVisionAuroraPixel4705);
            PolarVoyageCountDownTimerMegaLegendTurbo5868 polarVoyageCountDownTimerMegaLegendTurbo58683 = (PolarVoyageCountDownTimerMegaLegendTurbo5868) this.PolarVoyageStrictModeLegendEpic1532;
            try {
                polarVoyageCountDownTimerMegaLegendTurbo58683.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185(polarVoyageCountDownTimerMegaLegendTurbo58683, polarVoyageResourcesBlazeDragon3291);
                while (polarVoyageCountDownTimerMegaLegendTurbo58683.PolarVoyageAnimatorSetSparkUltraMax8233 == -1) {
                    PolarVoyageFragmentTransactionAlphaNova6660 polarVoyageFragmentTransactionAlphaNova6660 = polarVoyageCountDownTimerMegaLegendTurbo58683.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    polarVoyageFragmentTransactionAlphaNova6660.getClass();
                    polarVoyageFragmentTransactionAlphaNova6660.PolarVoyageMotionLayoutTransitionHeroVision4068();
                }
            } catch (Exception e) {
                PolarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageCountDownTimerMegaLegendTurbo58683, e, false, 6);
            } finally {
                polarVoyageCountDownTimerMegaLegendTurbo58683.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
            }
        } catch (IOException e2) {
            PolarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageKotlinBetaPulseBeta3653((PolarVoyageCountDownTimerMegaLegendTurbo5868) this.PolarVoyageStrictModeLegendEpic1532, e2, false, 4);
            PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185(polarVoyageResourcesBlazeDragon3291);
            PolarVoyageFocusMeteringActionAuroraFusionSpeed7565 polarVoyageFocusMeteringActionAuroraFusionSpeed7565 = polarVoyageResourcesBlazeDragon3291.PolarVoyageSnackbarGammaEclipse2140;
            if (polarVoyageFocusMeteringActionAuroraFusionSpeed7565 != null && (PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageFocusMeteringActionAuroraFusionSpeed7565.PolarVoyageBarcodeScannerInfernoSolarSpark7767()) != null) {
                PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
            }
            PolarVoyageFocusMeteringActionAuroraFusionSpeed7565 polarVoyageFocusMeteringActionAuroraFusionSpeed75652 = polarVoyageResourcesBlazeDragon3291.PolarVoyageSnackbarGammaEclipse2140;
            if (polarVoyageFocusMeteringActionAuroraFusionSpeed75652 == null || (PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageFocusMeteringActionAuroraFusionSpeed75652.PolarVoyageTextInputEditTextNebulaHero6651()) == null) {
                return;
            }
            PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185(PolarVoyageTextInputEditTextNebulaHero6651);
        }
    }

    @Override // p000createpolar.PolarVoyageTabLayoutNeoNeo7623
    public void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageItemDecorationOlympianMax4846 polarVoyageItemDecorationOlympianMax4846, IOException iOException) {
        PolarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageKotlinBetaPulseBeta3653((PolarVoyageCountDownTimerMegaLegendTurbo5868) this.PolarVoyageStrictModeLegendEpic1532, iOException, false, 6);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public ByteBuffer PolarVoyageNavigationViewHyperHyperHyperion1793(int i) {
        return ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).getOutputBuffer(i);
    }

    public void PolarVoyagePackageManagerCelestialPhoenix8393(Object obj, String str) {
        ((ArrayList) this.PolarVoyageStrictModeLegendEpic1532).add(str + "=" + String.valueOf(obj));
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageRemoteModelManagerOlympianCelestial9141(PolarVoyagePreviewDragonShadowForce2497 polarVoyagePreviewDragonShadowForce2497, Handler handler) {
        ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).setOnFrameRenderedListener(new PolarVoyageLintPhoenixSolar8919(this, polarVoyagePreviewDragonShadowForce2497, 1), handler);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public ByteBuffer PolarVoyageSnackbarGammaEclipse2140(int i) {
        return ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).getInputBuffer(i);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageStrictModeLegendEpic1532(int i) {
        ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).setVideoScalingMode(i);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageTextInputEditTextNebulaHero6651(int i) {
        ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).releaseOutputBuffer(i, false);
    }

    public void PolarVoyageToolbarEclipseInfernoHero6368(Bundle bundle) {
        PolarVoyageItemDecorationPixelCyber7641 polarVoyageItemDecorationPixelCyber7641 = (PolarVoyageItemDecorationPixelCyber7641) this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageGradientDrawableBetaHero7445 polarVoyageGradientDrawableBetaHero7445 = polarVoyageItemDecorationPixelCyber7641.PolarVoyageZipVortexCelestial6185;
        if (!polarVoyageItemDecorationPixelCyber7641.PolarVoyageBitmapVisionAuroraPixel4705) {
            polarVoyageItemDecorationPixelCyber7641.PolarVoyageZipVortexCelestial6185();
        }
        if (polarVoyageGradientDrawableBetaHero7445.PolarVoyageTextInputEditTextNebulaHero6651().PolarVoyageBarcodeScannerInfernoSolarSpark7767.compareTo(PolarVoyageNotificationManagerBetaTitaniumCelestial6531.PolarVoyageBottomSheetOmegaNeo1907) >= 0) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageGradientDrawableBetaHero7445.PolarVoyageTextInputEditTextNebulaHero6651().PolarVoyageBarcodeScannerInfernoSolarSpark7767, "performRestore cannot be called when owner is ");
            return;
        }
        if (polarVoyageItemDecorationPixelCyber7641.PolarVoyageTextInputEditTextNebulaHero6651) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageBottomSheetOmegaNeo1907("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        polarVoyageItemDecorationPixelCyber7641.PolarVoyageDiffUtilTurboStrike5735 = bundle2;
        polarVoyageItemDecorationPixelCyber7641.PolarVoyageTextInputEditTextNebulaHero6651 = true;
    }

    public String PolarVoyageViewBindingPulseHeroSpeed5705(String str) {
        String str2 = (String) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Resources resources = (Resources) this.PolarVoyageStrictModeLegendEpic1532;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public MediaFormat PolarVoyageViewRogueMaster4778() {
        return ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).getOutputFormat();
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void PolarVoyageZipVortexCelestial6185() {
        PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493 = (PolarVoyageAlarmManagerAlphaInferno3493) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        MediaCodec mediaCodec = (MediaCodec) this.PolarVoyageStrictModeLegendEpic1532;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && polarVoyageAlarmManagerAlphaInferno3493 != null) {
                polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageLayerDrawableShadowTitaniumOmega1942(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && polarVoyageAlarmManagerAlphaInferno3493 != null) {
                polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageLayerDrawableShadowTitaniumOmega1942(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // p000createpolar.PolarVoyageAdMobForceVortexBeta7549
    public void flush() {
        ((MediaCodec) this.PolarVoyageStrictModeLegendEpic1532).flush();
    }

    @Override // p000createpolar.PolarVoyageDebugCelestialNebula7743
    public Object get() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 2:
                return new PolarVoyageLintMegaMaxRogue5881((Context) ((PolarVoyageDigitalInkRecognitionBetaShadowNebula9385) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageItemDecorationUltraDeltaEpic7485, (PolarVoyageAlarmManagerAlphaInferno3493) ((PolarVoyageRealtimeDatabaseEclipseUltra8894) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).get());
            default:
                PolarVoyageConstraintLayoutVisionMasterDragon8646 polarVoyageConstraintLayoutVisionMasterDragon8646 = new PolarVoyageConstraintLayoutVisionMasterDragon8646(10);
                PolarVoyageDrawableTitanNovaBlaze5744 polarVoyageDrawableTitanNovaBlaze5744 = new PolarVoyageDrawableTitanNovaBlaze5744();
                Object obj = ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageStrictModeLegendEpic1532).get();
                PolarVoyageDebugCelestialNebula7743 polarVoyageDebugCelestialNebula7743 = (PolarVoyageDebugCelestialNebula7743) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                return new PolarVoyageExoPlayerNeoDelta8060(polarVoyageConstraintLayoutVisionMasterDragon8646, polarVoyageDrawableTitanNovaBlaze5744, PolarVoyageCameraViewHyperPhantom1342.PolarVoyageDiffUtilTurboStrike5735, (PolarVoyageStateListAnimatorGammaEpicEpic8366) obj, polarVoyageDebugCelestialNebula7743);
        }
    }

    public String toString() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.PolarVoyageRotateAnimationCyberCelestialDelta4768.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.PolarVoyageStrictModeLegendEpic1532;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ PolarVoyageResourcesCelestialInferno9280(int i, boolean z) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
    }

    public /* synthetic */ PolarVoyageResourcesCelestialInferno9280(Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 6;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj;
        this.PolarVoyageStrictModeLegendEpic1532 = new ArrayList();
    }

    public PolarVoyageResourcesCelestialInferno9280(byte[] bArr, byte[] bArr2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 15;
        bArr.getClass();
        bArr2.getClass();
        this.PolarVoyageStrictModeLegendEpic1532 = bArr;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = bArr2;
    }

    public PolarVoyageResourcesCelestialInferno9280(PolarVoyageAuthHyperEpicAurora4873 polarVoyageAuthHyperEpicAurora4873, PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon8768) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 26;
        polarVoyageFragmentPulseEliteDragon8768.getClass();
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageAuthHyperEpicAurora4873;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageFragmentPulseEliteDragon8768;
    }

    public PolarVoyageResourcesCelestialInferno9280(PolarVoyageRealtimeDatabaseShadowPhantomHyperion1256 polarVoyageRealtimeDatabaseShadowPhantomHyperion1256, PolarVoyageAccelerometerAuroraTitanSpeed7821 polarVoyageAccelerometerAuroraTitanSpeed7821) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 22;
        polarVoyageRealtimeDatabaseShadowPhantomHyperion1256.getClass();
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageRealtimeDatabaseShadowPhantomHyperion1256;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAccelerometerAuroraTitanSpeed7821;
    }

    public PolarVoyageResourcesCelestialInferno9280(PolarVoyagePagingSourceEpicSolarStorm3628 polarVoyagePagingSourceEpicSolarStorm3628, PolarVoyageToolbarHeroSpeed2535 polarVoyageToolbarHeroSpeed2535, PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 10;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageToolbarHeroSpeed2535;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageResourcesCelestialInferno9280;
    }

    public PolarVoyageResourcesCelestialInferno9280(PolarVoyageItemDecorationPixelCyber7641 polarVoyageItemDecorationPixelCyber7641, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        switch (i) {
            case 20:
                this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageItemDecorationPixelCyber7641;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageResourcesCelestialInferno9280(polarVoyageItemDecorationPixelCyber7641, 19);
                break;
            default:
                this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageItemDecorationPixelCyber7641;
                break;
        }
    }

    public PolarVoyageResourcesCelestialInferno9280(ExecutorService executorService) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 17;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageContentObserverThunderOmega9101(0);
        this.PolarVoyageStrictModeLegendEpic1532 = executorService;
    }

    public PolarVoyageResourcesCelestialInferno9280(PolarVoyageSupervisorJobStrikeCelestialGamma8770 polarVoyageSupervisorJobStrikeCelestialGamma8770) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 14;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageSupervisorJobStrikeCelestialGamma8770;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageTextRecognitionHeroOmega1312();
    }

    public PolarVoyageResourcesCelestialInferno9280(PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 12;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageRewardedAdEliteNova2598;
    }

    public PolarVoyageResourcesCelestialInferno9280(Context context, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        switch (i) {
            case 28:
                PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(context);
                Resources resources = context.getResources();
                this.PolarVoyageStrictModeLegendEpic1532 = resources;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
                this.PolarVoyageStrictModeLegendEpic1532 = context;
                break;
        }
    }

    public PolarVoyageResourcesCelestialInferno9280(MediaCodec mediaCodec, PolarVoyageAlarmManagerAlphaInferno3493 polarVoyageAlarmManagerAlphaInferno3493) {
        boolean addMediaCodec;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 29;
        this.PolarVoyageStrictModeLegendEpic1532 = mediaCodec;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAlarmManagerAlphaInferno3493;
        if (Build.VERSION.SDK_INT < 35 || polarVoyageAlarmManagerAlphaInferno3493 == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageBottomSheetOmegaNeo1907;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(((HashSet) polarVoyageAlarmManagerAlphaInferno3493.PolarVoyageRotateAnimationCyberCelestialDelta4768).add(mediaCodec));
    }

    public /* synthetic */ PolarVoyageResourcesCelestialInferno9280(int i, Object obj, Object obj2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj2;
    }
}
