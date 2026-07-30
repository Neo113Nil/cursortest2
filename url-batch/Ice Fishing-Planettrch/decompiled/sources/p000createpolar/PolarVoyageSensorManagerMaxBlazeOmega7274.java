package p000createpolar;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageSensorManagerMaxBlazeOmega7274 extends CharacterStyle implements UpdateAppearance {
    public final PolarVoyageObjectAnimatorSparkPhantomStrike9583 PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageSensorManagerMaxBlazeOmega7274(PolarVoyageObjectAnimatorSparkPhantomStrike9583 polarVoyageObjectAnimatorSparkPhantomStrike9583) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageObjectAnimatorSparkPhantomStrike9583;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            PolarVoyageCrashlyticsSpectraPixel4938 polarVoyageCrashlyticsSpectraPixel4938 = PolarVoyageCrashlyticsSpectraPixel4938.PolarVoyageDisplayMetricsVortexDragon9516;
            PolarVoyageObjectAnimatorSparkPhantomStrike9583 polarVoyageObjectAnimatorSparkPhantomStrike9583 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageObjectAnimatorSparkPhantomStrike9583, polarVoyageCrashlyticsSpectraPixel4938)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(polarVoyageObjectAnimatorSparkPhantomStrike9583 instanceof PolarVoyageMagnetometerOlympianMasterSpark9001)) {
                PolarVoyageAdapterFusionMasterGamma8495.PolarVoyageMotionLayoutTransitionHeroVision4068();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            PolarVoyageMagnetometerOlympianMasterSpark9001 polarVoyageMagnetometerOlympianMasterSpark9001 = (PolarVoyageMagnetometerOlympianMasterSpark9001) polarVoyageObjectAnimatorSparkPhantomStrike9583;
            textPaint.setStrokeWidth(polarVoyageMagnetometerOlympianMasterSpark9001.PolarVoyageDisplayMetricsVortexDragon9516);
            textPaint.setStrokeMiter(polarVoyageMagnetometerOlympianMasterSpark9001.PolarVoyageLayerDrawableShadowTitaniumOmega1942);
            int i = polarVoyageMagnetometerOlympianMasterSpark9001.PolarVoyageAlertDialogCyberHeroQuantum3938;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = polarVoyageMagnetometerOlympianMasterSpark9001.PolarVoyageMotionLayoutForceEpicAurora7183;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
