package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAnimationOlympianNovaXPixel6926 extends PolarVoyageZoomStateStrikeMasterThunder9962 {
    public final char[] PolarVoyageBitmapVisionAuroraPixel4705;

    public PolarVoyageAnimationOlympianNovaXPixel6926(PolarVoyageLightSensorNovaThunderDragon8312 polarVoyageLightSensorNovaThunderDragon8312) {
        super(polarVoyageLightSensorNovaThunderDragon8312, (Character) null);
        this.PolarVoyageBitmapVisionAuroraPixel4705 = new char[512];
        char[] cArr = polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.PolarVoyageBitmapVisionAuroraPixel4705;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // p000createpolar.PolarVoyageZoomStateStrikeMasterThunder9962
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(StringBuilder sb, byte[] bArr, int i) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLooperThreadAlphaPrime1279(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.PolarVoyageBitmapVisionAuroraPixel4705;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
