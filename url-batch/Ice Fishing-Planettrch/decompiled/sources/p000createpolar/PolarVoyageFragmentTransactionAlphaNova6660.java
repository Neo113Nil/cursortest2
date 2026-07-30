package p000createpolar;

import java.io.Closeable;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFragmentTransactionAlphaNova6660 implements Closeable {
    public final PolarVoyageSnackbarSpectraMasterMaster4120 PolarVoyageAnimatorSetSparkUltraMax8233;
    public PolarVoyageVideoCaptureAlphaDeltaPrime3202 PolarVoyageBitmapMaxTitanTitan7960;
    public final boolean PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageCameraPixelBlaze2629;
    public boolean PolarVoyageContentProviderHyperSpark3838;
    public final byte[] PolarVoyageDisplayMetricsVortexDragon9516;
    public long PolarVoyageDrawableDeltaHyperion5742;
    public final PolarVoyageThemeOverlayShadowPulse8967 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageSnackbarSpectraMasterMaster4120 PolarVoyageNavigationViewHyperHyperHyperion1793;
    public boolean PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public boolean PolarVoyageSnackbarGammaEclipse2140;
    public final PolarVoyageCountDownTimerMegaLegendTurbo5868 PolarVoyageStrictModeLegendEpic1532;
    public boolean PolarVoyageViewRogueMaster4778;

    public PolarVoyageFragmentTransactionAlphaNova6660(PolarVoyageThemeOverlayShadowPulse8967 polarVoyageThemeOverlayShadowPulse8967, PolarVoyageCountDownTimerMegaLegendTurbo5868 polarVoyageCountDownTimerMegaLegendTurbo5868, boolean z, boolean z2) {
        polarVoyageThemeOverlayShadowPulse8967.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageThemeOverlayShadowPulse8967;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageCountDownTimerMegaLegendTurbo5868;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = z;
        this.PolarVoyageBottomSheetOmegaNeo1907 = z2;
        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = new PolarVoyageSnackbarSpectraMasterMaster4120();
        this.PolarVoyageAnimatorSetSparkUltraMax8233 = new PolarVoyageSnackbarSpectraMasterMaster4120();
        this.PolarVoyageDisplayMetricsVortexDragon9516 = null;
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        String str;
        short s;
        long j = this.PolarVoyageDrawableDeltaHyperion5742;
        if (j > 0) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageDisplayMetricsVortexDragon9516(j, this.PolarVoyageNavigationViewHyperHyperHyperion1793);
        }
        switch (this.PolarVoyageCameraPixelBlaze2629) {
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
                long j2 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = polarVoyageSnackbarSpectraMasterMaster4120.readShort();
                    str = this.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyagePackageManagerCelestialPhoenix8393();
                    String PolarVoyageItemDecorationUltraDeltaEpic7485 = (s < 1000 || s >= 5000) ? PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Code must be in range [1000,5000): ", s) : ((1004 > s || s >= 1007) && (1015 > s || s >= 3000)) ? null : PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("Code ", s, " is reserved and may not be used.");
                    if (PolarVoyageItemDecorationUltraDeltaEpic7485 != null) {
                        throw new ProtocolException(PolarVoyageItemDecorationUltraDeltaEpic7485);
                    }
                } else {
                    str = "";
                    s = 1005;
                }
                PolarVoyageCountDownTimerMegaLegendTurbo5868 polarVoyageCountDownTimerMegaLegendTurbo5868 = this.PolarVoyageStrictModeLegendEpic1532;
                if (s == -1) {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Failed requirement.");
                    return;
                }
                synchronized (polarVoyageCountDownTimerMegaLegendTurbo5868) {
                    if (polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageAnimatorSetSparkUltraMax8233 != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageAnimatorSetSparkUltraMax8233 = s;
                    polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageBitmapMaxTitanTitan7960 = str;
                }
                polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageZipVortexCelestial6185.getClass();
                this.PolarVoyageViewRogueMaster4778 = true;
                return;
            case 9:
                PolarVoyageCountDownTimerMegaLegendTurbo5868 polarVoyageCountDownTimerMegaLegendTurbo58682 = this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster41202 = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
                PolarVoyagePropertyValuesHolderVortexNeo2967 PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageStrictModeLegendEpic1532);
                synchronized (polarVoyageCountDownTimerMegaLegendTurbo58682) {
                    try {
                        PolarVoyageTextInputEditTextNebulaHero6651.getClass();
                        if (!polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageDisplayMetricsVortexDragon9516 && (!polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageNavigationViewHyperHyperHyperion1793 || !polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageContentProviderHyperSpark3838.isEmpty())) {
                            polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageSnackbarGammaEclipse2140.add(PolarVoyageTextInputEditTextNebulaHero6651);
                            polarVoyageCountDownTimerMegaLegendTurbo58682.PolarVoyageBitmapVisionAuroraPixel4705();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                PolarVoyageCountDownTimerMegaLegendTurbo5868 polarVoyageCountDownTimerMegaLegendTurbo58683 = this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster41203 = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
                PolarVoyagePropertyValuesHolderVortexNeo2967 PolarVoyageTextInputEditTextNebulaHero66512 = polarVoyageSnackbarSpectraMasterMaster41203.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageSnackbarSpectraMasterMaster41203.PolarVoyageStrictModeLegendEpic1532);
                synchronized (polarVoyageCountDownTimerMegaLegendTurbo58683) {
                    PolarVoyageTextInputEditTextNebulaHero66512.getClass();
                    polarVoyageCountDownTimerMegaLegendTurbo58683.PolarVoyageMotionLayoutForceEpicAurora7183 = false;
                }
                return;
            default:
                int i = this.PolarVoyageCameraPixelBlaze2629;
                TimeZone timeZone = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185;
                String hexString = Integer.toHexString(i);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    public final void PolarVoyageBitmapVisionAuroraPixel4705() {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.PolarVoyageViewRogueMaster4778) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("closed");
            return;
        }
        PolarVoyageThemeOverlayShadowPulse8967 polarVoyageThemeOverlayShadowPulse8967 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        long PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageThemeOverlayShadowPulse8967.PolarVoyageKotlinBetaPulseBeta3653().PolarVoyageItemDecorationUltraDeltaEpic7485();
        polarVoyageThemeOverlayShadowPulse8967.PolarVoyageKotlinBetaPulseBeta3653().PolarVoyageMotionLayoutTransitionHeroVision4068();
        try {
            byte readByte = polarVoyageThemeOverlayShadowPulse8967.readByte();
            byte[] bArr = PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185;
            polarVoyageThemeOverlayShadowPulse8967.PolarVoyageKotlinBetaPulseBeta3653().PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageItemDecorationUltraDeltaEpic7485, timeUnit);
            int i = readByte & 15;
            this.PolarVoyageCameraPixelBlaze2629 = i;
            boolean z2 = (readByte & 128) != 0;
            this.PolarVoyageSnackbarGammaEclipse2140 = z2;
            boolean z3 = (readByte & 8) != 0;
            this.PolarVoyageContentProviderHyperSpark3838 = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (readByte & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((readByte & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((readByte & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte readByte2 = polarVoyageThemeOverlayShadowPulse8967.readByte();
            boolean z5 = (readByte2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = readByte2 & Byte.MAX_VALUE;
            this.PolarVoyageDrawableDeltaHyperion5742 = j;
            if (j == 126) {
                this.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageThemeOverlayShadowPulse8967.readShort() & 65535;
            } else if (j == 127) {
                long readLong = polarVoyageThemeOverlayShadowPulse8967.readLong();
                this.PolarVoyageDrawableDeltaHyperion5742 = readLong;
                if (readLong < 0) {
                    long j2 = this.PolarVoyageDrawableDeltaHyperion5742;
                    TimeZone timeZone = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185;
                    String hexString = Long.toHexString(j2);
                    hexString.getClass();
                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.PolarVoyageContentProviderHyperSpark3838 && this.PolarVoyageDrawableDeltaHyperion5742 > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.PolarVoyageDisplayMetricsVortexDragon9516;
                bArr2.getClass();
                polarVoyageThemeOverlayShadowPulse8967.readFully(bArr2);
            }
        } catch (Throwable th) {
            polarVoyageThemeOverlayShadowPulse8967.PolarVoyageKotlinBetaPulseBeta3653().PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageItemDecorationUltraDeltaEpic7485, timeUnit);
            throw th;
        }
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        PolarVoyageBitmapVisionAuroraPixel4705();
        if (this.PolarVoyageContentProviderHyperSpark3838) {
            PolarVoyageBarcodeScannerInfernoSolarSpark7767();
            return;
        }
        int i = this.PolarVoyageCameraPixelBlaze2629;
        if (i != 1 && i != 2) {
            TimeZone timeZone = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185;
            String hexString = Integer.toHexString(i);
            hexString.getClass();
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.PolarVoyageViewRogueMaster4778) {
            long j = this.PolarVoyageDrawableDeltaHyperion5742;
            PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = this.PolarVoyageAnimatorSetSparkUltraMax8233;
            if (j > 0) {
                this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageDisplayMetricsVortexDragon9516(j, polarVoyageSnackbarSpectraMasterMaster4120);
            }
            if (this.PolarVoyageSnackbarGammaEclipse2140) {
                if (this.PolarVoyageRemoteModelManagerOlympianCelestial9141) {
                    PolarVoyageVideoCaptureAlphaDeltaPrime3202 polarVoyageVideoCaptureAlphaDeltaPrime3202 = this.PolarVoyageBitmapMaxTitanTitan7960;
                    if (polarVoyageVideoCaptureAlphaDeltaPrime3202 == null) {
                        polarVoyageVideoCaptureAlphaDeltaPrime3202 = new PolarVoyageVideoCaptureAlphaDeltaPrime3202(1, this.PolarVoyageBottomSheetOmegaNeo1907);
                        this.PolarVoyageBitmapMaxTitanTitan7960 = polarVoyageVideoCaptureAlphaDeltaPrime3202;
                    }
                    PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster41202 = polarVoyageVideoCaptureAlphaDeltaPrime3202.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    if (polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageStrictModeLegendEpic1532 != 0) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Failed requirement.");
                        return;
                    }
                    Inflater inflater = (Inflater) polarVoyageVideoCaptureAlphaDeltaPrime3202.PolarVoyageBottomSheetOmegaNeo1907;
                    if (inflater == null) {
                        inflater = new Inflater(true);
                        polarVoyageVideoCaptureAlphaDeltaPrime3202.PolarVoyageBottomSheetOmegaNeo1907 = inflater;
                    }
                    PolarVoyageInsetDrawableTurboInferno8258 polarVoyageInsetDrawableTurboInferno8258 = (PolarVoyageInsetDrawableTurboInferno8258) polarVoyageVideoCaptureAlphaDeltaPrime3202.PolarVoyageViewRogueMaster4778;
                    if (polarVoyageInsetDrawableTurboInferno8258 == null) {
                        polarVoyageInsetDrawableTurboInferno8258 = new PolarVoyageInsetDrawableTurboInferno8258(new PolarVoyageEventLegendDragon2659(polarVoyageSnackbarSpectraMasterMaster41202), inflater);
                        polarVoyageVideoCaptureAlphaDeltaPrime3202.PolarVoyageViewRogueMaster4778 = polarVoyageInsetDrawableTurboInferno8258;
                    }
                    if (polarVoyageVideoCaptureAlphaDeltaPrime3202.PolarVoyageStrictModeLegendEpic1532) {
                        inflater.reset();
                    }
                    polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageFlingGestureEclipsePrimeMax1376(polarVoyageSnackbarSpectraMasterMaster4120);
                    polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageGuidelineStormSolar2850(65535);
                    long bytesRead = inflater.getBytesRead() + polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageStrictModeLegendEpic1532;
                    do {
                        polarVoyageInsetDrawableTurboInferno8258.PolarVoyageMotionLayoutTransitionHeroVision4068(Long.MAX_VALUE, polarVoyageSnackbarSpectraMasterMaster4120);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                    if (inflater.getBytesRead() < bytesRead) {
                        polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageMotionLayoutTransitionHeroVision4068();
                        polarVoyageInsetDrawableTurboInferno8258.close();
                        polarVoyageVideoCaptureAlphaDeltaPrime3202.PolarVoyageViewRogueMaster4778 = null;
                        polarVoyageVideoCaptureAlphaDeltaPrime3202.PolarVoyageBottomSheetOmegaNeo1907 = null;
                    }
                }
                PolarVoyageCountDownTimerMegaLegendTurbo5868 polarVoyageCountDownTimerMegaLegendTurbo5868 = this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageHandlerThreadFusionForce1494 polarVoyageHandlerThreadFusionForce1494 = polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageZipVortexCelestial6185;
                if (i != 1) {
                    polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532).getClass();
                    polarVoyageHandlerThreadFusionForce1494.getClass();
                    return;
                }
                String PolarVoyagePackageManagerCelestialPhoenix8393 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyagePackageManagerCelestialPhoenix8393();
                polarVoyageHandlerThreadFusionForce1494.getClass();
                polarVoyageHandlerThreadFusionForce1494.PolarVoyageBitmapVisionAuroraPixel4705.getClass();
                polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageMotionLayoutTransitionHeroVision4068(null, 1000);
                polarVoyageHandlerThreadFusionForce1494.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageZipVortexCelestial6185(new PolarVoyageZipNovaStrike2011(PolarVoyagePackageManagerCelestialPhoenix8393));
                return;
            }
            while (!this.PolarVoyageViewRogueMaster4778) {
                PolarVoyageBitmapVisionAuroraPixel4705();
                if (!this.PolarVoyageContentProviderHyperSpark3838) {
                    break;
                } else {
                    PolarVoyageBarcodeScannerInfernoSolarSpark7767();
                }
            }
            if (this.PolarVoyageCameraPixelBlaze2629 != 0) {
                int i2 = this.PolarVoyageCameraPixelBlaze2629;
                TimeZone timeZone2 = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185;
                String hexString2 = Integer.toHexString(i2);
                hexString2.getClass();
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
            }
        }
        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        PolarVoyageVideoCaptureAlphaDeltaPrime3202 polarVoyageVideoCaptureAlphaDeltaPrime3202 = this.PolarVoyageBitmapMaxTitanTitan7960;
        if (polarVoyageVideoCaptureAlphaDeltaPrime3202 != null) {
            PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185(polarVoyageVideoCaptureAlphaDeltaPrime3202);
        }
        PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }
}
