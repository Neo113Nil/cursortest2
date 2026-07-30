package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageToastOmegaUltra3448 implements PolarVoyageCoroutineGammaDragon3377, PolarVoyageOnClickListenerMegaVortex2605 {
    public final float PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final float PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyageFlatMapNovaXPixel7404 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageToastOmegaUltra3448(float f, PolarVoyageFlatMapNovaXPixel7404 polarVoyageFlatMapNovaXPixel7404) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = f;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageFlatMapNovaXPixel7404;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = f;
    }

    @Override // p000createpolar.PolarVoyageCoroutineGammaDragon3377
    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse9577, int i, int[] iArr, PolarVoyageOnLongClickListenerRogueDeltaNova6437 polarVoyageOnLongClickListenerRogueDeltaNova6437, int[] iArr2) {
        int i2;
        int i3;
        if (iArr.length == 0) {
            return;
        }
        int PolarVoyageFlingGestureEclipsePrimeMax1376 = polarVoyageEditTextAuroraHeroPulse9577.PolarVoyageFlingGestureEclipsePrimeMax1376(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        if (polarVoyageOnLongClickListenerRogueDeltaNova6437 == PolarVoyageOnLongClickListenerRogueDeltaNova6437.PolarVoyageStrictModeLegendEpic1532) {
            int length = iArr.length - 1;
            i2 = 0;
            i3 = 0;
            while (-1 < length) {
                int i4 = iArr[length];
                int min = Math.min(i2, i - i4);
                iArr2[length] = min;
                int min2 = Math.min(PolarVoyageFlingGestureEclipsePrimeMax1376, (i - min) - i4);
                int i5 = iArr2[length] + i4 + min2;
                length--;
                i3 = min2;
                i2 = i5;
            }
        } else {
            int length2 = iArr.length;
            i2 = 0;
            i3 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length2) {
                int i8 = iArr[i6];
                int min3 = Math.min(i2, i - i8);
                iArr2[i7] = min3;
                int min4 = Math.min(PolarVoyageFlingGestureEclipsePrimeMax1376, (i - min3) - i8);
                int i9 = iArr2[i7] + i8 + min4;
                i6++;
                i3 = min4;
                i2 = i9;
                i7++;
            }
        }
        int i10 = i2 - i3;
        if (i10 < i) {
            int intValue = ((Number) this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageDiffUtilTurboStrike5735(Integer.valueOf(i - i10), polarVoyageOnLongClickListenerRogueDeltaNova6437)).intValue();
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + intValue;
            }
        }
    }

    @Override // p000createpolar.PolarVoyageCoroutineGammaDragon3377, p000createpolar.PolarVoyageOnClickListenerMegaVortex2605
    public final float PolarVoyageMotionLayoutTransitionHeroVision4068() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // p000createpolar.PolarVoyageOnClickListenerMegaVortex2605
    public final void PolarVoyageTextInputEditTextNebulaHero6651(int i, PolarVoyageInAppPurchaseHyperCelestialMaster2583 polarVoyageInAppPurchaseHyperCelestialMaster2583, int[] iArr, int[] iArr2) {
        PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageInAppPurchaseHyperCelestialMaster2583, i, iArr, PolarVoyageOnLongClickListenerRogueDeltaNova6437.PolarVoyageItemDecorationUltraDeltaEpic7485, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PolarVoyageToastOmegaUltra3448) {
            PolarVoyageToastOmegaUltra3448 polarVoyageToastOmegaUltra3448 = (PolarVoyageToastOmegaUltra3448) obj;
            return PolarVoyageFirestoreBetaQuantum3615.PolarVoyageZipVortexCelestial6185(this.PolarVoyageItemDecorationUltraDeltaEpic7485, polarVoyageToastOmegaUltra3448.PolarVoyageItemDecorationUltraDeltaEpic7485) && this.PolarVoyageStrictModeLegendEpic1532 == polarVoyageToastOmegaUltra3448.PolarVoyageStrictModeLegendEpic1532;
        }
        return false;
    }

    public final int hashCode() {
        return this.PolarVoyageStrictModeLegendEpic1532.hashCode() + PolarVoyageRealtimeDatabaseCyberShadowForce7689.PolarVoyageKotlinBetaPulseBeta3653(Float.hashCode(this.PolarVoyageItemDecorationUltraDeltaEpic7485) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) PolarVoyageFirestoreBetaQuantum3615.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageItemDecorationUltraDeltaEpic7485)) + ", " + this.PolarVoyageStrictModeLegendEpic1532 + ')';
    }
}
