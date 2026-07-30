package com.realsil.sdk.core.bluetooth.compat;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import androidx.annotation.RequiresPermission;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class BluetoothProfileCompat {
    public static final int HID_HOST = 4;

    public static boolean connectProfile(BluetoothProfile bluetoothProfile, BluetoothDevice bluetoothDevice) {
        StringBuilder sb;
        String str;
        if (bluetoothProfile == null || bluetoothDevice == null) {
            return false;
        }
        try {
            ZLogger.v("connectProfile(" + bluetoothProfile.getClass().getSimpleName() + ") for " + BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true));
            Method method = bluetoothProfile.getClass().getMethod("connect", BluetoothDevice.class);
            method.setAccessible(true);
            return ((Boolean) method.invoke(bluetoothProfile, bluetoothDevice)).booleanValue();
        } catch (IllegalAccessException e8) {
            e = e8;
            sb = new StringBuilder("Could not execute method 'connect' in profile ");
            sb.append(bluetoothProfile.getClass().getName());
            sb.append(", ignoring request.");
            sb.append(e.toString());
            str = sb.toString();
            ZLogger.w(str);
            return false;
        } catch (NoSuchMethodException unused) {
            str = "No connect method in the " + bluetoothProfile.getClass().getName() + " class, ignoring request.";
            ZLogger.w(str);
            return false;
        } catch (InvocationTargetException e9) {
            e = e9;
            sb = new StringBuilder("Could not execute method 'connect' in profile ");
            sb.append(bluetoothProfile.getClass().getName());
            sb.append(", ignoring request.");
            sb.append(e.toString());
            str = sb.toString();
            ZLogger.w(str);
            return false;
        }
    }

    public static boolean disconnect(BluetoothProfile bluetoothProfile, BluetoothDevice bluetoothDevice) {
        String str;
        if (bluetoothProfile != null && bluetoothDevice != null) {
            String str2 = "";
            try {
                str2 = bluetoothProfile.getClass().getName();
                ZLogger.v("disconnect : " + str2 + " : " + BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true));
                Method method = bluetoothProfile.getClass().getMethod("disconnect", BluetoothDevice.class);
                method.setAccessible(true);
                return ((Boolean) method.invoke(bluetoothProfile, bluetoothDevice)).booleanValue();
            } catch (IllegalAccessException e8) {
                e = e8;
                str = "Could not execute method 'disconnect' in profile " + str2 + ", ignoring request." + e.toString();
                ZLogger.w(str);
                return false;
            } catch (NoSuchMethodException unused) {
                str = "No disconnect method in the " + str2 + " class, ignoring request.";
                ZLogger.w(str);
                return false;
            } catch (InvocationTargetException e9) {
                e = e9;
                str = "Could not execute method 'disconnect' in profile " + str2 + ", ignoring request." + e.toString();
                ZLogger.w(str);
                return false;
            }
        }
        return false;
    }

    public static List<BluetoothDevice> getConnectedDevices(BluetoothProfile bluetoothProfile, String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (bluetoothProfile != null) {
            try {
                Method method = bluetoothProfile.getClass().asSubclass(Class.forName(str)).getMethod("getConnectedDevices", null);
                method.setAccessible(true);
                return (List) method.invoke(bluetoothProfile, null);
            } catch (ClassNotFoundException e8) {
                str2 = "Could not find clas: " + str + ", ignoring request." + e8.toString();
                ZLogger.w(str2);
                return arrayList;
            } catch (IllegalAccessException e9) {
                e = e9;
                str2 = "Could not execute method 'connect' in profile CLASS_NAME, ignoring request." + e.toString();
                ZLogger.w(str2);
                return arrayList;
            } catch (NoSuchMethodException unused) {
                str2 = "No connect method in the CLASS_NAME class, ignoring request.";
                ZLogger.w(str2);
                return arrayList;
            } catch (InvocationTargetException e10) {
                e = e10;
                str2 = "Could not execute method 'connect' in profile CLASS_NAME, ignoring request." + e.toString();
                ZLogger.w(str2);
                return arrayList;
            }
        }
        return arrayList;
    }

    @RequiresPermission("android.permission.BLUETOOTH")
    @TargetApi(19)
    public static int getConnectionState(BluetoothProfile bluetoothProfile, String str, BluetoothDevice bluetoothDevice) {
        String str2;
        if (bluetoothProfile == null || bluetoothDevice == null) {
            return 0;
        }
        try {
            Method method = bluetoothProfile.getClass().asSubclass(Class.forName(str)).getMethod("getConnectionState", BluetoothDevice.class);
            method.setAccessible(true);
            return ((Integer) method.invoke(bluetoothProfile, bluetoothDevice)).intValue();
        } catch (ClassNotFoundException e8) {
            str2 = "Could not find clas: " + str + ", ignoring request." + e8.toString();
            ZLogger.w(str2);
            return 0;
        } catch (IllegalAccessException e9) {
            e = e9;
            str2 = "Could not execute method 'connect' in profile CLASS_NAME, ignoring request." + e.toString();
            ZLogger.w(str2);
            return 0;
        } catch (NoSuchMethodException unused) {
            str2 = "No connect method in the CLASS_NAME class, ignoring request.";
            ZLogger.w(str2);
            return 0;
        } catch (InvocationTargetException e10) {
            e = e10;
            str2 = "Could not execute method 'connect' in profile CLASS_NAME, ignoring request." + e.toString();
            ZLogger.w(str2);
            return 0;
        }
    }

    public static String parseProfile(int i8) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 7 ? i8 != 8 ? i8 != 10 ? "Unknown" : "SAP" : "GATT_SERVER" : "GATT" : "HID_HOST" : "HEALTH" : "A2DP" : "HEADSET";
    }

    public static String parseProfileState(int i8) {
        if (i8 == 0) {
            return "0-BluetoothProfile.STATE_DISCONNECTED";
        }
        if (i8 == 1) {
            return "1-BluetoothProfile.STATE_CONNECTING";
        }
        if (i8 == 2) {
            return "2-BluetoothProfile.STATE_CONNECTED";
        }
        if (i8 == 3) {
            return "3-BluetoothProfile.STATE_DISCONNECTING";
        }
        return "UNKNOWN (" + i8 + ")";
    }

    public static boolean setPriority(BluetoothProfile bluetoothProfile, BluetoothDevice bluetoothDevice, int i8) {
        if (bluetoothProfile == null) {
            return false;
        }
        try {
            bluetoothProfile.getClass().getMethod("setPriority", BluetoothDevice.class, Integer.TYPE).invoke(bluetoothProfile, bluetoothDevice, Integer.valueOf(i8));
            return true;
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            return false;
        }
    }

    public static boolean connectProfile(BluetoothProfile bluetoothProfile, String str, BluetoothDevice bluetoothDevice) {
        StringBuilder sb;
        String str2;
        if (bluetoothProfile != null && bluetoothDevice != null) {
            try {
                ZLogger.v("connectProfile :" + BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true));
                Class<? extends U> asSubclass = bluetoothProfile.getClass().asSubclass(Class.forName(str));
                if (asSubclass != 0) {
                    Method method = asSubclass.getMethod("connect", BluetoothDevice.class);
                    method.setAccessible(true);
                    return ((Boolean) method.invoke(bluetoothProfile, bluetoothDevice)).booleanValue();
                }
                ZLogger.w("no class found: " + str);
                return false;
            } catch (ClassNotFoundException e8) {
                e = e8;
                sb = new StringBuilder("Could not find clas: ");
                sb.append(str);
                sb.append(", ignoring request.");
                sb.append(e.toString());
                str2 = sb.toString();
                ZLogger.w(str2);
                return false;
            } catch (IllegalAccessException e9) {
                e = e9;
                sb = new StringBuilder("Could not execute method 'connect' in profile ");
                sb.append(str);
                sb.append(", ignoring request.");
                sb.append(e.toString());
                str2 = sb.toString();
                ZLogger.w(str2);
                return false;
            } catch (NoSuchMethodException unused) {
                str2 = "No connect method in the " + str + " class, ignoring request.";
                ZLogger.w(str2);
                return false;
            } catch (InvocationTargetException e10) {
                e = e10;
                sb = new StringBuilder("Could not execute method 'connect' in profile ");
                sb.append(str);
                sb.append(", ignoring request.");
                sb.append(e.toString());
                str2 = sb.toString();
                ZLogger.w(str2);
                return false;
            }
        }
        return false;
    }

    public static boolean disconnect(BluetoothProfile bluetoothProfile, String str, BluetoothDevice bluetoothDevice) {
        StringBuilder sb;
        String str2;
        if (bluetoothProfile != null && bluetoothDevice != null) {
            try {
                ZLogger.v("disconnect : " + str + " : " + BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true));
                Method method = bluetoothProfile.getClass().asSubclass(Class.forName(str)).getMethod("disconnect", BluetoothDevice.class);
                method.setAccessible(true);
                return ((Boolean) method.invoke(bluetoothProfile, bluetoothDevice)).booleanValue();
            } catch (ClassNotFoundException e8) {
                e = e8;
                sb = new StringBuilder("Could not find clas: ");
                sb.append(str);
                sb.append(", ignoring request.");
                sb.append(e.toString());
                str2 = sb.toString();
                ZLogger.w(str2);
                return false;
            } catch (IllegalAccessException e9) {
                e = e9;
                sb = new StringBuilder("Could not execute method 'disconnect' in profile ");
                sb.append(str);
                sb.append(", ignoring request.");
                sb.append(e.toString());
                str2 = sb.toString();
                ZLogger.w(str2);
                return false;
            } catch (NoSuchMethodException unused) {
                str2 = "No disconnect method in the " + str + " class, ignoring request.";
                ZLogger.w(str2);
                return false;
            } catch (InvocationTargetException e10) {
                e = e10;
                sb = new StringBuilder("Could not execute method 'disconnect' in profile ");
                sb.append(str);
                sb.append(", ignoring request.");
                sb.append(e.toString());
                str2 = sb.toString();
                ZLogger.w(str2);
                return false;
            }
        }
        return false;
    }
}
