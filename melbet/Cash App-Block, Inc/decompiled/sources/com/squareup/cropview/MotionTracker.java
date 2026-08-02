package com.squareup.cropview;

import android.graphics.RectF;
import java.util.Collection;
import java.util.EnumSet;

/* loaded from: classes7.dex */
public final class MotionTracker {
    public final float aspectRatio;
    public final RectF bounds;
    public final EnumSet edges;
    public float lastX;
    public float lastY;
    public final float minHeight;
    public final float minWidth;

    public MotionTracker(EnumSet enumSet, RectF rectF, float f, float f2, float f3, float f4, float f5) {
        rectF.getClass();
        this.bounds = rectF;
        this.minWidth = f;
        this.minHeight = f2;
        this.aspectRatio = f3;
        this.lastX = f4;
        this.lastY = f5;
        EnumSet copyOf = EnumSet.copyOf((Collection) enumSet);
        copyOf.getClass();
        this.edges = copyOf;
    }
}
