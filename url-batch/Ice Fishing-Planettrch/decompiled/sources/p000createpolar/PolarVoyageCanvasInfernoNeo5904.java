package p000createpolar;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCanvasInfernoNeo5904 {
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public int PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageDiffUtilTurboStrike5735;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final StringBuilder PolarVoyageKotlinBetaPulseBeta3653;
    public final ArrayList PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int PolarVoyageTextInputEditTextNebulaHero6651;
    public final ArrayList PolarVoyageZipVortexCelestial6185;

    public PolarVoyageCanvasInfernoNeo5904(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.PolarVoyageZipVortexCelestial6185 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.PolarVoyageKotlinBetaPulseBeta3653 = sb;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 15;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = 0;
        this.PolarVoyageDiffUtilTurboStrike5735 = 0;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i2;
    }

    public final SpannableString PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.PolarVoyageKotlinBetaPulseBeta3653);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.PolarVoyageZipVortexCelestial6185;
            if (i5 >= arrayList.size()) {
                break;
            }
            PolarVoyageCamera2NebulaVisionCelestial1124 polarVoyageCamera2NebulaVisionCelestial1124 = (PolarVoyageCamera2NebulaVisionCelestial1124) arrayList.get(i5);
            boolean z2 = polarVoyageCamera2NebulaVisionCelestial1124.PolarVoyageMotionLayoutTransitionHeroVision4068;
            int i7 = polarVoyageCamera2NebulaVisionCelestial1124.PolarVoyageZipVortexCelestial6185;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = PolarVoyageMotionLayoutPulseMasterStorm2533.PolarVoyageActivityInfoBetaQuantum8726[i7];
                }
                z = z3;
            }
            int i8 = polarVoyageCamera2NebulaVisionCelestial1124.PolarVoyageKotlinBetaPulseBeta3653;
            i5++;
            if (i8 != (i5 < arrayList.size() ? ((PolarVoyageCamera2NebulaVisionCelestial1124) arrayList.get(i5)).PolarVoyageKotlinBetaPulseBeta3653 : length)) {
                if (i != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                    i = -1;
                } else if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    if (i3 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                    }
                    i3 = i4;
                    i6 = i8;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
        }
        if (i6 != length && i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean PolarVoyageBitmapVisionAuroraPixel4705() {
        return this.PolarVoyageZipVortexCelestial6185.isEmpty() && this.PolarVoyageMotionLayoutTransitionHeroVision4068.isEmpty() && this.PolarVoyageKotlinBetaPulseBeta3653.length() == 0;
    }

    public final PolarVoyageProcessCameraProviderHeroBetaSolar3759 PolarVoyageKotlinBetaPulseBeta3653(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) PolarVoyageBarcodeScannerInfernoSolarSpark7767());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.PolarVoyageBitmapVisionAuroraPixel4705 + this.PolarVoyageDiffUtilTurboStrike5735;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        int i5 = i;
        if (i5 == Integer.MIN_VALUE) {
            i5 = (this.PolarVoyageTextInputEditTextNebulaHero6651 != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.PolarVoyageTextInputEditTextNebulaHero6651 != 2 || i4 <= 0) ? 0 : 2 : 1;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i6 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.PolarVoyageTextInputEditTextNebulaHero6651 == 1) {
            i6 -= this.PolarVoyageItemDecorationUltraDeltaEpic7485 - 1;
        }
        return new PolarVoyageProcessCameraProviderHeroBetaSolar3759(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, Integer.MIN_VALUE, f, i5, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        StringBuilder sb = this.PolarVoyageKotlinBetaPulseBeta3653;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.PolarVoyageZipVortexCelestial6185;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                PolarVoyageCamera2NebulaVisionCelestial1124 polarVoyageCamera2NebulaVisionCelestial1124 = (PolarVoyageCamera2NebulaVisionCelestial1124) arrayList.get(size);
                int i = polarVoyageCamera2NebulaVisionCelestial1124.PolarVoyageKotlinBetaPulseBeta3653;
                if (i != length) {
                    return;
                }
                polarVoyageCamera2NebulaVisionCelestial1124.PolarVoyageKotlinBetaPulseBeta3653 = i - 1;
            }
        }
    }

    public final void PolarVoyageZipVortexCelestial6185(char c) {
        StringBuilder sb = this.PolarVoyageKotlinBetaPulseBeta3653;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }
}
