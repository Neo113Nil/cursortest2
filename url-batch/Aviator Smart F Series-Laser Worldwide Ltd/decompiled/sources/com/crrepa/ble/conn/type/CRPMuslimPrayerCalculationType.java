package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPMuslimPrayerCalculationType {
    JAFARI((byte) 0),
    KARACHI((byte) 1),
    MWL((byte) 2),
    ISNA((byte) 3),
    MAKKAH((byte) 4),
    EGYPT((byte) 5),
    CUSTOM((byte) 6),
    SIHAT((byte) 7),
    KEMENAG((byte) 8);

    private byte value;

    CRPMuslimPrayerCalculationType(byte b8) {
        this.value = b8;
    }

    public static CRPMuslimPrayerCalculationType getInstance(byte b8) {
        for (CRPMuslimPrayerCalculationType cRPMuslimPrayerCalculationType : values()) {
            if (cRPMuslimPrayerCalculationType.getValue() == b8) {
                return cRPMuslimPrayerCalculationType;
            }
        }
        return null;
    }

    public byte getValue() {
        return this.value;
    }
}
