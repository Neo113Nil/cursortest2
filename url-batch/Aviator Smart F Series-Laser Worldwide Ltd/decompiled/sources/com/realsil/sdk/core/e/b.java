package com.realsil.sdk.core.e;

import android.bluetooth.le.ScanRecord;
import android.os.Build;
import android.os.ParcelUuid;
import android.util.SparseArray;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.core.utility.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class b {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cd, code lost:
    
        r8 = r8.getServiceSolicitationUuids();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(ScanRecord scanRecord) {
        List serviceSolicitationUuids;
        String sb;
        StringBuilder sb2 = new StringBuilder("ScanRecord {");
        int i8 = Build.VERSION.SDK_INT;
        sb2.append(String.format(Locale.US, "\n\tmAdvertiseFlags=0x%04X", Integer.valueOf(scanRecord.getAdvertiseFlags())));
        sb2.append("\n\tmManufacturerSpecificData=" + a(scanRecord.getManufacturerSpecificData()));
        sb2.append("\n\tserviceData=" + a(scanRecord.getServiceData()));
        List<ParcelUuid> serviceUuids = scanRecord.getServiceUuids();
        String str = "";
        if (serviceUuids != null && !serviceUuids.isEmpty()) {
            if (serviceUuids.size() <= 0) {
                sb = "";
            } else {
                StringBuilder sb3 = new StringBuilder();
                Iterator<ParcelUuid> it = serviceUuids.iterator();
                while (it.hasNext()) {
                    sb3.append("\n\t" + it.next().toString());
                }
                sb = sb3.toString();
            }
            sb2.append("\n\tserviceUuids=" + sb);
        }
        if (!StringUtils.isEmpty(scanRecord.getDeviceName())) {
            sb2.append("\n\tmDeviceName=" + scanRecord.getDeviceName());
        }
        if (i8 >= 29 && serviceSolicitationUuids != null && !serviceSolicitationUuids.isEmpty()) {
            Locale locale = Locale.US;
            if (serviceSolicitationUuids.size() > 0) {
                StringBuilder sb4 = new StringBuilder();
                Iterator it2 = serviceSolicitationUuids.iterator();
                while (it2.hasNext()) {
                    sb4.append("\n\t" + ((ParcelUuid) it2.next()).toString());
                }
                str = sb4.toString();
            }
            sb2.append("\n\tserviceSolicitationUuids=" + str);
        }
        sb2.append("\n}");
        return sb2.toString();
    }

    public static String a(SparseArray sparseArray) {
        if (sparseArray == null) {
            return "null";
        }
        if (sparseArray.size() == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            byte[] bArr = (byte[]) sparseArray.valueAt(i8);
            int length = bArr != null ? bArr.length : 0;
            sb.append(String.format("0x%04X", Integer.valueOf(sparseArray.keyAt(i8))));
            sb.append("=(");
            sb.append(length);
            sb.append(")");
            sb.append(DataConverter.bytes2HexWithSeparate(bArr));
        }
        sb.append('}');
        return sb.toString();
    }

    public static String a(Map map) {
        if (map == null) {
            return "null";
        }
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object key = ((Map.Entry) it.next()).getKey();
            byte[] bArr = (byte[]) map.get(key);
            int length = bArr != null ? bArr.length : 0;
            sb.append(key);
            sb.append("=(");
            sb.append(length);
            sb.append(")");
            sb.append(DataConverter.bytes2HexWithSeparate(bArr));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
