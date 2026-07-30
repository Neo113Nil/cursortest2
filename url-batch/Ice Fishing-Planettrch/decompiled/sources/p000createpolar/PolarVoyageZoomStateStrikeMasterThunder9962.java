package p000createpolar;

import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageZoomStateStrikeMasterThunder9962 {
    public static final PolarVoyageAnimationOlympianNovaXPixel6926 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public volatile PolarVoyageZoomStateStrikeMasterThunder9962 PolarVoyageKotlinBetaPulseBeta3653;
    public final Character PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageLightSensorNovaThunderDragon8312 PolarVoyageZipVortexCelestial6185;

    static {
        new PolarVoyageAsyncTaskOmegaTitanium1925("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new PolarVoyageAsyncTaskOmegaTitanium1925("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new PolarVoyageZoomStateStrikeMasterThunder9962("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new PolarVoyageZoomStateStrikeMasterThunder9962("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageAnimationOlympianNovaXPixel6926(new PolarVoyageLightSensorNovaThunderDragon8312("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public PolarVoyageZoomStateStrikeMasterThunder9962(PolarVoyageLightSensorNovaThunderDragon8312 polarVoyageLightSensorNovaThunderDragon8312, Character ch) {
        boolean z;
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageLightSensorNovaThunderDragon8312;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageTextInputEditTextNebulaHero6651;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAnimatorSetSparkUltraMax8233(z, "Padding character %s was already in alphabet", ch);
                this.PolarVoyageMotionLayoutTransitionHeroVision4068 = ch;
            }
        }
        z = true;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageAnimatorSetSparkUltraMax8233(z, "Padding character %s was already in alphabet", ch);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = ch;
    }

    public void PolarVoyageMotionLayoutTransitionHeroVision4068(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLooperThreadAlphaPrime1279(0, i, bArr.length);
        while (i2 < i) {
            PolarVoyageLightSensorNovaThunderDragon8312 polarVoyageLightSensorNovaThunderDragon8312 = this.PolarVoyageZipVortexCelestial6185;
            PolarVoyageZipVortexCelestial6185(sb, bArr, i2, Math.min(polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageDiffUtilTurboStrike5735, i - i2));
            i2 += polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageDiffUtilTurboStrike5735;
        }
    }

    public final void PolarVoyageZipVortexCelestial6185(StringBuilder sb, byte[] bArr, int i, int i2) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLooperThreadAlphaPrime1279(i, i + i2, bArr.length);
        PolarVoyageLightSensorNovaThunderDragon8312 polarVoyageLightSensorNovaThunderDragon8312 = this.PolarVoyageZipVortexCelestial6185;
        int i3 = polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageDiffUtilTurboStrike5735;
        int i4 = polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i5 = 0;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageMotionLayoutTransitionHeroVision4068[((int) (j >>> (i7 - i5))) & polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageKotlinBetaPulseBeta3653]);
            i5 += i4;
        }
        Character ch = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (ch != null) {
            while (i5 < polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageDiffUtilTurboStrike5735 * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageZoomStateStrikeMasterThunder9962) {
            PolarVoyageZoomStateStrikeMasterThunder9962 polarVoyageZoomStateStrikeMasterThunder9962 = (PolarVoyageZoomStateStrikeMasterThunder9962) obj;
            if (this.PolarVoyageZipVortexCelestial6185.equals(polarVoyageZoomStateStrikeMasterThunder9962.PolarVoyageZipVortexCelestial6185) && Objects.equals(this.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageZoomStateStrikeMasterThunder9962.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.PolarVoyageMotionLayoutTransitionHeroVision4068) ^ this.PolarVoyageZipVortexCelestial6185.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        PolarVoyageLightSensorNovaThunderDragon8312 polarVoyageLightSensorNovaThunderDragon8312 = this.PolarVoyageZipVortexCelestial6185;
        sb.append(polarVoyageLightSensorNovaThunderDragon8312);
        if (8 % polarVoyageLightSensorNovaThunderDragon8312.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != 0) {
            Character ch = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public PolarVoyageZoomStateStrikeMasterThunder9962(String str, String str2) {
        this(new PolarVoyageLightSensorNovaThunderDragon8312(str, str2.toCharArray()), (Character) '=');
    }
}
