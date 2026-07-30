package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes4.dex */
class FitModeEvaluators {
    private static final FitModeEvaluator WIDTH = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f8, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.currentEndHeight - fitModeResult.currentStartHeight) * f8;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
            float lerp = TransitionUtils.lerp(f11, f13, f9, f10, f8, true);
            float f15 = lerp / f11;
            float f16 = lerp / f13;
            return new FitModeResult(f15, f16, lerp, f12 * f15, lerp, f14 * f16);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartHeight > fitModeResult.currentEndHeight;
        }
    };
    private static final FitModeEvaluator HEIGHT = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f8, FitModeResult fitModeResult) {
            float abs = (Math.abs(fitModeResult.currentEndWidth - fitModeResult.currentStartWidth) / 2.0f) * f8;
            rectF.left += abs;
            rectF.right -= abs;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
            float lerp = TransitionUtils.lerp(f12, f14, f9, f10, f8, true);
            float f15 = lerp / f12;
            float f16 = lerp / f14;
            return new FitModeResult(f15, f16, f11 * f15, lerp, f13 * f16, lerp);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartWidth > fitModeResult.currentEndWidth;
        }
    };

    private FitModeEvaluators() {
    }

    static FitModeEvaluator get(int i8, boolean z7, RectF rectF, RectF rectF2) {
        if (i8 == 0) {
            return shouldAutoFitToWidth(z7, rectF, rectF2) ? WIDTH : HEIGHT;
        }
        if (i8 == 1) {
            return WIDTH;
        }
        if (i8 == 2) {
            return HEIGHT;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i8);
    }

    private static boolean shouldAutoFitToWidth(boolean z7, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f8 = (height2 * width) / width2;
        float f9 = (width2 * height) / width;
        if (z7) {
            if (f8 < height) {
                return false;
            }
        } else if (f9 < height2) {
            return false;
        }
        return true;
    }
}
