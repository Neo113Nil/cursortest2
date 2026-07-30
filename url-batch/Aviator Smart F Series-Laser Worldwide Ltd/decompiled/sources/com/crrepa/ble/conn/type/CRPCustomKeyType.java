package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPCustomKeyType {
    KEY_TRAINING((byte) 0),
    KEY_HEARTRATE((byte) 1),
    KEY_BLOODPRESSURE((byte) 2),
    KEY_BLOODOXYGEN((byte) 3),
    KEY_HRV((byte) 4),
    KEY_CAMERA((byte) 5),
    KEY_BREATHE((byte) 6),
    KEY_STOPWATCH((byte) 7),
    KEY_TIMER((byte) 8),
    KEY_GAMER((byte) 9),
    KEY_NONE((byte) -1);

    private byte value;

    CRPCustomKeyType(byte b8) {
        this.value = b8;
    }

    public static CRPCustomKeyType getInstance(byte b8) {
        switch (b8) {
            case 0:
                return KEY_TRAINING;
            case 1:
                return KEY_HEARTRATE;
            case 2:
                return KEY_BLOODPRESSURE;
            case 3:
                return KEY_BLOODOXYGEN;
            case 4:
                return KEY_HRV;
            case 5:
                return KEY_CAMERA;
            case 6:
                return KEY_BREATHE;
            case 7:
                return KEY_STOPWATCH;
            case 8:
                return KEY_TIMER;
            case 9:
                return KEY_GAMER;
            default:
                return KEY_NONE;
        }
    }

    public byte getValue() {
        return this.value;
    }
}
