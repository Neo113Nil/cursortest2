package com.crrepa.ble.nrf.error;

/* loaded from: classes3.dex */
public final class LegacyDfuError {
    public static final int CRC_ERROR = 5;
    public static final int DATA_SIZE_EXCEEDS_LIMIT = 4;
    public static final int INVALID_STATE = 2;
    public static final int NOT_SUPPORTED = 3;
    public static final int OPERATION_FAILED = 6;

    public static String parse(int i8) {
        int i9 = i8 & (-8193);
        if (i9 == 2) {
            return "REMOTE DFU INVALID STATE";
        }
        if (i9 == 3) {
            return "REMOTE DFU NOT SUPPORTED";
        }
        if (i9 == 4) {
            return "REMOTE DFU DATA SIZE EXCEEDS LIMIT";
        }
        if (i9 == 5) {
            return "REMOTE DFU INVALID CRC ERROR";
        }
        if (i9 == 6) {
            return "REMOTE DFU OPERATION FAILED";
        }
        return "UNKNOWN (" + i8 + ")";
    }
}
