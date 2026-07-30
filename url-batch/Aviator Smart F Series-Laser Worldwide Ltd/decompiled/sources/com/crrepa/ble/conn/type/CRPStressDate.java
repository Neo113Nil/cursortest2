package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPStressDate {
    TODAY(0),
    YESTERDAY(1);

    private int value;

    CRPStressDate(int i8) {
        this.value = i8;
    }

    public static CRPStressDate getInstance(int i8) {
        if (i8 == 0) {
            return TODAY;
        }
        if (i8 != 1) {
            return null;
        }
        return YESTERDAY;
    }

    public byte getValue() {
        return (byte) this.value;
    }
}
