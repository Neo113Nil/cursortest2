package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAsyncTaskOmegaTitanium1925 extends PolarVoyageZoomStateStrikeMasterThunder9962 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageAsyncTaskOmegaTitanium1925(String str, String str2) {
        super(new PolarVoyageLightSensorNovaThunderDragon8312(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(charArray.length == 64);
    }

    @Override // p000createpolar.PolarVoyageZoomStateStrikeMasterThunder9962
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLooperThreadAlphaPrime1279(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            PolarVoyageLightSensorNovaThunderDragon8312 polarVoyageLightSensorNovaThunderDragon8312 = this.PolarVoyageZipVortexCelestial6185;
            char[] cArr = polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageMotionLayoutTransitionHeroVision4068;
            char[] cArr2 = polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageMotionLayoutTransitionHeroVision4068;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            PolarVoyageZipVortexCelestial6185(sb, bArr, i2, i - i2);
        }
    }
}
