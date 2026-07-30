package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTextWatcherHyperionThunderThunder5885 implements PolarVoyageConstraintSetCloneInfernoEliteDelta1883 {
    public final float PolarVoyageBottomSheetOmegaNeo1907;
    public final float PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final float PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final float PolarVoyageStrictModeLegendEpic1532;
    public final float PolarVoyageViewRogueMaster4778;

    public PolarVoyageTextWatcherHyperionThunderThunder5885(float f, float f2, float f3) {
        int PolarVoyageHandlerThreadMaxAurora5064;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = f;
        this.PolarVoyageStrictModeLegendEpic1532 = f2;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = f3;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(1.0f)) {
            PolarVoyageProcessCameraProviderSpeedDelta5787.PolarVoyageZipVortexCelestial6185("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", 1.0.");
        }
        float[] fArr = new float[5];
        float f4 = (f2 - 0.0f) * 3.0f;
        float f5 = (1.0f - f2) * 3.0f;
        double d = f4;
        double d2 = f5;
        double d3 = 2.0d * d2;
        double d4 = (d - d3) + 0.0d;
        if (d4 == 0.0d) {
            PolarVoyageHandlerThreadMaxAurora5064 = d2 == 0.0d ? 0 : PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageHandlerThreadMaxAurora5064((float) ((d3 - 0.0d) / (d3 - 0.0d)), fArr, 0);
        } else {
            double d5 = -Math.sqrt((d2 * d2) - (0.0d * d));
            double d6 = (-d) + d2;
            int PolarVoyageHandlerThreadMaxAurora50642 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageHandlerThreadMaxAurora5064((float) ((-(d5 + d6)) / d4), fArr, 0);
            PolarVoyageHandlerThreadMaxAurora5064 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageHandlerThreadMaxAurora5064((float) ((d5 - d6) / d4), fArr, PolarVoyageHandlerThreadMaxAurora50642) + PolarVoyageHandlerThreadMaxAurora50642;
            if (PolarVoyageHandlerThreadMaxAurora5064 > 1) {
                float f6 = fArr[0];
                float f7 = fArr[1];
                if (f6 > f7) {
                    fArr[0] = f7;
                    fArr[1] = f6;
                } else if (f6 == f7) {
                    PolarVoyageHandlerThreadMaxAurora5064--;
                }
            }
        }
        float f8 = (f5 - f4) * 2.0f;
        int PolarVoyageHandlerThreadMaxAurora50643 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageHandlerThreadMaxAurora5064((-f8) / (((0.0f - f5) * 2.0f) - f8), fArr, PolarVoyageHandlerThreadMaxAurora5064) + PolarVoyageHandlerThreadMaxAurora5064;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i = 0; i < PolarVoyageHandlerThreadMaxAurora50643; i++) {
            float f9 = fArr[i];
            float f10 = (((((((((f2 - 1.0f) * 3.0f) + 1.0f) - 0.0f) * f9) + (((1.0f - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f9) + f4) * f9) + 0.0f;
            min = Math.min(min, f10);
            max = Math.max(max, f10);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.PolarVoyageBottomSheetOmegaNeo1907 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.PolarVoyageViewRogueMaster4778 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fb, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0228, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        r15 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e0, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b3, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0252  */
    @Override // p000createpolar.PolarVoyageConstraintSetCloneInfernoEliteDelta1883
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float PolarVoyageMotionLayoutTransitionHeroVision4068(float f) {
        boolean isNaN;
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float max = Math.max(f, 1.1920929E-7f);
        float f2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        float f3 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        float f4 = f3 - max;
        double d = 0.0f - max;
        float f5 = 0.0f;
        double d2 = ((d - ((f2 - max) * 2.0d)) + f4) * 3.0d;
        double d3 = (r7 - r5) * 3.0d;
        double d4 = ((r7 - f4) * 3.0d) + (-r5) + (1.0f - max);
        float f6 = Float.NaN;
        if (Math.abs(d4 - 0.0d) >= 1.0E-7d) {
            double d5 = d2 / d4;
            double d6 = d3 / d4;
            double d7 = d / d4;
            double d8 = ((d6 * 3.0d) - (d5 * d5)) / 9.0d;
            double d9 = ((d7 * 27.0d) + ((((2.0d * d5) * d5) * d5) - ((9.0d * d5) * d6))) / 54.0d;
            double d10 = d8 * d8 * d8;
            double d11 = (d9 * d9) + d10;
            double d12 = d5 / 3.0d;
            if (d11 < 0.0d) {
                double sqrt = Math.sqrt(-d10);
                double d13 = (-d9) / sqrt;
                if (d13 < -1.0d) {
                    d13 = -1.0d;
                }
                if (d13 > 1.0d) {
                    d13 = 1.0d;
                }
                double acos = Math.acos(d13);
                double PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDrawableDeltaHyperion5742((float) sqrt) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * PolarVoyageDrawableDeltaHyperion5742) - d12);
                float f7 = cos < 0.0f ? 0.0f : cos;
                if (f7 > 1.0f) {
                    f7 = 1.0f;
                }
                if (Math.abs(f7 - cos) > 1.05E-6f) {
                    f7 = Float.NaN;
                }
                if (Float.isNaN(f7)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * PolarVoyageDrawableDeltaHyperion5742) - d12);
                    f7 = cos2 < 0.0f ? 0.0f : cos2;
                    if (f7 > 1.0f) {
                        f7 = 1.0f;
                    }
                    if (Math.abs(f7 - cos2) > 1.05E-6f) {
                        f7 = Float.NaN;
                    }
                    if (Float.isNaN(f7)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * PolarVoyageDrawableDeltaHyperion5742) - d12);
                        if (cos3 >= 0.0f) {
                            f5 = cos3;
                        }
                        if (f5 > 1.0f) {
                            f5 = 1.0f;
                        }
                    }
                }
                f6 = f7;
                isNaN = Float.isNaN(f6);
                float f8 = this.PolarVoyageStrictModeLegendEpic1532;
                if (isNaN) {
                }
            } else if (d11 == 0.0d) {
                float f9 = -PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDrawableDeltaHyperion5742((float) d9);
                float f10 = (float) d12;
                float f11 = (f9 * 2.0f) - f10;
                float f12 = f11 < 0.0f ? 0.0f : f11;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                if (Math.abs(f12 - f11) > 1.05E-6f) {
                    f12 = Float.NaN;
                }
                if (Float.isNaN(f12)) {
                    float f13 = (-f9) - f10;
                    if (f13 >= 0.0f) {
                        f5 = f13;
                    }
                    if (f5 > 1.0f) {
                        f5 = 1.0f;
                    }
                } else {
                    f6 = f12;
                }
                isNaN = Float.isNaN(f6);
                float f82 = this.PolarVoyageStrictModeLegendEpic1532;
                if (isNaN) {
                }
            } else {
                double sqrt2 = Math.sqrt(d11);
                float PolarVoyageDrawableDeltaHyperion57422 = (float) ((PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDrawableDeltaHyperion5742((float) ((-d9) + sqrt2)) - PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDrawableDeltaHyperion5742((float) (d9 + sqrt2))) - d12);
                if (PolarVoyageDrawableDeltaHyperion57422 >= 0.0f) {
                    f5 = PolarVoyageDrawableDeltaHyperion57422;
                }
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
            }
        } else {
            if (Math.abs(d2 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
                    float f14 = (float) ((-d) / d3);
                    if (f14 >= 0.0f) {
                        f5 = f14;
                    }
                    if (f5 > 1.0f) {
                        f5 = 1.0f;
                    }
                }
                isNaN = Float.isNaN(f6);
                float f822 = this.PolarVoyageStrictModeLegendEpic1532;
                if (isNaN) {
                    float f15 = ((((((f822 - 1.0f) + 0.33333334f) * f6) + (1.0f - (2.0f * f822))) * f6) + f822) * 3.0f * f6;
                    float f16 = this.PolarVoyageBottomSheetOmegaNeo1907;
                    if (f15 < f16) {
                        f15 = f16;
                    }
                    float f17 = this.PolarVoyageViewRogueMaster4778;
                    return f15 > f17 ? f17 : f15;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f2 + ", " + f822 + ", " + f3 + ", 1.0) has no solution at " + f);
            }
            double sqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d14 = d2 * 2.0d;
            float f18 = (float) ((sqrt3 - d3) / d14);
            float f19 = f18 < 0.0f ? 0.0f : f18;
            if (f19 > 1.0f) {
                f19 = 1.0f;
            }
            if (Math.abs(f19 - f18) > 1.05E-6f) {
                f19 = Float.NaN;
            }
            if (Float.isNaN(f19)) {
                float f20 = (float) (((-d3) - sqrt3) / d14);
                if (f20 >= 0.0f) {
                    f5 = f20;
                }
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
            } else {
                f6 = f19;
            }
            isNaN = Float.isNaN(f6);
            float f8222 = this.PolarVoyageStrictModeLegendEpic1532;
            if (isNaN) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PolarVoyageTextWatcherHyperionThunderThunder5885)) {
            return false;
        }
        PolarVoyageTextWatcherHyperionThunderThunder5885 polarVoyageTextWatcherHyperionThunderThunder5885 = (PolarVoyageTextWatcherHyperionThunderThunder5885) obj;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485 == polarVoyageTextWatcherHyperionThunderThunder5885.PolarVoyageItemDecorationUltraDeltaEpic7485 && this.PolarVoyageStrictModeLegendEpic1532 == polarVoyageTextWatcherHyperionThunderThunder5885.PolarVoyageStrictModeLegendEpic1532 && this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == polarVoyageTextWatcherHyperionThunderThunder5885.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageStrictModeLegendEpic1532, Float.hashCode(this.PolarVoyageItemDecorationUltraDeltaEpic7485) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.PolarVoyageItemDecorationUltraDeltaEpic7485 + ", b=" + this.PolarVoyageStrictModeLegendEpic1532 + ", c=" + this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + ", d=1.0)";
    }
}
