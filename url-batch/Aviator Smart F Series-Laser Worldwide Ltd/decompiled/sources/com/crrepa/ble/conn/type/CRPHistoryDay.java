package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPHistoryDay {
    TODAY((byte) 0),
    YESTERDAY((byte) 1),
    THE_DAY_BEFORE_YESTERDAY((byte) 2),
    THREE_DAYS_AGO((byte) 3),
    FOUR_DAYS_AGO((byte) 4),
    FIVE_DAYS_AGO((byte) 5),
    SIX_DAYS_AGO((byte) 6);

    private byte value;

    CRPHistoryDay(byte b8) {
        this.value = b8;
    }

    public static CRPHistoryDay getInstance(byte b8) {
        switch (b8) {
            case 0:
                return TODAY;
            case 1:
                return YESTERDAY;
            case 2:
                return THE_DAY_BEFORE_YESTERDAY;
            case 3:
                return THREE_DAYS_AGO;
            case 4:
                return FOUR_DAYS_AGO;
            case 5:
                return FIVE_DAYS_AGO;
            case 6:
                return SIX_DAYS_AGO;
            default:
                return null;
        }
    }

    public byte getValue() {
        return this.value;
    }

    public CRPHistoryDay nextDay() {
        return getInstance((byte) (this.value + 1));
    }
}
