package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPWatchFaceTimeStyle {
    NUMBER((byte) 0),
    CLASS((byte) 1);

    private byte value;

    CRPWatchFaceTimeStyle(byte b8) {
        this.value = b8;
    }

    public static CRPWatchFaceTimeStyle getInstance(byte b8) {
        for (CRPWatchFaceTimeStyle cRPWatchFaceTimeStyle : values()) {
            if (cRPWatchFaceTimeStyle.getValue() == b8) {
                return cRPWatchFaceTimeStyle;
            }
        }
        return null;
    }

    public byte getValue() {
        return this.value;
    }
}
