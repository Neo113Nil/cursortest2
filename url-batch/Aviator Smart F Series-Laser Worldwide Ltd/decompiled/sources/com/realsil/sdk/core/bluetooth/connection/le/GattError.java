package com.realsil.sdk.core.bluetooth.connection.le;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* loaded from: classes4.dex */
public final class GattError {
    public static final int BLE_HCI_INSTANT_PASSED = 40;
    public static final int GATT_ALREADY_OPEN = 145;
    public static final int GATT_AUTH_FAIL = 137;
    public static final int GATT_BUSY = 132;
    public static final int GATT_CANCEL = 146;
    public static final int GATT_CCC_CFG_ERR = 253;
    public static final int GATT_CMD_STARTED = 134;
    public static final int GATT_CONGESTED = 143;
    public static final int GATT_CONNECTION_TIMEOUT = 147;
    public static final int GATT_CONN_CANCEL = 256;
    public static final int GATT_CONN_FAIL_ESTABLISH = 62;
    public static final int GATT_CONN_L2C_FAILURE = 1;
    public static final int GATT_CONN_LMP_TIMEOUT = 34;
    public static final int GATT_CONN_TERMINATE_LOCAL_HOST = 22;
    public static final int GATT_CONN_TERMINATE_PEER_USER = 19;
    public static final int GATT_DATABASE_OUT_OF_SYNC = 18;
    public static final int GATT_DB_FULL = 131;
    public static final int GATT_DUP_REG = 144;
    public static final int GATT_ENCRYPED_MITM = 0;
    public static final int GATT_ENCRYPED_NO_MITM = 141;
    public static final int GATT_ERROR = 133;
    public static final int GATT_ERR_UNLIKELY = 14;
    public static final int GATT_ILLEGAL_PARAMETER = 135;
    public static final int GATT_INSUF_AUTHENTICATION = 5;
    public static final int GATT_INSUF_AUTHORIZATION = 8;
    public static final int GATT_INSUF_ENCRYPTION = 15;
    public static final int GATT_INSUF_KEY_SIZE = 12;
    public static final int GATT_INSUF_RESOURCE = 17;
    public static final int GATT_INTERNAL_ERROR = 129;
    public static final int GATT_INVALID_ATTR_LEN = 13;
    public static final int GATT_INVALID_CFG = 139;
    public static final int GATT_INVALID_HANDLE = 1;
    public static final int GATT_INVALID_OFFSET = 7;
    public static final int GATT_INVALID_PDU = 4;
    public static final int GATT_NOT_ENCRYPTED = 142;
    public static final int GATT_NOT_FOUND = 10;
    public static final int GATT_NOT_LONG = 11;
    public static final int GATT_NO_RESOURCES = 128;
    public static final int GATT_OUT_OF_RANGE = 255;
    public static final int GATT_PENDING = 136;
    public static final int GATT_PRC_IN_PROGRESS = 254;
    public static final int GATT_PREPARE_Q_FULL = 9;
    public static final int GATT_READ_NOT_PERMIT = 2;
    public static final int GATT_REQ_NOT_SUPPORTED = 6;
    public static final int GATT_SERVICE_STARTED = 140;
    public static final int GATT_SUCCESS = 0;
    public static final int GATT_UNSUPPORT_GRP_TYPE = 16;
    public static final int GATT_VALUE_NOT_ALLOWED = 19;
    public static final int GATT_WRITE_NOT_PERMIT = 3;
    public static final int GATT_WRONG_STATE = 130;
    public static final int HCI_ERR_CONNECTION_TOUT = 8;
    public static final int HCI_ERR_PAGE_TIMEOUT = 4;

    public static String parse(int i8) {
        if (i8 == 147) {
            return "0x0093-GATT_CONNECTION_TIMEOUT";
        }
        if (i8 == 257) {
            return "0x0101-TOO MANY OPEN CONNECTIONS";
        }
        switch (i8) {
            case 0:
                return "0x0000-SUCCESS";
            case 1:
                return "0x0001-GATT_INVALID_HANDLE";
            case 2:
                return "0x0002-GATT_READ_NOT_PERMIT";
            case 3:
                return "0x0003-GATT_WRITE_NOT_PERMIT";
            case 4:
                return "0x0004-GATT_INVALID_PDU";
            case 5:
                return "0x0005-GATT_INSUF_AUTHENTICATION";
            case 6:
                return "0x0006-GATT_REQ_NOT_SUPPORTED";
            case 7:
                return "0x0007-GATT_INVALID_OFFSET";
            case 8:
                return "0x0008-GATT_INSUF_AUTHORIZATION";
            case 9:
                return "0x0009-GATT_PREPARE_Q_FULL";
            case 10:
                return "0x000a-GATT_NOT_FOUND";
            case 11:
                return "0x000b-GATT_NOT_LONG";
            case 12:
                return "0x000c-GATT_INSUF_KEY_SIZE";
            case 13:
                return "0x000d-GATT_INVALID_ATTR_LEN";
            case 14:
                return "0x000e-GATT_ERR_UNLIKELY";
            case 15:
                return "0x000f-GATT_INSUF_ENCRYPTION";
            case 16:
                return "0x0010-GATT_UNSUPPORT_GRP_TYPE";
            case 17:
                return "0x0011-GATT_INSUF_RESOURCE";
            default:
                switch (i8) {
                    case 128:
                        return "0x0080-GATT_NO_RESOURCES";
                    case 129:
                        return "0x0081-GATT_INTERNAL_ERROR";
                    case 130:
                        return "0x0082-GATT_WRONG_STATE";
                    case 131:
                        return "0x0083-GATT_DB_FULL";
                    case 132:
                        return "0x0084-GATT_BUSY";
                    case 133:
                        return "0x0085-GATT_ERROR";
                    case 134:
                        return "0x0086-GATT_CMD_STARTED";
                    case 135:
                        return "0x0087-GATT_ILLEGAL_PARAMETER";
                    case GATT_PENDING /* 136 */:
                        return "0x0088-GATT_PENDING";
                    case GATT_AUTH_FAIL /* 137 */:
                        return "0x0089-GATT_AUTH_FAIL";
                    case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                        return "0x008a-GATT_MORE";
                    case GATT_INVALID_CFG /* 139 */:
                        return "0x008b-GATT_INVALID_CFG";
                    case 140:
                        return "0x008c-GATT_SERVICE_STARTED";
                    case GATT_ENCRYPED_NO_MITM /* 141 */:
                        return "0x008d-GATT_ENCRYPED_NO_MITM";
                    case GATT_NOT_ENCRYPTED /* 142 */:
                        return "0x008e-GATT_NOT_ENCRYPTED";
                    case GATT_CONGESTED /* 143 */:
                        return "0x008f-GATT_CONGESTED";
                    default:
                        switch (i8) {
                            case GATT_CCC_CFG_ERR /* 253 */:
                                return "0x00FD-GATT_CCC_CFG_ERR";
                            case GATT_PRC_IN_PROGRESS /* 254 */:
                                return "0x00FE-GATT_PRC_IN_PROGRESS";
                            case 255:
                                return "0x00FF-GATT_OUT_OF_RANGE";
                            default:
                                return "UNKNOWN (" + i8 + ")";
                        }
                }
        }
    }

    public static String parseConnectionError(int i8) {
        switch (i8) {
            case 0:
                return "0x00-SUCCESS";
            case 1:
                return "0x01-GATT_INVALID_HANDLE";
            case 2:
                return "0x02-GATT_READ_NOT_PERMIT";
            case 3:
                return "0x03-GATT_WRITE_NOT_PERMIT";
            case 4:
                return "0x04-HCI_ERR_PAGE_TIMEOUT";
            case 5:
                return "0x05-GATT_INSUF_AUTHENTICATION";
            case 6:
                return "0x06-GATT_REQ_NOT_SUPPORTED";
            case 7:
                return "0x07-GATT_INVALID_OFFSET";
            case 8:
                return "0x08-HCI_ERR_CONNECTION_TOUT";
            case 9:
                return "0x09-GATT_PREPARE_Q_FULL";
            case 10:
                return "0x0a-GATT_NOT_FOUND";
            case 11:
                return "0x0b-GATT_NOT_LONG";
            case 12:
                return "0x0c-GATT_INSUF_KEY_SIZE";
            case 13:
                return "0x0d-GATT_INVALID_ATTR_LEN";
            case 14:
                return "0x0E-GATT_ERR_UNLIKELY";
            default:
                if (i8 == 19) {
                    return "0x13-GATT_CONN_TERMINATE_PEER_USER";
                }
                if (i8 == 22) {
                    return "0x16-GATT_CONN_TERMINATE_LOCAL_HOST";
                }
                if (i8 == 34) {
                    return "0x22-GATT_CONN_LMP_TIMEOUT";
                }
                if (i8 == 40) {
                    return "0x28-BLE_HCI_INSTANT_PASSED";
                }
                if (i8 == 62) {
                    return "0x3E-GATT_CONN_FAIL_ESTABLISH";
                }
                if (i8 == 133) {
                    return "0x85-GATT_ERROR";
                }
                if (i8 == 143) {
                    return "0x008F-GATT_CONNECTION_CONGESTED";
                }
                if (i8 == 147) {
                    return "0x93-GATT_CONNECTION_TIMEOUT";
                }
                switch (i8) {
                    case 255:
                        return "0xFF-GATT_OUT_OF_RANGE";
                    case 256:
                        return "0x0100-GATT_CONN_CANCEL";
                    case 257:
                        return "0x0101-GATT_FAILURE";
                    default:
                        return String.format("UNKNOWN (0x%04X)", Integer.valueOf(i8));
                }
        }
    }
}
