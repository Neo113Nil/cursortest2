package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPVibrationStrength {
    LOW((byte) 1),
    MEDIUM((byte) 2),
    STRONG((byte) 3);

    private byte value;

    CRPVibrationStrength(byte b8) {
        this.value = b8;
    }

    public static CRPVibrationStrength getInstance(byte b8) {
        if (b8 == 1) {
            return LOW;
        }
        if (b8 == 2) {
            return MEDIUM;
        }
        if (b8 != 3) {
            return null;
        }
        return STRONG;
    }

    public byte getValue() {
        return this.value;
    }
}
