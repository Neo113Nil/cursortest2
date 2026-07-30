package com.realsil.sdk.core.bluetooth.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.ParcelUuid;
import com.baidu.mapapi.http.HttpClient;
import com.realsil.sdk.core.bluetooth.compat.BluetoothDeviceCompat;
import com.realsil.sdk.core.bluetooth.compat.BluetoothGattCompat;
import com.realsil.sdk.core.logger.ZLogger;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class BluetoothHelper {
    public static final int BD_ADDR_LEN = 6;
    public static final int BD_UUID_LEN = 16;

    public static byte[] convertAddress(String str) {
        byte[] bArr = new byte[6];
        if (str == null || str.length() < 17) {
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            bArr[3] = 0;
            bArr[4] = 0;
            bArr[5] = 0;
            return bArr;
        }
        bArr[0] = (byte) (Character.digit(str.charAt(16), 16) + (Character.digit(str.charAt(15), 16) * 16));
        bArr[1] = (byte) (Character.digit(str.charAt(13), 16) + (Character.digit(str.charAt(12), 16) * 16));
        bArr[2] = (byte) (Character.digit(str.charAt(10), 16) + (Character.digit(str.charAt(9), 16) * 16));
        bArr[3] = (byte) (Character.digit(str.charAt(7), 16) + (Character.digit(str.charAt(6), 16) * 16));
        bArr[4] = (byte) (Character.digit(str.charAt(4), 16) + (Character.digit(str.charAt(3), 16) * 16));
        bArr[5] = (byte) (Character.digit(str.charAt(1), 16) + (Character.digit(str.charAt(0), 16) * 16));
        return bArr;
    }

    public static String convertMac(byte[] bArr) {
        StringBuilder sb;
        byte b8;
        StringBuilder sb2;
        byte b9;
        StringBuilder sb3;
        byte b10;
        StringBuilder sb4;
        byte b11;
        StringBuilder sb5;
        byte b12;
        if (bArr == null || bArr.length < 6) {
            return "";
        }
        if ((bArr[5] & 255) <= 15) {
            sb = new StringBuilder("0");
            b8 = bArr[5];
        } else {
            sb = new StringBuilder();
            b8 = bArr[5];
        }
        sb.append(Integer.toHexString(b8 & 255).toUpperCase());
        sb.append(":");
        String sb6 = sb.toString();
        if ((bArr[4] & 255) <= 15) {
            sb2 = new StringBuilder();
            sb2.append(sb6);
            sb2.append("0");
            b9 = bArr[4];
        } else {
            sb2 = new StringBuilder();
            sb2.append(sb6);
            b9 = bArr[4];
        }
        sb2.append(Integer.toHexString(b9 & 255).toUpperCase());
        sb2.append(":");
        String sb7 = sb2.toString();
        if ((bArr[3] & 255) <= 15) {
            sb3 = new StringBuilder();
            sb3.append(sb7);
            sb3.append("0");
            b10 = bArr[3];
        } else {
            sb3 = new StringBuilder();
            sb3.append(sb7);
            b10 = bArr[3];
        }
        sb3.append(Integer.toHexString(b10 & 255).toUpperCase());
        sb3.append(":");
        String sb8 = sb3.toString();
        if ((bArr[2] & 255) <= 15) {
            sb4 = new StringBuilder();
            sb4.append(sb8);
            sb4.append("0");
            b11 = bArr[2];
        } else {
            sb4 = new StringBuilder();
            sb4.append(sb8);
            b11 = bArr[2];
        }
        sb4.append(Integer.toHexString(b11 & 255).toUpperCase());
        sb4.append(":");
        String sb9 = sb4.toString();
        if ((bArr[1] & 255) <= 15) {
            sb5 = new StringBuilder();
            sb5.append(sb9);
            sb5.append("0");
            b12 = bArr[1];
        } else {
            sb5 = new StringBuilder();
            sb5.append(sb9);
            b12 = bArr[1];
        }
        sb5.append(Integer.toHexString(b12 & 255).toUpperCase());
        sb5.append(":");
        String sb10 = sb5.toString();
        if ((bArr[0] & 255) > 15) {
            return sb10 + Integer.toHexString(bArr[0] & 255).toUpperCase();
        }
        return sb10 + "0" + Integer.toHexString(bArr[0] & 255).toUpperCase();
    }

    public static String dumpBluetoothDevice(BluetoothDevice bluetoothDevice) {
        StringBuilder sb = new StringBuilder();
        sb.append("BluetoothDevice { " + formatAddress(bluetoothDevice.getAddress(), true) + "/" + bluetoothDevice.getName());
        Locale locale = Locale.US;
        sb.append(String.format(locale, "\n\tbondState=%d, type=0x%02X", Integer.valueOf(bluetoothDevice.getBondState()), Integer.valueOf(bluetoothDevice.getType())));
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        if (bluetoothClass != null) {
            sb.append(String.format(locale, ", majorDeviceClass=0x%04X", Integer.valueOf(bluetoothClass.getMajorDeviceClass())));
            sb.append(String.format(locale, ", deviceClass=0x%04X", Integer.valueOf(bluetoothClass.getDeviceClass())));
        }
        ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (uuids != null && uuids.length > 0) {
            sb.append("\n\tsupportedFeaturesUuids");
            for (ParcelUuid parcelUuid : uuids) {
                sb.append("\n\t\t" + parcelUuid.toString());
            }
        }
        sb.append("\n}");
        return sb.toString();
    }

    public static String dumpBluetoothGattService(BluetoothGatt bluetoothGatt) {
        return dumpBluetoothGattService(bluetoothGatt.getServices());
    }

    public static String dumpService(BluetoothGattService bluetoothGattService, int i8) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 == 0) {
                str = str + "╎";
            }
            str = str + HttpClient.ENDFLAG;
        }
        sb.append("\n" + str + "[service]");
        sb.append(String.format(Locale.US, "\n%sUUID:(%02X/%d)%s ", str, Integer.valueOf(bluetoothGattService.getInstanceId()), Integer.valueOf(bluetoothGattService.getType()), bluetoothGattService.getUuid()));
        sb.append("\n" + str + "  [characteristics]");
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
            sb.append(String.format(Locale.US, "\n%s    UUID:(%02X)%s , prop= 0x%02X(%s)\tperms= 0x%02X(%s)", str, Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bluetoothGattCharacteristic.getProperties()), BluetoothGattCompat.parseProperty2(bluetoothGattCharacteristic.getProperties()), Integer.valueOf(bluetoothGattCharacteristic.getPermissions()), BluetoothGattCompat.getCharPermission(bluetoothGattCharacteristic.getPermissions())));
            List<BluetoothGattDescriptor> descriptors = bluetoothGattCharacteristic.getDescriptors();
            if (descriptors != null && !descriptors.isEmpty()) {
                sb.append("\n" + str + "      [descriptors]");
                for (BluetoothGattDescriptor bluetoothGattDescriptor : descriptors) {
                    sb.append(String.format("\n%s          UUID:%s, perms= 0x%02X (%s)", str, bluetoothGattDescriptor.getUuid(), Integer.valueOf(bluetoothGattDescriptor.getPermissions()), BluetoothGattCompat.getCharPermission(bluetoothGattDescriptor.getPermissions())));
                }
            }
        }
        List<BluetoothGattService> includedServices = bluetoothGattService.getIncludedServices();
        if (includedServices != null && !includedServices.isEmpty()) {
            sb.append("\n" + str + "  [included services]");
            Iterator<BluetoothGattService> it = includedServices.iterator();
            while (it.hasNext()) {
                dumpService(it.next(), i8 + 1);
            }
        }
        return sb.toString();
    }

    public static String formatAddress(String str, boolean z7) {
        if (!z7) {
            return str;
        }
        if (str == null || str.length() != 17) {
            return "";
        }
        byte[] convertAddress = convertAddress(str);
        return convertAddress.length < 6 ? "" : String.format("%02X:%02X:**:**:**:%02X", Byte.valueOf(convertAddress[5]), Byte.valueOf(convertAddress[4]), Byte.valueOf(convertAddress[0]));
    }

    public static String formatAddressNegatitive(byte[] bArr) {
        return formatAddress(bArr, true, true);
    }

    public static String formatAddressPositive(byte[] bArr) {
        return formatAddress(bArr, false, false);
    }

    public static List<BluetoothDevice> getBondedBluetoothDevices() {
        ArrayList arrayList = new ArrayList();
        try {
            for (BluetoothDevice bluetoothDevice : BluetoothAdapter.getDefaultAdapter().getBondedDevices()) {
                if (BluetoothDeviceCompat.isConnected(bluetoothDevice)) {
                    ZLogger.v("connected: " + formatAddress(bluetoothDevice.getAddress(), true));
                    arrayList.add(bluetoothDevice);
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return arrayList;
    }

    public static String getCharPermission(int i8) {
        return BluetoothGattCompat.getCharPermission(i8);
    }

    public static String getCharPropertie(int i8) {
        return BluetoothGattCompat.getCharPropertie(i8);
    }

    public static List<BluetoothDevice> getConnectedBluetoothDevices() {
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        try {
            Method declaredMethod = BluetoothAdapter.class.getDeclaredMethod("getConnectionState", null);
            declaredMethod.setAccessible(true);
            if (((Integer) declaredMethod.invoke(defaultAdapter, null)).intValue() == 2) {
                for (BluetoothDevice bluetoothDevice : defaultAdapter.getBondedDevices()) {
                    if (BluetoothDeviceCompat.isConnected(bluetoothDevice)) {
                        ZLogger.v("connected: " + formatAddress(bluetoothDevice.getAddress(), true));
                        arrayList.add(bluetoothDevice);
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return arrayList;
    }

    public static String getDescPermission(int i8) {
        return BluetoothGattCompat.getDescPermission(i8);
    }

    public static boolean isBleEnabled() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public static boolean isBleSupported(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static String parseDeviceType(int i8) {
        return BluetoothDeviceCompat.parseDeviceType(i8);
    }

    public static List<String> parseProperty(int i8) {
        return BluetoothGattCompat.parseProperty(i8);
    }

    public static String parseProperty2(int i8) {
        return BluetoothGattCompat.parseProperty2(i8);
    }

    public static String dumpBluetoothGattService(List<BluetoothGattService> list) {
        StringBuilder sb = new StringBuilder();
        for (BluetoothGattService bluetoothGattService : list) {
            sb.append(String.format(Locale.US, "\nservice: type=%d, %02X/%s", Integer.valueOf(bluetoothGattService.getType()), Integer.valueOf(bluetoothGattService.getInstanceId()), bluetoothGattService.getUuid().toString()));
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                sb.append(String.format(Locale.US, "\n\tcharacteristic: %02X/%s", Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid().toString()));
                sb.append(String.format("\t\tprop= 0x%02X (%s)", Integer.valueOf(bluetoothGattCharacteristic.getProperties()), BluetoothGattCompat.parseProperty2(bluetoothGattCharacteristic.getProperties())));
                sb.append(String.format("\tperms= 0x%02X (%s)", Integer.valueOf(bluetoothGattCharacteristic.getPermissions()), BluetoothGattCompat.getCharPermission(bluetoothGattCharacteristic.getPermissions())));
                List<BluetoothGattDescriptor> descriptors = bluetoothGattCharacteristic.getDescriptors();
                if (descriptors != null && !descriptors.isEmpty()) {
                    for (BluetoothGattDescriptor bluetoothGattDescriptor : descriptors) {
                        Locale locale = Locale.US;
                        sb.append("\n\t\tdescriptor: UUID: " + bluetoothGattDescriptor.getUuid().toString());
                        sb.append(String.format("\t\t\tperms= 0x%02X (%s)", Integer.valueOf(bluetoothGattDescriptor.getPermissions()), BluetoothGattCompat.getCharPermission(bluetoothGattDescriptor.getPermissions())));
                    }
                }
            }
        }
        return sb.toString();
    }

    public static String formatAddress(byte[] bArr, boolean z7) {
        return formatAddress(bArr, false, z7);
    }

    public static List<BluetoothDevice> getConnectedBluetoothDevices(int i8) {
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        try {
            if (defaultAdapter.getProfileConnectionState(i8) == 2) {
                for (BluetoothDevice bluetoothDevice : defaultAdapter.getBondedDevices()) {
                    if (BluetoothDeviceCompat.isConnected(bluetoothDevice)) {
                        ZLogger.v("connected: " + formatAddress(bluetoothDevice.getAddress(), true));
                        arrayList.add(bluetoothDevice);
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return arrayList;
    }

    public static String formatAddress(byte[] bArr, boolean z7, boolean z8) {
        return (bArr == null || bArr.length < 6) ? "" : z7 ? z8 ? String.format("%02X:%02X:**:**:**:%02X", Byte.valueOf(bArr[5]), Byte.valueOf(bArr[4]), Byte.valueOf(bArr[0])) : String.format("%02X:%02X:%02X:%02X:%02X:%02X", Byte.valueOf(bArr[5]), Byte.valueOf(bArr[4]), Byte.valueOf(bArr[3]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[0])) : z8 ? String.format("%02X:%02X:**:**:**:%02X", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[5])) : String.format("%02X:%02X:%02X:%02X:%02X:%02X", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3]), Byte.valueOf(bArr[4]), Byte.valueOf(bArr[5]));
    }
}
