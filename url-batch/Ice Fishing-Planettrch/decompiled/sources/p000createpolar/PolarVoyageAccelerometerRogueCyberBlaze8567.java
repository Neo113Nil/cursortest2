package p000createpolar;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageAccelerometerRogueCyberBlaze8567 {
    public static final HashMap PolarVoyageZipVortexCelestial6185 = new HashMap();

    public static String PolarVoyageBarcodeScannerInfernoSolarSpark7767(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List PolarVoyageBitmapVisionAuroraPixel4705(String str, boolean z, boolean z2) {
        synchronized (PolarVoyageAccelerometerRogueCyberBlaze8567.class) {
            try {
                PolarVoyageMapVortexMasterSpeed8952 polarVoyageMapVortexMasterSpeed8952 = new PolarVoyageMapVortexMasterSpeed8952(str, z, z2);
                HashMap hashMap = PolarVoyageZipVortexCelestial6185;
                List list = (List) hashMap.get(polarVoyageMapVortexMasterSpeed8952);
                if (list != null) {
                    return list;
                }
                ArrayList PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilTurboStrike5735(polarVoyageMapVortexMasterSpeed8952, new PolarVoyageViewModelQuantumDragonPhoenix2767(z, z2, str.equals("video/mv-hevc")));
                if (z) {
                    PolarVoyageDiffUtilTurboStrike5735.isEmpty();
                }
                PolarVoyageZipVortexCelestial6185(str, PolarVoyageDiffUtilTurboStrike5735);
                PolarVoyageDialogPhantomEliteAurora3058 PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageDiffUtilTurboStrike5735);
                hashMap.put(polarVoyageMapVortexMasterSpeed8952, PolarVoyageBottomSheetOmegaNeo1907);
                return PolarVoyageBottomSheetOmegaNeo1907;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList PolarVoyageDiffUtilTurboStrike5735(PolarVoyageMapVortexMasterSpeed8952 polarVoyageMapVortexMasterSpeed8952, PolarVoyageViewModelQuantumDragonPhoenix2767 polarVoyageViewModelQuantumDragonPhoenix2767) {
        String PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        String str;
        int i;
        boolean isAlias;
        PolarVoyageMapVortexMasterSpeed8952 polarVoyageMapVortexMasterSpeed89522 = polarVoyageMapVortexMasterSpeed8952;
        int i2 = polarVoyageViewModelQuantumDragonPhoenix2767.PolarVoyageStrictModeLegendEpic1532;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = polarVoyageMapVortexMasterSpeed89522.PolarVoyageZipVortexCelestial6185;
            boolean z = polarVoyageMapVortexMasterSpeed89522.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (((MediaCodecInfo[]) polarVoyageViewModelQuantumDragonPhoenix2767.PolarVoyageRotateAnimationCyberCelestialDelta4768) == null) {
                polarVoyageViewModelQuantumDragonPhoenix2767.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new MediaCodecList(i2).getCodecInfos();
            }
            int length = ((MediaCodecInfo[]) polarVoyageViewModelQuantumDragonPhoenix2767.PolarVoyageRotateAnimationCyberCelestialDelta4768).length;
            int i3 = 0;
            while (i3 < length) {
                if (((MediaCodecInfo[]) polarVoyageViewModelQuantumDragonPhoenix2767.PolarVoyageRotateAnimationCyberCelestialDelta4768) == null) {
                    polarVoyageViewModelQuantumDragonPhoenix2767.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new MediaCodecList(i2).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[]) polarVoyageViewModelQuantumDragonPhoenix2767.PolarVoyageRotateAnimationCyberCelestialDelta4768)[i3];
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                    isAlias = mediaCodecInfo.isAlias();
                    if (isAlias) {
                        i = i3;
                        i3 = i + 1;
                        polarVoyageMapVortexMasterSpeed89522 = polarVoyageMapVortexMasterSpeed8952;
                    }
                }
                int i5 = i3;
                String name = mediaCodecInfo.getName();
                if (!mediaCodecInfo.isEncoder() && (PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(mediaCodecInfo, name, str2)) != null) {
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                        boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                        boolean isFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                        boolean z2 = polarVoyageMapVortexMasterSpeed89522.PolarVoyageKotlinBetaPulseBeta3653;
                        if ((z2 || !isFeatureRequired) && (!z2 || isFeatureSupported)) {
                            boolean isFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                            boolean isFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                            if ((z || !isFeatureRequired2) && (!z || isFeatureSupported2)) {
                                boolean z3 = true;
                                boolean isHardwareAccelerated = i4 >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !PolarVoyageItemDecorationUltraDeltaEpic7485(mediaCodecInfo, str2);
                                i = i5;
                                boolean PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(mediaCodecInfo, str2);
                                boolean z4 = isHardwareAccelerated;
                                if (i4 >= 29) {
                                    z3 = mediaCodecInfo.isVendor();
                                } else {
                                    String PolarVoyageFlingGestureEclipsePrimeMax1376 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(mediaCodecInfo.getName());
                                    if (PolarVoyageFlingGestureEclipsePrimeMax1376.startsWith("omx.google.") || PolarVoyageFlingGestureEclipsePrimeMax1376.startsWith("c2.android.") || PolarVoyageFlingGestureEclipsePrimeMax1376.startsWith("c2.google.")) {
                                        z3 = false;
                                    }
                                }
                                if (z != isFeatureSupported2) {
                                    continue;
                                } else {
                                    str = PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                                    try {
                                        arrayList.add(PolarVoyageAlertDialogVortexStorm8075.PolarVoyageStrictModeLegendEpic1532(name, str2, str, capabilitiesForType, z4, PolarVoyageItemDecorationUltraDeltaEpic7485, z3));
                                    } catch (Exception e) {
                                        e = e;
                                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageRemoteModelManagerOlympianCelestial9141("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                        throw e;
                                    }
                                }
                                i3 = i + 1;
                                polarVoyageMapVortexMasterSpeed89522 = polarVoyageMapVortexMasterSpeed8952;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str = PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    }
                }
                i = i5;
                i3 = i + 1;
                polarVoyageMapVortexMasterSpeed89522 = polarVoyageMapVortexMasterSpeed8952;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new PolarVoyageAdapterDelegatePrimeForceFusion9167("Failed to query underlying media codecs", e3);
        }
    }

    public static boolean PolarVoyageItemDecorationUltraDeltaEpic7485(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (Build.VERSION.SDK_INT >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (PolarVoyageScaleGestureDetectorSpeedGamma3567.PolarVoyageTextInputEditTextNebulaHero6651(str)) {
            return true;
        }
        String PolarVoyageFlingGestureEclipsePrimeMax1376 = PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(mediaCodecInfo.getName());
        if (PolarVoyageFlingGestureEclipsePrimeMax1376.startsWith("arc.")) {
            return false;
        }
        if (PolarVoyageFlingGestureEclipsePrimeMax1376.startsWith("omx.google.") || PolarVoyageFlingGestureEclipsePrimeMax1376.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((PolarVoyageFlingGestureEclipsePrimeMax1376.startsWith("omx.sec.") && PolarVoyageFlingGestureEclipsePrimeMax1376.contains(".sw.")) || PolarVoyageFlingGestureEclipsePrimeMax1376.equals("omx.qcom.video.decoder.hevcswvdec") || PolarVoyageFlingGestureEclipsePrimeMax1376.startsWith("c2.android.") || PolarVoyageFlingGestureEclipsePrimeMax1376.startsWith("c2.google.")) {
            return true;
        }
        return (PolarVoyageFlingGestureEclipsePrimeMax1376.startsWith("omx.") || PolarVoyageFlingGestureEclipsePrimeMax1376.startsWith("c2.")) ? false : true;
    }

    public static String PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356) {
        Pair PolarVoyageMotionLayoutTransitionHeroVision4068;
        String str = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageSnackbarGammaEclipse2140;
        String str2 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageSnackbarGammaEclipse2140;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageRoomStrikeMasterHyper4314.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageDisplayMetricsSpectraNeoHero6356)) != null) {
            int intValue = ((Integer) PolarVoyageMotionLayoutTransitionHeroVision4068.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                PolarVoyageRoomDaoTurboTitanNeo7994 polarVoyageRoomDaoTurboTitanNeo7994 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageFCMCelestialCosmosPixel3711;
                if (polarVoyageRoomDaoTurboTitanNeo7994 != null && polarVoyageRoomDaoTurboTitanNeo7994.PolarVoyageKotlinBetaPulseBeta3653 == 6 && polarVoyageRoomDaoTurboTitanNeo7994.PolarVoyageMotionLayoutTransitionHeroVision4068 == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static MediaCodecInfo.CodecProfileLevel PolarVoyageMotionLayoutTransitionHeroVision4068(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static PolarVoyageLifecycleCameraControllerUltraShadowDelta8620 PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageCamera2MasterPulse1881 polarVoyageCamera2MasterPulse1881, PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356, boolean z, boolean z2) {
        List PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageCamera2MasterPulse1881.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageSnackbarGammaEclipse2140, z, z2);
        String PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653(polarVoyageDisplayMetricsSpectraNeoHero6356);
        List PolarVoyageMotionLayoutTransitionHeroVision40682 = PolarVoyageKotlinBetaPulseBeta3653 == null ? PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778 : polarVoyageCamera2MasterPulse1881.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageKotlinBetaPulseBeta3653, z, z2);
        PolarVoyageDatabasePhantomBeta6832 PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageRotateAnimationCyberCelestialDelta4768();
        PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageMotionLayoutTransitionHeroVision4068);
        PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageMotionLayoutTransitionHeroVision40682);
        return PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageDiffUtilTurboStrike5735();
    }

    public static void PolarVoyageZipVortexCelestial6185(String str, ArrayList arrayList) {
        int i = 1;
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((PolarVoyageAlertDialogVortexStorm8075) arrayList.get(0)).PolarVoyageZipVortexCelestial6185.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(PolarVoyageAlertDialogVortexStorm8075.PolarVoyageStrictModeLegendEpic1532("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false));
            }
            Collections.sort(arrayList, new PolarVoyageLifecycleCameraControllerEclipseGamma3725(i, new PolarVoyageBroadcastDragonShadowRogue6783(28)));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((PolarVoyageAlertDialogVortexStorm8075) arrayList.get(0)).PolarVoyageZipVortexCelestial6185)) {
            return;
        }
        arrayList.add((PolarVoyageAlertDialogVortexStorm8075) arrayList.remove(0));
    }
}
