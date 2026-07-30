package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPPhotoWatchFaceDisplayMode {
    FIXED((byte) 0),
    SEQUENCE((byte) 1),
    RANDOM((byte) 2);

    private byte value;

    CRPPhotoWatchFaceDisplayMode(byte b8) {
        this.value = b8;
    }

    public static CRPPhotoWatchFaceDisplayMode getInstance(byte b8) {
        if (b8 == 0) {
            return FIXED;
        }
        if (b8 == 1) {
            return SEQUENCE;
        }
        if (b8 != 2) {
            return null;
        }
        return RANDOM;
    }

    public byte getValue() {
        return this.value;
    }
}
