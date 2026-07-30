package com.baidu.ar.arplay.core.engine3d;

import com.baidu.ar.arplay.representation.Quaternion;
import com.baidu.ar.arplay.representation.Vector3f;

/* loaded from: classes.dex */
public class ARPNumber {
    private static native float[] nativeRotationBetweenVector(float f8, float f9, float f10, float f11, float f12, float f13);

    public static Quaternion rotationBetweenVector(Vector3f vector3f, Vector3f vector3f2) {
        float[] nativeRotationBetweenVector = nativeRotationBetweenVector(vector3f.x(), vector3f.y(), vector3f.z(), vector3f2.x(), vector3f2.y(), vector3f2.z());
        if (nativeRotationBetweenVector.length != 4) {
            return new Quaternion();
        }
        Quaternion quaternion = new Quaternion();
        quaternion.setXYZW(nativeRotationBetweenVector[0], nativeRotationBetweenVector[1], nativeRotationBetweenVector[2], nativeRotationBetweenVector[3]);
        return quaternion;
    }
}
