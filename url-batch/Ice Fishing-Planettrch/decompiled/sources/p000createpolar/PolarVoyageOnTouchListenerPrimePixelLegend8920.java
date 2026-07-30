package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnTouchListenerPrimePixelLegend8920 implements Cloneable {
    public /* synthetic */ int PolarVoyageBottomSheetOmegaNeo1907;
    public /* synthetic */ boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
    public /* synthetic */ Object[] PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public /* synthetic */ int[] PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageOnTouchListenerPrimePixelLegend8920(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.PolarVoyageStrictModeLegendEpic1532 = new int[i5];
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new Object[i5];
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, Object obj) {
        int PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageStrictModeLegendEpic1532, this.PolarVoyageBottomSheetOmegaNeo1907, i);
        if (PolarVoyageTextInputEditTextNebulaHero6651 >= 0) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768[PolarVoyageTextInputEditTextNebulaHero6651] = obj;
            return;
        }
        int i2 = ~PolarVoyageTextInputEditTextNebulaHero6651;
        int i3 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (i2 < i3) {
            Object[] objArr = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (objArr[i2] == PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageCameraPixelBlaze2629) {
                this.PolarVoyageStrictModeLegendEpic1532[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 && i3 >= this.PolarVoyageStrictModeLegendEpic1532.length) {
            PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDiffUtilTurboStrike5735(this);
            i2 = ~PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageStrictModeLegendEpic1532, this.PolarVoyageBottomSheetOmegaNeo1907, i);
        }
        int i4 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (i4 >= this.PolarVoyageStrictModeLegendEpic1532.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.PolarVoyageStrictModeLegendEpic1532 = Arrays.copyOf(this.PolarVoyageStrictModeLegendEpic1532, i8);
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Arrays.copyOf(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, i8);
        }
        int i9 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (i9 - i2 != 0) {
            int[] iArr = this.PolarVoyageStrictModeLegendEpic1532;
            int i10 = i2 + 1;
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageSensorManagerFusionPixelSolar7026(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i10, i2, this.PolarVoyageBottomSheetOmegaNeo1907, objArr2, objArr2);
        }
        this.PolarVoyageStrictModeLegendEpic1532[i2] = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768[i2] = obj;
        this.PolarVoyageBottomSheetOmegaNeo1907++;
    }

    public final int PolarVoyageBitmapVisionAuroraPixel4705() {
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDiffUtilTurboStrike5735(this);
        }
        return this.PolarVoyageBottomSheetOmegaNeo1907;
    }

    public final Object PolarVoyageDiffUtilTurboStrike5735(int i) {
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDiffUtilTurboStrike5735(this);
        }
        Object[] objArr = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int PolarVoyageKotlinBetaPulseBeta3653(int i) {
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageDiffUtilTurboStrike5735(this);
        }
        return this.PolarVoyageStrictModeLegendEpic1532[i];
    }

    public final Object PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        Object obj;
        int PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageStrictModeLegendEpic1532, this.PolarVoyageBottomSheetOmegaNeo1907, i);
        if (PolarVoyageTextInputEditTextNebulaHero6651 < 0 || (obj = this.PolarVoyageRotateAnimationCyberCelestialDelta4768[PolarVoyageTextInputEditTextNebulaHero6651]) == PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageCameraPixelBlaze2629) {
            return null;
        }
        return obj;
    }

    /* renamed from: PolarVoyageZipVortexCelestial6185, reason: merged with bridge method [inline-methods] */
    public final PolarVoyageOnTouchListenerPrimePixelLegend8920 clone() {
        Object clone = super.clone();
        clone.getClass();
        PolarVoyageOnTouchListenerPrimePixelLegend8920 polarVoyageOnTouchListenerPrimePixelLegend8920 = (PolarVoyageOnTouchListenerPrimePixelLegend8920) clone;
        polarVoyageOnTouchListenerPrimePixelLegend8920.PolarVoyageStrictModeLegendEpic1532 = (int[]) this.PolarVoyageStrictModeLegendEpic1532.clone();
        polarVoyageOnTouchListenerPrimePixelLegend8920.PolarVoyageRotateAnimationCyberCelestialDelta4768 = (Object[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768.clone();
        return polarVoyageOnTouchListenerPrimePixelLegend8920;
    }

    public final String toString() {
        if (PolarVoyageBitmapVisionAuroraPixel4705() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.PolarVoyageBottomSheetOmegaNeo1907 * 28);
        sb.append('{');
        int i = this.PolarVoyageBottomSheetOmegaNeo1907;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(PolarVoyageKotlinBetaPulseBeta3653(i2));
            sb.append('=');
            Object PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilTurboStrike5735(i2);
            if (PolarVoyageDiffUtilTurboStrike5735 != this) {
                sb.append(PolarVoyageDiffUtilTurboStrike5735);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
