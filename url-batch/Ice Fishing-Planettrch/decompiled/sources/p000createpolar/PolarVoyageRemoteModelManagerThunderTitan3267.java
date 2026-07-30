package p000createpolar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRemoteModelManagerThunderTitan3267 extends ReplacementSpan {
    public boolean PolarVoyageBottomSheetOmegaNeo1907;
    public Paint.FontMetricsInt PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;

    public final int PolarVoyageMotionLayoutTransitionHeroVision4068() {
        if (!this.PolarVoyageBottomSheetOmegaNeo1907) {
            PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageMotionLayoutTransitionHeroVision4068("PlaceholderSpan is not laid out yet.");
        }
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    public final Paint.FontMetricsInt PolarVoyageZipVortexCelestial6185() {
        Paint.FontMetricsInt fontMetricsInt = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("fontMetrics");
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.PolarVoyageBottomSheetOmegaNeo1907 = true;
        paint.getTextSize();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = paint.getFontMetricsInt();
        if (PolarVoyageZipVortexCelestial6185().descent <= PolarVoyageZipVortexCelestial6185().ascent) {
            PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageZipVortexCelestial6185("Invalid fontMetrics: line height can not be negative.");
        }
        this.PolarVoyageStrictModeLegendEpic1532 = (int) Math.ceil(0.0d);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = PolarVoyageZipVortexCelestial6185().ascent;
            fontMetricsInt.descent = PolarVoyageZipVortexCelestial6185().descent;
            fontMetricsInt.leading = PolarVoyageZipVortexCelestial6185().leading;
            if (fontMetricsInt.ascent > (-PolarVoyageMotionLayoutTransitionHeroVision4068())) {
                fontMetricsInt.ascent = -PolarVoyageMotionLayoutTransitionHeroVision4068();
            }
            fontMetricsInt.top = Math.min(PolarVoyageZipVortexCelestial6185().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(PolarVoyageZipVortexCelestial6185().bottom, fontMetricsInt.descent);
        }
        if (!this.PolarVoyageBottomSheetOmegaNeo1907) {
            PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageMotionLayoutTransitionHeroVision4068("PlaceholderSpan is not laid out yet.");
        }
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
