package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes4.dex */
interface FitModeEvaluator {
    void applyMask(RectF rectF, float f8, FitModeResult fitModeResult);

    FitModeResult evaluate(float f8, float f9, float f10, float f11, float f12, float f13, float f14);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
