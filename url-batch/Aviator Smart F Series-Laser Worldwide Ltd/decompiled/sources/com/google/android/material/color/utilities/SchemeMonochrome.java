package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class SchemeMonochrome extends DynamicScheme {
    public SchemeMonochrome(Hct hct, boolean z7, double d8) {
        super(hct, Variant.MONOCHROME, z7, d8, TonalPalette.fromHueAndChroma(hct.getHue(), com.github.mikephil.charting.utils.i.DOUBLE_EPSILON), TonalPalette.fromHueAndChroma(hct.getHue(), com.github.mikephil.charting.utils.i.DOUBLE_EPSILON), TonalPalette.fromHueAndChroma(hct.getHue(), com.github.mikephil.charting.utils.i.DOUBLE_EPSILON), TonalPalette.fromHueAndChroma(hct.getHue(), com.github.mikephil.charting.utils.i.DOUBLE_EPSILON), TonalPalette.fromHueAndChroma(hct.getHue(), com.github.mikephil.charting.utils.i.DOUBLE_EPSILON));
    }
}
