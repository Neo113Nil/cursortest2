package com.crrepa.ble.conn.type;

/* loaded from: classes3.dex */
public enum CRPMcuPlatform {
    PLATFORM_NONE(0),
    PLATFORM_NORDIC(1),
    PLATFORM_HUNTERSUN(2),
    PLATFORM_REALTEK(3),
    PLATFORM_GOODIX(4),
    PLATFORM_SIFLI(5),
    PLATFORM_JIELI(6),
    PLATFORM_BLUETRUM(7),
    PLATFORM_HISILICON(8);

    private int value;

    CRPMcuPlatform(int i8) {
        this.value = i8;
    }

    public static CRPMcuPlatform getInstance(int i8) {
        switch (i8) {
            case 1:
                return PLATFORM_NORDIC;
            case 2:
                return PLATFORM_HUNTERSUN;
            case 3:
                return PLATFORM_REALTEK;
            case 4:
                return PLATFORM_GOODIX;
            case 5:
                return PLATFORM_SIFLI;
            case 6:
                return PLATFORM_JIELI;
            case 7:
                return PLATFORM_BLUETRUM;
            case 8:
                return PLATFORM_HISILICON;
            default:
                return PLATFORM_NONE;
        }
    }

    public int getValue() {
        return this.value;
    }
}
