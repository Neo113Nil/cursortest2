package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    float radius;

    public RoundedCornerTreatment() {
        this.radius = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f8, float f9, float f10) {
        float f11 = f10 * f9;
        shapePath.reset(0.0f, f11, 180.0f, 180.0f - f8);
        float f12 = f11 * 2.0f;
        shapePath.addArc(0.0f, 0.0f, f12, f12, 180.0f, f8);
    }

    @Deprecated
    public RoundedCornerTreatment(float f8) {
        this.radius = f8;
    }
}
