package com.baidu.ar;

/* loaded from: classes.dex */
public enum ARType {
    TRACK_2D(0),
    LBS(1),
    GAME(2),
    UDT(3),
    NPC(4),
    VO(5),
    ON_DEVICE_IR(6),
    CLOUD_IR(7),
    IMU(8),
    FACE(10),
    VPAS(11),
    MARKER(12),
    TRACK_3D(13),
    DIGITAL(14),
    OBR(15);

    private int mTypeValue;

    ARType(int i8) {
        this.mTypeValue = i8;
    }

    public static ARType valueOf(int i8) {
        for (ARType aRType : values()) {
            if (aRType.getTypeValue() == i8) {
                return aRType;
            }
        }
        return null;
    }

    public int getTypeValue() {
        return this.mTypeValue;
    }
}
