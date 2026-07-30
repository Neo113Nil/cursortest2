package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageInputFilterCelestialEpicEclipse5119 implements Closeable {
    public static final Logger PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageThemeOverlayShadowPulse8967 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageCameraEliteOmegaDragon8537 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageGeocoderPhantomCyber4397 PolarVoyageStrictModeLegendEpic1532;

    static {
        Logger logger = Logger.getLogger(PolarVoyageDrawerLayoutBlazeOmegaUltra4339.class.getName());
        logger.getClass();
        PolarVoyageBottomSheetOmegaNeo1907 = logger;
    }

    public PolarVoyageInputFilterCelestialEpicEclipse5119(PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659) {
        polarVoyageEventLegendDragon2659.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageEventLegendDragon2659;
        PolarVoyageGeocoderPhantomCyber4397 polarVoyageGeocoderPhantomCyber4397 = new PolarVoyageGeocoderPhantomCyber4397(polarVoyageEventLegendDragon2659);
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageGeocoderPhantomCyber4397;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageCameraEliteOmegaDragon8537(polarVoyageGeocoderPhantomCyber4397);
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageLooperAlphaMax5789 polarVoyageLooperAlphaMax5789, int i, int i2, final int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.PolarVoyageItemDecorationUltraDeltaEpic7485.readByte();
            byte[] bArr = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        final int PolarVoyageLayerDrawableShadowTitaniumOmega1942 = PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageLayerDrawableShadowTitaniumOmega1942(i, i2, i4);
        PolarVoyageThemeOverlayShadowPulse8967 polarVoyageThemeOverlayShadowPulse8967 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        polarVoyageThemeOverlayShadowPulse8967.getClass();
        final PolarVoyageAnimationPhoenixPhantomNebula5325 polarVoyageAnimationPhoenixPhantomNebula5325 = polarVoyageLooperAlphaMax5789.PolarVoyageStrictModeLegendEpic1532;
        if ((i3 == 0 || (i3 & 1) != 0) ? false : z) {
            final PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = new PolarVoyageSnackbarSpectraMasterMaster4120();
            long j = PolarVoyageLayerDrawableShadowTitaniumOmega1942;
            polarVoyageThemeOverlayShadowPulse8967.PolarVoyageActivityInfoBetaQuantum8726(j);
            polarVoyageThemeOverlayShadowPulse8967.PolarVoyageLayerDrawableShadowTitaniumOmega1942(j, polarVoyageSnackbarSpectraMasterMaster4120);
            PolarVoyageDrawerLayoutTurboStrikeTitanium4854.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageContentProviderHyperSpark3838, polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageRotateAnimationCyberCelestialDelta4768 + '[' + i3 + "] onData", 0L, new PolarVoyageFragmentPulseEliteDragon8768(i3, polarVoyageSnackbarSpectraMasterMaster4120, PolarVoyageLayerDrawableShadowTitaniumOmega1942, z4) { // from class: create-polar.PolarVoyageBindingAdapterSpeedPulseElite1226
                public final /* synthetic */ int PolarVoyageBottomSheetOmegaNeo1907;
                public final /* synthetic */ PolarVoyageSnackbarSpectraMasterMaster4120 PolarVoyageRotateAnimationCyberCelestialDelta4768;
                public final /* synthetic */ int PolarVoyageStrictModeLegendEpic1532;

                @Override // p000createpolar.PolarVoyageFragmentPulseEliteDragon8768
                public final Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
                    PolarVoyageAnimationPhoenixPhantomNebula5325 polarVoyageAnimationPhoenixPhantomNebula53252 = PolarVoyageAnimationPhoenixPhantomNebula5325.this;
                    int i5 = this.PolarVoyageStrictModeLegendEpic1532;
                    PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster41202 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    int i6 = this.PolarVoyageBottomSheetOmegaNeo1907;
                    try {
                        polarVoyageAnimationPhoenixPhantomNebula53252.PolarVoyageNavigationViewHyperHyperHyperion1793.getClass();
                        polarVoyageSnackbarSpectraMasterMaster41202.skip(i6);
                        polarVoyageAnimationPhoenixPhantomNebula53252.PolarVoyageDiffUtilDragonSpeedEclipse6225.PolarVoyageCameraPixelBlaze2629(i5, PolarVoyageServiceInfoSolarMax5413.CANCEL);
                        synchronized (polarVoyageAnimationPhoenixPhantomNebula53252) {
                            polarVoyageAnimationPhoenixPhantomNebula53252.PolarVoyageViewBindingPulseHeroSpeed5705.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                }
            }, 6);
        } else {
            PolarVoyageTextWatcherForceTitanStrike5172 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i3);
            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 == null) {
                polarVoyageLooperAlphaMax5789.PolarVoyageStrictModeLegendEpic1532.PolarVoyageCameraPixelBlaze2629(i3, PolarVoyageServiceInfoSolarMax5413.PROTOCOL_ERROR);
                long j2 = PolarVoyageLayerDrawableShadowTitaniumOmega1942;
                polarVoyageLooperAlphaMax5789.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532(j2);
                polarVoyageThemeOverlayShadowPulse8967.skip(j2);
            } else {
                TimeZone timeZone = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185;
                PolarVoyageProximitySensorOlympianNebulaForce7150 polarVoyageProximitySensorOlympianNebulaForce7150 = PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageSnackbarGammaEclipse2140;
                long j3 = PolarVoyageLayerDrawableShadowTitaniumOmega1942;
                polarVoyageProximitySensorOlympianNebulaForce7150.getClass();
                long j4 = j3;
                while (true) {
                    PolarVoyageTextWatcherForceTitanStrike5172 polarVoyageTextWatcherForceTitanStrike5172 = polarVoyageProximitySensorOlympianNebulaForce7150.PolarVoyageCameraPixelBlaze2629;
                    if (j4 <= 0) {
                        TimeZone timeZone2 = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185;
                        polarVoyageTextWatcherForceTitanStrike5172.PolarVoyageStrictModeLegendEpic1532.PolarVoyageStrictModeLegendEpic1532(j3);
                        polarVoyageProximitySensorOlympianNebulaForce7150.PolarVoyageCameraPixelBlaze2629.PolarVoyageStrictModeLegendEpic1532.PolarVoyageMotionLayoutForceEpicAurora7183.getClass();
                        break;
                    }
                    synchronized (polarVoyageTextWatcherForceTitanStrike5172) {
                        z2 = polarVoyageProximitySensorOlympianNebulaForce7150.PolarVoyageStrictModeLegendEpic1532;
                        z3 = polarVoyageProximitySensorOlympianNebulaForce7150.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageStrictModeLegendEpic1532 + j4 > polarVoyageProximitySensorOlympianNebulaForce7150.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    }
                    if (z3) {
                        polarVoyageThemeOverlayShadowPulse8967.skip(j4);
                        polarVoyageProximitySensorOlympianNebulaForce7150.PolarVoyageCameraPixelBlaze2629.PolarVoyageDiffUtilTurboStrike5735(PolarVoyageServiceInfoSolarMax5413.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        polarVoyageThemeOverlayShadowPulse8967.skip(j4);
                        break;
                    }
                    long PolarVoyageLayerDrawableShadowTitaniumOmega19422 = polarVoyageThemeOverlayShadowPulse8967.PolarVoyageLayerDrawableShadowTitaniumOmega1942(j4, polarVoyageProximitySensorOlympianNebulaForce7150.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                    if (PolarVoyageLayerDrawableShadowTitaniumOmega19422 == -1) {
                        throw new EOFException();
                    }
                    j4 -= PolarVoyageLayerDrawableShadowTitaniumOmega19422;
                    PolarVoyageTextWatcherForceTitanStrike5172 polarVoyageTextWatcherForceTitanStrike51722 = polarVoyageProximitySensorOlympianNebulaForce7150.PolarVoyageCameraPixelBlaze2629;
                    synchronized (polarVoyageTextWatcherForceTitanStrike51722) {
                        try {
                            if (polarVoyageProximitySensorOlympianNebulaForce7150.PolarVoyageViewRogueMaster4778) {
                                polarVoyageProximitySensorOlympianNebulaForce7150.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageMotionLayoutTransitionHeroVision4068();
                            } else {
                                PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster41202 = polarVoyageProximitySensorOlympianNebulaForce7150.PolarVoyageBottomSheetOmegaNeo1907;
                                boolean z5 = polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageStrictModeLegendEpic1532 == 0;
                                polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageFlingGestureEclipsePrimeMax1376(polarVoyageProximitySensorOlympianNebulaForce7150.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                                if (z5) {
                                    polarVoyageTextWatcherForceTitanStrike51722.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z4) {
                    PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageCoroutineScopeDeltaInferno4802.PolarVoyageStrictModeLegendEpic1532, true);
                }
            }
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.skip(i4);
    }

    public final List PolarVoyageBitmapVisionAuroraPixel4705(int i, int i2, int i3, int i4) {
        PolarVoyageGeocoderPhantomCyber4397 polarVoyageGeocoderPhantomCyber4397 = this.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageGeocoderPhantomCyber4397.PolarVoyageViewRogueMaster4778 = i;
        polarVoyageGeocoderPhantomCyber4397.PolarVoyageStrictModeLegendEpic1532 = i;
        polarVoyageGeocoderPhantomCyber4397.PolarVoyageCameraPixelBlaze2629 = i2;
        polarVoyageGeocoderPhantomCyber4397.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i3;
        polarVoyageGeocoderPhantomCyber4397.PolarVoyageBottomSheetOmegaNeo1907 = i4;
        PolarVoyageCameraEliteOmegaDragon8537 polarVoyageCameraEliteOmegaDragon8537 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageEventLegendDragon2659 polarVoyageEventLegendDragon2659 = polarVoyageCameraEliteOmegaDragon8537.PolarVoyageKotlinBetaPulseBeta3653;
        ArrayList arrayList = polarVoyageCameraEliteOmegaDragon8537.PolarVoyageMotionLayoutTransitionHeroVision4068;
        while (!polarVoyageEventLegendDragon2659.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
            byte readByte = polarVoyageEventLegendDragon2659.readByte();
            byte[] bArr = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185;
            int i5 = readByte & 255;
            if (i5 == 128) {
                PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBitmapVisionAuroraPixel4705(i5, 127);
                int i6 = PolarVoyageBitmapVisionAuroraPixel4705 - 1;
                if (i6 >= 0) {
                    PolarVoyageZipNeoFusionAurora5444[] polarVoyageZipNeoFusionAurora5444Arr = PolarVoyageCameraSelectorCyberEpic7221.PolarVoyageZipVortexCelestial6185;
                    if (i6 <= polarVoyageZipNeoFusionAurora5444Arr.length - 1) {
                        arrayList.add(polarVoyageZipNeoFusionAurora5444Arr[i6]);
                    }
                }
                int length = polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBitmapVisionAuroraPixel4705 + 1 + (i6 - PolarVoyageCameraSelectorCyberEpic7221.PolarVoyageZipVortexCelestial6185.length);
                if (length >= 0) {
                    PolarVoyageZipNeoFusionAurora5444[] polarVoyageZipNeoFusionAurora5444Arr2 = polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    if (length < polarVoyageZipNeoFusionAurora5444Arr2.length) {
                        PolarVoyageZipNeoFusionAurora5444 polarVoyageZipNeoFusionAurora5444 = polarVoyageZipNeoFusionAurora5444Arr2[length];
                        polarVoyageZipNeoFusionAurora5444.getClass();
                        arrayList.add(polarVoyageZipNeoFusionAurora5444);
                    }
                }
                PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Header index too large ", PolarVoyageBitmapVisionAuroraPixel4705));
                return null;
            }
            if (i5 == 64) {
                PolarVoyageZipNeoFusionAurora5444[] polarVoyageZipNeoFusionAurora5444Arr3 = PolarVoyageCameraSelectorCyberEpic7221.PolarVoyageZipVortexCelestial6185;
                PolarVoyagePropertyValuesHolderVortexNeo2967 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                PolarVoyageCameraSelectorCyberEpic7221.PolarVoyageZipVortexCelestial6185(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                polarVoyageCameraEliteOmegaDragon8537.PolarVoyageKotlinBetaPulseBeta3653(new PolarVoyageZipNeoFusionAurora5444(PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBarcodeScannerInfernoSolarSpark7767()));
            } else if ((readByte & 64) == 64) {
                polarVoyageCameraEliteOmegaDragon8537.PolarVoyageKotlinBetaPulseBeta3653(new PolarVoyageZipNeoFusionAurora5444(polarVoyageCameraEliteOmegaDragon8537.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBitmapVisionAuroraPixel4705(i5, 63) - 1), polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBarcodeScannerInfernoSolarSpark7767()));
            } else if ((readByte & 32) == 32) {
                int PolarVoyageBitmapVisionAuroraPixel47052 = polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBitmapVisionAuroraPixel4705(i5, 31);
                polarVoyageCameraEliteOmegaDragon8537.PolarVoyageZipVortexCelestial6185 = PolarVoyageBitmapVisionAuroraPixel47052;
                if (PolarVoyageBitmapVisionAuroraPixel47052 < 0 || PolarVoyageBitmapVisionAuroraPixel47052 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + polarVoyageCameraEliteOmegaDragon8537.PolarVoyageZipVortexCelestial6185);
                }
                int i7 = polarVoyageCameraEliteOmegaDragon8537.PolarVoyageTextInputEditTextNebulaHero6651;
                if (PolarVoyageBitmapVisionAuroraPixel47052 < i7) {
                    if (PolarVoyageBitmapVisionAuroraPixel47052 == 0) {
                        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCombineBlazeSparkInferno2844(r6, 0, polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBarcodeScannerInfernoSolarSpark7767.length);
                        polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBarcodeScannerInfernoSolarSpark7767.length - 1;
                        polarVoyageCameraEliteOmegaDragon8537.PolarVoyageDiffUtilTurboStrike5735 = 0;
                        polarVoyageCameraEliteOmegaDragon8537.PolarVoyageTextInputEditTextNebulaHero6651 = 0;
                    } else {
                        polarVoyageCameraEliteOmegaDragon8537.PolarVoyageZipVortexCelestial6185(i7 - PolarVoyageBitmapVisionAuroraPixel47052);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                PolarVoyageZipNeoFusionAurora5444[] polarVoyageZipNeoFusionAurora5444Arr4 = PolarVoyageCameraSelectorCyberEpic7221.PolarVoyageZipVortexCelestial6185;
                PolarVoyagePropertyValuesHolderVortexNeo2967 PolarVoyageBarcodeScannerInfernoSolarSpark77672 = polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                PolarVoyageCameraSelectorCyberEpic7221.PolarVoyageZipVortexCelestial6185(PolarVoyageBarcodeScannerInfernoSolarSpark77672);
                arrayList.add(new PolarVoyageZipNeoFusionAurora5444(PolarVoyageBarcodeScannerInfernoSolarSpark77672, polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBarcodeScannerInfernoSolarSpark7767()));
            } else {
                arrayList.add(new PolarVoyageZipNeoFusionAurora5444(polarVoyageCameraEliteOmegaDragon8537.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBitmapVisionAuroraPixel4705(i5, 15) - 1), polarVoyageCameraEliteOmegaDragon8537.PolarVoyageBarcodeScannerInfernoSolarSpark7767()));
            }
        }
        List PolarVoyageAdapterDelegateNebulaNeoVision8476 = PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageAdapterDelegateNebulaNeoVision8476(arrayList);
        arrayList.clear();
        return PolarVoyageAdapterDelegateNebulaNeoVision8476;
    }

    public final void PolarVoyageDiffUtilTurboStrike5735(PolarVoyageLooperAlphaMax5789 polarVoyageLooperAlphaMax5789, int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        PolarVoyageAnimationPhoenixPhantomNebula5325 polarVoyageAnimationPhoenixPhantomNebula5325;
        if (i3 == 0) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z2 = false;
        boolean z3 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.PolarVoyageItemDecorationUltraDeltaEpic7485.readByte();
            byte[] bArr = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            PolarVoyageThemeOverlayShadowPulse8967 polarVoyageThemeOverlayShadowPulse8967 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            polarVoyageThemeOverlayShadowPulse8967.readInt();
            polarVoyageThemeOverlayShadowPulse8967.readByte();
            byte[] bArr2 = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185;
            i5 = i - 5;
        } else {
            i5 = i;
        }
        List PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageLayerDrawableShadowTitaniumOmega1942(i5, i2, i4), i4, i2, i3);
        PolarVoyageAnimationPhoenixPhantomNebula5325 polarVoyageAnimationPhoenixPhantomNebula53252 = polarVoyageLooperAlphaMax5789.PolarVoyageStrictModeLegendEpic1532;
        if (i3 != 0 && (i3 & 1) == 0) {
            z2 = z;
        }
        if (z2) {
            PolarVoyageDrawerLayoutTurboStrikeTitanium4854.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageAnimationPhoenixPhantomNebula53252.PolarVoyageContentProviderHyperSpark3838, polarVoyageAnimationPhoenixPhantomNebula53252.PolarVoyageRotateAnimationCyberCelestialDelta4768 + '[' + i3 + "] onHeaders", 0L, new PolarVoyageConstraintSetCloneForceCosmosForce9119(polarVoyageAnimationPhoenixPhantomNebula53252, i3, PolarVoyageBitmapVisionAuroraPixel4705, z3), 6);
            return;
        }
        synchronized (polarVoyageAnimationPhoenixPhantomNebula53252) {
            try {
                PolarVoyageTextWatcherForceTitanStrike5172 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageAnimationPhoenixPhantomNebula53252.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i3);
                if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null) {
                    PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageDiffUtilTurboStrike5735(PolarVoyageBitmapVisionAuroraPixel4705), z3);
                    return;
                }
                if (polarVoyageAnimationPhoenixPhantomNebula53252.PolarVoyageCameraPixelBlaze2629) {
                    return;
                }
                if (i3 <= polarVoyageAnimationPhoenixPhantomNebula53252.PolarVoyageBottomSheetOmegaNeo1907) {
                    return;
                }
                if (i3 % 2 == polarVoyageAnimationPhoenixPhantomNebula53252.PolarVoyageViewRogueMaster4778 % 2) {
                    return;
                }
                polarVoyageAnimationPhoenixPhantomNebula5325 = polarVoyageAnimationPhoenixPhantomNebula53252;
                try {
                    PolarVoyageTextWatcherForceTitanStrike5172 polarVoyageTextWatcherForceTitanStrike5172 = new PolarVoyageTextWatcherForceTitanStrike5172(i3, polarVoyageAnimationPhoenixPhantomNebula5325, false, z3, PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageDiffUtilTurboStrike5735(PolarVoyageBitmapVisionAuroraPixel4705));
                    polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageBottomSheetOmegaNeo1907 = i3;
                    polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageStrictModeLegendEpic1532.put(Integer.valueOf(i3), polarVoyageTextWatcherForceTitanStrike5172);
                    PolarVoyageDrawerLayoutTurboStrikeTitanium4854.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageBarcodeScannerInfernoSolarSpark7767(), polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageRotateAnimationCyberCelestialDelta4768 + '[' + i3 + "] onStream", 0L, new PolarVoyageSnackbarElitePixelTitan9268(8, polarVoyageAnimationPhoenixPhantomNebula5325, polarVoyageTextWatcherForceTitanStrike5172), 6);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                polarVoyageAnimationPhoenixPhantomNebula5325 = polarVoyageAnimationPhoenixPhantomNebula53252;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x022f, code lost:
    
        p000createpolar.PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778(p000createpolar.PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0238, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068(boolean z, PolarVoyageLooperAlphaMax5789 polarVoyageLooperAlphaMax5789) {
        int PolarVoyageViewRogueMaster4778;
        Object[] array;
        try {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageActivityInfoBetaQuantum8726(9L);
            PolarVoyageViewRogueMaster4778 = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageViewRogueMaster4778(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        } catch (EOFException unused) {
        }
        if (PolarVoyageViewRogueMaster4778 > 16384) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("FRAME_SIZE_ERROR: ", PolarVoyageViewRogueMaster4778));
            return false;
        }
        int readByte = this.PolarVoyageItemDecorationUltraDeltaEpic7485.readByte() & 255;
        byte readByte2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.readByte();
        int i = readByte2 & 255;
        int readInt = this.PolarVoyageItemDecorationUltraDeltaEpic7485.readInt();
        int i2 = Integer.MAX_VALUE & readInt;
        int i3 = 1;
        if (readByte != 8) {
            Logger logger = PolarVoyageBottomSheetOmegaNeo1907;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(PolarVoyageDrawerLayoutBlazeOmegaUltra4339.PolarVoyageMotionLayoutTransitionHeroVision4068(true, i2, PolarVoyageViewRogueMaster4778, readByte, i));
            }
        }
        if (z && readByte != 4) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageSnackbarGammaEclipse2140(PolarVoyageDrawerLayoutBlazeOmegaUltra4339.PolarVoyageZipVortexCelestial6185(readByte), "Expected a SETTINGS frame but was ");
            return false;
        }
        PolarVoyageServiceInfoSolarMax5413 polarVoyageServiceInfoSolarMax5413 = null;
        switch (readByte) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageLooperAlphaMax5789, PolarVoyageViewRogueMaster4778, i, i2);
                return true;
            case 1:
                PolarVoyageDiffUtilTurboStrike5735(polarVoyageLooperAlphaMax5789, PolarVoyageViewRogueMaster4778, i, i2);
                return true;
            case 2:
                if (PolarVoyageViewRogueMaster4778 != 5) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("TYPE_PRIORITY length: ", PolarVoyageViewRogueMaster4778, " != 5"));
                    return false;
                }
                if (i2 == 0) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("TYPE_PRIORITY streamId == 0");
                    return false;
                }
                PolarVoyageThemeOverlayShadowPulse8967 polarVoyageThemeOverlayShadowPulse8967 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                polarVoyageThemeOverlayShadowPulse8967.readInt();
                polarVoyageThemeOverlayShadowPulse8967.readByte();
                return true;
            case 3:
                if (PolarVoyageViewRogueMaster4778 != 4) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("TYPE_RST_STREAM length: ", PolarVoyageViewRogueMaster4778, " != 4"));
                    return false;
                }
                if (i2 == 0) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("TYPE_RST_STREAM streamId == 0");
                    return false;
                }
                int readInt2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.readInt();
                PolarVoyageServiceInfoSolarMax5413.PolarVoyageStrictModeLegendEpic1532.getClass();
                PolarVoyageServiceInfoSolarMax5413[] values = PolarVoyageServiceInfoSolarMax5413.values();
                int length = values.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        PolarVoyageServiceInfoSolarMax5413 polarVoyageServiceInfoSolarMax54132 = values[i4];
                        if (polarVoyageServiceInfoSolarMax54132.PolarVoyageItemDecorationUltraDeltaEpic7485 == readInt2) {
                            polarVoyageServiceInfoSolarMax5413 = polarVoyageServiceInfoSolarMax54132;
                        } else {
                            i4++;
                        }
                    }
                }
                if (polarVoyageServiceInfoSolarMax5413 == null) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("TYPE_RST_STREAM unexpected error code: ", readInt2));
                    return false;
                }
                PolarVoyageAnimationPhoenixPhantomNebula5325 polarVoyageAnimationPhoenixPhantomNebula5325 = polarVoyageLooperAlphaMax5789.PolarVoyageStrictModeLegendEpic1532;
                if (i2 == 0 || (readInt & 1) != 0) {
                    PolarVoyageTextWatcherForceTitanStrike5172 PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageBitmapVisionAuroraPixel4705(i2);
                    if (PolarVoyageBitmapVisionAuroraPixel4705 != null) {
                        synchronized (PolarVoyageBitmapVisionAuroraPixel4705) {
                            if (PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageItemDecorationUltraDeltaEpic7485() == null) {
                                PolarVoyageBitmapVisionAuroraPixel4705.PolarVoyageAnimatorSetSparkUltraMax8233 = polarVoyageServiceInfoSolarMax5413;
                                PolarVoyageBitmapVisionAuroraPixel4705.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                }
                PolarVoyageDrawerLayoutTurboStrikeTitanium4854.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageContentProviderHyperSpark3838, polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageRotateAnimationCyberCelestialDelta4768 + '[' + i2 + "] onReset", 0L, new PolarVoyageConstraintSetCloneForceCosmosForce9119(polarVoyageAnimationPhoenixPhantomNebula5325, i2, polarVoyageServiceInfoSolarMax5413, i3), 6);
                return true;
            case 4:
                PolarVoyageThemeOverlayShadowPulse8967 polarVoyageThemeOverlayShadowPulse89672 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (i2 != 0) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("TYPE_SETTINGS streamId != 0");
                    return false;
                }
                if ((readByte2 & 1) != 0) {
                    if (PolarVoyageViewRogueMaster4778 != 0) {
                        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    return true;
                }
                if (PolarVoyageViewRogueMaster4778 % 6 != 0) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("TYPE_SETTINGS length % 6 != 0: ", PolarVoyageViewRogueMaster4778));
                    return false;
                }
                PolarVoyageGuidelineThunderSolarAurora9069 polarVoyageGuidelineThunderSolarAurora9069 = new PolarVoyageGuidelineThunderSolarAurora9069();
                PolarVoyageSoundPoolAuroraFusion6423 PolarVoyageOnPreDrawListenerNovaCelestialDragon7415 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415(PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageThreadPhoenixVisionSolar1313(0, PolarVoyageViewRogueMaster4778), 6);
                int i5 = PolarVoyageOnPreDrawListenerNovaCelestialDragon7415.PolarVoyageItemDecorationUltraDeltaEpic7485;
                int i6 = PolarVoyageOnPreDrawListenerNovaCelestialDragon7415.PolarVoyageStrictModeLegendEpic1532;
                int i7 = PolarVoyageOnPreDrawListenerNovaCelestialDragon7415.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (true) {
                        short readShort = polarVoyageThemeOverlayShadowPulse89672.readShort();
                        byte[] bArr = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185;
                        int i8 = readShort & 65535;
                        int readInt3 = polarVoyageThemeOverlayShadowPulse89672.readInt();
                        if (i8 != 2) {
                            if (i8 != 4) {
                                if (i8 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                }
                            } else if (readInt3 < 0) {
                                PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                return false;
                            }
                        } else if (readInt3 != 0 && readInt3 != 1) {
                            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            return false;
                        }
                        polarVoyageGuidelineThunderSolarAurora9069.PolarVoyageMotionLayoutTransitionHeroVision4068(i8, readInt3);
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                }
                PolarVoyageAnimationPhoenixPhantomNebula5325 polarVoyageAnimationPhoenixPhantomNebula53252 = polarVoyageLooperAlphaMax5789.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageDrawerLayoutTurboStrikeTitanium4854.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageAnimationPhoenixPhantomNebula53252.PolarVoyageSnackbarGammaEclipse2140, PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageSnackbarGammaEclipse2140(new StringBuilder(), polarVoyageAnimationPhoenixPhantomNebula53252.PolarVoyageRotateAnimationCyberCelestialDelta4768, " applyAndAckSettings"), 0L, new PolarVoyageSnackbarElitePixelTitan9268(9, polarVoyageLooperAlphaMax5789, polarVoyageGuidelineThunderSolarAurora9069), 6);
                return true;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                PolarVoyageStrictModeLegendEpic1532(polarVoyageLooperAlphaMax5789, PolarVoyageViewRogueMaster4778, i, i2);
                return true;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                if (PolarVoyageViewRogueMaster4778 != 8) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("TYPE_PING length != 8: ", PolarVoyageViewRogueMaster4778));
                    return false;
                }
                if (i2 != 0) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("TYPE_PING streamId != 0");
                    return false;
                }
                final int readInt4 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.readInt();
                final int readInt5 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.readInt();
                r0 = (readByte2 & 1) != 0 ? 1 : 0;
                PolarVoyageAnimationPhoenixPhantomNebula5325 polarVoyageAnimationPhoenixPhantomNebula53253 = polarVoyageLooperAlphaMax5789.PolarVoyageStrictModeLegendEpic1532;
                if (r0 == 0) {
                    PolarVoyageDrawerLayoutTurboStrikeTitanium4854 polarVoyageDrawerLayoutTurboStrikeTitanium4854 = polarVoyageAnimationPhoenixPhantomNebula53253.PolarVoyageSnackbarGammaEclipse2140;
                    String PolarVoyageSnackbarGammaEclipse2140 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageSnackbarGammaEclipse2140(new StringBuilder(), polarVoyageLooperAlphaMax5789.PolarVoyageStrictModeLegendEpic1532.PolarVoyageRotateAnimationCyberCelestialDelta4768, " ping");
                    final PolarVoyageAnimationPhoenixPhantomNebula5325 polarVoyageAnimationPhoenixPhantomNebula53254 = polarVoyageLooperAlphaMax5789.PolarVoyageStrictModeLegendEpic1532;
                    PolarVoyageDrawerLayoutTurboStrikeTitanium4854.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageDrawerLayoutTurboStrikeTitanium4854, PolarVoyageSnackbarGammaEclipse2140, 0L, new PolarVoyageFragmentPulseEliteDragon8768() { // from class: create-polar.PolarVoyageActionBarPhoenixFusion4279
                        @Override // p000createpolar.PolarVoyageFragmentPulseEliteDragon8768
                        public final Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
                            PolarVoyageAnimationPhoenixPhantomNebula5325 polarVoyageAnimationPhoenixPhantomNebula53255 = PolarVoyageAnimationPhoenixPhantomNebula5325.this;
                            try {
                                polarVoyageAnimationPhoenixPhantomNebula53255.PolarVoyageDiffUtilDragonSpeedEclipse6225.PolarVoyageRotateAnimationCyberCelestialDelta4768(readInt4, readInt5, true);
                            } catch (IOException e) {
                                PolarVoyageServiceInfoSolarMax5413 polarVoyageServiceInfoSolarMax54133 = PolarVoyageServiceInfoSolarMax5413.PROTOCOL_ERROR;
                                polarVoyageAnimationPhoenixPhantomNebula53255.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageServiceInfoSolarMax54133, polarVoyageServiceInfoSolarMax54133, e);
                            }
                            return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                        }
                    }, 6);
                    return true;
                }
                synchronized (polarVoyageAnimationPhoenixPhantomNebula53253) {
                    try {
                        if (readInt4 == 1) {
                            polarVoyageAnimationPhoenixPhantomNebula53253.PolarVoyageAnimatorSetSparkUltraMax8233++;
                        } else if (readInt4 == 2) {
                            polarVoyageAnimationPhoenixPhantomNebula53253.PolarVoyageDisplayMetricsVortexDragon9516++;
                        } else if (readInt4 == 3) {
                            polarVoyageAnimationPhoenixPhantomNebula53253.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                if (PolarVoyageViewRogueMaster4778 < 8) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("TYPE_GOAWAY length < 8: ", PolarVoyageViewRogueMaster4778));
                    return false;
                }
                if (i2 != 0) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("TYPE_GOAWAY streamId != 0");
                    return false;
                }
                int readInt6 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.readInt();
                int readInt7 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.readInt();
                int i9 = PolarVoyageViewRogueMaster4778 - 8;
                PolarVoyageServiceInfoSolarMax5413.PolarVoyageStrictModeLegendEpic1532.getClass();
                PolarVoyageServiceInfoSolarMax5413[] values2 = PolarVoyageServiceInfoSolarMax5413.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        PolarVoyageServiceInfoSolarMax5413 polarVoyageServiceInfoSolarMax54133 = values2[i10];
                        if (polarVoyageServiceInfoSolarMax54133.PolarVoyageItemDecorationUltraDeltaEpic7485 == readInt7) {
                            polarVoyageServiceInfoSolarMax5413 = polarVoyageServiceInfoSolarMax54133;
                        } else {
                            i10++;
                        }
                    }
                }
                if (polarVoyageServiceInfoSolarMax5413 == null) {
                    PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("TYPE_GOAWAY unexpected error code: ", readInt7));
                    return false;
                }
                PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967 = PolarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageBottomSheetOmegaNeo1907;
                if (i9 > 0) {
                    polarVoyagePropertyValuesHolderVortexNeo2967 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(i9);
                }
                polarVoyagePropertyValuesHolderVortexNeo2967.getClass();
                polarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                PolarVoyageAnimationPhoenixPhantomNebula5325 polarVoyageAnimationPhoenixPhantomNebula53255 = polarVoyageLooperAlphaMax5789.PolarVoyageStrictModeLegendEpic1532;
                synchronized (polarVoyageAnimationPhoenixPhantomNebula53255) {
                    array = polarVoyageAnimationPhoenixPhantomNebula53255.PolarVoyageStrictModeLegendEpic1532.values().toArray(new PolarVoyageTextWatcherForceTitanStrike5172[0]);
                    polarVoyageAnimationPhoenixPhantomNebula53255.PolarVoyageCameraPixelBlaze2629 = true;
                }
                PolarVoyageTextWatcherForceTitanStrike5172[] polarVoyageTextWatcherForceTitanStrike5172Arr = (PolarVoyageTextWatcherForceTitanStrike5172[]) array;
                int length3 = polarVoyageTextWatcherForceTitanStrike5172Arr.length;
                while (r0 < length3) {
                    PolarVoyageTextWatcherForceTitanStrike5172 polarVoyageTextWatcherForceTitanStrike5172 = polarVoyageTextWatcherForceTitanStrike5172Arr[r0];
                    if (polarVoyageTextWatcherForceTitanStrike5172.PolarVoyageItemDecorationUltraDeltaEpic7485 > readInt6 && polarVoyageTextWatcherForceTitanStrike5172.PolarVoyageStrictModeLegendEpic1532()) {
                        PolarVoyageServiceInfoSolarMax5413 polarVoyageServiceInfoSolarMax54134 = PolarVoyageServiceInfoSolarMax5413.REFUSED_STREAM;
                        synchronized (polarVoyageTextWatcherForceTitanStrike5172) {
                            if (polarVoyageTextWatcherForceTitanStrike5172.PolarVoyageItemDecorationUltraDeltaEpic7485() == null) {
                                polarVoyageTextWatcherForceTitanStrike5172.PolarVoyageAnimatorSetSparkUltraMax8233 = polarVoyageServiceInfoSolarMax54134;
                                polarVoyageTextWatcherForceTitanStrike5172.notifyAll();
                            }
                        }
                        polarVoyageLooperAlphaMax5789.PolarVoyageStrictModeLegendEpic1532.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageTextWatcherForceTitanStrike5172.PolarVoyageItemDecorationUltraDeltaEpic7485);
                    }
                    r0++;
                }
                return true;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                try {
                    if (PolarVoyageViewRogueMaster4778 != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + PolarVoyageViewRogueMaster4778);
                    }
                    long readInt8 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.readInt() & 2147483647L;
                    if (readInt8 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    Logger logger2 = PolarVoyageBottomSheetOmegaNeo1907;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(PolarVoyageDrawerLayoutBlazeOmegaUltra4339.PolarVoyageKotlinBetaPulseBeta3653(i2, PolarVoyageViewRogueMaster4778, readInt8, true));
                    }
                    PolarVoyageAnimationPhoenixPhantomNebula5325 polarVoyageAnimationPhoenixPhantomNebula53256 = polarVoyageLooperAlphaMax5789.PolarVoyageStrictModeLegendEpic1532;
                    if (i2 == 0) {
                        synchronized (polarVoyageAnimationPhoenixPhantomNebula53256) {
                            polarVoyageAnimationPhoenixPhantomNebula53256.PolarVoyageActivityInfoBetaQuantum8726 += readInt8;
                            polarVoyageAnimationPhoenixPhantomNebula53256.notifyAll();
                        }
                        return true;
                    }
                    PolarVoyageTextWatcherForceTitanStrike5172 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageAnimationPhoenixPhantomNebula53256.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
                    if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null) {
                        synchronized (PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                            PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageViewRogueMaster4778 += readInt8;
                            if (readInt8 > 0) {
                                PolarVoyageBarcodeScannerInfernoSolarSpark7767.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                } catch (Exception e) {
                    PolarVoyageBottomSheetOmegaNeo1907.fine(PolarVoyageDrawerLayoutBlazeOmegaUltra4339.PolarVoyageMotionLayoutTransitionHeroVision4068(true, i2, PolarVoyageViewRogueMaster4778, 8, i));
                    throw e;
                }
            default:
                this.PolarVoyageItemDecorationUltraDeltaEpic7485.skip(PolarVoyageViewRogueMaster4778);
                return true;
        }
    }

    public final void PolarVoyageStrictModeLegendEpic1532(PolarVoyageLooperAlphaMax5789 polarVoyageLooperAlphaMax5789, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte readByte = this.PolarVoyageItemDecorationUltraDeltaEpic7485.readByte();
            byte[] bArr = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int readInt = this.PolarVoyageItemDecorationUltraDeltaEpic7485.readInt() & Integer.MAX_VALUE;
        List PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageLayerDrawableShadowTitaniumOmega1942(i - 4, i2, i4), i4, i2, i3);
        PolarVoyageAnimationPhoenixPhantomNebula5325 polarVoyageAnimationPhoenixPhantomNebula5325 = polarVoyageLooperAlphaMax5789.PolarVoyageStrictModeLegendEpic1532;
        synchronized (polarVoyageAnimationPhoenixPhantomNebula5325) {
            if (polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageViewBindingPulseHeroSpeed5705.contains(Integer.valueOf(readInt))) {
                polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageCameraPixelBlaze2629(readInt, PolarVoyageServiceInfoSolarMax5413.PROTOCOL_ERROR);
                return;
            }
            polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageViewBindingPulseHeroSpeed5705.add(Integer.valueOf(readInt));
            PolarVoyageDrawerLayoutTurboStrikeTitanium4854.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageContentProviderHyperSpark3838, polarVoyageAnimationPhoenixPhantomNebula5325.PolarVoyageRotateAnimationCyberCelestialDelta4768 + '[' + readInt + "] onRequest", 0L, new PolarVoyageConstraintSetCloneForceCosmosForce9119(polarVoyageAnimationPhoenixPhantomNebula5325, readInt, PolarVoyageBitmapVisionAuroraPixel4705, i5), 6);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.close();
    }
}
