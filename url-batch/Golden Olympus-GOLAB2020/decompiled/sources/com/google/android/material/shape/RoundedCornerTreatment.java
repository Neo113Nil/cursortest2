package com.google.android.material.shape;

/* loaded from: classes.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    float radius = -1.0f;

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(ShapePath shapePath, float f4, float f5, float f6) {
        shapePath.reset(0.0f, f6 * f5, 180.0f, 180.0f - f4);
        float f7 = f6 * 2.0f * f5;
        shapePath.addArc(0.0f, 0.0f, f7, f7, 180.0f, f4);
    }
}
