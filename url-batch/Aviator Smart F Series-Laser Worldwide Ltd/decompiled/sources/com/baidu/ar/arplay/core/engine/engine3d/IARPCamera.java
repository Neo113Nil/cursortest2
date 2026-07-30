package com.baidu.ar.arplay.core.engine.engine3d;

/* loaded from: classes.dex */
public interface IARPCamera extends IARPNode {
    float getFieldOfView();

    float[] getViewMatrix();

    float getZFar();

    float getZNear();

    void setFieldOfView(float f8);

    void setViewMatrix(float[] fArr);

    void setZFar(float f8);

    void setZNear(float f8);
}
