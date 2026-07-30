package p000createpolar;

import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLocationManagerLegendHeroTitanium4938 {
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public Object[] PolarVoyageZipVortexCelestial6185;

    public PolarVoyageLocationManagerLegendHeroTitanium4938(int i) {
        this.PolarVoyageZipVortexCelestial6185 = i == 0 ? PolarVoyageSQLiteAlphaShadow5892.PolarVoyageZipVortexCelestial6185 : new Object[i];
    }

    public final Object PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        if (!PolarVoyageTextInputEditTextNebulaHero6651()) {
            return this.PolarVoyageZipVortexCelestial6185[0];
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532("ObjectList is empty.");
        return null;
    }

    public final Object PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        if (i >= 0 && i < this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            return this.PolarVoyageZipVortexCelestial6185[i];
        }
        PolarVoyageCameraPixelBlaze2629(i);
        throw null;
    }

    public final void PolarVoyageBottomSheetOmegaNeo1907(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.PolarVoyageMotionLayoutTransitionHeroVision4068) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.PolarVoyageZipVortexCelestial6185;
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i, i2, i3, objArr, objArr);
            }
            int i4 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            int i5 = i4 - (i2 - i);
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCombineBlazeSparkInferno2844(this.PolarVoyageZipVortexCelestial6185, i5, i4);
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i5;
        }
    }

    public final void PolarVoyageCameraPixelBlaze2629(int i) {
        StringBuilder PolarVoyageContentProviderHyperSpark3838 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("Index ", i, " must be in 0..");
        PolarVoyageContentProviderHyperSpark3838.append(this.PolarVoyageMotionLayoutTransitionHeroVision4068 - 1);
        throw new IndexOutOfBoundsException(PolarVoyageContentProviderHyperSpark3838.toString());
    }

    public final int PolarVoyageDiffUtilTurboStrike5735(Object obj) {
        Object[] objArr = this.PolarVoyageZipVortexCelestial6185;
        int i = 0;
        if (obj == null) {
            int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean PolarVoyageItemDecorationUltraDeltaEpic7485() {
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068 != 0;
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653() {
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCombineBlazeSparkInferno2844(this.PolarVoyageZipVortexCelestial6185, 0, this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 0;
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int size = list.size() + i;
        Object[] objArr = this.PolarVoyageZipVortexCelestial6185;
        if (objArr.length < size) {
            PolarVoyageViewRogueMaster4778(size, objArr);
        }
        Object[] objArr2 = this.PolarVoyageZipVortexCelestial6185;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = list.size() + this.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    public final Object PolarVoyageRotateAnimationCyberCelestialDelta4768(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
            PolarVoyageCameraPixelBlaze2629(i);
            throw null;
        }
        Object[] objArr = this.PolarVoyageZipVortexCelestial6185;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.PolarVoyageMotionLayoutTransitionHeroVision4068 - 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i3;
        objArr[i3] = null;
        return obj;
    }

    public final boolean PolarVoyageStrictModeLegendEpic1532(Object obj) {
        int PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilTurboStrike5735(obj);
        if (PolarVoyageDiffUtilTurboStrike5735 < 0) {
            return false;
        }
        PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageDiffUtilTurboStrike5735);
        return true;
    }

    public final boolean PolarVoyageTextInputEditTextNebulaHero6651() {
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068 == 0;
    }

    public final void PolarVoyageViewRogueMaster4778(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(0, 0, length, objArr, objArr2);
        this.PolarVoyageZipVortexCelestial6185 = objArr2;
    }

    public final void PolarVoyageZipVortexCelestial6185(Object obj) {
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068 + 1;
        Object[] objArr = this.PolarVoyageZipVortexCelestial6185;
        if (objArr.length < i) {
            PolarVoyageViewRogueMaster4778(i, objArr);
        }
        Object[] objArr2 = this.PolarVoyageZipVortexCelestial6185;
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        objArr2[i2] = obj;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageLocationManagerLegendHeroTitanium4938) {
            PolarVoyageLocationManagerLegendHeroTitanium4938 polarVoyageLocationManagerLegendHeroTitanium4938 = (PolarVoyageLocationManagerLegendHeroTitanium4938) obj;
            int i = polarVoyageLocationManagerLegendHeroTitanium4938.PolarVoyageMotionLayoutTransitionHeroVision4068;
            int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (i == i2) {
                Object[] objArr = this.PolarVoyageZipVortexCelestial6185;
                Object[] objArr2 = polarVoyageLocationManagerLegendHeroTitanium4938.PolarVoyageZipVortexCelestial6185;
                PolarVoyageLinearLayoutHyperionSpectra2647 PolarVoyageThreadPhoenixVisionSolar1313 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageThreadPhoenixVisionSolar1313(0, i2);
                int i3 = PolarVoyageThreadPhoenixVisionSolar1313.PolarVoyageItemDecorationUltraDeltaEpic7485;
                int i4 = PolarVoyageThreadPhoenixVisionSolar1313.PolarVoyageStrictModeLegendEpic1532;
                if (i3 > i4) {
                    return true;
                }
                while (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ PolarVoyageLocationManagerLegendHeroTitanium4938() {
        this(16);
    }
}
