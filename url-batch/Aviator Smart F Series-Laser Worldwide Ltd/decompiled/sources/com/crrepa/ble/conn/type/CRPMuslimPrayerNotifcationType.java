package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPMuslimPrayerNotifcationType {
    FAJR((byte) 0),
    SUNRISE((byte) 1),
    DHUHR((byte) 2),
    ASR((byte) 3),
    MAGHRIB((byte) 4),
    ISHA((byte) 5);

    private byte value;

    CRPMuslimPrayerNotifcationType(byte b8) {
        this.value = b8;
    }

    public static CRPMuslimPrayerNotifcationType getInstance(byte b8) {
        if (b8 == 0) {
            return FAJR;
        }
        if (b8 == 1) {
            return SUNRISE;
        }
        if (b8 == 2) {
            return DHUHR;
        }
        if (b8 == 3) {
            return ASR;
        }
        if (b8 == 4) {
            return MAGHRIB;
        }
        if (b8 != 5) {
            return null;
        }
        return ISHA;
    }

    public byte getValue() {
        return this.value;
    }
}
