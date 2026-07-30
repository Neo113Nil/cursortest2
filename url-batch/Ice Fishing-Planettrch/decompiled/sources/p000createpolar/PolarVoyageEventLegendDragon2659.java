package p000createpolar;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageEventLegendDragon2659 implements PolarVoyageThemeOverlayShadowPulse8967 {
    public final PolarVoyageRoomDaoRogueGamma6879 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageSnackbarSpectraMasterMaster4120 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageEventLegendDragon2659(PolarVoyageRoomDaoRogueGamma6879 polarVoyageRoomDaoRogueGamma6879) {
        polarVoyageRoomDaoRogueGamma6879.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageRoomDaoRogueGamma6879;
        this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageSnackbarSpectraMasterMaster4120();
    }

    @Override // p000createpolar.PolarVoyageThemeOverlayShadowPulse8967
    public final void PolarVoyageActivityInfoBetaQuantum8726(long j) {
        if (!PolarVoyageBottomSheetOmegaNeo1907(j)) {
            throw new EOFException();
        }
    }

    @Override // p000createpolar.PolarVoyageThemeOverlayShadowPulse8967
    public final String PolarVoyageAnimatorSetSparkUltraMax8233(long j) {
        if (j < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageRotateAnimationCyberCelestialDelta4768("limit < 0: ", j));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767((byte) 10, 0L, j2);
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = this.PolarVoyageStrictModeLegendEpic1532;
        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != -1) {
            return PolarVoyageAnalyticsPhantomHyperionBlaze2174.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageSnackbarSpectraMasterMaster4120);
        }
        if (j2 < Long.MAX_VALUE && PolarVoyageBottomSheetOmegaNeo1907(j2) && polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532(j2 - 1) == 13 && PolarVoyageBottomSheetOmegaNeo1907(j2 + 1) && polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532(j2) == 10) {
            return PolarVoyageAnalyticsPhantomHyperionBlaze2174.PolarVoyageMotionLayoutTransitionHeroVision4068(j2, polarVoyageSnackbarSpectraMasterMaster4120);
        }
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster41202 = new PolarVoyageSnackbarSpectraMasterMaster4120();
        polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageSnackbarSpectraMasterMaster41202, 0L, Math.min(32L, polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532));
        throw new EOFException("\\n not found: limit=" + Math.min(polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532, j) + " content=" + polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageTextInputEditTextNebulaHero6651(polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBitmapVisionAuroraPixel4705() + (char) 8230);
    }

    public final long PolarVoyageBarcodeScannerInfernoSolarSpark7767(byte b, long j, long j2) {
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("closed");
            return 0L;
        }
        if (0 > j2) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageRotateAnimationCyberCelestialDelta4768("fromIndex=0 toIndex=", j2));
            return 0L;
        }
        long j3 = 0;
        while (j3 < j2) {
            PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = this.PolarVoyageStrictModeLegendEpic1532;
            byte b2 = b;
            long j4 = j2;
            long PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageRotateAnimationCyberCelestialDelta4768(b2, j3, j4);
            if (PolarVoyageRotateAnimationCyberCelestialDelta4768 == -1) {
                long j5 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532;
                if (j5 >= j4 || this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageLayerDrawableShadowTitaniumOmega1942(8192L, polarVoyageSnackbarSpectraMasterMaster4120) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return PolarVoyageRotateAnimationCyberCelestialDelta4768;
            }
        }
        return -1L;
    }

    public final int PolarVoyageBitmapVisionAuroraPixel4705() {
        PolarVoyageActivityInfoBetaQuantum8726(4L);
        int readInt = this.PolarVoyageStrictModeLegendEpic1532.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // p000createpolar.PolarVoyageThemeOverlayShadowPulse8967
    public final boolean PolarVoyageBottomSheetOmegaNeo1907(long j) {
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120;
        if (j < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageRotateAnimationCyberCelestialDelta4768("byteCount < 0: ", j));
            return false;
        }
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("closed");
            return false;
        }
        do {
            polarVoyageSnackbarSpectraMasterMaster4120 = this.PolarVoyageStrictModeLegendEpic1532;
            if (polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 >= j) {
                return true;
            }
        } while (this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageLayerDrawableShadowTitaniumOmega1942(8192L, polarVoyageSnackbarSpectraMasterMaster4120) != -1);
        return false;
    }

    public final long PolarVoyageDiffUtilTurboStrike5735() {
        PolarVoyageActivityInfoBetaQuantum8726(8L);
        long readLong = this.PolarVoyageStrictModeLegendEpic1532.readLong();
        return ((readLong & 255) << 56) | (((-72057594037927936L) & readLong) >>> 56) | ((71776119061217280L & readLong) >>> 40) | ((280375465082880L & readLong) >>> 24) | ((1095216660480L & readLong) >>> 8) | ((4278190080L & readLong) << 8) | ((16711680 & readLong) << 24) | ((65280 & readLong) << 40);
    }

    @Override // p000createpolar.PolarVoyageThemeOverlayShadowPulse8967
    public final void PolarVoyageDisplayMetricsVortexDragon9516(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster41202 = this.PolarVoyageStrictModeLegendEpic1532;
        try {
            PolarVoyageActivityInfoBetaQuantum8726(j);
            polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageDisplayMetricsVortexDragon9516(j, polarVoyageSnackbarSpectraMasterMaster4120);
        } catch (EOFException e) {
            polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageFlingGestureEclipsePrimeMax1376(polarVoyageSnackbarSpectraMasterMaster41202);
            throw e;
        }
    }

    @Override // p000createpolar.PolarVoyageThemeOverlayShadowPulse8967
    public final long PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyagePaintFlagsDrawFilterCelestialVortex5562 polarVoyagePaintFlagsDrawFilterCelestialVortex5562) {
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120;
        long j = 0;
        while (true) {
            PolarVoyageRoomDaoRogueGamma6879 polarVoyageRoomDaoRogueGamma6879 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            polarVoyageSnackbarSpectraMasterMaster4120 = this.PolarVoyageStrictModeLegendEpic1532;
            if (polarVoyageRoomDaoRogueGamma6879.PolarVoyageLayerDrawableShadowTitaniumOmega1942(8192L, polarVoyageSnackbarSpectraMasterMaster4120) == -1) {
                break;
            }
            long PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 > 0) {
                j += PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                polarVoyagePaintFlagsDrawFilterCelestialVortex5562.PolarVoyageViewRogueMaster4778(PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageSnackbarSpectraMasterMaster4120);
            }
        }
        long j2 = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        polarVoyagePaintFlagsDrawFilterCelestialVortex5562.PolarVoyageViewRogueMaster4778(j2, polarVoyageSnackbarSpectraMasterMaster4120);
        return j3;
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final PolarVoyageMotionLayoutTransitionPhantomCosmos1553 PolarVoyageKotlinBetaPulseBeta3653() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653();
    }

    @Override // p000createpolar.PolarVoyageRoomDaoRogueGamma6879
    public final long PolarVoyageLayerDrawableShadowTitaniumOmega1942(long j, PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120) {
        polarVoyageSnackbarSpectraMasterMaster4120.getClass();
        if (j < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageRotateAnimationCyberCelestialDelta4768("byteCount < 0: ", j));
            return 0L;
        }
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("closed");
            return 0L;
        }
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster41202 = this.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageStrictModeLegendEpic1532 == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageLayerDrawableShadowTitaniumOmega1942(8192L, polarVoyageSnackbarSpectraMasterMaster41202) == -1) {
                return -1L;
            }
        }
        return polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageLayerDrawableShadowTitaniumOmega1942(Math.min(j, polarVoyageSnackbarSpectraMasterMaster41202.PolarVoyageStrictModeLegendEpic1532), polarVoyageSnackbarSpectraMasterMaster4120);
    }

    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068() {
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("closed");
            return false;
        }
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = this.PolarVoyageStrictModeLegendEpic1532;
        return polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageDiffUtilTurboStrike5735() && this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageLayerDrawableShadowTitaniumOmega1942(8192L, polarVoyageSnackbarSpectraMasterMaster4120) == -1;
    }

    public final String PolarVoyageRotateAnimationCyberCelestialDelta4768(long j) {
        PolarVoyageActivityInfoBetaQuantum8726(j);
        return this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageCameraViewSpectraMaxSpectra2824(j, PolarVoyageLiveDataScopeMasterAurora3603.PolarVoyageZipVortexCelestial6185);
    }

    public final short PolarVoyageStrictModeLegendEpic1532() {
        PolarVoyageActivityInfoBetaQuantum8726(2L);
        return this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageAlertDialogCyberHeroQuantum3938();
    }

    @Override // p000createpolar.PolarVoyageThemeOverlayShadowPulse8967
    public final PolarVoyagePropertyValuesHolderVortexNeo2967 PolarVoyageTextInputEditTextNebulaHero6651(long j) {
        PolarVoyageActivityInfoBetaQuantum8726(j);
        return this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageTextInputEditTextNebulaHero6651(j);
    }

    @Override // p000createpolar.PolarVoyageThemeOverlayShadowPulse8967
    public final PolarVoyageSnackbarSpectraMasterMaster4120 PolarVoyageZipVortexCelestial6185() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            return;
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = true;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.close();
        this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageMotionLayoutTransitionHeroVision4068();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = this.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 == 0 && this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageLayerDrawableShadowTitaniumOmega1942(8192L, polarVoyageSnackbarSpectraMasterMaster4120) == -1) {
            return -1;
        }
        return polarVoyageSnackbarSpectraMasterMaster4120.read(byteBuffer);
    }

    @Override // p000createpolar.PolarVoyageThemeOverlayShadowPulse8967
    public final byte readByte() {
        PolarVoyageActivityInfoBetaQuantum8726(1L);
        return this.PolarVoyageStrictModeLegendEpic1532.readByte();
    }

    @Override // p000createpolar.PolarVoyageThemeOverlayShadowPulse8967
    public final void readFully(byte[] bArr) {
        PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = this.PolarVoyageStrictModeLegendEpic1532;
        bArr.getClass();
        try {
            PolarVoyageActivityInfoBetaQuantum8726(bArr.length);
            polarVoyageSnackbarSpectraMasterMaster4120.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532;
                if (j <= 0) {
                    throw e;
                }
                int read = polarVoyageSnackbarSpectraMasterMaster4120.read(bArr, i, (int) j);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
        }
    }

    @Override // p000createpolar.PolarVoyageThemeOverlayShadowPulse8967
    public final int readInt() {
        PolarVoyageActivityInfoBetaQuantum8726(4L);
        return this.PolarVoyageStrictModeLegendEpic1532.readInt();
    }

    @Override // p000createpolar.PolarVoyageThemeOverlayShadowPulse8967
    public final long readLong() {
        PolarVoyageActivityInfoBetaQuantum8726(8L);
        return this.PolarVoyageStrictModeLegendEpic1532.readLong();
    }

    @Override // p000createpolar.PolarVoyageThemeOverlayShadowPulse8967
    public final short readShort() {
        PolarVoyageActivityInfoBetaQuantum8726(2L);
        return this.PolarVoyageStrictModeLegendEpic1532.readShort();
    }

    @Override // p000createpolar.PolarVoyageThemeOverlayShadowPulse8967
    public final void skip(long j) {
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("closed");
            return;
        }
        while (j > 0) {
            PolarVoyageSnackbarSpectraMasterMaster4120 polarVoyageSnackbarSpectraMasterMaster4120 = this.PolarVoyageStrictModeLegendEpic1532;
            if (polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532 == 0 && this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageLayerDrawableShadowTitaniumOmega1942(8192L, polarVoyageSnackbarSpectraMasterMaster4120) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, polarVoyageSnackbarSpectraMasterMaster4120.PolarVoyageStrictModeLegendEpic1532);
            polarVoyageSnackbarSpectraMasterMaster4120.skip(min);
            j -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.PolarVoyageItemDecorationUltraDeltaEpic7485 + ')';
    }
}
