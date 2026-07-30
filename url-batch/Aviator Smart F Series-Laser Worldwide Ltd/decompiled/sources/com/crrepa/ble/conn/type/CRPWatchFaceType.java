package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPWatchFaceType {
    AI_WATCH_FACE((byte) 0),
    PHOTO_WATCH_FACE((byte) 1),
    VIDEO_WATCH_FACE((byte) 2);

    private byte value;

    CRPWatchFaceType(byte b8) {
        this.value = b8;
    }

    public static CRPWatchFaceType getInstance(byte b8) {
        if (b8 == 0) {
            return AI_WATCH_FACE;
        }
        if (b8 == 1) {
            return PHOTO_WATCH_FACE;
        }
        if (b8 != 2) {
            return null;
        }
        return VIDEO_WATCH_FACE;
    }

    public byte getValue() {
        return this.value;
    }
}
