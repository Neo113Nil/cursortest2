package p000createpolar;

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageViewModelScopeSparkEclipseBeta2706 extends PolarVoyageBundlePrimeVortexOmega9817 {
    public final byte[] PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageCameraPixelBlaze2629;
    public int PolarVoyageContentProviderHyperSpark3838;
    public int PolarVoyageDrawableDeltaHyperion5742;
    public int PolarVoyageRemoteModelManagerOlympianCelestial9141 = Integer.MAX_VALUE;
    public final FileInputStream PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageSnackbarGammaEclipse2140;
    public int PolarVoyageViewRogueMaster4778;

    public PolarVoyageViewModelScopeSparkEclipseBeta2706(FileInputStream fileInputStream) {
        Charset charset = PolarVoyageStateFlowOlympianTitan2652.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = fileInputStream;
        this.PolarVoyageBottomSheetOmegaNeo1907 = new byte[4096];
        this.PolarVoyageViewRogueMaster4778 = 0;
        this.PolarVoyageDrawableDeltaHyperion5742 = 0;
        this.PolarVoyageContentProviderHyperSpark3838 = 0;
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final long PolarVoyageActivityInfoBetaQuantum8726() {
        return PolarVoyageAlarmManagerShadowHyperBeta8339();
    }

    public final long PolarVoyageAlarmManagerShadowHyperBeta8339() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.PolarVoyageDrawableDeltaHyperion5742;
        int i2 = this.PolarVoyageViewRogueMaster4778;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.PolarVoyageBottomSheetOmegaNeo1907;
            byte b = bArr[i];
            if (b >= 0) {
                this.PolarVoyageDrawableDeltaHyperion5742 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.PolarVoyageDrawableDeltaHyperion5742 = i4;
                return j;
            }
        }
        return PolarVoyageGuidelineStormSolar2850();
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final String PolarVoyageAlertDialogCyberHeroQuantum3938() {
        int PolarVoyageToolbarEclipseInfernoHero6368 = PolarVoyageToolbarEclipseInfernoHero6368();
        byte[] bArr = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (PolarVoyageToolbarEclipseInfernoHero6368 > 0) {
            int i = this.PolarVoyageViewRogueMaster4778;
            int i2 = this.PolarVoyageDrawableDeltaHyperion5742;
            if (PolarVoyageToolbarEclipseInfernoHero6368 <= i - i2) {
                String str = new String(bArr, i2, PolarVoyageToolbarEclipseInfernoHero6368, PolarVoyageStateFlowOlympianTitan2652.PolarVoyageZipVortexCelestial6185);
                this.PolarVoyageDrawableDeltaHyperion5742 += PolarVoyageToolbarEclipseInfernoHero6368;
                return str;
            }
        }
        if (PolarVoyageToolbarEclipseInfernoHero6368 == 0) {
            return "";
        }
        if (PolarVoyageToolbarEclipseInfernoHero6368 < 0) {
            throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        }
        if (PolarVoyageToolbarEclipseInfernoHero6368 > this.PolarVoyageViewRogueMaster4778) {
            return new String(PolarVoyageFCMCelestialCosmosPixel3711(PolarVoyageToolbarEclipseInfernoHero6368), PolarVoyageStateFlowOlympianTitan2652.PolarVoyageZipVortexCelestial6185);
        }
        PolarVoyageCanvasElitePhoenix4750(PolarVoyageToolbarEclipseInfernoHero6368);
        String str2 = new String(bArr, this.PolarVoyageDrawableDeltaHyperion5742, PolarVoyageToolbarEclipseInfernoHero6368, PolarVoyageStateFlowOlympianTitan2652.PolarVoyageZipVortexCelestial6185);
        this.PolarVoyageDrawableDeltaHyperion5742 += PolarVoyageToolbarEclipseInfernoHero6368;
        return str2;
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final long PolarVoyageAnimatorSetSparkUltraMax8233() {
        return PolarVoyageAlarmManagerShadowHyperBeta8339();
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        return this.PolarVoyageDrawableDeltaHyperion5742 == this.PolarVoyageViewRogueMaster4778 && !PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587(1);
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final int PolarVoyageBitmapMaxTitanTitan7960() {
        return PolarVoyageFlingGestureEclipsePrimeMax1376();
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final boolean PolarVoyageBottomSheetOmegaNeo1907() {
        return PolarVoyageAlarmManagerShadowHyperBeta8339() != 0;
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final double PolarVoyageCameraPixelBlaze2629() {
        return Double.longBitsToDouble(PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149());
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final String PolarVoyageCameraViewSpectraMaxSpectra2824() {
        int PolarVoyageToolbarEclipseInfernoHero6368 = PolarVoyageToolbarEclipseInfernoHero6368();
        int i = this.PolarVoyageDrawableDeltaHyperion5742;
        int i2 = this.PolarVoyageViewRogueMaster4778;
        int i3 = i2 - i;
        byte[] bArr = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (PolarVoyageToolbarEclipseInfernoHero6368 <= i3 && PolarVoyageToolbarEclipseInfernoHero6368 > 0) {
            this.PolarVoyageDrawableDeltaHyperion5742 = i + PolarVoyageToolbarEclipseInfernoHero6368;
        } else {
            if (PolarVoyageToolbarEclipseInfernoHero6368 == 0) {
                return "";
            }
            if (PolarVoyageToolbarEclipseInfernoHero6368 < 0) {
                throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
            }
            i = 0;
            if (PolarVoyageToolbarEclipseInfernoHero6368 <= i2) {
                PolarVoyageCanvasElitePhoenix4750(PolarVoyageToolbarEclipseInfernoHero6368);
                this.PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageToolbarEclipseInfernoHero6368;
            } else {
                bArr = PolarVoyageFCMCelestialCosmosPixel3711(PolarVoyageToolbarEclipseInfernoHero6368);
            }
        }
        return PolarVoyageGradientDrawableSpectraForceCyber5923.PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651(bArr, i, PolarVoyageToolbarEclipseInfernoHero6368);
    }

    public final void PolarVoyageCanvasElitePhoenix4750(int i) {
        if (PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.PolarVoyageContentProviderHyperSpark3838) - this.PolarVoyageDrawableDeltaHyperion5742) {
            throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageBitmapVisionAuroraPixel4705();
        }
        throw new PolarVoyageLooperThreadNeoPhantom1559("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final ArrayList PolarVoyageCardViewAlphaVortexCelestial9747(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.PolarVoyageRotateAnimationCyberCelestialDelta4768.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageBitmapVisionAuroraPixel4705();
                }
                this.PolarVoyageContentProviderHyperSpark3838 += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void PolarVoyageConfigurationMaxSpectraForce5418() {
        int i = this.PolarVoyageViewRogueMaster4778 + this.PolarVoyageCameraPixelBlaze2629;
        this.PolarVoyageViewRogueMaster4778 = i;
        int i2 = this.PolarVoyageContentProviderHyperSpark3838 + i;
        int i3 = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        if (i2 <= i3) {
            this.PolarVoyageCameraPixelBlaze2629 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.PolarVoyageCameraPixelBlaze2629 = i4;
        this.PolarVoyageViewRogueMaster4778 = i - i4;
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final long PolarVoyageContentProviderHyperSpark3838() {
        return PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149();
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final long PolarVoyageDisplayMetricsVortexDragon9516() {
        return PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149();
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final int PolarVoyageDrawableDeltaHyperion5742() {
        return PolarVoyageToolbarEclipseInfernoHero6368();
    }

    public final byte[] PolarVoyageFCMCelestialCosmosPixel3711(int i) {
        byte[] PolarVoyageViewBindingPulseHeroSpeed5705 = PolarVoyageViewBindingPulseHeroSpeed5705(i);
        if (PolarVoyageViewBindingPulseHeroSpeed5705 != null) {
            return PolarVoyageViewBindingPulseHeroSpeed5705;
        }
        int i2 = this.PolarVoyageDrawableDeltaHyperion5742;
        int i3 = this.PolarVoyageViewRogueMaster4778;
        int i4 = i3 - i2;
        this.PolarVoyageContentProviderHyperSpark3838 += i3;
        this.PolarVoyageDrawableDeltaHyperion5742 = 0;
        this.PolarVoyageViewRogueMaster4778 = 0;
        ArrayList PolarVoyageCardViewAlphaVortexCelestial9747 = PolarVoyageCardViewAlphaVortexCelestial9747(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.PolarVoyageBottomSheetOmegaNeo1907, i2, bArr, 0, i4);
        int size = PolarVoyageCardViewAlphaVortexCelestial9747.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = PolarVoyageCardViewAlphaVortexCelestial9747.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public final long PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149() {
        int i = this.PolarVoyageDrawableDeltaHyperion5742;
        if (this.PolarVoyageViewRogueMaster4778 - i < 8) {
            PolarVoyageCanvasElitePhoenix4750(8);
            i = this.PolarVoyageDrawableDeltaHyperion5742;
        }
        this.PolarVoyageDrawableDeltaHyperion5742 = i + 8;
        byte[] bArr = this.PolarVoyageBottomSheetOmegaNeo1907;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int PolarVoyageFlingGestureEclipsePrimeMax1376() {
        int i = this.PolarVoyageDrawableDeltaHyperion5742;
        if (this.PolarVoyageViewRogueMaster4778 - i < 4) {
            PolarVoyageCanvasElitePhoenix4750(4);
            i = this.PolarVoyageDrawableDeltaHyperion5742;
        }
        this.PolarVoyageDrawableDeltaHyperion5742 = i + 4;
        byte[] bArr = this.PolarVoyageBottomSheetOmegaNeo1907;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long PolarVoyageGuidelineStormSolar2850() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.PolarVoyageDrawableDeltaHyperion5742 == this.PolarVoyageViewRogueMaster4778) {
                PolarVoyageCanvasElitePhoenix4750(1);
            }
            int i2 = this.PolarVoyageDrawableDeltaHyperion5742;
            this.PolarVoyageDrawableDeltaHyperion5742 = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.PolarVoyageBottomSheetOmegaNeo1907[i2] & 128) == 0) {
                return j;
            }
        }
        throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageKotlinBetaPulseBeta3653();
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final int PolarVoyageKotlinBetaPulseBeta3653() {
        return this.PolarVoyageContentProviderHyperSpark3838 + this.PolarVoyageDrawableDeltaHyperion5742;
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final int PolarVoyageLayerDrawableShadowTitaniumOmega1942() {
        int PolarVoyageToolbarEclipseInfernoHero6368 = PolarVoyageToolbarEclipseInfernoHero6368();
        return (-(PolarVoyageToolbarEclipseInfernoHero6368 & 1)) ^ (PolarVoyageToolbarEclipseInfernoHero6368 >>> 1);
    }

    public final void PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(int i) {
        int i2 = this.PolarVoyageViewRogueMaster4778;
        int i3 = this.PolarVoyageDrawableDeltaHyperion5742;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.PolarVoyageDrawableDeltaHyperion5742 = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i < 0) {
            throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        }
        int i5 = this.PolarVoyageContentProviderHyperSpark3838;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        if (i7 > i8) {
            PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803((i8 - i5) - i3);
            throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageBitmapVisionAuroraPixel4705();
        }
        this.PolarVoyageContentProviderHyperSpark3838 = i6;
        this.PolarVoyageViewRogueMaster4778 = 0;
        this.PolarVoyageDrawableDeltaHyperion5742 = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long skip = fileInputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (PolarVoyageLooperThreadNeoPhantom1559 e) {
                    e.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.PolarVoyageContentProviderHyperSpark3838 += i4;
                PolarVoyageConfigurationMaxSpectraForce5418();
                throw th;
            }
        }
        this.PolarVoyageContentProviderHyperSpark3838 += i4;
        PolarVoyageConfigurationMaxSpectraForce5418();
        if (i4 >= i) {
            return;
        }
        int i9 = this.PolarVoyageViewRogueMaster4778;
        int i10 = i9 - this.PolarVoyageDrawableDeltaHyperion5742;
        this.PolarVoyageDrawableDeltaHyperion5742 = i9;
        PolarVoyageCanvasElitePhoenix4750(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.PolarVoyageViewRogueMaster4778;
            if (i11 <= i12) {
                this.PolarVoyageDrawableDeltaHyperion5742 = i11;
                return;
            } else {
                i10 += i12;
                this.PolarVoyageDrawableDeltaHyperion5742 = i12;
                PolarVoyageCanvasElitePhoenix4750(1);
            }
        }
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final boolean PolarVoyageLifecycleOlympianOmega3762(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(8);
                return true;
            }
            if (i2 == 2) {
                PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(PolarVoyageToolbarEclipseInfernoHero6368());
                return true;
            }
            if (i2 == 3) {
                PolarVoyageDiffUtilDragonSpeedEclipse6225();
                PolarVoyageMotionLayoutTransitionHeroVision4068(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageMotionLayoutTransitionHeroVision4068();
            }
            PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803(4);
            return true;
        }
        int i4 = this.PolarVoyageViewRogueMaster4778 - this.PolarVoyageDrawableDeltaHyperion5742;
        byte[] bArr = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.PolarVoyageDrawableDeltaHyperion5742;
                this.PolarVoyageDrawableDeltaHyperion5742 = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageKotlinBetaPulseBeta3653();
        }
        while (i3 < 10) {
            if (this.PolarVoyageDrawableDeltaHyperion5742 == this.PolarVoyageViewRogueMaster4778) {
                PolarVoyageCanvasElitePhoenix4750(1);
            }
            int i6 = this.PolarVoyageDrawableDeltaHyperion5742;
            this.PolarVoyageDrawableDeltaHyperion5742 = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageKotlinBetaPulseBeta3653();
        return true;
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final int PolarVoyageLooperThreadAlphaPrime1279() {
        return PolarVoyageToolbarEclipseInfernoHero6368();
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final long PolarVoyageMotionLayoutForceEpicAurora7183() {
        long PolarVoyageAlarmManagerShadowHyperBeta8339 = PolarVoyageAlarmManagerShadowHyperBeta8339();
        return (-(PolarVoyageAlarmManagerShadowHyperBeta8339 & 1)) ^ (PolarVoyageAlarmManagerShadowHyperBeta8339 >>> 1);
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        if (this.PolarVoyageSnackbarGammaEclipse2140 != i) {
            throw new PolarVoyageLooperThreadNeoPhantom1559("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587(int i) {
        FileInputStream fileInputStream = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i2 = this.PolarVoyageDrawableDeltaHyperion5742;
        int i3 = i2 + i;
        int i4 = this.PolarVoyageViewRogueMaster4778;
        if (i3 <= i4) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.PolarVoyageContentProviderHyperSpark3838;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.PolarVoyageRemoteModelManagerOlympianCelestial9141) {
            byte[] bArr = this.PolarVoyageBottomSheetOmegaNeo1907;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.PolarVoyageContentProviderHyperSpark3838 += i2;
                this.PolarVoyageViewRogueMaster4778 -= i2;
                this.PolarVoyageDrawableDeltaHyperion5742 = 0;
            }
            int i6 = this.PolarVoyageViewRogueMaster4778;
            try {
                int read = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.PolarVoyageContentProviderHyperSpark3838) - i6));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.PolarVoyageViewRogueMaster4778 += read;
                    PolarVoyageConfigurationMaxSpectraForce5418();
                    if (this.PolarVoyageViewRogueMaster4778 >= i) {
                        return true;
                    }
                    return PolarVoyageMotionLayoutTransitionUltraAlphaCyber5587(i);
                }
            } catch (PolarVoyageLooperThreadNeoPhantom1559 e) {
                e.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
                throw e;
            }
        }
        return false;
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final int PolarVoyageNavigationViewHyperHyperHyperion1793() {
        return PolarVoyageToolbarEclipseInfernoHero6368();
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final int PolarVoyagePackageManagerCelestialPhoenix8393() {
        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767()) {
            this.PolarVoyageSnackbarGammaEclipse2140 = 0;
            return 0;
        }
        int PolarVoyageToolbarEclipseInfernoHero6368 = PolarVoyageToolbarEclipseInfernoHero6368();
        this.PolarVoyageSnackbarGammaEclipse2140 = PolarVoyageToolbarEclipseInfernoHero6368;
        if ((PolarVoyageToolbarEclipseInfernoHero6368 >>> 3) != 0) {
            return PolarVoyageToolbarEclipseInfernoHero6368;
        }
        throw new PolarVoyageLooperThreadNeoPhantom1559("Protocol message contained an invalid tag (zero).");
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final float PolarVoyageRemoteModelManagerOlympianCelestial9141() {
        return Float.intBitsToFloat(PolarVoyageFlingGestureEclipsePrimeMax1376());
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final int PolarVoyageRotateAnimationCyberCelestialDelta4768(int i) {
        if (i < 0) {
            throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        }
        int i2 = this.PolarVoyageContentProviderHyperSpark3838 + this.PolarVoyageDrawableDeltaHyperion5742 + i;
        if (i2 < 0) {
            throw new PolarVoyageLooperThreadNeoPhantom1559("Failed to parse the message.");
        }
        int i3 = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        if (i2 > i3) {
            throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageBitmapVisionAuroraPixel4705();
        }
        this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = i2;
        PolarVoyageConfigurationMaxSpectraForce5418();
        return i3;
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final int PolarVoyageSnackbarGammaEclipse2140() {
        return PolarVoyageFlingGestureEclipsePrimeMax1376();
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final void PolarVoyageStrictModeLegendEpic1532(int i) {
        this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = i;
        PolarVoyageConfigurationMaxSpectraForce5418();
    }

    public final int PolarVoyageToolbarEclipseInfernoHero6368() {
        int i;
        int i2 = this.PolarVoyageDrawableDeltaHyperion5742;
        int i3 = this.PolarVoyageViewRogueMaster4778;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.PolarVoyageBottomSheetOmegaNeo1907;
            byte b = bArr[i2];
            if (b >= 0) {
                this.PolarVoyageDrawableDeltaHyperion5742 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.PolarVoyageDrawableDeltaHyperion5742 = i5;
                return i;
            }
        }
        return (int) PolarVoyageGuidelineStormSolar2850();
    }

    public final byte[] PolarVoyageViewBindingPulseHeroSpeed5705(int i) {
        if (i == 0) {
            return PolarVoyageStateFlowOlympianTitan2652.PolarVoyageMotionLayoutTransitionHeroVision4068;
        }
        if (i < 0) {
            throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        }
        int i2 = this.PolarVoyageContentProviderHyperSpark3838;
        int i3 = this.PolarVoyageDrawableDeltaHyperion5742;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new PolarVoyageLooperThreadNeoPhantom1559("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        if (i4 > i5) {
            PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803((i5 - i2) - i3);
            throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageBitmapVisionAuroraPixel4705();
        }
        int i6 = this.PolarVoyageViewRogueMaster4778 - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (PolarVoyageLooperThreadNeoPhantom1559 e) {
                e.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.PolarVoyageBottomSheetOmegaNeo1907, this.PolarVoyageDrawableDeltaHyperion5742, bArr, 0, i6);
        this.PolarVoyageContentProviderHyperSpark3838 += this.PolarVoyageViewRogueMaster4778;
        this.PolarVoyageDrawableDeltaHyperion5742 = 0;
        this.PolarVoyageViewRogueMaster4778 = 0;
        while (i6 < i) {
            try {
                int read = fileInputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageBitmapVisionAuroraPixel4705();
                }
                this.PolarVoyageContentProviderHyperSpark3838 += read;
                i6 += read;
            } catch (PolarVoyageLooperThreadNeoPhantom1559 e2) {
                e2.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // p000createpolar.PolarVoyageBundlePrimeVortexOmega9817
    public final PolarVoyageDataBindingInfernoInfernoPixel1843 PolarVoyageViewRogueMaster4778() {
        int PolarVoyageToolbarEclipseInfernoHero6368 = PolarVoyageToolbarEclipseInfernoHero6368();
        int i = this.PolarVoyageViewRogueMaster4778;
        int i2 = this.PolarVoyageDrawableDeltaHyperion5742;
        int i3 = i - i2;
        byte[] bArr = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (PolarVoyageToolbarEclipseInfernoHero6368 <= i3 && PolarVoyageToolbarEclipseInfernoHero6368 > 0) {
            PolarVoyageDataBindingInfernoInfernoPixel1843 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageDataBindingInfernoInfernoPixel1843.PolarVoyageBarcodeScannerInfernoSolarSpark7767(bArr, i2, PolarVoyageToolbarEclipseInfernoHero6368);
            this.PolarVoyageDrawableDeltaHyperion5742 += PolarVoyageToolbarEclipseInfernoHero6368;
            return PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        }
        if (PolarVoyageToolbarEclipseInfernoHero6368 == 0) {
            return PolarVoyageDataBindingInfernoInfernoPixel1843.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        }
        if (PolarVoyageToolbarEclipseInfernoHero6368 < 0) {
            throw PolarVoyageLooperThreadNeoPhantom1559.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        }
        byte[] PolarVoyageViewBindingPulseHeroSpeed5705 = PolarVoyageViewBindingPulseHeroSpeed5705(PolarVoyageToolbarEclipseInfernoHero6368);
        if (PolarVoyageViewBindingPulseHeroSpeed5705 != null) {
            return PolarVoyageDataBindingInfernoInfernoPixel1843.PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageViewBindingPulseHeroSpeed5705, 0, PolarVoyageViewBindingPulseHeroSpeed5705.length);
        }
        int i4 = this.PolarVoyageDrawableDeltaHyperion5742;
        int i5 = this.PolarVoyageViewRogueMaster4778;
        int i6 = i5 - i4;
        this.PolarVoyageContentProviderHyperSpark3838 += i5;
        this.PolarVoyageDrawableDeltaHyperion5742 = 0;
        this.PolarVoyageViewRogueMaster4778 = 0;
        ArrayList PolarVoyageCardViewAlphaVortexCelestial9747 = PolarVoyageCardViewAlphaVortexCelestial9747(PolarVoyageToolbarEclipseInfernoHero6368 - i6);
        byte[] bArr2 = new byte[PolarVoyageToolbarEclipseInfernoHero6368];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        int size = PolarVoyageCardViewAlphaVortexCelestial9747.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = PolarVoyageCardViewAlphaVortexCelestial9747.get(i7);
            i7++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        PolarVoyageDataBindingInfernoInfernoPixel1843 polarVoyageDataBindingInfernoInfernoPixel1843 = PolarVoyageDataBindingInfernoInfernoPixel1843.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        return new PolarVoyageDataBindingInfernoInfernoPixel1843(bArr2);
    }
}
