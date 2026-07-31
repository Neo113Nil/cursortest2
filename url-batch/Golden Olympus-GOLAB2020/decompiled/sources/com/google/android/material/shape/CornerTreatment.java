package com.google.android.material.shape;

import android.graphics.RectF;

/* loaded from: classes.dex */
public abstract class CornerTreatment {
    public abstract void getCornerPath(ShapePath shapePath, float f4, float f5, float f6);

    public void getCornerPath(ShapePath shapePath, float f4, float f5, RectF rectF, CornerSize cornerSize) {
        getCornerPath(shapePath, f4, f5, cornerSize.getCornerSize(rectF));
    }
}
