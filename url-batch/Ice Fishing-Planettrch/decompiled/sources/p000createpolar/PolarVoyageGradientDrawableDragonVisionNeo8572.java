package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGradientDrawableDragonVisionNeo8572 extends PolarVoyageDataBindingInfernoInfernoPixel1843 {
    public final int PolarVoyageCameraPixelBlaze2629;
    public final int PolarVoyageViewRogueMaster4778;

    public PolarVoyageGradientDrawableDragonVisionNeo8572(byte[] bArr, int i, int i2) {
        super(bArr);
        PolarVoyageDataBindingInfernoInfernoPixel1843.PolarVoyageMotionLayoutTransitionHeroVision4068(i, i + i2, bArr.length);
        this.PolarVoyageViewRogueMaster4778 = i;
        this.PolarVoyageCameraPixelBlaze2629 = i2;
    }

    @Override // p000createpolar.PolarVoyageDataBindingInfernoInfernoPixel1843
    public final void PolarVoyageBitmapVisionAuroraPixel4705(byte[] bArr, int i) {
        System.arraycopy(this.PolarVoyageStrictModeLegendEpic1532, this.PolarVoyageViewRogueMaster4778, bArr, 0, i);
    }

    @Override // p000createpolar.PolarVoyageDataBindingInfernoInfernoPixel1843
    public final int PolarVoyageDiffUtilTurboStrike5735() {
        return this.PolarVoyageViewRogueMaster4778;
    }

    @Override // p000createpolar.PolarVoyageDataBindingInfernoInfernoPixel1843
    public final byte PolarVoyageTextInputEditTextNebulaHero6651(int i) {
        return this.PolarVoyageStrictModeLegendEpic1532[this.PolarVoyageViewRogueMaster4778 + i];
    }

    @Override // p000createpolar.PolarVoyageDataBindingInfernoInfernoPixel1843
    public final byte PolarVoyageZipVortexCelestial6185(int i) {
        int i2 = this.PolarVoyageCameraPixelBlaze2629;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.PolarVoyageStrictModeLegendEpic1532[this.PolarVoyageViewRogueMaster4778 + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, i2, "Index > length: ", ", "));
    }

    @Override // p000createpolar.PolarVoyageDataBindingInfernoInfernoPixel1843
    public final int size() {
        return this.PolarVoyageCameraPixelBlaze2629;
    }
}
