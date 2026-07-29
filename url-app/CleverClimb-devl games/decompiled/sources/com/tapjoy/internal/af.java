package com.tapjoy.internal;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes2.dex */
public final class af extends Animation {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7810a;

    /* renamed from: b, reason: collision with root package name */
    private final float f7811b;

    /* renamed from: c, reason: collision with root package name */
    private final float f7812c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7813d;
    private final float e;
    private final int f;
    private final float g;
    private float h;
    private float i;
    private Camera j;

    public af(boolean z, float f, float f2, int i, float f3, int i2, float f4) {
        this.f7810a = z;
        this.f7811b = f;
        this.f7812c = f2;
        this.f7813d = i;
        this.e = f3;
        this.f = i2;
        this.g = f4;
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.h = resolveSize(this.f7813d, this.e, i, i3);
        this.i = resolveSize(this.f, this.g, i2, i4);
        this.j = new Camera();
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f7811b;
        float f3 = f2 + ((this.f7812c - f2) * f);
        Matrix matrix = transformation.getMatrix();
        Camera camera = this.j;
        camera.save();
        if (this.f7810a) {
            camera.rotateX(f3);
        } else {
            camera.rotateY(f3);
        }
        camera.getMatrix(matrix);
        camera.restore();
        float f4 = this.h;
        float f5 = this.i;
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
    }
}
