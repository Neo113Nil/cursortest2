package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPMuslimPrayerAsrCalculationType {
    SHAFII((byte) 0),
    HANAFI((byte) 1);

    private byte value;

    CRPMuslimPrayerAsrCalculationType(byte b8) {
        this.value = b8;
    }

    public static CRPMuslimPrayerAsrCalculationType getInstance(byte b8) {
        if (b8 == 0) {
            return SHAFII;
        }
        if (b8 != 1) {
            return null;
        }
        return HANAFI;
    }

    public byte getValue() {
        return this.value;
    }
}
