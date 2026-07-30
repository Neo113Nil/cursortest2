package com.realsil.sdk.core.bluetooth.compat;

import android.bluetooth.BluetoothClass;
import com.google.android.material.internal.ViewUtils;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import g0.a;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class BluetoothClassCompat {
    public static final int PROFILE_A2DP = 1;
    public static final int PROFILE_A2DP_SINK = 6;
    public static final int PROFILE_HEADSET = 0;
    public static final int PROFILE_HID = 3;
    public static final int PROFILE_NAP = 5;
    public static final int PROFILE_OPP = 2;
    public static final int PROFILE_PANU = 4;

    public static class Device {
        public static final int PERIPHERAL_KEYBOARD = 1344;
        public static final int PERIPHERAL_KEYBOARD_POINTING = 1472;
        public static final int PERIPHERAL_NON_KEYBOARD_NON_POINTING = 1280;
        public static final int PERIPHERAL_POINTING = 1408;
    }

    public static boolean doesClassMatch(BluetoothClass bluetoothClass, int i8, boolean z7) {
        int deviceClass;
        int deviceClass2;
        int deviceClass3;
        if (i8 == 1) {
            return (z7 && bluetoothClass.hasService(262144)) || (deviceClass3 = bluetoothClass.getDeviceClass()) == 1044 || deviceClass3 == 1048 || deviceClass3 == 1056 || deviceClass3 == 1064;
        }
        if (i8 == 6) {
            return (z7 && bluetoothClass.hasService(524288)) || (deviceClass2 = bluetoothClass.getDeviceClass()) == 1060 || deviceClass2 == 1064 || deviceClass2 == 1068;
        }
        if (i8 == 0) {
            return (z7 && bluetoothClass.hasService(262144)) || (deviceClass = bluetoothClass.getDeviceClass()) == 1028 || deviceClass == 1032 || deviceClass == 1056;
        }
        if (i8 == 2) {
            if (z7 && bluetoothClass.hasService(1048576)) {
                return true;
            }
            switch (bluetoothClass.getDeviceClass()) {
                case 256:
                case 260:
                case DfuException.ERROR_CONNECT_ERROR /* 264 */:
                case DfuException.ERROR_SEND_COMMAND_REACH_MAX_RETRY_TIMES /* 268 */:
                case DfuException.ERROR_READ_PATCH_INFO_ERROR /* 272 */:
                case DfuException.ERROR_REQUEST_MTU_NO_CALLBACK /* 276 */:
                case DfuException.ERROR_ENTER_OTA_MODE_FAILED /* 280 */:
                case 512:
                case 516:
                case 520:
                case DfuConstants.PROGRESS_ACTIVE_IMAGE_AND_RESET /* 524 */:
                case 528:
                case 532:
                    return true;
                default:
                    return false;
            }
        }
        if (i8 == 3) {
            return (bluetoothClass.getDeviceClass() & 1280) == 1280;
        }
        if (i8 == 4 || i8 == 5) {
            return (z7 && bluetoothClass.hasService(131072)) || (bluetoothClass.getDeviceClass() & ViewUtils.EDGE_TO_EDGE_FLAGS) == 768;
        }
        return false;
    }

    public static boolean isAudioDevice(BluetoothClass bluetoothClass) {
        if (bluetoothClass == null) {
            return false;
        }
        ZLogger.v(String.format("getDeviceClass: 0x%04X", Integer.valueOf(bluetoothClass.getDeviceClass())));
        switch (bluetoothClass.getDeviceClass()) {
            default:
                if (!doesClassMatch(bluetoothClass, 0, true) && !doesClassMatch(bluetoothClass, 1, true)) {
                    return false;
                }
                break;
            case 1024:
            case 1028:
            case 1032:
            case 1040:
            case 1044:
            case 1048:
            case 1052:
            case 1056:
            case 1060:
            case 1064:
            case 1068:
            case 1072:
            case 1076:
            case 1080:
            case 1084:
            case 1088:
            case 1096:
                return true;
        }
    }

    public static boolean isHidDevice(BluetoothClass bluetoothClass) {
        if (bluetoothClass == null) {
            return false;
        }
        int deviceClass = bluetoothClass.getDeviceClass();
        boolean z7 = deviceClass == 1344 || deviceClass == 1408 || deviceClass == 1472;
        ZLogger.v(String.format("getDeviceClass: 0x%04X, isHid=%b", Integer.valueOf(bluetoothClass.getDeviceClass()), Boolean.valueOf(z7)));
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String parseDeviceClass(BluetoothClass bluetoothClass) {
        String str;
        int deviceClass;
        String str2;
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.US;
        sb.append(String.format(locale, "major=0x%04X(", Integer.valueOf(bluetoothClass.getMajorDeviceClass())));
        int majorDeviceClass = bluetoothClass.getMajorDeviceClass();
        if (majorDeviceClass == 0) {
            str = "MISC";
        } else if (majorDeviceClass == 256) {
            str = "COMPUTER";
        } else if (majorDeviceClass == 512) {
            str = a.PHONE;
        } else if (majorDeviceClass == 768) {
            str = "NETWORKING";
        } else if (majorDeviceClass == 1024) {
            str = "AUDIO_VIDEO";
        } else if (majorDeviceClass == 1280) {
            str = "PERIPHERAL";
        } else if (majorDeviceClass == 1536) {
            str = "IMAGING";
        } else if (majorDeviceClass == 1792) {
            str = "WEARABLE";
        } else if (majorDeviceClass == 2048) {
            str = "TOY";
        } else {
            if (majorDeviceClass != 2304) {
                sb.append("UNCATEGORIZED");
                sb.append(")");
                sb.append(String.format(locale, "device=0x%04X(", Integer.valueOf(bluetoothClass.getDeviceClass())));
                deviceClass = bluetoothClass.getDeviceClass();
                if (deviceClass != 260) {
                    str2 = "COMPUTER_DESKTOP";
                } else if (deviceClass == 1344) {
                    str2 = "PERIPHERAL_KEYBOARD";
                } else if (deviceClass == 1408) {
                    str2 = "PERIPHERAL_POINTING";
                } else {
                    if (deviceClass != 1472) {
                        sb.append("UNCATEGORIZED");
                        sb.append(")");
                        return sb.toString();
                    }
                    str2 = "PERIPHERAL_KEYBOARD_POINTING";
                }
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }
            str = "HEALTH";
        }
        sb.append(str);
        sb.append(")");
        sb.append(String.format(locale, "device=0x%04X(", Integer.valueOf(bluetoothClass.getDeviceClass())));
        deviceClass = bluetoothClass.getDeviceClass();
        if (deviceClass != 260) {
        }
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
