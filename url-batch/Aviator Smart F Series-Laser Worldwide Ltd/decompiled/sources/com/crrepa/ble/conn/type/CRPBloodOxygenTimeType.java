package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPBloodOxygenTimeType {
    TODAY(0),
    YESTERDAY(4);

    private int value;

    CRPBloodOxygenTimeType(int i8) {
        this.value = i8;
    }

    public int getValue() {
        return this.value;
    }
}
