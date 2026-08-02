package com.squareup.contour.constraints;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class PositionConstraint extends Constraint {
    public int point;

    public PositionConstraint(int i, Function1 function1) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(i);
        this.point = i;
        this.lambda = function1;
    }
}
