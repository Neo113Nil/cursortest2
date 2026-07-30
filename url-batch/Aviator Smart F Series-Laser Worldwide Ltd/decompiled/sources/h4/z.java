package h4;

import com.crrepa.ble.conn.bean.CRPSleepActionInfo;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16805a = 61;

    private z() {
    }

    public static CRPSleepActionInfo a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 61) {
            return null;
        }
        CRPSleepActionInfo cRPSleepActionInfo = new CRPSleepActionInfo();
        cRPSleepActionInfo.setHour(bArr[0]);
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 < bArr.length; i8++) {
            arrayList.add(Integer.valueOf(bArr[i8]));
        }
        cRPSleepActionInfo.setActionList(arrayList);
        return cRPSleepActionInfo;
    }
}
