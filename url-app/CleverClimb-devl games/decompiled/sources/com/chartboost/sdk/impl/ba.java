package com.chartboost.sdk.impl;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class ba extends Animation {

    /* renamed from: a, reason: collision with root package name */
    private final float f3766a;

    /* renamed from: b, reason: collision with root package name */
    private final float f3767b;

    /* renamed from: c, reason: collision with root package name */
    private final float f3768c;

    /* renamed from: d, reason: collision with root package name */
    private final float f3769d;
    private boolean e;
    private Camera f;

    public ba(float f, float f2, float f3, float f4, boolean z) {
        this.e = true;
        this.f3766a = f;
        this.f3767b = f2;
        this.f3768c = f3;
        this.f3769d = f4;
        this.e = z;
    }

    @Override // android.view.animation.Animation
    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.f = new Camera();
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f3766a + ((this.f3767b - this.f3766a) * f);
        Camera camera = this.f;
        Matrix matrix = transformation.getMatrix();
        camera.save();
        if (this.e) {
            camera.rotateY(f2);
        } else {
            camera.rotateX(f2);
        }
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-this.f3768c, -this.f3769d);
        matrix.postTranslate(this.f3768c, this.f3769d);
    }
}
