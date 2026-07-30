package com.realsil.sdk.core.bluetooth.compat;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import android.os.Process;
import androidx.annotation.RequiresPermission;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class BluetoothDeviceCompat {
    public static final int ADDRESS_TYPE_PUBLIC = 0;
    public static final int ADDRESS_TYPE_RANDOM = 1;
    public static final int PAIRING_VARIANT_CONSENT = 3;
    public static final int PAIRING_VARIANT_DISPLAY_PASSKEY = 4;
    public static final int PAIRING_VARIANT_DISPLAY_PIN = 5;
    public static final int PAIRING_VARIANT_OOB_CONSENT = 6;
    public static final int PAIRING_VARIANT_PASSKEY = 1;
    public static final int TRANSPORT_AUTO = 0;
    public static final int TRANSPORT_BREDR = 1;
    public static final int TRANSPORT_LE = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AddressType {
    }

    @SuppressLint({"NewApi"})
    public static boolean createBond(BluetoothDevice bluetoothDevice) {
        Locale locale = Locale.US;
        ZLogger.v("create bond for " + BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true));
        return bluetoothDevice.createBond();
    }

    public static void dumpSupportedUuids(BluetoothDevice bluetoothDevice) {
        ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (uuids == null || uuids.length <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("supported features (UUIDs)");
        for (ParcelUuid parcelUuid : uuids) {
            sb.append("\n\t" + parcelUuid.toString());
        }
        ZLogger.v(sb.toString());
    }

    @RequiresPermission("android.permission.BLUETOOTH")
    public static boolean isConnected(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return false;
        }
        try {
            Method declaredMethod = BluetoothDevice.class.getDeclaredMethod("isConnected", null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(bluetoothDevice, null)).booleanValue();
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static String pairingVariantToString(int i8) {
        switch (i8) {
            case 0:
                return "PAIRING_VARIANT_PIN";
            case 1:
                return "PAIRING_VARIANT_PASSKEY";
            case 2:
                return "PAIRING_VARIANT_PASSKEY_CONFIRMATION";
            case 3:
                return "PAIRING_VARIANT_CONSENT";
            case 4:
                return "PAIRING_VARIANT_DISPLAY_PASSKEY";
            case 5:
                return "PAIRING_VARIANT_DISPLAY_PIN";
            case 6:
                return "PAIRING_VARIANT_OOB_CONSENT";
            default:
                return "UNKNOWN";
        }
    }

    public static String parseDeviceType(int i8) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? "Unknown" : "DUAL(BR/EDR/LE)" : "LE" : "BR/EDR";
    }

    @RequiresPermission("android.permission.BLUETOOTH_ADMIN")
    public static boolean removeBond(BluetoothDevice bluetoothDevice) {
        try {
            Method method = bluetoothDevice.getClass().getMethod("removeBond", null);
            ZLogger.d("removeBond() for device " + bluetoothDevice.getAddress() + " called by pid: " + Process.myPid() + " tid: " + Process.myTid());
            boolean booleanValue = ((Boolean) method.invoke(bluetoothDevice, null)).booleanValue();
            StringBuilder sb = new StringBuilder("removeBond: ");
            sb.append(booleanValue);
            ZLogger.d(sb.toString());
            return booleanValue;
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            return false;
        }
    }

    public static boolean createBond(BluetoothDevice bluetoothDevice, int i8) {
        if (bluetoothDevice == null) {
            ZLogger.v("createBond failed, device is null");
            return false;
        }
        try {
            Locale locale = Locale.US;
            ZLogger.v("create bond for " + BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true) + ", transport=" + i8);
            Method method = bluetoothDevice.getClass().getMethod("createBond", Integer.TYPE);
            if (method != null) {
                return ((Boolean) method.invoke(bluetoothDevice, Integer.valueOf(i8))).booleanValue();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return false;
    }
}
