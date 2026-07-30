package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPEpoType {
    GPS((byte) 0),
    GALILEO((byte) 1),
    BEIDOU((byte) 2),
    ICOE_GPS((byte) 3),
    ICOE_BDS((byte) 4),
    ICOE_GALILEO((byte) 5),
    ICOE_QZSS((byte) 6),
    HISILICON_GPS((byte) -1);

    private byte value;

    CRPEpoType(byte b8) {
        this.value = b8;
    }

    public static CRPEpoType getInstance(byte b8) {
        switch (b8) {
            case 0:
                return GPS;
            case 1:
                return GALILEO;
            case 2:
                return BEIDOU;
            case 3:
                return ICOE_GPS;
            case 4:
                return ICOE_BDS;
            case 5:
                return ICOE_GALILEO;
            case 6:
                return ICOE_QZSS;
            default:
                return null;
        }
    }

    public byte getValue() {
        return this.value;
    }
}
