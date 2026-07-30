package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPVideoWatchFaceDisplayMode {
    ONCE((byte) 0),
    LOOP((byte) 1);

    private byte value;

    CRPVideoWatchFaceDisplayMode(byte b8) {
        this.value = b8;
    }

    public static CRPVideoWatchFaceDisplayMode getInstance(byte b8) {
        for (CRPVideoWatchFaceDisplayMode cRPVideoWatchFaceDisplayMode : values()) {
            if (cRPVideoWatchFaceDisplayMode.getValue() == b8) {
                return cRPVideoWatchFaceDisplayMode;
            }
        }
        return null;
    }

    public byte getValue() {
        return this.value;
    }
}
