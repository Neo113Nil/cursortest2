package h4;

import com.crrepa.ble.conn.bean.CRPMuslimPrayerCalculationInfo;
import com.crrepa.ble.conn.bean.CRPMuslimTasbihSettingInfo;
import com.crrepa.ble.conn.type.CRPMuslimPrayerAsrCalculationType;
import com.crrepa.ble.conn.type.CRPMuslimPrayerCalculationType;
import com.crrepa.ble.conn.type.CRPMuslimPrayerNotifcationType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {
    private a() {
    }

    public static CRPMuslimPrayerCalculationInfo a(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return null;
        }
        CRPMuslimPrayerCalculationInfo cRPMuslimPrayerCalculationInfo = new CRPMuslimPrayerCalculationInfo();
        cRPMuslimPrayerCalculationInfo.setType(CRPMuslimPrayerCalculationType.getInstance(bArr[3]));
        if (4 < bArr.length) {
            cRPMuslimPrayerCalculationInfo.setAsrType(CRPMuslimPrayerAsrCalculationType.getInstance(bArr[4]));
        }
        if (5 < bArr.length) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 5; i8 < bArr.length; i8++) {
                arrayList.add(CRPMuslimPrayerCalculationType.getInstance(bArr[i8]));
            }
            cRPMuslimPrayerCalculationInfo.setSupportedCalculationTypeList(arrayList);
        }
        return cRPMuslimPrayerCalculationInfo;
    }

    public static Map<CRPMuslimPrayerNotifcationType, Boolean> b(byte[] bArr, int i8) {
        if (bArr.length < i8) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i9 = i8; i9 < bArr.length; i9++) {
            CRPMuslimPrayerNotifcationType cRPMuslimPrayerNotifcationType = CRPMuslimPrayerNotifcationType.getInstance((byte) (i9 - i8));
            boolean z7 = true;
            if (bArr[i9] != 1) {
                z7 = false;
            }
            hashMap.put(cRPMuslimPrayerNotifcationType, Boolean.valueOf(z7));
        }
        return hashMap;
    }

    public static CRPMuslimTasbihSettingInfo c(byte[] bArr) {
        if (bArr.length < 10) {
            return null;
        }
        CRPMuslimTasbihSettingInfo cRPMuslimTasbihSettingInfo = new CRPMuslimTasbihSettingInfo();
        cRPMuslimTasbihSettingInfo.setEnable(bArr[3] == 1);
        cRPMuslimTasbihSettingInfo.setStartHour(bArr[4]);
        cRPMuslimTasbihSettingInfo.setStartMinutes(bArr[5]);
        cRPMuslimTasbihSettingInfo.setEndHour(bArr[6]);
        cRPMuslimTasbihSettingInfo.setEndMinutes(bArr[7]);
        cRPMuslimTasbihSettingInfo.setInterval(bArr[8]);
        cRPMuslimTasbihSettingInfo.setRepeatMode(bArr[9]);
        return cRPMuslimTasbihSettingInfo;
    }

    public static List<Integer> a(byte[] bArr, int i8) {
        if (bArr.length < i8) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (i8 < bArr.length) {
            arrayList.add(Integer.valueOf(bArr[i8]));
            i8++;
        }
        return arrayList;
    }

    public static byte[] b(byte[] bArr) {
        if (bArr == null || bArr.length < 10) {
            return null;
        }
        return Arrays.copyOfRange(bArr, 3, bArr.length);
    }

    public static List<Integer> c(byte[] bArr, int i8) {
        if (bArr.length < i8) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (i8 < bArr.length) {
            arrayList.add(Integer.valueOf(com.crrepa.g1.c.b(bArr[i8 + 1], bArr[i8])));
            i8 += 2;
        }
        return arrayList;
    }
}
