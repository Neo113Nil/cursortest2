package com.crrepa.ble.nrf.error;

/* loaded from: classes3.dex */
public final class SecureDfuError {
    public static final int EXTENDED_ERROR = 11;
    public static final int EXT_ERROR_FW_VERSION_FAILURE = 5;
    public static final int EXT_ERROR_HASH_FAILED = 10;
    public static final int EXT_ERROR_HW_VERSION_FAILURE = 6;
    public static final int EXT_ERROR_INIT_COMMAND_INVALID = 4;
    public static final int EXT_ERROR_INSUFFICIENT_SPACE = 13;
    public static final int EXT_ERROR_SD_VERSION_FAILURE = 7;
    public static final int EXT_ERROR_SIGNATURE_MISSING = 8;
    public static final int EXT_ERROR_UNKNOWN_COMMAND = 3;
    public static final int EXT_ERROR_VERIFICATION_FAILED = 12;
    public static final int EXT_ERROR_WRONG_COMMAND_FORMAT = 2;
    public static final int EXT_ERROR_WRONG_HASH_TYPE = 9;
    public static final int EXT_ERROR_WRONG_SIGNATURE_TYPE = 11;
    public static final int INSUFFICIENT_RESOURCES = 4;
    public static final int INVALID_OBJECT = 5;
    public static final int INVALID_PARAM = 3;
    public static final int OPERATION_FAILED = 10;
    public static final int OPERATION_NOT_PERMITTED = 8;
    public static final int OP_CODE_NOT_SUPPORTED = 2;
    public static final int UNSUPPORTED_TYPE = 7;

    public static String parse(int i8) {
        switch (i8 & (-8193)) {
            case 2:
                return "REMOTE DFU OP CODE NOT SUPPORTED";
            case 3:
                return "REMOTE DFU INVALID PARAM";
            case 4:
                return "REMOTE DFU INSUFFICIENT RESOURCES";
            case 5:
                return "REMOTE DFU INVALID OBJECT";
            case 6:
            case 9:
            default:
                return "UNKNOWN (" + i8 + ")";
            case 7:
                return "REMOTE DFU UNSUPPORTED TYPE";
            case 8:
                return "REMOTE DFU OPERATION NOT PERMITTED";
            case 10:
                return "REMOTE DFU OPERATION FAILED";
            case 11:
                return "REMOTE DFU EXTENDED ERROR";
        }
    }

    public static String parseExtendedError(int i8) {
        switch (i8) {
            case 2:
                return "Wrong command format";
            case 3:
                return "Unknown command";
            case 4:
                return "Init command invalid";
            case 5:
                return "FW version failure";
            case 6:
                return "HW version failure";
            case 7:
                return "SD version failure";
            case 8:
                return "Signature mismatch";
            case 9:
                return "Wrong hash type";
            case 10:
                return "Hash failed";
            case 11:
                return "Wring signature type";
            case 12:
                return "Verification failed";
            case 13:
                return "Insufficient space";
            default:
                return "Reserved for future use";
        }
    }
}
