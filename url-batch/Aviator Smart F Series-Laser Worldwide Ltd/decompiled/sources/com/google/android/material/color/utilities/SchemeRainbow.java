package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class SchemeRainbow extends DynamicScheme {
    public SchemeRainbow(Hct hct, boolean z7, double d8) {
        super(hct, Variant.RAINBOW, z7, d8, TonalPalette.fromHueAndChroma(hct.getHue(), 48.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 60.0d), 24.0d), TonalPalette.fromHueAndChroma(hct.getHue(), com.github.mikephil.charting.utils.i.DOUBLE_EPSILON), TonalPalette.fromHueAndChroma(hct.getHue(), com.github.mikephil.charting.utils.i.DOUBLE_EPSILON));
    }
}
