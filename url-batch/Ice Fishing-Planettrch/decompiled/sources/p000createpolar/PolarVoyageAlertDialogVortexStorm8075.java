package p000createpolar;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAlertDialogVortexStorm8075 {
    public final MediaCodecInfo.CodecCapabilities PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final boolean PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageBottomSheetOmegaNeo1907;
    public final boolean PolarVoyageDiffUtilTurboStrike5735;
    public final boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final String PolarVoyageKotlinBetaPulseBeta3653;
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final boolean PolarVoyageStrictModeLegendEpic1532;
    public final boolean PolarVoyageTextInputEditTextNebulaHero6651;
    public float PolarVoyageViewRogueMaster4778;
    public final String PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAlertDialogVortexStorm8075(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.PolarVoyageZipVortexCelestial6185 = str;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = str3;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = codecCapabilities;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = z;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = z4;
        this.PolarVoyageDiffUtilTurboStrike5735 = z5;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = z6;
        this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageScaleGestureDetectorSpeedGamma3567.PolarVoyageRotateAnimationCyberCelestialDelta4768(str2);
        this.PolarVoyageViewRogueMaster4778 = -3.4028235E38f;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = -1;
        this.PolarVoyageBottomSheetOmegaNeo1907 = -1;
    }

    public static PolarVoyageAlertDialogVortexStorm8075 PolarVoyageStrictModeLegendEpic1532(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z5;
        boolean z6;
        boolean z7;
        String str6;
        boolean z8 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z9 = codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                z4 = true;
                str6 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z5 = z;
                z6 = z2;
                z7 = z3;
                str4 = str2;
                return new PolarVoyageAlertDialogVortexStorm8075(str6, str4, str5, codecCapabilities2, z5, z6, z7, z8, z9, z4);
            }
        }
        z4 = false;
        str4 = str2;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z5 = z;
        z6 = z2;
        z7 = z3;
        str6 = str;
        return new PolarVoyageAlertDialogVortexStorm8075(str6, str4, str5, codecCapabilities2, z5, z6, z7, z8, z9, z4);
    }

    public static boolean PolarVoyageZipVortexCelestial6185(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageBitmapVisionAuroraPixel4705(i, widthAlignment) * widthAlignment, PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageBitmapVisionAuroraPixel4705(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double floor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
    }

    public final boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356) {
        return (Objects.equals(polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageSnackbarGammaEclipse2140, "audio/flac") && polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 == 22 && Build.VERSION.SDK_INT < 34 && this.PolarVoyageZipVortexCelestial6185.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean PolarVoyageBitmapVisionAuroraPixel4705(Context context, PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356) {
        int i;
        String str = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageSnackbarGammaEclipse2140;
        String str2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if ((!str2.equals(str) && !str2.equals(PolarVoyageAccelerometerRogueCyberBlaze8567.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageDisplayMetricsSpectraNeoHero6356))) || !PolarVoyageKotlinBetaPulseBeta3653(context, polarVoyageDisplayMetricsSpectraNeoHero6356, true) || !PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageDisplayMetricsSpectraNeoHero6356)) {
            return false;
        }
        if (this.PolarVoyageStrictModeLegendEpic1532) {
            int i2 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
            if (i2 > 0 && (i = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageMotionLayoutForceEpicAurora7183) > 0) {
                return PolarVoyageTextInputEditTextNebulaHero6651(i2, i, polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyagePackageManagerCelestialPhoenix8393);
            }
        } else {
            int i3 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageFlingGestureEclipsePrimeMax1376;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (i3 != -1) {
                if (codecCapabilities == null) {
                    PolarVoyageItemDecorationUltraDeltaEpic7485("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    PolarVoyageItemDecorationUltraDeltaEpic7485("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    PolarVoyageItemDecorationUltraDeltaEpic7485("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageCardViewAlphaVortexCelestial9747;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    PolarVoyageItemDecorationUltraDeltaEpic7485("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    PolarVoyageItemDecorationUltraDeltaEpic7485("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.PolarVoyageZipVortexCelestial6185 + ", [" + maxInputChannelCount + " to " + i5 + "]");
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    PolarVoyageItemDecorationUltraDeltaEpic7485("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean PolarVoyageDiffUtilTurboStrike5735(PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356) {
        if (this.PolarVoyageStrictModeLegendEpic1532) {
            return this.PolarVoyageBitmapVisionAuroraPixel4705;
        }
        Pair PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageRoomStrikeMasterHyper4314.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageDisplayMetricsSpectraNeoHero6356);
        return PolarVoyageMotionLayoutTransitionHeroVision4068 != null && ((Integer) PolarVoyageMotionLayoutTransitionHeroVision4068.first).intValue() == 42;
    }

    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(String str) {
        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDrawableDeltaHyperion5742("MediaCodecInfo", "NoSupport [" + str + "] [" + this.PolarVoyageZipVortexCelestial6185 + ", " + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + "] [" + PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185 + "]");
    }

    public final boolean PolarVoyageKotlinBetaPulseBeta3653(Context context, PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageRoomStrikeMasterHyper4314.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageDisplayMetricsSpectraNeoHero6356);
        String str = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageSnackbarGammaEclipse2140;
        String str2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        if (str != null && str.equals("video/mv-hevc")) {
            String PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageScaleGestureDetectorSpeedGamma3567.PolarVoyageBottomSheetOmegaNeo1907(str2);
            if (!PolarVoyageBottomSheetOmegaNeo1907.equals("video/mv-hevc")) {
                if (PolarVoyageBottomSheetOmegaNeo1907.equals("video/hevc")) {
                    HashMap hashMap = PolarVoyageAccelerometerRogueCyberBlaze8567.PolarVoyageZipVortexCelestial6185;
                    String PolarVoyageActivityInfoBetaQuantum8726 = PolarVoyageR8VisionOmegaNebula9943.PolarVoyageActivityInfoBetaQuantum8726(polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageNavigationViewHyperHyperHyperion1793);
                    if (PolarVoyageActivityInfoBetaQuantum8726 == null) {
                        PolarVoyageMotionLayoutTransitionHeroVision4068 = null;
                    } else {
                        String trim = PolarVoyageActivityInfoBetaQuantum8726.trim();
                        String str3 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                        PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageRoomStrikeMasterHyper4314.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageActivityInfoBetaQuantum8726, trim.split("\\.", -1), polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageFCMCelestialCosmosPixel3711);
                    }
                }
            }
            return true;
        }
        if (PolarVoyageMotionLayoutTransitionHeroVision4068 != null) {
            int intValue = ((Integer) PolarVoyageMotionLayoutTransitionHeroVision4068.first).intValue();
            int intValue2 = ((Integer) PolarVoyageMotionLayoutTransitionHeroVision4068.second).intValue();
            boolean equals = "video/dolby-vision".equals(str);
            String str4 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (equals) {
                str4.getClass();
                switch (str4) {
                    case "video/av01":
                    case "video/hevc":
                        intValue = 2;
                        break;
                    case "video/avc":
                        intValue = 8;
                        break;
                }
                intValue2 = 0;
            }
            if (this.PolarVoyageStrictModeLegendEpic1532 || str4.equals("audio/ac4") || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                    int i = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
                    codecProfileLevelArr = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{PolarVoyageAccelerometerRogueCyberBlaze8567.PolarVoyageMotionLayoutTransitionHeroVision4068(1026, i)} : new MediaCodecInfo.CodecProfileLevel[]{PolarVoyageAccelerometerRogueCyberBlaze8567.PolarVoyageMotionLayoutTransitionHeroVision4068(257, i), PolarVoyageAccelerometerRogueCyberBlaze8567.PolarVoyageMotionLayoutTransitionHeroVision4068(513, i), PolarVoyageAccelerometerRogueCyberBlaze8567.PolarVoyageMotionLayoutTransitionHeroVision4068(514, i), PolarVoyageAccelerometerRogueCyberBlaze8567.PolarVoyageMotionLayoutTransitionHeroVision4068(1026, i), PolarVoyageAccelerometerRogueCyberBlaze8567.PolarVoyageMotionLayoutTransitionHeroVision4068(1028, i)};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                    if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z)) {
                        if ("video/hevc".equals(str4) && 2 == intValue) {
                            String str5 = Build.DEVICE;
                            if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                            }
                        }
                    }
                }
                PolarVoyageItemDecorationUltraDeltaEpic7485("codec.profileLevel, " + polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageBottomSheetOmegaNeo1907 + ", " + str2);
                return false;
            }
        }
        return true;
    }

    public final PolarVoyagePagingSourceEliteEclipseSolar4650 PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356, PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero63562) {
        PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero63563;
        PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero63564;
        int i;
        String str = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageSnackbarGammaEclipse2140;
        PolarVoyageRoomDaoTurboTitanNeo7994 polarVoyageRoomDaoTurboTitanNeo7994 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageFCMCelestialCosmosPixel3711;
        String str2 = polarVoyageDisplayMetricsSpectraNeoHero63562.PolarVoyageSnackbarGammaEclipse2140;
        PolarVoyageRoomDaoTurboTitanNeo7994 polarVoyageRoomDaoTurboTitanNeo79942 = polarVoyageDisplayMetricsSpectraNeoHero63562.PolarVoyageFCMCelestialCosmosPixel3711;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.PolarVoyageStrictModeLegendEpic1532) {
            if (polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageLooperThreadAlphaPrime1279 != polarVoyageDisplayMetricsSpectraNeoHero63562.PolarVoyageLooperThreadAlphaPrime1279) {
                i2 |= 1024;
            }
            boolean z = (polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageLayerDrawableShadowTitaniumOmega1942 == polarVoyageDisplayMetricsSpectraNeoHero63562.PolarVoyageLayerDrawableShadowTitaniumOmega1942 && polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageMotionLayoutForceEpicAurora7183 == polarVoyageDisplayMetricsSpectraNeoHero63562.PolarVoyageMotionLayoutForceEpicAurora7183) ? false : true;
            if (!this.PolarVoyageBitmapVisionAuroraPixel4705 && z) {
                i2 |= 512;
            }
            if ((!PolarVoyageRoomDaoTurboTitanNeo7994.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageRoomDaoTurboTitanNeo7994) || !PolarVoyageRoomDaoTurboTitanNeo7994.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageRoomDaoTurboTitanNeo79942)) && !Objects.equals(polarVoyageRoomDaoTurboTitanNeo7994, polarVoyageRoomDaoTurboTitanNeo79942)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.PolarVoyageZipVortexCelestial6185) && !polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageDisplayMetricsSpectraNeoHero63562)) {
                i2 |= 2;
            }
            int i3 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageAlertDialogCyberHeroQuantum3938;
            if (i3 != -1 && (i = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageCameraViewSpectraMaxSpectra2824) != -1 && i3 == polarVoyageDisplayMetricsSpectraNeoHero63562.PolarVoyageAlertDialogCyberHeroQuantum3938 && i == polarVoyageDisplayMetricsSpectraNeoHero63562.PolarVoyageCameraViewSpectraMaxSpectra2824 && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(polarVoyageDisplayMetricsSpectraNeoHero63562.PolarVoyageSnackbarGammaEclipse2140, "video/dolby-vision")) {
                Pair PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageRoomStrikeMasterHyper4314.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageDisplayMetricsSpectraNeoHero6356);
                Pair PolarVoyageMotionLayoutTransitionHeroVision40682 = PolarVoyageRoomStrikeMasterHyper4314.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageDisplayMetricsSpectraNeoHero63562);
                if (PolarVoyageMotionLayoutTransitionHeroVision4068 == null || PolarVoyageMotionLayoutTransitionHeroVision40682 == null || !((Integer) PolarVoyageMotionLayoutTransitionHeroVision4068.first).equals(PolarVoyageMotionLayoutTransitionHeroVision40682.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new PolarVoyagePagingSourceEliteEclipseSolar4650(this.PolarVoyageZipVortexCelestial6185, polarVoyageDisplayMetricsSpectraNeoHero6356, polarVoyageDisplayMetricsSpectraNeoHero63562, polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageDisplayMetricsSpectraNeoHero63562) ? 3 : 2, 0);
            }
            polarVoyageDisplayMetricsSpectraNeoHero63563 = polarVoyageDisplayMetricsSpectraNeoHero6356;
            polarVoyageDisplayMetricsSpectraNeoHero63564 = polarVoyageDisplayMetricsSpectraNeoHero63562;
        } else {
            polarVoyageDisplayMetricsSpectraNeoHero63563 = polarVoyageDisplayMetricsSpectraNeoHero6356;
            polarVoyageDisplayMetricsSpectraNeoHero63564 = polarVoyageDisplayMetricsSpectraNeoHero63562;
            if (polarVoyageDisplayMetricsSpectraNeoHero63563.PolarVoyageCardViewAlphaVortexCelestial9747 != polarVoyageDisplayMetricsSpectraNeoHero63564.PolarVoyageCardViewAlphaVortexCelestial9747) {
                i2 |= 4096;
            }
            if (polarVoyageDisplayMetricsSpectraNeoHero63563.PolarVoyageFlingGestureEclipsePrimeMax1376 != polarVoyageDisplayMetricsSpectraNeoHero63564.PolarVoyageFlingGestureEclipsePrimeMax1376) {
                i2 |= 8192;
            }
            if (polarVoyageDisplayMetricsSpectraNeoHero63563.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 != polarVoyageDisplayMetricsSpectraNeoHero63564.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149) {
                i2 |= 16384;
            }
            String str3 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair PolarVoyageMotionLayoutTransitionHeroVision40683 = PolarVoyageRoomStrikeMasterHyper4314.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageDisplayMetricsSpectraNeoHero63563);
                Pair PolarVoyageMotionLayoutTransitionHeroVision40684 = PolarVoyageRoomStrikeMasterHyper4314.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageDisplayMetricsSpectraNeoHero63564);
                if (PolarVoyageMotionLayoutTransitionHeroVision40683 != null && PolarVoyageMotionLayoutTransitionHeroVision40684 != null) {
                    int intValue = ((Integer) PolarVoyageMotionLayoutTransitionHeroVision40683.first).intValue();
                    int intValue2 = ((Integer) PolarVoyageMotionLayoutTransitionHeroVision40684.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new PolarVoyagePagingSourceEliteEclipseSolar4650(this.PolarVoyageZipVortexCelestial6185, polarVoyageDisplayMetricsSpectraNeoHero63563, polarVoyageDisplayMetricsSpectraNeoHero63564, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && PolarVoyageMotionLayoutTransitionHeroVision40683.equals(PolarVoyageMotionLayoutTransitionHeroVision40684)) {
                        return new PolarVoyagePagingSourceEliteEclipseSolar4650(this.PolarVoyageZipVortexCelestial6185, polarVoyageDisplayMetricsSpectraNeoHero63563, polarVoyageDisplayMetricsSpectraNeoHero63564, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new PolarVoyagePagingSourceEliteEclipseSolar4650(this.PolarVoyageZipVortexCelestial6185, polarVoyageDisplayMetricsSpectraNeoHero63563, polarVoyageDisplayMetricsSpectraNeoHero63564, 3, 0);
            }
            if (!polarVoyageDisplayMetricsSpectraNeoHero63563.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageDisplayMetricsSpectraNeoHero63564)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new PolarVoyagePagingSourceEliteEclipseSolar4650(this.PolarVoyageZipVortexCelestial6185, polarVoyageDisplayMetricsSpectraNeoHero63563, polarVoyageDisplayMetricsSpectraNeoHero63564, 1, 0);
            }
        }
        return new PolarVoyagePagingSourceEliteEclipseSolar4650(this.PolarVoyageZipVortexCelestial6185, polarVoyageDisplayMetricsSpectraNeoHero63563, polarVoyageDisplayMetricsSpectraNeoHero63564, 0, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        r3 = r1.getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r2 == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageTextInputEditTextNebulaHero6651(int i, int i2, double d) {
        char c;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z;
        boolean covers;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (codecCapabilities == null) {
            PolarVoyageItemDecorationUltraDeltaEpic7485("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            PolarVoyageItemDecorationUltraDeltaEpic7485("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            if (i3 >= 29 && (((bool = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageLayerDrawableShadowTitaniumOmega1942) == null || !bool.booleanValue()) && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty())) {
                PolarVoyageInterpolatorGammaMax2788.PolarVoyageRotateAnimationCyberCelestialDelta4768();
                MediaCodecInfo.VideoCapabilities.PerformancePoint PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageInterpolatorGammaMax2788.PolarVoyageDiffUtilTurboStrike5735(i, i2, (int) d);
                int i4 = 0;
                while (true) {
                    if (i4 >= supportedPerformancePoints.size()) {
                        c = 1;
                        break;
                    }
                    covers = PolarVoyageInterpolatorGammaMax2788.PolarVoyageTextInputEditTextNebulaHero6651(supportedPerformancePoints.get(i4)).covers(PolarVoyageDiffUtilTurboStrike5735);
                    if (covers) {
                        c = 2;
                        break;
                    }
                    i4++;
                }
                if (c == 1 && PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageLayerDrawableShadowTitaniumOmega1942 == null) {
                    if (i3 < 37) {
                        int PolarVoyagePackageManagerCelestialPhoenix8393 = PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyagePackageManagerCelestialPhoenix8393(true);
                        if (i3 < 35 ? PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyagePackageManagerCelestialPhoenix8393(false) != 2 || PolarVoyagePackageManagerCelestialPhoenix8393 == 1 : PolarVoyagePackageManagerCelestialPhoenix8393 == 1) {
                            z = true;
                            PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = Boolean.valueOf(z);
                        }
                    }
                    z = false;
                    PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = Boolean.valueOf(z);
                }
                if (c != 2) {
                    if (c == 1) {
                        PolarVoyageItemDecorationUltraDeltaEpic7485("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                        return false;
                    }
                }
                return true;
            }
            c = 0;
            if (c != 2) {
            }
            return true;
        }
        if (!PolarVoyageZipVortexCelestial6185(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.PolarVoyageZipVortexCelestial6185;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && PolarVoyageZipVortexCelestial6185(videoCapabilities, i2, i, d)) {
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDrawableDeltaHyperion5742("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d) + "] [" + str + ", " + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + "] [" + PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185 + "]");
                    return true;
                }
            }
            PolarVoyageItemDecorationUltraDeltaEpic7485("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.PolarVoyageZipVortexCelestial6185;
    }
}
