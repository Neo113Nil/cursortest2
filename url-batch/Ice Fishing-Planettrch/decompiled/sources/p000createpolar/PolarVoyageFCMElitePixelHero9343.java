package p000createpolar;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFCMElitePixelHero9343 implements LineHeightSpan {
    public int PolarVoyageAnimatorSetSparkUltraMax8233;
    public final boolean PolarVoyageBottomSheetOmegaNeo1907;
    public final boolean PolarVoyageCameraPixelBlaze2629;
    public final float PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageNavigationViewHyperHyperHyperion1793;
    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;
    public final float PolarVoyageViewRogueMaster4778;
    public int PolarVoyageDrawableDeltaHyperion5742 = Integer.MIN_VALUE;
    public int PolarVoyageSnackbarGammaEclipse2140 = Integer.MIN_VALUE;
    public int PolarVoyageContentProviderHyperSpark3838 = Integer.MIN_VALUE;
    public int PolarVoyageRemoteModelManagerOlympianCelestial9141 = Integer.MIN_VALUE;

    public PolarVoyageFCMElitePixelHero9343(float f, int i, boolean z, boolean z2, float f2, boolean z3) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = f;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = z;
        this.PolarVoyageBottomSheetOmegaNeo1907 = z2;
        this.PolarVoyageViewRogueMaster4778 = f2;
        this.PolarVoyageCameraPixelBlaze2629 = z3;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageMotionLayoutTransitionHeroVision4068("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.PolarVoyageStrictModeLegendEpic1532;
        boolean z3 = this.PolarVoyageBottomSheetOmegaNeo1907;
        boolean z4 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (z && z2 && z4 && z3) {
            return;
        }
        if (this.PolarVoyageDrawableDeltaHyperion5742 == Integer.MIN_VALUE) {
            int i7 = i5 - i6;
            int ceil = (int) Math.ceil(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
            int i8 = ceil - i7;
            if (!this.PolarVoyageCameraPixelBlaze2629 || i8 > 0) {
                float f = this.PolarVoyageViewRogueMaster4778;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i8 <= 0 ? Math.ceil(i8 * f) : Math.ceil((1.0f - f) * i8));
                int i9 = fontMetricsInt.descent;
                int i10 = ceil2 + i9;
                this.PolarVoyageContentProviderHyperSpark3838 = i10;
                int i11 = i10 - ceil;
                this.PolarVoyageSnackbarGammaEclipse2140 = i11;
                if (z4) {
                    i11 = fontMetricsInt.ascent;
                }
                this.PolarVoyageDrawableDeltaHyperion5742 = i11;
                if (z3) {
                    i10 = i9;
                }
                this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = i10;
                this.PolarVoyageNavigationViewHyperHyperHyperion1793 = fontMetricsInt.ascent - i11;
                this.PolarVoyageAnimatorSetSparkUltraMax8233 = i10 - i9;
            } else {
                int i12 = fontMetricsInt.ascent;
                this.PolarVoyageSnackbarGammaEclipse2140 = i12;
                int i13 = fontMetricsInt.descent;
                this.PolarVoyageContentProviderHyperSpark3838 = i13;
                this.PolarVoyageDrawableDeltaHyperion5742 = i12;
                this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = i13;
                this.PolarVoyageNavigationViewHyperHyperHyperion1793 = 0;
                this.PolarVoyageAnimatorSetSparkUltraMax8233 = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.PolarVoyageDrawableDeltaHyperion5742 : this.PolarVoyageSnackbarGammaEclipse2140;
        fontMetricsInt.descent = z2 ? this.PolarVoyageRemoteModelManagerOlympianCelestial9141 : this.PolarVoyageContentProviderHyperSpark3838;
    }
}
