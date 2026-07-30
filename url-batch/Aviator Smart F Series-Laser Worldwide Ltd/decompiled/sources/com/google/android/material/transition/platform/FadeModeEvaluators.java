package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes4.dex */
class FadeModeEvaluators {
    private static final FadeModeEvaluator IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f8, float f9, float f10, float f11) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f9, f10, f8));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f8, float f9, float f10, float f11) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f9, f10, f8), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f8, float f9, float f10, float f11) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f9, f10, f8), TransitionUtils.lerp(0, 255, f9, f10, f8));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f8, float f9, float f10, float f11) {
            float f12 = ((f10 - f9) * f11) + f9;
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f9, f12, f8), TransitionUtils.lerp(0, 255, f12, f10, f8));
        }
    };

    private FadeModeEvaluators() {
    }

    static FadeModeEvaluator get(int i8, boolean z7) {
        if (i8 == 0) {
            return z7 ? IN : OUT;
        }
        if (i8 == 1) {
            return z7 ? OUT : IN;
        }
        if (i8 == 2) {
            return CROSS;
        }
        if (i8 == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i8);
    }
}
