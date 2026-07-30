package com.realsil.sdk.core.bluetooth.compat;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import b5.b;
import com.realsil.sdk.core.logger.ZLogger;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class BluetoothGattCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f15438a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f15439b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f15440c;

    static {
        HashMap hashMap = new HashMap();
        f15438a = hashMap;
        hashMap.put(0, "UNKNOW");
        hashMap.put(1, "READ");
        hashMap.put(2, "READ_ENCRYPTED");
        hashMap.put(4, "READ_ENCRYPTED_MITM");
        hashMap.put(16, "WRITE");
        hashMap.put(32, "WRITE_ENCRYPTED");
        hashMap.put(64, "WRITE_ENCRYPTED_MITM");
        hashMap.put(128, "WRITE_SIGNED");
        hashMap.put(256, "WRITE_SIGNED_MITM");
        HashMap hashMap2 = new HashMap();
        f15439b = hashMap2;
        hashMap2.put(1, "BROADCAST");
        hashMap2.put(128, "EXTENDED_PROPS");
        hashMap2.put(32, "INDICATE");
        hashMap2.put(16, "NOTIFY");
        hashMap2.put(2, "READ");
        hashMap2.put(64, "SIGNED_WRITE");
        hashMap2.put(8, "WRITE");
        hashMap2.put(4, "WRITE_NO_RESPONSE");
        HashMap hashMap3 = new HashMap();
        f15440c = hashMap3;
        hashMap3.put(0, "NA");
        hashMap3.put(1, "READ");
        hashMap3.put(2, "READ_ENCRYPTED");
        hashMap3.put(4, "READ_ENCRYPTED_MITM");
        hashMap3.put(16, "WRITE");
        hashMap3.put(32, "WRITE_ENCRYPTED");
        hashMap3.put(64, "WRITE_ENCRYPTED_MITM");
        hashMap3.put(128, "WRITE_SIGNED");
        hashMap3.put(256, "WRITE_SIGNED_MITM");
    }

    public static String a(HashMap hashMap, int i8) {
        String str = (String) hashMap.get(Integer.valueOf(i8));
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < 32; i9++) {
            int i10 = 1 << i9;
            if ((i8 & i10) > 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        String str2 = "";
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            str2 = str2 + ((String) hashMap.get(arrayList.get(i11))) + b.VERTICAL;
        }
        return str2;
    }

    public static String getCharPermission(int i8) {
        return a(f15438a, i8);
    }

    public static String getCharPropertie(int i8) {
        return a(f15439b, i8);
    }

    public static String getDescPermission(int i8) {
        return a(f15440c, i8);
    }

    public static List<String> parseProperty(int i8) {
        ArrayList arrayList = new ArrayList();
        if ((i8 & 1) == 1) {
            arrayList.add("BROADCAST");
        }
        if ((i8 & 2) == 2) {
            arrayList.add("READ");
        }
        if ((i8 & 4) == 4) {
            arrayList.add("WRITE_NO_RESPONSE");
        }
        if ((i8 & 8) == 8) {
            arrayList.add("WRITE");
        }
        if ((i8 & 16) == 16) {
            arrayList.add("NOTIFY");
        }
        if ((i8 & 32) == 32) {
            arrayList.add("INDICATE");
        }
        return arrayList;
    }

    public static String parseProperty2(int i8) {
        StringBuilder sb = new StringBuilder();
        List<String> parseProperty = parseProperty(i8);
        if (parseProperty.size() > 0) {
            for (String str : parseProperty) {
                if (sb.length() > 0) {
                    sb.append(b.VERTICAL);
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    @RequiresApi(api = 18)
    public static boolean refresh(BluetoothGatt bluetoothGatt) {
        try {
            return ((Boolean) bluetoothGatt.getClass().getMethod("refresh", null).invoke(bluetoothGatt, null)).booleanValue();
        } catch (Exception e8) {
            ZLogger.w("refreshing device failed: " + e8.toString());
            return false;
        }
    }

    @RequiresApi(api = 18)
    public static boolean refreshDeviceCache(BluetoothGatt bluetoothGatt, boolean z7) {
        if (z7 || bluetoothGatt.getDevice().getBondState() == 10) {
            return refresh(bluetoothGatt);
        }
        return false;
    }

    public static boolean requestLeConnectionUpdate(BluetoothGatt bluetoothGatt, int i8, int i9, int i10, int i11, int i12, int i13) {
        try {
            Class<?> cls = bluetoothGatt.getClass();
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("requestLeConnectionUpdate", cls2, cls2, cls2, cls2, cls2, cls2);
            ZLogger.d("requestLeConnectionUpdate() - min=(" + i8 + ")" + (i8 * 1.25d) + "msec, max=(" + i9 + ")" + (i9 * 1.25d) + "msec, latency=" + i10 + ", timeout=" + i11 + "msec, min_ce=" + i12 + ", max_ce=" + i13);
            return ((Boolean) method.invoke(bluetoothGatt, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i11))).booleanValue();
        } catch (Exception e8) {
            ZLogger.w("refreshing device failed: " + e8.toString());
            return false;
        }
    }

    public static boolean writeCharacteristic(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
        int writeCharacteristic;
        String format;
        if (bluetoothGatt == null) {
            format = "gatt cannot be null.";
        } else if (bluetoothGattCharacteristic == null) {
            format = "characteristic cannot be null.";
        } else {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 33) {
                bluetoothGattCharacteristic.setValue(bArr);
                boolean writeCharacteristic2 = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
                if (!writeCharacteristic2) {
                    Locale locale = Locale.US;
                    ZLogger.w("writeCharacteristic failed,SDK_INT=" + i8);
                }
                return writeCharacteristic2;
            }
            writeCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, bluetoothGattCharacteristic.getWriteType());
            if (writeCharacteristic == 0) {
                return true;
            }
            format = String.format(Locale.US, "writeCharacteristic failed, with code: 0x%02X", Integer.valueOf(writeCharacteristic));
        }
        ZLogger.w(format);
        return false;
    }

    public static boolean writeDescriptor(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor, @NonNull byte[] bArr) {
        int writeDescriptor;
        if (Build.VERSION.SDK_INT < 33) {
            bluetoothGattDescriptor.setValue(bArr);
            return bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
        }
        writeDescriptor = bluetoothGatt.writeDescriptor(bluetoothGattDescriptor, bArr);
        if (writeDescriptor == 0) {
            return true;
        }
        ZLogger.w(String.format(Locale.US, "writeDescriptor failed, with code: 0x%02X", Integer.valueOf(writeDescriptor)));
        return false;
    }
}
