package com.crrepa.ble.nrf.error;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* loaded from: classes3.dex */
public class GattError {
    public static String parse(int i8) {
        if (i8 == 257) {
            return "TOO MANY OPEN CONNECTIONS";
        }
        if (i8 == 4110) {
            return "DFU DEVICE NOT BONDED";
        }
        switch (i8) {
            case 1:
                return "GATT INVALID HANDLE";
            case 2:
                return "GATT READ NOT PERMIT";
            case 3:
                return "GATT WRITE NOT PERMIT";
            case 4:
                return "GATT INVALID PDU";
            case 5:
                return "GATT INSUF AUTHENTICATION";
            case 6:
                return "GATT REQ NOT SUPPORTED";
            case 7:
                return "GATT INVALID OFFSET";
            case 8:
                return "GATT INSUF AUTHORIZATION";
            case 9:
                return "GATT PREPARE Q FULL";
            case 10:
                return "GATT NOT FOUND";
            case 11:
                return "GATT NOT LONG";
            case 12:
                return "GATT INSUF KEY SIZE";
            case 13:
                return "GATT INVALID ATTR LEN";
            case 14:
                return "GATT ERR UNLIKELY";
            case 15:
                return "GATT INSUF ENCRYPTION";
            case 16:
                return "GATT UNSUPPORT GRP TYPE";
            case 17:
                return "GATT INSUF RESOURCE";
            default:
                switch (i8) {
                    case 128:
                        return "GATT NO RESOURCES";
                    case 129:
                        return "GATT INTERNAL ERROR";
                    case 130:
                        return "GATT WRONG STATE";
                    case 131:
                        return "GATT DB FULL";
                    case 132:
                        return "GATT BUSY";
                    case 133:
                        return "GATT ERROR";
                    case 134:
                        return "GATT CMD STARTED";
                    case 135:
                        return "GATT ILLEGAL PARAMETER";
                    case com.realsil.sdk.core.bluetooth.connection.le.GattError.GATT_PENDING /* 136 */:
                        return "GATT PENDING";
                    case com.realsil.sdk.core.bluetooth.connection.le.GattError.GATT_AUTH_FAIL /* 137 */:
                        return "GATT AUTH FAIL";
                    case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                        return "GATT MORE";
                    case com.realsil.sdk.core.bluetooth.connection.le.GattError.GATT_INVALID_CFG /* 139 */:
                        return "GATT INVALID CFG";
                    case 140:
                        return "GATT SERVICE STARTED";
                    case com.realsil.sdk.core.bluetooth.connection.le.GattError.GATT_ENCRYPED_NO_MITM /* 141 */:
                        return "GATT ENCRYPTED NO MITM";
                    case com.realsil.sdk.core.bluetooth.connection.le.GattError.GATT_NOT_ENCRYPTED /* 142 */:
                        return "GATT NOT ENCRYPTED";
                    case com.realsil.sdk.core.bluetooth.connection.le.GattError.GATT_CONGESTED /* 143 */:
                        return "GATT CONGESTED";
                    default:
                        switch (i8) {
                            case com.realsil.sdk.core.bluetooth.connection.le.GattError.GATT_CCC_CFG_ERR /* 253 */:
                                return "GATT CCCD CFG ERROR";
                            case com.realsil.sdk.core.bluetooth.connection.le.GattError.GATT_PRC_IN_PROGRESS /* 254 */:
                                return "GATT PROCEDURE IN PROGRESS";
                            case 255:
                                return "GATT VALUE OUT OF RANGE";
                            default:
                                switch (i8) {
                                    case 4096:
                                        return "DFU DEVICE DISCONNECTED";
                                    case 4097:
                                        return "DFU FILE NOT FOUND";
                                    case 4098:
                                        return "DFU FILE ERROR";
                                    case 4099:
                                        return "DFU NOT A VALID HEX FILE";
                                    case 4100:
                                        return "DFU IO EXCEPTION";
                                    case 4101:
                                        return "DFU SERVICE DISCOVERY NOT STARTED";
                                    case 4102:
                                        return "DFU SERVICE NOT FOUND";
                                    case 4103:
                                        return "DFU CHARACTERISTICS NOT FOUND";
                                    case 4104:
                                        return "DFU INVALID RESPONSE";
                                    case 4105:
                                        return "DFU FILE TYPE NOT SUPPORTED";
                                    case 4106:
                                        return "BLUETOOTH ADAPTER DISABLED";
                                    case 4107:
                                        return "INIT PACKET REQUIRED";
                                    case 4108:
                                        return "DFU FILE NOT WORD ALIGNED";
                                    default:
                                        if ((i8 & 8192) > 0) {
                                            return LegacyDfuError.parse(i8);
                                        }
                                        return "UNKNOWN (" + i8 + ")";
                                }
                        }
                }
        }
    }

    public static String parseConnectionError(int i8) {
        if (i8 == 0) {
            return "SUCCESS";
        }
        if (i8 == 1) {
            return "GATT CONN L2C FAILURE";
        }
        if (i8 == 8) {
            return "GATT CONN TIMEOUT";
        }
        if (i8 == 19) {
            return "GATT CONN TERMINATE PEER USER";
        }
        if (i8 == 22) {
            return "GATT CONN TERMINATE LOCAL HOST";
        }
        if (i8 == 34) {
            return "GATT CONN LMP TIMEOUT";
        }
        if (i8 == 62) {
            return "GATT CONN FAIL ESTABLISH";
        }
        if (i8 == 133) {
            return "GATT ERROR";
        }
        if (i8 == 256) {
            return "GATT CONN CANCEL ";
        }
        return "UNKNOWN (" + i8 + ")";
    }
}
