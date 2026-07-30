package p000createpolar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMLKitHeroInfernoVortex4420 extends ReplacementSpan {
    public final PolarVoyageInAppPurchaseStrikeQuantumTitanium4425 PolarVoyageStrictModeLegendEpic1532;
    public TextPaint PolarVoyageViewRogueMaster4778;
    public final Paint.FontMetricsInt PolarVoyageItemDecorationUltraDeltaEpic7485 = new Paint.FontMetricsInt();
    public short PolarVoyageRotateAnimationCyberCelestialDelta4768 = -1;
    public float PolarVoyageBottomSheetOmegaNeo1907 = 1.0f;

    public PolarVoyageMLKitHeroInfernoVortex4420(PolarVoyageInAppPurchaseStrikeQuantumTitanium4425 polarVoyageInAppPurchaseStrikeQuantumTitanium4425) {
        PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageInAppPurchaseStrikeQuantumTitanium4425, "rasterizer cannot be null");
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageInAppPurchaseStrikeQuantumTitanium4425;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.PolarVoyageViewRogueMaster4778;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.PolarVoyageViewRogueMaster4778 = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.PolarVoyageRotateAnimationCyberCelestialDelta4768, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        PolarVoyageWorkManagerFusionTitanPrime7962.PolarVoyageZipVortexCelestial6185().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        PolarVoyageInAppPurchaseStrikeQuantumTitanium4425 polarVoyageInAppPurchaseStrikeQuantumTitanium4425 = this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Typeface typeface = (Typeface) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageZipVortexCelestial6185 * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        PolarVoyageInAppPurchaseStrikeQuantumTitanium4425 polarVoyageInAppPurchaseStrikeQuantumTitanium4425 = this.PolarVoyageStrictModeLegendEpic1532;
        this.PolarVoyageBottomSheetOmegaNeo1907 = abs / (polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageMotionLayoutTransitionHeroVision4068().PolarVoyageZipVortexCelestial6185(14) != 0 ? ((ByteBuffer) r8.PolarVoyageBottomSheetOmegaNeo1907).getShort(r1 + r8.PolarVoyageItemDecorationUltraDeltaEpic7485) : (short) 0);
        PolarVoyageContentObserverSparkPrimeSolar2299 PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageMotionLayoutTransitionHeroVision4068();
        int PolarVoyageZipVortexCelestial6185 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185(14);
        if (PolarVoyageZipVortexCelestial6185 != 0) {
            ((ByteBuffer) PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907).getShort(PolarVoyageZipVortexCelestial6185 + PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageItemDecorationUltraDeltaEpic7485);
        }
        short s = (short) ((polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageMotionLayoutTransitionHeroVision4068().PolarVoyageZipVortexCelestial6185(12) != 0 ? ((ByteBuffer) r5.PolarVoyageBottomSheetOmegaNeo1907).getShort(r7 + r5.PolarVoyageItemDecorationUltraDeltaEpic7485) : (short) 0) * this.PolarVoyageBottomSheetOmegaNeo1907);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
