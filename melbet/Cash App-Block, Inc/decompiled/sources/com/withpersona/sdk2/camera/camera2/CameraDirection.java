package com.withpersona.sdk2.camera.camera2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class CameraDirection {
    public static final /* synthetic */ CameraDirection[] $VALUES;
    public static final CameraDirection BACK;
    public static final CameraDirection EXTERNAL;
    public static final CameraDirection FRONT;

    static {
        CameraDirection cameraDirection = new CameraDirection("FRONT", 0);
        FRONT = cameraDirection;
        CameraDirection cameraDirection2 = new CameraDirection("BACK", 1);
        BACK = cameraDirection2;
        CameraDirection cameraDirection3 = new CameraDirection("EXTERNAL", 2);
        EXTERNAL = cameraDirection3;
        $VALUES = new CameraDirection[]{cameraDirection, cameraDirection2, cameraDirection3};
    }

    public static CameraDirection valueOf(String str) {
        return (CameraDirection) Enum.valueOf(CameraDirection.class, str);
    }

    public static CameraDirection[] values() {
        return (CameraDirection[]) $VALUES.clone();
    }
}
