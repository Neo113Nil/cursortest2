package h4;

import com.crrepa.ble.conn.bean.CRPBreathRateInfo;
import com.crrepa.ble.conn.bean.CRPHistoryBreathRateInfo;
import com.crrepa.ble.conn.type.CRPHistoryDay;
import com.crrepa.f.z1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class o {
    private o() {
    }

    public static List<CRPHistoryBreathRateInfo> a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length % 5 != 3) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        for (int i8 = 3; i8 < bArr.length; i8 += 5) {
            int a8 = com.crrepa.g1.c.a(bArr[i8]);
            System.arraycopy(bArr, i8 + 1, bArr2, 0, 4);
            arrayList.add(new CRPHistoryBreathRateInfo(new Date(z1.a(com.crrepa.g1.c.f(bArr2) * 1000)), a8));
        }
        return arrayList;
    }

    public static CRPBreathRateInfo b(byte[] bArr) {
        CRPHistoryDay cRPHistoryDay;
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 48 || (cRPHistoryDay = CRPHistoryDay.getInstance(bArr[2])) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 3; i8 < bArr.length; i8++) {
            arrayList.add(Integer.valueOf(bArr[i8]));
        }
        return new CRPBreathRateInfo(cRPHistoryDay, arrayList);
    }
}
