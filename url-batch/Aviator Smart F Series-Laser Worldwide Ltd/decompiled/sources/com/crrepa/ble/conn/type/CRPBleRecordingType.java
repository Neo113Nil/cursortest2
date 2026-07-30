package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPBleRecordingType {
    JIELI((byte) 1),
    REALTEK((byte) 2),
    HISILICON((byte) 3);

    private final byte value;

    CRPBleRecordingType(byte b8) {
        this.value = b8;
    }

    public static CRPBleRecordingType getInstance(byte b8) {
        if (b8 == 1) {
            return JIELI;
        }
        if (b8 == 2) {
            return REALTEK;
        }
        if (b8 != 3) {
            return null;
        }
        return HISILICON;
    }

    public byte getValue() {
        return this.value;
    }
}
