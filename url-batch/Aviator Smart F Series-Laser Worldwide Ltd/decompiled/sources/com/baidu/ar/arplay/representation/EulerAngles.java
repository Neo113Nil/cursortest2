package com.baidu.ar.arplay.representation;

/* loaded from: classes.dex */
public class EulerAngles {
    private float pitch;
    private float roll;
    private float yaw;

    public EulerAngles(float f8, float f9, float f10) {
        this.yaw = f8;
        this.pitch = f9;
        this.roll = f10;
    }

    public float getPitch() {
        return this.pitch;
    }

    public float getRoll() {
        return this.roll;
    }

    public float getYaw() {
        return this.yaw;
    }
}
