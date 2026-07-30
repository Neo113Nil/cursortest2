package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageSharedElementSpectraNeo7351 {
    public final PolarVoyageRoomDatabaseMegaCosmosShadow1862[] PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public int PolarVoyageBitmapVisionAuroraPixel4705;
    public final float[] PolarVoyageDiffUtilTurboStrike5735;
    public final float[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final PolarVoyageViewModelEliteInferno4596 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final float[] PolarVoyageTextInputEditTextNebulaHero6651;
    public final boolean PolarVoyageZipVortexCelestial6185;

    public PolarVoyageSharedElementSpectraNeo7351(boolean z, PolarVoyageViewModelEliteInferno4596 polarVoyageViewModelEliteInferno4596) {
        int i;
        this.PolarVoyageZipVortexCelestial6185 = z;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageViewModelEliteInferno4596;
        if (z && polarVoyageViewModelEliteInferno4596.equals(PolarVoyageViewModelEliteInferno4596.PolarVoyageItemDecorationUltraDeltaEpic7485)) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = polarVoyageViewModelEliteInferno4596.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                PolarVoyageAdapterFusionMasterGamma8495.PolarVoyageMotionLayoutTransitionHeroVision4068();
                throw null;
            }
            i = 2;
        }
        this.PolarVoyageKotlinBetaPulseBeta3653 = i;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageRoomDatabaseMegaCosmosShadow1862[20];
        this.PolarVoyageDiffUtilTurboStrike5735 = new float[20];
        this.PolarVoyageTextInputEditTextNebulaHero6651 = new float[20];
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new float[3];
    }

    public final float PolarVoyageMotionLayoutTransitionHeroVision4068(float f) {
        PolarVoyageViewModelEliteInferno4596 polarVoyageViewModelEliteInferno4596;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (f <= 0.0f) {
            PolarVoyagePackageManagerUltraQuantumInferno5642.PolarVoyageMotionLayoutTransitionHeroVision4068("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.PolarVoyageBitmapVisionAuroraPixel4705;
        PolarVoyageRoomDatabaseMegaCosmosShadow1862[] polarVoyageRoomDatabaseMegaCosmosShadow1862Arr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageRoomDatabaseMegaCosmosShadow1862 polarVoyageRoomDatabaseMegaCosmosShadow1862 = polarVoyageRoomDatabaseMegaCosmosShadow1862Arr[i2];
        if (polarVoyageRoomDatabaseMegaCosmosShadow1862 == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            PolarVoyageRoomDatabaseMegaCosmosShadow1862 polarVoyageRoomDatabaseMegaCosmosShadow18622 = polarVoyageRoomDatabaseMegaCosmosShadow1862;
            while (true) {
                PolarVoyageRoomDatabaseMegaCosmosShadow1862 polarVoyageRoomDatabaseMegaCosmosShadow18623 = polarVoyageRoomDatabaseMegaCosmosShadow1862Arr[i2];
                boolean z2 = this.PolarVoyageZipVortexCelestial6185;
                polarVoyageViewModelEliteInferno4596 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                fArr = this.PolarVoyageDiffUtilTurboStrike5735;
                fArr2 = this.PolarVoyageTextInputEditTextNebulaHero6651;
                if (polarVoyageRoomDatabaseMegaCosmosShadow18623 != null) {
                    long j = polarVoyageRoomDatabaseMegaCosmosShadow1862.PolarVoyageZipVortexCelestial6185;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = polarVoyageRoomDatabaseMegaCosmosShadow18623.PolarVoyageZipVortexCelestial6185;
                    float f6 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = Math.abs(j2 - polarVoyageRoomDatabaseMegaCosmosShadow18622.PolarVoyageZipVortexCelestial6185);
                    polarVoyageRoomDatabaseMegaCosmosShadow18622 = (polarVoyageViewModelEliteInferno4596 == PolarVoyageViewModelEliteInferno4596.PolarVoyageItemDecorationUltraDeltaEpic7485 || z) ? polarVoyageRoomDatabaseMegaCosmosShadow18623 : polarVoyageRoomDatabaseMegaCosmosShadow1862;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = polarVoyageRoomDatabaseMegaCosmosShadow18623.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    fArr2[i3] = -f6;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    f5 = f2;
                } else {
                    f2 = f5;
                    z = z2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.PolarVoyageKotlinBetaPulseBeta3653) {
                int ordinal = polarVoyageViewModelEliteInferno4596.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                        PolarVoyageCountDownTimerCyberEpicDelta8302.PolarVoyageCameraPixelBlaze2629(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f4 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        PolarVoyageAdapterFusionMasterGamma8495.PolarVoyageMotionLayoutTransitionHeroVision4068();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f7 = fArr2[i5];
                    int i6 = i5;
                    float f8 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f9 = fArr2[i7];
                        if (f7 != f9) {
                            float f10 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f4 = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
                }
                f3 = f4 * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f11 = -f;
            if (f3 < f11) {
                return f11;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public final void PolarVoyageZipVortexCelestial6185(long j, float f) {
        int i = (this.PolarVoyageBitmapVisionAuroraPixel4705 + 1) % 20;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = i;
        PolarVoyageRoomDatabaseMegaCosmosShadow1862[] polarVoyageRoomDatabaseMegaCosmosShadow1862Arr = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageRoomDatabaseMegaCosmosShadow1862 polarVoyageRoomDatabaseMegaCosmosShadow1862 = polarVoyageRoomDatabaseMegaCosmosShadow1862Arr[i];
        if (polarVoyageRoomDatabaseMegaCosmosShadow1862 != null) {
            polarVoyageRoomDatabaseMegaCosmosShadow1862.PolarVoyageZipVortexCelestial6185 = j;
            polarVoyageRoomDatabaseMegaCosmosShadow1862.PolarVoyageMotionLayoutTransitionHeroVision4068 = f;
        } else {
            PolarVoyageRoomDatabaseMegaCosmosShadow1862 polarVoyageRoomDatabaseMegaCosmosShadow18622 = new PolarVoyageRoomDatabaseMegaCosmosShadow1862();
            polarVoyageRoomDatabaseMegaCosmosShadow18622.PolarVoyageZipVortexCelestial6185 = j;
            polarVoyageRoomDatabaseMegaCosmosShadow18622.PolarVoyageMotionLayoutTransitionHeroVision4068 = f;
            polarVoyageRoomDatabaseMegaCosmosShadow1862Arr[i] = polarVoyageRoomDatabaseMegaCosmosShadow18622;
        }
    }

    public /* synthetic */ PolarVoyageSharedElementSpectraNeo7351() {
        this(false, PolarVoyageViewModelEliteInferno4596.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    public PolarVoyageSharedElementSpectraNeo7351(int i) {
        this(true, PolarVoyageViewModelEliteInferno4596.PolarVoyageStrictModeLegendEpic1532);
    }
}
