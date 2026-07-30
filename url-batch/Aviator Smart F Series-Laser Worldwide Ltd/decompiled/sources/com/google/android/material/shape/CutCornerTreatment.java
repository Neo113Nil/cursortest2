package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f8, float f9, float f10) {
        float f11 = f10 * f9;
        shapePath.reset(0.0f, f11, 180.0f, 180.0f - f8);
        double d8 = f11;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f8)) * d8), (float) (Math.sin(Math.toRadians(90.0f - f8)) * d8));
    }

    @Deprecated
    public CutCornerTreatment(float f8) {
        this.size = f8;
    }
}
