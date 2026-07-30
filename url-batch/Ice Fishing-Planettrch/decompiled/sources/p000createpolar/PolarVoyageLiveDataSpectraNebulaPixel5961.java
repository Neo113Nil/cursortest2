package p000createpolar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageLiveDataSpectraNebulaPixel5961 {
    public PolarVoyageLiveDataSpectraNebulaPixel5961() {
        new ConcurrentHashMap();
    }

    public static void PolarVoyageAnimatorSetSparkUltraMax8233(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void PolarVoyageBottomSheetOmegaNeo1907(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            PolarVoyageObjectDetectionCosmosDragonNebula8799.PolarVoyageDiffUtilTurboStrike5735(window, z);
        } else {
            if (i >= 30) {
                PolarVoyageObjectDetectionCosmosDragonNebula8799.PolarVoyageBitmapVisionAuroraPixel4705(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void PolarVoyageCameraPixelBlaze2629(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }

    public static void PolarVoyageContentProviderHyperSpark3838(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }

    public static void PolarVoyageDrawableDeltaHyperion5742(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, i);
        parcel.writeString(str);
        PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }

    public static final boolean PolarVoyageItemDecorationUltraDeltaEpic7485(long j, long j2) {
        return j == j2;
    }

    public static final int PolarVoyageKotlinBetaPulseBeta3653(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final long PolarVoyageMotionLayoutTransitionHeroVision4068(int i, int i2) {
        if (i < 0 || i2 < 0) {
            PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageZipVortexCelestial6185("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = PolarVoyageAlphaAnimationThunderStrikeHyperion3499.PolarVoyageKotlinBetaPulseBeta3653;
        return j;
    }

    public static void PolarVoyageNavigationViewHyperHyperHyperion1793(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static int PolarVoyageRemoteModelManagerOlympianCelestial9141(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static String PolarVoyageRotateAnimationCyberCelestialDelta4768(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void PolarVoyageSnackbarGammaEclipse2140(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }

    public static PolarVoyageProcessCameraProviderDragonEpicCosmos5977 PolarVoyageStrictModeLegendEpic1532(PolarVoyageProcessCameraProviderDragonEpicCosmos5977[] polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr) {
        PolarVoyageProcessCameraProviderDragonEpicCosmos5977 polarVoyageProcessCameraProviderDragonEpicCosmos5977 = null;
        int i = Integer.MAX_VALUE;
        for (PolarVoyageProcessCameraProviderDragonEpicCosmos5977 polarVoyageProcessCameraProviderDragonEpicCosmos59772 : polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr) {
            int abs = (Math.abs(polarVoyageProcessCameraProviderDragonEpicCosmos59772.PolarVoyageKotlinBetaPulseBeta3653 - 400) * 2) + (polarVoyageProcessCameraProviderDragonEpicCosmos59772.PolarVoyageBarcodeScannerInfernoSolarSpark7767 ? 1 : 0);
            if (polarVoyageProcessCameraProviderDragonEpicCosmos5977 == null || i > abs) {
                polarVoyageProcessCameraProviderDragonEpicCosmos5977 = polarVoyageProcessCameraProviderDragonEpicCosmos59772;
                i = abs;
            }
        }
        return polarVoyageProcessCameraProviderDragonEpicCosmos5977;
    }

    public static void PolarVoyageViewRogueMaster4778(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int PolarVoyageRemoteModelManagerOlympianCelestial9141 = PolarVoyageRemoteModelManagerOlympianCelestial9141(parcel, i);
        parcel.writeBundle(bundle);
        PolarVoyageNavigationViewHyperHyperHyperion1793(parcel, PolarVoyageRemoteModelManagerOlympianCelestial9141);
    }

    public static final PolarVoyageJobIntentServiceStormEclipsePixel2539 PolarVoyageZipVortexCelestial6185(PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum2348, boolean z) {
        PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora9729 = (PolarVoyageGyroscopePulseAurora9729) polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageAlarmManagerShadowHyperBeta8339.PolarVoyageTextInputEditTextNebulaHero6651;
        PolarVoyageRemoteModelManagerSpectraShadowNeo2910 polarVoyageRemoteModelManagerSpectraShadowNeo2910 = null;
        if ((polarVoyageGyroscopePulseAurora9729.PolarVoyageBottomSheetOmegaNeo1907 & 8) != 0) {
            loop0: while (true) {
                if (polarVoyageGyroscopePulseAurora9729 == null) {
                    break;
                }
                if ((polarVoyageGyroscopePulseAurora9729.PolarVoyageRotateAnimationCyberCelestialDelta4768 & 8) != 0) {
                    PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora97292 = polarVoyageGyroscopePulseAurora9729;
                    PolarVoyageDigitalInkRecognitionBetaDelta4802 polarVoyageDigitalInkRecognitionBetaDelta4802 = null;
                    while (polarVoyageGyroscopePulseAurora97292 != null) {
                        if (polarVoyageGyroscopePulseAurora97292 instanceof PolarVoyageTextRecognitionStormAlphaPrime3930) {
                            polarVoyageRemoteModelManagerSpectraShadowNeo2910 = polarVoyageGyroscopePulseAurora97292;
                            break loop0;
                        }
                        if ((polarVoyageGyroscopePulseAurora97292.PolarVoyageRotateAnimationCyberCelestialDelta4768 & 8) != 0 && (polarVoyageGyroscopePulseAurora97292 instanceof PolarVoyageServiceInfoPhantomBlaze1511)) {
                            int i = 0;
                            for (PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora97293 = ((PolarVoyageServiceInfoPhantomBlaze1511) polarVoyageGyroscopePulseAurora97292).PolarVoyageMotionLayoutForceEpicAurora7183; polarVoyageGyroscopePulseAurora97293 != null; polarVoyageGyroscopePulseAurora97293 = polarVoyageGyroscopePulseAurora97293.PolarVoyageCameraPixelBlaze2629) {
                                if ((polarVoyageGyroscopePulseAurora97293.PolarVoyageRotateAnimationCyberCelestialDelta4768 & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        polarVoyageGyroscopePulseAurora97292 = polarVoyageGyroscopePulseAurora97293;
                                    } else {
                                        if (polarVoyageDigitalInkRecognitionBetaDelta4802 == null) {
                                            polarVoyageDigitalInkRecognitionBetaDelta4802 = new PolarVoyageDigitalInkRecognitionBetaDelta4802(new PolarVoyageGyroscopePulseAurora9729[16]);
                                        }
                                        if (polarVoyageGyroscopePulseAurora97292 != null) {
                                            polarVoyageDigitalInkRecognitionBetaDelta4802.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageGyroscopePulseAurora97292);
                                            polarVoyageGyroscopePulseAurora97292 = null;
                                        }
                                        polarVoyageDigitalInkRecognitionBetaDelta4802.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageGyroscopePulseAurora97293);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        polarVoyageGyroscopePulseAurora97292 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageDigitalInkRecognitionBetaDelta4802);
                    }
                }
                if ((polarVoyageGyroscopePulseAurora9729.PolarVoyageBottomSheetOmegaNeo1907 & 8) == 0) {
                    break;
                }
                polarVoyageGyroscopePulseAurora9729 = polarVoyageGyroscopePulseAurora9729.PolarVoyageCameraPixelBlaze2629;
            }
        }
        polarVoyageRemoteModelManagerSpectraShadowNeo2910.getClass();
        PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora97294 = ((PolarVoyageGyroscopePulseAurora9729) ((PolarVoyageTextRecognitionStormAlphaPrime3930) polarVoyageRemoteModelManagerSpectraShadowNeo2910)).PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageInAppPurchaseTitaniumEpic6306 PolarVoyageDisplayMetricsVortexDragon9516 = polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageDisplayMetricsVortexDragon9516();
        if (PolarVoyageDisplayMetricsVortexDragon9516 == null) {
            PolarVoyageDisplayMetricsVortexDragon9516 = new PolarVoyageInAppPurchaseTitaniumEpic6306();
        }
        return new PolarVoyageJobIntentServiceStormEclipsePixel2539(polarVoyageGyroscopePulseAurora97294, z, polarVoyageConfigurationMegaTitaniumQuantum2348, PolarVoyageDisplayMetricsVortexDragon9516);
    }

    public abstract Typeface PolarVoyageBarcodeScannerInfernoSolarSpark7767(Context context, PolarVoyageConfigurationCyberHero6081 polarVoyageConfigurationCyberHero6081, Resources resources);

    public abstract Typeface PolarVoyageBitmapVisionAuroraPixel4705(Context context, PolarVoyageProcessCameraProviderDragonEpicCosmos5977[] polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr);

    public Typeface PolarVoyageDiffUtilTurboStrike5735(Context context, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface PolarVoyageTextInputEditTextNebulaHero6651(Context context, Resources resources, String str) {
        File PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageTextInputEditTextNebulaHero6651(context);
        if (PolarVoyageTextInputEditTextNebulaHero6651 == null) {
            return null;
        }
        try {
            if (PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageTextInputEditTextNebulaHero6651, resources, R.font.polar_app_font)) {
                return Typeface.createFromFile(PolarVoyageTextInputEditTextNebulaHero6651.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            PolarVoyageTextInputEditTextNebulaHero6651.delete();
        }
    }
}
