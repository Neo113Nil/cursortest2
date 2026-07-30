package p000createpolar;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLicensingForceSpeedTitan5766 {
    public static final Logger PolarVoyageDiffUtilTurboStrike5735 = Logger.getLogger(PolarVoyageLicensingForceSpeedTitan5766.class.getName());
    public static final boolean PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageNestedScrollViewStormHero6620.PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final PolarVoyageViewModelScopeMegaThunder5099 PolarVoyageBitmapVisionAuroraPixel4705;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final byte[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public PolarVoyageRealtimeDatabaseEclipseUltra8894 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageLicensingForceSpeedTitan5766(PolarVoyageViewModelScopeMegaThunder5099 polarVoyageViewModelScopeMegaThunder5099, int i) {
        if (i < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i, 20);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new byte[max];
        this.PolarVoyageKotlinBetaPulseBeta3653 = max;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageViewModelScopeMegaThunder5099;
    }

    public static int PolarVoyageDiffUtilTurboStrike5735(int i, PolarVoyageDataBindingInfernoInfernoPixel1843 polarVoyageDataBindingInfernoInfernoPixel1843) {
        int PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(i);
        int size = polarVoyageDataBindingInfernoInfernoPixel1843.size();
        return PolarVoyageStrictModeLegendEpic1532(size) + size + PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    public static int PolarVoyageItemDecorationUltraDeltaEpic7485(int i) {
        return PolarVoyageStrictModeLegendEpic1532(i << 3);
    }

    public static int PolarVoyageRotateAnimationCyberCelestialDelta4768(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int PolarVoyageStrictModeLegendEpic1532(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int PolarVoyageTextInputEditTextNebulaHero6651(String str) {
        int length;
        try {
            length = PolarVoyageGradientDrawableSpectraForceCyber5923.PolarVoyageZipVortexCelestial6185(str);
        } catch (PolarVoyageRippleDrawableCelestialVisionThunder3244 unused) {
            length = str.getBytes(PolarVoyageStateFlowOlympianTitan2652.PolarVoyageZipVortexCelestial6185).length;
        }
        return PolarVoyageStrictModeLegendEpic1532(length) + length;
    }

    public final void PolarVoyageActivityInfoBetaQuantum8726(int i, int i2) {
        PolarVoyageDiffUtilDragonSpeedEclipse6225((i << 3) | i2);
    }

    public final void PolarVoyageAlertDialogCyberHeroQuantum3938(byte[] bArr, int i, int i2) {
        PolarVoyageDrawableDeltaHyperion5742(bArr, i, i2);
    }

    public final void PolarVoyageAnimatorSetSparkUltraMax8233(int i) {
        PolarVoyageViewRogueMaster4778(4);
        PolarVoyageZipVortexCelestial6185(i);
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i) {
        boolean z = PolarVoyageTextInputEditTextNebulaHero6651;
        byte[] bArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (i2 == 0) {
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i3 + 1;
                    PolarVoyageNestedScrollViewStormHero6620.PolarVoyageRotateAnimationCyberCelestialDelta4768(bArr, i3, (byte) i);
                    return;
                } else {
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i3 + 1;
                    PolarVoyageNestedScrollViewStormHero6620.PolarVoyageRotateAnimationCyberCelestialDelta4768(bArr, i3, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (i4 == 0) {
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    public final void PolarVoyageBitmapMaxTitanTitan7960(int i, long j) {
        PolarVoyageViewRogueMaster4778(18);
        PolarVoyageKotlinBetaPulseBeta3653(i, 1);
        PolarVoyageMotionLayoutTransitionHeroVision4068(j);
    }

    public final void PolarVoyageBitmapVisionAuroraPixel4705(long j) {
        boolean z = PolarVoyageTextInputEditTextNebulaHero6651;
        byte[] bArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (j2 == 0) {
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i + 1;
                    PolarVoyageNestedScrollViewStormHero6620.PolarVoyageRotateAnimationCyberCelestialDelta4768(bArr, i, (byte) j);
                    return;
                } else {
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i + 1;
                    PolarVoyageNestedScrollViewStormHero6620.PolarVoyageRotateAnimationCyberCelestialDelta4768(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                if (j3 == 0) {
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    public final void PolarVoyageBottomSheetOmegaNeo1907() {
        this.PolarVoyageBitmapVisionAuroraPixel4705.write(this.PolarVoyageMotionLayoutTransitionHeroVision4068, 0, this.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
    }

    public final void PolarVoyageCameraPixelBlaze2629(byte b) {
        if (this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == this.PolarVoyageKotlinBetaPulseBeta3653) {
            PolarVoyageBottomSheetOmegaNeo1907();
        }
        int i = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i + 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068[i] = b;
    }

    public final void PolarVoyageCameraViewSpectraMaxSpectra2824(int i, PolarVoyageFlowCollectorPixelTurbo5520 polarVoyageFlowCollectorPixelTurbo5520, PolarVoyageViewPager2FusionSpectra7498 polarVoyageViewPager2FusionSpectra7498) {
        PolarVoyageActivityInfoBetaQuantum8726(i, 2);
        PolarVoyageDiffUtilDragonSpeedEclipse6225(polarVoyageFlowCollectorPixelTurbo5520.PolarVoyageZipVortexCelestial6185(polarVoyageViewPager2FusionSpectra7498));
        polarVoyageViewPager2FusionSpectra7498.PolarVoyageZipVortexCelestial6185(polarVoyageFlowCollectorPixelTurbo5520, this.PolarVoyageZipVortexCelestial6185);
    }

    public final void PolarVoyageContentProviderHyperSpark3838(int i, PolarVoyageDataBindingInfernoInfernoPixel1843 polarVoyageDataBindingInfernoInfernoPixel1843) {
        PolarVoyageActivityInfoBetaQuantum8726(i, 2);
        PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageDataBindingInfernoInfernoPixel1843);
    }

    public final void PolarVoyageDiffUtilDragonSpeedEclipse6225(int i) {
        PolarVoyageViewRogueMaster4778(5);
        PolarVoyageBarcodeScannerInfernoSolarSpark7767(i);
    }

    public final void PolarVoyageDisplayMetricsVortexDragon9516(long j) {
        PolarVoyageViewRogueMaster4778(8);
        PolarVoyageMotionLayoutTransitionHeroVision4068(j);
    }

    public final void PolarVoyageDrawableDeltaHyperion5742(byte[] bArr, int i, int i2) {
        int i3 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i4 = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i5 = i4 - i3;
        byte[] bArr2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i4;
        PolarVoyageBottomSheetOmegaNeo1907();
        if (i7 > i4) {
            this.PolarVoyageBitmapVisionAuroraPixel4705.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i7;
        }
    }

    public final void PolarVoyageFCMCelestialCosmosPixel3711(int i, long j) {
        PolarVoyageViewRogueMaster4778(20);
        PolarVoyageKotlinBetaPulseBeta3653(i, 0);
        PolarVoyageBitmapVisionAuroraPixel4705(j);
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(int i, int i2) {
        PolarVoyageBarcodeScannerInfernoSolarSpark7767((i << 3) | i2);
    }

    public final void PolarVoyageLayerDrawableShadowTitaniumOmega1942(int i, int i2) {
        PolarVoyageViewRogueMaster4778(20);
        PolarVoyageKotlinBetaPulseBeta3653(i, 0);
        if (i2 >= 0) {
            PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
        } else {
            PolarVoyageBitmapVisionAuroraPixel4705(i2);
        }
    }

    public final void PolarVoyageLifecycleOlympianOmega3762(int i, int i2) {
        PolarVoyageViewRogueMaster4778(20);
        PolarVoyageKotlinBetaPulseBeta3653(i, 0);
        PolarVoyageBarcodeScannerInfernoSolarSpark7767(i2);
    }

    public final void PolarVoyageLooperThreadAlphaPrime1279(String str) {
        try {
            int length = str.length() * 3;
            int PolarVoyageStrictModeLegendEpic1532 = PolarVoyageStrictModeLegendEpic1532(length);
            int i = PolarVoyageStrictModeLegendEpic1532 + length;
            int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageGradientDrawableSpectraForceCyber5923.PolarVoyageZipVortexCelestial6185.PolarVoyageItemDecorationUltraDeltaEpic7485(str, bArr, 0, length);
                PolarVoyageDiffUtilDragonSpeedEclipse6225(PolarVoyageItemDecorationUltraDeltaEpic7485);
                PolarVoyageDrawableDeltaHyperion5742(bArr, 0, PolarVoyageItemDecorationUltraDeltaEpic7485);
                return;
            }
            if (i > i2 - this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                PolarVoyageBottomSheetOmegaNeo1907();
            }
            int PolarVoyageStrictModeLegendEpic15322 = PolarVoyageStrictModeLegendEpic1532(str.length());
            int i3 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            byte[] bArr2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            try {
                try {
                    if (PolarVoyageStrictModeLegendEpic15322 == PolarVoyageStrictModeLegendEpic1532) {
                        int i4 = i3 + PolarVoyageStrictModeLegendEpic15322;
                        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i4;
                        int PolarVoyageItemDecorationUltraDeltaEpic74852 = PolarVoyageGradientDrawableSpectraForceCyber5923.PolarVoyageZipVortexCelestial6185.PolarVoyageItemDecorationUltraDeltaEpic7485(str, bArr2, i4, i2 - i4);
                        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i3;
                        PolarVoyageBarcodeScannerInfernoSolarSpark7767((PolarVoyageItemDecorationUltraDeltaEpic74852 - i3) - PolarVoyageStrictModeLegendEpic15322);
                        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageItemDecorationUltraDeltaEpic74852;
                    } else {
                        int PolarVoyageZipVortexCelestial6185 = PolarVoyageGradientDrawableSpectraForceCyber5923.PolarVoyageZipVortexCelestial6185(str);
                        PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageZipVortexCelestial6185);
                        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageGradientDrawableSpectraForceCyber5923.PolarVoyageZipVortexCelestial6185.PolarVoyageItemDecorationUltraDeltaEpic7485(str, bArr2, this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, PolarVoyageZipVortexCelestial6185);
                    }
                } catch (PolarVoyageRippleDrawableCelestialVisionThunder3244 e) {
                    this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i3;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new PolarVoyageConstraintSetHeroNovaTitanium3703(e2);
            }
        } catch (PolarVoyageRippleDrawableCelestialVisionThunder3244 e3) {
            PolarVoyageDiffUtilTurboStrike5735.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(PolarVoyageStateFlowOlympianTitan2652.PolarVoyageZipVortexCelestial6185);
            try {
                PolarVoyageDiffUtilDragonSpeedEclipse6225(bytes.length);
                PolarVoyageAlertDialogCyberHeroQuantum3938(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new PolarVoyageConstraintSetHeroNovaTitanium3703(e4);
            }
        }
    }

    public final void PolarVoyageMotionLayoutForceEpicAurora7183(int i) {
        if (i >= 0) {
            PolarVoyageDiffUtilDragonSpeedEclipse6225(i);
        } else {
            PolarVoyageViewBindingPulseHeroSpeed5705(i);
        }
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(long j) {
        int i = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i2 = i + 1;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2;
        byte[] bArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void PolarVoyageNavigationViewHyperHyperHyperion1793(int i, int i2) {
        PolarVoyageViewRogueMaster4778(14);
        PolarVoyageKotlinBetaPulseBeta3653(i, 5);
        PolarVoyageZipVortexCelestial6185(i2);
    }

    public final void PolarVoyagePackageManagerCelestialPhoenix8393(String str, int i) {
        PolarVoyageActivityInfoBetaQuantum8726(i, 2);
        PolarVoyageLooperThreadAlphaPrime1279(str);
    }

    public final void PolarVoyageRemoteModelManagerOlympianCelestial9141(PolarVoyageDataBindingInfernoInfernoPixel1843 polarVoyageDataBindingInfernoInfernoPixel1843) {
        PolarVoyageDiffUtilDragonSpeedEclipse6225(polarVoyageDataBindingInfernoInfernoPixel1843.size());
        PolarVoyageAlertDialogCyberHeroQuantum3938(polarVoyageDataBindingInfernoInfernoPixel1843.PolarVoyageStrictModeLegendEpic1532, polarVoyageDataBindingInfernoInfernoPixel1843.PolarVoyageDiffUtilTurboStrike5735(), polarVoyageDataBindingInfernoInfernoPixel1843.size());
    }

    public final void PolarVoyageSnackbarGammaEclipse2140(int i, boolean z) {
        PolarVoyageViewRogueMaster4778(11);
        PolarVoyageKotlinBetaPulseBeta3653(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2 + 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068[i2] = b;
    }

    public final void PolarVoyageViewBindingPulseHeroSpeed5705(long j) {
        PolarVoyageViewRogueMaster4778(10);
        PolarVoyageBitmapVisionAuroraPixel4705(j);
    }

    public final void PolarVoyageViewRogueMaster4778(int i) {
        if (this.PolarVoyageKotlinBetaPulseBeta3653 - this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 < i) {
            PolarVoyageBottomSheetOmegaNeo1907();
        }
    }

    public final void PolarVoyageZipVortexCelestial6185(int i) {
        int i2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i3 = i2 + 1;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i3;
        byte[] bArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }
}
